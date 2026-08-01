package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzadg implements zzace {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzach zzf;
    private zzadk zzg;

    public zzadg(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzadk zzadkVar = this.zzg;
        zzadkVar.getClass();
        int zza = zzadi.zza(zzadkVar, zzacfVar, 1024, true);
        if (zza == -1) {
            this.zze = 2;
            this.zzg.zzt(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzf = zzachVar;
        zzadk zzw = zzachVar.zzw(1024, 4);
        this.zzg = zzw;
        zzak zzakVar = new zzak();
        zzakVar.zzB(this.zzc);
        zzakVar.zzZ(1);
        zzakVar.zzaa(1);
        zzw.zzl(zzakVar.zzac());
        this.zzf.zzD();
        this.zzf.zzO(new zzadh(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        zzef.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzfj zzfjVar = new zzfj(this.zzb);
        ((zzabu) zzacfVar).zzm(zzfjVar.zzI(), 0, this.zzb, false);
        return zzfjVar.zzp() == this.zza;
    }
}
