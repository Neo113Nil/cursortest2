package com.unity3d.player;

/* loaded from: classes2.dex */
abstract class SoftInputProvider {
    public static int a() {
        int nativeGetSoftInputType = nativeGetSoftInputType();
        int[] b4 = h1.E.b(4);
        int length = b4.length;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= length) {
                return 1;
            }
            int i6 = b4[i4];
            if (i6 == 1) {
                i5 = -1;
            } else if (i6 == 2) {
                i5 = 0;
            } else if (i6 != 3) {
                if (i6 != 4) {
                    throw null;
                }
                i5 = 2;
            }
            if (i5 == nativeGetSoftInputType) {
                return i6;
            }
            i4++;
        }
    }

    private static final native int nativeGetSoftInputType();
}
