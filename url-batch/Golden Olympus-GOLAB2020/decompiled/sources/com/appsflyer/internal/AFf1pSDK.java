package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class AFf1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int getCurrencyIso4217Code = 1;
    private static int[] getMediationNetwork;

    static {
        getMediationNetwork();
        ViewConfiguration.getLongPressTimeout();
        int i4 = getCurrencyIso4217Code + 3;
        AFAdRevenueData = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    private static String AFAdRevenueData(String str, String str2, String str3, String str4, String str5) {
        String revenue;
        int i4 = AFAdRevenueData + 85;
        getCurrencyIso4217Code = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i4 % 2 == 0) {
            String[] strArr = new String[2];
            strArr[0] = str2;
            strArr[1] = str3;
            strArr[5] = str4;
            strArr[5] = str5;
            strArr[4] = "";
            revenue = AFj1cSDK.getRevenue(TextUtils.join("\u2063", strArr), str);
            if (revenue.length() < 63) {
                return revenue;
            }
        } else {
            revenue = AFj1cSDK.getRevenue(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
            if (revenue.length() < 12) {
                return revenue;
            }
        }
        String substring = revenue.substring(0, 12);
        int i5 = AFAdRevenueData + 47;
        getCurrencyIso4217Code = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i5 % 2 != 0) {
            return substring;
        }
        throw null;
    }

    private static void a(int[] iArr, int i4, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getMediationNetwork;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            $10 = ($11 + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 39;
                $11 = i6 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i6 % 2 == 0) {
                    iArr3[i5] = (int) (iArr2[i5] * 3670241895213185600L);
                    i5 %= 1;
                } else {
                    iArr3[i5] = (int) (iArr2[i5] ^ 3670241895213185600L);
                    i5++;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getMediationNetwork;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                $11 = ($10 + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
                iArr6[i7] = (int) (iArr5[i7] ^ 3670241895213185600L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i8 = aFk1kSDK.getCurrencyIso4217Code;
            if (i8 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i4);
                return;
            }
            $11 = ($10 + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
            int i9 = iArr[i8];
            char c4 = (char) (i9 >> 16);
            cArr[0] = c4;
            char c5 = (char) i9;
            cArr[1] = c5;
            char c6 = (char) (iArr[i8 + 1] >> 16);
            cArr[2] = c6;
            char c7 = (char) iArr[i8 + 1];
            cArr[3] = c7;
            aFk1kSDK.AFAdRevenueData = (c4 << 16) + c5;
            aFk1kSDK.getMonetizationNetwork = (c6 << 16) + c7;
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i10 = 0; i10 < 16; i10++) {
                $10 = ($11 + 9) % UserVerificationMethods.USER_VERIFY_PATTERN;
                int i11 = aFk1kSDK.AFAdRevenueData ^ iArr4[i10];
                aFk1kSDK.AFAdRevenueData = i11;
                int AFAdRevenueData2 = AFk1kSDK.AFAdRevenueData(i11) ^ aFk1kSDK.getMonetizationNetwork;
                int i12 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = AFAdRevenueData2;
                aFk1kSDK.getMonetizationNetwork = i12;
            }
            int i13 = aFk1kSDK.AFAdRevenueData;
            int i14 = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.AFAdRevenueData = i14;
            aFk1kSDK.getMonetizationNetwork = i13;
            int i15 = i13 ^ iArr4[16];
            aFk1kSDK.getMonetizationNetwork = i15;
            int i16 = i14 ^ iArr4[17];
            aFk1kSDK.AFAdRevenueData = i16;
            cArr[0] = (char) (i16 >>> 16);
            cArr[1] = (char) i16;
            cArr[2] = (char) (i15 >>> 16);
            cArr[3] = (char) i15;
            AFk1kSDK.getMediationNetwork(iArr4);
            int i17 = aFk1kSDK.getCurrencyIso4217Code;
            cArr2[i17 * 2] = cArr[0];
            cArr2[(i17 * 2) + 1] = cArr[1];
            cArr2[(i17 * 2) + 2] = cArr[2];
            cArr2[(i17 * 2) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code = i17 + 2;
        }
    }

    private static AFi1uSDK getMediationNetwork(AFi1wSDK aFi1wSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFi1uSDK(aFi1wSDK.AFAdRevenueData == AFh1aSDK.DEFAULT, AFi1ySDK.NA);
        }
        Object[] objArr = new Object[1];
        a(new int[]{-643013363, -1773125790, -901337036, 656549561, -1731661770, 1258424067, -1532942264, 934407696, -1450123275, -1059473533, 82834636, 73705576, -1221507016, 1763733418, -1711569501, 1840946075, -1493249449, -1523654642, 594617170, -836811800, 1195240337, 1166309858, 1004762227, 96245697, 395058159, 64877192, 56299164, -104828535, -4786395, 2101942765, -285338731, 1554123850}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 64, objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1wSDK.AFAdRevenueData == AFh1aSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = AFAdRevenueData(new StringBuilder(str3).reverse().toString(), aFi1wSDK.getCurrencyIso4217Code, "android", "v1", str4).equals(str);
        return new AFi1uSDK(equals, equals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r6 = 27 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r8 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        com.appsflyer.internal.AFf1pSDK.getCurrencyIso4217Code = (r1 + 67) % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
        r5 = getMediationNetwork(r5, r6, r7, r8);
        r6 = com.appsflyer.internal.AFf1pSDK.getCurrencyIso4217Code + 51;
        com.appsflyer.internal.AFf1pSDK.AFAdRevenueData = r6 % com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        if ((r6 % 2) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFi1uSDK getRevenue(AFi1wSDK aFi1wSDK, String str, String str2, String str3) {
        if (aFi1wSDK != null) {
            int i4 = AFAdRevenueData;
            int i5 = i4 + 29;
            getCurrencyIso4217Code = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i5 % 2 == 0) {
                int i6 = 9 / 0;
            }
        }
        getCurrencyIso4217Code = (AFAdRevenueData + 21) % UserVerificationMethods.USER_VERIFY_PATTERN;
        return new AFi1uSDK(false, AFi1ySDK.INTERNAL_ERROR);
    }

    static void getMediationNetwork() {
        getMediationNetwork = new int[]{-1667361725, -1699441632, 432593808, 251732126, -1427520749, -699397331, 585070146, 1483439762, 1609066215, 453290560, -192666392, -1278453714, -213940739, 2102241028, -1309214613, 1294459639, 1092066826, -1216170440};
    }
}
