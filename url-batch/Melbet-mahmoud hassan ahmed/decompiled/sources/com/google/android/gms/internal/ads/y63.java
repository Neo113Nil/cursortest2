package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class y63<E> {
    y63() {
    }

    static int b(int i7, int i8) {
        int i9 = i7 + (i7 >> 1) + 1;
        if (i9 < i8) {
            int highestOneBit = Integer.highestOneBit(i8 - 1);
            i9 = highestOneBit + highestOneBit;
        }
        if (i9 < 0) {
            return Integer.MAX_VALUE;
        }
        return i9;
    }

    public abstract y63<E> a(E e7);
}
