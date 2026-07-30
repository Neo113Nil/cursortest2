package com.realsil.sdk.dfu.v;

import android.content.Context;
import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.DfuQcConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.u.b;
import com.realsil.sdk.dfu.x.c;
import com.realsil.sdk.dfu.x.g;
import com.realsil.sdk.dfu.x.k;
import com.realsil.sdk.dfu.x.l;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class e extends com.realsil.sdk.dfu.u.c {
    public e(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    public boolean A() {
        ZLogger.v(this.DBG, String.format("<< CMD_OTA_BUFFER_CHECK_ENABLE (0x%04X)", 1543));
        if (!b(1543, (byte[]) null)) {
            ZLogger.d("enableBufferCheck failed");
            return false;
        }
        try {
            ZLogger.v(this.VDBG, "... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE response");
            g a8 = g.a(u());
            ZLogger.v(this.VDBG, a8.toString());
            if (a8.b() != 1) {
                ZLogger.d(this.DBG, "enableBufferCheck failed");
                return false;
            }
            int i8 = getOtaDeviceInfo().mtu;
            a(a8.a());
            d(i8);
            return true;
        } catch (DfuException unused) {
            ZLogger.w("wait EnableBufferCheckRsp timeout");
            this.mErrorState = DfuException.ERROR_DFU_ENABLE_BUFFER_CHECK_NO_RESPONSE;
            throw new OtaException("enableBufferCheck timeout", DfuException.ERROR_DFU_ENABLE_BUFFER_CHECK_NO_RESPONSE);
        }
    }

    public boolean B() {
        byte[] u7;
        ZLogger.v(this.VDBG, String.format("<< CMD_ENTER_NORMAL_OTA_MODE (0x%04X)", 1557));
        if (!b(1557, new byte[0])) {
            throw new OtaException("enterOtaModeProcedure failed", 512);
        }
        try {
            u7 = u();
        } catch (DfuException unused) {
            ZLogger.w("enterOtaModeProcedure failed, ignore it.");
            this.mErrorState = 0;
        }
        if (u7.length <= 0) {
            if (!s()) {
                ZLogger.w("enterOtaModeProcedure failed without response");
                return false;
            }
            return true;
        }
        byte b8 = u7[0];
        if (b8 == 1) {
            ZLogger.v(this.VDBG, "enterOtaModeProcedure success");
            return true;
        }
        ZLogger.w(String.format("enterOtaModeProcedure failed, status=0x%02X", Byte.valueOf(b8)));
        return false;
    }

    public abstract boolean C();

    public boolean D() {
        return (getOtaDeviceInfo().icType == 4 || getOtaDeviceInfo().icType == 6 || getOtaDeviceInfo().icType == 8 || getOtaDeviceInfo().icType == 13) && getOtaDeviceInfo().specVersion <= 4;
    }

    public void E() {
        this.otaEnvironmentPrepared = false;
        if (!a()) {
            notifyError(4128);
            return;
        }
        notifyStateChanged(517);
        sleepInner(1500L);
        DfuQcConfig dfuQcConfig = this.f15973w;
        if (dfuQcConfig != null) {
            try {
                b(1554, new byte[]{(byte) (dfuQcConfig.getIndicator() & 255)});
            } catch (Exception unused) {
                ZLogger.v(this.DBG, "CMD_OTA_TEST error, ignore");
            }
        }
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        I();
        F();
        if (getOtaDeviceInfo().isBankEnabled() && getOtaDeviceInfo().specVersion >= 5) {
            H();
        }
        if (getOtaDeviceInfo().getUpdateMechanism() == 3) {
            G();
        }
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d(this.DBG, "Ota Environment prepared.");
    }

    public void F() {
        ZLogger.v(this.DBG, String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X), bank=0x00", 1537));
        getOtaDeviceInfo().setImageVersionValues(a(1537, 1537, new byte[]{0}));
    }

    public void G() {
        ZLogger.v(this.VDBG, String.format("<< CMD_OTA_IMAGE_SECTION_SIZE_INFO (0x%04X)", 1546));
        getOtaDeviceInfo().setImageSectionSizeValues(a(1546, 1544, (byte[]) null));
    }

    public void H() {
        ZLogger.v(this.DBG, String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X), bank=0x01", 1537));
        getOtaDeviceInfo().setImageVersionValues(a(1537, 1537, new byte[]{1}));
    }

    public boolean I() {
        ZLogger.v(this.VDBG, String.format("<< CMD_GET_TARGET_INFO (0x%04X)", 1536));
        byte[] a8 = a(1536, 1536, (byte[]) null);
        if (a8 == null) {
            ZLogger.w(this.DBG, "Get dev info failed");
            throw new OtaException("get remote dev info failed", 270);
        }
        if (this.f15958h == 22) {
            getOtaDeviceInfo().parseX0016(a8);
        } else {
            getOtaDeviceInfo().parseX0011(a8);
        }
        return true;
    }

    public void J() {
        a(new b.C0333b(1556, getOtaDeviceInfo().specVersion).a(getDfuProgressInfo().getCurImageId()).a(getDfuProgressInfo().getCurrentFileIndex() + 1, getDfuProgressInfo().getMaxFileCount()).a());
    }

    public void K() {
        int i8 = this.mCurBinInputStream.getCtrlHeaderLength() + 1 > 16 ? 32 : 16;
        byte[] bArr = new byte[i8];
        System.arraycopy(this.mCurBinInputStream.getDfuHeader(), 0, bArr, 0, this.mCurBinInputStream.getCtrlHeaderLength());
        int ctrlHeaderLength = this.mCurBinInputStream.getCtrlHeaderLength();
        if (this.mCurBinInputStream.compressed) {
            bArr[ctrlHeaderLength] = 3;
        }
        if (getOtaDeviceInfo().isAesEncryptEnabled()) {
            a(bArr, i8);
        }
        b(1538, bArr);
        ZLogger.v(this.VDBG, "... Reading CMD_OTA_START notification");
        byte b8 = u()[0];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("start dfu failed (0x%02X)", Byte.valueOf(b8)));
        throw new OtaException("start dfu failed", b8 | 512);
    }

    public abstract boolean L();

    public void a(byte b8, boolean z7) {
        if (b(new byte[]{b8})) {
            if (z7) {
                if (d()) {
                    waitUntilDisconnected();
                } else {
                    ZLogger.d(this.DBG, "device already disconnected");
                }
            }
            closeInputStream(this.mCurBinInputStream);
        }
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean activeImage(boolean z7) {
        if (!super.activeImage(z7)) {
            return false;
        }
        if (this.mConnectionState != 515) {
            ZLogger.i(this.DBG, "start to re-connect the RCU which going to active image, current state is: " + this.mConnectionState);
            int a8 = a(this.mOtaDeviceAddress, getDfuConfig().getRetransConnectTimes());
            if (a8 != 0) {
                ZLogger.w("Something error in OTA process, errorCode: " + a8 + "mProcessState" + this.mProcessState);
                notifyError(a8, true);
                return false;
            }
        }
        if (z7) {
            try {
                a(true);
                if (getDfuConfig().isCompleteActionEnabled(1)) {
                    BluetoothProfileManager.getInstance().disconnectA2dpSource(this.A.getRemoteDevice(this.mOtaDeviceAddress));
                    BluetoothProfileManager.getInstance().disconnectHfp(this.mOtaDeviceAddress);
                }
                notifyStateChanged(258);
            } catch (DfuException e8) {
                ZLogger.w(e8.toString());
                notifyError(e8.getErrCode());
            }
        } else {
            v();
            notifyError(DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, true);
        }
        onDestroy();
        return true;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void alignmentSendBytes(int i8, boolean z7) {
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0027, code lost:
    
        if (o() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(BaseBinInputStream baseBinInputStream) {
        int min;
        BaseBinInputStream baseBinInputStream2;
        ZLogger.v(this.DBG, "updateImageWithBufferCheck");
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = 0;
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            byte[] bArr = new byte[this.f15968r];
            int i9 = this.f15969s;
            byte[] bArr2 = new byte[i9];
            while (true) {
                if (i8 <= 0) {
                    try {
                    } catch (IOException unused) {
                        throw new OtaException("Error while reading file", 257);
                    }
                }
                n();
                int i10 = this.mImageUpdateOffset;
                int i11 = 12;
                if (i10 == 0) {
                    int i12 = this.f15968r - this.mImageBufferCheckOffset;
                    byte[] bArr3 = new byte[i12];
                    System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr3, 0, 12);
                    int i13 = i12 - 12;
                    byte[] bArr4 = new byte[i13];
                    int read = this.mCurBinInputStream.read(bArr4, i13);
                    if (read > 0) {
                        System.arraycopy(bArr4, 0, bArr3, 12, read);
                        i11 = read + 12;
                    }
                    C();
                    getDfuProgressInfo().setBytesSent(0);
                    bArr = bArr3;
                } else {
                    if (i10 == 12) {
                        min = bArr.length - 12;
                        baseBinInputStream2 = this.mCurBinInputStream;
                    } else {
                        min = Math.min(this.f15968r, this.mCurBinInputStream.remainSizeInBytes());
                        baseBinInputStream2 = this.mCurBinInputStream;
                    }
                    i11 = baseBinInputStream2.read(bArr, min);
                }
                int correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(i11);
                if (correctBufferCheckSize != bArr.length) {
                    ZLogger.d(this.DBG, "Reach the bottom of the image: " + correctBufferCheckSize);
                }
                ZLogger.v(getDfuProgressInfo().toString());
                if (correctBufferCheckSize > 0) {
                    if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                        a(bArr, correctBufferCheckSize);
                    }
                    int i14 = 0;
                    while (i14 < correctBufferCheckSize) {
                        int min2 = Math.min(i9, correctBufferCheckSize - i14);
                        System.arraycopy(bArr, i14, bArr2, 0, min2);
                        i14 += min2;
                        if (a(com.realsil.sdk.dfu.u.d.a(1539, getDfuConfig().getSppConfig().getDataWriteType(), bArr2, min2), false)) {
                            getDfuProgressInfo().addBytesSent(min2);
                            notifyProcessChanged();
                        }
                        k();
                    }
                    boolean d8 = d(bArr, correctBufferCheckSize);
                    if (d8) {
                        i8 = 0;
                    } else {
                        getDfuProgressInfo().addBytesSent(0 - correctBufferCheckSize);
                        i8++;
                    }
                    if (i8 >= 3) {
                        ZLogger.w("Error while buffer check, reach max try times: " + i8 + ", MAX_BUFFER_CHECK_RETRANS_TIME: 3");
                        throw new OtaException("Error while buffer check", DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES);
                    }
                    if (d8) {
                        break;
                    }
                } else {
                    if (!getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.w("Error while reading file with size: " + correctBufferCheckSize);
                        throw new OtaException("Error while reading file", 257);
                    }
                    ZLogger.i("image file has already been send over");
                }
            }
        }
    }

    public boolean d(byte[] bArr, int i8) {
        a(new c.b().a(bArr, i8).a());
        ZLogger.v(this.DBG, String.format("... waiting EVENT_OTA_BUFFER_CHECK(0x%04X)response", 1542));
        com.realsil.sdk.dfu.x.b a8 = com.realsil.sdk.dfu.x.b.a(u());
        byte a9 = a8.a();
        if (a9 == 1) {
            int b8 = a8.b();
            this.mImageUpdateOffset = b8;
            ZLogger.v(this.VDBG, String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(b8), Integer.valueOf(this.mImageUpdateOffset)));
            return true;
        }
        if (a9 != 5 && a9 != 6) {
            throw new OtaException("buffer check failed", a8.a() | 512);
        }
        ZLogger.w(String.format("buffer check failed, status=0x%02X ", Byte.valueOf(a8.a())));
        return false;
    }

    public void e(String str) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        notifyStateChanged(516);
        int a8 = a(str, getDfuConfig().getRetransConnectTimes());
        if (a8 == 0) {
            return;
        }
        if (a8 == 4128) {
            throw new OtaException("aborted, connectRemoteDevice failed", a8);
        }
        ZLogger.d(String.format("connect failed:0x%04X", Integer.valueOf(a8)));
        a(r());
        int a9 = a(str, getDfuConfig().getRetransConnectTimes());
        if (a9 == 0) {
            return;
        }
        if (a9 != 4128) {
            throw new OtaException("connectRemoteDevice failed", a9);
        }
        throw new OtaException("aborted, connectRemoteDevice failed", a9);
    }

    public void g(int i8) {
        a(new k.b(i8).a());
        ZLogger.v(this.VDBG, "... Reading CMD_OTA_IMAGE_INFO notification");
        l a8 = l.a(u());
        if (a8 == null || a8.b() != 1) {
            ZLogger.w(String.format("0x%02X, Get target image info failed", Integer.valueOf(DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED)));
            throw new OtaException("Get target image info failed", DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED);
        }
        if (this.VDBG) {
            ZLogger.v(a8.toString());
        }
        this.mImageUpdateOffset = a8.c();
        this.mImageBufferCheckOffset = a8.a();
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public int i() {
        if (!L()) {
            return 0;
        }
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
        if (getDfuProgressInfo().isLastImageFile()) {
            ZLogger.d("no pending image file to upload.");
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
            return 3;
        }
        ZLogger.d("has pending image file to upload");
        if (getOtaDeviceInfo().getUpdateMechanism() != 1) {
            if (getOtaDeviceInfo().getUpdateMechanism() == 3) {
                BaseBinInputStream baseBinInputStream = this.mNextBinInputStream;
                if (baseBinInputStream == null) {
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    return 2;
                }
                if (a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    ZLogger.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.otaModeEnabled = true;
                    this.mBytesSentBuffer = 0;
                    a((byte) 1, true);
                }
            }
            a(getDfuProgressInfo().getCurImageId(), (byte) 0);
            return 2;
        }
        a(getDfuProgressInfo().getCurImageId(), (byte) 1);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        if (this.mOtaWorkMode == 0) {
            this.otaModeEnabled = false;
        } else {
            this.otaModeEnabled = true;
        }
        this.mBytesSentBuffer = 0;
        a(true);
        getDfuProgressInfo().getActiveImageSize();
        a(30000L);
        return 2;
    }

    @Override // com.realsil.sdk.dfu.u.c, com.realsil.sdk.dfu.k.b
    public abstract void l();

    @Override // com.realsil.sdk.dfu.u.c
    public boolean v() {
        try {
            if (this.DBG) {
                ZLogger.v(String.format("<< CMD_OTA_RESET (0x%04X)", 1541));
            }
            return a(1541, (byte[]) null, true);
        } catch (DfuException e8) {
            ZLogger.w(String.format("Send CMD_OTA_RESET failed, ignore it, error code= 0x%04X", Integer.valueOf(e8.getErrCode())));
            this.mErrorState = 0;
            return false;
        }
    }

    public boolean x() {
        ZLogger.v(this.VDBG, String.format("<< CMD_CHECK_NORMAL_OTA_MODE (0x%04X)", 1558));
        if (!b(1558, new byte[0])) {
            throw new OtaException("checkNormalOtaMode failed", 512);
        }
        try {
            byte b8 = u()[0];
            if (b8 == 1) {
                ZLogger.v(this.VDBG, "checkNormalOtaMode success");
                return true;
            }
            ZLogger.w(String.format("checkNormalOtaMode failed, status=0x%02X", Byte.valueOf(b8)));
            return false;
        } catch (DfuException unused) {
            ZLogger.w("checkNormalOtaMode failed, ignore it.");
            this.mErrorState = 0;
            return true;
        }
    }

    public boolean y() {
        e(this.mOtaDeviceAddress);
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            E();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

    public void z() {
        if (this.mImageUpdateOffset != 0) {
            if (D()) {
                ZLogger.d(this.DBG, "clear soc data");
                v();
            }
            this.mImageUpdateOffset = 0;
        }
    }

    public void a(int i8, byte b8) {
        byte[] bArr = {(byte) (i8 & 255), (byte) ((i8 >> 8) & 255), b8};
        ZLogger.v(this.VDBG, String.format("<< CMD_OTA_VALID (0x%04X)", 1540));
        if (!b(1540, bArr)) {
            throw new OtaException("Validate FW failed", 512);
        }
        byte b9 = b(com.realsil.sdk.dfu.j.c.c(getDfuProgressInfo().getImageSizeInBytes()))[0];
        if (b9 == 1) {
            ZLogger.v(this.VDBG, "validate success");
        } else {
            ZLogger.w(String.format("0x%02X, Validate FW failed", Byte.valueOf(b9)));
            throw new OtaException("Validate FW failed", b9 | 512);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(byte[] bArr) {
        int i8;
        boolean z7;
        notifyStateChanged(DfuConstants.PROGRESS_ACTIVE_IMAGE_AND_RESET);
        boolean z8 = true;
        try {
            ZLogger.d(this.DBG, String.format("<< CMD_OTA_ACTIVE_RESET(0x%04X)", 1542));
            z7 = b(1542, bArr);
        } catch (DfuException e8) {
            i8 = 4128;
            if (e8.getErrCode() != 4128) {
                if (getDfuConfig().isWaitActiveCmdAckEnabled()) {
                    ZLogger.w("active cmd has no response, notify error");
                    i8 = e8.getErrCode();
                } else {
                    ZLogger.d(this.DBG, "active cmd has no response, ignore");
                    z7 = true;
                }
            }
            z7 = false;
        }
        i8 = 0;
        if (z7) {
            try {
                ZLogger.v(this.DBG, "... Reading CMD_OTA_ACTIVE_RESET notification");
                b(1600L);
            } catch (DfuException e9) {
                ZLogger.w("Read CMD_OTA_ACTIVE_RESET notification failed");
                i8 = e9.getErrCode();
                z8 = false;
            }
        } else if (s()) {
            ZLogger.v("connection maybe lost");
            if (z8) {
                throw new OtaException(i8);
            }
            ZLogger.d("image active success");
            return z8;
        }
        z8 = z7;
        if (z8) {
        }
    }

    @Override // com.realsil.sdk.dfu.u.c
    public void a(AckPacket ackPacket) {
        int toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        if (this.K.containsKey(Integer.valueOf(toAckId))) {
            this.K.put(Integer.valueOf(toAckId), ackPacket);
        }
        if (toAckId != 1536) {
            switch (toAckId) {
                case 1538:
                case 1539:
                case 1540:
                case 1541:
                case 1542:
                case 1543:
                case 1544:
                case 1545:
                    break;
                default:
                    switch (toAckId) {
                    }
            }
            e(ackPacket.getStatus());
            return;
        }
        if (status == 2 || status == 1) {
            ZLogger.w(this.DBG, "CMD_OTA_GET_DEVICE_INFO not support");
            this.mErrorState = DfuException.ERROR_DFU_SPP_OTA_NOT_SUPPORTED;
            this.mReadRxData = null;
            this.J.remove(1536);
            notifyReadLock();
        }
    }

    @Override // com.realsil.sdk.dfu.u.c
    public void a(TransportLayerPacket transportLayerPacket) {
        int opcode = transportLayerPacket.getOpcode();
        transportLayerPacket.getPayload();
        byte[] parameters = transportLayerPacket.getParameters();
        switch (opcode) {
            case 1536:
            case 1537:
            case 1544:
            case 1545:
            case 1549:
                if (!this.J.contains(Integer.valueOf(opcode))) {
                    ZLogger.d(this.DBG, String.format("not expect event: 0x%04X", Integer.valueOf(opcode)));
                    return;
                }
                this.J.remove(Integer.valueOf(opcode));
                this.mReadRxData = parameters;
                notifyReadLock();
                return;
            case 1538:
            case 1540:
            case 1541:
            case 1542:
            case 1543:
            case 1547:
            case 1550:
            case 1551:
            case 1552:
            case 1553:
            case 1554:
                synchronized (this.f15965o) {
                    this.H = parameters;
                    this.I = true;
                    this.f15965o.notifyAll();
                }
                return;
            case 1539:
            case 1546:
            case 1548:
            default:
                return;
        }
    }

    @Override // com.realsil.sdk.dfu.u.c
    public void a(boolean z7) {
        a((byte) 0, z7);
    }
}
