package com.realsil.sdk.dfu.w;

import android.content.Context;
import com.realsil.sdk.bbpro.core.transportlayer.AckPacket;
import com.realsil.sdk.bbpro.core.transportlayer.TransportLayerPacket;
import com.realsil.sdk.core.bluetooth.BluetoothProfileManager;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.u.d;
import com.realsil.sdk.dfu.w.b;
import com.realsil.sdk.dfu.x.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes4.dex */
public class c extends com.realsil.sdk.dfu.u.c {
    public c(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private void A() {
        ZLogger.d(this.DBG, String.format("<< CMD_OTA_GET_OTHER_INFO (0x%04X)", 1547));
        byte[] a8 = a(1547, 1545, (byte[]) null);
        if (a8 == null || a8.length <= 0) {
            getOtaDeviceInfo().setRwsUpdateFlag(0);
        } else {
            getOtaDeviceInfo().setRwsUpdateFlag(a8[0] & 1);
        }
    }

    private void C() {
        this.otaEnvironmentPrepared = false;
        if (!a()) {
            notifyError(4128);
            return;
        }
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        E();
        if (getOtaDeviceInfo().isRwsEnabled()) {
            A();
            if (getOtaDeviceInfo().getRwsUpdateFlag() != 0) {
                throw new OtaException("rws state not ready", 282);
            }
        }
        D();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d("Ota Environment prepared.");
    }

    private void D() {
        ZLogger.d(this.DBG, String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X)", 1537));
        getOtaDeviceInfo().setActiveImageVersionValues(a(1537, 1536, (byte[]) null));
    }

    private boolean E() {
        ZLogger.d(this.DBG, String.format("<< CMD_OTA_GET_DEVICE_INFO (0x%04X)", 1536));
        byte[] a8 = a(1536, 1536, (byte[]) null);
        if (a8 == null) {
            ZLogger.e("Get dev info failed");
            throw new OtaException("get remote dev info failed", 270);
        }
        ZLogger.v(DataConverter.bytes2Hex(a8));
        getOtaDeviceInfo().parseX0000(a8);
        a(getOtaDeviceInfo().maxBufferCheckSize);
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        return true;
    }

    private void F() {
        ZLogger.v(this.DBG, String.format("<< CMD_OTA_START(0x%04X)", 1538));
        byte[] bArr = new byte[16];
        System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
        if (getOtaDeviceInfo().isAesEncryptEnabled()) {
            b(1538, this.f15962l.aesEncrypt(bArr, 0, 16));
        } else {
            b(1538, bArr);
        }
        ZLogger.v(this.VDBG, "... Reading CMD_OTA_START notification");
        byte b8 = u()[0];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("start dfu failed(0x%02X)", Byte.valueOf(b8)));
        throw new OtaException("start dfu failed", b8 | 512);
    }

    private boolean G() {
        if (!t()) {
            return false;
        }
        if (this.DBG) {
            ZLogger.v("isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
        }
        if (getOtaDeviceInfo().isBufferCheckEnabled()) {
            this.f15967q = z();
        } else {
            this.f15967q = 0;
        }
        if (this.DBG) {
            ZLogger.v("mRemoteOtaFunctionInfo=" + this.f15967q);
        }
        getDfuProgressInfo().start();
        g(getDfuProgressInfo().getCurImageId());
        if (!getDfuConfig().isBreakpointResumeEnabled()) {
            this.mImageUpdateOffset = 0;
        }
        if (this.mImageUpdateOffset == 0) {
            F();
        }
        if (this.mImageUpdateOffset - 12 < getDfuProgressInfo().getImageSizeInBytes()) {
            f(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                c(this.mCurBinInputStream);
            } else {
                b(this.mCurBinInputStream);
            }
        } else if (this.DBG) {
            ZLogger.d("Last send reach the bottom");
        }
        getDfuProgressInfo().sendOver();
        h(getDfuProgressInfo().getCurImageId());
        return true;
    }

    private void a(byte b8) {
        if (b(new byte[]{b8})) {
            if (getOtaDeviceInfo().isRwsEnabled()) {
                ZLogger.v(this.DBG, "RWS, no need to disconnect manually");
            } else {
                if (d()) {
                    waitUntilDisconnected();
                } else {
                    ZLogger.d(this.DBG, "device already disconnected");
                }
                b(false);
            }
            closeInputStream(this.mCurBinInputStream);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0054, code lost:
    
        if (r8 != (getDfuProgressInfo().getBytesSent() + 12)) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[Catch: IOException -> 0x016d, TryCatch #0 {IOException -> 0x016d, blocks: (B:62:0x0046, B:64:0x004b, B:13:0x0059, B:15:0x005d, B:16:0x0094, B:18:0x009e, B:20:0x00a2, B:58:0x007e, B:59:0x0080, B:60:0x0087, B:12:0x0056), top: B:61:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c(BaseBinInputStream baseBinInputStream) {
        int i8;
        int read;
        int correctBufferCheckSize;
        if (this.DBG) {
            ZLogger.v("updateImageWithCheckBufferForBeeUpdate");
        }
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i9 = 0;
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            int i10 = this.f15968r;
            byte[] bArr = new byte[i10];
            int i11 = this.f15969s;
            byte[] bArr2 = new byte[i11];
            while (true) {
                ZLogger.v(String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
                if (i9 <= 0) {
                    try {
                        int i12 = this.mImageUpdateOffset;
                        if (i12 != -1) {
                        }
                        i8 = this.mImageUpdateOffset;
                        if (i8 != 0) {
                            System.arraycopy(this.mCurBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                            int i13 = i10 - 12;
                            byte[] bArr3 = new byte[i13];
                            System.arraycopy(bArr3, 0, bArr, 12, this.mCurBinInputStream.read(bArr3, i13));
                            getDfuProgressInfo().setBytesSent(0);
                            read = i10;
                        } else {
                            read = this.mCurBinInputStream.read(bArr, i8 == 12 ? i10 - 12 : Math.min(this.f15968r, this.mCurBinInputStream.remainSizeInBytes()));
                        }
                        correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(read);
                        if (correctBufferCheckSize != i10 && this.DBG) {
                            ZLogger.d("Reach the bottom of the image: " + correctBufferCheckSize);
                        }
                        ZLogger.v(getDfuProgressInfo().toString());
                        if (correctBufferCheckSize <= 0) {
                            if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                                a(bArr, correctBufferCheckSize);
                            }
                            int i14 = 0;
                            while (i14 < correctBufferCheckSize) {
                                int min = Math.min(i11, correctBufferCheckSize - i14);
                                System.arraycopy(bArr, i14, bArr2, 0, min);
                                i14 += min;
                                if (a(d.a(1539, bArr2, min), false)) {
                                    getDfuProgressInfo().addBytesSent(min);
                                    notifyProcessChanged();
                                }
                                k();
                            }
                            boolean d8 = d(bArr, correctBufferCheckSize);
                            if (d8) {
                                i9 = 0;
                            } else {
                                i9++;
                                ZLogger.d("check failed, retransTimes: " + i9);
                            }
                            if (i9 >= 3) {
                                ZLogger.w("Error while buffer check, reach max try times: " + i9 + ", MAX_BUFFER_CHECK_RETRANS_TIME: 3");
                                throw new OtaException("Error while buffer check", DfuException.ERROR_BUFFER_CHECK_REACH_MAX_RETRY_TIMES);
                            }
                            if (d8) {
                                break;
                            }
                        } else {
                            if (!getDfuProgressInfo().isFileSendOver()) {
                                ZLogger.e("Error while reading file with size: " + correctBufferCheckSize);
                                throw new OtaException("Error while reading file", 257);
                            }
                            ZLogger.i("image file has already been send over");
                        }
                    } catch (IOException unused) {
                        throw new OtaException("Error while reading file", 257);
                    }
                }
                n();
                i8 = this.mImageUpdateOffset;
                if (i8 != 0) {
                }
                correctBufferCheckSize = getDfuProgressInfo().correctBufferCheckSize(read);
                if (correctBufferCheckSize != i10) {
                    ZLogger.d("Reach the bottom of the image: " + correctBufferCheckSize);
                }
                ZLogger.v(getDfuProgressInfo().toString());
                if (correctBufferCheckSize <= 0) {
                }
            }
        }
    }

    private boolean d(byte[] bArr, int i8) {
        short a8 = com.realsil.sdk.dfu.j.c.a(bArr, i8);
        if (this.DBG) {
            ZLogger.v(String.format("<< CMD_OTA_BUFFER_CHECK(0x%04X)", 1544));
        }
        b(1544, new byte[]{(byte) (i8 & 255), (byte) (i8 >> 8), (byte) (a8 & 255), (byte) ((a8 >> 8) & 255)});
        if (this.DBG) {
            ZLogger.v(String.format("... waiting EVENT_OTA_BUFFER_CHECK(0x%04X)response", 1542));
        }
        byte[] u7 = u();
        byte b8 = u7[0];
        if (b8 != 1) {
            if (b8 == 5 || b8 == 6) {
                return false;
            }
            throw new OtaException("buffer check failed", b8 | 512);
        }
        ByteBuffer wrap = ByteBuffer.wrap(u7);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int i9 = wrap.getInt(1);
        this.mImageUpdateOffset = i9;
        if (this.DBG) {
            ZLogger.d(String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i9), Integer.valueOf(this.mImageUpdateOffset)));
        }
        return true;
    }

    private void e(String str) {
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

    private void g(int i8) {
        a(new b.C0336b(i8).a());
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
    }

    private void h(int i8) {
        byte[] bArr = {(byte) (i8 & 255), (byte) ((i8 >> 8) & 255), 0};
        ZLogger.v(this.VDBG, String.format("<< CMD_OTA_VALID (0x%04X)", 1540));
        if (!b(1540, bArr)) {
            throw new OtaException("Validate FW failed", 512);
        }
        ZLogger.v(this.VDBG, "... waiting CMD_OTA_VALID response");
        byte b8 = b(com.realsil.sdk.dfu.j.c.c(getDfuProgressInfo().getImageSizeInBytes()))[0];
        if (b8 == 1) {
            return;
        }
        ZLogger.w(String.format("0x%02X, Validate FW failed", Byte.valueOf(b8)));
        throw new OtaException("Validate FW failed", b8 | 512);
    }

    private void x() {
        if (b((byte[]) null)) {
            if (getOtaDeviceInfo().isRwsEnabled()) {
                ZLogger.v(this.DBG, "RWS, no need to disconnect manually");
            } else {
                if (d()) {
                    waitUntilDisconnected();
                } else {
                    ZLogger.d(this.DBG, "device already disconnected");
                }
                b(false);
            }
            closeInputStream(this.mCurBinInputStream);
        }
    }

    private boolean y() {
        e(this.mOtaDeviceAddress);
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            C();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

    public boolean B() {
        BaseBinInputStream baseBinInputStream;
        boolean z7 = false;
        while (a()) {
            try {
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                a(e8);
            }
            if (!y() || !G()) {
                return false;
            }
            this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
            if (getDfuProgressInfo().isLastImageFile()) {
                ZLogger.d("no pending image file to upload.");
                getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
                z7 = true;
            } else {
                ZLogger.d(this.DBG, "has pending image file to upload");
                if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                    this.mOtaDeviceAddress = this.mDeviceAddress;
                    this.otaModeEnabled = true;
                    this.mBytesSentBuffer = 0;
                    x();
                } else if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                    ZLogger.d("make device to enter the ota advertiser mode, and let the app continue update imae");
                    this.otaModeEnabled = true;
                    this.mBytesSentBuffer = 0;
                    a((byte) 1);
                }
                j();
            }
            sleepInner(1000L);
            if (z7) {
                return z7;
            }
        }
        notifyError(4128);
        return false;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean activeImage(boolean z7) {
        if (!super.activeImage(z7)) {
            return false;
        }
        if (this.mConnectionState != 515) {
            if (this.DBG) {
                ZLogger.d("start to re-connect the RCU which going to active image, current state is: " + this.mConnectionState);
            }
            int a8 = a(this.mOtaDeviceAddress, getDfuConfig().getRetransConnectTimes());
            if (a8 != 0) {
                ZLogger.e("Something error in OTA process, errorCode: " + a8 + "mProcessState" + this.mProcessState);
                notifyError(a8, true);
                return false;
            }
        }
        if (z7) {
            try {
                x();
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
        return true;
    }

    public final void b(BaseBinInputStream baseBinInputStream) {
        int read;
        c();
        this.mErrorState = 0;
        this.lastPacketTransferred = false;
        int i8 = this.MAX_PACKET_SIZE;
        byte[] bArr = new byte[i8];
        while (!this.lastPacketTransferred) {
            if (this.mAborted) {
                throw new OtaException("user aborted", 4128);
            }
            startSpeedControl();
            ZLogger.v(getDfuProgressInfo().toString());
            try {
                getDfuProgressInfo().getBytesSent();
                if (this.mImageUpdateOffset == 0) {
                    int i9 = this.MAX_PACKET_SIZE;
                    byte[] bArr2 = new byte[i9];
                    baseBinInputStream.read(bArr2, i9 - 12);
                    System.arraycopy(baseBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                    System.arraycopy(bArr2, 0, bArr, 12, this.MAX_PACKET_SIZE - 12);
                    read = this.MAX_PACKET_SIZE;
                } else {
                    read = baseBinInputStream.read(bArr, i8);
                }
                if (getDfuProgressInfo().getRemainSizeInBytes() < this.MAX_PACKET_SIZE) {
                    if (this.DBG) {
                        ZLogger.v("reach the end of the file, only read some");
                    }
                    read = getDfuProgressInfo().getRemainSizeInBytes();
                }
                if (read <= 0) {
                    if (getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.i("image file has already been send over");
                        return;
                    }
                    ZLogger.e("Error while reading file with size: " + read);
                    throw new OtaException("Error while reading file", 257);
                }
                if (getOtaDeviceInfo().isAesEncryptEnabled()) {
                    for (int i10 = read; i10 > 0; i10 -= 16) {
                        if (i10 >= 16) {
                            int i11 = read - i10;
                            System.arraycopy(this.f15962l.aesEncrypt(bArr, i11, 16), 0, bArr, i11, 16);
                            if (getOtaDeviceInfo().getAesEncryptMode() == 0) {
                                break;
                            }
                        }
                    }
                }
                if (a(d.a(1539, bArr, read), false)) {
                    getDfuProgressInfo().addBytesSent(read);
                    notifyProcessChanged();
                }
                k();
                blockSpeedControl();
            } catch (IOException unused) {
                throw new OtaException("Error while reading file", 257);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (B() != false) goto L15;
     */
    @Override // com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeOtaProcedure() {
        int innerCheck;
        try {
            innerCheck = innerCheck();
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            notifyError(0);
        }
        if (innerCheck != 0) {
            notifyError(innerCheck);
            return;
        }
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = true;
        this.mBytesSentBuffer = 0;
        if (B()) {
            if (getOtaDeviceInfo().isRwsEnabled()) {
                x();
                notifyStateChanged(DfuConstants.PROGRESS_HAND_OVER_PROCESSING);
                this.otaModeEnabled = true;
                this.otaEnvironmentPrepared = false;
                this.mBytesSentBuffer = 0;
                ZLogger.d(this.DBG, "wait master to handover ...");
                sleepInner(getDfuConfig().getHandoverTimeout() * 1000);
            }
            q();
        }
        closeInputStream(this.mCurBinInputStream);
        if (this.DBG) {
            ZLogger.d("DfuThread stopped");
        }
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.u.c
    public boolean v() {
        try {
            ZLogger.d(this.DBG, String.format("<< CMD_OTA_RESET (0x%04X)", 1541));
            return b(1541, (byte[]) null);
        } catch (DfuException e8) {
            ZLogger.w(String.format("Send CMD_OTA_RESET failed, ignore it, errorcode= 0x%04X", Integer.valueOf(e8.getErrCode())));
            this.mErrorState = 0;
            return false;
        }
    }

    public final int z() {
        ZLogger.d(this.DBG, String.format("<< CMD_OTA_BUFFER_CHECK_ENABLE (0x%04X)", 1543));
        b(1543, (byte[]) null);
        try {
            ZLogger.d(this.VDBG, "... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE notification");
            byte[] u7 = u();
            if (u7[0] == 1) {
                ByteBuffer wrap = ByteBuffer.wrap(u7);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i8 = (((short) (wrap.get(2) & 255)) << 8) | ((short) (wrap.get(1) & 255));
                int i9 = ((short) (wrap.get(3) & 255)) | (((short) (wrap.get(4) & 255)) << 8);
                ZLogger.v(this.DBG, "maxBufferSize=" + i8 + ", bufferCheckMtuSize=" + i9);
                a(i8);
                d(i9);
                return 1;
            }
        } catch (DfuException unused) {
            ZLogger.w("Read DFU_REPORT_OTA_FUNCTION_VERSION failed, just think remote is normal function.");
            this.mErrorState = 0;
        }
        return 0;
    }

    private boolean b(byte[] bArr) {
        notifyStateChanged(DfuConstants.PROGRESS_ACTIVE_IMAGE_AND_RESET);
        boolean z7 = true;
        int i8 = 0;
        try {
            if (this.DBG) {
                ZLogger.d(String.format("<< CMD_OTA_ACTIVE_RESET(0x%04X)", 1542));
            }
            z7 = b(1542, bArr);
        } catch (DfuException e8) {
            if (e8.getErrCode() == 4128) {
                z7 = false;
                i8 = 4128;
            } else if (getDfuConfig().isWaitActiveCmdAckEnabled()) {
                ZLogger.w("active cmd has no response, notify error");
                i8 = e8.getErrCode();
                z7 = false;
            } else {
                ZLogger.d(this.DBG, "active cmd has no response, ignore");
            }
        }
        if (!z7) {
            throw new OtaException(i8);
        }
        ZLogger.d("image active success");
        return z7;
    }

    @Override // com.realsil.sdk.dfu.u.c
    public void a(AckPacket ackPacket) {
        int toAckId = ackPacket.getToAckId();
        byte status = ackPacket.getStatus();
        if (this.K.containsKey(Integer.valueOf(toAckId))) {
            this.K.put(Integer.valueOf(toAckId), ackPacket);
        }
        switch (toAckId) {
            case 1536:
                if (status == 2 || status == 1) {
                    ZLogger.w("CMD_OTA_GET_DEVICE_INFO not support");
                    this.mErrorState = DfuException.ERROR_DFU_SPP_OTA_NOT_SUPPORTED;
                    this.mReadRxData = null;
                    this.J.remove(1536);
                    notifyReadLock();
                    return;
                }
                return;
            case 1537:
            default:
                return;
            case 1538:
            case 1540:
            case 1541:
            case 1542:
            case 1543:
            case 1544:
            case 1545:
                e(ackPacket.getStatus());
                break;
            case 1539:
                break;
        }
        if (ackPacket.getStatus() != 0) {
            this.mWriteRetransFlag = true;
            h();
        }
    }

    @Override // com.realsil.sdk.dfu.u.c, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean e() {
        return true;
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
                if (!this.J.contains(Integer.valueOf(opcode))) {
                    ZLogger.w(String.format("not expect event: 0x%04X", Integer.valueOf(opcode)));
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
                synchronized (this.f15965o) {
                    this.H = parameters;
                    this.I = true;
                    this.f15965o.notifyAll();
                }
                return;
            case 1539:
                if (parameters == null || parameters.length <= 0 || parameters[0] == 1) {
                    this.mWriteRetransFlag = false;
                } else {
                    this.mWriteRetransFlag = true;
                }
                h();
                return;
            default:
                return;
        }
    }

    @Override // com.realsil.sdk.dfu.u.c
    public void a(boolean z7) {
        x();
    }
}
