package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public interface zzmn {
    static boolean zzaa(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    String zzS();

    int zza();

    int zzab(zzv zzvVar) throws zziw;

    int zzu() throws zziw;

    default void zzv(zzmm zzmmVar) {
    }

    default void zzw() {
    }
}
