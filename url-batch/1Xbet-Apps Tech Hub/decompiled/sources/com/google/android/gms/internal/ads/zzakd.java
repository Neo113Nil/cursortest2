package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzakd implements zzajy {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaln zzb;
    private final zzfj zzc;
    private final boolean[] zzd;
    private final zzakb zze;
    private final zzakn zzf;
    private zzakc zzg;
    private long zzh;
    private String zzi;
    private zzadk zzj;
    private boolean zzk;
    private long zzl;

    public zzakd() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012c  */
    @Override // com.google.android.gms.internal.ads.zzajy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfj zzfjVar) {
        int i;
        int i2;
        zzef.zzb(this.zzg);
        zzef.zzb(this.zzj);
        int zzc = zzfjVar.zzc();
        int zzd = zzfjVar.zzd();
        byte[] zzI = zzfjVar.zzI();
        this.zzh += zzfjVar.zza();
        this.zzj.zzr(zzfjVar, zzfjVar.zza());
        while (true) {
            int zza2 = zzgg.zza(zzI, zzc, zzd, this.zzd);
            if (zza2 == zzd) {
                break;
            }
            int i3 = zza2 + 3;
            int i4 = zzfjVar.zzI()[i3] & 255;
            int i5 = zza2 - zzc;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zza(zzI, zzc, zza2);
                }
                if (this.zze.zzc(i4, i5 < 0 ? -i5 : 0)) {
                    zzadk zzadkVar = this.zzj;
                    zzakb zzakbVar = this.zze;
                    int i6 = zzakbVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzakbVar.zzc, zzakbVar.zza);
                    zzfi zzfiVar = new zzfi(copyOf, copyOf.length);
                    zzfiVar.zzm(i6);
                    zzfiVar.zzm(4);
                    zzfiVar.zzk();
                    zzfiVar.zzl(8);
                    if (zzfiVar.zzn()) {
                        zzfiVar.zzl(4);
                        zzfiVar.zzl(3);
                    }
                    int zzd2 = zzfiVar.zzd(4);
                    float f = 1.0f;
                    if (zzd2 == 15) {
                        int zzd3 = zzfiVar.zzd(8);
                        int zzd4 = zzfiVar.zzd(8);
                        if (zzd4 == 0) {
                            zzez.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = zzd3 / zzd4;
                        }
                    } else if (zzd2 < 7) {
                        f = zza[zzd2];
                    } else {
                        zzez.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzfiVar.zzn()) {
                        zzfiVar.zzl(2);
                        zzfiVar.zzl(1);
                        if (zzfiVar.zzn()) {
                            zzfiVar.zzl(15);
                            zzfiVar.zzk();
                            zzfiVar.zzl(15);
                            zzfiVar.zzk();
                            zzfiVar.zzl(15);
                            zzfiVar.zzk();
                            zzfiVar.zzl(3);
                            zzfiVar.zzl(11);
                            zzfiVar.zzk();
                            zzfiVar.zzl(15);
                            zzfiVar.zzk();
                            i2 = 2;
                            if (zzfiVar.zzd(i2) != 0) {
                                zzez.zzf("H263Reader", "Unhandled video object layer shape");
                            }
                            zzfiVar.zzk();
                            int zzd5 = zzfiVar.zzd(16);
                            zzfiVar.zzk();
                            if (zzfiVar.zzn()) {
                                if (zzd5 == 0) {
                                    zzez.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i7 = zzd5 - 1;
                                    int i8 = 0;
                                    while (i7 > 0) {
                                        i7 >>= 1;
                                        i8++;
                                    }
                                    zzfiVar.zzl(i8);
                                }
                            }
                            zzfiVar.zzk();
                            int zzd6 = zzfiVar.zzd(13);
                            zzfiVar.zzk();
                            int zzd7 = zzfiVar.zzd(13);
                            zzfiVar.zzk();
                            zzfiVar.zzk();
                            zzak zzakVar = new zzak();
                            zzakVar.zzJ(str);
                            zzakVar.zzU("video/mp4v-es");
                            zzakVar.zzab(zzd6);
                            zzakVar.zzH(zzd7);
                            zzakVar.zzR(f2);
                            zzakVar.zzK(Collections.singletonList(copyOf));
                            zzadkVar.zzl(zzakVar.zzac());
                            this.zzk = true;
                        }
                    }
                    i2 = 2;
                    if (zzfiVar.zzd(i2) != 0) {
                    }
                    zzfiVar.zzk();
                    int zzd52 = zzfiVar.zzd(16);
                    zzfiVar.zzk();
                    if (zzfiVar.zzn()) {
                    }
                    zzfiVar.zzk();
                    int zzd62 = zzfiVar.zzd(13);
                    zzfiVar.zzk();
                    int zzd72 = zzfiVar.zzd(13);
                    zzfiVar.zzk();
                    zzfiVar.zzk();
                    zzak zzakVar2 = new zzak();
                    zzakVar2.zzJ(str);
                    zzakVar2.zzU("video/mp4v-es");
                    zzakVar2.zzab(zzd62);
                    zzakVar2.zzH(zzd72);
                    zzakVar2.zzR(f2);
                    zzakVar2.zzK(Collections.singletonList(copyOf));
                    zzadkVar.zzl(zzakVar2.zzac());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzI, zzc, zza2);
            zzakn zzaknVar = this.zzf;
            if (i5 > 0) {
                zzaknVar.zza(zzI, zzc, zza2);
                i = 0;
            } else {
                i = -i5;
            }
            if (this.zzf.zzd(i)) {
                zzakn zzaknVar2 = this.zzf;
                int zzb = zzgg.zzb(zzaknVar2.zza, zzaknVar2.zzb);
                zzfj zzfjVar2 = this.zzc;
                int i9 = zzfs.zza;
                zzfjVar2.zzE(this.zzf.zza, zzb);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i4 == 178) {
                if (zzfjVar.zzI()[zza2 + 2] == 1) {
                    this.zzf.zzc(Opcodes.GETSTATIC);
                }
                i4 = 178;
            }
            int i10 = zzd - zza2;
            this.zzg.zzb(this.zzh - i10, i10, this.zzk);
            this.zzg.zzc(i4, this.zzl);
            zzc = i3;
        }
        if (!this.zzk) {
            this.zze.zza(zzI, zzc, zzd);
        }
        this.zzg.zza(zzI, zzc, zzd);
        this.zzf.zza(zzI, zzc, zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzb(zzach zzachVar, zzalk zzalkVar) {
        zzalkVar.zzc();
        this.zzi = zzalkVar.zzb();
        this.zzj = zzachVar.zzw(zzalkVar.zza(), 2);
        this.zzg = new zzakc(this.zzj);
        this.zzb.zzb(zzachVar, zzalkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzc(boolean z) {
        zzef.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajy
    public final void zze() {
        zzgg.zzf(this.zzd);
        this.zze.zzb();
        zzakc zzakcVar = this.zzg;
        if (zzakcVar != null) {
            zzakcVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    zzakd(zzaln zzalnVar) {
        this.zzb = zzalnVar;
        this.zzd = new boolean[4];
        this.zze = new zzakb(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzakn(Opcodes.GETSTATIC, 128);
        this.zzc = new zzfj();
    }
}
