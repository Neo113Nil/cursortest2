package com.realsil.sdk.dfu.y;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.image.FirmwareLoaderX;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.internal.base.BaseDfuTask;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class c extends BaseDfuTask {
    public int[] A;

    /* renamed from: z, reason: collision with root package name */
    public UsbManager f16466z;

    public c(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        initialize();
    }

    public UsbDevice a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UsbManager usbManager = this.f16466z;
        if (usbManager == null) {
            ZLogger.w("mUsbManager == null");
            return null;
        }
        HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
        if (deviceList != null && deviceList.size() > 0) {
            return deviceList.get(str);
        }
        ZLogger.d("no usb device exist");
        return null;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void initialize() {
        super.initialize();
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        if (this.f16466z == null) {
            UsbManager usbManager = (UsbManager) this.mContext.getSystemService("usb");
            this.f16466z = usbManager;
            if (usbManager == null) {
                ZLogger.w("Unable to initialize mUsbManager.");
            }
        }
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public int innerCheck() {
        int innerCheck = super.innerCheck();
        if (innerCheck != 0) {
            return innerCheck;
        }
        if (!TextUtils.isEmpty(this.mDeviceAddress)) {
            return 0;
        }
        if (!this.DBG) {
            ZLogger.w("invalid address: ");
            return 4112;
        }
        ZLogger.w("invalid address: " + this.mDeviceAddress);
        return 4112;
    }

    public void k() {
        acquireRemoteState(60000L);
    }

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

    public void m() {
        closeInputStream(this.mCurBinInputStream);
        List<BaseBinInputStream> loadImageFile = FirmwareLoaderX.loadImageFile(new LoadParams.Builder().preferredIcType(getDfuConfig().getPrimaryIcType()).binParameters(getDfuConfig().getBinParameters()).with(this.mContext).vpId(getDfuConfig().getVpId()).setOtaDeviceInfo(getOtaDeviceInfo()).setIcCheckEnabled(getDfuConfig().isIcCheckEnabled()).setSectionSizeCheckEnabled(getDfuConfig().isSectionSizeCheckEnabled()).versionCheckEnabled(getDfuConfig().isVersionCheckEnabled(), getDfuConfig().getVersionCheckMode()).build());
        this.pendingImageInputStreams = loadImageFile;
        if (loadImageFile == null || loadImageFile.size() <= 0) {
            ZLogger.w("pendingImageInputStreams == null || pendingImageInputStreams.size() <= 0");
            throw new LoadFileException("no available file to update", LoadFileException.ERROR_NO_AVAILABLE_FILE_TO_UPDATE);
        }
        if (getDfuProgressInfo().getNextFileIndex() == 0) {
            this.A = new int[this.pendingImageInputStreams.size()];
        }
        getDfuProgressInfo().setUpdateContent(this.pendingImageInputStreams);
        ZLogger.v(getDfuProgressInfo().toString());
        l();
        this.imageFileLoaded = true;
    }
}
