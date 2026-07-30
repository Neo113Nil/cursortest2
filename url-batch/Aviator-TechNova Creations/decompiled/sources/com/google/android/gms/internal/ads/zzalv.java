package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzalv extends zzalt {
    private zzalu zza;
    private int zzb;
    private boolean zzc;
    private zzagm zzd;
    private zzagk zze;

    zzalv() {
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final long zzb(zzer zzerVar) {
        if ((zzerVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzerVar.zzi()[0];
        zzalu zzaluVar = this.zza;
        zzaluVar.getClass();
        int i = !zzaluVar.zzd[(b >> 1) & (255 >>> (8 - zzaluVar.zze))].zza ? zzaluVar.zza.zze : zzaluVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzerVar.zzj() < zzerVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze() + 4);
            zzerVar.zzb(copyOf, copyOf.length);
        } else {
            zzerVar.zzf(zzerVar.zze() + 4);
        }
        long j = i2;
        byte[] zzi = zzerVar.zzi();
        zzi[zzerVar.zze() - 4] = (byte) (j & 255);
        zzi[zzerVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzi[zzerVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzi[zzerVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzagm zzagmVar = this.zzd;
        this.zzb = zzagmVar != null ? zzagmVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzer zzerVar, long j, zzalr zzalrVar) throws IOException {
        zzalu zzaluVar;
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        long j2;
        if (this.zza != null) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzagm zzagmVar = this.zzd;
        int i5 = 1;
        if (zzagmVar == null) {
            zzagn.zzd(1, zzerVar, false);
            int zzI = zzerVar.zzI();
            int zzs = zzerVar.zzs();
            int zzI2 = zzerVar.zzI();
            int zzC = zzerVar.zzC();
            int i6 = zzC <= 0 ? -1 : zzC;
            int zzC2 = zzerVar.zzC();
            int i7 = zzC2 <= 0 ? -1 : zzC2;
            int zzC3 = zzerVar.zzC();
            int i8 = zzC3 <= 0 ? -1 : zzC3;
            int zzs2 = zzerVar.zzs();
            this.zzd = new zzagm(zzI, zzs, zzI2, i6, i7, i8, (int) Math.pow(2.0d, zzs2 & 15), (int) Math.pow(2.0d, (zzs2 & 240) >> 4), 1 == (zzerVar.zzs() & 1), Arrays.copyOf(zzerVar.zzi(), zzerVar.zze()));
        } else {
            int i9 = 4;
            zzagk zzagkVar = this.zze;
            if (zzagkVar == null) {
                this.zze = zzagn.zzb(zzerVar, true, true);
            } else {
                byte[] bArr = new byte[zzerVar.zze()];
                System.arraycopy(zzerVar.zzi(), 0, bArr, 0, zzerVar.zze());
                int i10 = zzagmVar.zza;
                int i11 = 5;
                zzagn.zzd(5, zzerVar, false);
                int zzs3 = zzerVar.zzs() + 1;
                zzagj zzagjVar = new zzagj(zzerVar.zzi());
                zzagjVar.zzc(zzerVar.zzg() * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = 16;
                    if (i12 >= zzs3) {
                        int i15 = i5;
                        int i16 = 6;
                        int zzb = zzagjVar.zzb(6) + i15;
                        for (int i17 = 0; i17 < zzb; i17++) {
                            if (zzagjVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int zzb2 = zzagjVar.zzb(6) + i15;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < zzb2) {
                                int zzb3 = zzagjVar.zzb(i14);
                                if (zzb3 == 0) {
                                    int i20 = 8;
                                    zzagjVar.zzc(8);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(16);
                                    zzagjVar.zzc(6);
                                    zzagjVar.zzc(8);
                                    int zzb4 = zzagjVar.zzb(4) + 1;
                                    int i21 = 0;
                                    while (i21 < zzb4) {
                                        zzagjVar.zzc(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (zzb3 != i15) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzb3).length() + 41);
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(zzb3);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    int zzb5 = zzagjVar.zzb(5);
                                    int[] iArr2 = new int[zzb5];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < zzb5; i23++) {
                                        int zzb6 = zzagjVar.zzb(4);
                                        iArr2[i23] = zzb6;
                                        if (zzb6 > i22) {
                                            i22 = zzb6;
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr3 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        int i26 = 1;
                                        iArr3[i25] = zzagjVar.zzb(i19) + 1;
                                        int zzb7 = zzagjVar.zzb(2);
                                        if (zzb7 > 0) {
                                            i3 = 8;
                                            zzagjVar.zzc(8);
                                        } else {
                                            i3 = 8;
                                        }
                                        int i27 = i24;
                                        int i28 = 0;
                                        while (true) {
                                            int i29 = i26 << zzb7;
                                            iArr = iArr2;
                                            if (i28 < i29) {
                                                zzagjVar.zzc(i3);
                                                i28++;
                                                iArr2 = iArr;
                                                i3 = 8;
                                                i26 = 1;
                                            }
                                        }
                                        i25++;
                                        iArr2 = iArr;
                                        i24 = i27;
                                        i19 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    zzagjVar.zzc(2);
                                    int zzb8 = zzagjVar.zzb(4);
                                    int i30 = 0;
                                    int i31 = 0;
                                    for (int i32 = 0; i32 < zzb5; i32++) {
                                        i30 += iArr3[iArr4[i32]];
                                        while (i31 < i30) {
                                            zzagjVar.zzc(zzb8);
                                            i31++;
                                        }
                                    }
                                }
                                i18++;
                                i16 = 6;
                                i14 = 16;
                                i15 = 1;
                            } else {
                                int i33 = 1;
                                int zzb9 = zzagjVar.zzb(i16) + 1;
                                int i34 = 0;
                                while (i34 < zzb9) {
                                    if (zzagjVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    zzagjVar.zzc(24);
                                    int zzb10 = zzagjVar.zzb(i16) + i33;
                                    int i35 = 8;
                                    zzagjVar.zzc(8);
                                    int[] iArr5 = new int[zzb10];
                                    for (int i36 = 0; i36 < zzb10; i36++) {
                                        iArr5[i36] = ((zzagjVar.zza() ? zzagjVar.zzb(5) : 0) * 8) + zzagjVar.zzb(3);
                                    }
                                    int i37 = 0;
                                    while (i37 < zzb10) {
                                        int i38 = 0;
                                        while (i38 < i35) {
                                            if ((iArr5[i37] & (1 << i38)) != 0) {
                                                zzagjVar.zzc(i35);
                                            }
                                            i38++;
                                            i35 = 8;
                                        }
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i16 = 6;
                                    i33 = 1;
                                }
                                int zzb11 = zzagjVar.zzb(i16) + 1;
                                for (int i39 = 0; i39 < zzb11; i39++) {
                                    int zzb12 = zzagjVar.zzb(16);
                                    if (zzb12 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzb12).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(zzb12);
                                        zzee.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzagjVar.zza()) {
                                            i = 1;
                                            i2 = zzagjVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzagjVar.zza()) {
                                            int zzb13 = zzagjVar.zzb(8) + i;
                                            for (int i40 = 0; i40 < zzb13; i40++) {
                                                int i41 = i10 - 1;
                                                zzagjVar.zzc(zzagn.zza(i41));
                                                zzagjVar.zzc(zzagn.zza(i41));
                                            }
                                        }
                                        if (zzagjVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i42 = 0; i42 < i10; i42++) {
                                                zzagjVar.zzc(4);
                                            }
                                        }
                                        for (int i43 = 0; i43 < i2; i43++) {
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                            zzagjVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzagjVar.zzb(6);
                                int i44 = zzb14 + 1;
                                zzagl[] zzaglVarArr = new zzagl[i44];
                                for (int i45 = 0; i45 < i44; i45++) {
                                    zzaglVarArr[i45] = new zzagl(zzagjVar.zza(), zzagjVar.zzb(16), zzagjVar.zzb(16), zzagjVar.zzb(8));
                                }
                                if (!zzagjVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzaluVar = new zzalu(zzagmVar, zzagkVar, bArr, zzaglVarArr, zzagn.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzagjVar.zzb(24) != 5653314) {
                            int zzd = zzagjVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(zzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int zzb15 = zzagjVar.zzb(16);
                        int zzb16 = zzagjVar.zzb(24);
                        if (zzagjVar.zza()) {
                            zzagjVar.zzc(i11);
                            for (int i46 = 0; i46 < zzb16; i46 += zzagjVar.zzb(zzagn.zza(zzb16 - i46))) {
                            }
                        } else {
                            boolean zza = zzagjVar.zza();
                            for (int i47 = 0; i47 < zzb16; i47++) {
                                if (!zza) {
                                    zzagjVar.zzc(i11);
                                } else if (zzagjVar.zza()) {
                                    zzagjVar.zzc(i11);
                                }
                            }
                        }
                        int i48 = i9;
                        int zzb17 = zzagjVar.zzb(i48);
                        if (zzb17 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(zzb17).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(zzb17);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (zzb17 == i5) {
                            i13 = zzb17;
                        } else if (zzb17 != 2) {
                            i4 = i5;
                            i12++;
                            i5 = i4;
                            i9 = 4;
                            i11 = 5;
                        }
                        zzagjVar.zzc(32);
                        zzagjVar.zzc(32);
                        int zzb18 = zzagjVar.zzb(i48) + i5;
                        zzagjVar.zzc(i5);
                        if (i13 != i5) {
                            i4 = i5;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            i4 = i5;
                            j2 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            i4 = i5;
                            j2 = 0;
                        }
                        zzagjVar.zzc((int) (j2 * zzb18));
                        i12++;
                        i5 = i4;
                        i9 = 4;
                        i11 = 5;
                    }
                }
            }
        }
        zzaluVar = null;
        this.zza = zzaluVar;
        if (zzaluVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzagm zzagmVar2 = zzaluVar.zza;
        arrayList.add(zzagmVar2.zzg);
        arrayList.add(zzaluVar.zzc);
        zzap zzc = zzagn.zzc(zzguf.zzr(zzaluVar.zzb.zza));
        zzt zztVar = new zzt();
        zztVar.zzl("audio/ogg");
        zztVar.zzm("audio/vorbis");
        zztVar.zzh(zzagmVar2.zzd);
        zztVar.zzi(zzagmVar2.zzc);
        zztVar.zzE(zzagmVar2.zza);
        zztVar.zzF(zzagmVar2.zzb);
        zztVar.zzp(arrayList);
        zztVar.zzk(zzc);
        zzalrVar.zza = zztVar.zzM();
        return true;
    }
}
