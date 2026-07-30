package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i8, int i9, zzfw zzfwVar, boolean z7, boolean z8, int[] iArr2, int i10, int i11, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i8;
        this.zzf = i9;
        this.zzh = z7;
        this.zzi = iArr2;
        this.zzj = i10;
        this.zzk = i11;
        this.zzo = zzgbVar;
        this.zzl = zzfkVar;
        this.zzm = zzgyVar;
        this.zzn = zzelVar;
        this.zzg = zzfwVar;
        this.zzp = zzfrVar;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzB(Object obj, Object obj2, int i8) {
        long zzv = zzv(i8) & 1048575;
        if (zzG(obj2, i8)) {
            Object zzf = zzhi.zzf(obj, zzv);
            Object zzf2 = zzhi.zzf(obj2, zzv);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, zzv, zzez.zzg(zzf, zzf2));
                zzD(obj, i8);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, zzv, zzf2);
                zzD(obj, i8);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i8) {
        int zzv = zzv(i8);
        int i9 = this.zzc[i8];
        long j8 = zzv & 1048575;
        if (zzJ(obj2, i9, i8)) {
            Object zzf = zzJ(obj, i9, i8) ? zzhi.zzf(obj, j8) : null;
            Object zzf2 = zzhi.zzf(obj2, j8);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, j8, zzez.zzg(zzf, zzf2));
                zzE(obj, i9, i8);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, j8, zzf2);
                zzE(obj, i9, i8);
            }
        }
    }

    private final void zzD(Object obj, int i8) {
        int zzs = zzs(i8);
        long j8 = 1048575 & zzs;
        if (j8 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j8, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j8));
    }

    private final void zzE(Object obj, int i8, int i9) {
        zzhi.zzn(obj, zzs(i9) & 1048575, i8);
    }

    private final boolean zzF(Object obj, Object obj2, int i8) {
        return zzG(obj, i8) == zzG(obj2, i8);
    }

    private final boolean zzG(Object obj, int i8) {
        int zzs = zzs(i8);
        long j8 = zzs & 1048575;
        if (j8 != 1048575) {
            return (zzhi.zzc(obj, j8) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i8);
        long j9 = zzv & 1048575;
        switch (zzu(zzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j9)) != 0;
            case 2:
                return zzhi.zzd(obj, j9) != 0;
            case 3:
                return zzhi.zzd(obj, j9) != 0;
            case 4:
                return zzhi.zzc(obj, j9) != 0;
            case 5:
                return zzhi.zzd(obj, j9) != 0;
            case 6:
                return zzhi.zzc(obj, j9) != 0;
            case 7:
                return zzhi.zzt(obj, j9);
            case 8:
                Object zzf = zzhi.zzf(obj, j9);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzee) {
                    return !zzee.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j9) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j9));
            case 11:
                return zzhi.zzc(obj, j9) != 0;
            case 12:
                return zzhi.zzc(obj, j9) != 0;
            case 13:
                return zzhi.zzc(obj, j9) != 0;
            case 14:
                return zzhi.zzd(obj, j9) != 0;
            case 15:
                return zzhi.zzc(obj, j9) != 0;
            case 16:
                return zzhi.zzd(obj, j9) != 0;
            case 17:
                return zzhi.zzf(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? zzG(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean zzI(Object obj, int i8, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i8 & 1048575));
    }

    private final boolean zzJ(Object obj, int i8, int i9) {
        return zzhi.zzc(obj, (long) (zzs(i9) & 1048575)) == i8;
    }

    static zzgz zzc(Object obj) {
        zzeu zzeuVar = (zzeu) obj;
        zzgz zzgzVar = zzeuVar.zzc;
        if (zzgzVar != zzgz.zza()) {
            return zzgzVar;
        }
        zzgz zzc = zzgz.zzc();
        zzeuVar.zzc = zzc;
        return zzc;
    }

    static zzfz zzj(Class cls, zzft zzftVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        if (zzftVar instanceof zzgg) {
            return zzk((zzgg) zzftVar, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i8;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt4;
        int i14;
        char charAt5;
        int i15;
        char charAt6;
        int i16;
        char charAt7;
        int i17;
        char charAt8;
        int i18;
        char charAt9;
        int i19;
        char charAt10;
        int i20;
        char charAt11;
        int i21;
        int i22;
        int i23;
        int[] iArr2;
        int i24;
        int i25;
        int i26;
        int objectFieldOffset;
        int i27;
        Object[] objArr;
        String str;
        int i28;
        int i29;
        int i30;
        Field zzA;
        char charAt12;
        int i31;
        int i32;
        int i33;
        Object obj;
        Field zzA2;
        Object obj2;
        Field zzA3;
        int i34;
        char charAt13;
        int i35;
        char charAt14;
        int i36;
        char charAt15;
        int i37;
        char charAt16;
        boolean z7 = zzggVar.zzc() == 2;
        String zzd = zzggVar.zzd();
        int length = zzd.length();
        char c8 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i38 = 1;
            while (true) {
                i8 = i38 + 1;
                if (zzd.charAt(i38) < 55296) {
                    break;
                }
                i38 = i8;
            }
        } else {
            i8 = 1;
        }
        int i39 = i8 + 1;
        int charAt17 = zzd.charAt(i8);
        if (charAt17 >= 55296) {
            int i40 = charAt17 & 8191;
            int i41 = 13;
            while (true) {
                i37 = i39 + 1;
                charAt16 = zzd.charAt(i39);
                if (charAt16 < 55296) {
                    break;
                }
                i40 |= (charAt16 & 8191) << i41;
                i41 += 13;
                i39 = i37;
            }
            charAt17 = i40 | (charAt16 << i41);
            i39 = i37;
        }
        if (charAt17 == 0) {
            iArr = zza;
            i10 = 0;
            charAt = 0;
            i12 = 0;
            charAt2 = 0;
            i11 = 0;
            charAt3 = 0;
            i9 = 0;
        } else {
            int i42 = i39 + 1;
            int charAt18 = zzd.charAt(i39);
            if (charAt18 >= 55296) {
                int i43 = charAt18 & 8191;
                int i44 = 13;
                while (true) {
                    i20 = i42 + 1;
                    charAt11 = zzd.charAt(i42);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i43 |= (charAt11 & 8191) << i44;
                    i44 += 13;
                    i42 = i20;
                }
                charAt18 = i43 | (charAt11 << i44);
                i42 = i20;
            }
            int i45 = i42 + 1;
            int charAt19 = zzd.charAt(i42);
            if (charAt19 >= 55296) {
                int i46 = charAt19 & 8191;
                int i47 = 13;
                while (true) {
                    i19 = i45 + 1;
                    charAt10 = zzd.charAt(i45);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i46 |= (charAt10 & 8191) << i47;
                    i47 += 13;
                    i45 = i19;
                }
                charAt19 = i46 | (charAt10 << i47);
                i45 = i19;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i18 = i48 + 1;
                    charAt9 = zzd.charAt(i48);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i49 |= (charAt9 & 8191) << i50;
                    i50 += 13;
                    i48 = i18;
                }
                charAt = i49 | (charAt9 << i50);
                i48 = i18;
            }
            int i51 = i48 + 1;
            int charAt20 = zzd.charAt(i48);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i17 = i51 + 1;
                    charAt8 = zzd.charAt(i51);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i52 |= (charAt8 & 8191) << i53;
                    i53 += 13;
                    i51 = i17;
                }
                charAt20 = i52 | (charAt8 << i53);
                i51 = i17;
            }
            int i54 = i51 + 1;
            charAt2 = zzd.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i16 = i54 + 1;
                    charAt7 = zzd.charAt(i54);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i55 |= (charAt7 & 8191) << i56;
                    i56 += 13;
                    i54 = i16;
                }
                charAt2 = i55 | (charAt7 << i56);
                i54 = i16;
            }
            int i57 = i54 + 1;
            int charAt21 = zzd.charAt(i54);
            if (charAt21 >= 55296) {
                int i58 = charAt21 & 8191;
                int i59 = 13;
                while (true) {
                    i15 = i57 + 1;
                    charAt6 = zzd.charAt(i57);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i58 |= (charAt6 & 8191) << i59;
                    i59 += 13;
                    i57 = i15;
                }
                charAt21 = i58 | (charAt6 << i59);
                i57 = i15;
            }
            int i60 = i57 + 1;
            int charAt22 = zzd.charAt(i57);
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                while (true) {
                    i14 = i60 + 1;
                    charAt5 = zzd.charAt(i60);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i61 |= (charAt5 & 8191) << i62;
                    i62 += 13;
                    i60 = i14;
                }
                charAt22 = i61 | (charAt5 << i62);
                i60 = i14;
            }
            int i63 = i60 + 1;
            charAt3 = zzd.charAt(i60);
            if (charAt3 >= 55296) {
                int i64 = charAt3 & 8191;
                int i65 = 13;
                while (true) {
                    i13 = i63 + 1;
                    charAt4 = zzd.charAt(i63);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i64 |= (charAt4 & 8191) << i65;
                    i65 += 13;
                    i63 = i13;
                }
                charAt3 = i64 | (charAt4 << i65);
                i63 = i13;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i9 = charAt18 + charAt18 + charAt19;
            i10 = charAt18;
            i39 = i63;
            int i66 = charAt21;
            i11 = charAt20;
            i12 = i66;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i67 = charAt3 + i12;
        int i68 = charAt3;
        int i69 = i67;
        int i70 = 0;
        int i71 = 0;
        while (i39 < length) {
            int i72 = i39 + 1;
            int charAt23 = zzd.charAt(i39);
            if (charAt23 >= c8) {
                int i73 = charAt23 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i36 = i74 + 1;
                    charAt15 = zzd.charAt(i74);
                    if (charAt15 < c8) {
                        break;
                    }
                    i73 |= (charAt15 & 8191) << i75;
                    i75 += 13;
                    i74 = i36;
                }
                charAt23 = i73 | (charAt15 << i75);
                i21 = i36;
            } else {
                i21 = i72;
            }
            int i76 = i21 + 1;
            int charAt24 = zzd.charAt(i21);
            if (charAt24 >= c8) {
                int i77 = charAt24 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i35 = i78 + 1;
                    charAt14 = zzd.charAt(i78);
                    i22 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i77 |= (charAt14 & 8191) << i79;
                    i79 += 13;
                    i78 = i35;
                    length = i22;
                }
                charAt24 = i77 | (charAt14 << i79);
                i23 = i35;
            } else {
                i22 = length;
                i23 = i76;
            }
            int i80 = charAt24 & 255;
            int i81 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i71] = i70;
                i71++;
            }
            if (i80 >= 51) {
                int i82 = i23 + 1;
                int charAt25 = zzd.charAt(i23);
                if (charAt25 >= 55296) {
                    int i83 = charAt25 & 8191;
                    int i84 = i82;
                    int i85 = 13;
                    while (true) {
                        i34 = i84 + 1;
                        charAt13 = zzd.charAt(i84);
                        i25 = i11;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i83 |= (charAt13 & 8191) << i85;
                        i85 += 13;
                        i84 = i34;
                        i11 = i25;
                    }
                    charAt25 = i83 | (charAt13 << i85);
                    i32 = i34;
                } else {
                    i25 = i11;
                    i32 = i82;
                }
                int i86 = i80 - 51;
                int i87 = i32;
                if (i86 == 9 || i86 == 17) {
                    int i88 = i70 / 3;
                    i33 = i9 + 1;
                    objArr2[i88 + i88 + 1] = zze[i9];
                } else {
                    if (i86 == 12 && !z7) {
                        int i89 = i70 / 3;
                        i33 = i9 + 1;
                        objArr2[i89 + i89 + 1] = zze[i9];
                    }
                    int i90 = charAt25 + charAt25;
                    obj = zze[i90];
                    if (obj instanceof Field) {
                        zzA2 = zzA(cls, (String) obj);
                        zze[i90] = zzA2;
                    } else {
                        zzA2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i24 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzA2);
                    int i91 = i90 + 1;
                    obj2 = zze[i91];
                    if (obj2 instanceof Field) {
                        zzA3 = zzA(cls, (String) obj2);
                        zze[i91] = zzA3;
                    } else {
                        zzA3 = (Field) obj2;
                    }
                    str = zzd;
                    i28 = i10;
                    objArr = objArr2;
                    i26 = i9;
                    i29 = i87;
                    i27 = (int) unsafe.objectFieldOffset(zzA3);
                    objectFieldOffset = objectFieldOffset2;
                    i30 = 0;
                }
                i9 = i33;
                int i902 = charAt25 + charAt25;
                obj = zze[i902];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i24 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzA2);
                int i912 = i902 + 1;
                obj2 = zze[i912];
                if (obj2 instanceof Field) {
                }
                str = zzd;
                i28 = i10;
                objArr = objArr2;
                i26 = i9;
                i29 = i87;
                i27 = (int) unsafe.objectFieldOffset(zzA3);
                objectFieldOffset = objectFieldOffset22;
                i30 = 0;
            } else {
                iArr2 = iArr3;
                i24 = charAt;
                i25 = i11;
                int i92 = i9 + 1;
                Field zzA4 = zzA(cls, (String) zze[i9]);
                if (i80 == 9 || i80 == 17) {
                    int i93 = i70 / 3;
                    objArr2[i93 + i93 + 1] = zzA4.getType();
                } else {
                    if (i80 == 27 || i80 == 49) {
                        int i94 = i70 / 3;
                        i31 = i9 + 2;
                        objArr2[i94 + i94 + 1] = zze[i92];
                    } else if (i80 == 12 || i80 == 30 || i80 == 44) {
                        if (!z7) {
                            int i95 = i70 / 3;
                            i31 = i9 + 2;
                            objArr2[i95 + i95 + 1] = zze[i92];
                        }
                    } else if (i80 == 50) {
                        int i96 = i68 + 1;
                        iArr[i68] = i70;
                        int i97 = i70 / 3;
                        int i98 = i97 + i97;
                        int i99 = i9 + 2;
                        objArr2[i98] = zze[i92];
                        if ((charAt24 & 2048) != 0) {
                            i92 = i9 + 3;
                            objArr2[i98 + 1] = zze[i99];
                            i68 = i96;
                        } else {
                            i68 = i96;
                            i26 = i99;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                            i27 = 1048575;
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i80 > 17) {
                                str = zzd;
                                i28 = i10;
                                i29 = i23;
                                i30 = 0;
                            } else {
                                int i100 = i23 + 1;
                                int charAt26 = zzd.charAt(i23);
                                if (charAt26 >= 55296) {
                                    int i101 = charAt26 & 8191;
                                    int i102 = 13;
                                    while (true) {
                                        i29 = i100 + 1;
                                        charAt12 = zzd.charAt(i100);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i101 |= (charAt12 & 8191) << i102;
                                        i102 += 13;
                                        i100 = i29;
                                    }
                                    charAt26 = i101 | (charAt12 << i102);
                                } else {
                                    i29 = i100;
                                }
                                int i103 = i10 + i10 + (charAt26 / 32);
                                Object obj3 = zze[i103];
                                str = zzd;
                                if (obj3 instanceof Field) {
                                    zzA = (Field) obj3;
                                } else {
                                    zzA = zzA(cls, (String) obj3);
                                    zze[i103] = zzA;
                                }
                                i28 = i10;
                                i30 = charAt26 % 32;
                                i27 = (int) unsafe.objectFieldOffset(zzA);
                            }
                            if (i80 >= 18 && i80 <= 49) {
                                iArr[i69] = objectFieldOffset;
                                i69++;
                            }
                        }
                    }
                    i26 = i31;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                    i27 = 1048575;
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    i28 = i10;
                    i29 = i23;
                    i30 = 0;
                    if (i80 >= 18) {
                        iArr[i69] = objectFieldOffset;
                        i69++;
                    }
                }
                i26 = i92;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzA4);
                i27 = 1048575;
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i28 = i10;
                i29 = i23;
                i30 = 0;
                if (i80 >= 18) {
                }
            }
            int i104 = i70 + 1;
            iArr2[i70] = charAt23;
            int i105 = i70 + 2;
            iArr2[i104] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i80 << 20) | objectFieldOffset;
            i70 += 3;
            iArr2[i105] = (i30 << 20) | i27;
            i10 = i28;
            i9 = i26;
            charAt = i24;
            charAt3 = i81;
            i39 = i29;
            length = i22;
            objArr2 = objArr;
            zzd = str;
            iArr3 = iArr2;
            i11 = i25;
            c8 = 55296;
        }
        return new zzfz(iArr3, objArr2, charAt, i11, zzggVar.zza(), z7, false, iArr, charAt3, i67, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j8) {
        return ((Integer) zzhi.zzf(obj, j8)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i8, int i9, int i10, long j8, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i10);
        Object object = unsafe.getObject(obj, j8);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j8, zzb2);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, int i15, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        long j9 = this.zzc[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj, j8, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i8))));
                    unsafe.putInt(obj, j9, i11);
                    return i8 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj, j8, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i8))));
                    unsafe.putInt(obj, j9, i11);
                    return i8 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int zzm = zzdt.zzm(bArr, i8, zzdsVar);
                    unsafe.putObject(obj, j8, Long.valueOf(zzdsVar.zzb));
                    unsafe.putInt(obj, j9, i11);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int zzj = zzdt.zzj(bArr, i8, zzdsVar);
                    unsafe.putObject(obj, j8, Integer.valueOf(zzdsVar.zza));
                    unsafe.putInt(obj, j9, i11);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj, j8, Long.valueOf(zzdt.zzn(bArr, i8)));
                    unsafe.putInt(obj, j9, i11);
                    return i8 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj, j8, Integer.valueOf(zzdt.zzb(bArr, i8)));
                    unsafe.putInt(obj, j9, i11);
                    return i8 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int zzm2 = zzdt.zzm(bArr, i8, zzdsVar);
                    unsafe.putObject(obj, j8, Boolean.valueOf(zzdsVar.zzb != 0));
                    unsafe.putInt(obj, j9, i11);
                    return zzm2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int zzj2 = zzdt.zzj(bArr, i8, zzdsVar);
                    int i16 = zzdsVar.zza;
                    if (i16 == 0) {
                        unsafe.putObject(obj, j8, "");
                    } else {
                        if ((i13 & 536870912) != 0 && !zzhm.zzd(bArr, zzj2, zzj2 + i16)) {
                            throw zzfa.zzb();
                        }
                        unsafe.putObject(obj, j8, new String(bArr, zzj2, i16, zzez.zzb));
                        zzj2 += i16;
                    }
                    unsafe.putInt(obj, j9, i11);
                    return zzj2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int zzd = zzdt.zzd(zzy(i15), bArr, i8, i9, zzdsVar);
                    Object object = unsafe.getInt(obj, j9) == i11 ? unsafe.getObject(obj, j8) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j8, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j8, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j9, i11);
                    return zzd;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int zza2 = zzdt.zza(bArr, i8, zzdsVar);
                    unsafe.putObject(obj, j8, zzdsVar.zzc);
                    unsafe.putInt(obj, j9, i11);
                    return zza2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int zzj3 = zzdt.zzj(bArr, i8, zzdsVar);
                    int i17 = zzdsVar.zza;
                    zzex zzx = zzx(i15);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(obj, j8, Integer.valueOf(i17));
                        unsafe.putInt(obj, j9, i11);
                    } else {
                        zzc(obj).zzf(i10, Long.valueOf(i17));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int zzj4 = zzdt.zzj(bArr, i8, zzdsVar);
                    unsafe.putObject(obj, j8, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                    unsafe.putInt(obj, j9, i11);
                    return zzj4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int zzm3 = zzdt.zzm(bArr, i8, zzdsVar);
                    unsafe.putObject(obj, j8, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                    unsafe.putInt(obj, j9, i11);
                    return zzm3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int zzc = zzdt.zzc(zzy(i15), bArr, i8, i9, (i10 & (-8)) | 4, zzdsVar);
                    Object object2 = unsafe.getInt(obj, j9) == i11 ? unsafe.getObject(obj, j8) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j8, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j8, zzez.zzg(object2, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j9, i11);
                    return zzc;
                }
                break;
        }
        return i8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x0082. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    private final int zzo(Object obj, byte[] bArr, int i8, int i9, zzds zzdsVar) {
        byte b8;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int zzm;
        int zzd;
        int i16;
        int i17;
        int i18;
        zzfz<T> zzfzVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i19 = i9;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i20 = 1048575;
        int i21 = -1;
        int i22 = i8;
        int i23 = -1;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1048575;
        while (i22 < i19) {
            int i27 = i22 + 1;
            byte b9 = bArr2[i22];
            if (b9 < 0) {
                i10 = zzdt.zzk(b9, bArr2, i27, zzdsVar2);
                b8 = zzdsVar2.zza;
            } else {
                b8 = b9;
                i10 = i27;
            }
            int i28 = b8 >>> 3;
            int i29 = b8 & 7;
            int zzr = i28 > i23 ? zzfzVar.zzr(i28, i24 / 3) : zzfzVar.zzq(i28);
            if (zzr == i21) {
                i11 = i10;
                i12 = i28;
                unsafe = unsafe2;
                i13 = 0;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i30 = iArr[zzr + 1];
                int zzu = zzu(i30);
                long j8 = i30 & i20;
                if (zzu <= 17) {
                    int i31 = iArr[zzr + 2];
                    int i32 = 1 << (i31 >>> 20);
                    int i33 = i31 & 1048575;
                    if (i33 != i26) {
                        if (i26 != 1048575) {
                            unsafe2.putInt(obj2, i26, i25);
                        }
                        if (i33 != 1048575) {
                            i25 = unsafe2.getInt(obj2, i33);
                        }
                        i26 = i33;
                    }
                    switch (zzu) {
                        case 0:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i15 = i10;
                            i12 = i28;
                            if (i29 == 1) {
                                zzhi.zzl(obj2, j8, Double.longBitsToDouble(zzdt.zzn(bArr2, i15)));
                                i22 = i15 + 8;
                                i25 |= i32;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 1:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i15 = i10;
                            i12 = i28;
                            if (i29 == 5) {
                                zzhi.zzm(obj2, j8, Float.intBitsToFloat(zzdt.zzb(bArr2, i15)));
                                i22 = i15 + 4;
                                i25 |= i32;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 2:
                        case 3:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i15 = i10;
                            i12 = i28;
                            if (i29 == 0) {
                                zzm = zzdt.zzm(bArr2, i15, zzdsVar2);
                                unsafe2.putLong(obj, j8, zzdsVar2.zzb);
                                i25 |= i32;
                                i22 = zzm;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 4:
                        case 11:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i15 = i10;
                            i12 = i28;
                            if (i29 == 0) {
                                i22 = zzdt.zzj(bArr2, i15, zzdsVar2);
                                unsafe2.putInt(obj2, j8, zzdsVar2.zza);
                                i25 |= i32;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 5:
                        case 14:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i12 = i28;
                            if (i29 == 1) {
                                i15 = i10;
                                unsafe2.putLong(obj, j8, zzdt.zzn(bArr2, i10));
                                i22 = i15 + 8;
                                i25 |= i32;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 6:
                        case 13:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i12 = i28;
                            if (i29 == 5) {
                                unsafe2.putInt(obj2, j8, zzdt.zzb(bArr2, i10));
                                i22 = i10 + 4;
                                i25 |= i32;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 7:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i12 = i28;
                            if (i29 == 0) {
                                i22 = zzdt.zzm(bArr2, i10, zzdsVar2);
                                zzhi.zzk(obj2, j8, zzdsVar2.zzb != 0);
                                i25 |= i32;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 8:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i12 = i28;
                            if (i29 == 2) {
                                i22 = (536870912 & i30) == 0 ? zzdt.zzg(bArr2, i10, zzdsVar2) : zzdt.zzh(bArr2, i10, zzdsVar2);
                                unsafe2.putObject(obj2, j8, zzdsVar2.zzc);
                                i25 |= i32;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 9:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i12 = i28;
                            if (i29 == 2) {
                                zzd = zzdt.zzd(zzfzVar.zzy(i14), bArr2, i10, i19, zzdsVar2);
                                Object object = unsafe2.getObject(obj2, j8);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j8, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j8, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i25 |= i32;
                                i22 = zzd;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 10:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i12 = i28;
                            if (i29 == 2) {
                                zzd = zzdt.zza(bArr2, i10, zzdsVar2);
                                unsafe2.putObject(obj2, j8, zzdsVar2.zzc);
                                i25 |= i32;
                                i22 = zzd;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 12:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i12 = i28;
                            if (i29 == 0) {
                                zzd = zzdt.zzj(bArr2, i10, zzdsVar2);
                                unsafe2.putInt(obj2, j8, zzdsVar2.zza);
                                i25 |= i32;
                                i22 = zzd;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 15:
                            zzdsVar2 = zzdsVar;
                            i14 = zzr;
                            i12 = i28;
                            if (i29 == 0) {
                                zzd = zzdt.zzj(bArr2, i10, zzdsVar2);
                                unsafe2.putInt(obj2, j8, zzei.zzb(zzdsVar2.zza));
                                i25 |= i32;
                                i22 = zzd;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                        case 16:
                            if (i29 != 0) {
                                i12 = i28;
                                i14 = zzr;
                                i15 = i10;
                                i11 = i15;
                                unsafe = unsafe2;
                                i13 = i14;
                                break;
                            } else {
                                zzdsVar2 = zzdsVar;
                                zzm = zzdt.zzm(bArr2, i10, zzdsVar2);
                                i14 = zzr;
                                i12 = i28;
                                unsafe2.putLong(obj, j8, zzei.zzc(zzdsVar2.zzb));
                                i25 |= i32;
                                i22 = zzm;
                                i24 = i14;
                                i23 = i12;
                                break;
                            }
                        default:
                            i12 = i28;
                            i14 = zzr;
                            i15 = i10;
                            i11 = i15;
                            unsafe = unsafe2;
                            i13 = i14;
                            break;
                    }
                } else {
                    zzdsVar2 = zzdsVar;
                    i14 = zzr;
                    int i34 = i10;
                    i12 = i28;
                    if (zzu == 27) {
                        if (i29 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj2, j8);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j8, zzeyVar);
                            }
                            i22 = zzdt.zze(zzfzVar.zzy(i14), b8, bArr, i34, i9, zzeyVar, zzdsVar);
                            i25 = i25;
                            i24 = i14;
                            i23 = i12;
                        } else {
                            i16 = i34;
                            i17 = i25;
                            i18 = i26;
                            unsafe = unsafe2;
                            i13 = i14;
                        }
                    } else if (zzu <= 49) {
                        i17 = i25;
                        i18 = i26;
                        unsafe = unsafe2;
                        i13 = i14;
                        i22 = zzp(obj, bArr, i34, i9, b8, i12, i29, i14, i30, zzu, j8, zzdsVar);
                        if (i22 != i34) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i19 = i9;
                            zzdsVar2 = zzdsVar;
                            i26 = i18;
                            i23 = i12;
                            i25 = i17;
                            i24 = i13;
                            unsafe2 = unsafe;
                            i21 = -1;
                            i20 = 1048575;
                            zzfzVar = this;
                        } else {
                            i11 = i22;
                            i26 = i18;
                            i25 = i17;
                        }
                    } else {
                        i16 = i34;
                        i17 = i25;
                        i18 = i26;
                        unsafe = unsafe2;
                        i13 = i14;
                        if (zzu != 50) {
                            i22 = zzn(obj, bArr, i16, i9, b8, i12, i29, i30, zzu, j8, i13, zzdsVar);
                            if (i22 != i16) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i19 = i9;
                                zzdsVar2 = zzdsVar;
                                i26 = i18;
                                i23 = i12;
                                i25 = i17;
                                i24 = i13;
                                unsafe2 = unsafe;
                                i21 = -1;
                                i20 = 1048575;
                                zzfzVar = this;
                            } else {
                                i11 = i22;
                                i26 = i18;
                                i25 = i17;
                            }
                        } else if (i29 == 2) {
                            i22 = zzm(obj, bArr, i16, i9, i13, j8, zzdsVar);
                            if (i22 != i16) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i19 = i9;
                                zzdsVar2 = zzdsVar;
                                i26 = i18;
                                i23 = i12;
                                i25 = i17;
                                i24 = i13;
                                unsafe2 = unsafe;
                                i21 = -1;
                                i20 = 1048575;
                                zzfzVar = this;
                            } else {
                                i11 = i22;
                                i26 = i18;
                                i25 = i17;
                            }
                        }
                    }
                    i11 = i16;
                    i26 = i18;
                    i25 = i17;
                }
                i21 = -1;
                i20 = 1048575;
            }
            i22 = zzdt.zzi(b8, bArr, i11, i9, zzc(obj), zzdsVar);
            zzfzVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i19 = i9;
            zzdsVar2 = zzdsVar;
            i23 = i12;
            i24 = i13;
            unsafe2 = unsafe;
            i21 = -1;
            i20 = 1048575;
        }
        int i35 = i25;
        int i36 = i26;
        Unsafe unsafe3 = unsafe2;
        if (i36 != 1048575) {
            unsafe3.putInt(obj, i36, i35);
        }
        if (i22 == i9) {
            return i22;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, long j8, int i14, long j9, zzds zzdsVar) {
        int i15;
        int i16;
        int i17;
        int zzj;
        int i18 = i8;
        Unsafe unsafe = zzb;
        zzey zzeyVar = (zzey) unsafe.getObject(obj, j9);
        if (!zzeyVar.zzc()) {
            int size = zzeyVar.size();
            zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j9, zzeyVar);
        }
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    zzej zzejVar = (zzej) zzeyVar;
                    int zzj2 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i19 = zzdsVar.zza + zzj2;
                    while (zzj2 < i19) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i19) {
                        return zzj2;
                    }
                    throw zzfa.zzf();
                }
                if (i12 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i8)));
                    while (true) {
                        int i20 = i18 + 8;
                        if (i20 >= i9) {
                            return i20;
                        }
                        i18 = zzdt.zzj(bArr, i20, zzdsVar);
                        if (i10 != zzdsVar.zza) {
                            return i20;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i18)));
                    }
                }
                return i18;
            case 19:
            case 36:
                if (i12 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar;
                    int zzj3 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i21 = zzdsVar.zza + zzj3;
                    while (zzj3 < i21) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i21) {
                        return zzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i12 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i8)));
                    while (true) {
                        i15 = i18 + 4;
                        if (i15 < i9) {
                            i18 = zzdt.zzj(bArr, i15, zzdsVar);
                            if (i10 == zzdsVar.zza) {
                                zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i18)));
                            }
                        }
                    }
                    return i15;
                }
                return i18;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar;
                    int zzj4 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i22 = zzdsVar.zza + zzj4;
                    while (zzj4 < i22) {
                        zzj4 = zzdt.zzm(bArr, zzj4, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (zzj4 == i22) {
                        return zzj4;
                    }
                    throw zzfa.zzf();
                }
                if (i12 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar;
                    int zzm = zzdt.zzm(bArr, i18, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (zzm < i9) {
                        int zzj5 = zzdt.zzj(bArr, zzm, zzdsVar);
                        if (i10 != zzdsVar.zza) {
                            return zzm;
                        }
                        zzm = zzdt.zzm(bArr, zzj5, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return zzm;
                }
                return i18;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return zzdt.zzf(bArr, i18, zzeyVar, zzdsVar);
                }
                if (i12 == 0) {
                    return zzdt.zzl(i10, bArr, i8, i9, zzeyVar, zzdsVar);
                }
                return i18;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar;
                    int zzj6 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i23 = zzdsVar.zza + zzj6;
                    while (zzj6 < i23) {
                        zzflVar3.zze(zzdt.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i23) {
                        return zzj6;
                    }
                    throw zzfa.zzf();
                }
                if (i12 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar;
                    zzflVar4.zze(zzdt.zzn(bArr, i8));
                    while (true) {
                        i16 = i18 + 8;
                        if (i16 < i9) {
                            i18 = zzdt.zzj(bArr, i16, zzdsVar);
                            if (i10 == zzdsVar.zza) {
                                zzflVar4.zze(zzdt.zzn(bArr, i18));
                            }
                        }
                    }
                    return i16;
                }
                return i18;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    zzev zzevVar = (zzev) zzeyVar;
                    int zzj7 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i24 = zzdsVar.zza + zzj7;
                    while (zzj7 < i24) {
                        zzevVar.zze(zzdt.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i24) {
                        return zzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i12 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar;
                    zzevVar2.zze(zzdt.zzb(bArr, i8));
                    while (true) {
                        i17 = i18 + 4;
                        if (i17 < i9) {
                            i18 = zzdt.zzj(bArr, i17, zzdsVar);
                            if (i10 == zzdsVar.zza) {
                                zzevVar2.zze(zzdt.zzb(bArr, i18));
                            }
                        }
                    }
                    return i17;
                }
                return i18;
            case 25:
            case 42:
                if (i12 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar;
                    zzj = zzdt.zzj(bArr, i18, zzdsVar);
                    int i25 = zzdsVar.zza + zzj;
                    while (zzj < i25) {
                        zzj = zzdt.zzm(bArr, zzj, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (zzj != i25) {
                        throw zzfa.zzf();
                    }
                    return zzj;
                }
                if (i12 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar;
                    int zzm2 = zzdt.zzm(bArr, i18, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (zzm2 < i9) {
                        int zzj8 = zzdt.zzj(bArr, zzm2, zzdsVar);
                        if (i10 != zzdsVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzdt.zzm(bArr, zzj8, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i18;
            case 26:
                if (i12 == 2) {
                    if ((j8 & 536870912) == 0) {
                        i18 = zzdt.zzj(bArr, i18, zzdsVar);
                        int i26 = zzdsVar.zza;
                        if (i26 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i26 == 0) {
                            zzeyVar.add("");
                        } else {
                            zzeyVar.add(new String(bArr, i18, i26, zzez.zzb));
                            i18 += i26;
                        }
                        while (i18 < i9) {
                            int zzj9 = zzdt.zzj(bArr, i18, zzdsVar);
                            if (i10 == zzdsVar.zza) {
                                i18 = zzdt.zzj(bArr, zzj9, zzdsVar);
                                int i27 = zzdsVar.zza;
                                if (i27 < 0) {
                                    throw zzfa.zzc();
                                }
                                if (i27 == 0) {
                                    zzeyVar.add("");
                                } else {
                                    zzeyVar.add(new String(bArr, i18, i27, zzez.zzb));
                                    i18 += i27;
                                }
                            }
                        }
                    } else {
                        i18 = zzdt.zzj(bArr, i18, zzdsVar);
                        int i28 = zzdsVar.zza;
                        if (i28 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i28 == 0) {
                            zzeyVar.add("");
                        } else {
                            int i29 = i18 + i28;
                            if (!zzhm.zzd(bArr, i18, i29)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar.add(new String(bArr, i18, i28, zzez.zzb));
                            i18 = i29;
                        }
                        while (i18 < i9) {
                            int zzj10 = zzdt.zzj(bArr, i18, zzdsVar);
                            if (i10 == zzdsVar.zza) {
                                i18 = zzdt.zzj(bArr, zzj10, zzdsVar);
                                int i30 = zzdsVar.zza;
                                if (i30 < 0) {
                                    throw zzfa.zzc();
                                }
                                if (i30 == 0) {
                                    zzeyVar.add("");
                                } else {
                                    int i31 = i18 + i30;
                                    if (!zzhm.zzd(bArr, i18, i31)) {
                                        throw zzfa.zzb();
                                    }
                                    zzeyVar.add(new String(bArr, i18, i30, zzez.zzb));
                                    i18 = i31;
                                }
                            }
                        }
                    }
                }
                return i18;
            case 27:
                if (i12 == 2) {
                    return zzdt.zze(zzy(i13), i10, bArr, i8, i9, zzeyVar, zzdsVar);
                }
                return i18;
            case 28:
                if (i12 == 2) {
                    int zzj11 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i32 = zzdsVar.zza;
                    if (i32 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i32 > bArr.length - zzj11) {
                        throw zzfa.zzf();
                    }
                    if (i32 == 0) {
                        zzeyVar.add(zzee.zzb);
                    } else {
                        zzeyVar.add(zzee.zzk(bArr, zzj11, i32));
                        zzj11 += i32;
                    }
                    while (zzj11 < i9) {
                        int zzj12 = zzdt.zzj(bArr, zzj11, zzdsVar);
                        if (i10 != zzdsVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzdt.zzj(bArr, zzj12, zzdsVar);
                        int i33 = zzdsVar.zza;
                        if (i33 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i33 > bArr.length - zzj11) {
                            throw zzfa.zzf();
                        }
                        if (i33 == 0) {
                            zzeyVar.add(zzee.zzb);
                        } else {
                            zzeyVar.add(zzee.zzk(bArr, zzj11, i33));
                            zzj11 += i33;
                        }
                    }
                    return zzj11;
                }
                return i18;
            case 30:
            case 44:
                if (i12 != 2) {
                    if (i12 == 0) {
                        zzj = zzdt.zzl(i10, bArr, i8, i9, zzeyVar, zzdsVar);
                    }
                    return i18;
                }
                zzj = zzdt.zzf(bArr, i18, zzeyVar, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object zzd = zzgj.zzd(i11, zzeyVar, zzx(i13), zzgzVar, this.zzm);
                if (zzd != null) {
                    zzeuVar.zzc = (zzgz) zzd;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i12 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar;
                    int zzj13 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i34 = zzdsVar.zza + zzj13;
                    while (zzj13 < i34) {
                        zzj13 = zzdt.zzj(bArr, zzj13, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (zzj13 == i34) {
                        return zzj13;
                    }
                    throw zzfa.zzf();
                }
                if (i12 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar;
                    int zzj14 = zzdt.zzj(bArr, i18, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (zzj14 < i9) {
                        int zzj15 = zzdt.zzj(bArr, zzj14, zzdsVar);
                        if (i10 != zzdsVar.zza) {
                            return zzj14;
                        }
                        zzj14 = zzdt.zzj(bArr, zzj15, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return zzj14;
                }
                return i18;
            case 34:
            case 48:
                if (i12 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar;
                    int zzj16 = zzdt.zzj(bArr, i18, zzdsVar);
                    int i35 = zzdsVar.zza + zzj16;
                    while (zzj16 < i35) {
                        zzj16 = zzdt.zzm(bArr, zzj16, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (zzj16 == i35) {
                        return zzj16;
                    }
                    throw zzfa.zzf();
                }
                if (i12 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar;
                    int zzm3 = zzdt.zzm(bArr, i18, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (zzm3 < i9) {
                        int zzj17 = zzdt.zzj(bArr, zzm3, zzdsVar);
                        if (i10 != zzdsVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzdt.zzm(bArr, zzj17, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return zzm3;
                }
                return i18;
            default:
                if (i12 == 3) {
                    zzgh zzy = zzy(i13);
                    int i36 = (i10 & (-8)) | 4;
                    int zzc = zzdt.zzc(zzy, bArr, i8, i9, i36, zzdsVar);
                    zzeyVar.add(zzdsVar.zzc);
                    while (zzc < i9) {
                        int zzj18 = zzdt.zzj(bArr, zzc, zzdsVar);
                        if (i10 != zzdsVar.zza) {
                            return zzc;
                        }
                        zzc = zzdt.zzc(zzy, bArr, zzj18, i9, i36, zzdsVar);
                        zzeyVar.add(zzdsVar.zzc);
                    }
                    return zzc;
                }
                return i18;
        }
    }

    private final int zzq(int i8) {
        if (i8 < this.zze || i8 > this.zzf) {
            return -1;
        }
        return zzt(i8, 0);
    }

    private final int zzr(int i8, int i9) {
        if (i8 < this.zze || i8 > this.zzf) {
            return -1;
        }
        return zzt(i8, i9);
    }

    private final int zzs(int i8) {
        return this.zzc[i8 + 2];
    }

    private final int zzt(int i8, int i9) {
        int length = (this.zzc.length / 3) - 1;
        while (i9 <= length) {
            int i10 = (length + i9) >>> 1;
            int i11 = i10 * 3;
            int i12 = this.zzc[i11];
            if (i8 == i12) {
                return i11;
            }
            if (i8 < i12) {
                length = i10 - 1;
            } else {
                i9 = i10 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i8) {
        return (i8 >>> 20) & 255;
    }

    private final int zzv(int i8) {
        return this.zzc[i8 + 1];
    }

    private static long zzw(Object obj, long j8) {
        return ((Long) zzhi.zzf(obj, j8)).longValue();
    }

    private final zzex zzx(int i8) {
        int i9 = i8 / 3;
        return (zzex) this.zzd[i9 + i9 + 1];
    }

    private final zzgh zzy(int i8) {
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        zzgh zzghVar = (zzgh) this.zzd[i10];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i8) {
        int i9 = i8 / 3;
        return this.zzd[i9 + i9];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i8;
        int zzc;
        int length = this.zzc.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzv = zzv(i10);
            int i11 = this.zzc[i10];
            long j8 = 1048575 & zzv;
            int i12 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i8 = i9 * 53;
                    zzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j8)));
                    i9 = i8 + zzc;
                    break;
                case 1:
                    i8 = i9 * 53;
                    zzc = Float.floatToIntBits(zzhi.zzb(obj, j8));
                    i9 = i8 + zzc;
                    break;
                case 2:
                    i8 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j8));
                    i9 = i8 + zzc;
                    break;
                case 3:
                    i8 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j8));
                    i9 = i8 + zzc;
                    break;
                case 4:
                    i8 = i9 * 53;
                    zzc = zzhi.zzc(obj, j8);
                    i9 = i8 + zzc;
                    break;
                case 5:
                    i8 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j8));
                    i9 = i8 + zzc;
                    break;
                case 6:
                    i8 = i9 * 53;
                    zzc = zzhi.zzc(obj, j8);
                    i9 = i8 + zzc;
                    break;
                case 7:
                    i8 = i9 * 53;
                    zzc = zzez.zza(zzhi.zzt(obj, j8));
                    i9 = i8 + zzc;
                    break;
                case 8:
                    i8 = i9 * 53;
                    zzc = ((String) zzhi.zzf(obj, j8)).hashCode();
                    i9 = i8 + zzc;
                    break;
                case 9:
                    Object zzf = zzhi.zzf(obj, j8);
                    if (zzf != null) {
                        i12 = zzf.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 10:
                    i8 = i9 * 53;
                    zzc = zzhi.zzf(obj, j8).hashCode();
                    i9 = i8 + zzc;
                    break;
                case 11:
                    i8 = i9 * 53;
                    zzc = zzhi.zzc(obj, j8);
                    i9 = i8 + zzc;
                    break;
                case 12:
                    i8 = i9 * 53;
                    zzc = zzhi.zzc(obj, j8);
                    i9 = i8 + zzc;
                    break;
                case 13:
                    i8 = i9 * 53;
                    zzc = zzhi.zzc(obj, j8);
                    i9 = i8 + zzc;
                    break;
                case 14:
                    i8 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j8));
                    i9 = i8 + zzc;
                    break;
                case 15:
                    i8 = i9 * 53;
                    zzc = zzhi.zzc(obj, j8);
                    i9 = i8 + zzc;
                    break;
                case 16:
                    i8 = i9 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j8));
                    i9 = i8 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhi.zzf(obj, j8);
                    if (zzf2 != null) {
                        i12 = zzf2.hashCode();
                    }
                    i9 = (i9 * 53) + i12;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i8 = i9 * 53;
                    zzc = zzhi.zzf(obj, j8).hashCode();
                    i9 = i8 + zzc;
                    break;
                case 50:
                    i8 = i9 * 53;
                    zzc = zzhi.zzf(obj, j8).hashCode();
                    i9 = i8 + zzc;
                    break;
                case 51:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j8)).doubleValue()));
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j8)).floatValue());
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j8));
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j8));
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzl(obj, j8);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j8));
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzl(obj, j8);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzez.zza(((Boolean) zzhi.zzf(obj, j8)).booleanValue());
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = ((String) zzhi.zzf(obj, j8)).hashCode();
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzhi.zzf(obj, j8).hashCode();
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzhi.zzf(obj, j8).hashCode();
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzl(obj, j8);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzl(obj, j8);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzl(obj, j8);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j8));
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzl(obj, j8);
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzez.zzc(zzw(obj, j8));
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i11, i10)) {
                        i8 = i9 * 53;
                        zzc = zzhi.zzf(obj, j8).hashCode();
                        i9 = i8 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i9 * 53) + this.zzm.zza(obj).hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03b6, code lost:
    
        if (r0 != r19) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03b8, code lost:
    
        r15 = r31;
        r14 = r32;
        r12 = r33;
        r13 = r35;
        r11 = r36;
        r9 = r37;
        r2 = r17;
        r3 = r18;
        r1 = r20;
        r5 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03d2, code lost:
    
        r7 = r36;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03f8, code lost:
    
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x041b, code lost:
    
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x008e. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzb(Object obj, byte[] bArr, int i8, int i9, int i10, zzds zzdsVar) {
        Unsafe unsafe;
        int i11;
        Object obj2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i30 = i9;
        int i31 = i10;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i32 = i8;
        int i33 = 0;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 1048575;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                byte b8 = bArr2[i32];
                if (b8 < 0) {
                    int zzk = zzdt.zzk(b8, bArr2, i38, zzdsVar2);
                    i12 = zzdsVar2.zza;
                    i38 = zzk;
                } else {
                    i12 = b8;
                }
                int i39 = i12 >>> 3;
                int i40 = i12 & 7;
                int zzr = i39 > i34 ? zzfzVar.zzr(i39, i35 / 3) : zzfzVar.zzq(i39);
                if (zzr == -1) {
                    i13 = i39;
                    i14 = i38;
                    i15 = i12;
                    i16 = i36;
                    unsafe = unsafe2;
                    i11 = i31;
                    i17 = 0;
                } else {
                    int[] iArr = zzfzVar.zzc;
                    int i41 = iArr[zzr + 1];
                    int zzu = zzu(i41);
                    int i42 = i38;
                    long j8 = i41 & 1048575;
                    int i43 = i12;
                    if (zzu <= 17) {
                        int i44 = iArr[zzr + 2];
                        int i45 = 1 << (i44 >>> 20);
                        int i46 = i44 & 1048575;
                        if (i46 != i37) {
                            i20 = zzr;
                            if (i37 != 1048575) {
                                unsafe2.putInt(obj3, i37, i36);
                            }
                            i18 = i46;
                            i21 = unsafe2.getInt(obj3, i46);
                        } else {
                            i20 = zzr;
                            i18 = i37;
                            i21 = i36;
                        }
                        switch (zzu) {
                            case 0:
                                i24 = i20;
                                i23 = i42;
                                bArr2 = bArr;
                                i13 = i39;
                                if (i40 == 1) {
                                    zzhi.zzl(obj3, j8, Double.longBitsToDouble(zzdt.zzn(bArr2, i23)));
                                    i32 = i23 + 8;
                                    i36 = i21 | i45;
                                    i31 = i10;
                                    i35 = i24;
                                    i34 = i13;
                                    i33 = i43;
                                    i37 = i18;
                                    i30 = i9;
                                    break;
                                } else {
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 1:
                                i24 = i20;
                                i23 = i42;
                                bArr2 = bArr;
                                i13 = i39;
                                if (i40 == 5) {
                                    zzhi.zzm(obj3, j8, Float.intBitsToFloat(zzdt.zzb(bArr2, i23)));
                                    i32 = i23 + 4;
                                    i36 = i21 | i45;
                                    i31 = i10;
                                    i35 = i24;
                                    i34 = i13;
                                    i33 = i43;
                                    i37 = i18;
                                    i30 = i9;
                                    break;
                                } else {
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 2:
                            case 3:
                                i24 = i20;
                                i23 = i42;
                                bArr2 = bArr;
                                i13 = i39;
                                if (i40 == 0) {
                                    int zzm = zzdt.zzm(bArr2, i23, zzdsVar2);
                                    unsafe2.putLong(obj, j8, zzdsVar2.zzb);
                                    i36 = i21 | i45;
                                    i31 = i10;
                                    i32 = zzm;
                                    i35 = i24;
                                    i34 = i13;
                                    i33 = i43;
                                    i37 = i18;
                                    i30 = i9;
                                    break;
                                } else {
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 4:
                            case 11:
                                i24 = i20;
                                i23 = i42;
                                bArr2 = bArr;
                                i13 = i39;
                                if (i40 == 0) {
                                    i32 = zzdt.zzj(bArr2, i23, zzdsVar2);
                                    unsafe2.putInt(obj3, j8, zzdsVar2.zza);
                                    i36 = i21 | i45;
                                    i31 = i10;
                                    i35 = i24;
                                    i34 = i13;
                                    i33 = i43;
                                    i37 = i18;
                                    i30 = i9;
                                    break;
                                } else {
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 5:
                            case 14:
                                i23 = i42;
                                i25 = i43;
                                bArr2 = bArr;
                                int i47 = i20;
                                i13 = i39;
                                i26 = i47;
                                if (i40 == 1) {
                                    i43 = i25;
                                    i24 = i26;
                                    unsafe2.putLong(obj, j8, zzdt.zzn(bArr2, i23));
                                    i32 = i23 + 8;
                                    i36 = i21 | i45;
                                    i31 = i10;
                                    i35 = i24;
                                    i34 = i13;
                                    i33 = i43;
                                    i37 = i18;
                                    i30 = i9;
                                    break;
                                } else {
                                    i43 = i25;
                                    i24 = i26;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 6:
                            case 13:
                                i27 = i9;
                                i23 = i42;
                                i25 = i43;
                                bArr2 = bArr;
                                int i48 = i20;
                                i13 = i39;
                                i26 = i48;
                                if (i40 == 5) {
                                    unsafe2.putInt(obj3, j8, zzdt.zzb(bArr2, i23));
                                    i28 = i23 + 4;
                                    int i49 = i21 | i45;
                                    i31 = i10;
                                    i35 = i26;
                                    i32 = i28;
                                    i33 = i25;
                                    i37 = i18;
                                    i30 = i27;
                                    i36 = i49;
                                    i34 = i13;
                                    break;
                                } else {
                                    i43 = i25;
                                    i24 = i26;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 7:
                                i27 = i9;
                                i23 = i42;
                                i25 = i43;
                                bArr2 = bArr;
                                int i50 = i20;
                                i13 = i39;
                                i26 = i50;
                                if (i40 == 0) {
                                    i28 = zzdt.zzm(bArr2, i23, zzdsVar2);
                                    zzhi.zzk(obj3, j8, zzdsVar2.zzb != 0);
                                    int i492 = i21 | i45;
                                    i31 = i10;
                                    i35 = i26;
                                    i32 = i28;
                                    i33 = i25;
                                    i37 = i18;
                                    i30 = i27;
                                    i36 = i492;
                                    i34 = i13;
                                    break;
                                } else {
                                    i43 = i25;
                                    i24 = i26;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 8:
                                i27 = i9;
                                i23 = i42;
                                i25 = i43;
                                bArr2 = bArr;
                                int i51 = i20;
                                i13 = i39;
                                i26 = i51;
                                if (i40 == 2) {
                                    i28 = (536870912 & i41) == 0 ? zzdt.zzg(bArr2, i23, zzdsVar2) : zzdt.zzh(bArr2, i23, zzdsVar2);
                                    unsafe2.putObject(obj3, j8, zzdsVar2.zzc);
                                    int i4922 = i21 | i45;
                                    i31 = i10;
                                    i35 = i26;
                                    i32 = i28;
                                    i33 = i25;
                                    i37 = i18;
                                    i30 = i27;
                                    i36 = i4922;
                                    i34 = i13;
                                    break;
                                } else {
                                    i43 = i25;
                                    i24 = i26;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 9:
                                i22 = i20;
                                i23 = i42;
                                i29 = i43;
                                bArr2 = bArr;
                                i13 = i39;
                                if (i40 == 2) {
                                    i32 = zzdt.zzd(zzfzVar.zzy(i22), bArr2, i23, i9, zzdsVar2);
                                    if ((i21 & i45) == 0) {
                                        unsafe2.putObject(obj3, j8, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j8, zzez.zzg(unsafe2.getObject(obj3, j8), zzdsVar2.zzc));
                                    }
                                    int i52 = i21 | i45;
                                    i31 = i10;
                                    i35 = i22;
                                    i34 = i13;
                                    i37 = i18;
                                    i36 = i52;
                                    i33 = i29;
                                    i30 = i9;
                                    break;
                                } else {
                                    i43 = i29;
                                    i24 = i22;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 10:
                                i22 = i20;
                                i23 = i42;
                                i29 = i43;
                                bArr2 = bArr;
                                i13 = i39;
                                if (i40 == 2) {
                                    i32 = zzdt.zza(bArr2, i23, zzdsVar2);
                                    unsafe2.putObject(obj3, j8, zzdsVar2.zzc);
                                    i36 = i21 | i45;
                                    i31 = i10;
                                    i35 = i22;
                                    i33 = i29;
                                    i34 = i13;
                                    i37 = i18;
                                    i30 = i9;
                                    break;
                                } else {
                                    i43 = i29;
                                    i24 = i22;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 12:
                                i22 = i20;
                                i23 = i42;
                                i29 = i43;
                                bArr2 = bArr;
                                i13 = i39;
                                if (i40 != 0) {
                                    i43 = i29;
                                    i24 = i22;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                } else {
                                    i32 = zzdt.zzj(bArr2, i23, zzdsVar2);
                                    int i53 = zzdsVar2.zza;
                                    zzex zzx = zzfzVar.zzx(i22);
                                    if (zzx == null || zzx.zza()) {
                                        unsafe2.putInt(obj3, j8, i53);
                                        i36 = i21 | i45;
                                        i31 = i10;
                                        i35 = i22;
                                        i33 = i29;
                                        i34 = i13;
                                        i37 = i18;
                                        i30 = i9;
                                        break;
                                    } else {
                                        zzc(obj).zzf(i29, Long.valueOf(i53));
                                        i31 = i10;
                                        i36 = i21;
                                        i35 = i22;
                                        i33 = i29;
                                        i34 = i13;
                                        i37 = i18;
                                        i30 = i9;
                                    }
                                }
                                break;
                            case 15:
                                i22 = i20;
                                i23 = i42;
                                i29 = i43;
                                bArr2 = bArr;
                                i13 = i39;
                                if (i40 == 0) {
                                    i32 = zzdt.zzj(bArr2, i23, zzdsVar2);
                                    unsafe2.putInt(obj3, j8, zzei.zzb(zzdsVar2.zza));
                                    i36 = i21 | i45;
                                    i31 = i10;
                                    i35 = i22;
                                    i33 = i29;
                                    i34 = i13;
                                    i37 = i18;
                                    i30 = i9;
                                    break;
                                } else {
                                    i43 = i29;
                                    i24 = i22;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            case 16:
                                i22 = i20;
                                i23 = i42;
                                i13 = i39;
                                if (i40 == 0) {
                                    bArr2 = bArr;
                                    int zzm2 = zzdt.zzm(bArr2, i23, zzdsVar2);
                                    i29 = i43;
                                    unsafe2.putLong(obj, j8, zzei.zzc(zzdsVar2.zzb));
                                    i36 = i21 | i45;
                                    i31 = i10;
                                    i35 = i22;
                                    i32 = zzm2;
                                    i33 = i29;
                                    i34 = i13;
                                    i37 = i18;
                                    i30 = i9;
                                    break;
                                } else {
                                    i43 = i43;
                                    i24 = i22;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                            default:
                                if (i40 == 3) {
                                    int i54 = i20;
                                    i32 = zzdt.zzc(zzfzVar.zzy(i54), bArr, i42, i9, (i39 << 3) | 4, zzdsVar);
                                    if ((i21 & i45) == 0) {
                                        unsafe2.putObject(obj3, j8, zzdsVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j8, zzez.zzg(unsafe2.getObject(obj3, j8), zzdsVar2.zzc));
                                    }
                                    i36 = i21 | i45;
                                    bArr2 = bArr;
                                    i30 = i9;
                                    i31 = i10;
                                    i35 = i54;
                                    i33 = i43;
                                    i34 = i39;
                                    i37 = i18;
                                    break;
                                } else {
                                    i22 = i20;
                                    i23 = i42;
                                    i13 = i39;
                                    i24 = i22;
                                    i11 = i10;
                                    i16 = i21;
                                    unsafe = unsafe2;
                                    i14 = i23;
                                    i17 = i24;
                                    i15 = i43;
                                    i37 = i18;
                                    break;
                                }
                        }
                    } else {
                        i13 = i39;
                        bArr2 = bArr;
                        if (zzu != 27) {
                            i16 = i36;
                            i18 = i37;
                            if (zzu <= 49) {
                                unsafe = unsafe2;
                                i17 = zzr;
                                i32 = zzp(obj, bArr, i42, i9, i43, i13, i40, zzr, i41, zzu, j8, zzdsVar);
                            } else {
                                i19 = i42;
                                unsafe = unsafe2;
                                i17 = zzr;
                                if (zzu != 50) {
                                    i32 = zzn(obj, bArr, i19, i9, i43, i13, i40, i41, zzu, j8, i17, zzdsVar);
                                } else if (i40 == 2) {
                                    i32 = zzm(obj, bArr, i19, i9, i17, j8, zzdsVar);
                                }
                            }
                        } else if (i40 == 2) {
                            zzey zzeyVar = (zzey) unsafe2.getObject(obj3, j8);
                            if (!zzeyVar.zzc()) {
                                int size = zzeyVar.size();
                                zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j8, zzeyVar);
                            }
                            i33 = i43;
                            i18 = i37;
                            i32 = zzdt.zze(zzfzVar.zzy(zzr), i33, bArr, i42, i9, zzeyVar, zzdsVar);
                            i31 = i10;
                            i35 = zzr;
                            i34 = i13;
                            i36 = i36;
                            i37 = i18;
                            i30 = i9;
                        } else {
                            i16 = i36;
                            i18 = i37;
                            i19 = i42;
                            unsafe = unsafe2;
                            i17 = zzr;
                        }
                        i11 = i10;
                        i14 = i19;
                        i15 = i43;
                        i37 = i18;
                    }
                }
                if (i15 != i11 || i11 == 0) {
                    i32 = zzdt.zzi(i15, bArr, i14, i9, zzc(obj), zzdsVar);
                    zzfzVar = this;
                    obj3 = obj;
                    bArr2 = bArr;
                    i30 = i9;
                    zzdsVar2 = zzdsVar;
                    i31 = i11;
                    i33 = i15;
                    i34 = i13;
                    i35 = i17;
                    i36 = i16;
                    unsafe2 = unsafe;
                } else {
                    i32 = i14;
                    i33 = i15;
                    i36 = i16;
                }
            } else {
                unsafe = unsafe2;
                i11 = i31;
            }
        }
        if (i37 != 1048575) {
            long j9 = i37;
            obj2 = obj;
            unsafe.putInt(obj2, j9, i36);
        } else {
            obj2 = obj;
        }
        for (int i55 = this.zzj; i55 < this.zzk; i55++) {
            int i56 = this.zzi[i55];
            int i57 = this.zzc[i56];
            Object zzf = zzhi.zzf(obj2, zzv(i56) & 1048575);
            if (zzf != null && zzx(i56) != null) {
                throw null;
            }
        }
        if (i11 == 0) {
            if (i32 != i9) {
                throw zzfa.zzd();
            }
        } else if (i32 > i9 || i33 != i11) {
            throw zzfa.zzd();
        }
        return i32;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i8;
        int i9 = this.zzj;
        while (true) {
            i8 = this.zzk;
            if (i9 >= i8) {
                break;
            }
            long zzv = zzv(this.zzi[i9]) & 1048575;
            Object zzf = zzhi.zzf(obj, zzv);
            if (zzf != null) {
                ((zzfq) zzf).zzc();
                zzhi.zzp(obj, zzv, zzf);
            }
            i9++;
        }
        int length = this.zzi.length;
        while (i8 < length) {
            this.zzl.zza(obj, this.zzi[i8]);
            i8++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i8 = 0; i8 < this.zzc.length; i8 += 3) {
            int zzv = zzv(i8);
            long j8 = 1048575 & zzv;
            int i9 = this.zzc[i8];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(obj2, i8)) {
                        zzhi.zzl(obj, j8, zzhi.zza(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i8)) {
                        zzhi.zzm(obj, j8, zzhi.zzb(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i8)) {
                        zzhi.zzo(obj, j8, zzhi.zzd(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i8)) {
                        zzhi.zzo(obj, j8, zzhi.zzd(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i8)) {
                        zzhi.zzn(obj, j8, zzhi.zzc(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i8)) {
                        zzhi.zzo(obj, j8, zzhi.zzd(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i8)) {
                        zzhi.zzn(obj, j8, zzhi.zzc(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i8)) {
                        zzhi.zzk(obj, j8, zzhi.zzt(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i8)) {
                        zzhi.zzp(obj, j8, zzhi.zzf(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i8);
                    break;
                case 10:
                    if (zzG(obj2, i8)) {
                        zzhi.zzp(obj, j8, zzhi.zzf(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i8)) {
                        zzhi.zzn(obj, j8, zzhi.zzc(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i8)) {
                        zzhi.zzn(obj, j8, zzhi.zzc(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i8)) {
                        zzhi.zzn(obj, j8, zzhi.zzc(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i8)) {
                        zzhi.zzo(obj, j8, zzhi.zzd(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i8)) {
                        zzhi.zzn(obj, j8, zzhi.zzc(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i8)) {
                        zzhi.zzo(obj, j8, zzhi.zzd(obj2, j8));
                        zzD(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i8);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j8);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j8);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzJ(obj2, i9, i8)) {
                        zzhi.zzp(obj, j8, zzhi.zzf(obj2, j8));
                        zzE(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i8);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(obj2, i9, i8)) {
                        zzhi.zzp(obj, j8, zzhi.zzf(obj2, j8));
                        zzE(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i8);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i8, int i9, zzds zzdsVar) {
        if (this.zzh) {
            zzo(obj, bArr, i8, i9, zzdsVar);
        } else {
            zzb(obj, bArr, i8, i9, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int zzv = zzv(i8);
            long j8 = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(obj, obj2, i8) && Double.doubleToLongBits(zzhi.zza(obj, j8)) == Double.doubleToLongBits(zzhi.zza(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(obj, obj2, i8) && Float.floatToIntBits(zzhi.zzb(obj, j8)) == Float.floatToIntBits(zzhi.zzb(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(obj, obj2, i8) && zzhi.zzd(obj, j8) == zzhi.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(obj, obj2, i8) && zzhi.zzd(obj, j8) == zzhi.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(obj, obj2, i8) && zzhi.zzc(obj, j8) == zzhi.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(obj, obj2, i8) && zzhi.zzd(obj, j8) == zzhi.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(obj, obj2, i8) && zzhi.zzc(obj, j8) == zzhi.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(obj, obj2, i8) && zzhi.zzt(obj, j8) == zzhi.zzt(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(obj, obj2, i8) && zzgj.zzh(zzhi.zzf(obj, j8), zzhi.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(obj, obj2, i8) && zzgj.zzh(zzhi.zzf(obj, j8), zzhi.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(obj, obj2, i8) && zzgj.zzh(zzhi.zzf(obj, j8), zzhi.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(obj, obj2, i8) && zzhi.zzc(obj, j8) == zzhi.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(obj, obj2, i8) && zzhi.zzc(obj, j8) == zzhi.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(obj, obj2, i8) && zzhi.zzc(obj, j8) == zzhi.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(obj, obj2, i8) && zzhi.zzd(obj, j8) == zzhi.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(obj, obj2, i8) && zzhi.zzc(obj, j8) == zzhi.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(obj, obj2, i8) && zzhi.zzd(obj, j8) == zzhi.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(obj, obj2, i8) && zzgj.zzh(zzhi.zzf(obj, j8), zzhi.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j8), zzhi.zzf(obj2, j8));
                    break;
                case 50:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j8), zzhi.zzf(obj2, j8));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzs = zzs(i8) & 1048575;
                    if (zzhi.zzc(obj, zzs) == zzhi.zzc(obj2, zzs) && zzgj.zzh(zzhi.zzf(obj, j8), zzhi.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzh) {
                return false;
            }
        }
        return this.zzm.zza(obj).equals(this.zzm.zza(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzi(Object obj) {
        int i8;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.zzj) {
            int i13 = this.zzi[i12];
            int i14 = this.zzc[i13];
            int zzv = zzv(i13);
            int i15 = this.zzc[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = zzb.getInt(obj, i16);
                }
                i9 = i11;
                i8 = i16;
            } else {
                i8 = i10;
                i9 = i11;
            }
            if ((268435456 & zzv) != 0 && !zzH(obj, i13, i8, i9, i17)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(obj, i14, i13) && !zzI(obj, zzv, zzy(i13))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfq) zzhi.zzf(obj, zzv & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzy = zzy(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!zzy.zzi(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (zzH(obj, i13, i8, i9, i17) && !zzI(obj, zzv, zzy(i13))) {
                return false;
            }
            i12++;
            i10 = i8;
            i11 = i9;
        }
        return true;
    }
}
