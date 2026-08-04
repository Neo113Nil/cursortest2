package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzalw implements zzamd {
    private final zzee zza;
    private final zzef zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzaeb zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzu zzl;
    private int zzm;
    private long zzn;

    public zzalw(String str, int i, String str2) {
        zzee zzeeVar = new zzee(new byte[16], 16);
        this.zza = zzeeVar;
        this.zzb = new zzef(zzeeVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzanrVar.zzc();
        this.zzg = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        this.zzg.getClass();
        while (zzefVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (zzefVar.zzd() > 0) {
                    if (this.zzj) {
                        int zzs = zzefVar.zzs();
                        this.zzj = zzs == 172;
                        byte b = SignedBytes.MAX_POWER_OF_TWO;
                        if (zzs != 64) {
                            if (zzs == 65) {
                                zzs = 65;
                            }
                        }
                        this.zzh = 1;
                        zzef zzefVar2 = this.zzb;
                        zzefVar2.zzi()[0] = -84;
                        if (zzs == 65) {
                            b = 65;
                        }
                        zzefVar2.zzi()[1] = b;
                        this.zzi = 2;
                    } else {
                        this.zzj = zzefVar.zzs() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzefVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzz(zzefVar, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzm) {
                    zzghc.zzh(this.zzn != -9223372036854775807L);
                    this.zzg.zzx(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzef zzefVar3 = this.zzb;
                byte[] zzi = zzefVar3.zzi();
                int min2 = Math.min(zzefVar.zzd(), 16 - this.zzi);
                zzefVar.zzm(zzi, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 16) {
                    zzee zzeeVar = this.zza;
                    zzeeVar.zzf(0);
                    zzabx zzb = zzaby.zzb(zzeeVar);
                    zzu zzuVar = this.zzl;
                    if (zzuVar == null || zzuVar.zzG != 2 || zzb.zza != zzuVar.zzH || !"audio/ac4".equals(zzuVar.zzo)) {
                        zzs zzsVar = new zzs();
                        zzsVar.zza(this.zzf);
                        zzsVar.zzl(this.zze);
                        zzsVar.zzm("audio/ac4");
                        zzsVar.zzE(2);
                        zzsVar.zzF(zzb.zza);
                        zzsVar.zze(this.zzc);
                        zzsVar.zzg(this.zzd);
                        zzu zzM = zzsVar.zzM();
                        this.zzl = zzM;
                        this.zzg.zzu(zzM);
                    }
                    this.zzm = zzb.zzb;
                    this.zzk = (zzb.zzc * 1000000) / this.zzl.zzH;
                    zzefVar3.zzh(0);
                    this.zzg.zzz(zzefVar3, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
    }
}
