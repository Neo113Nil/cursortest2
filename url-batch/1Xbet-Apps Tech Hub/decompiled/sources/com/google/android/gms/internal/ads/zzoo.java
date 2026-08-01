package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzoo {
    final /* synthetic */ zzop zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzuk zze;
    private boolean zzf;
    private boolean zzg;

    public zzoo(zzop zzopVar, String str, int i, zzuk zzukVar) {
        this.zza = zzopVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzukVar == null ? -1L : zzukVar.zzd;
        if (zzukVar == null || !zzukVar.zzb()) {
            return;
        }
        this.zze = zzukVar;
    }

    public final void zzg(int i, zzuk zzukVar) {
        long zzl;
        if (this.zzd == -1 && i == this.zzc && zzukVar != null) {
            zzop zzopVar = this.zza;
            long j = zzukVar.zzd;
            zzl = zzopVar.zzl();
            if (j >= zzl) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzuk zzukVar) {
        if (zzukVar == null) {
            return i == this.zzc;
        }
        zzuk zzukVar2 = this.zze;
        return zzukVar2 == null ? !zzukVar.zzb() && zzukVar.zzd == this.zzd : zzukVar.zzd == zzukVar2.zzd && zzukVar.zzb == zzukVar2.zzb && zzukVar.zzc == zzukVar2.zzc;
    }

    public final boolean zzk(zzmk zzmkVar) {
        zzuk zzukVar = zzmkVar.zzd;
        if (zzukVar == null) {
            return this.zzc != zzmkVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzukVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzda zzdaVar = zzmkVar.zzb;
        int zza = zzdaVar.zza(zzukVar.zza);
        int zza2 = zzdaVar.zza(this.zze.zza);
        zzuk zzukVar2 = zzmkVar.zzd;
        if (zzukVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (!zzukVar2.zzb()) {
            int i = zzmkVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzuk zzukVar3 = zzmkVar.zzd;
        int i2 = zzukVar3.zzb;
        int i3 = zzukVar3.zzc;
        zzuk zzukVar4 = this.zze;
        int i4 = zzukVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzukVar4.zzc;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.zzc()) goto L15;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x002e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(zzda zzdaVar, zzda zzdaVar2) {
        zzcz zzczVar;
        zzcz zzczVar2;
        zzcz zzczVar3;
        zzcx zzcxVar;
        int i = this.zzc;
        if (i < zzdaVar.zzc()) {
            zzczVar = this.zza.zzc;
            zzdaVar.zze(i, zzczVar, 0L);
            zzczVar2 = this.zza.zzc;
            for (int i2 = zzczVar2.zzp; i2 <= zzczVar3.zzq; i2++) {
                int zza = zzdaVar2.zza(zzdaVar.zzf(i2));
                if (zza != -1) {
                    zzcxVar = this.zza.zzd;
                    i = zzdaVar2.zzd(zza, zzcxVar, false).zzd;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzuk zzukVar = this.zze;
        return zzukVar == null || zzdaVar2.zza(zzukVar.zza) != -1;
    }
}
