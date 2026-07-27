package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class AFg1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFInAppEventParameterName = null;
    private static int AFKeystoreWrapper = 1;
    private static int values;

    static {
        values();
        View.combineMeasuredStates(0, 0);
        int i2 = AFKeystoreWrapper + 95;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static AFh1dSDK AFInAppEventType(AFi1zSDK aFi1zSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFh1dSDK(aFi1zSDK.AFInAppEventType == AFh1iSDK.DEFAULT, AFh1bSDK.NA);
        }
        Object[] objArr = new Object[1];
        a(new int[]{155612361, -264507320, -480867464, 640943933, 125938683, -1285380429, -1310089634, -24116072, -1426973647, 61852708, -883492046, 633032705, -461693357, -1167246624, -991432257, -903948349, 112336305, 226747336, 1063402250, -701101021, 1164970240, -2019838721, -1456121518, -1109521690, -591345139, 1400474182, -20382683, 1268870639, -616322629, -1950372554, 1580005321, -26712274}, 64 - View.combineMeasuredStates(0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1zSDK.AFInAppEventType == AFh1iSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = AFKeystoreWrapper(new StringBuilder(str3).reverse().toString(), aFi1zSDK.values, "android", "v1", str4).equals(str);
        return new AFh1dSDK(equals, equals ? AFh1bSDK.SUCCESS : AFh1bSDK.FAILURE);
    }

    private static String AFKeystoreWrapper(String str, String str2, String str3, String str4, String str5) {
        values = (AFKeystoreWrapper + 23) % 128;
        String AFKeystoreWrapper2 = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (AFKeystoreWrapper2.length() >= 12) {
            return AFKeystoreWrapper2.substring(0, 12);
        }
        int i2 = values + 123;
        AFKeystoreWrapper = i2 % 128;
        if (i2 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) {
        int length;
        int[] iArr2;
        int i4;
        AFj1iSDK aFj1iSDK = new AFj1iSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AFInAppEventParameterName;
        if (iArr3 != null) {
            $11 = ($10 + 59) % 128;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                $10 = ($11 + 81) % 128;
                iArr4[i5] = (int) (iArr3[i5] ^ (-7136628868752028300L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AFInAppEventParameterName;
        if (iArr6 != null) {
            int i6 = $10 + 89;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i4 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i4 = 0;
            }
            while (i4 < length) {
                iArr2[i4] = (int) (iArr6[i4] ^ (-7136628868752028300L));
                i4++;
                length = length;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFj1iSDK.values = 0;
        while (true) {
            int i7 = aFj1iSDK.values;
            if (i7 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i2);
                return;
            }
            int i8 = iArr[i7];
            char c4 = (char) (i8 >> 16);
            cArr[0] = c4;
            char c5 = (char) i8;
            cArr[1] = c5;
            char c6 = (char) (iArr[i7 + 1] >> 16);
            cArr[2] = c6;
            char c7 = (char) iArr[i7 + 1];
            cArr[3] = c7;
            aFj1iSDK.AFInAppEventParameterName = (c4 << 16) + c5;
            aFj1iSDK.AFKeystoreWrapper = (c6 << 16) + c7;
            AFj1iSDK.valueOf(iArr5);
            for (int i9 = 0; i9 < 16; i9++) {
                int i10 = aFj1iSDK.AFInAppEventParameterName ^ iArr5[i9];
                aFj1iSDK.AFInAppEventParameterName = i10;
                int values2 = AFj1iSDK.values(i10) ^ aFj1iSDK.AFKeystoreWrapper;
                int i11 = aFj1iSDK.AFInAppEventParameterName;
                aFj1iSDK.AFInAppEventParameterName = values2;
                aFj1iSDK.AFKeystoreWrapper = i11;
            }
            int i12 = aFj1iSDK.AFInAppEventParameterName;
            int i13 = aFj1iSDK.AFKeystoreWrapper;
            aFj1iSDK.AFInAppEventParameterName = i13;
            aFj1iSDK.AFKeystoreWrapper = i12;
            int i14 = i12 ^ iArr5[16];
            aFj1iSDK.AFKeystoreWrapper = i14;
            int i15 = i13 ^ iArr5[17];
            aFj1iSDK.AFInAppEventParameterName = i15;
            cArr[0] = (char) (i15 >>> 16);
            cArr[1] = (char) i15;
            cArr[2] = (char) (i14 >>> 16);
            cArr[3] = (char) i14;
            AFj1iSDK.valueOf(iArr5);
            int i16 = aFj1iSDK.values;
            cArr2[i16 * 2] = cArr[0];
            cArr2[(i16 * 2) + 1] = cArr[1];
            cArr2[(i16 * 2) + 2] = cArr[2];
            cArr2[(i16 * 2) + 3] = cArr[3];
            aFj1iSDK.values = i16 + 2;
        }
    }

    public static void values() {
        AFInAppEventParameterName = new int[]{1213806282, 1275305172, -814371242, -760648375, -213905805, -2014879378, 1244466732, -783583104, 268932788, 1857211705, 829810270, -537596973, -732745973, -1113432519, 703870563, 652249806, -382230026, -703903398};
    }

    public final AFh1dSDK valueOf(AFi1zSDK aFi1zSDK, String str, String str2, String str3) {
        int i2 = AFKeystoreWrapper;
        values = (i2 + 49) % 128;
        if (aFi1zSDK != null && str2 != null) {
            values = (i2 + 19) % 128;
            if (str3 != null) {
                return AFInAppEventType(aFi1zSDK, str, str2, str3);
            }
        }
        return new AFh1dSDK(false, AFh1bSDK.INTERNAL_ERROR);
    }
}
