package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzio {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public zzio(String str, zzv zzvVar, zzv zzvVar2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            i2 = i2 == 0 ? 0 : i2;
            zzgrc.zza(z);
            zzgrc.zza(true ^ TextUtils.isEmpty(str));
            this.zza = str;
            this.zzb = zzvVar;
            zzvVar2.getClass();
            this.zzc = zzvVar2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzgrc.zza(z);
        zzgrc.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzio zzioVar = (zzio) obj;
            if (this.zzd == zzioVar.zzd && this.zze == zzioVar.zze && this.zza.equals(zzioVar.zza) && this.zzb.equals(zzioVar.zzb) && this.zzc.equals(zzioVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
