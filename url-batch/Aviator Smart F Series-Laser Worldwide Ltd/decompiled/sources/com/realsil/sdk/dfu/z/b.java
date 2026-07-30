package com.realsil.sdk.dfu.z;

import android.content.Context;
import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.bluetooth.scanner.BrEdrScannerPresenter;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.smartwear.SmartWearBinConfig;
import com.realsil.sdk.dfu.x.n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes4.dex */
public class b extends n {
    public final Object Q;
    public volatile int R;
    public SmartWearBinConfig S;

    public b(Context context, DfuConfig dfuConfig, SmartWearBinConfig smartWearBinConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.Q = new Object();
        this.R = 0;
        new SmartWearBinConfig();
        this.S = smartWearBinConfig;
    }

    public final boolean S() {
        synchronized (this.Q) {
            try {
                ZLogger.v(this.VDBG, "waitSysUpgradeResult start,progressResult=" + this.R);
                if (this.R == 0) {
                    this.Q.wait(900000L);
                }
            } catch (InterruptedException e8) {
                ZLogger.w("readNotificationResponse interrupted, " + e8.toString());
            }
            ZLogger.v(this.VDBG, "waitSysUpgradeResult complete,progressResult=" + this.R);
            return this.R == 1;
        }
    }

    @Override // com.realsil.sdk.dfu.x.n, com.realsil.sdk.dfu.u.c
    public void a(AckPacket ackPacket) {
        super.a(ackPacket);
        int toAckId = ackPacket.getToAckId();
        ackPacket.getStatus();
        if (toAckId == 33840) {
            e(ackPacket.getStatus());
        }
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean abort() {
        l(2);
        return super.abort();
    }

    public final boolean c(byte[] bArr) {
        try {
            if (!b(33840, bArr)) {
                notifyError(4115, false);
                return false;
            }
            synchronized (this.Q) {
                this.R = 0;
            }
            ZLogger.v(this.VDBG, "... waiting CMD_GLASS_START_SYS_UPGRADE response");
            byte[] b8 = b(30000L);
            ZLogger.v(this.VDBG, "response=" + DataConverter.bytes2Hex(b8));
            if (b8 != null && b8.length != 0) {
                ByteBuffer wrap = ByteBuffer.wrap(b8);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                byte b9 = wrap.get();
                ZLogger.v(this.VDBG, "status=" + ((int) b9));
                if (b9 == 0) {
                    return S();
                }
                notifyError(4115, false);
                return false;
            }
            ZLogger.v("response == null || response.length == 0");
            notifyError(4115, false);
            return false;
        } catch (DfuException unused) {
            notifyError(4115, false);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r1 == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.realsil.sdk.dfu.internal.base.BaseDfuTask, com.realsil.sdk.dfu.z.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00be -> B:10:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c0 -> B:10:0x00c5). Please report as a decompilation issue!!! */
    @Override // com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeOtaProcedure() {
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        boolean z7 = true;
        this.otaModeEnabled = true;
        ?? r12 = 0;
        r12 = 0;
        r12 = 0;
        r12 = 0;
        r12 = 0;
        this.mBytesSentBuffer = 0;
        this.f15975y = false;
        if (!a()) {
            notifyError(4128);
            return;
        }
        try {
        } catch (DfuException e8) {
            ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
            notifyError(e8.getErrCode(), r12);
            z7 = false;
        }
        if (z() && a()) {
            ZLogger.v(this.S.toString());
            SmartWearBinConfig smartWearBinConfig = this.S;
            if (smartWearBinConfig.specVersion == 1) {
                boolean c8 = c(smartWearBinConfig.encodeV1());
                if (!c8) {
                    r12 = c8;
                }
                ZLogger.v("completed=" + z7);
                if (z7) {
                    notifyStateChanged(258);
                }
                closeInputStream(this.mCurBinInputStream);
                r12 = 525;
                r12 = 525;
                if (this.mProcessState == 525) {
                    notifyStateChanged(259);
                }
            } else if ((!smartWearBinConfig.wifiFirmwareEnabled || c(smartWearBinConfig.encodeWiFiV2())) && a()) {
                SmartWearBinConfig smartWearBinConfig2 = this.S;
                if (smartWearBinConfig2.btFirmwareEnabled) {
                    boolean c9 = c(smartWearBinConfig2.encodeBtV2());
                    r12 = c9;
                }
                ZLogger.v("completed=" + z7);
                if (z7) {
                }
                closeInputStream(this.mCurBinInputStream);
                r12 = 525;
                r12 = 525;
                if (this.mProcessState == 525) {
                }
            }
        }
    }

    public void l(int i8) {
        synchronized (this.Q) {
            ZLogger.v("notifyProgressLock:" + i8);
            this.R = i8;
            this.Q.notifyAll();
        }
    }

    @Override // com.realsil.sdk.dfu.u.c, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void notifyError(int i8, boolean z7) {
        if (this.mAborted) {
            i8 = 4128;
        }
        if (this.DBG) {
            ZLogger.v(String.format("error = 0x%04X, needReset=%b", Integer.valueOf(i8), Boolean.valueOf(z7)));
        }
        if (i8 != 4128) {
            notifyStateChanged(260, true);
        }
        if (z7) {
            v();
        }
        BrEdrScannerPresenter brEdrScannerPresenter = this.E;
        if (brEdrScannerPresenter != null) {
            brEdrScannerPresenter.stopScan();
        }
        closeInputStream(this.mCurBinInputStream);
        DfuThreadCallback dfuThreadCallback = this.mThreadCallback;
        if (dfuThreadCallback != null) {
            dfuThreadCallback.onError(i8);
        }
        this.mAborted = true;
    }

    @Override // com.realsil.sdk.dfu.x.n
    public boolean z() {
        e(this.mOtaDeviceAddress);
        return true;
    }

    @Override // com.realsil.sdk.dfu.x.n, com.realsil.sdk.dfu.u.c
    public void a(TransportLayerPacket transportLayerPacket) {
        super.a(transportLayerPacket);
        int opcode = transportLayerPacket.getOpcode();
        transportLayerPacket.getPayload();
        byte[] parameters = transportLayerPacket.getParameters();
        ZLogger.v("decodeEventPacket");
        if (opcode == 33840) {
            ZLogger.v("EVENT_REQUEST_SET_SYS_UPGRADE");
            synchronized (this.f15965o) {
                this.H = parameters;
                this.I = true;
                this.f15965o.notifyAll();
            }
            return;
        }
        if (opcode != 1588) {
            if (opcode == 1590) {
                ByteBuffer wrap = ByteBuffer.wrap(parameters);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                if (wrap.get() == 0) {
                    notifyError(4116);
                }
                l(2);
                return;
            }
            return;
        }
        ZLogger.v("EVENT_SYS_UPGRADE_RESULT");
        ByteBuffer wrap2 = ByteBuffer.wrap(parameters);
        wrap2.order(ByteOrder.LITTLE_ENDIAN);
        byte b8 = wrap2.get();
        if (b8 == 0) {
            l(1);
        } else {
            l(2);
            notifyError(b8 | 4128, false);
        }
    }
}
