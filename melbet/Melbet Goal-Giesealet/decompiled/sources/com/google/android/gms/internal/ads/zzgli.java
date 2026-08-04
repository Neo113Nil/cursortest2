package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgli {
    static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zzb(objArr[i2], i2);
        }
        return objArr;
    }

    static Object zzb(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 9);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
