package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzams implements zzamf {
    private String zze;
    private zzadp zzf;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzn;
    private int zzo;
    private int zzs;
    private boolean zzu;
    private int zzd = 0;
    private final zzek zza = new zzek(new byte[15], 2);
    private final zzej zzb = new zzej();
    private final zzek zzc = new zzek();
    private final zzamt zzp = new zzamt();
    private int zzq = -2147483647;
    private int zzr = -1;
    private long zzt = -1;
    private boolean zzj = true;
    private boolean zzm = true;
    private double zzg = -9.223372036854776E18d;
    private double zzh = -9.223372036854776E18d;

    private static final void zzf(zzek zzekVar, zzek zzekVar2, boolean z) {
        int zzd = zzekVar.zzd();
        int min = Math.min(zzekVar.zzb(), zzekVar2.zzb());
        zzekVar.zzG(zzekVar2.zzM(), zzekVar2.zzd(), min);
        zzekVar2.zzL(min);
        if (z) {
            zzekVar.zzK(zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) throws zzbo {
        int i;
        zzdi.zzb(this.zzf);
        while (zzekVar.zzb() > 0) {
            int i2 = this.zzd;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.zzk;
                if ((i4 & 2) != 0) {
                    if ((i4 & 4) == 0) {
                        while (zzekVar.zzb() > 0) {
                            int i5 = this.zzl << 8;
                            this.zzl = i5;
                            int zzm = i5 | zzekVar.zzm();
                            this.zzl = zzm;
                            if ((zzm & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzekVar.zzK(zzekVar.zzd() - 3);
                                this.zzl = 0;
                            }
                        }
                    }
                    this.zzd = 1;
                    break;
                }
                zzekVar.zzK(zzekVar.zze());
            } else if (i2 != 1) {
                int i6 = this.zzp.zza;
                if (i6 == 1 || i6 == 17) {
                    zzf(zzekVar, this.zzc, true);
                }
                int min = Math.min(zzekVar.zzb(), this.zzp.zzc - this.zzn);
                this.zzf.zzq(zzekVar, min);
                int i7 = this.zzn + min;
                this.zzn = i7;
                zzamt zzamtVar = this.zzp;
                if (i7 == zzamtVar.zzc) {
                    int i8 = zzamtVar.zza;
                    if (i8 == 1) {
                        byte[] zzM = this.zzc.zzM();
                        zzamv zza = zzamw.zza(new zzej(zzM, zzM.length));
                        this.zzq = zza.zzb;
                        this.zzr = zza.zzc;
                        long j = this.zzt;
                        long j2 = this.zzp.zzb;
                        if (j != j2) {
                            this.zzt = j2;
                            int i9 = zza.zza;
                            String concat = i9 != -1 ? "mhm1".concat(String.valueOf(String.format(".%02X", Integer.valueOf(i9)))) : "mhm1";
                            byte[] bArr = zza.zzd;
                            zzfxr zzfxrVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfxrVar = zzfxr.zzo(zzet.zzf, bArr);
                            }
                            zzad zzadVar = new zzad();
                            zzadVar.zzK(this.zze);
                            zzadVar.zzX("audio/mhm1");
                            zzadVar.zzY(this.zzq);
                            zzadVar.zzz(concat);
                            zzadVar.zzL(zzfxrVar);
                            this.zzf.zzl(zzadVar.zzad());
                        }
                        this.zzu = true;
                    } else if (i8 == 17) {
                        byte[] zzM2 = this.zzc.zzM();
                        zzej zzejVar = new zzej(zzM2, zzM2.length);
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(2);
                            i3 = zzejVar.zzd(13);
                        }
                        this.zzs = i3;
                    } else if (i8 == 2) {
                        if (this.zzu) {
                            this.zzj = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i10 = this.zzr - this.zzs;
                        double d = this.zzq;
                        long round = Math.round(this.zzg);
                        if (this.zzi) {
                            this.zzi = false;
                            this.zzg = this.zzh;
                        } else {
                            this.zzg += (i10 * 1000000.0d) / d;
                        }
                        this.zzf.zzs(round, i, this.zzo, 0, null);
                        this.zzu = false;
                        this.zzs = 0;
                        this.zzo = 0;
                    }
                    this.zzd = 1;
                }
            } else {
                zzf(zzekVar, this.zza, false);
                zzek zzekVar2 = this.zza;
                if (zzekVar2.zzb() == 0) {
                    zzej zzejVar2 = this.zzb;
                    int zze = zzekVar2.zze();
                    zzejVar2.zzk(zzekVar2.zzM(), zze);
                    if (zzamw.zzb(this.zzb, this.zzp)) {
                        this.zzn = 0;
                        this.zzo += this.zzp.zzc + zze;
                        this.zza.zzK(0);
                        zzadp zzadpVar = this.zzf;
                        zzek zzekVar3 = this.zza;
                        zzadpVar.zzq(zzekVar3, zzekVar3.zze());
                        this.zza.zzH(2);
                        this.zzc.zzH(this.zzp.zzc);
                        this.zzm = true;
                        this.zzd = 2;
                    } else {
                        zzek zzekVar4 = this.zza;
                        if (zzekVar4.zze() < 15) {
                            zzekVar4.zzJ(zzekVar4.zze() + 1);
                        }
                    }
                }
                this.zzm = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zze = zzansVar.zzb();
        this.zzf = zzacnVar.zzw(zzansVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzk = i;
        if (!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.zzi) {
                this.zzh = d;
            } else {
                this.zzg = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzd = 0;
        this.zzl = 0;
        this.zza.zzH(2);
        this.zzn = 0;
        this.zzo = 0;
        this.zzq = -2147483647;
        this.zzr = -1;
        this.zzs = 0;
        this.zzt = -1L;
        this.zzu = false;
        this.zzi = false;
        this.zzm = true;
        this.zzj = true;
        this.zzg = -9.223372036854776E18d;
        this.zzh = -9.223372036854776E18d;
    }
}
