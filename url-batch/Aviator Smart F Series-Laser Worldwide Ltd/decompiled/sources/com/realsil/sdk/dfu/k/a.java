package com.realsil.sdk.dfu.k;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.core.utility.FileUtils;
import com.realsil.sdk.dfu.RtkDfu;
import com.realsil.sdk.dfu.exception.LoadFileException;
import com.realsil.sdk.dfu.image.BinIndicator;
import com.realsil.sdk.dfu.image.LoadParams;
import com.realsil.sdk.dfu.image.VersionCheckUtils;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.model.BinInfo;
import com.realsil.sdk.dfu.model.ImageVersionInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.utils.DfuUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class a {
    public static final int ERR_EQUAL_VERSION = 0;
    public static final int ERR_IMAGE_NOT_DEFINED = 3;
    public static final int ERR_LOW_VERSION = -1;
    public static final int ERR_SECTION_SIZE_EXCEED_LIMIT = 2;
    public static final int ERR_SUCCESS = 1;
    public static final String FILE_SUFFIX = "BIN";

    /* renamed from: a, reason: collision with root package name */
    public static boolean f15980a = RtkDfu.DEBUG_ENABLE;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f15981b = RtkDfu.VDBG;

    public static int a(BaseBinInputStream baseBinInputStream, int i8, OtaDeviceInfo otaDeviceInfo) {
        return (otaDeviceInfo == null || com.realsil.sdk.dfu.c.f.a(baseBinInputStream, otaDeviceInfo.getActiveImageVersionInfoByImageId(i8))) ? 1 : 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int checkPackImageVersion(int i8, BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo) {
        String format;
        String format2;
        if (otaDeviceInfo == null) {
            return 1;
        }
        long j8 = baseBinInputStream.imageVersion;
        int i9 = baseBinInputStream.otaVersion;
        if (otaDeviceInfo.specVersion != 0) {
            int i10 = otaDeviceInfo.icType;
            if (i10 <= 3) {
                ZLogger.d(f15981b, String.format("not support version check for bee1 when otaVersion=%d", Integer.valueOf(i9)));
                return 1;
            }
            BinIndicator binIndicatorByBitNumber = BinIndicator.getBinIndicatorByBitNumber(i10, i8);
            if (binIndicatorByBitNumber == null) {
                ZLogger.d(f15981b, String.format("not find BinIndicator with bitNumber=%d", Integer.valueOf(i8)));
                return 1;
            }
            if (!binIndicatorByBitNumber.versionCheckSupported) {
                ZLogger.d(f15981b, String.format("not support version check  with bitNumber=%d", Integer.valueOf(i8)));
                return 1;
            }
            ImageVersionInfo activeImageVersionInfo = otaDeviceInfo.getActiveImageVersionInfo(binIndicatorByBitNumber.bitNumber);
            if (activeImageVersionInfo == null) {
                ZLogger.d(f15981b, String.format("not find soc image version info with bitNumber=%d", Integer.valueOf(i8)));
                return 1;
            }
            if (f15981b) {
                ZLogger.v(binIndicatorByBitNumber.toString());
            }
            if (activeImageVersionInfo.getBitNumber() == i8 || activeImageVersionInfo.getBitNumber() + 16 == i8) {
                if (VersionCheckUtils.compareImageVersion(j8, i9, activeImageVersionInfo.getVersion(), otaDeviceInfo.specVersion, binIndicatorByBitNumber.versionFormat) <= 0) {
                    format = String.format(Locale.US, "image: bitNumber=%d, file(%08X)<device(%08X)", Integer.valueOf(i8), Long.valueOf(j8), Long.valueOf(activeImageVersionInfo.getVersion()));
                    ZLogger.w(format);
                    return -1;
                }
                ZLogger.v(f15981b, "version validate ok: " + j8);
            }
            return 1;
        }
        int i11 = otaDeviceInfo.icType;
        if (i11 != 12) {
            switch (i11) {
                case 3:
                    if (i8 == 0) {
                        if (j8 < otaDeviceInfo.getPatchVersion()) {
                            format = String.format(Locale.US, "patch : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getPatchVersion()));
                            ZLogger.w(format);
                            return -1;
                        }
                        if (j8 == otaDeviceInfo.getPatchVersion()) {
                            format2 = String.format(Locale.US, "patch : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getPatchVersion()));
                            ZLogger.w(format2);
                            return 0;
                        }
                        return 1;
                    }
                    if (i8 == 1 || i8 == 2) {
                        if (j8 < otaDeviceInfo.getAppVersion()) {
                            format = String.format(Locale.US, "app : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getAppVersion()));
                            ZLogger.w(format);
                            return -1;
                        }
                        if (j8 == otaDeviceInfo.getAppVersion()) {
                            format2 = String.format(Locale.US, "app : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getAppVersion()));
                            ZLogger.w(format2);
                            return 0;
                        }
                        return 1;
                    }
                    if (i8 == 4) {
                        if (j8 < otaDeviceInfo.getPatchExtensionVersion()) {
                            format = String.format(Locale.US, "patch extension : file(%08X)<device(%08X)", Long.valueOf(j8), Integer.valueOf(otaDeviceInfo.getPatchExtensionVersion()));
                            ZLogger.w(format);
                            return -1;
                        }
                        if (j8 == otaDeviceInfo.getPatchExtensionVersion()) {
                            format2 = String.format(Locale.US, "patch extension : file(%08X)<device(%08X)", Long.valueOf(j8), Integer.valueOf(otaDeviceInfo.getPatchExtensionVersion()));
                            ZLogger.w(format2);
                            return 0;
                        }
                    }
                    return 1;
                case 4:
                case 6:
                case 7:
                case 8:
                    if (i8 == 4) {
                        if (j8 < otaDeviceInfo.getPatchVersion()) {
                            format = String.format(Locale.US, "patch : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getPatchVersion()));
                            ZLogger.w(format);
                            return -1;
                        }
                        if (j8 == otaDeviceInfo.getPatchVersion()) {
                            format2 = String.format(Locale.US, "patch : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getPatchVersion()));
                            ZLogger.w(format2);
                            return 0;
                        }
                        return 1;
                    }
                    if (i8 == 5) {
                        if (j8 < otaDeviceInfo.getAppVersion()) {
                            format = String.format(Locale.US, "app: file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getAppVersion()));
                            ZLogger.w(format);
                            return -1;
                        }
                        if (j8 == otaDeviceInfo.getAppVersion()) {
                            format2 = String.format(Locale.US, "app: file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getAppVersion()));
                            ZLogger.w(format2);
                            return 0;
                        }
                    }
                    return 1;
                case 5:
                case 9:
                    break;
                default:
                    return 1;
            }
        }
        if (i8 == 4) {
            if (j8 <= otaDeviceInfo.getPatchVersion()) {
                format = String.format(Locale.US, "patch: file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getPatchVersion()));
                ZLogger.w(format);
                return -1;
            }
            if (j8 <= otaDeviceInfo.getPatchVersion()) {
                format2 = String.format(Locale.US, "patch: file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getPatchVersion()));
                ZLogger.w(format2);
                return 0;
            }
            return 1;
        }
        if (i8 == 5) {
            if (j8 <= otaDeviceInfo.getAppVersion()) {
                format = String.format(Locale.US, "app : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getAppVersion()));
                ZLogger.w(format);
                return -1;
            }
            if (j8 <= otaDeviceInfo.getAppVersion()) {
                format2 = String.format(Locale.US, "app : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getAppVersion()));
                ZLogger.w(format2);
                return 0;
            }
        }
        return 1;
    }

    public static int checkSingleImageVersion(BinIndicator binIndicator, BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo) {
        if (binIndicator == null || otaDeviceInfo == null) {
            return 1;
        }
        ZLogger.d(binIndicator.toString());
        ImageVersionInfo activeImageVersionInfoByImageId = otaDeviceInfo.getActiveImageVersionInfoByImageId(baseBinInputStream.getImageId());
        if (activeImageVersionInfoByImageId == null) {
            return 1;
        }
        if (VersionCheckUtils.compareImageVersion(baseBinInputStream.imageVersion, binIndicator.versionFormat, activeImageVersionInfoByImageId.getVersion(), otaDeviceInfo.specVersion, binIndicator.versionFormat) <= 0) {
            ZLogger.w(String.format(Locale.US, "image: bitNumber=%d, file(%08X)<device(%08X)", Integer.valueOf(binIndicator.bitNumber), Long.valueOf(baseBinInputStream.imageVersion), Long.valueOf(activeImageVersionInfoByImageId.getVersion())));
            return -1;
        }
        ZLogger.v("version validate ok: " + baseBinInputStream.imageVersion);
        return 1;
    }

    public static int checkSingleImageVersion2(BinIndicator binIndicator, BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo) {
        if (binIndicator == null || otaDeviceInfo == null) {
            return 1;
        }
        ZLogger.d(binIndicator.toString());
        ImageVersionInfo activeImageVersionInfo = otaDeviceInfo.getActiveImageVersionInfo(binIndicator.bitNumber);
        if (activeImageVersionInfo == null) {
            return 1;
        }
        if (VersionCheckUtils.compareImageVersion(baseBinInputStream.imageVersion, binIndicator.versionFormat, activeImageVersionInfo.getVersion(), otaDeviceInfo.specVersion, binIndicator.versionFormat) <= 0) {
            ZLogger.w(String.format(Locale.US, "image: bitNumber=%d, file(%08X)<device(%08X)", Integer.valueOf(binIndicator.bitNumber), Long.valueOf(baseBinInputStream.imageVersion), Long.valueOf(activeImageVersionInfo.getVersion())));
            return -1;
        }
        ZLogger.v("version validate ok: " + baseBinInputStream.imageVersion);
        return 1;
    }

    public static BaseBinInputStream openAssetsInputStream(Context context, int i8, String str, long j8, long j9, int i9, boolean z7) {
        String str2;
        AssetManager assets = context.getAssets();
        if (assets != null) {
            InputStream open = assets.open(str);
            if (open != null) {
                ZLogger.v(f15981b, String.format(Locale.US, "fileName=%s, icType=%d", str, Integer.valueOf(i8)));
                return a(i8, open, j8, j9, i9, z7);
            }
            str2 = String.format("open asset file(%s) failed", str);
        } else {
            str2 = "assetManager is null";
        }
        ZLogger.w(str2);
        return null;
    }

    public static BaseBinInputStream openFileInputStream(int i8, String str, long j8, long j9, int i9, boolean z7) {
        return a(i8, new FileInputStream(str), j8, j9, i9, z7);
    }

    public static BaseBinInputStream openFileInputStreamCompat(int i8, LoadParams loadParams, boolean z7) {
        try {
            return loadParams.b() == 1 ? openAssetsInputStream(loadParams.a(), i8, loadParams.c(), 0L, 0L, LoadParams.a(i8, loadParams.a(z7)), z7) : openFileInputStream(i8, loadParams.c(), 0L, 0L, LoadParams.a(i8, loadParams.a(z7)), z7);
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return null;
        }
    }

    public static int wrapperBitNumber(int i8, int i9) {
        return i9 == 0 ? i8 : i8 % i9;
    }

    public static int a(BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo) {
        if (otaDeviceInfo == null) {
            return 1;
        }
        BinIndicator indByBinId = BinIndicator.getIndByBinId(otaDeviceInfo.icType, baseBinInputStream.getBinId());
        if (indByBinId == null) {
            ZLogger.d(f15980a, String.format("image(binId=0x%04X) not defined, ignore section size check", Integer.valueOf(baseBinInputStream.getBinId())));
            return 1;
        }
        if (indByBinId.versionCheckSupported) {
            ZLogger.v(indByBinId.toString());
            return !com.realsil.sdk.dfu.c.f.a(baseBinInputStream, otaDeviceInfo.getActiveImageVersionInfo(indByBinId.bitNumber)) ? 2 : 1;
        }
        ZLogger.d(f15980a, "not support version check , ignore section size check");
        return 1;
    }

    public static int checkSingleImageVersion(BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo) {
        String format;
        if (otaDeviceInfo == null) {
            return 1;
        }
        int binId = baseBinInputStream.getBinId();
        long j8 = baseBinInputStream.imageVersion;
        if (otaDeviceInfo.specVersion != 0) {
            return checkSingleImageVersion2(baseBinInputStream, otaDeviceInfo);
        }
        int i8 = otaDeviceInfo.icType;
        if (i8 <= 3) {
            ZLogger.v("not support version check for bee1 when otaVersion=0");
            return 1;
        }
        if (i8 == 4 || i8 == 6 || i8 == 7 || i8 == 8) {
            if (binId == 512) {
                if (j8 < otaDeviceInfo.getPatchVersion()) {
                    format = String.format(Locale.US, "patch image : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getPatchVersion()));
                    ZLogger.w(format);
                    return -1;
                }
                return 1;
            }
            if (binId == 768 && j8 < otaDeviceInfo.getAppVersion()) {
                format = String.format(Locale.US, "app image: file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getAppVersion()));
                ZLogger.w(format);
                return -1;
            }
            return 1;
        }
        if (i8 == 5 || i8 == 9 || i8 == 12) {
            if (binId != 512) {
                if (binId == 768 && j8 < otaDeviceInfo.getAppVersion()) {
                    format = String.format(Locale.US, "app image : file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getAppVersion()));
                    ZLogger.w(format);
                    return -1;
                }
            } else if (j8 < otaDeviceInfo.getPatchVersion()) {
                format = String.format(Locale.US, "patch image: file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(otaDeviceInfo.getPatchVersion()));
                ZLogger.w(format);
                return -1;
            }
        }
        return 1;
    }

    public static int checkSingleImageVersion2(BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo) {
        if (otaDeviceInfo == null) {
            return 1;
        }
        int binId = baseBinInputStream.getBinId();
        int i8 = otaDeviceInfo.icType;
        if (i8 > 3) {
            return checkSingleImageVersion2(BinIndicator.getBinIndicatorByBinId(i8, binId, 0), baseBinInputStream, otaDeviceInfo);
        }
        ZLogger.d("not support version check for bee1 when otaVersion=1");
        return 1;
    }

    public static BaseBinInputStream openFileInputStreamCompat(int i8, LoadParams loadParams, boolean z7, boolean z8) {
        byte[] bArr = new byte[0];
        if (z7) {
            bArr = a(i8, loadParams);
        }
        BaseBinInputStream openFileInputStreamCompat = openFileInputStreamCompat(i8, loadParams, z8);
        if (openFileInputStreamCompat != null) {
            openFileInputStreamCompat.setSha256(bArr);
        }
        return openFileInputStreamCompat;
    }

    public static int wrapperBitNumber(int i8, int i9, int i10) {
        int i11 = (i9 >> (i8 * 2)) & 3;
        return i11 == 0 ? i10 == 2 ? i8 + 16 : i8 : i11 == 1 ? i8 + 16 : i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(BaseBinInputStream baseBinInputStream, OtaDeviceInfo otaDeviceInfo, int i8) {
        int i9;
        ImageVersionInfo inActiveImageVersionInfoByImageId;
        long j8 = baseBinInputStream.imageVersion;
        int i10 = baseBinInputStream.otaVersion;
        ImageVersionInfo activeImageVersionInfoByImageId = otaDeviceInfo.getActiveImageVersionInfoByImageId(baseBinInputStream.getImageId());
        if (activeImageVersionInfoByImageId != null) {
            if (activeImageVersionInfoByImageId.getVersion() != com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
                i9 = i10;
                if (VersionCheckUtils.compareVersion(otaDeviceInfo.icType, baseBinInputStream.getBinId(), baseBinInputStream.getImageId(), j8, i10, otaDeviceInfo.protocolType, activeImageVersionInfoByImageId.getVersion(), otaDeviceInfo.specVersion, i8, otaDeviceInfo.isBankEnabled()) == -1) {
                    ZLogger.v(String.format(Locale.US, "active image: file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(activeImageVersionInfoByImageId.getVersion())));
                    return -1;
                }
                ZLogger.v(f15980a, String.format("active version validate ok :0x%04X", Long.valueOf(j8)));
                inActiveImageVersionInfoByImageId = otaDeviceInfo.getInActiveImageVersionInfoByImageId(baseBinInputStream.getImageId());
                if (inActiveImageVersionInfoByImageId != null) {
                    if (inActiveImageVersionInfoByImageId.getVersion() != com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
                        if (VersionCheckUtils.compareVersion(otaDeviceInfo.icType, baseBinInputStream.getBinId(), baseBinInputStream.getImageId(), j8, i9, otaDeviceInfo.protocolType, inActiveImageVersionInfoByImageId.getVersion(), otaDeviceInfo.specVersion, i8, otaDeviceInfo.isBankEnabled()) == -1) {
                            ZLogger.v(String.format(Locale.US, "inactive image:  file(%08X)<device(%08X)", Long.valueOf(j8), Long.valueOf(inActiveImageVersionInfoByImageId.getVersion())));
                            return -1;
                        }
                        ZLogger.v(f15980a, String.format("inactive version validate ok :0x%04X", Long.valueOf(j8)));
                        return 1;
                    }
                    ZLogger.v(String.format("invalid inactive version:0x%04X, no need to check", Long.valueOf(j8)));
                }
                return 1;
            }
            ZLogger.v(String.format("invalid active version:0x%04X, no need to check", Long.valueOf(j8)));
        }
        i9 = i10;
        inActiveImageVersionInfoByImageId = otaDeviceInfo.getInActiveImageVersionInfoByImageId(baseBinInputStream.getImageId());
        if (inActiveImageVersionInfoByImageId != null) {
        }
        return 1;
    }

    public static BaseBinInputStream a(int i8, InputStream inputStream, long j8, long j9, int i9, boolean z7) {
        if (f15981b) {
            ZLogger.v(String.format(Locale.US, "icType=0x%02X, skipOffset=%d,imageHeadsetOffset=%d", Integer.valueOf(i8), Long.valueOf(j8), Integer.valueOf(i9)));
        }
        inputStream.skip(j8);
        if (i8 <= 3) {
            return new com.realsil.sdk.dfu.h.c(inputStream, j9, i9, 20, z7);
        }
        if (i8 == 4 || i8 == 6 || i8 == 7 || i8 == 8) {
            return new com.realsil.sdk.dfu.h.b(inputStream, j9, i9, 20, z7);
        }
        if (i8 == 11 || i8 == 17 || i8 == 19 || i8 == 10 || i8 == 13) {
            return new com.realsil.sdk.dfu.h.a(inputStream, j9, i9, 20, z7);
        }
        if (i8 == 5 || i8 == 9 || i8 == 12 || i8 == 14) {
            return new com.realsil.sdk.dfu.h.d(inputStream, j9, i9, 20, z7);
        }
        if (i8 == 15) {
            return new com.realsil.sdk.dfu.h.f(inputStream, j9, i9, 20, z7);
        }
        if (i8 == 16) {
            return new com.realsil.sdk.dfu.h.e(inputStream, j9, i9, 20, z7);
        }
        ZLogger.d(String.format("not support icType=0x%02X", Integer.valueOf(i8)));
        return null;
    }

    public static BinInfo a(LoadParams loadParams) {
        String c8 = loadParams.c();
        if (TextUtils.isEmpty(c8)) {
            throw new LoadFileException("invalid path: ", 4098);
        }
        String d8 = loadParams.d();
        String suffix = FileUtils.getSuffix(c8);
        if (suffix == null || !suffix.equalsIgnoreCase(d8)) {
            ZLogger.w(String.format("invalid suffix(%s), conflict with (%s)", suffix, d8));
            throw new LoadFileException("invalid suffix", 4099);
        }
        BinInfo binInfo = new BinInfo();
        binInfo.updateBank = loadParams.l();
        if (loadParams.b() != 1) {
            File file = new File(c8);
            if (!file.exists()) {
                throw new LoadFileException("image file not exist", 4100);
            }
            binInfo.path = file.getPath();
            binInfo.fileName = file.getName();
            binInfo.fileSize = file.length();
        } else {
            if (loadParams.a() == null) {
                throw new LoadFileException("invalid context", 4097);
            }
            binInfo.path = c8;
            binInfo.fileName = DfuUtils.getAssetsFileName(c8);
        }
        com.realsil.sdk.dfu.image.pack.a b8 = com.realsil.sdk.dfu.f.b.b(loadParams);
        binInfo.packManager = b8;
        if (b8 == null) {
            binInfo.fileType = 1;
            binInfo.icType = loadParams.i();
            return binInfo;
        }
        ZLogger.v(f15980a, b8.toString());
        binInfo.fileType = 2;
        binInfo.icType = binInfo.packManager.c();
        binInfo.isPackFile = true;
        binInfo.subFileInfos = binInfo.packManager.a(loadParams, 0);
        binInfo.subFileInfos1 = binInfo.packManager.a(loadParams, 1);
        return binInfo;
    }

    public static byte[] a(int i8, LoadParams loadParams) {
        BaseBinInputStream openFileInputStreamCompat = openFileInputStreamCompat(i8, loadParams, false);
        if (openFileInputStreamCompat == null) {
            return new byte[0];
        }
        openFileInputStreamCompat.parseImageHeaderEx();
        byte[] sha256 = openFileInputStreamCompat.getSha256();
        try {
            openFileInputStreamCompat.close();
            return sha256;
        } catch (Exception e8) {
            ZLogger.w(e8.toString());
            return sha256;
        }
    }
}
