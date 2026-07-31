package com.unity3d.player;

import com.unity3d.player.a.AbstractC0122o;

/* loaded from: classes2.dex */
abstract class SoftInputProvider {
    private static final native int nativeGetSoftInputType();

    public static int a() {
        int nativeGetSoftInputType = nativeGetSoftInputType();
        int[] b = AbstractC0122o.b(3);
        int length = b.length;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= length) {
                return 1;
            }
            int i3 = b[i];
            if (i3 == 1) {
                i2 = -1;
            } else if (i3 == 2) {
                i2 = 0;
            } else if (i3 != 3) {
                throw null;
            }
            if (i2 == nativeGetSoftInputType) {
                return i3;
            }
            i++;
        }
    }
}
