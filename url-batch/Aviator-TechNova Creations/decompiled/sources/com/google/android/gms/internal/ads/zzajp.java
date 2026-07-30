package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzajp implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private final zzer zzb;
    private final zzafr zzc;
    private final zzafn zzd;
    private final zzafp zze;
    private final zzagh zzf;
    private zzaex zzg;
    private zzagh zzh;
    private zzagh zzi;
    private int zzj;
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzajr zzq;
    private boolean zzr;

    static {
        int i = zzajn.zza;
    }

    public zzajp() {
        throw null;
    }

    public zzajp(int i) {
        this.zzb = new zzer(10);
        this.zzc = new zzafr();
        this.zzd = new zzafn();
        this.zzl = -9223372036854775807L;
        this.zze = new zzafp();
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzi = zzaerVar;
        this.zzo = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.google.android.gms.internal.ads.zzajr] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v65 */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzi(zzaev zzaevVar) throws IOException {
        long j;
        Throwable th;
        int i;
        zzafn zzafnVar;
        long j2;
        int i2;
        Object zzajkVar;
        int i3;
        int i4;
        zzap zzapVar;
        long zzn;
        zzaiq zzaiqVar;
        Object zzd;
        zzajq zzajqVar;
        Object obj;
        if (this.zzj == 0) {
            try {
                zzk(zzaevVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzafr zzafrVar = this.zzc;
            zzer zzerVar = new zzer(zzafrVar.zzc);
            zzaevVar.zzi(zzerVar.zzi(), 0, zzafrVar.zzc);
            int i5 = 21;
            if ((zzafrVar.zza & 1) != 0) {
                if (zzafrVar.zze != 1) {
                    i5 = 36;
                }
            } else if (zzafrVar.zze == 1) {
                i5 = 13;
            }
            j = -9223372036854775807L;
            if (zzerVar.zze() >= i5 + 4) {
                zzerVar.zzh(i5);
                i = zzerVar.zzB();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                if (i != 1231971951) {
                    if (i == 1447187017) {
                        Object zzd2 = zzajs.zzd(zzaevVar.zzo(), zzaevVar.zzn(), zzafrVar, zzerVar);
                        zzaevVar.zzf(zzafrVar.zzc);
                        obj = zzd2;
                    } else if (i != 1483304551) {
                        zzaevVar.zzl();
                        obj = null;
                    }
                    th = null;
                    zzajkVar = obj;
                    zzapVar = this.zzk;
                    zzn = zzaevVar.zzn();
                    if (zzapVar == null || (zzaiqVar = (zzaiq) zzapVar.zzc(zzaiq.class, zzgrg.zza())) == null) {
                        zzd = th;
                    } else {
                        zzais zzaisVar = (zzais) zzapVar.zzc(zzais.class, zzajo.zza);
                        zzd = zzajm.zzd(zzn, zzaiqVar, zzaisVar != null ? -9223372036854775807L : zzfj.zzq(Long.parseLong((String) zzaisVar.zzb.get(0))));
                    }
                    ?? r2 = zzajkVar;
                    if (this.zzr) {
                        if (zzd != null) {
                            r2 = zzd;
                        } else if (zzajkVar == null) {
                            r2 = th;
                        }
                        if (r2 == 0) {
                            zzer zzerVar2 = this.zzb;
                            zzaevVar.zzi(zzerVar2.zzi(), 0, 4);
                            zzerVar2.zzh(0);
                            zzafrVar.zza(zzerVar2.zzB());
                            r2 = new zzajk(zzaevVar.zzo(), zzaevVar.zzn(), zzafrVar.zzf, zzafrVar.zzc, false);
                        }
                        this.zzh.zzN(r2.zza());
                        zzajqVar = r2;
                    } else {
                        zzajqVar = new zzajq();
                    }
                    this.zzq = zzajqVar;
                    this.zzg.zzw(zzajqVar);
                    zzt zztVar = new zzt();
                    zztVar.zzl("audio/mpeg");
                    zztVar.zzm(zzafrVar.zzb);
                    zztVar.zzn(4096);
                    zztVar.zzE(zzafrVar.zze);
                    zztVar.zzF(zzafrVar.zzd);
                    zzafn zzafnVar2 = this.zzd;
                    zztVar.zzH(zzafnVar2.zza);
                    zztVar.zzI(zzafnVar2.zzb);
                    zztVar.zzk(this.zzk);
                    if (this.zzq.zzg() != -2147483647) {
                        zztVar.zzh(this.zzq.zzg());
                    }
                    this.zzi.zzz(zztVar.zzM());
                    this.zzn = zzaevVar.zzn();
                }
                zzajt zza2 = zzajt.zza(zzafrVar, zzerVar);
                zzafnVar = this.zzd;
                if (!zzafnVar.zzb() && (i3 = zza2.zzd) != -1 && (i4 = zza2.zze) != -1) {
                    zzafnVar.zza = i3;
                    zzafnVar.zzb = i4;
                }
                long zzn2 = zzaevVar.zzn();
                if (zzaevVar.zzo() != -1) {
                    long j3 = zza2.zzc;
                    if (j3 != -1) {
                        long j4 = j3 + zzn2;
                        if (zzaevVar.zzo() != j4) {
                            j2 = -1;
                            long zzo = zzaevVar.zzo();
                            th = null;
                            StringBuilder sb = new StringBuilder(String.valueOf(zzo).length() + 53 + String.valueOf(j4).length() + 20);
                            sb.append("Data size mismatch between stream (");
                            sb.append(zzo);
                            sb.append(") and Xing frame (");
                            sb.append(j4);
                            sb.append("), using Xing value.");
                            zzee.zzb("Mp3Extractor", sb.toString());
                            zzaevVar.zzf(zzafrVar.zzc);
                            if (i != 1483304551) {
                                zzajkVar = zzaju.zzd(zza2, zzn2);
                            } else {
                                long zzo2 = zzaevVar.zzo();
                                long zzb = zza2.zzb();
                                if (zzb != -9223372036854775807L) {
                                    long j5 = zza2.zzc;
                                    if (j5 != j2) {
                                        zzo2 = zzn2 + j5;
                                        i2 = zza2.zza.zzc;
                                    } else if (zzo2 != j2) {
                                        j5 = zzo2 - zzn2;
                                        i2 = zza2.zza.zzc;
                                    }
                                    long j6 = j5 - i2;
                                    zzajkVar = new zzajk(zzo2, zzn2 + zza2.zza.zzc, zzgxz.zza(zzfj.zzt(j6, 8000000L, zzb, RoundingMode.HALF_UP)), zzgxz.zza(zzgxu.zza(j6, zza2.zzb, RoundingMode.HALF_UP)), false);
                                }
                                zzajkVar = th;
                            }
                            zzapVar = this.zzk;
                            zzn = zzaevVar.zzn();
                            if (zzapVar == null) {
                                zzais zzaisVar2 = (zzais) zzapVar.zzc(zzais.class, zzajo.zza);
                                zzd = zzajm.zzd(zzn, zzaiqVar, zzaisVar2 != null ? -9223372036854775807L : zzfj.zzq(Long.parseLong((String) zzaisVar2.zzb.get(0))));
                                ?? r22 = zzajkVar;
                                if (this.zzr) {
                                }
                                this.zzq = zzajqVar;
                                this.zzg.zzw(zzajqVar);
                                zzt zztVar2 = new zzt();
                                zztVar2.zzl("audio/mpeg");
                                zztVar2.zzm(zzafrVar.zzb);
                                zztVar2.zzn(4096);
                                zztVar2.zzE(zzafrVar.zze);
                                zztVar2.zzF(zzafrVar.zzd);
                                zzafn zzafnVar22 = this.zzd;
                                zztVar2.zzH(zzafnVar22.zza);
                                zztVar2.zzI(zzafnVar22.zzb);
                                zztVar2.zzk(this.zzk);
                                if (this.zzq.zzg() != -2147483647) {
                                }
                                this.zzi.zzz(zztVar2.zzM());
                                this.zzn = zzaevVar.zzn();
                            }
                            zzd = th;
                            ?? r222 = zzajkVar;
                            if (this.zzr) {
                            }
                            this.zzq = zzajqVar;
                            this.zzg.zzw(zzajqVar);
                            zzt zztVar22 = new zzt();
                            zztVar22.zzl("audio/mpeg");
                            zztVar22.zzm(zzafrVar.zzb);
                            zztVar22.zzn(4096);
                            zztVar22.zzE(zzafrVar.zze);
                            zztVar22.zzF(zzafrVar.zzd);
                            zzafn zzafnVar222 = this.zzd;
                            zztVar22.zzH(zzafnVar222.zza);
                            zztVar22.zzI(zzafnVar222.zzb);
                            zztVar22.zzk(this.zzk);
                            if (this.zzq.zzg() != -2147483647) {
                            }
                            this.zzi.zzz(zztVar22.zzM());
                            this.zzn = zzaevVar.zzn();
                        }
                    }
                }
                j2 = -1;
                th = null;
                zzaevVar.zzf(zzafrVar.zzc);
                if (i != 1483304551) {
                }
                zzapVar = this.zzk;
                zzn = zzaevVar.zzn();
                if (zzapVar == null) {
                }
                zzd = th;
                ?? r2222 = zzajkVar;
                if (this.zzr) {
                }
                this.zzq = zzajqVar;
                this.zzg.zzw(zzajqVar);
                zzt zztVar222 = new zzt();
                zztVar222.zzl("audio/mpeg");
                zztVar222.zzm(zzafrVar.zzb);
                zztVar222.zzn(4096);
                zztVar222.zzE(zzafrVar.zze);
                zztVar222.zzF(zzafrVar.zzd);
                zzafn zzafnVar2222 = this.zzd;
                zztVar222.zzH(zzafnVar2222.zza);
                zztVar222.zzI(zzafnVar2222.zzb);
                zztVar222.zzk(this.zzk);
                if (this.zzq.zzg() != -2147483647) {
                }
                this.zzi.zzz(zztVar222.zzM());
                this.zzn = zzaevVar.zzn();
            }
            if (zzerVar.zze() >= 40) {
                zzerVar.zzh(36);
                if (zzerVar.zzB() == 1447187017) {
                    i = 1447187017;
                    if (i != 1231971951) {
                    }
                    zzajt zza22 = zzajt.zza(zzafrVar, zzerVar);
                    zzafnVar = this.zzd;
                    if (!zzafnVar.zzb()) {
                        zzafnVar.zza = i3;
                        zzafnVar.zzb = i4;
                    }
                    long zzn22 = zzaevVar.zzn();
                    if (zzaevVar.zzo() != -1) {
                    }
                    j2 = -1;
                    th = null;
                    zzaevVar.zzf(zzafrVar.zzc);
                    if (i != 1483304551) {
                    }
                    zzapVar = this.zzk;
                    zzn = zzaevVar.zzn();
                    if (zzapVar == null) {
                    }
                    zzd = th;
                    ?? r22222 = zzajkVar;
                    if (this.zzr) {
                    }
                    this.zzq = zzajqVar;
                    this.zzg.zzw(zzajqVar);
                    zzt zztVar2222 = new zzt();
                    zztVar2222.zzl("audio/mpeg");
                    zztVar2222.zzm(zzafrVar.zzb);
                    zztVar2222.zzn(4096);
                    zztVar2222.zzE(zzafrVar.zze);
                    zztVar2222.zzF(zzafrVar.zzd);
                    zzafn zzafnVar22222 = this.zzd;
                    zztVar2222.zzH(zzafnVar22222.zza);
                    zztVar2222.zzI(zzafnVar22222.zzb);
                    zztVar2222.zzk(this.zzk);
                    if (this.zzq.zzg() != -2147483647) {
                    }
                    this.zzi.zzz(zztVar2222.zzM());
                    this.zzn = zzaevVar.zzn();
                }
            }
            i = 0;
            if (i != 1231971951) {
            }
            zzajt zza222 = zzajt.zza(zzafrVar, zzerVar);
            zzafnVar = this.zzd;
            if (!zzafnVar.zzb()) {
            }
            long zzn222 = zzaevVar.zzn();
            if (zzaevVar.zzo() != -1) {
            }
            j2 = -1;
            th = null;
            zzaevVar.zzf(zzafrVar.zzc);
            if (i != 1483304551) {
            }
            zzapVar = this.zzk;
            zzn = zzaevVar.zzn();
            if (zzapVar == null) {
            }
            zzd = th;
            ?? r222222 = zzajkVar;
            if (this.zzr) {
            }
            this.zzq = zzajqVar;
            this.zzg.zzw(zzajqVar);
            zzt zztVar22222 = new zzt();
            zztVar22222.zzl("audio/mpeg");
            zztVar22222.zzm(zzafrVar.zzb);
            zztVar22222.zzn(4096);
            zztVar22222.zzE(zzafrVar.zze);
            zztVar22222.zzF(zzafrVar.zzd);
            zzafn zzafnVar222222 = this.zzd;
            zztVar22222.zzH(zzafnVar222222.zza);
            zztVar22222.zzI(zzafnVar222222.zzb);
            zztVar22222.zzk(this.zzk);
            if (this.zzq.zzg() != -2147483647) {
            }
            this.zzi.zzz(zztVar22222.zzM());
            this.zzn = zzaevVar.zzn();
        } else {
            j = -9223372036854775807L;
            th = null;
            long j7 = this.zzn;
            if (j7 != 0) {
                long zzn3 = zzaevVar.zzn();
                if (zzn3 < j7) {
                    zzaevVar.zzf((int) (j7 - zzn3));
                }
            }
        }
        int i6 = this.zzp;
        if (i6 == 0) {
            zzaevVar.zzl();
            if (zzl(zzaevVar)) {
                return -1;
            }
            zzer zzerVar3 = this.zzb;
            zzerVar3.zzh(0);
            int zzB = zzerVar3.zzB();
            if (!zzn(zzB, this.zzj) || zzafs.zza(zzB) == -1) {
                zzaevVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzafr zzafrVar2 = this.zzc;
            zzafrVar2.zza(zzB);
            if (this.zzl == j) {
                this.zzl = this.zzq.zze(zzaevVar.zzn());
            }
            i6 = zzafrVar2.zzc;
            this.zzp = i6;
            this.zzo = zzaevVar.zzn() + i6;
            zzajr zzajrVar = this.zzq;
            if (zzajrVar instanceof zzajl) {
                zzj(this.zzm + zzafrVar2.zzg);
                throw th;
            }
        }
        int zza3 = this.zzi.zza(zzaevVar, i6, true);
        if (zza3 == -1) {
            return -1;
        }
        int i7 = this.zzp - zza3;
        this.zzp = i7;
        if (i7 > 0) {
            return 0;
        }
        this.zzi.zze(zzj(this.zzm), 1, this.zzc.zzc, 0, null);
        this.zzm += r1.zzg;
        this.zzp = 0;
        return 0;
    }

    private final long zzj(long j) {
        return this.zzl + ((j * 1000000) / this.zzc.zzd);
    }

    private final boolean zzk(zzaev zzaevVar, boolean z) throws IOException {
        int i;
        int i2;
        int zza2;
        zzaevVar.zzl();
        if (zzaevVar.zzn() == 0) {
            zzap zza3 = this.zze.zza(zzaevVar, null, 131072);
            this.zzk = zza3;
            if (zza3 != null) {
                this.zzd.zza(zza3);
            }
            i = (int) zzaevVar.zzm();
            if (!z) {
                zzaevVar.zzf(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!zzl(zzaevVar)) {
                zzer zzerVar = this.zzb;
                zzerVar.zzh(0);
                int zzB = zzerVar.zzB();
                if ((i2 == 0 || zzn(zzB, i2)) && (zza2 = zzafs.zza(zzB)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(zzB);
                        i2 = zzB;
                    }
                    zzaevVar.zzk(zza2 - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z) {
                        zzaevVar.zzl();
                        zzaevVar.zzk(i + i5);
                    } else {
                        zzaevVar.zzf(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                zzm();
                throw new EOFException();
            }
        }
        if (z) {
            zzaevVar.zzf(i + i4);
        } else {
            zzaevVar.zzl();
        }
        this.zzj = i2;
        return true;
    }

    private final boolean zzl(zzaev zzaevVar) throws IOException {
        zzajr zzajrVar = this.zzq;
        if (zzajrVar != null) {
            long zzf = zzajrVar.zzf();
            if (zzf != -1 && zzaevVar.zzm() > zzf - 4) {
                return true;
            }
        }
        try {
            return !zzaevVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzajr zzajrVar = this.zzq;
        if ((zzajrVar instanceof zzajk) && zzajrVar.zzb()) {
            long j = this.zzo;
            if (j == -1 || j == this.zzq.zzf()) {
                return;
            }
            this.zzq = ((zzajk) this.zzq).zzh(this.zzo);
            zzaex zzaexVar = this.zzg;
            zzaexVar.getClass();
            zzaexVar.zzw(this.zzq);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    private static boolean zzn(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzk(zzaevVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzg = zzaexVar;
        zzagh zzu = zzaexVar.zzu(0, 1);
        this.zzh = zzu;
        this.zzi = zzu;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zzh.getClass();
        String str = zzfj.zza;
        int zzi = zzi(zzaevVar);
        if (zzi == -1 && (this.zzq instanceof zzajl)) {
            if (this.zzq.zza() != zzj(this.zzm)) {
                throw null;
            }
        }
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j, long j2) {
        this.zzj = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = 0L;
        this.zzp = 0;
        this.zzo = -1L;
        zzajr zzajrVar = this.zzq;
        if (zzajrVar instanceof zzajl) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    public final void zzh() {
        this.zzr = true;
    }
}
