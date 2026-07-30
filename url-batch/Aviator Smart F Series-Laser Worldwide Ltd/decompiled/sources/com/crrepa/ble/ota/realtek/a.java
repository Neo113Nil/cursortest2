package com.crrepa.ble.ota.realtek;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mapapi.http.HttpClient;
import com.crrepa.ble.conn.listener.CRPBleFirmwareUpgradeListener;
import com.crrepa.ble.trans.upgrade.presenter.FirmwareUpgradePresenter;
import com.crrepa.ble.util.BleLog;
import com.realsil.sdk.core.RtkConfigure;
import com.realsil.sdk.core.RtkCore;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.realsil.sdk.dfu.utils.GattDfuAdapter;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f12296f = 5;

    /* renamed from: g, reason: collision with root package name */
    private static final int f12297g = 100;

    /* renamed from: h, reason: collision with root package name */
    private static final String f12298h = "BIN";

    /* renamed from: a, reason: collision with root package name */
    private CRPBleFirmwareUpgradeListener f12299a;

    /* renamed from: b, reason: collision with root package name */
    private GattDfuAdapter f12300b;

    /* renamed from: c, reason: collision with root package name */
    private String f12301c;

    /* renamed from: d, reason: collision with root package name */
    private String f12302d;

    /* renamed from: e, reason: collision with root package name */
    private b f12303e = new b(this);

    /* renamed from: com.crrepa.ble.ota.realtek.a$a, reason: collision with other inner class name */
    class C0212a implements m4.a {
        C0212a() {
        }

        @Override // m4.a
        public void onComplete(String str) {
            a.this.a(str);
        }
    }

    private static class b extends DfuAdapter.DfuHelperCallback {

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<a> f12305b;

        public b(a aVar) {
            this.f12305b = new WeakReference<>(aVar);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onError(int i8, int i9) {
            super.onError(i8, i9);
            BleLog.d(i8 + HttpClient.ENDFLAG + i9);
            a aVar = this.f12305b.get();
            if (aVar == null) {
                BleLog.e("RtkDfuController is null!");
            } else {
                aVar.a(23, "file trans failed");
            }
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProcessStateChanged(int i8) {
            super.onProcessStateChanged(i8);
            BleLog.d("onProcessStateChanged: " + i8);
            if (i8 != 258) {
                return;
            }
            a aVar = this.f12305b.get();
            if (aVar == null) {
                BleLog.e("RtkDfuController is null!");
            } else {
                aVar.d();
            }
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onProgressChanged(DfuProgressInfo dfuProgressInfo) {
            super.onProgressChanged(dfuProgressInfo);
            a aVar = this.f12305b.get();
            if (aVar == null) {
                BleLog.e("RtkDfuController is null!");
                return;
            }
            int progress = dfuProgressInfo.getProgress();
            BleLog.d("onProgressChanged: " + progress);
            aVar.a(progress);
        }

        @Override // com.realsil.sdk.dfu.utils.DfuAdapter.DfuHelperCallback
        public void onStateChanged(int i8) {
            super.onStateChanged(i8);
            BleLog.e("onStateChanged state: " + i8);
            a aVar = this.f12305b.get();
            if (aVar == null) {
                BleLog.e("RtkDfuController is null!");
                return;
            }
            if (i8 == 258) {
                aVar.b();
            } else if (i8 == 527) {
                aVar.e();
            } else {
                if (i8 != 8193) {
                    return;
                }
                aVar.c();
            }
        }
    }

    protected a(Context context) {
        RtkCore.initialize(context, new RtkConfigure.Builder().debugEnabled(false).printLog(false).logTag("RTK_OTA").build());
        RtkDfu.initialize(context, false);
        this.f12300b = GattDfuAdapter.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (TextUtils.isEmpty(this.f12301c)) {
            a(18, "The device's Mac address is null!");
            BleLog.e("address is null!");
        } else {
            this.f12300b.connectDevice(new ConnectParams.Builder().address(this.f12301c).reconnectTimes(5).build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12299a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeAborted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12299a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeCompleted();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (TextUtils.isEmpty(this.f12302d)) {
            a(17, "Firmware is null!");
            return;
        }
        DfuConfig dfuConfig = new DfuConfig();
        int i8 = 0;
        dfuConfig.setChannelType(0);
        dfuConfig.setAddress(this.f12301c);
        dfuConfig.setFilePath(this.f12302d);
        dfuConfig.setFileLocation(0);
        dfuConfig.setBatteryCheckEnabled(false);
        dfuConfig.setVersionCheckEnabled(false);
        Iterator<OtaModeInfo> it = this.f12300b.getSupportedModes().iterator();
        while (true) {
            if (!it.hasNext()) {
                i8 = 16;
                break;
            } else if (it.next().getWorkmode() == 0) {
                break;
            }
        }
        dfuConfig.setOtaWorkMode(i8);
        BleLog.d("rtk ota mode: " + dfuConfig.getOtaWorkMode());
        this.f12300b.startOtaProcedure(dfuConfig);
    }

    public void a() {
        GattDfuAdapter gattDfuAdapter = this.f12300b;
        if (gattDfuAdapter != null) {
            gattDfuAdapter.abort();
            this.f12300b.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8) {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12299a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeProgressChanged(i8, 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i8, String str) {
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12299a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onError(i8, str);
        }
    }

    public void b(String str) {
        this.f12301c = str;
        FirmwareUpgradePresenter.getInstance().downloadNewFirmware(this.f12299a, new C0212a());
    }

    public void a(CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener) {
        this.f12299a = cRPBleFirmwareUpgradeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.f12302d = str;
        this.f12300b.initialize(this.f12303e);
        CRPBleFirmwareUpgradeListener cRPBleFirmwareUpgradeListener = this.f12299a;
        if (cRPBleFirmwareUpgradeListener != null) {
            cRPBleFirmwareUpgradeListener.onUpgradeProgressStarting(true);
        }
    }

    public void a(String str, File file) {
        this.f12301c = str;
        a(file.getPath());
    }
}
