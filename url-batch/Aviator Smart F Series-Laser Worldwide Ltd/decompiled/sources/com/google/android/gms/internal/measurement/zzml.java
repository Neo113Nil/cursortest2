package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzml<T> implements zzmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zznu.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzmi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzlw zzm;
    private final zznk zzn;
    private final zzko zzo;
    private final zzmn zzp;
    private final zzmd zzq;

    private zzml(int[] iArr, Object[] objArr, int i8, int i9, zzmi zzmiVar, boolean z7, boolean z8, int[] iArr2, int i10, int i11, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i8;
        this.zzf = i9;
        this.zzi = z7;
        boolean z9 = false;
        if (zzkoVar != null && zzkoVar.zzc(zzmiVar)) {
            z9 = true;
        }
        this.zzh = z9;
        this.zzj = iArr2;
        this.zzk = i10;
        this.zzl = i11;
        this.zzp = zzmnVar;
        this.zzm = zzlwVar;
        this.zzn = zznkVar;
        this.zzo = zzkoVar;
        this.zzg = zzmiVar;
        this.zzq = zzmdVar;
    }

    private final zzlf zzA(int i8) {
        int i9 = i8 / 3;
        return (zzlf) this.zzd[i9 + i9 + 1];
    }

    private final zzmt zzB(int i8) {
        int i9 = i8 / 3;
        int i10 = i9 + i9;
        zzmt zzmtVar = (zzmt) this.zzd[i10];
        if (zzmtVar != null) {
            return zzmtVar;
        }
        zzmt zzb2 = zzmq.zza().zzb((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zzb2;
        return zzb2;
    }

    private final Object zzC(int i8) {
        int i9 = i8 / 3;
        return this.zzd[i9 + i9];
    }

    private final Object zzD(Object obj, int i8) {
        zzmt zzB = zzB(i8);
        int zzy = zzy(i8) & 1048575;
        if (!zzP(obj, i8)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzE(Object obj, int i8, int i9) {
        zzmt zzB = zzB(i9);
        if (!zzT(obj, i8, i9)) {
            return zzB.zze();
        }
        Object object = zzb.getObject(obj, zzy(i9) & 1048575);
        if (zzS(object)) {
            return object;
        }
        Object zze = zzB.zze();
        if (object != null) {
            zzB.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzF(Class cls, String str) {
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

    private static void zzG(Object obj) {
        if (!zzS(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzH(Object obj, Object obj2, int i8) {
        if (zzP(obj2, i8)) {
            int zzy = zzy(i8) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = zzy;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i8] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i8);
            if (!zzP(obj, i8)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j8, zze);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzJ(obj, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j8, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzI(Object obj, Object obj2, int i8) {
        int i9 = this.zzc[i8];
        if (zzT(obj2, i9, i8)) {
            int zzy = zzy(i8) & 1048575;
            Unsafe unsafe = zzb;
            long j8 = zzy;
            Object object = unsafe.getObject(obj2, j8);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i8] + " is present but null: " + obj2.toString());
            }
            zzmt zzB = zzB(i8);
            if (!zzT(obj, i9, i8)) {
                if (zzS(object)) {
                    Object zze = zzB.zze();
                    zzB.zzg(zze, object);
                    unsafe.putObject(obj, j8, zze);
                } else {
                    unsafe.putObject(obj, j8, object);
                }
                zzK(obj, i9, i8);
                return;
            }
            Object object2 = unsafe.getObject(obj, j8);
            if (!zzS(object2)) {
                Object zze2 = zzB.zze();
                zzB.zzg(zze2, object2);
                unsafe.putObject(obj, j8, zze2);
                object2 = zze2;
            }
            zzB.zzg(object2, object);
        }
    }

    private final void zzJ(Object obj, int i8) {
        int zzv = zzv(i8);
        long j8 = 1048575 & zzv;
        if (j8 == 1048575) {
            return;
        }
        zznu.zzq(obj, j8, (1 << (zzv >>> 20)) | zznu.zzc(obj, j8));
    }

    private final void zzK(Object obj, int i8, int i9) {
        zznu.zzq(obj, zzv(i9) & 1048575, i8);
    }

    private final void zzL(Object obj, int i8, Object obj2) {
        zzb.putObject(obj, zzy(i8) & 1048575, obj2);
        zzJ(obj, i8);
    }

    private final void zzM(Object obj, int i8, int i9, Object obj2) {
        zzb.putObject(obj, zzy(i9) & 1048575, obj2);
        zzK(obj, i8, i9);
    }

    private final void zzN(zzoc zzocVar, int i8, Object obj, int i9) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzO(Object obj, Object obj2, int i8) {
        return zzP(obj, i8) == zzP(obj2, i8);
    }

    private final boolean zzP(Object obj, int i8) {
        int zzv = zzv(i8);
        long j8 = zzv & 1048575;
        if (j8 != 1048575) {
            return (zznu.zzc(obj, j8) & (1 << (zzv >>> 20))) != 0;
        }
        int zzy = zzy(i8);
        long j9 = zzy & 1048575;
        switch (zzx(zzy)) {
            case 0:
                return Double.doubleToRawLongBits(zznu.zza(obj, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(zznu.zzb(obj, j9)) != 0;
            case 2:
                return zznu.zzd(obj, j9) != 0;
            case 3:
                return zznu.zzd(obj, j9) != 0;
            case 4:
                return zznu.zzc(obj, j9) != 0;
            case 5:
                return zznu.zzd(obj, j9) != 0;
            case 6:
                return zznu.zzc(obj, j9) != 0;
            case 7:
                return zznu.zzw(obj, j9);
            case 8:
                Object zzf = zznu.zzf(obj, j9);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzka) {
                    return !zzka.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zznu.zzf(obj, j9) != null;
            case 10:
                return !zzka.zzb.equals(zznu.zzf(obj, j9));
            case 11:
                return zznu.zzc(obj, j9) != 0;
            case 12:
                return zznu.zzc(obj, j9) != 0;
            case 13:
                return zznu.zzc(obj, j9) != 0;
            case 14:
                return zznu.zzd(obj, j9) != 0;
            case 15:
                return zznu.zzc(obj, j9) != 0;
            case 16:
                return zznu.zzd(obj, j9) != 0;
            case 17:
                return zznu.zzf(obj, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzQ(Object obj, int i8, int i9, int i10, int i11) {
        return i9 == 1048575 ? zzP(obj, i8) : (i10 & i11) != 0;
    }

    private static boolean zzR(Object obj, int i8, zzmt zzmtVar) {
        return zzmtVar.zzk(zznu.zzf(obj, i8 & 1048575));
    }

    private static boolean zzS(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzlb) {
            return ((zzlb) obj).zzbR();
        }
        return true;
    }

    private final boolean zzT(Object obj, int i8, int i9) {
        return zznu.zzc(obj, (long) (zzv(i9) & 1048575)) == i8;
    }

    private static boolean zzU(Object obj, long j8) {
        return ((Boolean) zznu.zzf(obj, j8)).booleanValue();
    }

    private static final void zzV(int i8, Object obj, zzoc zzocVar) {
        if (obj instanceof String) {
            zzocVar.zzF(i8, (String) obj);
        } else {
            zzocVar.zzd(i8, (zzka) obj);
        }
    }

    static zznl zzd(Object obj) {
        zzlb zzlbVar = (zzlb) obj;
        zznl zznlVar = zzlbVar.zzc;
        if (zznlVar != zznl.zzc()) {
            return zznlVar;
        }
        zznl zzf = zznl.zzf();
        zzlbVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzml zzl(Class cls, zzmf zzmfVar, zzmn zzmnVar, zzlw zzlwVar, zznk zznkVar, zzko zzkoVar, zzmd zzmdVar) {
        int i8;
        int charAt;
        int charAt2;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        int i22;
        int i23;
        zzms zzmsVar;
        int i24;
        int objectFieldOffset;
        Class<?> cls2;
        int i25;
        int i26;
        int i27;
        Field zzF;
        char charAt11;
        int i28;
        int i29;
        int i30;
        Object obj;
        Field zzF2;
        Object obj2;
        Field zzF3;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        int i34;
        char charAt15;
        if (!(zzmfVar instanceof zzms)) {
            throw null;
        }
        zzms zzmsVar2 = (zzms) zzmfVar;
        int zzc = zzmsVar2.zzc();
        String zzd = zzmsVar2.zzd();
        int length = zzd.length();
        int i35 = 0;
        int i36 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i8 = i37 + 1;
                if (zzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i8;
            }
        } else {
            i8 = 1;
        }
        int i38 = i8 + 1;
        int charAt16 = zzd.charAt(i8);
        if (charAt16 >= 55296) {
            int i39 = charAt16 & 8191;
            int i40 = 13;
            while (true) {
                i34 = i38 + 1;
                charAt15 = zzd.charAt(i38);
                if (charAt15 < 55296) {
                    break;
                }
                i39 |= (charAt15 & 8191) << i40;
                i40 += 13;
                i38 = i34;
            }
            charAt16 = i39 | (charAt15 << i40);
            i38 = i34;
        }
        if (charAt16 == 0) {
            iArr = zza;
            i9 = 0;
            i10 = 0;
            charAt = 0;
            charAt2 = 0;
            i12 = 0;
            i11 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt17 = zzd.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i20 = i41 + 1;
                    charAt10 = zzd.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i20;
                }
                charAt17 = i42 | (charAt10 << i43);
                i41 = i20;
            }
            int i44 = i41 + 1;
            int charAt18 = zzd.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i19 = i44 + 1;
                    charAt9 = zzd.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i19;
                }
                charAt18 = i45 | (charAt9 << i46);
                i44 = i19;
            }
            int i47 = i44 + 1;
            int charAt19 = zzd.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i18 = i47 + 1;
                    charAt8 = zzd.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i18;
                }
                charAt19 = i48 | (charAt8 << i49);
                i47 = i18;
            }
            int i50 = i47 + 1;
            int charAt20 = zzd.charAt(i47);
            if (charAt20 >= 55296) {
                int i51 = charAt20 & 8191;
                int i52 = 13;
                while (true) {
                    i17 = i50 + 1;
                    charAt7 = zzd.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i17;
                }
                charAt20 = i51 | (charAt7 << i52);
                i50 = i17;
            }
            int i53 = i50 + 1;
            charAt = zzd.charAt(i50);
            if (charAt >= 55296) {
                int i54 = charAt & 8191;
                int i55 = 13;
                while (true) {
                    i16 = i53 + 1;
                    charAt6 = zzd.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i16;
                }
                charAt = i54 | (charAt6 << i55);
                i53 = i16;
            }
            int i56 = i53 + 1;
            charAt2 = zzd.charAt(i53);
            if (charAt2 >= 55296) {
                int i57 = charAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i15 = i56 + 1;
                    charAt5 = zzd.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i15;
                }
                charAt2 = i57 | (charAt5 << i58);
                i56 = i15;
            }
            int i59 = i56 + 1;
            int charAt21 = zzd.charAt(i56);
            if (charAt21 >= 55296) {
                int i60 = charAt21 & 8191;
                int i61 = 13;
                while (true) {
                    i14 = i59 + 1;
                    charAt4 = zzd.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i61;
                    i61 += 13;
                    i59 = i14;
                }
                charAt21 = i60 | (charAt4 << i61);
                i59 = i14;
            }
            int i62 = i59 + 1;
            int charAt22 = zzd.charAt(i59);
            if (charAt22 >= 55296) {
                int i63 = charAt22 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i13 = i64 + 1;
                    charAt3 = zzd.charAt(i64);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i63 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i64 = i13;
                }
                charAt22 = i63 | (charAt3 << i65);
                i62 = i13;
            }
            int i66 = charAt22 + charAt2 + charAt21;
            int i67 = charAt17 + charAt17 + charAt18;
            int[] iArr2 = new int[i66];
            i35 = charAt17;
            iArr = iArr2;
            i9 = charAt19;
            i10 = i67;
            i11 = charAt22;
            i38 = i62;
            i12 = charAt20;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzmsVar2.zze();
        Class<?> cls3 = zzmsVar2.zza().getClass();
        int i68 = i11 + charAt2;
        int i69 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = i11;
        int i71 = i68;
        int i72 = 0;
        int i73 = 0;
        while (true) {
            boolean z7 = zzc == 2;
            if (i38 >= length) {
                return new zzml(iArr3, objArr, i9, i12, zzmsVar2.zza(), z7, false, iArr, i11, i68, zzmnVar, zzlwVar, zznkVar, zzkoVar, zzmdVar);
            }
            int i74 = i38 + 1;
            int charAt23 = zzd.charAt(i38);
            if (charAt23 >= i36) {
                int i75 = charAt23 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i33 = i76 + 1;
                    charAt14 = zzd.charAt(i76);
                    i21 = zzc;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i75 |= (charAt14 & 8191) << i77;
                    i77 += 13;
                    i76 = i33;
                    zzc = i21;
                }
                charAt23 = i75 | (charAt14 << i77);
                i22 = i33;
            } else {
                i21 = zzc;
                i22 = i74;
            }
            int i78 = i22 + 1;
            int charAt24 = zzd.charAt(i22);
            int i79 = length;
            char c8 = 55296;
            if (charAt24 >= 55296) {
                int i80 = charAt24 & 8191;
                int i81 = 13;
                while (true) {
                    i32 = i78 + 1;
                    charAt13 = zzd.charAt(i78);
                    if (charAt13 < c8) {
                        break;
                    }
                    i80 |= (charAt13 & 8191) << i81;
                    i81 += 13;
                    i78 = i32;
                    c8 = 55296;
                }
                charAt24 = i80 | (charAt13 << i81);
                i78 = i32;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i82 = charAt24 & 255;
            int i83 = i12;
            if (i82 >= 51) {
                int i84 = i78 + 1;
                int charAt25 = zzd.charAt(i78);
                if (charAt25 >= 55296) {
                    int i85 = charAt25 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i31 = i86 + 1;
                        charAt12 = zzd.charAt(i86);
                        i23 = i9;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i85 |= (charAt12 & 8191) << i87;
                        i87 += 13;
                        i86 = i31;
                        i9 = i23;
                    }
                    charAt25 = i85 | (charAt12 << i87);
                    i29 = i31;
                } else {
                    i23 = i9;
                    i29 = i84;
                }
                int i88 = i82 - 51;
                int i89 = i29;
                if (i88 == 9 || i88 == 17) {
                    int i90 = i73 / 3;
                    i30 = i10 + 1;
                    objArr[i90 + i90 + 1] = zze[i10];
                } else {
                    if (i88 == 12 && !z7) {
                        int i91 = i73 / 3;
                        i30 = i10 + 1;
                        objArr[i91 + i91 + 1] = zze[i10];
                    }
                    int i92 = charAt25 + charAt25;
                    obj = zze[i92];
                    if (obj instanceof Field) {
                        zzF2 = zzF(cls3, (String) obj);
                        zze[i92] = zzF2;
                    } else {
                        zzF2 = (Field) obj;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzF2);
                    int i93 = i92 + 1;
                    obj2 = zze[i93];
                    if (obj2 instanceof Field) {
                        zzF3 = zzF(cls3, (String) obj2);
                        zze[i93] = zzF3;
                    } else {
                        zzF3 = (Field) obj2;
                    }
                    i27 = (int) unsafe.objectFieldOffset(zzF3);
                    cls2 = cls3;
                    i25 = i89;
                    i26 = 0;
                    zzmsVar = zzmsVar2;
                }
                i10 = i30;
                int i922 = charAt25 + charAt25;
                obj = zze[i922];
                if (obj instanceof Field) {
                }
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzF2);
                int i932 = i922 + 1;
                obj2 = zze[i932];
                if (obj2 instanceof Field) {
                }
                i27 = (int) unsafe.objectFieldOffset(zzF3);
                cls2 = cls3;
                i25 = i89;
                i26 = 0;
                zzmsVar = zzmsVar2;
            } else {
                i23 = i9;
                int i94 = i10 + 1;
                Field zzF4 = zzF(cls3, (String) zze[i10]);
                zzmsVar = zzmsVar2;
                if (i82 == 9 || i82 == 17) {
                    int i95 = i73 / 3;
                    objArr[i95 + i95 + 1] = zzF4.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        int i96 = i73 / 3;
                        i28 = i10 + 2;
                        objArr[i96 + i96 + 1] = zze[i94];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        if (!z7) {
                            int i97 = i73 / 3;
                            i28 = i10 + 2;
                            objArr[i97 + i97 + 1] = zze[i94];
                        }
                    } else if (i82 == 50) {
                        int i98 = i70 + 1;
                        iArr[i70] = i73;
                        int i99 = i73 / 3;
                        int i100 = i10 + 2;
                        int i101 = i99 + i99;
                        objArr[i101] = zze[i94];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i101 + 1] = zze[i100];
                            i70 = i98;
                            i24 = i10 + 3;
                        } else {
                            i70 = i98;
                            i24 = i100;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zzF4);
                        if ((charAt24 & 4096) == 4096 || i82 > 17) {
                            cls2 = cls3;
                            i25 = i78;
                            i26 = 0;
                            i27 = 1048575;
                        } else {
                            int i102 = i78 + 1;
                            int charAt26 = zzd.charAt(i78);
                            if (charAt26 >= 55296) {
                                int i103 = charAt26 & 8191;
                                int i104 = 13;
                                while (true) {
                                    i25 = i102 + 1;
                                    charAt11 = zzd.charAt(i102);
                                    if (charAt11 < 55296) {
                                        break;
                                    }
                                    i103 |= (charAt11 & 8191) << i104;
                                    i104 += 13;
                                    i102 = i25;
                                }
                                charAt26 = i103 | (charAt11 << i104);
                            } else {
                                i25 = i102;
                            }
                            int i105 = i35 + i35 + (charAt26 / 32);
                            Object obj3 = zze[i105];
                            if (obj3 instanceof Field) {
                                zzF = (Field) obj3;
                            } else {
                                zzF = zzF(cls3, (String) obj3);
                                zze[i105] = zzF;
                            }
                            cls2 = cls3;
                            i27 = (int) unsafe.objectFieldOffset(zzF);
                            i26 = charAt26 % 32;
                        }
                        if (i82 >= 18 || i82 > 49) {
                            i10 = i24;
                        } else {
                            iArr[i71] = objectFieldOffset;
                            i10 = i24;
                            i71++;
                        }
                    }
                    i24 = i28;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzF4);
                    if ((charAt24 & 4096) == 4096) {
                    }
                    cls2 = cls3;
                    i25 = i78;
                    i26 = 0;
                    i27 = 1048575;
                    if (i82 >= 18) {
                    }
                    i10 = i24;
                }
                i24 = i94;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzF4);
                if ((charAt24 & 4096) == 4096) {
                }
                cls2 = cls3;
                i25 = i78;
                i26 = 0;
                i27 = 1048575;
                if (i82 >= 18) {
                }
                i10 = i24;
            }
            int i106 = i73 + 1;
            iArr3[i73] = charAt23;
            int i107 = i73 + 2;
            iArr3[i106] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i82 << 20) | objectFieldOffset;
            i73 += 3;
            iArr3[i107] = (i26 << 20) | i27;
            cls3 = cls2;
            length = i79;
            i38 = i25;
            i12 = i83;
            zzc = i21;
            zzmsVar2 = zzmsVar;
            i9 = i23;
            i36 = 55296;
        }
    }

    private static double zzm(Object obj, long j8) {
        return ((Double) zznu.zzf(obj, j8)).doubleValue();
    }

    private static float zzn(Object obj, long j8) {
        return ((Float) zznu.zzf(obj, j8)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzo(Object obj) {
        int i8;
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzt;
        int zzh;
        int zzx7;
        int zzx8;
        int i9;
        int zzx9;
        int zzx10;
        int zzx11;
        int zzx12;
        Unsafe unsafe = zzb;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i11 < this.zzc.length) {
            int zzy2 = zzy(i11);
            int[] iArr = this.zzc;
            int i15 = iArr[i11];
            int zzx13 = zzx(zzy2);
            if (zzx13 <= 17) {
                int i16 = iArr[i11 + 2];
                int i17 = i16 & i10;
                int i18 = i16 >>> 20;
                if (i17 != i13) {
                    i14 = unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i8 = 1 << i18;
            } else {
                i8 = 0;
            }
            long j8 = zzy2 & i10;
            switch (zzx13) {
                case 0:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i15 << 3);
                        zzx4 = zzx + 8;
                        i12 += zzx4;
                        break;
                    }
                case 1:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i15 << 3);
                        zzx4 = zzx2 + 4;
                        i12 += zzx4;
                        break;
                    }
                case 2:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j8));
                        zzx3 = zzki.zzx(i15 << 3);
                        i12 += zzx3 + zzy;
                        break;
                    }
                case 3:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzy(unsafe.getLong(obj, j8));
                        zzx3 = zzki.zzx(i15 << 3);
                        i12 += zzx3 + zzy;
                        break;
                    }
                case 4:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzu(unsafe.getInt(obj, j8));
                        zzx3 = zzki.zzx(i15 << 3);
                        i12 += zzx3 + zzy;
                        break;
                    }
                case 5:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i15 << 3);
                        zzx4 = zzx + 8;
                        i12 += zzx4;
                        break;
                    }
                case 6:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i15 << 3);
                        zzx4 = zzx2 + 4;
                        i12 += zzx4;
                        break;
                    }
                case 7:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzx(i15 << 3) + 1;
                        i12 += zzx4;
                        break;
                    }
                case 8:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j8);
                        if (!(object instanceof zzka)) {
                            zzy = zzki.zzw((String) object);
                            zzx3 = zzki.zzx(i15 << 3);
                            i12 += zzx3 + zzy;
                            break;
                        } else {
                            int i19 = zzki.zzb;
                            int zzd = ((zzka) object).zzd();
                            zzx5 = zzki.zzx(zzd) + zzd;
                            zzx6 = zzki.zzx(i15 << 3);
                            zzx4 = zzx6 + zzx5;
                            i12 += zzx4;
                            break;
                        }
                    }
                case 9:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx4 = zzmv.zzn(i15, unsafe.getObject(obj, j8), zzB(i11));
                        i12 += zzx4;
                        break;
                    }
                case 10:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzka zzkaVar = (zzka) unsafe.getObject(obj, j8);
                        int i20 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        zzx5 = zzki.zzx(zzd2) + zzd2;
                        zzx6 = zzki.zzx(i15 << 3);
                        zzx4 = zzx6 + zzx5;
                        i12 += zzx4;
                        break;
                    }
                case 11:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzx(unsafe.getInt(obj, j8));
                        zzx3 = zzki.zzx(i15 << 3);
                        i12 += zzx3 + zzy;
                        break;
                    }
                case 12:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzy = zzki.zzu(unsafe.getInt(obj, j8));
                        zzx3 = zzki.zzx(i15 << 3);
                        i12 += zzx3 + zzy;
                        break;
                    }
                case 13:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx2 = zzki.zzx(i15 << 3);
                        zzx4 = zzx2 + 4;
                        i12 += zzx4;
                        break;
                    }
                case 14:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx = zzki.zzx(i15 << 3);
                        zzx4 = zzx + 8;
                        i12 += zzx4;
                        break;
                    }
                case 15:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        int i21 = unsafe.getInt(obj, j8);
                        zzx3 = zzki.zzx(i15 << 3);
                        zzy = zzki.zzx((i21 >> 31) ^ (i21 + i21));
                        i12 += zzx3 + zzy;
                        break;
                    }
                case 16:
                    if ((i8 & i14) == 0) {
                        break;
                    } else {
                        long j9 = unsafe.getLong(obj, j8);
                        i12 += zzki.zzx(i15 << 3) + zzki.zzy((j9 >> 63) ^ (j9 + j9));
                        break;
                    }
                case 17:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzx4 = zzki.zzt(i15, (zzmi) unsafe.getObject(obj, j8), zzB(i11));
                        i12 += zzx4;
                        break;
                    }
                case 18:
                    zzx4 = zzmv.zzg(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzx4;
                    break;
                case 19:
                    zzx4 = zzmv.zze(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzx4;
                    break;
                case 20:
                    zzx4 = zzmv.zzl(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzx4;
                    break;
                case 21:
                    zzx4 = zzmv.zzw(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzx4;
                    break;
                case 22:
                    zzx4 = zzmv.zzj(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzx4;
                    break;
                case 23:
                    zzx4 = zzmv.zzg(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzx4;
                    break;
                case 24:
                    zzx4 = zzmv.zze(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzx4;
                    break;
                case 25:
                    zzx4 = zzmv.zza(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzx4;
                    break;
                case 26:
                    zzt = zzmv.zzt(i15, (List) unsafe.getObject(obj, j8));
                    i12 += zzt;
                    break;
                case 27:
                    zzt = zzmv.zzo(i15, (List) unsafe.getObject(obj, j8), zzB(i11));
                    i12 += zzt;
                    break;
                case 28:
                    zzt = zzmv.zzb(i15, (List) unsafe.getObject(obj, j8));
                    i12 += zzt;
                    break;
                case 29:
                    zzt = zzmv.zzu(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzt;
                    break;
                case 30:
                    zzt = zzmv.zzc(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzt;
                    break;
                case 31:
                    zzt = zzmv.zze(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzt;
                    break;
                case 32:
                    zzt = zzmv.zzg(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzt;
                    break;
                case 33:
                    zzt = zzmv.zzp(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzt;
                    break;
                case 34:
                    zzt = zzmv.zzr(i15, (List) unsafe.getObject(obj, j8), false);
                    i12 += zzt;
                    break;
                case 35:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 36:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 37:
                    zzh = zzmv.zzm((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 38:
                    zzh = zzmv.zzx((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 39:
                    zzh = zzmv.zzk((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 40:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 41:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 42:
                    List list = (List) unsafe.getObject(obj, j8);
                    int i22 = zzmv.zza;
                    zzh = list.size();
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 43:
                    zzh = zzmv.zzv((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 44:
                    zzh = zzmv.zzd((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 45:
                    zzh = zzmv.zzf((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 46:
                    zzh = zzmv.zzh((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 47:
                    zzh = zzmv.zzq((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 48:
                    zzh = zzmv.zzs((List) unsafe.getObject(obj, j8));
                    if (zzh > 0) {
                        zzx7 = zzki.zzx(zzh);
                        zzx8 = zzki.zzx(i15 << 3);
                        i9 = zzx8 + zzx7;
                        i12 += i9 + zzh;
                    }
                    break;
                case 49:
                    zzt = zzmv.zzi(i15, (List) unsafe.getObject(obj, j8), zzB(i11));
                    i12 += zzt;
                    break;
                case 50:
                    zzmd.zza(i15, unsafe.getObject(obj, j8), zzC(i11));
                    break;
                case 51:
                    if (zzT(obj, i15, i11)) {
                        zzx9 = zzki.zzx(i15 << 3);
                        zzt = zzx9 + 8;
                        i12 += zzt;
                    }
                    break;
                case 52:
                    if (zzT(obj, i15, i11)) {
                        zzx10 = zzki.zzx(i15 << 3);
                        zzt = zzx10 + 4;
                        i12 += zzt;
                    }
                    break;
                case 53:
                    if (zzT(obj, i15, i11)) {
                        zzh = zzki.zzy(zzz(obj, j8));
                        i9 = zzki.zzx(i15 << 3);
                        i12 += i9 + zzh;
                    }
                    break;
                case 54:
                    if (zzT(obj, i15, i11)) {
                        zzh = zzki.zzy(zzz(obj, j8));
                        i9 = zzki.zzx(i15 << 3);
                        i12 += i9 + zzh;
                    }
                    break;
                case 55:
                    if (zzT(obj, i15, i11)) {
                        zzh = zzki.zzu(zzp(obj, j8));
                        i9 = zzki.zzx(i15 << 3);
                        i12 += i9 + zzh;
                    }
                    break;
                case 56:
                    if (zzT(obj, i15, i11)) {
                        zzx9 = zzki.zzx(i15 << 3);
                        zzt = zzx9 + 8;
                        i12 += zzt;
                    }
                    break;
                case 57:
                    if (zzT(obj, i15, i11)) {
                        zzx10 = zzki.zzx(i15 << 3);
                        zzt = zzx10 + 4;
                        i12 += zzt;
                    }
                    break;
                case 58:
                    if (zzT(obj, i15, i11)) {
                        zzt = zzki.zzx(i15 << 3) + 1;
                        i12 += zzt;
                    }
                    break;
                case 59:
                    if (zzT(obj, i15, i11)) {
                        Object object2 = unsafe.getObject(obj, j8);
                        if (object2 instanceof zzka) {
                            int i23 = zzki.zzb;
                            int zzd3 = ((zzka) object2).zzd();
                            zzx11 = zzki.zzx(zzd3) + zzd3;
                            zzx12 = zzki.zzx(i15 << 3);
                            zzt = zzx12 + zzx11;
                            i12 += zzt;
                        } else {
                            zzh = zzki.zzw((String) object2);
                            i9 = zzki.zzx(i15 << 3);
                            i12 += i9 + zzh;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i15, i11)) {
                        zzt = zzmv.zzn(i15, unsafe.getObject(obj, j8), zzB(i11));
                        i12 += zzt;
                    }
                    break;
                case 61:
                    if (zzT(obj, i15, i11)) {
                        zzka zzkaVar2 = (zzka) unsafe.getObject(obj, j8);
                        int i24 = zzki.zzb;
                        int zzd4 = zzkaVar2.zzd();
                        zzx11 = zzki.zzx(zzd4) + zzd4;
                        zzx12 = zzki.zzx(i15 << 3);
                        zzt = zzx12 + zzx11;
                        i12 += zzt;
                    }
                    break;
                case 62:
                    if (zzT(obj, i15, i11)) {
                        zzh = zzki.zzx(zzp(obj, j8));
                        i9 = zzki.zzx(i15 << 3);
                        i12 += i9 + zzh;
                    }
                    break;
                case 63:
                    if (zzT(obj, i15, i11)) {
                        zzh = zzki.zzu(zzp(obj, j8));
                        i9 = zzki.zzx(i15 << 3);
                        i12 += i9 + zzh;
                    }
                    break;
                case 64:
                    if (zzT(obj, i15, i11)) {
                        zzx10 = zzki.zzx(i15 << 3);
                        zzt = zzx10 + 4;
                        i12 += zzt;
                    }
                    break;
                case 65:
                    if (zzT(obj, i15, i11)) {
                        zzx9 = zzki.zzx(i15 << 3);
                        zzt = zzx9 + 8;
                        i12 += zzt;
                    }
                    break;
                case 66:
                    if (zzT(obj, i15, i11)) {
                        int zzp = zzp(obj, j8);
                        i9 = zzki.zzx(i15 << 3);
                        zzh = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        i12 += i9 + zzh;
                    }
                    break;
                case 67:
                    if (zzT(obj, i15, i11)) {
                        long zzz = zzz(obj, j8);
                        i12 += zzki.zzx(i15 << 3) + zzki.zzy((zzz >> 63) ^ (zzz + zzz));
                    }
                    break;
                case 68:
                    if (zzT(obj, i15, i11)) {
                        zzt = zzki.zzt(i15, (zzmi) unsafe.getObject(obj, j8), zzB(i11));
                        i12 += zzt;
                    }
                    break;
            }
            i11 += 3;
            i10 = 1048575;
        }
        zznk zznkVar = this.zzn;
        int zza2 = i12 + zznkVar.zza(zznkVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private static int zzp(Object obj, long j8) {
        return ((Integer) zznu.zzf(obj, j8)).intValue();
    }

    private final int zzq(Object obj, byte[] bArr, int i8, int i9, int i10, long j8, zzjn zzjnVar) {
        Unsafe unsafe = zzb;
        Object zzC = zzC(i10);
        Object object = unsafe.getObject(obj, j8);
        if (!((zzmc) object).zze()) {
            zzmc zzb2 = zzmc.zza().zzb();
            zzmd.zzb(zzb2, object);
            unsafe.putObject(obj, j8, zzb2);
        }
        throw null;
    }

    private final int zzr(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j8, int i15, zzjn zzjnVar) {
        Unsafe unsafe = zzb;
        long j9 = this.zzc[i15 + 2] & 1048575;
        switch (i14) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj, j8, Double.valueOf(Double.longBitsToDouble(zzjo.zzp(bArr, i8))));
                    int i16 = i8 + 8;
                    unsafe.putInt(obj, j9, i11);
                    return i16;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj, j8, Float.valueOf(Float.intBitsToFloat(zzjo.zzb(bArr, i8))));
                    int i17 = i8 + 4;
                    unsafe.putInt(obj, j9, i11);
                    return i17;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int zzm = zzjo.zzm(bArr, i8, zzjnVar);
                    unsafe.putObject(obj, j8, Long.valueOf(zzjnVar.zzb));
                    unsafe.putInt(obj, j9, i11);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int zzj = zzjo.zzj(bArr, i8, zzjnVar);
                    unsafe.putObject(obj, j8, Integer.valueOf(zzjnVar.zza));
                    unsafe.putInt(obj, j9, i11);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj, j8, Long.valueOf(zzjo.zzp(bArr, i8)));
                    int i18 = i8 + 8;
                    unsafe.putInt(obj, j9, i11);
                    return i18;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj, j8, Integer.valueOf(zzjo.zzb(bArr, i8)));
                    int i19 = i8 + 4;
                    unsafe.putInt(obj, j9, i11);
                    return i19;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int zzm2 = zzjo.zzm(bArr, i8, zzjnVar);
                    unsafe.putObject(obj, j8, Boolean.valueOf(zzjnVar.zzb != 0));
                    unsafe.putInt(obj, j9, i11);
                    return zzm2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int zzj2 = zzjo.zzj(bArr, i8, zzjnVar);
                    int i20 = zzjnVar.zza;
                    if (i20 == 0) {
                        unsafe.putObject(obj, j8, "");
                    } else {
                        if ((i13 & 536870912) != 0 && !zznz.zze(bArr, zzj2, zzj2 + i20)) {
                            throw zzll.zzc();
                        }
                        unsafe.putObject(obj, j8, new String(bArr, zzj2, i20, zzlj.zzb));
                        zzj2 += i20;
                    }
                    unsafe.putInt(obj, j9, i11);
                    return zzj2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    Object zzE = zzE(obj, i11, i15);
                    int zzo = zzjo.zzo(zzE, zzB(i15), bArr, i8, i9, zzjnVar);
                    zzM(obj, i11, i15, zzE);
                    return zzo;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int zza2 = zzjo.zza(bArr, i8, zzjnVar);
                    unsafe.putObject(obj, j8, zzjnVar.zzc);
                    unsafe.putInt(obj, j9, i11);
                    return zza2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int zzj3 = zzjo.zzj(bArr, i8, zzjnVar);
                    int i21 = zzjnVar.zza;
                    zzlf zzA = zzA(i15);
                    if (zzA == null || zzA.zza(i21)) {
                        unsafe.putObject(obj, j8, Integer.valueOf(i21));
                        unsafe.putInt(obj, j9, i11);
                    } else {
                        zzd(obj).zzj(i10, Long.valueOf(i21));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int zzj4 = zzjo.zzj(bArr, i8, zzjnVar);
                    unsafe.putObject(obj, j8, Integer.valueOf(zzke.zzb(zzjnVar.zza)));
                    unsafe.putInt(obj, j9, i11);
                    return zzj4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int zzm3 = zzjo.zzm(bArr, i8, zzjnVar);
                    unsafe.putObject(obj, j8, Long.valueOf(zzke.zzc(zzjnVar.zzb)));
                    unsafe.putInt(obj, j9, i11);
                    return zzm3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object zzE2 = zzE(obj, i11, i15);
                    int zzn = zzjo.zzn(zzE2, zzB(i15), bArr, i8, i9, (i10 & (-8)) | 4, zzjnVar);
                    zzM(obj, i11, i15, zzE2);
                    return zzn;
                }
                break;
        }
        return i8;
    }

    private final int zzs(Object obj, byte[] bArr, int i8, int i9, int i10, int i11, int i12, int i13, long j8, int i14, long j9, zzjn zzjnVar) {
        int i15;
        int i16;
        int i17;
        int zzl;
        int i18 = i8;
        Unsafe unsafe = zzb;
        zzli zzliVar = (zzli) unsafe.getObject(obj, j9);
        if (!zzliVar.zzc()) {
            int size = zzliVar.size();
            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j9, zzliVar);
        }
        switch (i14) {
            case 18:
            case 35:
                if (i12 == 2) {
                    zzkk zzkkVar = (zzkk) zzliVar;
                    int zzj = zzjo.zzj(bArr, i18, zzjnVar);
                    int i19 = zzjnVar.zza + zzj;
                    while (zzj < i19) {
                        zzkkVar.zze(Double.longBitsToDouble(zzjo.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i19) {
                        return zzj;
                    }
                    throw zzll.zzf();
                }
                if (i12 == 1) {
                    zzkk zzkkVar2 = (zzkk) zzliVar;
                    zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i8)));
                    while (true) {
                        int i20 = i18 + 8;
                        if (i20 >= i9) {
                            return i20;
                        }
                        i18 = zzjo.zzj(bArr, i20, zzjnVar);
                        if (i10 != zzjnVar.zza) {
                            return i20;
                        }
                        zzkkVar2.zze(Double.longBitsToDouble(zzjo.zzp(bArr, i18)));
                    }
                }
                break;
            case 19:
            case 36:
                if (i12 == 2) {
                    zzku zzkuVar = (zzku) zzliVar;
                    int zzj2 = zzjo.zzj(bArr, i18, zzjnVar);
                    int i21 = zzjnVar.zza + zzj2;
                    while (zzj2 < i21) {
                        zzkuVar.zze(Float.intBitsToFloat(zzjo.zzb(bArr, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i21) {
                        return zzj2;
                    }
                    throw zzll.zzf();
                }
                if (i12 == 5) {
                    zzku zzkuVar2 = (zzku) zzliVar;
                    zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i8)));
                    while (true) {
                        i15 = i18 + 4;
                        if (i15 < i9) {
                            i18 = zzjo.zzj(bArr, i15, zzjnVar);
                            if (i10 == zzjnVar.zza) {
                                zzkuVar2.zze(Float.intBitsToFloat(zzjo.zzb(bArr, i18)));
                            }
                        }
                    }
                    return i15;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i12 == 2) {
                    zzlx zzlxVar = (zzlx) zzliVar;
                    int zzj3 = zzjo.zzj(bArr, i18, zzjnVar);
                    int i22 = zzjnVar.zza + zzj3;
                    while (zzj3 < i22) {
                        zzj3 = zzjo.zzm(bArr, zzj3, zzjnVar);
                        zzlxVar.zzg(zzjnVar.zzb);
                    }
                    if (zzj3 == i22) {
                        return zzj3;
                    }
                    throw zzll.zzf();
                }
                if (i12 == 0) {
                    zzlx zzlxVar2 = (zzlx) zzliVar;
                    int zzm = zzjo.zzm(bArr, i18, zzjnVar);
                    zzlxVar2.zzg(zzjnVar.zzb);
                    while (zzm < i9) {
                        int zzj4 = zzjo.zzj(bArr, zzm, zzjnVar);
                        if (i10 != zzjnVar.zza) {
                            return zzm;
                        }
                        zzm = zzjo.zzm(bArr, zzj4, zzjnVar);
                        zzlxVar2.zzg(zzjnVar.zzb);
                    }
                    return zzm;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i12 == 2) {
                    return zzjo.zzf(bArr, i18, zzliVar, zzjnVar);
                }
                if (i12 == 0) {
                    return zzjo.zzl(i10, bArr, i8, i9, zzliVar, zzjnVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i12 == 2) {
                    zzlx zzlxVar3 = (zzlx) zzliVar;
                    int zzj5 = zzjo.zzj(bArr, i18, zzjnVar);
                    int i23 = zzjnVar.zza + zzj5;
                    while (zzj5 < i23) {
                        zzlxVar3.zzg(zzjo.zzp(bArr, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i23) {
                        return zzj5;
                    }
                    throw zzll.zzf();
                }
                if (i12 == 1) {
                    zzlx zzlxVar4 = (zzlx) zzliVar;
                    zzlxVar4.zzg(zzjo.zzp(bArr, i8));
                    while (true) {
                        i16 = i18 + 8;
                        if (i16 < i9) {
                            i18 = zzjo.zzj(bArr, i16, zzjnVar);
                            if (i10 == zzjnVar.zza) {
                                zzlxVar4.zzg(zzjo.zzp(bArr, i18));
                            }
                        }
                    }
                    return i16;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i12 == 2) {
                    zzlc zzlcVar = (zzlc) zzliVar;
                    int zzj6 = zzjo.zzj(bArr, i18, zzjnVar);
                    int i24 = zzjnVar.zza + zzj6;
                    while (zzj6 < i24) {
                        zzlcVar.zzh(zzjo.zzb(bArr, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i24) {
                        return zzj6;
                    }
                    throw zzll.zzf();
                }
                if (i12 == 5) {
                    zzlc zzlcVar2 = (zzlc) zzliVar;
                    zzlcVar2.zzh(zzjo.zzb(bArr, i8));
                    while (true) {
                        i17 = i18 + 4;
                        if (i17 < i9) {
                            i18 = zzjo.zzj(bArr, i17, zzjnVar);
                            if (i10 == zzjnVar.zza) {
                                zzlcVar2.zzh(zzjo.zzb(bArr, i18));
                            }
                        }
                    }
                    return i17;
                }
                break;
            case 25:
            case 42:
                if (i12 == 2) {
                    zzjp zzjpVar = (zzjp) zzliVar;
                    int zzj7 = zzjo.zzj(bArr, i18, zzjnVar);
                    int i25 = zzjnVar.zza + zzj7;
                    while (zzj7 < i25) {
                        zzj7 = zzjo.zzm(bArr, zzj7, zzjnVar);
                        zzjpVar.zze(zzjnVar.zzb != 0);
                    }
                    if (zzj7 == i25) {
                        return zzj7;
                    }
                    throw zzll.zzf();
                }
                if (i12 == 0) {
                    zzjp zzjpVar2 = (zzjp) zzliVar;
                    int zzm2 = zzjo.zzm(bArr, i18, zzjnVar);
                    zzjpVar2.zze(zzjnVar.zzb != 0);
                    while (zzm2 < i9) {
                        int zzj8 = zzjo.zzj(bArr, zzm2, zzjnVar);
                        if (i10 != zzjnVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzjo.zzm(bArr, zzj8, zzjnVar);
                        zzjpVar2.zze(zzjnVar.zzb != 0);
                    }
                    return zzm2;
                }
                break;
            case 26:
                if (i12 == 2) {
                    if ((j8 & 536870912) != 0) {
                        i18 = zzjo.zzj(bArr, i18, zzjnVar);
                        int i26 = zzjnVar.zza;
                        if (i26 < 0) {
                            throw zzll.zzd();
                        }
                        if (i26 == 0) {
                            zzliVar.add("");
                        } else {
                            int i27 = i18 + i26;
                            if (!zznz.zze(bArr, i18, i27)) {
                                throw zzll.zzc();
                            }
                            zzliVar.add(new String(bArr, i18, i26, zzlj.zzb));
                            i18 = i27;
                        }
                        while (i18 < i9) {
                            int zzj9 = zzjo.zzj(bArr, i18, zzjnVar);
                            if (i10 != zzjnVar.zza) {
                                break;
                            } else {
                                i18 = zzjo.zzj(bArr, zzj9, zzjnVar);
                                int i28 = zzjnVar.zza;
                                if (i28 < 0) {
                                    throw zzll.zzd();
                                }
                                if (i28 == 0) {
                                    zzliVar.add("");
                                } else {
                                    int i29 = i18 + i28;
                                    if (!zznz.zze(bArr, i18, i29)) {
                                        throw zzll.zzc();
                                    }
                                    zzliVar.add(new String(bArr, i18, i28, zzlj.zzb));
                                    i18 = i29;
                                }
                            }
                        }
                        break;
                    } else {
                        i18 = zzjo.zzj(bArr, i18, zzjnVar);
                        int i30 = zzjnVar.zza;
                        if (i30 < 0) {
                            throw zzll.zzd();
                        }
                        if (i30 == 0) {
                            zzliVar.add("");
                        } else {
                            zzliVar.add(new String(bArr, i18, i30, zzlj.zzb));
                            i18 += i30;
                        }
                        while (i18 < i9) {
                            int zzj10 = zzjo.zzj(bArr, i18, zzjnVar);
                            if (i10 != zzjnVar.zza) {
                                break;
                            } else {
                                i18 = zzjo.zzj(bArr, zzj10, zzjnVar);
                                int i31 = zzjnVar.zza;
                                if (i31 < 0) {
                                    throw zzll.zzd();
                                }
                                if (i31 == 0) {
                                    zzliVar.add("");
                                } else {
                                    zzliVar.add(new String(bArr, i18, i31, zzlj.zzb));
                                    i18 += i31;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 27:
                if (i12 == 2) {
                    return zzjo.zze(zzB(i13), i10, bArr, i8, i9, zzliVar, zzjnVar);
                }
                break;
            case 28:
                if (i12 == 2) {
                    int zzj11 = zzjo.zzj(bArr, i18, zzjnVar);
                    int i32 = zzjnVar.zza;
                    if (i32 < 0) {
                        throw zzll.zzd();
                    }
                    if (i32 > bArr.length - zzj11) {
                        throw zzll.zzf();
                    }
                    if (i32 == 0) {
                        zzliVar.add(zzka.zzb);
                    } else {
                        zzliVar.add(zzka.zzl(bArr, zzj11, i32));
                        zzj11 += i32;
                    }
                    while (zzj11 < i9) {
                        int zzj12 = zzjo.zzj(bArr, zzj11, zzjnVar);
                        if (i10 != zzjnVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzjo.zzj(bArr, zzj12, zzjnVar);
                        int i33 = zzjnVar.zza;
                        if (i33 < 0) {
                            throw zzll.zzd();
                        }
                        if (i33 > bArr.length - zzj11) {
                            throw zzll.zzf();
                        }
                        if (i33 == 0) {
                            zzliVar.add(zzka.zzb);
                        } else {
                            zzliVar.add(zzka.zzl(bArr, zzj11, i33));
                            zzj11 += i33;
                        }
                    }
                    return zzj11;
                }
                break;
            case 30:
            case 44:
                if (i12 == 2) {
                    zzl = zzjo.zzf(bArr, i18, zzliVar, zzjnVar);
                } else if (i12 == 0) {
                    zzl = zzjo.zzl(i10, bArr, i8, i9, zzliVar, zzjnVar);
                }
                zzlf zzA = zzA(i13);
                zznk zznkVar = this.zzn;
                int i34 = zzmv.zza;
                if (zzA != null) {
                    Object obj2 = null;
                    if (zzliVar instanceof RandomAccess) {
                        int size2 = zzliVar.size();
                        int i35 = 0;
                        for (int i36 = 0; i36 < size2; i36++) {
                            int intValue = ((Integer) zzliVar.get(i36)).intValue();
                            if (zzA.zza(intValue)) {
                                if (i36 != i35) {
                                    zzliVar.set(i35, Integer.valueOf(intValue));
                                }
                                i35++;
                            } else {
                                obj2 = zzmv.zzB(obj, i11, intValue, obj2, zznkVar);
                            }
                        }
                        if (i35 != size2) {
                            zzliVar.subList(i35, size2).clear();
                            return zzl;
                        }
                    } else {
                        Iterator it = zzliVar.iterator();
                        while (it.hasNext()) {
                            int intValue2 = ((Integer) it.next()).intValue();
                            if (!zzA.zza(intValue2)) {
                                obj2 = zzmv.zzB(obj, i11, intValue2, obj2, zznkVar);
                                it.remove();
                            }
                        }
                    }
                }
                return zzl;
            case 33:
            case 47:
                if (i12 == 2) {
                    zzlc zzlcVar3 = (zzlc) zzliVar;
                    int zzj13 = zzjo.zzj(bArr, i18, zzjnVar);
                    int i37 = zzjnVar.zza + zzj13;
                    while (zzj13 < i37) {
                        zzj13 = zzjo.zzj(bArr, zzj13, zzjnVar);
                        zzlcVar3.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    if (zzj13 == i37) {
                        return zzj13;
                    }
                    throw zzll.zzf();
                }
                if (i12 == 0) {
                    zzlc zzlcVar4 = (zzlc) zzliVar;
                    int zzj14 = zzjo.zzj(bArr, i18, zzjnVar);
                    zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    while (zzj14 < i9) {
                        int zzj15 = zzjo.zzj(bArr, zzj14, zzjnVar);
                        if (i10 != zzjnVar.zza) {
                            return zzj14;
                        }
                        zzj14 = zzjo.zzj(bArr, zzj15, zzjnVar);
                        zzlcVar4.zzh(zzke.zzb(zzjnVar.zza));
                    }
                    return zzj14;
                }
                break;
            case 34:
            case 48:
                if (i12 == 2) {
                    zzlx zzlxVar5 = (zzlx) zzliVar;
                    int zzj16 = zzjo.zzj(bArr, i18, zzjnVar);
                    int i38 = zzjnVar.zza + zzj16;
                    while (zzj16 < i38) {
                        zzj16 = zzjo.zzm(bArr, zzj16, zzjnVar);
                        zzlxVar5.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    if (zzj16 == i38) {
                        return zzj16;
                    }
                    throw zzll.zzf();
                }
                if (i12 == 0) {
                    zzlx zzlxVar6 = (zzlx) zzliVar;
                    int zzm3 = zzjo.zzm(bArr, i18, zzjnVar);
                    zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    while (zzm3 < i9) {
                        int zzj17 = zzjo.zzj(bArr, zzm3, zzjnVar);
                        if (i10 != zzjnVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzjo.zzm(bArr, zzj17, zzjnVar);
                        zzlxVar6.zzg(zzke.zzc(zzjnVar.zzb));
                    }
                    return zzm3;
                }
                break;
            default:
                if (i12 == 3) {
                    zzmt zzB = zzB(i13);
                    int i39 = (i10 & (-8)) | 4;
                    int zzc = zzjo.zzc(zzB, bArr, i8, i9, i39, zzjnVar);
                    zzliVar.add(zzjnVar.zzc);
                    while (zzc < i9) {
                        int zzj18 = zzjo.zzj(bArr, zzc, zzjnVar);
                        if (i10 != zzjnVar.zza) {
                            return zzc;
                        }
                        zzc = zzjo.zzc(zzB, bArr, zzj18, i9, i39, zzjnVar);
                        zzliVar.add(zzjnVar.zzc);
                    }
                    return zzc;
                }
                break;
        }
        return i18;
    }

    private final int zzt(int i8) {
        if (i8 < this.zze || i8 > this.zzf) {
            return -1;
        }
        return zzw(i8, 0);
    }

    private final int zzu(int i8, int i9) {
        if (i8 < this.zze || i8 > this.zzf) {
            return -1;
        }
        return zzw(i8, i9);
    }

    private final int zzv(int i8) {
        return this.zzc[i8 + 2];
    }

    private final int zzw(int i8, int i9) {
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

    private static int zzx(int i8) {
        return (i8 >>> 20) & 255;
    }

    private final int zzy(int i8) {
        return this.zzc[i8 + 1];
    }

    private static long zzz(Object obj, long j8) {
        return ((Long) zznu.zzf(obj, j8)).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zza(Object obj) {
        int zzx;
        int zzx2;
        int zzy;
        int zzx3;
        int zzx4;
        int zzx5;
        int zzx6;
        int zzn;
        int zzx7;
        int zzy2;
        int zzx8;
        int zzx9;
        if (!this.zzi) {
            return zzo(obj);
        }
        Unsafe unsafe = zzb;
        int i8 = 0;
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int zzy3 = zzy(i9);
            int zzx10 = zzx(zzy3);
            int i10 = this.zzc[i9];
            int i11 = zzy3 & 1048575;
            if (zzx10 >= zzkt.zzJ.zza() && zzx10 <= zzkt.zzW.zza()) {
                int i12 = this.zzc[i9 + 2];
            }
            long j8 = i11;
            switch (zzx10) {
                case 0:
                    if (zzP(obj, i9)) {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj, i9)) {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj, i9)) {
                        zzy = zzki.zzy(zznu.zzd(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj, i9)) {
                        zzy = zzki.zzy(zznu.zzd(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj, i9)) {
                        zzy = zzki.zzu(zznu.zzc(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj, i9)) {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj, i9)) {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj, i9)) {
                        zzx4 = zzki.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj, i9)) {
                        Object zzf = zznu.zzf(obj, j8);
                        if (zzf instanceof zzka) {
                            int i13 = i10 << 3;
                            int i14 = zzki.zzb;
                            int zzd = ((zzka) zzf).zzd();
                            zzx5 = zzki.zzx(zzd) + zzd;
                            zzx6 = zzki.zzx(i13);
                            zzn = zzx6 + zzx5;
                            i8 += zzn;
                            break;
                        } else {
                            zzy = zzki.zzw((String) zzf);
                            zzx3 = zzki.zzx(i10 << 3);
                            i8 += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzP(obj, i9)) {
                        zzn = zzmv.zzn(i10, zznu.zzf(obj, j8), zzB(i9));
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzP(obj, i9)) {
                        zzka zzkaVar = (zzka) zznu.zzf(obj, j8);
                        int i15 = i10 << 3;
                        int i16 = zzki.zzb;
                        int zzd2 = zzkaVar.zzd();
                        zzx5 = zzki.zzx(zzd2) + zzd2;
                        zzx6 = zzki.zzx(i15);
                        zzn = zzx6 + zzx5;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj, i9)) {
                        zzy = zzki.zzx(zznu.zzc(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj, i9)) {
                        zzy = zzki.zzu(zznu.zzc(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj, i9)) {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj, i9)) {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj, i9)) {
                        int zzc = zznu.zzc(obj, j8);
                        zzx3 = zzki.zzx(i10 << 3);
                        zzy = zzki.zzx((zzc >> 31) ^ (zzc + zzc));
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj, i9)) {
                        long zzd3 = zznu.zzd(obj, j8);
                        zzx7 = zzki.zzx(i10 << 3);
                        zzy2 = zzki.zzy((zzd3 + zzd3) ^ (zzd3 >> 63));
                        zzn = zzx7 + zzy2;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzP(obj, i9)) {
                        zzn = zzki.zzt(i10, (zzmi) zznu.zzf(obj, j8), zzB(i9));
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzn = zzmv.zzg(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 19:
                    zzn = zzmv.zze(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 20:
                    zzn = zzmv.zzl(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 21:
                    zzn = zzmv.zzw(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 22:
                    zzn = zzmv.zzj(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 23:
                    zzn = zzmv.zzg(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 24:
                    zzn = zzmv.zze(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 25:
                    zzn = zzmv.zza(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 26:
                    zzn = zzmv.zzt(i10, (List) zznu.zzf(obj, j8));
                    i8 += zzn;
                    break;
                case 27:
                    zzn = zzmv.zzo(i10, (List) zznu.zzf(obj, j8), zzB(i9));
                    i8 += zzn;
                    break;
                case 28:
                    zzn = zzmv.zzb(i10, (List) zznu.zzf(obj, j8));
                    i8 += zzn;
                    break;
                case 29:
                    zzn = zzmv.zzu(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 30:
                    zzn = zzmv.zzc(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 31:
                    zzn = zzmv.zze(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 32:
                    zzn = zzmv.zzg(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 33:
                    zzn = zzmv.zzp(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 34:
                    zzn = zzmv.zzr(i10, (List) zznu.zzf(obj, j8), false);
                    i8 += zzn;
                    break;
                case 35:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i17 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i17);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i18 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i18);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzmv.zzm((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i19 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i19);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzmv.zzx((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i20 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i20);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzmv.zzk((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i21 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i21);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i22 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i22);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i23 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i23);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(obj, j8);
                    int i24 = zzmv.zza;
                    zzy = list.size();
                    if (zzy > 0) {
                        int i25 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i25);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzmv.zzv((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i26 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i26);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzmv.zzd((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i27 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i27);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzmv.zzf((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i28 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i28);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzmv.zzh((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i29 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i29);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzmv.zzq((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i30 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i30);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzmv.zzs((List) unsafe.getObject(obj, j8));
                    if (zzy > 0) {
                        int i31 = i10 << 3;
                        zzx8 = zzki.zzx(zzy);
                        zzx9 = zzki.zzx(i31);
                        zzx3 = zzx9 + zzx8;
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzn = zzmv.zzi(i10, (List) zznu.zzf(obj, j8), zzB(i9));
                    i8 += zzn;
                    break;
                case 50:
                    zzmd.zza(i10, zznu.zzf(obj, j8), zzC(i9));
                    break;
                case 51:
                    if (zzT(obj, i10, i9)) {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i10, i9)) {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i10, i9)) {
                        zzy = zzki.zzy(zzz(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i10, i9)) {
                        zzy = zzki.zzy(zzz(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i10, i9)) {
                        zzy = zzki.zzu(zzp(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i10, i9)) {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i10, i9)) {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i10, i9)) {
                        zzx4 = zzki.zzx(i10 << 3);
                        zzn = zzx4 + 1;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i10, i9)) {
                        Object zzf2 = zznu.zzf(obj, j8);
                        if (zzf2 instanceof zzka) {
                            int i32 = i10 << 3;
                            int i33 = zzki.zzb;
                            int zzd4 = ((zzka) zzf2).zzd();
                            zzx5 = zzki.zzx(zzd4) + zzd4;
                            zzx6 = zzki.zzx(i32);
                            zzn = zzx6 + zzx5;
                            i8 += zzn;
                            break;
                        } else {
                            zzy = zzki.zzw((String) zzf2);
                            zzx3 = zzki.zzx(i10 << 3);
                            i8 += zzx3 + zzy;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i10, i9)) {
                        zzn = zzmv.zzn(i10, zznu.zzf(obj, j8), zzB(i9));
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i10, i9)) {
                        zzka zzkaVar2 = (zzka) zznu.zzf(obj, j8);
                        int i34 = i10 << 3;
                        int i35 = zzki.zzb;
                        int zzd5 = zzkaVar2.zzd();
                        zzx5 = zzki.zzx(zzd5) + zzd5;
                        zzx6 = zzki.zzx(i34);
                        zzn = zzx6 + zzx5;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i10, i9)) {
                        zzy = zzki.zzx(zzp(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i10, i9)) {
                        zzy = zzki.zzu(zzp(obj, j8));
                        zzx3 = zzki.zzx(i10 << 3);
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i10, i9)) {
                        zzx2 = zzki.zzx(i10 << 3);
                        zzn = zzx2 + 4;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i10, i9)) {
                        zzx = zzki.zzx(i10 << 3);
                        zzn = zzx + 8;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i10, i9)) {
                        int zzp = zzp(obj, j8);
                        zzx3 = zzki.zzx(i10 << 3);
                        zzy = zzki.zzx((zzp >> 31) ^ (zzp + zzp));
                        i8 += zzx3 + zzy;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i10, i9)) {
                        long zzz = zzz(obj, j8);
                        zzx7 = zzki.zzx(i10 << 3);
                        zzy2 = zzki.zzy((zzz + zzz) ^ (zzz >> 63));
                        zzn = zzx7 + zzy2;
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i10, i9)) {
                        zzn = zzki.zzt(i10, (zzmi) zznu.zzf(obj, j8), zzB(i9));
                        i8 += zzn;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zznk zznkVar = this.zzn;
        return i8 + zznkVar.zza(zznkVar.zzd(obj));
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final int zzb(Object obj) {
        int i8;
        long doubleToLongBits;
        int i9;
        int floatToIntBits;
        int length = this.zzc.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzy = zzy(i11);
            int i12 = this.zzc[i11];
            long j8 = 1048575 & zzy;
            int i13 = 37;
            switch (zzx(zzy)) {
                case 0:
                    i8 = i10 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zznu.zza(obj, j8));
                    byte[] bArr = zzlj.zzd;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i9 = i10 * 53;
                    floatToIntBits = Float.floatToIntBits(zznu.zzb(obj, j8));
                    i10 = i9 + floatToIntBits;
                    break;
                case 2:
                    i8 = i10 * 53;
                    doubleToLongBits = zznu.zzd(obj, j8);
                    byte[] bArr2 = zzlj.zzd;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i8 = i10 * 53;
                    doubleToLongBits = zznu.zzd(obj, j8);
                    byte[] bArr3 = zzlj.zzd;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzc(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 5:
                    i8 = i10 * 53;
                    doubleToLongBits = zznu.zzd(obj, j8);
                    byte[] bArr4 = zzlj.zzd;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzc(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 7:
                    i9 = i10 * 53;
                    floatToIntBits = zzlj.zza(zznu.zzw(obj, j8));
                    i10 = i9 + floatToIntBits;
                    break;
                case 8:
                    i9 = i10 * 53;
                    floatToIntBits = ((String) zznu.zzf(obj, j8)).hashCode();
                    i10 = i9 + floatToIntBits;
                    break;
                case 9:
                    Object zzf = zznu.zzf(obj, j8);
                    if (zzf != null) {
                        i13 = zzf.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
                    break;
                case 10:
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzf(obj, j8).hashCode();
                    i10 = i9 + floatToIntBits;
                    break;
                case 11:
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzc(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 12:
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzc(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 13:
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzc(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 14:
                    i8 = i10 * 53;
                    doubleToLongBits = zznu.zzd(obj, j8);
                    byte[] bArr5 = zzlj.zzd;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzc(obj, j8);
                    i10 = i9 + floatToIntBits;
                    break;
                case 16:
                    i8 = i10 * 53;
                    doubleToLongBits = zznu.zzd(obj, j8);
                    byte[] bArr6 = zzlj.zzd;
                    i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object zzf2 = zznu.zzf(obj, j8);
                    if (zzf2 != null) {
                        i13 = zzf2.hashCode();
                    }
                    i10 = (i10 * 53) + i13;
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
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzf(obj, j8).hashCode();
                    i10 = i9 + floatToIntBits;
                    break;
                case 50:
                    i9 = i10 * 53;
                    floatToIntBits = zznu.zzf(obj, j8).hashCode();
                    i10 = i9 + floatToIntBits;
                    break;
                case 51:
                    if (zzT(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j8));
                        byte[] bArr7 = zzlj.zzd;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j8));
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = zzz(obj, j8);
                        byte[] bArr8 = zzlj.zzd;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = zzz(obj, j8);
                        byte[] bArr9 = zzlj.zzd;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzp(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = zzz(obj, j8);
                        byte[] bArr10 = zzlj.zzd;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzp(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzlj.zza(zzU(obj, j8));
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = ((String) zznu.zzf(obj, j8)).hashCode();
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zznu.zzf(obj, j8).hashCode();
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zznu.zzf(obj, j8).hashCode();
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzp(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzp(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzp(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = zzz(obj, j8);
                        byte[] bArr11 = zzlj.zzd;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zzp(obj, j8);
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i12, i11)) {
                        i8 = i10 * 53;
                        doubleToLongBits = zzz(obj, j8);
                        byte[] bArr12 = zzlj.zzd;
                        i10 = i8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i12, i11)) {
                        i9 = i10 * 53;
                        floatToIntBits = zznu.zzf(obj, j8).hashCode();
                        i10 = i9 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i10 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    final int zzc(Object obj, byte[] bArr, int i8, int i9, int i10, zzjn zzjnVar) {
        Unsafe unsafe;
        int i11;
        Object obj2;
        zzml<T> zzmlVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj3;
        zzjn zzjnVar2;
        int i19;
        int i20;
        int i21;
        byte[] bArr2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        byte[] bArr3;
        int i29;
        int i30;
        zzml<T> zzmlVar2 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i31 = i9;
        int i32 = i10;
        zzjn zzjnVar3 = zzjnVar;
        zzG(obj);
        Unsafe unsafe2 = zzb;
        int i33 = -1;
        int i34 = i8;
        int i35 = -1;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 1048575;
        while (true) {
            if (i34 < i31) {
                int i40 = i34 + 1;
                byte b8 = bArr4[i34];
                if (b8 < 0) {
                    int zzk = zzjo.zzk(b8, bArr4, i40, zzjnVar3);
                    i12 = zzjnVar3.zza;
                    i40 = zzk;
                } else {
                    i12 = b8;
                }
                int i41 = i12 >>> 3;
                int zzu = i41 > i35 ? zzmlVar2.zzu(i41, i36 / 3) : zzmlVar2.zzt(i41);
                if (zzu == i33) {
                    i13 = i41;
                    i14 = i40;
                    i15 = i12;
                    i16 = i38;
                    unsafe = unsafe2;
                    i17 = i32;
                    i18 = 0;
                } else {
                    int i42 = i12 & 7;
                    int[] iArr = zzmlVar2.zzc;
                    int i43 = iArr[zzu + 1];
                    int zzx = zzx(i43);
                    int i44 = i12;
                    long j8 = i43 & 1048575;
                    if (zzx <= 17) {
                        int i45 = iArr[zzu + 2];
                        int i46 = 1 << (i45 >>> 20);
                        int i47 = i45 & 1048575;
                        if (i47 != i39) {
                            if (i39 != 1048575) {
                                unsafe2.putInt(obj4, i39, i38);
                            }
                            i21 = i47;
                            i20 = unsafe2.getInt(obj4, i47);
                        } else {
                            i20 = i38;
                            i21 = i39;
                        }
                        switch (zzx) {
                            case 0:
                                bArr2 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i25 = i40;
                                i26 = i46;
                                i27 = i44;
                                if (i42 != 1) {
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    zznu.zzo(obj4, j8, Double.longBitsToDouble(zzjo.zzp(bArr2, i25)));
                                    i34 = i25 + 8;
                                    i38 = i20 | i26;
                                    i31 = i9;
                                    bArr4 = bArr2;
                                    i36 = i23;
                                    i35 = i22;
                                    i37 = i27;
                                    i33 = -1;
                                    i39 = i24;
                                    i32 = i10;
                                }
                            case 1:
                                bArr2 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i25 = i40;
                                i26 = i46;
                                i27 = i44;
                                if (i42 != 5) {
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    zznu.zzp(obj4, j8, Float.intBitsToFloat(zzjo.zzb(bArr2, i25)));
                                    i34 = i25 + 4;
                                    i38 = i20 | i26;
                                    i31 = i9;
                                    bArr4 = bArr2;
                                    i36 = i23;
                                    i35 = i22;
                                    i37 = i27;
                                    i33 = -1;
                                    i39 = i24;
                                    i32 = i10;
                                }
                            case 2:
                            case 3:
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i25 = i40;
                                i27 = i44;
                                if (i42 != 0) {
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    int zzm = zzjo.zzm(bArr, i25, zzjnVar3);
                                    unsafe2.putLong(obj, j8, zzjnVar3.zzb);
                                    i38 = i20 | i46;
                                    bArr4 = bArr;
                                    i36 = i23;
                                    i34 = zzm;
                                    i35 = i22;
                                    i37 = i27;
                                    i33 = -1;
                                    i39 = i24;
                                    i31 = i9;
                                    i32 = i10;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i25 = i40;
                                i26 = i46;
                                i27 = i44;
                                if (i42 != 0) {
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = zzjo.zzj(bArr2, i25, zzjnVar3);
                                    unsafe2.putInt(obj4, j8, zzjnVar3.zza);
                                    i38 = i20 | i26;
                                    i31 = i9;
                                    bArr4 = bArr2;
                                    i36 = i23;
                                    i35 = i22;
                                    i37 = i27;
                                    i33 = -1;
                                    i39 = i24;
                                    i32 = i10;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                i26 = i46;
                                if (i42 != 1) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i27 = i28;
                                    i25 = i40;
                                    unsafe2.putLong(obj, j8, zzjo.zzp(bArr2, i40));
                                    i34 = i25 + 8;
                                    i38 = i20 | i26;
                                    i31 = i9;
                                    bArr4 = bArr2;
                                    i36 = i23;
                                    i35 = i22;
                                    i37 = i27;
                                    i33 = -1;
                                    i39 = i24;
                                    i32 = i10;
                                }
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                if (i42 != 5) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j8, zzjo.zzb(bArr3, i40));
                                    i34 = i40 + 4;
                                    i38 = i20 | i46;
                                    bArr4 = bArr3;
                                    i36 = i23;
                                    i37 = i28;
                                    i35 = i22;
                                    i33 = -1;
                                    i39 = i24;
                                    i31 = i9;
                                    i32 = i10;
                                }
                            case 7:
                                bArr3 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                if (i42 != 0) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = zzjo.zzm(bArr3, i40, zzjnVar3);
                                    zznu.zzm(obj4, j8, zzjnVar3.zzb != 0);
                                    i38 = i20 | i46;
                                    bArr4 = bArr3;
                                    i36 = i23;
                                    i37 = i28;
                                    i35 = i22;
                                    i33 = -1;
                                    i39 = i24;
                                    i31 = i9;
                                    i32 = i10;
                                }
                            case 8:
                                bArr3 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                if (i42 != 2) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = (536870912 & i43) == 0 ? zzjo.zzg(bArr3, i40, zzjnVar3) : zzjo.zzh(bArr3, i40, zzjnVar3);
                                    unsafe2.putObject(obj4, j8, zzjnVar3.zzc);
                                    i38 = i20 | i46;
                                    bArr4 = bArr3;
                                    i36 = i23;
                                    i37 = i28;
                                    i35 = i22;
                                    i33 = -1;
                                    i39 = i24;
                                    i31 = i9;
                                    i32 = i10;
                                }
                            case 9:
                                bArr3 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                if (i42 != 2) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object zzD = zzmlVar2.zzD(obj4, i23);
                                    i34 = zzjo.zzo(zzD, zzmlVar2.zzB(i23), bArr, i40, i9, zzjnVar);
                                    zzmlVar2.zzL(obj4, i23, zzD);
                                    i38 = i20 | i46;
                                    bArr4 = bArr3;
                                    i36 = i23;
                                    i37 = i28;
                                    i35 = i22;
                                    i33 = -1;
                                    i39 = i24;
                                    i31 = i9;
                                    i32 = i10;
                                }
                            case 10:
                                bArr3 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                if (i42 != 2) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = zzjo.zza(bArr3, i40, zzjnVar3);
                                    unsafe2.putObject(obj4, j8, zzjnVar3.zzc);
                                    i38 = i20 | i46;
                                    bArr4 = bArr3;
                                    i36 = i23;
                                    i37 = i28;
                                    i35 = i22;
                                    i33 = -1;
                                    i39 = i24;
                                    i31 = i9;
                                    i32 = i10;
                                }
                            case 12:
                                bArr3 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                if (i42 != 0) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = zzjo.zzj(bArr3, i40, zzjnVar3);
                                    int i48 = zzjnVar3.zza;
                                    zzlf zzA = zzmlVar2.zzA(i23);
                                    if (zzA == null || zzA.zza(i48)) {
                                        unsafe2.putInt(obj4, j8, i48);
                                        i38 = i20 | i46;
                                        bArr4 = bArr3;
                                        i36 = i23;
                                        i37 = i28;
                                        i35 = i22;
                                        i33 = -1;
                                        i39 = i24;
                                        i31 = i9;
                                        i32 = i10;
                                    } else {
                                        zzd(obj).zzj(i28, Long.valueOf(i48));
                                        i36 = i23;
                                        i38 = i20;
                                        i37 = i28;
                                        i35 = i22;
                                        i33 = -1;
                                        i31 = i9;
                                        i32 = i10;
                                        bArr4 = bArr3;
                                        i39 = i24;
                                    }
                                }
                                break;
                            case 15:
                                bArr3 = bArr;
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                if (i42 != 0) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    i34 = zzjo.zzj(bArr3, i40, zzjnVar3);
                                    unsafe2.putInt(obj4, j8, zzke.zzb(zzjnVar3.zza));
                                    i38 = i20 | i46;
                                    bArr4 = bArr3;
                                    i36 = i23;
                                    i37 = i28;
                                    i35 = i22;
                                    i33 = -1;
                                    i39 = i24;
                                    i31 = i9;
                                    i32 = i10;
                                }
                            case 16:
                                i22 = i41;
                                i23 = zzu;
                                i24 = i21;
                                i28 = i44;
                                if (i42 != 0) {
                                    i27 = i28;
                                    i25 = i40;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    int zzm2 = zzjo.zzm(bArr, i40, zzjnVar3);
                                    unsafe2.putLong(obj, j8, zzke.zzc(zzjnVar3.zzb));
                                    i38 = i20 | i46;
                                    bArr4 = bArr;
                                    i34 = zzm2;
                                    i36 = i23;
                                    i37 = i28;
                                    i35 = i22;
                                    i33 = -1;
                                    i39 = i24;
                                    i31 = i9;
                                    i32 = i10;
                                }
                            default:
                                if (i42 != 3) {
                                    i22 = i41;
                                    i23 = zzu;
                                    i24 = i21;
                                    i25 = i40;
                                    i27 = i44;
                                    i39 = i24;
                                    i17 = i10;
                                    unsafe = unsafe2;
                                    i18 = i23;
                                    i16 = i20;
                                    i14 = i25;
                                    i13 = i22;
                                    i15 = i27;
                                    break;
                                } else {
                                    Object zzD2 = zzmlVar2.zzD(obj4, zzu);
                                    i34 = zzjo.zzn(zzD2, zzmlVar2.zzB(zzu), bArr, i40, i9, (i41 << 3) | 4, zzjnVar);
                                    zzmlVar2.zzL(obj4, zzu, zzD2);
                                    i38 = i20 | i46;
                                    bArr4 = bArr;
                                    i39 = i21;
                                    i36 = zzu;
                                    i37 = i44;
                                    i35 = i41;
                                    i33 = -1;
                                    i31 = i9;
                                    i32 = i10;
                                }
                        }
                    } else {
                        int i49 = i40;
                        if (zzx != 27) {
                            i16 = i38;
                            i29 = i39;
                            if (zzx <= 49) {
                                unsafe = unsafe2;
                                i18 = zzu;
                                i13 = i41;
                                i34 = zzs(obj, bArr, i49, i9, i44, i41, i42, zzu, i43, zzx, j8, zzjnVar);
                                if (i34 != i49) {
                                    zzmlVar2 = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i31 = i9;
                                    i32 = i10;
                                    zzjnVar3 = zzjnVar;
                                    i38 = i16;
                                    i37 = i44;
                                    i39 = i29;
                                    i36 = i18;
                                    i35 = i13;
                                    unsafe2 = unsafe;
                                    i33 = -1;
                                } else {
                                    i14 = i34;
                                    i15 = i44;
                                    i39 = i29;
                                    i17 = i10;
                                }
                            } else {
                                unsafe = unsafe2;
                                i18 = zzu;
                                i13 = i41;
                                i30 = i49;
                                if (zzx != 50) {
                                    i34 = zzr(obj, bArr, i30, i9, i44, i13, i42, i43, zzx, j8, i18, zzjnVar);
                                    if (i34 != i30) {
                                        zzmlVar2 = this;
                                        obj4 = obj;
                                        bArr4 = bArr;
                                        i31 = i9;
                                        i32 = i10;
                                        zzjnVar3 = zzjnVar;
                                        i38 = i16;
                                        i37 = i44;
                                        i39 = i29;
                                        i36 = i18;
                                        i35 = i13;
                                        unsafe2 = unsafe;
                                        i33 = -1;
                                    } else {
                                        i14 = i34;
                                        i15 = i44;
                                        i39 = i29;
                                        i17 = i10;
                                    }
                                } else if (i42 == 2) {
                                    i34 = zzq(obj, bArr, i30, i9, i18, j8, zzjnVar);
                                    if (i34 != i30) {
                                        zzmlVar2 = this;
                                        obj4 = obj;
                                        bArr4 = bArr;
                                        i31 = i9;
                                        i32 = i10;
                                        zzjnVar3 = zzjnVar;
                                        i38 = i16;
                                        i37 = i44;
                                        i39 = i29;
                                        i36 = i18;
                                        i35 = i13;
                                        unsafe2 = unsafe;
                                        i33 = -1;
                                    } else {
                                        i14 = i34;
                                        i15 = i44;
                                        i39 = i29;
                                        i17 = i10;
                                    }
                                }
                            }
                        } else if (i42 == 2) {
                            zzli zzliVar = (zzli) unsafe2.getObject(obj4, j8);
                            if (!zzliVar.zzc()) {
                                int size = zzliVar.size();
                                zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j8, zzliVar);
                            }
                            i34 = zzjo.zze(zzmlVar2.zzB(zzu), i44, bArr, i49, i9, zzliVar, zzjnVar);
                            i31 = i9;
                            i36 = zzu;
                            i35 = i41;
                            i38 = i38;
                            i37 = i44;
                            i39 = i39;
                            i33 = -1;
                            bArr4 = bArr;
                            i32 = i10;
                        } else {
                            i16 = i38;
                            i29 = i39;
                            unsafe = unsafe2;
                            i18 = zzu;
                            i13 = i41;
                            i30 = i49;
                        }
                        i17 = i10;
                        i14 = i30;
                        i15 = i44;
                        i39 = i29;
                    }
                }
                if (i15 != i17 || i17 == 0) {
                    int i50 = i17;
                    if (this.zzh) {
                        zzjnVar2 = zzjnVar;
                        zzkn zzknVar = zzjnVar2.zzd;
                        if (zzknVar != zzkn.zza) {
                            i19 = i13;
                            if (zzknVar.zzb(this.zzg, i19) != null) {
                                throw null;
                            }
                            i34 = zzjo.zzi(i15, bArr, i14, i9, zzd(obj), zzjnVar);
                            obj3 = obj;
                            i31 = i9;
                            i37 = i15;
                            zzmlVar2 = this;
                            i35 = i19;
                            obj4 = obj3;
                            i38 = i16;
                            i36 = i18;
                            i33 = -1;
                            bArr4 = bArr;
                            i32 = i50;
                            zzjnVar3 = zzjnVar2;
                            unsafe2 = unsafe;
                        } else {
                            obj3 = obj;
                        }
                    } else {
                        obj3 = obj;
                        zzjnVar2 = zzjnVar;
                    }
                    i19 = i13;
                    i34 = zzjo.zzi(i15, bArr, i14, i9, zzd(obj), zzjnVar);
                    i31 = i9;
                    i37 = i15;
                    zzmlVar2 = this;
                    i35 = i19;
                    obj4 = obj3;
                    i38 = i16;
                    i36 = i18;
                    i33 = -1;
                    bArr4 = bArr;
                    i32 = i50;
                    zzjnVar3 = zzjnVar2;
                    unsafe2 = unsafe;
                } else {
                    zzmlVar = this;
                    obj2 = obj;
                    i11 = i17;
                    i34 = i14;
                    i37 = i15;
                    i38 = i16;
                }
            } else {
                unsafe = unsafe2;
                i11 = i32;
                obj2 = obj4;
                zzmlVar = zzmlVar2;
            }
        }
        if (i39 != 1048575) {
            unsafe.putInt(obj2, i39, i38);
        }
        for (int i51 = zzmlVar.zzk; i51 < zzmlVar.zzl; i51++) {
            int i52 = zzmlVar.zzj[i51];
            int i53 = zzmlVar.zzc[i52];
            Object zzf = zznu.zzf(obj2, zzmlVar.zzy(i52) & 1048575);
            if (zzf != null && zzmlVar.zzA(i52) != null) {
                throw null;
            }
        }
        if (i11 == 0) {
            if (i34 != i9) {
                throw zzll.zze();
            }
        } else if (i34 > i9 || i37 != i11) {
            throw zzll.zze();
        }
        return i34;
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final Object zze() {
        return ((zzlb) this.zzg).zzbD();
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzf(Object obj) {
        if (zzS(obj)) {
            if (obj instanceof zzlb) {
                zzlb zzlbVar = (zzlb) obj;
                zzlbVar.zzbP(Integer.MAX_VALUE);
                zzlbVar.zzb = 0;
                zzlbVar.zzbN();
            }
            int length = this.zzc.length;
            for (int i8 = 0; i8 < length; i8 += 3) {
                int zzy = zzy(i8);
                int i9 = 1048575 & zzy;
                int zzx = zzx(zzy);
                long j8 = i9;
                if (zzx != 9) {
                    if (zzx != 60 && zzx != 68) {
                        switch (zzx) {
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
                                this.zzm.zza(obj, j8);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j8);
                                if (object != null) {
                                    ((zzmc) object).zzc();
                                    unsafe.putObject(obj, j8, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzT(obj, this.zzc[i8], i8)) {
                        zzB(i8).zzf(zzb.getObject(obj, j8));
                    }
                }
                if (zzP(obj, i8)) {
                    zzB(i8).zzf(zzb.getObject(obj, j8));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzg(Object obj, Object obj2) {
        zzG(obj);
        obj2.getClass();
        for (int i8 = 0; i8 < this.zzc.length; i8 += 3) {
            int zzy = zzy(i8);
            int i9 = this.zzc[i8];
            long j8 = 1048575 & zzy;
            switch (zzx(zzy)) {
                case 0:
                    if (zzP(obj2, i8)) {
                        zznu.zzo(obj, j8, zznu.zza(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzP(obj2, i8)) {
                        zznu.zzp(obj, j8, zznu.zzb(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzP(obj2, i8)) {
                        zznu.zzr(obj, j8, zznu.zzd(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzP(obj2, i8)) {
                        zznu.zzr(obj, j8, zznu.zzd(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzP(obj2, i8)) {
                        zznu.zzq(obj, j8, zznu.zzc(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzP(obj2, i8)) {
                        zznu.zzr(obj, j8, zznu.zzd(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzP(obj2, i8)) {
                        zznu.zzq(obj, j8, zznu.zzc(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzP(obj2, i8)) {
                        zznu.zzm(obj, j8, zznu.zzw(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzP(obj2, i8)) {
                        zznu.zzs(obj, j8, zznu.zzf(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i8);
                    break;
                case 10:
                    if (zzP(obj2, i8)) {
                        zznu.zzs(obj, j8, zznu.zzf(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzP(obj2, i8)) {
                        zznu.zzq(obj, j8, zznu.zzc(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzP(obj2, i8)) {
                        zznu.zzq(obj, j8, zznu.zzc(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzP(obj2, i8)) {
                        zznu.zzq(obj, j8, zznu.zzc(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzP(obj2, i8)) {
                        zznu.zzr(obj, j8, zznu.zzd(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzP(obj2, i8)) {
                        zznu.zzq(obj, j8, zznu.zzc(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzP(obj2, i8)) {
                        zznu.zzr(obj, j8, zznu.zzd(obj2, j8));
                        zzJ(obj, i8);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i8);
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
                    this.zzm.zzb(obj, obj2, j8);
                    break;
                case 50:
                    int i10 = zzmv.zza;
                    zznu.zzs(obj, j8, zzmd.zzb(zznu.zzf(obj, j8), zznu.zzf(obj2, j8)));
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
                    if (zzT(obj2, i9, i8)) {
                        zznu.zzs(obj, j8, zznu.zzf(obj2, j8));
                        zzK(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i8);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i9, i8)) {
                        zznu.zzs(obj, j8, zznu.zzf(obj2, j8));
                        zzK(obj, i9, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i8);
                    break;
            }
        }
        zzmv.zzC(this.zzn, obj, obj2);
        if (this.zzh) {
            this.zzo.zza(obj2);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x02f0, code lost:
    
        if (r0 != r24) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02f2, code lost:
    
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0305, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0335, code lost:
    
        if (r0 != r14) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0354, code lost:
    
        if (r0 != r14) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x0095. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    @Override // com.google.android.gms.internal.measurement.zzmt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, byte[] bArr, int i8, int i9, zzjn zzjnVar) {
        byte b8;
        int i10;
        int i11;
        int i12;
        Unsafe unsafe;
        int i13;
        Unsafe unsafe2;
        int i14;
        Unsafe unsafe3;
        zzml<T> zzmlVar;
        Unsafe unsafe4;
        int i15;
        int i16;
        int i17;
        zzml<T> zzmlVar2 = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i18 = i9;
        zzjn zzjnVar2 = zzjnVar;
        if (!zzmlVar2.zzi) {
            zzc(obj, bArr, i8, i9, 0, zzjnVar);
            return;
        }
        zzG(obj);
        Unsafe unsafe5 = zzb;
        int i19 = -1;
        int i20 = 1048575;
        int i21 = i8;
        int i22 = -1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        while (i21 < i18) {
            int i26 = i21 + 1;
            byte b9 = bArr2[i21];
            if (b9 < 0) {
                i10 = zzjo.zzk(b9, bArr2, i26, zzjnVar2);
                b8 = zzjnVar2.zza;
            } else {
                b8 = b9;
                i10 = i26;
            }
            int i27 = b8 >>> 3;
            int zzu = i27 > i22 ? zzmlVar2.zzu(i27, i23 / 3) : zzmlVar2.zzt(i27);
            if (zzu == i19) {
                i11 = i10;
                i12 = i27;
                unsafe = unsafe5;
                i13 = 0;
            } else {
                int i28 = b8 & 7;
                int[] iArr = zzmlVar2.zzc;
                int i29 = iArr[zzu + 1];
                int zzx = zzx(i29);
                Unsafe unsafe6 = unsafe5;
                long j8 = i29 & i20;
                if (zzx <= 17) {
                    int i30 = iArr[zzu + 2];
                    int i31 = 1 << (i30 >>> 20);
                    int i32 = i30 & 1048575;
                    if (i32 != i25) {
                        if (i25 != 1048575) {
                            long j9 = i25;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j9, i24);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i32 != 1048575) {
                            i24 = unsafe4.getInt(obj2, i32);
                        }
                        unsafe2 = unsafe4;
                        i25 = i32;
                    } else {
                        unsafe2 = unsafe6;
                    }
                    switch (zzx) {
                        case 0:
                            zzmlVar = this;
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 1) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                zznu.zzo(obj2, j8, Double.longBitsToDouble(zzjo.zzp(bArr2, i10)));
                                i21 = i10 + 8;
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 1:
                            zzmlVar = this;
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 5) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                zznu.zzp(obj2, j8, Float.intBitsToFloat(zzjo.zzb(bArr2, i10)));
                                i21 = i10 + 4;
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 2:
                        case 3:
                            zzmlVar = this;
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 0) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                int zzm = zzjo.zzm(bArr2, i10, zzjnVar2);
                                unsafe3.putLong(obj, j8, zzjnVar2.zzb);
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i21 = zzm;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 4:
                        case 11:
                            zzmlVar = this;
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 0) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                i21 = zzjo.zzj(bArr2, i10, zzjnVar2);
                                unsafe3.putInt(obj2, j8, zzjnVar2.zza);
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 5:
                        case 14:
                            zzmlVar = this;
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 1) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                unsafe3.putLong(obj, j8, zzjo.zzp(bArr2, i10));
                                i21 = i10 + 8;
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 6:
                        case 13:
                            zzmlVar = this;
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 5) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                unsafe3.putInt(obj2, j8, zzjo.zzb(bArr2, i10));
                                i21 = i10 + 4;
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 7:
                            zzmlVar = this;
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 0) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                i21 = zzjo.zzm(bArr2, i10, zzjnVar2);
                                zznu.zzm(obj2, j8, zzjnVar2.zzb != 0);
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 8:
                            zzmlVar = this;
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 2) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                i21 = (i29 & 536870912) == 0 ? zzjo.zzg(bArr2, i10, zzjnVar2) : zzjo.zzh(bArr2, i10, zzjnVar2);
                                unsafe3.putObject(obj2, j8, zzjnVar2.zzc);
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 9:
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 != 2) {
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                zzmlVar = this;
                                Object zzD = zzmlVar.zzD(obj2, i13);
                                i21 = zzjo.zzo(zzD, zzmlVar.zzB(i13), bArr, i10, i9, zzjnVar);
                                zzmlVar.zzL(obj2, i13, zzD);
                                i24 |= i31;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = zzmlVar;
                                i18 = i9;
                                break;
                            }
                        case 10:
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 == 2) {
                                i21 = zzjo.zza(bArr2, i10, zzjnVar2);
                                unsafe3.putObject(obj2, j8, zzjnVar2.zzc);
                                i24 |= i31;
                                i18 = i9;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = this;
                                break;
                            }
                            i11 = i10;
                            unsafe = unsafe3;
                            i25 = i14;
                            break;
                        case 12:
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 == 0) {
                                i21 = zzjo.zzj(bArr2, i10, zzjnVar2);
                                unsafe3.putInt(obj2, j8, zzjnVar2.zza);
                                i24 |= i31;
                                i18 = i9;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = this;
                                break;
                            }
                            i11 = i10;
                            unsafe = unsafe3;
                            i25 = i14;
                            break;
                        case 15:
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            if (i28 == 0) {
                                i21 = zzjo.zzj(bArr2, i10, zzjnVar2);
                                unsafe3.putInt(obj2, j8, zzke.zzb(zzjnVar2.zza));
                                i24 |= i31;
                                i18 = i9;
                                unsafe5 = unsafe3;
                                i23 = i13;
                                i25 = i14;
                                i22 = i12;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = this;
                                break;
                            }
                            i11 = i10;
                            unsafe = unsafe3;
                            i25 = i14;
                            break;
                        case 16:
                            if (i28 != 0) {
                                i12 = i27;
                                i13 = zzu;
                                i14 = i25;
                                unsafe3 = unsafe2;
                                i11 = i10;
                                unsafe = unsafe3;
                                i25 = i14;
                                break;
                            } else {
                                int zzm2 = zzjo.zzm(bArr2, i10, zzjnVar2);
                                unsafe2.putLong(obj, j8, zzke.zzc(zzjnVar2.zzb));
                                i24 |= i31;
                                unsafe5 = unsafe2;
                                i21 = zzm2;
                                i23 = zzu;
                                i25 = i25;
                                i22 = i27;
                                i20 = 1048575;
                                i19 = -1;
                                zzmlVar2 = this;
                                i18 = i9;
                                break;
                            }
                        default:
                            i12 = i27;
                            i13 = zzu;
                            i14 = i25;
                            unsafe3 = unsafe2;
                            i11 = i10;
                            unsafe = unsafe3;
                            i25 = i14;
                            break;
                    }
                } else {
                    i12 = i27;
                    int i33 = i25;
                    zzml<T> zzmlVar3 = zzmlVar2;
                    i13 = zzu;
                    if (zzx != 27) {
                        if (zzx <= 49) {
                            int i34 = i10;
                            i16 = i24;
                            i17 = i33;
                            unsafe = unsafe6;
                            i21 = zzs(obj, bArr, i10, i9, b8, i12, i28, i13, i29, zzx, j8, zzjnVar);
                        } else {
                            i15 = i10;
                            i16 = i24;
                            unsafe = unsafe6;
                            i17 = i33;
                            if (zzx != 50) {
                                i21 = zzr(obj, bArr, i15, i9, b8, i12, i28, i29, zzx, j8, i13, zzjnVar);
                            } else if (i28 == 2) {
                                i21 = zzq(obj, bArr, i15, i9, i13, j8, zzjnVar);
                            }
                        }
                        i20 = 1048575;
                        i19 = -1;
                        zzmlVar2 = this;
                    } else if (i28 == 2) {
                        zzli zzliVar = (zzli) unsafe6.getObject(obj2, j8);
                        if (!zzliVar.zzc()) {
                            int size = zzliVar.size();
                            zzliVar = zzliVar.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j8, zzliVar);
                        }
                        i21 = zzjo.zze(zzmlVar3.zzB(i13), b8, bArr, i10, i9, zzliVar, zzjnVar);
                        i18 = i9;
                        unsafe5 = unsafe6;
                        i24 = i24;
                        i23 = i13;
                        i25 = i33;
                        i22 = i12;
                        i20 = 1048575;
                        zzmlVar2 = zzmlVar3;
                        i19 = -1;
                    } else {
                        i15 = i10;
                        i16 = i24;
                        unsafe = unsafe6;
                        i17 = i33;
                    }
                    i11 = i15;
                    i24 = i16;
                    i25 = i17;
                    i21 = zzjo.zzi(b8, bArr, i11, i9, zzd(obj), zzjnVar);
                    obj2 = obj;
                    bArr2 = bArr;
                    i18 = i9;
                    zzjnVar2 = zzjnVar;
                    i23 = i13;
                    i22 = i12;
                    unsafe5 = unsafe;
                    i20 = 1048575;
                    i19 = -1;
                    zzmlVar2 = this;
                }
            }
            i21 = zzjo.zzi(b8, bArr, i11, i9, zzd(obj), zzjnVar);
            obj2 = obj;
            bArr2 = bArr;
            i18 = i9;
            zzjnVar2 = zzjnVar;
            i23 = i13;
            i22 = i12;
            unsafe5 = unsafe;
            i20 = 1048575;
            i19 = -1;
            zzmlVar2 = this;
        }
        int i35 = i24;
        Unsafe unsafe7 = unsafe5;
        if (i25 != 1048575) {
            unsafe7.putInt(obj, i25, i35);
        }
        if (i21 != i9) {
            throw zzll.zze();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final void zzi(Object obj, zzoc zzocVar) {
        int i8;
        int i9 = 1048575;
        if (this.zzi) {
            if (this.zzh) {
                this.zzo.zza(obj);
                throw null;
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzy = zzy(i10);
                int i11 = this.zzc[i10];
                switch (zzx(zzy)) {
                    case 0:
                        if (zzP(obj, i10)) {
                            zzocVar.zzf(i11, zznu.zza(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzP(obj, i10)) {
                            zzocVar.zzo(i11, zznu.zzb(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzP(obj, i10)) {
                            zzocVar.zzt(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzP(obj, i10)) {
                            zzocVar.zzJ(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzP(obj, i10)) {
                            zzocVar.zzr(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzP(obj, i10)) {
                            zzocVar.zzm(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzP(obj, i10)) {
                            zzocVar.zzk(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzP(obj, i10)) {
                            zzocVar.zzb(i11, zznu.zzw(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzP(obj, i10)) {
                            zzV(i11, zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzP(obj, i10)) {
                            zzocVar.zzv(i11, zznu.zzf(obj, zzy & 1048575), zzB(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzP(obj, i10)) {
                            zzocVar.zzd(i11, (zzka) zznu.zzf(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzP(obj, i10)) {
                            zzocVar.zzH(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzP(obj, i10)) {
                            zzocVar.zzi(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzP(obj, i10)) {
                            zzocVar.zzw(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzP(obj, i10)) {
                            zzocVar.zzy(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzP(obj, i10)) {
                            zzocVar.zzA(i11, zznu.zzc(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzP(obj, i10)) {
                            zzocVar.zzC(i11, zznu.zzd(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzP(obj, i10)) {
                            zzocVar.zzq(i11, zznu.zzf(obj, zzy & 1048575), zzB(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzmv.zzG(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 19:
                        zzmv.zzK(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 20:
                        zzmv.zzN(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 21:
                        zzmv.zzV(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 22:
                        zzmv.zzM(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 23:
                        zzmv.zzJ(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 24:
                        zzmv.zzI(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 25:
                        zzmv.zzE(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 26:
                        zzmv.zzT(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 27:
                        zzmv.zzO(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i10));
                        break;
                    case 28:
                        zzmv.zzF(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar);
                        break;
                    case 29:
                        zzmv.zzU(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 30:
                        zzmv.zzH(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 31:
                        zzmv.zzP(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 32:
                        zzmv.zzQ(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 33:
                        zzmv.zzR(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 34:
                        zzmv.zzS(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, false);
                        break;
                    case 35:
                        zzmv.zzG(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 36:
                        zzmv.zzK(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 37:
                        zzmv.zzN(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 38:
                        zzmv.zzV(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 39:
                        zzmv.zzM(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 40:
                        zzmv.zzJ(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 41:
                        zzmv.zzI(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 42:
                        zzmv.zzE(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 43:
                        zzmv.zzU(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 44:
                        zzmv.zzH(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 45:
                        zzmv.zzP(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 46:
                        zzmv.zzQ(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 47:
                        zzmv.zzR(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 48:
                        zzmv.zzS(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, true);
                        break;
                    case 49:
                        zzmv.zzL(i11, (List) zznu.zzf(obj, zzy & 1048575), zzocVar, zzB(i10));
                        break;
                    case 50:
                        zzN(zzocVar, i11, zznu.zzf(obj, zzy & 1048575), i10);
                        break;
                    case 51:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzf(i11, zzm(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzo(i11, zzn(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzt(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzJ(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzr(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzm(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzk(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzb(i11, zzU(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i11, i10)) {
                            zzV(i11, zznu.zzf(obj, zzy & 1048575), zzocVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzv(i11, zznu.zzf(obj, zzy & 1048575), zzB(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzd(i11, (zzka) zznu.zzf(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzH(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzi(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzw(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzy(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzA(i11, zzp(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzC(i11, zzz(obj, zzy & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i11, i10)) {
                            zzocVar.zzq(i11, zznu.zzf(obj, zzy & 1048575), zzB(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zznk zznkVar = this.zzn;
            zznkVar.zzi(zznkVar.zzd(obj), zzocVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length2 = this.zzc.length;
        Unsafe unsafe = zzb;
        int i12 = 0;
        int i13 = 1048575;
        int i14 = 0;
        while (i12 < length2) {
            int zzy2 = zzy(i12);
            int[] iArr = this.zzc;
            int i15 = iArr[i12];
            int zzx = zzx(zzy2);
            if (zzx <= 17) {
                int i16 = iArr[i12 + 2];
                int i17 = i16 & i9;
                if (i17 != i13) {
                    i14 = unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i8 = 1 << (i16 >>> 20);
            } else {
                i8 = 0;
            }
            long j8 = zzy2 & i9;
            switch (zzx) {
                case 0:
                    if ((i14 & i8) == 0) {
                        break;
                    } else {
                        zzocVar.zzf(i15, zznu.zza(obj, j8));
                        continue;
                    }
                case 1:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzo(i15, zznu.zzb(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzt(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzJ(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzr(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzm(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzk(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzb(i15, zznu.zzw(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i14 & i8) != 0) {
                        zzV(i15, unsafe.getObject(obj, j8), zzocVar);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzv(i15, unsafe.getObject(obj, j8), zzB(i12));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzd(i15, (zzka) unsafe.getObject(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzH(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzi(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzw(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzy(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzA(i15, unsafe.getInt(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzC(i15, unsafe.getLong(obj, j8));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i14 & i8) != 0) {
                        zzocVar.zzq(i15, unsafe.getObject(obj, j8), zzB(i12));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzmv.zzG(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    continue;
                case 19:
                    zzmv.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    continue;
                case 20:
                    zzmv.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    continue;
                case 21:
                    zzmv.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    continue;
                case 22:
                    zzmv.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    continue;
                case 23:
                    zzmv.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    continue;
                case 24:
                    zzmv.zzI(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    continue;
                case 25:
                    zzmv.zzE(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    continue;
                case 26:
                    zzmv.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar);
                    break;
                case 27:
                    zzmv.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, zzB(i12));
                    break;
                case 28:
                    zzmv.zzF(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar);
                    break;
                case 29:
                    zzmv.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    break;
                case 30:
                    zzmv.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    break;
                case 31:
                    zzmv.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    break;
                case 32:
                    zzmv.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    break;
                case 33:
                    zzmv.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    break;
                case 34:
                    zzmv.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, false);
                    break;
                case 35:
                    zzmv.zzG(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 36:
                    zzmv.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 37:
                    zzmv.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 38:
                    zzmv.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 39:
                    zzmv.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 40:
                    zzmv.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 41:
                    zzmv.zzI(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 42:
                    zzmv.zzE(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 43:
                    zzmv.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 44:
                    zzmv.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 45:
                    zzmv.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 46:
                    zzmv.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 47:
                    zzmv.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 48:
                    zzmv.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, true);
                    break;
                case 49:
                    zzmv.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j8), zzocVar, zzB(i12));
                    break;
                case 50:
                    zzN(zzocVar, i15, unsafe.getObject(obj, j8), i12);
                    break;
                case 51:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzf(i15, zzm(obj, j8));
                        break;
                    }
                    break;
                case 52:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzo(i15, zzn(obj, j8));
                        break;
                    }
                    break;
                case 53:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzt(i15, zzz(obj, j8));
                        break;
                    }
                    break;
                case 54:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzJ(i15, zzz(obj, j8));
                        break;
                    }
                    break;
                case 55:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzr(i15, zzp(obj, j8));
                        break;
                    }
                    break;
                case 56:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzm(i15, zzz(obj, j8));
                        break;
                    }
                    break;
                case 57:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzk(i15, zzp(obj, j8));
                        break;
                    }
                    break;
                case 58:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzb(i15, zzU(obj, j8));
                        break;
                    }
                    break;
                case 59:
                    if (zzT(obj, i15, i12)) {
                        zzV(i15, unsafe.getObject(obj, j8), zzocVar);
                        break;
                    }
                    break;
                case 60:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzv(i15, unsafe.getObject(obj, j8), zzB(i12));
                        break;
                    }
                    break;
                case 61:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzd(i15, (zzka) unsafe.getObject(obj, j8));
                        break;
                    }
                    break;
                case 62:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzH(i15, zzp(obj, j8));
                        break;
                    }
                    break;
                case 63:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzi(i15, zzp(obj, j8));
                        break;
                    }
                    break;
                case 64:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzw(i15, zzp(obj, j8));
                        break;
                    }
                    break;
                case 65:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzy(i15, zzz(obj, j8));
                        break;
                    }
                    break;
                case 66:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzA(i15, zzp(obj, j8));
                        break;
                    }
                    break;
                case 67:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzC(i15, zzz(obj, j8));
                        break;
                    }
                    break;
                case 68:
                    if (zzT(obj, i15, i12)) {
                        zzocVar.zzq(i15, unsafe.getObject(obj, j8), zzB(i12));
                        break;
                    }
                    break;
            }
            i12 += 3;
            i9 = 1048575;
        }
        zznk zznkVar2 = this.zzn;
        zznkVar2.zzi(zznkVar2.zzd(obj), zzocVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzW;
        int length = this.zzc.length;
        for (int i8 = 0; i8 < length; i8 += 3) {
            int zzy = zzy(i8);
            long j8 = zzy & 1048575;
            switch (zzx(zzy)) {
                case 0:
                    if (zzO(obj, obj2, i8) && Double.doubleToLongBits(zznu.zza(obj, j8)) == Double.doubleToLongBits(zznu.zza(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i8) && Float.floatToIntBits(zznu.zzb(obj, j8)) == Float.floatToIntBits(zznu.zzb(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i8) && zznu.zzd(obj, j8) == zznu.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i8) && zznu.zzd(obj, j8) == zznu.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i8) && zznu.zzc(obj, j8) == zznu.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i8) && zznu.zzd(obj, j8) == zznu.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i8) && zznu.zzc(obj, j8) == zznu.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i8) && zznu.zzw(obj, j8) == zznu.zzw(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i8) && zzmv.zzW(zznu.zzf(obj, j8), zznu.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i8) && zzmv.zzW(zznu.zzf(obj, j8), zznu.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i8) && zzmv.zzW(zznu.zzf(obj, j8), zznu.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i8) && zznu.zzc(obj, j8) == zznu.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i8) && zznu.zzc(obj, j8) == zznu.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i8) && zznu.zzc(obj, j8) == zznu.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i8) && zznu.zzd(obj, j8) == zznu.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i8) && zznu.zzc(obj, j8) == zznu.zzc(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i8) && zznu.zzd(obj, j8) == zznu.zzd(obj2, j8)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i8) && zzmv.zzW(zznu.zzf(obj, j8), zznu.zzf(obj2, j8))) {
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
                    zzW = zzmv.zzW(zznu.zzf(obj, j8), zznu.zzf(obj2, j8));
                    break;
                case 50:
                    zzW = zzmv.zzW(zznu.zzf(obj, j8), zznu.zzf(obj2, j8));
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
                    long zzv = zzv(i8) & 1048575;
                    if (zznu.zzc(obj, zzv) == zznu.zzc(obj2, zzv) && zzmv.zzW(zznu.zzf(obj, j8), zznu.zzf(obj2, j8))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzW) {
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

    @Override // com.google.android.gms.internal.measurement.zzmt
    public final boolean zzk(Object obj) {
        int i8;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.zzk) {
            int i13 = this.zzj[i12];
            int i14 = this.zzc[i13];
            int zzy = zzy(i13);
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
            if ((268435456 & zzy) != 0 && !zzQ(obj, i13, i8, i9, i17)) {
                return false;
            }
            int zzx = zzx(zzy);
            if (zzx != 9 && zzx != 17) {
                if (zzx != 27) {
                    if (zzx == 60 || zzx == 68) {
                        if (zzT(obj, i14, i13) && !zzR(obj, zzy, zzB(i13))) {
                            return false;
                        }
                    } else if (zzx != 49) {
                        if (zzx == 50 && !((zzmc) zznu.zzf(obj, zzy & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zznu.zzf(obj, zzy & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzmt zzB = zzB(i13);
                    for (int i18 = 0; i18 < list.size(); i18++) {
                        if (!zzB.zzk(list.get(i18))) {
                            return false;
                        }
                    }
                }
            } else if (zzQ(obj, i13, i8, i9, i17) && !zzR(obj, zzy, zzB(i13))) {
                return false;
            }
            i12++;
            i10 = i8;
            i11 = i9;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
