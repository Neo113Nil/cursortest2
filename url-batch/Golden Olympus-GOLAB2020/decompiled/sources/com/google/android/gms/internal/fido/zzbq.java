package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
public final class zzbq {
    static Object zza(Object obj, int i4) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i4);
    }

    static Object[] zzb(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            zza(objArr[i5], i5);
        }
        return objArr;
    }
}
