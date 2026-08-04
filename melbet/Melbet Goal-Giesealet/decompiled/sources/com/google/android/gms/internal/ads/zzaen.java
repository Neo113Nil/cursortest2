package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaen implements zzacu {
    private final zzef zza;
    private final zzaem zzb;
    private final boolean zzc;
    private final zzajt zzd;
    private int zze;
    private zzacx zzf;
    private zzaeo zzg;
    private long zzh;
    private zzaeq[] zzi;
    private long zzj;
    private zzaeq zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaen() {
        this(1, zzajt.zza);
    }

    private final zzaeq zzb(int i) {
        for (zzaeq zzaeqVar : this.zzi) {
            if (zzaeqVar.zzc(i)) {
                return zzaeqVar;
            }
        }
        return null;
    }

    final /* synthetic */ zzaeq[] zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzef zzefVar = this.zza;
        zzacvVar.zzi(zzefVar.zzi(), 0, 12);
        zzefVar.zzh(0);
        if (zzefVar.zzC() != 1179011410) {
            return false;
        }
        zzefVar.zzk(4);
        return zzefVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zze = 0;
        if (this.zzc) {
            zzacxVar = new zzajw(zzacxVar, this.zzd);
        }
        this.zzf = zzacxVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaeq zzaeqVar : this.zzi) {
            zzaeqVar.zzf(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    public zzaen(int i, zzajt zzajtVar) {
        this.zzd = zzajtVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzef(12);
        this.zzb = new zzaem(null);
        this.zzf = new zzadq();
        this.zzi = new zzaeq[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [int] */
    /* JADX WARN: Type inference failed for: r20v4 */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        boolean z;
        ?? r20;
        long j;
        long j2 = this.zzj;
        if (j2 != -1) {
            long zzn = zzacvVar.zzn();
            if (j2 < zzn || j2 > 262144 + zzn) {
                zzadsVar.zza = j2;
                z = true;
                this.zzj = -1L;
                if (!z) {
                    return 1;
                }
                int i = this.zze;
                zzaeq zzaeqVar = null;
                if (i == 0) {
                    if (!zzd(zzacvVar)) {
                        throw zzas.zzb("AVI Header List not found", null);
                    }
                    zzacvVar.zzf(12);
                    this.zze = 1;
                    return 0;
                }
                if (i == 1) {
                    zzef zzefVar = this.zza;
                    zzacvVar.zzc(zzefVar.zzi(), 0, 12);
                    zzefVar.zzh(0);
                    zzaem zzaemVar = this.zzb;
                    zzaemVar.zza(zzefVar);
                    int i2 = zzaemVar.zza;
                    if (i2 != 1414744396) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                        sb.append("LIST expected, found: ");
                        sb.append(i2);
                        throw zzas.zzb(sb.toString(), null);
                    }
                    int zzC = zzefVar.zzC();
                    if (zzC == 1819436136) {
                        this.zzl = zzaemVar.zzb;
                        this.zze = 2;
                        return 0;
                    }
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzC).length() + 22);
                    sb2.append("hdrl expected, found: ");
                    sb2.append(zzC);
                    throw zzas.zzb(sb2.toString(), null);
                }
                if (i == 2) {
                    int i3 = this.zzl - 4;
                    zzef zzefVar2 = new zzef(i3);
                    zzacvVar.zzc(zzefVar2.zzi(), 0, i3);
                    zzaer zzb = zzaer.zzb(1819436136, zzefVar2);
                    if (zzb.zza() != 1819436136) {
                        int zza = zzb.zza();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(zza).length() + 28);
                        sb3.append("Unexpected header list type ");
                        sb3.append(zza);
                        throw zzas.zzb(sb3.toString(), null);
                    }
                    zzaeo zzaeoVar = (zzaeo) zzb.zzc(zzaeo.class);
                    if (zzaeoVar == null) {
                        throw zzas.zzb("AviHeader not found", null);
                    }
                    this.zzg = zzaeoVar;
                    this.zzh = zzaeoVar.zzc * zzaeoVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzgjz zzgjzVar = zzb.zza;
                    int size = zzgjzVar.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size) {
                        zzaek zzaekVar = (zzaek) zzgjzVar.get(i4);
                        if (zzaekVar.zza() == 1819440243) {
                            zzaer zzaerVar = (zzaer) zzaekVar;
                            int i6 = i5 + 1;
                            zzaep zzaepVar = (zzaep) zzaerVar.zzc(zzaep.class);
                            zzaes zzaesVar = (zzaes) zzaerVar.zzc(zzaes.class);
                            if (zzaepVar == null) {
                                zzds.zzc("AviExtractor", "Missing Stream Header");
                            } else if (zzaesVar == null) {
                                zzds.zzc("AviExtractor", "Missing Stream Format");
                            } else {
                                long zzd = zzaepVar.zzd();
                                zzu zzuVar = zzaesVar.zza;
                                zzs zza2 = zzuVar.zza();
                                zza2.zzb(i5);
                                int i7 = zzaepVar.zze;
                                if (i7 != 0) {
                                    zza2.zzn(i7);
                                }
                                zzaet zzaetVar = (zzaet) zzaerVar.zzc(zzaet.class);
                                if (zzaetVar != null) {
                                    zza2.zzc(zzaetVar.zza);
                                }
                                int zzg = zzar.zzg(zzuVar.zzo);
                                if (zzg != 1) {
                                    if (zzg == 2) {
                                        zzg = 2;
                                    } else {
                                        zzaeqVar = null;
                                    }
                                }
                                zzaeb zzu = this.zzf.zzu(i5, zzg);
                                zzu.zzu(zza2.zzM());
                                this.zzh = Math.max(this.zzh, zzd);
                                zzaeqVar = new zzaeq(i5, zzaepVar, zzu);
                            }
                            if (zzaeqVar != null) {
                                arrayList.add(zzaeqVar);
                            }
                            i5 = i6;
                        }
                        i4++;
                        zzaeqVar = null;
                    }
                    this.zzi = (zzaeq[]) arrayList.toArray(new zzaeq[0]);
                    this.zzf.zzv();
                    this.zze = 3;
                    return 0;
                }
                if (i == 3) {
                    long j3 = this.zzm;
                    if (j3 != -1 && zzacvVar.zzn() != j3) {
                        this.zzj = j3;
                        return 0;
                    }
                    zzef zzefVar3 = this.zza;
                    zzacvVar.zzi(zzefVar3.zzi(), 0, 12);
                    zzacvVar.zzl();
                    zzefVar3.zzh(0);
                    zzaem zzaemVar2 = this.zzb;
                    zzaemVar2.zza(zzefVar3);
                    int zzC2 = zzefVar3.zzC();
                    int i8 = zzaemVar2.zza;
                    if (i8 == 1179011410) {
                        zzacvVar.zzf(12);
                        return 0;
                    }
                    if (i8 != 1414744396 || zzC2 != 1769369453) {
                        this.zzj = zzacvVar.zzn() + zzaemVar2.zzb + 8;
                        return 0;
                    }
                    long zzn2 = zzacvVar.zzn();
                    this.zzm = zzn2;
                    long j4 = zzn2 + zzaemVar2.zzb + 8;
                    this.zzn = j4;
                    if (!this.zzp) {
                        zzaeo zzaeoVar2 = this.zzg;
                        zzaeoVar2.getClass();
                        if ((zzaeoVar2.zzb & 16) == 16) {
                            this.zze = 4;
                            this.zzj = j4;
                            return 0;
                        }
                        this.zzf.zzw(new zzadu(this.zzh, 0L));
                        this.zzp = true;
                    }
                    this.zzj = zzacvVar.zzn() + 12;
                    this.zze = 6;
                    return 0;
                }
                if (i == 4) {
                    zzef zzefVar4 = this.zza;
                    zzacvVar.zzc(zzefVar4.zzi(), 0, 8);
                    zzefVar4.zzh(0);
                    int zzC3 = zzefVar4.zzC();
                    int zzC4 = zzefVar4.zzC();
                    if (zzC3 != 829973609) {
                        this.zzj = zzacvVar.zzn() + zzC4;
                        return 0;
                    }
                    this.zze = 5;
                    this.zzo = zzC4;
                    return 0;
                }
                if (i != 5) {
                    if (zzacvVar.zzn() >= this.zzn) {
                        return -1;
                    }
                    zzaeq zzaeqVar2 = this.zzk;
                    if (zzaeqVar2 != null) {
                        if (!zzaeqVar2.zze(zzacvVar)) {
                            return 0;
                        }
                        this.zzk = null;
                        return 0;
                    }
                    if ((zzacvVar.zzn() & 1) == 1) {
                        zzacvVar.zzf(1);
                    }
                    zzef zzefVar5 = this.zza;
                    zzacvVar.zzi(zzefVar5.zzi(), 0, 12);
                    zzefVar5.zzh(0);
                    int zzC5 = zzefVar5.zzC();
                    if (zzC5 == 1414744396) {
                        zzefVar5.zzh(8);
                        zzacvVar.zzf(zzefVar5.zzC() != 1769369453 ? 8 : 12);
                        zzacvVar.zzl();
                        return 0;
                    }
                    int zzC6 = zzefVar5.zzC();
                    if (zzC5 == 1263424842) {
                        this.zzj = zzacvVar.zzn() + zzC6 + 8;
                        return 0;
                    }
                    zzacvVar.zzf(8);
                    zzacvVar.zzl();
                    zzaeq zzb2 = zzb(zzC5);
                    if (zzb2 == null) {
                        this.zzj = zzacvVar.zzn() + zzC6;
                        return 0;
                    }
                    zzb2.zzd(zzC6);
                    this.zzk = zzb2;
                    return 0;
                }
                zzef zzefVar6 = new zzef(this.zzo);
                zzacvVar.zzc(zzefVar6.zzi(), 0, this.zzo);
                if (zzefVar6.zzd() < 16) {
                    r20 = 0;
                    j = 0;
                } else {
                    int zzg2 = zzefVar6.zzg();
                    zzefVar6.zzk(8);
                    long zzC7 = zzefVar6.zzC();
                    r20 = 0;
                    long j5 = this.zzm;
                    j = zzC7 > j5 ? 0L : j5 + 8;
                    zzefVar6.zzh(zzg2);
                }
                while (zzefVar6.zzd() >= 16) {
                    int zzC8 = zzefVar6.zzC();
                    int zzC9 = zzefVar6.zzC();
                    long zzC10 = zzefVar6.zzC() + j;
                    zzefVar6.zzk(4);
                    zzaeq zzb3 = zzb(zzC8);
                    if (zzb3 != null) {
                        zzb3.zza(zzC10, (zzC9 & 16) == 16 ? true : r20);
                    }
                }
                zzaeq[] zzaeqVarArr = this.zzi;
                int length = zzaeqVarArr.length;
                for (int i9 = r20; i9 < length; i9++) {
                    zzaeqVarArr[i9].zzb();
                }
                this.zzp = true;
                if (this.zzi.length == 0) {
                    this.zzf.zzw(new zzadu(this.zzh, 0L));
                } else {
                    this.zzf.zzw(new zzael(this, this.zzh));
                }
                this.zze = 6;
                this.zzj = this.zzm;
                return r20;
            }
            zzacvVar.zzf((int) (j2 - zzn));
        }
        z = false;
        this.zzj = -1L;
        if (!z) {
        }
    }
}
