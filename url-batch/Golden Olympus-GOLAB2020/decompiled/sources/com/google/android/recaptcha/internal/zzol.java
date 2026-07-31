package com.google.android.recaptcha.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.impl.C3139z9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i4, int i5, zzoi zzoiVar, boolean z4, int[] iArr2, int i6, int i7, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        this.zzi = zzoiVar instanceof zznd;
        boolean z5 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzj = iArr2;
        this.zzk = i6;
        this.zzl = i7;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i4) {
        zzow zzx = zzx(i4);
        int zzu = zzu(i4) & 1048575;
        if (!zzN(obj, i4)) {
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

    private final Object zzB(Object obj, int i4, int i5) {
        zzow zzx = zzx(i5);
        if (!zzR(obj, i4, i5)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i5) & 1048575);
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
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i4) {
        if (zzN(obj2, i4)) {
            int zzu = zzu(i4) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzu;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i4] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i4);
            if (!zzN(obj, i4)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzH(obj, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i4) {
        int i5 = this.zzc[i4];
        if (zzR(obj2, i5, i4)) {
            int zzu = zzu(i4) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzu;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i4] + " is present but null: " + obj2.toString());
            }
            zzow zzx = zzx(i4);
            if (!zzR(obj, i5, i4)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzI(obj, i5, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i4, zzov zzovVar) {
        long j4 = i4 & 1048575;
        if (zzM(i4)) {
            zzps.zzs(obj, j4, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j4, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j4, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i4) {
        int zzr = zzr(i4);
        long j4 = 1048575 & zzr;
        if (j4 == 1048575) {
            return;
        }
        zzps.zzq(obj, j4, (1 << (zzr >>> 20)) | zzps.zzc(obj, j4));
    }

    private final void zzI(Object obj, int i4, int i5) {
        zzps.zzq(obj, zzr(i5) & 1048575, i4);
    }

    private final void zzJ(Object obj, int i4, Object obj2) {
        zzb.putObject(obj, zzu(i4) & 1048575, obj2);
        zzH(obj, i4);
    }

    private final void zzK(Object obj, int i4, int i5, Object obj2) {
        zzb.putObject(obj, zzu(i5) & 1048575, obj2);
        zzI(obj, i4, i5);
    }

    private final boolean zzL(Object obj, Object obj2, int i4) {
        return zzN(obj, i4) == zzN(obj2, i4);
    }

    private static boolean zzM(int i4) {
        return (i4 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i4) {
        int zzr = zzr(i4);
        long j4 = zzr & 1048575;
        if (j4 != 1048575) {
            return (zzps.zzc(obj, j4) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i4);
        long j5 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzps.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzps.zzb(obj, j5)) != 0;
            case 2:
                return zzps.zzd(obj, j5) != 0;
            case 3:
                return zzps.zzd(obj, j5) != 0;
            case 4:
                return zzps.zzc(obj, j5) != 0;
            case 5:
                return zzps.zzd(obj, j5) != 0;
            case 6:
                return zzps.zzc(obj, j5) != 0;
            case 7:
                return zzps.zzw(obj, j5);
            case 8:
                Object zzf = zzps.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzle) {
                    return !zzle.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzps.zzf(obj, j5) != null;
            case 10:
                return !zzle.zzb.equals(zzps.zzf(obj, j5));
            case 11:
                return zzps.zzc(obj, j5) != 0;
            case 12:
                return zzps.zzc(obj, j5) != 0;
            case 13:
                return zzps.zzc(obj, j5) != 0;
            case 14:
                return zzps.zzd(obj, j5) != 0;
            case 15:
                return zzps.zzc(obj, j5) != 0;
            case 16:
                return zzps.zzd(obj, j5) != 0;
            case 17:
                return zzps.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzN(obj, i4) : (i6 & i7) != 0;
    }

    private static boolean zzP(Object obj, int i4, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i4 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i4, int i5) {
        return zzps.zzc(obj, (long) (zzr(i5) & 1048575)) == i4;
    }

    private static boolean zzS(Object obj, long j4) {
        return ((Boolean) zzps.zzf(obj, j4)).booleanValue();
    }

    private static final void zzT(int i4, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i4, (String) obj);
        } else {
            zzpyVar.zzd(i4, (zzle) obj);
        }
    }

    static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar != zzpm.zzc()) {
            return zzpmVar;
        }
        zzpm zzf = zzpm.zzf();
        zzndVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzol zzm(Class cls, zzof zzofVar, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        int i4;
        int charAt;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        char charAt2;
        int i12;
        char charAt3;
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
        int i20;
        int i21;
        int i22;
        int i23;
        String str;
        int objectFieldOffset;
        char c4;
        int i24;
        int i25;
        int i26;
        int i27;
        Field zzC;
        char charAt10;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field zzC2;
        Object obj2;
        Field zzC3;
        int i33;
        char charAt11;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        if (!(zzofVar instanceof zzou)) {
            throw null;
        }
        zzou zzouVar = (zzou) zzofVar;
        String zzd = zzouVar.zzd();
        int length = zzd.length();
        char c5 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i37 = 1;
            while (true) {
                i4 = i37 + 1;
                if (zzd.charAt(i37) < 55296) {
                    break;
                }
                i37 = i4;
            }
        } else {
            i4 = 1;
        }
        int i38 = i4 + 1;
        int charAt15 = zzd.charAt(i4);
        if (charAt15 >= 55296) {
            int i39 = charAt15 & 8191;
            int i40 = 13;
            while (true) {
                i36 = i38 + 1;
                charAt14 = zzd.charAt(i38);
                if (charAt14 < 55296) {
                    break;
                }
                i39 |= (charAt14 & 8191) << i40;
                i40 += 13;
                i38 = i36;
            }
            charAt15 = i39 | (charAt14 << i40);
            i38 = i36;
        }
        if (charAt15 == 0) {
            i6 = 0;
            i9 = 0;
            charAt = 0;
            i5 = 0;
            i7 = 0;
            i8 = 0;
            iArr = zza;
            i10 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt16 = zzd.charAt(i38);
            if (charAt16 >= 55296) {
                int i42 = charAt16 & 8191;
                int i43 = 13;
                while (true) {
                    i18 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i18;
                }
                charAt16 = i42 | (charAt9 << i43);
                i41 = i18;
            }
            int i44 = i41 + 1;
            int charAt17 = zzd.charAt(i41);
            if (charAt17 >= 55296) {
                int i45 = charAt17 & 8191;
                int i46 = 13;
                while (true) {
                    i17 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i17;
                }
                charAt17 = i45 | (charAt8 << i46);
                i44 = i17;
            }
            int i47 = i44 + 1;
            int charAt18 = zzd.charAt(i44);
            if (charAt18 >= 55296) {
                int i48 = charAt18 & 8191;
                int i49 = 13;
                while (true) {
                    i16 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i16;
                }
                charAt18 = i48 | (charAt7 << i49);
                i47 = i16;
            }
            int i50 = i47 + 1;
            int charAt19 = zzd.charAt(i47);
            if (charAt19 >= 55296) {
                int i51 = charAt19 & 8191;
                int i52 = 13;
                while (true) {
                    i15 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i15;
                }
                charAt19 = i51 | (charAt6 << i52);
                i50 = i15;
            }
            int i53 = i50 + 1;
            charAt = zzd.charAt(i50);
            if (charAt >= 55296) {
                int i54 = charAt & 8191;
                int i55 = 13;
                while (true) {
                    i14 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i14;
                }
                charAt = i54 | (charAt5 << i55);
                i53 = i14;
            }
            int i56 = i53 + 1;
            int charAt20 = zzd.charAt(i53);
            if (charAt20 >= 55296) {
                int i57 = charAt20 & 8191;
                int i58 = 13;
                while (true) {
                    i13 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i13;
                }
                charAt20 = i57 | (charAt4 << i58);
                i56 = i13;
            }
            int i59 = i56 + 1;
            int charAt21 = zzd.charAt(i56);
            if (charAt21 >= 55296) {
                int i60 = charAt21 & 8191;
                int i61 = 13;
                while (true) {
                    i12 = i59 + 1;
                    charAt3 = zzd.charAt(i59);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i60 |= (charAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i12;
                }
                charAt21 = i60 | (charAt3 << i61);
                i59 = i12;
            }
            int i62 = i59 + 1;
            int charAt22 = zzd.charAt(i59);
            if (charAt22 >= 55296) {
                int i63 = charAt22 & 8191;
                int i64 = 13;
                while (true) {
                    i11 = i62 + 1;
                    charAt2 = zzd.charAt(i62);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i63 |= (charAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i11;
                }
                charAt22 = i63 | (charAt2 << i64);
                i62 = i11;
            }
            int i65 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i66 = charAt20;
            i5 = charAt18;
            i6 = i66;
            i7 = charAt19;
            i8 = charAt22;
            i9 = i65;
            iArr = iArr2;
            i10 = charAt16;
            i38 = i62;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzouVar.zze();
        Class<?> cls2 = zzouVar.zza().getClass();
        int i67 = i8 + i6;
        int i68 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i68];
        int i69 = i8;
        int i70 = i67;
        int i71 = 0;
        int i72 = 0;
        while (i38 < length) {
            int i73 = i38 + 1;
            int charAt23 = zzd.charAt(i38);
            if (charAt23 >= c5) {
                int i74 = charAt23 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i35 = i75 + 1;
                    charAt13 = zzd.charAt(i75);
                    if (charAt13 < c5) {
                        break;
                    }
                    i74 |= (charAt13 & 8191) << i76;
                    i76 += 13;
                    i75 = i35;
                }
                charAt23 = i74 | (charAt13 << i76);
                i19 = i35;
            } else {
                i19 = i73;
            }
            int i77 = i19 + 1;
            int charAt24 = zzd.charAt(i19);
            if (charAt24 >= c5) {
                int i78 = charAt24 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i34 = i79 + 1;
                    charAt12 = zzd.charAt(i79);
                    if (charAt12 < c5) {
                        break;
                    }
                    i78 |= (charAt12 & 8191) << i80;
                    i80 += 13;
                    i79 = i34;
                }
                charAt24 = i78 | (charAt12 << i80);
                i20 = i34;
            } else {
                i20 = i77;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i71] = i72;
                i71++;
            }
            int i81 = charAt24 & KotlinVersion.MAX_COMPONENT_VALUE;
            zzou zzouVar2 = zzouVar;
            int i82 = charAt24 & com.ironsource.mediationsdk.metadata.a.f17688n;
            if (i81 >= 51) {
                int i83 = i20 + 1;
                int charAt25 = zzd.charAt(i20);
                char c6 = 55296;
                if (charAt25 >= 55296) {
                    int i84 = charAt25 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i33 = i85 + 1;
                        charAt11 = zzd.charAt(i85);
                        if (charAt11 < c6) {
                            break;
                        }
                        i84 |= (charAt11 & 8191) << i86;
                        i86 += 13;
                        i85 = i33;
                        c6 = 55296;
                    }
                    charAt25 = i84 | (charAt11 << i86);
                    i30 = i33;
                } else {
                    i30 = i83;
                }
                int i87 = i30;
                int i88 = i81 - 51;
                i21 = length;
                if (i88 == 9 || i88 == 17) {
                    i31 = i9 + 1;
                    int i89 = i72 / 3;
                    objArr[i89 + i89 + 1] = zze[i9];
                } else {
                    if (i88 == 12) {
                        if (zzouVar2.zzc() == 1 || i82 != 0) {
                            i31 = i9 + 1;
                            int i90 = i72 / 3;
                            objArr[i90 + i90 + 1] = zze[i9];
                        } else {
                            i32 = 0;
                            int i91 = charAt25 + charAt25;
                            obj = zze[i91];
                            int i92 = i32;
                            if (obj instanceof Field) {
                                zzC2 = (Field) obj;
                            } else {
                                zzC2 = zzC(cls2, (String) obj);
                                zze[i91] = zzC2;
                            }
                            int i93 = i10;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                            int i94 = i91 + 1;
                            obj2 = zze[i94];
                            i22 = i93;
                            if (obj2 instanceof Field) {
                                zzC3 = (Field) obj2;
                            } else {
                                zzC3 = zzC(cls2, (String) obj2);
                                zze[i94] = zzC3;
                            }
                            i24 = (int) unsafe.objectFieldOffset(zzC3);
                            str = zzd;
                            i26 = i92;
                            i20 = i87;
                            i25 = 0;
                            c4 = 55296;
                        }
                    }
                    i32 = i82;
                    int i912 = charAt25 + charAt25;
                    obj = zze[i912];
                    int i922 = i32;
                    if (obj instanceof Field) {
                    }
                    int i932 = i10;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                    int i942 = i912 + 1;
                    obj2 = zze[i942];
                    i22 = i932;
                    if (obj2 instanceof Field) {
                    }
                    i24 = (int) unsafe.objectFieldOffset(zzC3);
                    str = zzd;
                    i26 = i922;
                    i20 = i87;
                    i25 = 0;
                    c4 = 55296;
                }
                i9 = i31;
                i32 = i82;
                int i9122 = charAt25 + charAt25;
                obj = zze[i9122];
                int i9222 = i32;
                if (obj instanceof Field) {
                }
                int i9322 = i10;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC2);
                int i9422 = i9122 + 1;
                obj2 = zze[i9422];
                i22 = i9322;
                if (obj2 instanceof Field) {
                }
                i24 = (int) unsafe.objectFieldOffset(zzC3);
                str = zzd;
                i26 = i9222;
                i20 = i87;
                i25 = 0;
                c4 = 55296;
            } else {
                i21 = length;
                i22 = i10;
                int i95 = i9 + 1;
                Field zzC4 = zzC(cls2, (String) zze[i9]);
                if (i81 == 9 || i81 == 17) {
                    i23 = i95;
                    int i96 = i72 / 3;
                    objArr[i96 + i96 + 1] = zzC4.getType();
                } else {
                    if (i81 == 27) {
                        i28 = i95;
                        i29 = 1;
                        i9 += 2;
                    } else if (i81 == 49) {
                        i9 += 2;
                        i28 = i95;
                        i29 = 1;
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        if (zzouVar2.zzc() == 1 || i82 != 0) {
                            i9 += 2;
                            int i97 = i72 / 3;
                            objArr[i97 + i97 + 1] = zze[i95];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) != 0 || i81 > 17) {
                                c4 = 55296;
                                i24 = 1048575;
                                i25 = 0;
                            } else {
                                int i98 = i20 + 1;
                                int charAt26 = str.charAt(i20);
                                if (charAt26 >= 55296) {
                                    int i99 = charAt26 & 8191;
                                    int i100 = 13;
                                    while (true) {
                                        i27 = i98 + 1;
                                        charAt10 = str.charAt(i98);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i99 |= (charAt10 & 8191) << i100;
                                        i100 += 13;
                                        i98 = i27;
                                    }
                                    charAt26 = i99 | (charAt10 << i100);
                                } else {
                                    i27 = i98;
                                }
                                int i101 = i22 + i22 + (charAt26 / 32);
                                Object obj3 = zze[i101];
                                if (obj3 instanceof Field) {
                                    zzC = (Field) obj3;
                                } else {
                                    zzC = zzC(cls2, (String) obj3);
                                    zze[i101] = zzC;
                                }
                                int i102 = charAt26;
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzC);
                                i25 = i102 % 32;
                                i20 = i27;
                                c4 = 55296;
                                i24 = objectFieldOffset2;
                            }
                            if (i81 >= 18 && i81 <= 49) {
                                iArr[i70] = objectFieldOffset;
                                i70++;
                            }
                            i26 = i82;
                        } else {
                            str = zzd;
                            i9 = i95;
                            i82 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) != 0) {
                            }
                            c4 = 55296;
                            i24 = 1048575;
                            i25 = 0;
                            if (i81 >= 18) {
                                iArr[i70] = objectFieldOffset;
                                i70++;
                            }
                            i26 = i82;
                        }
                    } else if (i81 == 50) {
                        int i103 = i9 + 2;
                        int i104 = i69 + 1;
                        iArr[i69] = i72;
                        int i105 = i72 / 3;
                        int i106 = i105 + i105;
                        objArr[i106] = zze[i95];
                        if (i82 != 0) {
                            objArr[i106 + 1] = zze[i103];
                            i9 += 3;
                            str = zzd;
                            i69 = i104;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) != 0) {
                            }
                            c4 = 55296;
                            i24 = 1048575;
                            i25 = 0;
                            if (i81 >= 18) {
                            }
                            i26 = i82;
                        } else {
                            i9 = i103;
                            i69 = i104;
                            i82 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                            if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) != 0) {
                            }
                            c4 = 55296;
                            i24 = 1048575;
                            i25 = 0;
                            if (i81 >= 18) {
                            }
                            i26 = i82;
                        }
                    } else {
                        i23 = i95;
                    }
                    int i107 = i72 / 3;
                    objArr[i107 + i107 + i29] = zze[i28];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                    if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) != 0) {
                    }
                    c4 = 55296;
                    i24 = 1048575;
                    i25 = 0;
                    if (i81 >= 18) {
                    }
                    i26 = i82;
                }
                str = zzd;
                i9 = i23;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzC4);
                if ((charAt24 & Base64Utils.IO_BUFFER_SIZE) != 0) {
                }
                c4 = 55296;
                i24 = 1048575;
                i25 = 0;
                if (i81 >= 18) {
                }
                i26 = i82;
            }
            int i108 = i72 + 1;
            iArr3[i72] = charAt23;
            int i109 = i72 + 2;
            iArr3[i108] = ((charAt24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((charAt24 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | (i26 != 0 ? Integer.MIN_VALUE : 0) | (i81 << 20) | objectFieldOffset;
            i72 += 3;
            iArr3[i109] = (i25 << 20) | i24;
            i38 = i20;
            zzd = str;
            c5 = c4;
            zzouVar = zzouVar2;
            length = i21;
            i10 = i22;
        }
        return new zzol(iArr3, objArr, i5, i7, zzouVar.zza(), false, iArr, i8, i67, zzooVar, zznvVar, zzplVar, zzmpVar, zzodVar);
    }

    private static double zzn(Object obj, long j4) {
        return ((Double) zzps.zzf(obj, j4)).doubleValue();
    }

    private static float zzo(Object obj, long j4) {
        return ((Float) zzps.zzf(obj, j4)).floatValue();
    }

    private static int zzp(Object obj, long j4) {
        return ((Integer) zzps.zzf(obj, j4)).intValue();
    }

    private final int zzq(int i4) {
        if (i4 < this.zze || i4 > this.zzf) {
            return -1;
        }
        return zzs(i4, 0);
    }

    private final int zzr(int i4) {
        return this.zzc[i4 + 2];
    }

    private final int zzs(int i4, int i5) {
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

    private static int zzt(int i4) {
        return (i4 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzu(int i4) {
        return this.zzc[i4 + 1];
    }

    private static long zzv(Object obj, long j4) {
        return ((Long) zzps.zzf(obj, j4)).longValue();
    }

    private final zznh zzw(int i4) {
        int i5 = i4 / 3;
        return (zznh) this.zzd[i5 + i5 + 1];
    }

    private final zzow zzx(int i4) {
        Object[] objArr = this.zzd;
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        zzow zzowVar = (zzow) objArr[i6];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i6 + 1]);
        this.zzd[i6] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i4, Object obj2, zzpl zzplVar, Object obj3) {
        int i5 = this.zzc[i4];
        Object zzf = zzps.zzf(obj, zzu(i4) & 1048575);
        if (zzf == null || zzw(i4) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i4) {
        int i5 = i4 / 3;
        return this.zzd[i5 + i5];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i4;
        int i5;
        int zzA;
        int zzA2;
        int zzB;
        int zzA3;
        int zzA4;
        int zzA5;
        int zzd;
        int zzA6;
        int zzh;
        int zzg;
        int size;
        int zzl;
        int zzA7;
        int zzA8;
        int zzA9;
        int zze;
        int zzA10;
        int zzA11;
        int i6;
        int zzA12;
        int zzA13;
        int zzA14;
        int zzB2;
        int zzA15;
        int zzA16;
        int zzd2;
        int zzA17;
        zzol<T> zzolVar = this;
        Object obj2 = obj;
        int i7 = 1;
        Unsafe unsafe = zzb;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (i9 < zzolVar.zzc.length) {
            int zzu = zzolVar.zzu(i9);
            int zzt = zzt(zzu);
            int[] iArr = zzolVar.zzc;
            int i13 = iArr[i9];
            int i14 = iArr[i9 + 2];
            int i15 = i14 & i8;
            if (zzt <= 17) {
                if (i15 != i12) {
                    i10 = i15 == i8 ? 0 : unsafe.getInt(obj2, i15);
                    i12 = i15;
                }
                i4 = i7 << (i14 >>> 20);
            } else {
                i4 = 0;
            }
            int i16 = zzu & i8;
            if (zzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            int i17 = i11;
            long j4 = i16;
            switch (zzt) {
                case 0:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        i11 = i17 + zzln.zzA(i13 << 3) + 8;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 1:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzA = zzln.zzA(i13 << 3);
                        zzA4 = zzA + 4;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 2:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        long j5 = unsafe.getLong(obj2, j4);
                        zzA2 = zzln.zzA(i13 << 3);
                        zzB = zzln.zzB(j5);
                        zzA4 = zzA2 + zzB;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 3:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        long j6 = unsafe.getLong(obj2, j4);
                        zzA2 = zzln.zzA(i13 << 3);
                        zzB = zzln.zzB(j6);
                        zzA4 = zzA2 + zzB;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 4:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        long j7 = unsafe.getInt(obj2, j4);
                        zzA2 = zzln.zzA(i13 << 3);
                        zzB = zzln.zzB(j7);
                        zzA4 = zzA2 + zzB;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 5:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzA3 = zzln.zzA(i13 << 3);
                        zzA4 = zzA3 + 8;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 6:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzA = zzln.zzA(i13 << 3);
                        zzA4 = zzA + 4;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 7:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzA4 = zzln.zzA(i13 << 3) + 1;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 8:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        int i18 = i13 << 3;
                        Object object = unsafe.getObject(obj2, j4);
                        if (object instanceof zzle) {
                            zzA5 = zzln.zzA(i18);
                            zzd = ((zzle) object).zzd();
                            zzA6 = zzln.zzA(zzd);
                            zzA4 = zzA5 + zzA6 + zzd;
                            i11 = i17 + zzA4;
                            zzolVar = this;
                            i9 += 3;
                            obj2 = obj;
                            i7 = i5;
                            i8 = 1048575;
                        } else {
                            zzA2 = zzln.zzA(i18);
                            zzB = zzln.zzz((String) object);
                            zzA4 = zzA2 + zzB;
                            i11 = i17 + zzA4;
                            zzolVar = this;
                            i9 += 3;
                            obj2 = obj;
                            i7 = i5;
                            i8 = 1048575;
                        }
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 9:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzh = zzoy.zzh(i13, unsafe.getObject(obj2, j4), zzolVar.zzx(i9));
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 10:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzle zzleVar = (zzle) unsafe.getObject(obj2, j4);
                        zzA5 = zzln.zzA(i13 << 3);
                        zzd = zzleVar.zzd();
                        zzA6 = zzln.zzA(zzd);
                        zzA4 = zzA5 + zzA6 + zzd;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 11:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        int i19 = unsafe.getInt(obj2, j4);
                        zzA2 = zzln.zzA(i13 << 3);
                        zzB = zzln.zzA(i19);
                        zzA4 = zzA2 + zzB;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 12:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        long j8 = unsafe.getInt(obj2, j4);
                        zzA2 = zzln.zzA(i13 << 3);
                        zzB = zzln.zzB(j8);
                        zzA4 = zzA2 + zzB;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 13:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzA = zzln.zzA(i13 << 3);
                        zzA4 = zzA + 4;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 14:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzA3 = zzln.zzA(i13 << 3);
                        zzA4 = zzA3 + 8;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 15:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        int i20 = unsafe.getInt(obj2, j4);
                        zzA2 = zzln.zzA(i13 << 3);
                        zzB = zzln.zzA((i20 >> 31) ^ (i20 + i20));
                        zzA4 = zzA2 + zzB;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 16:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        long j9 = unsafe.getLong(obj2, j4);
                        zzA2 = zzln.zzA(i13 << 3);
                        zzB = zzln.zzB((j9 >> 63) ^ (j9 + j9));
                        zzA4 = zzA2 + zzB;
                        i11 = i17 + zzA4;
                        zzolVar = this;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzolVar = this;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 17:
                    i5 = i7;
                    if (zzolVar.zzO(obj2, i9, i12, i10, i4)) {
                        zzh = zzln.zzw(i13, (zzoi) unsafe.getObject(obj2, j4), zzolVar.zzx(i9));
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 18:
                    i5 = i7;
                    zzh = zzoy.zzd(i13, (List) unsafe.getObject(obj2, j4), false);
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 19:
                    i5 = i7;
                    zzh = zzoy.zzb(i13, (List) unsafe.getObject(obj2, j4), false);
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 20:
                    i5 = i7;
                    List list = (List) unsafe.getObject(obj2, j4);
                    int i21 = zzoy.zza;
                    if (list.size() != 0) {
                        zzg = zzoy.zzg(list) + (list.size() * zzln.zzA(i13 << 3));
                        i11 = i17 + zzg;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzg = 0;
                    i11 = i17 + zzg;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 21:
                    i5 = i7;
                    List list2 = (List) unsafe.getObject(obj2, j4);
                    int i22 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzoy.zzl(list2);
                        zzA7 = zzln.zzA(i13 << 3);
                        zzh = zzl + (size * zzA7);
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzh = 0;
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 22:
                    i5 = i7;
                    List list3 = (List) unsafe.getObject(obj2, j4);
                    int i23 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzoy.zzf(list3);
                        zzA7 = zzln.zzA(i13 << 3);
                        zzh = zzl + (size * zzA7);
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzh = 0;
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case ConnectionResult.API_DISABLED /* 23 */:
                    i5 = i7;
                    zzh = zzoy.zzd(i13, (List) unsafe.getObject(obj2, j4), false);
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 24:
                    i5 = i7;
                    zzh = zzoy.zzb(i13, (List) unsafe.getObject(obj2, j4), false);
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 25:
                    i5 = i7;
                    List list4 = (List) unsafe.getObject(obj2, j4);
                    int i24 = zzoy.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzln.zzA(i13 << 3) + 1);
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzh = 0;
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 26:
                    i5 = i7;
                    List list5 = (List) unsafe.getObject(obj2, j4);
                    int i25 = zzoy.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzln.zzA(i13 << 3) * size3;
                        if (list5 instanceof zznu) {
                            zznu zznuVar = (zznu) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object zzc = zznuVar.zzc();
                                if (zzc instanceof zzle) {
                                    int zzd3 = ((zzle) zzc).zzd();
                                    zzg += zzln.zzA(zzd3) + zzd3;
                                } else {
                                    zzg += zzln.zzz((String) zzc);
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj3 = list5.get(i27);
                                if (obj3 instanceof zzle) {
                                    int zzd4 = ((zzle) obj3).zzd();
                                    zzg += zzln.zzA(zzd4) + zzd4;
                                } else {
                                    zzg += zzln.zzz((String) obj3);
                                }
                            }
                        }
                        i11 = i17 + zzg;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzg = 0;
                    i11 = i17 + zzg;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 27:
                    i5 = i7;
                    List list6 = (List) unsafe.getObject(obj2, j4);
                    zzow zzx = zzolVar.zzx(i9);
                    int i28 = zzoy.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA8 = 0;
                    } else {
                        zzA8 = zzln.zzA(i13 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            Object obj4 = list6.get(i29);
                            if (obj4 instanceof zznt) {
                                int zza2 = ((zznt) obj4).zza();
                                zzA8 += zzln.zzA(zza2) + zza2;
                            } else {
                                zzA8 += zzln.zzy((zzoi) obj4, zzx);
                            }
                        }
                    }
                    i11 = zzA8 + i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i5 = i7;
                    List list7 = (List) unsafe.getObject(obj2, j4);
                    int i30 = zzoy.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzA9 = 0;
                    } else {
                        zzA9 = size5 * zzln.zzA(i13 << 3);
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int zzd5 = ((zzle) list7.get(i31)).zzd();
                            zzA9 += zzln.zzA(zzd5) + zzd5;
                        }
                    }
                    i11 = i17 + zzA9;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 29:
                    i5 = i7;
                    List list8 = (List) unsafe.getObject(obj2, j4);
                    int i32 = zzoy.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzoy.zzk(list8);
                        zzA7 = zzln.zzA(i13 << 3);
                        zzh = zzl + (size * zzA7);
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzh = 0;
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    i5 = i7;
                    List list9 = (List) unsafe.getObject(obj2, j4);
                    int i33 = zzoy.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzoy.zza(list9);
                        zzA7 = zzln.zzA(i13 << 3);
                        zzh = zzl + (size * zzA7);
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzh = 0;
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    i5 = i7;
                    zzh = zzoy.zzb(i13, (List) unsafe.getObject(obj2, j4), false);
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 32:
                    i5 = i7;
                    zzh = zzoy.zzd(i13, (List) unsafe.getObject(obj2, j4), false);
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 33:
                    i5 = i7;
                    List list10 = (List) unsafe.getObject(obj2, j4);
                    int i34 = zzoy.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zzoy.zzi(list10);
                        zzA7 = zzln.zzA(i13 << 3);
                        zzh = zzl + (size * zzA7);
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzh = 0;
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 34:
                    i5 = i7;
                    List list11 = (List) unsafe.getObject(obj2, j4);
                    int i35 = zzoy.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zzoy.zzj(list11);
                        zzA7 = zzln.zzA(i13 << 3);
                        zzh = zzl + (size * zzA7);
                        i11 = i17 + zzh;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    zzh = 0;
                    i11 = i17 + zzh;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case C3139z9.f40333J /* 35 */:
                    i5 = i7;
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 36:
                    i5 = i7;
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 37:
                    i5 = i7;
                    zze = zzoy.zzg((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case C3139z9.f40334K /* 38 */:
                    i5 = i7;
                    zze = zzoy.zzl((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 39:
                    i5 = i7;
                    zze = zzoy.zzf((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 40:
                    i5 = i7;
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 41:
                    i5 = i7;
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 42:
                    i5 = i7;
                    List list12 = (List) unsafe.getObject(obj2, j4);
                    int i36 = zzoy.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 43:
                    i5 = i7;
                    zze = zzoy.zzk((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                    i5 = i7;
                    zze = zzoy.zza((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                    i5 = i7;
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 46:
                    i5 = i7;
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 47:
                    i5 = i7;
                    zze = zzoy.zzi((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 48:
                    i5 = i7;
                    zze = zzoy.zzj((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i13 << 3);
                        zzA11 = zzln.zzA(zze);
                        zzA9 = zzA10 + zzA11 + zze;
                        i11 = i17 + zzA9;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j4);
                    zzow zzx2 = zzolVar.zzx(i9);
                    int i37 = zzoy.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i6 = 0;
                    } else {
                        int i38 = 0;
                        i6 = 0;
                        while (i38 < size6) {
                            i6 += zzln.zzw(i13, (zzoi) list13.get(i38), zzx2);
                            i38++;
                            i7 = i7;
                        }
                    }
                    i5 = i7;
                    i11 = i17 + i6;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 50:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj2, j4);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA12 = zzln.zzA(i13 << 3);
                        zzA15 = zzA12 + 8;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA13 = zzln.zzA(i13 << 3);
                        zzA15 = zzA13 + 4;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        long zzv = zzv(obj2, j4);
                        zzA14 = zzln.zzA(i13 << 3);
                        zzB2 = zzln.zzB(zzv);
                        zzA15 = zzA14 + zzB2;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        long zzv2 = zzv(obj2, j4);
                        zzA14 = zzln.zzA(i13 << 3);
                        zzB2 = zzln.zzB(zzv2);
                        zzA15 = zzA14 + zzB2;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        long zzp = zzp(obj2, j4);
                        zzA14 = zzln.zzA(i13 << 3);
                        zzB2 = zzln.zzB(zzp);
                        zzA15 = zzA14 + zzB2;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA12 = zzln.zzA(i13 << 3);
                        zzA15 = zzA12 + 8;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA13 = zzln.zzA(i13 << 3);
                        zzA15 = zzA13 + 4;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 58:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA15 = zzln.zzA(i13 << 3) + i7;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 59:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        int i39 = i13 << 3;
                        Object object2 = unsafe.getObject(obj2, j4);
                        if (object2 instanceof zzle) {
                            zzA16 = zzln.zzA(i39);
                            zzd2 = ((zzle) object2).zzd();
                            zzA17 = zzln.zzA(zzd2);
                            zzA15 = zzA16 + zzA17 + zzd2;
                            i11 = i17 + zzA15;
                            i5 = i7;
                            i9 += 3;
                            obj2 = obj;
                            i7 = i5;
                            i8 = 1048575;
                        } else {
                            zzA14 = zzln.zzA(i39);
                            zzB2 = zzln.zzz((String) object2);
                            zzA15 = zzA14 + zzB2;
                            i11 = i17 + zzA15;
                            i5 = i7;
                            i9 += 3;
                            obj2 = obj;
                            i7 = i5;
                            i8 = 1048575;
                        }
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 60:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA15 = zzoy.zzh(i13, unsafe.getObject(obj2, j4), zzolVar.zzx(i9));
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 61:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzle zzleVar2 = (zzle) unsafe.getObject(obj2, j4);
                        zzA16 = zzln.zzA(i13 << 3);
                        zzd2 = zzleVar2.zzd();
                        zzA17 = zzln.zzA(zzd2);
                        zzA15 = zzA16 + zzA17 + zzd2;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        int zzp2 = zzp(obj2, j4);
                        zzA14 = zzln.zzA(i13 << 3);
                        zzB2 = zzln.zzA(zzp2);
                        zzA15 = zzA14 + zzB2;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 63:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        long zzp3 = zzp(obj2, j4);
                        zzA14 = zzln.zzA(i13 << 3);
                        zzB2 = zzln.zzB(zzp3);
                        zzA15 = zzA14 + zzB2;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA13 = zzln.zzA(i13 << 3);
                        zzA15 = zzA13 + 4;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA12 = zzln.zzA(i13 << 3);
                        zzA15 = zzA12 + 8;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 66:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        int zzp4 = zzp(obj2, j4);
                        zzA14 = zzln.zzA(i13 << 3);
                        zzB2 = zzln.zzA((zzp4 >> 31) ^ (zzp4 + zzp4));
                        zzA15 = zzA14 + zzB2;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 67:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        long zzv3 = zzv(obj2, j4);
                        zzA14 = zzln.zzA(i13 << 3);
                        zzB2 = zzln.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        zzA15 = zzA14 + zzB2;
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                case 68:
                    if (zzolVar.zzR(obj2, i13, i9)) {
                        zzA15 = zzln.zzw(i13, (zzoi) unsafe.getObject(obj2, j4), zzolVar.zzx(i9));
                        i11 = i17 + zzA15;
                        i5 = i7;
                        i9 += 3;
                        obj2 = obj;
                        i7 = i5;
                        i8 = 1048575;
                    }
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
                default:
                    i5 = i7;
                    i11 = i17;
                    i9 += 3;
                    obj2 = obj;
                    i7 = i5;
                    i8 = 1048575;
            }
        }
        int zza3 = i11 + ((zznd) obj).zzc.zza();
        if (!zzolVar.zzh) {
            return zza3;
        }
        zzmt zzmtVar = ((zzna) obj).zzb;
        int zzc2 = zzmtVar.zza.zzc();
        int i40 = 0;
        for (int i41 = 0; i41 < zzc2; i41++) {
            Map.Entry zzg2 = zzmtVar.zza.zzg(i41);
            i40 += zzmt.zza((zzms) ((zzpa) zzg2).zza(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzmtVar.zza.zzd()) {
            i40 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i40;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i4;
        long doubleToLongBits;
        int floatToIntBits;
        int i5;
        int i6 = 0;
        for (int i7 = 0; i7 < this.zzc.length; i7 += 3) {
            int zzu = zzu(i7);
            int[] iArr = this.zzc;
            int i8 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i9 = iArr[i7];
            long j4 = i8;
            int i10 = 37;
            switch (zzt) {
                case 0:
                    i4 = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j4));
                    byte[] bArr = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + floatToIntBits;
                    break;
                case 1:
                    i4 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j4));
                    i6 = i4 + floatToIntBits;
                    break;
                case 2:
                    i4 = i6 * 53;
                    doubleToLongBits = zzps.zzd(obj, j4);
                    byte[] bArr2 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + floatToIntBits;
                    break;
                case 3:
                    i4 = i6 * 53;
                    doubleToLongBits = zzps.zzd(obj, j4);
                    byte[] bArr3 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + floatToIntBits;
                    break;
                case 4:
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzc(obj, j4);
                    i6 = i4 + floatToIntBits;
                    break;
                case 5:
                    i4 = i6 * 53;
                    doubleToLongBits = zzps.zzd(obj, j4);
                    byte[] bArr4 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + floatToIntBits;
                    break;
                case 6:
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzc(obj, j4);
                    i6 = i4 + floatToIntBits;
                    break;
                case 7:
                    i4 = i6 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j4));
                    i6 = i4 + floatToIntBits;
                    break;
                case 8:
                    i4 = i6 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j4)).hashCode();
                    i6 = i4 + floatToIntBits;
                    break;
                case 9:
                    i5 = i6 * 53;
                    Object zzf = zzps.zzf(obj, j4);
                    if (zzf != null) {
                        i10 = zzf.hashCode();
                    }
                    i6 = i5 + i10;
                    break;
                case 10:
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzf(obj, j4).hashCode();
                    i6 = i4 + floatToIntBits;
                    break;
                case 11:
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzc(obj, j4);
                    i6 = i4 + floatToIntBits;
                    break;
                case 12:
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzc(obj, j4);
                    i6 = i4 + floatToIntBits;
                    break;
                case 13:
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzc(obj, j4);
                    i6 = i4 + floatToIntBits;
                    break;
                case 14:
                    i4 = i6 * 53;
                    doubleToLongBits = zzps.zzd(obj, j4);
                    byte[] bArr5 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + floatToIntBits;
                    break;
                case 15:
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzc(obj, j4);
                    i6 = i4 + floatToIntBits;
                    break;
                case 16:
                    i4 = i6 * 53;
                    doubleToLongBits = zzps.zzd(obj, j4);
                    byte[] bArr6 = zznl.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i6 = i4 + floatToIntBits;
                    break;
                case 17:
                    i5 = i6 * 53;
                    Object zzf2 = zzps.zzf(obj, j4);
                    if (zzf2 != null) {
                        i10 = zzf2.hashCode();
                    }
                    i6 = i5 + i10;
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
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzf(obj, j4).hashCode();
                    i6 = i4 + floatToIntBits;
                    break;
                case 50:
                    i4 = i6 * 53;
                    floatToIntBits = zzps.zzf(obj, j4).hashCode();
                    i6 = i4 + floatToIntBits;
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j4));
                        byte[] bArr7 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j4));
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr8 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr9 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzp(obj, j4);
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr10 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzp(obj, j4);
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j4));
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j4)).hashCode();
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzps.zzf(obj, j4).hashCode();
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzps.zzf(obj, j4).hashCode();
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzp(obj, j4);
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzp(obj, j4);
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzp(obj, j4);
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr11 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzp(obj, j4);
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        doubleToLongBits = zzv(obj, j4);
                        byte[] bArr12 = zznl.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i9, i7)) {
                        i4 = i6 * 53;
                        floatToIntBits = zzps.zzf(obj, j4).hashCode();
                        i6 = i4 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i6 * 53) + ((zznd) obj).zzc.hashCode();
        return this.zzh ? (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode() : hashCode;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzc(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.recaptcha.internal.zzkt r40) {
        /*
            Method dump skipped, instructions count: 3856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i4 = 0; i4 < iArr.length; i4 += 3) {
                int zzu = zzu(i4);
                int i5 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j4 = i5;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
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
                                ((zznk) zzps.zzf(obj, j4)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i4], i4)) {
                        zzx(i4).zzf(zzb.getObject(obj, j4));
                    }
                }
                if (zzN(obj, i4)) {
                    zzx(i4).zzf(zzb.getObject(obj, j4));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzu = zzu(i4);
            int i5 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i6 = iArr[i4];
            long j4 = i5;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i4)) {
                        zzps.zzo(obj, j4, zzps.zza(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i4)) {
                        zzps.zzp(obj, j4, zzps.zzb(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i4)) {
                        zzps.zzr(obj, j4, zzps.zzd(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i4)) {
                        zzps.zzr(obj, j4, zzps.zzd(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i4)) {
                        zzps.zzq(obj, j4, zzps.zzc(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i4)) {
                        zzps.zzr(obj, j4, zzps.zzd(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i4)) {
                        zzps.zzq(obj, j4, zzps.zzc(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i4)) {
                        zzps.zzm(obj, j4, zzps.zzw(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i4)) {
                        zzps.zzs(obj, j4, zzps.zzf(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i4);
                    break;
                case 10:
                    if (zzN(obj2, i4)) {
                        zzps.zzs(obj, j4, zzps.zzf(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i4)) {
                        zzps.zzq(obj, j4, zzps.zzc(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i4)) {
                        zzps.zzq(obj, j4, zzps.zzc(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i4)) {
                        zzps.zzq(obj, j4, zzps.zzc(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i4)) {
                        zzps.zzr(obj, j4, zzps.zzd(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i4)) {
                        zzps.zzq(obj, j4, zzps.zzc(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i4)) {
                        zzps.zzr(obj, j4, zzps.zzd(obj2, j4));
                        zzH(obj, i4);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i4);
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
                    zznk zznkVar = (zznk) zzps.zzf(obj, j4);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j4);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j4, zznkVar2);
                    break;
                case 50:
                    int i7 = zzoy.zza;
                    zzps.zzs(obj, j4, zzod.zzb(zzps.zzf(obj, j4), zzps.zzf(obj2, j4)));
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
                    if (zzR(obj2, i6, i4)) {
                        zzps.zzs(obj, j4, zzps.zzf(obj2, j4));
                        zzI(obj, i6, i4);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i4);
                    break;
                case 61:
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzR(obj2, i6, i4)) {
                        zzps.zzs(obj, j4, zzps.zzf(obj2, j4));
                        zzI(obj, i6, i4);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i4);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x003e, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x084b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0872 A[LOOP:3: B:53:0x086e->B:55:0x0872, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x083e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, zzov zzovVar, zzmo zzmoVar) {
        Object obj2;
        zzol<T> zzolVar;
        Object obj3;
        boolean z4;
        ?? r15;
        int i4;
        zzpl zzplVar;
        zzpl zzplVar2;
        Object obj4;
        zzpl zzplVar3;
        Object obj5;
        Object valueOf;
        int ordinal;
        Object zze;
        boolean z5;
        boolean z6;
        ?? r152;
        boolean z7;
        Object obj6;
        Object obj7;
        zzol<T> zzolVar2 = this;
        boolean z8 = true;
        zzmoVar.getClass();
        zzD(obj);
        zzpl zzplVar4 = zzolVar2.zzm;
        ?? r9 = 0;
        Object obj8 = null;
        zzmt zzmtVar = null;
        while (true) {
            try {
                int zzc = zzovVar.zzc();
                int zzq = zzolVar2.zzq(zzc);
                if (zzq >= 0) {
                    obj5 = obj;
                    zzplVar3 = zzplVar4;
                    obj4 = obj8;
                    try {
                        int zzu = zzolVar2.zzu(zzq);
                        try {
                        } catch (zznm unused) {
                            zzolVar = zzolVar2;
                            obj3 = obj4;
                            zzplVar4 = zzplVar3;
                            obj2 = obj5;
                        }
                        switch (zzt(zzu)) {
                            case 0:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzo(obj5, zzu & 1048575, zzovVar.zza());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 1:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzp(obj5, zzu & 1048575, zzovVar.zzb());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 2:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzr(obj5, zzu & 1048575, zzovVar.zzl());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 3:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzr(obj5, zzu & 1048575, zzovVar.zzo());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 4:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzq(obj5, zzu & 1048575, zzovVar.zzg());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 5:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzr(obj5, zzu & 1048575, zzovVar.zzk());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 6:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzq(obj5, zzu & 1048575, zzovVar.zzf());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 7:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzm(obj5, zzu & 1048575, zzovVar.zzN());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 8:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzolVar.zzG(obj5, zzu, zzovVar);
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 9:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzoi zzoiVar = (zzoi) zzolVar.zzA(obj5, zzq);
                                zzovVar.zzu(zzoiVar, zzolVar.zzx(zzq), zzmoVar);
                                zzolVar.zzJ(obj5, zzq, zzoiVar);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 10:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzs(obj5, zzu & 1048575, zzovVar.zzp());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 11:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzq(obj5, zzu & 1048575, zzovVar.zzj());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 12:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                boolean z9 = z8 ? 1 : 0;
                                int zze2 = zzovVar.zze();
                                zznh zzw = zzolVar.zzw(zzq);
                                if (zzw != null && !zzw.zza(zze2)) {
                                    obj8 = zzoy.zzo(obj5, zzc, zze2, obj3, zzplVar4);
                                    z6 = z9;
                                    zzolVar2 = zzolVar;
                                    z8 = z6;
                                    r9 = 0;
                                }
                                zzps.zzq(obj5, zzu & 1048575, zze2);
                                zzolVar.zzH(obj5, zzq);
                                z7 = z9;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                                break;
                            case 13:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzq(obj5, zzu & 1048575, zzovVar.zzh());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 14:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzr(obj5, zzu & 1048575, zzovVar.zzm());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 15:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                z7 = z8 ? 1 : 0;
                                zzps.zzq(obj5, zzu & 1048575, zzovVar.zzi());
                                zzolVar.zzH(obj5, zzq);
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 16:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                obj2 = obj5;
                                int i5 = zzu & 1048575;
                                long zzn = zzovVar.zzn();
                                z5 = z8 ? 1 : 0;
                                try {
                                    zzps.zzr(obj2, i5, zzn);
                                    zzolVar.zzH(obj2, zzq);
                                    z7 = z5;
                                    obj8 = obj3;
                                    z6 = z7;
                                } catch (zznm unused2) {
                                    obj8 = obj3;
                                    r152 = z5;
                                    if (obj8 == null) {
                                    }
                                    z6 = r152;
                                    if (!zzplVar4.zzk(obj8, zzovVar, 0)) {
                                    }
                                    zzolVar2 = zzolVar;
                                    z8 = z6;
                                    r9 = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    z4 = z5;
                                    obj8 = obj3;
                                    r15 = z4;
                                    i4 = zzolVar.zzk;
                                    while (i4 < zzolVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                                break;
                            case 17:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzoi zzoiVar2 = (zzoi) zzolVar.zzA(obj5, zzq);
                                zzovVar.zzt(zzoiVar2, zzolVar.zzx(zzq), zzmoVar);
                                zzolVar.zzJ(obj5, zzq, zzoiVar2);
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 18:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzx(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 19:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzB(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 20:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzE(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 21:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzM(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 22:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzD(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case ConnectionResult.API_DISABLED /* 23 */:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzA(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 24:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzz(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 25:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzv(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 26:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                if (zzM(zzu)) {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj5, zzu & 1048575), z8);
                                } else {
                                    ((zzlj) zzovVar).zzK(zznv.zza(obj5, zzu & 1048575), false);
                                }
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 27:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzF(zznv.zza(obj5, zzu & 1048575), zzolVar.zzx(zzq), zzmoVar);
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzw(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 29:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzL(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                zzolVar = zzolVar2;
                                List zza2 = zznv.zza(obj5, zzu & 1048575);
                                zzovVar.zzy(zza2);
                                zzplVar2 = zzplVar3;
                                obj8 = zzoy.zzn(obj5, zzc, zza2, zzolVar.zzw(zzq), obj4, zzplVar2);
                                zzplVar4 = zzplVar2;
                                zzolVar2 = zzolVar;
                            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzG(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 32:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzH(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 33:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzI(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 34:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzJ(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case C3139z9.f40333J /* 35 */:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzx(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 36:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzB(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 37:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzE(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case C3139z9.f40334K /* 38 */:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzM(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 39:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzD(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 40:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzA(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 41:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzz(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 42:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                zzovVar.zzv(zznv.zza(obj5, zzu & 1048575));
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 43:
                                zzolVar = zzolVar2;
                                obj3 = obj4;
                                zzplVar4 = zzplVar3;
                                obj2 = obj5;
                                try {
                                    zzovVar.zzL(zznv.zza(obj2, zzu & 1048575));
                                    z7 = z8 ? 1 : 0;
                                    obj8 = obj3;
                                    z6 = z7;
                                } catch (zznm unused3) {
                                    z5 = z8 ? 1 : 0;
                                    obj8 = obj3;
                                    r152 = z5;
                                    if (obj8 == null) {
                                    }
                                    z6 = r152;
                                    if (!zzplVar4.zzk(obj8, zzovVar, 0)) {
                                    }
                                    zzolVar2 = zzolVar;
                                    z8 = z6;
                                    r9 = 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z4 = z8 ? 1 : 0;
                                    obj8 = obj3;
                                    r15 = z4;
                                    i4 = zzolVar.zzk;
                                    while (i4 < zzolVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                                break;
                            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                                zzolVar = zzolVar2;
                                zzplVar2 = zzplVar3;
                                List zza3 = zznv.zza(obj5, zzu & 1048575);
                                zzovVar.zzy(zza3);
                                obj8 = zzoy.zzn(obj5, zzc, zza3, zzolVar.zzw(zzq), obj4, zzplVar2);
                                zzplVar4 = zzplVar2;
                                zzolVar2 = zzolVar;
                            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzovVar.zzG(zznv.zza(obj6, zzu & 1048575));
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 46:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzovVar.zzH(zznv.zza(obj6, zzu & 1048575));
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 47:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzovVar.zzI(zznv.zza(obj6, zzu & 1048575));
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 48:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzovVar.zzJ(zznv.zza(obj6, zzu & 1048575));
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 49:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzovVar.zzC(zznv.zza(obj6, zzu & 1048575), zzolVar.zzx(zzq), zzmoVar);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 50:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                Object zzz = zzolVar.zzz(zzq);
                                long zzu2 = zzolVar.zzu(zzq) & 1048575;
                                Object zzf = zzps.zzf(obj6, zzu2);
                                if (zzf != null) {
                                    boolean zza4 = zzod.zza(zzf);
                                    obj7 = zzf;
                                    if (zza4) {
                                        zzoc zzb2 = zzoc.zza().zzb();
                                        zzod.zzb(zzb2, zzf);
                                        zzps.zzs(obj6, zzu2, zzb2);
                                        obj7 = zzb2;
                                    }
                                } else {
                                    zzoc zzb3 = zzoc.zza().zzb();
                                    zzps.zzs(obj6, zzu2, zzb3);
                                    obj7 = zzb3;
                                }
                                throw r9;
                                break;
                            case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Double.valueOf(zzovVar.zza()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case IronSourceConstants.SET_USER_ID /* 52 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Float.valueOf(zzovVar.zzb()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Long.valueOf(zzovVar.zzl()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Long.valueOf(zzovVar.zzo()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Integer.valueOf(zzovVar.zzg()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Long.valueOf(zzovVar.zzk()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Integer.valueOf(zzovVar.zzf()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 58:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Boolean.valueOf(zzovVar.zzN()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 59:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzolVar.zzG(obj6, zzu, zzovVar);
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 60:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzoi zzoiVar3 = (zzoi) zzolVar.zzB(obj6, zzc, zzq);
                                zzovVar.zzu(zzoiVar3, zzolVar.zzx(zzq), zzmoVar);
                                zzolVar.zzK(obj6, zzc, zzq, zzoiVar3);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 61:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, zzovVar.zzp());
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case IronSourceConstants.RETRY_LIMIT /* 62 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Integer.valueOf(zzovVar.zzj()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 63:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                int zze3 = zzovVar.zze();
                                zznh zzw2 = zzolVar.zzw(zzq);
                                if (zzw2 != null && !zzw2.zza(zze3)) {
                                    obj8 = zzoy.zzo(obj6, zzc, zze3, obj4, zzplVar2);
                                    zzplVar4 = zzplVar2;
                                    zzolVar2 = zzolVar;
                                }
                                zzps.zzs(obj6, zzu & 1048575, Integer.valueOf(zze3));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                                break;
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Integer.valueOf(zzovVar.zzh()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Long.valueOf(zzovVar.zzm()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 66:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Integer.valueOf(zzovVar.zzi()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 67:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                zzps.zzs(obj6, zzu & 1048575, Long.valueOf(zzovVar.zzn()));
                                zzolVar.zzI(obj6, zzc, zzq);
                                obj3 = obj4;
                                zzplVar4 = zzplVar2;
                                z7 = z8 ? 1 : 0;
                                obj8 = obj3;
                                z6 = z7;
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                            case 68:
                                zzolVar = zzolVar2;
                                obj6 = obj5;
                                zzplVar2 = zzplVar3;
                                try {
                                    zzoi zzoiVar4 = (zzoi) zzolVar.zzB(obj6, zzc, zzq);
                                    zzovVar.zzt(zzoiVar4, zzolVar.zzx(zzq), zzmoVar);
                                    zzolVar.zzK(obj6, zzc, zzq, zzoiVar4);
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    z7 = z8 ? 1 : 0;
                                    obj8 = obj3;
                                    z6 = z7;
                                } catch (zznm unused4) {
                                    obj2 = obj6;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    z5 = z8 ? 1 : 0;
                                    obj8 = obj3;
                                    r152 = z5;
                                    if (obj8 == null) {
                                    }
                                    z6 = r152;
                                    if (!zzplVar4.zzk(obj8, zzovVar, 0)) {
                                    }
                                    zzolVar2 = zzolVar;
                                    z8 = z6;
                                    r9 = 0;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj6;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    z4 = z8 ? 1 : 0;
                                    obj8 = obj3;
                                    r15 = z4;
                                    i4 = zzolVar.zzk;
                                    while (i4 < zzolVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                                zzolVar2 = zzolVar;
                                z8 = z6;
                                r9 = 0;
                                break;
                            default:
                                obj8 = obj4 == null ? zzplVar3.zza(obj5) : obj4;
                                try {
                                } catch (zznm unused5) {
                                    zzolVar = zzolVar2;
                                    obj2 = obj5;
                                    zzplVar4 = zzplVar3;
                                    r152 = z8 ? 1 : 0;
                                    if (obj8 == null) {
                                        try {
                                            obj8 = zzplVar4.zza(obj2);
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r15 = r152;
                                            i4 = zzolVar.zzk;
                                            while (i4 < zzolVar.zzl) {
                                            }
                                            if (obj8 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    z6 = r152;
                                    if (!zzplVar4.zzk(obj8, zzovVar, 0)) {
                                        for (int i6 = zzolVar.zzk; i6 < zzolVar.zzl; i6 += r152) {
                                            zzolVar.zzy(obj2, zzolVar.zzj[i6], obj8, zzplVar4, obj);
                                        }
                                        if (obj8 == null) {
                                        }
                                    }
                                    zzolVar2 = zzolVar;
                                    z8 = z6;
                                    r9 = 0;
                                } catch (Throwable th5) {
                                    th = th5;
                                    zzolVar = zzolVar2;
                                    obj2 = obj5;
                                    zzplVar4 = zzplVar3;
                                    r15 = z8 ? 1 : 0;
                                    i4 = zzolVar.zzk;
                                    while (i4 < zzolVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                                if (!zzplVar3.zzk(obj8, zzovVar, 0)) {
                                    int i7 = zzolVar2.zzk;
                                    while (i7 < zzolVar2.zzl) {
                                        zzpl zzplVar5 = zzplVar3;
                                        zzolVar2.zzy(obj, zzolVar2.zzj[i7], obj8, zzplVar5, obj);
                                        i7 += z8 ? 1 : 0;
                                        obj5 = obj;
                                        zzolVar2 = zzolVar2;
                                        zzplVar3 = zzplVar5;
                                    }
                                    Object obj9 = obj5;
                                    zzplVar = zzplVar3;
                                    obj2 = obj9;
                                    break;
                                } else {
                                    zzolVar = zzolVar2;
                                    zzplVar2 = zzplVar3;
                                    zzplVar4 = zzplVar2;
                                    zzolVar2 = zzolVar;
                                }
                                break;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        zzpl zzplVar6 = zzplVar3;
                        zzolVar = zzolVar2;
                        obj3 = obj4;
                        zzplVar4 = zzplVar6;
                        obj2 = obj5;
                        z4 = z8 ? 1 : 0;
                        obj8 = obj3;
                        r15 = z4;
                        i4 = zzolVar.zzk;
                        while (i4 < zzolVar.zzl) {
                            zzolVar.zzy(obj2, zzolVar.zzj[i4], obj8, zzplVar4, obj);
                            i4 += r15;
                            zzolVar = this;
                        }
                        if (obj8 != null) {
                            zzplVar4.zzj(obj2, obj8);
                        }
                        throw th;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i8 = zzolVar2.zzk;
                    while (i8 < zzolVar2.zzl) {
                        zzolVar2.zzy(obj, zzolVar2.zzj[i8], obj8, zzplVar4, obj);
                        i8 += z8 ? 1 : 0;
                        zzplVar4 = zzplVar4;
                    }
                    zzplVar = zzplVar4;
                    obj2 = obj;
                } else {
                    Object obj10 = obj;
                    zzplVar2 = zzplVar4;
                    obj4 = obj8;
                    try {
                        zznc zza5 = !zzolVar2.zzh ? r9 : zzmoVar.zza(zzolVar2.zzg, zzc);
                        if (zza5 != null) {
                            if (zzmtVar == null) {
                                try {
                                    zzmtVar = ((zzna) obj10).zzi();
                                } catch (Throwable th7) {
                                    th = th7;
                                    zzolVar = zzolVar2;
                                    obj2 = obj10;
                                    obj3 = obj4;
                                    zzplVar4 = zzplVar2;
                                    z4 = z8 ? 1 : 0;
                                    obj8 = obj3;
                                    r15 = z4;
                                    i4 = zzolVar.zzk;
                                    while (i4 < zzolVar.zzl) {
                                    }
                                    if (obj8 != null) {
                                    }
                                    throw th;
                                }
                            }
                            zznb zznbVar = zza5.zza;
                            zzpw zzpwVar = zzpw.zzn;
                            zzpw zzpwVar2 = zznbVar.zzb;
                            if (zzpwVar2 == zzpwVar) {
                                zzovVar.zzg();
                                throw r9;
                            }
                            switch (zzpwVar2.ordinal()) {
                                case 0:
                                    valueOf = Double.valueOf(zzovVar.zza());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if ((ordinal != 9 || ordinal == 10) && (zze = zzmtVar.zze(zza5.zza)) != null) {
                                        byte[] bArr = zznl.zzb;
                                        valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    }
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 1:
                                    valueOf = Float.valueOf(zzovVar.zzb());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                        break;
                                    }
                                    byte[] bArr2 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 2:
                                    valueOf = Long.valueOf(zzovVar.zzl());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 3:
                                    valueOf = Long.valueOf(zzovVar.zzo());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 4:
                                    valueOf = Integer.valueOf(zzovVar.zzg());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 5:
                                    valueOf = Long.valueOf(zzovVar.zzk());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 6:
                                    valueOf = Integer.valueOf(zzovVar.zzf());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 7:
                                    valueOf = Boolean.valueOf(zzovVar.zzN());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 8:
                                    valueOf = zzovVar.zzr();
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 9:
                                    Object zze4 = zzmtVar.zze(zza5.zza);
                                    if (!(zze4 instanceof zznd)) {
                                        throw r9;
                                    }
                                    zzow zzb4 = zzos.zza().zzb(zze4.getClass());
                                    if (!((zznd) zze4).zzL()) {
                                        Object zze5 = zzb4.zze();
                                        zzb4.zzg(zze5, zze4);
                                        zzmtVar.zzi(zza5.zza, zze5);
                                        zze4 = zze5;
                                    }
                                    zzovVar.zzt(zze4, zzb4, zzmoVar);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 10:
                                    Object zze6 = zzmtVar.zze(zza5.zza);
                                    if (!(zze6 instanceof zznd)) {
                                        throw r9;
                                    }
                                    zzow zzb5 = zzos.zza().zzb(zze6.getClass());
                                    if (!((zznd) zze6).zzL()) {
                                        Object zze7 = zzb5.zze();
                                        zzb5.zzg(zze7, zze6);
                                        zzmtVar.zzi(zza5.zza, zze7);
                                        zze6 = zze7;
                                    }
                                    zzovVar.zzu(zze6, zzb5, zzmoVar);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 11:
                                    valueOf = zzovVar.zzp();
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 12:
                                    valueOf = Integer.valueOf(zzovVar.zzj());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 13:
                                    throw new IllegalStateException("Shouldn't reach here.");
                                case 14:
                                    valueOf = Integer.valueOf(zzovVar.zzh());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 15:
                                    valueOf = Long.valueOf(zzovVar.zzm());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 16:
                                    valueOf = Integer.valueOf(zzovVar.zzi());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr2222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                case 17:
                                    valueOf = Long.valueOf(zzovVar.zzn());
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr22222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                                default:
                                    valueOf = r9;
                                    ordinal = zza5.zza.zzb.ordinal();
                                    if (ordinal != 9) {
                                    }
                                    byte[] bArr222222222222222 = zznl.zzb;
                                    valueOf = ((zzoi) zze).zzae().zzc((zzoi) valueOf).zzl();
                                    zzmtVar.zzi(zza5.zza, valueOf);
                                    obj8 = obj4;
                                    zzplVar4 = zzplVar2;
                                    break;
                            }
                        } else {
                            obj8 = obj4 == null ? zzplVar2.zza(obj10) : obj4;
                            try {
                                if (zzplVar2.zzk(obj8, zzovVar, 0)) {
                                    zzplVar4 = zzplVar2;
                                } else {
                                    int i9 = zzolVar2.zzk;
                                    while (i9 < zzolVar2.zzl) {
                                        zzpl zzplVar7 = zzplVar2;
                                        Object obj11 = obj10;
                                        zzolVar2.zzy(obj11, zzolVar2.zzj[i9], obj8, zzplVar7, obj);
                                        i9 += z8 ? 1 : 0;
                                        obj10 = obj11;
                                        zzplVar2 = zzplVar7;
                                    }
                                    obj2 = obj10;
                                    zzplVar4 = zzplVar2;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                obj2 = obj10;
                                r15 = z8 ? 1 : 0;
                                zzplVar4 = zzplVar2;
                                zzolVar = zzolVar2;
                                i4 = zzolVar.zzk;
                                while (i4 < zzolVar.zzl) {
                                }
                                if (obj8 != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        zzplVar3 = zzplVar2;
                        obj5 = obj10;
                        zzpl zzplVar62 = zzplVar3;
                        zzolVar = zzolVar2;
                        obj3 = obj4;
                        zzplVar4 = zzplVar62;
                        obj2 = obj5;
                        z4 = z8 ? 1 : 0;
                        obj8 = obj3;
                        r15 = z4;
                        i4 = zzolVar.zzk;
                        while (i4 < zzolVar.zzl) {
                        }
                        if (obj8 != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                obj2 = obj;
                zzolVar = zzolVar2;
                obj3 = obj8;
            }
        }
        if (obj8 == null) {
            zzplVar4.zzj(obj2, obj8);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i4, int i5, zzkt zzktVar) {
        zzc(obj, bArr, i4, i5, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(Object obj, zzpy zzpyVar) {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i4;
        Map.Entry entry2;
        int i5;
        int i6;
        int i7;
        zzol<T> zzolVar = this;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            if (!zzmtVar.zza.isEmpty()) {
                Iterator zzf = zzmtVar.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = zzolVar.zzc;
                Unsafe unsafe = zzb;
                int i8 = 1048575;
                int i9 = 1048575;
                i4 = 0;
                int i10 = 0;
                while (i4 < iArr.length) {
                    int zzu = zzolVar.zzu(i4);
                    int[] iArr2 = zzolVar.zzc;
                    int zzt = zzt(zzu);
                    int i11 = iArr2[i4];
                    if (zzt <= 17) {
                        int i12 = iArr2[i4 + 2];
                        int i13 = i12 & i8;
                        if (i13 != i9) {
                            i10 = i13 == i8 ? 0 : unsafe.getInt(obj, i13);
                            i9 = i13;
                        }
                        int i14 = 1 << (i12 >>> 20);
                        entry2 = entry;
                        i5 = i9;
                        i6 = i10;
                        i7 = i14;
                    } else {
                        entry2 = entry;
                        i5 = i9;
                        i6 = i10;
                        i7 = 0;
                    }
                    while (entry2 != null && ((zznb) entry2.getKey()).zza <= i11) {
                        zzolVar.zzn.zzb(zzpyVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j4 = zzu & i8;
                    switch (zzt) {
                        case 0:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzf(i11, zzps.zza(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 1:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzo(i11, zzps.zzb(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 2:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzt(i11, unsafe.getLong(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 3:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzK(i11, unsafe.getLong(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 4:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzr(i11, unsafe.getInt(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 5:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzm(i11, unsafe.getLong(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 6:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzk(i11, unsafe.getInt(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 7:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzb(i11, zzps.zzw(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 8:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzT(i11, unsafe.getObject(obj, j4), zzpyVar);
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 9:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzv(i11, unsafe.getObject(obj, j4), zzolVar.zzx(i4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 10:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzd(i11, (zzle) unsafe.getObject(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 11:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzI(i11, unsafe.getInt(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 12:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzi(i11, unsafe.getInt(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 13:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzx(i11, unsafe.getInt(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 14:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzz(i11, unsafe.getLong(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 15:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzB(i11, unsafe.getInt(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 16:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzD(i11, unsafe.getLong(obj, j4));
                            }
                            zzolVar = this;
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 17:
                            if (zzolVar.zzO(obj, i4, i5, i6, i7)) {
                                zzpyVar.zzq(i11, unsafe.getObject(obj, j4), zzolVar.zzx(i4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 18:
                            zzoy.zzs(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 19:
                            zzoy.zzw(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 20:
                            zzoy.zzy(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 21:
                            zzoy.zzE(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 22:
                            zzoy.zzx(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zzoy.zzv(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 24:
                            zzoy.zzu(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 25:
                            zzoy.zzr(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 26:
                            int i15 = zzolVar.zzc[i4];
                            List list = (List) unsafe.getObject(obj, j4);
                            int i16 = zzoy.zza;
                            if (list != null && !list.isEmpty()) {
                                zzpyVar.zzH(i15, list);
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                            break;
                        case 27:
                            int i17 = zzolVar.zzc[i4];
                            List list2 = (List) unsafe.getObject(obj, j4);
                            zzow zzx = zzolVar.zzx(i4);
                            int i18 = zzoy.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i19 = 0; i19 < list2.size(); i19++) {
                                    ((zzlo) zzpyVar).zzv(i17, list2.get(i19), zzx);
                                }
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            int i20 = zzolVar.zzc[i4];
                            List list3 = (List) unsafe.getObject(obj, j4);
                            int i21 = zzoy.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzpyVar.zze(i20, list3);
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                            break;
                        case 29:
                            zzoy.zzD(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            zzoy.zzt(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            zzoy.zzz(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 32:
                            zzoy.zzA(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 33:
                            zzoy.zzB(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 34:
                            zzoy.zzC(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, false);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case C3139z9.f40333J /* 35 */:
                            zzoy.zzs(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 36:
                            zzoy.zzw(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 37:
                            zzoy.zzy(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case C3139z9.f40334K /* 38 */:
                            zzoy.zzE(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 39:
                            zzoy.zzx(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 40:
                            zzoy.zzv(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 41:
                            zzoy.zzu(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 42:
                            zzoy.zzr(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 43:
                            zzoy.zzD(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                            zzoy.zzt(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                            zzoy.zzz(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 46:
                            zzoy.zzA(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 47:
                            zzoy.zzB(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 48:
                            zzoy.zzC(zzolVar.zzc[i4], (List) unsafe.getObject(obj, j4), zzpyVar, true);
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 49:
                            int i22 = zzolVar.zzc[i4];
                            List list4 = (List) unsafe.getObject(obj, j4);
                            zzow zzx2 = zzolVar.zzx(i4);
                            int i23 = zzoy.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i24 = 0; i24 < list4.size(); i24++) {
                                    ((zzlo) zzpyVar).zzq(i22, list4.get(i24), zzx2);
                                }
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j4) != null) {
                                throw null;
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzf(i11, zzn(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.SET_USER_ID /* 52 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzo(i11, zzo(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzt(i11, zzv(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzK(i11, zzv(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzr(i11, zzp(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzm(i11, zzv(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzk(i11, zzp(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 58:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzb(i11, zzS(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 59:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzT(i11, unsafe.getObject(obj, j4), zzpyVar);
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 60:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzv(i11, unsafe.getObject(obj, j4), zzolVar.zzx(i4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 61:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzd(i11, (zzle) unsafe.getObject(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case IronSourceConstants.RETRY_LIMIT /* 62 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzI(i11, zzp(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 63:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzi(i11, zzp(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzx(i11, zzp(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzz(i11, zzv(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 66:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzB(i11, zzp(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 67:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzD(i11, zzv(obj, j4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        case 68:
                            if (zzolVar.zzR(obj, i11, i4)) {
                                zzpyVar.zzq(i11, unsafe.getObject(obj, j4), zzolVar.zzx(i4));
                            }
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                        default:
                            i4 += 3;
                            i10 = i6;
                            i8 = 1048575;
                            i9 = i5;
                            entry = entry2;
                    }
                }
                while (entry != null) {
                    zzolVar.zzn.zzb(zzpyVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zznd) obj).zzc.zzl(zzpyVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzolVar.zzc;
        Unsafe unsafe2 = zzb;
        int i82 = 1048575;
        int i92 = 1048575;
        i4 = 0;
        int i102 = 0;
        while (i4 < iArr.length) {
        }
        while (entry != null) {
        }
        ((zznd) obj).zzc.zzl(zzpyVar);
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzu = zzu(i4);
            long j4 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i4) && Double.doubleToLongBits(zzps.zza(obj, j4)) == Double.doubleToLongBits(zzps.zza(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i4) && Float.floatToIntBits(zzps.zzb(obj, j4)) == Float.floatToIntBits(zzps.zzb(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i4) && zzps.zzd(obj, j4) == zzps.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i4) && zzps.zzd(obj, j4) == zzps.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i4) && zzps.zzc(obj, j4) == zzps.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i4) && zzps.zzd(obj, j4) == zzps.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i4) && zzps.zzc(obj, j4) == zzps.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i4) && zzps.zzw(obj, j4) == zzps.zzw(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i4) && zzoy.zzF(zzps.zzf(obj, j4), zzps.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i4) && zzoy.zzF(zzps.zzf(obj, j4), zzps.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i4) && zzoy.zzF(zzps.zzf(obj, j4), zzps.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i4) && zzps.zzc(obj, j4) == zzps.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i4) && zzps.zzc(obj, j4) == zzps.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i4) && zzps.zzc(obj, j4) == zzps.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i4) && zzps.zzd(obj, j4) == zzps.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i4) && zzps.zzc(obj, j4) == zzps.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i4) && zzps.zzd(obj, j4) == zzps.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i4) && zzoy.zzF(zzps.zzf(obj, j4), zzps.zzf(obj2, j4))) {
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
                    zzF = zzoy.zzF(zzps.zzf(obj, j4), zzps.zzf(obj2, j4));
                    break;
                case 50:
                    zzF = zzoy.zzF(zzps.zzf(obj, j4), zzps.zzf(obj2, j4));
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
                    long zzr = zzr(i4) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j4), zzps.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i6 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i9 = iArr[i6];
            int i10 = iArr2[i9];
            int zzu = zzu(i9);
            int i11 = this.zzc[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i8) {
                if (i12 != 1048575) {
                    i7 = zzb.getInt(obj, i12);
                }
                i5 = i7;
                i4 = i12;
            } else {
                i4 = i8;
                i5 = i7;
            }
            Object obj2 = obj;
            if ((268435456 & zzu) != 0 && !zzO(obj2, i9, i4, i5, i13)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj2, i10, i9) && !zzP(obj2, zzu, zzx(i9))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzoc) zzps.zzf(obj2, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzps.zzf(obj2, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzx(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!zzx.zzl(list.get(i14))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj2, i9, i4, i5, i13) && !zzP(obj2, zzu, zzx(i9))) {
                return false;
            }
            i6++;
            obj = obj2;
            i8 = i4;
            i7 = i5;
        }
        return !this.zzh || ((zzna) obj).zzb.zzk();
    }
}
