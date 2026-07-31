package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;

/* loaded from: classes.dex */
public final class AFf1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int component2 = 1;
    private static char[] getCurrencyIso4217Code;
    private static int getMediationNetwork;
    private static boolean getMonetizationNetwork;
    private static boolean getRevenue;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
    
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return getCurrencyIso4217Code(r5, r6, r7, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFi1sSDK getRevenue(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        int i = 2 % 2;
        if (aFi1vSDK != null) {
            int i2 = AFAdRevenueData + 111;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 89 / 0;
            }
        }
        int i4 = AFAdRevenueData + 17;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return new AFi1sSDK(false, AFi1ySDK.INTERNAL_ERROR);
    }

    private static AFi1sSDK getCurrencyIso4217Code(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFi1sSDK(aFi1vSDK.getRevenue == AFh1dSDK.DEFAULT, AFi1ySDK.NA);
        }
        Object[] objArr = new Object[1];
        a("\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081", null, null, 127 - View.resolveSizeAndState(0, 0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1vSDK.getRevenue != AFh1dSDK.CUSTOM) {
            str4 = "";
            str3 = intern;
        } else {
            str4 = new StringBuilder(str2).reverse().toString();
        }
        boolean equals = getMonetizationNetwork(new StringBuilder(str3).reverse().toString(), aFi1vSDK.getMediationNetwork, "android", "v1", str4).equals(str);
        return new AFi1sSDK(equals, equals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    private static String getMonetizationNetwork(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        String monetizationNetwork = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (monetizationNetwork.length() >= 12) {
            return monetizationNetwork.substring(0, 12);
        }
        int i2 = AFAdRevenueData + 113;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        AFAdRevenueData = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return monetizationNetwork;
    }

    private static void a(String str, int[] iArr, String str2, int i, Object[] objArr) {
        int i2 = 2 % 2;
        char[] cArr = str2;
        if (str2 != null) {
            int i3 = $10 + 75;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr3 = getCurrencyIso4217Code;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr4[i5] = (char) (cArr3[i5] ^ 1825820251896122634L);
            }
            cArr3 = cArr4;
        }
        int i6 = (int) (1825820251896122634L ^ getMediationNetwork);
        if (getRevenue) {
            int i7 = $11 + 3;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            aFk1oSDK.getMonetizationNetwork = bArr2.length;
            char[] cArr5 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr5[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[bArr2[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] + i] - i6);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (getMonetizationNetwork) {
            aFk1oSDK.getMonetizationNetwork = cArr2.length;
            char[] cArr6 = new char[aFk1oSDK.getMonetizationNetwork];
            aFk1oSDK.AFAdRevenueData = 0;
            while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
                cArr6[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[cArr2[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i] - i6);
                aFk1oSDK.AFAdRevenueData++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        aFk1oSDK.getMonetizationNetwork = iArr.length;
        char[] cArr7 = new char[aFk1oSDK.getMonetizationNetwork];
        aFk1oSDK.AFAdRevenueData = 0;
        while (aFk1oSDK.AFAdRevenueData < aFk1oSDK.getMonetizationNetwork) {
            int i9 = $11 + 81;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr7[aFk1oSDK.AFAdRevenueData] = (char) (cArr3[iArr[(aFk1oSDK.getMonetizationNetwork - 1) - aFk1oSDK.AFAdRevenueData] - i] - i6);
            aFk1oSDK.AFAdRevenueData++;
        }
        String str3 = new String(cArr7);
        int i11 = $11 + 41;
        $10 = i11 % 128;
        if (i11 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str3;
    }

    static void getMediationNetwork() {
        getCurrencyIso4217Code = new char[]{36169, 36173, 36172, 36163, 36168, 36174, 36175, 36162, 36170, 36190, 36171, 36187, 36191};
        getMediationNetwork = 1912311066;
        getMonetizationNetwork = true;
        getRevenue = true;
    }

    static {
        getMediationNetwork();
        ExpandableListView.getPackedPositionChild(0L);
        int i = component2 + 25;
        AFAdRevenueData = i % 128;
        int i2 = i % 2;
    }
}
