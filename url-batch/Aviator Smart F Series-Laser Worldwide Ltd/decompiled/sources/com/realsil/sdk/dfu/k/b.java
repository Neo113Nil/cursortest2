package com.realsil.sdk.dfu.k;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.realsil.sdk.core.bluetooth.scanner.ScannerParams;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.exception.OtaException;
import com.realsil.sdk.dfu.image.FirmwareLoaderX;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.image.wrapper.SocImageWrapper;
import com.realsil.sdk.dfu.internal.base.BaseDfuTask;
import com.realsil.sdk.dfu.internal.base.DfuThreadCallback;
import com.realsil.sdk.dfu.model.DeviceInfoWrapper;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class b extends BaseDfuTask {
    public BluetoothAdapter A;
    public final Object B;
    public volatile boolean C;
    public int[] D;

    /* renamed from: z, reason: collision with root package name */
    public BluetoothManager f15982z;

    public b(Context context, DfuConfig dfuConfig, DfuThreadCallback dfuThreadCallback) {
        super(context, dfuConfig, dfuThreadCallback);
        this.B = new Object();
        this.C = false;
        initialize();
    }

    public int a(String str) {
        BluetoothDevice b8;
        if (this.A == null || (b8 = b(str)) == null) {
            return 10;
        }
        return b8.getBondState();
    }

    public BluetoothDevice b(String str) {
        try {
            return this.A.getRemoteDevice(str);
        } catch (Exception e8) {
            if (!this.DBG) {
                return null;
            }
            ZLogger.w(e8.toString());
            return null;
        }
    }

    public abstract boolean b(ScannerParams scannerParams);

    public boolean c(int i8) {
        List<BaseBinInputStream> list = this.pendingImageInputStreams;
        if (list == null) {
            return false;
        }
        Iterator<BaseBinInputStream> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getImageId() == i8) {
                ZLogger.v(this.TDBG, String.format("image 0x%04X has been packed, no need to force copy", Integer.valueOf(i8)));
                return false;
            }
        }
        SocImageWrapper imageWrapper = new DeviceInfoWrapper(getOtaDeviceInfo()).getImageWrapper(i8);
        if (imageWrapper != null) {
            if (imageWrapper.getImageVersion() != com.realsil.sdk.dfu.i.a.INVALID_VERSION_32 && imageWrapper.getImageVersion() != -1) {
                ZLogger.v(this.VDBG, String.format(Locale.US, "image 0x%04X has not been packed, and active SOC image version is: 0x%08X, need to force copy", Integer.valueOf(i8), Long.valueOf(imageWrapper.getImageVersion())));
                return true;
            }
            ZLogger.v(this.VDBG, String.format(Locale.US, "image 0x%04X has not been packed, but active SOC image version is: 0x%16X, no need to force copy", Integer.valueOf(i8), Long.valueOf(imageWrapper.getImageVersion())));
        }
        return false;
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void executeOtaProcedure() {
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public void initialize() {
        String str;
        super.initialize();
        this.mOtaDeviceInfo = new OtaDeviceInfo(this.f15958h, 2);
        if (this.f15982z == null) {
            BluetoothManager bluetoothManager = (BluetoothManager) this.mContext.getSystemService("bluetooth");
            this.f15982z = bluetoothManager;
            if (bluetoothManager == null) {
                str = "Unable to initialize BluetoothManager.";
                ZLogger.w(str);
            }
        }
        BluetoothAdapter adapter = this.f15982z.getAdapter();
        this.A = adapter;
        if (adapter == null) {
            str = "Unable to obtain a BluetoothAdapter.";
            ZLogger.w(str);
        }
    }

    @Override // com.realsil.sdk.dfu.internal.base.BaseDfuTask
    public int innerCheck() {
        int innerCheck = super.innerCheck();
        if (innerCheck != 0) {
            return innerCheck;
        }
        if (BluetoothAdapter.checkBluetoothAddress(this.mDeviceAddress)) {
            return 0;
        }
        if (!this.DBG) {
            ZLogger.d("invalid address: ");
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
            e();
        }
        int i8 = pendingUpdateImageFileIndex + 1;
        if (i8 < maxFileCount) {
            this.mNextBinInputStream = this.pendingImageInputStreams.get(i8);
            this.mNextBinIndex = i8;
        } else {
            this.mNextBinInputStream = null;
            this.mNextBinIndex = -1;
        }
        if (this.DBG) {
            ZLogger.v(getDfuProgressInfo().toString());
        }
    }

    public void m() {
        closeInputStream(this.mCurBinInputStream);
        List<BaseBinInputStream> loadImageFile = FirmwareLoaderX.loadImageFile(new LoadParams.Builder().preferredIcType(getDfuConfig().getPrimaryIcType()).binParameters(getDfuConfig().getBinParameters()).with(this.mContext).vpId(getDfuConfig().getVpId()).setWorkMode(getDfuConfig().getOtaWorkMode()).setOtaDeviceInfo(getOtaDeviceInfo()).setIcCheckEnabled(getDfuConfig().isIcCheckEnabled()).setSectionSizeCheckEnabled(getDfuConfig().isSectionSizeCheckEnabled()).versionCheckEnabled(getDfuConfig().isVersionCheckEnabled(), getDfuConfig().getVersionCheckMode()).build());
        this.pendingImageInputStreams = loadImageFile;
        if (loadImageFile == null || loadImageFile.size() <= 0) {
            ZLogger.d(this.DBG, "pendingImageInputStreams is null or empty");
            throw new LoadFileException("no available file to update", LoadFileException.ERROR_NO_AVAILABLE_FILE_TO_UPDATE);
        }
        if (getDfuProgressInfo().getNextFileIndex() == 0) {
            this.D = new int[this.pendingImageInputStreams.size()];
        }
        getDfuProgressInfo().setUpdateContent(this.pendingImageInputStreams);
        l();
        this.imageFileLoaded = true;
    }

    public void n() {
        ZLogger.d(this.DBG, String.format("local stream not alignment to remote, reload to %d", Integer.valueOf(this.mImageUpdateOffset)));
        m();
        alignmentSendBytes(this.mImageUpdateOffset, true);
    }

    public void a(BluetoothDevice bluetoothDevice, int i8) {
        String str;
        if (bluetoothDevice == null || (str = this.mOtaDeviceAddress) == null || !str.equals(bluetoothDevice.getAddress()) || i8 != 2) {
            return;
        }
        ZLogger.v(this.DBG, "profile connected");
        g();
    }

    public boolean b(int i8) {
        List<BaseBinInputStream> list = this.pendingImageInputStreams;
        if (list == null) {
            return false;
        }
        Iterator<BaseBinInputStream> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getImageId() == i8) {
                ZLogger.v(this.TDBG, String.format("image 0x%04X has been packed, no need to force copy", Integer.valueOf(i8)));
                return true;
            }
        }
        return false;
    }

    public void a(ScannerParams scannerParams) {
        if (this.mAborted) {
            throw new OtaException("user aborted", 4128);
        }
        notifyStateChanged(515);
        this.mErrorState = 0;
        this.C = false;
        b(scannerParams);
        try {
            synchronized (this.B) {
                try {
                    if (this.mErrorState == 0 && !this.C) {
                        this.B.wait(31000L);
                    }
                } finally {
                }
            }
        } catch (InterruptedException e8) {
            ZLogger.w("findRemoteDevice interrupted, e = " + e8.toString());
            this.mErrorState = 259;
        }
        if (this.mErrorState == 0 && !this.C) {
            ZLogger.w("didn't find the remote device");
            this.mErrorState = DfuException.ERROR_CANNOT_FIND_DEVICE;
        }
        if (this.mErrorState != 0) {
            throw new OtaException("Error while scan remote device", this.mErrorState);
        }
    }
}
