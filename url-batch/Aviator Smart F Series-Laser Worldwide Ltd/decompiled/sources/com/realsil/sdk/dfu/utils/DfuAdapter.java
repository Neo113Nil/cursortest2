package com.realsil.sdk.dfu.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.image.pack.SubFileInfo;
import com.realsil.sdk.dfu.internal.base.BaseDfuTask;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.DfuQcConfig;
import com.realsil.sdk.dfu.model.FileTypeInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.model.OtaModeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class DfuAdapter {
    public static final int SECONDARY_STATE_IDLE = 0;
    public static final int STAGE_BACK_CONNECT = 2048;
    public static final int STAGE_IDLE = 0;
    public static final int STAGE_INIT = 256;
    public static final int STAGE_OTA = 1024;
    public static final int STAGE_PREPARE = 512;
    public static final int STATE_ABORTED = 8193;
    public static final int STATE_BACKCONNECT_COMPLETED = 2063;
    public static final int STATE_BACKCONNECT_CONNECTING = 2071;
    public static final int STATE_BACKCONNECT_FAILED = 2062;
    public static final int STATE_BACKCONNECT_SYNC_DATA = 2074;
    public static final int STATE_BACKCONNECT_VALIDATE = 2077;
    public static final int STATE_BACKCONNECT_VALIDATE_FAILED = 2061;
    public static final int STATE_BACKCONNECT_WAIT_PROFILE_CONNECTED = 2065;
    public static final int STATE_CONNECT_FAILED = 4098;
    public static final int STATE_DISCONNECTED = 4097;
    public static final int STATE_DISCONNECTING = 4096;
    public static final int STATE_DISCOVERY_SERVICE = 537;
    public static final int STATE_INIT_OK = 258;
    public static final int STATE_MASK_BUSY = 16;
    public static final int STATE_MASK_IDLE = 0;
    public static final int STATE_OTA_PROCESSING = 1025;
    public static final int STATE_OTA_START_FAILED = 1026;
    public static final int STATE_PENDDING_DISCOVERY_SERVICE = 536;
    public static final int STATE_PENDING_ABORT = 8192;
    public static final int STATE_PREPARED = 527;
    public static final int STATE_PREPARE_CONNECTING = 535;
    public static final int STATE_PREPARE_PAIRING_REQUEST = 534;
    public static final int STATE_READ_BATTERY_INFO = 542;
    public static final int STATE_READ_DEVICE_INFO = 539;
    public static final int STATE_READ_IMAGE_INFO = 543;
    public static final int STATE_READ_PROTOCOL_TYPE = 540;
    public static final int STATE_REQUEST_MTU = 688;
    public static final int STATE_SYNC_SUB_INFO = 541;

    /* renamed from: k, reason: collision with root package name */
    public ConnectParams f16384k;

    /* renamed from: m, reason: collision with root package name */
    public DfuHelperCallback f16386m;
    public Context mContext;

    /* renamed from: s, reason: collision with root package name */
    public OtaDeviceInfo f16392s;

    /* renamed from: t, reason: collision with root package name */
    public DfuConfig f16393t;

    /* renamed from: v, reason: collision with root package name */
    public BaseDfuTask f16395v;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16381h = RtkDfu.DEBUG_ENABLE;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16382i = RtkDfu.VDBG;

    /* renamed from: j, reason: collision with root package name */
    public boolean f16383j = RtkDfu.TDBG;

    /* renamed from: l, reason: collision with root package name */
    public int f16385l = 2;

    /* renamed from: n, reason: collision with root package name */
    public Object f16387n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public int f16388o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f16389p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16390q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f16391r = 257;

    /* renamed from: u, reason: collision with root package name */
    public int f16394u = 0;

    /* renamed from: w, reason: collision with root package name */
    public final Handler f16396w = new Handler(Looper.getMainLooper()) { // from class: com.realsil.sdk.dfu.utils.DfuAdapter.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            int i9 = 1;
            if (i8 != 1) {
                i9 = 2;
                if (i8 != 2) {
                    i9 = 3;
                    if (i8 != 3) {
                        i9 = 4;
                        if (i8 != 4) {
                            DfuAdapter.this.a(message);
                            super.handleMessage(message);
                        }
                    }
                }
            }
            DfuAdapter.this.a(i9, message.obj);
            super.handleMessage(message);
        }
    };

    /* renamed from: x, reason: collision with root package name */
    public final DfuThreadCallback f16397x = new DfuThreadCallback() { // from class: com.realsil.sdk.dfu.utils.DfuAdapter.2
        @Override // com.realsil.sdk.dfu.internal.base.DfuThreadCallback
        public void onError(int i8) {
            super.onError(i8);
            DfuAdapter dfuAdapter = DfuAdapter.this;
            dfuAdapter.f16390q = false;
            dfuAdapter.notifyError(i8);
        }

        @Override // com.realsil.sdk.dfu.internal.base.DfuThreadCallback
        public void onProgressChanged(DfuProgressInfo dfuProgressInfo) {
            super.onProgressChanged(dfuProgressInfo);
            DfuAdapter.this.notifyProgressChanged(dfuProgressInfo);
        }

        @Override // com.realsil.sdk.dfu.internal.base.DfuThreadCallback
        public void onStateChanged(int i8) {
            super.onStateChanged(i8);
            DfuAdapter dfuAdapter = DfuAdapter.this;
            dfuAdapter.f16391r = i8;
            dfuAdapter.f16390q = (i8 & 512) == 512;
            dfuAdapter.onProcessStateChanged(i8);
        }
    };

    public static final class BackConnectState extends ConnectState {
        public static final int CHECK_OTA_RESULT = 29;
        public static final int CHECK_OTA_RESULT_FAILED = 13;
    }

    public static class ConnectState {
        public static final int COMPLETED = 15;
        public static final int CONNECTING = 23;
        public static final int CONNECT_PROILE_A2DP = 18;
        public static final int CONNECT_PROILE_HFP = 19;
        public static final int CONNECT_PROILE_HID = 17;
        public static final int DISCOVERY_SERVICE = 25;
        public static final int ERROR = 14;
        public static final int PAIRING_REQUEST = 22;
        public static final int PENDING_CREATE_BOND = 20;
        public static final int PENDING_DISCOVERY_SERVICE = 24;
        public static final int PENDING_REMOVE_BOND = 21;
        public static final int READ_BATTERY_INFO = 30;
        public static final int READ_DEVICE_INFO = 27;
        public static final int READ_IMAGE_INFO = 31;
        public static final int READ_PROTOCOL_TYPE = 28;
        public static final int REQUEST_MTU = 176;
        public static final int SYNC_DATA = 26;
        public static final int SYNC_SUB_INFO = 29;
    }

    public static abstract class DfuHelperCallback {
        public void onError(int i8, int i9) {
        }

        public void onProcessStateChanged(int i8) {
        }

        public void onProgressChanged(DfuProgressInfo dfuProgressInfo) {
        }

        public void onStateChanged(int i8) {
        }
    }

    public static class ErrorInfo {
        public int code;
        public int type;

        public ErrorInfo(int i8, int i9) {
            this.type = i8;
            this.code = i9;
        }
    }

    public interface IInnerHandler {
        void handleMessage(Message message);
    }

    public static class InnerHandler extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public IInnerHandler f16400a;

        public InnerHandler(IInnerHandler iInnerHandler) {
            this.f16400a = iInnerHandler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            IInnerHandler iInnerHandler = this.f16400a;
            if (iInnerHandler != null) {
                iInnerHandler.handleMessage(message);
            } else {
                ZLogger.v("mIInnerHandler is null");
            }
        }
    }

    public static class InnerHandler2 extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference f16401a;

        public InnerHandler2(IInnerHandler iInnerHandler) {
            this.f16401a = new WeakReference(iInnerHandler);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            IInnerHandler iInnerHandler = (IInnerHandler) this.f16401a.get();
            if (iInnerHandler != null) {
                iInnerHandler.handleMessage(message);
            } else {
                ZLogger.v("mWeakReference is null");
            }
        }
    }

    public static List<FileTypeInfo> getSupportedFileContents(BinInfo binInfo) {
        List<SubFileInfo> list;
        ArrayList arrayList = new ArrayList();
        if (binInfo != null && (list = binInfo.supportSubFileInfos) != null && list.size() != 0) {
            for (SubFileInfo subFileInfo : list) {
                int wrapperBitNumber = subFileInfo.wrapperBitNumber();
                BinIndicator binIndicator = subFileInfo.getBinIndicator();
                if (binIndicator != null) {
                    arrayList.add(new FileTypeInfo(wrapperBitNumber, binIndicator.flashLayoutName));
                } else {
                    arrayList.add(new FileTypeInfo(wrapperBitNumber, ""));
                }
            }
        }
        return arrayList;
    }

    public final String a(int i8) {
        return i8 != 537 ? i8 != 540 ? i8 != 688 ? "" : "STATE_REQUEST_MTU" : "STATE_READ_PROTOCOL_TYPE" : "STATE_DISCOVERY_SERVICE";
    }

    public boolean abort() {
        BaseDfuTask baseDfuTask = this.f16395v;
        if (baseDfuTask != null) {
            return baseDfuTask.abort();
        }
        ZLogger.w("dfu has not been initialized");
        a();
        return false;
    }

    public boolean activeImage(boolean z7) {
        BaseDfuTask baseDfuTask = this.f16395v;
        if (baseDfuTask != null) {
            return baseDfuTask.activeImage(z7);
        }
        ZLogger.w("dfu has not been initialized");
        a();
        return false;
    }

    public void b(int i8, Object obj) {
        Handler handler = this.f16396w;
        handler.sendMessage(handler.obtainMessage(i8, obj));
    }

    public boolean checkResult(OtaDeviceInfo otaDeviceInfo, BinInfo binInfo, com.realsil.sdk.dfu.a0.a aVar) {
        return false;
    }

    public boolean checkStage(int i8) {
        return (this.f16389p & i8) == i8;
    }

    public boolean checkState(int i8, int i9) {
        return this.f16389p == (i8 | i9);
    }

    public void close() {
        this.f16386m = null;
        disconnect();
        destroy();
    }

    public boolean connectBack() {
        if (!this.f16390q) {
            return true;
        }
        ZLogger.d("ota is processing, please wait");
        return false;
    }

    public boolean connectDevice(ConnectParams connectParams) {
        if (connectParams == null) {
            ZLogger.w("ConnectParams can not be null");
            return false;
        }
        this.f16384k = connectParams;
        this.f16385l = connectParams.getReconnectTimes();
        ZLogger.v(this.f16381h, "connectDevice:" + this.f16384k.toString());
        return true;
    }

    public void destroy() {
        ZLogger.v(this.f16382i, "clean up DFU Adapter");
        this.f16388o = 0;
        this.f16389p = 0;
        this.f16384k = null;
        this.f16385l = 0;
        this.f16386m = null;
        BaseDfuTask baseDfuTask = this.f16395v;
        if (baseDfuTask != null) {
            baseDfuTask.abort();
        }
    }

    public void disconnect() {
        this.f16385l = 0;
    }

    public boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getCurrentOtaState() {
        return this.f16391r;
    }

    public DfuHelperCallback getDfuAdapterCallback() {
        return this.f16386m;
    }

    public OtaModeInfo getPriorityWorkMode() {
        return getPriorityWorkMode(16);
    }

    public int getState() {
        return this.f16389p;
    }

    public List<OtaModeInfo> getSupportedModes() {
        return new ArrayList();
    }

    public boolean initialize() {
        return initialize(this.f16386m);
    }

    public boolean isBackConnecting() {
        return (this.f16389p & 2048) == 2048;
    }

    public boolean isBusy() {
        return (this.f16389p & 16) == 16;
    }

    public boolean isIdle() {
        return (getCurrentOtaState() & 256) == 256;
    }

    public boolean isPreparing() {
        int i8 = this.f16389p;
        return (i8 & 512) == 512 && i8 != 527;
    }

    public boolean isStageBusy(int i8) {
        int i9 = this.f16389p;
        return (i9 & i8) == i8 && (i9 & 16) == 16;
    }

    public void notifyError(int i8) {
        notifyError(65536, i8);
    }

    public void notifyLock() {
        try {
            synchronized (this.f16387n) {
                try {
                    if (this.f16383j) {
                        ZLogger.v("notifyLock");
                    }
                    this.f16387n.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    public void notifyProgressChanged(DfuProgressInfo dfuProgressInfo) {
        b(3, dfuProgressInfo);
    }

    public void notifyStateChanged(int i8) {
        int i9 = this.f16389p;
        if (i8 != i9) {
            ZLogger.v(this.f16381h, String.format("DFU 0x%04X(%s) >> 0x%04X(%s)", Integer.valueOf(i9), a(this.f16389p), Integer.valueOf(i8), a(i8)));
        }
        this.f16389p = i8;
        b(4, Integer.valueOf(i8));
    }

    public void onProcessStateChanged(int i8) {
        b(1, Integer.valueOf(i8));
    }

    public void removeDfuHelperCallback(DfuHelperCallback dfuHelperCallback) {
        this.f16386m = null;
    }

    public void setDfuAdapterCallback(DfuHelperCallback dfuHelperCallback) {
        this.f16386m = dfuHelperCallback;
    }

    public boolean setTestParams(OtaDeviceInfo otaDeviceInfo, DfuQcConfig dfuQcConfig) {
        if (otaDeviceInfo != null && dfuQcConfig != null) {
            return false;
        }
        ZLogger.d("IllegalArgumentException: deviceInfo and params can not be null");
        return false;
    }

    public boolean startOtaTask(DfuConfig dfuConfig) {
        boolean z7 = this.f16390q;
        if (z7 && (this.f16391r & 512) == 512) {
            ZLogger.w(String.format(Locale.US, "isInOtaProcess=%b, mProcessState=0x%04X", Boolean.valueOf(z7), Integer.valueOf(this.f16391r)));
            return false;
        }
        this.f16391r = 257;
        BaseDfuTask a8 = com.realsil.sdk.dfu.j.a.a(this.mContext, dfuConfig, this.f16397x);
        this.f16395v = a8;
        if (a8 == null) {
            return false;
        }
        a8.start();
        return true;
    }

    public boolean validate(OtaDeviceInfo otaDeviceInfo) {
        if (this.f16392s != null) {
            return true;
        }
        ZLogger.d("cacheDeviceInfo has already been clean");
        return false;
    }

    public void a() {
    }

    public boolean b() {
        DfuConfig dfuConfig = this.f16393t;
        return dfuConfig != null && dfuConfig.isCheckOtaResultEnabled();
    }

    public OtaModeInfo getPriorityWorkMode(int i8) {
        List<OtaModeInfo> supportedModes = getSupportedModes();
        if (supportedModes == null || supportedModes.size() <= 0) {
            return new OtaModeInfo(i8);
        }
        for (OtaModeInfo otaModeInfo : supportedModes) {
            if (otaModeInfo != null && otaModeInfo.getWorkmode() == i8) {
                return otaModeInfo;
            }
        }
        return supportedModes.get(0);
    }

    public boolean initialize(DfuHelperCallback dfuHelperCallback) {
        this.f16386m = dfuHelperCallback;
        if (dfuHelperCallback == null) {
            ZLogger.v(this.f16382i, "it's recommend to register a DfuAdapterCallback");
        }
        notifyStateChanged(258);
        return true;
    }

    public void notifyError(int i8, int i9) {
        ZLogger.v(String.format("onError: 0x%04X", Integer.valueOf(i9)));
        b(2, new ErrorInfo(i8, i9));
    }

    public void notifyStateChanged(int i8, int i9) {
        this.f16388o = i8;
        notifyStateChanged(i8 | i9);
    }

    public final void a(int i8, Object obj) {
        DfuHelperCallback dfuHelperCallback = this.f16386m;
        if (dfuHelperCallback == null) {
            ZLogger.v(this.f16382i, "no callback registered");
            return;
        }
        if (i8 == 1) {
            dfuHelperCallback.onProcessStateChanged(((Integer) obj).intValue());
            return;
        }
        if (i8 == 2) {
            ErrorInfo errorInfo = (ErrorInfo) obj;
            dfuHelperCallback.onError(errorInfo.type, errorInfo.code);
        } else if (i8 == 3) {
            dfuHelperCallback.onProgressChanged((DfuProgressInfo) obj);
        } else {
            if (i8 != 4) {
                return;
            }
            dfuHelperCallback.onStateChanged(((Integer) obj).intValue());
        }
    }

    public void a(long j8) {
        synchronized (this.f16387n) {
            try {
                this.f16387n.wait(j8);
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a(Message message) {
    }
}
