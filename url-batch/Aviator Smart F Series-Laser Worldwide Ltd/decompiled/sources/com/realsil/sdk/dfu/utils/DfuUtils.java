package com.realsil.sdk.dfu.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.realsil.sdk.core.logger.ZLogger;
import com.realsil.sdk.dfu.image.wrapper.BinImageWrapper;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes4.dex */
public final class DfuUtils {
    public static int IMAGE_VERSION_FORMAT;
    public static final int IMAGE_VERSION_FORMAT_AUTO = 0;

    public static int binarySearch(int[] iArr, int i8) {
        if (iArr == null || iArr.length <= 0) {
            return -1;
        }
        int length = iArr.length - 1;
        int i9 = 0;
        while (i9 <= length) {
            int i10 = (i9 + length) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i8) {
                i9 = i10 + 1;
            } else {
                if (i11 <= i8) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return ~i9;
    }

    public static String convertVersion2Str(int i8, int i9) {
        return convertVersion2Str(0, i8, i9);
    }

    public static String formatBatteryLevel(int i8) {
        return String.format(Locale.US, "%d%%", Integer.valueOf(i8));
    }

    public static String formatImageVersionWithBinId(int i8, int i9, int i10, int i11) {
        return new BinImageWrapper.Builder().setOtaVersion(i10).icType(i8).binId(i9).imageVersion(i11, 2).build().getFormattedVersion();
    }

    public static String formatImageVersionWithBitNumber(int i8, int i9, int i10, int i11) {
        long j8 = i11;
        return new BinImageWrapper.Builder().setOtaVersion(i10).imageVersion(j8).icType(i8).bitNumber(i9).imageVersion(j8, 1).build().getFormattedVersion();
    }

    public static String formatLinkKey(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = bArr[i8] & 255;
            sb.append(i9 <= 15 ? "0" + Integer.toHexString(bArr[i8] & 255).toUpperCase() : Integer.toHexString(i9).toUpperCase());
            if (i8 < length - 1) {
                sb.append(":");
            }
        }
        return sb.toString();
    }

    public static String formatManufacturerAddr(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[17];
        int i8 = 0;
        int i9 = 0;
        while (i8 < 17) {
            int i10 = i8 + 1;
            if (i10 % 3 == 0) {
                cArr[i8] = ':';
            } else {
                cArr[i8] = charArray[i9];
                i9++;
            }
            i8 = i10;
        }
        return String.valueOf(cArr);
    }

    public static String genNonceHexString(int i8) {
        int i9 = i8 * 2;
        if (i9 <= 0) {
            return "";
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append("0123456789ABCDEF".charAt(random.nextInt(16)));
        }
        return sb.toString();
    }

    public static String getAssetsFileName(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            return str;
        }
        if (lastIndexOf != 0) {
            str.substring(0, lastIndexOf + 1);
        }
        return str.substring(lastIndexOf + 1);
    }

    public static int getBatteryLevel(int i8) {
        if (i8 >= 80) {
            return 5;
        }
        if (i8 >= 60) {
            return 4;
        }
        if (i8 >= 40) {
            return 3;
        }
        if (i8 >= 20) {
            return 2;
        }
        return i8 >= 1 ? 1 : 0;
    }

    public static int getControlSpeed(int i8) {
        switch (i8) {
            case 1:
                return 3000;
            case 2:
                return DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
            case 3:
                return 2000;
            case 4:
                return 1500;
            case 5:
                return 1000;
            case 6:
                return 500;
            default:
                return -1;
        }
    }

    public static int getImageVersionFormatWithBitNumber(int i8, int i9) {
        if (i8 <= 3) {
            return 7;
        }
        if (i8 == 5 || i8 == 9 || i8 == 12) {
            return i9 != 2 ? 3 : 2;
        }
        switch (i9) {
            case 0:
            case 1:
                return 2;
            case 2:
            default:
                return 1;
            case 3:
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
            case 7:
                return 515;
            case 8:
                return 514;
            case 9:
                return 2;
        }
    }

    public static int getSocImageVersionFormatWithBitNumber(int i8, boolean z7, int i9, int i10) {
        if (i9 <= 3) {
            return 7;
        }
        if (i9 == 5 || i9 == 9 || i9 == 12) {
            return i10 != 2 ? 3 : 2;
        }
        switch (i10) {
            case 0:
            case 1:
                return 2;
            case 2:
            default:
                return 1;
            case 3:
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
            case 7:
                return 515;
            case 8:
                return 514;
            case 9:
                return 2;
        }
    }

    public static boolean isAssetsFileExist(Context context, String str) {
        String str2;
        String[] list;
        AssetManager assets = context.getResources().getAssets();
        if (assets == null || TextUtils.isEmpty(str)) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf("/");
        str2 = "";
        if (lastIndexOf != -1) {
            str2 = lastIndexOf != 0 ? str.substring(0, lastIndexOf) : "";
            str = str.substring(lastIndexOf + 1);
        }
        try {
            list = assets.list(str2);
        } catch (IOException e8) {
            ZLogger.w(e8.toString());
        }
        if (list != null && list.length > 0) {
            for (String str3 : list) {
                if (str.equals(str3)) {
                    ZLogger.v("\t =" + str3);
                    return true;
                }
                ZLogger.v("\t =" + str3);
            }
            ZLogger.v(String.format("not find asset file: <%s>/<%s>", str2, str));
            return false;
        }
        ZLogger.d(String.format("no asset file found: <%s>/<%s>", str2, str));
        return false;
    }

    public static String convertVersion2Str(int i8, long j8, int i9) {
        if (i8 <= 0) {
            return String.valueOf(j8);
        }
        if (i9 == 1) {
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf(j8 & 255), Long.valueOf((j8 >> 8) & 255), Long.valueOf((j8 >> 16) & 255), Long.valueOf(255 & (j8 >> 24)));
        }
        if (i9 == 2) {
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((j8 >> 24) & 255), Long.valueOf((j8 >> 16) & 255), Long.valueOf((j8 >> 8) & 255), Long.valueOf(j8 & 255));
        }
        if (i9 == 3) {
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf(j8 & 15), Long.valueOf((j8 >> 4) & 255), Long.valueOf((j8 >> 12) & 32767), Long.valueOf((j8 >> 27) & 31));
        }
        if (i9 == 5) {
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf(j8 & 15), Long.valueOf((j8 >> 4) & 255), Long.valueOf((j8 >> 12) & 511), Long.valueOf((j8 >> 21) & 2047));
        }
        if (i9 == 515) {
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((j8 >> 24) & 255), Long.valueOf((j8 >> 16) & 255), Long.valueOf((j8 >> 8) & 255), Long.valueOf(j8 & 255));
        }
        if (i9 != 4 && i9 != 7 && i9 == 514) {
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((j8 >> 8) & 255), Long.valueOf(j8 & 255), Long.valueOf((j8 >> 24) & 255), Long.valueOf(255 & (j8 >> 16)));
        }
        return String.valueOf(j8);
    }
}
