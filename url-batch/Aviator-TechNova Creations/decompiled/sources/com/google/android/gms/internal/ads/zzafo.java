package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzafo {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final String zzn;
    public final zzgj zzo;

    private zzafo(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f, int i13, String str, zzgj zzgjVar) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = i12;
        this.zzl = f;
        this.zzm = i13;
        this.zzn = str;
        this.zzo = zzgjVar;
    }

    public static zzafo zza(zzer zzerVar) throws zzat {
        return zzc(zzerVar, false, null);
    }

    public static zzafo zzb(zzer zzerVar, zzgj zzgjVar) throws zzat {
        return zzc(zzerVar, true, zzgjVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzafo zzc(zzer zzerVar, boolean z, zzgj zzgjVar) throws zzat {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        zzgf zzgfVar;
        int i3;
        int max;
        int i4;
        int max2;
        int i5;
        int i6;
        int i7;
        int i8 = 4;
        boolean z4 = true;
        if (z) {
            try {
                zzerVar.zzk(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z3 = true;
                throw zzat.zzb("Error parsing".concat(z3 != z ? "HEVC config" : "L-HEVC config"), e);
            }
        } else {
            try {
                zzerVar.zzk(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z2 = z4;
                z3 = z2;
                throw zzat.zzb("Error parsing".concat(z3 != z ? "HEVC config" : "L-HEVC config"), e);
            }
        }
        int zzs = zzerVar.zzs() & 3;
        int zzs2 = zzerVar.zzs();
        int zzg = zzerVar.zzg();
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < zzs2; i11++) {
            zzerVar.zzk(1);
            int zzt = zzerVar.zzt();
            for (int i12 = 0; i12 < zzt; i12++) {
                int zzt2 = zzerVar.zzt();
                i10 += zzt2 + 4;
                zzerVar.zzk(zzt2);
            }
        }
        zzerVar.zzh(zzg);
        byte[] bArr = new byte[i10];
        zzgj zzgjVar2 = zzgjVar;
        int i13 = 0;
        float f = 1.0f;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        String str = null;
        int i26 = 0;
        while (i26 < zzs2) {
            int zzs3 = zzerVar.zzs() & 63;
            int zzt3 = zzerVar.zzt();
            z2 = z4;
            int i27 = i9;
            zzgj zzgjVar3 = zzgjVar2;
            while (i27 < zzt3) {
                try {
                    int zzt4 = zzerVar.zzt();
                    int i28 = i27;
                    System.arraycopy(zzgm.zza, i9, bArr, i13, i8);
                    int i29 = i13 + 4;
                    System.arraycopy(zzerVar.zzi(), zzerVar.zzg(), bArr, i29, zzt4);
                    int i30 = 32;
                    if (zzs3 != 32) {
                        i30 = zzs3;
                    } else if (i28 == 0) {
                        zzgjVar3 = zzgm.zzf(bArr, i29, i29 + zzt4);
                        i2 = i29;
                        i = zzs;
                        i6 = 0;
                        i5 = 0;
                        i13 = i2 + zzt4;
                        zzerVar.zzk(zzt4);
                        i27 = i6 + 1;
                        i9 = i5;
                        zzs = i;
                        i8 = 4;
                    }
                    i = zzs;
                    if (i30 != 33) {
                        i2 = i29;
                        int i31 = 8;
                        if (i30 == 39 && i28 == 0) {
                            int i32 = i13 + 6;
                            int i33 = (i2 + zzt4) - 1;
                            while (true) {
                                byte b = bArr[i33];
                                if (b == 0) {
                                    if (i33 <= i32) {
                                        break;
                                    }
                                    i33--;
                                } else if (b != 0 && i33 > i32) {
                                    zzgn zzgnVar = new zzgn(bArr, i32, i33 + 1);
                                    while (true) {
                                        if (!zzgnVar.zzd(16)) {
                                            break;
                                        }
                                        int i34 = i31;
                                        int zzf = zzgnVar.zzf(i34);
                                        int i35 = 0;
                                        while (zzf == 255) {
                                            i35 += 255;
                                            zzf = zzgnVar.zzf(i34);
                                        }
                                        int i36 = i35 + zzf;
                                        int zzf2 = zzgnVar.zzf(i34);
                                        int i37 = 0;
                                        while (zzf2 == 255) {
                                            i37 += 255;
                                            zzf2 = zzgnVar.zzf(8);
                                        }
                                        i31 = 8;
                                        int i38 = i37 + zzf2;
                                        if (i38 == 0 || !zzgnVar.zzd(i38)) {
                                            break;
                                        }
                                        if (i36 == 176) {
                                            int zzg2 = zzgnVar.zzg();
                                            boolean zze = zzgnVar.zze();
                                            int zzg3 = zze ? zzgnVar.zzg() : 0;
                                            int zzg4 = zzgnVar.zzg();
                                            int i39 = -1;
                                            int i40 = -1;
                                            int i41 = -1;
                                            int i42 = -1;
                                            int i43 = -1;
                                            int i44 = -1;
                                            int i45 = 0;
                                            while (i45 <= zzg4) {
                                                i39 = zzgnVar.zzg();
                                                i40 = zzgnVar.zzg();
                                                boolean z5 = zze;
                                                int zzf3 = zzgnVar.zzf(6);
                                                if (zzf3 != 63) {
                                                    if (zzf3 == 0) {
                                                        i3 = zzf3;
                                                        max = Math.max(0, zzg2 - 30);
                                                    } else {
                                                        i3 = zzf3;
                                                        max = Math.max(0, (i3 + zzg2) - 31);
                                                    }
                                                    i42 = zzgnVar.zzf(max);
                                                    if (z5) {
                                                        int zzf4 = zzgnVar.zzf(6);
                                                        if (zzf4 != 63) {
                                                            if (zzf4 == 0) {
                                                                i4 = zzf4;
                                                                max2 = Math.max(0, zzg3 - 30);
                                                            } else {
                                                                i4 = zzf4;
                                                                max2 = Math.max(0, (i4 + zzg3) - 31);
                                                            }
                                                            i44 = zzgnVar.zzf(max2);
                                                            i43 = i4;
                                                        }
                                                    }
                                                    if (zzgnVar.zze()) {
                                                        zzgnVar.zzb(10);
                                                    }
                                                    i45++;
                                                    zze = z5;
                                                    i41 = i3;
                                                }
                                            }
                                            zzgfVar = new zzgf(zzg2, zzg3, zzg4 + 1, i39, i40, i41, i42, i43, i44);
                                        } else {
                                            zzgnVar.zzb(i38 * 8);
                                        }
                                    }
                                }
                            }
                            zzgfVar = null;
                            if (zzgfVar != null && zzgjVar3 != null) {
                                i5 = 0;
                                if (zzgfVar.zza == ((zzfz) zzgjVar3.zza.get(0)).zzb) {
                                    i6 = i28;
                                    i24 = 4;
                                    i13 = i2 + zzt4;
                                    zzerVar.zzk(zzt4);
                                    i27 = i6 + 1;
                                    i9 = i5;
                                    zzs = i;
                                    i8 = 4;
                                } else {
                                    i24 = 5;
                                }
                            }
                        }
                        i5 = 0;
                    } else if (i28 == 0) {
                        zzgg zzg5 = zzgm.zzg(bArr, i29, i29 + zzt4, zzgjVar3);
                        int i46 = zzg5.zza + 1;
                        int i47 = zzg5.zze;
                        int i48 = zzg5.zzf;
                        int i49 = zzg5.zzg;
                        i2 = i29;
                        int i50 = zzg5.zzh;
                        int i51 = zzg5.zzc + 8;
                        int i52 = zzg5.zzd + 8;
                        int i53 = zzg5.zzk;
                        int i54 = zzg5.zzl;
                        int i55 = zzg5.zzm;
                        float f2 = zzg5.zzi;
                        int i56 = zzg5.zzj;
                        zzgb zzgbVar = zzg5.zzb;
                        if (zzgbVar != null) {
                            i7 = i56;
                            str = zzdo.zzb(zzgbVar.zza, zzgbVar.zzb, zzgbVar.zzc, zzgbVar.zzd, zzgbVar.zze, zzgbVar.zzf);
                        } else {
                            i7 = i56;
                        }
                        i23 = i55;
                        f = f2;
                        i25 = i7;
                        i6 = i28;
                        i20 = i52;
                        i21 = i53;
                        i22 = i54;
                        i17 = i49;
                        i18 = i50;
                        i19 = i51;
                        i5 = 0;
                        i15 = i47;
                        i16 = i48;
                        i14 = i46;
                        i13 = i2 + zzt4;
                        zzerVar.zzk(zzt4);
                        i27 = i6 + 1;
                        i9 = i5;
                        zzs = i;
                        i8 = 4;
                    } else {
                        i2 = i29;
                        i5 = 0;
                    }
                    i6 = i28;
                    i13 = i2 + zzt4;
                    zzerVar.zzk(zzt4);
                    i27 = i6 + 1;
                    i9 = i5;
                    zzs = i;
                    i8 = 4;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    e = e3;
                    z3 = z2;
                    throw zzat.zzb("Error parsing".concat(z3 != z ? "HEVC config" : "L-HEVC config"), e);
                }
            }
            i26++;
            zzgjVar2 = zzgjVar3;
            z4 = z2;
            zzs = zzs;
            i8 = 4;
        }
        z2 = z4;
        return new zzafo(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), zzs + 1, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, f, i25, str, zzgjVar2);
    }
}
