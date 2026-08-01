package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgxz<T> implements zzgyp<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgzq.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgxw zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzgxk zzm;
    private final zzgzg zzn;
    private final zzgvz zzo;
    private final zzgyb zzp;
    private final zzgxr zzq;

    private zzgxz(int[] iArr, Object[] objArr, int i, int i2, zzgxw zzgxwVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzgyb zzgybVar, zzgxk zzgxkVar, zzgzg zzgzgVar, zzgvz zzgvzVar, zzgxr zzgxrVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgxwVar instanceof zzgwm;
        boolean z2 = false;
        if (zzgvzVar != null && zzgvzVar.zzh(zzgxwVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzgybVar;
        this.zzm = zzgxkVar;
        this.zzn = zzgzgVar;
        this.zzo = zzgvzVar;
        this.zzg = zzgxwVar;
        this.zzq = zzgxrVar;
    }

    private final Object zzA(Object obj, int i) {
        zzgyp zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzgyp zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgyp zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int zzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgyp zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzgyh zzgyhVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzgzq.zzv(obj, j, zzgyhVar.zzs());
        } else if (this.zzi) {
            zzgzq.zzv(obj, j, zzgyhVar.zzr());
        } else {
            zzgzq.zzv(obj, j, zzgyhVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzgzq.zzt(obj, j, (1 << (zzr >>> 20)) | zzgzq.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzgzq.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzgzq.zzd(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzgzq.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgzq.zzc(obj, j2)) != 0;
            case 2:
                return zzgzq.zzf(obj, j2) != 0;
            case 3:
                return zzgzq.zzf(obj, j2) != 0;
            case 4:
                return zzgzq.zzd(obj, j2) != 0;
            case 5:
                return zzgzq.zzf(obj, j2) != 0;
            case 6:
                return zzgzq.zzd(obj, j2) != 0;
            case 7:
                return zzgzq.zzz(obj, j2);
            case 8:
                Object zzh = zzgzq.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                }
                if (zzh instanceof zzgve) {
                    return !zzgve.zzb.equals(zzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgzq.zzh(obj, j2) != null;
            case 10:
                return !zzgve.zzb.equals(zzgzq.zzh(obj, j2));
            case 11:
                return zzgzq.zzd(obj, j2) != 0;
            case 12:
                return zzgzq.zzd(obj, j2) != 0;
            case 13:
                return zzgzq.zzd(obj, j2) != 0;
            case 14:
                return zzgzq.zzf(obj, j2) != 0;
            case 15:
                return zzgzq.zzd(obj, j2) != 0;
            case 16:
                return zzgzq.zzf(obj, j2) != 0;
            case 17:
                return zzgzq.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzgyp zzgypVar) {
        return zzgypVar.zzk(zzgzq.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgwm) {
            return ((zzgwm) obj).zzaY();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzgzq.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzgzq.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzgvu zzgvuVar) throws IOException {
        if (obj instanceof String) {
            zzgvuVar.zzF(i, (String) obj);
        } else {
            zzgvuVar.zzd(i, (zzgve) obj);
        }
    }

    static zzgzh zzd(Object obj) {
        zzgwm zzgwmVar = (zzgwm) obj;
        zzgzh zzgzhVar = zzgwmVar.zzc;
        if (zzgzhVar != zzgzh.zzc()) {
            return zzgzhVar;
        }
        zzgzh zzf = zzgzh.zzf();
        zzgwmVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzgxz zzl(Class cls, zzgxt zzgxtVar, zzgyb zzgybVar, zzgxk zzgxkVar, zzgzg zzgzgVar, zzgvz zzgvzVar, zzgxr zzgxrVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        zzgyg zzgygVar;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        Field zzC;
        char charAt11;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i26;
        char charAt12;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        if (!(zzgxtVar instanceof zzgyg)) {
            throw null;
        }
        zzgyg zzgygVar2 = (zzgyg) zzgxtVar;
        String zzd = zzgygVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (zzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i32 = charAt16 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt15 = zzd.charAt(i31);
                if (charAt15 < 55296) {
                    break;
                }
                i32 |= (charAt15 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt16 = i32 | (charAt15 << i33);
            i31 = i29;
        }
        if (charAt16 == 0) {
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = zza;
            i5 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt17 = zzd.charAt(i31);
            if (charAt17 >= 55296) {
                int i35 = charAt17 & 8191;
                int i36 = 13;
                while (true) {
                    i14 = i34 + 1;
                    charAt10 = zzd.charAt(i34);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i35 |= (charAt10 & 8191) << i36;
                    i36 += 13;
                    i34 = i14;
                }
                charAt17 = i35 | (charAt10 << i36);
                i34 = i14;
            }
            int i37 = i34 + 1;
            int charAt18 = zzd.charAt(i34);
            if (charAt18 >= 55296) {
                int i38 = charAt18 & 8191;
                int i39 = 13;
                while (true) {
                    i13 = i37 + 1;
                    charAt9 = zzd.charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i13;
                }
                charAt18 = i38 | (charAt9 << i39);
                i37 = i13;
            }
            int i40 = i37 + 1;
            int charAt19 = zzd.charAt(i37);
            if (charAt19 >= 55296) {
                int i41 = charAt19 & 8191;
                int i42 = 13;
                while (true) {
                    i12 = i40 + 1;
                    charAt8 = zzd.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i12;
                }
                charAt19 = i41 | (charAt8 << i42);
                i40 = i12;
            }
            int i43 = i40 + 1;
            int charAt20 = zzd.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i11 = i43 + 1;
                    charAt7 = zzd.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i11;
                }
                charAt20 = i44 | (charAt7 << i45);
                i43 = i11;
            }
            int i46 = i43 + 1;
            charAt = zzd.charAt(i43);
            if (charAt >= 55296) {
                int i47 = charAt & 8191;
                int i48 = 13;
                while (true) {
                    i10 = i46 + 1;
                    charAt6 = zzd.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i10;
                }
                charAt = i47 | (charAt6 << i48);
                i46 = i10;
            }
            int i49 = i46 + 1;
            charAt2 = zzd.charAt(i46);
            if (charAt2 >= 55296) {
                int i50 = charAt2 & 8191;
                int i51 = 13;
                while (true) {
                    i9 = i49 + 1;
                    charAt5 = zzd.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i9;
                }
                charAt2 = i50 | (charAt5 << i51);
                i49 = i9;
            }
            int i52 = i49 + 1;
            int charAt21 = zzd.charAt(i49);
            if (charAt21 >= 55296) {
                int i53 = charAt21 & 8191;
                int i54 = 13;
                while (true) {
                    i8 = i52 + 1;
                    charAt4 = zzd.charAt(i52);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i8;
                }
                charAt21 = i53 | (charAt4 << i54);
                i52 = i8;
            }
            int i55 = i52 + 1;
            int charAt22 = zzd.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i7 = i55 + 1;
                    charAt3 = zzd.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i7;
                }
                charAt22 = i56 | (charAt3 << i57);
                i55 = i7;
            }
            i2 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i3 = charAt19;
            i4 = charAt22;
            i5 = charAt17;
            i6 = charAt20;
            i31 = i55;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzgygVar2.zze();
        Class<?> cls2 = zzgygVar2.zza().getClass();
        int i58 = i4 + charAt2;
        int i59 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[i59];
        int i60 = 0;
        int i61 = 0;
        int i62 = i4;
        int i63 = i58;
        while (i31 < length) {
            int i64 = i31 + 1;
            int charAt23 = zzd.charAt(i31);
            if (charAt23 >= c) {
                int i65 = charAt23 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    charAt14 = zzd.charAt(i66);
                    if (charAt14 < c) {
                        break;
                    }
                    i65 |= (charAt14 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                charAt23 = i65 | (charAt14 << i67);
                i15 = i28;
            } else {
                i15 = i64;
            }
            int i68 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i69 = charAt24 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    charAt13 = zzd.charAt(i70);
                    if (charAt13 < c) {
                        break;
                    }
                    i69 |= (charAt13 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                }
                charAt24 = i69 | (charAt13 << i71);
                i16 = i27;
            } else {
                i16 = i68;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i72 = charAt24 & 255;
            int i73 = charAt24 & 2048;
            int i74 = length;
            if (i72 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i76 = 13;
                    int i77 = charAt25 & 8191;
                    int i78 = i75;
                    while (true) {
                        i26 = i78 + 1;
                        charAt12 = zzd.charAt(i78);
                        if (charAt12 < c2) {
                            break;
                        }
                        i77 |= (charAt12 & 8191) << i76;
                        i76 += 13;
                        i78 = i26;
                        c2 = 55296;
                    }
                    charAt25 = i77 | (charAt12 << i76);
                    i24 = i26;
                } else {
                    i24 = i75;
                }
                int i79 = i24;
                int i80 = i72 - 51;
                i18 = i6;
                if (i80 == 9 || i80 == 17) {
                    i25 = i2 + 1;
                    int i81 = i61 / 3;
                    objArr[i81 + i81 + 1] = zze[i2];
                } else {
                    if (i80 == 12) {
                        if (zzgygVar2.zzc() == 1 || i73 != 0) {
                            i25 = i2 + 1;
                            int i82 = i61 / 3;
                            objArr[i82 + i82 + 1] = zze[i2];
                        } else {
                            i73 = 0;
                        }
                    }
                    int i83 = charAt25 + charAt25;
                    obj = zze[i83];
                    if (obj instanceof Field) {
                        zzC2 = zzC(cls2, (String) obj);
                        zze[i83] = zzC2;
                    } else {
                        zzC2 = (Field) obj;
                    }
                    i17 = i3;
                    i22 = (int) unsafe.objectFieldOffset(zzC2);
                    int i84 = i83 + 1;
                    obj2 = zze[i84];
                    if (obj2 instanceof Field) {
                        zzC3 = zzC(cls2, (String) obj2);
                        zze[i84] = zzC3;
                    } else {
                        zzC3 = (Field) obj2;
                    }
                    str = zzd;
                    i19 = (int) unsafe.objectFieldOffset(zzC3);
                    i20 = i79;
                    i21 = 0;
                    zzgygVar = zzgygVar2;
                }
                i2 = i25;
                int i832 = charAt25 + charAt25;
                obj = zze[i832];
                if (obj instanceof Field) {
                }
                i17 = i3;
                i22 = (int) unsafe.objectFieldOffset(zzC2);
                int i842 = i832 + 1;
                obj2 = zze[i842];
                if (obj2 instanceof Field) {
                }
                str = zzd;
                i19 = (int) unsafe.objectFieldOffset(zzC3);
                i20 = i79;
                i21 = 0;
                zzgygVar = zzgygVar2;
            } else {
                i17 = i3;
                i18 = i6;
                int i85 = i2 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i2]);
                if (i72 == 9 || i72 == 17) {
                    zzgygVar = zzgygVar2;
                    int i86 = i61 / 3;
                    objArr[i86 + i86 + 1] = zzC4.getType();
                } else {
                    if (i72 == 27) {
                        zzgygVar = zzgygVar2;
                        i23 = i85 + 1;
                    } else if (i72 == 49) {
                        i23 = i85 + 1;
                        zzgygVar = zzgygVar2;
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        zzgygVar = zzgygVar2;
                        if (zzgygVar2.zzc() == 1 || i73 != 0) {
                            i23 = i85 + 1;
                            int i87 = i61 / 3;
                            objArr[i87 + i87 + 1] = zze[i85];
                            i85 = i23;
                        } else {
                            i73 = 0;
                        }
                    } else {
                        if (i72 == 50) {
                            int i88 = i85 + 1;
                            int i89 = i62 + 1;
                            iArr[i62] = i61;
                            int i90 = i61 / 3;
                            int i91 = i90 + i90;
                            objArr[i91] = zze[i85];
                            if (i73 != 0) {
                                i85 = i88 + 1;
                                objArr[i91 + 1] = zze[i88];
                                i62 = i89;
                            } else {
                                i85 = i88;
                                i62 = i89;
                                i73 = 0;
                            }
                        }
                        zzgygVar = zzgygVar2;
                    }
                    int i92 = i61 / 3;
                    objArr[i92 + i92 + 1] = zze[i85];
                    i85 = i23;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i19 = 1048575;
                if ((charAt24 & 4096) == 0 || i72 > 17) {
                    str = zzd;
                    i20 = i16;
                    i21 = 0;
                } else {
                    int i93 = i16 + 1;
                    int charAt26 = zzd.charAt(i16);
                    if (charAt26 >= 55296) {
                        int i94 = charAt26 & 8191;
                        int i95 = 13;
                        while (true) {
                            i20 = i93 + 1;
                            charAt11 = zzd.charAt(i93);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i94 |= (charAt11 & 8191) << i95;
                            i95 += 13;
                            i93 = i20;
                        }
                        charAt26 = i94 | (charAt11 << i95);
                    } else {
                        i20 = i93;
                    }
                    int i96 = i5 + i5 + (charAt26 / 32);
                    Object obj3 = zze[i96];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzC = (Field) obj3;
                    } else {
                        zzC = zzC(cls2, (String) obj3);
                        zze[i96] = zzC;
                    }
                    i21 = charAt26 % 32;
                    i19 = (int) unsafe.objectFieldOffset(zzC);
                }
                if (i72 >= 18 && i72 <= 49) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i2 = i85;
                i22 = objectFieldOffset;
            }
            int i97 = i61 + 1;
            iArr2[i61] = charAt23;
            int i98 = i97 + 1;
            iArr2[i97] = i22 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i73 != 0 ? Integer.MIN_VALUE : 0) | (i72 << 20);
            i61 = i98 + 1;
            iArr2[i98] = (i21 << 20) | i19;
            i31 = i20;
            length = i74;
            zzgygVar2 = zzgygVar;
            zzd = str;
            i6 = i18;
            i3 = i17;
            c = 55296;
        }
        zzgyg zzgygVar3 = zzgygVar2;
        return new zzgxz(iArr2, objArr, i3, i6, zzgygVar3.zza(), zzgygVar3.zzc(), false, iArr, i4, i58, zzgybVar, zzgxkVar, zzgzgVar, zzgvzVar, zzgxrVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzgzq.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzgzq.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzgzq.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzgzq.zzh(obj, j)).longValue();
    }

    private final zzgwq zzw(int i) {
        int i2 = i / 3;
        return (zzgwq) this.zzd[i2 + i2 + 1];
    }

    private final zzgyp zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgyp zzgypVar = (zzgyp) objArr[i3];
        if (zzgypVar != null) {
            return zzgypVar;
        }
        zzgyp zzb2 = zzgye.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzgzg zzgzgVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzgzq.zzh(obj, zzu(i) & 1048575);
        if (zzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v109, types: [com.google.android.gms.internal.ads.zzgxe] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v178, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v248, types: [int] */
    /* JADX WARN: Type inference failed for: r0v255, types: [int] */
    /* JADX WARN: Type inference failed for: r0v260 */
    /* JADX WARN: Type inference failed for: r0v261 */
    /* JADX WARN: Type inference failed for: r0v262 */
    /* JADX WARN: Type inference failed for: r0v263 */
    /* JADX WARN: Type inference failed for: r0v264 */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v266 */
    /* JADX WARN: Type inference failed for: r0v267 */
    /* JADX WARN: Type inference failed for: r0v268 */
    /* JADX WARN: Type inference failed for: r0v269 */
    /* JADX WARN: Type inference failed for: r0v270 */
    /* JADX WARN: Type inference failed for: r0v271 */
    /* JADX WARN: Type inference failed for: r0v272 */
    /* JADX WARN: Type inference failed for: r0v273 */
    /* JADX WARN: Type inference failed for: r0v274 */
    /* JADX WARN: Type inference failed for: r0v275 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v110, types: [int] */
    /* JADX WARN: Type inference failed for: r1v113, types: [int] */
    /* JADX WARN: Type inference failed for: r1v149 */
    /* JADX WARN: Type inference failed for: r1v152 */
    /* JADX WARN: Type inference failed for: r1v153 */
    /* JADX WARN: Type inference failed for: r1v154 */
    /* JADX WARN: Type inference failed for: r1v155 */
    /* JADX WARN: Type inference failed for: r1v70, types: [int] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [int] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53, types: [int] */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v91 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v35, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v42, types: [int] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30, types: [int] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.ads.zzgyp
    public final int zza(Object obj) {
        int i;
        int i2;
        ?? r5;
        int zzA;
        int zzA2;
        int zzB;
        int zzA3;
        int zzA4;
        int zzA5;
        int zzA6;
        ?? zzg;
        int size;
        int zzA7;
        int zzz;
        int zzz2;
        ?? r3;
        int zzy;
        ?? r1;
        ?? r0;
        int zze;
        int zzA8;
        int zzA9;
        ?? r4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i3 = 1048575;
        ?? r12 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzc.length) {
            int zzu = zzu(i4);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int i8 = iArr[i4 + 2];
            int i9 = i8 & i3;
            if (zzt <= 17) {
                if (i9 != i6) {
                    r12 = i9 == i3 ? z : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = i6;
                i2 = r12;
                r5 = 1 << (i8 >>> 20);
            } else {
                i = i6;
                i2 = r12;
                r5 = z;
            }
            int i10 = zzu & i3;
            if (zzt >= zzgwe.DOUBLE_LIST_PACKED.zza()) {
                zzgwe.SINT64_LIST_PACKED.zza();
            }
            long j = i10;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzA = zzgvt.zzA(i7 << 3);
                        r0 = zzA + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 1:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzA2 = zzgvt.zzA(i7 << 3);
                        r0 = zzA2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 2:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzB = zzgvt.zzB(unsafe.getLong(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 3:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzB = zzgvt.zzB(unsafe.getLong(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 4:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzB = zzgvt.zzx(unsafe.getInt(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 5:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzA = zzgvt.zzA(i7 << 3);
                        r0 = zzA + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 6:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzA2 = zzgvt.zzA(i7 << 3);
                        r0 = zzA2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 7:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzA4 = zzgvt.zzA(i7 << 3);
                        r0 = zzA4 + 1;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 8:
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i11 = i7 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgve) {
                            int i12 = zzgvt.zzf;
                            int zzd = ((zzgve) object).zzd();
                            zzA5 = zzgvt.zzA(zzd) + zzd;
                            zzA6 = zzgvt.zzA(i11);
                            r0 = zzA6 + zzA5;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            zzB = zzgvt.zzz((String) object);
                            zzA3 = zzgvt.zzA(i11);
                            r0 = zzA3 + zzB;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 9:
                    if (zzO(obj, i4, i, i2, r5)) {
                        r0 = zzgyr.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 10:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzgve zzgveVar = (zzgve) unsafe.getObject(obj, j);
                        int i13 = zzgvt.zzf;
                        int zzd2 = zzgveVar.zzd();
                        zzA5 = zzgvt.zzA(zzd2) + zzd2;
                        zzA6 = zzgvt.zzA(i7 << 3);
                        r0 = zzA6 + zzA5;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 11:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzB = zzgvt.zzA(unsafe.getInt(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 12:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzB = zzgvt.zzx(unsafe.getInt(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 13:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzA2 = zzgvt.zzA(i7 << 3);
                        r0 = zzA2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 14:
                    if (zzO(obj, i4, i, i2, r5)) {
                        zzA = zzgvt.zzA(i7 << 3);
                        r0 = zzA + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 15:
                    if (zzO(obj, i4, i, i2, r5)) {
                        int i14 = unsafe.getInt(obj, j);
                        zzA3 = zzgvt.zzA(i7 << 3);
                        zzB = zzgvt.zzA((i14 >> 31) ^ (i14 + i14));
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 16:
                    if (zzO(obj, i4, i, i2, r5)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzgvt.zzA(i7 << 3);
                        zzB = zzgvt.zzB((j2 >> 63) ^ (j2 + j2));
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 17:
                    if (zzO(obj, i4, i, i2, r5)) {
                        r0 = zzgvt.zzw(i7, (zzgxw) unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 18:
                    r0 = zzgyr.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 19:
                    r0 = zzgyr.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i15 = zzgyr.zza;
                    if (list.size() != 0) {
                        zzg = zzgyr.zzg(list) + (list.size() * zzgvt.zzA(i7 << 3));
                        i5 += zzg;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzg = z;
                    i5 += zzg;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i16 = zzgyr.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzA3 = zzgyr.zzl(list2);
                        zzA7 = zzgvt.zzA(i7 << 3);
                        zzB = size * zzA7;
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzgyr.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzA3 = zzgyr.zzf(list3);
                        zzA7 = zzgvt.zzA(i7 << 3);
                        zzB = size * zzA7;
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 23:
                    r0 = zzgyr.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 24:
                    r0 = zzgyr.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i18 = zzgyr.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        r0 = size2 * (zzgvt.zzA(i7 << 3) + 1);
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 26:
                    ?? r02 = (List) unsafe.getObject(obj, j);
                    int i19 = zzgyr.zza;
                    int size3 = r02.size();
                    if (size3 != 0) {
                        boolean z2 = r02 instanceof zzgxe;
                        int zzA10 = zzgvt.zzA(i7 << 3) * size3;
                        if (z2) {
                            ?? r03 = (zzgxe) r02;
                            zzg = zzA10;
                            for (?? r32 = z; r32 < size3; r32++) {
                                Object zzf = r03.zzf(r32);
                                if (zzf instanceof zzgve) {
                                    int zzd3 = ((zzgve) zzf).zzd();
                                    zzz2 = zzg + zzgvt.zzA(zzd3) + zzd3;
                                } else {
                                    zzz2 = zzg + zzgvt.zzz((String) zzf);
                                }
                                zzg = zzz2;
                            }
                        } else {
                            zzg = zzA10;
                            for (?? r33 = z; r33 < size3; r33++) {
                                Object obj2 = r02.get(r33);
                                if (obj2 instanceof zzgve) {
                                    int zzd4 = ((zzgve) obj2).zzd();
                                    zzz = zzg + zzgvt.zzA(zzd4) + zzd4;
                                } else {
                                    zzz = zzg + zzgvt.zzz((String) obj2);
                                }
                                zzg = zzz;
                            }
                        }
                        i5 += zzg;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    zzg = z;
                    i5 += zzg;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 27:
                    ?? r04 = (List) unsafe.getObject(obj, j);
                    zzgyp zzx = zzx(i4);
                    int i20 = zzgyr.zza;
                    int size4 = r04.size();
                    if (size4 == 0) {
                        r3 = z;
                    } else {
                        r3 = zzgvt.zzA(i7 << 3) * size4;
                        for (?? r42 = z; r42 < size4; r42++) {
                            Object obj3 = r04.get(r42);
                            if (obj3 instanceof zzgxc) {
                                int zza2 = ((zzgxc) obj3).zza();
                                zzy = (r3 == true ? 1 : 0) + zzgvt.zzA(zza2) + zza2;
                            } else {
                                zzy = (r3 == true ? 1 : 0) + zzgvt.zzy((zzgxw) obj3, zzx);
                            }
                            r3 = zzy;
                        }
                    }
                    i5 += r3;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 28:
                    ?? r05 = (List) unsafe.getObject(obj, j);
                    int i21 = zzgyr.zza;
                    int size5 = r05.size();
                    if (size5 == 0) {
                        r1 = z;
                    } else {
                        r1 = size5 * zzgvt.zzA(i7 << 3);
                        for (?? r2 = z; r2 < r05.size(); r2++) {
                            int zzd5 = ((zzgve) r05.get(r2)).zzd();
                            r1 += zzgvt.zzA(zzd5) + zzd5;
                        }
                    }
                    i5 += r1;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 29:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i22 = zzgyr.zza;
                    size = list5.size();
                    if (size != 0) {
                        zzA3 = zzgyr.zzk(list5);
                        zzA7 = zzgvt.zzA(i7 << 3);
                        zzB = size * zzA7;
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 30:
                    List list6 = (List) unsafe.getObject(obj, j);
                    int i23 = zzgyr.zza;
                    size = list6.size();
                    if (size != 0) {
                        zzA3 = zzgyr.zza(list6);
                        zzA7 = zzgvt.zzA(i7 << 3);
                        zzB = size * zzA7;
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 31:
                    r0 = zzgyr.zzb(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 32:
                    r0 = zzgyr.zzd(i7, (List) unsafe.getObject(obj, j), z);
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 33:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i24 = zzgyr.zza;
                    size = list7.size();
                    if (size != 0) {
                        zzA3 = zzgyr.zzi(list7);
                        zzA7 = zzgvt.zzA(i7 << 3);
                        zzB = size * zzA7;
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 34:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i25 = zzgyr.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzA3 = zzgyr.zzj(list8);
                        zzA7 = zzgvt.zzA(i7 << 3);
                        zzB = size * zzA7;
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                    r0 = z;
                    i5 += r0;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 35:
                    zze = zzgyr.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 36:
                    zze = zzgyr.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 37:
                    zze = zzgyr.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 38:
                    zze = zzgyr.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 39:
                    zze = zzgyr.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 40:
                    zze = zzgyr.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 41:
                    zze = zzgyr.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 42:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i26 = zzgyr.zza;
                    zze = list9.size();
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 43:
                    zze = zzgyr.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 44:
                    zze = zzgyr.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 45:
                    zze = zzgyr.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 46:
                    zze = zzgyr.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 47:
                    zze = zzgyr.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 48:
                    zze = zzgyr.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzA8 = zzgvt.zzA(zze);
                        zzA9 = zzgvt.zzA(i7 << 3);
                        r1 = zzA9 + zzA8 + zze;
                        i5 += r1;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 49:
                    ?? r06 = (List) unsafe.getObject(obj, j);
                    zzgyp zzx2 = zzx(i4);
                    int i27 = zzgyr.zza;
                    int size6 = r06.size();
                    if (size6 == 0) {
                        r4 = z;
                    } else {
                        boolean z3 = z;
                        r4 = z3;
                        ?? r34 = z3;
                        while (r34 < size6) {
                            int zzw = zzgvt.zzw(i7, (zzgxw) r06.get(r34), zzx2);
                            r34++;
                            r4 = (r4 == true ? 1 : 0) + zzw;
                        }
                    }
                    i5 += r4;
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 50:
                    zzgxq zzgxqVar = (zzgxq) unsafe.getObject(obj, j);
                    if (zzgxqVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgxqVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
                case 51:
                    if (zzR(obj, i7, i4)) {
                        zzA = zzgvt.zzA(i7 << 3);
                        r0 = zzA + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 52:
                    if (zzR(obj, i7, i4)) {
                        zzA2 = zzgvt.zzA(i7 << 3);
                        r0 = zzA2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 53:
                    if (zzR(obj, i7, i4)) {
                        zzB = zzgvt.zzB(zzv(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 54:
                    if (zzR(obj, i7, i4)) {
                        zzB = zzgvt.zzB(zzv(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 55:
                    if (zzR(obj, i7, i4)) {
                        zzB = zzgvt.zzx(zzp(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 56:
                    if (zzR(obj, i7, i4)) {
                        zzA = zzgvt.zzA(i7 << 3);
                        r0 = zzA + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 57:
                    if (zzR(obj, i7, i4)) {
                        zzA2 = zzgvt.zzA(i7 << 3);
                        r0 = zzA2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 58:
                    if (zzR(obj, i7, i4)) {
                        zzA4 = zzgvt.zzA(i7 << 3);
                        r0 = zzA4 + 1;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 59:
                    if (zzR(obj, i7, i4)) {
                        int i28 = i7 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgve) {
                            int i29 = zzgvt.zzf;
                            int zzd6 = ((zzgve) object2).zzd();
                            zzA5 = zzgvt.zzA(zzd6) + zzd6;
                            zzA6 = zzgvt.zzA(i28);
                            r0 = zzA6 + zzA5;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        } else {
                            zzB = zzgvt.zzz((String) object2);
                            zzA3 = zzgvt.zzA(i28);
                            r0 = zzA3 + zzB;
                            i5 += r0;
                            i4 += 3;
                            i6 = i;
                            r12 = i2;
                            z = false;
                            i3 = 1048575;
                        }
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 60:
                    if (zzR(obj, i7, i4)) {
                        r0 = zzgyr.zzh(i7, unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 61:
                    if (zzR(obj, i7, i4)) {
                        zzgve zzgveVar2 = (zzgve) unsafe.getObject(obj, j);
                        int i30 = zzgvt.zzf;
                        int zzd7 = zzgveVar2.zzd();
                        zzA5 = zzgvt.zzA(zzd7) + zzd7;
                        zzA6 = zzgvt.zzA(i7 << 3);
                        r0 = zzA6 + zzA5;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 62:
                    if (zzR(obj, i7, i4)) {
                        zzB = zzgvt.zzA(zzp(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 63:
                    if (zzR(obj, i7, i4)) {
                        zzB = zzgvt.zzx(zzp(obj, j));
                        zzA3 = zzgvt.zzA(i7 << 3);
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 64:
                    if (zzR(obj, i7, i4)) {
                        zzA2 = zzgvt.zzA(i7 << 3);
                        r0 = zzA2 + 4;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 65:
                    if (zzR(obj, i7, i4)) {
                        zzA = zzgvt.zzA(i7 << 3);
                        r0 = zzA + 8;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 66:
                    if (zzR(obj, i7, i4)) {
                        int zzp = zzp(obj, j);
                        zzA3 = zzgvt.zzA(i7 << 3);
                        zzB = zzgvt.zzA((zzp >> 31) ^ (zzp + zzp));
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 67:
                    if (zzR(obj, i7, i4)) {
                        long zzv = zzv(obj, j);
                        zzA3 = zzgvt.zzA(i7 << 3);
                        zzB = zzgvt.zzB((zzv >> 63) ^ (zzv + zzv));
                        r0 = zzA3 + zzB;
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                case 68:
                    if (zzR(obj, i7, i4)) {
                        r0 = zzgvt.zzw(i7, (zzgxw) unsafe.getObject(obj, j), zzx(i4));
                        i5 += r0;
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    } else {
                        i4 += 3;
                        i6 = i;
                        r12 = i2;
                        z = false;
                        i3 = 1048575;
                    }
                default:
                    i4 += 3;
                    i6 = i;
                    r12 = i2;
                    z = false;
                    i3 = 1048575;
            }
        }
        zzgzg zzgzgVar = this.zzn;
        int zza3 = i5 + zzgzgVar.zza(zzgzgVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzu = zzu(i4);
            int[] iArr = this.zzc;
            int i5 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i6 = iArr[i4];
            long j = i5;
            int i7 = 37;
            switch (zzt) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzgzq.zzb(obj, j));
                    byte[] bArr = zzgww.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 1:
                    i = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(zzgzq.zzc(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = zzgzq.zzf(obj, j);
                    byte[] bArr2 = zzgww.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = zzgzq.zzf(obj, j);
                    byte[] bArr3 = zzgww.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 4:
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = zzgzq.zzf(obj, j);
                    byte[] bArr4 = zzgww.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 6:
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 7:
                    i = i3 * 53;
                    floatToIntBits = zzgww.zza(zzgzq.zzz(obj, j));
                    i3 = i + floatToIntBits;
                    break;
                case 8:
                    i = i3 * 53;
                    floatToIntBits = ((String) zzgzq.zzh(obj, j)).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object zzh = zzgzq.zzh(obj, j);
                    if (zzh != null) {
                        i7 = zzh.hashCode();
                    }
                    i3 = i2 + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzh(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 11:
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 12:
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 13:
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = zzgzq.zzf(obj, j);
                    byte[] bArr5 = zzgww.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 15:
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzd(obj, j);
                    i3 = i + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = zzgzq.zzf(obj, j);
                    byte[] bArr6 = zzgww.zzd;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i3 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object zzh2 = zzgzq.zzh(obj, j);
                    if (zzh2 != null) {
                        i7 = zzh2.hashCode();
                    }
                    i3 = i2 + i7;
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
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzh(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 50:
                    i = i3 * 53;
                    floatToIntBits = zzgzq.zzh(obj, j).hashCode();
                    i3 = i + floatToIntBits;
                    break;
                case 51:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzgww.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzgww.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzgww.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzgww.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzgww.zza(zzS(obj, j));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = ((String) zzgzq.zzh(obj, j)).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzgzq.zzh(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzgzq.zzh(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzgww.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzp(obj, j);
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzgww.zzd;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i6, i4)) {
                        i = i3 * 53;
                        floatToIntBits = zzgzq.zzh(obj, j).hashCode();
                        i3 = i + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0b68, code lost:
    
        if (r5 == r0) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0b6a, code lost:
    
        r14.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0b6e, code lost:
    
        r11 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0b73, code lost:
    
        if (r11 >= r12.zzl) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0b75, code lost:
    
        zzy(r34, r12.zzj[r11], null, r12.zzn, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0b88, code lost:
    
        if (r9 != 0) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0b8a, code lost:
    
        if (r6 != r10) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0b91, code lost:
    
        throw com.google.android.gms.internal.ads.zzgwy.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0b96, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0b92, code lost:
    
        if (r6 > r10) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0b94, code lost:
    
        if (r8 != r9) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0b9b, code lost:
    
        throw com.google.android.gms.internal.ads.zzgwy.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0836 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0847 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0ae3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0af6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzguq zzguqVar) throws IOException {
        zzgxz<T> zzgxzVar;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int zzq;
        int i10;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe2;
        zzguq zzguqVar2;
        int i14;
        int i15;
        int i16;
        Unsafe unsafe3;
        zzgvy zzgvyVar;
        int i17;
        int i18;
        int i19;
        int i20;
        int zzk;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Unsafe unsafe4;
        int i26;
        int i27;
        int i28;
        long j;
        int i29;
        int i30;
        int i31;
        Unsafe unsafe5;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        Unsafe unsafe6;
        int i38;
        int zzf;
        Object obj2;
        int i39;
        int i40;
        Unsafe unsafe7;
        int i41;
        int zzj;
        int i42;
        int i43;
        int i44;
        zzgxz<T> zzgxzVar2 = this;
        Object obj3 = obj;
        int i45 = i2;
        int i46 = i3;
        zzguq zzguqVar3 = zzguqVar;
        zzD(obj);
        Unsafe unsafe8 = zzb;
        int i47 = -1;
        int i48 = i;
        int i49 = -1;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 1048575;
        while (true) {
            if (i48 < i45) {
                int i54 = i48 + 1;
                int i55 = bArr[i48];
                if (i55 < 0) {
                    int zzi = zzgur.zzi(i55, bArr, i54, zzguqVar3);
                    i9 = zzguqVar3.zza;
                    i54 = zzi;
                } else {
                    i9 = i55;
                }
                int i56 = i9 >>> 3;
                if (i56 > i49) {
                    zzq = (i56 < zzgxzVar2.zze || i56 > zzgxzVar2.zzf) ? i47 : zzgxzVar2.zzs(i56, i50 / 3);
                } else {
                    zzq = zzgxzVar2.zzq(i56);
                }
                int i57 = zzq;
                if (i57 != i47) {
                    int i58 = i9 & 7;
                    int[] iArr = zzgxzVar2.zzc;
                    int i59 = iArr[i57 + 1];
                    int i60 = i56;
                    int zzt = zzt(i59);
                    long j2 = i59 & 1048575;
                    int i61 = i9;
                    if (zzt > 17) {
                        i11 = i52;
                        i12 = i53;
                        Unsafe unsafe9 = unsafe8;
                        i13 = -1;
                        if (zzt != 27) {
                            unsafe2 = unsafe9;
                            if (zzt > 49) {
                                i28 = i57;
                                i27 = i60;
                                i26 = i54;
                                if (zzt != 50) {
                                    i51 = i61;
                                    obj3 = obj;
                                    Unsafe unsafe10 = zzb;
                                    long j3 = iArr[i28 + 2] & 1048575;
                                    switch (zzt) {
                                        case 51:
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 1) {
                                                i48 = i43 + 8;
                                                unsafe10.putObject(obj3, j2, Double.valueOf(Double.longBitsToDouble(zzgur.zzn(bArr, i43))));
                                                unsafe10.putInt(obj3, j3, i15);
                                                if (i48 != i43) {
                                                    i14 = i42;
                                                    i4 = i3;
                                                    i10 = i48;
                                                    break;
                                                } else {
                                                    zzgxzVar2 = this;
                                                    i50 = i42;
                                                    i46 = i3;
                                                    zzguqVar3 = zzguqVar2;
                                                    i45 = i5;
                                                    i49 = i15;
                                                    i47 = -1;
                                                    i52 = i11;
                                                    unsafe8 = unsafe2;
                                                    i53 = i12;
                                                }
                                            }
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                        case 52:
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 5) {
                                                i48 = i43 + 4;
                                                unsafe10.putObject(obj3, j2, Float.valueOf(Float.intBitsToFloat(zzgur.zzb(bArr, i43))));
                                                unsafe10.putInt(obj3, j3, i15);
                                                if (i48 != i43) {
                                                }
                                            }
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 0) {
                                                i48 = zzgur.zzk(bArr, i43, zzguqVar2);
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzguqVar2.zzb));
                                                unsafe10.putInt(obj3, j3, i15);
                                                if (i48 != i43) {
                                                }
                                            }
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 0) {
                                                i48 = zzgur.zzh(bArr, i43, zzguqVar2);
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzguqVar2.zza));
                                                unsafe10.putInt(obj3, j3, i15);
                                                if (i48 != i43) {
                                                }
                                            }
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 1) {
                                                i48 = i43 + 8;
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzgur.zzn(bArr, i43)));
                                                unsafe10.putInt(obj3, j3, i15);
                                                if (i48 != i43) {
                                                }
                                            }
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 5) {
                                                i48 = i43 + 4;
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzgur.zzb(bArr, i43)));
                                                unsafe10.putInt(obj3, j3, i15);
                                                if (i48 != i43) {
                                                }
                                            }
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 58:
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 0) {
                                                i48 = zzgur.zzk(bArr, i43, zzguqVar2);
                                                unsafe10.putObject(obj3, j2, Boolean.valueOf(zzguqVar2.zzb != 0));
                                                unsafe10.putInt(obj3, j3, i15);
                                                if (i48 != i43) {
                                                }
                                            }
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 59:
                                            i5 = i2;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 2) {
                                                int zzh = zzgur.zzh(bArr, i43, zzguqVar2);
                                                int i62 = zzguqVar2.zza;
                                                if (i62 == 0) {
                                                    unsafe10.putObject(obj3, j2, "");
                                                    i42 = i28;
                                                } else {
                                                    int i63 = zzh + i62;
                                                    if ((i59 & 536870912) != 0 && !zzgzv.zzj(bArr, zzh, i63)) {
                                                        throw zzgwy.zzd();
                                                    }
                                                    i42 = i28;
                                                    unsafe10.putObject(obj3, j2, new String(bArr, zzh, i62, zzgww.zzb));
                                                    zzh = i63;
                                                }
                                                unsafe10.putInt(obj3, j3, i15);
                                                i48 = zzh;
                                                if (i48 != i43) {
                                                }
                                            } else {
                                                i42 = i28;
                                                i48 = i43;
                                                if (i48 != i43) {
                                                }
                                            }
                                            break;
                                        case 60:
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 2) {
                                                Object zzB = zzB(obj3, i27, i28);
                                                i15 = i27;
                                                i48 = zzgur.zzm(zzB, zzx(i28), bArr, i43, i2, zzguqVar);
                                                zzK(obj3, i15, i28, zzB);
                                                i42 = i28;
                                                i51 = i51;
                                                i5 = i2;
                                                if (i48 != i43) {
                                                }
                                            } else {
                                                i15 = i27;
                                                i5 = i2;
                                                i42 = i28;
                                                i48 = i43;
                                                if (i48 != i43) {
                                                }
                                            }
                                            break;
                                        case 61:
                                            i44 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 2) {
                                                i48 = zzgur.zza(bArr, i43, zzguqVar2);
                                                unsafe10.putObject(obj3, j2, zzguqVar2.zzc);
                                                unsafe10.putInt(obj3, j3, i44);
                                                i5 = i2;
                                                i42 = i28;
                                                i15 = i44;
                                                if (i48 != i43) {
                                                }
                                            }
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i44;
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 63:
                                            i44 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 0) {
                                                i48 = zzgur.zzh(bArr, i43, zzguqVar2);
                                                int i64 = zzguqVar2.zza;
                                                zzgwq zzw = zzw(i28);
                                                if (zzw == null || zzw.zza(i64)) {
                                                    unsafe10.putObject(obj3, j2, Integer.valueOf(i64));
                                                    unsafe10.putInt(obj3, j3, i44);
                                                } else {
                                                    zzd(obj).zzj(i51, Long.valueOf(i64));
                                                }
                                                i5 = i2;
                                                i42 = i28;
                                                i15 = i44;
                                                if (i48 != i43) {
                                                }
                                            }
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i44;
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 66:
                                            i44 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 0) {
                                                i48 = zzgur.zzh(bArr, i43, zzguqVar2);
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzgvm.zzF(zzguqVar2.zza)));
                                                unsafe10.putInt(obj3, j3, i44);
                                                i5 = i2;
                                                i42 = i28;
                                                i15 = i44;
                                                if (i48 != i43) {
                                                }
                                            }
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i44;
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 67:
                                            i44 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            if (i58 == 0) {
                                                int zzk2 = zzgur.zzk(bArr, i43, zzguqVar2);
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzgvm.zzG(zzguqVar2.zzb)));
                                                unsafe10.putInt(obj3, j3, i44);
                                                i48 = zzk2;
                                                i5 = i2;
                                                i42 = i28;
                                                i15 = i44;
                                                if (i48 != i43) {
                                                }
                                            }
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i44;
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                        case 68:
                                            if (i58 == 3) {
                                                Object zzB2 = zzB(obj3, i27, i28);
                                                zzguq zzguqVar4 = zzguqVar3;
                                                int zzl = zzgur.zzl(zzB2, zzx(i28), bArr, i26, i2, (i51 & (-8)) | 4, zzguqVar);
                                                zzK(obj3, i27, i28, zzB2);
                                                i5 = i2;
                                                i43 = i26;
                                                i42 = i28;
                                                i15 = i27;
                                                i48 = zzl;
                                                zzguqVar2 = zzguqVar4;
                                                if (i48 != i43) {
                                                }
                                            }
                                            break;
                                        default:
                                            i5 = i2;
                                            i42 = i28;
                                            i15 = i27;
                                            zzguqVar2 = zzguqVar3;
                                            i43 = i26;
                                            i48 = i43;
                                            if (i48 != i43) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i58 == 2) {
                                        Unsafe unsafe11 = zzb;
                                        Object zzz = zzgxzVar2.zzz(i28);
                                        Object object = unsafe11.getObject(obj, j2);
                                        if (zzgxr.zza(object)) {
                                            zzgxq zzb2 = zzgxq.zza().zzb();
                                            zzgxr.zzb(zzb2, object);
                                            unsafe11.putObject(obj, j2, zzb2);
                                        }
                                        throw null;
                                    }
                                    i51 = i61;
                                    obj3 = obj;
                                    i4 = i3;
                                    i14 = i28;
                                    i5 = i2;
                                    i10 = i26;
                                    i15 = i27;
                                    zzguqVar2 = zzguqVar3;
                                }
                            } else {
                                long j4 = i59;
                                Unsafe unsafe12 = zzb;
                                zzgwv zzgwvVar = (zzgwv) unsafe12.getObject(obj3, j2);
                                if (zzgwvVar.zzc()) {
                                    j = j4;
                                } else {
                                    int size = zzgwvVar.size();
                                    j = j4;
                                    zzgwvVar = zzgwvVar.zzd(size != 0 ? size + size : 10);
                                    unsafe12.putObject(obj3, j2, zzgwvVar);
                                }
                                zzgwv zzgwvVar2 = zzgwvVar;
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        i29 = i61;
                                        i30 = i54;
                                        i31 = i57;
                                        unsafe5 = unsafe2;
                                        i32 = i60;
                                        i33 = i2;
                                        if (i58 == 2) {
                                            zzgvv zzgvvVar = (zzgvv) zzgwvVar2;
                                            i48 = zzgur.zzh(bArr, i30, zzguqVar3);
                                            int i65 = zzguqVar3.zza + i48;
                                            while (i48 < i65) {
                                                zzgvvVar.zze(Double.longBitsToDouble(zzgur.zzn(bArr, i48)));
                                                i48 += 8;
                                            }
                                            if (i48 != i65) {
                                                throw zzgwy.zzj();
                                            }
                                            if (i48 != i30) {
                                                i10 = i48;
                                                i51 = i29;
                                                i15 = i32;
                                                i14 = i31;
                                                zzguqVar2 = zzguqVar3;
                                                unsafe2 = unsafe5;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                                break;
                                            } else {
                                                i46 = i3;
                                                i51 = i29;
                                                i49 = i32;
                                                i50 = i31;
                                                unsafe8 = unsafe5;
                                                i47 = -1;
                                                i52 = i11;
                                                i53 = i12;
                                                obj3 = obj;
                                                i45 = i33;
                                            }
                                        } else {
                                            if (i58 == 1) {
                                                i34 = i30 + 8;
                                                zzgvv zzgvvVar2 = (zzgvv) zzgwvVar2;
                                                zzgvvVar2.zze(Double.longBitsToDouble(zzgur.zzn(bArr, i30)));
                                                while (i34 < i33) {
                                                    int zzh2 = zzgur.zzh(bArr, i34, zzguqVar3);
                                                    if (i29 == zzguqVar3.zza) {
                                                        zzgvvVar2.zze(Double.longBitsToDouble(zzgur.zzn(bArr, zzh2)));
                                                        i34 = zzh2 + 8;
                                                    } else {
                                                        i48 = i34;
                                                        if (i48 != i30) {
                                                        }
                                                    }
                                                }
                                                i48 = i34;
                                                if (i48 != i30) {
                                                }
                                            }
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i29 = i61;
                                        i30 = i54;
                                        i31 = i57;
                                        unsafe5 = unsafe2;
                                        i32 = i60;
                                        i33 = i2;
                                        if (i58 == 2) {
                                            zzgwf zzgwfVar = (zzgwf) zzgwvVar2;
                                            i48 = zzgur.zzh(bArr, i30, zzguqVar3);
                                            int i66 = zzguqVar3.zza + i48;
                                            while (i48 < i66) {
                                                zzgwfVar.zze(Float.intBitsToFloat(zzgur.zzb(bArr, i48)));
                                                i48 += 4;
                                            }
                                            if (i48 != i66) {
                                                throw zzgwy.zzj();
                                            }
                                            if (i48 != i30) {
                                            }
                                        } else {
                                            if (i58 == 5) {
                                                i34 = i30 + 4;
                                                zzgwf zzgwfVar2 = (zzgwf) zzgwvVar2;
                                                zzgwfVar2.zze(Float.intBitsToFloat(zzgur.zzb(bArr, i30)));
                                                while (i34 < i33) {
                                                    int zzh3 = zzgur.zzh(bArr, i34, zzguqVar3);
                                                    if (i29 == zzguqVar3.zza) {
                                                        zzgwfVar2.zze(Float.intBitsToFloat(zzgur.zzb(bArr, zzh3)));
                                                        i34 = zzh3 + 4;
                                                    } else {
                                                        i48 = i34;
                                                        if (i48 != i30) {
                                                        }
                                                    }
                                                }
                                                i48 = i34;
                                                if (i48 != i30) {
                                                }
                                            }
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i29 = i61;
                                        i30 = i54;
                                        i31 = i57;
                                        unsafe5 = unsafe2;
                                        i32 = i60;
                                        i33 = i2;
                                        if (i58 == 2) {
                                            zzgxl zzgxlVar = (zzgxl) zzgwvVar2;
                                            i48 = zzgur.zzh(bArr, i30, zzguqVar3);
                                            int i67 = zzguqVar3.zza + i48;
                                            while (i48 < i67) {
                                                i48 = zzgur.zzk(bArr, i48, zzguqVar3);
                                                zzgxlVar.zzg(zzguqVar3.zzb);
                                            }
                                            if (i48 != i67) {
                                                throw zzgwy.zzj();
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                zzgxl zzgxlVar2 = (zzgxl) zzgwvVar2;
                                                i48 = zzgur.zzk(bArr, i30, zzguqVar3);
                                                zzgxlVar2.zzg(zzguqVar3.zzb);
                                                while (i48 < i33) {
                                                    int zzh4 = zzgur.zzh(bArr, i48, zzguqVar3);
                                                    if (i29 == zzguqVar3.zza) {
                                                        i48 = zzgur.zzk(bArr, zzh4, zzguqVar3);
                                                        zzgxlVar2.zzg(zzguqVar3.zzb);
                                                    }
                                                }
                                            }
                                            i48 = i30;
                                        }
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i29 = i61;
                                        i35 = i54;
                                        i36 = i2;
                                        i37 = i57;
                                        unsafe6 = unsafe2;
                                        i38 = i60;
                                        if (i58 == 2) {
                                            zzf = zzgur.zzf(bArr, i35, zzgwvVar2, zzguqVar3);
                                            i30 = i35;
                                            i48 = zzf;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            if (i48 != i30) {
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                i30 = i35;
                                                i32 = i38;
                                                i33 = i36;
                                                i31 = i37;
                                                unsafe5 = unsafe6;
                                                i48 = zzgur.zzj(i29, bArr, i30, i2, zzgwvVar2, zzguqVar);
                                                if (i48 != i30) {
                                                }
                                            }
                                            i30 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i29 = i61;
                                        i35 = i54;
                                        i36 = i2;
                                        i37 = i57;
                                        unsafe6 = unsafe2;
                                        i38 = i60;
                                        if (i58 == 2) {
                                            zzgxl zzgxlVar3 = (zzgxl) zzgwvVar2;
                                            zzf = zzgur.zzh(bArr, i35, zzguqVar3);
                                            int i68 = zzguqVar3.zza + zzf;
                                            while (zzf < i68) {
                                                zzgxlVar3.zzg(zzgur.zzn(bArr, zzf));
                                                zzf += 8;
                                            }
                                            if (zzf != i68) {
                                                throw zzgwy.zzj();
                                            }
                                        } else {
                                            if (i58 == 1) {
                                                zzf = i35 + 8;
                                                zzgxl zzgxlVar4 = (zzgxl) zzgwvVar2;
                                                zzgxlVar4.zzg(zzgur.zzn(bArr, i35));
                                                while (zzf < i36) {
                                                    int zzh5 = zzgur.zzh(bArr, zzf, zzguqVar3);
                                                    if (i29 == zzguqVar3.zza) {
                                                        zzgxlVar4.zzg(zzgur.zzn(bArr, zzh5));
                                                        zzf = zzh5 + 8;
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                        i30 = i35;
                                        i48 = zzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe5 = unsafe6;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i29 = i61;
                                        i35 = i54;
                                        i36 = i2;
                                        i37 = i57;
                                        unsafe6 = unsafe2;
                                        i38 = i60;
                                        if (i58 == 2) {
                                            zzgwn zzgwnVar = (zzgwn) zzgwvVar2;
                                            zzf = zzgur.zzh(bArr, i35, zzguqVar3);
                                            int i69 = zzguqVar3.zza + zzf;
                                            while (zzf < i69) {
                                                zzgwnVar.zzh(zzgur.zzb(bArr, zzf));
                                                zzf += 4;
                                            }
                                            if (zzf != i69) {
                                                throw zzgwy.zzj();
                                            }
                                        } else {
                                            if (i58 == 5) {
                                                zzf = i35 + 4;
                                                zzgwn zzgwnVar2 = (zzgwn) zzgwvVar2;
                                                zzgwnVar2.zzh(zzgur.zzb(bArr, i35));
                                                while (zzf < i36) {
                                                    int zzh6 = zzgur.zzh(bArr, zzf, zzguqVar3);
                                                    if (i29 == zzguqVar3.zza) {
                                                        zzgwnVar2.zzh(zzgur.zzb(bArr, zzh6));
                                                        zzf = zzh6 + 4;
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                        i30 = i35;
                                        i48 = zzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe5 = unsafe6;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i29 = i61;
                                        i35 = i54;
                                        i36 = i2;
                                        i37 = i57;
                                        unsafe6 = unsafe2;
                                        i38 = i60;
                                        if (i58 == 2) {
                                            zzgus zzgusVar = (zzgus) zzgwvVar2;
                                            zzf = zzgur.zzh(bArr, i35, zzguqVar3);
                                            int i70 = zzguqVar3.zza + zzf;
                                            while (zzf < i70) {
                                                zzf = zzgur.zzk(bArr, zzf, zzguqVar3);
                                                zzgusVar.zze(zzguqVar3.zzb != 0);
                                            }
                                            if (zzf != i70) {
                                                throw zzgwy.zzj();
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                zzgus zzgusVar2 = (zzgus) zzgwvVar2;
                                                zzf = zzgur.zzk(bArr, i35, zzguqVar3);
                                                zzgusVar2.zze(zzguqVar3.zzb != 0);
                                                while (zzf < i36) {
                                                    int zzh7 = zzgur.zzh(bArr, zzf, zzguqVar3);
                                                    if (i29 == zzguqVar3.zza) {
                                                        zzf = zzgur.zzk(bArr, zzh7, zzguqVar3);
                                                        zzgusVar2.zze(zzguqVar3.zzb != 0);
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                        i30 = i35;
                                        i48 = zzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe5 = unsafe6;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 26:
                                        i29 = i61;
                                        i35 = i54;
                                        i36 = i2;
                                        i37 = i57;
                                        unsafe6 = unsafe2;
                                        i38 = i60;
                                        if (i58 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zzf = zzgur.zzh(bArr, i35, zzguqVar3);
                                                int i71 = zzguqVar3.zza;
                                                if (i71 < 0) {
                                                    throw zzgwy.zzf();
                                                }
                                                if (i71 == 0) {
                                                    obj2 = "";
                                                    zzgwvVar2.add(obj2);
                                                } else {
                                                    obj2 = "";
                                                    zzgwvVar2.add(new String(bArr, zzf, i71, zzgww.zzb));
                                                    zzf += i71;
                                                }
                                                while (zzf < i36) {
                                                    int zzh8 = zzgur.zzh(bArr, zzf, zzguqVar3);
                                                    if (i29 == zzguqVar3.zza) {
                                                        zzf = zzgur.zzh(bArr, zzh8, zzguqVar3);
                                                        int i72 = zzguqVar3.zza;
                                                        if (i72 < 0) {
                                                            throw zzgwy.zzf();
                                                        }
                                                        if (i72 == 0) {
                                                            zzgwvVar2.add(obj2);
                                                        } else {
                                                            zzgwvVar2.add(new String(bArr, zzf, i72, zzgww.zzb));
                                                            zzf += i72;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzf = zzgur.zzh(bArr, i35, zzguqVar3);
                                                int i73 = zzguqVar3.zza;
                                                if (i73 < 0) {
                                                    throw zzgwy.zzf();
                                                }
                                                if (i73 == 0) {
                                                    zzgwvVar2.add("");
                                                } else {
                                                    int i74 = zzf + i73;
                                                    if (!zzgzv.zzj(bArr, zzf, i74)) {
                                                        throw zzgwy.zzd();
                                                    }
                                                    zzgwvVar2.add(new String(bArr, zzf, i73, zzgww.zzb));
                                                    zzf = i74;
                                                }
                                                while (zzf < i36) {
                                                    int zzh9 = zzgur.zzh(bArr, zzf, zzguqVar3);
                                                    if (i29 == zzguqVar3.zza) {
                                                        zzf = zzgur.zzh(bArr, zzh9, zzguqVar3);
                                                        int i75 = zzguqVar3.zza;
                                                        if (i75 < 0) {
                                                            throw zzgwy.zzf();
                                                        }
                                                        if (i75 == 0) {
                                                            zzgwvVar2.add("");
                                                        } else {
                                                            int i76 = zzf + i75;
                                                            if (!zzgzv.zzj(bArr, zzf, i76)) {
                                                                throw zzgwy.zzd();
                                                            }
                                                            zzgwvVar2.add(new String(bArr, zzf, i75, zzgww.zzb));
                                                            zzf = i76;
                                                        }
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i48 = zzf;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            if (i48 != i30) {
                                            }
                                        }
                                        i30 = i35;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe5 = unsafe6;
                                        i48 = i30;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 27:
                                        i39 = i61;
                                        i30 = i54;
                                        i40 = i2;
                                        unsafe7 = unsafe2;
                                        if (i58 == 2) {
                                            i29 = i39;
                                            int zze = zzgur.zze(zzgxzVar2.zzx(i57), i39, bArr, i30, i2, zzgwvVar2, zzguqVar);
                                            zzguqVar3 = zzguqVar3;
                                            i33 = i40;
                                            i31 = i57;
                                            unsafe5 = unsafe7;
                                            i48 = zze;
                                            i32 = i60;
                                            if (i48 != i30) {
                                            }
                                        }
                                        i29 = i39;
                                        unsafe5 = unsafe7;
                                        i32 = i60;
                                        int i77 = i40;
                                        i31 = i57;
                                        i33 = i77;
                                        i48 = i30;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 28:
                                        i39 = i61;
                                        i30 = i54;
                                        i40 = i2;
                                        unsafe7 = unsafe2;
                                        if (i58 == 2) {
                                            i48 = zzgur.zzh(bArr, i30, zzguqVar3);
                                            int i78 = zzguqVar3.zza;
                                            if (i78 < 0) {
                                                throw zzgwy.zzf();
                                            }
                                            if (i78 > bArr.length - i48) {
                                                throw zzgwy.zzj();
                                            }
                                            if (i78 == 0) {
                                                zzgwvVar2.add(zzgve.zzb);
                                            } else {
                                                zzgwvVar2.add(zzgve.zzv(bArr, i48, i78));
                                                i48 += i78;
                                            }
                                            while (i48 < i40) {
                                                int zzh10 = zzgur.zzh(bArr, i48, zzguqVar3);
                                                if (i39 == zzguqVar3.zza) {
                                                    i48 = zzgur.zzh(bArr, zzh10, zzguqVar3);
                                                    int i79 = zzguqVar3.zza;
                                                    if (i79 < 0) {
                                                        throw zzgwy.zzf();
                                                    }
                                                    if (i79 > bArr.length - i48) {
                                                        throw zzgwy.zzj();
                                                    }
                                                    if (i79 == 0) {
                                                        zzgwvVar2.add(zzgve.zzb);
                                                    } else {
                                                        zzgwvVar2.add(zzgve.zzv(bArr, i48, i79));
                                                        i48 += i79;
                                                    }
                                                } else {
                                                    i29 = i39;
                                                    unsafe5 = unsafe7;
                                                    i32 = i60;
                                                    int i80 = i40;
                                                    i31 = i57;
                                                    i33 = i80;
                                                    if (i48 != i30) {
                                                    }
                                                }
                                            }
                                            i29 = i39;
                                            unsafe5 = unsafe7;
                                            i32 = i60;
                                            int i802 = i40;
                                            i31 = i57;
                                            i33 = i802;
                                            if (i48 != i30) {
                                            }
                                        }
                                        i29 = i39;
                                        unsafe5 = unsafe7;
                                        i32 = i60;
                                        int i772 = i40;
                                        i31 = i57;
                                        i33 = i772;
                                        i48 = i30;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i58 == 2) {
                                            zzj = zzgur.zzf(bArr, i54, zzgwvVar2, zzguqVar3);
                                            i41 = i61;
                                            i30 = i54;
                                            i40 = i2;
                                            unsafe7 = unsafe2;
                                        } else {
                                            if (i58 == 0) {
                                                i41 = i61;
                                                i30 = i54;
                                                i40 = i2;
                                                unsafe7 = unsafe2;
                                                zzj = zzgur.zzj(i61, bArr, i54, i2, zzgwvVar2, zzguqVar);
                                            }
                                            i29 = i61;
                                            i30 = i54;
                                            i31 = i57;
                                            unsafe5 = unsafe2;
                                            i32 = i60;
                                            i33 = i2;
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                        int i81 = zzj;
                                        zzgyr.zzo(obj, i60, zzgwvVar2, zzgxzVar2.zzw(i57), null, zzgxzVar2.zzn);
                                        i29 = i41;
                                        i48 = i81;
                                        unsafe5 = unsafe7;
                                        i32 = i60;
                                        int i8022 = i40;
                                        i31 = i57;
                                        i33 = i8022;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (i58 == 2) {
                                            zzgwn zzgwnVar3 = (zzgwn) zzgwvVar2;
                                            i48 = zzgur.zzh(bArr, i54, zzguqVar3);
                                            int i82 = zzguqVar3.zza + i48;
                                            while (i48 < i82) {
                                                i48 = zzgur.zzh(bArr, i48, zzguqVar3);
                                                zzgwnVar3.zzh(zzgvm.zzF(zzguqVar3.zza));
                                            }
                                            if (i48 != i82) {
                                                throw zzgwy.zzj();
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                zzgwn zzgwnVar4 = (zzgwn) zzgwvVar2;
                                                i48 = zzgur.zzh(bArr, i54, zzguqVar3);
                                                zzgwnVar4.zzh(zzgvm.zzF(zzguqVar3.zza));
                                                while (i48 < i2) {
                                                    int zzh11 = zzgur.zzh(bArr, i48, zzguqVar3);
                                                    if (i61 == zzguqVar3.zza) {
                                                        i48 = zzgur.zzh(bArr, zzh11, zzguqVar3);
                                                        zzgwnVar4.zzh(zzgvm.zzF(zzguqVar3.zza));
                                                    }
                                                }
                                            }
                                            i29 = i61;
                                            i30 = i54;
                                            i31 = i57;
                                            unsafe5 = unsafe2;
                                            i32 = i60;
                                            i33 = i2;
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                        i29 = i61;
                                        i30 = i54;
                                        i31 = i57;
                                        unsafe5 = unsafe2;
                                        i32 = i60;
                                        i33 = i2;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i58 == 2) {
                                            zzgxl zzgxlVar5 = (zzgxl) zzgwvVar2;
                                            i48 = zzgur.zzh(bArr, i54, zzguqVar3);
                                            int i83 = zzguqVar3.zza + i48;
                                            while (i48 < i83) {
                                                i48 = zzgur.zzk(bArr, i48, zzguqVar3);
                                                zzgxlVar5.zzg(zzgvm.zzG(zzguqVar3.zzb));
                                            }
                                            if (i48 != i83) {
                                                throw zzgwy.zzj();
                                            }
                                        } else {
                                            if (i58 == 0) {
                                                zzgxl zzgxlVar6 = (zzgxl) zzgwvVar2;
                                                i48 = zzgur.zzk(bArr, i54, zzguqVar3);
                                                zzgxlVar6.zzg(zzgvm.zzG(zzguqVar3.zzb));
                                                while (i48 < i2) {
                                                    int zzh12 = zzgur.zzh(bArr, i48, zzguqVar3);
                                                    if (i61 == zzguqVar3.zza) {
                                                        i48 = zzgur.zzk(bArr, zzh12, zzguqVar3);
                                                        zzgxlVar6.zzg(zzgvm.zzG(zzguqVar3.zzb));
                                                    }
                                                }
                                            }
                                            i29 = i61;
                                            i30 = i54;
                                            i31 = i57;
                                            unsafe5 = unsafe2;
                                            i32 = i60;
                                            i33 = i2;
                                            i48 = i30;
                                            if (i48 != i30) {
                                            }
                                        }
                                        i29 = i61;
                                        i30 = i54;
                                        i31 = i57;
                                        unsafe5 = unsafe2;
                                        i32 = i60;
                                        i33 = i2;
                                        if (i48 != i30) {
                                        }
                                        break;
                                    default:
                                        i29 = i61;
                                        i30 = i54;
                                        i31 = i57;
                                        unsafe5 = unsafe2;
                                        i32 = i60;
                                        i33 = i2;
                                        if (i58 == 3) {
                                            int i84 = (i29 & (-8)) | 4;
                                            zzgyp zzx = zzgxzVar2.zzx(i31);
                                            i48 = zzgur.zzc(zzx, bArr, i30, i2, i84, zzguqVar);
                                            zzgwvVar2.add(zzguqVar3.zzc);
                                            while (i48 < i33) {
                                                int zzh13 = zzgur.zzh(bArr, i48, zzguqVar3);
                                                if (i29 == zzguqVar3.zza) {
                                                    i48 = zzgur.zzc(zzx, bArr, zzh13, i2, i84, zzguqVar);
                                                    zzgwvVar2.add(zzguqVar3.zzc);
                                                } else if (i48 != i30) {
                                                }
                                            }
                                            if (i48 != i30) {
                                            }
                                        }
                                        i48 = i30;
                                        if (i48 != i30) {
                                        }
                                        break;
                                }
                            }
                        } else if (i58 == 2) {
                            zzgwv zzgwvVar3 = (zzgwv) unsafe9.getObject(obj3, j2);
                            if (!zzgwvVar3.zzc()) {
                                int size2 = zzgwvVar3.size();
                                zzgwvVar3 = zzgwvVar3.zzd(size2 != 0 ? size2 + size2 : 10);
                                unsafe9.putObject(obj3, j2, zzgwvVar3);
                            }
                            i49 = i60;
                            int zze2 = zzgur.zze(zzgxzVar2.zzx(i57), i61, bArr, i54, i2, zzgwvVar3, zzguqVar);
                            i46 = i3;
                            zzguqVar3 = zzguqVar3;
                            i45 = i2;
                            unsafe8 = unsafe9;
                            i47 = -1;
                            i52 = i11;
                            i53 = i12;
                            i51 = i61;
                            i50 = i57;
                            i48 = zze2;
                        } else {
                            i26 = i54;
                            i27 = i60;
                            i51 = i61;
                            unsafe2 = unsafe9;
                            i28 = i57;
                            i4 = i3;
                            i14 = i28;
                            i5 = i2;
                            i10 = i26;
                            i15 = i27;
                            zzguqVar2 = zzguqVar3;
                        }
                    } else {
                        int i85 = iArr[i57 + 2];
                        int i86 = 1 << (i85 >>> 20);
                        int i87 = 1048575;
                        int i88 = i85 & 1048575;
                        if (i88 != i53) {
                            if (i53 != 1048575) {
                                unsafe8.putInt(obj3, i53, i52);
                                i87 = 1048575;
                            }
                            i52 = i88 == i87 ? 0 : unsafe8.getInt(obj3, i88);
                            i12 = i88;
                        } else {
                            i12 = i53;
                        }
                        switch (zzt) {
                            case 0:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 1) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i89 = i54;
                                    i51 = i24;
                                    i10 = i89;
                                    break;
                                } else {
                                    i48 = i54 + 8;
                                    i52 |= i86;
                                    zzgzq.zzr(obj3, j2, Double.longBitsToDouble(zzgur.zzn(bArr, i54)));
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 1:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 5) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i892 = i54;
                                    i51 = i24;
                                    i10 = i892;
                                    break;
                                } else {
                                    i48 = i54 + 4;
                                    i52 |= i86;
                                    zzgzq.zzs(obj3, j2, Float.intBitsToFloat(zzgur.zzb(bArr, i54)));
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 2:
                            case 3:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 0) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i8922 = i54;
                                    i51 = i24;
                                    i10 = i8922;
                                    break;
                                } else {
                                    i20 = i52 | i86;
                                    zzk = zzgur.zzk(bArr, i54, zzguqVar3);
                                    unsafe8.putLong(obj, j2, zzguqVar3.zzb);
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i52 = i20;
                                    i48 = zzk;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 4:
                            case 11:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 0) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i89222 = i54;
                                    i51 = i24;
                                    i10 = i89222;
                                    break;
                                } else {
                                    i52 |= i86;
                                    i48 = zzgur.zzh(bArr, i54, zzguqVar3);
                                    unsafe8.putInt(obj3, j2, zzguqVar3.zza);
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 5:
                            case 14:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 1) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i892222 = i54;
                                    i51 = i24;
                                    i10 = i892222;
                                    break;
                                } else {
                                    zzk = i54 + 8;
                                    i20 = i52 | i86;
                                    unsafe8.putLong(obj, j2, zzgur.zzn(bArr, i54));
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i52 = i20;
                                    i48 = zzk;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 6:
                            case 13:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 5) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i8922222 = i54;
                                    i51 = i24;
                                    i10 = i8922222;
                                    break;
                                } else {
                                    i48 = i54 + 4;
                                    i52 |= i86;
                                    unsafe8.putInt(obj3, j2, zzgur.zzb(bArr, i54));
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 7:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 0) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i89222222 = i54;
                                    i51 = i24;
                                    i10 = i89222222;
                                    break;
                                } else {
                                    i52 |= i86;
                                    i48 = zzgur.zzk(bArr, i54, zzguqVar3);
                                    zzgzq.zzp(obj3, j2, zzguqVar3.zzb != 0);
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 8:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 2) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i892222222 = i54;
                                    i51 = i24;
                                    i10 = i892222222;
                                    break;
                                } else if (zzM(i59)) {
                                    i48 = zzgur.zzh(bArr, i54, zzguqVar3);
                                    i21 = zzguqVar3.zza;
                                    if (i21 < 0) {
                                        throw zzgwy.zzf();
                                    }
                                    i22 = i52 | i86;
                                    if (i21 == 0) {
                                        zzguqVar3.zzc = "";
                                        i52 = i22;
                                        unsafe8.putObject(obj3, j2, zzguqVar3.zzc);
                                        i45 = i2;
                                        i46 = i3;
                                        i51 = i19;
                                        i49 = i18;
                                        i50 = i17;
                                        i53 = i12;
                                        i47 = -1;
                                    } else {
                                        zzguqVar3.zzc = zzgzv.zzh(bArr, i48, i21);
                                        i48 += i21;
                                        i52 = i22;
                                        unsafe8.putObject(obj3, j2, zzguqVar3.zzc);
                                        i45 = i2;
                                        i46 = i3;
                                        i51 = i19;
                                        i49 = i18;
                                        i50 = i17;
                                        i53 = i12;
                                        i47 = -1;
                                    }
                                } else {
                                    i48 = zzgur.zzh(bArr, i54, zzguqVar3);
                                    i21 = zzguqVar3.zza;
                                    if (i21 < 0) {
                                        throw zzgwy.zzf();
                                    }
                                    i22 = i52 | i86;
                                    if (i21 == 0) {
                                        zzguqVar3.zzc = "";
                                        i52 = i22;
                                        unsafe8.putObject(obj3, j2, zzguqVar3.zzc);
                                        i45 = i2;
                                        i46 = i3;
                                        i51 = i19;
                                        i49 = i18;
                                        i50 = i17;
                                        i53 = i12;
                                        i47 = -1;
                                    } else {
                                        zzguqVar3.zzc = new String(bArr, i48, i21, zzgww.zzb);
                                        i48 += i21;
                                        i52 = i22;
                                        unsafe8.putObject(obj3, j2, zzguqVar3.zzc);
                                        i45 = i2;
                                        i46 = i3;
                                        i51 = i19;
                                        i49 = i18;
                                        i50 = i17;
                                        i53 = i12;
                                        i47 = -1;
                                    }
                                }
                            case 9:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 2) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i8922222222 = i54;
                                    i51 = i24;
                                    i10 = i8922222222;
                                    break;
                                } else {
                                    Object zzA = zzgxzVar2.zzA(obj3, i17);
                                    i48 = zzgur.zzm(zzA, zzgxzVar2.zzx(i17), bArr, i54, i2, zzguqVar);
                                    zzgxzVar2.zzJ(obj3, i17, zzA);
                                    i45 = i2;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i52 |= i86;
                                    i53 = i12;
                                    i47 = -1;
                                    i46 = i3;
                                }
                            case 10:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 2) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i89222222222 = i54;
                                    i51 = i24;
                                    i10 = i89222222222;
                                    break;
                                } else {
                                    i52 |= i86;
                                    i48 = zzgur.zza(bArr, i54, zzguqVar3);
                                    unsafe8.putObject(obj3, j2, zzguqVar3.zzc);
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 12:
                                i17 = i57;
                                i18 = i60;
                                if (i58 != 0) {
                                    i23 = i52;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i24 = i61;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i892222222222 = i54;
                                    i51 = i24;
                                    i10 = i892222222222;
                                    break;
                                } else {
                                    i48 = zzgur.zzh(bArr, i54, zzguqVar3);
                                    int i90 = zzguqVar3.zza;
                                    zzgwq zzw2 = zzgxzVar2.zzw(i17);
                                    if ((i59 & Integer.MIN_VALUE) == 0 || zzw2 == null || zzw2.zza(i90)) {
                                        i19 = i61;
                                        i52 |= i86;
                                        unsafe8.putInt(obj3, j2, i90);
                                    } else {
                                        i19 = i61;
                                        zzd(obj).zzj(i19, Long.valueOf(i90));
                                    }
                                    i45 = i2;
                                    i46 = i3;
                                    i51 = i19;
                                    i49 = i18;
                                    i50 = i17;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 15:
                                i17 = i57;
                                i18 = i60;
                                if (i58 != 0) {
                                    i23 = i52;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i24 = i61;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i8922222222222 = i54;
                                    i51 = i24;
                                    i10 = i8922222222222;
                                    break;
                                } else {
                                    i52 |= i86;
                                    i48 = zzgur.zzh(bArr, i54, zzguqVar3);
                                    unsafe8.putInt(obj3, j2, zzgvm.zzF(zzguqVar3.zza));
                                    i45 = i2;
                                    i46 = i3;
                                    i49 = i18;
                                    i50 = i17;
                                    i51 = i61;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            case 16:
                                if (i58 != 0) {
                                    i25 = i57;
                                    i23 = i52;
                                    unsafe4 = unsafe8;
                                    i24 = i61;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i89222222222222 = i54;
                                    i51 = i24;
                                    i10 = i89222222222222;
                                    break;
                                } else {
                                    int i91 = i52 | i86;
                                    int zzk3 = zzgur.zzk(bArr, i54, zzguqVar3);
                                    i18 = i60;
                                    i17 = i57;
                                    unsafe8.putLong(obj, j2, zzgvm.zzG(zzguqVar3.zzb));
                                    i48 = zzk3;
                                    i45 = i2;
                                    i46 = i3;
                                    i52 = i91;
                                    i49 = i18;
                                    i50 = i17;
                                    i51 = i61;
                                    i53 = i12;
                                    i47 = -1;
                                }
                            default:
                                i17 = i57;
                                i18 = i60;
                                i19 = i61;
                                if (i58 != 3) {
                                    i23 = i52;
                                    i24 = i19;
                                    i60 = i18;
                                    i25 = i17;
                                    unsafe4 = unsafe8;
                                    i13 = -1;
                                    i4 = i3;
                                    i11 = i23;
                                    i14 = i25;
                                    i5 = i2;
                                    zzguqVar2 = zzguqVar3;
                                    i15 = i60;
                                    unsafe2 = unsafe4;
                                    int i892222222222222 = i54;
                                    i51 = i24;
                                    i10 = i892222222222222;
                                    break;
                                } else {
                                    int i92 = i52 | i86;
                                    Object zzA2 = zzgxzVar2.zzA(obj3, i17);
                                    int zzl2 = zzgur.zzl(zzA2, zzgxzVar2.zzx(i17), bArr, i54, i2, (i18 << 3) | 4, zzguqVar);
                                    zzgxzVar2.zzJ(obj3, i17, zzA2);
                                    i46 = i3;
                                    zzguqVar3 = zzguqVar3;
                                    i45 = i2;
                                    unsafe8 = unsafe8;
                                    i48 = zzl2;
                                    i47 = -1;
                                    i53 = i12;
                                    i52 = i92;
                                    i51 = i19;
                                    i50 = i17;
                                    i49 = i18;
                                }
                        }
                    }
                } else {
                    i10 = i54;
                    i11 = i52;
                    i12 = i53;
                    i51 = i9;
                    i13 = i47;
                    unsafe2 = unsafe8;
                    zzguqVar2 = zzguqVar3;
                    i4 = i46;
                    i5 = i45;
                    i14 = 0;
                    i15 = i56;
                }
                if (i51 != i4 || i4 == 0) {
                    if (!this.zzh || (zzgvyVar = zzguqVar2.zzd) == zzgvy.zza) {
                        i16 = i51;
                        unsafe3 = unsafe2;
                        i48 = zzgur.zzg(i16, bArr, i10, i2, zzd(obj), zzguqVar);
                    } else {
                        if (zzgvyVar.zzc(this.zzg, i15) != null) {
                            throw null;
                        }
                        i16 = i51;
                        unsafe3 = unsafe2;
                        i48 = zzgur.zzg(i51, bArr, i10, i2, zzd(obj), zzguqVar);
                    }
                    i50 = i14;
                    i49 = i15;
                    zzgxzVar2 = this;
                    i51 = i16;
                    unsafe8 = unsafe3;
                    i52 = i11;
                    i53 = i12;
                    zzguqVar3 = zzguqVar2;
                    i46 = i4;
                    i45 = i5;
                    i47 = i13;
                } else {
                    i8 = 1048575;
                    zzgxzVar = this;
                    i6 = i10;
                    i7 = i51;
                    i52 = i11;
                    unsafe = unsafe2;
                    i53 = i12;
                }
            } else {
                zzgxzVar = zzgxzVar2;
                i4 = i46;
                i5 = i45;
                unsafe = unsafe8;
                i6 = i48;
                i7 = i51;
                i8 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final Object zze() {
        return ((zzgwm) this.zzg).zzaD();
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgwm) {
                zzgwm zzgwmVar = (zzgwm) obj;
                zzgwmVar.zzaV(Integer.MAX_VALUE);
                zzgwmVar.zza = 0;
                zzgwmVar.zzaT();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i2;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                                this.zzm.zzb(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzgxq) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zze(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzgzq.zzr(obj, j, zzgzq.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzgzq.zzs(obj, j, zzgzq.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzgzq.zzu(obj, j, zzgzq.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzgzq.zzu(obj, j, zzgzq.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzgzq.zzt(obj, j, zzgzq.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzgzq.zzu(obj, j, zzgzq.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzgzq.zzt(obj, j, zzgzq.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzgzq.zzp(obj, j, zzgzq.zzz(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzgzq.zzv(obj, j, zzgzq.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzgzq.zzv(obj, j, zzgzq.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzgzq.zzt(obj, j, zzgzq.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzgzq.zzt(obj, j, zzgzq.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzgzq.zzt(obj, j, zzgzq.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzgzq.zzu(obj, j, zzgzq.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzgzq.zzt(obj, j, zzgzq.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzgzq.zzu(obj, j, zzgzq.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
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
                    this.zzm.zzc(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzgyr.zza;
                    zzgzq.zzv(obj, j, zzgxr.zzb(zzgzq.zzh(obj, j), zzgzq.zzh(obj2, j)));
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
                    if (zzR(obj2, i3, i)) {
                        zzgzq.zzv(obj, j, zzgzq.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzgzq.zzv(obj, j, zzgzq.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzgyr.zzq(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0649 A[LOOP:2: B:38:0x0645->B:40:0x0649, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0611 A[Catch: all -> 0x0606, TryCatch #2 {all -> 0x0606, blocks: (B:17:0x05e5, B:46:0x060c, B:48:0x0611, B:49:0x0616), top: B:16:0x05e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x061c A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzgyh zzgyhVar, zzgvy zzgvyVar) throws IOException {
        Object obj2;
        zzgzg zzgzgVar;
        Object obj3;
        int i;
        zzgzg zzgzgVar2;
        Object obj4;
        zzgvz zzgvzVar;
        zzgvy zzgvyVar2;
        Object obj5;
        Object obj6 = obj;
        zzgvy zzgvyVar3 = zzgvyVar;
        zzgvyVar.getClass();
        zzD(obj);
        zzgzg zzgzgVar3 = this.zzn;
        zzgvz zzgvzVar2 = this.zzo;
        Object obj7 = null;
        zzgwd zzgwdVar = null;
        while (true) {
            try {
                int zzc = zzgyhVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    zzgzgVar = zzgzgVar3;
                    obj3 = obj6;
                    try {
                        int zzu = zzu(zzq);
                        try {
                        } catch (zzgwx unused) {
                            obj2 = obj7;
                            zzgvzVar = zzgvzVar2;
                            zzgvyVar2 = zzgvyVar3;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzr(obj3, zzu & 1048575, zzgyhVar.zza());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 1:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzs(obj3, zzu & 1048575, zzgyhVar.zzb());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 2:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzu(obj3, zzu & 1048575, zzgyhVar.zzl());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 3:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzu(obj3, zzu & 1048575, zzgyhVar.zzo());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 4:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzt(obj3, zzu & 1048575, zzgyhVar.zzg());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 5:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzu(obj3, zzu & 1048575, zzgyhVar.zzk());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 6:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzt(obj3, zzu & 1048575, zzgyhVar.zzf());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 7:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzp(obj3, zzu & 1048575, zzgyhVar.zzN());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 8:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzG(obj3, zzu, zzgyhVar);
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 9:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgxw zzgxwVar = (zzgxw) zzA(obj3, zzq);
                                zzgyhVar.zzu(zzgxwVar, zzx(zzq), zzgvyVar2);
                                zzJ(obj3, zzq, zzgxwVar);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 10:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzv(obj3, zzu & 1048575, zzgyhVar.zzp());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 11:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzt(obj3, zzu & 1048575, zzgyhVar.zzj());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 12:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                int zze = zzgyhVar.zze();
                                zzgwq zzw = zzw(zzq);
                                if (zzw != null && !zzw.zza(zze)) {
                                    obj7 = zzgyr.zzp(obj3, zzc, zze, obj5, zzgzgVar);
                                    obj6 = obj3;
                                    zzgvzVar2 = zzgvzVar;
                                    zzgvyVar3 = zzgvyVar2;
                                    zzgzgVar3 = zzgzgVar;
                                }
                                zzgzq.zzt(obj3, zzu & 1048575, zze);
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                                break;
                            case 13:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzt(obj3, zzu & 1048575, zzgyhVar.zzh());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 14:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzu(obj3, zzu & 1048575, zzgyhVar.zzm());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 15:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzt(obj3, zzu & 1048575, zzgyhVar.zzi());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 16:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgzq.zzu(obj3, zzu & 1048575, zzgyhVar.zzn());
                                zzH(obj3, zzq);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 17:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgxw zzgxwVar2 = (zzgxw) zzA(obj3, zzq);
                                zzgyhVar.zzt(zzgxwVar2, zzx(zzq), zzgvyVar2);
                                zzJ(obj3, zzq, zzgxwVar2);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 18:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzx(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 19:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzB(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 20:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzE(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 21:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzM(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 22:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzD(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 23:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzA(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 24:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzz(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 25:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzv(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 26:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                if (zzM(zzu)) {
                                    ((zzgvn) zzgyhVar).zzK(this.zzm.zza(obj3, zzu & 1048575), true);
                                } else {
                                    ((zzgvn) zzgyhVar).zzK(this.zzm.zza(obj3, zzu & 1048575), false);
                                }
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 27:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzF(this.zzm.zza(obj3, zzu & 1048575), zzx(zzq), zzgvyVar2);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 28:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzw(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 29:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzL(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 30:
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                List zza2 = this.zzm.zza(obj3, zzu & 1048575);
                                zzgyhVar.zzy(zza2);
                                obj7 = zzgyr.zzo(obj, zzc, zza2, zzw(zzq), obj7, zzgzgVar);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 31:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzG(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 32:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzH(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 33:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzI(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 34:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzJ(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 35:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzx(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 36:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzB(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 37:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzE(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 38:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzM(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 39:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzD(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 40:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzA(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 41:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzz(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 42:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzv(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 43:
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                zzgyhVar.zzL(this.zzm.zza(obj3, zzu & 1048575));
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 44:
                                List zza3 = this.zzm.zza(obj3, zzu & 1048575);
                                zzgyhVar.zzy(zza3);
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj7 = zzgyr.zzo(obj, zzc, zza3, zzw(zzq), obj7, zzgzgVar);
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 45:
                                zzgyhVar.zzG(this.zzm.zza(obj3, zzu & 1048575));
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 46:
                                zzgyhVar.zzH(this.zzm.zza(obj3, zzu & 1048575));
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 47:
                                zzgyhVar.zzI(this.zzm.zza(obj3, zzu & 1048575));
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 48:
                                zzgyhVar.zzJ(this.zzm.zza(obj3, zzu & 1048575));
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 49:
                                zzgyhVar.zzC(this.zzm.zza(obj3, zzu & 1048575), zzx(zzq), zzgvyVar3);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 50:
                                Object zzz = zzz(zzq);
                                long zzu2 = zzu(zzq) & 1048575;
                                Object zzh = zzgzq.zzh(obj3, zzu2);
                                if (zzh == null) {
                                    zzh = zzgxq.zza().zzb();
                                    zzgzq.zzv(obj3, zzu2, zzh);
                                } else if (zzgxr.zza(zzh)) {
                                    Object zzb2 = zzgxq.zza().zzb();
                                    zzgxr.zzb(zzb2, zzh);
                                    zzgzq.zzv(obj3, zzu2, zzb2);
                                    zzh = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzgzq.zzv(obj3, zzu & 1048575, Double.valueOf(zzgyhVar.zza()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 52:
                                zzgzq.zzv(obj3, zzu & 1048575, Float.valueOf(zzgyhVar.zzb()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 53:
                                zzgzq.zzv(obj3, zzu & 1048575, Long.valueOf(zzgyhVar.zzl()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 54:
                                zzgzq.zzv(obj3, zzu & 1048575, Long.valueOf(zzgyhVar.zzo()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 55:
                                zzgzq.zzv(obj3, zzu & 1048575, Integer.valueOf(zzgyhVar.zzg()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 56:
                                zzgzq.zzv(obj3, zzu & 1048575, Long.valueOf(zzgyhVar.zzk()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 57:
                                zzgzq.zzv(obj3, zzu & 1048575, Integer.valueOf(zzgyhVar.zzf()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 58:
                                zzgzq.zzv(obj3, zzu & 1048575, Boolean.valueOf(zzgyhVar.zzN()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 59:
                                zzG(obj3, zzu, zzgyhVar);
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 60:
                                zzgxw zzgxwVar3 = (zzgxw) zzB(obj3, zzc, zzq);
                                zzgyhVar.zzu(zzgxwVar3, zzx(zzq), zzgvyVar3);
                                zzK(obj3, zzc, zzq, zzgxwVar3);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 61:
                                zzgzq.zzv(obj3, zzu & 1048575, zzgyhVar.zzp());
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 62:
                                zzgzq.zzv(obj3, zzu & 1048575, Integer.valueOf(zzgyhVar.zzj()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 63:
                                int zze2 = zzgyhVar.zze();
                                zzgwq zzw2 = zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze2)) {
                                    obj7 = zzgyr.zzp(obj3, zzc, zze2, obj7, zzgzgVar);
                                    obj6 = obj3;
                                    zzgzgVar3 = zzgzgVar;
                                }
                                zzgzq.zzv(obj3, zzu & 1048575, Integer.valueOf(zze2));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                                break;
                            case 64:
                                zzgzq.zzv(obj3, zzu & 1048575, Integer.valueOf(zzgyhVar.zzh()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 65:
                                zzgzq.zzv(obj3, zzu & 1048575, Long.valueOf(zzgyhVar.zzm()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 66:
                                zzgzq.zzv(obj3, zzu & 1048575, Integer.valueOf(zzgyhVar.zzi()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 67:
                                zzgzq.zzv(obj3, zzu & 1048575, Long.valueOf(zzgyhVar.zzn()));
                                zzI(obj3, zzc, zzq);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            case 68:
                                zzgxw zzgxwVar4 = (zzgxw) zzB(obj3, zzc, zzq);
                                zzgyhVar.zzt(zzgxwVar4, zzx(zzq), zzgvyVar3);
                                zzK(obj3, zzc, zzq, zzgxwVar4);
                                obj5 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                obj7 = obj5;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                            default:
                                obj2 = obj7;
                                zzgvzVar = zzgvzVar2;
                                zzgvyVar2 = zzgvyVar3;
                                if (obj2 == null) {
                                    try {
                                        obj7 = zzgzgVar.zzc(obj3);
                                    } catch (zzgwx unused2) {
                                        obj7 = obj2;
                                        zzgzgVar.zzq(zzgyhVar);
                                        if (obj7 == null) {
                                        }
                                        if (!zzgzgVar.zzp(obj7, zzgyhVar)) {
                                        }
                                        obj6 = obj3;
                                        zzgvzVar2 = zzgvzVar;
                                        zzgvyVar3 = zzgvyVar2;
                                        zzgzgVar3 = zzgzgVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        obj7 = obj2;
                                        while (i < this.zzl) {
                                        }
                                        if (obj7 != null) {
                                        }
                                        throw th;
                                    }
                                } else {
                                    obj7 = obj2;
                                }
                                try {
                                    try {
                                        if (!zzgzgVar.zzp(obj7, zzgyhVar)) {
                                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                                obj7 = zzy(obj, this.zzj[i2], obj7, zzgzgVar, obj);
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        while (i < this.zzl) {
                                        }
                                        if (obj7 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (zzgwx unused3) {
                                    zzgzgVar.zzq(zzgyhVar);
                                    if (obj7 == null) {
                                        obj7 = zzgzgVar.zzc(obj3);
                                    }
                                    if (!zzgzgVar.zzp(obj7, zzgyhVar)) {
                                        for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                            obj7 = zzy(obj, this.zzj[i3], obj7, zzgzgVar, obj);
                                        }
                                        if (obj7 == null) {
                                        }
                                    }
                                    obj6 = obj3;
                                    zzgvzVar2 = zzgvzVar;
                                    zzgvyVar3 = zzgvyVar2;
                                    zzgzgVar3 = zzgzgVar;
                                }
                                obj6 = obj3;
                                zzgvzVar2 = zzgvzVar;
                                zzgvyVar3 = zzgvyVar2;
                                zzgzgVar3 = zzgzgVar;
                                break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj2 = obj7;
                        obj7 = obj2;
                        while (i < this.zzl) {
                        }
                        if (obj7 != null) {
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        obj7 = zzy(obj, this.zzj[i4], obj7, zzgzgVar3, obj);
                    }
                    zzgzgVar = zzgzgVar3;
                    obj3 = obj6;
                } else {
                    try {
                        Object zzc2 = !this.zzh ? null : zzgvzVar2.zzc(zzgvyVar3, this.zzg, zzc);
                        if (zzc2 != null) {
                            if (zzgwdVar == null) {
                                zzgwdVar = zzgvzVar2.zzb(obj6);
                            }
                            zzgwd zzgwdVar2 = zzgwdVar;
                            zzgzgVar2 = zzgzgVar3;
                            obj4 = obj6;
                            try {
                                obj7 = zzgvzVar2.zzd(obj, zzgyhVar, zzc2, zzgvyVar, zzgwdVar2, obj7, zzgzgVar2);
                                zzgwdVar = zzgwdVar2;
                            } catch (Throwable th4) {
                                th = th4;
                                obj3 = obj4;
                                zzgzgVar = zzgzgVar2;
                                obj2 = obj7;
                                obj7 = obj2;
                                for (i = this.zzk; i < this.zzl; i++) {
                                    obj7 = zzy(obj, this.zzj[i], obj7, zzgzgVar, obj);
                                }
                                if (obj7 != null) {
                                    zzgzgVar.zzn(obj3, obj7);
                                }
                                throw th;
                            }
                        } else {
                            zzgzgVar2 = zzgzgVar3;
                            obj4 = obj6;
                            zzgzgVar2.zzq(zzgyhVar);
                            if (obj7 == null) {
                                obj7 = zzgzgVar2.zzc(obj4);
                            }
                            try {
                                if (!zzgzgVar2.zzp(obj7, zzgyhVar)) {
                                    int i5 = this.zzk;
                                    while (i5 < this.zzl) {
                                        zzgzg zzgzgVar4 = zzgzgVar2;
                                        obj7 = zzy(obj, this.zzj[i5], obj7, zzgzgVar4, obj);
                                        i5++;
                                        obj4 = obj4;
                                        zzgzgVar2 = zzgzgVar4;
                                    }
                                    obj3 = obj4;
                                    zzgzgVar = zzgzgVar2;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                obj3 = obj4;
                                zzgzgVar = zzgzgVar2;
                                while (i < this.zzl) {
                                }
                                if (obj7 != null) {
                                }
                                throw th;
                            }
                        }
                        obj6 = obj4;
                        zzgzgVar3 = zzgzgVar2;
                    } catch (Throwable th6) {
                        th = th6;
                        zzgzgVar = zzgzgVar3;
                        obj3 = obj6;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                obj2 = obj7;
                zzgzgVar = zzgzgVar3;
                obj3 = obj6;
            }
        }
        if (obj7 == null) {
            zzgzgVar.zzn(obj3, obj7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzguq zzguqVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzguqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzs;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzgzq.zzb(obj, j)) == Double.doubleToLongBits(zzgzq.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzgzq.zzc(obj, j)) == Float.floatToIntBits(zzgzq.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzgzq.zzf(obj, j) == zzgzq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzgzq.zzf(obj, j) == zzgzq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzgzq.zzd(obj, j) == zzgzq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzgzq.zzf(obj, j) == zzgzq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzgzq.zzd(obj, j) == zzgzq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzgzq.zzz(obj, j) == zzgzq.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzgyr.zzs(zzgzq.zzh(obj, j), zzgzq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzgyr.zzs(zzgzq.zzh(obj, j), zzgzq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzgyr.zzs(zzgzq.zzh(obj, j), zzgzq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzgzq.zzd(obj, j) == zzgzq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzgzq.zzd(obj, j) == zzgzq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzgzq.zzd(obj, j) == zzgzq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzgzq.zzf(obj, j) == zzgzq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzgzq.zzd(obj, j) == zzgzq.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzgzq.zzf(obj, j) == zzgzq.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzgyr.zzs(zzgzq.zzh(obj, j), zzgzq.zzh(obj2, j))) {
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
                    zzs = zzgyr.zzs(zzgzq.zzh(obj, j), zzgzq.zzh(obj2, j));
                    break;
                case 50:
                    zzs = zzgyr.zzs(zzgzq.zzh(obj, j), zzgzq.zzh(obj2, j));
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
                    long zzr = zzr(i) & 1048575;
                    if (zzgzq.zzd(obj, zzr) == zzgzq.zzd(obj2, zzr) && zzgyr.zzs(zzgzq.zzh(obj, j), zzgzq.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzs) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i4];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = zzb.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                i = i5;
                i2 = i3;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i7, i6) && !zzP(obj, zzu, zzx(i6))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzgxq) zzgzq.zzh(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzgzq.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgyp zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i6, i, i2, i10) && !zzP(obj, zzu, zzx(i6))) {
                return false;
            }
            i4++;
            i5 = i;
            i3 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final void zzm(Object obj, zzgvu zzgvuVar) throws IOException {
        int i;
        int i2;
        int i3;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < iArr.length) {
            int zzu = zzu(i7);
            int[] iArr2 = this.zzc;
            int zzt = zzt(zzu);
            int i8 = iArr2[i7];
            if (zzt <= 17) {
                int i9 = iArr2[i7 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = zzu & i4;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzf(i8, zzgzq.zzb(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzo(i8, zzgzq.zzc(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzt(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzJ(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzr(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzm(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzk(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzb(i8, zzgzq.zzz(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzT(i8, unsafe.getObject(obj, j), zzgvuVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzv(i8, unsafe.getObject(obj, j), zzx(i7));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzd(i8, (zzgve) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzH(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzi(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzw(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzy(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzA(i8, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzC(i8, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgvuVar.zzq(i8, unsafe.getObject(obj, j), zzx(i7));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzgyr.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 19:
                    zzgyr.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 20:
                    zzgyr.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 21:
                    zzgyr.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 22:
                    zzgyr.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 23:
                    zzgyr.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 24:
                    zzgyr.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 25:
                    zzgyr.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 26:
                    int i11 = this.zzc[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = zzgyr.zza;
                    if (list != null && !list.isEmpty()) {
                        zzgvuVar.zzG(i11, list);
                        break;
                    }
                    break;
                case 27:
                    int i13 = this.zzc[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    zzgyp zzx = zzx(i7);
                    int i14 = zzgyr.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            zzgvuVar.zzv(i13, list2.get(i15), zzx);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i16 = this.zzc[i7];
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzgyr.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzgvuVar.zze(i16, list3);
                        break;
                    }
                    break;
                case 29:
                    zzgyr.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 30:
                    zzgyr.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 31:
                    zzgyr.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 32:
                    zzgyr.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 33:
                    zzgyr.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 34:
                    zzgyr.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, false);
                    break;
                case 35:
                    zzgyr.zzu(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 36:
                    zzgyr.zzy(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 37:
                    zzgyr.zzA(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 38:
                    zzgyr.zzG(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 39:
                    zzgyr.zzz(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 40:
                    zzgyr.zzx(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 41:
                    zzgyr.zzw(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 42:
                    zzgyr.zzt(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 43:
                    zzgyr.zzF(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 44:
                    zzgyr.zzv(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 45:
                    zzgyr.zzB(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 46:
                    zzgyr.zzC(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 47:
                    zzgyr.zzD(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 48:
                    zzgyr.zzE(this.zzc[i7], (List) unsafe.getObject(obj, j), zzgvuVar, true);
                    break;
                case 49:
                    int i18 = this.zzc[i7];
                    List list4 = (List) unsafe.getObject(obj, j);
                    zzgyp zzx2 = zzx(i7);
                    int i19 = zzgyr.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            zzgvuVar.zzq(i18, list4.get(i20), zzx2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzf(i8, zzn(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzo(i8, zzo(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzt(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzJ(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzr(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzm(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzk(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzb(i8, zzS(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i8, i7)) {
                        zzT(i8, unsafe.getObject(obj, j), zzgvuVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzv(i8, unsafe.getObject(obj, j), zzx(i7));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzd(i8, (zzgve) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzH(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzi(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzw(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzy(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzA(i8, zzp(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzC(i8, zzv(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i8, i7)) {
                        zzgvuVar.zzq(i8, unsafe.getObject(obj, j), zzx(i7));
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        zzgzg zzgzgVar = this.zzn;
        zzgzgVar.zzr(zzgzgVar.zzd(obj), zzgvuVar);
    }
}
