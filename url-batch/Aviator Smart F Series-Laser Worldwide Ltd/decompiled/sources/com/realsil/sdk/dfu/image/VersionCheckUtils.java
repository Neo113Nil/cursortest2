package com.realsil.sdk.dfu.image;

import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.stream.BaseBinInputStream;
import com.realsil.sdk.dfu.image.wrapper.SocImageWrapper;
import com.realsil.sdk.dfu.model.ImageVersionInfo;
import com.realsil.sdk.dfu.model.OtaDeviceInfo;
import com.realsil.sdk.dfu.utils.DfuUtils;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class VersionCheckUtils {
    public static int a(ImageVersionInfo imageVersionInfo, BaseBinInputStream baseBinInputStream, int i8) {
        if (imageVersionInfo == null) {
            return 1;
        }
        if (imageVersionInfo.getVersion() == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
            ZLogger.v(String.format("invalid version:0x%04X, no need to check", Long.valueOf(imageVersionInfo.getVersion())));
            return 1;
        }
        int a8 = com.realsil.sdk.dfu.c.e.a(i8, baseBinInputStream.imageVersion).a(com.realsil.sdk.dfu.c.e.a(i8, imageVersionInfo.getVersion()));
        ZLogger.v(String.format(Locale.US, "compare image, imageId=0x%04X, compare=%d ", Integer.valueOf(imageVersionInfo.getImageId()), Integer.valueOf(a8)));
        return a8;
    }

    public static int checkImageVersionInfo(OtaDeviceInfo otaDeviceInfo, ImageVersionInfo imageVersionInfo, boolean z7, int i8, BaseBinInputStream baseBinInputStream, int i9) {
        if (imageVersionInfo == null) {
            return 1;
        }
        if (imageVersionInfo.getVersion() == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
            ZLogger.v(String.format("invalid inactive version:0x%04X, no need to check", Long.valueOf(imageVersionInfo.getVersion())));
            return 1;
        }
        int compareVersion = compareVersion(i8, baseBinInputStream.getBinId(), baseBinInputStream.getImageId(), baseBinInputStream.imageVersion, baseBinInputStream.otaVersion, otaDeviceInfo.protocolType, imageVersionInfo.getVersion(), otaDeviceInfo.specVersion, i9, z7);
        ZLogger.d(String.format(Locale.US, "compare inactive image, imageId=0x%04X, compare=%d ", Integer.valueOf(imageVersionInfo.getImageId()), Integer.valueOf(compareVersion)));
        return compareVersion;
    }

    public static void checkImageVersionInfo2Compat(OtaDeviceInfo otaDeviceInfo, BaseBinInputStream baseBinInputStream, int i8) {
        ImageVersionInfo activeImageVersionInfoByImageId = otaDeviceInfo.getActiveImageVersionInfoByImageId(baseBinInputStream.getImageId());
        ImageVersionInfo inActiveImageVersionInfoByImageId = otaDeviceInfo.getInActiveImageVersionInfoByImageId(baseBinInputStream.getImageId());
        baseBinInputStream.setActiveCompareVersionFlag(a(activeImageVersionInfoByImageId, baseBinInputStream, i8));
        baseBinInputStream.setInactiveVersionCompFlag(a(inActiveImageVersionInfoByImageId, baseBinInputStream, i8));
    }

    public static int compareImageVersion(long j8, int i8, long j9, int i9, int i10) {
        ZLogger.v(String.format(Locale.US, "checkVersion: bin=%08X(%d) %s, soc=%08X(%d) %s", Long.valueOf(j8), Long.valueOf(j8), DfuUtils.convertVersion2Str(i8, j8, i10), Long.valueOf(j9), Long.valueOf(j9), DfuUtils.convertVersion2Str(i9, j9, i10)));
        if (j9 == com.realsil.sdk.dfu.i.a.INVALID_VERSION_32) {
            return 1;
        }
        return i8 <= 0 ? com.realsil.sdk.dfu.e.a.a(j8, getBuildNum(j9, i9, i10)) : i9 <= 0 ? com.realsil.sdk.dfu.e.a.a(getBuildNum(j8, i8, i10), j9) : com.realsil.sdk.dfu.c.e.a(i10, j8).a(com.realsil.sdk.dfu.c.e.a(i10, j9));
    }

    public static int compareVersion(int i8, int i9, int i10, long j8, int i11, int i12, long j9, int i13, int i14, boolean z7) {
        return getBinImageVersion(i9, j8, i11, i14).a(getSocImageVersion(i8, i12, i13, i10, j9, z7));
    }

    public static com.realsil.sdk.dfu.c.e getBinImageVersion(int i8, long j8, int i9, int i10) {
        if (i9 >= 2 && i8 == 1040) {
            i10 = 516;
        }
        if (i9 <= 0) {
            i10 = 7;
        }
        return com.realsil.sdk.dfu.c.e.a(i10, j8);
    }

    public static int getBuildNum(long j8, int i8, int i9) {
        long j9;
        long j10;
        long j11;
        if (i8 <= 0) {
            return (int) j8;
        }
        if (i9 != 1) {
            if (i9 != 515) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        j9 = j8 >> 27;
                        j10 = 31;
                    } else if (i9 == 5) {
                        j9 = j8 >> 21;
                        j10 = 2047;
                    } else {
                        if (i9 == 4) {
                            return (int) j8;
                        }
                        if (i9 == 7) {
                            return (int) j8;
                        }
                        if (i9 != 514) {
                            return (int) j8;
                        }
                    }
                    j11 = j9 & j10;
                    return (int) j11;
                }
            }
            j11 = (j8 & 255) | ((j8 >> 8) & 255);
            return (int) j11;
        }
        j8 >>= 24;
        j11 = j8 & 255;
        return (int) j11;
    }

    public static com.realsil.sdk.dfu.c.e getSocImageVersion(int i8, int i9, int i10, int i11, long j8, boolean z7) {
        return com.realsil.sdk.dfu.c.e.a(SocImageWrapper.getImageVersionFormatWithImageId(i8, i9, i10, i11, z7), j8);
    }

    public static int compareVersion(long j8, long j9, int i8) {
        com.realsil.sdk.dfu.c.e a8 = com.realsil.sdk.dfu.c.e.a(i8, j8);
        com.realsil.sdk.dfu.c.e a9 = com.realsil.sdk.dfu.c.e.a(i8, j9);
        ZLogger.v(a8.toString());
        ZLogger.v(a9.toString());
        return a8.a(a9);
    }
}
