package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1403Ze {
    public static String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (XX.A02 * 200.0f);
    public static final int A03 = (int) (XX.A02 * 200.0f);
    public static final int A02 = (int) (XX.A02 * 50.0f);

    public static NF A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return NF.A04;
        }
        if (A03(nativeAdLayout)) {
            return NF.A05;
        }
        return NF.A03;
    }

    public static AbstractC1402Zd A01(C1839gi c1839gi, VA va, String str, View view) {
        if (view == null) {
            return null;
        }
        int w9 = view.getWidth();
        int height = view.getHeight();
        if (w9 >= A01 && height >= A01) {
            return new MC(c1839gi, va, str);
        }
        if (w9 >= A03) {
            int i = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i) {
                return new MD(c1839gi, va, str);
            }
        }
        return null;
    }

    public static ME A02(C1839gi c1839gi, VA va, String str, C1109Nm c1109Nm, InterfaceC1381Yi interfaceC1381Yi, InterfaceC1380Yh interfaceC1380Yh) {
        return new ME(c1839gi, va, str, c1109Nm, interfaceC1381Yi, interfaceC1380Yh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r4 < r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w9 = A01;
        if (width >= w9) {
            int w10 = A01;
        }
        int i = A03;
        String[] strArr = A00;
        String str = strArr[1];
        String str2 = strArr[0];
        int h9 = str.length();
        int w11 = str2.length();
        if (h9 != w11) {
            throw new RuntimeException();
        }
        String[] strArr2 = A00;
        strArr2[1] = "e";
        strArr2[0] = "I";
        if (width >= i) {
            int w12 = A02;
            if (height >= w12) {
                return false;
            }
        }
        return true;
    }
}
