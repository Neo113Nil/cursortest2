package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzadx implements zzace {
    private int zzc;
    private zzady zze;
    private long zzh;
    private zzaea zzi;
    private int zzm;
    private boolean zzn;
    private final zzfj zza = new zzfj(12);
    private final zzadw zzb = new zzadw(null);
    private zzach zzd = new zzacc();
    private zzaea[] zzg = new zzaea[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = -9223372036854775807L;

    private final zzaea zzf(int i) {
        for (zzaea zzaeaVar : this.zzg) {
            if (zzaeaVar.zzg(i)) {
                return zzaeaVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzc(zzach zzachVar) {
        this.zzc = 0;
        this.zzd = zzachVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final void zzd(long j, long j2) {
        this.zzh = -1L;
        this.zzi = null;
        for (zzaea zzaeaVar : this.zzg) {
            zzaeaVar.zzf(j);
        }
        if (j == 0) {
            this.zzc = this.zzg.length != 0 ? 3 : 0;
        } else {
            this.zzc = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzace
    public final boolean zze(zzacf zzacfVar) throws IOException {
        ((zzabu) zzacfVar).zzm(this.zza.zzI(), 0, 12, false);
        this.zza.zzG(0);
        if (this.zza.zzh() != 1179011410) {
            return false;
        }
        this.zza.zzH(4);
        return this.zza.zzh() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacf zzacfVar, zzadb zzadbVar) throws IOException {
        boolean z;
        int i;
        int i2;
        zzaea zzaeaVar;
        long j;
        long j2 = this.zzh;
        int i3 = 0;
        if (j2 != -1) {
            long zzf = zzacfVar.zzf();
            if (j2 < zzf || j2 > 262144 + zzf) {
                zzadbVar.zza = j2;
                z = true;
                this.zzh = -1L;
                if (!z) {
                    return 1;
                }
                int i4 = this.zzc;
                zzaea zzaeaVar2 = null;
                if (i4 == 0) {
                    if (!zze(zzacfVar)) {
                        throw zzcf.zza("AVI Header List not found", null);
                    }
                    ((zzabu) zzacfVar).zzo(12, false);
                    this.zzc = 1;
                    return 0;
                }
                if (i4 == 1) {
                    ((zzabu) zzacfVar).zzn(this.zza.zzI(), 0, 12, false);
                    this.zza.zzG(0);
                    zzadw zzadwVar = this.zzb;
                    zzfj zzfjVar = this.zza;
                    zzadwVar.zza(zzfjVar);
                    int i5 = zzadwVar.zza;
                    if (i5 != 1414744396) {
                        throw zzcf.zza("LIST expected, found: " + i5, null);
                    }
                    zzadwVar.zzc = zzfjVar.zzh();
                    zzadw zzadwVar2 = this.zzb;
                    int i6 = zzadwVar2.zzc;
                    if (i6 == 1819436136) {
                        this.zzj = zzadwVar2.zzb;
                        this.zzc = 2;
                        return 0;
                    }
                    throw zzcf.zza("hdrl expected, found: " + i6, null);
                }
                if (i4 == 2) {
                    int i7 = this.zzj - 4;
                    zzfj zzfjVar2 = new zzfj(i7);
                    ((zzabu) zzacfVar).zzn(zzfjVar2.zzI(), 0, i7, false);
                    zzaeb zzc = zzaeb.zzc(1819436136, zzfjVar2);
                    if (zzc.zza() != 1819436136) {
                        throw zzcf.zza("Unexpected header list type " + zzc.zza(), null);
                    }
                    zzady zzadyVar = (zzady) zzc.zzb(zzady.class);
                    if (zzadyVar == null) {
                        throw zzcf.zza("AviHeader not found", null);
                    }
                    this.zze = zzadyVar;
                    this.zzf = zzadyVar.zzc * zzadyVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzfwu zzfwuVar = zzc.zza;
                    int size = zzfwuVar.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size) {
                        zzadt zzadtVar = (zzadt) zzfwuVar.get(i8);
                        if (zzadtVar.zza() == 1819440243) {
                            zzaeb zzaebVar = (zzaeb) zzadtVar;
                            int i10 = i9 + 1;
                            zzadz zzadzVar = (zzadz) zzaebVar.zzb(zzadz.class);
                            zzaec zzaecVar = (zzaec) zzaebVar.zzb(zzaec.class);
                            if (zzadzVar == null) {
                                zzez.zzf("AviExtractor", "Missing Stream Header");
                            } else if (zzaecVar == null) {
                                zzez.zzf("AviExtractor", "Missing Stream Format");
                            } else {
                                i = i10;
                                long zzs = zzfs.zzs(zzadzVar.zzd, zzadzVar.zzb * 1000000, zzadzVar.zzc, RoundingMode.FLOOR);
                                zzam zzamVar = zzaecVar.zza;
                                zzak zzb = zzamVar.zzb();
                                zzb.zzI(i9);
                                int i11 = zzadzVar.zze;
                                if (i11 != 0) {
                                    zzb.zzN(i11);
                                }
                                zzaed zzaedVar = (zzaed) zzaebVar.zzb(zzaed.class);
                                if (zzaedVar != null) {
                                    zzb.zzL(zzaedVar.zza);
                                }
                                int zzb2 = zzce.zzb(zzamVar.zzm);
                                if (zzb2 == 1) {
                                    i2 = zzb2;
                                } else if (zzb2 == 2) {
                                    i2 = 2;
                                } else {
                                    zzaeaVar = null;
                                    if (zzaeaVar != null) {
                                        arrayList.add(zzaeaVar);
                                    }
                                    i9 = i;
                                }
                                zzadk zzw = this.zzd.zzw(i9, i2);
                                zzw.zzl(zzb.zzac());
                                zzaeaVar = new zzaea(i9, i2, zzs, zzadzVar.zzd, zzw);
                                this.zzf = zzs;
                                if (zzaeaVar != null) {
                                }
                                i9 = i;
                            }
                            zzaeaVar = zzaeaVar2;
                            i = i10;
                            if (zzaeaVar != null) {
                            }
                            i9 = i;
                        }
                        i8++;
                        zzaeaVar2 = null;
                        i3 = 0;
                    }
                    int i12 = i3;
                    this.zzg = (zzaea[]) arrayList.toArray(new zzaea[i12]);
                    this.zzd.zzD();
                    this.zzc = 3;
                    return i12;
                }
                if (i4 == 3) {
                    long j3 = this.zzk;
                    if (j3 != -1 && zzacfVar.zzf() != j3) {
                        this.zzh = j3;
                        return 0;
                    }
                    zzabu zzabuVar = (zzabu) zzacfVar;
                    zzabuVar.zzm(this.zza.zzI(), 0, 12, false);
                    zzacfVar.zzj();
                    this.zza.zzG(0);
                    this.zzb.zza(this.zza);
                    zzfj zzfjVar3 = this.zza;
                    zzadw zzadwVar3 = this.zzb;
                    int zzh = zzfjVar3.zzh();
                    int i13 = zzadwVar3.zza;
                    if (i13 == 1179011410) {
                        zzabuVar.zzo(12, false);
                        return 0;
                    }
                    if (i13 != 1414744396 || zzh != 1769369453) {
                        this.zzh = zzacfVar.zzf() + zzadwVar3.zzb + 8;
                        return 0;
                    }
                    long zzf2 = zzacfVar.zzf();
                    this.zzk = zzf2;
                    long j4 = zzf2 + zzadwVar3.zzb + 8;
                    this.zzl = j4;
                    if (!this.zzn) {
                        zzady zzadyVar2 = this.zze;
                        zzadyVar2.getClass();
                        if ((zzadyVar2.zzb & 16) == 16) {
                            this.zzc = 4;
                            this.zzh = j4;
                            return 0;
                        }
                        this.zzd.zzO(new zzadd(this.zzf, 0L));
                        this.zzn = true;
                    }
                    this.zzh = zzacfVar.zzf() + 12;
                    this.zzc = 6;
                    return 0;
                }
                if (i4 == 4) {
                    ((zzabu) zzacfVar).zzn(this.zza.zzI(), 0, 8, false);
                    this.zza.zzG(0);
                    zzfj zzfjVar4 = this.zza;
                    int zzh2 = zzfjVar4.zzh();
                    int zzh3 = zzfjVar4.zzh();
                    if (zzh2 == 829973609) {
                        this.zzc = 5;
                        this.zzm = zzh3;
                    } else {
                        this.zzh = zzacfVar.zzf() + zzh3;
                    }
                    return 0;
                }
                if (i4 == 5) {
                    zzfj zzfjVar5 = new zzfj(this.zzm);
                    ((zzabu) zzacfVar).zzn(zzfjVar5.zzI(), 0, this.zzm, false);
                    if (zzfjVar5.zza() < 16) {
                        j = 0;
                    } else {
                        int zzc2 = zzfjVar5.zzc();
                        zzfjVar5.zzH(8);
                        long zzh4 = zzfjVar5.zzh();
                        long j5 = this.zzk;
                        j = zzh4 > j5 ? 0L : j5 + 8;
                        zzfjVar5.zzG(zzc2);
                    }
                    while (zzfjVar5.zza() >= 16) {
                        int zzh5 = zzfjVar5.zzh();
                        int zzh6 = zzfjVar5.zzh();
                        long zzh7 = zzfjVar5.zzh() + j;
                        zzfjVar5.zzh();
                        zzaea zzf3 = zzf(zzh5);
                        if (zzf3 != null) {
                            if ((zzh6 & 16) == 16) {
                                zzf3.zzb(zzh7);
                            }
                            zzf3.zzd();
                        }
                    }
                    for (zzaea zzaeaVar3 : this.zzg) {
                        zzaeaVar3.zzc();
                    }
                    this.zzn = true;
                    this.zzd.zzO(new zzadu(this, this.zzf));
                    this.zzc = 6;
                    this.zzh = this.zzk;
                    return 0;
                }
                if (zzacfVar.zzf() >= this.zzl) {
                    return -1;
                }
                zzaea zzaeaVar4 = this.zzi;
                if (zzaeaVar4 != null) {
                    if (!zzaeaVar4.zzh(zzacfVar)) {
                        return 0;
                    }
                    this.zzi = null;
                    return 0;
                }
                if ((zzacfVar.zzf() & 1) == 1) {
                    ((zzabu) zzacfVar).zzo(1, false);
                }
                zzabu zzabuVar2 = (zzabu) zzacfVar;
                zzabuVar2.zzm(this.zza.zzI(), 0, 12, false);
                this.zza.zzG(0);
                int zzh8 = this.zza.zzh();
                if (zzh8 == 1414744396) {
                    this.zza.zzG(8);
                    zzabuVar2.zzo(this.zza.zzh() != 1769369453 ? 8 : 12, false);
                    zzacfVar.zzj();
                    return 0;
                }
                int zzh9 = this.zza.zzh();
                if (zzh8 == 1263424842) {
                    this.zzh = zzacfVar.zzf() + zzh9 + 8;
                    return 0;
                }
                zzabuVar2.zzo(8, false);
                zzacfVar.zzj();
                zzaea zzf4 = zzf(zzh8);
                if (zzf4 == null) {
                    this.zzh = zzacfVar.zzf() + zzh9;
                    return 0;
                }
                zzf4.zze(zzh9);
                this.zzi = zzf4;
                return 0;
            }
            ((zzabu) zzacfVar).zzo((int) (j2 - zzf), false);
        }
        z = false;
        this.zzh = -1L;
        if (!z) {
        }
    }
}
