package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFf1qSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFAdRevenueData = null;
    private static int getCurrencyIso4217Code = 0;
    private static int getMediationNetwork = 1;

    static {
        getMonetizationNetwork();
        ViewConfiguration.getScrollBarSize();
        getCurrencyIso4217Code = (getMediationNetwork + 85) % 128;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2;
        int length;
        int[] iArr2;
        long j;
        AFk1iSDK aFk1iSDK = new AFk1iSDK();
        char[] cArr = new char[4];
        char c = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AFAdRevenueData;
        long j2 = -6133639485864768852L;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                iArr4[i3] = (int) (iArr3[i3] ^ (-6133639485864768852L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AFAdRevenueData;
        if (iArr6 != null) {
            int i4 = $10 + 113;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 17;
                char c2 = c;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    j = j2;
                    iArr2[i5] = (int) (iArr6[i5] & j);
                    i5--;
                } else {
                    j = j2;
                    iArr2[i5] = (int) (iArr6[i5] ^ j);
                    i5++;
                }
                c = c2;
                j2 = j;
            }
            iArr6 = iArr2;
        }
        char c3 = c;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        aFk1iSDK.getRevenue = 0;
        while (true) {
            int i7 = aFk1iSDK.getRevenue;
            if (i7 >= iArr.length) {
                break;
            }
            $10 = ($11 + 71) % 128;
            int i8 = iArr[i7];
            char c4 = (char) (i8 >> 16);
            cArr[0] = c4;
            char c5 = (char) i8;
            cArr[1] = c5;
            char c6 = (char) (iArr[i7 + 1] >> 16);
            cArr[c3] = c6;
            char c7 = (char) iArr[i7 + 1];
            cArr[3] = c7;
            aFk1iSDK.getMediationNetwork = (c4 << 16) + c5;
            aFk1iSDK.getMonetizationNetwork = (c6 << 16) + c7;
            AFk1iSDK.getMonetizationNetwork(iArr5);
            int i9 = 0;
            while (true) {
                i2 = aFk1iSDK.getMediationNetwork;
                if (i9 < 16) {
                    int i10 = i2 ^ iArr5[i9];
                    aFk1iSDK.getMediationNetwork = i10;
                    int mediationNetwork = AFk1iSDK.getMediationNetwork(i10) ^ aFk1iSDK.getMonetizationNetwork;
                    int i11 = aFk1iSDK.getMediationNetwork;
                    aFk1iSDK.getMediationNetwork = mediationNetwork;
                    aFk1iSDK.getMonetizationNetwork = i11;
                    i9++;
                    $10 = ($11 + 99) % 128;
                }
            }
            int i12 = aFk1iSDK.getMonetizationNetwork;
            aFk1iSDK.getMediationNetwork = i12;
            aFk1iSDK.getMonetizationNetwork = i2;
            int i13 = i2 ^ iArr5[16];
            aFk1iSDK.getMonetizationNetwork = i13;
            int i14 = i12 ^ iArr5[17];
            aFk1iSDK.getMediationNetwork = i14;
            cArr[0] = (char) (i14 >>> 16);
            cArr[1] = (char) i14;
            cArr[c3] = (char) (i13 >>> 16);
            cArr[3] = (char) i13;
            AFk1iSDK.getMonetizationNetwork(iArr5);
            int i15 = aFk1iSDK.getRevenue;
            cArr2[i15 * 2] = cArr[0];
            cArr2[(i15 * 2) + 1] = cArr[1];
            cArr2[(i15 * 2) + 2] = cArr[c3];
            cArr2[(i15 * 2) + 3] = cArr[3];
            aFk1iSDK.getRevenue = i15 + 2;
        }
        String str = new String(cArr2, 0, i);
        int i16 = $10 + 77;
        $11 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static void getMonetizationNetwork() {
        AFAdRevenueData = new int[]{-1535469978, -1012770009, 2079423438, -537713690, 188517261, 1637329726, 59481190, 913702862, 1690527878, -1038801859, 344452007, 1683103388, -581075556, -2036279421, 21770861, 2114604264, 1603244918, -208521163};
    }

    private static AFi1uSDK getRevenue(AFh1cSDK aFh1cSDK, String str, String str2, String str3) {
        if (str == null) {
            return new AFi1uSDK(aFh1cSDK.getCurrencyIso4217Code == AFh1gSDK.DEFAULT, AFi1ySDK.NA);
        }
        String str4 = "";
        Object[] objArr = new Object[1];
        a(new int[]{-1737175898, -1382589389, 713661469, -1134961719, -1969930269, 10614183, -828674959, -651693320, -1587602342, 405839388, 1857785845, -2125720599, -1949544352, -324845223, 902164262, 728372842, -1289227633, 161661437, 51240894, -1224567390, -2031796534, -1352392266, 1905647512, -1637846901, 1233763875, 492265299, -1206355691, 1997345169, 575501648, -182399273, 1663091008, 1388920687}, KeyEvent.keyCodeFromString("") + 64, objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFh1cSDK.getCurrencyIso4217Code == AFh1gSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = intern;
        }
        boolean equals = getRevenue(new StringBuilder(str3).reverse().toString(), aFh1cSDK.getRevenue, "android", "v1", str4).equals(str);
        return new AFi1uSDK(equals, equals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    public final AFi1uSDK getMonetizationNetwork(AFh1cSDK aFh1cSDK, String str, String str2, String str3) {
        int i = getMediationNetwork;
        int i2 = i + 119;
        getCurrencyIso4217Code = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (aFh1cSDK == null || str2 == null || str3 == null) {
            return new AFi1uSDK(false, AFi1ySDK.INTERNAL_ERROR);
        }
        getCurrencyIso4217Code = (i + 85) % 128;
        return getRevenue(aFh1cSDK, str, str2, str3);
    }

    private static String getRevenue(String str, String str2, String str3, String str4, String str5) {
        getMediationNetwork = (getCurrencyIso4217Code + 83) % 128;
        String currencyIso4217Code = AFj1jSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (currencyIso4217Code.length() >= 12) {
            return currencyIso4217Code.substring(0, 12);
        }
        getMediationNetwork = (getCurrencyIso4217Code + 95) % 128;
        return currencyIso4217Code;
    }
}
