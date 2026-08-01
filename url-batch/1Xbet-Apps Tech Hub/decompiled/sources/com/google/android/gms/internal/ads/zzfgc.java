package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfgc {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfhb zzd = new zzfhb();

    public zzfgc(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    private final void zzi() {
        while (!this.zza.isEmpty()) {
            if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - ((zzfgm) this.zza.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzg();
            this.zza.remove();
        }
    }

    public final int zza() {
        return this.zzd.zza();
    }

    public final int zzb() {
        zzi();
        return this.zza.size();
    }

    public final long zzc() {
        return this.zzd.zzb();
    }

    public final long zzd() {
        return this.zzd.zzc();
    }

    public final zzfgm zze() {
        this.zzd.zzf();
        zzi();
        if (this.zza.isEmpty()) {
            return null;
        }
        zzfgm zzfgmVar = (zzfgm) this.zza.remove();
        if (zzfgmVar != null) {
            this.zzd.zzh();
        }
        return zzfgmVar;
    }

    public final zzfha zzf() {
        return this.zzd.zzd();
    }

    public final String zzg() {
        return this.zzd.zze();
    }

    public final boolean zzh(zzfgm zzfgmVar) {
        this.zzd.zzf();
        zzi();
        if (this.zza.size() == this.zzb) {
            return false;
        }
        this.zza.add(zzfgmVar);
        return true;
    }
}
