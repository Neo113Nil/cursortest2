package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzahp implements zzack {
    private final zzek zza;
    private final zzadc zzb;
    private final zzacy zzc;
    private final zzada zzd;
    private final zzadp zze;
    private zzacn zzf;
    private zzadp zzg;
    private zzadp zzh;
    private int zzi;
    private zzbk zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private zzahr zzo;
    private boolean zzp;

    public zzahp() {
        throw null;
    }

    public zzahp(int i) {
        this.zza = new zzek(10);
        this.zzb = new zzadc();
        this.zzc = new zzacy();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzada();
        zzacj zzacjVar = new zzacj();
        this.zze = zzacjVar;
        this.zzh = zzacjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c5  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzg(zzacl zzaclVar) throws IOException {
        int i;
        zzacy zzacyVar;
        int i2;
        zzahr zzahmVar;
        int i3;
        int i4;
        zzbk zzbkVar;
        zzaho zzahoVar;
        long j;
        if (this.zzi == 0) {
            try {
                zzm(zzaclVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzo == null) {
            zzek zzekVar = new zzek(this.zzb.zzc);
            zzaby zzabyVar = (zzaby) zzaclVar;
            zzabyVar.zzm(zzekVar.zzM(), 0, this.zzb.zzc, false);
            zzadc zzadcVar = this.zzb;
            int i5 = 21;
            if ((zzadcVar.zza & 1) != 0) {
                if (zzadcVar.zze != 1) {
                    i5 = 36;
                }
            } else if (zzadcVar.zze == 1) {
                i5 = 13;
            }
            if (zzekVar.zze() >= i5 + 4) {
                zzekVar.zzK(i5);
                i = zzekVar.zzg();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                if (i != 1231971951) {
                    if (i == 1447187017) {
                        zzahmVar = zzahs.zzb(zzaclVar.zzd(), zzaclVar.zzf(), this.zzb, zzekVar);
                        zzabyVar.zzo(this.zzb.zzc, false);
                        zzbkVar = this.zzj;
                        long zzf = zzaclVar.zzf();
                        if (zzbkVar != null) {
                        }
                        zzahoVar = null;
                        if (this.zzp) {
                        }
                        this.zzo = zzahmVar;
                        this.zzf.zzO(zzahmVar);
                        zzad zzadVar = new zzad();
                        zzadVar.zzX(this.zzb.zzb);
                        zzadVar.zzP(4096);
                        zzadVar.zzy(this.zzb.zze);
                        zzadVar.zzY(this.zzb.zzd);
                        zzadVar.zzF(this.zzc.zza);
                        zzadVar.zzG(this.zzc.zzb);
                        zzadVar.zzQ(this.zzj);
                        if (this.zzo.zzc() != -2147483647) {
                        }
                        this.zzh.zzl(zzadVar.zzad());
                        this.zzm = zzaclVar.zzf();
                    } else if (i != 1483304551) {
                        zzaclVar.zzj();
                        zzahmVar = null;
                        zzbkVar = this.zzj;
                        long zzf2 = zzaclVar.zzf();
                        if (zzbkVar != null) {
                            int zza = zzbkVar.zza();
                            for (int i6 = 0; i6 < zza; i6++) {
                                zzbj zzb = zzbkVar.zzb(i6);
                                if (zzb instanceof zzagi) {
                                    zzagi zzagiVar = (zzagi) zzb;
                                    int zza2 = zzbkVar.zza();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= zza2) {
                                            j = -9223372036854775807L;
                                            break;
                                        }
                                        zzbj zzb2 = zzbkVar.zzb(i7);
                                        if (zzb2 instanceof zzagm) {
                                            zzagm zzagmVar = (zzagm) zzb2;
                                            if (zzagmVar.zzf.equals("TLEN")) {
                                                j = zzet.zzr(Long.parseLong((String) zzagmVar.zzb.get(0)));
                                                break;
                                            }
                                        }
                                        i7++;
                                    }
                                    zzahoVar = zzaho.zzb(zzf2, zzagiVar, j);
                                    if (this.zzp) {
                                        if (zzahoVar != null) {
                                            zzahmVar = zzahoVar;
                                        } else if (zzahmVar == null) {
                                            zzahmVar = null;
                                        }
                                        if (zzahmVar != null) {
                                            zzahmVar.zzh();
                                        } else {
                                            zzabyVar.zzm(this.zza.zzM(), 0, 4, false);
                                            this.zza.zzK(0);
                                            this.zzb.zza(this.zza.zzg());
                                            long zzd = zzaclVar.zzd();
                                            long zzf3 = zzaclVar.zzf();
                                            zzadc zzadcVar2 = this.zzb;
                                            zzahmVar = new zzahm(zzd, zzf3, zzadcVar2.zzf, zzadcVar2.zzc, false);
                                        }
                                    } else {
                                        zzahmVar = new zzahq();
                                    }
                                    this.zzo = zzahmVar;
                                    this.zzf.zzO(zzahmVar);
                                    zzad zzadVar2 = new zzad();
                                    zzadVar2.zzX(this.zzb.zzb);
                                    zzadVar2.zzP(4096);
                                    zzadVar2.zzy(this.zzb.zze);
                                    zzadVar2.zzY(this.zzb.zzd);
                                    zzadVar2.zzF(this.zzc.zza);
                                    zzadVar2.zzG(this.zzc.zzb);
                                    zzadVar2.zzQ(this.zzj);
                                    if (this.zzo.zzc() != -2147483647) {
                                        zzadVar2.zzx(this.zzo.zzc());
                                    }
                                    this.zzh.zzl(zzadVar2.zzad());
                                    this.zzm = zzaclVar.zzf();
                                }
                            }
                        }
                        zzahoVar = null;
                        if (this.zzp) {
                        }
                        this.zzo = zzahmVar;
                        this.zzf.zzO(zzahmVar);
                        zzad zzadVar22 = new zzad();
                        zzadVar22.zzX(this.zzb.zzb);
                        zzadVar22.zzP(4096);
                        zzadVar22.zzy(this.zzb.zze);
                        zzadVar22.zzY(this.zzb.zzd);
                        zzadVar22.zzF(this.zzc.zza);
                        zzadVar22.zzG(this.zzc.zzb);
                        zzadVar22.zzQ(this.zzj);
                        if (this.zzo.zzc() != -2147483647) {
                        }
                        this.zzh.zzl(zzadVar22.zzad());
                        this.zzm = zzaclVar.zzf();
                    }
                }
                zzaht zzb3 = zzaht.zzb(this.zzb, zzekVar);
                zzacyVar = this.zzc;
                if (!zzacyVar.zza() && (i3 = zzb3.zzd) != -1 && (i4 = zzb3.zze) != -1) {
                    zzacyVar.zza = i3;
                    zzacyVar.zzb = i4;
                }
                long zzf4 = zzaclVar.zzf();
                if (zzaclVar.zzd() != -1) {
                    long j2 = zzb3.zzc;
                    if (j2 != -1) {
                        long j3 = j2 + zzf4;
                        if (zzaclVar.zzd() != j3) {
                            zzea.zze("Mp3Extractor", "Data size mismatch between stream (" + zzaclVar.zzd() + ") and Xing frame (" + j3 + "), using Xing value.");
                        }
                    }
                }
                zzabyVar.zzo(this.zzb.zzc, false);
                if (i == 1483304551) {
                    zzahmVar = zzahu.zzb(zzb3, zzf4);
                } else {
                    long zzd2 = zzaclVar.zzd();
                    long zza3 = zzb3.zza();
                    if (zza3 != -9223372036854775807L) {
                        long j4 = zzb3.zzc;
                        if (j4 != -1) {
                            zzd2 = zzf4 + j4;
                            i2 = zzb3.zza.zzc;
                        } else if (zzd2 != -1) {
                            j4 = zzd2 - zzf4;
                            i2 = zzb3.zza.zzc;
                        }
                        long j5 = j4 - i2;
                        zzahmVar = new zzahm(zzd2, zzf4 + zzb3.zza.zzc, zzgap.zzb(zzet.zzt(j5, 8000000L, zza3, RoundingMode.HALF_UP)), zzgap.zzb(zzgaj.zzb(j5, zzb3.zzb, RoundingMode.HALF_UP)), false);
                    }
                    zzahmVar = null;
                }
                zzbkVar = this.zzj;
                long zzf22 = zzaclVar.zzf();
                if (zzbkVar != null) {
                }
                zzahoVar = null;
                if (this.zzp) {
                }
                this.zzo = zzahmVar;
                this.zzf.zzO(zzahmVar);
                zzad zzadVar222 = new zzad();
                zzadVar222.zzX(this.zzb.zzb);
                zzadVar222.zzP(4096);
                zzadVar222.zzy(this.zzb.zze);
                zzadVar222.zzY(this.zzb.zzd);
                zzadVar222.zzF(this.zzc.zza);
                zzadVar222.zzG(this.zzc.zzb);
                zzadVar222.zzQ(this.zzj);
                if (this.zzo.zzc() != -2147483647) {
                }
                this.zzh.zzl(zzadVar222.zzad());
                this.zzm = zzaclVar.zzf();
            }
            if (zzekVar.zze() >= 40) {
                zzekVar.zzK(36);
                if (zzekVar.zzg() == 1447187017) {
                    i = 1447187017;
                    if (i != 1231971951) {
                    }
                    zzaht zzb32 = zzaht.zzb(this.zzb, zzekVar);
                    zzacyVar = this.zzc;
                    if (!zzacyVar.zza()) {
                        zzacyVar.zza = i3;
                        zzacyVar.zzb = i4;
                    }
                    long zzf42 = zzaclVar.zzf();
                    if (zzaclVar.zzd() != -1) {
                    }
                    zzabyVar.zzo(this.zzb.zzc, false);
                    if (i == 1483304551) {
                    }
                    zzbkVar = this.zzj;
                    long zzf222 = zzaclVar.zzf();
                    if (zzbkVar != null) {
                    }
                    zzahoVar = null;
                    if (this.zzp) {
                    }
                    this.zzo = zzahmVar;
                    this.zzf.zzO(zzahmVar);
                    zzad zzadVar2222 = new zzad();
                    zzadVar2222.zzX(this.zzb.zzb);
                    zzadVar2222.zzP(4096);
                    zzadVar2222.zzy(this.zzb.zze);
                    zzadVar2222.zzY(this.zzb.zzd);
                    zzadVar2222.zzF(this.zzc.zza);
                    zzadVar2222.zzG(this.zzc.zzb);
                    zzadVar2222.zzQ(this.zzj);
                    if (this.zzo.zzc() != -2147483647) {
                    }
                    this.zzh.zzl(zzadVar2222.zzad());
                    this.zzm = zzaclVar.zzf();
                }
            }
            i = 0;
            if (i != 1231971951) {
            }
            zzaht zzb322 = zzaht.zzb(this.zzb, zzekVar);
            zzacyVar = this.zzc;
            if (!zzacyVar.zza()) {
            }
            long zzf422 = zzaclVar.zzf();
            if (zzaclVar.zzd() != -1) {
            }
            zzabyVar.zzo(this.zzb.zzc, false);
            if (i == 1483304551) {
            }
            zzbkVar = this.zzj;
            long zzf2222 = zzaclVar.zzf();
            if (zzbkVar != null) {
            }
            zzahoVar = null;
            if (this.zzp) {
            }
            this.zzo = zzahmVar;
            this.zzf.zzO(zzahmVar);
            zzad zzadVar22222 = new zzad();
            zzadVar22222.zzX(this.zzb.zzb);
            zzadVar22222.zzP(4096);
            zzadVar22222.zzy(this.zzb.zze);
            zzadVar22222.zzY(this.zzb.zzd);
            zzadVar22222.zzF(this.zzc.zza);
            zzadVar22222.zzG(this.zzc.zzb);
            zzadVar22222.zzQ(this.zzj);
            if (this.zzo.zzc() != -2147483647) {
            }
            this.zzh.zzl(zzadVar22222.zzad());
            this.zzm = zzaclVar.zzf();
        } else {
            long j6 = this.zzm;
            if (j6 != 0) {
                long zzf5 = zzaclVar.zzf();
                if (zzf5 < j6) {
                    ((zzaby) zzaclVar).zzo((int) (j6 - zzf5), false);
                }
            }
        }
        int i8 = this.zzn;
        if (i8 == 0) {
            zzaclVar.zzj();
            if (zzl(zzaclVar)) {
                return -1;
            }
            this.zza.zzK(0);
            int zzg = this.zza.zzg();
            if (!zzk(zzg, this.zzi) || zzadd.zzb(zzg) == -1) {
                ((zzaby) zzaclVar).zzo(1, false);
                this.zzi = 0;
                return 0;
            }
            this.zzb.zza(zzg);
            if (this.zzk == -9223372036854775807L) {
                this.zzk = this.zzo.zze(zzaclVar.zzf());
            }
            int i9 = this.zzb.zzc;
            this.zzn = i9;
            zzahr zzahrVar = this.zzo;
            if (zzahrVar instanceof zzahn) {
                zzh(this.zzl + r2.zzg);
                throw null;
            }
            i8 = i9;
        }
        int zzf6 = this.zzh.zzf(zzaclVar, i8, true);
        if (zzf6 == -1) {
            return -1;
        }
        int i10 = this.zzn - zzf6;
        this.zzn = i10;
        if (i10 <= 0) {
            this.zzh.zzs(zzh(this.zzl), 1, this.zzb.zzc, 0, null);
            this.zzl += this.zzb.zzg;
            this.zzn = 0;
            return 0;
        }
        return 0;
    }

    private final long zzh(long j) {
        return this.zzk + ((j * 1000000) / this.zzb.zzd);
    }

    private static boolean zzk(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzl(zzacl zzaclVar) throws IOException {
        zzahr zzahrVar = this.zzo;
        if (zzahrVar != null) {
            long zzd = zzahrVar.zzd();
            if (zzd != -1 && zzaclVar.zze() > zzd - 4) {
                return true;
            }
        }
        try {
            return !zzaclVar.zzm(this.zza.zzM(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzacl zzaclVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb;
        zzaclVar.zzj();
        if (zzaclVar.zzf() == 0) {
            zzbk zza = this.zzd.zza(zzaclVar, null);
            this.zzj = zza;
            if (zza != null) {
                this.zzc.zzb(zza);
            }
            i2 = (int) zzaclVar.zze();
            if (!z) {
                ((zzaby) zzaclVar).zzo(i2, false);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!zzl(zzaclVar)) {
                this.zza.zzK(0);
                int zzg = this.zza.zzg();
                if ((i == 0 || zzk(zzg, i)) && (zzb = zzadd.zzb(zzg)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(zzg);
                        i = zzg;
                    }
                    ((zzaby) zzaclVar).zzl(zzb - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzbo.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzaclVar.zzj();
                        ((zzaby) zzaclVar).zzl(i2 + i5, false);
                    } else {
                        ((zzaby) zzaclVar).zzo(1, false);
                    }
                    i4 = i5;
                    i = 0;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzaby) zzaclVar).zzo(i2 + i4, false);
        } else {
            zzaclVar.zzj();
        }
        this.zzi = i;
        return true;
    }

    public final void zza() {
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        zzdi.zzb(this.zzg);
        int i = zzet.zza;
        int zzg = zzg(zzaclVar);
        if (zzg == -1 && (this.zzo instanceof zzahn)) {
            if (this.zzo.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzf = zzacnVar;
        zzadp zzw = zzacnVar.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
        this.zzf.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzn = 0;
        zzahr zzahrVar = this.zzo;
        if (zzahrVar instanceof zzahn) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        return zzm(zzaclVar, true);
    }
}
