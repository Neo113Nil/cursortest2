package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzaeu implements zzace {
    private zzach zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzago zzg;
    private zzacf zzh;
    private zzaex zzi;
    private zzail zzj;
    private final zzfj zza = new zzfj(6);
    private long zzf = -1;

    private final int zza(zzacf zzacfVar) throws IOException {
        this.zza.zzD(2);
        ((zzabu) zzacfVar).zzm(this.zza.zzI(), 0, 2, false);
        return this.zza.zzp();
    }

    private final void zzf() {
        zzg(new zzca[0]);
        zzach zzachVar = this.zzb;
        zzachVar.getClass();
        zzachVar.zzD();
        this.zzb.zzO(new zzadd(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        int i;
        String zzw;
        zzaew zza;
        zzago zzagoVar;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zzD(2);
            ((zzabu) zzacfVar).zzn(this.zza.zzI(), 0, 2, false);
            int zzp = this.zza.zzp();
            this.zzd = zzp;
            if (zzp == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzf();
                return 0;
            }
            if ((zzp >= 65488 && zzp <= 65497) || zzp == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            this.zza.zzD(2);
            ((zzabu) zzacfVar).zzn(this.zza.zzI(), 0, 2, false);
            this.zze = this.zza.zzp() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzacfVar != this.zzh) {
                    this.zzh = zzacfVar;
                    this.zzi = new zzaex(zzacfVar, this.zzf);
                }
                zzail zzailVar = this.zzj;
                zzailVar.getClass();
                int zzb = zzailVar.zzb(this.zzi, zzadbVar);
                if (zzb == 1) {
                    zzadbVar.zza += this.zzf;
                }
                return zzb;
            }
            long zzf = zzacfVar.zzf();
            long j2 = this.zzf;
            if (zzf != j2) {
                zzadbVar.zza = j2;
                return 1;
            }
            if (zzacfVar.zzm(this.zza.zzI(), 0, 1, true)) {
                zzacfVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzail(0);
                }
                zzaex zzaexVar = new zzaex(zzacfVar, this.zzf);
                this.zzi = zzaexVar;
                if (this.zzj.zze(zzaexVar)) {
                    zzail zzailVar2 = this.zzj;
                    long j3 = this.zzf;
                    zzach zzachVar = this.zzb;
                    zzachVar.getClass();
                    zzailVar2.zzc(new zzaez(j3, zzachVar));
                    zzago zzagoVar2 = this.zzg;
                    zzagoVar2.getClass();
                    zzg(zzagoVar2);
                    this.zzc = 5;
                } else {
                    zzf();
                }
            } else {
                zzf();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzfj zzfjVar = new zzfj(this.zze);
            ((zzabu) zzacfVar).zzn(zzfjVar.zzI(), 0, this.zze, false);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzfjVar.zzw((char) 0)) && (zzw = zzfjVar.zzw((char) 0)) != null) {
                long zzd = zzacfVar.zzd();
                if (zzd != -1 && (zza = zzafa.zza(zzw)) != null && zza.zzb.size() >= 2) {
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    boolean z = false;
                    for (int size = zza.zzb.size() - 1; size >= 0; size--) {
                        zzaev zzaevVar = (zzaev) zza.zzb.get(size);
                        z |= "video/mp4".equals(zzaevVar.zza);
                        if (size == 0) {
                            zzd -= zzaevVar.zzd;
                            j = 0;
                        } else {
                            j = zzd - zzaevVar.zzc;
                        }
                        long j8 = zzd;
                        zzd = j;
                        if (z && zzd != j8) {
                            j7 = j8 - zzd;
                            j6 = zzd;
                            z = false;
                        }
                        if (size == 0) {
                            j5 = j8;
                        }
                        if (size == 0) {
                            j4 = zzd;
                        }
                    }
                    if (j6 != -1 && j7 != -1 && j4 != -1 && j5 != -1) {
                        zzagoVar = new zzago(j4, j5, zza.zza, j6, j7);
                        this.zzg = zzagoVar;
                        if (zzagoVar != null) {
                            this.zzf = zzagoVar.zzd;
                        }
                        i = 0;
                    }
                }
                zzagoVar = null;
                this.zzg = zzagoVar;
                if (zzagoVar != null) {
                }
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
            ((zzabu) zzacfVar).zzo(this.zze, false);
        }
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzb = zzachVar;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        if (zza(zzacfVar) != 65496) {
            return false;
        }
        int zza = zza(zzacfVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzD(2);
            zzabu zzabuVar = (zzabu) zzacfVar;
            zzabuVar.zzm(this.zza.zzI(), 0, 2, false);
            zzabuVar.zzl(this.zza.zzp() - 2, false);
            zza = zza(zzacfVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzabu zzabuVar2 = (zzabu) zzacfVar;
            zzabuVar2.zzl(2, false);
            this.zza.zzD(6);
            zzabuVar2.zzm(this.zza.zzI(), 0, 6, false);
            if (this.zza.zzt() == 1165519206 && this.zza.zzp() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzail zzailVar = this.zzj;
            zzailVar.getClass();
            zzailVar.zzd(j, j2);
        }
    }

    private final void zzg(zzca... zzcaVarArr) {
        zzach zzachVar = this.zzb;
        zzachVar.getClass();
        zzadk zzw = zzachVar.zzw(1024, 4);
        zzak zzakVar = new zzak();
        zzakVar.zzB("image/jpeg");
        zzakVar.zzO(new zzcb(-9223372036854775807L, zzcaVarArr));
        zzw.zzl(zzakVar.zzac());
    }
}
