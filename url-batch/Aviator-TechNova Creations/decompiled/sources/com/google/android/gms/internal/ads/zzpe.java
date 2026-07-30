package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzpe {
    final /* synthetic */ zzpf zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzwk zze;
    private boolean zzf;
    private boolean zzg;

    public zzpe(zzpf zzpfVar, String str, int i, zzwk zzwkVar) {
        Objects.requireNonNull(zzpfVar);
        this.zza = zzpfVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzwkVar == null ? -1L : zzwkVar.zzd;
        if (zzwkVar == null || !zzwkVar.zzb()) {
            return;
        }
        this.zze = zzwkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r9.zza()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i = this.zzc;
        if (i < zzbfVar.zza()) {
            zzpf zzpfVar = this.zza;
            zzbfVar.zzb(i, zzpfVar.zzj(), 0L);
            for (int i2 = zzpfVar.zzj().zzn; i2 <= zzpfVar.zzj().zzo; i2++) {
                int zze = zzbfVar2.zze(zzbfVar.zzf(i2));
                if (zze != -1) {
                    i = zzbfVar2.zzd(zze, zzpfVar.zzk(), false).zzc;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzwk zzwkVar = this.zze;
        return zzwkVar == null || zzbfVar2.zze(zzwkVar.zza) != -1;
    }

    public final boolean zzb(int i, zzwk zzwkVar) {
        if (zzwkVar != null) {
            long j = zzwkVar.zzd;
            if (j != -1) {
                zzwk zzwkVar2 = this.zze;
                return zzwkVar2 == null ? !zzwkVar.zzb() && j == this.zzd : j == zzwkVar2.zzd && zzwkVar.zzb == zzwkVar2.zzb && zzwkVar.zzc == zzwkVar2.zzc;
            }
        }
        return i == this.zzc;
    }

    public final void zzc(int i, zzwk zzwkVar) {
        if (this.zzd == -1 && i == this.zzc && zzwkVar != null) {
            zzpf zzpfVar = this.zza;
            long j = zzwkVar.zzd;
            if (j >= zzpfVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(zzmy zzmyVar) {
        zzwk zzwkVar = zzmyVar.zzd;
        if (zzwkVar == null) {
            return this.zzc != zzmyVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzwkVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zzmyVar.zzb;
        int zze = zzbfVar.zze(zzwkVar.zza);
        int zze2 = zzbfVar.zze(this.zze.zza);
        zzwk zzwkVar2 = this.zze;
        if (j2 < zzwkVar2.zzd || zze < zze2) {
            return false;
        }
        if (zze > zze2) {
            return true;
        }
        if (!zzwkVar.zzb()) {
            int i = zzwkVar.zze;
            return i == -1 || i > zzwkVar2.zzb;
        }
        int i2 = zzwkVar.zzb;
        int i3 = zzwkVar.zzc;
        int i4 = zzwkVar2.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzwkVar2.zzc;
        }
        return true;
    }

    final /* synthetic */ String zze() {
        return this.zzb;
    }

    final /* synthetic */ int zzf() {
        return this.zzc;
    }

    final /* synthetic */ long zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzwk zzh() {
        return this.zze;
    }

    final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zzf = true;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzg = true;
    }
}
