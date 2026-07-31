package com.appsflyer.internal;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes3.dex */
public final class AFf1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static char AFInAppEventType = 0;
    private static long AFKeystoreWrapper = 0;
    private static int valueOf = 0;
    private static int values = 1;

    static {
        values();
        View.combineMeasuredStates(0, 0);
        Color.argb(0, 0, 0, 0);
        int i = AFInAppEventParameterName + 85;
        values = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void values() {
        valueOf = 1791665235;
        AFInAppEventType = (char) 8607;
        AFKeystoreWrapper = 329889696698770515L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r8 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r1 = r1 + 21;
        com.appsflyer.internal.AFf1fSDK.values = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        return AFInAppEventParameterName(r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r0 = r1 + 83;
        com.appsflyer.internal.AFf1fSDK.values = r0 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFh1nSDK AFInAppEventType(AFh1oSDK aFh1oSDK, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = values + 97;
        int i3 = i2 % 128;
        AFInAppEventParameterName = i3;
        if (i2 % 2 != 0) {
            int i4 = 83 / 0;
        }
        return new AFh1nSDK(false, AFh1kSDK.INTERNAL_ERROR);
    }

    private static AFh1nSDK AFInAppEventParameterName(AFh1oSDK aFh1oSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFh1nSDK(aFh1oSDK.values == AFh1vSDK.DEFAULT, AFh1kSDK.NA);
        }
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "穁쁄푋돛", View.getDefaultSize(0, 0), (char) Color.argb(0, 0, 0, 0), "妩ꦀ㖤䃎쪚嚅\uf0ec\uf80c磅虯讖외।놮\uf403劮蛰㧨\uf207⑈蠡졕ῳ袳쯂㡒遼ꤩ\udcad篽롱솧絈쌸슥跥\uf674⩜鑏乯û䥲罹咆윉型ｲ\u0ecf㎘櫨砫ﴜ蹁쎤፦뾽ꔋ拕婋椹\ue49c쬹⧏Ὃ", objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFh1oSDK.values != AFh1vSDK.CUSTOM) {
            str4 = "";
            str3 = intern;
        } else {
            str4 = new StringBuilder(str2).reverse().toString();
        }
        boolean equals = valueOf(new StringBuilder(str3).reverse().toString(), aFh1oSDK.AFInAppEventType, "android", "v1", str4).equals(str);
        return new AFh1nSDK(equals, equals ? AFh1kSDK.SUCCESS : AFh1kSDK.FAILURE);
    }

    private static String valueOf(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = values + 21;
        AFInAppEventParameterName = i2 % 128;
        int i3 = i2 % 2;
        String AFInAppEventParameterName2 = AFb1lSDK.AFInAppEventParameterName(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (AFInAppEventParameterName2.length() < 12) {
            int i4 = AFInAppEventParameterName + 35;
            values = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 37 / 0;
            }
            return AFInAppEventParameterName2;
        }
        return AFInAppEventParameterName2.substring(0, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, String str2, int i, char c, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2 = 2 % 2;
        if (str3 != 0) {
            int i3 = $11 + 91;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                str3.toCharArray();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != null) {
            int i4 = $10 + 13;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFj1sSDK aFj1sSDK = new AFj1sSDK();
        int length = cArr4.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr4, 0, cArr5, 0, length);
        System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        aFj1sSDK.valueOf = 0;
        while (aFj1sSDK.valueOf < length3) {
            int i6 = $10 + 7;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = (aFj1sSDK.valueOf + 2) % 4;
            int i9 = (aFj1sSDK.valueOf + 3) % 4;
            aFj1sSDK.AFInAppEventType = (char) (((cArr5[aFj1sSDK.valueOf % 4] * 32718) + cArr6[i8]) % 65535);
            cArr6[i9] = (char) (((cArr5[i9] * 32718) + cArr6[i8]) / 65535);
            cArr5[i9] = aFj1sSDK.AFInAppEventType;
            cArr7[aFj1sSDK.valueOf] = (char) ((((cArr5[i9] ^ cArr3[aFj1sSDK.valueOf]) ^ (AFKeystoreWrapper ^ 329889696698770515L)) ^ ((int) (valueOf ^ 329889696698770515L))) ^ ((char) (AFInAppEventType ^ 329889696698770515L)));
            aFj1sSDK.valueOf++;
            int i10 = $11 + 1;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr7);
    }
}
