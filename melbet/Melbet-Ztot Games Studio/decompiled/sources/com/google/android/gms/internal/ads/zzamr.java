package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzamr implements zzamf {
    private final zzek zza;
    private final zzadc zzb;
    private final String zzc;
    private final int zzd;
    private zzadp zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzamr() {
        throw null;
    }

    public zzamr(String str, int i) {
        this.zzg = 0;
        zzek zzekVar = new zzek(4);
        this.zza = zzekVar;
        zzekVar.zzM()[0] = -1;
        this.zzb = new zzadc();
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        zzdi.zzb(this.zze);
        while (zzekVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                byte[] zzM = zzekVar.zzM();
                int zzd = zzekVar.zzd();
                int zze = zzekVar.zze();
                while (true) {
                    if (zzd >= zze) {
                        zzekVar.zzK(zze);
                        break;
                    }
                    int i2 = zzd + 1;
                    byte b = zzM[zzd];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzj && (b & 224) == 224;
                    this.zzj = z;
                    if (z2) {
                        zzekVar.zzK(i2);
                        this.zzj = false;
                        this.zza.zzM()[1] = zzM[zzd];
                        this.zzh = 2;
                        this.zzg = 1;
                        break;
                    }
                    zzd = i2;
                }
            } else if (i != 1) {
                int min = Math.min(zzekVar.zzb(), this.zzl - this.zzh);
                this.zze.zzq(zzekVar, min);
                int i3 = this.zzh + min;
                this.zzh = i3;
                if (i3 >= this.zzl) {
                    zzdi.zzf(this.zzm != -9223372036854775807L);
                    this.zze.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzk;
                    this.zzh = 0;
                    this.zzg = 0;
                }
            } else {
                int min2 = Math.min(zzekVar.zzb(), 4 - this.zzh);
                zzekVar.zzG(this.zza.zzM(), this.zzh, min2);
                int i4 = this.zzh + min2;
                this.zzh = i4;
                if (i4 >= 4) {
                    this.zza.zzK(0);
                    if (this.zzb.zza(this.zza.zzg())) {
                        this.zzl = this.zzb.zzc;
                        if (!this.zzi) {
                            this.zzk = (r0.zzg * 1000000) / r0.zzd;
                            zzad zzadVar = new zzad();
                            zzadVar.zzK(this.zzf);
                            zzadVar.zzX(this.zzb.zzb);
                            zzadVar.zzP(4096);
                            zzadVar.zzy(this.zzb.zze);
                            zzadVar.zzY(this.zzb.zzd);
                            zzadVar.zzO(this.zzc);
                            zzadVar.zzV(this.zzd);
                            this.zze.zzl(zzadVar.zzad());
                            this.zzi = true;
                        }
                        this.zza.zzK(0);
                        this.zze.zzq(this.zza, 4);
                        this.zzg = 2;
                    } else {
                        this.zzh = 0;
                        this.zzg = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzf = zzansVar.zzb();
        this.zze = zzacnVar.zzw(zzansVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }
}
