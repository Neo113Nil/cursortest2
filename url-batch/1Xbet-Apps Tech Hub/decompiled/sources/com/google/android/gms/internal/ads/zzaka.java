package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaka implements zzajy {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzadk zzc;
    private final zzaln zzd;
    private final zzfj zze;
    private final zzakn zzf;
    private final boolean[] zzg;
    private final zzajz zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzaka() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c6  */
    @Override // com.google.android.gms.internal.ads.zzajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfj zzfjVar) {
        int i;
        byte[] bArr;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        float f;
        int i5;
        long j3;
        byte b;
        int i6;
        zzef.zzb(this.zzc);
        int zzc = zzfjVar.zzc();
        int zzd = zzfjVar.zzd();
        byte[] zzI = zzfjVar.zzI();
        this.zzi += zzfjVar.zza();
        this.zzc.zzr(zzfjVar, zzfjVar.zza());
        while (true) {
            int zza2 = zzgg.zza(zzI, zzc, zzd, this.zzg);
            if (zza2 == zzd) {
                break;
            }
            int i7 = zza2 + 3;
            int i8 = zzfjVar.zzI()[i7] & 255;
            int i9 = zza2 - zzc;
            if (!this.zzk) {
                if (i9 > 0) {
                    this.zzh.zza(zzI, zzc, zza2);
                }
                if (this.zzh.zzc(i8, i9 < 0 ? -i9 : 0)) {
                    zzajz zzajzVar = this.zzh;
                    String str = this.zzb;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzajzVar.zzc, zzajzVar.zza);
                    int i10 = copyOf[4] & 255;
                    int i11 = copyOf[5] & 255;
                    int i12 = copyOf[6] & 255;
                    int i13 = i11 & 15;
                    int i14 = (i11 >> 4) | (i10 << 4);
                    int i15 = (copyOf[7] & 240) >> 4;
                    int i16 = (i13 << 8) | i12;
                    if (i15 == 2) {
                        i3 = i16 * 4;
                        i4 = i14 * 3;
                    } else if (i15 == 3) {
                        i3 = i16 * 16;
                        i4 = i14 * 9;
                    } else if (i15 != 4) {
                        f = 1.0f;
                        zzak zzakVar = new zzak();
                        zzakVar.zzJ(str);
                        zzakVar.zzU("video/mpeg2");
                        zzakVar.zzab(i14);
                        zzakVar.zzH(i16);
                        zzakVar.zzR(f);
                        zzakVar.zzK(Collections.singletonList(copyOf));
                        zzam zzac = zzakVar.zzac();
                        i5 = (copyOf[7] & Ascii.SI) - 1;
                        j3 = 0;
                        if (i5 >= 0 && i5 < 8) {
                            double d = zza[i5];
                            b = copyOf[zzajzVar.zzb + 9];
                            i6 = (b & 96) >> 5;
                            if (i6 != (b & Ascii.US)) {
                                d *= (i6 + 1.0d) / (r9 + 1);
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzac, Long.valueOf(j3));
                        this.zzc.zzl((zzam) create.first);
                        this.zzl = ((Long) create.second).longValue();
                        this.zzk = true;
                    } else {
                        i3 = i16 * 121;
                        i4 = i14 * 100;
                    }
                    f = i3 / i4;
                    zzak zzakVar2 = new zzak();
                    zzakVar2.zzJ(str);
                    zzakVar2.zzU("video/mpeg2");
                    zzakVar2.zzab(i14);
                    zzakVar2.zzH(i16);
                    zzakVar2.zzR(f);
                    zzakVar2.zzK(Collections.singletonList(copyOf));
                    zzam zzac2 = zzakVar2.zzac();
                    i5 = (copyOf[7] & Ascii.SI) - 1;
                    j3 = 0;
                    if (i5 >= 0) {
                        double d2 = zza[i5];
                        b = copyOf[zzajzVar.zzb + 9];
                        i6 = (b & 96) >> 5;
                        if (i6 != (b & Ascii.US)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    Pair create2 = Pair.create(zzac2, Long.valueOf(j3));
                    this.zzc.zzl((zzam) create2.first);
                    this.zzl = ((Long) create2.second).longValue();
                    this.zzk = true;
                }
            }
            zzakn zzaknVar = this.zzf;
            if (zzaknVar != null) {
                if (i9 > 0) {
                    zzaknVar.zza(zzI, zzc, zza2);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (this.zzf.zzd(i2)) {
                    zzakn zzaknVar2 = this.zzf;
                    int zzb = zzgg.zzb(zzaknVar2.zza, zzaknVar2.zzb);
                    zzfj zzfjVar2 = this.zze;
                    int i17 = zzfs.zza;
                    zzfjVar2.zzE(this.zzf.zza, zzb);
                    this.zzd.zza(this.zzo, this.zze);
                }
                if (i8 == 178) {
                    if (zzfjVar.zzI()[zza2 + 2] == 1) {
                        this.zzf.zzc(Opcodes.GETSTATIC);
                    }
                    i8 = 178;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i18 = zzd - zza2;
                if (this.zzq && this.zzk) {
                    long j4 = this.zzo;
                    if (j4 != -9223372036854775807L) {
                        i = zzd;
                        bArr = zzI;
                        j = -9223372036854775807L;
                        this.zzc.zzt(j4, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i18, i18, null);
                        if (this.zzj || this.zzq) {
                            this.zzn = this.zzi - i18;
                            j2 = this.zzm;
                            if (j2 == j) {
                                long j5 = this.zzo;
                                j2 = j5 != j ? j5 + this.zzl : j;
                            }
                            this.zzo = j2;
                            z = false;
                            this.zzp = false;
                            this.zzm = j;
                            z2 = true;
                            this.zzj = true;
                        } else {
                            z = false;
                            z2 = true;
                        }
                        this.zzq = i8 != 0 ? z2 : z;
                    }
                }
                i = zzd;
                bArr = zzI;
                j = -9223372036854775807L;
                if (this.zzj) {
                }
                this.zzn = this.zzi - i18;
                j2 = this.zzm;
                if (j2 == j) {
                }
                this.zzo = j2;
                z = false;
                this.zzp = false;
                this.zzm = j;
                z2 = true;
                this.zzj = true;
                this.zzq = i8 != 0 ? z2 : z;
            } else {
                if (i8 == 184) {
                    this.zzp = true;
                }
                i = zzd;
                bArr = zzI;
            }
            zzd = i;
            zzI = bArr;
            zzc = i7;
        }
        if (!this.zzk) {
            this.zzh.zza(zzI, zzc, zzd);
        }
        zzakn zzaknVar3 = this.zzf;
        if (zzaknVar3 != null) {
            zzaknVar3.zza(zzI, zzc, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        this.zzb = zzalkVar.zzb();
        this.zzc = zzachVar.zzw(zzalkVar.zza(), 2);
        zzaln zzalnVar = this.zzd;
        if (zzalnVar != null) {
            zzalnVar.zzb(zzachVar, zzalkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
        zzef.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzp;
            long j = this.zzi - this.zzn;
            this.zzc.zzt(this.zzo, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        zzgg.zzf(this.zzg);
        this.zzh.zzb();
        zzakn zzaknVar = this.zzf;
        if (zzaknVar != null) {
            zzaknVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    zzaka(zzaln zzalnVar) {
        zzfj zzfjVar;
        this.zzd = zzalnVar;
        this.zzg = new boolean[4];
        this.zzh = new zzajz(128);
        if (zzalnVar != null) {
            this.zzf = new zzakn(Opcodes.GETSTATIC, 128);
            zzfjVar = new zzfj();
        } else {
            zzfjVar = null;
            this.zzf = null;
        }
        this.zze = zzfjVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
