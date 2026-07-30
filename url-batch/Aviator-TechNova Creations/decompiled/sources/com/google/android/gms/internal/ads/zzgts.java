package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public abstract class zzgts {
    private static final zzgts zza = new zzgtq();
    private static final zzgts zzb = new zzgtr(-1);
    private static final zzgts zzc = new zzgtr(1);

    /* synthetic */ zzgts(byte[] bArr) {
    }

    public static zzgts zzg() {
        return zza;
    }

    public abstract zzgts zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgts zzb(int i, int i2);

    public abstract zzgts zzc(boolean z, boolean z2);

    public abstract zzgts zzd(boolean z, boolean z2);

    public abstract int zze();
}
