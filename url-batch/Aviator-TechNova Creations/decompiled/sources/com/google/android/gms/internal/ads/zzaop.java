package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzaop implements zzaon {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzagh zzb;
    private final zzaqf zzd;
    private final String zze;
    private final zzer zzf;
    private final zzape zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzaoo zzi = new zzaoo(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzaop(zzaqf zzaqfVar, String str) {
        zzer zzerVar;
        this.zzd = zzaqfVar;
        this.zze = str;
        if (zzaqfVar != null) {
            this.zzg = new zzape(Opcodes.GETSTATIC, 128);
            zzerVar = new zzer();
        } else {
            zzerVar = null;
            this.zzg = null;
        }
        this.zzf = zzerVar;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzh);
        this.zzi.zza();
        zzape zzapeVar = this.zzg;
        if (zzapeVar != null) {
            zzapeVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = -9223372036854775807L;
        this.zzp = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zza = zzaqbVar.zzc();
        this.zzb = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        zzaqf zzaqfVar = this.zzd;
        if (zzaqfVar != null) {
            zzaqfVar.zza(zzaexVar, zzaqbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzer zzerVar) {
        int i;
        zzape zzapeVar;
        int i2;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        long j3;
        byte b;
        int i7;
        this.zzb.getClass();
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        byte[] zzi = zzerVar.zzi();
        this.zzj += zzerVar.zzd();
        this.zzb.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzh);
            if (zzi2 == zze) {
                break;
            }
            int i8 = zzi2 + 3;
            int i9 = zzerVar.zzi()[i8] & 255;
            int i10 = zzi2 - zzg;
            if (!this.zzl) {
                if (i10 > 0) {
                    this.zzi.zzc(zzi, zzg, zzi2);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                zzaoo zzaooVar = this.zzi;
                if (zzaooVar.zzb(i9, i11)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] copyOf = Arrays.copyOf(zzaooVar.zzc, zzaooVar.zza);
                    int i12 = copyOf[4] & 255;
                    byte b2 = copyOf[5];
                    i = zze;
                    int i13 = copyOf[6] & 255;
                    int i14 = (i12 << 4) | ((b2 & 255) >> 4);
                    int i15 = (copyOf[7] & 240) >> 4;
                    int i16 = ((b2 & Ascii.SI) << 8) | i13;
                    if (i15 == 2) {
                        i4 = i16 * 4;
                        i5 = i14 * 3;
                    } else if (i15 == 3) {
                        i4 = i16 * 16;
                        i5 = i14 * 9;
                    } else if (i15 != 4) {
                        f = 1.0f;
                        zzt zztVar = new zzt();
                        zztVar.zza(str);
                        zztVar.zzl(str2);
                        zztVar.zzm("video/mpeg2");
                        zztVar.zzt(i14);
                        zztVar.zzu(i16);
                        zztVar.zzz(f);
                        zztVar.zzp(Collections.singletonList(copyOf));
                        zzv zzM = zztVar.zzM();
                        i6 = (copyOf[7] & Ascii.SI) - 1;
                        j3 = 0;
                        if (i6 >= 0 && i6 < 8) {
                            double d = zzc[i6];
                            b = copyOf[zzaooVar.zzb + 9];
                            i7 = (b & 96) >> 5;
                            if (i7 != (b & Ascii.US)) {
                                d *= (i7 + 1.0d) / (r11 + 1);
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzM, Long.valueOf(j3));
                        this.zzb.zzz((zzv) create.first);
                        this.zzm = ((Long) create.second).longValue();
                        this.zzl = true;
                        zzapeVar = this.zzg;
                        if (zzapeVar != null) {
                            if (i10 > 0) {
                                zzapeVar.zzd(zzi, zzg, zzi2);
                                i3 = 0;
                            } else {
                                i3 = -i10;
                            }
                            if (zzapeVar.zze(i3)) {
                                int zza = zzgm.zza(zzapeVar.zza, zzapeVar.zzb);
                                zzer zzerVar2 = this.zzf;
                                String str3 = zzfj.zza;
                                zzerVar2.zzb(zzapeVar.zza, zza);
                                this.zzd.zzb(this.zzp, zzerVar2);
                            }
                            if (i9 == 178) {
                                if (zzerVar.zzi()[zzi2 + 2] == 1) {
                                    zzapeVar.zzc(Opcodes.GETSTATIC);
                                }
                                i9 = 178;
                            }
                        }
                        if (i9 != 0 || i9 == 179) {
                            i2 = i - zzi2;
                            if (this.zzr || !this.zzl) {
                                j = -9223372036854775807L;
                            } else {
                                j = -9223372036854775807L;
                                long j4 = this.zzp;
                                if (j4 != -9223372036854775807L) {
                                    j = -9223372036854775807L;
                                    this.zzb.zze(j4, this.zzq ? 1 : 0, ((int) (this.zzj - this.zzo)) - i2, i2, null);
                                }
                            }
                            if (this.zzk || this.zzr) {
                                this.zzo = this.zzj - i2;
                                j2 = this.zzn;
                                if (j2 == j) {
                                    long j5 = this.zzp;
                                    j2 = j5 != j ? j5 + this.zzm : j;
                                }
                                this.zzp = j2;
                                z = false;
                                this.zzq = false;
                                this.zzn = j;
                                z2 = true;
                                this.zzk = true;
                            } else {
                                z2 = true;
                                z = false;
                            }
                            this.zzr = i9 == 0 ? z2 : z;
                        } else if (i9 == 184) {
                            this.zzq = true;
                        }
                        zzg = i8;
                        zze = i;
                    } else {
                        i4 = i16 * Opcodes.LSHL;
                        i5 = i14 * 100;
                    }
                    f = i4 / i5;
                    zzt zztVar2 = new zzt();
                    zztVar2.zza(str);
                    zztVar2.zzl(str2);
                    zztVar2.zzm("video/mpeg2");
                    zztVar2.zzt(i14);
                    zztVar2.zzu(i16);
                    zztVar2.zzz(f);
                    zztVar2.zzp(Collections.singletonList(copyOf));
                    zzv zzM2 = zztVar2.zzM();
                    i6 = (copyOf[7] & Ascii.SI) - 1;
                    j3 = 0;
                    if (i6 >= 0) {
                        double d2 = zzc[i6];
                        b = copyOf[zzaooVar.zzb + 9];
                        i7 = (b & 96) >> 5;
                        if (i7 != (b & Ascii.US)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    Pair create2 = Pair.create(zzM2, Long.valueOf(j3));
                    this.zzb.zzz((zzv) create2.first);
                    this.zzm = ((Long) create2.second).longValue();
                    this.zzl = true;
                    zzapeVar = this.zzg;
                    if (zzapeVar != null) {
                    }
                    if (i9 != 0) {
                    }
                    i2 = i - zzi2;
                    if (this.zzr) {
                    }
                    j = -9223372036854775807L;
                    if (this.zzk) {
                    }
                    this.zzo = this.zzj - i2;
                    j2 = this.zzn;
                    if (j2 == j) {
                    }
                    this.zzp = j2;
                    z = false;
                    this.zzq = false;
                    this.zzn = j;
                    z2 = true;
                    this.zzk = true;
                    this.zzr = i9 == 0 ? z2 : z;
                    zzg = i8;
                    zze = i;
                }
            }
            i = zze;
            zzapeVar = this.zzg;
            if (zzapeVar != null) {
            }
            if (i9 != 0) {
            }
            i2 = i - zzi2;
            if (this.zzr) {
            }
            j = -9223372036854775807L;
            if (this.zzk) {
            }
            this.zzo = this.zzj - i2;
            j2 = this.zzn;
            if (j2 == j) {
            }
            this.zzp = j2;
            z = false;
            this.zzq = false;
            this.zzn = j;
            z2 = true;
            this.zzk = true;
            this.zzr = i9 == 0 ? z2 : z;
            zzg = i8;
            zze = i;
        }
        if (!this.zzl) {
            this.zzi.zzc(zzi, zzg, zze);
        }
        zzape zzapeVar2 = this.zzg;
        if (zzapeVar2 != null) {
            zzapeVar2.zzd(zzi, zzg, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z) {
        zzagh zzaghVar = this.zzb;
        zzaghVar.getClass();
        if (z) {
            boolean z2 = this.zzq;
            long j = this.zzj - this.zzo;
            zzaghVar.zze(this.zzp, z2 ? 1 : 0, (int) j, 0, null);
        }
    }
}
