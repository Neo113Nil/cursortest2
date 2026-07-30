package com.google.android.gms.internal.measurement;

import androidx.core.text.HtmlCompat;
import androidx.core.view.MotionEventCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@23.0.0 */
/* loaded from: classes.dex */
final class zznp<T> implements zznx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzop.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zznm zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzoi zzl;
    private final zzls zzm;

    private zznp(int[] iArr, Object[] objArr, int i, int i2, zznm zznmVar, boolean z, int[] iArr2, int i3, int i4, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzlsVar != null && (zznmVar instanceof zzmc)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = zzoiVar;
        this.zzm = zzlsVar;
        this.zzg = zznmVar;
    }

    private static boolean zzA(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzmf) {
            return ((zzmf) obj).zzcf();
        }
        return true;
    }

    private static void zzB(Object obj) {
        if (zzA(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(valueOf)));
    }

    private static double zzC(Object obj, long j) {
        return ((Double) zzop.zzn(obj, j)).doubleValue();
    }

    private static float zzD(Object obj, long j) {
        return ((Float) zzop.zzn(obj, j)).floatValue();
    }

    private static int zzE(Object obj, long j) {
        return ((Integer) zzop.zzn(obj, j)).intValue();
    }

    private static long zzF(Object obj, long j) {
        return ((Long) zzop.zzn(obj, j)).longValue();
    }

    private static boolean zzG(Object obj, long j) {
        return ((Boolean) zzop.zzn(obj, j)).booleanValue();
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzJ(obj, i) == zzJ(obj2, i);
    }

    private final boolean zzI(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzJ(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return ((1 << (zzy >>> 20)) & zzop.zzd(obj, j)) != 0;
        }
        int zzx = zzx(i);
        long j2 = zzx & 1048575;
        switch (zzz(zzx)) {
            case 0:
                return Double.doubleToRawLongBits(zzop.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzop.zzj(obj, j2)) != 0;
            case 2:
                return zzop.zzf(obj, j2) != 0;
            case 3:
                return zzop.zzf(obj, j2) != 0;
            case 4:
                return zzop.zzd(obj, j2) != 0;
            case 5:
                return zzop.zzf(obj, j2) != 0;
            case 6:
                return zzop.zzd(obj, j2) != 0;
            case 7:
                return zzop.zzh(obj, j2);
            case 8:
                Object zzn = zzop.zzn(obj, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzlh) {
                    return !zzlh.zzb.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzop.zzn(obj, j2) != null;
            case 10:
                return !zzlh.zzb.equals(zzop.zzn(obj, j2));
            case 11:
                return zzop.zzd(obj, j2) != 0;
            case 12:
                return zzop.zzd(obj, j2) != 0;
            case 13:
                return zzop.zzd(obj, j2) != 0;
            case 14:
                return zzop.zzf(obj, j2) != 0;
            case 15:
                return zzop.zzd(obj, j2) != 0;
            case 16:
                return zzop.zzf(obj, j2) != 0;
            case 17:
                return zzop.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzK(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzop.zze(obj, j, (1 << (zzy >>> 20)) | zzop.zzd(obj, j));
    }

    private final boolean zzL(Object obj, int i, int i2) {
        return zzop.zzd(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private final void zzM(Object obj, int i, int i2) {
        zzop.zze(obj, zzy(i2) & 1048575, i);
    }

    private final int zzN(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
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

    private static final int zzO(byte[] bArr, int i, int i2, zzot zzotVar, Class cls, zzkw zzkwVar) throws IOException {
        zzot zzotVar2 = zzot.DOUBLE;
        switch (zzotVar) {
            case DOUBLE:
                int i3 = i + 8;
                zzkwVar.zzc = Double.valueOf(Double.longBitsToDouble(zzkx.zze(bArr, i)));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                zzkwVar.zzc = Float.valueOf(Float.intBitsToFloat(zzkx.zzd(bArr, i)));
                return i4;
            case INT64:
            case UINT64:
                int zzc = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzkwVar.zzb);
                return zzc;
            case INT32:
            case UINT32:
            case ENUM:
                int zza2 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzkwVar.zza);
                return zza2;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                zzkwVar.zzc = Long.valueOf(zzkx.zze(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                zzkwVar.zzc = Integer.valueOf(zzkx.zzd(bArr, i));
                return i6;
            case BOOL:
                int zzc2 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Boolean.valueOf(zzkwVar.zzb != 0);
                return zzc2;
            case STRING:
                return zzkx.zzf(bArr, i, zzkwVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzkx.zzh(zznu.zza().zzb(cls), bArr, i, i2, zzkwVar);
            case BYTES:
                return zzkx.zzg(bArr, i, zzkwVar);
            case SINT32:
                int zza3 = zzkx.zza(bArr, i, zzkwVar);
                zzkwVar.zzc = Integer.valueOf(zzlj.zzb(zzkwVar.zza));
                return zza3;
            case SINT64:
                int zzc3 = zzkx.zzc(bArr, i, zzkwVar);
                zzkwVar.zzc = Long.valueOf(zzlj.zzc(zzkwVar.zzb));
                return zzc3;
        }
    }

    private static final void zzP(int i, Object obj, zzov zzovVar) throws IOException {
        if (obj instanceof String) {
            zzovVar.zzm(i, (String) obj);
        } else {
            zzovVar.zzn(i, (zzlh) obj);
        }
    }

    static zzoj zzg(Object obj) {
        zzmf zzmfVar = (zzmf) obj;
        zzoj zzojVar = zzmfVar.zzc;
        if (zzojVar != zzoj.zza()) {
            return zzojVar;
        }
        zzoj zzb2 = zzoj.zzb();
        zzmfVar.zzc = zzb2;
        return zzb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zznp zzl(Class cls, zznj zznjVar, zznr zznrVar, zzmy zzmyVar, zzoi zzoiVar, zzls zzlsVar, zznh zznhVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        String str;
        int objectFieldOffset;
        char c;
        int i21;
        int i22;
        int i23;
        int i24;
        Field zzm;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzm2;
        Object obj2;
        Field zzm3;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(zznjVar instanceof zznw)) {
            throw null;
        }
        zznw zznwVar = (zznw) zznjVar;
        String zzd = zznwVar.zzd();
        int length = zzd.length();
        char c2 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (zzd.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt15 = zzd.charAt(i);
        if (charAt15 >= 55296) {
            int i36 = charAt15 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                charAt14 = zzd.charAt(i35);
                if (charAt14 < 55296) {
                    break;
                }
                i36 |= (charAt14 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            charAt15 = i36 | (charAt14 << i37);
            i35 = i33;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i4 = 0;
            i5 = 0;
            iArr = zza;
            i7 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt16 = zzd.charAt(i35);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    charAt9 = zzd.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                charAt16 = i39 | (charAt9 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int charAt17 = zzd.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt8 = zzd.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt17 = i42 | (charAt8 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt18 = zzd.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt7 = zzd.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt18 = i45 | (charAt7 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt19 = zzd.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt6 = zzd.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt19 = i48 | (charAt6 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = zzd.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt5 = zzd.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt5 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt20 = zzd.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt4 = zzd.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt20 = i54 | (charAt4 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int charAt21 = zzd.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt3 = zzd.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt21 = i57 | (charAt3 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt22 = zzd.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    charAt2 = zzd.charAt(i59);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i60 |= (charAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                charAt22 = i60 | (charAt2 << i61);
                i59 = i8;
            }
            int i62 = charAt16 + charAt16 + charAt17;
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i63 = charAt20;
            i2 = charAt18;
            i3 = i63;
            i4 = charAt19;
            i5 = charAt22;
            i6 = i62;
            iArr = iArr2;
            i7 = charAt16;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zznwVar.zze();
        Class<?> cls2 = zznwVar.zzb().getClass();
        int i64 = i5 + i3;
        int i65 = charAt + charAt;
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr = new Object[i65];
        int i66 = i5;
        int i67 = i64;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int charAt23 = zzd.charAt(i35);
            if (charAt23 >= c2) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i32 = i72 + 1;
                    charAt13 = zzd.charAt(i72);
                    if (charAt13 < c2) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i32;
                }
                charAt23 = i71 | (charAt13 << i73);
                i16 = i32;
            } else {
                i16 = i70;
            }
            int i74 = i16 + 1;
            int charAt24 = zzd.charAt(i16);
            if (charAt24 >= c2) {
                int i75 = charAt24 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i31 = i76 + 1;
                    charAt12 = zzd.charAt(i76);
                    if (charAt12 < c2) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i31;
                }
                charAt24 = i75 | (charAt12 << i77);
                i17 = i31;
            } else {
                i17 = i74;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i78 = charAt24 & 255;
            zznw zznwVar2 = zznwVar;
            int i79 = charAt24 & 2048;
            if (i78 >= 51) {
                int i80 = i17 + 1;
                int charAt25 = zzd.charAt(i17);
                char c3 = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i30 = i82 + 1;
                        charAt11 = zzd.charAt(i82);
                        if (charAt11 < c3) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i83;
                        i83 += 13;
                        i82 = i30;
                        c3 = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i83);
                    i27 = i30;
                } else {
                    i27 = i80;
                }
                int i84 = i27;
                int i85 = i78 - 51;
                i18 = length;
                if (i85 == 9 || i85 == 17) {
                    i28 = i6 + 1;
                    int i86 = i69 / 3;
                    objArr[i86 + i86 + 1] = zze[i6];
                } else {
                    if (i85 == 12) {
                        if (zznwVar2.zzc() == 1 || i79 != 0) {
                            i28 = i6 + 1;
                            int i87 = i69 / 3;
                            objArr[i87 + i87 + 1] = zze[i6];
                        } else {
                            i29 = 0;
                            int i88 = charAt25 + charAt25;
                            obj = zze[i88];
                            int i89 = i29;
                            if (obj instanceof Field) {
                                zzm2 = (Field) obj;
                            } else {
                                zzm2 = zzm(cls2, (String) obj);
                                zze[i88] = zzm2;
                            }
                            int i90 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm2);
                            int i91 = i88 + 1;
                            obj2 = zze[i91];
                            i19 = i90;
                            if (obj2 instanceof Field) {
                                zzm3 = (Field) obj2;
                            } else {
                                zzm3 = zzm(cls2, (String) obj2);
                                zze[i91] = zzm3;
                            }
                            i21 = (int) unsafe.objectFieldOffset(zzm3);
                            str = zzd;
                            i23 = i89;
                            i17 = i84;
                            i22 = 0;
                            c = 55296;
                        }
                    }
                    i29 = i79;
                    int i882 = charAt25 + charAt25;
                    obj = zze[i882];
                    int i892 = i29;
                    if (obj instanceof Field) {
                    }
                    int i902 = i7;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzm2);
                    int i912 = i882 + 1;
                    obj2 = zze[i912];
                    i19 = i902;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzm3);
                    str = zzd;
                    i23 = i892;
                    i17 = i84;
                    i22 = 0;
                    c = 55296;
                }
                i6 = i28;
                i29 = i79;
                int i8822 = charAt25 + charAt25;
                obj = zze[i8822];
                int i8922 = i29;
                if (obj instanceof Field) {
                }
                int i9022 = i7;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzm2);
                int i9122 = i8822 + 1;
                obj2 = zze[i9122];
                i19 = i9022;
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzm3);
                str = zzd;
                i23 = i8922;
                i17 = i84;
                i22 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i92 = i6 + 1;
                Field zzm4 = zzm(cls2, (String) zze[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i92;
                    int i93 = i69 / 3;
                    objArr[i93 + i93 + 1] = zzm4.getType();
                } else {
                    if (i78 == 27) {
                        i25 = i92;
                        i26 = 1;
                        i6 += 2;
                    } else if (i78 == 49) {
                        i6 += 2;
                        i25 = i92;
                        i26 = 1;
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        if (zznwVar2.zzc() == 1 || i79 != 0) {
                            i6 += 2;
                            int i94 = i69 / 3;
                            objArr[i94 + i94 + 1] = zze[i92];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                            if ((charAt24 & 4096) != 0 || i78 > 17) {
                                c = 55296;
                                i21 = 1048575;
                                i22 = 0;
                            } else {
                                int i95 = i17 + 1;
                                int charAt26 = str.charAt(i17);
                                if (charAt26 >= 55296) {
                                    int i96 = charAt26 & 8191;
                                    int i97 = 13;
                                    while (true) {
                                        i24 = i95 + 1;
                                        charAt10 = str.charAt(i95);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i96 |= (charAt10 & 8191) << i97;
                                        i97 += 13;
                                        i95 = i24;
                                    }
                                    charAt26 = i96 | (charAt10 << i97);
                                } else {
                                    i24 = i95;
                                }
                                int i98 = i19 + i19 + (charAt26 / 32);
                                Object obj3 = zze[i98];
                                if (obj3 instanceof Field) {
                                    zzm = (Field) obj3;
                                } else {
                                    zzm = zzm(cls2, (String) obj3);
                                    zze[i98] = zzm;
                                }
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzm);
                                i22 = charAt26 % 32;
                                i17 = i24;
                                c = 55296;
                                i21 = objectFieldOffset2;
                            }
                            if (i78 >= 18 && i78 <= 49) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i23 = i79;
                        } else {
                            str = zzd;
                            i6 = i92;
                            i79 = 0;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                                iArr[i67] = objectFieldOffset;
                                i67++;
                            }
                            i23 = i79;
                        }
                    } else if (i78 == 50) {
                        int i99 = i6 + 2;
                        int i100 = i66 + 1;
                        iArr[i66] = i69;
                        int i101 = i69 / 3;
                        int i102 = i101 + i101;
                        objArr[i102] = zze[i92];
                        if (i79 != 0) {
                            objArr[i102 + 1] = zze[i99];
                            i6 += 3;
                            str = zzd;
                            i66 = i100;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                            }
                            i23 = i79;
                        } else {
                            i6 = i99;
                            i66 = i100;
                            i79 = 0;
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                            if ((charAt24 & 4096) != 0) {
                            }
                            c = 55296;
                            i21 = 1048575;
                            i22 = 0;
                            if (i78 >= 18) {
                            }
                            i23 = i79;
                        }
                    } else {
                        i20 = i92;
                    }
                    int i103 = i69 / 3;
                    objArr[i103 + i103 + i26] = zze[i25];
                    str = zzd;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    c = 55296;
                    i21 = 1048575;
                    i22 = 0;
                    if (i78 >= 18) {
                    }
                    i23 = i79;
                }
                str = zzd;
                i6 = i20;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzm4);
                if ((charAt24 & 4096) != 0) {
                }
                c = 55296;
                i21 = 1048575;
                i22 = 0;
                if (i78 >= 18) {
                }
                i23 = i79;
            }
            int i104 = i69 + 1;
            iArr3[i69] = charAt23;
            int i105 = i69 + 2;
            iArr3[i104] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i23 != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i69 += 3;
            iArr3[i105] = (i22 << 20) | i21;
            i35 = i17;
            zzd = str;
            c2 = c;
            zznwVar = zznwVar2;
            length = i18;
            i7 = i19;
        }
        return new zznp(iArr3, objArr, i2, i4, zznwVar.zzb(), false, iArr, i5, i64, zznrVar, zzmyVar, zzoiVar, zzlsVar, zznhVar);
    }

    private static Field zzm(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(name).length() + 29 + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private final void zzn(Object obj, Object obj2, int i) {
        if (zzJ(obj2, i)) {
            int zzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zznx zzp = zzp(i);
            if (!zzJ(obj, i)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzK(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzL(obj2, i2, i)) {
            int zzx = zzx(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzx;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            zznx zzp = zzp(i);
            if (!zzL(obj, i2, i)) {
                if (zzA(object)) {
                    Object zza2 = zzp.zza();
                    zzp.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzM(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzA(object2)) {
                Object zza3 = zzp.zza();
                zzp.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzp.zzd(object2, object);
        }
    }

    private final zznx zzp(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zznx zznxVar = (zznx) objArr[i3];
        if (zznxVar != null) {
            return zznxVar;
        }
        zznx zzb2 = zznu.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzq(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzmk zzr(int i) {
        int i2 = i / 3;
        return (zzmk) this.zzd[i2 + i2 + 1];
    }

    private final Object zzs(Object obj, int i) {
        zznx zzp = zzp(i);
        int zzx = zzx(i) & 1048575;
        if (!zzJ(obj, i)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzt(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzx(i) & 1048575, obj2);
        zzK(obj, i);
    }

    private final Object zzu(Object obj, int i, int i2) {
        zznx zzp = zzp(i2);
        if (!zzL(obj, i, i2)) {
            return zzp.zza();
        }
        Object object = zzb.getObject(obj, zzx(i2) & 1048575);
        if (zzA(object)) {
            return object;
        }
        Object zza2 = zzp.zza();
        if (object != null) {
            zzp.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzv(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzx(i2) & 1048575, obj2);
        zzM(obj, i, i2);
    }

    private static boolean zzw(Object obj, int i, zznx zznxVar) {
        return zznxVar.zzk(zzop.zzn(obj, i & 1048575));
    }

    private final int zzx(int i) {
        return this.zzc[i + 1];
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private static int zzz(int i) {
        return (i >>> 20) & 255;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final Object zza() {
        return ((zzmf) this.zzg).zzch();
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzB;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzx = zzx(i);
            long j = zzx & 1048575;
            switch (zzz(zzx)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzop.zzl(obj, j)) == Double.doubleToLongBits(zzop.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzop.zzj(obj, j)) == Float.floatToIntBits(zzop.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzop.zzh(obj, j) == zzop.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzop.zzd(obj, j) == zzop.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzop.zzf(obj, j) == zzop.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
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
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    zzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
                    break;
                case 50:
                    zzB = zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j));
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
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzy = zzy(i) & 1048575;
                    if (zzop.zzd(obj, zzy) == zzop.zzd(obj2, zzy) && zznz.zzB(zzop.zzn(obj, j), zzop.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzB) {
                return false;
            }
        }
        if (!((zzmf) obj).zzc.equals(((zzmf) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzmc) obj).zzb.equals(((zzmc) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zzc(Object obj) {
        int i;
        long doubleToLongBits;
        int floatToIntBits;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i3 >= iArr.length) {
                int hashCode = (i4 * 53) + ((zzmf) obj).zzc.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzmc) obj).zzb.zza.hashCode() : hashCode;
            }
            int zzx = zzx(i3);
            int i5 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzz) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzop.zzl(obj, j));
                    byte[] bArr = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzop.zzj(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr2 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr3 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr4 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzmp.zzb(zzop.zzh(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzn = zzop.zzn(obj, j);
                    if (zzn != null) {
                        i7 = zzn.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr5 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzop.zzf(obj, j);
                    byte[] bArr6 = zzmp.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzn2 = zzop.zzn(obj, j);
                    if (zzn2 != null) {
                        i7 = zzn2.hashCode();
                    }
                    i4 = i2 + i7;
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
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzop.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 51:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzC(obj, j));
                        byte[] bArr7 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzD(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 53:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr8 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr9 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 55:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr10 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 58:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzmp.zzb(zzG(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzop.zzn(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 62:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 65:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr11 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 66:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzE(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzF(obj, j);
                        byte[] bArr12 = zzmp.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzL(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzop.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzd(Object obj, Object obj2) {
        zzB(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zznz.zzD(this.zzl, obj, obj2);
                if (this.zzh) {
                    zznz.zzC(this.zzm, obj, obj2);
                    return;
                }
                return;
            }
            int zzx = zzx(i);
            int i2 = 1048575 & zzx;
            int zzz = zzz(zzx);
            int i3 = iArr[i];
            long j = i2;
            switch (zzz) {
                case 0:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzm(obj, j, zzop.zzl(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 1:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzk(obj, j, zzop.zzj(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 2:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 3:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 4:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 5:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 6:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 7:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzi(obj, j, zzop.zzh(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 8:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 9:
                    zzn(obj, obj2, i);
                    break;
                case 10:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 11:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 12:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 13:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 14:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 15:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zze(obj, j, zzop.zzd(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 16:
                    if (!zzJ(obj2, i)) {
                        break;
                    } else {
                        zzop.zzg(obj, j, zzop.zzf(obj2, j));
                        zzK(obj, i);
                        break;
                    }
                case 17:
                    zzn(obj, obj2, i);
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
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    zzmo zzmoVar = (zzmo) zzop.zzn(obj, j);
                    zzmo zzmoVar2 = (zzmo) zzop.zzn(obj2, j);
                    int size = zzmoVar.size();
                    int size2 = zzmoVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzmoVar.zza()) {
                            zzmoVar = zzmoVar.zzg(size2 + size);
                        }
                        zzmoVar.addAll(zzmoVar2);
                    }
                    if (size > 0) {
                        zzmoVar2 = zzmoVar;
                    }
                    zzop.zzo(obj, j, zzmoVar2);
                    break;
                case 50:
                    int i4 = zznz.zza;
                    zzop.zzo(obj, j, zznh.zza(zzop.zzn(obj, j), zzop.zzn(obj2, j)));
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
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzo(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzL(obj2, i3, i)) {
                        break;
                    } else {
                        zzop.zzo(obj, j, zzop.zzn(obj2, j));
                        zzM(obj, i3, i);
                        break;
                    }
                case 68:
                    zzo(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final int zze(Object obj) {
        int i;
        int zzz;
        int zzz2;
        int zzA;
        int zzz3;
        int zzz4;
        int zzz5;
        int zzc;
        int zzz6;
        int zzz7;
        int zzo;
        int size;
        int zzp;
        int zzz8;
        int zzz9;
        int zzz10;
        int i2;
        int zzx;
        int zzz11;
        int zzz12;
        int i3;
        int zzz13;
        int zzz14;
        int zzz15;
        int zzc2;
        int zzz16;
        zznp<T> zznpVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = zznpVar.zzc;
            if (i4 >= iArr.length) {
                int zzi = i6 + ((zzmf) obj).zzc.zzi();
                if (!zznpVar.zzh) {
                    return zzi;
                }
                zzoe zzoeVar = ((zzmc) obj).zzb.zza;
                int zzc3 = zzoeVar.zzc();
                int i8 = 0;
                for (int i9 = 0; i9 < zzc3; i9++) {
                    Map.Entry zzd = zzoeVar.zzd(i9);
                    i8 += zzlw.zzj((zzlv) ((zzob) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzoeVar.zze()) {
                    i8 += zzlw.zzj((zzlv) entry.getKey(), entry.getValue());
                }
                return zzi + i8;
            }
            int zzx2 = zznpVar.zzx(i4);
            int zzz17 = zzz(zzx2);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & 1048575;
            if (zzz17 <= 17) {
                if (i12 != i7) {
                    i5 = i12 == 1048575 ? 0 : unsafe.getInt(obj2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzx2 & 1048575;
            if (zzz17 >= zzlx.DOUBLE_LIST_PACKED.zza()) {
                zzlx.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzz17) {
                case 0:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        i6 += zzlm.zzz(i10 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz = zzlm.zzz(i10 << 3);
                        zzz4 = zzz + 4;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 2:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzz2 = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA(j2);
                        zzz4 = zzz2 + zzA;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 3:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzz2 = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA(j3);
                        zzz4 = zzz2 + zzA;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 4:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzz2 = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA(j4);
                        zzz4 = zzz2 + zzA;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 5:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz3 = zzlm.zzz(i10 << 3);
                        zzz4 = zzz3 + 8;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 6:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz = zzlm.zzz(i10 << 3);
                        zzz4 = zzz + 4;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 7:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz4 = zzlm.zzz(i10 << 3) + 1;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 8:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzlh) {
                            zzz5 = zzlm.zzz(i14);
                            zzc = ((zzlh) object).zzc();
                            zzz6 = zzlm.zzz(zzc);
                            zzz4 = zzz5 + zzz6 + zzc;
                            i6 += zzz4;
                        } else {
                            zzz2 = zzlm.zzz(i14);
                            zzA = zzlm.zzB((String) object);
                            zzz4 = zzz2 + zzA;
                            i6 += zzz4;
                        }
                    }
                    zznpVar = this;
                    break;
                case 9:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz7 = zznz.zzz(i10, unsafe.getObject(obj2, j), zznpVar.zzp(i4));
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(obj2, j);
                        zzz5 = zzlm.zzz(i10 << 3);
                        zzc = zzlhVar.zzc();
                        zzz6 = zzlm.zzz(zzc);
                        zzz4 = zzz5 + zzz6 + zzc;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 11:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzz2 = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzz(i15);
                        zzz4 = zzz2 + zzA;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 12:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzz2 = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA(j5);
                        zzz4 = zzz2 + zzA;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 13:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz = zzlm.zzz(i10 << 3);
                        zzz4 = zzz + 4;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 14:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz3 = zzlm.zzz(i10 << 3);
                        zzz4 = zzz3 + 8;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 15:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzz2 = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzz((i16 >> 31) ^ (i16 + i16));
                        zzz4 = zzz2 + zzA;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 16:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzz2 = zzlm.zzz(i10 << 3);
                        zzA = zzlm.zzA((j6 >> 63) ^ (j6 + j6));
                        zzz4 = zzz2 + zzA;
                        i6 += zzz4;
                    }
                    zznpVar = this;
                    break;
                case 17:
                    if (zznpVar.zzI(obj2, i4, i7, i5, i)) {
                        zzz7 = zzlm.zzG(i10, (zznm) unsafe.getObject(obj2, j), zznpVar.zzp(i4));
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzz7 = zznz.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz7;
                    break;
                case 19:
                    zzz7 = zznz.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz7;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zznz.zza;
                    if (list.size() != 0) {
                        zzo = zznz.zzo(list) + (list.size() * zzlm.zzz(i10 << 3));
                        i6 += zzo;
                        break;
                    }
                    zzo = 0;
                    i6 += zzo;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zznz.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzp = zznz.zzp(list2);
                        zzz8 = zzlm.zzz(i10 << 3);
                        i2 = size * zzz8;
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zznz.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzp = zznz.zzs(list3);
                        zzz8 = zzlm.zzz(i10 << 3);
                        i2 = size * zzz8;
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 23:
                    zzz7 = zznz.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz7;
                    break;
                case 24:
                    zzz7 = zznz.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz7;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zznz.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzz7 = size2 * (zzlm.zzz(i10 << 3) + 1);
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zznz.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzo = zzlm.zzz(i10 << 3) * size3;
                        if (list5 instanceof zzmx) {
                            zzmx zzmxVar = (zzmx) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzc4 = zzmxVar.zzc();
                                if (zzc4 instanceof zzlh) {
                                    int zzc5 = ((zzlh) zzc4).zzc();
                                    zzo += zzlm.zzz(zzc5) + zzc5;
                                } else {
                                    zzo += zzlm.zzB((String) zzc4);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzlh) {
                                    int zzc6 = ((zzlh) obj3).zzc();
                                    zzo += zzlm.zzz(zzc6) + zzc6;
                                } else {
                                    zzo += zzlm.zzB((String) obj3);
                                }
                            }
                        }
                        i6 += zzo;
                        break;
                    }
                    zzo = 0;
                    i6 += zzo;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zznx zzp2 = zznpVar.zzp(i4);
                    int i24 = zznz.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzz9 = 0;
                    } else {
                        zzz9 = zzlm.zzz(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zzmw) {
                                int zzb2 = ((zzmw) obj4).zzb();
                                zzz9 += zzlm.zzz(zzb2) + zzb2;
                            } else {
                                zzz9 += zzlm.zzD((zznm) obj4, zzp2);
                            }
                        }
                    }
                    i6 += zzz9;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zznz.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzz10 = 0;
                    } else {
                        zzz10 = size5 * zzlm.zzz(i10 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzc7 = ((zzlh) list7.get(i27)).zzc();
                            zzz10 += zzlm.zzz(zzc7) + zzc7;
                        }
                    }
                    i6 += zzz10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zznz.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzp = zznz.zzt(list8);
                        zzz8 = zzlm.zzz(i10 << 3);
                        i2 = size * zzz8;
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zznz.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzp = zznz.zzr(list9);
                        zzz8 = zzlm.zzz(i10 << 3);
                        i2 = size * zzz8;
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzz7 = zznz.zzw(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz7;
                    break;
                case 32:
                    zzz7 = zznz.zzy(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzz7;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zznz.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzp = zznz.zzu(list10);
                        zzz8 = zzlm.zzz(i10 << 3);
                        i2 = size * zzz8;
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zznz.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzp = zznz.zzq(list11);
                        zzz8 = zzlm.zzz(i10 << 3);
                        i2 = size * zzz8;
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    }
                    zzz7 = 0;
                    i6 += zzz7;
                case 35:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzx = zznz.zzo((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    zzx = zznz.zzp((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzx = zznz.zzs((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zznz.zza;
                    zzx = list12.size();
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    zzx = zznz.zzt((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzx = zznz.zzr((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzx = zznz.zzv((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zzx = zznz.zzx((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    zzx = zznz.zzu((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzx = zznz.zzq((List) unsafe.getObject(obj2, j));
                    if (zzx > 0) {
                        zzz11 = zzlm.zzz(i10 << 3);
                        zzz12 = zzlm.zzz(zzx);
                        zzz10 = zzz11 + zzz12 + zzx;
                        i6 += zzz10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zznx zzp3 = zznpVar.zzp(i4);
                    int i33 = zznz.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzlm.zzG(i10, (zznm) list13.get(i34), zzp3);
                        }
                    }
                    i6 += i3;
                    break;
                case 50:
                    zzng zzngVar = (zzng) unsafe.getObject(obj2, j);
                    zznf zznfVar = (zznf) zznpVar.zzq(i4);
                    if (!zzngVar.isEmpty()) {
                        zzo = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            zzo += zznfVar.zzd(i10, entry2.getKey(), entry2.getValue());
                        }
                        i6 += zzo;
                        break;
                    }
                    zzo = 0;
                    i6 += zzo;
                case 51:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz13 = zzlm.zzz(i10 << 3);
                        zzz7 = zzz13 + 8;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz14 = zzlm.zzz(i10 << 3);
                        zzz7 = zzz14 + 4;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzF = zzF(obj2, j);
                        zzp = zzlm.zzz(i10 << 3);
                        i2 = zzlm.zzA(zzF);
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzF2 = zzF(obj2, j);
                        zzp = zzlm.zzz(i10 << 3);
                        i2 = zzlm.zzA(zzF2);
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzE = zzE(obj2, j);
                        zzp = zzlm.zzz(i10 << 3);
                        i2 = zzlm.zzA(zzE);
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz13 = zzlm.zzz(i10 << 3);
                        zzz7 = zzz13 + 8;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz14 = zzlm.zzz(i10 << 3);
                        zzz7 = zzz14 + 4;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz7 = zzlm.zzz(i10 << 3) + 1;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zznpVar.zzL(obj2, i10, i4)) {
                        break;
                    } else {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzlh) {
                            zzz15 = zzlm.zzz(i35);
                            zzc2 = ((zzlh) object2).zzc();
                            zzz16 = zzlm.zzz(zzc2);
                            zzz7 = zzz15 + zzz16 + zzc2;
                            i6 += zzz7;
                            break;
                        } else {
                            zzp = zzlm.zzz(i35);
                            i2 = zzlm.zzB((String) object2);
                            zzz7 = zzp + i2;
                            i6 += zzz7;
                        }
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz7 = zznz.zzz(i10, unsafe.getObject(obj2, j), zznpVar.zzp(i4));
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(obj2, j);
                        zzz15 = zzlm.zzz(i10 << 3);
                        zzc2 = zzlhVar2.zzc();
                        zzz16 = zzlm.zzz(zzc2);
                        zzz7 = zzz15 + zzz16 + zzc2;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        int zzE2 = zzE(obj2, j);
                        zzp = zzlm.zzz(i10 << 3);
                        i2 = zzlm.zzz(zzE2);
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzE3 = zzE(obj2, j);
                        zzp = zzlm.zzz(i10 << 3);
                        i2 = zzlm.zzA(zzE3);
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz14 = zzlm.zzz(i10 << 3);
                        zzz7 = zzz14 + 4;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz13 = zzlm.zzz(i10 << 3);
                        zzz7 = zzz13 + 8;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        int zzE4 = zzE(obj2, j);
                        zzp = zzlm.zzz(i10 << 3);
                        i2 = zzlm.zzz((zzE4 >> 31) ^ (zzE4 + zzE4));
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        long zzF3 = zzF(obj2, j);
                        zzp = zzlm.zzz(i10 << 3);
                        i2 = zzlm.zzA((zzF3 >> 63) ^ (zzF3 + zzF3));
                        zzz7 = zzp + i2;
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zznpVar.zzL(obj2, i10, i4)) {
                        zzz7 = zzlm.zzG(i10, (zznm) unsafe.getObject(obj2, j), zznpVar.zzp(i4));
                        i6 += zzz7;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            obj2 = obj;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.measurement.zznx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzov zzovVar) throws IOException {
        Map.Entry entry;
        int[] iArr;
        int i;
        int i2;
        int i3;
        zznp<T> zznpVar = this;
        if (zznpVar.zzh) {
            zzlw zzlwVar = ((zzmc) obj).zzb;
            if (!zzlwVar.zza.isEmpty()) {
                entry = (Map.Entry) zzlwVar.zzc().next();
                iArr = zznpVar.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 1048575;
                i = 0;
                int i6 = 0;
                while (i < iArr.length) {
                    int zzx = zznpVar.zzx(i);
                    int zzz = zzz(zzx);
                    int i7 = iArr[i];
                    if (zzz <= 17) {
                        int i8 = iArr[i + 2];
                        int i9 = i8 & i4;
                        if (i9 != i5) {
                            i6 = i9 == i4 ? 0 : unsafe.getInt(obj, i9);
                            i5 = i9;
                        }
                        i2 = zzx;
                        i3 = 1 << (i8 >>> 20);
                    } else {
                        i2 = zzx;
                        i3 = 0;
                    }
                    if (entry != null) {
                        throw null;
                    }
                    long j = i2 & i4;
                    switch (zzz) {
                        case 0:
                            if (!zznpVar.zzI(obj, i, i5, i6, i3)) {
                                break;
                            } else {
                                zzovVar.zzf(i7, zzop.zzl(obj, j));
                                continue;
                            }
                        case 1:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zze(i7, zzop.zzj(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzc(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzh(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzi(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzj(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzk(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzl(i7, zzop.zzh(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzP(i7, unsafe.getObject(obj, j), zzovVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzr(i7, unsafe.getObject(obj, j), zznpVar.zzp(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzn(i7, (zzlh) unsafe.getObject(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzo(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzg(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzb(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzd(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzp(i7, unsafe.getInt(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzq(i7, unsafe.getLong(obj, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if (zznpVar.zzI(obj, i, i5, i6, i3)) {
                                zzovVar.zzs(i7, unsafe.getObject(obj, j), zznpVar.zzp(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zznz.zza(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 19:
                            zznz.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 20:
                            zznz.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 21:
                            zznz.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 22:
                            zznz.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 23:
                            zznz.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 24:
                            zznz.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 25:
                            zznz.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 26:
                            int i10 = iArr[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i11 = zznz.zza;
                            if (list != null && !list.isEmpty()) {
                                zzovVar.zzF(i10, list);
                                break;
                            }
                            break;
                        case 27:
                            int i12 = iArr[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zznx zzp = zznpVar.zzp(i);
                            int i13 = zznz.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                    ((zzln) zzovVar).zzr(i12, list2.get(i14), zzp);
                                }
                                break;
                            }
                            break;
                        case 28:
                            int i15 = iArr[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i16 = zznz.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzovVar.zzG(i15, list3);
                                break;
                            }
                            break;
                        case 29:
                            zznz.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 30:
                            zznz.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            zznz.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 32:
                            zznz.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 33:
                            zznz.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 34:
                            zznz.zze(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, false);
                            continue;
                        case 35:
                            zznz.zza(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 36:
                            zznz.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 37:
                            zznz.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            zznz.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 39:
                            zznz.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 40:
                            zznz.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 41:
                            zznz.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            zznz.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            zznz.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 44:
                            zznz.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 45:
                            zznz.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            zznz.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            zznz.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 48:
                            zznz.zze(iArr[i], (List) unsafe.getObject(obj, j), zzovVar, true);
                            break;
                        case 49:
                            int i17 = iArr[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zznx zzp2 = zznpVar.zzp(i);
                            int i18 = zznz.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    ((zzln) zzovVar).zzs(i17, list4.get(i19), zzp2);
                                }
                                break;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzovVar.zzM(i7, ((zznf) zznpVar.zzq(i)).zze(), (zzng) object);
                                break;
                            }
                            break;
                        case 51:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzf(i7, zzC(obj, j));
                                break;
                            }
                            break;
                        case 52:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zze(i7, zzD(obj, j));
                                break;
                            }
                            break;
                        case 53:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzc(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 54:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzh(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 55:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzi(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzj(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzk(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzl(i7, zzG(obj, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzP(i7, unsafe.getObject(obj, j), zzovVar);
                                break;
                            }
                            break;
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzr(i7, unsafe.getObject(obj, j), zznpVar.zzp(i));
                                break;
                            }
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzn(i7, (zzlh) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzo(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzg(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzb(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzd(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 66:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzp(i7, zzE(obj, j));
                                break;
                            }
                            break;
                        case 67:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzq(i7, zzF(obj, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zznpVar.zzL(obj, i7, i)) {
                                zzovVar.zzs(i7, unsafe.getObject(obj, j), zznpVar.zzp(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    i4 = 1048575;
                    zznpVar = this;
                }
                if (entry != null) {
                    ((zzmf) obj).zzc.zzg(zzovVar);
                    return;
                } else {
                    throw null;
                }
            }
        }
        entry = null;
        iArr = zznpVar.zzc;
        Unsafe unsafe2 = zzb;
        int i42 = 1048575;
        int i52 = 1048575;
        i = 0;
        int i62 = 0;
        while (i < iArr.length) {
        }
        if (entry != null) {
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzh(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.measurement.zzkw r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznp.zzh(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzkw):int");
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkw zzkwVar) throws IOException {
        zzh(obj, bArr, i, i2, 0, zzkwVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final void zzj(Object obj) {
        if (zzA(obj)) {
            if (obj instanceof zzmf) {
                zzmf zzmfVar = (zzmf) obj;
                zzmfVar.zzcm(Integer.MAX_VALUE);
                zzmfVar.zza = 0;
                zzmfVar.zzcg();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzx = zzx(i);
                int i2 = 1048575 & zzx;
                int zzz = zzz(zzx);
                long j = i2;
                if (zzz != 9) {
                    if (zzz != 60 && zzz != 68) {
                        switch (zzz) {
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
                            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            case 44:
                            case 45:
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            case 48:
                            case 49:
                                ((zzmo) zzop.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzng) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzL(obj, iArr[i], i)) {
                        zzp(i).zzj(zzb.getObject(obj, j));
                    }
                }
                if (zzJ(obj, i)) {
                    zzp(i).zzj(zzb.getObject(obj, j));
                }
            }
            this.zzl.zzb(obj);
            if (this.zzh) {
                this.zzm.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznx
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzx = zzx(i7);
            int i9 = iArr2[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & zzx) != 0 && !zzI(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzz = zzz(zzx);
            if (zzz != 9 && zzz != 17) {
                if (zzz != 27) {
                    if (zzz == 60 || zzz == 68) {
                        if (zzL(obj, i8, i2) && !zzw(obj, zzx, zzp(i2))) {
                            return false;
                        }
                    } else if (zzz != 49) {
                        if (zzz != 50) {
                            continue;
                        } else {
                            zzng zzngVar = (zzng) zzop.zzn(obj, zzx & 1048575);
                            if (!zzngVar.isEmpty() && ((zznf) zzq(i2)).zze().zzc.zza() == zzou.MESSAGE) {
                                zznx zznxVar = null;
                                for (Object obj2 : zzngVar.values()) {
                                    if (zznxVar == null) {
                                        zznxVar = zznu.zza().zzb(obj2.getClass());
                                    }
                                    if (!zznxVar.zzk(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzop.zzn(obj, zzx & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zznx zzp = zzp(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzp.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzI(obj, i2, i, i3, i11) && !zzw(obj, zzx, zzp(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        return !this.zzh || ((zzmc) obj).zzb.zze();
    }
}
