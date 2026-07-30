package com.realsil.sdk.dfu.x;

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
import com.realsil.sdk.dfu.model.DfuQcConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.t.c;
import com.realsil.sdk.dfu.u.b;
import com.realsil.sdk.dfu.x.c;
import com.realsil.sdk.dfu.x.d;
import com.realsil.sdk.dfu.x.e;
import com.realsil.sdk.dfu.x.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class n extends com.realsil.sdk.dfu.u.c {
    public int N;
    public int O;
    public boolean P;

    public n(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.O = 0;
    }

    private byte c(int i8, byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            ZLogger.v("invalid sha256:" + DataConverter.bytes2Hex(bArr));
            return (byte) 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c.C0331c(i8, bArr));
        e a8 = new e.b().a(new c.b().a(arrayList).a()).a();
        if (this.DBG) {
            ZLogger.v(a8.toString());
        }
        if (!b(1552, a8.a())) {
            throw new OtaException("checkImage failed", 512);
        }
        ZLogger.v(this.VDBG, "... waiting CMD_CHECK_IMAGE response");
        com.realsil.sdk.dfu.t.a a9 = com.realsil.sdk.dfu.t.a.a(b(30000L));
        if (this.VDBG) {
            ZLogger.v(a9.toString());
        }
        return a9.a(i8).f16309b;
    }

    private boolean h(int i8) {
        notifyStateChanged(521);
        getDfuProgressInfo().start();
        if (this.VDBG) {
            ZLogger.v(String.format("forceCopyProcedure, imageId=0x%04X", Integer.valueOf(i8)));
            ZLogger.v(getDfuProgressInfo().toString());
        }
        g(i8);
        getDfuProgressInfo().sendOver();
        notifyProcessChanged();
        return true;
    }

    public void A() {
        if (this.mImageUpdateOffset != 0) {
            if (G()) {
                ZLogger.d(this.DBG, "clear soc data");
                v();
            }
            this.mImageUpdateOffset = 0;
        }
    }

    public boolean B() {
        int i8;
        ZLogger.v(this.DBG, String.format("<< CMD_OTA_BUFFER_CHECK_ENABLE (0x%04X)", 1543));
        if (!b(1543, (byte[]) null)) {
            ZLogger.d("enableBufferCheck failed");
            return false;
        }
        try {
            ZLogger.v(this.VDBG, "... Reading OPCODE_DFU_ENABLE_BUFFER_CHECK_MODE response");
            g a8 = g.a(u());
            ZLogger.v(this.VDBG, a8.toString());
            if (a8.f16438b != 1) {
                ZLogger.d(this.DBG, "enableBufferCheck failed");
                return false;
            }
            if (this.f15958h != 22 && getOtaDeviceInfo().specVersion < 6) {
                i8 = a8.f16440d;
                a(a8.f16439c);
                d(i8);
                return true;
            }
            i8 = getOtaDeviceInfo().mtu;
            a(a8.f16439c);
            d(i8);
            return true;
        } catch (DfuException unused) {
            ZLogger.w("wait EnableBufferCheckRsp timeout");
            this.mErrorState = DfuException.ERROR_DFU_ENABLE_BUFFER_CHECK_NO_RESPONSE;
            throw new OtaException("enableBufferCheck timeout", DfuException.ERROR_DFU_ENABLE_BUFFER_CHECK_NO_RESPONSE);
        }
    }

    public boolean C() {
        return true;
    }

    public void D() {
        ZLogger.d(this.VDBG, String.format("<< CMD_OTA_GET_OTHER_INFO (0x%04X)", 1547));
        byte[] a8 = a(1547, 1545, (byte[]) null);
        if (a8 == null || a8.length <= 0) {
            getOtaDeviceInfo().setRwsUpdateFlag(0);
        } else {
            getOtaDeviceInfo().setRwsUpdateFlag(a8[0] & 1);
        }
    }

    public int E() {
        int i8;
        if (!getOtaDeviceInfo().isBankEnabled() || getOtaDeviceInfo().specVersion < 5) {
            return 0;
        }
        ZLogger.d(this.DBG, String.format(Locale.US, "binId=0x%04X, activeCompareVersionFlag=%d, inactiveCompareVersionFlag=%d", Integer.valueOf(this.mCurBinInputStream.getBinId()), Integer.valueOf(this.mCurBinInputStream.getActiveCompareVersionFlag()), Integer.valueOf(this.mCurBinInputStream.getInactiveVersionCompFlag())));
        if (!b(this.mCurBinInputStream)) {
            return 0;
        }
        byte c8 = c(getDfuProgressInfo().getCurImageId(), this.mCurBinInputStream.getSha256());
        if ((c8 & 1) == 1) {
            ZLogger.d(this.DBG, String.format("image(0x%04X)'s sha256 is same as the inactive bank image, need to skip", Integer.valueOf(getDfuProgressInfo().getCurImageId())));
            i8 = 1;
        } else {
            i8 = 0;
        }
        if ((c8 & 2) == 2) {
            if (i(getDfuProgressInfo().getBinId())) {
                ZLogger.d(this.DBG, String.format("image(0x%04X)'s sha256 is same as the active bank image, need to copy", Integer.valueOf(getDfuProgressInfo().getCurImageId())));
                return i8 | 2;
            }
            ZLogger.v(this.DBG, String.format("0x%04X not support copy image", Integer.valueOf(getDfuProgressInfo().getBinId())));
        }
        return i8;
    }

    public boolean F() {
        return getOtaDeviceInfo().isBankEnabled() && getOtaDeviceInfo().specVersion >= 5 && b(10128);
    }

    public boolean G() {
        return (getOtaDeviceInfo().icType == 4 || getOtaDeviceInfo().icType == 6 || getOtaDeviceInfo().icType == 8 || getOtaDeviceInfo().icType == 13) && getOtaDeviceInfo().specVersion <= 4;
    }

    public void H() {
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
        O();
        if (getOtaDeviceInfo().isRwsEnabled()) {
            c(false);
        }
        L();
        if (getOtaDeviceInfo().isBankEnabled() && getOtaDeviceInfo().specVersion >= 5) {
            N();
        }
        if (getOtaDeviceInfo().getUpdateMechanism() == 3) {
            M();
        }
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d(this.DBG, "Ota Environment prepared.");
    }

    public int I() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(521);
        getDfuProgressInfo().start();
        if (this.DBG) {
            ZLogger.v("processCopyProcedure ...");
            ZLogger.v(getDfuProgressInfo().toString());
        }
        try {
            g(getDfuProgressInfo().getCurImageId());
            getDfuProgressInfo().sendOver();
            notifyProcessChanged();
            this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
            if (getDfuProgressInfo().isLastImageFile()) {
                ZLogger.v(this.VDBG, "no pendding image file to upload");
                getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
                return 3;
            }
            ZLogger.d("has pending image file to upload");
            if (getOtaDeviceInfo().getUpdateMechanism() != 1) {
                if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                    ZLogger.d("make device to enter the ota advertiser mode, and let the app continue update image");
                    this.otaModeEnabled = true;
                    this.mBytesSentBuffer = 0;
                    a((byte) 1, true);
                }
                return 2;
            }
            this.mOtaDeviceAddress = this.mDeviceAddress;
            this.otaModeEnabled = true;
            this.mBytesSentBuffer = 0;
            a(true);
            getDfuProgressInfo().getActiveImageSize();
            a(30000L);
            return 2;
        } catch (DfuException unused) {
            return 1;
        }
    }

    public void J() {
        if (c(10132)) {
            h(10132);
        }
        if (c(10133)) {
            h(10133);
        }
        if (c(10134)) {
            h(10134);
        }
        if (c(10135)) {
            h(10135);
        }
        if (c(10136)) {
            h(10136);
        }
        if (c(10137)) {
            h(10137);
        }
        if (c(10138)) {
            h(10138);
        }
        if (c(10139)) {
            h(10139);
        }
    }

    public void K() {
        ZLogger.v(this.VDBG, String.format("processRoleSwapProcedure,bud=%d ...", Integer.valueOf(getOtaDeviceInfo().getBudRole())));
        if (getOtaDeviceInfo().specVersion <= 5) {
            a(false);
        } else {
            this.P = true;
            if (getOtaDeviceInfo().getBudRole() == 1) {
                this.N = 2;
            } else {
                getOtaDeviceInfo().getBudRole();
                this.N = 1;
            }
            k(0);
        }
        notifyStateChanged(DfuConstants.PROGRESS_HAND_OVER_PROCESSING);
        ZLogger.d(this.DBG, "wait master to handover ...");
        sleepInner(getDfuConfig().getHandoverTimeout() * 1000);
    }

    public void L() {
        byte[] a8;
        if (getOtaDeviceInfo().specVersion <= 5) {
            ZLogger.v(this.DBG, String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X)", 1537));
            a8 = a(1537, 1537, (byte[]) null);
        } else {
            ZLogger.v(this.DBG, String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X), bank=0x00", 1537));
            a8 = a(1537, 1537, new byte[]{0});
        }
        getOtaDeviceInfo().setImageVersionValues(a8);
    }

    public void M() {
        ZLogger.v(this.VDBG, String.format("<< CMD_OTA_IMAGE_SECTION_SIZE_INFO (0x%04X)", 1546));
        getOtaDeviceInfo().setImageSectionSizeValues(a(1546, 1544, (byte[]) null));
    }

    public void N() {
        if (getOtaDeviceInfo().specVersion <= 5) {
            ZLogger.v(this.DBG, String.format("<< CMD_GET_INACTIVE_BANK_IMAGE_INFO (0x%04X)", 1550));
            getOtaDeviceInfo().setInactiveImageVersionValues(a(1550, 1549, (byte[]) null));
        } else {
            ZLogger.v(this.DBG, String.format("<< CMD_OTA_GET_IMAGE_INFO (0x%04X), bank=0x01", 1537));
            getOtaDeviceInfo().setImageVersionValues(a(1537, 1537, new byte[]{1}));
        }
    }

    public boolean O() {
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

    public void P() {
        if (getOtaDeviceInfo().specVersion < 10) {
            return;
        }
        a(new b.C0333b(1556, getOtaDeviceInfo().specVersion).a(getDfuProgressInfo().getCurImageId()).a(getDfuProgressInfo().getCurrentFileIndex() + 1, getDfuProgressInfo().getMaxFileCount()).a());
    }

    public void Q() {
        b((byte) 0);
    }

    public boolean R() {
        return false;
    }

    public int a(byte b8) {
        int curImageId;
        if (!a()) {
            notifyError(4128);
            return 0;
        }
        notifyStateChanged(521);
        ZLogger.d(String.format("mOtaWorkMode=0x%04X, ICType=%02X", Integer.valueOf(this.mOtaWorkMode), Integer.valueOf(getOtaDeviceInfo().icType)));
        ZLogger.v(getDfuProgressInfo().toString());
        getDfuProgressInfo().start();
        j(getDfuProgressInfo().getCurImageId());
        if (!getDfuConfig().isBreakpointResumeEnabled()) {
            this.mImageUpdateOffset = 0;
        }
        ZLogger.v(this.DBG, String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(this.mImageUpdateOffset), Integer.valueOf(this.mImageUpdateOffset)));
        if (this.mImageUpdateOffset == 0) {
            b(b8);
        }
        if (this.mImageUpdateOffset >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.v(this.VDBG, "Last send reach the bottom");
        } else {
            f(getDfuProgressInfo().getCurImageId());
        }
        getDfuProgressInfo().sendOver();
        notifyProcessChanged();
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
        try {
            if (getDfuProgressInfo().isLastImageFile()) {
                ZLogger.d("no pendding image file to upload,");
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
                    } else {
                        curImageId = getDfuProgressInfo().getCurImageId();
                    }
                } else {
                    curImageId = getDfuProgressInfo().getCurImageId();
                }
                a(curImageId, (byte) 0);
                return 2;
            }
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            this.mOtaDeviceAddress = this.mDeviceAddress;
            this.otaModeEnabled = true;
            this.mBytesSentBuffer = 0;
            a(true);
            getDfuProgressInfo().getActiveImageSize();
            a(30000L);
            return 2;
        } catch (DfuException unused) {
            getDfuProgressInfo().setNextFileIndex(getDfuProgressInfo().getLastFileIndex());
            return 1;
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

    public void b(byte b8) {
        int i8 = this.mCurBinInputStream.getCtrlHeaderLength() + 1 > 16 ? 32 : 16;
        byte[] bArr = new byte[i8];
        System.arraycopy(this.mCurBinInputStream.getDfuHeader(), 0, bArr, 0, this.mCurBinInputStream.getCtrlHeaderLength());
        bArr[this.mCurBinInputStream.getCtrlHeaderLength()] = b8;
        if (getOtaDeviceInfo().isAesEncryptEnabled()) {
            a(bArr, i8);
        }
        b(1538, bArr);
        ZLogger.v(this.VDBG, "... Reading CMD_OTA_START notification");
        byte b9 = u()[0];
        if (b9 == 1) {
            return;
        }
        ZLogger.w(String.format("start dfu failed (0x%02X)", Byte.valueOf(b9)));
        throw new OtaException("start dfu failed", b9 | 512);
    }

    public void d(BaseBinInputStream baseBinInputStream) {
        int read;
        ZLogger.d(this.DBG, "uploadFirmwareImage");
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
                if (getDfuProgressInfo().getBytesSent() == 0) {
                    int i9 = this.MAX_PACKET_SIZE;
                    byte[] bArr2 = new byte[i9];
                    baseBinInputStream.read(bArr2, i9 - 12);
                    System.arraycopy(baseBinInputStream.getHeaderBuf(), 0, bArr, 0, 12);
                    System.arraycopy(bArr2, 0, bArr, 12, this.MAX_PACKET_SIZE - 12);
                    read = this.MAX_PACKET_SIZE;
                    getDfuProgressInfo().setBytesSent(0);
                } else {
                    read = baseBinInputStream.read(bArr, i8);
                }
                if (getDfuProgressInfo().getRemainSizeInBytes() < this.MAX_PACKET_SIZE) {
                    ZLogger.v(this.DBG, "reach the end of the file, only read some");
                    read = getDfuProgressInfo().getRemainSizeInBytes();
                }
                if (read <= 0) {
                    if (getDfuProgressInfo().isFileSendOver()) {
                        ZLogger.i("image file has already been send over");
                        return;
                    }
                    ZLogger.w("Error while reading file with size: " + read);
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
                if (a(com.realsil.sdk.dfu.u.d.a(1539, bArr, read), false)) {
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

    public boolean g(int i8) {
        byte[] bArr = {(byte) (i8 & 255), (byte) ((i8 >> 8) & 255)};
        ZLogger.v(this.DBG, String.format("<< CMD_COPY_IMAGE (0x%04X)", 1551));
        if (!b(1551, bArr)) {
            throw new OtaException("copyImage failed", 512);
        }
        ZLogger.v(this.VDBG, "... waiting CMD_COPY_IMAGE response");
        byte b8 = b(30000L)[0];
        if (b8 == 1) {
            return true;
        }
        ZLogger.w(String.format("copyImage failed, status=0x%02X", Byte.valueOf(b8)));
        throw new OtaException("copyImage failed", DfuException.ERROR_DFU_COPY_IMAGE_FAILED);
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public int i() {
        if (!R()) {
            return 0;
        }
        this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
        if (getDfuProgressInfo().isLastImageFile()) {
            ZLogger.d("no pending image file to upload.");
            if (getOtaDeviceInfo().specVersion >= 3) {
                a(getDfuProgressInfo().getCurImageId(), (byte) 1);
            } else {
                a(getDfuProgressInfo().getCurImageId(), (byte) 0);
            }
            getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
            return 3;
        }
        ZLogger.d("has pending image file to upload");
        if (getOtaDeviceInfo().getUpdateMechanism() != 1) {
            if (getOtaDeviceInfo().getUpdateMechanism() == 3) {
                BaseBinInputStream baseBinInputStream = this.mNextBinInputStream;
                if (baseBinInputStream != null) {
                    if (a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                        if (getOtaDeviceInfo().specVersion >= 3) {
                            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                        } else {
                            a(getDfuProgressInfo().getCurImageId(), (byte) 0);
                        }
                        ZLogger.d("make device to enter the ota advertiser mode, and let the app continue update image");
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        a((byte) 1, true);
                    }
                } else if (getOtaDeviceInfo().specVersion >= 3) {
                    a(getDfuProgressInfo().getCurImageId(), (byte) 1);
                    return 2;
                }
            }
            a(getDfuProgressInfo().getCurImageId(), (byte) 0);
            return 2;
        }
        if (getOtaDeviceInfo().specVersion >= 3) {
            a(getDfuProgressInfo().getCurImageId(), (byte) 1);
        } else {
            a(getDfuProgressInfo().getCurImageId(), (byte) 0);
        }
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = true;
        this.mBytesSentBuffer = 0;
        a(true);
        getDfuProgressInfo().getActiveImageSize();
        a(30000L);
        return 2;
    }

    public void j(int i8) {
        a(new k.b(i8).a());
        ZLogger.v(this.VDBG, "... Reading CMD_OTA_IMAGE_INFO notification");
        l a8 = l.a(u());
        if (a8 == null || a8.f16444b != 1) {
            ZLogger.w(String.format("0x%02X, Get target image info failed", Integer.valueOf(DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED)));
            throw new OtaException("Get target image info failed", DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED);
        }
        if (this.VDBG) {
            ZLogger.v(a8.toString());
        }
        this.mImageUpdateOffset = a8.c();
        this.mImageBufferCheckOffset = a8.a();
    }

    public boolean k(int i8) {
        byte[] bArr = {(byte) (i8 & 255)};
        ZLogger.v(this.DBG, String.format("<< CMD_OTA_ROLE_SWAP (0x%04X)", 1553));
        if (!b(1553, bArr)) {
            throw new OtaException("roleSwap failed", 512);
        }
        ZLogger.v(this.VDBG, "... waiting CMD_OTA_ROLE_SWAP response");
        byte b8 = b(30000L)[0];
        if (b8 == 1) {
            ZLogger.d(this.DBG, "role swap operation done");
            return true;
        }
        ZLogger.w(String.format("role swap failed, maybe b2b disconnect, status=0x%02X", Byte.valueOf(b8)));
        throw new OtaException(String.format("roleSwap failed, status=0x%02X", Byte.valueOf(b8)), 283);
    }

    @Override // com.realsil.sdk.dfu.u.c, com.realsil.sdk.dfu.k.b
    public void l() {
        int maxFileCount = getDfuProgressInfo().getMaxFileCount();
        int pendingUpdateImageFileIndex = getDfuProgressInfo().getPendingUpdateImageFileIndex();
        BaseBinInputStream baseBinInputStream = this.pendingImageInputStreams.get(pendingUpdateImageFileIndex);
        this.mCurBinInputStream = baseBinInputStream;
        if (baseBinInputStream != null) {
            getDfuProgressInfo().initialize(this.mCurBinInputStream, getDfuConfig().isThroughputEnabled());
        }
        int i8 = pendingUpdateImageFileIndex + 1;
        if (i8 < maxFileCount) {
            this.mNextBinInputStream = this.pendingImageInputStreams.get(i8);
            this.mNextBinIndex = i8;
        } else {
            this.mNextBinInputStream = null;
            this.mNextBinIndex = -1;
        }
    }

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
        int i8;
        if (!getOtaDeviceInfo().isBankEnabled() || getOtaDeviceInfo().specVersion < 5) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        List<BaseBinInputStream> list = this.pendingImageInputStreams;
        if (list == null || list.isEmpty()) {
            i8 = 0;
        } else {
            i8 = this.pendingImageInputStreams.size();
            for (BaseBinInputStream baseBinInputStream : this.pendingImageInputStreams) {
                if (b(baseBinInputStream)) {
                    ZLogger.v(this.VDBG, baseBinInputStream.toString());
                    arrayList.add(new c.C0331c(baseBinInputStream.getImageId(), baseBinInputStream.getSha256()));
                }
            }
        }
        if (arrayList.size() <= 0) {
            ZLogger.v(this.VDBG, "no item need to check");
            return true;
        }
        e a8 = new e.b().a(new c.b().a(arrayList).a()).a();
        if (this.DBG) {
            ZLogger.v(a8.toString());
        }
        if (!b(1552, a8.a())) {
            throw new OtaException("checkImage failed", 512);
        }
        ZLogger.v(this.VDBG, "... waiting CMD_CHECK_IMAGE response");
        com.realsil.sdk.dfu.t.a a9 = com.realsil.sdk.dfu.t.a.a(b(30000L));
        if (this.VDBG) {
            ZLogger.v(a9.toString());
        }
        if (arrayList.size() == i8 && a9.a()) {
            throw new OtaException("already be latest version", DfuException.ERROR_DFU_ALREADY_BE_LATEST_VERSION);
        }
        return true;
    }

    public void y() {
        byte[] bArr;
        int i8;
        if (getOtaDeviceInfo().specVersion < 8) {
            return;
        }
        List<BaseBinInputStream> list = this.pendingImageInputStreams;
        if (list == null || list.isEmpty()) {
            bArr = null;
            i8 = 0;
        } else {
            bArr = new byte[this.pendingImageInputStreams.size() * 6];
            i8 = 0;
            for (BaseBinInputStream baseBinInputStream : this.pendingImageInputStreams) {
                if (baseBinInputStream.getPubKeyHash() != null && baseBinInputStream.getPubKeyHash().length == 4) {
                    int i9 = i8 * 6;
                    bArr[i9] = (byte) (baseBinInputStream.getImageId() & 255);
                    bArr[i9 + 1] = (byte) ((baseBinInputStream.getImageId() >> 8) & 255);
                    System.arraycopy(baseBinInputStream.getPubKeyHash(), 0, bArr, i9 + 2, 4);
                    i8++;
                }
            }
        }
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        a(new d.b().a(i8, bArr).a());
        ZLogger.v(this.DBG, String.format("... waiting EVENT_CHECK_PUBLIC_KEY_HASH(0x%04X) response", 1553));
        byte[] u7 = u();
        if (u7 == null || u7.length <= 0 || u7[0] != 1) {
            ZLogger.w("check pub key failed");
            throw new OtaException("ERROR_DFU_PUB_KEYS_CONFLICT", DfuException.ERROR_DFU_PUB_KEYS_CONFLICT);
        }
    }

    public boolean z() {
        e(this.mOtaDeviceAddress);
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            H();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

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

    public boolean b(BaseBinInputStream baseBinInputStream) {
        byte b8 = baseBinInputStream.icType;
        return ((b8 == 11 || b8 == 17 || b8 == 19) && baseBinInputStream.getBinId() == 520) || this.mCurBinInputStream.getActiveCompareVersionFlag() == 0 || this.mCurBinInputStream.getInactiveVersionCompFlag() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0027, code lost:
    
        if (o() == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(BaseBinInputStream baseBinInputStream) {
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
                    ZLogger.d(this.VDBG, "Reach the bottom of the image: " + correctBufferCheckSize);
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
                        if (a(com.realsil.sdk.dfu.u.d.a(1539, bArr2, min2), false)) {
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
                    ZLogger.i(this.DBG, "image file has already been send over");
                }
            }
        }
    }

    public boolean d(byte[] bArr, int i8) {
        a(new c.b().a(bArr, i8).a());
        ZLogger.v(this.DBG, String.format("... waiting EVENT_OTA_BUFFER_CHECK(0x%04X)response", 1542));
        b a8 = b.a(u());
        byte b8 = a8.f16425b;
        if (b8 == 1) {
            int i9 = a8.f16426c;
            this.mImageUpdateOffset = i9;
            ZLogger.v(this.VDBG, String.format(Locale.US, "mImageUpdateOffset=0x%08X(%d)", Integer.valueOf(i9), Integer.valueOf(this.mImageUpdateOffset)));
            return true;
        }
        if (b8 == 5 || b8 == 6) {
            ZLogger.w(String.format("buffer check failed, status=0x%02X ", Byte.valueOf(b8)));
            return false;
        }
        ZLogger.w(String.format("buffer check failed, status=0x%02X ", Byte.valueOf(b8)));
        throw new OtaException("buffer check failed", a8.f16425b | 512);
    }

    @Override // com.realsil.sdk.dfu.u.c, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public boolean e() {
        return getOtaDeviceInfo().specVersion < 3;
    }

    public boolean i(int i8) {
        return i8 == 1024 || i8 == 1040 || i8 == 1280 || i8 == 1538 || i8 == 2304;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
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
                if (getOtaDeviceInfo().specVersion >= 4) {
                    ZLogger.d(String.format("activeImageAndReset failed, errcode= 0x%04X", Integer.valueOf(e8.getErrCode())));
                } else if (getDfuConfig().isWaitActiveCmdAckEnabled()) {
                    ZLogger.w("active cmd has no response, notify error");
                } else {
                    ZLogger.d(this.DBG, "active cmd has no response, ignore");
                    z7 = true;
                }
                i8 = e8.getErrCode();
            }
            z7 = false;
        }
        i8 = 0;
        if (z7) {
            if (getOtaDeviceInfo().specVersion >= 4) {
                try {
                    ZLogger.v(this.DBG, "... Reading CMD_OTA_ACTIVE_RESET notification");
                    b(1600L);
                } catch (DfuException e9) {
                    ZLogger.w("Read CMD_OTA_ACTIVE_RESET notification failed");
                    i8 = e9.getErrCode();
                    z8 = false;
                }
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

    public boolean c(boolean z7) {
        if (getOtaDeviceInfo().specVersion < 6) {
            D();
            boolean z8 = getOtaDeviceInfo().getRwsUpdateFlag() == 0;
            if (z8 || z7 || z7) {
                return z8;
            }
            throw new OtaException("rws state not ready", 282);
        }
        if (!this.P) {
            return true;
        }
        boolean z9 = getOtaDeviceInfo().getBudRole() == this.N && getOtaDeviceInfo().isRwsSecondaryBud();
        if (z9) {
            return z9;
        }
        ZLogger.v(this.VDBG, String.format("hfpState = 0x%02X", Integer.valueOf(BluetoothProfileManager.getInstance().getConnectionState(1, b(this.mDeviceAddress)))));
        if (!z7) {
            throw new OtaException(String.format("role swap failed, bud role(%d) didn't change, target is %d", Integer.valueOf(getOtaDeviceInfo().getBudRole()), Integer.valueOf(this.N)), 283);
        }
        ZLogger.v(this.VDBG, String.format("role swap failed, bud role(%d) didn't change, target is %d, just ignore", Integer.valueOf(getOtaDeviceInfo().getBudRole()), Integer.valueOf(this.N)));
        return true;
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
        if (b((byte[]) null)) {
            if (z7) {
                if (d()) {
                    waitUntilDisconnected();
                } else {
                    ZLogger.d("device already disconnected");
                }
            }
            closeInputStream(this.mCurBinInputStream);
        }
    }
}
