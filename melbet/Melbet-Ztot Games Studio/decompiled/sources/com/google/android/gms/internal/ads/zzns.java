package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzns {
    final /* synthetic */ zznt zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzui zze;
    private boolean zzf;
    private boolean zzg;

    public zzns(zznt zzntVar, String str, int i, zzui zzuiVar) {
        this.zza = zzntVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzuiVar == null ? -1L : zzuiVar.zzd;
        if (zzuiVar == null || !zzuiVar.zzb()) {
            return;
        }
        this.zze = zzuiVar;
    }

    public final void zzg(int i, zzui zzuiVar) {
        long zzl;
        if (this.zzd == -1 && i == this.zzc && zzuiVar != null) {
            zznt zzntVar = this.zza;
            long j = zzuiVar.zzd;
            zzl = zzntVar.zzl();
            if (j >= zzl) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzui zzuiVar) {
        if (zzuiVar == null) {
            return i == this.zzc;
        }
        zzui zzuiVar2 = this.zze;
        return zzuiVar2 == null ? !zzuiVar.zzb() && zzuiVar.zzd == this.zzd : zzuiVar.zzd == zzuiVar2.zzd && zzuiVar.zzb == zzuiVar2.zzb && zzuiVar.zzc == zzuiVar2.zzc;
    }

    public final boolean zzk(zzlo zzloVar) {
        zzui zzuiVar = zzloVar.zzd;
        if (zzuiVar == null) {
            return this.zzc != zzloVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzuiVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcc zzccVar = zzloVar.zzb;
        int zza = zzccVar.zza(zzuiVar.zza);
        int zza2 = zzccVar.zza(this.zze.zza);
        zzui zzuiVar2 = zzloVar.zzd;
        if (zzuiVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (!zzuiVar2.zzb()) {
            int i = zzloVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzui zzuiVar3 = zzloVar.zzd;
        int i2 = zzuiVar3.zzb;
        int i3 = zzuiVar3.zzc;
        zzui zzuiVar4 = this.zze;
        int i4 = zzuiVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzuiVar4.zzc;
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
    public final boolean zzl(zzcc zzccVar, zzcc zzccVar2) {
        zzcb zzcbVar;
        zzcb zzcbVar2;
        zzcb zzcbVar3;
        zzca zzcaVar;
        int i = this.zzc;
        if (i < zzccVar.zzc()) {
            zzcbVar = this.zza.zzc;
            zzccVar.zze(i, zzcbVar, 0L);
            zzcbVar2 = this.zza.zzc;
            for (int i2 = zzcbVar2.zzn; i2 <= zzcbVar3.zzo; i2++) {
                int zza = zzccVar2.zza(zzccVar.zzf(i2));
                if (zza != -1) {
                    zzcaVar = this.zza.zzd;
                    i = zzccVar2.zzd(zza, zzcaVar, false).zzc;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzui zzuiVar = this.zze;
        return zzuiVar == null || zzccVar2.zza(zzuiVar.zza) != -1;
    }
}
