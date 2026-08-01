package com.facebook.ads.redexgen.X;

import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class ZU<T> implements InterfaceC01942n<T> {
    public static byte[] A02;
    public static String[] A03 = {"pRcBA4OWefysSNzvRxIkpBVTVwfc3AVE", "RPn4qv0f1UarsEXGS1XogTnrbpEJEmnV", "xmsaI0t9E", "ZcBN", "DIlRoYRb", "oKMZSswBXiC", "UEhtJ1eDnORTZ2wzgc9obnj9WqOhgFHK", "4xQT2X5Ea9Pr"};
    public int A00;
    public final Object[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A03[5] = "P1E265Ge3cQ";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{44, 1, Ascii.US, 8, Ascii.FF, 9, Ascii.DC4, 77, 4, 3, 77, Ascii.EM, 5, 8, 77, Ascii.GS, 2, 2, 1, 76, 76, 112, 125, 56, 117, 121, 96, 56, 104, 119, 119, 116, 56, 107, 113, 98, 125, 56, 117, 109, 107, 108, 56, 122, 125, 56, 38, 56, 40};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZU != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public ZU(int i) {
        if (i > 0) {
            this.A01 = new Object[i];
            return;
        }
        throw new IllegalArgumentException(A00(20, 29, 114));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZU != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A02(T t) {
        for (int i = 0; i < i; i++) {
            Object obj = this.A01[i];
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[3];
            int length = str.length();
            int i2 = str2.length();
            if (length == i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[4] = "IsiBXNP8";
            strArr2[7] = "yZIlFrLQCuaZ";
            if (obj == t) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZU != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC01942n
    public T A2W() {
        int i = this.A00;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.A01;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.A00 = i - 1;
        return t;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ZU != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC01942n
    public boolean AER(T instance) {
        if (!A02(instance)) {
            int i = this.A00;
            Object[] objArr = this.A01;
            if (i < objArr.length) {
                objArr[i] = instance;
                this.A00 = i + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(A00(0, 20, 7));
    }
}
