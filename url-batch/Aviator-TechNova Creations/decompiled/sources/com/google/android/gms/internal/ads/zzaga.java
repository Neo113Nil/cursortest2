package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaga implements zzaeu {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzaex zzf;
    private zzagh zzg;

    public zzaga(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        int i = this.zza;
        zzgrc.zzi((i == -1 || this.zzb == -1) ? false : true);
        int i2 = this.zzb;
        zzer zzerVar = new zzer(i2);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, i2, false);
        return zzerVar.zzt() == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzf = zzaexVar;
        zzagh zzu = zzaexVar.zzu(1024, 4);
        this.zzg = zzu;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzl(str);
        zztVar.zzm(str);
        zzu.zzz(zztVar.zzM());
        this.zzf.zzv();
        this.zzf.zzw(new zzagb(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzagh zzaghVar = this.zzg;
        zzaghVar.getClass();
        int zza = zzaghVar.zza(zzaevVar, 1024, true);
        if (zza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += zza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }
}
