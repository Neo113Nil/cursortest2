package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzajx implements zzajy {
    private final List zza;
    private final zzadk[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzajx(List list) {
        this.zza = list;
        this.zzb = new zzadk[list.size()];
    }

    private final boolean zzf(zzfj zzfjVar, int i) {
        if (zzfjVar.zza() == 0) {
            return false;
        }
        if (zzfjVar.zzl() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(zzfj zzfjVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzfjVar, 32)) {
                if (this.zzd != 1 || zzf(zzfjVar, 0)) {
                    int zzc = zzfjVar.zzc();
                    int zza = zzfjVar.zza();
                    for (zzadk zzadkVar : this.zzb) {
                        zzfjVar.zzG(zzc);
                        zzadkVar.zzr(zzfjVar, zza);
                    }
                    this.zze += zza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzalh zzalhVar = (zzalh) this.zza.get(i);
            zzalkVar.zzc();
            zzadk zzw = zzachVar.zzw(zzalkVar.zza(), 3);
            zzak zzakVar = new zzak();
            zzakVar.zzJ(zzalkVar.zzb());
            zzakVar.zzU("application/dvbsubs");
            zzakVar.zzK(Collections.singletonList(zzalhVar.zzb));
            zzakVar.zzM(zzalhVar.zza);
            zzw.zzl(zzakVar.zzac());
            this.zzb[i] = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzadk zzadkVar : this.zzb) {
                    zzadkVar.zzt(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzf = j;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
