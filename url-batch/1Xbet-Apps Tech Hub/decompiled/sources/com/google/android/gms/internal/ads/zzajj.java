package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzajj extends zzajh {
    private zzaji zza;
    private int zzb;
    private boolean zzc;
    private zzadp zzd;
    private zzadn zze;

    zzajj() {
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    protected final long zza(zzfj zzfjVar) {
        if ((zzfjVar.zzI()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzfjVar.zzI()[0];
        zzaji zzajiVar = this.zza;
        zzef.zzb(zzajiVar);
        int i = !zzajiVar.zzd[(b >> 1) & (255 >>> (8 - zzajiVar.zze))].zza ? zzajiVar.zza.zze : zzajiVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzfjVar.zzb() < zzfjVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfjVar.zzI(), zzfjVar.zzd() + 4);
            zzfjVar.zzE(copyOf, copyOf.length);
        } else {
            zzfjVar.zzF(zzfjVar.zzd() + 4);
        }
        long j = i2;
        byte[] zzI = zzfjVar.zzI();
        zzI[zzfjVar.zzd() - 4] = (byte) (j & 255);
        zzI[zzfjVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        zzI[zzfjVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        zzI[zzfjVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzadp zzadpVar = this.zzd;
        this.zzb = zzadpVar != null ? zzadpVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzajh
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfj zzfjVar, long j, zzaje zzajeVar) throws IOException {
        zzaji zzajiVar;
        int i;
        int i2;
        int i3;
        int i4;
        zzadp zzadpVar;
        long j2;
        if (this.zza != null) {
            zzajeVar.zza.getClass();
            return false;
        }
        zzadp zzadpVar2 = this.zzd;
        int i5 = 4;
        if (zzadpVar2 == null) {
            zzadq.zzd(1, zzfjVar, false);
            int zzi = zzfjVar.zzi();
            int zzl = zzfjVar.zzl();
            int zzi2 = zzfjVar.zzi();
            int zzh = zzfjVar.zzh();
            int i6 = zzh <= 0 ? -1 : zzh;
            int zzh2 = zzfjVar.zzh();
            int i7 = zzh2 <= 0 ? -1 : zzh2;
            int zzh3 = zzfjVar.zzh();
            int i8 = zzh3 <= 0 ? -1 : zzh3;
            int zzl2 = zzfjVar.zzl();
            this.zzd = new zzadp(zzi, zzl, zzi2, i6, i7, i8, (int) Math.pow(2.0d, zzl2 & 15), (int) Math.pow(2.0d, (zzl2 & 240) >> 4), 1 == (zzfjVar.zzl() & 1), Arrays.copyOf(zzfjVar.zzI(), zzfjVar.zzd()));
        } else {
            zzadn zzadnVar = this.zze;
            if (zzadnVar == null) {
                this.zze = zzadq.zzc(zzfjVar, true, true);
            } else {
                byte[] bArr = new byte[zzfjVar.zzd()];
                System.arraycopy(zzfjVar.zzI(), 0, bArr, 0, zzfjVar.zzd());
                int i9 = zzadpVar2.zza;
                int i10 = 5;
                zzadq.zzd(5, zzfjVar, false);
                int zzl3 = zzfjVar.zzl() + 1;
                zzadm zzadmVar = new zzadm(zzfjVar.zzI());
                zzadmVar.zzc(zzfjVar.zzc() * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = 16;
                    if (i11 >= zzl3) {
                        zzadp zzadpVar3 = zzadpVar2;
                        int i14 = 6;
                        int zzb = zzadmVar.zzb(6) + 1;
                        for (int i15 = 0; i15 < zzb; i15++) {
                            if (zzadmVar.zzb(16) != 0) {
                                throw zzcf.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i16 = 1;
                        int zzb2 = zzadmVar.zzb(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < zzb2) {
                                int zzb3 = zzadmVar.zzb(i13);
                                if (zzb3 == 0) {
                                    i3 = zzb2;
                                    int i19 = 8;
                                    zzadmVar.zzc(8);
                                    zzadmVar.zzc(16);
                                    zzadmVar.zzc(16);
                                    zzadmVar.zzc(6);
                                    zzadmVar.zzc(8);
                                    int zzb4 = zzadmVar.zzb(4) + 1;
                                    int i20 = 0;
                                    while (i20 < zzb4) {
                                        zzadmVar.zzc(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (zzb3 != i16) {
                                        throw zzcf.zza("floor type greater than 1 not decodable: " + zzb3, null);
                                    }
                                    int zzb5 = zzadmVar.zzb(i10);
                                    int[] iArr = new int[zzb5];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < zzb5; i22++) {
                                        int zzb6 = zzadmVar.zzb(4);
                                        iArr[i22] = zzb6;
                                        if (zzb6 > i21) {
                                            i21 = zzb6;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = zzadmVar.zzb(i18) + 1;
                                        int zzb7 = zzadmVar.zzb(i12);
                                        if (zzb7 > 0) {
                                            i4 = 8;
                                            zzadmVar.zzc(8);
                                        } else {
                                            i4 = 8;
                                        }
                                        int i25 = zzb2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << zzb7); i27 = 1) {
                                            zzadmVar.zzc(i4);
                                            i26++;
                                            i4 = 8;
                                        }
                                        i24++;
                                        zzb2 = i25;
                                        i12 = 2;
                                        i18 = 3;
                                    }
                                    i3 = zzb2;
                                    zzadmVar.zzc(i12);
                                    int zzb8 = zzadmVar.zzb(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < zzb5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            zzadmVar.zzc(zzb8);
                                            i29++;
                                        }
                                    }
                                }
                                i17++;
                                zzb2 = i3;
                                i14 = 6;
                                i13 = 16;
                                i12 = 2;
                                i16 = 1;
                                i10 = 5;
                            } else {
                                int i31 = 1;
                                int zzb9 = zzadmVar.zzb(i14) + 1;
                                int i32 = 0;
                                while (i32 < zzb9) {
                                    if (zzadmVar.zzb(16) > 2) {
                                        throw zzcf.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzadmVar.zzc(24);
                                    zzadmVar.zzc(24);
                                    zzadmVar.zzc(24);
                                    int zzb10 = zzadmVar.zzb(i14) + i31;
                                    int i33 = 8;
                                    zzadmVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i34 = 0; i34 < zzb10; i34++) {
                                        iArr3[i34] = ((zzadmVar.zzd() ? zzadmVar.zzb(5) : 0) * 8) + zzadmVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < zzb10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzadmVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i14 = 6;
                                    i31 = 1;
                                }
                                int zzb11 = zzadmVar.zzb(i14) + 1;
                                for (int i37 = 0; i37 < zzb11; i37++) {
                                    int zzb12 = zzadmVar.zzb(16);
                                    if (zzb12 != 0) {
                                        zzez.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb12);
                                    } else {
                                        if (zzadmVar.zzd()) {
                                            i = 1;
                                            i2 = zzadmVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzadmVar.zzd()) {
                                            int zzb13 = zzadmVar.zzb(8) + i;
                                            for (int i38 = 0; i38 < zzb13; i38++) {
                                                int i39 = i9 - 1;
                                                zzadmVar.zzc(zzadq.zza(i39));
                                                zzadmVar.zzc(zzadq.zza(i39));
                                            }
                                        }
                                        if (zzadmVar.zzb(2) != 0) {
                                            throw zzcf.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i40 = 0; i40 < i9; i40++) {
                                                zzadmVar.zzc(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i2; i41++) {
                                            zzadmVar.zzc(8);
                                            zzadmVar.zzc(8);
                                            zzadmVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzadmVar.zzb(6) + 1;
                                zzado[] zzadoVarArr = new zzado[zzb14];
                                for (int i42 = 0; i42 < zzb14; i42++) {
                                    zzadoVarArr[i42] = new zzado(zzadmVar.zzd(), zzadmVar.zzb(16), zzadmVar.zzb(16), zzadmVar.zzb(8));
                                }
                                if (!zzadmVar.zzd()) {
                                    throw zzcf.zza("framing bit after modes not set as expected", null);
                                }
                                zzajiVar = new zzaji(zzadpVar3, zzadnVar, bArr, zzadoVarArr, zzadq.zza(zzb14 - 1));
                            }
                        }
                    } else {
                        if (zzadmVar.zzb(24) != 5653314) {
                            throw zzcf.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzadmVar.zza(), null);
                        }
                        int zzb15 = zzadmVar.zzb(16);
                        int zzb16 = zzadmVar.zzb(24);
                        if (zzadmVar.zzd()) {
                            zzadmVar.zzc(5);
                            for (int i43 = 0; i43 < zzb16; i43 += zzadmVar.zzb(zzadq.zza(zzb16 - i43))) {
                            }
                        } else {
                            boolean zzd = zzadmVar.zzd();
                            for (int i44 = 0; i44 < zzb16; i44++) {
                                if (!zzd) {
                                    zzadmVar.zzc(5);
                                } else if (zzadmVar.zzd()) {
                                    zzadmVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzadmVar.zzb(i5);
                        if (zzb17 > 2) {
                            throw zzcf.zza("lookup type greater than 2 not decodable: " + zzb17, null);
                        }
                        if (zzb17 == 1) {
                            i12 = zzb17;
                        } else if (zzb17 != 2) {
                            zzadpVar = zzadpVar2;
                            i11++;
                            zzadpVar2 = zzadpVar;
                            i5 = 4;
                        }
                        zzadmVar.zzc(32);
                        zzadmVar.zzc(32);
                        int zzb18 = zzadmVar.zzb(i5) + 1;
                        zzadmVar.zzc(1);
                        if (i12 != 1) {
                            zzadpVar = zzadpVar2;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            zzadpVar = zzadpVar2;
                            j2 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            zzadpVar = zzadpVar2;
                            j2 = 0;
                        }
                        zzadmVar.zzc((int) (j2 * zzb18));
                        i11++;
                        zzadpVar2 = zzadpVar;
                        i5 = 4;
                    }
                }
            }
        }
        zzajiVar = null;
        this.zza = zzajiVar;
        if (zzajiVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzadp zzadpVar4 = zzajiVar.zza;
        arrayList.add(zzadpVar4.zzg);
        arrayList.add(zzajiVar.zzc);
        zzcb zzb19 = zzadq.zzb(zzfwu.zzk(zzajiVar.zzb.zzb));
        zzak zzakVar = new zzak();
        zzakVar.zzU("audio/vorbis");
        zzakVar.zzx(zzadpVar4.zzd);
        zzakVar.zzQ(zzadpVar4.zzc);
        zzakVar.zzy(zzadpVar4.zza);
        zzakVar.zzV(zzadpVar4.zzb);
        zzakVar.zzK(arrayList);
        zzakVar.zzO(zzb19);
        zzajeVar.zza = zzakVar.zzac();
        return true;
    }
}
