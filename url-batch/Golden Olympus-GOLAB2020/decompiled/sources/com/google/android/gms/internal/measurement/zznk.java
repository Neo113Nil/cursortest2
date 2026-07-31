package com.google.android.gms.internal.measurement;

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
final class zznk<T> implements zzns<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzol.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznh zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoe zzl;
    private final zzlq zzm;

    private zznk(int[] iArr, Object[] objArr, int i4, int i5, zznh zznhVar, boolean z4, int[] iArr2, int i6, int i7, zznm zznmVar, zzmu zzmuVar, zzoe zzoeVar, zzlq zzlqVar, zznc zzncVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        boolean z5 = false;
        if (zzlqVar != null && (zznhVar instanceof zzma)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i7;
        this.zzl = zzoeVar;
        this.zzm = zzlqVar;
        this.zzg = zznhVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i4) {
        if (zzI(obj2, i4)) {
            int zzs = zzs(i4) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzs;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i4] + " is present but null: " + obj2.toString());
            }
            zzns zzv = zzv(i4);
            if (!zzI(obj, i4)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzD(obj, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i4) {
        int[] iArr = this.zzc;
        int i5 = iArr[i4];
        if (zzM(obj2, i5, i4)) {
            int zzs = zzs(i4) & 1048575;
            Unsafe unsafe = zzb;
            long j4 = zzs;
            Object object = unsafe.getObject(obj2, j4);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2.toString());
            }
            zzns zzv = zzv(i4);
            if (!zzM(obj, i5, i4)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j4, zze);
                } else {
                    unsafe.putObject(obj, j4, object);
                }
                zzE(obj, i5, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j4);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j4, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i4) {
        int zzp = zzp(i4);
        long j4 = 1048575 & zzp;
        if (j4 == 1048575) {
            return;
        }
        zzol.zzq(obj, j4, (1 << (zzp >>> 20)) | zzol.zzc(obj, j4));
    }

    private final void zzE(Object obj, int i4, int i5) {
        zzol.zzq(obj, zzp(i5) & 1048575, i4);
    }

    private final void zzF(Object obj, int i4, Object obj2) {
        zzb.putObject(obj, zzs(i4) & 1048575, obj2);
        zzD(obj, i4);
    }

    private final void zzG(Object obj, int i4, int i5, Object obj2) {
        zzb.putObject(obj, zzs(i5) & 1048575, obj2);
        zzE(obj, i4, i5);
    }

    private final boolean zzH(Object obj, Object obj2, int i4) {
        return zzI(obj, i4) == zzI(obj2, i4);
    }

    private final boolean zzI(Object obj, int i4) {
        int zzp = zzp(i4);
        long j4 = zzp & 1048575;
        if (j4 != 1048575) {
            return (zzol.zzc(obj, j4) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i4);
        long j5 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzol.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzol.zzb(obj, j5)) != 0;
            case 2:
                return zzol.zzd(obj, j5) != 0;
            case 3:
                return zzol.zzd(obj, j5) != 0;
            case 4:
                return zzol.zzc(obj, j5) != 0;
            case 5:
                return zzol.zzd(obj, j5) != 0;
            case 6:
                return zzol.zzc(obj, j5) != 0;
            case 7:
                return zzol.zzw(obj, j5);
            case 8:
                Object zzf = zzol.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzld) {
                    return !zzld.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzol.zzf(obj, j5) != null;
            case 10:
                return !zzld.zzb.equals(zzol.zzf(obj, j5));
            case 11:
                return zzol.zzc(obj, j5) != 0;
            case 12:
                return zzol.zzc(obj, j5) != 0;
            case 13:
                return zzol.zzc(obj, j5) != 0;
            case 14:
                return zzol.zzd(obj, j5) != 0;
            case 15:
                return zzol.zzc(obj, j5) != 0;
            case 16:
                return zzol.zzd(obj, j5) != 0;
            case 17:
                return zzol.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzI(obj, i4) : (i6 & i7) != 0;
    }

    private static boolean zzK(Object obj, int i4, zzns zznsVar) {
        return zznsVar.zzk(zzol.zzf(obj, i4 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmd) {
            return ((zzmd) obj).zzcw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i4, int i5) {
        return zzol.zzc(obj, (long) (zzp(i5) & 1048575)) == i4;
    }

    private static boolean zzN(Object obj, long j4) {
        return ((Boolean) zzol.zzf(obj, j4)).booleanValue();
    }

    private static final void zzO(int i4, Object obj, zzor zzorVar) {
        if (obj instanceof String) {
            zzorVar.zzG(i4, (String) obj);
        } else {
            zzorVar.zzd(i4, (zzld) obj);
        }
    }

    static zzof zzd(Object obj) {
        zzmd zzmdVar = (zzmd) obj;
        zzof zzofVar = zzmdVar.zzc;
        if (zzofVar != zzof.zzc()) {
            return zzofVar;
        }
        zzof zzf = zzof.zzf();
        zzmdVar.zzc = zzf;
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
    static zznk zzl(Class cls, zzne zzneVar, zznm zznmVar, zzmu zzmuVar, zzoe zzoeVar, zzlq zzlqVar, zznc zzncVar) {
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
        Field zzz;
        char charAt10;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i33;
        char charAt11;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        int i36;
        char charAt14;
        if (!(zzneVar instanceof zznr)) {
            throw null;
        }
        zznr zznrVar = (zznr) zzneVar;
        String zzd = zznrVar.zzd();
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
        Object[] zze = zznrVar.zze();
        Class<?> cls2 = zznrVar.zza().getClass();
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
            zznr zznrVar2 = zznrVar;
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
                        if (zznrVar2.zzc() == 1 || i82 != 0) {
                            i31 = i9 + 1;
                            int i90 = i72 / 3;
                            objArr[i90 + i90 + 1] = zze[i9];
                        } else {
                            i32 = 0;
                            int i91 = charAt25 + charAt25;
                            obj = zze[i91];
                            int i92 = i32;
                            if (obj instanceof Field) {
                                zzz2 = (Field) obj;
                            } else {
                                zzz2 = zzz(cls2, (String) obj);
                                zze[i91] = zzz2;
                            }
                            int i93 = i10;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                            int i94 = i91 + 1;
                            obj2 = zze[i94];
                            i22 = i93;
                            if (obj2 instanceof Field) {
                                zzz3 = (Field) obj2;
                            } else {
                                zzz3 = zzz(cls2, (String) obj2);
                                zze[i94] = zzz3;
                            }
                            i24 = (int) unsafe.objectFieldOffset(zzz3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                    int i942 = i912 + 1;
                    obj2 = zze[i942];
                    i22 = i932;
                    if (obj2 instanceof Field) {
                    }
                    i24 = (int) unsafe.objectFieldOffset(zzz3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz2);
                int i9422 = i9122 + 1;
                obj2 = zze[i9422];
                i22 = i9322;
                if (obj2 instanceof Field) {
                }
                i24 = (int) unsafe.objectFieldOffset(zzz3);
                str = zzd;
                i26 = i9222;
                i20 = i87;
                i25 = 0;
                c4 = 55296;
            } else {
                i21 = length;
                i22 = i10;
                int i95 = i9 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i9]);
                if (i81 == 9 || i81 == 17) {
                    i23 = i95;
                    int i96 = i72 / 3;
                    objArr[i96 + i96 + 1] = zzz4.getType();
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
                        if (zznrVar2.zzc() == 1 || i82 != 0) {
                            i9 += 2;
                            int i97 = i72 / 3;
                            objArr[i97 + i97 + 1] = zze[i95];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                                    zzz = (Field) obj3;
                                } else {
                                    zzz = zzz(cls2, (String) obj3);
                                    zze[i101] = zzz;
                                }
                                int i102 = charAt26;
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzz);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
            zznrVar = zznrVar2;
            length = i21;
            i10 = i22;
        }
        return new zznk(iArr3, objArr, i5, i7, zznrVar.zza(), false, iArr, i8, i67, zznmVar, zzmuVar, zzoeVar, zzlqVar, zzncVar);
    }

    private static double zzm(Object obj, long j4) {
        return ((Double) zzol.zzf(obj, j4)).doubleValue();
    }

    private static float zzn(Object obj, long j4) {
        return ((Float) zzol.zzf(obj, j4)).floatValue();
    }

    private static int zzo(Object obj, long j4) {
        return ((Integer) zzol.zzf(obj, j4)).intValue();
    }

    private final int zzp(int i4) {
        return this.zzc[i4 + 2];
    }

    private final int zzq(int i4, int i5) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = iArr[i7];
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

    private static int zzr(int i4) {
        return (i4 >>> 20) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    private final int zzs(int i4) {
        return this.zzc[i4 + 1];
    }

    private static long zzt(Object obj, long j4) {
        return ((Long) zzol.zzf(obj, j4)).longValue();
    }

    private final zzmg zzu(int i4) {
        int i5 = i4 / 3;
        return (zzmg) this.zzd[i5 + i5 + 1];
    }

    private final zzns zzv(int i4) {
        Object[] objArr = this.zzd;
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        zzns zznsVar = (zzns) objArr[i6];
        if (zznsVar != null) {
            return zznsVar;
        }
        zzns zzb2 = zznp.zza().zzb((Class) objArr[i6 + 1]);
        objArr[i6] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i4) {
        int i5 = i4 / 3;
        return this.zzd[i5 + i5];
    }

    private final Object zzx(Object obj, int i4) {
        zzns zzv = zzv(i4);
        int zzs = zzs(i4) & 1048575;
        if (!zzI(obj, i4)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i4, int i5) {
        zzns zzv = zzv(i5);
        if (!zzM(obj, i4, i5)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i5) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zza(Object obj) {
        int i4;
        int i5;
        int zzz;
        int zzz2;
        int zzA;
        int zzz3;
        int zzz4;
        int zzz5;
        int zzd;
        int zzz6;
        int zzh;
        int zzg;
        int size;
        int zzl;
        int zzz7;
        int zzz8;
        int zzz9;
        int zze;
        int zzz10;
        int zzz11;
        int i6;
        int zzz12;
        int zzz13;
        int zzz14;
        int zzA2;
        int zzz15;
        int zzz16;
        int zzd2;
        int zzz17;
        zznk<T> zznkVar = this;
        Object obj2 = obj;
        int i7 = 1;
        Unsafe unsafe = zzb;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = zznkVar.zzc;
            if (i8 >= iArr.length) {
                int zza2 = i10 + ((zzmd) obj).zzc.zza();
                if (!zznkVar.zzh) {
                    return zza2;
                }
                zzoa zzoaVar = ((zzma) obj).zzb.zza;
                int zzc = zzoaVar.zzc();
                int i12 = 0;
                for (int i13 = 0; i13 < zzc; i13++) {
                    Map.Entry zzg2 = zzoaVar.zzg(i13);
                    i12 += zzlu.zzb((zzlt) ((zznw) zzg2).zza(), zzg2.getValue());
                }
                for (Map.Entry entry : zzoaVar.zzd()) {
                    i12 += zzlu.zzb((zzlt) entry.getKey(), entry.getValue());
                }
                return zza2 + i12;
            }
            int zzs = zznkVar.zzs(i8);
            int zzr = zzr(zzs);
            int i14 = iArr[i8];
            int i15 = iArr[i8 + 2];
            int i16 = i15 & 1048575;
            if (zzr <= 17) {
                if (i16 != i11) {
                    i9 = i16 == 1048575 ? 0 : unsafe.getInt(obj2, i16);
                    i11 = i16;
                }
                i4 = i7 << (i15 >>> 20);
            } else {
                i4 = 0;
            }
            int i17 = zzs & 1048575;
            if (zzr >= zzlv.zzJ.zza()) {
                zzlv.zzW.zza();
            }
            long j4 = i17;
            switch (zzr) {
                case 0:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        i10 += zzlk.zzz(i14 << 3) + 8;
                    }
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 1:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzz = zzlk.zzz(i14 << 3);
                        zzz4 = zzz + 4;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 2:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        long j5 = unsafe.getLong(obj2, j4);
                        zzz2 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(j5);
                        zzz4 = zzz2 + zzA;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 3:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        long j6 = unsafe.getLong(obj2, j4);
                        zzz2 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(j6);
                        zzz4 = zzz2 + zzA;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 4:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        long j7 = unsafe.getInt(obj2, j4);
                        zzz2 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(j7);
                        zzz4 = zzz2 + zzA;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 5:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzz4 = zzz3 + 8;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 6:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzz = zzlk.zzz(i14 << 3);
                        zzz4 = zzz + 4;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 7:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzz4 = zzlk.zzz(i14 << 3) + 1;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 8:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        int i18 = i14 << 3;
                        Object object = unsafe.getObject(obj2, j4);
                        if (object instanceof zzld) {
                            zzz5 = zzlk.zzz(i18);
                            zzd = ((zzld) object).zzd();
                            zzz6 = zzlk.zzz(zzd);
                            zzz4 = zzz5 + zzz6 + zzd;
                            i10 += zzz4;
                        } else {
                            zzz2 = zzlk.zzz(i18);
                            zzA = zzlk.zzy((String) object);
                            zzz4 = zzz2 + zzA;
                            i10 += zzz4;
                        }
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 9:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzh = zznu.zzh(i14, unsafe.getObject(obj2, j4), zznkVar.zzv(i8));
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 10:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzld zzldVar = (zzld) unsafe.getObject(obj2, j4);
                        zzz5 = zzlk.zzz(i14 << 3);
                        zzd = zzldVar.zzd();
                        zzz6 = zzlk.zzz(zzd);
                        zzz4 = zzz5 + zzz6 + zzd;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 11:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        int i19 = unsafe.getInt(obj2, j4);
                        zzz2 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzz(i19);
                        zzz4 = zzz2 + zzA;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 12:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        long j8 = unsafe.getInt(obj2, j4);
                        zzz2 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA(j8);
                        zzz4 = zzz2 + zzA;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 13:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzz = zzlk.zzz(i14 << 3);
                        zzz4 = zzz + 4;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 14:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzz3 = zzlk.zzz(i14 << 3);
                        zzz4 = zzz3 + 8;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 15:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        int i20 = unsafe.getInt(obj2, j4);
                        zzz2 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzz((i20 >> 31) ^ (i20 + i20));
                        zzz4 = zzz2 + zzA;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 16:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        long j9 = unsafe.getLong(obj2, j4);
                        zzz2 = zzlk.zzz(i14 << 3);
                        zzA = zzlk.zzA((j9 >> 63) ^ (j9 + j9));
                        zzz4 = zzz2 + zzA;
                        i10 += zzz4;
                    }
                    zznkVar = this;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 17:
                    i5 = i7;
                    if (zznkVar.zzJ(obj2, i8, i11, i9, i4)) {
                        zzh = zzlk.zzw(i14, (zznh) unsafe.getObject(obj2, j4), zznkVar.zzv(i8));
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 18:
                    i5 = i7;
                    zzh = zznu.zzd(i14, (List) unsafe.getObject(obj2, j4), false);
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 19:
                    i5 = i7;
                    zzh = zznu.zzb(i14, (List) unsafe.getObject(obj2, j4), false);
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 20:
                    i5 = i7;
                    List list = (List) unsafe.getObject(obj2, j4);
                    int i21 = zznu.zza;
                    if (list.size() != 0) {
                        zzg = zznu.zzg(list) + (list.size() * zzlk.zzz(i14 << 3));
                        i10 += zzg;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzg = 0;
                    i10 += zzg;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 21:
                    i5 = i7;
                    List list2 = (List) unsafe.getObject(obj2, j4);
                    int i22 = zznu.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zznu.zzl(list2);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzh = zzl + (size * zzz7);
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzh = 0;
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 22:
                    i5 = i7;
                    List list3 = (List) unsafe.getObject(obj2, j4);
                    int i23 = zznu.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zznu.zzf(list3);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzh = zzl + (size * zzz7);
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzh = 0;
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case ConnectionResult.API_DISABLED /* 23 */:
                    i5 = i7;
                    zzh = zznu.zzd(i14, (List) unsafe.getObject(obj2, j4), false);
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 24:
                    i5 = i7;
                    zzh = zznu.zzb(i14, (List) unsafe.getObject(obj2, j4), false);
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 25:
                    i5 = i7;
                    List list4 = (List) unsafe.getObject(obj2, j4);
                    int i24 = zznu.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzlk.zzz(i14 << 3) + 1);
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzh = 0;
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 26:
                    i5 = i7;
                    List list5 = (List) unsafe.getObject(obj2, j4);
                    int i25 = zznu.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzlk.zzz(i14 << 3) * size3;
                        if (list5 instanceof zzmt) {
                            zzmt zzmtVar = (zzmt) list5;
                            for (int i26 = 0; i26 < size3; i26++) {
                                Object zzc2 = zzmtVar.zzc();
                                if (zzc2 instanceof zzld) {
                                    int zzd3 = ((zzld) zzc2).zzd();
                                    zzg += zzlk.zzz(zzd3) + zzd3;
                                } else {
                                    zzg += zzlk.zzy((String) zzc2);
                                }
                            }
                        } else {
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object obj3 = list5.get(i27);
                                if (obj3 instanceof zzld) {
                                    int zzd4 = ((zzld) obj3).zzd();
                                    zzg += zzlk.zzz(zzd4) + zzd4;
                                } else {
                                    zzg += zzlk.zzy((String) obj3);
                                }
                            }
                        }
                        i10 += zzg;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzg = 0;
                    i10 += zzg;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 27:
                    i5 = i7;
                    List list6 = (List) unsafe.getObject(obj2, j4);
                    zzns zzv = zznkVar.zzv(i8);
                    int i28 = zznu.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzz8 = 0;
                    } else {
                        zzz8 = zzlk.zzz(i14 << 3) * size4;
                        for (int i29 = 0; i29 < size4; i29++) {
                            Object obj4 = list6.get(i29);
                            if (obj4 instanceof zzms) {
                                int zza3 = ((zzms) obj4).zza();
                                zzz8 += zzlk.zzz(zza3) + zza3;
                            } else {
                                zzz8 += zzlk.zzx((zznh) obj4, zzv);
                            }
                        }
                    }
                    i10 += zzz8;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i5 = i7;
                    List list7 = (List) unsafe.getObject(obj2, j4);
                    int i30 = zznu.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzz9 = 0;
                    } else {
                        zzz9 = size5 * zzlk.zzz(i14 << 3);
                        for (int i31 = 0; i31 < list7.size(); i31++) {
                            int zzd5 = ((zzld) list7.get(i31)).zzd();
                            zzz9 += zzlk.zzz(zzd5) + zzd5;
                        }
                    }
                    i10 += zzz9;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 29:
                    i5 = i7;
                    List list8 = (List) unsafe.getObject(obj2, j4);
                    int i32 = zznu.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zznu.zzk(list8);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzh = zzl + (size * zzz7);
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzh = 0;
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    i5 = i7;
                    List list9 = (List) unsafe.getObject(obj2, j4);
                    int i33 = zznu.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zznu.zza(list9);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzh = zzl + (size * zzz7);
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzh = 0;
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    i5 = i7;
                    zzh = zznu.zzb(i14, (List) unsafe.getObject(obj2, j4), false);
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 32:
                    i5 = i7;
                    zzh = zznu.zzd(i14, (List) unsafe.getObject(obj2, j4), false);
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 33:
                    i5 = i7;
                    List list10 = (List) unsafe.getObject(obj2, j4);
                    int i34 = zznu.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzl = zznu.zzi(list10);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzh = zzl + (size * zzz7);
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzh = 0;
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 34:
                    i5 = i7;
                    List list11 = (List) unsafe.getObject(obj2, j4);
                    int i35 = zznu.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzl = zznu.zzj(list11);
                        zzz7 = zzlk.zzz(i14 << 3);
                        zzh = zzl + (size * zzz7);
                        i10 += zzh;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                    zzh = 0;
                    i10 += zzh;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case C3139z9.f40333J /* 35 */:
                    i5 = i7;
                    zze = zznu.zze((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 36:
                    i5 = i7;
                    zze = zznu.zzc((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 37:
                    i5 = i7;
                    zze = zznu.zzg((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case C3139z9.f40334K /* 38 */:
                    i5 = i7;
                    zze = zznu.zzl((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 39:
                    i5 = i7;
                    zze = zznu.zzf((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 40:
                    i5 = i7;
                    zze = zznu.zze((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 41:
                    i5 = i7;
                    zze = zznu.zzc((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 42:
                    i5 = i7;
                    List list12 = (List) unsafe.getObject(obj2, j4);
                    int i36 = zznu.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 43:
                    i5 = i7;
                    zze = zznu.zzk((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                    i5 = i7;
                    zze = zznu.zza((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                    i5 = i7;
                    zze = zznu.zzc((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 46:
                    i5 = i7;
                    zze = zznu.zze((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 47:
                    i5 = i7;
                    zze = zznu.zzi((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 48:
                    i5 = i7;
                    zze = zznu.zzj((List) unsafe.getObject(obj2, j4));
                    if (zze > 0) {
                        zzz10 = zzlk.zzz(i14 << 3);
                        zzz11 = zzlk.zzz(zze);
                        zzz9 = zzz10 + zzz11 + zze;
                        i10 += zzz9;
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    } else {
                        i8 += 3;
                        obj2 = obj;
                        i7 = i5;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j4);
                    zzns zzv2 = zznkVar.zzv(i8);
                    int i37 = zznu.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i6 = 0;
                    } else {
                        int i38 = 0;
                        i6 = 0;
                        while (i38 < size6) {
                            i6 += zzlk.zzw(i14, (zznh) list13.get(i38), zzv2);
                            i38++;
                            i7 = i7;
                        }
                    }
                    i5 = i7;
                    i10 += i6;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 50:
                    zznb zznbVar = (zznb) unsafe.getObject(obj2, j4);
                    if (!zznbVar.isEmpty()) {
                        Iterator it = zznbVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            entry2.getKey();
                            entry2.getValue();
                            throw null;
                        }
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz12 = zzlk.zzz(i14 << 3);
                        zzz15 = zzz12 + 8;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz13 = zzlk.zzz(i14 << 3);
                        zzz15 = zzz13 + 4;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        long zzt = zzt(obj2, j4);
                        zzz14 = zzlk.zzz(i14 << 3);
                        zzA2 = zzlk.zzA(zzt);
                        zzz15 = zzz14 + zzA2;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        long zzt2 = zzt(obj2, j4);
                        zzz14 = zzlk.zzz(i14 << 3);
                        zzA2 = zzlk.zzA(zzt2);
                        zzz15 = zzz14 + zzA2;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        long zzo = zzo(obj2, j4);
                        zzz14 = zzlk.zzz(i14 << 3);
                        zzA2 = zzlk.zzA(zzo);
                        zzz15 = zzz14 + zzA2;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz12 = zzlk.zzz(i14 << 3);
                        zzz15 = zzz12 + 8;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz13 = zzlk.zzz(i14 << 3);
                        zzz15 = zzz13 + 4;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 58:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz15 = zzlk.zzz(i14 << 3) + i7;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 59:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        int i39 = i14 << 3;
                        Object object2 = unsafe.getObject(obj2, j4);
                        if (object2 instanceof zzld) {
                            zzz16 = zzlk.zzz(i39);
                            zzd2 = ((zzld) object2).zzd();
                            zzz17 = zzlk.zzz(zzd2);
                            zzz15 = zzz16 + zzz17 + zzd2;
                            i10 += zzz15;
                        } else {
                            zzz14 = zzlk.zzz(i39);
                            zzA2 = zzlk.zzy((String) object2);
                            zzz15 = zzz14 + zzA2;
                            i10 += zzz15;
                        }
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 60:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz15 = zznu.zzh(i14, unsafe.getObject(obj2, j4), zznkVar.zzv(i8));
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 61:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzld zzldVar2 = (zzld) unsafe.getObject(obj2, j4);
                        zzz16 = zzlk.zzz(i14 << 3);
                        zzd2 = zzldVar2.zzd();
                        zzz17 = zzlk.zzz(zzd2);
                        zzz15 = zzz16 + zzz17 + zzd2;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        int zzo2 = zzo(obj2, j4);
                        zzz14 = zzlk.zzz(i14 << 3);
                        zzA2 = zzlk.zzz(zzo2);
                        zzz15 = zzz14 + zzA2;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 63:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        long zzo3 = zzo(obj2, j4);
                        zzz14 = zzlk.zzz(i14 << 3);
                        zzA2 = zzlk.zzA(zzo3);
                        zzz15 = zzz14 + zzA2;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz13 = zzlk.zzz(i14 << 3);
                        zzz15 = zzz13 + 4;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz12 = zzlk.zzz(i14 << 3);
                        zzz15 = zzz12 + 8;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 66:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        int zzo4 = zzo(obj2, j4);
                        zzz14 = zzlk.zzz(i14 << 3);
                        zzA2 = zzlk.zzz((zzo4 >> 31) ^ (zzo4 + zzo4));
                        zzz15 = zzz14 + zzA2;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 67:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        long zzt3 = zzt(obj2, j4);
                        zzz14 = zzlk.zzz(i14 << 3);
                        zzA2 = zzlk.zzA((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzz15 = zzz14 + zzA2;
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                case 68:
                    if (zznkVar.zzM(obj2, i14, i8)) {
                        zzz15 = zzlk.zzw(i14, (zznh) unsafe.getObject(obj2, j4), zznkVar.zzv(i8));
                        i10 += zzz15;
                    }
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
                default:
                    i5 = i7;
                    i8 += 3;
                    obj2 = obj;
                    i7 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final int zzb(Object obj) {
        int i4;
        long doubleToLongBits;
        int floatToIntBits;
        int i5;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i6 >= iArr.length) {
                int hashCode = (i7 * 53) + ((zzmd) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzma) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzs = zzs(i6);
            int i8 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i9 = iArr[i6];
            long j4 = i8;
            int i10 = 37;
            switch (zzr) {
                case 0:
                    i4 = i7 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzol.zza(obj, j4));
                    byte[] bArr = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 1:
                    i4 = i7 * 53;
                    floatToIntBits = Float.floatToIntBits(zzol.zzb(obj, j4));
                    i7 = i4 + floatToIntBits;
                    break;
                case 2:
                    i4 = i7 * 53;
                    doubleToLongBits = zzol.zzd(obj, j4);
                    byte[] bArr2 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 3:
                    i4 = i7 * 53;
                    doubleToLongBits = zzol.zzd(obj, j4);
                    byte[] bArr3 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 4:
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 5:
                    i4 = i7 * 53;
                    doubleToLongBits = zzol.zzd(obj, j4);
                    byte[] bArr4 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 6:
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 7:
                    i4 = i7 * 53;
                    floatToIntBits = zzmk.zza(zzol.zzw(obj, j4));
                    i7 = i4 + floatToIntBits;
                    break;
                case 8:
                    i4 = i7 * 53;
                    floatToIntBits = ((String) zzol.zzf(obj, j4)).hashCode();
                    i7 = i4 + floatToIntBits;
                    break;
                case 9:
                    i5 = i7 * 53;
                    Object zzf = zzol.zzf(obj, j4);
                    if (zzf != null) {
                        i10 = zzf.hashCode();
                    }
                    i7 = i5 + i10;
                    break;
                case 10:
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzf(obj, j4).hashCode();
                    i7 = i4 + floatToIntBits;
                    break;
                case 11:
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 12:
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 13:
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 14:
                    i4 = i7 * 53;
                    doubleToLongBits = zzol.zzd(obj, j4);
                    byte[] bArr5 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 15:
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 16:
                    i4 = i7 * 53;
                    doubleToLongBits = zzol.zzd(obj, j4);
                    byte[] bArr6 = zzmk.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 17:
                    i5 = i7 * 53;
                    Object zzf2 = zzol.zzf(obj, j4);
                    if (zzf2 != null) {
                        i10 = zzf2.hashCode();
                    }
                    i7 = i5 + i10;
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
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzf(obj, j4).hashCode();
                    i7 = i4 + floatToIntBits;
                    break;
                case 50:
                    i4 = i7 * 53;
                    floatToIntBits = zzol.zzf(obj, j4).hashCode();
                    i7 = i4 + floatToIntBits;
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j4));
                        byte[] bArr7 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j4));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        doubleToLongBits = zzt(obj, j4);
                        byte[] bArr8 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        doubleToLongBits = zzt(obj, j4);
                        byte[] bArr9 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzo(obj, j4);
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        doubleToLongBits = zzt(obj, j4);
                        byte[] bArr10 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzo(obj, j4);
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzmk.zza(zzN(obj, j4));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = ((String) zzol.zzf(obj, j4)).hashCode();
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzol.zzf(obj, j4).hashCode();
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzol.zzf(obj, j4).hashCode();
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzo(obj, j4);
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 63:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzo(obj, j4);
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzo(obj, j4);
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        doubleToLongBits = zzt(obj, j4);
                        byte[] bArr11 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzo(obj, j4);
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        doubleToLongBits = zzt(obj, j4);
                        byte[] bArr12 = zzmk.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzol.zzf(obj, j4).hashCode();
                        i7 = i4 + floatToIntBits;
                        break;
                    }
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0fd9, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x103a, code lost:
    
        if (r1 == r11) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x103c, code lost:
    
        r10.putInt(r13, r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x1040, code lost:
    
        r1 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x1044, code lost:
    
        if (r1 >= r0.zzk) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x1046, code lost:
    
        r3 = r0.zzi;
        r5 = r0.zzc;
        r3 = r3[r1];
        r5 = r5[r3];
        r5 = com.google.android.gms.internal.measurement.zzol.zzf(r13, r0.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x105c, code lost:
    
        if (r5 != null) goto L602;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x1068, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x1065, code lost:
    
        if (r0.zzu(r3) != null) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x106b, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zznb) r5;
        r1 = (com.google.android.gms.internal.measurement.zzna) r0.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x1073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x1076, code lost:
    
        if (r8 != 0) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x1078, code lost:
    
        if (r7 != r4) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x1080, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x1085, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x1081, code lost:
    
        if (r7 > r4) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x1083, code lost:
    
        if (r2 != r8) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x108b, code lost:
    
        throw new com.google.android.gms.internal.measurement.zzmm("Failed to parse the message.");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0cce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0fae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0fc6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0fd1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x0056 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i4, int i5, int i6, zzks zzksVar) {
        int i7;
        Unsafe unsafe;
        int i8;
        Object obj2;
        int i9;
        int i10;
        int zzq;
        byte[] bArr2;
        int i11;
        int i12;
        zzks zzksVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int zzg;
        int i17;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr3;
        zzks zzksVar3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Object obj4;
        int i23;
        zzks zzksVar4;
        Unsafe unsafe3;
        byte[] bArr4;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        byte[] bArr5;
        int i30;
        int i31;
        zzks zzksVar5;
        zzks zzksVar6;
        int zzh;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        zzks zzksVar7;
        int i37;
        int i38;
        int i39;
        Unsafe unsafe4;
        int i40;
        int i41;
        zzks zzksVar8;
        int i42;
        int i43;
        byte[] bArr6;
        int i44;
        zzks zzksVar9;
        int zzf;
        int zzh2;
        int i45;
        byte[] bArr7;
        int i46;
        zzks zzksVar10;
        int i47;
        zzmj zzmjVar;
        int zzj;
        int i48;
        int i49;
        int i50;
        zzks zzksVar11;
        int i51;
        int zzh3;
        int zzh4;
        int i52;
        int i53;
        int i54;
        zzks zzksVar12;
        char c4;
        int i55;
        int zzh5;
        zznk<T> zznkVar = this;
        Object obj5 = obj;
        byte[] bArr8 = bArr;
        int i56 = i5;
        zzks zzksVar13 = zzksVar;
        zzA(obj5);
        Unsafe unsafe5 = zzb;
        int i57 = 0;
        int i58 = -1;
        int i59 = i4;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = -1;
        int i64 = 1048575;
        while (true) {
            int i65 = 1;
            int i66 = 2;
            while (i59 < i56) {
                int i67 = i59 + 1;
                int i68 = bArr8[i59];
                if (i68 < 0) {
                    i67 = zzkt.zzi(i68, bArr8, i67, zzksVar13);
                    i68 = zzksVar13.zza;
                }
                i62 = i68;
                int i69 = i62 >>> 3;
                if (i69 > i63) {
                    int i70 = i60 / 3;
                    if (i69 >= zznkVar.zze && i69 <= zznkVar.zzf) {
                        zzq = zznkVar.zzq(i69, i70);
                        if (zzq != i58) {
                            bArr2 = bArr8;
                            i11 = i67;
                            i12 = i69;
                            i7 = i6;
                            unsafe = unsafe5;
                            zzksVar2 = zzksVar13;
                            i8 = i64;
                            i60 = i57;
                            i13 = i60;
                            i14 = i58;
                            i15 = i62;
                            i16 = 1048575;
                            obj2 = obj5;
                        } else {
                            int i71 = i62 & 7;
                            i14 = i58;
                            int[] iArr = zznkVar.zzc;
                            int i72 = iArr[zzq + 1];
                            int zzr = zzr(i72);
                            long j4 = i72 & 1048575;
                            if (zzr <= 17) {
                                int i73 = iArr[zzq + 2];
                                int i74 = i65 << (i73 >>> 20);
                                int i75 = i73 & 1048575;
                                int i76 = i67;
                                if (i75 != i64) {
                                    if (i64 != 1048575) {
                                        unsafe5.putInt(obj5, i64, i61);
                                    }
                                    i61 = i75 == 1048575 ? 0 : unsafe5.getInt(obj5, i75);
                                    i64 = i75;
                                }
                                switch (zzr) {
                                    case 0:
                                        Object obj6 = obj5;
                                        unsafe2 = unsafe5;
                                        obj3 = obj6;
                                        i16 = 1048575;
                                        i12 = i69;
                                        zzksVar3 = zzksVar;
                                        i17 = zzq;
                                        i20 = i76;
                                        bArr3 = bArr;
                                        i18 = i61;
                                        i19 = i64;
                                        if (i71 != i65) {
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i59 = i20 + 8;
                                            zzol.zzo(obj3, j4, Double.longBitsToDouble(zzkt.zzn(bArr3, i20)));
                                            obj5 = obj3;
                                            unsafe5 = unsafe2;
                                            i56 = i5;
                                            i61 = i18 | i74;
                                            bArr8 = bArr3;
                                            zzksVar13 = zzksVar3;
                                            i63 = i12;
                                            i60 = i17;
                                            i58 = i14;
                                            i64 = i19;
                                            i57 = 0;
                                        }
                                    case 1:
                                        Object obj7 = obj5;
                                        unsafe2 = unsafe5;
                                        obj3 = obj7;
                                        i16 = 1048575;
                                        i12 = i69;
                                        zzksVar3 = zzksVar;
                                        i17 = zzq;
                                        i20 = i76;
                                        bArr3 = bArr;
                                        i18 = i61;
                                        i19 = i64;
                                        i21 = 0;
                                        if (i71 != 5) {
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i59 = i20 + 4;
                                            i22 = i18 | i74;
                                            zzol.zzp(obj3, j4, Float.intBitsToFloat(zzkt.zzb(bArr3, i20)));
                                            obj5 = obj3;
                                            unsafe5 = unsafe2;
                                            i56 = i5;
                                            bArr8 = bArr3;
                                            i63 = i12;
                                            i60 = i17;
                                            i58 = i14;
                                            i64 = i19;
                                            i65 = 1;
                                            i66 = 2;
                                            i57 = i21;
                                            i61 = i22;
                                            zzksVar13 = zzksVar3;
                                        }
                                    case 2:
                                    case 3:
                                        i16 = 1048575;
                                        i12 = i69;
                                        zzksVar3 = zzksVar;
                                        i17 = zzq;
                                        i20 = i76;
                                        bArr3 = bArr;
                                        i18 = i61;
                                        i19 = i64;
                                        if (i71 != 0) {
                                            Object obj8 = obj5;
                                            unsafe2 = unsafe5;
                                            obj3 = obj8;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            int zzk = zzkt.zzk(bArr3, i20, zzksVar3);
                                            unsafe5.putLong(obj5, j4, zzksVar3.zzb);
                                            obj5 = obj5;
                                            unsafe5 = unsafe5;
                                            i32 = 0;
                                            i61 = i18 | i74;
                                            i59 = zzk;
                                            i60 = i17;
                                            i57 = i32;
                                            i56 = i5;
                                            bArr8 = bArr3;
                                            zzksVar13 = zzksVar3;
                                            i63 = i12;
                                            i58 = i14;
                                            i64 = i19;
                                        }
                                    case 4:
                                    case 11:
                                        i16 = 1048575;
                                        i12 = i69;
                                        zzksVar3 = zzksVar;
                                        i17 = zzq;
                                        i20 = i76;
                                        bArr3 = bArr;
                                        i18 = i61;
                                        i19 = i64;
                                        i21 = 0;
                                        if (i71 != 0) {
                                            Object obj82 = obj5;
                                            unsafe2 = unsafe5;
                                            obj3 = obj82;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i22 = i18 | i74;
                                            i59 = zzkt.zzh(bArr3, i20, zzksVar3);
                                            unsafe5.putInt(obj5, j4, zzksVar3.zza);
                                            i56 = i5;
                                            bArr8 = bArr3;
                                            i63 = i12;
                                            i60 = i17;
                                            i58 = i14;
                                            i64 = i19;
                                            i65 = 1;
                                            i66 = 2;
                                            i57 = i21;
                                            i61 = i22;
                                            zzksVar13 = zzksVar3;
                                        }
                                    case 5:
                                    case 14:
                                        i16 = 1048575;
                                        i12 = i69;
                                        i17 = zzq;
                                        i20 = i76;
                                        Object obj9 = obj5;
                                        i18 = i61;
                                        i19 = i64;
                                        unsafe3 = unsafe5;
                                        if (i71 != i65) {
                                            zzksVar3 = zzksVar;
                                            bArr3 = bArr;
                                            obj3 = obj9;
                                            unsafe2 = unsafe3;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i59 = i20 + 8;
                                            zzksVar3 = zzksVar;
                                            obj5 = obj9;
                                            bArr3 = bArr;
                                            unsafe5 = unsafe3;
                                            unsafe5.putLong(obj5, j4, zzkt.zzn(bArr, i20));
                                            i32 = 0;
                                            i61 = i18 | i74;
                                            i60 = i17;
                                            i57 = i32;
                                            i56 = i5;
                                            bArr8 = bArr3;
                                            zzksVar13 = zzksVar3;
                                            i63 = i12;
                                            i58 = i14;
                                            i64 = i19;
                                        }
                                    case 6:
                                    case 13:
                                        i16 = 1048575;
                                        i12 = i69;
                                        i17 = zzq;
                                        i20 = i76;
                                        obj4 = obj5;
                                        i18 = i61;
                                        i19 = i64;
                                        i23 = 0;
                                        zzksVar4 = zzksVar;
                                        unsafe3 = unsafe5;
                                        bArr4 = bArr;
                                        if (i71 != 5) {
                                            Object obj10 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj10;
                                            zzksVar3 = zzksVar4;
                                            unsafe2 = unsafe3;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i59 = i20 + 4;
                                            i24 = i18 | i74;
                                            unsafe3.putInt(obj4, j4, zzkt.zzb(bArr4, i20));
                                            i56 = i5;
                                            bArr8 = bArr4;
                                            unsafe5 = unsafe3;
                                            i60 = i17;
                                            i58 = i14;
                                            i64 = i19;
                                            i66 = 2;
                                            i57 = i23;
                                            i61 = i24;
                                            zzksVar13 = zzksVar4;
                                            obj5 = obj4;
                                            i63 = i12;
                                        }
                                    case 7:
                                        i16 = 1048575;
                                        i12 = i69;
                                        i17 = zzq;
                                        i20 = i76;
                                        obj4 = obj5;
                                        i18 = i61;
                                        i19 = i64;
                                        i23 = 0;
                                        zzksVar4 = zzksVar;
                                        unsafe3 = unsafe5;
                                        bArr4 = bArr;
                                        if (i71 != 0) {
                                            Object obj102 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj102;
                                            zzksVar3 = zzksVar4;
                                            unsafe2 = unsafe3;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i24 = i18 | i74;
                                            i59 = zzkt.zzk(bArr4, i20, zzksVar4);
                                            zzol.zzm(obj4, j4, zzksVar4.zzb != 0 ? i65 : 0);
                                            i56 = i5;
                                            bArr8 = bArr4;
                                            unsafe5 = unsafe3;
                                            i60 = i17;
                                            i58 = i14;
                                            i64 = i19;
                                            i66 = 2;
                                            i57 = i23;
                                            i61 = i24;
                                            zzksVar13 = zzksVar4;
                                            obj5 = obj4;
                                            i63 = i12;
                                        }
                                    case 8:
                                        i16 = 1048575;
                                        i12 = i69;
                                        i17 = zzq;
                                        i20 = i76;
                                        obj4 = obj5;
                                        zzksVar4 = zzksVar;
                                        i18 = i61;
                                        i19 = i64;
                                        unsafe3 = unsafe5;
                                        bArr4 = bArr;
                                        if (i71 != i66) {
                                            Object obj1022 = obj4;
                                            bArr3 = bArr4;
                                            obj3 = obj1022;
                                            zzksVar3 = zzksVar4;
                                            unsafe2 = unsafe3;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            if ((i72 & 536870912) != 0) {
                                                int zzh6 = zzkt.zzh(bArr4, i20, zzksVar4);
                                                int i77 = zzksVar4.zza;
                                                if (i77 < 0) {
                                                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                int i78 = i18 | i74;
                                                if (i77 == 0) {
                                                    zzksVar4.zzc = "";
                                                    i28 = i78;
                                                    i25 = 0;
                                                } else {
                                                    int i79 = zzoo.zza;
                                                    int length = bArr4.length;
                                                    if ((zzh6 | i77 | ((length - zzh6) - i77)) < 0) {
                                                        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(zzh6), Integer.valueOf(i77)));
                                                    }
                                                    int i80 = zzh6 + i77;
                                                    char[] cArr = new char[i77];
                                                    int i81 = 0;
                                                    while (true) {
                                                        i27 = zzh6;
                                                        if (zzh6 < i80) {
                                                            byte b4 = bArr4[i27];
                                                            if (zzom.zzd(b4)) {
                                                                cArr[i81] = (char) b4;
                                                                zzh6 = i27 + 1;
                                                                i81++;
                                                            }
                                                        }
                                                    }
                                                    while (true) {
                                                        int i82 = i27;
                                                        while (i82 < i80) {
                                                            int i83 = i82;
                                                            i82 = i83 + 1;
                                                            int i84 = i78;
                                                            byte b5 = bArr4[i83];
                                                            if (zzom.zzd(b5)) {
                                                                int i85 = i81 + 1;
                                                                cArr[i81] = (char) b5;
                                                                while (true) {
                                                                    i81 = i85;
                                                                    if (i82 < i80) {
                                                                        byte b6 = bArr4[i82];
                                                                        if (zzom.zzd(b6)) {
                                                                            i82++;
                                                                            i85 = i81 + 1;
                                                                            cArr[i81] = (char) b6;
                                                                        }
                                                                    }
                                                                }
                                                                i78 = i84;
                                                            } else if (b5 >= -32) {
                                                                if (b5 >= -16) {
                                                                    i29 = i80;
                                                                    if (i82 >= i29 - 2) {
                                                                        throw new zzmm("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    char[] cArr2 = cArr;
                                                                    int i86 = i81;
                                                                    zzom.zza(b5, bArr4[i82], bArr4[i83 + 2], bArr4[i83 + 3], cArr2, i86);
                                                                    i81 = i86 + 2;
                                                                    i78 = i84;
                                                                    cArr = cArr2;
                                                                    i82 = i83 + 4;
                                                                } else {
                                                                    if (i82 >= i80 - 1) {
                                                                        throw new zzmm("Protocol message had invalid UTF-8.");
                                                                    }
                                                                    i29 = i80;
                                                                    zzom.zzb(b5, bArr4[i82], bArr4[i83 + 2], cArr, i81);
                                                                    i78 = i84;
                                                                    i81++;
                                                                    i82 = i83 + 3;
                                                                }
                                                                i80 = i29;
                                                            } else {
                                                                if (i82 >= i80) {
                                                                    throw new zzmm("Protocol message had invalid UTF-8.");
                                                                }
                                                                i27 = i83 + 2;
                                                                zzom.zzc(b5, bArr4[i82], cArr, i81);
                                                                i78 = i84;
                                                                i81++;
                                                            }
                                                        }
                                                        i28 = i78;
                                                        int i87 = i81;
                                                        i25 = 0;
                                                        zzksVar4.zzc = new String(cArr, 0, i87);
                                                        zzh6 = i80;
                                                    }
                                                }
                                                i59 = zzh6;
                                                i26 = i28;
                                            } else {
                                                i25 = 0;
                                                int zzh7 = zzkt.zzh(bArr4, i20, zzksVar4);
                                                int i88 = zzksVar4.zza;
                                                if (i88 < 0) {
                                                    throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                int i89 = i18 | i74;
                                                if (i88 == 0) {
                                                    zzksVar4.zzc = "";
                                                } else {
                                                    zzksVar4.zzc = new String(bArr4, zzh7, i88, zzmk.zza);
                                                    zzh7 += i88;
                                                }
                                                i59 = zzh7;
                                                i26 = i89;
                                            }
                                            unsafe3.putObject(obj4, j4, zzksVar4.zzc);
                                            i56 = i5;
                                            bArr8 = bArr4;
                                            zzksVar13 = zzksVar4;
                                            obj5 = obj4;
                                            i63 = i12;
                                            unsafe5 = unsafe3;
                                            i60 = i17;
                                            i58 = i14;
                                            i64 = i19;
                                            i66 = 2;
                                            i57 = i25;
                                            i61 = i26;
                                        }
                                    case 9:
                                        Object obj11 = obj5;
                                        Unsafe unsafe6 = unsafe5;
                                        obj3 = obj11;
                                        bArr5 = bArr;
                                        i17 = zzq;
                                        i18 = i61;
                                        i19 = i64;
                                        int i90 = i66;
                                        i12 = i69;
                                        if (i71 != i90) {
                                            i62 = i62;
                                            i20 = i76;
                                            zzksVar3 = zzksVar;
                                            unsafe2 = unsafe6;
                                            i16 = 1048575;
                                            bArr3 = bArr5;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            int i91 = i18 | i74;
                                            Object zzx = zznkVar.zzx(obj3, i17);
                                            i62 = i62;
                                            zzksVar13 = zzksVar;
                                            i59 = zzkt.zzm(zzx, zznkVar.zzv(i17), bArr5, i76, i5, zzksVar13);
                                            zznkVar.zzF(obj3, i17, zzx);
                                            i56 = i5;
                                            bArr8 = bArr5;
                                            obj5 = obj3;
                                            i63 = i12;
                                            i66 = i90;
                                            unsafe5 = unsafe6;
                                            i58 = i14;
                                            i64 = i19;
                                            i61 = i91;
                                            i60 = i17;
                                            i57 = 0;
                                        }
                                    case 10:
                                        Object obj12 = obj5;
                                        unsafe2 = unsafe5;
                                        obj3 = obj12;
                                        bArr5 = bArr;
                                        i17 = zzq;
                                        i30 = i62;
                                        i12 = i69;
                                        i31 = i76;
                                        zzksVar5 = zzksVar;
                                        i18 = i61;
                                        i19 = i64;
                                        int i92 = i66;
                                        if (i71 != i92) {
                                            i62 = i30;
                                            i20 = i31;
                                            zzksVar3 = zzksVar5;
                                            i16 = 1048575;
                                            bArr3 = bArr5;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            int i93 = i18 | i74;
                                            int zza2 = zzkt.zza(bArr5, i31, zzksVar5);
                                            unsafe2.putObject(obj3, j4, zzksVar5.zzc);
                                            obj5 = obj3;
                                            unsafe5 = unsafe2;
                                            i56 = i5;
                                            i62 = i30;
                                            bArr8 = bArr5;
                                            i66 = i92;
                                            i58 = i14;
                                            i64 = i19;
                                            i59 = zza2;
                                            zzksVar13 = zzksVar5;
                                            i61 = i93;
                                            i63 = i12;
                                            i60 = i17;
                                            i57 = 0;
                                        }
                                    case 12:
                                        Object obj13 = obj5;
                                        unsafe2 = unsafe5;
                                        obj3 = obj13;
                                        bArr5 = bArr;
                                        i17 = zzq;
                                        i30 = i62;
                                        i12 = i69;
                                        i31 = i76;
                                        zzksVar5 = zzksVar;
                                        if (i71 != 0) {
                                            i18 = i61;
                                            i19 = i64;
                                            i62 = i30;
                                            i20 = i31;
                                            zzksVar3 = zzksVar5;
                                            i16 = 1048575;
                                            bArr3 = bArr5;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            int zzh8 = zzkt.zzh(bArr5, i31, zzksVar5);
                                            int i94 = zzksVar5.zza;
                                            zzmg zzu = zznkVar.zzu(i17);
                                            if ((i72 & Integer.MIN_VALUE) == 0 || zzu == null || zzu.zza(i94)) {
                                                int i95 = i64;
                                                i61 |= i74;
                                                unsafe2.putInt(obj3, j4, i94);
                                                obj5 = obj3;
                                                unsafe5 = unsafe2;
                                                i56 = i5;
                                                bArr8 = bArr5;
                                                zzksVar13 = zzksVar5;
                                                i63 = i12;
                                                i60 = i17;
                                                i59 = zzh8;
                                                i58 = i14;
                                                i64 = i95;
                                            } else {
                                                zzd(obj3).zzj(i30, Long.valueOf(i94));
                                                obj5 = obj3;
                                                unsafe5 = unsafe2;
                                                i56 = i5;
                                                bArr8 = bArr5;
                                                zzksVar13 = zzksVar5;
                                                i63 = i12;
                                                i60 = i17;
                                                i59 = zzh8;
                                                i58 = i14;
                                                i64 = i64;
                                                i61 = i61;
                                            }
                                            i57 = 0;
                                            i62 = i30;
                                        }
                                    case 15:
                                        Object obj14 = obj5;
                                        unsafe2 = unsafe5;
                                        obj3 = obj14;
                                        bArr5 = bArr;
                                        i17 = zzq;
                                        i12 = i69;
                                        zzksVar6 = zzksVar;
                                        if (i71 != 0) {
                                            i16 = 1048575;
                                            i62 = i62;
                                            zzksVar3 = zzksVar6;
                                            i18 = i61;
                                            i19 = i64;
                                            i20 = i76;
                                            bArr3 = bArr5;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i61 |= i74;
                                            zzh = zzkt.zzh(bArr5, i76, zzksVar6);
                                            unsafe2.putInt(obj3, j4, zzlg.zzb(zzksVar6.zza));
                                            obj5 = obj3;
                                            unsafe5 = unsafe2;
                                            i56 = i5;
                                            i62 = i62;
                                            bArr8 = bArr5;
                                            zzksVar13 = zzksVar6;
                                            i59 = zzh;
                                            i63 = i12;
                                            i60 = i17;
                                            i58 = i14;
                                            i57 = 0;
                                        }
                                    case 16:
                                        bArr5 = bArr;
                                        i17 = zzq;
                                        i12 = i69;
                                        zzksVar6 = zzksVar;
                                        if (i71 != 0) {
                                            Object obj15 = obj5;
                                            unsafe2 = unsafe5;
                                            obj3 = obj15;
                                            i20 = i76;
                                            zzksVar3 = zzksVar6;
                                            i18 = i61;
                                            i19 = i64;
                                            i16 = 1048575;
                                            bArr3 = bArr5;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i61 |= i74;
                                            zzh = zzkt.zzk(bArr5, i76, zzksVar6);
                                            unsafe5.putLong(obj5, j4, zzlg.zzc(zzksVar6.zzb));
                                            obj5 = obj5;
                                            unsafe5 = unsafe5;
                                            i56 = i5;
                                            bArr8 = bArr5;
                                            zzksVar13 = zzksVar6;
                                            i59 = zzh;
                                            i63 = i12;
                                            i60 = i17;
                                            i58 = i14;
                                            i57 = 0;
                                        }
                                    default:
                                        if (i71 != 3) {
                                            i17 = zzq;
                                            i12 = i69;
                                            Object obj16 = obj5;
                                            unsafe2 = unsafe5;
                                            obj3 = obj16;
                                            bArr3 = bArr;
                                            zzksVar3 = zzksVar;
                                            i18 = i61;
                                            i19 = i64;
                                            i16 = 1048575;
                                            i20 = i76;
                                            obj2 = obj3;
                                            i11 = i20;
                                            bArr2 = bArr3;
                                            zzksVar2 = zzksVar3;
                                            i60 = i17;
                                            i15 = i62;
                                            i8 = i19;
                                            i61 = i18;
                                            i13 = 0;
                                            i7 = i6;
                                            unsafe = unsafe2;
                                            break;
                                        } else {
                                            i61 |= i74;
                                            Object zzx2 = zznkVar.zzx(obj5, zzq);
                                            int i96 = zzq;
                                            int zzl = zzkt.zzl(zzx2, zznkVar.zzv(zzq), bArr, i76, i5, (i69 << 3) | 4, zzksVar);
                                            zznkVar.zzF(obj5, i96, zzx2);
                                            bArr8 = bArr;
                                            zzksVar13 = zzksVar;
                                            i63 = i69;
                                            i60 = i96;
                                            i58 = i14;
                                            i57 = 0;
                                            i59 = zzl;
                                            i56 = i5;
                                        }
                                }
                            } else {
                                Object obj17 = obj5;
                                Unsafe unsafe7 = unsafe5;
                                int i97 = i67;
                                int i98 = i69;
                                i13 = 0;
                                i16 = 1048575;
                                int i99 = zzq;
                                if (zzr != 27) {
                                    Unsafe unsafe8 = unsafe7;
                                    if (zzr > 49) {
                                        bArr2 = bArr;
                                        i8 = i64;
                                        i34 = i62;
                                        i36 = i98;
                                        i33 = i61;
                                        i35 = i97;
                                        zzksVar7 = zzksVar;
                                        if (zzr != 50) {
                                            zznkVar = this;
                                            obj2 = obj;
                                            long j5 = iArr[i99 + 2] & 1048575;
                                            switch (zzr) {
                                                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i62 = i34;
                                                    i53 = i35;
                                                    if (i71 == 1) {
                                                        i54 = i53 + 8;
                                                        unsafe.putObject(obj2, j4, Double.valueOf(Double.longBitsToDouble(zzkt.zzn(bArr2, i53))));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        if (i54 == i53) {
                                                            i7 = i6;
                                                            i11 = i54;
                                                            i60 = i52;
                                                            i15 = i62;
                                                            i61 = i33;
                                                            break;
                                                        } else {
                                                            i56 = i5;
                                                            bArr8 = bArr2;
                                                            unsafe5 = unsafe;
                                                            i63 = i12;
                                                            obj5 = obj2;
                                                            i60 = i52;
                                                            i58 = i14;
                                                            i61 = i33;
                                                            i57 = 0;
                                                            i64 = i8;
                                                            i65 = 1;
                                                            i66 = 2;
                                                            i59 = i54;
                                                            zzksVar13 = zzksVar2;
                                                            break;
                                                        }
                                                    }
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                case IronSourceConstants.SET_USER_ID /* 52 */:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i62 = i34;
                                                    i53 = i35;
                                                    if (i71 == 5) {
                                                        i54 = i53 + 4;
                                                        unsafe.putObject(obj2, j4, Float.valueOf(Float.intBitsToFloat(zzkt.zzb(bArr2, i53))));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                                                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i62 = i34;
                                                    i53 = i35;
                                                    if (i71 == 0) {
                                                        i54 = zzkt.zzk(bArr2, i53, zzksVar2);
                                                        unsafe.putObject(obj2, j4, Long.valueOf(zzksVar2.zzb));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                                                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i62 = i34;
                                                    i53 = i35;
                                                    if (i71 == 0) {
                                                        i54 = zzkt.zzh(bArr2, i53, zzksVar2);
                                                        unsafe.putObject(obj2, j4, Integer.valueOf(zzksVar2.zza));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                                                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i62 = i34;
                                                    i53 = i35;
                                                    if (i71 == 1) {
                                                        i54 = i53 + 8;
                                                        unsafe.putObject(obj2, j4, Long.valueOf(zzkt.zzn(bArr2, i53)));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                                                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i62 = i34;
                                                    i53 = i35;
                                                    if (i71 == 5) {
                                                        i54 = i53 + 4;
                                                        unsafe.putObject(obj2, j4, Integer.valueOf(zzkt.zzb(bArr2, i53)));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case 58:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i53 = i35;
                                                    if (i71 == 0) {
                                                        i54 = zzkt.zzk(bArr2, i53, zzksVar2);
                                                        i62 = i34;
                                                        unsafe.putObject(obj2, j4, Boolean.valueOf(zzksVar2.zzb != 0));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    i62 = i34;
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case 59:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i53 = i35;
                                                    if (i71 == 2) {
                                                        int zzh9 = zzkt.zzh(bArr2, i53, zzksVar2);
                                                        int i100 = zzksVar2.zza;
                                                        if (i100 == 0) {
                                                            unsafe.putObject(obj2, j4, "");
                                                        } else {
                                                            int i101 = zzh9 + i100;
                                                            if ((i72 & 536870912) != 0 && !zzoo.zzd(bArr2, zzh9, i101)) {
                                                                throw new zzmm("Protocol message had invalid UTF-8.");
                                                            }
                                                            unsafe.putObject(obj2, j4, new String(bArr2, zzh9, i100, zzmk.zza));
                                                            zzh9 = i101;
                                                        }
                                                        unsafe.putInt(obj2, j5, i12);
                                                        i62 = i34;
                                                        i54 = zzh9;
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    i62 = i34;
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case 60:
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    if (i71 == 2) {
                                                        Object zzy = zznkVar.zzy(obj2, i12, i99);
                                                        int zzm = zzkt.zzm(zzy, zznkVar.zzv(i99), bArr2, i35, i5, zzksVar7);
                                                        zzksVar2 = zzksVar7;
                                                        zznkVar.zzG(obj2, i12, i99, zzy);
                                                        i54 = zzm;
                                                        i62 = i34;
                                                        i52 = i99;
                                                        i53 = i35;
                                                        if (i54 == i53) {
                                                        }
                                                    } else {
                                                        zzksVar2 = zzksVar7;
                                                        i62 = i34;
                                                        i52 = i99;
                                                        i53 = i35;
                                                        i54 = i53;
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    break;
                                                case 61:
                                                    zzksVar12 = zzksVar7;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    c4 = 3;
                                                    if (i71 == 2) {
                                                        int zza3 = zzkt.zza(bArr2, i35, zzksVar12);
                                                        unsafe.putObject(obj2, j4, zzksVar12.zzc);
                                                        unsafe.putInt(obj2, j5, i12);
                                                        zzksVar2 = zzksVar12;
                                                        i62 = i34;
                                                        i54 = zza3;
                                                        i52 = i99;
                                                        i53 = i35;
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    zzksVar2 = zzksVar12;
                                                    i62 = i34;
                                                    i52 = i99;
                                                    i53 = i35;
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case 63:
                                                    zzksVar12 = zzksVar7;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    c4 = 3;
                                                    i62 = i34;
                                                    if (i71 == 0) {
                                                        int zzh10 = zzkt.zzh(bArr2, i35, zzksVar12);
                                                        int i102 = zzksVar12.zza;
                                                        zzmg zzu2 = zznkVar.zzu(i99);
                                                        if (zzu2 == null || zzu2.zza(i102)) {
                                                            i55 = i62;
                                                            unsafe.putObject(obj2, j4, Integer.valueOf(i102));
                                                            unsafe.putInt(obj2, j5, i12);
                                                        } else {
                                                            i55 = i62;
                                                            zzd(obj2).zzj(i55, Long.valueOf(i102));
                                                        }
                                                        i54 = zzh10;
                                                        zzksVar2 = zzksVar12;
                                                        i62 = i55;
                                                        i52 = i99;
                                                        i53 = i35;
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    zzksVar2 = zzksVar12;
                                                    i52 = i99;
                                                    i53 = i35;
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case 66:
                                                    zzksVar12 = zzksVar7;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    c4 = 3;
                                                    i62 = i34;
                                                    if (i71 == 0) {
                                                        zzh5 = zzkt.zzh(bArr2, i35, zzksVar12);
                                                        unsafe.putObject(obj2, j4, Integer.valueOf(zzlg.zzb(zzksVar12.zza)));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        zzks zzksVar14 = zzksVar12;
                                                        i54 = zzh5;
                                                        zzksVar2 = zzksVar14;
                                                        i52 = i99;
                                                        i53 = i35;
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    zzksVar2 = zzksVar12;
                                                    i52 = i99;
                                                    i53 = i35;
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case 67:
                                                    zzksVar12 = zzksVar7;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    c4 = 3;
                                                    if (i71 == 0) {
                                                        zzh5 = zzkt.zzk(bArr2, i35, zzksVar12);
                                                        i62 = i34;
                                                        unsafe.putObject(obj2, j4, Long.valueOf(zzlg.zzc(zzksVar12.zzb)));
                                                        unsafe.putInt(obj2, j5, i12);
                                                        zzks zzksVar142 = zzksVar12;
                                                        i54 = zzh5;
                                                        zzksVar2 = zzksVar142;
                                                        i52 = i99;
                                                        i53 = i35;
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    zzksVar2 = zzksVar12;
                                                    i62 = i34;
                                                    i52 = i99;
                                                    i53 = i35;
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                                case 68:
                                                    if (i71 == 3) {
                                                        Object zzy2 = zznkVar.zzy(obj2, i36, i99);
                                                        unsafe = unsafe8;
                                                        int zzl2 = zzkt.zzl(zzy2, zznkVar.zzv(i99), bArr2, i35, i5, (i34 & (-8)) | 4, zzksVar7);
                                                        bArr2 = bArr2;
                                                        zznkVar.zzG(obj2, i36, i99, zzy2);
                                                        zzksVar2 = zzksVar7;
                                                        i62 = i34;
                                                        i12 = i36;
                                                        i52 = i99;
                                                        i54 = zzl2;
                                                        i53 = i35;
                                                        if (i54 == i53) {
                                                        }
                                                    } else {
                                                        unsafe = unsafe8;
                                                        zzksVar2 = zzksVar7;
                                                        i52 = i99;
                                                        i12 = i36;
                                                        i62 = i34;
                                                        i53 = i35;
                                                        i54 = i53;
                                                        if (i54 == i53) {
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    zzksVar2 = zzksVar7;
                                                    i52 = i99;
                                                    i12 = i36;
                                                    unsafe = unsafe8;
                                                    i62 = i34;
                                                    i53 = i35;
                                                    i54 = i53;
                                                    if (i54 == i53) {
                                                    }
                                                    break;
                                            }
                                        } else {
                                            if (i71 == 2) {
                                                Object zzw = zzw(i99);
                                                Object object = unsafe8.getObject(obj, j4);
                                                if (!((zznb) object).zze()) {
                                                    zznb zzb2 = zznb.zza().zzb();
                                                    zznc.zza(zzb2, object);
                                                    unsafe8.putObject(obj, j4, zzb2);
                                                }
                                                throw null;
                                            }
                                            zznkVar = this;
                                            obj2 = obj;
                                            unsafe7 = unsafe8;
                                        }
                                    } else {
                                        long j6 = i72;
                                        zzmj zzmjVar2 = (zzmj) unsafe8.getObject(obj17, j4);
                                        if (!zzmjVar2.zzc()) {
                                            int size = zzmjVar2.size();
                                            zzmjVar2 = zzmjVar2.zzd(size + size);
                                            unsafe8.putObject(obj17, j4, zzmjVar2);
                                        }
                                        switch (zzr) {
                                            case 18:
                                            case C3139z9.f40333J /* 35 */:
                                                bArr2 = bArr;
                                                zzmj zzmjVar3 = zzmjVar2;
                                                i37 = i61;
                                                i8 = i64;
                                                i38 = i62;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                i40 = i98;
                                                i41 = i5;
                                                zzksVar8 = zzksVar;
                                                if (i71 == 2) {
                                                    int i103 = zzkt.zza;
                                                    zzlm zzlmVar = (zzlm) zzmjVar3;
                                                    i42 = zzkt.zzh(bArr2, i39, zzksVar8);
                                                    int i104 = zzksVar8.zza;
                                                    int i105 = i42 + i104;
                                                    if (i105 > bArr2.length) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzlmVar.zzg(zzlmVar.size() + (i104 / 8));
                                                    while (i42 < i105) {
                                                        zzlmVar.zzf(Double.longBitsToDouble(zzkt.zzn(bArr2, i42)));
                                                        i42 += 8;
                                                    }
                                                    if (i42 != i105) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                } else {
                                                    if (i71 == 1) {
                                                        i42 = i39 + 8;
                                                        int i106 = zzkt.zza;
                                                        zzlm zzlmVar2 = (zzlm) zzmjVar3;
                                                        zzlmVar2.zzf(Double.longBitsToDouble(zzkt.zzn(bArr2, i39)));
                                                        while (i42 < i41) {
                                                            int zzh11 = zzkt.zzh(bArr2, i42, zzksVar8);
                                                            if (i38 == zzksVar8.zza) {
                                                                zzlmVar2.zzf(Double.longBitsToDouble(zzkt.zzn(bArr2, zzh11)));
                                                                i42 = zzh11 + 8;
                                                            }
                                                        }
                                                    }
                                                    i42 = i39;
                                                }
                                                if (i42 == i39) {
                                                    obj2 = obj;
                                                    i11 = i42;
                                                    i15 = i38;
                                                    zzksVar2 = zzksVar8;
                                                    i60 = i99;
                                                    i12 = i40;
                                                    i61 = i37;
                                                    unsafe = unsafe4;
                                                    zznkVar = this;
                                                    i7 = i6;
                                                    break;
                                                } else {
                                                    int i107 = i40;
                                                    i62 = i38;
                                                    i63 = i107;
                                                    obj5 = obj;
                                                    bArr8 = bArr2;
                                                    i56 = i41;
                                                    zzksVar13 = zzksVar8;
                                                    i60 = i99;
                                                    i58 = i14;
                                                    i61 = i37;
                                                    i57 = 0;
                                                    unsafe5 = unsafe4;
                                                    i64 = i8;
                                                    i65 = 1;
                                                    i66 = 2;
                                                    i59 = i42;
                                                    zznkVar = this;
                                                    break;
                                                }
                                            case 19:
                                            case 36:
                                                bArr2 = bArr;
                                                zzmj zzmjVar4 = zzmjVar2;
                                                i37 = i61;
                                                i8 = i64;
                                                i38 = i62;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                i40 = i98;
                                                i41 = i5;
                                                zzksVar8 = zzksVar;
                                                if (i71 == 2) {
                                                    int i108 = zzkt.zza;
                                                    zzlw zzlwVar = (zzlw) zzmjVar4;
                                                    i42 = zzkt.zzh(bArr2, i39, zzksVar8);
                                                    int i109 = zzksVar8.zza;
                                                    int i110 = i42 + i109;
                                                    if (i110 > bArr2.length) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzlwVar.zzg(zzlwVar.size() + (i109 / 4));
                                                    while (i42 < i110) {
                                                        zzlwVar.zzf(Float.intBitsToFloat(zzkt.zzb(bArr2, i42)));
                                                        i42 += 4;
                                                    }
                                                    if (i42 != i110) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                } else {
                                                    if (i71 == 5) {
                                                        i42 = i39 + 4;
                                                        int i111 = zzkt.zza;
                                                        zzlw zzlwVar2 = (zzlw) zzmjVar4;
                                                        zzlwVar2.zzf(Float.intBitsToFloat(zzkt.zzb(bArr2, i39)));
                                                        while (i42 < i41) {
                                                            int zzh12 = zzkt.zzh(bArr2, i42, zzksVar8);
                                                            if (i38 == zzksVar8.zza) {
                                                                zzlwVar2.zzf(Float.intBitsToFloat(zzkt.zzb(bArr2, zzh12)));
                                                                i42 = zzh12 + 4;
                                                            }
                                                        }
                                                    }
                                                    i42 = i39;
                                                }
                                                if (i42 == i39) {
                                                }
                                                break;
                                            case 20:
                                            case 21:
                                            case 37:
                                            case C3139z9.f40334K /* 38 */:
                                                bArr2 = bArr;
                                                zzmj zzmjVar5 = zzmjVar2;
                                                i37 = i61;
                                                i8 = i64;
                                                i38 = i62;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                i40 = i98;
                                                i41 = i5;
                                                zzksVar8 = zzksVar;
                                                if (i71 == 2) {
                                                    int i112 = zzkt.zza;
                                                    zzmw zzmwVar = (zzmw) zzmjVar5;
                                                    i42 = zzkt.zzh(bArr2, i39, zzksVar8);
                                                    int i113 = zzksVar8.zza + i42;
                                                    while (i42 < i113) {
                                                        i42 = zzkt.zzk(bArr2, i42, zzksVar8);
                                                        zzmwVar.zzg(zzksVar8.zzb);
                                                    }
                                                    if (i42 != i113) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                } else {
                                                    if (i71 == 0) {
                                                        int i114 = zzkt.zza;
                                                        zzmw zzmwVar2 = (zzmw) zzmjVar5;
                                                        i42 = zzkt.zzk(bArr2, i39, zzksVar8);
                                                        zzmwVar2.zzg(zzksVar8.zzb);
                                                        while (i42 < i41) {
                                                            int zzh13 = zzkt.zzh(bArr2, i42, zzksVar8);
                                                            if (i38 == zzksVar8.zza) {
                                                                i42 = zzkt.zzk(bArr2, zzh13, zzksVar8);
                                                                zzmwVar2.zzg(zzksVar8.zzb);
                                                            }
                                                        }
                                                    }
                                                    i42 = i39;
                                                }
                                                if (i42 == i39) {
                                                }
                                                break;
                                            case 22:
                                            case 29:
                                            case 39:
                                            case 43:
                                                zzmj zzmjVar6 = zzmjVar2;
                                                i43 = i62;
                                                i40 = i98;
                                                bArr6 = bArr;
                                                i44 = i5;
                                                zzksVar9 = zzksVar;
                                                i37 = i61;
                                                i8 = i64;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                if (i71 == 2) {
                                                    zzf = zzkt.zzf(bArr6, i39, zzmjVar6, zzksVar9);
                                                    i38 = i43;
                                                    i42 = zzf;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    if (i71 == 0) {
                                                        int zzj2 = zzkt.zzj(i43, bArr6, i39, i44, zzmjVar6, zzksVar9);
                                                        i38 = i43;
                                                        bArr2 = bArr6;
                                                        i41 = i44;
                                                        zzksVar8 = zzksVar9;
                                                        i42 = zzj2;
                                                        if (i42 == i39) {
                                                        }
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                            case ConnectionResult.API_DISABLED /* 23 */:
                                            case 32:
                                            case 40:
                                            case 46:
                                                zzmj zzmjVar7 = zzmjVar2;
                                                i43 = i62;
                                                i40 = i98;
                                                bArr6 = bArr;
                                                i44 = i5;
                                                zzksVar9 = zzksVar;
                                                i37 = i61;
                                                i8 = i64;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                if (i71 == 2) {
                                                    int i115 = zzkt.zza;
                                                    zzmw zzmwVar3 = (zzmw) zzmjVar7;
                                                    zzh2 = zzkt.zzh(bArr6, i39, zzksVar9);
                                                    int i116 = zzksVar9.zza;
                                                    int i117 = zzh2 + i116;
                                                    if (i117 > bArr6.length) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzmwVar3.zzh(zzmwVar3.size() + (i116 / 8));
                                                    while (zzh2 < i117) {
                                                        zzmwVar3.zzg(zzkt.zzn(bArr6, zzh2));
                                                        zzh2 += 8;
                                                    }
                                                    if (zzh2 != i117) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i42 = zzh2;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    if (i71 == 1) {
                                                        i42 = i39 + 8;
                                                        int i118 = zzkt.zza;
                                                        zzmw zzmwVar4 = (zzmw) zzmjVar7;
                                                        zzmwVar4.zzg(zzkt.zzn(bArr6, i39));
                                                        while (i42 < i44) {
                                                            int zzh14 = zzkt.zzh(bArr6, i42, zzksVar9);
                                                            if (i43 == zzksVar9.zza) {
                                                                zzmwVar4.zzg(zzkt.zzn(bArr6, zzh14));
                                                                i42 = zzh14 + 8;
                                                            } else {
                                                                i38 = i43;
                                                                bArr2 = bArr6;
                                                                i41 = i44;
                                                                zzksVar8 = zzksVar9;
                                                                if (i42 == i39) {
                                                                }
                                                            }
                                                        }
                                                        i38 = i43;
                                                        bArr2 = bArr6;
                                                        i41 = i44;
                                                        zzksVar8 = zzksVar9;
                                                        if (i42 == i39) {
                                                        }
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                            case 24:
                                            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                            case 41:
                                            case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                                                zzmj zzmjVar8 = zzmjVar2;
                                                i43 = i62;
                                                i40 = i98;
                                                bArr6 = bArr;
                                                i44 = i5;
                                                zzksVar9 = zzksVar;
                                                i37 = i61;
                                                i8 = i64;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                if (i71 == 2) {
                                                    int i119 = zzkt.zza;
                                                    zzme zzmeVar = (zzme) zzmjVar8;
                                                    zzh2 = zzkt.zzh(bArr6, i39, zzksVar9);
                                                    int i120 = zzksVar9.zza;
                                                    int i121 = zzh2 + i120;
                                                    if (i121 > bArr6.length) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    zzmeVar.zzi(zzmeVar.size() + (i120 / 4));
                                                    while (zzh2 < i121) {
                                                        zzmeVar.zzh(zzkt.zzb(bArr6, zzh2));
                                                        zzh2 += 4;
                                                    }
                                                    if (zzh2 != i121) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i42 = zzh2;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    if (i71 == 5) {
                                                        i42 = i39 + 4;
                                                        int i122 = zzkt.zza;
                                                        zzme zzmeVar2 = (zzme) zzmjVar8;
                                                        zzmeVar2.zzh(zzkt.zzb(bArr6, i39));
                                                        while (i42 < i44) {
                                                            int zzh15 = zzkt.zzh(bArr6, i42, zzksVar9);
                                                            if (i43 == zzksVar9.zza) {
                                                                zzmeVar2.zzh(zzkt.zzb(bArr6, zzh15));
                                                                i42 = zzh15 + 4;
                                                            } else {
                                                                i38 = i43;
                                                                bArr2 = bArr6;
                                                                i41 = i44;
                                                                zzksVar8 = zzksVar9;
                                                                if (i42 == i39) {
                                                                }
                                                            }
                                                        }
                                                        i38 = i43;
                                                        bArr2 = bArr6;
                                                        i41 = i44;
                                                        zzksVar8 = zzksVar9;
                                                        if (i42 == i39) {
                                                        }
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                            case 25:
                                            case 42:
                                                zzmj zzmjVar9 = zzmjVar2;
                                                i43 = i62;
                                                i40 = i98;
                                                bArr6 = bArr;
                                                i44 = i5;
                                                zzksVar9 = zzksVar;
                                                i37 = i61;
                                                i8 = i64;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                if (i71 == 2) {
                                                    int i123 = zzkt.zza;
                                                    zzku zzkuVar = (zzku) zzmjVar9;
                                                    zzh2 = zzkt.zzh(bArr6, i39, zzksVar9);
                                                    int i124 = zzksVar9.zza + zzh2;
                                                    while (zzh2 < i124) {
                                                        zzh2 = zzkt.zzk(bArr6, zzh2, zzksVar9);
                                                        zzkuVar.zze(zzksVar9.zzb != 0);
                                                    }
                                                    if (zzh2 != i124) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i42 = zzh2;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    if (i71 == 0) {
                                                        int i125 = zzkt.zza;
                                                        zzku zzkuVar2 = (zzku) zzmjVar9;
                                                        zzf = zzkt.zzk(bArr6, i39, zzksVar9);
                                                        zzkuVar2.zze(zzksVar9.zzb != 0);
                                                        while (zzf < i44) {
                                                            int zzh16 = zzkt.zzh(bArr6, zzf, zzksVar9);
                                                            if (i43 == zzksVar9.zza) {
                                                                zzf = zzkt.zzk(bArr6, zzh16, zzksVar9);
                                                                zzkuVar2.zze(zzksVar9.zzb != 0);
                                                            } else {
                                                                i38 = i43;
                                                                i42 = zzf;
                                                                bArr2 = bArr6;
                                                                i41 = i44;
                                                                zzksVar8 = zzksVar9;
                                                                if (i42 == i39) {
                                                                }
                                                            }
                                                        }
                                                        i38 = i43;
                                                        i42 = zzf;
                                                        bArr2 = bArr6;
                                                        i41 = i44;
                                                        zzksVar8 = zzksVar9;
                                                        if (i42 == i39) {
                                                        }
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                            case 26:
                                                bArr6 = bArr;
                                                i44 = i5;
                                                zzksVar9 = zzksVar;
                                                i37 = i61;
                                                i8 = i64;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                i45 = i98;
                                                zzmj zzmjVar10 = zzmjVar2;
                                                i43 = i62;
                                                if (i71 != 2) {
                                                    i40 = i45;
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                } else if ((j6 & 536870912) == 0) {
                                                    i42 = zzkt.zzh(bArr6, i39, zzksVar9);
                                                    int i126 = zzksVar9.zza;
                                                    if (i126 < 0) {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i126 == 0) {
                                                        zzmjVar10.add("");
                                                    } else {
                                                        zzmjVar10.add(new String(bArr6, i42, i126, zzmk.zza));
                                                        i42 += i126;
                                                    }
                                                    while (i42 < i44) {
                                                        int zzh17 = zzkt.zzh(bArr6, i42, zzksVar9);
                                                        if (i43 == zzksVar9.zza) {
                                                            i42 = zzkt.zzh(bArr6, zzh17, zzksVar9);
                                                            int i127 = zzksVar9.zza;
                                                            if (i127 < 0) {
                                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i127 == 0) {
                                                                zzmjVar10.add("");
                                                            } else {
                                                                zzmjVar10.add(new String(bArr6, i42, i127, zzmk.zza));
                                                                i42 += i127;
                                                            }
                                                        } else {
                                                            i38 = i43;
                                                            bArr2 = bArr6;
                                                            i41 = i44;
                                                            zzksVar8 = zzksVar9;
                                                            i40 = i45;
                                                            if (i42 == i39) {
                                                            }
                                                        }
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    i40 = i45;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    i42 = zzkt.zzh(bArr6, i39, zzksVar9);
                                                    int i128 = zzksVar9.zza;
                                                    if (i128 < 0) {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i128 == 0) {
                                                        zzmjVar10.add("");
                                                        i40 = i45;
                                                    } else {
                                                        int i129 = i42 + i128;
                                                        if (!zzoo.zzd(bArr6, i42, i129)) {
                                                            throw new zzmm("Protocol message had invalid UTF-8.");
                                                        }
                                                        i40 = i45;
                                                        zzmjVar10.add(new String(bArr6, i42, i128, zzmk.zza));
                                                        i42 = i129;
                                                    }
                                                    while (i42 < i44) {
                                                        int zzh18 = zzkt.zzh(bArr6, i42, zzksVar9);
                                                        if (i43 == zzksVar9.zza) {
                                                            i42 = zzkt.zzh(bArr6, zzh18, zzksVar9);
                                                            int i130 = zzksVar9.zza;
                                                            if (i130 < 0) {
                                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i130 == 0) {
                                                                zzmjVar10.add("");
                                                            } else {
                                                                int i131 = i42 + i130;
                                                                if (!zzoo.zzd(bArr6, i42, i131)) {
                                                                    throw new zzmm("Protocol message had invalid UTF-8.");
                                                                }
                                                                zzmjVar10.add(new String(bArr6, i42, i130, zzmk.zza));
                                                                i42 = i131;
                                                            }
                                                        } else {
                                                            i38 = i43;
                                                            bArr2 = bArr6;
                                                            i41 = i44;
                                                            zzksVar8 = zzksVar9;
                                                            if (i42 == i39) {
                                                            }
                                                        }
                                                    }
                                                    i38 = i43;
                                                    bArr2 = bArr6;
                                                    i41 = i44;
                                                    zzksVar8 = zzksVar9;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                            case 27:
                                                bArr7 = bArr;
                                                i46 = i5;
                                                zzksVar10 = zzksVar;
                                                zzmj zzmjVar11 = zzmjVar2;
                                                i37 = i61;
                                                i8 = i64;
                                                i47 = i62;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                i45 = i98;
                                                if (i71 == 2) {
                                                    int zze = zzkt.zze(zzv(i99), i47, bArr7, i39, i46, zzmjVar11, zzksVar10);
                                                    i39 = i39;
                                                    i38 = i47;
                                                    i42 = zze;
                                                    i41 = i46;
                                                    zzksVar8 = zzksVar10;
                                                    i40 = i45;
                                                    bArr2 = bArr7;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    i38 = i47;
                                                    bArr2 = bArr7;
                                                    i41 = i46;
                                                    zzksVar8 = zzksVar10;
                                                    i40 = i45;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                                bArr7 = bArr;
                                                i46 = i5;
                                                zzksVar10 = zzksVar;
                                                zzmj zzmjVar12 = zzmjVar2;
                                                i37 = i61;
                                                i8 = i64;
                                                i47 = i62;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                i45 = i98;
                                                if (i71 == 2) {
                                                    i42 = zzkt.zzh(bArr7, i39, zzksVar10);
                                                    int i132 = zzksVar10.zza;
                                                    if (i132 < 0) {
                                                        throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i132 > bArr7.length - i42) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i132 == 0) {
                                                        zzmjVar12.add(zzld.zzb);
                                                    } else {
                                                        zzmjVar12.add(zzld.zzj(bArr7, i42, i132));
                                                        i42 += i132;
                                                    }
                                                    while (i42 < i46) {
                                                        int zzh19 = zzkt.zzh(bArr7, i42, zzksVar10);
                                                        if (i47 == zzksVar10.zza) {
                                                            i42 = zzkt.zzh(bArr7, zzh19, zzksVar10);
                                                            int i133 = zzksVar10.zza;
                                                            if (i133 < 0) {
                                                                throw new zzmm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            }
                                                            if (i133 > bArr7.length - i42) {
                                                                throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                            }
                                                            if (i133 == 0) {
                                                                zzmjVar12.add(zzld.zzb);
                                                            } else {
                                                                zzmjVar12.add(zzld.zzj(bArr7, i42, i133));
                                                                i42 += i133;
                                                            }
                                                        } else {
                                                            i38 = i47;
                                                            bArr2 = bArr7;
                                                            i41 = i46;
                                                            zzksVar8 = zzksVar10;
                                                            i40 = i45;
                                                            if (i42 == i39) {
                                                            }
                                                        }
                                                    }
                                                    i38 = i47;
                                                    bArr2 = bArr7;
                                                    i41 = i46;
                                                    zzksVar8 = zzksVar10;
                                                    i40 = i45;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                i38 = i47;
                                                bArr2 = bArr7;
                                                i41 = i46;
                                                zzksVar8 = zzksVar10;
                                                i40 = i45;
                                                i42 = i39;
                                                if (i42 == i39) {
                                                }
                                                break;
                                            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                            case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                                                bArr7 = bArr;
                                                i46 = i5;
                                                zzksVar10 = zzksVar;
                                                zzmj zzmjVar13 = zzmjVar2;
                                                i37 = i61;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                i40 = i98;
                                                if (i71 == 2) {
                                                    zzj = zzkt.zzf(bArr7, i39, zzmjVar13, zzksVar10);
                                                    i47 = i62;
                                                    zzmjVar = zzmjVar13;
                                                } else if (i71 == 0) {
                                                    i47 = i62;
                                                    zzmjVar = zzmjVar13;
                                                    zzj = zzkt.zzj(i47, bArr7, i39, i46, zzmjVar, zzksVar10);
                                                    bArr7 = bArr7;
                                                } else {
                                                    i8 = i64;
                                                    i41 = i46;
                                                    zzksVar8 = zzksVar10;
                                                    i38 = i62;
                                                    bArr2 = bArr7;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                zzmg zzu3 = zznkVar.zzu(i99);
                                                zzoe zzoeVar = zznkVar.zzl;
                                                int i134 = zznu.zza;
                                                if (zzu3 == null) {
                                                    i48 = zzj;
                                                    i8 = i64;
                                                    i45 = i40;
                                                } else if (zzmjVar != null) {
                                                    int size2 = zzmjVar.size();
                                                    i48 = zzj;
                                                    Object obj18 = null;
                                                    int i135 = 0;
                                                    int i136 = 0;
                                                    while (i135 < size2) {
                                                        int i137 = i64;
                                                        Integer num = (Integer) zzmjVar.get(i135);
                                                        int intValue = num.intValue();
                                                        if (zzu3.zza(intValue)) {
                                                            if (i135 != i136) {
                                                                zzmjVar.set(i136, num);
                                                            }
                                                            i136++;
                                                            i49 = i40;
                                                        } else {
                                                            i49 = i40;
                                                            obj18 = zznu.zzn(obj17, i49, intValue, obj18, zzoeVar);
                                                        }
                                                        i135++;
                                                        i40 = i49;
                                                        i64 = i137;
                                                    }
                                                    i8 = i64;
                                                    i45 = i40;
                                                    if (i136 != size2) {
                                                        zzmjVar.subList(i136, size2).clear();
                                                    }
                                                } else {
                                                    i48 = zzj;
                                                    i8 = i64;
                                                    i45 = i40;
                                                    Iterator it = zzmjVar.iterator();
                                                    Object obj19 = null;
                                                    while (it.hasNext()) {
                                                        int intValue2 = ((Integer) it.next()).intValue();
                                                        if (!zzu3.zza(intValue2)) {
                                                            obj19 = zznu.zzn(obj17, i45, intValue2, obj19, zzoeVar);
                                                            it.remove();
                                                        }
                                                    }
                                                }
                                                i42 = i48;
                                                i38 = i47;
                                                bArr2 = bArr7;
                                                i41 = i46;
                                                zzksVar8 = zzksVar10;
                                                i40 = i45;
                                                if (i42 == i39) {
                                                }
                                                break;
                                            case 33:
                                            case 47:
                                                bArr7 = bArr;
                                                i50 = i5;
                                                zzksVar11 = zzksVar;
                                                zzmj zzmjVar14 = zzmjVar2;
                                                i37 = i61;
                                                i51 = i62;
                                                i39 = i97;
                                                unsafe4 = unsafe8;
                                                i40 = i98;
                                                if (i71 == 2) {
                                                    int i138 = zzkt.zza;
                                                    zzme zzmeVar3 = (zzme) zzmjVar14;
                                                    zzh4 = zzkt.zzh(bArr7, i39, zzksVar11);
                                                    int i139 = zzksVar11.zza + zzh4;
                                                    while (zzh4 < i139) {
                                                        zzh4 = zzkt.zzh(bArr7, zzh4, zzksVar11);
                                                        zzmeVar3.zzh(zzlg.zzb(zzksVar11.zza));
                                                    }
                                                    if (zzh4 != i139) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i41 = i50;
                                                    i42 = zzh4;
                                                    zzksVar8 = zzksVar11;
                                                    i38 = i51;
                                                    i8 = i64;
                                                    bArr2 = bArr7;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    if (i71 == 0) {
                                                        int i140 = zzkt.zza;
                                                        zzme zzmeVar4 = (zzme) zzmjVar14;
                                                        zzh3 = zzkt.zzh(bArr7, i39, zzksVar11);
                                                        zzmeVar4.zzh(zzlg.zzb(zzksVar11.zza));
                                                        while (zzh3 < i50) {
                                                            int zzh20 = zzkt.zzh(bArr7, zzh3, zzksVar11);
                                                            if (i51 == zzksVar11.zza) {
                                                                zzh3 = zzkt.zzh(bArr7, zzh20, zzksVar11);
                                                                zzmeVar4.zzh(zzlg.zzb(zzksVar11.zza));
                                                            } else {
                                                                i42 = zzh3;
                                                                i41 = i50;
                                                                zzksVar8 = zzksVar11;
                                                                i38 = i51;
                                                                i8 = i64;
                                                                bArr2 = bArr7;
                                                                if (i42 == i39) {
                                                                }
                                                            }
                                                        }
                                                        i42 = zzh3;
                                                        i41 = i50;
                                                        zzksVar8 = zzksVar11;
                                                        i38 = i51;
                                                        i8 = i64;
                                                        bArr2 = bArr7;
                                                        if (i42 == i39) {
                                                        }
                                                    }
                                                    i41 = i50;
                                                    zzksVar8 = zzksVar11;
                                                    i38 = i51;
                                                    i8 = i64;
                                                    bArr2 = bArr7;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                            case 34:
                                            case 48:
                                                bArr7 = bArr;
                                                i50 = i5;
                                                zzksVar11 = zzksVar;
                                                zzmj zzmjVar15 = zzmjVar2;
                                                i37 = i61;
                                                i51 = i62;
                                                i39 = i97;
                                                if (i71 == 2) {
                                                    int i141 = zzkt.zza;
                                                    zzmw zzmwVar5 = (zzmw) zzmjVar15;
                                                    zzh4 = zzkt.zzh(bArr7, i39, zzksVar11);
                                                    int i142 = zzksVar11.zza + zzh4;
                                                    while (zzh4 < i142) {
                                                        zzh4 = zzkt.zzk(bArr7, zzh4, zzksVar11);
                                                        zzmwVar5.zzg(zzlg.zzc(zzksVar11.zzb));
                                                        i98 = i98;
                                                        unsafe8 = unsafe8;
                                                    }
                                                    unsafe4 = unsafe8;
                                                    i40 = i98;
                                                    if (zzh4 != i142) {
                                                        throw new zzmm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    i41 = i50;
                                                    i42 = zzh4;
                                                    zzksVar8 = zzksVar11;
                                                    i38 = i51;
                                                    i8 = i64;
                                                    bArr2 = bArr7;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    unsafe4 = unsafe8;
                                                    i40 = i98;
                                                    if (i71 == 0) {
                                                        int i143 = zzkt.zza;
                                                        zzmw zzmwVar6 = (zzmw) zzmjVar15;
                                                        zzh3 = zzkt.zzk(bArr7, i39, zzksVar11);
                                                        zzmwVar6.zzg(zzlg.zzc(zzksVar11.zzb));
                                                        while (zzh3 < i50) {
                                                            int zzh21 = zzkt.zzh(bArr7, zzh3, zzksVar11);
                                                            if (i51 == zzksVar11.zza) {
                                                                zzh3 = zzkt.zzk(bArr7, zzh21, zzksVar11);
                                                                zzmwVar6.zzg(zzlg.zzc(zzksVar11.zzb));
                                                            } else {
                                                                i42 = zzh3;
                                                                i41 = i50;
                                                                zzksVar8 = zzksVar11;
                                                                i38 = i51;
                                                                i8 = i64;
                                                                bArr2 = bArr7;
                                                                if (i42 == i39) {
                                                                }
                                                            }
                                                        }
                                                        i42 = zzh3;
                                                        i41 = i50;
                                                        zzksVar8 = zzksVar11;
                                                        i38 = i51;
                                                        i8 = i64;
                                                        bArr2 = bArr7;
                                                        if (i42 == i39) {
                                                        }
                                                    }
                                                    i41 = i50;
                                                    zzksVar8 = zzksVar11;
                                                    i38 = i51;
                                                    i8 = i64;
                                                    bArr2 = bArr7;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                            default:
                                                if (i71 == 3) {
                                                    int i144 = (i62 & (-8)) | 4;
                                                    zzmj zzmjVar16 = zzmjVar2;
                                                    zzns zzv = zznkVar.zzv(i99);
                                                    byte[] bArr9 = bArr;
                                                    int zzc = zzkt.zzc(zzv, bArr9, i97, i5, i144, zzksVar);
                                                    zzmjVar16.add(zzksVar.zzc);
                                                    while (zzc < i5) {
                                                        int zzh22 = zzkt.zzh(bArr9, zzc, zzksVar);
                                                        zzns zznsVar = zzv;
                                                        if (i62 == zzksVar.zza) {
                                                            zzv = zznsVar;
                                                            zzc = zzkt.zzc(zzv, bArr9, zzh22, i5, i144, zzksVar);
                                                            zzmjVar16.add(zzksVar.zzc);
                                                            bArr9 = bArr9;
                                                            i61 = i61;
                                                        } else {
                                                            i37 = i61;
                                                            i39 = i97;
                                                            i38 = i62;
                                                            i42 = zzc;
                                                            unsafe4 = unsafe8;
                                                            i40 = i98;
                                                            i8 = i64;
                                                            bArr2 = bArr9;
                                                            i41 = i5;
                                                            zzksVar8 = zzksVar;
                                                            if (i42 == i39) {
                                                            }
                                                        }
                                                    }
                                                    i37 = i61;
                                                    i39 = i97;
                                                    i38 = i62;
                                                    i42 = zzc;
                                                    unsafe4 = unsafe8;
                                                    i40 = i98;
                                                    i8 = i64;
                                                    bArr2 = bArr9;
                                                    i41 = i5;
                                                    zzksVar8 = zzksVar;
                                                    if (i42 == i39) {
                                                    }
                                                } else {
                                                    i37 = i61;
                                                    bArr2 = bArr;
                                                    i8 = i64;
                                                    i38 = i62;
                                                    i39 = i97;
                                                    unsafe4 = unsafe8;
                                                    i40 = i98;
                                                    i41 = i5;
                                                    zzksVar8 = zzksVar;
                                                    i42 = i39;
                                                    if (i42 == i39) {
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                } else if (i71 == 2) {
                                    zzmj zzmjVar17 = (zzmj) unsafe7.getObject(obj17, j4);
                                    if (!zzmjVar17.zzc()) {
                                        int size3 = zzmjVar17.size();
                                        zzmjVar17 = zzmjVar17.zzd(size3 == 0 ? 10 : size3 + size3);
                                        unsafe7.putObject(obj17, j4, zzmjVar17);
                                    }
                                    bArr8 = bArr;
                                    i56 = i5;
                                    zzksVar13 = zzksVar;
                                    i59 = zzkt.zze(zznkVar.zzv(i99), i62, bArr8, i97, i5, zzmjVar17, zzksVar);
                                    obj5 = obj;
                                    unsafe5 = unsafe7;
                                    i63 = i98;
                                    i60 = i99;
                                    i58 = i14;
                                    i57 = 0;
                                } else {
                                    bArr2 = bArr;
                                    i33 = i61;
                                    i8 = i64;
                                    i34 = i62;
                                    i35 = i97;
                                    obj2 = obj17;
                                    i36 = i98;
                                    zzksVar7 = zzksVar;
                                }
                                unsafe = unsafe7;
                                i15 = i34;
                                zzksVar2 = zzksVar7;
                                i11 = i35;
                                i60 = i99;
                                i12 = i36;
                                i61 = i33;
                                i7 = i6;
                            }
                        }
                        if (i15 == i7 || i7 == 0) {
                            if (zznkVar.zzh) {
                                zzlp zzlpVar = zzksVar2.zzd;
                                int i145 = zzlp.zzb;
                                int i146 = zznp.zza;
                                if (zzlpVar != zzlp.zza) {
                                    zznh zznhVar = zznkVar.zzg;
                                    int i147 = zzkt.zza;
                                    if (zzlpVar.zzb(zznhVar, i12) != null) {
                                        throw null;
                                    }
                                    i56 = i5;
                                    zzg = zzkt.zzg(i15, bArr2, i11, i56, zzd(obj2), zzksVar);
                                    i62 = i15;
                                    i59 = zzg;
                                    bArr8 = bArr;
                                    zzksVar13 = zzksVar;
                                    unsafe5 = unsafe;
                                    i63 = i12;
                                    obj5 = obj2;
                                    i58 = i14;
                                    i57 = i13;
                                    i64 = i8;
                                }
                            }
                            i62 = i15;
                            i56 = i5;
                            zzg = zzkt.zzg(i62, bArr, i11, i56, zzd(obj2), zzksVar);
                            i59 = zzg;
                            bArr8 = bArr;
                            zzksVar13 = zzksVar;
                            unsafe5 = unsafe;
                            i63 = i12;
                            obj5 = obj2;
                            i58 = i14;
                            i57 = i13;
                            i64 = i8;
                        } else {
                            i56 = i5;
                            i9 = i15;
                            i59 = i11;
                            i10 = i16;
                        }
                    }
                    zzq = i58;
                    if (zzq != i58) {
                    }
                    if (i15 == i7) {
                    }
                    if (zznkVar.zzh) {
                    }
                    i62 = i15;
                    i56 = i5;
                    zzg = zzkt.zzg(i62, bArr, i11, i56, zzd(obj2), zzksVar);
                    i59 = zzg;
                    bArr8 = bArr;
                    zzksVar13 = zzksVar;
                    unsafe5 = unsafe;
                    i63 = i12;
                    obj5 = obj2;
                    i58 = i14;
                    i57 = i13;
                    i64 = i8;
                } else {
                    if (i69 >= zznkVar.zze && i69 <= zznkVar.zzf) {
                        zzq = zznkVar.zzq(i69, i57);
                        if (zzq != i58) {
                        }
                        if (i15 == i7) {
                        }
                        if (zznkVar.zzh) {
                        }
                        i62 = i15;
                        i56 = i5;
                        zzg = zzkt.zzg(i62, bArr, i11, i56, zzd(obj2), zzksVar);
                        i59 = zzg;
                        bArr8 = bArr;
                        zzksVar13 = zzksVar;
                        unsafe5 = unsafe;
                        i63 = i12;
                        obj5 = obj2;
                        i58 = i14;
                        i57 = i13;
                        i64 = i8;
                    }
                    zzq = i58;
                    if (zzq != i58) {
                    }
                    if (i15 == i7) {
                    }
                    if (zznkVar.zzh) {
                    }
                    i62 = i15;
                    i56 = i5;
                    zzg = zzkt.zzg(i62, bArr, i11, i56, zzd(obj2), zzksVar);
                    i59 = zzg;
                    bArr8 = bArr;
                    zzksVar13 = zzksVar;
                    unsafe5 = unsafe;
                    i63 = i12;
                    obj5 = obj2;
                    i58 = i14;
                    i57 = i13;
                    i64 = i8;
                }
            }
            i7 = i6;
            unsafe = unsafe5;
            i8 = i64;
            obj2 = obj5;
            i9 = i62;
            i10 = 1048575;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final Object zze() {
        return ((zzmd) this.zzg).zzcj();
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzmd) {
                zzmd zzmdVar = (zzmd) obj;
                zzmdVar.zzcu(Integer.MAX_VALUE);
                zzmdVar.zza = 0;
                zzmdVar.zzcs();
            }
            int[] iArr = this.zzc;
            for (int i4 = 0; i4 < iArr.length; i4 += 3) {
                int zzs = zzs(i4);
                int i5 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j4 = i5;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                ((zzmj) zzol.zzf(obj, j4)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zznb) object).zzc();
                                    unsafe.putObject(obj, j4, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, iArr[i4], i4)) {
                        zzv(i4).zzf(zzb.getObject(obj, j4));
                    }
                }
                if (zzI(obj, i4)) {
                    zzv(i4).zzf(zzb.getObject(obj, j4));
                }
            }
            this.zzl.zza(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                zznu.zzp(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznu.zzo(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzs = zzs(i4);
            int i5 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i6 = iArr[i4];
            long j4 = i5;
            switch (zzr) {
                case 0:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzo(obj, j4, zzol.zza(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzp(obj, j4, zzol.zzb(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzr(obj, j4, zzol.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzr(obj, j4, zzol.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzq(obj, j4, zzol.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzr(obj, j4, zzol.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzq(obj, j4, zzol.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzm(obj, j4, zzol.zzw(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzs(obj, j4, zzol.zzf(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i4);
                    break;
                case 10:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzs(obj, j4, zzol.zzf(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzq(obj, j4, zzol.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 12:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzq(obj, j4, zzol.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzq(obj, j4, zzol.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzr(obj, j4, zzol.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzq(obj, j4, zzol.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzol.zzr(obj, j4, zzol.zzd(obj2, j4));
                        zzD(obj, i4);
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
                    zzmj zzmjVar = (zzmj) zzol.zzf(obj, j4);
                    zzmj zzmjVar2 = (zzmj) zzol.zzf(obj2, j4);
                    int size = zzmjVar.size();
                    int size2 = zzmjVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmjVar.zzc()) {
                            zzmjVar = zzmjVar.zzd(size2 + size);
                        }
                        zzmjVar.addAll(zzmjVar2);
                    }
                    if (size > 0) {
                        zzmjVar2 = zzmjVar;
                    }
                    zzol.zzs(obj, j4, zzmjVar2);
                    break;
                case 50:
                    int i7 = zznu.zza;
                    zzol.zzs(obj, j4, zznc.zza(zzol.zzf(obj, j4), zzol.zzf(obj2, j4)));
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
                    if (!zzM(obj2, i6, i4)) {
                        break;
                    } else {
                        zzol.zzs(obj, j4, zzol.zzf(obj2, j4));
                        zzE(obj, i6, i4);
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
                    if (!zzM(obj2, i6, i4)) {
                        break;
                    } else {
                        zzol.zzs(obj, j4, zzol.zzf(obj2, j4));
                        zzE(obj, i6, i4);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i4);
                    break;
            }
            i4 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final void zzh(Object obj, byte[] bArr, int i4, int i5, zzks zzksVar) {
        zzc(obj, bArr, i4, i5, 0, zzksVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:251:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.measurement.zzns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzor zzorVar) {
        Map.Entry entry;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        zznk<T> zznkVar = this;
        if (zznkVar.zzh) {
            zzlu zzluVar = ((zzma) obj).zzb;
            if (!zzluVar.zza.isEmpty()) {
                entry = (Map.Entry) zzluVar.zze().next();
                iArr = zznkVar.zzc;
                Unsafe unsafe = zzb;
                int i7 = 1048575;
                int i8 = 1048575;
                i4 = 0;
                int i9 = 0;
                while (i4 < iArr.length) {
                    int zzs = zznkVar.zzs(i4);
                    int zzr = zzr(zzs);
                    int i10 = iArr[i4];
                    if (zzr <= 17) {
                        int i11 = iArr[i4 + 2];
                        int i12 = i11 & i7;
                        if (i12 != i8) {
                            i9 = i12 == i7 ? 0 : unsafe.getInt(obj, i12);
                            i8 = i12;
                        }
                        int i13 = 1 << (i11 >>> 20);
                        i5 = zzs;
                        i6 = i13;
                    } else {
                        i5 = zzs;
                        i6 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j4 = i5 & i7;
                    switch (zzr) {
                        case 0:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzf(i10, zzol.zza(obj, j4));
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 1:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzo(i10, zzol.zzb(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 2:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzt(i10, unsafe.getLong(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 3:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzK(i10, unsafe.getLong(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 4:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzr(i10, unsafe.getInt(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 5:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzm(i10, unsafe.getLong(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 6:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzk(i10, unsafe.getInt(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 7:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzb(i10, zzol.zzw(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 8:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzO(i10, unsafe.getObject(obj, j4), zzorVar);
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 9:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzv(i10, unsafe.getObject(obj, j4), zznkVar.zzv(i4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 10:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzd(i10, (zzld) unsafe.getObject(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 11:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzI(i10, unsafe.getInt(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 12:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzi(i10, unsafe.getInt(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 13:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzx(i10, unsafe.getInt(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 14:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzz(i10, unsafe.getLong(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 15:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzB(i10, unsafe.getInt(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 16:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzD(i10, unsafe.getLong(obj, j4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 17:
                            if (zznkVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzorVar.zzq(i10, unsafe.getObject(obj, j4), zznkVar.zzv(i4));
                            } else {
                                continue;
                            }
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 18:
                            zznu.zzr(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 19:
                            zznu.zzv(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 20:
                            zznu.zzx(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 21:
                            zznu.zzD(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 22:
                            zznu.zzw(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zznu.zzu(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 24:
                            zznu.zzt(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 25:
                            zznu.zzq(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 26:
                            int i14 = iArr[i4];
                            List list = (List) unsafe.getObject(obj, j4);
                            int i15 = zznu.zza;
                            if (list != null && !list.isEmpty()) {
                                zzorVar.zzH(i14, list);
                                break;
                            }
                            break;
                        case 27:
                            int i16 = iArr[i4];
                            List list2 = (List) unsafe.getObject(obj, j4);
                            zzns zzv = zznkVar.zzv(i4);
                            int i17 = zznu.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i18 = 0; i18 < list2.size(); i18++) {
                                    ((zzll) zzorVar).zzv(i16, list2.get(i18), zzv);
                                }
                                break;
                            }
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            int i19 = iArr[i4];
                            List list3 = (List) unsafe.getObject(obj, j4);
                            int i20 = zznu.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzorVar.zze(i19, list3);
                                break;
                            }
                            break;
                        case 29:
                            zznu.zzC(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            zznu.zzs(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            zznu.zzy(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 32:
                            zznu.zzz(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 33:
                            zznu.zzA(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case 34:
                            zznu.zzB(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, false);
                            continue;
                            i4 += 3;
                            i7 = 1048575;
                            zznkVar = this;
                        case C3139z9.f40333J /* 35 */:
                            zznu.zzr(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 36:
                            zznu.zzv(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 37:
                            zznu.zzx(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case C3139z9.f40334K /* 38 */:
                            zznu.zzD(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 39:
                            zznu.zzw(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 40:
                            zznu.zzu(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 41:
                            zznu.zzt(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 42:
                            zznu.zzq(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 43:
                            zznu.zzC(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                            zznu.zzs(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                            zznu.zzy(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 46:
                            zznu.zzz(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 47:
                            zznu.zzA(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 48:
                            zznu.zzB(iArr[i4], (List) unsafe.getObject(obj, j4), zzorVar, true);
                            break;
                        case 49:
                            int i21 = iArr[i4];
                            List list4 = (List) unsafe.getObject(obj, j4);
                            zzns zzv2 = zznkVar.zzv(i4);
                            int i22 = zznu.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                    ((zzll) zzorVar).zzq(i21, list4.get(i23), zzv2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j4) != null) {
                                throw null;
                            }
                            break;
                        case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzf(i10, zzm(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.SET_USER_ID /* 52 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzo(i10, zzn(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzt(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzK(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzr(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzm(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzk(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case 58:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzb(i10, zzN(obj, j4));
                                break;
                            }
                            break;
                        case 59:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzO(i10, unsafe.getObject(obj, j4), zzorVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzv(i10, unsafe.getObject(obj, j4), zznkVar.zzv(i4));
                                break;
                            }
                            break;
                        case 61:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzd(i10, (zzld) unsafe.getObject(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.RETRY_LIMIT /* 62 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzI(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case 63:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzi(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzx(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzz(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case 66:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzB(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case 67:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzD(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case 68:
                            if (zznkVar.zzM(obj, i10, i4)) {
                                zzorVar.zzq(i10, unsafe.getObject(obj, j4), zznkVar.zzv(i4));
                                break;
                            }
                            break;
                    }
                    i4 += 3;
                    i7 = 1048575;
                    zznkVar = this;
                }
                if (entry != null) {
                    ((zzmd) obj).zzc.zzl(zzorVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zznkVar.zzc;
        Unsafe unsafe2 = zzb;
        int i72 = 1048575;
        int i82 = 1048575;
        i4 = 0;
        int i92 = 0;
        while (i4 < iArr.length) {
        }
        if (entry != null) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzE;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzs = zzs(i4);
            long j4 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i4) && Double.doubleToLongBits(zzol.zza(obj, j4)) == Double.doubleToLongBits(zzol.zza(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i4) && Float.floatToIntBits(zzol.zzb(obj, j4)) == Float.floatToIntBits(zzol.zzb(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i4) && zzol.zzd(obj, j4) == zzol.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i4) && zzol.zzd(obj, j4) == zzol.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i4) && zzol.zzc(obj, j4) == zzol.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i4) && zzol.zzd(obj, j4) == zzol.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i4) && zzol.zzc(obj, j4) == zzol.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i4) && zzol.zzw(obj, j4) == zzol.zzw(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i4) && zznu.zzE(zzol.zzf(obj, j4), zzol.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i4) && zznu.zzE(zzol.zzf(obj, j4), zzol.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i4) && zznu.zzE(zzol.zzf(obj, j4), zzol.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i4) && zzol.zzc(obj, j4) == zzol.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i4) && zzol.zzc(obj, j4) == zzol.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i4) && zzol.zzc(obj, j4) == zzol.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i4) && zzol.zzd(obj, j4) == zzol.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i4) && zzol.zzc(obj, j4) == zzol.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i4) && zzol.zzd(obj, j4) == zzol.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i4) && zznu.zzE(zzol.zzf(obj, j4), zzol.zzf(obj2, j4))) {
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
                    zzE = zznu.zzE(zzol.zzf(obj, j4), zzol.zzf(obj2, j4));
                    break;
                case 50:
                    zzE = zznu.zzE(zzol.zzf(obj, j4), zzol.zzf(obj2, j4));
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
                    long zzp = zzp(i4) & 1048575;
                    if (zzol.zzc(obj, zzp) == zzol.zzc(obj2, zzp) && zznu.zzE(zzol.zzf(obj, j4), zzol.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzE) {
                return false;
            }
        }
        if (!((zzmd) obj).zzc.equals(((zzmd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzma) obj).zzb.equals(((zzma) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzns
    public final boolean zzk(Object obj) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i8 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i10 = iArr[i8];
            int i11 = iArr2[i10];
            int zzs = zzs(i10);
            int i12 = iArr2[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i9) {
                if (i13 != 1048575) {
                    i7 = zzb.getInt(obj, i13);
                }
                i5 = i10;
                i6 = i7;
                i4 = i13;
            } else {
                int i15 = i7;
                i4 = i9;
                i5 = i10;
                i6 = i15;
            }
            if ((268435456 & zzs) != 0 && !zzJ(obj, i5, i4, i6, i14)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i11, i5) && !zzK(obj, zzs, zzv(i5))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zznb) zzol.zzf(obj, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzol.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzns zzv = zzv(i5);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        if (!zzv.zzk(list.get(i16))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i5, i4, i6, i14) && !zzK(obj, zzs, zzv(i5))) {
                return false;
            }
            i8++;
            i9 = i4;
            i7 = i6;
        }
        return !this.zzh || ((zzma) obj).zzb.zzh();
    }
}
