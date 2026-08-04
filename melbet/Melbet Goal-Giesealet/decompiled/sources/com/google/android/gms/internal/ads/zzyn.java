package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzyn {
    public final int zza;
    public final zzlo[] zzb;
    public final zzyf[] zzc;
    public final zzbm zzd;
    public final Object zze;

    public zzyn(zzlo[] zzloVarArr, zzyf[] zzyfVarArr, zzbm zzbmVar, Object obj) {
        int length = zzloVarArr.length;
        zzghc.zza(length == zzyfVarArr.length);
        this.zzb = zzloVarArr;
        this.zzc = (zzyf[]) zzyfVarArr.clone();
        this.zzd = zzbmVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i) {
        return this.zzb[i] != null;
    }

    public final boolean zzb(zzyn zzynVar, int i) {
        return zzynVar != null && Objects.equals(this.zzb[i], zzynVar.zzb[i]) && Objects.equals(this.zzc[i], zzynVar.zzc[i]);
    }
}
