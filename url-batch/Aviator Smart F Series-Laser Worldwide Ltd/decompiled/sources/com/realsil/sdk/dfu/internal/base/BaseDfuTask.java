package com.realsil.sdk.dfu.internal.base;

import android.content.Context;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.FileUtils;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.j.b;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.BinParameters;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuProgressInfo;
import com.realsil.sdk.dfu.model.DfuQcConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.utils.AesJni;
import com.realsil.sdk.dfu.utils.DfuUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class BaseDfuTask extends Thread {
    public static final int COMMAND_RETRANS_INTERVAL = 1000;
    public static final long DFU_NOTIFICATION_TIMEOUT = 10000;
    public static final long DFU_NOTIFICATION_TIMEOUT_MAX = 60000;
    public static final int GATT_HEADER_SIZE = 3;
    public static final int GATT_MAX_RESEND_TIMES = 3;
    public static final int MAX_BUFFER_CHECK_RETRANS_TIMES = 3;

    /* renamed from: i, reason: collision with root package name */
    public DfuConfig f15959i;
    public boolean imageFileLoaded;
    public boolean initialized;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f15961k;

    /* renamed from: l, reason: collision with root package name */
    public AesJni f15962l;
    public volatile boolean lastPacketTransferred;

    /* renamed from: m, reason: collision with root package name */
    public String f15963m;
    public boolean mAborted;
    public BinInfo mBinIno;
    public int mBytesSentBuffer;
    public Context mContext;
    public BaseBinInputStream mCurBinInputStream;
    public String mDeviceAddress;
    public volatile int mErrorState;
    public int mNextBinIndex;
    public BaseBinInputStream mNextBinInputStream;
    public String mOtaDeviceAddress;
    public OtaDeviceInfo mOtaDeviceInfo;
    public String mOtaDeviceName;
    public volatile boolean mReadRequestCompleted;
    public int mTempBufferSentSize;
    public DfuThreadCallback mThreadCallback;
    public volatile boolean mWriteRequestCompleted;
    public volatile int mWriteRequestStatus;
    public volatile boolean mWriteRetransFlag;
    public boolean otaEnvironmentPrepared;
    public boolean otaModeEnabled;

    /* renamed from: p, reason: collision with root package name */
    public DfuProgressInfo f15966p;

    /* renamed from: w, reason: collision with root package name */
    public DfuQcConfig f15973w;

    /* renamed from: x, reason: collision with root package name */
    public b f15974x;
    public boolean DBG = false;
    public boolean VDBG = false;
    public boolean TDBG = false;
    public boolean DEBUG_DEV = false;

    /* renamed from: h, reason: collision with root package name */
    public int f15958h = 0;
    public volatile boolean isConnectedCallbackCome = false;
    public final Object mConnectionLock = new Object();
    public int mConnectionState = 0;
    public final Object mReadLock = new Object();
    public volatile byte[] mReadRxData = null;

    /* renamed from: j, reason: collision with root package name */
    public final Object f15960j = new Object();
    public volatile int mProcessState = 257;
    public List<BaseBinInputStream> pendingImageInputStreams = new ArrayList();
    public int mOtaWorkMode = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15964n = false;
    public int MAX_PACKET_SIZE = 20;

    /* renamed from: o, reason: collision with root package name */
    public final Object f15965o = new Object();

    /* renamed from: q, reason: collision with root package name */
    public int f15967q = 0;
    public int mImageUpdateOffset = 0;
    public int mImageBufferCheckOffset = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f15968r = 256;

    /* renamed from: s, reason: collision with root package name */
    public int f15969s = 16;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15970t = false;

    /* renamed from: u, reason: collision with root package name */
    public final Object f15971u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final Object f15972v = new Object();

    /* renamed from: y, reason: collision with root package name */
    public boolean f15975y = false;

    public BaseDfuTask(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        this.mContext = context;
        this.f15959i = dfuConfig;
        if (dfuConfig != null) {
            this.f15973w = dfuConfig.getQcConfig();
        } else {
            this.f15973w = null;
        }
        ZLogger.v("BaseDfuTask:" + this.f15959i.toString());
        this.mThreadCallback = dfuThreadCallback;
    }

    public static byte[] convertAddress(String str) {
        byte[] bArr = new byte[6];
        if (str != null) {
            bArr[5] = (byte) ((Character.digit(str.charAt(15), 16) * 16) + Character.digit(str.charAt(16), 16));
            bArr[4] = (byte) ((Character.digit(str.charAt(12), 16) * 16) + Character.digit(str.charAt(13), 16));
            bArr[3] = (byte) ((Character.digit(str.charAt(9), 16) * 16) + Character.digit(str.charAt(10), 16));
            bArr[2] = (byte) ((Character.digit(str.charAt(6), 16) * 16) + Character.digit(str.charAt(7), 16));
            bArr[1] = (byte) ((Character.digit(str.charAt(3), 16) * 16) + Character.digit(str.charAt(4), 16));
            bArr[0] = (byte) ((Character.digit(str.charAt(0), 16) * 16) + Character.digit(str.charAt(1), 16));
            return bArr;
        }
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = 0;
        bArr[5] = 0;
        return bArr;
    }

    public void a(int i8) {
        int max = Math.max(16, i8);
        this.f15968r = max;
        ZLogger.v(this.DBG, String.format(Locale.US, "mCurrentMaxBufferSize= %d", Integer.valueOf(max)));
    }

    public boolean abort() {
        if (isIdle()) {
            ZLogger.d("already in idle state");
        } else {
            this.mAborted = true;
            notifyStateChanged(525, true);
            abortInner();
        }
        f();
        synchronized (this.mReadLock) {
            this.mReadLock.notifyAll();
        }
        synchronized (this.mConnectionLock) {
            this.mConnectionLock.notifyAll();
        }
        g();
        return true;
    }

    public void abortInner() {
    }

    public void acquireRemoteState(long j8) {
        synchronized (this.f15971u) {
            if (this.f15970t) {
                ZLogger.v(this.VDBG, "Remote busy now, just wait!");
                try {
                    this.f15971u.wait(j8);
                } catch (InterruptedException unused) {
                }
                if (this.VDBG) {
                    ZLogger.v("Remote idle now, just go!");
                }
            }
        }
    }

    public boolean activeImage(boolean z7) {
        if (this.mProcessState == 523) {
            return true;
        }
        ZLogger.w(String.format("activeImage failed, state conflict: 0x%04X", Integer.valueOf(this.mProcessState)));
        return false;
    }

    public void alignmentSendBytes(int i8, boolean z7) {
        alignmentSendBytesCompat(i8, z7);
    }

    public void alignmentSendBytesCompat(int i8, boolean z7) {
        if (i8 != 0) {
            try {
                int max = Math.max(i8 - 12, 0);
                byte[] bArr = new byte[getDfuProgressInfo().getImageSizeInBytes()];
                if (z7) {
                    this.mCurBinInputStream.read(bArr, max);
                } else {
                    this.mCurBinInputStream.read(bArr, 0, max);
                }
            } catch (IOException e8) {
                ZLogger.w(e8.toString());
                return;
            }
        }
        getDfuProgressInfo().setBytesSent(i8);
        if (this.VDBG) {
            ZLogger.v(String.format("alignmentSendBytes,updateOffset=%d, %s", Integer.valueOf(i8), getDfuProgressInfo().toString()));
        }
    }

    public void b(byte[] bArr, int i8) {
        for (int i9 = i8; i9 > 0; i9 -= 16) {
            if (i9 >= 16) {
                int i10 = i8 - i9;
                System.arraycopy(this.f15962l.aesEncrypt(bArr, i10, 16), 0, bArr, i10, 16);
                if (getOtaDeviceInfo().getAesEncryptMode() == 0) {
                    return;
                }
            }
        }
    }

    public void blockSpeedControl() {
        b bVar = this.f15974x;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void c() {
        this.f15974x = new b(getDfuConfig().isFlowControlEnabled(), getDfuConfig().getFlowControlInterval() * getDfuConfig().getFlowControlIntervalUnit() * 1000000);
    }

    public void closeInputStream(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            if (this.VDBG) {
                ZLogger.v("closeInputStream...");
            }
            inputStream.close();
        } catch (IOException e8) {
            ZLogger.w(this.VDBG, "closeInputStream fail: " + e8.toString());
        }
    }

    public boolean d() {
        return (this.mConnectionState & 512) == 512;
    }

    public boolean e() {
        return true;
    }

    public abstract void executeOtaProcedure();

    public void f() {
        synchronized (this.f15965o) {
            this.f15965o.notifyAll();
        }
    }

    public void g() {
        try {
            synchronized (this.f15972v) {
                this.f15972v.notifyAll();
            }
        } catch (Exception e8) {
            ZLogger.e(e8.toString());
        }
    }

    public DfuConfig getDfuConfig() {
        if (this.f15959i == null) {
            this.f15959i = new DfuConfig();
        }
        return this.f15959i;
    }

    public DfuProgressInfo getDfuProgressInfo() {
        if (this.f15966p == null) {
            this.f15966p = new DfuProgressInfo();
        }
        return this.f15966p;
    }

    public OtaDeviceInfo getOtaDeviceInfo() {
        if (this.mOtaDeviceInfo == null) {
            this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        }
        return this.mOtaDeviceInfo;
    }

    public int getProcessState() {
        return this.mProcessState;
    }

    public void h() {
        synchronized (this.f15960j) {
            this.mWriteRequestCompleted = true;
            this.f15960j.notifyAll();
        }
    }

    public abstract int i();

    public void initialize() {
        notifyStateChanged(513, true);
        this.initialized = false;
        this.mAborted = false;
        this.f15970t = false;
        this.f15962l = new AesJni();
        this.otaEnvironmentPrepared = false;
        this.imageFileLoaded = false;
        this.pendingImageInputStreams = new ArrayList();
        this.mBytesSentBuffer = 0;
        this.f15966p = new DfuProgressInfo();
        this.mErrorState = 0;
        if (getDfuConfig().getLogLevel() != 0) {
            this.DBG = true;
        } else {
            this.DBG = RtkDfu.DEBUG_ENABLE;
        }
        this.VDBG = RtkDfu.VDBG;
        this.TDBG = RtkDfu.TDBG;
        if (this.DBG) {
            ZLogger.d(getDfuConfig().toString());
        }
        this.f15958h = getDfuConfig().getProtocolType();
        this.mDeviceAddress = getDfuConfig().getAddress();
        this.mOtaWorkMode = getDfuConfig().getOtaWorkMode();
        this.f15963m = getDfuConfig().getBinParameters().getFilePath();
        this.f15961k = getDfuConfig().getSecretKey();
        this.f15964n = getDfuConfig().isAutomaticActiveEnabled();
        this.MAX_PACKET_SIZE = getDfuConfig().getPrimaryMtuSize();
    }

    public boolean initializeOtaProcedure() {
        return true;
    }

    public int innerCheck() {
        StringBuilder sb;
        if (!this.initialized) {
            ZLogger.w("DfuThread not initialized");
            return 4114;
        }
        if (TextUtils.isEmpty(this.f15963m)) {
            ZLogger.w("the file path string is empty");
            return 4098;
        }
        BinParameters binParameters = getDfuConfig().getBinParameters();
        String suffix = FileUtils.getSuffix(this.f15963m);
        if (suffix == null || !suffix.equalsIgnoreCase(binParameters.getSuffix())) {
            ZLogger.w("the file suffix is not right, suffix=" + suffix);
            return 4099;
        }
        if (binParameters.getStorageType() == 1) {
            if (DfuUtils.isAssetsFileExist(this.mContext, this.f15963m)) {
                return 0;
            }
            sb = new StringBuilder();
        } else {
            if (FileUtils.exists(this.f15963m)) {
                return 0;
            }
            sb = new StringBuilder();
        }
        sb.append("the bin file not exist, path: ");
        sb.append(this.f15963m);
        ZLogger.w(sb.toString());
        return 4100;
    }

    public boolean isIdle() {
        return (this.mProcessState & 256) == 256;
    }

    public void j() {
        a(5000L);
    }

    public void notifyConnectionLock() {
        try {
            synchronized (this.mConnectionLock) {
                try {
                    this.isConnectedCallbackCome = true;
                    if (this.VDBG) {
                        ZLogger.v(String.format("isConnectedCallbackCome=%b", Boolean.valueOf(this.isConnectedCallbackCome)));
                    }
                    this.mConnectionLock.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    public void notifyError(int i8) {
        notifyError(i8, this.f15975y);
    }

    public void notifyProcessChanged() {
        this.lastPacketTransferred = getDfuProgressInfo().isFileSendOver();
        DfuThreadCallback dfuThreadCallback = this.mThreadCallback;
        if (dfuThreadCallback != null) {
            dfuThreadCallback.onProgressChanged(getDfuProgressInfo());
        } else {
            ZLogger.v(this.VDBG, "no callback registered ");
        }
    }

    public void notifyReadLock() {
        synchronized (this.mReadLock) {
            this.mReadRequestCompleted = true;
            this.mReadLock.notifyAll();
        }
    }

    public void notifyStateChanged(int i8) {
        notifyStateChanged(i8, true);
    }

    public void onDestroy() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        String format = String.format("DFU(%04X-%02X)", Integer.valueOf(this.f15958h), Integer.valueOf(this.mOtaWorkMode));
        setName(format);
        ZLogger.v(this.VDBG, "%s running...", format);
        if (initializeOtaProcedure()) {
            executeOtaProcedure();
        }
        if (this.mProcessState != 523) {
            onDestroy();
        }
    }

    public void setConnectionState(int i8) {
        int i9 = this.mConnectionState;
        if (i9 != i8) {
            ZLogger.d(String.format("Conn: 0x%04X >> 0x%04X(%s)", Integer.valueOf(i9), Integer.valueOf(i8), DfuConstants.parseConnectionState(i8)));
        }
        this.mConnectionState = i8;
    }

    public void sleepInner() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException unused) {
        }
    }

    public void startSpeedControl() {
        if (this.f15974x == null) {
            c();
        }
        this.f15974x.b();
    }

    public void updateRemoteState(int i8) {
        synchronized (this.f15971u) {
            boolean z7 = true;
            ZLogger.v(this.VDBG, String.format("updateRemoteState to %d", Integer.valueOf(i8)));
            if (i8 != 1) {
                z7 = false;
            }
            this.f15970t = z7;
            this.f15971u.notifyAll();
        }
    }

    public void waitUntilDisconnected() {
        String str;
        try {
        } catch (InterruptedException e8) {
            ZLogger.w(this.DBG, "waitUntilDisconnected interrupted: " + e8.toString());
        }
        synchronized (this.mConnectionLock) {
            try {
                int i8 = this.mConnectionState;
                if (i8 == 0 || i8 == 1280) {
                    if (this.DBG) {
                        ZLogger.d("connection already disconnected");
                    }
                    return;
                }
                if (this.DBG) {
                    ZLogger.v("wait for disconnect, wait for " + getDfuConfig().getConnectionTimeout() + "ms");
                }
                this.mConnectionLock.wait(getDfuConfig().getConnectionTimeout());
                int i9 = this.mConnectionState;
                if (i9 != 0 && i9 != 1280) {
                    str = "waitUntilDisconnected timeout";
                } else if (!this.DBG) {
                    return;
                } else {
                    str = "connection disconnected";
                }
                ZLogger.d(str);
            } finally {
            }
        }
    }

    public void a(long j8) {
        try {
            ZLogger.v("wait device auto reconnect for " + j8);
            synchronized (this.f15972v) {
                this.f15972v.wait(j8);
            }
        } catch (InterruptedException e8) {
            ZLogger.w(this.DBG, e8.toString());
        }
    }

    public boolean b() {
        String str;
        if (this.f15962l == null) {
            this.f15962l = new AesJni();
        }
        if (this.f15962l.aesInit(3, this.f15961k)) {
            return true;
        }
        if (this.VDBG) {
            str = "encrpt initial error, encrypted key: " + Arrays.toString(this.f15961k);
        } else {
            str = "encrpt initial error, encrypted key invalid!";
        }
        ZLogger.w(str);
        return false;
    }

    public void c(byte[] bArr, int i8) {
        if (bArr == null) {
            ZLogger.w(this.DBG, "value is null, exception");
            return;
        }
        if (bArr.length > i8) {
            byte[] bArr2 = new byte[i8];
            System.arraycopy(bArr, 0, bArr2, 0, i8);
            bArr = bArr2;
        }
        getDfuProgressInfo().addBytesSent(bArr.length);
        notifyProcessChanged();
    }

    public void notifyConnectionLock(int i8) {
        try {
            synchronized (this.mConnectionLock) {
                try {
                    setConnectionState(i8);
                    this.isConnectedCallbackCome = true;
                    if (this.VDBG) {
                        ZLogger.v(String.format("isConnectedCallbackCome=%b", Boolean.valueOf(this.isConnectedCallbackCome)));
                    }
                    this.mConnectionLock.notifyAll();
                } finally {
                }
            }
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
        }
    }

    public void notifyError(int i8, boolean z7) {
    }

    public void notifyStateChanged(int i8, boolean z7) {
        ZLogger.d(String.format("DFU: 0x%04X >> 0x%04X(%s)", Integer.valueOf(this.mProcessState), Integer.valueOf(i8), DfuConstants.parseOtaState(i8)));
        this.mProcessState = i8;
        if (!z7) {
            ZLogger.d(this.VDBG, "no need to notify state change");
            return;
        }
        DfuThreadCallback dfuThreadCallback = this.mThreadCallback;
        if (dfuThreadCallback != null) {
            dfuThreadCallback.onStateChanged(this.mProcessState);
        } else {
            ZLogger.v(this.VDBG, "no callback registered");
        }
    }

    public void sleepInner(long j8) {
        try {
            Thread.sleep(j8);
        } catch (InterruptedException unused) {
        }
    }

    public void a(BaseBinInputStream baseBinInputStream) {
        if (getDfuProgressInfo().getImageSizeInBytes() <= 102400 || getDfuProgressInfo().getBytesSent() != 104000) {
            return;
        }
        try {
            getDfuProgressInfo().setBytesSent(143348);
            baseBinInputStream.skip(39348);
            ZLogger.d(this.DBG, "big image reach the special size, skip some packet");
        } catch (IOException e8) {
            ZLogger.w(e8.toString());
        }
    }

    public void a(byte[] bArr) {
        if (bArr == null) {
            ZLogger.w(this.DBG, "value is null, exception");
        } else {
            getDfuProgressInfo().addBytesSent(bArr.length);
            notifyProcessChanged();
        }
    }

    public void a(byte[] bArr, int i8) {
        int i9 = 0;
        while (i9 < i8) {
            int min = Math.min(i8 - i9, 16);
            if (min != 16) {
                ZLogger.v(this.DEBUG_DEV, String.format(Locale.US, "encryptSize(%d) < 16, no need to encrypt", Integer.valueOf(min)));
                return;
            }
            System.arraycopy(this.f15962l.aesEncrypt(bArr, i9, 16), 0, bArr, i9, 16);
            i9 += 16;
            if (getOtaDeviceInfo().getAesEncryptMode() == 0) {
                return;
            }
        }
    }

    public boolean a() {
        return !this.mAborted;
    }
}
