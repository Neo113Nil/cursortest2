package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes3.dex */
public final class AFg1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFInAppEventParameterName = null;
    private static int AFKeystoreWrapper = 1;
    private static int values;

    static {
        values();
        View.combineMeasuredStates(0, 0);
        int i = AFKeystoreWrapper + 95;
        values = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void values() {
        AFInAppEventParameterName = new int[]{1213806282, 1275305172, -814371242, -760648375, -213905805, -2014879378, 1244466732, -783583104, 268932788, 1857211705, 829810270, -537596973, -732745973, -1113432519, 703870563, 652249806, -382230026, -703903398};
    }

    public final AFh1dSDK valueOf(AFi1zSDK aFi1zSDK, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper;
        int i3 = i2 + 49;
        values = i3 % 128;
        int i4 = i3 % 2;
        if (aFi1zSDK != null && str2 != null) {
            int i5 = i2 + 19;
            values = i5 % 128;
            int i6 = i5 % 2;
            if (str3 != null) {
                return AFInAppEventType(aFi1zSDK, str, str2, str3);
            }
        }
        return new AFh1dSDK(false, AFh1bSDK.INTERNAL_ERROR);
    }

    private static AFh1dSDK AFInAppEventType(AFi1zSDK aFi1zSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFh1dSDK(aFi1zSDK.AFInAppEventType == AFh1iSDK.DEFAULT, AFh1bSDK.NA);
        }
        Object[] objArr = new Object[1];
        a(new int[]{155612361, -264507320, -480867464, 640943933, 125938683, -1285380429, -1310089634, -24116072, -1426973647, 61852708, -883492046, 633032705, -461693357, -1167246624, -991432257, -903948349, 112336305, 226747336, 1063402250, -701101021, 1164970240, -2019838721, -1456121518, -1109521690, -591345139, 1400474182, -20382683, 1268870639, -616322629, -1950372554, 1580005321, -26712274}, 64 - View.combineMeasuredStates(0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1zSDK.AFInAppEventType != AFh1iSDK.CUSTOM) {
            str4 = "";
            str3 = intern;
        } else {
            str4 = new StringBuilder(str2).reverse().toString();
        }
        boolean equals = AFKeystoreWrapper(new StringBuilder(str3).reverse().toString(), aFi1zSDK.values, "android", "v1", str4).equals(str);
        return new AFh1dSDK(equals, equals ? AFh1bSDK.SUCCESS : AFh1bSDK.FAILURE);
    }

    private static String AFKeystoreWrapper(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = AFKeystoreWrapper + 23;
        values = i2 % 128;
        int i3 = i2 % 2;
        String AFKeystoreWrapper2 = AFb1lSDK.AFKeystoreWrapper(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (AFKeystoreWrapper2.length() >= 12) {
            return AFKeystoreWrapper2.substring(0, 12);
        }
        int i4 = values + 123;
        AFKeystoreWrapper = i4 % 128;
        if (i4 % 2 != 0) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        AFj1iSDK aFj1iSDK = new AFj1iSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AFInAppEventParameterName;
        if (iArr3 != null) {
            int i4 = $10 + 59;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                int i7 = $11 + 81;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                iArr4[i6] = (int) (iArr3[i6] ^ (-7136628868752028300L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AFInAppEventParameterName;
        if (iArr6 != null) {
            int i9 = $10 + 89;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (iArr6[i2] ^ (-7136628868752028300L));
                i2++;
                length = length;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFj1iSDK.values = 0;
        while (aFj1iSDK.values < iArr.length) {
            cArr[0] = (char) (iArr[aFj1iSDK.values] >> 16);
            cArr[1] = (char) iArr[aFj1iSDK.values];
            cArr[2] = (char) (iArr[aFj1iSDK.values + 1] >> 16);
            cArr[3] = (char) iArr[aFj1iSDK.values + 1];
            aFj1iSDK.AFInAppEventParameterName = (cArr[0] << 16) + cArr[1];
            aFj1iSDK.AFKeystoreWrapper = (cArr[2] << 16) + cArr[3];
            AFj1iSDK.valueOf(iArr5);
            for (int i10 = 0; i10 < 16; i10++) {
                aFj1iSDK.AFInAppEventParameterName ^= iArr5[i10];
                aFj1iSDK.AFKeystoreWrapper = AFj1iSDK.values(aFj1iSDK.AFInAppEventParameterName) ^ aFj1iSDK.AFKeystoreWrapper;
                int i11 = aFj1iSDK.AFInAppEventParameterName;
                aFj1iSDK.AFInAppEventParameterName = aFj1iSDK.AFKeystoreWrapper;
                aFj1iSDK.AFKeystoreWrapper = i11;
            }
            int i12 = aFj1iSDK.AFInAppEventParameterName;
            aFj1iSDK.AFInAppEventParameterName = aFj1iSDK.AFKeystoreWrapper;
            aFj1iSDK.AFKeystoreWrapper = i12;
            aFj1iSDK.AFKeystoreWrapper ^= iArr5[16];
            aFj1iSDK.AFInAppEventParameterName ^= iArr5[17];
            int i13 = aFj1iSDK.AFInAppEventParameterName;
            int i14 = aFj1iSDK.AFKeystoreWrapper;
            cArr[0] = (char) (aFj1iSDK.AFInAppEventParameterName >>> 16);
            cArr[1] = (char) aFj1iSDK.AFInAppEventParameterName;
            cArr[2] = (char) (aFj1iSDK.AFKeystoreWrapper >>> 16);
            cArr[3] = (char) aFj1iSDK.AFKeystoreWrapper;
            AFj1iSDK.valueOf(iArr5);
            cArr2[aFj1iSDK.values * 2] = cArr[0];
            cArr2[(aFj1iSDK.values * 2) + 1] = cArr[1];
            cArr2[(aFj1iSDK.values * 2) + 2] = cArr[2];
            cArr2[(aFj1iSDK.values * 2) + 3] = cArr[3];
            aFj1iSDK.values += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
