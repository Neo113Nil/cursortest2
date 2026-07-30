package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaow implements zzaon {
    private final zzapq zza;
    private String zzb;
    private zzagh zzc;
    private zzaov zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzape zzg = new zzape(32, 128);
    private final zzape zzh = new zzape(33, 128);
    private final zzape zzi = new zzape(34, 128);
    private final zzape zzj = new zzape(39, 128);
    private final zzape zzk = new zzape(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaow(zzapq zzapqVar, String str) {
        this.zza = zzapqVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        this.zzd.zzb(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @RequiresNonNull({AgentOptions.OUTPUT, "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            zzape zzapeVar = this.zzg;
            zzapeVar.zze(i2);
            zzape zzapeVar2 = this.zzh;
            zzapeVar2.zze(i2);
            zzape zzapeVar3 = this.zzi;
            zzapeVar3.zze(i2);
            if (zzapeVar.zzb() && zzapeVar2.zzb() && zzapeVar3.zzb()) {
                String str = this.zzb;
                int i3 = zzapeVar.zzb;
                byte[] bArr = new byte[zzapeVar2.zzb + i3 + zzapeVar3.zzb];
                System.arraycopy(zzapeVar.zza, 0, bArr, 0, i3);
                System.arraycopy(zzapeVar2.zza, 0, bArr, zzapeVar.zzb, zzapeVar2.zzb);
                System.arraycopy(zzapeVar3.zza, 0, bArr, zzapeVar.zzb + zzapeVar2.zzb, zzapeVar3.zzb);
                String str2 = null;
                zzgg zzg = zzgm.zzg(zzapeVar2.zza, 3, zzapeVar2.zzb, null);
                zzgb zzgbVar = zzg.zzb;
                if (zzgbVar != null) {
                    int i4 = zzgbVar.zzf;
                    int[] iArr = zzgbVar.zze;
                    int i5 = zzgbVar.zzd;
                    str2 = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, i5, iArr, i4);
                }
                zzt zztVar = new zzt();
                zztVar.zza(str);
                zztVar.zzl("video/mp2t");
                zztVar.zzm("video/hevc");
                zztVar.zzj(str2);
                zztVar.zzt(zzg.zze);
                zztVar.zzu(zzg.zzf);
                zztVar.zzv(zzg.zzg);
                zztVar.zzw(zzg.zzh);
                zzh zzhVar = new zzh();
                zzhVar.zza(zzg.zzk);
                zzhVar.zzb(zzg.zzl);
                zzhVar.zzc(zzg.zzm);
                zzhVar.zze(zzg.zzc + 8);
                zzhVar.zzf(zzg.zzd + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zzg.zzi);
                zztVar.zzo(zzg.zzj);
                zztVar.zzD(zzg.zza + 1);
                zztVar.zzp(Collections.singletonList(bArr));
                zzv zzM = zztVar.zzM();
                this.zzc.zzz(zzM);
                int i6 = zzM.zzq;
                zzgrc.zzi(i6 != -1);
                this.zza.zzb(i6);
                this.zze = true;
            }
        }
        zzape zzapeVar4 = this.zzj;
        if (zzapeVar4.zze(i2)) {
            int zza = zzgm.zza(zzapeVar4.zza, zzapeVar4.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar4.zza, zza);
            zzerVar.zzk(5);
            this.zza.zzc(j2, zzerVar);
        }
        zzape zzapeVar5 = this.zzk;
        if (zzapeVar5.zze(i2)) {
            int zza2 = zzgm.zza(zzapeVar5.zza, zzapeVar5.zzb);
            zzer zzerVar2 = this.zzn;
            zzerVar2.zzb(zzapeVar5.zza, zza2);
            zzerVar2.zzk(5);
            this.zza.zzc(j2, zzerVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgm.zzj(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaov zzaovVar = this.zzd;
        if (zzaovVar != null) {
            zzaovVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzb = zzaqbVar.zzc();
        this.zzc = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzd = new zzaov(this.zzc);
        this.zza.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        this.zzc.getClass();
        String str = zzfj.zza;
        while (zzerVar.zzd() > 0) {
            int zzg = zzerVar.zzg();
            int zze = zzerVar.zze();
            byte[] zzi = zzerVar.zzi();
            this.zzl += zzerVar.zzd();
            this.zzc.zzc(zzerVar, zzerVar.zzd());
            while (zzg < zze) {
                int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzf);
                if (zzi2 == zze) {
                    zzg(zzi, zzg, zze);
                    return;
                }
                int i = zzi[zzi2 + 3] & 126;
                int i2 = 3;
                if (zzi2 > 0) {
                    int i3 = zzi2 - 1;
                    if (zzi[i3] == 0) {
                        i2 = 4;
                        zzi2 = i3;
                    }
                }
                int i4 = zzi2 - zzg;
                if (i4 > 0) {
                    zzg(zzi, zzg, zzi2);
                }
                int i5 = zze - zzi2;
                long j = this.zzl - i5;
                zzh(j, i5, i4 < 0 ? -i4 : 0, this.zzm);
                zzf(j, i5, i >> 1, this.zzm);
                zzg = zzi2 + i2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z) {
        this.zzc.getClass();
        String str = zzfj.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
