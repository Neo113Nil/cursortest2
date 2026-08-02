package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzgzm<T> implements zzhae<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhaz.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgzj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhas zzm;
    private final zzgxj zzn;

    private zzgzm(int[] iArr, Object[] objArr, int i, int i2, zzgzj zzgzjVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzgzp zzgzpVar, zzgyw zzgywVar, zzhas zzhasVar, zzgxj zzgxjVar, zzgze zzgzeVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgzjVar instanceof zzgxy;
        boolean z2 = false;
        if (zzgxjVar != null && (zzgzjVar instanceof zzgxu)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzm = zzhasVar;
        this.zzn = zzgxjVar;
        this.zzg = zzgzjVar;
    }

    private final Object zzA(Object obj, int i) {
        zzhae zzx = zzx(i);
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
        zzhae zzx = zzx(i2);
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
            zzhae zzx = zzx(i);
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
            zzhae zzx = zzx(i);
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

    private final void zzG(Object obj, int i, zzgzw zzgzwVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzhaz.zzv(obj, j, zzgzwVar.zzs());
        } else if (this.zzi) {
            zzhaz.zzv(obj, j, zzgzwVar.zzr());
        } else {
            zzhaz.zzv(obj, j, zzgzwVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzhaz.zzt(obj, j, (1 << (zzr >>> 20)) | zzhaz.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzhaz.zzt(obj, zzr(i2) & 1048575, i);
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
        return (i & DriveFile.MODE_WRITE_ONLY) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j != 1048575) {
            return (zzhaz.zzd(obj, j) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i);
        long j2 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhaz.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhaz.zzc(obj, j2)) != 0;
            case 2:
                return zzhaz.zzf(obj, j2) != 0;
            case 3:
                return zzhaz.zzf(obj, j2) != 0;
            case 4:
                return zzhaz.zzd(obj, j2) != 0;
            case 5:
                return zzhaz.zzf(obj, j2) != 0;
            case 6:
                return zzhaz.zzd(obj, j2) != 0;
            case 7:
                return zzhaz.zzz(obj, j2);
            case 8:
                Object zzh = zzhaz.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                }
                if (zzh instanceof zzgwm) {
                    return !zzgwm.zzb.equals(zzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhaz.zzh(obj, j2) != null;
            case 10:
                return !zzgwm.zzb.equals(zzhaz.zzh(obj, j2));
            case 11:
                return zzhaz.zzd(obj, j2) != 0;
            case 12:
                return zzhaz.zzd(obj, j2) != 0;
            case 13:
                return zzhaz.zzd(obj, j2) != 0;
            case 14:
                return zzhaz.zzf(obj, j2) != 0;
            case 15:
                return zzhaz.zzd(obj, j2) != 0;
            case 16:
                return zzhaz.zzf(obj, j2) != 0;
            case 17:
                return zzhaz.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzhae zzhaeVar) {
        return zzhaeVar.zzl(zzhaz.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgxy) {
            return ((zzgxy) obj).zzcf();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzhaz.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhaz.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzhbh zzhbhVar) throws IOException {
        if (obj instanceof String) {
            zzhbhVar.zzG(i, (String) obj);
        } else {
            zzhbhVar.zzd(i, (zzgwm) obj);
        }
    }

    static zzhat zzd(Object obj) {
        zzgxy zzgxyVar = (zzgxy) obj;
        zzhat zzhatVar = zzgxyVar.zzt;
        if (zzhatVar != zzhat.zzc()) {
            return zzhatVar;
        }
        zzhat zzf = zzhat.zzf();
        zzgxyVar.zzt = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzgzm zzm(Class cls, zzgzg zzgzgVar, zzgzp zzgzpVar, zzgyw zzgywVar, zzhas zzhasVar, zzgxj zzgxjVar, zzgze zzgzeVar) {
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
        zzgzv zzgzvVar;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzC;
        char charAt11;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        if (!(zzgzgVar instanceof zzgzv)) {
            throw null;
        }
        zzgzv zzgzvVar2 = (zzgzv) zzgzgVar;
        String zzd = zzgzvVar2.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i = i32 + 1;
                if (zzd.charAt(i32) < 55296) {
                    break;
                }
                i32 = i;
            }
        } else {
            i = 1;
        }
        int i33 = i + 1;
        int charAt16 = zzd.charAt(i);
        if (charAt16 >= 55296) {
            int i34 = charAt16 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                charAt15 = zzd.charAt(i33);
                if (charAt15 < 55296) {
                    break;
                }
                i34 |= (charAt15 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            charAt16 = i34 | (charAt15 << i35);
            i33 = i31;
        }
        if (charAt16 == 0) {
            iArr = zza;
            i5 = 0;
            charAt = 0;
            charAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
        } else {
            int i36 = i33 + 1;
            int charAt17 = zzd.charAt(i33);
            if (charAt17 >= 55296) {
                int i37 = charAt17 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    charAt10 = zzd.charAt(i36);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i37 |= (charAt10 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                charAt17 = i37 | (charAt10 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int charAt18 = zzd.charAt(i36);
            if (charAt18 >= 55296) {
                int i40 = charAt18 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    charAt9 = zzd.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                charAt18 = i40 | (charAt9 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            int charAt19 = zzd.charAt(i39);
            if (charAt19 >= 55296) {
                int i43 = charAt19 & 8191;
                int i44 = 13;
                while (true) {
                    i12 = i42 + 1;
                    charAt8 = zzd.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i12;
                }
                charAt19 = i43 | (charAt8 << i44);
                i42 = i12;
            }
            int i45 = i42 + 1;
            int charAt20 = zzd.charAt(i42);
            if (charAt20 >= 55296) {
                int i46 = charAt20 & 8191;
                int i47 = 13;
                while (true) {
                    i11 = i45 + 1;
                    charAt7 = zzd.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i11;
                }
                charAt20 = i46 | (charAt7 << i47);
                i45 = i11;
            }
            int i48 = i45 + 1;
            charAt = zzd.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i10 = i48 + 1;
                    charAt6 = zzd.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i10;
                }
                charAt = i49 | (charAt6 << i50);
                i48 = i10;
            }
            int i51 = i48 + 1;
            charAt2 = zzd.charAt(i48);
            if (charAt2 >= 55296) {
                int i52 = charAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i9 = i51 + 1;
                    charAt5 = zzd.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i9;
                }
                charAt2 = i52 | (charAt5 << i53);
                i51 = i9;
            }
            int i54 = i51 + 1;
            int charAt21 = zzd.charAt(i51);
            if (charAt21 >= 55296) {
                int i55 = charAt21 & 8191;
                int i56 = 13;
                while (true) {
                    i8 = i54 + 1;
                    charAt4 = zzd.charAt(i54);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i56;
                    i56 += 13;
                    i54 = i8;
                }
                charAt21 = i55 | (charAt4 << i56);
                i54 = i8;
            }
            int i57 = i54 + 1;
            int charAt22 = zzd.charAt(i54);
            if (charAt22 >= 55296) {
                int i58 = charAt22 & 8191;
                int i59 = 13;
                while (true) {
                    i7 = i57 + 1;
                    charAt3 = zzd.charAt(i57);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i58 |= (charAt3 & 8191) << i59;
                    i59 += 13;
                    i57 = i7;
                }
                charAt22 = i58 | (charAt3 << i59);
                i57 = i7;
            }
            i2 = charAt17 + charAt17 + charAt18;
            iArr = new int[charAt22 + charAt2 + charAt21];
            i3 = charAt19;
            i4 = charAt22;
            i5 = charAt17;
            i6 = charAt20;
            i33 = i57;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzgzvVar2.zze();
        Class<?> cls2 = zzgzvVar2.zza().getClass();
        int i60 = i4 + charAt2;
        int i61 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr = new Object[i61];
        int i62 = i4;
        int i63 = i60;
        int i64 = 0;
        int i65 = 0;
        while (i33 < length) {
            int i66 = i33 + 1;
            int charAt23 = zzd.charAt(i33);
            if (charAt23 >= c) {
                int i67 = charAt23 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i30 = i68 + 1;
                    charAt14 = zzd.charAt(i68);
                    if (charAt14 < c) {
                        break;
                    }
                    i67 |= (charAt14 & 8191) << i69;
                    i69 += 13;
                    i68 = i30;
                }
                charAt23 = i67 | (charAt14 << i69);
                i15 = i30;
            } else {
                i15 = i66;
            }
            int i70 = i15 + 1;
            int charAt24 = zzd.charAt(i15);
            if (charAt24 >= c) {
                int i71 = charAt24 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i29 = i72 + 1;
                    charAt13 = zzd.charAt(i72);
                    if (charAt13 < c) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i29;
                }
                charAt24 = i71 | (charAt13 << i73);
                i16 = i29;
            } else {
                i16 = i70;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i65;
                i64++;
            }
            int i74 = charAt24 & 255;
            int i75 = charAt24 & 2048;
            int i76 = length;
            if (i74 >= 51) {
                int i77 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i78 = 13;
                    int i79 = charAt25 & 8191;
                    int i80 = i77;
                    while (true) {
                        i28 = i80 + 1;
                        charAt12 = zzd.charAt(i80);
                        if (charAt12 < c2) {
                            break;
                        }
                        i79 |= (charAt12 & 8191) << i78;
                        i78 += 13;
                        i80 = i28;
                        c2 = 55296;
                    }
                    charAt25 = i79 | (charAt12 << i78);
                    i26 = i28;
                } else {
                    i26 = i77;
                }
                int i81 = i26;
                int i82 = i74 - 51;
                i18 = i6;
                if (i82 == 9 || i82 == 17) {
                    i27 = i2 + 1;
                    int i83 = i65 / 3;
                    objArr[i83 + i83 + 1] = zze[i2];
                } else {
                    if (i82 == 12) {
                        if (zzgzvVar2.zzc() == 1 || i75 != 0) {
                            i27 = i2 + 1;
                            int i84 = i65 / 3;
                            objArr[i84 + i84 + 1] = zze[i2];
                        } else {
                            i75 = 0;
                        }
                    }
                    int i85 = charAt25 + charAt25;
                    obj = zze[i85];
                    if (obj instanceof Field) {
                        zzC2 = zzC(cls2, (String) obj);
                        zze[i85] = zzC2;
                    } else {
                        zzC2 = (Field) obj;
                    }
                    i17 = i3;
                    i23 = (int) unsafe.objectFieldOffset(zzC2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    if (obj2 instanceof Field) {
                        zzC3 = zzC(cls2, (String) obj2);
                        zze[i86] = zzC3;
                    } else {
                        zzC3 = (Field) obj2;
                    }
                    zzgzvVar = zzgzvVar2;
                    str = zzd;
                    i22 = i2;
                    i20 = i81;
                    i19 = (int) unsafe.objectFieldOffset(zzC3);
                    i21 = 0;
                }
                i2 = i27;
                int i852 = charAt25 + charAt25;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                i17 = i3;
                i23 = (int) unsafe.objectFieldOffset(zzC2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                if (obj2 instanceof Field) {
                }
                zzgzvVar = zzgzvVar2;
                str = zzd;
                i22 = i2;
                i20 = i81;
                i19 = (int) unsafe.objectFieldOffset(zzC3);
                i21 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i87 = i2 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i2]);
                if (i74 == 9 || i74 == 17) {
                    zzgzvVar = zzgzvVar2;
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = zzC4.getType();
                } else {
                    if (i74 == 27) {
                        zzgzvVar = zzgzvVar2;
                        i24 = 1;
                        i25 = i2 + 2;
                    } else if (i74 == 49) {
                        i25 = i2 + 2;
                        zzgzvVar = zzgzvVar2;
                        i24 = 1;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        zzgzvVar = zzgzvVar2;
                        if (zzgzvVar2.zzc() == 1 || i75 != 0) {
                            i25 = i2 + 2;
                            int i89 = i65 / 3;
                            objArr[i89 + i89 + 1] = zze[i87];
                            i87 = i25;
                        } else {
                            i75 = 0;
                        }
                    } else {
                        if (i74 == 50) {
                            int i90 = i2 + 2;
                            int i91 = i62 + 1;
                            iArr[i62] = i65;
                            int i92 = i65 / 3;
                            int i93 = i92 + i92;
                            objArr[i93] = zze[i87];
                            if (i75 != 0) {
                                i87 = i2 + 3;
                                objArr[i93 + 1] = zze[i90];
                                i62 = i91;
                            } else {
                                i87 = i90;
                                i62 = i91;
                                i75 = 0;
                            }
                        }
                        zzgzvVar = zzgzvVar2;
                    }
                    int i94 = i65 / 3;
                    objArr[i94 + i94 + i24] = zze[i87];
                    i87 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                i19 = 1048575;
                if ((charAt24 & 4096) == 0 || i74 > 17) {
                    str = zzd;
                    i20 = i16;
                    i21 = 0;
                } else {
                    int i95 = i16 + 1;
                    int charAt26 = zzd.charAt(i16);
                    if (charAt26 >= 55296) {
                        int i96 = charAt26 & 8191;
                        int i97 = 13;
                        while (true) {
                            i20 = i95 + 1;
                            charAt11 = zzd.charAt(i95);
                            if (charAt11 < 55296) {
                                break;
                            }
                            i96 |= (charAt11 & 8191) << i97;
                            i97 += 13;
                            i95 = i20;
                        }
                        charAt26 = i96 | (charAt11 << i97);
                    } else {
                        i20 = i95;
                    }
                    int i98 = i5 + i5 + (charAt26 / 32);
                    Object obj3 = zze[i98];
                    str = zzd;
                    if (obj3 instanceof Field) {
                        zzC = (Field) obj3;
                    } else {
                        zzC = zzC(cls2, (String) obj3);
                        zze[i98] = zzC;
                    }
                    i21 = charAt26 % 32;
                    i19 = (int) unsafe.objectFieldOffset(zzC);
                }
                if (i74 >= 18 && i74 <= 49) {
                    iArr[i63] = objectFieldOffset;
                    i63++;
                }
                i22 = i87;
                i23 = objectFieldOffset;
            }
            int i99 = i65 + 1;
            iArr2[i65] = charAt23;
            int i100 = i65 + 2;
            iArr2[i99] = i23 | ((charAt24 & 256) != 0 ? DriveFile.MODE_READ_ONLY : 0) | ((charAt24 & 512) != 0 ? DriveFile.MODE_WRITE_ONLY : 0) | (i75 != 0 ? Integer.MIN_VALUE : 0) | (i74 << 20);
            i65 += 3;
            iArr2[i100] = (i21 << 20) | i19;
            i2 = i22;
            i33 = i20;
            length = i76;
            zzgzvVar2 = zzgzvVar;
            zzd = str;
            i6 = i18;
            i3 = i17;
            c = 55296;
        }
        zzgzv zzgzvVar3 = zzgzvVar2;
        return new zzgzm(iArr2, objArr, i3, i6, zzgzvVar3.zza(), zzgzvVar3.zzc(), false, iArr, i4, i60, zzgzpVar, zzgywVar, zzhasVar, zzgxjVar, zzgzeVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhaz.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhaz.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhaz.zzh(obj, j)).intValue();
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
        return ((Long) zzhaz.zzh(obj, j)).longValue();
    }

    private final zzgye zzw(int i) {
        int i2 = i / 3;
        return (zzgye) this.zzd[i2 + i2 + 1];
    }

    private final zzhae zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhae zzhaeVar = (zzhae) objArr[i3];
        if (zzhaeVar != null) {
            return zzhaeVar;
        }
        zzhae zzb2 = zzgzt.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhas zzhasVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzh = zzhaz.zzh(obj, zzu(i) & 1048575);
        if (zzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int zzD;
        int zzD2;
        int zzD3;
        int zzE;
        int zzD4;
        int zzD5;
        int zzd;
        int zzD6;
        int zzh;
        int zzg;
        int size;
        int zzD7;
        int zzD8;
        int zzD9;
        int zze;
        int zzD10;
        int zzD11;
        int i4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.zzc.length) {
            int zzu = zzu(i8);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i5;
            if (zzt <= 17) {
                if (i12 != i6) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(obj, i12);
                    i6 = i12;
                }
                i = i6;
                i2 = i7;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            int i13 = zzu & i5;
            if (zzt >= zzgxo.DOUBLE_LIST_PACKED.zza()) {
                zzgxo.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzgxd.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 1:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzgxd.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 2:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE(j2);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 3:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE(j3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 4:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE(j4);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 5:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzgxd.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 6:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzgxd.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 7:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD4 = zzgxd.zzD(i10 << 3);
                        zzh = zzD4 + 1;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 8:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgwm) {
                            zzD5 = zzgxd.zzD(i14);
                            zzd = ((zzgwm) object).zzd();
                            zzD6 = zzgxd.zzD(zzd);
                            zzh = zzD5 + zzD6 + zzd;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        } else {
                            zzD3 = zzgxd.zzD(i14);
                            zzE = zzgxd.zzC((String) object);
                            zzh = zzD3 + zzE;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 9:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzh = zzhag.zzh(i10, unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 10:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzgwm zzgwmVar = (zzgwm) unsafe.getObject(obj, j);
                        zzD5 = zzgxd.zzD(i10 << 3);
                        zzd = zzgwmVar.zzd();
                        zzD6 = zzgxd.zzD(zzd);
                        zzh = zzD5 + zzD6 + zzd;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 11:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzD(i15);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 12:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE(j5);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 13:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD2 = zzgxd.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 14:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzD = zzgxd.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 15:
                    if (zzO(obj, i8, i, i2, i3)) {
                        int i16 = unsafe.getInt(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzD((i16 >> 31) ^ (i16 + i16));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 16:
                    if (zzO(obj, i8, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE((j6 >> 63) ^ (j6 + j6));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 17:
                    if (zzO(obj, i8, i, i2, i3)) {
                        zzh = zzgxd.zzy(i10, (zzgzj) unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 18:
                    zzh = zzhag.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 19:
                    zzh = zzhag.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzhag.zza;
                    if (list.size() != 0) {
                        zzg = zzhag.zzg(list) + (list.size() * zzgxd.zzD(i10 << 3));
                        i9 += zzg;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzg = 0;
                    i9 += zzg;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i18 = zzhag.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzD3 = zzhag.zzl(list2);
                        zzD7 = zzgxd.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i19 = zzhag.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzD3 = zzhag.zzf(list3);
                        zzD7 = zzgxd.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 23:
                    zzh = zzhag.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 24:
                    zzh = zzhag.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i20 = zzhag.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzgxd.zzD(i10 << 3) + 1);
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i21 = zzhag.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzgxd.zzD(i10 << 3) * size3;
                        if (list5 instanceof zzgyv) {
                            zzgyv zzgyvVar = (zzgyv) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzc = zzgyvVar.zzc();
                                if (zzc instanceof zzgwm) {
                                    int zzd2 = ((zzgwm) zzc).zzd();
                                    zzg += zzgxd.zzD(zzd2) + zzd2;
                                } else {
                                    zzg += zzgxd.zzC((String) zzc);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj2 = list5.get(i23);
                                if (obj2 instanceof zzgwm) {
                                    int zzd3 = ((zzgwm) obj2).zzd();
                                    zzg += zzgxd.zzD(zzd3) + zzd3;
                                } else {
                                    zzg += zzgxd.zzC((String) obj2);
                                }
                            }
                        }
                        i9 += zzg;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzg = 0;
                    i9 += zzg;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzhae zzx = zzx(i8);
                    int i24 = zzhag.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzD8 = 0;
                    } else {
                        zzD8 = zzgxd.zzD(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj3 = list6.get(i25);
                            if (obj3 instanceof zzgyu) {
                                int zza2 = ((zzgyu) obj3).zza();
                                zzD8 += zzgxd.zzD(zza2) + zza2;
                            } else {
                                zzD8 += zzgxd.zzA((zzgzj) obj3, zzx);
                            }
                        }
                    }
                    i9 += zzD8;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i26 = zzhag.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzD9 = 0;
                    } else {
                        zzD9 = size5 * zzgxd.zzD(i10 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd4 = ((zzgwm) list7.get(i27)).zzd();
                            zzD9 += zzgxd.zzD(zzd4) + zzd4;
                        }
                    }
                    i9 += zzD9;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i28 = zzhag.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzD3 = zzhag.zzk(list8);
                        zzD7 = zzgxd.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i29 = zzhag.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzD3 = zzhag.zza(list9);
                        zzD7 = zzgxd.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    zzh = zzhag.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 32:
                    zzh = zzhag.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i30 = zzhag.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzD3 = zzhag.zzi(list10);
                        zzD7 = zzgxd.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i31 = zzhag.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzD3 = zzhag.zzj(list11);
                        zzD7 = zzgxd.zzD(i10 << 3);
                        zzE = size * zzD7;
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 35:
                    zze = zzhag.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 36:
                    zze = zzhag.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 37:
                    zze = zzhag.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 38:
                    zze = zzhag.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 39:
                    zze = zzhag.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 40:
                    zze = zzhag.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 41:
                    zze = zzhag.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i32 = zzhag.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 43:
                    zze = zzhag.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 44:
                    zze = zzhag.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 45:
                    zze = zzhag.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 46:
                    zze = zzhag.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 47:
                    zze = zzhag.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zze = zzhag.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzD10 = zzgxd.zzD(i10 << 3);
                        zzD11 = zzgxd.zzD(zze);
                        zzD9 = zzD10 + zzD11 + zze;
                        i9 += zzD9;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzhae zzx2 = zzx(i8);
                    int i33 = zzhag.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i4 += zzgxd.zzy(i10, (zzgzj) list13.get(i34), zzx2);
                        }
                    }
                    i9 += i4;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 50:
                    zzgzd zzgzdVar = (zzgzd) unsafe.getObject(obj, j);
                    if (zzgzdVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgzdVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzgxd.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzgxd.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i10, i8)) {
                        long zzv = zzv(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE(zzv);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i10, i8)) {
                        long zzv2 = zzv(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE(zzv2);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i10, i8)) {
                        long zzp = zzp(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE(zzp);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 56:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzgxd.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 57:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzgxd.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 58:
                    if (zzR(obj, i10, i8)) {
                        zzD4 = zzgxd.zzD(i10 << 3);
                        zzh = zzD4 + 1;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 59:
                    if (zzR(obj, i10, i8)) {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgwm) {
                            zzD5 = zzgxd.zzD(i35);
                            zzd = ((zzgwm) object2).zzd();
                            zzD6 = zzgxd.zzD(zzd);
                            zzh = zzD5 + zzD6 + zzd;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        } else {
                            zzD3 = zzgxd.zzD(i35);
                            zzE = zzgxd.zzC((String) object2);
                            zzh = zzD3 + zzE;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i10, i8)) {
                        zzh = zzhag.zzh(i10, unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i10, i8)) {
                        zzgwm zzgwmVar2 = (zzgwm) unsafe.getObject(obj, j);
                        zzD5 = zzgxd.zzD(i10 << 3);
                        zzd = zzgwmVar2.zzd();
                        zzD6 = zzgxd.zzD(zzd);
                        zzh = zzD5 + zzD6 + zzd;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 62:
                    if (zzR(obj, i10, i8)) {
                        int zzp2 = zzp(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzD(zzp2);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i10, i8)) {
                        long zzp3 = zzp(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE(zzp3);
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 64:
                    if (zzR(obj, i10, i8)) {
                        zzD2 = zzgxd.zzD(i10 << 3);
                        zzh = zzD2 + 4;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 65:
                    if (zzR(obj, i10, i8)) {
                        zzD = zzgxd.zzD(i10 << 3);
                        zzh = zzD + 8;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i10, i8)) {
                        int zzp4 = zzp(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzD((zzp4 >> 31) ^ (zzp4 + zzp4));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i10, i8)) {
                        long zzv3 = zzv(obj, j);
                        zzD3 = zzgxd.zzD(i10 << 3);
                        zzE = zzgxd.zzE((zzv3 >> 63) ^ (zzv3 + zzv3));
                        zzh = zzD3 + zzE;
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                case 68:
                    if (zzR(obj, i10, i8)) {
                        zzh = zzgxd.zzy(i10, (zzgzj) unsafe.getObject(obj, j), zzx(i8));
                        i9 += zzh;
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    } else {
                        i8 += 3;
                        i6 = i;
                        i7 = i2;
                        z = false;
                        i5 = 1048575;
                    }
                default:
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
            }
        }
        int zza3 = i9 + ((zzgxy) obj).zzt.zza();
        if (!this.zzh) {
            return zza3;
        }
        zzgxn zzgxnVar = ((zzgxu) obj).zza;
        int i36 = 0;
        for (int i37 = 0; i37 < zzgxnVar.zza.zzb(); i37++) {
            Map.Entry zzg2 = zzgxnVar.zza.zzg(i37);
            i36 += zzgxn.zzc((zzgxm) zzg2.getKey(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzgxnVar.zza.zzc()) {
            i36 += zzgxn.zzc((zzgxm) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i36;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzt) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhaz.zzb(obj, j));
                    byte[] bArr = zzgyl.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhaz.zzc(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j);
                    byte[] bArr2 = zzgyl.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j);
                    byte[] bArr3 = zzgyl.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j);
                    byte[] bArr4 = zzgyl.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzgyl.zza(zzhaz.zzz(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzhaz.zzh(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzh = zzhaz.zzh(obj, j);
                    if (zzh != null) {
                        i8 = zzh.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzh(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j);
                    byte[] bArr5 = zzgyl.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzd(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzhaz.zzf(obj, j);
                    byte[] bArr6 = zzgyl.zzb;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzh2 = zzhaz.zzh(obj, j);
                    if (zzh2 != null) {
                        i8 = zzh2.hashCode();
                    }
                    i4 = i3 + i8;
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzh(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzhaz.zzh(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzgyl.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzgyl.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzgyl.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzgyl.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzgyl.zza(zzS(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzhaz.zzh(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhaz.zzh(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhaz.zzh(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzgyl.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzp(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzgyl.zzb;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzhaz.zzh(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + ((zzgxy) obj).zzt.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzgxu) obj).zza.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0b67, code lost:
    
        if (r5 == r0) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0b69, code lost:
    
        r14.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0b6d, code lost:
    
        r11 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0b72, code lost:
    
        if (r11 >= r12.zzl) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0b74, code lost:
    
        zzy(r34, r12.zzj[r11], null, r12.zzm, r34);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0b87, code lost:
    
        if (r9 != 0) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0b89, code lost:
    
        if (r6 != r10) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0b90, code lost:
    
        throw com.google.android.gms.internal.ads.zzgyn.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0b95, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0b91, code lost:
    
        if (r6 > r10) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0b93, code lost:
    
        if (r8 != r9) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0b9a, code lost:
    
        throw com.google.android.gms.internal.ads.zzgyn.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0af1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0836 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0846 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgwa zzgwaVar) throws IOException {
        zzgzm<T> zzgzmVar;
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
        Unsafe unsafe2;
        zzgwa zzgwaVar2;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe3;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzk;
        int i20;
        int i21;
        int i22;
        Unsafe unsafe4;
        int i23;
        int i24;
        int i25;
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
        zzgzm<T> zzgzmVar2 = this;
        Object obj3 = obj;
        int i43 = i2;
        int i44 = i3;
        zzgwa zzgwaVar3 = zzgwaVar;
        zzD(obj);
        Unsafe unsafe8 = zzb;
        int i45 = -1;
        int i46 = i;
        int i47 = -1;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 1048575;
        while (true) {
            if (i46 < i43) {
                int i52 = i46 + 1;
                int i53 = bArr[i46];
                if (i53 < 0) {
                    int zzi = zzgwb.zzi(i53, bArr, i52, zzgwaVar3);
                    i9 = zzgwaVar3.zza;
                    i52 = zzi;
                } else {
                    i9 = i53;
                }
                int i54 = i9 >>> 3;
                if (i54 > i47) {
                    zzq = (i54 < zzgzmVar2.zze || i54 > zzgzmVar2.zzf) ? -1 : zzgzmVar2.zzs(i54, i48 / 3);
                } else {
                    zzq = zzgzmVar2.zzq(i54);
                }
                int i55 = zzq;
                if (i55 != i45) {
                    int i56 = i9 & 7;
                    int[] iArr = zzgzmVar2.zzc;
                    int i57 = iArr[i55 + 1];
                    int i58 = i54;
                    int zzt = zzt(i57);
                    long j2 = i57 & 1048575;
                    int i59 = i9;
                    if (zzt > 17) {
                        i11 = i50;
                        i12 = i51;
                        Unsafe unsafe9 = unsafe8;
                        if (zzt != 27) {
                            unsafe2 = unsafe9;
                            if (zzt > 49) {
                                i25 = i55;
                                i24 = i58;
                                i23 = i52;
                                if (zzt != 50) {
                                    i49 = i59;
                                    obj3 = obj;
                                    Unsafe unsafe10 = zzb;
                                    long j3 = iArr[i25 + 2] & 1048575;
                                    switch (zzt) {
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 1) {
                                                i46 = i27 + 8;
                                                unsafe10.putObject(obj3, j2, Double.valueOf(Double.longBitsToDouble(zzgwb.zzn(bArr, i27))));
                                                unsafe10.putInt(obj3, j3, i14);
                                                if (i46 != i27) {
                                                    i13 = i26;
                                                    i4 = i3;
                                                    i10 = i46;
                                                    break;
                                                } else {
                                                    zzgzmVar2 = this;
                                                    i48 = i26;
                                                    i44 = i3;
                                                    zzgwaVar3 = zzgwaVar2;
                                                    i43 = i5;
                                                    i47 = i14;
                                                    i50 = i11;
                                                    unsafe8 = unsafe2;
                                                    i51 = i12;
                                                    i45 = -1;
                                                    break;
                                                }
                                            }
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 5) {
                                                i46 = i27 + 4;
                                                unsafe10.putObject(obj3, j2, Float.valueOf(Float.intBitsToFloat(zzgwb.zzb(bArr, i27))));
                                                unsafe10.putInt(obj3, j3, i14);
                                                if (i46 != i27) {
                                                }
                                            }
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 0) {
                                                i46 = zzgwb.zzk(bArr, i27, zzgwaVar2);
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzgwaVar2.zzb));
                                                unsafe10.putInt(obj3, j3, i14);
                                                if (i46 != i27) {
                                                }
                                            }
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                        case 62:
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 0) {
                                                i46 = zzgwb.zzh(bArr, i27, zzgwaVar2);
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzgwaVar2.zza));
                                                unsafe10.putInt(obj3, j3, i14);
                                                if (i46 != i27) {
                                                }
                                            }
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 1) {
                                                i46 = i27 + 8;
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzgwb.zzn(bArr, i27)));
                                                unsafe10.putInt(obj3, j3, i14);
                                                if (i46 != i27) {
                                                }
                                            }
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 5) {
                                                i46 = i27 + 4;
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzgwb.zzb(bArr, i27)));
                                                unsafe10.putInt(obj3, j3, i14);
                                                if (i46 != i27) {
                                                }
                                            }
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case 58:
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 0) {
                                                i46 = zzgwb.zzk(bArr, i27, zzgwaVar2);
                                                unsafe10.putObject(obj3, j2, Boolean.valueOf(zzgwaVar2.zzb != 0));
                                                unsafe10.putInt(obj3, j3, i14);
                                                if (i46 != i27) {
                                                }
                                            }
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case 59:
                                            i5 = i2;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 2) {
                                                int zzh = zzgwb.zzh(bArr, i27, zzgwaVar2);
                                                int i60 = zzgwaVar2.zza;
                                                if (i60 == 0) {
                                                    unsafe10.putObject(obj3, j2, "");
                                                    i26 = i25;
                                                } else {
                                                    int i61 = zzh + i60;
                                                    if ((i57 & DriveFile.MODE_WRITE_ONLY) != 0 && !zzhbe.zzi(bArr, zzh, i61)) {
                                                        throw zzgyn.zzd();
                                                    }
                                                    i26 = i25;
                                                    unsafe10.putObject(obj3, j2, new String(bArr, zzh, i60, zzgyl.zza));
                                                    zzh = i61;
                                                }
                                                unsafe10.putInt(obj3, j3, i14);
                                                i46 = zzh;
                                                if (i46 != i27) {
                                                }
                                            } else {
                                                i26 = i25;
                                                i46 = i27;
                                                if (i46 != i27) {
                                                }
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 2) {
                                                Object zzB = zzB(obj3, i24, i25);
                                                i14 = i24;
                                                i46 = zzgwb.zzm(zzB, zzx(i25), bArr, i27, i2, zzgwaVar);
                                                zzK(obj3, i14, i25, zzB);
                                                i26 = i25;
                                                i49 = i49;
                                                i5 = i2;
                                                if (i46 != i27) {
                                                }
                                            } else {
                                                i14 = i24;
                                                i5 = i2;
                                                i26 = i25;
                                                i46 = i27;
                                                if (i46 != i27) {
                                                }
                                            }
                                            break;
                                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                            i28 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 2) {
                                                i46 = zzgwb.zza(bArr, i27, zzgwaVar2);
                                                unsafe10.putObject(obj3, j2, zzgwaVar2.zzc);
                                                unsafe10.putInt(obj3, j3, i28);
                                                i5 = i2;
                                                i26 = i25;
                                                i14 = i28;
                                                if (i46 != i27) {
                                                }
                                            }
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i28;
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                            i28 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 0) {
                                                i46 = zzgwb.zzh(bArr, i27, zzgwaVar2);
                                                int i62 = zzgwaVar2.zza;
                                                zzgye zzw = zzw(i25);
                                                if (zzw == null || zzw.zza(i62)) {
                                                    unsafe10.putObject(obj3, j2, Integer.valueOf(i62));
                                                    unsafe10.putInt(obj3, j3, i28);
                                                } else {
                                                    zzd(obj).zzj(i49, Long.valueOf(i62));
                                                }
                                                i5 = i2;
                                                i26 = i25;
                                                i14 = i28;
                                                if (i46 != i27) {
                                                }
                                            }
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i28;
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                            i28 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 0) {
                                                i46 = zzgwb.zzh(bArr, i27, zzgwaVar2);
                                                unsafe10.putObject(obj3, j2, Integer.valueOf(zzgww.zzD(zzgwaVar2.zza)));
                                                unsafe10.putInt(obj3, j3, i28);
                                                i5 = i2;
                                                i26 = i25;
                                                i14 = i28;
                                                if (i46 != i27) {
                                                }
                                            }
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i28;
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                            i28 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            if (i56 == 0) {
                                                int zzk2 = zzgwb.zzk(bArr, i27, zzgwaVar2);
                                                unsafe10.putObject(obj3, j2, Long.valueOf(zzgww.zzF(zzgwaVar2.zzb)));
                                                unsafe10.putInt(obj3, j3, i28);
                                                i46 = zzk2;
                                                i5 = i2;
                                                i26 = i25;
                                                i14 = i28;
                                                if (i46 != i27) {
                                                }
                                            }
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i28;
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                        case 68:
                                            if (i56 == 3) {
                                                Object zzB2 = zzB(obj3, i24, i25);
                                                zzgwa zzgwaVar4 = zzgwaVar3;
                                                int zzl = zzgwb.zzl(zzB2, zzx(i25), bArr, i23, i2, (i49 & (-8)) | 4, zzgwaVar);
                                                zzK(obj3, i24, i25, zzB2);
                                                i5 = i2;
                                                i27 = i23;
                                                i26 = i25;
                                                i14 = i24;
                                                i46 = zzl;
                                                zzgwaVar2 = zzgwaVar4;
                                                if (i46 != i27) {
                                                }
                                            }
                                            break;
                                        default:
                                            i5 = i2;
                                            i26 = i25;
                                            i14 = i24;
                                            zzgwaVar2 = zzgwaVar3;
                                            i27 = i23;
                                            i46 = i27;
                                            if (i46 != i27) {
                                            }
                                            break;
                                    }
                                } else {
                                    if (i56 == 2) {
                                        Unsafe unsafe11 = zzb;
                                        Object zzz = zzgzmVar2.zzz(i25);
                                        Object object = unsafe11.getObject(obj, j2);
                                        if (zzgze.zza(object)) {
                                            zzgzd zzb2 = zzgzd.zza().zzb();
                                            zzgze.zzb(zzb2, object);
                                            unsafe11.putObject(obj, j2, zzb2);
                                        }
                                        throw null;
                                    }
                                    i49 = i59;
                                    obj3 = obj;
                                    i4 = i3;
                                    i13 = i25;
                                    i5 = i2;
                                    i10 = i23;
                                    i14 = i24;
                                    zzgwaVar2 = zzgwaVar3;
                                }
                            } else {
                                long j4 = i57;
                                Unsafe unsafe12 = zzb;
                                zzgyk zzgykVar = (zzgyk) unsafe12.getObject(obj3, j2);
                                if (zzgykVar.zzc()) {
                                    j = j4;
                                } else {
                                    int size = zzgykVar.size();
                                    if (size == 0) {
                                        j = j4;
                                        i42 = 10;
                                    } else {
                                        j = j4;
                                        i42 = size + size;
                                    }
                                    zzgykVar = zzgykVar.zzf(i42);
                                    unsafe12.putObject(obj3, j2, zzgykVar);
                                }
                                zzgyk zzgykVar2 = zzgykVar;
                                switch (zzt) {
                                    case 18:
                                    case 35:
                                        i29 = i59;
                                        i30 = i52;
                                        i31 = i55;
                                        unsafe5 = unsafe2;
                                        i32 = i58;
                                        i33 = i2;
                                        if (i56 == 2) {
                                            zzgxf zzgxfVar = (zzgxf) zzgykVar2;
                                            i46 = zzgwb.zzh(bArr, i30, zzgwaVar3);
                                            int i63 = zzgwaVar3.zza + i46;
                                            while (i46 < i63) {
                                                zzgxfVar.zzh(Double.longBitsToDouble(zzgwb.zzn(bArr, i46)));
                                                i46 += 8;
                                            }
                                            if (i46 != i63) {
                                                throw zzgyn.zzi();
                                            }
                                            if (i46 != i30) {
                                                i10 = i46;
                                                i49 = i29;
                                                i14 = i32;
                                                i13 = i31;
                                                zzgwaVar2 = zzgwaVar3;
                                                unsafe2 = unsafe5;
                                                obj3 = obj;
                                                i5 = i33;
                                                i4 = i3;
                                                break;
                                            } else {
                                                i44 = i3;
                                                i49 = i29;
                                                i47 = i32;
                                                i48 = i31;
                                                unsafe8 = unsafe5;
                                                i50 = i11;
                                                i51 = i12;
                                                i45 = -1;
                                                obj3 = obj;
                                                i43 = i33;
                                                break;
                                            }
                                        } else {
                                            if (i56 == 1) {
                                                i34 = i30 + 8;
                                                zzgxf zzgxfVar2 = (zzgxf) zzgykVar2;
                                                zzgxfVar2.zzh(Double.longBitsToDouble(zzgwb.zzn(bArr, i30)));
                                                while (i34 < i33) {
                                                    int zzh2 = zzgwb.zzh(bArr, i34, zzgwaVar3);
                                                    if (i29 == zzgwaVar3.zza) {
                                                        zzgxfVar2.zzh(Double.longBitsToDouble(zzgwb.zzn(bArr, zzh2)));
                                                        i34 = zzh2 + 8;
                                                    } else {
                                                        i46 = i34;
                                                        if (i46 != i30) {
                                                        }
                                                    }
                                                }
                                                i46 = i34;
                                                if (i46 != i30) {
                                                }
                                            }
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                    case 19:
                                    case 36:
                                        i29 = i59;
                                        i30 = i52;
                                        i31 = i55;
                                        unsafe5 = unsafe2;
                                        i32 = i58;
                                        i33 = i2;
                                        if (i56 == 2) {
                                            zzgxp zzgxpVar = (zzgxp) zzgykVar2;
                                            i46 = zzgwb.zzh(bArr, i30, zzgwaVar3);
                                            int i64 = zzgwaVar3.zza + i46;
                                            while (i46 < i64) {
                                                zzgxpVar.zzh(Float.intBitsToFloat(zzgwb.zzb(bArr, i46)));
                                                i46 += 4;
                                            }
                                            if (i46 != i64) {
                                                throw zzgyn.zzi();
                                            }
                                            if (i46 != i30) {
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                i34 = i30 + 4;
                                                zzgxp zzgxpVar2 = (zzgxp) zzgykVar2;
                                                zzgxpVar2.zzh(Float.intBitsToFloat(zzgwb.zzb(bArr, i30)));
                                                while (i34 < i33) {
                                                    int zzh3 = zzgwb.zzh(bArr, i34, zzgwaVar3);
                                                    if (i29 == zzgwaVar3.zza) {
                                                        zzgxpVar2.zzh(Float.intBitsToFloat(zzgwb.zzb(bArr, zzh3)));
                                                        i34 = zzh3 + 4;
                                                    } else {
                                                        i46 = i34;
                                                        if (i46 != i30) {
                                                        }
                                                    }
                                                }
                                                i46 = i34;
                                                if (i46 != i30) {
                                                }
                                            }
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i29 = i59;
                                        i30 = i52;
                                        i31 = i55;
                                        unsafe5 = unsafe2;
                                        i32 = i58;
                                        i33 = i2;
                                        if (i56 == 2) {
                                            zzgyy zzgyyVar = (zzgyy) zzgykVar2;
                                            i46 = zzgwb.zzh(bArr, i30, zzgwaVar3);
                                            int i65 = zzgwaVar3.zza + i46;
                                            while (i46 < i65) {
                                                i46 = zzgwb.zzk(bArr, i46, zzgwaVar3);
                                                zzgyyVar.zzg(zzgwaVar3.zzb);
                                            }
                                            if (i46 != i65) {
                                                throw zzgyn.zzi();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzgyy zzgyyVar2 = (zzgyy) zzgykVar2;
                                                i46 = zzgwb.zzk(bArr, i30, zzgwaVar3);
                                                zzgyyVar2.zzg(zzgwaVar3.zzb);
                                                while (i46 < i33) {
                                                    int zzh4 = zzgwb.zzh(bArr, i46, zzgwaVar3);
                                                    if (i29 == zzgwaVar3.zza) {
                                                        i46 = zzgwb.zzk(bArr, zzh4, zzgwaVar3);
                                                        zzgyyVar2.zzg(zzgwaVar3.zzb);
                                                    }
                                                }
                                            }
                                            i46 = i30;
                                        }
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 22:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                    case 39:
                                    case 43:
                                        i29 = i59;
                                        i35 = i52;
                                        i36 = i2;
                                        i37 = i55;
                                        unsafe6 = unsafe2;
                                        i38 = i58;
                                        if (i56 == 2) {
                                            zzf = zzgwb.zzf(bArr, i35, zzgykVar2, zzgwaVar3);
                                            i30 = i35;
                                            i46 = zzf;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            if (i46 != i30) {
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                i30 = i35;
                                                i32 = i38;
                                                i33 = i36;
                                                i31 = i37;
                                                unsafe5 = unsafe6;
                                                i46 = zzgwb.zzj(i29, bArr, i30, i2, zzgykVar2, zzgwaVar);
                                                if (i46 != i30) {
                                                }
                                            }
                                            i30 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i29 = i59;
                                        i35 = i52;
                                        i36 = i2;
                                        i37 = i55;
                                        unsafe6 = unsafe2;
                                        i38 = i58;
                                        if (i56 == 2) {
                                            zzgyy zzgyyVar3 = (zzgyy) zzgykVar2;
                                            zzf = zzgwb.zzh(bArr, i35, zzgwaVar3);
                                            int i66 = zzgwaVar3.zza + zzf;
                                            while (zzf < i66) {
                                                zzgyyVar3.zzg(zzgwb.zzn(bArr, zzf));
                                                zzf += 8;
                                            }
                                            if (zzf != i66) {
                                                throw zzgyn.zzi();
                                            }
                                        } else {
                                            if (i56 == 1) {
                                                zzf = i35 + 8;
                                                zzgyy zzgyyVar4 = (zzgyy) zzgykVar2;
                                                zzgyyVar4.zzg(zzgwb.zzn(bArr, i35));
                                                while (zzf < i36) {
                                                    int zzh5 = zzgwb.zzh(bArr, zzf, zzgwaVar3);
                                                    if (i29 == zzgwaVar3.zza) {
                                                        zzgyyVar4.zzg(zzgwb.zzn(bArr, zzh5));
                                                        zzf = zzh5 + 8;
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                        i30 = i35;
                                        i46 = zzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe5 = unsafe6;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 24:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                    case 41:
                                    case 45:
                                        i29 = i59;
                                        i35 = i52;
                                        i36 = i2;
                                        i37 = i55;
                                        unsafe6 = unsafe2;
                                        i38 = i58;
                                        if (i56 == 2) {
                                            zzgxz zzgxzVar = (zzgxz) zzgykVar2;
                                            zzf = zzgwb.zzh(bArr, i35, zzgwaVar3);
                                            int i67 = zzgwaVar3.zza + zzf;
                                            while (zzf < i67) {
                                                zzgxzVar.zzi(zzgwb.zzb(bArr, zzf));
                                                zzf += 4;
                                            }
                                            if (zzf != i67) {
                                                throw zzgyn.zzi();
                                            }
                                        } else {
                                            if (i56 == 5) {
                                                zzf = i35 + 4;
                                                zzgxz zzgxzVar2 = (zzgxz) zzgykVar2;
                                                zzgxzVar2.zzi(zzgwb.zzb(bArr, i35));
                                                while (zzf < i36) {
                                                    int zzh6 = zzgwb.zzh(bArr, zzf, zzgwaVar3);
                                                    if (i29 == zzgwaVar3.zza) {
                                                        zzgxzVar2.zzi(zzgwb.zzb(bArr, zzh6));
                                                        zzf = zzh6 + 4;
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                        i30 = i35;
                                        i46 = zzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe5 = unsafe6;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i29 = i59;
                                        i35 = i52;
                                        i36 = i2;
                                        i37 = i55;
                                        unsafe6 = unsafe2;
                                        i38 = i58;
                                        if (i56 == 2) {
                                            zzgwc zzgwcVar = (zzgwc) zzgykVar2;
                                            zzf = zzgwb.zzh(bArr, i35, zzgwaVar3);
                                            int i68 = zzgwaVar3.zza + zzf;
                                            while (zzf < i68) {
                                                zzf = zzgwb.zzk(bArr, zzf, zzgwaVar3);
                                                zzgwcVar.zzg(zzgwaVar3.zzb != 0);
                                            }
                                            if (zzf != i68) {
                                                throw zzgyn.zzi();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzgwc zzgwcVar2 = (zzgwc) zzgykVar2;
                                                zzf = zzgwb.zzk(bArr, i35, zzgwaVar3);
                                                zzgwcVar2.zzg(zzgwaVar3.zzb != 0);
                                                while (zzf < i36) {
                                                    int zzh7 = zzgwb.zzh(bArr, zzf, zzgwaVar3);
                                                    if (i29 == zzgwaVar3.zza) {
                                                        zzf = zzgwb.zzk(bArr, zzh7, zzgwaVar3);
                                                        zzgwcVar2.zzg(zzgwaVar3.zzb != 0);
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                        i30 = i35;
                                        i46 = zzf;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe5 = unsafe6;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 26:
                                        i29 = i59;
                                        i35 = i52;
                                        i36 = i2;
                                        i37 = i55;
                                        unsafe6 = unsafe2;
                                        i38 = i58;
                                        if (i56 == 2) {
                                            if ((j & 536870912) == 0) {
                                                zzf = zzgwb.zzh(bArr, i35, zzgwaVar3);
                                                int i69 = zzgwaVar3.zza;
                                                if (i69 < 0) {
                                                    throw zzgyn.zzf();
                                                }
                                                if (i69 == 0) {
                                                    obj2 = "";
                                                    zzgykVar2.add(obj2);
                                                } else {
                                                    obj2 = "";
                                                    zzgykVar2.add(new String(bArr, zzf, i69, zzgyl.zza));
                                                    zzf += i69;
                                                }
                                                while (zzf < i36) {
                                                    int zzh8 = zzgwb.zzh(bArr, zzf, zzgwaVar3);
                                                    if (i29 == zzgwaVar3.zza) {
                                                        zzf = zzgwb.zzh(bArr, zzh8, zzgwaVar3);
                                                        int i70 = zzgwaVar3.zza;
                                                        if (i70 < 0) {
                                                            throw zzgyn.zzf();
                                                        }
                                                        if (i70 == 0) {
                                                            zzgykVar2.add(obj2);
                                                        } else {
                                                            zzgykVar2.add(new String(bArr, zzf, i70, zzgyl.zza));
                                                            zzf += i70;
                                                        }
                                                    }
                                                }
                                            } else {
                                                zzf = zzgwb.zzh(bArr, i35, zzgwaVar3);
                                                int i71 = zzgwaVar3.zza;
                                                if (i71 < 0) {
                                                    throw zzgyn.zzf();
                                                }
                                                if (i71 == 0) {
                                                    zzgykVar2.add("");
                                                } else {
                                                    int i72 = zzf + i71;
                                                    if (!zzhbe.zzi(bArr, zzf, i72)) {
                                                        throw zzgyn.zzd();
                                                    }
                                                    zzgykVar2.add(new String(bArr, zzf, i71, zzgyl.zza));
                                                    zzf = i72;
                                                }
                                                while (zzf < i36) {
                                                    int zzh9 = zzgwb.zzh(bArr, zzf, zzgwaVar3);
                                                    if (i29 == zzgwaVar3.zza) {
                                                        zzf = zzgwb.zzh(bArr, zzh9, zzgwaVar3);
                                                        int i73 = zzgwaVar3.zza;
                                                        if (i73 < 0) {
                                                            throw zzgyn.zzf();
                                                        }
                                                        if (i73 == 0) {
                                                            zzgykVar2.add("");
                                                        } else {
                                                            int i74 = zzf + i73;
                                                            if (!zzhbe.zzi(bArr, zzf, i74)) {
                                                                throw zzgyn.zzd();
                                                            }
                                                            zzgykVar2.add(new String(bArr, zzf, i73, zzgyl.zza));
                                                            zzf = i74;
                                                        }
                                                    }
                                                }
                                            }
                                            i30 = i35;
                                            i46 = zzf;
                                            i32 = i38;
                                            i33 = i36;
                                            i31 = i37;
                                            unsafe5 = unsafe6;
                                            if (i46 != i30) {
                                            }
                                        }
                                        i30 = i35;
                                        i32 = i38;
                                        i33 = i36;
                                        i31 = i37;
                                        unsafe5 = unsafe6;
                                        i46 = i30;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 27:
                                        i39 = i59;
                                        i30 = i52;
                                        i40 = i2;
                                        unsafe7 = unsafe2;
                                        if (i56 == 2) {
                                            i29 = i39;
                                            int zze = zzgwb.zze(zzgzmVar2.zzx(i55), i39, bArr, i30, i2, zzgykVar2, zzgwaVar);
                                            zzgwaVar3 = zzgwaVar3;
                                            i33 = i40;
                                            i31 = i55;
                                            unsafe5 = unsafe7;
                                            i46 = zze;
                                            i32 = i58;
                                            if (i46 != i30) {
                                            }
                                        }
                                        i29 = i39;
                                        unsafe5 = unsafe7;
                                        i32 = i58;
                                        int i75 = i40;
                                        i31 = i55;
                                        i33 = i75;
                                        i46 = i30;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 28:
                                        i39 = i59;
                                        i30 = i52;
                                        i40 = i2;
                                        unsafe7 = unsafe2;
                                        if (i56 == 2) {
                                            i46 = zzgwb.zzh(bArr, i30, zzgwaVar3);
                                            int i76 = zzgwaVar3.zza;
                                            if (i76 < 0) {
                                                throw zzgyn.zzf();
                                            }
                                            if (i76 > bArr.length - i46) {
                                                throw zzgyn.zzi();
                                            }
                                            if (i76 == 0) {
                                                zzgykVar2.add(zzgwm.zzb);
                                            } else {
                                                zzgykVar2.add(zzgwm.zzv(bArr, i46, i76));
                                                i46 += i76;
                                            }
                                            while (i46 < i40) {
                                                int zzh10 = zzgwb.zzh(bArr, i46, zzgwaVar3);
                                                if (i39 == zzgwaVar3.zza) {
                                                    i46 = zzgwb.zzh(bArr, zzh10, zzgwaVar3);
                                                    int i77 = zzgwaVar3.zza;
                                                    if (i77 < 0) {
                                                        throw zzgyn.zzf();
                                                    }
                                                    if (i77 > bArr.length - i46) {
                                                        throw zzgyn.zzi();
                                                    }
                                                    if (i77 == 0) {
                                                        zzgykVar2.add(zzgwm.zzb);
                                                    } else {
                                                        zzgykVar2.add(zzgwm.zzv(bArr, i46, i77));
                                                        i46 += i77;
                                                    }
                                                } else {
                                                    i29 = i39;
                                                    unsafe5 = unsafe7;
                                                    i32 = i58;
                                                    int i78 = i40;
                                                    i31 = i55;
                                                    i33 = i78;
                                                    if (i46 != i30) {
                                                    }
                                                }
                                            }
                                            i29 = i39;
                                            unsafe5 = unsafe7;
                                            i32 = i58;
                                            int i782 = i40;
                                            i31 = i55;
                                            i33 = i782;
                                            if (i46 != i30) {
                                            }
                                        }
                                        i29 = i39;
                                        unsafe5 = unsafe7;
                                        i32 = i58;
                                        int i752 = i40;
                                        i31 = i55;
                                        i33 = i752;
                                        i46 = i30;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        if (i56 == 2) {
                                            zzj = zzgwb.zzf(bArr, i52, zzgykVar2, zzgwaVar3);
                                            i41 = i59;
                                            i30 = i52;
                                            i40 = i2;
                                            unsafe7 = unsafe2;
                                        } else {
                                            if (i56 == 0) {
                                                i41 = i59;
                                                i30 = i52;
                                                i40 = i2;
                                                unsafe7 = unsafe2;
                                                zzj = zzgwb.zzj(i59, bArr, i52, i2, zzgykVar2, zzgwaVar);
                                            }
                                            i29 = i59;
                                            i30 = i52;
                                            i31 = i55;
                                            unsafe5 = unsafe2;
                                            i32 = i58;
                                            i33 = i2;
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                        int i79 = zzj;
                                        zzhag.zzn(obj, i58, zzgykVar2, zzgzmVar2.zzw(i55), null, zzgzmVar2.zzm);
                                        i29 = i41;
                                        i46 = i79;
                                        unsafe5 = unsafe7;
                                        i32 = i58;
                                        int i7822 = i40;
                                        i31 = i55;
                                        i33 = i7822;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        if (i56 == 2) {
                                            zzgxz zzgxzVar3 = (zzgxz) zzgykVar2;
                                            i46 = zzgwb.zzh(bArr, i52, zzgwaVar3);
                                            int i80 = zzgwaVar3.zza + i46;
                                            while (i46 < i80) {
                                                i46 = zzgwb.zzh(bArr, i46, zzgwaVar3);
                                                zzgxzVar3.zzi(zzgww.zzD(zzgwaVar3.zza));
                                            }
                                            if (i46 != i80) {
                                                throw zzgyn.zzi();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzgxz zzgxzVar4 = (zzgxz) zzgykVar2;
                                                i46 = zzgwb.zzh(bArr, i52, zzgwaVar3);
                                                zzgxzVar4.zzi(zzgww.zzD(zzgwaVar3.zza));
                                                while (i46 < i2) {
                                                    int zzh11 = zzgwb.zzh(bArr, i46, zzgwaVar3);
                                                    if (i59 == zzgwaVar3.zza) {
                                                        i46 = zzgwb.zzh(bArr, zzh11, zzgwaVar3);
                                                        zzgxzVar4.zzi(zzgww.zzD(zzgwaVar3.zza));
                                                    }
                                                }
                                            }
                                            i29 = i59;
                                            i30 = i52;
                                            i31 = i55;
                                            unsafe5 = unsafe2;
                                            i32 = i58;
                                            i33 = i2;
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                        i29 = i59;
                                        i30 = i52;
                                        i31 = i55;
                                        unsafe5 = unsafe2;
                                        i32 = i58;
                                        i33 = i2;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    case 34:
                                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                        if (i56 == 2) {
                                            zzgyy zzgyyVar5 = (zzgyy) zzgykVar2;
                                            i46 = zzgwb.zzh(bArr, i52, zzgwaVar3);
                                            int i81 = zzgwaVar3.zza + i46;
                                            while (i46 < i81) {
                                                i46 = zzgwb.zzk(bArr, i46, zzgwaVar3);
                                                zzgyyVar5.zzg(zzgww.zzF(zzgwaVar3.zzb));
                                            }
                                            if (i46 != i81) {
                                                throw zzgyn.zzi();
                                            }
                                        } else {
                                            if (i56 == 0) {
                                                zzgyy zzgyyVar6 = (zzgyy) zzgykVar2;
                                                i46 = zzgwb.zzk(bArr, i52, zzgwaVar3);
                                                zzgyyVar6.zzg(zzgww.zzF(zzgwaVar3.zzb));
                                                while (i46 < i2) {
                                                    int zzh12 = zzgwb.zzh(bArr, i46, zzgwaVar3);
                                                    if (i59 == zzgwaVar3.zza) {
                                                        i46 = zzgwb.zzk(bArr, zzh12, zzgwaVar3);
                                                        zzgyyVar6.zzg(zzgww.zzF(zzgwaVar3.zzb));
                                                    }
                                                }
                                            }
                                            i29 = i59;
                                            i30 = i52;
                                            i31 = i55;
                                            unsafe5 = unsafe2;
                                            i32 = i58;
                                            i33 = i2;
                                            i46 = i30;
                                            if (i46 != i30) {
                                            }
                                        }
                                        i29 = i59;
                                        i30 = i52;
                                        i31 = i55;
                                        unsafe5 = unsafe2;
                                        i32 = i58;
                                        i33 = i2;
                                        if (i46 != i30) {
                                        }
                                        break;
                                    default:
                                        i29 = i59;
                                        i30 = i52;
                                        i31 = i55;
                                        unsafe5 = unsafe2;
                                        i32 = i58;
                                        i33 = i2;
                                        if (i56 == 3) {
                                            int i82 = (i29 & (-8)) | 4;
                                            zzhae zzx = zzgzmVar2.zzx(i31);
                                            i46 = zzgwb.zzc(zzx, bArr, i30, i2, i82, zzgwaVar);
                                            zzgykVar2.add(zzgwaVar3.zzc);
                                            while (i46 < i33) {
                                                int zzh13 = zzgwb.zzh(bArr, i46, zzgwaVar3);
                                                if (i29 == zzgwaVar3.zza) {
                                                    i46 = zzgwb.zzc(zzx, bArr, zzh13, i2, i82, zzgwaVar);
                                                    zzgykVar2.add(zzgwaVar3.zzc);
                                                } else if (i46 != i30) {
                                                }
                                            }
                                            if (i46 != i30) {
                                            }
                                        }
                                        i46 = i30;
                                        if (i46 != i30) {
                                        }
                                        break;
                                }
                            }
                        } else if (i56 == 2) {
                            zzgyk zzgykVar3 = (zzgyk) unsafe9.getObject(obj3, j2);
                            if (!zzgykVar3.zzc()) {
                                int size2 = zzgykVar3.size();
                                zzgykVar3 = zzgykVar3.zzf(size2 == 0 ? 10 : size2 + size2);
                                unsafe9.putObject(obj3, j2, zzgykVar3);
                            }
                            i47 = i58;
                            int zze2 = zzgwb.zze(zzgzmVar2.zzx(i55), i59, bArr, i52, i2, zzgykVar3, zzgwaVar);
                            i44 = i3;
                            zzgwaVar3 = zzgwaVar3;
                            i43 = i2;
                            unsafe8 = unsafe9;
                            i50 = i11;
                            i51 = i12;
                            i45 = -1;
                            i49 = i59;
                            i48 = i55;
                            i46 = zze2;
                        } else {
                            i23 = i52;
                            i24 = i58;
                            i49 = i59;
                            unsafe2 = unsafe9;
                            i25 = i55;
                            i4 = i3;
                            i13 = i25;
                            i5 = i2;
                            i10 = i23;
                            i14 = i24;
                            zzgwaVar2 = zzgwaVar3;
                        }
                    } else {
                        int i83 = iArr[i55 + 2];
                        int i84 = 1 << (i83 >>> 20);
                        int i85 = 1048575;
                        int i86 = i83 & 1048575;
                        if (i86 != i51) {
                            if (i51 != 1048575) {
                                unsafe8.putInt(obj3, i51, i50);
                                i85 = 1048575;
                            }
                            i50 = i86 == i85 ? 0 : unsafe8.getInt(obj3, i86);
                            i12 = i86;
                        } else {
                            i12 = i51;
                        }
                        switch (zzt) {
                            case 0:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 1) {
                                    i46 = i52 + 8;
                                    i50 |= i84;
                                    zzhaz.zzr(obj3, j2, Double.longBitsToDouble(zzgwb.zzn(bArr, i52)));
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i87 = i52;
                                i49 = i21;
                                i10 = i87;
                                break;
                            case 1:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 5) {
                                    i46 = i52 + 4;
                                    i50 |= i84;
                                    zzhaz.zzs(obj3, j2, Float.intBitsToFloat(zzgwb.zzb(bArr, i52)));
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i872 = i52;
                                i49 = i21;
                                i10 = i872;
                                break;
                            case 2:
                            case 3:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 0) {
                                    i19 = i50 | i84;
                                    zzk = zzgwb.zzk(bArr, i52, zzgwaVar3);
                                    unsafe8.putLong(obj, j2, zzgwaVar3.zzb);
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i50 = i19;
                                    i46 = zzk;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i8722 = i52;
                                i49 = i21;
                                i10 = i8722;
                                break;
                            case 4:
                            case 11:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 0) {
                                    i50 |= i84;
                                    i46 = zzgwb.zzh(bArr, i52, zzgwaVar3);
                                    unsafe8.putInt(obj3, j2, zzgwaVar3.zza);
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i87222 = i52;
                                i49 = i21;
                                i10 = i87222;
                                break;
                            case 5:
                            case 14:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 1) {
                                    zzk = i52 + 8;
                                    i19 = i50 | i84;
                                    unsafe8.putLong(obj, j2, zzgwb.zzn(bArr, i52));
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i50 = i19;
                                    i46 = zzk;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i872222 = i52;
                                i49 = i21;
                                i10 = i872222;
                                break;
                            case 6:
                            case 13:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 5) {
                                    i46 = i52 + 4;
                                    i50 |= i84;
                                    unsafe8.putInt(obj3, j2, zzgwb.zzb(bArr, i52));
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i8722222 = i52;
                                i49 = i21;
                                i10 = i8722222;
                                break;
                            case 7:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 0) {
                                    i50 |= i84;
                                    i46 = zzgwb.zzk(bArr, i52, zzgwaVar3);
                                    zzhaz.zzp(obj3, j2, zzgwaVar3.zzb != 0);
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i87222222 = i52;
                                i49 = i21;
                                i10 = i87222222;
                                break;
                            case 8:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 2) {
                                    if (zzM(i57)) {
                                        i46 = zzgwb.zzh(bArr, i52, zzgwaVar3);
                                        int i88 = zzgwaVar3.zza;
                                        if (i88 < 0) {
                                            throw zzgyn.zzf();
                                        }
                                        int i89 = i50 | i84;
                                        if (i88 == 0) {
                                            zzgwaVar3.zzc = "";
                                        } else {
                                            zzgwaVar3.zzc = zzhbe.zzh(bArr, i46, i88);
                                            i46 += i88;
                                        }
                                        i50 = i89;
                                    } else {
                                        int i90 = i50 | i84;
                                        int zzh14 = zzgwb.zzh(bArr, i52, zzgwaVar3);
                                        int i91 = zzgwaVar3.zza;
                                        if (i91 < 0) {
                                            throw zzgyn.zzf();
                                        }
                                        if (i91 == 0) {
                                            zzgwaVar3.zzc = "";
                                        } else {
                                            zzgwaVar3.zzc = new String(bArr, zzh14, i91, zzgyl.zza);
                                            zzh14 += i91;
                                        }
                                        i50 = i90;
                                        i46 = zzh14;
                                    }
                                    unsafe8.putObject(obj3, j2, zzgwaVar3.zzc);
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i872222222 = i52;
                                i49 = i21;
                                i10 = i872222222;
                                break;
                            case 9:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 != 2) {
                                    i20 = i50;
                                    i21 = i18;
                                    i58 = i17;
                                    i22 = i16;
                                    unsafe4 = unsafe8;
                                    i4 = i3;
                                    i11 = i20;
                                    i13 = i22;
                                    i5 = i2;
                                    zzgwaVar2 = zzgwaVar3;
                                    i14 = i58;
                                    unsafe2 = unsafe4;
                                    int i8722222222 = i52;
                                    i49 = i21;
                                    i10 = i8722222222;
                                    break;
                                } else {
                                    Object zzA = zzgzmVar2.zzA(obj3, i16);
                                    i46 = zzgwb.zzm(zzA, zzgzmVar2.zzx(i16), bArr, i52, i2, zzgwaVar);
                                    zzgzmVar2.zzJ(obj3, i16, zzA);
                                    i43 = i2;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i50 |= i84;
                                    i51 = i12;
                                    i45 = -1;
                                    i44 = i3;
                                    break;
                                }
                            case 10:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 == 2) {
                                    i50 |= i84;
                                    i46 = zzgwb.zza(bArr, i52, zzgwaVar3);
                                    unsafe8.putObject(obj3, j2, zzgwaVar3.zzc);
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i21 = i18;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i87222222222 = i52;
                                i49 = i21;
                                i10 = i87222222222;
                                break;
                            case 12:
                                i16 = i55;
                                i17 = i58;
                                if (i56 == 0) {
                                    i46 = zzgwb.zzh(bArr, i52, zzgwaVar3);
                                    int i92 = zzgwaVar3.zza;
                                    zzgye zzw2 = zzgzmVar2.zzw(i16);
                                    if ((i57 & Integer.MIN_VALUE) == 0 || zzw2 == null || zzw2.zza(i92)) {
                                        i18 = i59;
                                        i50 |= i84;
                                        unsafe8.putInt(obj3, j2, i92);
                                    } else {
                                        i18 = i59;
                                        zzd(obj).zzj(i18, Long.valueOf(i92));
                                    }
                                    i43 = i2;
                                    i44 = i3;
                                    i49 = i18;
                                    i47 = i17;
                                    i48 = i16;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i21 = i59;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i872222222222 = i52;
                                i49 = i21;
                                i10 = i872222222222;
                                break;
                            case 15:
                                i16 = i55;
                                i17 = i58;
                                if (i56 == 0) {
                                    i50 |= i84;
                                    i46 = zzgwb.zzh(bArr, i52, zzgwaVar3);
                                    unsafe8.putInt(obj3, j2, zzgww.zzD(zzgwaVar3.zza));
                                    i43 = i2;
                                    i44 = i3;
                                    i47 = i17;
                                    i48 = i16;
                                    i49 = i59;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                                i20 = i50;
                                i58 = i17;
                                i22 = i16;
                                unsafe4 = unsafe8;
                                i21 = i59;
                                i4 = i3;
                                i11 = i20;
                                i13 = i22;
                                i5 = i2;
                                zzgwaVar2 = zzgwaVar3;
                                i14 = i58;
                                unsafe2 = unsafe4;
                                int i8722222222222 = i52;
                                i49 = i21;
                                i10 = i8722222222222;
                                break;
                            case 16:
                                if (i56 != 0) {
                                    i22 = i55;
                                    i20 = i50;
                                    unsafe4 = unsafe8;
                                    i21 = i59;
                                    i4 = i3;
                                    i11 = i20;
                                    i13 = i22;
                                    i5 = i2;
                                    zzgwaVar2 = zzgwaVar3;
                                    i14 = i58;
                                    unsafe2 = unsafe4;
                                    int i87222222222222 = i52;
                                    i49 = i21;
                                    i10 = i87222222222222;
                                    break;
                                } else {
                                    int i93 = i50 | i84;
                                    int zzk3 = zzgwb.zzk(bArr, i52, zzgwaVar3);
                                    i17 = i58;
                                    i16 = i55;
                                    unsafe8.putLong(obj, j2, zzgww.zzF(zzgwaVar3.zzb));
                                    i46 = zzk3;
                                    i43 = i2;
                                    i44 = i3;
                                    i50 = i93;
                                    i47 = i17;
                                    i48 = i16;
                                    i49 = i59;
                                    i51 = i12;
                                    i45 = -1;
                                    break;
                                }
                            default:
                                i16 = i55;
                                i17 = i58;
                                i18 = i59;
                                if (i56 != 3) {
                                    i20 = i50;
                                    i21 = i18;
                                    i58 = i17;
                                    i22 = i16;
                                    unsafe4 = unsafe8;
                                    i4 = i3;
                                    i11 = i20;
                                    i13 = i22;
                                    i5 = i2;
                                    zzgwaVar2 = zzgwaVar3;
                                    i14 = i58;
                                    unsafe2 = unsafe4;
                                    int i872222222222222 = i52;
                                    i49 = i21;
                                    i10 = i872222222222222;
                                    break;
                                } else {
                                    int i94 = i50 | i84;
                                    Object zzA2 = zzgzmVar2.zzA(obj3, i16);
                                    int zzl2 = zzgwb.zzl(zzA2, zzgzmVar2.zzx(i16), bArr, i52, i2, (i17 << 3) | 4, zzgwaVar);
                                    zzgzmVar2.zzJ(obj3, i16, zzA2);
                                    i44 = i3;
                                    zzgwaVar3 = zzgwaVar3;
                                    i43 = i2;
                                    unsafe8 = unsafe8;
                                    i46 = zzl2;
                                    i51 = i12;
                                    i45 = -1;
                                    i50 = i94;
                                    i49 = i18;
                                    i48 = i16;
                                    i47 = i17;
                                    break;
                                }
                        }
                    }
                } else {
                    i10 = i52;
                    i11 = i50;
                    i12 = i51;
                    i49 = i9;
                    unsafe2 = unsafe8;
                    zzgwaVar2 = zzgwaVar3;
                    i4 = i44;
                    i5 = i43;
                    i13 = 0;
                    i14 = i54;
                }
                if (i49 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzgxi zzgxiVar = zzgwaVar2.zzd;
                        int i95 = zzgxi.zzb;
                        int i96 = zzgzt.zza;
                        if (zzgxiVar != zzgxi.zza) {
                            if (zzgwaVar2.zzd.zzc(this.zzg, i14) != null) {
                                throw null;
                            }
                            i15 = i49;
                            unsafe3 = unsafe2;
                            i46 = zzgwb.zzg(i49, bArr, i10, i2, zzd(obj), zzgwaVar);
                            i48 = i13;
                            i47 = i14;
                            zzgzmVar2 = this;
                            i49 = i15;
                            unsafe8 = unsafe3;
                            i50 = i11;
                            i51 = i12;
                            zzgwaVar3 = zzgwaVar2;
                            i44 = i4;
                            i43 = i5;
                            i45 = -1;
                        }
                    }
                    i15 = i49;
                    unsafe3 = unsafe2;
                    i46 = zzgwb.zzg(i15, bArr, i10, i2, zzd(obj), zzgwaVar);
                    i48 = i13;
                    i47 = i14;
                    zzgzmVar2 = this;
                    i49 = i15;
                    unsafe8 = unsafe3;
                    i50 = i11;
                    i51 = i12;
                    zzgwaVar3 = zzgwaVar2;
                    i44 = i4;
                    i43 = i5;
                    i45 = -1;
                } else {
                    i8 = 1048575;
                    zzgzmVar = this;
                    i6 = i10;
                    i7 = i49;
                    i50 = i11;
                    unsafe = unsafe2;
                    i51 = i12;
                }
            } else {
                zzgzmVar = zzgzmVar2;
                i4 = i44;
                i5 = i43;
                unsafe = unsafe8;
                i6 = i46;
                i7 = i49;
                i8 = 1048575;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final Object zze() {
        return ((zzgxy) this.zzg).zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgxy) {
                zzgxy zzgxyVar = (zzgxy) obj;
                zzgxyVar.zzbV();
                zzgxyVar.zzbU();
                zzgxyVar.zzbX();
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            case 30:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
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
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                ((zzgyk) zzhaz.zzh(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzgzd) object).zzc();
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
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhae
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
                        zzhaz.zzr(obj, j, zzhaz.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzhaz.zzs(obj, j, zzhaz.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzhaz.zzu(obj, j, zzhaz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzhaz.zzu(obj, j, zzhaz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzhaz.zzt(obj, j, zzhaz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzhaz.zzu(obj, j, zzhaz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzhaz.zzt(obj, j, zzhaz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzhaz.zzp(obj, j, zzhaz.zzz(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzhaz.zzv(obj, j, zzhaz.zzh(obj2, j));
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
                        zzhaz.zzv(obj, j, zzhaz.zzh(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzhaz.zzt(obj, j, zzhaz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzhaz.zzt(obj, j, zzhaz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzhaz.zzt(obj, j, zzhaz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzhaz.zzu(obj, j, zzhaz.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzhaz.zzt(obj, j, zzhaz.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzhaz.zzu(obj, j, zzhaz.zzf(obj2, j));
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzgyk zzgykVar = (zzgyk) zzhaz.zzh(obj, j);
                    zzgyk zzgykVar2 = (zzgyk) zzhaz.zzh(obj2, j);
                    int size = zzgykVar.size();
                    int size2 = zzgykVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgykVar.zzc()) {
                            zzgykVar = zzgykVar.zzf(size2 + size);
                        }
                        zzgykVar.addAll(zzgykVar2);
                    }
                    if (size > 0) {
                        zzgykVar2 = zzgykVar;
                    }
                    zzhaz.zzv(obj, j, zzgykVar2);
                    break;
                case 50:
                    int i4 = zzhag.zza;
                    zzhaz.zzv(obj, j, zzgze.zzb(zzhaz.zzh(obj, j), zzhaz.zzh(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i3, i)) {
                        zzhaz.zzv(obj, j, zzhaz.zzh(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzF(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj2, i3, i)) {
                        zzhaz.zzv(obj, j, zzhaz.zzh(obj2, j));
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
        zzhag.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzhag.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:314:0x051c A[LOOP:5: B:312:0x0518->B:314:0x051c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x052d  */
    @Override // com.google.android.gms.internal.ads.zzhae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzgzw zzgzwVar, zzgxi zzgxiVar) throws IOException {
        int i;
        zzgxiVar.getClass();
        zzD(obj);
        zzhas zzhasVar = this.zzm;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzgzwVar.zzc();
                int zzq = zzq(zzc);
                if (zzq >= 0) {
                    int zzu = zzu(zzq);
                    try {
                    } catch (zzgym unused) {
                        if (obj2 == null) {
                            obj2 = zzhasVar.zza(obj);
                        }
                        if (!zzhasVar.zzj(obj2, zzgzwVar)) {
                            for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                                zzy(obj, this.zzj[i2], obj2, zzhasVar, obj);
                            }
                            if (obj2 != null) {
                                ((zzgxy) obj).zzt = (zzhat) obj2;
                                return;
                            }
                            return;
                        }
                    }
                    switch (zzt(zzu)) {
                        case 0:
                            zzhaz.zzr(obj, zzu & 1048575, zzgzwVar.zza());
                            zzH(obj, zzq);
                        case 1:
                            zzhaz.zzs(obj, zzu & 1048575, zzgzwVar.zzb());
                            zzH(obj, zzq);
                        case 2:
                            zzhaz.zzu(obj, zzu & 1048575, zzgzwVar.zzl());
                            zzH(obj, zzq);
                        case 3:
                            zzhaz.zzu(obj, zzu & 1048575, zzgzwVar.zzo());
                            zzH(obj, zzq);
                        case 4:
                            zzhaz.zzt(obj, zzu & 1048575, zzgzwVar.zzg());
                            zzH(obj, zzq);
                        case 5:
                            zzhaz.zzu(obj, zzu & 1048575, zzgzwVar.zzk());
                            zzH(obj, zzq);
                        case 6:
                            zzhaz.zzt(obj, zzu & 1048575, zzgzwVar.zzf());
                            zzH(obj, zzq);
                        case 7:
                            zzhaz.zzp(obj, zzu & 1048575, zzgzwVar.zzN());
                            zzH(obj, zzq);
                        case 8:
                            zzG(obj, zzu, zzgzwVar);
                            zzH(obj, zzq);
                        case 9:
                            zzgzj zzgzjVar = (zzgzj) zzA(obj, zzq);
                            zzgzwVar.zzu(zzgzjVar, zzx(zzq), zzgxiVar);
                            zzJ(obj, zzq, zzgzjVar);
                        case 10:
                            zzhaz.zzv(obj, zzu & 1048575, zzgzwVar.zzp());
                            zzH(obj, zzq);
                        case 11:
                            zzhaz.zzt(obj, zzu & 1048575, zzgzwVar.zzj());
                            zzH(obj, zzq);
                        case 12:
                            int zze = zzgzwVar.zze();
                            zzgye zzw = zzw(zzq);
                            if (zzw != null && !zzw.zza(zze)) {
                                obj2 = zzhag.zzo(obj, zzc, zze, obj2, zzhasVar);
                            }
                            zzhaz.zzt(obj, zzu & 1048575, zze);
                            zzH(obj, zzq);
                            break;
                        case 13:
                            zzhaz.zzt(obj, zzu & 1048575, zzgzwVar.zzh());
                            zzH(obj, zzq);
                        case 14:
                            zzhaz.zzu(obj, zzu & 1048575, zzgzwVar.zzm());
                            zzH(obj, zzq);
                        case 15:
                            zzhaz.zzt(obj, zzu & 1048575, zzgzwVar.zzi());
                            zzH(obj, zzq);
                        case 16:
                            zzhaz.zzu(obj, zzu & 1048575, zzgzwVar.zzn());
                            zzH(obj, zzq);
                        case 17:
                            zzgzj zzgzjVar2 = (zzgzj) zzA(obj, zzq);
                            zzgzwVar.zzt(zzgzjVar2, zzx(zzq), zzgxiVar);
                            zzJ(obj, zzq, zzgzjVar2);
                        case 18:
                            zzgzwVar.zzx(zzgyw.zza(obj, zzu & 1048575));
                        case 19:
                            zzgzwVar.zzB(zzgyw.zza(obj, zzu & 1048575));
                        case 20:
                            zzgzwVar.zzE(zzgyw.zza(obj, zzu & 1048575));
                        case 21:
                            zzgzwVar.zzM(zzgyw.zza(obj, zzu & 1048575));
                        case 22:
                            zzgzwVar.zzD(zzgyw.zza(obj, zzu & 1048575));
                        case 23:
                            zzgzwVar.zzA(zzgyw.zza(obj, zzu & 1048575));
                        case 24:
                            zzgzwVar.zzz(zzgyw.zza(obj, zzu & 1048575));
                        case 25:
                            zzgzwVar.zzv(zzgyw.zza(obj, zzu & 1048575));
                        case 26:
                            if (zzM(zzu)) {
                                ((zzgwx) zzgzwVar).zzK(zzgyw.zza(obj, zzu & 1048575), true);
                            } else {
                                ((zzgwx) zzgzwVar).zzK(zzgyw.zza(obj, zzu & 1048575), false);
                            }
                        case 27:
                            zzgzwVar.zzF(zzgyw.zza(obj, zzu & 1048575), zzx(zzq), zzgxiVar);
                        case 28:
                            zzgzwVar.zzw(zzgyw.zza(obj, zzu & 1048575));
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            zzgzwVar.zzL(zzgyw.zza(obj, zzu & 1048575));
                        case 30:
                            List zza2 = zzgyw.zza(obj, zzu & 1048575);
                            zzgzwVar.zzy(zza2);
                            obj2 = zzhag.zzn(obj, zzc, zza2, zzw(zzq), obj2, zzhasVar);
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                            zzgzwVar.zzG(zzgyw.zza(obj, zzu & 1048575));
                        case 32:
                            zzgzwVar.zzH(zzgyw.zza(obj, zzu & 1048575));
                        case 33:
                            zzgzwVar.zzI(zzgyw.zza(obj, zzu & 1048575));
                        case 34:
                            zzgzwVar.zzJ(zzgyw.zza(obj, zzu & 1048575));
                        case 35:
                            zzgzwVar.zzx(zzgyw.zza(obj, zzu & 1048575));
                        case 36:
                            zzgzwVar.zzB(zzgyw.zza(obj, zzu & 1048575));
                        case 37:
                            zzgzwVar.zzE(zzgyw.zza(obj, zzu & 1048575));
                        case 38:
                            zzgzwVar.zzM(zzgyw.zza(obj, zzu & 1048575));
                        case 39:
                            zzgzwVar.zzD(zzgyw.zza(obj, zzu & 1048575));
                        case 40:
                            zzgzwVar.zzA(zzgyw.zza(obj, zzu & 1048575));
                        case 41:
                            zzgzwVar.zzz(zzgyw.zza(obj, zzu & 1048575));
                        case 42:
                            zzgzwVar.zzv(zzgyw.zza(obj, zzu & 1048575));
                        case 43:
                            zzgzwVar.zzL(zzgyw.zza(obj, zzu & 1048575));
                        case 44:
                            List zza3 = zzgyw.zza(obj, zzu & 1048575);
                            zzgzwVar.zzy(zza3);
                            obj2 = zzhag.zzn(obj, zzc, zza3, zzw(zzq), obj2, zzhasVar);
                        case 45:
                            zzgzwVar.zzG(zzgyw.zza(obj, zzu & 1048575));
                        case 46:
                            zzgzwVar.zzH(zzgyw.zza(obj, zzu & 1048575));
                        case 47:
                            zzgzwVar.zzI(zzgyw.zza(obj, zzu & 1048575));
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            zzgzwVar.zzJ(zzgyw.zza(obj, zzu & 1048575));
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzgzwVar.zzC(zzgyw.zza(obj, zzu & 1048575), zzx(zzq), zzgxiVar);
                        case 50:
                            Object zzz = zzz(zzq);
                            long zzu2 = zzu(zzq) & 1048575;
                            Object zzh = zzhaz.zzh(obj, zzu2);
                            if (zzh == null) {
                                zzh = zzgzd.zza().zzb();
                                zzhaz.zzv(obj, zzu2, zzh);
                            } else if (zzgze.zza(zzh)) {
                                Object zzb2 = zzgzd.zza().zzb();
                                zzgze.zzb(zzb2, zzh);
                                zzhaz.zzv(obj, zzu2, zzb2);
                                zzh = zzb2;
                            }
                            throw null;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            zzhaz.zzv(obj, zzu & 1048575, Double.valueOf(zzgzwVar.zza()));
                            zzI(obj, zzc, zzq);
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            zzhaz.zzv(obj, zzu & 1048575, Float.valueOf(zzgzwVar.zzb()));
                            zzI(obj, zzc, zzq);
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            zzhaz.zzv(obj, zzu & 1048575, Long.valueOf(zzgzwVar.zzl()));
                            zzI(obj, zzc, zzq);
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            zzhaz.zzv(obj, zzu & 1048575, Long.valueOf(zzgzwVar.zzo()));
                            zzI(obj, zzc, zzq);
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            zzhaz.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzwVar.zzg()));
                            zzI(obj, zzc, zzq);
                        case 56:
                            zzhaz.zzv(obj, zzu & 1048575, Long.valueOf(zzgzwVar.zzk()));
                            zzI(obj, zzc, zzq);
                        case 57:
                            zzhaz.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzwVar.zzf()));
                            zzI(obj, zzc, zzq);
                        case 58:
                            zzhaz.zzv(obj, zzu & 1048575, Boolean.valueOf(zzgzwVar.zzN()));
                            zzI(obj, zzc, zzq);
                        case 59:
                            zzG(obj, zzu, zzgzwVar);
                            zzI(obj, zzc, zzq);
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            zzgzj zzgzjVar3 = (zzgzj) zzB(obj, zzc, zzq);
                            zzgzwVar.zzu(zzgzjVar3, zzx(zzq), zzgxiVar);
                            zzK(obj, zzc, zzq, zzgzjVar3);
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            zzhaz.zzv(obj, zzu & 1048575, zzgzwVar.zzp());
                            zzI(obj, zzc, zzq);
                        case 62:
                            zzhaz.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzwVar.zzj()));
                            zzI(obj, zzc, zzq);
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            int zze2 = zzgzwVar.zze();
                            zzgye zzw2 = zzw(zzq);
                            if (zzw2 != null && !zzw2.zza(zze2)) {
                                obj2 = zzhag.zzo(obj, zzc, zze2, obj2, zzhasVar);
                            }
                            zzhaz.zzv(obj, zzu & 1048575, Integer.valueOf(zze2));
                            zzI(obj, zzc, zzq);
                            break;
                        case 64:
                            zzhaz.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzwVar.zzh()));
                            zzI(obj, zzc, zzq);
                        case 65:
                            zzhaz.zzv(obj, zzu & 1048575, Long.valueOf(zzgzwVar.zzm()));
                            zzI(obj, zzc, zzq);
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            zzhaz.zzv(obj, zzu & 1048575, Integer.valueOf(zzgzwVar.zzi()));
                            zzI(obj, zzc, zzq);
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            zzhaz.zzv(obj, zzu & 1048575, Long.valueOf(zzgzwVar.zzn()));
                            zzI(obj, zzc, zzq);
                        case 68:
                            zzgzj zzgzjVar4 = (zzgzj) zzB(obj, zzc, zzq);
                            zzgzwVar.zzt(zzgzjVar4, zzx(zzq), zzgxiVar);
                            zzK(obj, zzc, zzq, zzgzjVar4);
                        default:
                            if (obj2 == null) {
                                obj2 = zzhasVar.zza(obj);
                            }
                            if (!zzhasVar.zzj(obj2, zzgzwVar)) {
                                for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                                    zzy(obj, this.zzj[i3], obj2, zzhasVar, obj);
                                }
                                break;
                            }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzy(obj, this.zzj[i4], obj2, zzhasVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzgxiVar.zzc(this.zzg, zzc)) != null) {
                        throw null;
                    }
                    if (obj2 == null) {
                        obj2 = zzhasVar.zza(obj);
                    }
                    if (!zzhasVar.zzj(obj2, zzgzwVar)) {
                        for (int i5 = this.zzk; i5 < this.zzl; i5++) {
                            zzy(obj, this.zzj[i5], obj2, zzhasVar, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                while (i < this.zzl) {
                }
                if (obj2 != null) {
                }
                throw th;
            }
            for (i = this.zzk; i < this.zzl; i++) {
                zzy(obj, this.zzj[i], obj2, zzhasVar, obj);
            }
            if (obj2 != null) {
                ((zzgxy) obj).zzt = (zzhat) obj2;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgwa zzgwaVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgwaVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzhae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzhbh zzhbhVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        Iterator it2;
        int[] iArr2;
        Map.Entry entry3;
        if (this.zzh) {
            zzgxn zzgxnVar = ((zzgxu) obj).zza;
            if (!zzgxnVar.zza.isEmpty()) {
                Iterator zzf = zzgxnVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzu = zzu(i);
                    int[] iArr3 = this.zzc;
                    int zzt = zzt(zzu);
                    int i6 = iArr3[i];
                    if (zzt <= 17) {
                        int i7 = iArr3[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i4) {
                            if (i8 == 1048575) {
                                entry3 = entry;
                                i5 = 0;
                            } else {
                                entry3 = entry;
                                i5 = unsafe.getInt(obj, i8);
                            }
                            i4 = i8;
                        } else {
                            entry3 = entry;
                        }
                        i3 = 1 << (i7 >>> 20);
                        i2 = i5;
                        entry2 = entry3;
                    } else {
                        i2 = i5;
                        entry2 = entry;
                        i3 = 0;
                    }
                    int i9 = i4;
                    while (entry2 != null && ((zzgxv) entry2.getKey()).zza <= i6) {
                        this.zzn.zzb(zzhbhVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzu & 1048575;
                    switch (zzt) {
                        case 0:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzf(i6, zzhaz.zzb(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 1:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzo(i6, zzhaz.zzc(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 2:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzt(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 3:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzK(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 4:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzr(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 5:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzm(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 6:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzk(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 7:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzb(i6, zzhaz.zzz(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 8:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzT(i6, unsafe.getObject(obj, j), zzhbhVar);
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 9:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzv(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 10:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzd(i6, (zzgwm) unsafe.getObject(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 11:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzI(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 12:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzi(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 13:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzx(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 14:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzz(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 15:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzB(i6, unsafe.getInt(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 16:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzD(i6, unsafe.getLong(obj, j));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 17:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzO(obj, i, i9, i2, i3)) {
                                zzhbhVar.zzq(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 18:
                            zzhag.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 19:
                            zzhag.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 20:
                            zzhag.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 21:
                            zzhag.zzI(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 22:
                            zzhag.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 23:
                            zzhag.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 24:
                            zzhag.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 25:
                            zzhag.zzr(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 26:
                            zzhag.zzG(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 27:
                            zzhag.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, zzx(i));
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 28:
                            zzhag.zzs(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            zzhag.zzH(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 30:
                            zzhag.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                            zzhag.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 32:
                            zzhag.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 33:
                            zzhag.zzE(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 34:
                            zzhag.zzF(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 35:
                            zzhag.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 36:
                            zzhag.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 37:
                            zzhag.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 38:
                            zzhag.zzI(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 39:
                            zzhag.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 40:
                            zzhag.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 41:
                            zzhag.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 42:
                            zzhag.zzr(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 43:
                            zzhag.zzH(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 44:
                            zzhag.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 45:
                            zzhag.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 46:
                            zzhag.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 47:
                            zzhag.zzE(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            zzhag.zzF(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzhag.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzhbhVar, zzx(i));
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                throw null;
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzf(i6, zzn(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzo(i6, zzo(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzt(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzK(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzr(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 56:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzm(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 57:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzk(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 58:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzb(i6, zzS(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 59:
                            if (zzR(obj, i6, i)) {
                                zzT(i6, unsafe.getObject(obj, j), zzhbhVar);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzv(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzd(i6, (zzgwm) unsafe.getObject(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 62:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzI(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzi(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 64:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzx(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 65:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzz(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzB(i6, zzp(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzD(i6, zzv(obj, j));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 68:
                            if (zzR(obj, i6, i)) {
                                zzhbhVar.zzq(i6, unsafe.getObject(obj, j), zzx(i));
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        default:
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                    }
                }
                Iterator it3 = it;
                while (entry != null) {
                    this.zzn.zzb(zzhbhVar, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                ((zzgxy) obj).zzt.zzl(zzhbhVar);
            }
        }
        entry = null;
        it = null;
        iArr = this.zzc;
        Unsafe unsafe2 = zzb;
        int i42 = 1048575;
        int i52 = 0;
        i = 0;
        while (i < iArr.length) {
        }
        Iterator it32 = it;
        while (entry != null) {
        }
        ((zzgxy) obj).zzt.zzl(zzhbhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzJ;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzhaz.zzb(obj, j)) == Double.doubleToLongBits(zzhaz.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzhaz.zzc(obj, j)) == Float.floatToIntBits(zzhaz.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzhaz.zzf(obj, j) == zzhaz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzhaz.zzf(obj, j) == zzhaz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzhaz.zzd(obj, j) == zzhaz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzhaz.zzf(obj, j) == zzhaz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzhaz.zzd(obj, j) == zzhaz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzhaz.zzz(obj, j) == zzhaz.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzhag.zzJ(zzhaz.zzh(obj, j), zzhaz.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzhag.zzJ(zzhaz.zzh(obj, j), zzhaz.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzhag.zzJ(zzhaz.zzh(obj, j), zzhaz.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzhaz.zzd(obj, j) == zzhaz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzhaz.zzd(obj, j) == zzhaz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzhaz.zzd(obj, j) == zzhaz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzhaz.zzf(obj, j) == zzhaz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzhaz.zzd(obj, j) == zzhaz.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzhaz.zzf(obj, j) == zzhaz.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzhag.zzJ(zzhaz.zzh(obj, j), zzhaz.zzh(obj2, j))) {
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
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
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzJ = zzhag.zzJ(zzhaz.zzh(obj, j), zzhaz.zzh(obj2, j));
                    break;
                case 50:
                    zzJ = zzhag.zzJ(zzhaz.zzh(obj, j), zzhaz.zzh(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                case 68:
                    long zzr = zzr(i) & 1048575;
                    if (zzhaz.zzd(obj, zzr) == zzhaz.zzd(obj2, zzr) && zzhag.zzJ(zzhaz.zzh(obj, j), zzhaz.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzJ) {
                return false;
            }
        }
        if (!((zzgxy) obj).zzt.equals(((zzgxy) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzgxu) obj).zza.equals(((zzgxu) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzu = zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
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
                        if (zzt == 50 && !((zzgzd) zzhaz.zzh(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhaz.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhae zzx = zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i6, i, i2, i10) && !zzP(obj, zzu, zzx(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || ((zzgxu) obj).zza.zzi();
    }
}
