package com.realsil.sdk.dfu.r;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.realsil.sdk.core.bluetooth.scanner.ExtendedBluetoothDevice;
import com.realsil.sdk.core.bluetooth.scanner.SpecScanRecord;
import com.realsil.sdk.core.bluetooth.utils.BluetoothHelper;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.DataConverter;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.FirmwareLoaderX;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.m.j;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.utils.DfuUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public class f extends b {
    public f(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
    }

    private boolean Q() {
        d(this.mOtaDeviceAddress);
        w();
        if (this.otaEnvironmentPrepared) {
            l();
        } else {
            S();
        }
        if (this.mCurBinInputStream != null) {
            return true;
        }
        notifyError(4097);
        return false;
    }

    private boolean R() {
        BaseBinInputStream baseBinInputStream;
        notifyStateChanged(514);
        this.mOtaDeviceAddress = this.mDeviceAddress;
        this.otaModeEnabled = true;
        boolean z7 = false;
        while (a()) {
            try {
                if (!Q() || !T()) {
                    return false;
                }
                this.mBytesSentBuffer += getDfuProgressInfo().getBytesSent();
                if (getDfuProgressInfo().isLastImageFile()) {
                    ZLogger.d("no pending image file to upload.");
                    getDfuProgressInfo().setActiveImageSize(this.mBytesSentBuffer);
                    if (this.f15964n) {
                        F();
                        E();
                        notifyStateChanged(258);
                    } else {
                        notifyStateChanged(523);
                    }
                    z7 = true;
                } else {
                    ZLogger.v("has pending image file to upload");
                    if (getOtaDeviceInfo().getUpdateMechanism() == 1) {
                        this.mOtaDeviceAddress = this.mDeviceAddress;
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        this.otaEnvironmentPrepared = false;
                        F();
                        E();
                    } else if (getOtaDeviceInfo().getUpdateMechanism() == 3 && (baseBinInputStream = this.mNextBinInputStream) != null && a(baseBinInputStream, this.mBytesSentBuffer, getOtaDeviceInfo().otaTempBufferSize * 4096)) {
                        ZLogger.d(this.DBG, "make device to enter the ota advertiser mode, and let the app continue update image");
                        this.otaModeEnabled = true;
                        this.mBytesSentBuffer = 0;
                        this.otaEnvironmentPrepared = false;
                        F();
                        b((byte) 1);
                    }
                    j();
                }
                sleepInner(1000L);
                if (z7) {
                    return z7;
                }
            } catch (DfuException e8) {
                ZLogger.w(DfuConstants.parseOtaState(this.mProcessState) + ", " + e8.toString());
                int errCode = e8.getErrCode();
                if (errCode == 4128) {
                    notifyError(errCode, true);
                } else {
                    if (errCode != 4097 && errCode != 265) {
                        N();
                    }
                    notifyError(errCode, false);
                }
                return z7;
            }
        }
        notifyError(4128, true);
        return false;
    }

    private void S() {
        this.otaEnvironmentPrepared = false;
        notifyStateChanged(517);
        sleepInner(1500L);
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        J();
        I();
        if (this.DBG) {
            ZLogger.d(getOtaDeviceInfo().toString());
        }
        m();
        this.otaEnvironmentPrepared = true;
        ZLogger.d("Ota Environment prepared.");
    }

    private boolean T() {
        if (!C()) {
            return false;
        }
        if (getOtaDeviceInfo().icType <= 3) {
            if (getDfuConfig().isConParamUpdateLatencyEnabled()) {
                sleepInner(getDfuConfig().getLatencyTimeout() * 1000);
            }
            this.f15967q = M();
            if (this.DBG) {
                ZLogger.v("mRemoteOtaFunctionInfo=" + this.f15967q);
            }
            if (this.f15967q == 1) {
                L();
            }
        } else {
            if (this.DBG) {
                ZLogger.d("isBufferCheckEnabled=" + getOtaDeviceInfo().isBufferCheckEnabled());
            }
            if (getOtaDeviceInfo().isBufferCheckEnabled()) {
                this.f15967q = G();
            } else {
                this.f15967q = 0;
            }
            if (this.DBG) {
                ZLogger.v("mRemoteOtaFunctionInfo=" + this.f15967q);
            }
        }
        getDfuProgressInfo().start();
        g(getDfuProgressInfo().getCurImageId());
        A();
        if (this.mImageUpdateOffset == 0) {
            O();
        }
        if (this.mImageUpdateOffset - 12 >= getDfuProgressInfo().getImageSizeInBytes()) {
            ZLogger.d("Last send reach the bottom");
        } else if (getOtaDeviceInfo().icType <= 3) {
            i(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                a(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                b(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        } else {
            h(getDfuProgressInfo().getCurImageId());
            if (this.f15967q == 1) {
                d(this.I, this.f16040a0, this.mCurBinInputStream);
            } else {
                c(this.I, this.f16040a0, this.mCurBinInputStream);
            }
        }
        this.D[getDfuProgressInfo().getCurrentFileIndex()] = this.mCurBinInputStream.getImageId();
        getDfuProgressInfo().sendOver();
        j(getDfuProgressInfo().getCurImageId());
        return true;
    }

    @Override // com.realsil.sdk.dfu.r.b
    public boolean J() {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        ZLogger.d(String.format(Locale.US, "<< OPCODE_DFU_DEVICE_INFO (0x%02X)", (byte) 13));
        a(this.Z, new byte[]{13}, false);
        if (this.VDBG) {
            ZLogger.d("... waiting OPCODE_DFU_DEVICE_INFO response");
        }
        j t7 = t();
        if (t7.f16064d[0] == 1) {
            getOtaDeviceInfo().parseX0000(t7.f16064d, 1);
            return true;
        }
        ZLogger.e("Get dev info failed");
        throw new OtaException("get remote dev info failed", 270);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.realsil.sdk.dfu.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ExtendedBluetoothDevice extendedBluetoothDevice) {
        boolean equals;
        BluetoothDevice device = extendedBluetoothDevice.getDevice();
        SpecScanRecord parseFromBytes = SpecScanRecord.parseFromBytes(extendedBluetoothDevice.getScanRecord());
        if (this.mProcessState == 519) {
            if (parseFromBytes == null) {
                ZLogger.d(this.DBG, "ignore , specScanRecord is null");
                return;
            }
            if (this.VDBG) {
                ZLogger.v(parseFromBytes.toString());
            }
            byte[] manufacturerSpecificData = parseFromBytes.getManufacturerSpecificData(getDfuConfig().getManufacturerId());
            if (manufacturerSpecificData == null) {
                ZLogger.d(this.DBG, "no match manufacture data found");
                return;
            }
            if (this.DBG) {
                ZLogger.v("manufacturerSpecificData=" + DataConverter.bytes2Hex(manufacturerSpecificData));
            }
            if (!getOtaDeviceInfo().isFilterAdvByDeviceMacSupported()) {
                String formatAddressPositive = BluetoothHelper.formatAddressPositive(manufacturerSpecificData);
                if (this.VDBG) {
                    ZLogger.v("manufacturerAddr= " + BluetoothHelper.formatAddress(formatAddressPositive, true) + ", mDeviceAddress= " + BluetoothHelper.formatAddress(this.mDeviceAddress, true));
                }
                if (formatAddressPositive == null || !formatAddressPositive.equals(this.mDeviceAddress)) {
                    return;
                }
                this.mOtaDeviceName = extendedBluetoothDevice.getName();
                this.mOtaDeviceAddress = device.getAddress();
                if (this.DBG) {
                    ZLogger.d("find target device: name=" + this.mOtaDeviceName + " addr=" + this.mOtaDeviceAddress);
                }
                v();
                synchronized (this.B) {
                    this.C = true;
                    this.B.notifyAll();
                }
                return;
            }
            if (this.VDBG) {
                ZLogger.v("deviceMac= " + DataConverter.bytes2Hex(getOtaDeviceInfo().getDeviceMac()));
            }
            equals = Arrays.equals(manufacturerSpecificData, getOtaDeviceInfo().getDeviceMac());
        } else {
            if (this.mProcessState != 515) {
                ZLogger.v("ignore process state: " + this.mProcessState);
                return;
            }
            if (parseFromBytes == null) {
                ZLogger.d("ignore , specScanRecord is null");
                return;
            }
            if (this.DBG) {
                ZLogger.v(parseFromBytes.toString());
            }
            byte[] manufacturerSpecificData2 = parseFromBytes.getManufacturerSpecificData(getDfuConfig().getManufacturerId());
            if (manufacturerSpecificData2 == null) {
                return;
            }
            if (this.VDBG) {
                ZLogger.v("manufacturerSpecificData=" + DataConverter.bytes2Hex(manufacturerSpecificData2));
            }
            String formatAddressPositive2 = BluetoothHelper.formatAddressPositive(manufacturerSpecificData2);
            if (this.VDBG) {
                ZLogger.v("manufacturerAddr= " + BluetoothHelper.formatAddress(formatAddressPositive2, true) + ", mDeviceAddress= " + BluetoothHelper.formatAddress(this.mDeviceAddress, true));
            }
            equals = "00:E0:12:34:77:88".equals(formatAddressPositive2);
        }
        if (!equals) {
            return;
        }
        this.mOtaDeviceName = extendedBluetoothDevice.getName();
        this.mOtaDeviceAddress = device.getAddress();
        if (this.DBG) {
        }
        v();
        synchronized (this.B) {
        }
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
            int e8 = e(this.mOtaDeviceAddress);
            if (e8 != 0) {
                ZLogger.e("Something error in OTA process, errorCode: " + e8 + "mProcessState" + this.mProcessState);
                notifyError(e8, true);
                return false;
            }
        }
        if (z7) {
            try {
                F();
                E();
                notifyStateChanged(258);
            } catch (DfuException e9) {
                notifyError(e9.getErrCode());
            }
        } else {
            if (N()) {
                waitUntilDisconnected();
            }
            notifyError(DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, false);
        }
        return true;
    }

    @Override // com.realsil.sdk.dfu.m.d, com.realsil.sdk.dfu.k.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void executeOtaProcedure() {
        int innerCheck;
        super.executeOtaProcedure();
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
        R();
        closeInputStream(this.mCurBinInputStream);
        if (this.DBG) {
            ZLogger.d("GattDfuTaskX0000 stopped");
        }
        if (this.mProcessState == 525) {
            notifyStateChanged(259);
        }
    }

    @Override // com.realsil.sdk.dfu.k.b
    public void l() {
        Iterator<BaseBinInputStream> it = this.pendingImageInputStreams.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BaseBinInputStream next = it.next();
            if (DfuUtils.binarySearch(this.D, next.getImageId()) >= 0) {
                ZLogger.d(String.format("ignore 0x%04X, already ota", Integer.valueOf(next.getImageId())));
            } else if (next.getImageId() == getOtaDeviceInfo().getNoTempImageId()) {
                ZLogger.d(String.format("find NoTempImageId: 0x%04X", Integer.valueOf(next.getImageId())));
                this.mCurBinInputStream = next;
                break;
            }
        }
        if (this.mCurBinInputStream != null) {
            getDfuProgressInfo().initialize(this.mCurBinInputStream, getDfuConfig().isThroughputEnabled());
        }
        this.mNextBinInputStream = null;
        this.mNextBinIndex = -1;
    }

    @Override // com.realsil.sdk.dfu.k.b
    public void m() {
        closeInputStream(this.mCurBinInputStream);
        List<BaseBinInputStream> loadImageFile = FirmwareLoaderX.loadImageFile(new LoadParams.Builder().preferredIcType(getDfuConfig().getPrimaryIcType()).binParameters(getDfuConfig().getBinParameters()).with(this.mContext).vpId(getDfuConfig().getVpId()).setWorkMode(getDfuConfig().getOtaWorkMode()).setOtaDeviceInfo(getOtaDeviceInfo()).setIcCheckEnabled(getDfuConfig().isIcCheckEnabled()).setSectionSizeCheckEnabled(getDfuConfig().isSectionSizeCheckEnabled()).versionCheckEnabled(getDfuConfig().isVersionCheckEnabled(), getDfuConfig().getVersionCheckMode()).build());
        this.pendingImageInputStreams = new ArrayList();
        if (loadImageFile != null && loadImageFile.size() > 0) {
            Iterator<BaseBinInputStream> it = loadImageFile.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BaseBinInputStream next = it.next();
                if (this.VDBG) {
                    ZLogger.d(String.format("0x%04X, 0x%04X", Integer.valueOf(next.getImageId()), Integer.valueOf(getOtaDeviceInfo().getNoTempImageId())));
                }
                if (next.getImageId() == getOtaDeviceInfo().getNoTempImageId()) {
                    this.pendingImageInputStreams.add(next);
                    break;
                }
            }
        }
        List<BaseBinInputStream> list = this.pendingImageInputStreams;
        if (list == null || list.size() <= 0) {
            ZLogger.w(this.DBG, "pendingImageInputStreams == null || pendingImageInputStreams.size() <= 0");
            throw new LoadFileException("no available file to update", LoadFileException.ERROR_NO_AVAILABLE_FILE_TO_UPDATE);
        }
        if (getDfuProgressInfo().getNextFileIndex() == 0) {
            this.D = new int[this.pendingImageInputStreams.size()];
        }
        getDfuProgressInfo().setUpdateContent(this.pendingImageInputStreams);
        if (this.DBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
        l();
        this.imageFileLoaded = true;
    }

    @Override // com.realsil.sdk.dfu.r.b, com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public /* bridge */ /* synthetic */ void notifyError(int i8, boolean z7) {
        super.notifyError(i8, z7);
    }
}
