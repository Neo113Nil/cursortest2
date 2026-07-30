package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzjd {
    static Object zza(@CheckForNull Object obj, int i8) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i8);
    }

    static Object[] zzb(Object[] objArr, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            zza(objArr[i9], i9);
        }
        return objArr;
    }
}
