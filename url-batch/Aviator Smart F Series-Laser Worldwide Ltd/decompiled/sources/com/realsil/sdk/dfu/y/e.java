package com.realsil.sdk.dfu.y;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.image.FirmwareLoaderX;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.model.BinParameters;
import com.realsil.sdk.dfu.model.DfuConfig;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.utils.ConnectParams;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class e extends DfuAdapter {
    public String A;

    /* renamed from: y, reason: collision with root package name */
    public UsbManager f16468y;

    /* renamed from: z, reason: collision with root package name */
    public UsbDevice f16469z;

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public void a() {
        super.a();
        this.f16468y = (UsbManager) this.mContext.getSystemService("usb");
        getOtaDeviceInfo().setMode(2);
    }

    public boolean b(int i8) {
        int i9 = this.f16385l;
        if (i9 > 0) {
            return i8 == 0 || i8 == 1 || i8 == 6;
        }
        ZLogger.v(String.format(Locale.US, "reconnectTimes=%d, no need to reconnect", Integer.valueOf(i9)));
        return false;
    }

    public boolean checkBatteryLevel(int i8) {
        String str;
        if (getOtaDeviceInfo() == null) {
            str = "ignore preverify, please call connectDevice() method to connect and get otaDeviceInfo first.";
        } else {
            if (getOtaDeviceInfo().isBasSupported()) {
                return getOtaDeviceInfo().getPrimaryBat() >= i8;
            }
            str = "ignore preverify, bas not supported";
        }
        ZLogger.w(str);
        return true;
    }

    public boolean checkImage(int i8, String str, boolean z7, boolean z8, boolean z9, OtaDeviceInfo otaDeviceInfo) {
        return FirmwareLoaderX.loadImageBinInfo(new LoadParams.Builder().with(this.mContext).binParameters(new BinParameters.Builder().filePath(str).storageType(i8).build()).setOtaDeviceInfo(otaDeviceInfo).setSectionSizeCheckEnabled(z8).setIcCheckEnabled(z9).versionCheckEnabled(z7).build()) != null;
    }

    public boolean checkUpgrade(File file, int i8) {
        return checkUpgrade(file, true, i8);
    }

    public boolean connectDevice(String str) {
        return connectDevice(new ConnectParams.Builder().address(str).build());
    }

    @Override // com.realsil.sdk.dfu.utils.DfuAdapter
    public void destroy() {
        this.f16469z = null;
        this.A = null;
        super.destroy();
    }

    public OtaDeviceInfo getOtaDeviceInfo() {
        return new OtaDeviceInfo(2);
    }

    public UsbDevice getRemoteDevice(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        UsbManager usbManager = this.f16468y;
        if (usbManager == null) {
            ZLogger.w("mUsbManager == null");
            return null;
        }
        HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
        if (deviceList == null || deviceList.size() <= 0) {
            return null;
        }
        return deviceList.get(str);
    }

    public boolean isUsbSupported() {
        return this.f16468y != null;
    }

    public boolean startOtaProcedure(DfuConfig dfuConfig) {
        return startOtaProcedure(dfuConfig, true);
    }

    public void a(DfuException dfuException) {
        if (b(dfuException.getErrCode())) {
            return;
        }
        disconnect();
        notifyError(dfuException.getErrType(), dfuException.getErrCode());
    }

    public boolean checkImage(DfuConfig dfuConfig, OtaDeviceInfo otaDeviceInfo) {
        return FirmwareLoaderX.loadImageBinInfo(new LoadParams.Builder().with(this.mContext).binParameters(dfuConfig.getBinParameters()).setSectionSizeCheckEnabled(dfuConfig.isSectionSizeCheckEnabled()).setIcCheckEnabled(dfuConfig.isIcCheckEnabled()).versionCheckEnabled(dfuConfig.isVersionCheckEnabled(), dfuConfig.getVersionCheckMode()).setOtaDeviceInfo(otaDeviceInfo).build()) != null;
    }

    public boolean checkUpgrade(File file, boolean z7, int i8) {
        String obj;
        if (getOtaDeviceInfo() == null) {
            obj = "please reConnectToDevice() method to connect and get otaDeviceInfo first.";
        } else {
            try {
                return checkImage(0, file.getPath(), z7, false, false, getOtaDeviceInfo()) && checkBatteryLevel(i8);
            } catch (DfuException e8) {
                obj = e8.toString();
            }
        }
        ZLogger.w(obj);
        return false;
    }

    public boolean startOtaProcedure(DfuConfig dfuConfig, boolean z7) {
        int errCode;
        if (dfuConfig == null) {
            ZLogger.w("dfuConfig cannot be null");
            throw new IllegalArgumentException("dfuConfig cannot be null");
        }
        if (!z7) {
            return true;
        }
        ZLogger.d(dfuConfig.toString());
        if (getOtaDeviceInfo() == null) {
            ZLogger.w("ignore preverify, please call connectDevice() method to connect and get otaDeviceInfo first.");
            return true;
        }
        try {
        } catch (DfuException e8) {
            errCode = e8.getErrCode();
        }
        if (!checkImage(dfuConfig, getOtaDeviceInfo())) {
            ZLogger.w("checkImage failed");
            notifyError(4097);
            return false;
        }
        if (!dfuConfig.isBatteryCheckEnabled() || checkBatteryLevel(dfuConfig.getLowBatteryThreshold())) {
            return true;
        }
        ZLogger.w(this.f16381h, "checkBatteryLevel failed");
        errCode = DfuException.ERROR_BATTERY_LEVEL_LOW;
        notifyError(errCode);
        return false;
    }

    public boolean checkImage(String str, boolean z7, OtaDeviceInfo otaDeviceInfo) {
        return checkImage(0, str, z7, false, false, otaDeviceInfo);
    }
}
