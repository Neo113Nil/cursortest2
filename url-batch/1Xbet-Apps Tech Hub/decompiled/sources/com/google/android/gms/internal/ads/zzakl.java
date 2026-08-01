package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzakl implements zzajy {
    private final String zza;
    private final zzfj zzb;
    private final zzfi zzc;
    private zzadk zzd;
    private String zze;
    private zzam zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzakl(String str) {
        this.zza = str;
        zzfj zzfjVar = new zzfj(1024);
        this.zzb = zzfjVar;
        byte[] zzI = zzfjVar.zzI();
        this.zzc = new zzfi(zzI, zzI.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzfi zzfiVar) throws zzcf {
        int zza = zzfiVar.zza();
        zzabb zzb = zzabc.zzb(zzfiVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzfiVar.zza();
    }

    private static long zzg(zzfi zzfiVar) {
        return zzfiVar.zzd((zzfiVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0154, code lost:
    
        if (r14.zzl == false) goto L88;
     */
    @Override // com.google.android.gms.internal.ads.zzajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfj zzfjVar) throws zzcf {
        int i;
        int i2;
        int i3;
        boolean zzn;
        zzef.zzb(this.zzd);
        while (zzfjVar.zza() > 0) {
            int i4 = this.zzg;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzl = zzfjVar.zzl();
                    if ((zzl & 224) == 224) {
                        this.zzj = zzl;
                        this.zzg = 2;
                    } else if (zzl != 86) {
                        this.zzg = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzfjVar.zza(), this.zzi - this.zzh);
                    zzfjVar.zzC(this.zzc.zza, this.zzh, min);
                    int i5 = this.zzh + min;
                    this.zzh = i5;
                    if (i5 == this.zzi) {
                        this.zzc.zzj(0);
                        zzfi zzfiVar = this.zzc;
                        if (!zzfiVar.zzn()) {
                            this.zzl = true;
                            int zzd = zzfiVar.zzd(1);
                            if (zzd == 1) {
                                i3 = zzfiVar.zzd(1);
                                i2 = 1;
                            } else {
                                i2 = zzd;
                                i3 = 0;
                            }
                            this.zzm = i3;
                            if (i3 != 0) {
                                throw zzcf.zza(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzfiVar);
                                i2 = 1;
                            }
                            if (!zzfiVar.zzn()) {
                                throw zzcf.zza(null, null);
                            }
                            this.zzn = zzfiVar.zzd(6);
                            int zzd2 = zzfiVar.zzd(4);
                            int zzd3 = zzfiVar.zzd(3);
                            if (zzd2 != 0 || zzd3 != 0) {
                                throw zzcf.zza(null, null);
                            }
                            if (i2 == 0) {
                                int zzc = zzfiVar.zzc();
                                int zzf = zzf(zzfiVar);
                                zzfiVar.zzj(zzc);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzfiVar.zzg(bArr, 0, zzf);
                                zzak zzakVar = new zzak();
                                zzakVar.zzJ(this.zze);
                                zzakVar.zzU("audio/mp4a-latm");
                                zzakVar.zzz(this.zzu);
                                zzakVar.zzy(this.zzt);
                                zzakVar.zzV(this.zzr);
                                zzakVar.zzK(Collections.singletonList(bArr));
                                zzakVar.zzM(this.zza);
                                zzam zzac = zzakVar.zzac();
                                if (!zzac.equals(this.zzf)) {
                                    this.zzf = zzac;
                                    this.zzs = 1024000000 / zzac.zzA;
                                    this.zzd.zzl(zzac);
                                }
                            } else {
                                zzfiVar.zzl(((int) zzg(zzfiVar)) - zzf(zzfiVar));
                            }
                            int zzd4 = zzfiVar.zzd(3);
                            this.zzo = zzd4;
                            if (zzd4 == 0) {
                                zzfiVar.zzl(8);
                            } else if (zzd4 == 1) {
                                zzfiVar.zzl(9);
                            } else if (zzd4 == 3 || zzd4 == 4 || zzd4 == 5) {
                                zzfiVar.zzl(6);
                            } else {
                                if (zzd4 != 6 && zzd4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzfiVar.zzl(1);
                            }
                            boolean zzn2 = zzfiVar.zzn();
                            this.zzp = zzn2;
                            this.zzq = 0L;
                            if (zzn2) {
                                if (i2 != 1) {
                                    do {
                                        zzn = zzfiVar.zzn();
                                        this.zzq = (this.zzq << 8) + zzfiVar.zzd(8);
                                    } while (zzn);
                                } else {
                                    this.zzq = zzg(zzfiVar);
                                }
                            }
                            if (zzfiVar.zzn()) {
                                zzfiVar.zzl(8);
                            }
                        }
                        if (this.zzm != 0) {
                            throw zzcf.zza(null, null);
                        }
                        if (this.zzn != 0) {
                            throw zzcf.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzcf.zza(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzd5 = zzfiVar.zzd(8);
                            i = i6 + zzd5;
                            if (zzd5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzc2 = zzfiVar.zzc();
                        if ((zzc2 & 7) == 0) {
                            this.zzb.zzG(zzc2 >> 3);
                        } else {
                            zzfiVar.zzg(this.zzb.zzI(), 0, i * 8);
                            this.zzb.zzG(0);
                        }
                        this.zzd.zzr(this.zzb, i);
                        long j = this.zzk;
                        if (j != -9223372036854775807L) {
                            this.zzd.zzt(j, 1, i, 0, null);
                            this.zzk += this.zzs;
                        }
                        if (this.zzp) {
                            zzfiVar.zzl((int) this.zzq);
                        }
                        this.zzg = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzl2 = ((this.zzj & (-225)) << 8) | zzfjVar.zzl();
                    this.zzi = zzl2;
                    zzfj zzfjVar2 = this.zzb;
                    if (zzl2 > zzfjVar2.zzI().length) {
                        zzfjVar2.zzD(zzl2);
                        zzfi zzfiVar2 = this.zzc;
                        byte[] zzI = this.zzb.zzI();
                        zzfiVar2.zzi(zzI, zzI.length);
                    }
                    this.zzh = 0;
                    this.zzg = 3;
                }
            } else if (zzfjVar.zzl() == 86) {
                this.zzg = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        this.zzd = zzachVar.zzw(zzalkVar.zza(), 1);
        this.zze = zzalkVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
