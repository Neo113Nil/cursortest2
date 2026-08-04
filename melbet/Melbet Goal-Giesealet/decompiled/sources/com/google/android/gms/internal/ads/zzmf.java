package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzmf {
    private final zzr zza;
    private final SparseArray zzb;

    public zzmf(zzr zzrVar, SparseArray sparseArray) {
        this.zza = zzrVar;
        SparseArray sparseArray2 = new SparseArray(zzrVar.zzb());
        for (int i = 0; i < zzrVar.zzb(); i++) {
            int zzc = zzrVar.zzc(i);
            zzme zzmeVar = (zzme) sparseArray.get(zzc);
            zzmeVar.getClass();
            sparseArray2.append(zzc, zzmeVar);
        }
        this.zzb = sparseArray2;
    }

    public final zzme zza(int i) {
        zzme zzmeVar = (zzme) this.zzb.get(i);
        zzmeVar.getClass();
        return zzmeVar;
    }

    public final boolean zzb(int i) {
        return this.zza.zza(i);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i) {
        return this.zza.zzc(i);
    }
}
