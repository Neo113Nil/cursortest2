package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class w63 {
    static int a(int i7) {
        return (int) (Integer.rotateLeft((int) (i7 * (-862048943)), 15) * 461845907);
    }

    static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
