package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzamq implements zzamf {
    private final String zza;
    private final int zzb;
    private final zzek zzc;
    private final zzej zzd;
    private zzadp zze;
    private String zzf;
    private zzaf zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private String zzv;

    public zzamq(String str, int i) {
        this.zza = str;
        this.zzb = i;
        zzek zzekVar = new zzek(1024);
        this.zzc = zzekVar;
        byte[] zzM = zzekVar.zzM();
        this.zzd = new zzej(zzM, zzM.length);
        this.zzl = -9223372036854775807L;
    }

    private final int zzf(zzej zzejVar) throws zzbo {
        int zza = zzejVar.zza();
        zzabf zzb = zzabg.zzb(zzejVar, true);
        this.zzv = zzb.zzc;
        this.zzs = zzb.zza;
        this.zzu = zzb.zzb;
        return zza - zzejVar.zza();
    }

    private static long zzg(zzej zzejVar) {
        return zzejVar.zzd((zzejVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0159, code lost:
    
        if (r14.zzm == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzek zzekVar) throws zzbo {
        int i;
        int i2;
        int i3;
        boolean zzp;
        zzdi.zzb(this.zze);
        while (zzekVar.zzb() > 0) {
            int i4 = this.zzh;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzm = zzekVar.zzm();
                    if ((zzm & 224) == 224) {
                        this.zzk = zzm;
                        this.zzh = 2;
                    } else if (zzm != 86) {
                        this.zzh = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzekVar.zzb(), this.zzj - this.zzi);
                    zzekVar.zzG(this.zzd.zza, this.zzi, min);
                    int i5 = this.zzi + min;
                    this.zzi = i5;
                    if (i5 == this.zzj) {
                        this.zzd.zzl(0);
                        zzej zzejVar = this.zzd;
                        if (!zzejVar.zzp()) {
                            this.zzm = true;
                            int zzd = zzejVar.zzd(1);
                            if (zzd == 1) {
                                i3 = zzejVar.zzd(1);
                                i2 = 1;
                            } else {
                                i2 = zzd;
                                i3 = 0;
                            }
                            this.zzn = i3;
                            if (i3 != 0) {
                                throw zzbo.zza(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzejVar);
                                i2 = 1;
                            }
                            if (!zzejVar.zzp()) {
                                throw zzbo.zza(null, null);
                            }
                            this.zzo = zzejVar.zzd(6);
                            int zzd2 = zzejVar.zzd(4);
                            int zzd3 = zzejVar.zzd(3);
                            if (zzd2 != 0 || zzd3 != 0) {
                                throw zzbo.zza(null, null);
                            }
                            if (i2 == 0) {
                                int zzc = zzejVar.zzc();
                                int zzf = zzf(zzejVar);
                                zzejVar.zzl(zzc);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzejVar.zzh(bArr, 0, zzf);
                                zzad zzadVar = new zzad();
                                zzadVar.zzK(this.zzf);
                                zzadVar.zzX("audio/mp4a-latm");
                                zzadVar.zzz(this.zzv);
                                zzadVar.zzy(this.zzu);
                                zzadVar.zzY(this.zzs);
                                zzadVar.zzL(Collections.singletonList(bArr));
                                zzadVar.zzO(this.zza);
                                zzadVar.zzV(this.zzb);
                                zzaf zzad = zzadVar.zzad();
                                if (!zzad.equals(this.zzg)) {
                                    this.zzg = zzad;
                                    this.zzt = 1024000000 / zzad.zzA;
                                    this.zze.zzl(zzad);
                                }
                            } else {
                                zzejVar.zzn(((int) zzg(zzejVar)) - zzf(zzejVar));
                            }
                            int zzd4 = zzejVar.zzd(3);
                            this.zzp = zzd4;
                            if (zzd4 == 0) {
                                zzejVar.zzn(8);
                            } else if (zzd4 == 1) {
                                zzejVar.zzn(9);
                            } else if (zzd4 == 3 || zzd4 == 4 || zzd4 == 5) {
                                zzejVar.zzn(6);
                            } else {
                                if (zzd4 != 6 && zzd4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzejVar.zzn(1);
                            }
                            boolean zzp2 = zzejVar.zzp();
                            this.zzq = zzp2;
                            this.zzr = 0L;
                            if (zzp2) {
                                if (i2 != 1) {
                                    do {
                                        zzp = zzejVar.zzp();
                                        this.zzr = (this.zzr << 8) + zzejVar.zzd(8);
                                    } while (zzp);
                                } else {
                                    this.zzr = zzg(zzejVar);
                                }
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(8);
                            }
                        }
                        if (this.zzn != 0) {
                            throw zzbo.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzbo.zza(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzbo.zza(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzd5 = zzejVar.zzd(8);
                            i = i6 + zzd5;
                            if (zzd5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzc2 = zzejVar.zzc();
                        if ((zzc2 & 7) == 0) {
                            this.zzc.zzK(zzc2 >> 3);
                        } else {
                            zzejVar.zzh(this.zzc.zzM(), 0, i * 8);
                            this.zzc.zzK(0);
                        }
                        this.zze.zzq(this.zzc, i);
                        zzdi.zzf(this.zzl != -9223372036854775807L);
                        this.zze.zzs(this.zzl, 1, i, 0, null);
                        this.zzl += this.zzt;
                        if (this.zzq) {
                            zzejVar.zzn((int) this.zzr);
                        }
                        this.zzh = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzm2 = ((this.zzk & (-225)) << 8) | zzekVar.zzm();
                    this.zzj = zzm2;
                    zzek zzekVar2 = this.zzc;
                    if (zzm2 > zzekVar2.zzM().length) {
                        zzekVar2.zzH(zzm2);
                        zzej zzejVar2 = this.zzd;
                        byte[] zzM = this.zzc.zzM();
                        zzejVar2.zzk(zzM, zzM.length);
                    }
                    this.zzi = 0;
                    this.zzh = 3;
                }
            } else if (zzekVar.zzm() == 86) {
                this.zzh = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zze = zzacnVar.zzw(zzansVar.zza(), 1);
        this.zzf = zzansVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = false;
    }
}
