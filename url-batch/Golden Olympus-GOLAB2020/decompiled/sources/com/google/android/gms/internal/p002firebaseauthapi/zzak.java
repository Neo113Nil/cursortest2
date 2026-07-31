package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public class zzak<E> {
    zzak() {
    }

    static int zza(int i4, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i5 <= i4) {
            return i4;
        }
        int i6 = i4 + (i4 >> 1) + 1;
        if (i6 < i5) {
            i6 = Integer.highestOneBit(i5 - 1) << 1;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }
}
