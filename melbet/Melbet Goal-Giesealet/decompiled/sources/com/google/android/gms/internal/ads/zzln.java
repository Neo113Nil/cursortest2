package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public interface zzln {
    static boolean zzZ(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    String zzS();

    int zza();

    int zzaa(zzu zzuVar) throws zzhz;

    int zzu() throws zzhz;

    default void zzv(zzlm zzlmVar) {
    }

    default void zzw() {
    }
}
