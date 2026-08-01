package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzajo implements zzajy {
    private final zzfi zza;
    private final zzfj zzb;
    private final String zzc;
    private String zzd;
    private zzadk zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzajo() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zza(zzfj zzfjVar) {
        zzef.zzb(this.zze);
        while (zzfjVar.zza() > 0) {
            int i = this.zzf;
            if (i == 0) {
                while (true) {
                    if (zzfjVar.zza() <= 0) {
                        break;
                    }
                    if (this.zzh) {
                        int zzl = zzfjVar.zzl();
                        if (zzl == 119) {
                            this.zzh = false;
                            this.zzf = 1;
                            zzfj zzfjVar2 = this.zzb;
                            zzfjVar2.zzI()[0] = Ascii.VT;
                            zzfjVar2.zzI()[1] = 119;
                            this.zzg = 2;
                            break;
                        }
                        this.zzh = zzl == 11;
                    } else {
                        this.zzh = zzfjVar.zzl() == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzfjVar.zza(), this.zzk - this.zzg);
                this.zze.zzr(zzfjVar, min);
                int i2 = this.zzg + min;
                this.zzg = i2;
                int i3 = this.zzk;
                if (i2 == i3) {
                    long j = this.zzl;
                    if (j != -9223372036854775807L) {
                        this.zze.zzt(j, 1, i3, 0, null);
                        this.zzl += this.zzi;
                    }
                    this.zzf = 0;
                }
            } else {
                byte[] zzI = this.zzb.zzI();
                int min2 = Math.min(zzfjVar.zza(), 128 - this.zzg);
                zzfjVar.zzC(zzI, this.zzg, min2);
                int i4 = this.zzg + min2;
                this.zzg = i4;
                if (i4 == 128) {
                    this.zza.zzj(0);
                    zzabe zze = zzabf.zze(this.zza);
                    zzam zzamVar = this.zzj;
                    if (zzamVar == null || zze.zzc != zzamVar.zzz || zze.zzb != zzamVar.zzA || !zzfs.zzF(zze.zza, zzamVar.zzm)) {
                        zzak zzakVar = new zzak();
                        zzakVar.zzJ(this.zzd);
                        zzakVar.zzU(zze.zza);
                        zzakVar.zzy(zze.zzc);
                        zzakVar.zzV(zze.zzb);
                        zzakVar.zzM(this.zzc);
                        zzakVar.zzQ(zze.zzf);
                        if ("audio/ac3".equals(zze.zza)) {
                            zzakVar.zzx(zze.zzf);
                        }
                        zzam zzac = zzakVar.zzac();
                        this.zzj = zzac;
                        this.zze.zzl(zzac);
                    }
                    this.zzk = zze.zzd;
                    this.zzi = (zze.zze * 1000000) / this.zzj.zzA;
                    this.zzb.zzG(0);
                    this.zze.zzr(this.zzb, 128);
                    this.zzf = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        this.zzd = zzalkVar.zzb();
        this.zze = zzachVar.zzw(zzalkVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }

    public zzajo(String str) {
        zzfi zzfiVar = new zzfi(new byte[128], 128);
        this.zza = zzfiVar;
        this.zzb = new zzfj(zzfiVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }
}
