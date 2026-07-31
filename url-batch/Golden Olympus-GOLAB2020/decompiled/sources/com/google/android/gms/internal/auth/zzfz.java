package com.google.android.gms.internal.auth;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.impl.C3139z9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
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

    private zzfz(int[] iArr, Object[] objArr, int i4, int i5, zzfw zzfwVar, boolean z4, boolean z5, int[] iArr2, int i6, int i7, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        this.zzh = z4;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i7;
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

    private final void zzB(Object obj, Object obj2, int i4) {
        long zzv = zzv(i4) & 1048575;
        if (zzG(obj2, i4)) {
            Object zzf = zzhi.zzf(obj, zzv);
            Object zzf2 = zzhi.zzf(obj2, zzv);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, zzv, zzez.zzg(zzf, zzf2));
                zzD(obj, i4);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, zzv, zzf2);
                zzD(obj, i4);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i4) {
        int zzv = zzv(i4);
        int i5 = this.zzc[i4];
        long j4 = zzv & 1048575;
        if (zzJ(obj2, i5, i4)) {
            Object zzf = zzJ(obj, i5, i4) ? zzhi.zzf(obj, j4) : null;
            Object zzf2 = zzhi.zzf(obj2, j4);
            if (zzf != null && zzf2 != null) {
                zzhi.zzp(obj, j4, zzez.zzg(zzf, zzf2));
                zzE(obj, i5, i4);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, j4, zzf2);
                zzE(obj, i5, i4);
            }
        }
    }

    private final void zzD(Object obj, int i4) {
        int zzs = zzs(i4);
        long j4 = 1048575 & zzs;
        if (j4 == 1048575) {
            return;
        }
        zzhi.zzn(obj, j4, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j4));
    }

    private final void zzE(Object obj, int i4, int i5) {
        zzhi.zzn(obj, zzs(i5) & 1048575, i4);
    }

    private final boolean zzF(Object obj, Object obj2, int i4) {
        return zzG(obj, i4) == zzG(obj2, i4);
    }

    private final boolean zzG(Object obj, int i4) {
        int zzs = zzs(i4);
        long j4 = zzs & 1048575;
        if (j4 != 1048575) {
            return (zzhi.zzc(obj, j4) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i4);
        long j5 = zzv & 1048575;
        switch (zzu(zzv)) {
            case 0:
                return Double.doubleToRawLongBits(zzhi.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhi.zzb(obj, j5)) != 0;
            case 2:
                return zzhi.zzd(obj, j5) != 0;
            case 3:
                return zzhi.zzd(obj, j5) != 0;
            case 4:
                return zzhi.zzc(obj, j5) != 0;
            case 5:
                return zzhi.zzd(obj, j5) != 0;
            case 6:
                return zzhi.zzc(obj, j5) != 0;
            case 7:
                return zzhi.zzt(obj, j5);
            case 8:
                Object zzf = zzhi.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzee) {
                    return !zzee.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhi.zzf(obj, j5) != null;
            case 10:
                return !zzee.zzb.equals(zzhi.zzf(obj, j5));
            case 11:
                return zzhi.zzc(obj, j5) != 0;
            case 12:
                return zzhi.zzc(obj, j5) != 0;
            case 13:
                return zzhi.zzc(obj, j5) != 0;
            case 14:
                return zzhi.zzd(obj, j5) != 0;
            case 15:
                return zzhi.zzc(obj, j5) != 0;
            case 16:
                return zzhi.zzd(obj, j5) != 0;
            case 17:
                return zzhi.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzG(obj, i4) : (i6 & i7) != 0;
    }

    private static boolean zzI(Object obj, int i4, zzgh zzghVar) {
        return zzghVar.zzi(zzhi.zzf(obj, i4 & 1048575));
    }

    private final boolean zzJ(Object obj, int i4, int i5) {
        return zzhi.zzc(obj, (long) (zzs(i5) & 1048575)) == i4;
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

    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzfz zzk(zzgg zzggVar, zzgb zzgbVar, zzfk zzfkVar, zzgy zzgyVar, zzel zzelVar, zzfr zzfrVar) {
        int i4;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt5;
        int i9;
        char charAt6;
        int i10;
        char charAt7;
        int i11;
        char charAt8;
        int i12;
        char charAt9;
        int i13;
        char charAt10;
        int i14;
        char charAt11;
        int i15;
        char charAt12;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Field zzA;
        char charAt13;
        int i26;
        int i27;
        Object obj;
        Field zzA2;
        Object obj2;
        Field zzA3;
        int i28;
        char charAt14;
        int i29;
        int i30;
        char charAt15;
        int i31;
        char charAt16;
        int i32;
        char charAt17;
        boolean z4 = zzggVar.zzc() == 2;
        String zzd = zzggVar.zzd();
        int length = zzd.length();
        char c4 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i4 = i33 + 1;
                if (zzd.charAt(i33) < 55296) {
                    break;
                }
                i33 = i4;
            }
        } else {
            i4 = 1;
        }
        int i34 = i4 + 1;
        int charAt18 = zzd.charAt(i4);
        if (charAt18 >= 55296) {
            int i35 = charAt18 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt17 = zzd.charAt(i34);
                if (charAt17 < 55296) {
                    break;
                }
                i35 |= (charAt17 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt18 = i35 | (charAt17 << i36);
            i34 = i32;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i6 = 0;
            charAt4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt19 = zzd.charAt(i34);
            if (charAt19 >= 55296) {
                int i38 = charAt19 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt12 = zzd.charAt(i37);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i38 |= (charAt12 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                charAt19 = i38 | (charAt12 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int charAt20 = zzd.charAt(i37);
            if (charAt20 >= 55296) {
                int i41 = charAt20 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt11 = zzd.charAt(i40);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i41 |= (charAt11 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt20 = i41 | (charAt11 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            charAt = zzd.charAt(i40);
            if (charAt >= 55296) {
                int i44 = charAt & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt10 = zzd.charAt(i43);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i44 |= (charAt10 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt = i44 | (charAt10 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            charAt2 = zzd.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt9 = zzd.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt2 = i47 | (charAt9 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt3 = zzd.charAt(i46);
            if (charAt3 >= 55296) {
                int i50 = charAt3 & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt8 = zzd.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt3 = i50 | (charAt8 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt21 = zzd.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt7 = zzd.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt21 = i53 | (charAt7 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int charAt22 = zzd.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt6 = zzd.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt22 = i56 | (charAt6 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            charAt4 = zzd.charAt(i55);
            if (charAt4 >= 55296) {
                int i59 = charAt4 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    charAt5 = zzd.charAt(i58);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                charAt4 = i59 | (charAt5 << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[charAt4 + charAt21 + charAt22];
            i5 = charAt19 + charAt19 + charAt20;
            i6 = charAt21;
            iArr = iArr2;
            i7 = charAt19;
            i34 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzggVar.zze();
        Class<?> cls = zzggVar.zza().getClass();
        int[] iArr3 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 + charAt3];
        int i61 = i6 + charAt4;
        int i62 = i61;
        int i63 = charAt4;
        int i64 = 0;
        int i65 = 0;
        while (i34 < length) {
            int i66 = i34 + 1;
            int charAt23 = zzd.charAt(i34);
            if (charAt23 >= c4) {
                int i67 = charAt23 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i31 = i68 + 1;
                    charAt16 = zzd.charAt(i68);
                    if (charAt16 < c4) {
                        break;
                    }
                    i67 |= (charAt16 & 8191) << i69;
                    i69 += 13;
                    i68 = i31;
                }
                charAt23 = i67 | (charAt16 << i69);
                i16 = i31;
            } else {
                i16 = i66;
            }
            int i70 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c4) {
                int i71 = charAt24 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i30 = i72 + 1;
                    charAt15 = zzd.charAt(i72);
                    i17 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i71 |= (charAt15 & 8191) << i73;
                    i73 += 13;
                    i72 = i30;
                    length = i17;
                }
                charAt24 = i71 | (charAt15 << i73);
                i18 = i30;
            } else {
                i17 = length;
                i18 = i70;
            }
            int i74 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i65] = i64;
                i65++;
            }
            if (i74 >= 51) {
                int i75 = i18 + 1;
                int charAt25 = zzd.charAt(i18);
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i28 = i77 + 1;
                        charAt14 = zzd.charAt(i77);
                        i29 = i76;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i76 = i29 | ((charAt14 & 8191) << i78);
                        i78 += 13;
                        i77 = i28;
                    }
                    charAt25 = i29 | (charAt14 << i78);
                    i26 = i28;
                } else {
                    i26 = i75;
                }
                int i79 = charAt25;
                int i80 = i74 - 51;
                int i81 = i26;
                if (i80 == 9 || i80 == 17) {
                    int i82 = i64 / 3;
                    i27 = i5 + 1;
                    objArr[i82 + i82 + 1] = zze[i5];
                } else {
                    if (i80 == 12 && !z4) {
                        int i83 = i64 / 3;
                        i27 = i5 + 1;
                        objArr[i83 + i83 + 1] = zze[i5];
                    }
                    int i84 = i79 + i79;
                    obj = zze[i84];
                    if (obj instanceof Field) {
                        zzA2 = zzA(cls, (String) obj);
                        zze[i84] = zzA2;
                    } else {
                        zzA2 = (Field) obj;
                    }
                    i19 = charAt23;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zzA2);
                    int i85 = i84 + 1;
                    obj2 = zze[i85];
                    if (obj2 instanceof Field) {
                        zzA3 = zzA(cls, (String) obj2);
                        zze[i85] = zzA3;
                    } else {
                        zzA3 = (Field) obj2;
                    }
                    i20 = (int) unsafe.objectFieldOffset(zzA3);
                    i24 = objectFieldOffset;
                    str = zzd;
                    i34 = i81;
                    i23 = 0;
                }
                i5 = i27;
                int i842 = i79 + i79;
                obj = zze[i842];
                if (obj instanceof Field) {
                }
                i19 = charAt23;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzA2);
                int i852 = i842 + 1;
                obj2 = zze[i852];
                if (obj2 instanceof Field) {
                }
                i20 = (int) unsafe.objectFieldOffset(zzA3);
                i24 = objectFieldOffset2;
                str = zzd;
                i34 = i81;
                i23 = 0;
            } else {
                i19 = charAt23;
                int i86 = i5 + 1;
                Field zzA4 = zzA(cls, (String) zze[i5]);
                if (i74 == 9 || i74 == 17) {
                    int i87 = i64 / 3;
                    objArr[i87 + i87 + 1] = zzA4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        int i88 = i64 / 3;
                        i5 += 2;
                        objArr[i88 + i88 + 1] = zze[i86];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        if (!z4) {
                            int i89 = i64 / 3;
                            i5 += 2;
                            objArr[i89 + i89 + 1] = zze[i86];
                        }
                    } else if (i74 == 50) {
                        int i90 = i63 + 1;
                        iArr[i63] = i64;
                        int i91 = i64 / 3;
                        int i92 = i91 + i91;
                        int i93 = i5 + 2;
                        objArr[i92] = zze[i86];
                        if ((charAt24 & a.f17688n) != 0) {
                            objArr[i92 + 1] = zze[i93];
                            i5 += 3;
                        } else {
                            i5 = i93;
                        }
                        i63 = i90;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zzA4);
                    i20 = 1048575;
                    if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) == 4096 || i74 > 17) {
                        str = zzd;
                        i21 = i18;
                        i22 = 0;
                    } else {
                        int i94 = i18 + 1;
                        int charAt26 = zzd.charAt(i18);
                        if (charAt26 >= 55296) {
                            int i95 = charAt26 & 8191;
                            int i96 = 13;
                            while (true) {
                                i25 = i94 + 1;
                                charAt13 = zzd.charAt(i94);
                                if (charAt13 < 55296) {
                                    break;
                                }
                                i95 |= (charAt13 & 8191) << i96;
                                i96 += 13;
                                i94 = i25;
                            }
                            charAt26 = i95 | (charAt13 << i96);
                        } else {
                            i25 = i94;
                        }
                        int i97 = i7 + i7 + (charAt26 / 32);
                        Object obj3 = zze[i97];
                        str = zzd;
                        if (obj3 instanceof Field) {
                            zzA = (Field) obj3;
                        } else {
                            zzA = zzA(cls, (String) obj3);
                            zze[i97] = zzA;
                        }
                        i22 = charAt26 % 32;
                        int i98 = i25;
                        i20 = (int) unsafe.objectFieldOffset(zzA);
                        i21 = i98;
                    }
                    if (i74 >= 18 || i74 > 49) {
                        i34 = i21;
                        i23 = i22;
                    } else {
                        iArr[i62] = objectFieldOffset3;
                        i34 = i21;
                        i23 = i22;
                        i62++;
                    }
                    i24 = objectFieldOffset3;
                }
                i5 = i86;
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(zzA4);
                i20 = 1048575;
                if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) == 4096) {
                }
                str = zzd;
                i21 = i18;
                i22 = 0;
                if (i74 >= 18) {
                }
                i34 = i21;
                i23 = i22;
                i24 = objectFieldOffset32;
            }
            int i99 = i64 + 1;
            iArr4[i64] = i19;
            int i100 = i64 + 2;
            int i101 = i23;
            iArr4[i99] = ((charAt24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((charAt24 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | (i74 << 20) | i24;
            i64 += 3;
            iArr4[i100] = (i101 << 20) | i20;
            iArr3 = iArr4;
            length = i17;
            zzd = str;
            c4 = 55296;
        }
        return new zzfz(iArr3, objArr, charAt, charAt2, zzggVar.zza(), z4, false, iArr, charAt4, i61, zzgbVar, zzfkVar, zzgyVar, zzelVar, zzfrVar, null);
    }

    private static int zzl(Object obj, long j4) {
        return ((Integer) zzhi.zzf(obj, j4)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i4, int i5, int i6, long j4, zzds zzdsVar) {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i6);
        Object object = unsafe.getObject(obj, j4);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j4, zzb2);
        }
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, int i11, zzds zzdsVar) {
        Object object;
        Unsafe unsafe = zzb;
        long j5 = this.zzc[i11 + 2] & 1048575;
        switch (i10) {
            case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                if (i8 != 1) {
                    return i4;
                }
                unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i4))));
                unsafe.putInt(obj, j5, i7);
                return i4 + 8;
            case IronSourceConstants.SET_USER_ID /* 52 */:
                if (i8 != 5) {
                    return i4;
                }
                unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i4))));
                unsafe.putInt(obj, j5, i7);
                return i4 + 4;
            case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
            case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                if (i8 != 0) {
                    return i4;
                }
                int zzm = zzdt.zzm(bArr, i4, zzdsVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzdsVar.zzb));
                unsafe.putInt(obj, j5, i7);
                return zzm;
            case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
            case IronSourceConstants.RETRY_LIMIT /* 62 */:
                if (i8 != 0) {
                    return i4;
                }
                int zzj = zzdt.zzj(bArr, i4, zzdsVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzdsVar.zza));
                unsafe.putInt(obj, j5, i7);
                return zzj;
            case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i8 != 1) {
                    return i4;
                }
                unsafe.putObject(obj, j4, Long.valueOf(zzdt.zzn(bArr, i4)));
                unsafe.putInt(obj, j5, i7);
                return i4 + 8;
            case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i8 != 5) {
                    return i4;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(zzdt.zzb(bArr, i4)));
                unsafe.putInt(obj, j5, i7);
                return i4 + 4;
            case 58:
                if (i8 != 0) {
                    return i4;
                }
                int zzm2 = zzdt.zzm(bArr, i4, zzdsVar);
                unsafe.putObject(obj, j4, Boolean.valueOf(zzdsVar.zzb != 0));
                unsafe.putInt(obj, j5, i7);
                return zzm2;
            case 59:
                if (i8 != 2) {
                    return i4;
                }
                int zzj2 = zzdt.zzj(bArr, i4, zzdsVar);
                int i12 = zzdsVar.zza;
                if (i12 == 0) {
                    unsafe.putObject(obj, j4, "");
                } else {
                    if ((i9 & 536870912) != 0 && !zzhm.zzd(bArr, zzj2, zzj2 + i12)) {
                        throw zzfa.zzb();
                    }
                    unsafe.putObject(obj, j4, new String(bArr, zzj2, i12, zzez.zzb));
                    zzj2 += i12;
                }
                unsafe.putInt(obj, j5, i7);
                return zzj2;
            case 60:
                if (i8 != 2) {
                    return i4;
                }
                int zzd = zzdt.zzd(zzy(i11), bArr, i4, i5, zzdsVar);
                object = unsafe.getInt(obj, j5) == i7 ? unsafe.getObject(obj, j4) : null;
                if (object == null) {
                    unsafe.putObject(obj, j4, zzdsVar.zzc);
                } else {
                    unsafe.putObject(obj, j4, zzez.zzg(object, zzdsVar.zzc));
                }
                unsafe.putInt(obj, j5, i7);
                return zzd;
            case 61:
                if (i8 != 2) {
                    return i4;
                }
                int zza2 = zzdt.zza(bArr, i4, zzdsVar);
                unsafe.putObject(obj, j4, zzdsVar.zzc);
                unsafe.putInt(obj, j5, i7);
                return zza2;
            case 63:
                if (i8 != 0) {
                    return i4;
                }
                int zzj3 = zzdt.zzj(bArr, i4, zzdsVar);
                int i13 = zzdsVar.zza;
                zzex zzx = zzx(i11);
                if (zzx != null && !zzx.zza()) {
                    zzc(obj).zzf(i6, Long.valueOf(i13));
                    return zzj3;
                }
                unsafe.putObject(obj, j4, Integer.valueOf(i13));
                unsafe.putInt(obj, j5, i7);
                return zzj3;
            case 66:
                if (i8 != 0) {
                    return i4;
                }
                int zzj4 = zzdt.zzj(bArr, i4, zzdsVar);
                unsafe.putObject(obj, j4, Integer.valueOf(zzei.zzb(zzdsVar.zza)));
                unsafe.putInt(obj, j5, i7);
                return zzj4;
            case 67:
                if (i8 != 0) {
                    return i4;
                }
                int zzm3 = zzdt.zzm(bArr, i4, zzdsVar);
                unsafe.putObject(obj, j4, Long.valueOf(zzei.zzc(zzdsVar.zzb)));
                unsafe.putInt(obj, j5, i7);
                return zzm3;
            case 68:
                if (i8 == 3) {
                    int zzc = zzdt.zzc(zzy(i11), bArr, i4, i5, (i6 & (-8)) | 4, zzdsVar);
                    object = unsafe.getInt(obj, j5) == i7 ? unsafe.getObject(obj, j4) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j4, zzdsVar.zzc);
                    } else {
                        unsafe.putObject(obj, j4, zzez.zzg(object, zzdsVar.zzc));
                    }
                    unsafe.putInt(obj, j5, i7);
                    return zzc;
                }
                break;
        }
        return i4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0080. Please report as an issue. */
    private final int zzo(Object obj, byte[] bArr, int i4, int i5, zzds zzdsVar) {
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zzfz<T> zzfzVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i16 = i5;
        zzds zzdsVar2 = zzdsVar;
        Unsafe unsafe2 = zzb;
        int i17 = -1;
        int i18 = i4;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1048575;
        while (i18 < i16) {
            int i23 = i18 + 1;
            int i24 = bArr2[i18];
            if (i24 < 0) {
                i23 = zzdt.zzk(i24, bArr2, i23, zzdsVar2);
                i24 = zzdsVar2.zza;
            }
            int i25 = i23;
            int i26 = i24 >>> 3;
            int i27 = i24 & 7;
            int zzr = i26 > i19 ? zzfzVar.zzr(i26, i20 / 3) : zzfzVar.zzq(i26);
            if (zzr == i17) {
                unsafe = unsafe2;
                i6 = i24;
                i7 = i17;
                i8 = i26;
                i9 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzfzVar.zzc;
                int i28 = iArr[zzr + 1];
                int zzu = zzu(i28);
                int i29 = i24;
                int i30 = zzr;
                long j4 = i28 & 1048575;
                if (zzu <= 17) {
                    int i31 = iArr[i30 + 2];
                    int i32 = 1 << (i31 >>> 20);
                    int i33 = i31 & 1048575;
                    if (i33 != i22) {
                        int i34 = 1048575;
                        if (i22 != 1048575) {
                            unsafe2.putInt(obj3, i22, i21);
                            i34 = 1048575;
                        }
                        if (i33 != i34) {
                            i21 = unsafe2.getInt(obj3, i33);
                        }
                        i22 = i33;
                    }
                    switch (zzu) {
                        case 0:
                            i15 = i30;
                            if (i27 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                zzhi.zzl(obj3, j4, Double.longBitsToDouble(zzdt.zzn(bArr2, i25)));
                                i18 = i25 + 8;
                                i21 |= i32;
                                i16 = i5;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 1:
                            i15 = i30;
                            if (i27 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                zzhi.zzm(obj3, j4, Float.intBitsToFloat(zzdt.zzb(bArr2, i25)));
                                i18 = i25 + 4;
                                i21 |= i32;
                                i16 = i5;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i15 = i30;
                            if (i27 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                int zzm = zzdt.zzm(bArr2, i25, zzdsVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j4, zzdsVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i21 |= i32;
                                i18 = zzm;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                i16 = i5;
                                break;
                            }
                        case 4:
                        case 11:
                            i15 = i30;
                            if (i27 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                int zzj = zzdt.zzj(bArr2, i25, zzdsVar2);
                                unsafe2.putInt(obj3, j4, zzdsVar2.zza);
                                i21 |= i32;
                                i16 = i5;
                                i18 = zzj;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i15 = i30;
                            if (i27 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j4, zzdt.zzn(bArr2, i25));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                i18 = i25 + 8;
                                i21 |= i32;
                                i16 = i5;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i15 = i30;
                            if (i27 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j4, zzdt.zzb(bArr2, i25));
                                i18 = i25 + 4;
                                i21 |= i32;
                                i16 = i5;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 7:
                            i15 = i30;
                            if (i27 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                i18 = zzdt.zzm(bArr2, i25, zzdsVar2);
                                zzhi.zzk(obj3, j4, zzdsVar2.zzb != 0);
                                i21 |= i32;
                                i16 = i5;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 8:
                            i15 = i30;
                            if (i27 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                i18 = (536870912 & i28) == 0 ? zzdt.zzg(bArr2, i25, zzdsVar2) : zzdt.zzh(bArr2, i25, zzdsVar2);
                                unsafe2.putObject(obj3, j4, zzdsVar2.zzc);
                                i21 |= i32;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 9:
                            i15 = i30;
                            if (i27 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                i18 = zzdt.zzd(zzfzVar.zzy(i15), bArr2, i25, i16, zzdsVar2);
                                Object object = unsafe2.getObject(obj3, j4);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j4, zzdsVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j4, zzez.zzg(object, zzdsVar2.zzc));
                                }
                                i21 |= i32;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 10:
                            i15 = i30;
                            if (i27 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                i18 = zzdt.zza(bArr2, i25, zzdsVar2);
                                unsafe2.putObject(obj3, j4, zzdsVar2.zzc);
                                i21 |= i32;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 12:
                            i15 = i30;
                            if (i27 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                i18 = zzdt.zzj(bArr2, i25, zzdsVar2);
                                unsafe2.putInt(obj3, j4, zzdsVar2.zza);
                                i21 |= i32;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 15:
                            i15 = i30;
                            if (i27 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                i18 = zzdt.zzj(bArr2, i25, zzdsVar2);
                                unsafe2.putInt(obj3, j4, zzei.zzb(zzdsVar2.zza));
                                i21 |= i32;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        case 16:
                            if (i27 != 0) {
                                i15 = i30;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i8 = i26;
                                i9 = i15;
                                i7 = -1;
                                i6 = i29;
                                break;
                            } else {
                                int zzm2 = zzdt.zzm(bArr2, i25, zzdsVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i15 = i30;
                                unsafe5.putLong(obj6, j4, zzei.zzc(zzdsVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i21 |= i32;
                                i18 = zzm2;
                                i19 = i26;
                                i20 = i15;
                                i17 = -1;
                                break;
                            }
                        default:
                            i15 = i30;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i8 = i26;
                            i9 = i15;
                            i7 = -1;
                            i6 = i29;
                            break;
                    }
                } else {
                    i9 = i30;
                    if (zzu != 27) {
                        i10 = i25;
                        Unsafe unsafe6 = unsafe2;
                        if (zzu <= 49) {
                            i11 = i21;
                            unsafe = unsafe6;
                            i7 = -1;
                            i13 = i22;
                            int zzp = zzfzVar.zzp(obj, bArr, i10, i5, i29, i26, i27, i9, i28, zzu, j4, zzdsVar);
                            i12 = i29;
                            i14 = i26;
                            if (zzp != i10) {
                                zzfzVar = this;
                                obj3 = obj;
                                zzdsVar2 = zzdsVar;
                                i18 = zzp;
                                i20 = i9;
                                i19 = i14;
                                i22 = i13;
                                i17 = i7;
                                i21 = i11;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i16 = i5;
                            } else {
                                obj2 = obj;
                                i25 = zzp;
                                i8 = i14;
                                i6 = i12;
                            }
                        } else {
                            i11 = i21;
                            unsafe = unsafe6;
                            i7 = -1;
                            i12 = i29;
                            i13 = i22;
                            i14 = i26;
                            if (zzu != 50) {
                                i8 = i14;
                                int zzn = zzn(obj, bArr, i10, i5, i12, i8, i27, i28, zzu, j4, i9, zzdsVar);
                                obj2 = obj;
                                i6 = i12;
                                i9 = i9;
                                if (zzn != i10) {
                                    zzfzVar = this;
                                    zzdsVar2 = zzdsVar;
                                    i19 = i8;
                                    i18 = zzn;
                                    i20 = i9;
                                    obj3 = obj2;
                                    i22 = i13;
                                    i17 = i7;
                                    i21 = i11;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i16 = i5;
                                } else {
                                    i25 = zzn;
                                }
                            } else if (i27 == 2) {
                                int zzm3 = zzm(obj, bArr, i10, i5, i9, j4, zzdsVar);
                                i9 = i9;
                                if (zzm3 != i10) {
                                    zzfzVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzdsVar2 = zzdsVar;
                                    i18 = zzm3;
                                    i20 = i9;
                                    i19 = i14;
                                    i22 = i13;
                                    i17 = -1;
                                    i21 = i11;
                                    unsafe2 = unsafe;
                                    i16 = i5;
                                } else {
                                    obj2 = obj;
                                    i25 = zzm3;
                                    i8 = i14;
                                    i6 = i12;
                                }
                            } else {
                                i9 = i9;
                                obj2 = obj;
                                i25 = i10;
                                i8 = i14;
                                i6 = i12;
                            }
                        }
                    } else if (i27 == 2) {
                        zzey zzeyVar = (zzey) unsafe2.getObject(obj3, j4);
                        if (!zzeyVar.zzc()) {
                            int size = zzeyVar.size();
                            zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j4, zzeyVar);
                        }
                        int zze = zzdt.zze(zzfzVar.zzy(i9), i29, bArr2, i25, i5, zzeyVar, zzdsVar2);
                        bArr2 = bArr;
                        zzdsVar2 = zzdsVar;
                        i18 = zze;
                        i20 = i9;
                        unsafe2 = unsafe2;
                        i19 = i26;
                        i17 = -1;
                        obj3 = obj;
                        i16 = i5;
                    } else {
                        i10 = i25;
                        i13 = i22;
                        i11 = i21;
                        unsafe = unsafe2;
                        i14 = i26;
                        i7 = -1;
                        i12 = i29;
                        obj2 = obj;
                        i25 = i10;
                        i8 = i14;
                        i6 = i12;
                    }
                    i22 = i13;
                    i21 = i11;
                }
            }
            int zzi = zzdt.zzi(i6, bArr, i25, i5, zzc(obj2), zzdsVar);
            bArr2 = bArr;
            zzdsVar2 = zzdsVar;
            i19 = i8;
            i20 = i9;
            obj3 = obj2;
            i17 = i7;
            unsafe2 = unsafe;
            i16 = i5;
            i18 = zzi;
            zzfzVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i35 = i16;
        int i36 = i22;
        int i37 = i21;
        if (i36 != 1048575) {
            unsafe7.putInt(obj7, i36, i37);
        }
        if (i18 == i35) {
            return i18;
        }
        throw zzfa.zzd();
    }

    private final int zzp(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, int i8, int i9, long j4, int i10, long j5, zzds zzdsVar) {
        int zzl;
        Unsafe unsafe = zzb;
        zzey zzeyVar = (zzey) unsafe.getObject(obj, j5);
        if (!zzeyVar.zzc()) {
            int size = zzeyVar.size();
            zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j5, zzeyVar);
        }
        zzey zzeyVar2 = zzeyVar;
        switch (i10) {
            case 18:
            case C3139z9.f40333J /* 35 */:
                if (i8 == 2) {
                    zzej zzejVar = (zzej) zzeyVar2;
                    int zzj = zzdt.zzj(bArr, i4, zzdsVar);
                    int i11 = zzdsVar.zza + zzj;
                    while (zzj < i11) {
                        zzejVar.zze(Double.longBitsToDouble(zzdt.zzn(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i11) {
                        return zzj;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 1) {
                    zzej zzejVar2 = (zzej) zzeyVar2;
                    zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, i4)));
                    int i12 = i4 + 8;
                    while (i12 < i5) {
                        int zzj2 = zzdt.zzj(bArr, i12, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i12;
                        }
                        zzejVar2.zze(Double.longBitsToDouble(zzdt.zzn(bArr, zzj2)));
                        i12 = zzj2 + 8;
                    }
                    return i12;
                }
                return i4;
            case 19:
            case 36:
                if (i8 == 2) {
                    zzeq zzeqVar = (zzeq) zzeyVar2;
                    int zzj3 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i13 = zzdsVar.zza + zzj3;
                    while (zzj3 < i13) {
                        zzeqVar.zze(Float.intBitsToFloat(zzdt.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i13) {
                        return zzj3;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 5) {
                    zzeq zzeqVar2 = (zzeq) zzeyVar2;
                    zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, i4)));
                    int i14 = i4 + 4;
                    while (i14 < i5) {
                        int zzj4 = zzdt.zzj(bArr, i14, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i14;
                        }
                        zzeqVar2.zze(Float.intBitsToFloat(zzdt.zzb(bArr, zzj4)));
                        i14 = zzj4 + 4;
                    }
                    return i14;
                }
                return i4;
            case 20:
            case 21:
            case 37:
            case C3139z9.f40334K /* 38 */:
                if (i8 == 2) {
                    zzfl zzflVar = (zzfl) zzeyVar2;
                    int zzj5 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i15 = zzdsVar.zza + zzj5;
                    while (zzj5 < i15) {
                        zzj5 = zzdt.zzm(bArr, zzj5, zzdsVar);
                        zzflVar.zze(zzdsVar.zzb);
                    }
                    if (zzj5 == i15) {
                        return zzj5;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 0) {
                    zzfl zzflVar2 = (zzfl) zzeyVar2;
                    int zzm = zzdt.zzm(bArr, i4, zzdsVar);
                    zzflVar2.zze(zzdsVar.zzb);
                    while (zzm < i5) {
                        int zzj6 = zzdt.zzj(bArr, zzm, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return zzm;
                        }
                        zzm = zzdt.zzm(bArr, zzj6, zzdsVar);
                        zzflVar2.zze(zzdsVar.zzb);
                    }
                    return zzm;
                }
                return i4;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i8 == 2) {
                    return zzdt.zzf(bArr, i4, zzeyVar2, zzdsVar);
                }
                if (i8 == 0) {
                    return zzdt.zzl(i6, bArr, i4, i5, zzeyVar2, zzdsVar);
                }
                return i4;
            case ConnectionResult.API_DISABLED /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i8 == 2) {
                    zzfl zzflVar3 = (zzfl) zzeyVar2;
                    int zzj7 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i16 = zzdsVar.zza + zzj7;
                    while (zzj7 < i16) {
                        zzflVar3.zze(zzdt.zzn(bArr, zzj7));
                        zzj7 += 8;
                    }
                    if (zzj7 == i16) {
                        return zzj7;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 1) {
                    zzfl zzflVar4 = (zzfl) zzeyVar2;
                    zzflVar4.zze(zzdt.zzn(bArr, i4));
                    int i17 = i4 + 8;
                    while (i17 < i5) {
                        int zzj8 = zzdt.zzj(bArr, i17, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i17;
                        }
                        zzflVar4.zze(zzdt.zzn(bArr, zzj8));
                        i17 = zzj8 + 8;
                    }
                    return i17;
                }
                return i4;
            case 24:
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 41:
            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                if (i8 == 2) {
                    zzev zzevVar = (zzev) zzeyVar2;
                    int zzj9 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i18 = zzdsVar.zza + zzj9;
                    while (zzj9 < i18) {
                        zzevVar.zze(zzdt.zzb(bArr, zzj9));
                        zzj9 += 4;
                    }
                    if (zzj9 == i18) {
                        return zzj9;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 5) {
                    zzev zzevVar2 = (zzev) zzeyVar2;
                    zzevVar2.zze(zzdt.zzb(bArr, i4));
                    int i19 = i4 + 4;
                    while (i19 < i5) {
                        int zzj10 = zzdt.zzj(bArr, i19, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return i19;
                        }
                        zzevVar2.zze(zzdt.zzb(bArr, zzj10));
                        i19 = zzj10 + 4;
                    }
                    return i19;
                }
                return i4;
            case 25:
            case 42:
                if (i8 == 2) {
                    zzdu zzduVar = (zzdu) zzeyVar2;
                    int zzj11 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i20 = zzdsVar.zza + zzj11;
                    while (zzj11 < i20) {
                        zzj11 = zzdt.zzm(bArr, zzj11, zzdsVar);
                        zzduVar.zze(zzdsVar.zzb != 0);
                    }
                    if (zzj11 == i20) {
                        return zzj11;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 0) {
                    zzdu zzduVar2 = (zzdu) zzeyVar2;
                    int zzm2 = zzdt.zzm(bArr, i4, zzdsVar);
                    zzduVar2.zze(zzdsVar.zzb != 0);
                    while (zzm2 < i5) {
                        int zzj12 = zzdt.zzj(bArr, zzm2, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzdt.zzm(bArr, zzj12, zzdsVar);
                        zzduVar2.zze(zzdsVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i4;
            case 26:
                if (i8 == 2) {
                    if ((j4 & 536870912) == 0) {
                        int zzj13 = zzdt.zzj(bArr, i4, zzdsVar);
                        int i21 = zzdsVar.zza;
                        if (i21 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i21 == 0) {
                            zzeyVar2.add("");
                        } else {
                            zzeyVar2.add(new String(bArr, zzj13, i21, zzez.zzb));
                            zzj13 += i21;
                        }
                        while (zzj13 < i5) {
                            int zzj14 = zzdt.zzj(bArr, zzj13, zzdsVar);
                            if (i6 != zzdsVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzdt.zzj(bArr, zzj14, zzdsVar);
                            int i22 = zzdsVar.zza;
                            if (i22 < 0) {
                                throw zzfa.zzc();
                            }
                            if (i22 == 0) {
                                zzeyVar2.add("");
                            } else {
                                zzeyVar2.add(new String(bArr, zzj13, i22, zzez.zzb));
                                zzj13 += i22;
                            }
                        }
                        return zzj13;
                    }
                    int zzj15 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i23 = zzdsVar.zza;
                    if (i23 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i23 == 0) {
                        zzeyVar2.add("");
                    } else {
                        int i24 = zzj15 + i23;
                        if (!zzhm.zzd(bArr, zzj15, i24)) {
                            throw zzfa.zzb();
                        }
                        zzeyVar2.add(new String(bArr, zzj15, i23, zzez.zzb));
                        zzj15 = i24;
                    }
                    while (zzj15 < i5) {
                        int zzj16 = zzdt.zzj(bArr, zzj15, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return zzj15;
                        }
                        zzj15 = zzdt.zzj(bArr, zzj16, zzdsVar);
                        int i25 = zzdsVar.zza;
                        if (i25 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i25 == 0) {
                            zzeyVar2.add("");
                        } else {
                            int i26 = zzj15 + i25;
                            if (!zzhm.zzd(bArr, zzj15, i26)) {
                                throw zzfa.zzb();
                            }
                            zzeyVar2.add(new String(bArr, zzj15, i25, zzez.zzb));
                            zzj15 = i26;
                        }
                    }
                    return zzj15;
                }
                return i4;
            case 27:
                if (i8 == 2) {
                    return zzdt.zze(zzy(i9), i6, bArr, i4, i5, zzeyVar2, zzdsVar);
                }
                return i4;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (i8 == 2) {
                    int zzj17 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i27 = zzdsVar.zza;
                    if (i27 < 0) {
                        throw zzfa.zzc();
                    }
                    if (i27 > bArr.length - zzj17) {
                        throw zzfa.zzf();
                    }
                    if (i27 == 0) {
                        zzeyVar2.add(zzee.zzb);
                    } else {
                        zzeyVar2.add(zzee.zzk(bArr, zzj17, i27));
                        zzj17 += i27;
                    }
                    while (zzj17 < i5) {
                        int zzj18 = zzdt.zzj(bArr, zzj17, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return zzj17;
                        }
                        zzj17 = zzdt.zzj(bArr, zzj18, zzdsVar);
                        int i28 = zzdsVar.zza;
                        if (i28 < 0) {
                            throw zzfa.zzc();
                        }
                        if (i28 > bArr.length - zzj17) {
                            throw zzfa.zzf();
                        }
                        if (i28 == 0) {
                            zzeyVar2.add(zzee.zzb);
                        } else {
                            zzeyVar2.add(zzee.zzk(bArr, zzj17, i28));
                            zzj17 += i28;
                        }
                    }
                    return zzj17;
                }
                return i4;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                if (i8 != 2) {
                    if (i8 == 0) {
                        zzl = zzdt.zzl(i6, bArr, i4, i5, zzeyVar2, zzdsVar);
                    }
                    return i4;
                }
                zzl = zzdt.zzf(bArr, i4, zzeyVar2, zzdsVar);
                zzeu zzeuVar = (zzeu) obj;
                zzgz zzgzVar = zzeuVar.zzc;
                if (zzgzVar == zzgz.zza()) {
                    zzgzVar = null;
                }
                Object zzd = zzgj.zzd(i7, zzeyVar2, zzx(i9), zzgzVar, this.zzm);
                if (zzd == null) {
                    return zzl;
                }
                zzeuVar.zzc = (zzgz) zzd;
                return zzl;
            case 33:
            case 47:
                if (i8 == 2) {
                    zzev zzevVar3 = (zzev) zzeyVar2;
                    int zzj19 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i29 = zzdsVar.zza + zzj19;
                    while (zzj19 < i29) {
                        zzj19 = zzdt.zzj(bArr, zzj19, zzdsVar);
                        zzevVar3.zze(zzei.zzb(zzdsVar.zza));
                    }
                    if (zzj19 == i29) {
                        return zzj19;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 0) {
                    zzev zzevVar4 = (zzev) zzeyVar2;
                    int zzj20 = zzdt.zzj(bArr, i4, zzdsVar);
                    zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    while (zzj20 < i5) {
                        int zzj21 = zzdt.zzj(bArr, zzj20, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return zzj20;
                        }
                        zzj20 = zzdt.zzj(bArr, zzj21, zzdsVar);
                        zzevVar4.zze(zzei.zzb(zzdsVar.zza));
                    }
                    return zzj20;
                }
                return i4;
            case 34:
            case 48:
                if (i8 == 2) {
                    zzfl zzflVar5 = (zzfl) zzeyVar2;
                    int zzj22 = zzdt.zzj(bArr, i4, zzdsVar);
                    int i30 = zzdsVar.zza + zzj22;
                    while (zzj22 < i30) {
                        zzj22 = zzdt.zzm(bArr, zzj22, zzdsVar);
                        zzflVar5.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    if (zzj22 == i30) {
                        return zzj22;
                    }
                    throw zzfa.zzf();
                }
                if (i8 == 0) {
                    zzfl zzflVar6 = (zzfl) zzeyVar2;
                    int zzm3 = zzdt.zzm(bArr, i4, zzdsVar);
                    zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    while (zzm3 < i5) {
                        int zzj23 = zzdt.zzj(bArr, zzm3, zzdsVar);
                        if (i6 != zzdsVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzdt.zzm(bArr, zzj23, zzdsVar);
                        zzflVar6.zze(zzei.zzc(zzdsVar.zzb));
                    }
                    return zzm3;
                }
                return i4;
            default:
                if (i8 == 3) {
                    zzgh zzy = zzy(i9);
                    int i31 = (i6 & (-8)) | 4;
                    int zzc = zzdt.zzc(zzy, bArr, i4, i5, i31, zzdsVar);
                    zzgh zzghVar = zzy;
                    zzds zzdsVar2 = zzdsVar;
                    zzeyVar2.add(zzdsVar2.zzc);
                    while (zzc < i5) {
                        int zzj24 = zzdt.zzj(bArr, zzc, zzdsVar2);
                        if (i6 != zzdsVar2.zza) {
                            return zzc;
                        }
                        zzgh zzghVar2 = zzghVar;
                        zzds zzdsVar3 = zzdsVar2;
                        zzc = zzdt.zzc(zzghVar2, bArr, zzj24, i5, i31, zzdsVar3);
                        zzeyVar2.add(zzdsVar3.zzc);
                        zzghVar = zzghVar2;
                        zzdsVar2 = zzdsVar3;
                    }
                    return zzc;
                }
                return i4;
        }
    }

    private final int zzq(int i4) {
        if (i4 < this.zze || i4 > this.zzf) {
            return -1;
        }
        return zzt(i4, 0);
    }

    private final int zzr(int i4, int i5) {
        if (i4 < this.zze || i4 > this.zzf) {
            return -1;
        }
        return zzt(i4, i5);
    }

    private final int zzs(int i4) {
        return this.zzc[i4 + 2];
    }

    private final int zzt(int i4, int i5) {
        int length = (this.zzc.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = this.zzc[i7];
            if (i4 == i8) {
                return i7;
            }
            if (i4 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i4) {
        return (i4 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzv(int i4) {
        return this.zzc[i4 + 1];
    }

    private static long zzw(Object obj, long j4) {
        return ((Long) zzhi.zzf(obj, j4)).longValue();
    }

    private final zzex zzx(int i4) {
        int i5 = i4 / 3;
        return (zzex) this.zzd[i5 + i5 + 1];
    }

    private final zzgh zzy(int i4) {
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        zzgh zzghVar = (zzgh) this.zzd[i6];
        if (zzghVar != null) {
            return zzghVar;
        }
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i6 + 1]);
        this.zzd[i6] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i4) {
        int i5 = i4 / 3;
        return this.zzd[i5 + i5];
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final int zza(Object obj) {
        int i4;
        int zzc;
        int length = this.zzc.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int zzv = zzv(i6);
            int i7 = this.zzc[i6];
            long j4 = 1048575 & zzv;
            int i8 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i4 = i5 * 53;
                    zzc = zzez.zzc(Double.doubleToLongBits(zzhi.zza(obj, j4)));
                    i5 = i4 + zzc;
                    break;
                case 1:
                    i4 = i5 * 53;
                    zzc = Float.floatToIntBits(zzhi.zzb(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 2:
                    i4 = i5 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 3:
                    i4 = i5 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 4:
                    i4 = i5 * 53;
                    zzc = zzhi.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 5:
                    i4 = i5 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 6:
                    i4 = i5 * 53;
                    zzc = zzhi.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 7:
                    i4 = i5 * 53;
                    zzc = zzez.zza(zzhi.zzt(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 8:
                    i4 = i5 * 53;
                    zzc = ((String) zzhi.zzf(obj, j4)).hashCode();
                    i5 = i4 + zzc;
                    break;
                case 9:
                    Object zzf = zzhi.zzf(obj, j4);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 10:
                    i4 = i5 * 53;
                    zzc = zzhi.zzf(obj, j4).hashCode();
                    i5 = i4 + zzc;
                    break;
                case 11:
                    i4 = i5 * 53;
                    zzc = zzhi.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 12:
                    i4 = i5 * 53;
                    zzc = zzhi.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 13:
                    i4 = i5 * 53;
                    zzc = zzhi.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 14:
                    i4 = i5 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 15:
                    i4 = i5 * 53;
                    zzc = zzhi.zzc(obj, j4);
                    i5 = i4 + zzc;
                    break;
                case 16:
                    i4 = i5 * 53;
                    zzc = zzez.zzc(zzhi.zzd(obj, j4));
                    i5 = i4 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzhi.zzf(obj, j4);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i5 = (i5 * 53) + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case 29:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 33:
                case 34:
                case C3139z9.f40333J /* 35 */:
                case 36:
                case 37:
                case C3139z9.f40334K /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i5 * 53;
                    zzc = zzhi.zzf(obj, j4).hashCode();
                    i5 = i4 + zzc;
                    break;
                case 50:
                    i4 = i5 * 53;
                    zzc = zzhi.zzf(obj, j4).hashCode();
                    i5 = i4 + zzc;
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzez.zzc(Double.doubleToLongBits(((Double) zzhi.zzf(obj, j4)).doubleValue()));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = Float.floatToIntBits(((Float) zzhi.zzf(obj, j4)).floatValue());
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzl(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzl(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzez.zza(((Boolean) zzhi.zzf(obj, j4)).booleanValue());
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = ((String) zzhi.zzf(obj, j4)).hashCode();
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzhi.zzf(obj, j4).hashCode();
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzhi.zzf(obj, j4).hashCode();
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzl(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzl(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzl(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzl(obj, j4);
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzez.zzc(zzw(obj, j4));
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(obj, i7, i6)) {
                        i4 = i5 * 53;
                        zzc = zzhi.zzf(obj, j4).hashCode();
                        i5 = i4 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i5 * 53) + this.zzm.zza(obj).hashCode();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:108:0x0088. Please report as an issue. */
    final int zzb(Object obj, byte[] bArr, int i4, int i5, int i6, zzds zzdsVar) {
        int i7;
        zzfz<T> zzfzVar;
        Unsafe unsafe;
        int i8;
        Object obj2;
        int i9;
        int i10;
        int i11;
        int i12;
        byte[] bArr2;
        int i13;
        Unsafe unsafe2;
        int i14;
        zzds zzdsVar2;
        int zzj;
        int i15;
        int i16;
        zzds zzdsVar3;
        int i17;
        Object obj3;
        Unsafe unsafe3;
        byte[] bArr3;
        zzds zzdsVar4;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zzfz<T> zzfzVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i23 = i5;
        zzds zzdsVar5 = zzdsVar;
        Unsafe unsafe4 = zzb;
        int i24 = -1;
        int i25 = i4;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 1048575;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                int i32 = bArr4[i25];
                if (i32 < 0) {
                    i31 = zzdt.zzk(i32, bArr4, i31, zzdsVar5);
                    i32 = zzdsVar5.zza;
                }
                int i33 = i32;
                int i34 = i31;
                int i35 = i33 >>> 3;
                int i36 = i33 & 7;
                i29 = i35 > i26 ? zzfzVar2.zzr(i35, i29 / 3) : zzfzVar2.zzq(i35);
                if (i29 == i24) {
                    i7 = i6;
                    zzfzVar = zzfzVar2;
                    i9 = i34;
                    i10 = i35;
                    unsafe = unsafe4;
                    i11 = i24;
                    i27 = i33;
                    i29 = 0;
                    i8 = 1048575;
                    obj2 = obj4;
                } else {
                    int[] iArr = zzfzVar2.zzc;
                    int i37 = iArr[i29 + 1];
                    int zzu = zzu(i37);
                    int i38 = i33;
                    long j4 = i37 & 1048575;
                    if (zzu <= 17) {
                        int i39 = iArr[i29 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i30) {
                            i12 = 1048575;
                            if (i30 != 1048575) {
                                unsafe4.putInt(obj4, i30, i28);
                            }
                            i30 = i41;
                            i28 = unsafe4.getInt(obj4, i41);
                        } else {
                            i12 = 1048575;
                        }
                        switch (zzu) {
                            case 0:
                                bArr3 = bArr;
                                i13 = i12;
                                zzdsVar4 = zzdsVar;
                                obj3 = obj4;
                                unsafe3 = unsafe4;
                                i14 = i34;
                                i10 = i35;
                                if (i36 == 1) {
                                    zzhi.zzl(obj3, j4, Double.longBitsToDouble(zzdt.zzn(bArr3, i14)));
                                    i25 = i14 + 8;
                                    i28 |= i40;
                                    i23 = i5;
                                    unsafe4 = unsafe3;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    break;
                                } else {
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 1:
                                bArr3 = bArr;
                                i13 = i12;
                                zzdsVar4 = zzdsVar;
                                obj3 = obj4;
                                unsafe3 = unsafe4;
                                i14 = i34;
                                i10 = i35;
                                if (i36 == 5) {
                                    zzhi.zzm(obj3, j4, Float.intBitsToFloat(zzdt.zzb(bArr3, i14)));
                                    i25 = i14 + 4;
                                    i28 |= i40;
                                    i23 = i5;
                                    unsafe4 = unsafe3;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    break;
                                } else {
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr3 = bArr;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i14 = i34;
                                i10 = i35;
                                zzdsVar4 = zzdsVar;
                                if (i36 == 0) {
                                    int zzm = zzdt.zzm(bArr3, i14, zzdsVar4);
                                    unsafe2.putLong(obj, j4, zzdsVar4.zzb);
                                    obj3 = obj;
                                    i28 |= i40;
                                    i23 = i5;
                                    unsafe4 = unsafe2;
                                    i25 = zzm;
                                    bArr4 = bArr3;
                                    zzdsVar5 = zzdsVar4;
                                    obj4 = obj3;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i14 = i34;
                                i10 = i35;
                                zzdsVar2 = zzdsVar;
                                if (i36 == 0) {
                                    zzj = zzdt.zzj(bArr2, i14, zzdsVar2);
                                    unsafe2.putInt(obj4, j4, zzdsVar2.zza);
                                    i28 |= i40;
                                    i23 = i5;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i10 = i35;
                                zzdsVar2 = zzdsVar;
                                if (i36 == 1) {
                                    Object obj5 = obj4;
                                    unsafe2.putLong(obj5, j4, zzdt.zzn(bArr2, i34));
                                    unsafe2 = unsafe2;
                                    obj4 = obj5;
                                    zzj = i34 + 8;
                                    i28 |= i40;
                                    i23 = i5;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    i14 = i34;
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i15 = i34;
                                i10 = i35;
                                zzdsVar2 = zzdsVar;
                                if (i36 == 5) {
                                    unsafe2.putInt(obj4, j4, zzdt.zzb(bArr2, i15));
                                    zzj = i15 + 4;
                                    i28 |= i40;
                                    i23 = i5;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i15 = i34;
                                i10 = i35;
                                zzdsVar2 = zzdsVar;
                                if (i36 == 0) {
                                    zzj = zzdt.zzm(bArr2, i15, zzdsVar2);
                                    i38 = i38;
                                    zzhi.zzk(obj4, j4, zzdsVar2.zzb != 0);
                                    i28 |= i40;
                                    i23 = i5;
                                    unsafe4 = unsafe2;
                                    zzdsVar5 = zzdsVar2;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    i38 = i38;
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i16 = i38;
                                i15 = i34;
                                i10 = i35;
                                zzdsVar3 = zzdsVar;
                                if (i36 == 2) {
                                    zzj = (536870912 & i37) == 0 ? zzdt.zzg(bArr2, i15, zzdsVar3) : zzdt.zzh(bArr2, i15, zzdsVar3);
                                    unsafe2.putObject(obj4, j4, zzdsVar3.zzc);
                                    i28 |= i40;
                                    i23 = i5;
                                    i27 = i16;
                                    zzdsVar5 = zzdsVar3;
                                    i26 = i10;
                                    i24 = -1;
                                    unsafe4 = unsafe2;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i38 = i16;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 9:
                                bArr2 = bArr;
                                i17 = i5;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i16 = i38;
                                i15 = i34;
                                i10 = i35;
                                zzdsVar3 = zzdsVar;
                                if (i36 == 2) {
                                    zzj = zzdt.zzd(zzfzVar2.zzy(i29), bArr2, i15, i17, zzdsVar3);
                                    if ((i28 & i40) == 0) {
                                        unsafe2.putObject(obj4, j4, zzdsVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j4, zzez.zzg(unsafe2.getObject(obj4, j4), zzdsVar3.zzc));
                                    }
                                    i28 |= i40;
                                    i27 = i16;
                                    i23 = i17;
                                    zzdsVar5 = zzdsVar3;
                                    i26 = i10;
                                    i24 = -1;
                                    unsafe4 = unsafe2;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i38 = i16;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 10:
                                bArr2 = bArr;
                                i17 = i5;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i16 = i38;
                                i15 = i34;
                                i10 = i35;
                                zzdsVar3 = zzdsVar;
                                if (i36 == 2) {
                                    zzj = zzdt.zza(bArr2, i15, zzdsVar3);
                                    unsafe2.putObject(obj4, j4, zzdsVar3.zzc);
                                    i28 |= i40;
                                    i27 = i16;
                                    i23 = i17;
                                    zzdsVar5 = zzdsVar3;
                                    i26 = i10;
                                    i24 = -1;
                                    unsafe4 = unsafe2;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i38 = i16;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 12:
                                bArr2 = bArr;
                                i17 = i5;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i15 = i34;
                                i10 = i35;
                                zzdsVar3 = zzdsVar;
                                if (i36 != 0) {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    zzj = zzdt.zzj(bArr2, i15, zzdsVar3);
                                    int i42 = zzdsVar3.zza;
                                    zzex zzx = zzfzVar2.zzx(i29);
                                    if (zzx == null || zzx.zza()) {
                                        i16 = i38;
                                        unsafe2.putInt(obj4, j4, i42);
                                        i28 |= i40;
                                        i27 = i16;
                                        i23 = i17;
                                        zzdsVar5 = zzdsVar3;
                                        i26 = i10;
                                        i24 = -1;
                                        unsafe4 = unsafe2;
                                        i25 = zzj;
                                        bArr4 = bArr2;
                                        break;
                                    } else {
                                        i16 = i38;
                                        zzc(obj4).zzf(i16, Long.valueOf(i42));
                                        i27 = i16;
                                        i23 = i17;
                                        zzdsVar5 = zzdsVar3;
                                        i26 = i10;
                                        i24 = -1;
                                        unsafe4 = unsafe2;
                                        i25 = zzj;
                                        bArr4 = bArr2;
                                    }
                                }
                                break;
                            case 15:
                                bArr2 = bArr;
                                i13 = i12;
                                unsafe2 = unsafe4;
                                i15 = i34;
                                i10 = i35;
                                zzdsVar2 = zzdsVar;
                                if (i36 == 0) {
                                    zzj = zzdt.zzj(bArr2, i15, zzdsVar2);
                                    unsafe2.putInt(obj4, j4, zzei.zzb(zzdsVar2.zza));
                                    i28 |= i40;
                                    unsafe4 = unsafe2;
                                    i23 = i5;
                                    zzdsVar5 = zzdsVar2;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe2;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            case 16:
                                i13 = i12;
                                i15 = i34;
                                i10 = i35;
                                if (i36 == 0) {
                                    int zzm2 = zzdt.zzm(bArr, i15, zzdsVar);
                                    Object obj6 = obj4;
                                    Unsafe unsafe5 = unsafe4;
                                    unsafe5.putLong(obj6, j4, zzei.zzc(zzdsVar.zzb));
                                    obj4 = obj6;
                                    i28 |= i40;
                                    unsafe4 = unsafe5;
                                    i25 = zzm2;
                                    bArr4 = bArr;
                                    i23 = i5;
                                    zzdsVar5 = zzdsVar;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    break;
                                } else {
                                    obj3 = obj4;
                                    unsafe3 = unsafe4;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                            default:
                                if (i36 == 3) {
                                    i10 = i35;
                                    zzj = zzdt.zzc(zzfzVar2.zzy(i29), bArr, i34, i5, (i35 << 3) | 4, zzdsVar);
                                    bArr2 = bArr;
                                    if ((i28 & i40) == 0) {
                                        unsafe4.putObject(obj4, j4, zzdsVar.zzc);
                                    } else {
                                        unsafe4.putObject(obj4, j4, zzez.zzg(unsafe4.getObject(obj4, j4), zzdsVar.zzc));
                                    }
                                    i28 |= i40;
                                    zzdsVar5 = zzdsVar;
                                    i23 = i5;
                                    i27 = i38;
                                    i26 = i10;
                                    i24 = -1;
                                    i25 = zzj;
                                    bArr4 = bArr2;
                                    break;
                                } else {
                                    i13 = i12;
                                    i15 = i34;
                                    i10 = i35;
                                    obj3 = obj4;
                                    unsafe3 = unsafe4;
                                    i14 = i15;
                                    i7 = i6;
                                    zzfzVar = zzfzVar2;
                                    i9 = i14;
                                    obj2 = obj3;
                                    i27 = i38;
                                    i8 = i13;
                                    i11 = -1;
                                    unsafe = unsafe3;
                                    break;
                                }
                        }
                    } else {
                        obj3 = obj4;
                        Unsafe unsafe6 = unsafe4;
                        i10 = i35;
                        if (zzu == 27) {
                            if (i36 == 2) {
                                zzey zzeyVar = (zzey) unsafe6.getObject(obj3, j4);
                                if (!zzeyVar.zzc()) {
                                    int size = zzeyVar.size();
                                    zzeyVar = zzeyVar.zzd(size == 0 ? 10 : size + size);
                                    unsafe6.putObject(obj3, j4, zzeyVar);
                                }
                                unsafe4 = unsafe6;
                                int zze = zzdt.zze(zzfzVar2.zzy(i29), i38, bArr, i34, i5, zzeyVar, zzdsVar);
                                bArr4 = bArr;
                                i23 = i5;
                                zzdsVar5 = zzdsVar;
                                i25 = zze;
                                obj4 = obj3;
                                i27 = i38;
                                i26 = i10;
                                i24 = -1;
                            } else {
                                i18 = i34;
                                i19 = i30;
                                i20 = i28;
                                i21 = i29;
                                i22 = i38;
                                i8 = 1048575;
                                i11 = -1;
                                unsafe = unsafe6;
                            }
                        } else if (zzu <= 49) {
                            int i43 = i30;
                            i20 = i28;
                            i8 = 1048575;
                            i11 = -1;
                            unsafe = unsafe6;
                            int zzp = zzfzVar2.zzp(obj3, bArr, i34, i5, i38, i10, i36, i29, i37, zzu, j4, zzdsVar);
                            i21 = i29;
                            if (zzp != i34) {
                                zzfzVar2 = this;
                                obj4 = obj;
                                bArr4 = bArr;
                                i30 = i43;
                                i23 = i5;
                                i25 = zzp;
                                i27 = i38;
                                i29 = i21;
                                i28 = i20;
                                unsafe4 = unsafe;
                                i24 = i11;
                                i26 = i10;
                                zzdsVar5 = zzdsVar;
                            } else {
                                zzfzVar = this;
                                obj2 = obj;
                                i30 = i43;
                                i9 = zzp;
                                i27 = i38;
                                i29 = i21;
                                i28 = i20;
                                i7 = i6;
                            }
                        } else {
                            i18 = i34;
                            i19 = i30;
                            i20 = i28;
                            i21 = i29;
                            i8 = 1048575;
                            i11 = -1;
                            i22 = i38;
                            unsafe = unsafe6;
                            if (zzu != 50) {
                                i27 = i22;
                                int zzn = zzn(obj, bArr, i18, i5, i27, i10, i36, i37, zzu, j4, i21, zzdsVar);
                                obj2 = obj;
                                zzfzVar = this;
                                if (zzn != i18) {
                                    bArr4 = bArr;
                                    i30 = i19;
                                    i23 = i5;
                                    zzfzVar2 = zzfzVar;
                                    i25 = zzn;
                                    obj4 = obj2;
                                    i29 = i21;
                                    i28 = i20;
                                    unsafe4 = unsafe;
                                    i24 = i11;
                                    i26 = i10;
                                    zzdsVar5 = zzdsVar;
                                } else {
                                    i30 = i19;
                                    i9 = zzn;
                                    i29 = i21;
                                    i28 = i20;
                                    i7 = i6;
                                }
                            } else if (i36 == 2) {
                                int zzm3 = zzm(obj, bArr, i18, i5, i21, j4, zzdsVar);
                                if (zzm3 != i18) {
                                    zzfzVar2 = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i30 = i19;
                                    i23 = i5;
                                    zzdsVar5 = zzdsVar;
                                    i25 = zzm3;
                                    i27 = i22;
                                    i29 = i21;
                                    i28 = i20;
                                    unsafe4 = unsafe;
                                    i24 = -1;
                                    i26 = i10;
                                } else {
                                    obj2 = obj;
                                    i30 = i19;
                                    i7 = i6;
                                    i9 = zzm3;
                                    i27 = i22;
                                    i29 = i21;
                                    i28 = i20;
                                    zzfzVar = this;
                                }
                            }
                        }
                        zzfzVar = this;
                        obj2 = obj;
                        i30 = i19;
                        i7 = i6;
                        i9 = i18;
                        i27 = i22;
                        i29 = i21;
                        i28 = i20;
                    }
                }
                if (i27 != i7 || i7 == 0) {
                    int i44 = i27;
                    int zzi = zzdt.zzi(i44, bArr, i9, i5, zzc(obj2), zzdsVar);
                    i27 = i44;
                    zzdsVar5 = zzdsVar;
                    i23 = i5;
                    zzfzVar2 = zzfzVar;
                    obj4 = obj2;
                    unsafe4 = unsafe;
                    i24 = i11;
                    i26 = i10;
                    i25 = zzi;
                    bArr4 = bArr;
                } else {
                    i23 = i5;
                    i25 = i9;
                }
            } else {
                i7 = i6;
                zzfzVar = zzfzVar2;
                unsafe = unsafe4;
                i8 = 1048575;
                obj2 = obj4;
            }
        }
        if (i30 != i8) {
            unsafe.putInt(obj2, i30, i28);
        }
        for (int i45 = zzfzVar.zzj; i45 < zzfzVar.zzk; i45++) {
            int i46 = zzfzVar.zzi[i45];
            int i47 = zzfzVar.zzc[i46];
            Object zzf = zzhi.zzf(obj2, zzfzVar.zzv(i46) & i8);
            if (zzf != null && zzfzVar.zzx(i46) != null) {
                throw null;
            }
        }
        if (i7 == 0) {
            if (i25 != i23) {
                throw zzfa.zzd();
            }
        } else if (i25 > i23 || i27 != i7) {
            throw zzfa.zzd();
        }
        return i25;
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zze(Object obj) {
        int i4;
        int i5 = this.zzj;
        while (true) {
            i4 = this.zzk;
            if (i5 >= i4) {
                break;
            }
            long zzv = zzv(this.zzi[i5]) & 1048575;
            Object zzf = zzhi.zzf(obj, zzv);
            if (zzf != null) {
                ((zzfq) zzf).zzc();
                zzhi.zzp(obj, zzv, zzf);
            }
            i5++;
        }
        int length = this.zzi.length;
        while (i4 < length) {
            this.zzl.zza(obj, this.zzi[i4]);
            i4++;
        }
        this.zzm.zze(obj);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzv = zzv(i4);
            long j4 = 1048575 & zzv;
            int i5 = this.zzc[i4];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(obj2, i4)) {
                        zzhi.zzl(obj, j4, zzhi.zza(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(obj2, i4)) {
                        zzhi.zzm(obj, j4, zzhi.zzb(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(obj2, i4)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(obj2, i4)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(obj2, i4)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(obj2, i4)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(obj2, i4)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(obj2, i4)) {
                        zzhi.zzk(obj, j4, zzhi.zzt(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(obj2, i4)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i4);
                    break;
                case 10:
                    if (zzG(obj2, i4)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(obj2, i4)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(obj2, i4)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(obj2, i4)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(obj2, i4)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(obj2, i4)) {
                        zzhi.zzn(obj, j4, zzhi.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(obj2, i4)) {
                        zzhi.zzo(obj, j4, zzhi.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i4);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case 29:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 33:
                case 34:
                case C3139z9.f40333J /* 35 */:
                case 36:
                case 37:
                case C3139z9.f40334K /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j4);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j4);
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                case IronSourceConstants.SET_USER_ID /* 52 */:
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                case 58:
                case 59:
                    if (zzJ(obj2, i5, i4)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzE(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i4);
                    break;
                case 61:
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzJ(obj2, i5, i4)) {
                        zzhi.zzp(obj, j4, zzhi.zzf(obj2, j4));
                        zzE(obj, i5, i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i4);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final void zzg(Object obj, byte[] bArr, int i4, int i5, zzds zzdsVar) {
        if (this.zzh) {
            zzo(obj, bArr, i4, i5, zzdsVar);
        } else {
            zzb(obj, bArr, i4, i5, 0, zzdsVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgh
    public final boolean zzh(Object obj, Object obj2) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzv = zzv(i4);
            long j4 = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(obj, obj2, i4) && Double.doubleToLongBits(zzhi.zza(obj, j4)) == Double.doubleToLongBits(zzhi.zza(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(obj, obj2, i4) && Float.floatToIntBits(zzhi.zzb(obj, j4)) == Float.floatToIntBits(zzhi.zzb(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(obj, obj2, i4) && zzhi.zzd(obj, j4) == zzhi.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(obj, obj2, i4) && zzhi.zzd(obj, j4) == zzhi.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(obj, obj2, i4) && zzhi.zzc(obj, j4) == zzhi.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(obj, obj2, i4) && zzhi.zzd(obj, j4) == zzhi.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(obj, obj2, i4) && zzhi.zzc(obj, j4) == zzhi.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(obj, obj2, i4) && zzhi.zzt(obj, j4) == zzhi.zzt(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(obj, obj2, i4) && zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(obj, obj2, i4) && zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(obj, obj2, i4) && zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(obj, obj2, i4) && zzhi.zzc(obj, j4) == zzhi.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(obj, obj2, i4) && zzhi.zzc(obj, j4) == zzhi.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(obj, obj2, i4) && zzhi.zzc(obj, j4) == zzhi.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(obj, obj2, i4) && zzhi.zzd(obj, j4) == zzhi.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(obj, obj2, i4) && zzhi.zzc(obj, j4) == zzhi.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(obj, obj2, i4) && zzhi.zzd(obj, j4) == zzhi.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(obj, obj2, i4) && zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 25:
                case 26:
                case 27:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case 29:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 33:
                case 34:
                case C3139z9.f40333J /* 35 */:
                case 36:
                case 37:
                case C3139z9.f40334K /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4));
                    break;
                case 50:
                    zzh = zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4));
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                case IronSourceConstants.SET_USER_ID /* 52 */:
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                case 58:
                case 59:
                case 60:
                case 61:
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                case 68:
                    long zzs = zzs(i4) & 1048575;
                    if (zzhi.zzc(obj, zzs) == zzhi.zzc(obj2, zzs) && zzgj.zzh(zzhi.zzf(obj, j4), zzhi.zzf(obj2, j4))) {
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
        int i4;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.zzj) {
            int i9 = this.zzi[i7];
            int i10 = this.zzc[i9];
            int zzv = zzv(i9);
            int i11 = this.zzc[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i8 = zzb.getInt(obj, i12);
                }
                i5 = i8;
                i4 = i12;
            } else {
                i4 = i6;
                i5 = i8;
            }
            Object obj2 = obj;
            if ((268435456 & zzv) != 0 && !zzH(obj2, i9, i4, i5, i13)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(obj2, i10, i9) && !zzI(obj2, zzv, zzy(i9))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfq) zzhi.zzf(obj2, zzv & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj2, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgh zzy = zzy(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!zzy.zzi(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (zzH(obj2, i9, i4, i5, i13) && !zzI(obj2, zzv, zzy(i9))) {
                return false;
            }
            i7++;
            obj = obj2;
            i6 = i4;
            i8 = i5;
        }
        return true;
    }
}
