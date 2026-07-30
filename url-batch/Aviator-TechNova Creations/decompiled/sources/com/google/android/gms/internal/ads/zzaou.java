package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaou implements zzaon {
    private final zzapq zza;
    private long zzf;
    private String zzh;
    private zzagh zzi;
    private zzaot zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzape zzc = new zzape(7, 128);
    private final zzape zzd = new zzape(8, 128);
    private final zzape zze = new zzape(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzer zzn = new zzer();

    public zzaou(zzapq zzapqVar, boolean z, boolean z2, String str) {
        this.zza = zzapqVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zzd(bArr, i, i2);
            this.zzd.zzd(bArr, i, i2);
        }
        this.zze.zzd(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzgm.zzj(this.zzg);
        this.zzc.zza();
        this.zzd.zza();
        this.zze.zza();
        this.zza.zze();
        zzaot zzaotVar = this.zzj;
        if (zzaotVar != null) {
            zzaotVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        this.zzi = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzj = new zzaot(this.zzi, false, false);
        this.zza.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        int i;
        int i2;
        int i3;
        this.zzi.getClass();
        String str = zzfj.zza;
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        byte[] zzi = zzerVar.zzi();
        this.zzf += zzerVar.zzd();
        this.zzi.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzg);
            if (zzi2 == zze) {
                zzg(zzi, zzg, zze);
                return;
            }
            int i4 = zzi[zzi2 + 3] & Ascii.US;
            if (zzi2 > 0) {
                int i5 = zzi2 - 1;
                if (zzi[i5] == 0) {
                    i2 = 4;
                    i = i5;
                    i3 = i - zzg;
                    if (i3 > 0) {
                        zzg(zzi, zzg, i);
                    }
                    int i6 = zze - i;
                    long j = this.zzf - i6;
                    zzh(j, i6, i3 >= 0 ? -i3 : 0, this.zzl);
                    zzf(j, i4, this.zzl);
                    zzg = i + i2;
                }
            }
            i = zzi2;
            i2 = 3;
            i3 = i - zzg;
            if (i3 > 0) {
            }
            int i62 = zze - i;
            long j2 = this.zzf - i62;
            zzh(j2, i62, i3 >= 0 ? -i3 : 0, this.zzl);
            zzf(j2, i4, this.zzl);
            zzg = i + i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z) {
        this.zzi.getClass();
        String str = zzfj.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzf, 0, 0, this.zzl);
            zzf(this.zzf, 9, this.zzl);
            zzh(this.zzf, 0, 0, this.zzl);
        }
    }

    @RequiresNonNull({AgentOptions.OUTPUT, "sampleReader"})
    private final void zzh(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzape zzapeVar = this.zzc;
            zzapeVar.zze(i2);
            zzape zzapeVar2 = this.zzd;
            zzapeVar2.zze(i2);
            if (this.zzk) {
                if (zzapeVar.zzb()) {
                    zzgl zze = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                    this.zza.zzb(zze.zzm);
                    this.zzj.zza(zze);
                    zzapeVar.zza();
                } else if (zzapeVar2.zzb()) {
                    this.zzj.zzb(zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb));
                    zzapeVar2.zza();
                }
            } else if (zzapeVar.zzb() && zzapeVar2.zzb()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(zzapeVar.zza, zzapeVar.zzb));
                arrayList.add(Arrays.copyOf(zzapeVar2.zza, zzapeVar2.zzb));
                zzgl zze2 = zzgm.zze(zzapeVar.zza, 4, zzapeVar.zzb);
                zzgk zzh = zzgm.zzh(zzapeVar2.zza, 4, zzapeVar2.zzb);
                String zza = zzdo.zza(zze2.zza, zze2.zzb, zze2.zzc);
                zzagh zzaghVar = this.zzi;
                zzt zztVar = new zzt();
                zztVar.zza(this.zzh);
                zztVar.zzl(this.zzb);
                zztVar.zzm("video/avc");
                zztVar.zzj(zza);
                zztVar.zzt(zze2.zze);
                zztVar.zzu(zze2.zzf);
                zzh zzhVar = new zzh();
                zzhVar.zza(zze2.zzj);
                zzhVar.zzb(zze2.zzk);
                zzhVar.zzc(zze2.zzl);
                zzhVar.zze(zze2.zzh + 8);
                zzhVar.zzf(zze2.zzi + 8);
                zztVar.zzC(zzhVar.zzg());
                zztVar.zzz(zze2.zzg);
                zztVar.zzp(arrayList);
                int i3 = zze2.zzm;
                zztVar.zzo(i3);
                zzaghVar.zzz(zztVar.zzM());
                this.zzk = true;
                this.zza.zzb(i3);
                this.zzj.zza(zze2);
                this.zzj.zzb(zzh);
                zzapeVar.zza();
                zzapeVar2.zza();
            }
        }
        zzape zzapeVar3 = this.zze;
        if (zzapeVar3.zze(i2)) {
            int zza2 = zzgm.zza(zzapeVar3.zza, zzapeVar3.zzb);
            zzer zzerVar = this.zzn;
            zzerVar.zzb(zzapeVar3.zza, zza2);
            zzerVar.zzh(4);
            this.zza.zzc(j2, zzerVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}
