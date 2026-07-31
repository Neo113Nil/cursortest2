package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.impl.C3139z9;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzhe<T> implements zzhl<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzii.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhb zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzib zzl;
    private final zzfi zzm;

    private zzhe(int[] iArr, Object[] objArr, int i4, int i5, zzhb zzhbVar, boolean z4, int[] iArr2, int i6, int i7, zzhg zzhgVar, zzgk zzgkVar, zzib zzibVar, zzfi zzfiVar, zzgw zzgwVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i4;
        this.zzf = i5;
        boolean z5 = false;
        if (zzfiVar != null && (zzhbVar instanceof zzfr)) {
            z5 = true;
        }
        this.zzh = z5;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i7;
        this.zzl = zzibVar;
        this.zzm = zzfiVar;
        this.zzg = zzhbVar;
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
            zzhl zzv = zzv(i4);
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
            zzhl zzv = zzv(i4);
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
        zzii.zzq(obj, j4, (1 << (zzp >>> 20)) | zzii.zzc(obj, j4));
    }

    private final void zzE(Object obj, int i4, int i5) {
        zzii.zzq(obj, zzp(i5) & 1048575, i4);
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
            return (zzii.zzc(obj, j4) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i4);
        long j5 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzii.zza(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzii.zzb(obj, j5)) != 0;
            case 2:
                return zzii.zzd(obj, j5) != 0;
            case 3:
                return zzii.zzd(obj, j5) != 0;
            case 4:
                return zzii.zzc(obj, j5) != 0;
            case 5:
                return zzii.zzd(obj, j5) != 0;
            case 6:
                return zzii.zzc(obj, j5) != 0;
            case 7:
                return zzii.zzw(obj, j5);
            case 8:
                Object zzf = zzii.zzf(obj, j5);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzev) {
                    return !zzev.zza.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzii.zzf(obj, j5) != null;
            case 10:
                return !zzev.zza.equals(zzii.zzf(obj, j5));
            case 11:
                return zzii.zzc(obj, j5) != 0;
            case 12:
                return zzii.zzc(obj, j5) != 0;
            case 13:
                return zzii.zzc(obj, j5) != 0;
            case 14:
                return zzii.zzd(obj, j5) != 0;
            case 15:
                return zzii.zzc(obj, j5) != 0;
            case 16:
                return zzii.zzd(obj, j5) != 0;
            case 17:
                return zzii.zzf(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? zzI(obj, i4) : (i6 & i7) != 0;
    }

    private static boolean zzK(Object obj, int i4, zzhl zzhlVar) {
        return zzhlVar.zzk(zzii.zzf(obj, i4 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzfu) {
            return ((zzfu) obj).zzF();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i4, int i5) {
        return zzii.zzc(obj, (long) (zzp(i5) & 1048575)) == i4;
    }

    private static boolean zzN(Object obj, long j4) {
        return ((Boolean) zzii.zzf(obj, j4)).booleanValue();
    }

    private static final int zzO(byte[] bArr, int i4, int i5, zzir zzirVar, Class cls, zzej zzejVar) {
        zzir zzirVar2 = zzir.zza;
        switch (zzirVar.ordinal()) {
            case 0:
                int i6 = i4 + 8;
                zzejVar.zzc = Double.valueOf(Double.longBitsToDouble(zzek.zzp(bArr, i4)));
                return i6;
            case 1:
                int i7 = i4 + 4;
                zzejVar.zzc = Float.valueOf(Float.intBitsToFloat(zzek.zzb(bArr, i4)));
                return i7;
            case 2:
            case 3:
                int zzl = zzek.zzl(bArr, i4, zzejVar);
                zzejVar.zzc = Long.valueOf(zzejVar.zzb);
                return zzl;
            case 4:
            case 12:
            case 13:
                int zzi = zzek.zzi(bArr, i4, zzejVar);
                zzejVar.zzc = Integer.valueOf(zzejVar.zza);
                return zzi;
            case 5:
            case 15:
                int i8 = i4 + 8;
                zzejVar.zzc = Long.valueOf(zzek.zzp(bArr, i4));
                return i8;
            case 6:
            case 14:
                int i9 = i4 + 4;
                zzejVar.zzc = Integer.valueOf(zzek.zzb(bArr, i4));
                return i9;
            case 7:
                int zzl2 = zzek.zzl(bArr, i4, zzejVar);
                zzejVar.zzc = Boolean.valueOf(zzejVar.zzb != 0);
                return zzl2;
            case 8:
                return zzek.zzg(bArr, i4, zzejVar);
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                return zzek.zzd(zzhi.zza().zzb(cls), bArr, i4, i5, zzejVar);
            case 11:
                return zzek.zza(bArr, i4, zzejVar);
            case 16:
                int zzi2 = zzek.zzi(bArr, i4, zzejVar);
                zzejVar.zzc = Integer.valueOf(zzey.zzb(zzejVar.zza));
                return zzi2;
            case 17:
                int zzl3 = zzek.zzl(bArr, i4, zzejVar);
                zzejVar.zzc = Long.valueOf(zzey.zzc(zzejVar.zzb));
                return zzl3;
        }
    }

    private static final void zzP(int i4, Object obj, zzit zzitVar) {
        if (obj instanceof String) {
            zzitVar.zzH(i4, (String) obj);
        } else {
            zzitVar.zzd(i4, (zzev) obj);
        }
    }

    static zzic zzd(Object obj) {
        zzfu zzfuVar = (zzfu) obj;
        zzic zzicVar = zzfuVar.zzc;
        if (zzicVar != zzic.zzc()) {
            return zzicVar;
        }
        zzic zzf = zzic.zzf();
        zzfuVar.zzc = zzf;
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
    static zzhe zzl(Class cls, zzgy zzgyVar, zzhg zzhgVar, zzgk zzgkVar, zzib zzibVar, zzfi zzfiVar, zzgw zzgwVar) {
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
        if (!(zzgyVar instanceof zzhk)) {
            throw null;
        }
        zzhk zzhkVar = (zzhk) zzgyVar;
        String zzd = zzhkVar.zzd();
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
        Object[] zze = zzhkVar.zze();
        Class<?> cls2 = zzhkVar.zza().getClass();
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
            zzhk zzhkVar2 = zzhkVar;
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
                        if (zzhkVar2.zzc() == 1 || i82 != 0) {
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
                        if (zzhkVar2.zzc() == 1 || i82 != 0) {
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
            zzhkVar = zzhkVar2;
            length = i21;
            i10 = i22;
        }
        return new zzhe(iArr3, objArr, i5, i7, zzhkVar.zza(), false, iArr, i8, i67, zzhgVar, zzgkVar, zzibVar, zzfiVar, zzgwVar);
    }

    private static double zzm(Object obj, long j4) {
        return ((Double) zzii.zzf(obj, j4)).doubleValue();
    }

    private static float zzn(Object obj, long j4) {
        return ((Float) zzii.zzf(obj, j4)).floatValue();
    }

    private static int zzo(Object obj, long j4) {
        return ((Integer) zzii.zzf(obj, j4)).intValue();
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
        return ((Long) zzii.zzf(obj, j4)).longValue();
    }

    private final zzfx zzu(int i4) {
        int i5 = i4 / 3;
        return (zzfx) this.zzd[i5 + i5 + 1];
    }

    private final zzhl zzv(int i4) {
        Object[] objArr = this.zzd;
        int i5 = i4 / 3;
        int i6 = i5 + i5;
        zzhl zzhlVar = (zzhl) objArr[i6];
        if (zzhlVar != null) {
            return zzhlVar;
        }
        zzhl zzb2 = zzhi.zza().zzb((Class) objArr[i6 + 1]);
        objArr[i6] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i4) {
        int i5 = i4 / 3;
        return this.zzd[i5 + i5];
    }

    private final Object zzx(Object obj, int i4) {
        zzhl zzv = zzv(i4);
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
        zzhl zzv = zzv(i5);
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
        } catch (NoSuchFieldException e4) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final int zza(Object obj) {
        int i4;
        int i5;
        int zzy;
        int zzy2;
        int zzz;
        int zzy3;
        int zzy4;
        int zzy5;
        int zzb2;
        int zzy6;
        int zzi;
        int zzh;
        int size;
        int zzm;
        int zzy7;
        int zzb3;
        int zzy8;
        int zzb4;
        int zzy9;
        int zzy10;
        int zzi2;
        int zzy11;
        int zzy12;
        int zzf;
        int zzy13;
        int zzy14;
        int i6;
        int i7;
        int zzy15;
        int zzy16;
        int zzy17;
        int zzz2;
        int zzy18;
        int zzy19;
        int zzb5;
        int zzy20;
        zzhe<T> zzheVar = this;
        Object obj2 = obj;
        int i8 = 1;
        Unsafe unsafe = zzb;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            int[] iArr = zzheVar.zzc;
            if (i9 >= iArr.length) {
                int zza2 = i11 + ((zzfu) obj).zzc.zza();
                if (!zzheVar.zzh) {
                    return zza2;
                }
                zzht zzhtVar = ((zzfr) obj).zzb.zza;
                int zzc = zzhtVar.zzc();
                int i13 = 0;
                for (int i14 = 0; i14 < zzc; i14++) {
                    Map.Entry zzg = zzhtVar.zzg(i14);
                    i13 += zzfm.zzc((zzfl) ((zzhp) zzg).zza(), zzg.getValue());
                }
                for (Map.Entry entry : zzhtVar.zzd()) {
                    i13 += zzfm.zzc((zzfl) entry.getKey(), entry.getValue());
                }
                return zza2 + i13;
            }
            int zzs = zzheVar.zzs(i9);
            int zzr = zzr(zzs);
            int i15 = iArr[i9];
            int i16 = iArr[i9 + 2];
            int i17 = i16 & 1048575;
            if (zzr <= 17) {
                if (i17 != i12) {
                    i10 = i17 == 1048575 ? 0 : unsafe.getInt(obj2, i17);
                    i12 = i17;
                }
                i4 = i8 << (i16 >>> 20);
            } else {
                i4 = 0;
            }
            int i18 = zzs & 1048575;
            if (zzr >= zzfn.zzJ.zza()) {
                zzfn.zzW.zza();
            }
            long j4 = i18;
            switch (zzr) {
                case 0:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        i11 += zzfc.zzy(i15 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzy = zzfc.zzy(i15 << 3);
                        zzy4 = zzy + 4;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 2:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        long j5 = unsafe.getLong(obj2, j4);
                        zzy2 = zzfc.zzy(i15 << 3);
                        zzz = zzfc.zzz(j5);
                        zzy4 = zzy2 + zzz;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 3:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        long j6 = unsafe.getLong(obj2, j4);
                        zzy2 = zzfc.zzy(i15 << 3);
                        zzz = zzfc.zzz(j6);
                        zzy4 = zzy2 + zzz;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 4:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        long j7 = unsafe.getInt(obj2, j4);
                        zzy2 = zzfc.zzy(i15 << 3);
                        zzz = zzfc.zzz(j7);
                        zzy4 = zzy2 + zzz;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 5:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzy3 = zzfc.zzy(i15 << 3);
                        zzy4 = zzy3 + 8;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 6:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzy = zzfc.zzy(i15 << 3);
                        zzy4 = zzy + 4;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 7:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzy4 = zzfc.zzy(i15 << 3) + 1;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 8:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        int i19 = i15 << 3;
                        Object object = unsafe.getObject(obj2, j4);
                        if (object instanceof zzev) {
                            zzy5 = zzfc.zzy(i19);
                            zzb2 = ((zzev) object).zze();
                            zzy6 = zzfc.zzy(zzb2);
                        } else {
                            zzy5 = zzfc.zzy(i19);
                            zzb2 = zzin.zzb((String) object);
                            zzy6 = zzfc.zzy(zzb2);
                        }
                        zzy4 = zzy5 + zzy6 + zzb2;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 9:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzi = zzhn.zzi(i15, unsafe.getObject(obj2, j4), zzheVar.zzv(i9));
                        i11 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzev zzevVar = (zzev) unsafe.getObject(obj2, j4);
                        zzy5 = zzfc.zzy(i15 << 3);
                        zzb2 = zzevVar.zze();
                        zzy6 = zzfc.zzy(zzb2);
                        zzy4 = zzy5 + zzy6 + zzb2;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 11:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        int i20 = unsafe.getInt(obj2, j4);
                        zzy2 = zzfc.zzy(i15 << 3);
                        zzz = zzfc.zzy(i20);
                        zzy4 = zzy2 + zzz;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 12:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        long j8 = unsafe.getInt(obj2, j4);
                        zzy2 = zzfc.zzy(i15 << 3);
                        zzz = zzfc.zzz(j8);
                        zzy4 = zzy2 + zzz;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 13:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzy = zzfc.zzy(i15 << 3);
                        zzy4 = zzy + 4;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 14:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzy3 = zzfc.zzy(i15 << 3);
                        zzy4 = zzy3 + 8;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 15:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        int i21 = unsafe.getInt(obj2, j4);
                        zzy2 = zzfc.zzy(i15 << 3);
                        zzz = zzfc.zzy((i21 >> 31) ^ (i21 + i21));
                        zzy4 = zzy2 + zzz;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 16:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        long j9 = unsafe.getLong(obj2, j4);
                        zzy2 = zzfc.zzy(i15 << 3);
                        zzz = zzfc.zzz((j9 >> 63) ^ (j9 + j9));
                        zzy4 = zzy2 + zzz;
                        i11 += zzy4;
                    }
                    zzheVar = this;
                    break;
                case 17:
                    i5 = i8;
                    if (zzheVar.zzJ(obj2, i9, i12, i10, i4)) {
                        zzi = zzhn.zza(i15, (zzhb) unsafe.getObject(obj2, j4), zzheVar.zzv(i9));
                        i11 += zzi;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i5 = i8;
                    zzi = zzhn.zze(i15, (List) unsafe.getObject(obj2, j4), false);
                    i11 += zzi;
                    break;
                case 19:
                    i5 = i8;
                    zzi = zzhn.zzc(i15, (List) unsafe.getObject(obj2, j4), false);
                    i11 += zzi;
                    break;
                case 20:
                    i5 = i8;
                    List list = (List) unsafe.getObject(obj2, j4);
                    int i22 = zzhn.zza;
                    if (list.size() != 0) {
                        zzh = zzhn.zzh(list) + (list.size() * zzfc.zzy(i15 << 3));
                        i11 += zzh;
                        break;
                    }
                    zzh = 0;
                    i11 += zzh;
                case 21:
                    i5 = i8;
                    List list2 = (List) unsafe.getObject(obj2, j4);
                    int i23 = zzhn.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzm = zzhn.zzm(list2);
                        zzy7 = zzfc.zzy(i15 << 3);
                        zzi = zzm + (size * zzy7);
                        i11 += zzi;
                        break;
                    }
                    zzi = 0;
                    i11 += zzi;
                case 22:
                    i5 = i8;
                    List list3 = (List) unsafe.getObject(obj2, j4);
                    int i24 = zzhn.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzm = zzhn.zzg(list3);
                        zzy7 = zzfc.zzy(i15 << 3);
                        zzi = zzm + (size * zzy7);
                        i11 += zzi;
                        break;
                    }
                    zzi = 0;
                    i11 += zzi;
                case ConnectionResult.API_DISABLED /* 23 */:
                    i5 = i8;
                    zzi = zzhn.zze(i15, (List) unsafe.getObject(obj2, j4), false);
                    i11 += zzi;
                    break;
                case 24:
                    i5 = i8;
                    zzi = zzhn.zzc(i15, (List) unsafe.getObject(obj2, j4), false);
                    i11 += zzi;
                    break;
                case 25:
                    i5 = i8;
                    List list4 = (List) unsafe.getObject(obj2, j4);
                    int i25 = zzhn.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzi = size2 * (zzfc.zzy(i15 << 3) + 1);
                        i11 += zzi;
                        break;
                    }
                    zzi = 0;
                    i11 += zzi;
                case 26:
                    i5 = i8;
                    List list5 = (List) unsafe.getObject(obj2, j4);
                    int i26 = zzhn.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzh = zzfc.zzy(i15 << 3) * size3;
                        if (list5 instanceof zzgj) {
                            zzgj zzgjVar = (zzgj) list5;
                            for (int i27 = 0; i27 < size3; i27++) {
                                Object zza3 = zzgjVar.zza();
                                if (zza3 instanceof zzev) {
                                    zzb4 = ((zzev) zza3).zze();
                                    zzy9 = zzfc.zzy(zzb4);
                                } else {
                                    zzb4 = zzin.zzb((String) zza3);
                                    zzy9 = zzfc.zzy(zzb4);
                                }
                                zzh += zzy9 + zzb4;
                            }
                        } else {
                            for (int i28 = 0; i28 < size3; i28++) {
                                Object obj3 = list5.get(i28);
                                if (obj3 instanceof zzev) {
                                    zzb3 = ((zzev) obj3).zze();
                                    zzy8 = zzfc.zzy(zzb3);
                                } else {
                                    zzb3 = zzin.zzb((String) obj3);
                                    zzy8 = zzfc.zzy(zzb3);
                                }
                                zzh += zzy8 + zzb3;
                            }
                        }
                        i11 += zzh;
                        break;
                    }
                    zzh = 0;
                    i11 += zzh;
                case 27:
                    i5 = i8;
                    List list6 = (List) unsafe.getObject(obj2, j4);
                    zzhl zzv = zzheVar.zzv(i9);
                    int i29 = zzhn.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzy10 = 0;
                    } else {
                        zzy10 = zzfc.zzy(i15 << 3) * size4;
                        for (int i30 = 0; i30 < size4; i30++) {
                            Object obj4 = list6.get(i30);
                            if (obj4 instanceof zzgi) {
                                zzi2 = ((zzgi) obj4).zza();
                                zzy11 = zzfc.zzy(zzi2);
                            } else {
                                zzi2 = ((zzeg) obj4).zzi(zzv);
                                zzy11 = zzfc.zzy(zzi2);
                            }
                            zzy10 += zzy11 + zzi2;
                        }
                    }
                    i11 += zzy10;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i5 = i8;
                    List list7 = (List) unsafe.getObject(obj2, j4);
                    int i31 = zzhn.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzy12 = 0;
                    } else {
                        zzy12 = size5 * zzfc.zzy(i15 << 3);
                        for (int i32 = 0; i32 < list7.size(); i32++) {
                            int zze = ((zzev) list7.get(i32)).zze();
                            zzy12 += zzfc.zzy(zze) + zze;
                        }
                    }
                    i11 += zzy12;
                    break;
                case 29:
                    i5 = i8;
                    List list8 = (List) unsafe.getObject(obj2, j4);
                    int i33 = zzhn.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzm = zzhn.zzl(list8);
                        zzy7 = zzfc.zzy(i15 << 3);
                        zzi = zzm + (size * zzy7);
                        i11 += zzi;
                        break;
                    }
                    zzi = 0;
                    i11 += zzi;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    i5 = i8;
                    List list9 = (List) unsafe.getObject(obj2, j4);
                    int i34 = zzhn.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzm = zzhn.zzb(list9);
                        zzy7 = zzfc.zzy(i15 << 3);
                        zzi = zzm + (size * zzy7);
                        i11 += zzi;
                        break;
                    }
                    zzi = 0;
                    i11 += zzi;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    i5 = i8;
                    zzi = zzhn.zzc(i15, (List) unsafe.getObject(obj2, j4), false);
                    i11 += zzi;
                    break;
                case 32:
                    i5 = i8;
                    zzi = zzhn.zze(i15, (List) unsafe.getObject(obj2, j4), false);
                    i11 += zzi;
                    break;
                case 33:
                    i5 = i8;
                    List list10 = (List) unsafe.getObject(obj2, j4);
                    int i35 = zzhn.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzm = zzhn.zzj(list10);
                        zzy7 = zzfc.zzy(i15 << 3);
                        zzi = zzm + (size * zzy7);
                        i11 += zzi;
                        break;
                    }
                    zzi = 0;
                    i11 += zzi;
                case 34:
                    i5 = i8;
                    List list11 = (List) unsafe.getObject(obj2, j4);
                    int i36 = zzhn.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzm = zzhn.zzk(list11);
                        zzy7 = zzfc.zzy(i15 << 3);
                        zzi = zzm + (size * zzy7);
                        i11 += zzi;
                        break;
                    }
                    zzi = 0;
                    i11 += zzi;
                case C3139z9.f40333J /* 35 */:
                    i5 = i8;
                    zzf = zzhn.zzf((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    i5 = i8;
                    zzf = zzhn.zzd((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    i5 = i8;
                    zzf = zzhn.zzh((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case C3139z9.f40334K /* 38 */:
                    i5 = i8;
                    zzf = zzhn.zzm((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    i5 = i8;
                    zzf = zzhn.zzg((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    i5 = i8;
                    zzf = zzhn.zzf((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    i5 = i8;
                    zzf = zzhn.zzd((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    i5 = i8;
                    List list12 = (List) unsafe.getObject(obj2, j4);
                    int i37 = zzhn.zza;
                    zzf = list12.size();
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    i5 = i8;
                    zzf = zzhn.zzl((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                    i5 = i8;
                    zzf = zzhn.zzb((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                    i5 = i8;
                    zzf = zzhn.zzd((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    i5 = i8;
                    zzf = zzhn.zzf((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    i5 = i8;
                    zzf = zzhn.zzj((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    i5 = i8;
                    zzf = zzhn.zzk((List) unsafe.getObject(obj2, j4));
                    if (zzf > 0) {
                        zzy13 = zzfc.zzy(i15 << 3);
                        zzy14 = zzfc.zzy(zzf);
                        zzy12 = zzy13 + zzy14 + zzf;
                        i11 += zzy12;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j4);
                    zzhl zzv2 = zzheVar.zzv(i9);
                    int i38 = zzhn.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i6 = 0;
                    } else {
                        int i39 = 0;
                        i6 = 0;
                        while (i39 < size6) {
                            i6 += zzhn.zza(i15, (zzhb) list13.get(i39), zzv2);
                            i39++;
                            i8 = i8;
                        }
                    }
                    i5 = i8;
                    i11 += i6;
                    break;
                case 50:
                    zzgv zzgvVar = (zzgv) unsafe.getObject(obj2, j4);
                    zzgu zzguVar = (zzgu) zzheVar.zzw(i9);
                    if (zzgvVar.isEmpty()) {
                        i7 = 0;
                    } else {
                        i7 = 0;
                        for (Map.Entry entry2 : zzgvVar.entrySet()) {
                            i7 += zzguVar.zza(i15, entry2.getKey(), entry2.getValue());
                        }
                    }
                    i11 += i7;
                    i5 = i8;
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy15 = zzfc.zzy(i15 << 3);
                        zzy18 = zzy15 + 8;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy16 = zzfc.zzy(i15 << 3);
                        zzy18 = zzy16 + 4;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        long zzt = zzt(obj2, j4);
                        zzy17 = zzfc.zzy(i15 << 3);
                        zzz2 = zzfc.zzz(zzt);
                        zzy18 = zzy17 + zzz2;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        long zzt2 = zzt(obj2, j4);
                        zzy17 = zzfc.zzy(i15 << 3);
                        zzz2 = zzfc.zzz(zzt2);
                        zzy18 = zzy17 + zzz2;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        long zzo = zzo(obj2, j4);
                        zzy17 = zzfc.zzy(i15 << 3);
                        zzz2 = zzfc.zzz(zzo);
                        zzy18 = zzy17 + zzz2;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy15 = zzfc.zzy(i15 << 3);
                        zzy18 = zzy15 + 8;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy16 = zzfc.zzy(i15 << 3);
                        zzy18 = zzy16 + 4;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case 58:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy18 = zzfc.zzy(i15 << 3) + i8;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case 59:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        int i40 = i15 << 3;
                        Object object2 = unsafe.getObject(obj2, j4);
                        if (object2 instanceof zzev) {
                            zzy19 = zzfc.zzy(i40);
                            zzb5 = ((zzev) object2).zze();
                            zzy20 = zzfc.zzy(zzb5);
                        } else {
                            zzy19 = zzfc.zzy(i40);
                            zzb5 = zzin.zzb((String) object2);
                            zzy20 = zzfc.zzy(zzb5);
                        }
                        zzy18 = zzy19 + zzy20 + zzb5;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case 60:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy18 = zzhn.zzi(i15, unsafe.getObject(obj2, j4), zzheVar.zzv(i9));
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case 61:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzev zzevVar2 = (zzev) unsafe.getObject(obj2, j4);
                        zzy19 = zzfc.zzy(i15 << 3);
                        zzb5 = zzevVar2.zze();
                        zzy20 = zzfc.zzy(zzb5);
                        zzy18 = zzy19 + zzy20 + zzb5;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        int zzo2 = zzo(obj2, j4);
                        zzy17 = zzfc.zzy(i15 << 3);
                        zzz2 = zzfc.zzy(zzo2);
                        zzy18 = zzy17 + zzz2;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case 63:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        long zzo3 = zzo(obj2, j4);
                        zzy17 = zzfc.zzy(i15 << 3);
                        zzz2 = zzfc.zzz(zzo3);
                        zzy18 = zzy17 + zzz2;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy16 = zzfc.zzy(i15 << 3);
                        zzy18 = zzy16 + 4;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy15 = zzfc.zzy(i15 << 3);
                        zzy18 = zzy15 + 8;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case 66:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        int zzo4 = zzo(obj2, j4);
                        zzy17 = zzfc.zzy(i15 << 3);
                        zzz2 = zzfc.zzy((zzo4 >> 31) ^ (zzo4 + zzo4));
                        zzy18 = zzy17 + zzz2;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case 67:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        long zzt3 = zzt(obj2, j4);
                        zzy17 = zzfc.zzy(i15 << 3);
                        zzz2 = zzfc.zzz((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzy18 = zzy17 + zzz2;
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                case 68:
                    if (zzheVar.zzM(obj2, i15, i9)) {
                        zzy18 = zzhn.zza(i15, (zzhb) unsafe.getObject(obj2, j4), zzheVar.zzv(i9));
                        i11 += zzy18;
                    }
                    i5 = i8;
                    break;
                default:
                    i5 = i8;
                    break;
            }
            i9 += 3;
            obj2 = obj;
            i8 = i5;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
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
                int hashCode = (i7 * 53) + ((zzfu) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzfr) obj).zzb.zza.hashCode() : hashCode;
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
                    doubleToLongBits = Double.doubleToLongBits(zzii.zza(obj, j4));
                    byte[] bArr = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 1:
                    i4 = i7 * 53;
                    floatToIntBits = Float.floatToIntBits(zzii.zzb(obj, j4));
                    i7 = i4 + floatToIntBits;
                    break;
                case 2:
                    i4 = i7 * 53;
                    doubleToLongBits = zzii.zzd(obj, j4);
                    byte[] bArr2 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 3:
                    i4 = i7 * 53;
                    doubleToLongBits = zzii.zzd(obj, j4);
                    byte[] bArr3 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 4:
                    i4 = i7 * 53;
                    floatToIntBits = zzii.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 5:
                    i4 = i7 * 53;
                    doubleToLongBits = zzii.zzd(obj, j4);
                    byte[] bArr4 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 6:
                    i4 = i7 * 53;
                    floatToIntBits = zzii.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 7:
                    i4 = i7 * 53;
                    floatToIntBits = zzga.zza(zzii.zzw(obj, j4));
                    i7 = i4 + floatToIntBits;
                    break;
                case 8:
                    i4 = i7 * 53;
                    floatToIntBits = ((String) zzii.zzf(obj, j4)).hashCode();
                    i7 = i4 + floatToIntBits;
                    break;
                case 9:
                    i5 = i7 * 53;
                    Object zzf = zzii.zzf(obj, j4);
                    if (zzf != null) {
                        i10 = zzf.hashCode();
                    }
                    i7 = i5 + i10;
                    break;
                case 10:
                    i4 = i7 * 53;
                    floatToIntBits = zzii.zzf(obj, j4).hashCode();
                    i7 = i4 + floatToIntBits;
                    break;
                case 11:
                    i4 = i7 * 53;
                    floatToIntBits = zzii.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 12:
                    i4 = i7 * 53;
                    floatToIntBits = zzii.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 13:
                    i4 = i7 * 53;
                    floatToIntBits = zzii.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 14:
                    i4 = i7 * 53;
                    doubleToLongBits = zzii.zzd(obj, j4);
                    byte[] bArr5 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 15:
                    i4 = i7 * 53;
                    floatToIntBits = zzii.zzc(obj, j4);
                    i7 = i4 + floatToIntBits;
                    break;
                case 16:
                    i4 = i7 * 53;
                    doubleToLongBits = zzii.zzd(obj, j4);
                    byte[] bArr6 = zzga.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i7 = i4 + floatToIntBits;
                    break;
                case 17:
                    i5 = i7 * 53;
                    Object zzf2 = zzii.zzf(obj, j4);
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
                    floatToIntBits = zzii.zzf(obj, j4).hashCode();
                    i7 = i4 + floatToIntBits;
                    break;
                case 50:
                    i4 = i7 * 53;
                    floatToIntBits = zzii.zzf(obj, j4).hashCode();
                    i7 = i4 + floatToIntBits;
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j4));
                        byte[] bArr7 = zzga.zzb;
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
                        byte[] bArr8 = zzga.zzb;
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
                        byte[] bArr9 = zzga.zzb;
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
                        byte[] bArr10 = zzga.zzb;
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
                        floatToIntBits = zzga.zza(zzN(obj, j4));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = ((String) zzii.zzf(obj, j4)).hashCode();
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzii.zzf(obj, j4).hashCode();
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 61:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzii.zzf(obj, j4).hashCode();
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
                        byte[] bArr11 = zzga.zzb;
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
                        byte[] bArr12 = zzga.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i7 = i4 + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzM(obj, i9, i6)) {
                        break;
                    } else {
                        i4 = i7 * 53;
                        floatToIntBits = zzii.zzf(obj, j4).hashCode();
                        i7 = i4 + floatToIntBits;
                        break;
                    }
            }
            i6 += 3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzc(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.play_billing.zzej r40) {
        /*
            Method dump skipped, instructions count: 4344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzhe.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzej):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final Object zze() {
        return ((zzfu) this.zzg).zzs();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzfu) {
                zzfu zzfuVar = (zzfu) obj;
                zzfuVar.zzC(Integer.MAX_VALUE);
                zzfuVar.zza = 0;
                zzfuVar.zzA();
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
                                ((zzfz) zzii.zzf(obj, j4)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j4);
                                if (object != null) {
                                    ((zzgv) object).zzc();
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
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i4 >= iArr.length) {
                zzhn.zzq(this.zzl, obj, obj2);
                if (this.zzh) {
                    zzhn.zzp(this.zzm, obj, obj2);
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
                        zzii.zzo(obj, j4, zzii.zza(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 1:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzp(obj, j4, zzii.zzb(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 2:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzr(obj, j4, zzii.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 3:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzr(obj, j4, zzii.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 4:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzq(obj, j4, zzii.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 5:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzr(obj, j4, zzii.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 6:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzq(obj, j4, zzii.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 7:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzm(obj, j4, zzii.zzw(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 8:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzs(obj, j4, zzii.zzf(obj2, j4));
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
                        zzii.zzs(obj, j4, zzii.zzf(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 11:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzq(obj, j4, zzii.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 12:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzq(obj, j4, zzii.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 13:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzq(obj, j4, zzii.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 14:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzr(obj, j4, zzii.zzd(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 15:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzq(obj, j4, zzii.zzc(obj2, j4));
                        zzD(obj, i4);
                        break;
                    }
                case 16:
                    if (!zzI(obj2, i4)) {
                        break;
                    } else {
                        zzii.zzr(obj, j4, zzii.zzd(obj2, j4));
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
                    zzfz zzfzVar = (zzfz) zzii.zzf(obj, j4);
                    zzfz zzfzVar2 = (zzfz) zzii.zzf(obj2, j4);
                    int size = zzfzVar.size();
                    int size2 = zzfzVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzfzVar.zzc()) {
                            zzfzVar = zzfzVar.zzd(size2 + size);
                        }
                        zzfzVar.addAll(zzfzVar2);
                    }
                    if (size > 0) {
                        zzfzVar2 = zzfzVar;
                    }
                    zzii.zzs(obj, j4, zzfzVar2);
                    break;
                case 50:
                    int i7 = zzhn.zza;
                    zzii.zzs(obj, j4, zzgw.zza(zzii.zzf(obj, j4), zzii.zzf(obj2, j4)));
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
                        zzii.zzs(obj, j4, zzii.zzf(obj2, j4));
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
                        zzii.zzs(obj, j4, zzii.zzf(obj2, j4));
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

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final void zzh(Object obj, byte[] bArr, int i4, int i5, zzej zzejVar) {
        zzc(obj, bArr, i4, i5, 0, zzejVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.play_billing.zzhl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzit zzitVar) {
        Map.Entry entry;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        zzhe<T> zzheVar = this;
        if (zzheVar.zzh) {
            zzfm zzfmVar = ((zzfr) obj).zzb;
            if (!zzfmVar.zza.isEmpty()) {
                entry = (Map.Entry) zzfmVar.zzf().next();
                iArr = zzheVar.zzc;
                Unsafe unsafe = zzb;
                int i7 = 1048575;
                int i8 = 1048575;
                i4 = 0;
                int i9 = 0;
                while (i4 < iArr.length) {
                    int zzs = zzheVar.zzs(i4);
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
                            if (!zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                break;
                            } else {
                                zzitVar.zzf(i10, zzii.zza(obj, j4));
                                continue;
                            }
                        case 1:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzo(i10, zzii.zzb(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzt(i10, unsafe.getLong(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzL(i10, unsafe.getLong(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzr(i10, unsafe.getInt(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzm(i10, unsafe.getLong(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzk(i10, unsafe.getInt(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzb(i10, zzii.zzw(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzP(i10, unsafe.getObject(obj, j4), zzitVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzw(i10, unsafe.getObject(obj, j4), zzheVar.zzv(i4));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzd(i10, (zzev) unsafe.getObject(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzJ(i10, unsafe.getInt(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzi(i10, unsafe.getInt(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzy(i10, unsafe.getInt(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzA(i10, unsafe.getLong(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzC(i10, unsafe.getInt(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzE(i10, unsafe.getLong(obj, j4));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if (zzheVar.zzJ(obj, i4, i8, i9, i6)) {
                                zzitVar.zzq(i10, unsafe.getObject(obj, j4), zzheVar.zzv(i4));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzhn.zzs(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 19:
                            zzhn.zzw(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 20:
                            zzhn.zzy(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 21:
                            zzhn.zzE(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 22:
                            zzhn.zzx(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            zzhn.zzv(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 24:
                            zzhn.zzu(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 25:
                            zzhn.zzr(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 26:
                            int i14 = iArr[i4];
                            List list = (List) unsafe.getObject(obj, j4);
                            int i15 = zzhn.zza;
                            if (list != null && !list.isEmpty()) {
                                zzitVar.zzI(i14, list);
                                break;
                            }
                            break;
                        case 27:
                            int i16 = iArr[i4];
                            List list2 = (List) unsafe.getObject(obj, j4);
                            zzhl zzv = zzheVar.zzv(i4);
                            int i17 = zzhn.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i18 = 0; i18 < list2.size(); i18++) {
                                    ((zzfd) zzitVar).zzw(i16, list2.get(i18), zzv);
                                }
                                break;
                            }
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            int i19 = iArr[i4];
                            List list3 = (List) unsafe.getObject(obj, j4);
                            int i20 = zzhn.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzitVar.zze(i19, list3);
                                break;
                            }
                            break;
                        case 29:
                            zzhn.zzD(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            zzhn.zzt(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            zzhn.zzz(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 32:
                            zzhn.zzA(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 33:
                            zzhn.zzB(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case 34:
                            zzhn.zzC(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, false);
                            continue;
                        case C3139z9.f40333J /* 35 */:
                            zzhn.zzs(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 36:
                            zzhn.zzw(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 37:
                            zzhn.zzy(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case C3139z9.f40334K /* 38 */:
                            zzhn.zzE(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 39:
                            zzhn.zzx(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 40:
                            zzhn.zzv(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 41:
                            zzhn.zzu(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 42:
                            zzhn.zzr(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 43:
                            zzhn.zzD(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                            zzhn.zzt(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                            zzhn.zzz(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 46:
                            zzhn.zzA(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 47:
                            zzhn.zzB(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 48:
                            zzhn.zzC(iArr[i4], (List) unsafe.getObject(obj, j4), zzitVar, true);
                            break;
                        case 49:
                            int i21 = iArr[i4];
                            List list4 = (List) unsafe.getObject(obj, j4);
                            zzhl zzv2 = zzheVar.zzv(i4);
                            int i22 = zzhn.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i23 = 0; i23 < list4.size(); i23++) {
                                    ((zzfd) zzitVar).zzq(i21, list4.get(i23), zzv2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j4);
                            if (object != null) {
                                zzitVar.zzv(i10, ((zzgu) zzheVar.zzw(i4)).zzc(), (zzgv) object);
                                break;
                            }
                            break;
                        case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzf(i10, zzm(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.SET_USER_ID /* 52 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzo(i10, zzn(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzt(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzL(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzr(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzm(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzk(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case 58:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzb(i10, zzN(obj, j4));
                                break;
                            }
                            break;
                        case 59:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzP(i10, unsafe.getObject(obj, j4), zzitVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzw(i10, unsafe.getObject(obj, j4), zzheVar.zzv(i4));
                                break;
                            }
                            break;
                        case 61:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzd(i10, (zzev) unsafe.getObject(obj, j4));
                                break;
                            }
                            break;
                        case IronSourceConstants.RETRY_LIMIT /* 62 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzJ(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case 63:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzi(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzy(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzA(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case 66:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzC(i10, zzo(obj, j4));
                                break;
                            }
                            break;
                        case 67:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzE(i10, zzt(obj, j4));
                                break;
                            }
                            break;
                        case 68:
                            if (zzheVar.zzM(obj, i10, i4)) {
                                zzitVar.zzq(i10, unsafe.getObject(obj, j4), zzheVar.zzv(i4));
                                break;
                            }
                            break;
                    }
                    i4 += 3;
                    i7 = 1048575;
                    zzheVar = this;
                }
                if (entry != null) {
                    ((zzfu) obj).zzc.zzl(zzitVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zzheVar.zzc;
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

    @Override // com.google.android.gms.internal.play_billing.zzhl
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzF;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzs = zzs(i4);
            long j4 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i4) && Double.doubleToLongBits(zzii.zza(obj, j4)) == Double.doubleToLongBits(zzii.zza(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i4) && Float.floatToIntBits(zzii.zzb(obj, j4)) == Float.floatToIntBits(zzii.zzb(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i4) && zzii.zzd(obj, j4) == zzii.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i4) && zzii.zzd(obj, j4) == zzii.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i4) && zzii.zzc(obj, j4) == zzii.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i4) && zzii.zzd(obj, j4) == zzii.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i4) && zzii.zzc(obj, j4) == zzii.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i4) && zzii.zzw(obj, j4) == zzii.zzw(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i4) && zzhn.zzF(zzii.zzf(obj, j4), zzii.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i4) && zzhn.zzF(zzii.zzf(obj, j4), zzii.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i4) && zzhn.zzF(zzii.zzf(obj, j4), zzii.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i4) && zzii.zzc(obj, j4) == zzii.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i4) && zzii.zzc(obj, j4) == zzii.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i4) && zzii.zzc(obj, j4) == zzii.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i4) && zzii.zzd(obj, j4) == zzii.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i4) && zzii.zzc(obj, j4) == zzii.zzc(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i4) && zzii.zzd(obj, j4) == zzii.zzd(obj2, j4)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i4) && zzhn.zzF(zzii.zzf(obj, j4), zzii.zzf(obj2, j4))) {
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
                    zzF = zzhn.zzF(zzii.zzf(obj, j4), zzii.zzf(obj2, j4));
                    break;
                case 50:
                    zzF = zzhn.zzF(zzii.zzf(obj, j4), zzii.zzf(obj2, j4));
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
                    if (zzii.zzc(obj, zzp) == zzii.zzc(obj2, zzp) && zzhn.zzF(zzii.zzf(obj, j4), zzii.zzf(obj2, j4))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zzfu) obj).zzc.equals(((zzfu) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzfr) obj).zzb.equals(((zzfr) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhl
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
                        if (zzr != 50) {
                            continue;
                        } else {
                            zzgv zzgvVar = (zzgv) zzii.zzf(obj, zzs & 1048575);
                            if (!zzgvVar.isEmpty() && ((zzgu) zzw(i5)).zzc().zzc.zzb() == zzis.MESSAGE) {
                                zzhl zzhlVar = null;
                                for (Object obj2 : zzgvVar.values()) {
                                    if (zzhlVar == null) {
                                        zzhlVar = zzhi.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzhlVar.zzk(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzii.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhl zzv = zzv(i5);
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
        return !this.zzh || ((zzfr) obj).zzb.zzj();
    }
}
