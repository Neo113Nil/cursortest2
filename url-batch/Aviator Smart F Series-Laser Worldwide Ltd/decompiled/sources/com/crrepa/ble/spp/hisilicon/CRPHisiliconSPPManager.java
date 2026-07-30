package com.crrepa.ble.spp.hisilicon;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.crrepa.ble.spp.hisilicon.receive.SPPReceiver;
import com.crrepa.ble.spp.hisilicon.receive.map.bean.CRPRequestSVGInfo;
import com.crrepa.ble.spp.hisilicon.write.CRPSPPFileTransListener;
import com.crrepa.ble.spp.hisilicon.write.HisiliconFileType;
import com.crrepa.ble.spp.hisilicon.write.SPPFileTransManager;
import com.crrepa.ble.spp.hisilicon.write.SPPMessage;
import com.crrepa.ble.spp.hisilicon.write.SPPWriter;
import com.crrepa.ble.spp.hisilicon.write.map.CRPMapMessageBuilder;
import com.crrepa.ble.spp.hisilicon.write.map.bean.CRPUpdateSVGInfo;
import com.crrepa.ble.util.BleLog;
import com.crrepa.k0.b;
import com.crrepa.k0.c;
import com.crrepa.r.e;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPHisiliconSPPManager {
    private String address;
    private final List<CRPSPPConnectChangeListener> connectChangeListenerList;
    private final Handler handler;
    private boolean reconnect;
    private final SPPChangeListener sppChangeListener;
    private final c sppConnectManager;
    private final SPPReceiver sppReceiver;
    private final SPPWriter sppWriter;

    private static class Holder {
        private static final CRPHisiliconSPPManager INSTANCE = new CRPHisiliconSPPManager();

        private Holder() {
        }
    }

    private static class SPPChangeListener implements b {
        private final WeakReference<CRPHisiliconSPPManager> weakReference;

        public SPPChangeListener(CRPHisiliconSPPManager cRPHisiliconSPPManager) {
            this.weakReference = new WeakReference<>(cRPHisiliconSPPManager);
        }

        @Override // com.crrepa.k0.b
        public void onConnectionStateChanged(int i8) {
            BleLog.d("spp connection state: " + i8);
            CRPHisiliconSPPManager cRPHisiliconSPPManager = this.weakReference.get();
            if (cRPHisiliconSPPManager == null) {
                return;
            }
            if (i8 == 0) {
                cRPHisiliconSPPManager.reconnect();
            } else if (i8 == 2) {
                SPPFileTransManager.getInstance().reset();
                cRPHisiliconSPPManager.sppWriter.start();
            }
            cRPHisiliconSPPManager.onConnectionStateChanged(i8);
        }

        @Override // com.crrepa.k0.b
        public void onReceiveData(byte[] bArr) {
            CRPHisiliconSPPManager cRPHisiliconSPPManager = this.weakReference.get();
            if (cRPHisiliconSPPManager == null || com.crrepa.g1.c.h(bArr)) {
                return;
            }
            cRPHisiliconSPPManager.handleReceiveData(bArr);
        }
    }

    private CRPHisiliconSPPManager() {
        c c8 = c.c();
        this.sppConnectManager = c8;
        this.sppChangeListener = new SPPChangeListener(this);
        SPPWriter sPPWriter = new SPPWriter();
        this.sppWriter = sPPWriter;
        this.sppReceiver = new SPPReceiver();
        this.handler = new Handler(Looper.getMainLooper());
        this.reconnect = true;
        this.connectChangeListenerList = new ArrayList();
        sPPWriter.setSppConnectManager(c8);
    }

    public static CRPHisiliconSPPManager getInstance() {
        return Holder.INSTANCE;
    }

    private byte getRealType(byte b8) {
        return (byte) (b8 & Byte.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleReceiveData(byte[] bArr) {
        com.crrepa.r.c cVar = new com.crrepa.r.c(bArr);
        BleLog.d("currentFrameStatus: " + cVar.f());
        if (!cVar.a()) {
            BleLog.d("checkReceivedCrc16 failed!");
            return;
        }
        byte m8 = cVar.m();
        BleLog.d("mid: " + ((int) m8));
        byte d8 = cVar.d();
        BleLog.d("cid: " + ((int) d8));
        byte s7 = cVar.s();
        BleLog.d("type: " + e.a(s7));
        byte realType = getRealType(s7);
        BleLog.d("real type:" + e.a(realType));
        byte[] n8 = cVar.n();
        BleLog.d("payload: " + com.crrepa.g1.c.c(n8));
        this.sppReceiver.onReceiverChanged(m8, d8, realType, n8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onConnectionStateChanged(int i8) {
        if (this.connectChangeListenerList.isEmpty()) {
            return;
        }
        BleLog.d("connectChangeListenerList size = " + this.connectChangeListenerList.size());
        Iterator<CRPSPPConnectChangeListener> it = this.connectChangeListenerList.iterator();
        while (it.hasNext()) {
            it.next().onConnectionStateChanged(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reconnect() {
        BleLog.d("reconnect: " + this.reconnect);
        if (this.reconnect) {
            this.handler.postDelayed(new Runnable() { // from class: com.crrepa.ble.spp.hisilicon.CRPHisiliconSPPManager.1
                @Override // java.lang.Runnable
                public void run() {
                    if (CRPHisiliconSPPManager.this.reconnect) {
                        BleLog.d("spp reconnect: " + CRPHisiliconSPPManager.this.address);
                        CRPHisiliconSPPManager cRPHisiliconSPPManager = CRPHisiliconSPPManager.this;
                        cRPHisiliconSPPManager.connect(cRPHisiliconSPPManager.address, null);
                    }
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
    }

    public void connect(String str, CRPSPPConnectChangeListener cRPSPPConnectChangeListener) {
        if (TextUtils.isEmpty(str)) {
            BleLog.d("address is empty!");
            return;
        }
        if (cRPSPPConnectChangeListener != null && !this.connectChangeListenerList.contains(cRPSPPConnectChangeListener)) {
            this.connectChangeListenerList.add(cRPSPPConnectChangeListener);
            BleLog.d("add CRPSPPConnectChangeListener");
        }
        this.address = str;
        this.reconnect = true;
        BleLog.d("CRPHisiliconSPPManager connect: " + str);
        this.sppConnectManager.a(str, true, this.sppChangeListener);
    }

    public void disconnect() {
        this.reconnect = false;
        this.sppConnectManager.b();
    }

    public void reset() {
        this.sppWriter.abort();
    }

    public void send(SPPMessage sPPMessage) {
        this.sppWriter.add(sPPMessage);
    }

    public void sendSVG(File file, CRPRequestSVGInfo cRPRequestSVGInfo) {
        HisiliconFileType hisiliconFileType = HisiliconFileType.MAP_SVG;
        SPPMessage sPPMessage = new SPPMessage(file, hisiliconFileType, null);
        this.sppWriter.add(sPPMessage);
        BleLog.d("sendSVG: " + cRPRequestSVGInfo);
        if (cRPRequestSVGInfo != null) {
            CRPUpdateSVGInfo cRPUpdateSVGInfo = new CRPUpdateSVGInfo();
            cRPUpdateSVGInfo.setError_code(0);
            CRPUpdateSVGInfo.ResultBean resultBean = new CRPUpdateSVGInfo.ResultBean();
            resultBean.setCoord(cRPRequestSVGInfo.getCoord());
            resultBean.setTime(cRPRequestSVGInfo.getTime());
            resultBean.setSvg(sPPMessage.getUploadPath());
            cRPUpdateSVGInfo.setResult(resultBean);
            this.sppWriter.add(new SPPMessage(CRPMapMessageBuilder.sendUpdateSVGResultCmd(cRPUpdateSVGInfo), hisiliconFileType));
        }
    }

    public void send(File file, HisiliconFileType hisiliconFileType) {
        send(file, hisiliconFileType, null);
    }

    public void send(File file, HisiliconFileType hisiliconFileType, CRPSPPFileTransListener cRPSPPFileTransListener) {
        send(new SPPMessage(file, hisiliconFileType, cRPSPPFileTransListener));
    }

    public void send(byte[] bArr) {
        if (com.crrepa.g1.c.h(bArr)) {
            BleLog.d("bytes is empty!");
        } else {
            this.sppWriter.add(new SPPMessage(bArr));
        }
    }
}
