package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzahg implements zzacu {
    private final zzef zza;
    private final zzado zzb;
    private final zzadk zzc;
    private final zzadm zzd;
    private final zzaeb zze;
    private zzacx zzf;
    private zzaeb zzg;
    private zzaeb zzh;
    private int zzi;
    private zzao zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzahi zzp;
    private boolean zzq;

    static {
        int i = zzahf.zza;
    }

    public zzahg() {
        throw null;
    }

    public zzahg(int i) {
        this.zza = new zzef(10);
        this.zzb = new zzado();
        this.zzc = new zzadk();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzadm();
        zzacr zzacrVar = new zzacr();
        this.zze = zzacrVar;
        this.zzh = zzacrVar;
        this.zzn = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b9  */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahi] */
    /* JADX WARN: Type inference failed for: r2v52, types: [com.google.android.gms.internal.ads.zzahh] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.ads.zzacx] */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzb(zzacv zzacvVar) throws IOException {
        long j;
        Throwable th;
        int i;
        zzadk zzadkVar;
        long j2;
        int i2;
        Object zzahcVar;
        int i3;
        int i4;
        zzao zzaoVar;
        Object obj;
        long j3;
        Object obj2;
        if (this.zzi == 0) {
            try {
                zzj(zzacvVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzp == null) {
            zzado zzadoVar = this.zzb;
            zzef zzefVar = new zzef(zzadoVar.zzc);
            zzacvVar.zzi(zzefVar.zzi(), 0, zzadoVar.zzc);
            int i5 = 21;
            if ((zzadoVar.zza & 1) != 0) {
                if (zzadoVar.zze != 1) {
                    i5 = 36;
                }
            } else if (zzadoVar.zze == 1) {
                i5 = 13;
            }
            j = -9223372036854775807L;
            if (zzefVar.zze() >= i5 + 4) {
                zzefVar.zzh(i5);
                i = zzefVar.zzB();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                if (i != 1231971951) {
                    if (i == 1447187017) {
                        Object zzd = zzahj.zzd(zzacvVar.zzo(), zzacvVar.zzn(), zzadoVar, zzefVar);
                        zzacvVar.zzf(zzadoVar.zzc);
                        obj2 = zzd;
                    } else if (i != 1483304551) {
                        zzacvVar.zzl();
                        obj2 = null;
                    }
                    th = null;
                    zzahcVar = obj2;
                    zzaoVar = this.zzj;
                    long zzn = zzacvVar.zzn();
                    if (zzaoVar != null) {
                        int zza = zzaoVar.zza();
                        for (int i6 = 0; i6 < zza; i6++) {
                            zzan zzb = zzaoVar.zzb(i6);
                            if (zzb instanceof zzagk) {
                                zzagk zzagkVar = (zzagk) zzb;
                                int zza2 = zzaoVar.zza();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= zza2) {
                                        j3 = -9223372036854775807L;
                                        break;
                                    }
                                    zzan zzb2 = zzaoVar.zzb(i7);
                                    if (zzb2 instanceof zzagm) {
                                        zzagm zzagmVar = (zzagm) zzb2;
                                        if (zzagmVar.zzf.equals("TLEN")) {
                                            j3 = zzeo.zzq(Long.parseLong((String) zzagmVar.zzb.get(0)));
                                            break;
                                        }
                                    }
                                    i7++;
                                }
                                obj = zzahe.zzd(zzn, zzagkVar, j3);
                                ?? r2 = zzahcVar;
                                if (this.zzq) {
                                    if (obj != null) {
                                        r2 = obj;
                                    } else if (zzahcVar == null) {
                                        r2 = th;
                                    }
                                    if (r2 == 0) {
                                        zzef zzefVar2 = this.zza;
                                        zzacvVar.zzi(zzefVar2.zzi(), 0, 4);
                                        zzefVar2.zzh(0);
                                        zzadoVar.zza(zzefVar2.zzB());
                                        r2 = new zzahc(zzacvVar.zzo(), zzacvVar.zzn(), zzadoVar.zzf, zzadoVar.zzc, false);
                                    }
                                } else {
                                    r2 = new zzahh();
                                }
                                this.zzp = r2;
                                this.zzf.zzw(r2);
                                zzs zzsVar = new zzs();
                                zzsVar.zzl("audio/mpeg");
                                zzsVar.zzm(zzadoVar.zzb);
                                zzsVar.zzn(4096);
                                zzsVar.zzE(zzadoVar.zze);
                                zzsVar.zzF(zzadoVar.zzd);
                                zzadk zzadkVar2 = this.zzc;
                                zzsVar.zzH(zzadkVar2.zza);
                                zzsVar.zzI(zzadkVar2.zzb);
                                zzsVar.zzk(this.zzj);
                                if (this.zzp.zzg() != -2147483647) {
                                    zzsVar.zzh(this.zzp.zzg());
                                }
                                this.zzh.zzu(zzsVar.zzM());
                                this.zzm = zzacvVar.zzn();
                            }
                        }
                    }
                    obj = th;
                    ?? r22 = zzahcVar;
                    if (this.zzq) {
                    }
                    this.zzp = r22;
                    this.zzf.zzw(r22);
                    zzs zzsVar2 = new zzs();
                    zzsVar2.zzl("audio/mpeg");
                    zzsVar2.zzm(zzadoVar.zzb);
                    zzsVar2.zzn(4096);
                    zzsVar2.zzE(zzadoVar.zze);
                    zzsVar2.zzF(zzadoVar.zzd);
                    zzadk zzadkVar22 = this.zzc;
                    zzsVar2.zzH(zzadkVar22.zza);
                    zzsVar2.zzI(zzadkVar22.zzb);
                    zzsVar2.zzk(this.zzj);
                    if (this.zzp.zzg() != -2147483647) {
                    }
                    this.zzh.zzu(zzsVar2.zzM());
                    this.zzm = zzacvVar.zzn();
                }
                zzahk zza3 = zzahk.zza(zzadoVar, zzefVar);
                zzadkVar = this.zzc;
                if (!zzadkVar.zzb() && (i3 = zza3.zzd) != -1 && (i4 = zza3.zze) != -1) {
                    zzadkVar.zza = i3;
                    zzadkVar.zzb = i4;
                }
                long zzn2 = zzacvVar.zzn();
                if (zzacvVar.zzo() != -1) {
                    long j4 = zza3.zzc;
                    if (j4 != -1) {
                        long j5 = j4 + zzn2;
                        if (zzacvVar.zzo() != j5) {
                            j2 = -1;
                            long zzo = zzacvVar.zzo();
                            th = null;
                            StringBuilder sb = new StringBuilder(String.valueOf(zzo).length() + 53 + String.valueOf(j5).length() + 20);
                            sb.append("Data size mismatch between stream (");
                            sb.append(zzo);
                            sb.append(") and Xing frame (");
                            sb.append(j5);
                            sb.append("), using Xing value.");
                            zzds.zzb("Mp3Extractor", sb.toString());
                            zzacvVar.zzf(zzadoVar.zzc);
                            if (i != 1483304551) {
                                zzahcVar = zzahl.zzd(zza3, zzn2);
                            } else {
                                long zzo2 = zzacvVar.zzo();
                                long zzb3 = zza3.zzb();
                                if (zzb3 != -9223372036854775807L) {
                                    long j6 = zza3.zzc;
                                    if (j6 != j2) {
                                        zzo2 = zzn2 + j6;
                                        i2 = zza3.zza.zzc;
                                    } else if (zzo2 != j2) {
                                        j6 = zzo2 - zzn2;
                                        i2 = zza3.zza.zzc;
                                    }
                                    long j7 = j6 - i2;
                                    zzahcVar = new zzahc(zzo2, zzn2 + zza3.zza.zzc, zzgne.zza(zzeo.zzt(j7, 8000000L, zzb3, RoundingMode.HALF_UP)), zzgne.zza(zzgmz.zza(j7, zza3.zzb, RoundingMode.HALF_UP)), false);
                                }
                                zzahcVar = th;
                            }
                            zzaoVar = this.zzj;
                            long zzn3 = zzacvVar.zzn();
                            if (zzaoVar != null) {
                            }
                            obj = th;
                            ?? r222 = zzahcVar;
                            if (this.zzq) {
                            }
                            this.zzp = r222;
                            this.zzf.zzw(r222);
                            zzs zzsVar22 = new zzs();
                            zzsVar22.zzl("audio/mpeg");
                            zzsVar22.zzm(zzadoVar.zzb);
                            zzsVar22.zzn(4096);
                            zzsVar22.zzE(zzadoVar.zze);
                            zzsVar22.zzF(zzadoVar.zzd);
                            zzadk zzadkVar222 = this.zzc;
                            zzsVar22.zzH(zzadkVar222.zza);
                            zzsVar22.zzI(zzadkVar222.zzb);
                            zzsVar22.zzk(this.zzj);
                            if (this.zzp.zzg() != -2147483647) {
                            }
                            this.zzh.zzu(zzsVar22.zzM());
                            this.zzm = zzacvVar.zzn();
                        }
                    }
                }
                j2 = -1;
                th = null;
                zzacvVar.zzf(zzadoVar.zzc);
                if (i != 1483304551) {
                }
                zzaoVar = this.zzj;
                long zzn32 = zzacvVar.zzn();
                if (zzaoVar != null) {
                }
                obj = th;
                ?? r2222 = zzahcVar;
                if (this.zzq) {
                }
                this.zzp = r2222;
                this.zzf.zzw(r2222);
                zzs zzsVar222 = new zzs();
                zzsVar222.zzl("audio/mpeg");
                zzsVar222.zzm(zzadoVar.zzb);
                zzsVar222.zzn(4096);
                zzsVar222.zzE(zzadoVar.zze);
                zzsVar222.zzF(zzadoVar.zzd);
                zzadk zzadkVar2222 = this.zzc;
                zzsVar222.zzH(zzadkVar2222.zza);
                zzsVar222.zzI(zzadkVar2222.zzb);
                zzsVar222.zzk(this.zzj);
                if (this.zzp.zzg() != -2147483647) {
                }
                this.zzh.zzu(zzsVar222.zzM());
                this.zzm = zzacvVar.zzn();
            }
            if (zzefVar.zze() >= 40) {
                zzefVar.zzh(36);
                if (zzefVar.zzB() == 1447187017) {
                    i = 1447187017;
                    if (i != 1231971951) {
                    }
                    zzahk zza32 = zzahk.zza(zzadoVar, zzefVar);
                    zzadkVar = this.zzc;
                    if (!zzadkVar.zzb()) {
                        zzadkVar.zza = i3;
                        zzadkVar.zzb = i4;
                    }
                    long zzn22 = zzacvVar.zzn();
                    if (zzacvVar.zzo() != -1) {
                    }
                    j2 = -1;
                    th = null;
                    zzacvVar.zzf(zzadoVar.zzc);
                    if (i != 1483304551) {
                    }
                    zzaoVar = this.zzj;
                    long zzn322 = zzacvVar.zzn();
                    if (zzaoVar != null) {
                    }
                    obj = th;
                    ?? r22222 = zzahcVar;
                    if (this.zzq) {
                    }
                    this.zzp = r22222;
                    this.zzf.zzw(r22222);
                    zzs zzsVar2222 = new zzs();
                    zzsVar2222.zzl("audio/mpeg");
                    zzsVar2222.zzm(zzadoVar.zzb);
                    zzsVar2222.zzn(4096);
                    zzsVar2222.zzE(zzadoVar.zze);
                    zzsVar2222.zzF(zzadoVar.zzd);
                    zzadk zzadkVar22222 = this.zzc;
                    zzsVar2222.zzH(zzadkVar22222.zza);
                    zzsVar2222.zzI(zzadkVar22222.zzb);
                    zzsVar2222.zzk(this.zzj);
                    if (this.zzp.zzg() != -2147483647) {
                    }
                    this.zzh.zzu(zzsVar2222.zzM());
                    this.zzm = zzacvVar.zzn();
                }
            }
            i = 0;
            if (i != 1231971951) {
            }
            zzahk zza322 = zzahk.zza(zzadoVar, zzefVar);
            zzadkVar = this.zzc;
            if (!zzadkVar.zzb()) {
            }
            long zzn222 = zzacvVar.zzn();
            if (zzacvVar.zzo() != -1) {
            }
            j2 = -1;
            th = null;
            zzacvVar.zzf(zzadoVar.zzc);
            if (i != 1483304551) {
            }
            zzaoVar = this.zzj;
            long zzn3222 = zzacvVar.zzn();
            if (zzaoVar != null) {
            }
            obj = th;
            ?? r222222 = zzahcVar;
            if (this.zzq) {
            }
            this.zzp = r222222;
            this.zzf.zzw(r222222);
            zzs zzsVar22222 = new zzs();
            zzsVar22222.zzl("audio/mpeg");
            zzsVar22222.zzm(zzadoVar.zzb);
            zzsVar22222.zzn(4096);
            zzsVar22222.zzE(zzadoVar.zze);
            zzsVar22222.zzF(zzadoVar.zzd);
            zzadk zzadkVar222222 = this.zzc;
            zzsVar22222.zzH(zzadkVar222222.zza);
            zzsVar22222.zzI(zzadkVar222222.zzb);
            zzsVar22222.zzk(this.zzj);
            if (this.zzp.zzg() != -2147483647) {
            }
            this.zzh.zzu(zzsVar22222.zzM());
            this.zzm = zzacvVar.zzn();
        } else {
            j = -9223372036854775807L;
            th = null;
            long j8 = this.zzm;
            if (j8 != 0) {
                long zzn4 = zzacvVar.zzn();
                if (zzn4 < j8) {
                    zzacvVar.zzf((int) (j8 - zzn4));
                }
            }
        }
        int i8 = this.zzo;
        if (i8 == 0) {
            zzacvVar.zzl();
            if (zzk(zzacvVar)) {
                return -1;
            }
            zzef zzefVar3 = this.zza;
            zzefVar3.zzh(0);
            int zzB = zzefVar3.zzB();
            if (!zzm(zzB, this.zzi) || zzadp.zza(zzB) == -1) {
                zzacvVar.zzf(1);
                this.zzi = 0;
                return 0;
            }
            zzado zzadoVar2 = this.zzb;
            zzadoVar2.zza(zzB);
            if (this.zzk == j) {
                this.zzk = this.zzp.zze(zzacvVar.zzn());
            }
            i8 = zzadoVar2.zzc;
            this.zzo = i8;
            this.zzn = zzacvVar.zzn() + i8;
            zzahi zzahiVar = this.zzp;
            if (zzahiVar instanceof zzahd) {
                zzc(this.zzl + zzadoVar2.zzg);
                throw th;
            }
        }
        int zzy = this.zzh.zzy(zzacvVar, i8, true);
        if (zzy == -1) {
            return -1;
        }
        int i9 = this.zzo - zzy;
        this.zzo = i9;
        if (i9 > 0) {
            return 0;
        }
        this.zzh.zzx(zzc(this.zzl), 1, this.zzb.zzc, 0, null);
        this.zzl += r1.zzg;
        this.zzo = 0;
        return 0;
    }

    private final long zzc(long j) {
        return this.zzk + ((j * 1000000) / this.zzb.zzd);
    }

    private final boolean zzj(zzacv zzacvVar, boolean z) throws IOException {
        int i;
        int i2;
        int zza;
        zzacvVar.zzl();
        long zzn = zzacvVar.zzn();
        int i3 = true != z ? 131072 : 32768;
        if (zzn == 0) {
            zzao zza2 = this.zzd.zza(zzacvVar, null, i3);
            this.zzj = zza2;
            if (zza2 != null) {
                this.zzc.zza(zza2);
            }
            i = (int) zzacvVar.zzm();
            if (!z) {
                zzacvVar.zzf(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (!zzk(zzacvVar)) {
                zzef zzefVar = this.zza;
                zzefVar.zzh(0);
                int zzB = zzefVar.zzB();
                if ((i2 == 0 || zzm(zzB, i2)) && (zza = zzadp.zza(zzB)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(zzB);
                        i2 = zzB;
                    }
                    zzacvVar.zzk(zza - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        zzl();
                        throw new EOFException();
                    }
                    if (z) {
                        zzacvVar.zzl();
                        zzacvVar.zzk(i + i6);
                    } else {
                        zzacvVar.zzf(1);
                    }
                    i4 = 0;
                    i5 = i6;
                    i2 = 0;
                }
            } else if (i4 <= 0) {
                zzl();
                throw new EOFException();
            }
        }
        if (z) {
            zzacvVar.zzf(i + i5);
        } else {
            zzacvVar.zzl();
        }
        this.zzi = i2;
        return true;
    }

    private final boolean zzk(zzacv zzacvVar) throws IOException {
        zzahi zzahiVar = this.zzp;
        if (zzahiVar != null) {
            long zzf = zzahiVar.zzf();
            if (zzf != -1 && zzacvVar.zzm() > zzf - 4) {
                return true;
            }
        }
        try {
            return !zzacvVar.zzh(this.zza.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzl() {
        zzahi zzahiVar = this.zzp;
        if ((zzahiVar instanceof zzahc) && zzahiVar.zzb()) {
            long j = this.zzn;
            if (j == -1 || j == this.zzp.zzf()) {
                return;
            }
            this.zzp = ((zzahc) this.zzp).zzh(this.zzn);
            zzacx zzacxVar = this.zzf;
            zzacxVar.getClass();
            zzacxVar.zzw(this.zzp);
            this.zzg.getClass();
            this.zzp.zza();
        }
    }

    private static boolean zzm(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        return zzj(zzacvVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        this.zzf = zzacxVar;
        zzaeb zzu = zzacxVar.zzu(0, 1);
        this.zzg = zzu;
        this.zzh = zzu;
        this.zzf.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        this.zzg.getClass();
        String str = zzeo.zza;
        int zzb = zzb(zzacvVar);
        if (zzb == -1 && (this.zzp instanceof zzahd)) {
            if (this.zzp.zza() != zzc(this.zzl)) {
                throw null;
            }
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzo = 0;
        zzahi zzahiVar = this.zzp;
        if (zzahiVar instanceof zzahd) {
            throw null;
        }
    }
}
