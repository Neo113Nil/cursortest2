package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzml {
    private final zzah zza;
    private final SparseArray zzb;

    public zzml(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i = 0; i < zzahVar.zzb(); i++) {
            int zza = zzahVar.zza(i);
            zzmk zzmkVar = (zzmk) sparseArray.get(zza);
            zzmkVar.getClass();
            sparseArray2.append(zza, zzmkVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzmk zzc(int i) {
        zzmk zzmkVar = (zzmk) this.zzb.get(i);
        zzmkVar.getClass();
        return zzmkVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
