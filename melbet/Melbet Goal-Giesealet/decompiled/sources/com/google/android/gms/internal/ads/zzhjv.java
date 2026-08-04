package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.facebook.soloader.Elf64;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzhjv<T> implements zzhkk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhlc.zzt();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhjs zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhkv zzm;
    private final zzhhs zzn;

    private zzhjv(int[] iArr, Object[] objArr, int i, int i2, zzhjs zzhjsVar, boolean z, int[] iArr2, int i3, int i4, zzhjy zzhjyVar, zzhje zzhjeVar, zzhkv zzhkvVar, zzhhs zzhhsVar, zzhjn zzhjnVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzhjsVar instanceof zzhih;
        boolean z2 = false;
        if (zzhhsVar != null && (zzhjsVar instanceof zzhid)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzhkvVar;
        this.zzn = zzhhsVar;
        this.zzg = zzhjsVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhih) {
            return ((zzhih) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (zzE(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(valueOf)));
    }

    private static double zzG(Object obj, long j) {
        return ((Double) zzhlc.zzn(obj, j)).doubleValue();
    }

    private static float zzH(Object obj, long j) {
        return ((Float) zzhlc.zzn(obj, j)).floatValue();
    }

    private static int zzI(Object obj, long j) {
        return ((Integer) zzhlc.zzn(obj, j)).intValue();
    }

    private static long zzJ(Object obj, long j) {
        return ((Long) zzhlc.zzn(obj, j)).longValue();
    }

    private static boolean zzK(Object obj, long j) {
        return ((Boolean) zzhlc.zzn(obj, j)).booleanValue();
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private final boolean zzM(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzN(obj, i) : (i3 & i4) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int zzB = zzB(i);
        long j = zzB & 1048575;
        if (j != 1048575) {
            return (zzhlc.zzd(obj, j) & (1 << (zzB >>> 20))) != 0;
        }
        int zzA = zzA(i);
        long j2 = zzA & 1048575;
        switch (zzC(zzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzhlc.zzl(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhlc.zzj(obj, j2)) != 0;
            case 2:
                return zzhlc.zzf(obj, j2) != 0;
            case 3:
                return zzhlc.zzf(obj, j2) != 0;
            case 4:
                return zzhlc.zzd(obj, j2) != 0;
            case 5:
                return zzhlc.zzf(obj, j2) != 0;
            case 6:
                return zzhlc.zzd(obj, j2) != 0;
            case 7:
                return zzhlc.zzh(obj, j2);
            case 8:
                Object zzn = zzhlc.zzn(obj, j2);
                if (zzn instanceof String) {
                    return !((String) zzn).isEmpty();
                }
                if (zzn instanceof zzhhb) {
                    return !zzhhb.zzb.equals(zzn);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhlc.zzn(obj, j2) != null;
            case 10:
                return !zzhhb.zzb.equals(zzhlc.zzn(obj, j2));
            case 11:
                return zzhlc.zzd(obj, j2) != 0;
            case 12:
                return zzhlc.zzd(obj, j2) != 0;
            case 13:
                return zzhlc.zzd(obj, j2) != 0;
            case 14:
                return zzhlc.zzf(obj, j2) != 0;
            case 15:
                return zzhlc.zzd(obj, j2) != 0;
            case 16:
                return zzhlc.zzf(obj, j2) != 0;
            case 17:
                return zzhlc.zzn(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void zzO(Object obj, int i) {
        int zzB = zzB(i);
        long j = 1048575 & zzB;
        if (j == 1048575) {
            return;
        }
        zzhlc.zze(obj, j, (1 << (zzB >>> 20)) | zzhlc.zzd(obj, j));
    }

    private final boolean zzP(Object obj, int i, int i2) {
        return zzhlc.zzd(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final void zzQ(Object obj, int i, int i2) {
        zzhlc.zze(obj, zzB(i2) & 1048575, i);
    }

    private final int zzR(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzS(i, 0);
    }

    private final int zzS(int i, int i2) {
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

    private static final int zzT(byte[] bArr, int i, int i2, zzhli zzhliVar, Class cls, zzhgp zzhgpVar) throws IOException {
        zzhli zzhliVar2 = zzhli.DOUBLE;
        switch (zzhliVar) {
            case DOUBLE:
                int i3 = i + 8;
                zzhgpVar.zzc = Double.valueOf(Double.longBitsToDouble(zzhgq.zze(bArr, i)));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                zzhgpVar.zzc = Float.valueOf(Float.intBitsToFloat(zzhgq.zzd(bArr, i)));
                return i4;
            case INT64:
            case UINT64:
                int zzc = zzhgq.zzc(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Long.valueOf(zzhgpVar.zzb);
                return zzc;
            case INT32:
            case UINT32:
            case ENUM:
                int zza2 = zzhgq.zza(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Integer.valueOf(zzhgpVar.zza);
                return zza2;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                zzhgpVar.zzc = Long.valueOf(zzhgq.zze(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                zzhgpVar.zzc = Integer.valueOf(zzhgq.zzd(bArr, i));
                return i6;
            case BOOL:
                int zzc2 = zzhgq.zzc(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Boolean.valueOf(zzhgpVar.zzb != 0);
                return zzc2;
            case STRING:
                return zzhgq.zzf(bArr, i, zzhgpVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzhgq.zzh(zzhkc.zza().zzb(cls), bArr, i, i2, zzhgpVar);
            case BYTES:
                return zzhgq.zzg(bArr, i, zzhgpVar);
            case SINT32:
                int zza3 = zzhgq.zza(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Integer.valueOf(zzhhg.zzK(zzhgpVar.zza));
                return zza3;
            case SINT64:
                int zzc3 = zzhgq.zzc(bArr, i, zzhgpVar);
                zzhgpVar.zzc = Long.valueOf(zzhhg.zzL(zzhgpVar.zzb));
                return zzc3;
        }
    }

    private static final void zzU(int i, Object obj, zzhlk zzhlkVar) throws IOException {
        if (obj instanceof String) {
            zzhlkVar.zzm(i, (String) obj);
        } else {
            zzhlkVar.zzn(i, (zzhhb) obj);
        }
    }

    static zzhkw zzh(Object obj) {
        zzhih zzhihVar = (zzhih) obj;
        zzhkw zzhkwVar = zzhihVar.zzt;
        if (zzhkwVar != zzhkw.zza()) {
            return zzhkwVar;
        }
        zzhkw zzb2 = zzhkw.zzb();
        zzhihVar.zzt = zzb2;
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
    static zzhjv zzm(Class cls, zzhjp zzhjpVar, zzhjy zzhjyVar, zzhje zzhjeVar, zzhkv zzhkvVar, zzhhs zzhhsVar, zzhjn zzhjnVar) {
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
        Field zzn;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field zzn2;
        Object obj2;
        Field zzn3;
        int i30;
        char charAt11;
        int i31;
        char charAt12;
        int i32;
        char charAt13;
        int i33;
        char charAt14;
        if (!(zzhjpVar instanceof zzhke)) {
            throw null;
        }
        zzhke zzhkeVar = (zzhke) zzhjpVar;
        String zzd = zzhkeVar.zzd();
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
        Object[] zze = zzhkeVar.zze();
        Class<?> cls2 = zzhkeVar.zzb().getClass();
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
            zzhke zzhkeVar2 = zzhkeVar;
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
                        if (zzhkeVar2.zzc() == 1 || i79 != 0) {
                            i28 = i6 + 1;
                            int i87 = i69 / 3;
                            objArr[i87 + i87 + 1] = zze[i6];
                        } else {
                            i29 = 0;
                            int i88 = charAt25 + charAt25;
                            obj = zze[i88];
                            int i89 = i29;
                            if (obj instanceof Field) {
                                zzn2 = (Field) obj;
                            } else {
                                zzn2 = zzn(cls2, (String) obj);
                                zze[i88] = zzn2;
                            }
                            int i90 = i7;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                            int i91 = i88 + 1;
                            obj2 = zze[i91];
                            i19 = i90;
                            if (obj2 instanceof Field) {
                                zzn3 = (Field) obj2;
                            } else {
                                zzn3 = zzn(cls2, (String) obj2);
                                zze[i91] = zzn3;
                            }
                            i21 = (int) unsafe.objectFieldOffset(zzn3);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                    int i912 = i882 + 1;
                    obj2 = zze[i912];
                    i19 = i902;
                    if (obj2 instanceof Field) {
                    }
                    i21 = (int) unsafe.objectFieldOffset(zzn3);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn2);
                int i9122 = i8822 + 1;
                obj2 = zze[i9122];
                i19 = i9022;
                if (obj2 instanceof Field) {
                }
                i21 = (int) unsafe.objectFieldOffset(zzn3);
                str = zzd;
                i23 = i8922;
                i17 = i84;
                i22 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i7;
                int i92 = i6 + 1;
                Field zzn4 = zzn(cls2, (String) zze[i6]);
                if (i78 == 9 || i78 == 17) {
                    i20 = i92;
                    int i93 = i69 / 3;
                    objArr[i93 + i93 + 1] = zzn4.getType();
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
                        if (zzhkeVar2.zzc() == 1 || i79 != 0) {
                            i6 += 2;
                            int i94 = i69 / 3;
                            objArr[i94 + i94 + 1] = zze[i92];
                            str = zzd;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                                    zzn = (Field) obj3;
                                } else {
                                    zzn = zzn(cls2, (String) obj3);
                                    zze[i98] = zzn;
                                }
                                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzn);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzn4);
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
            zzhkeVar = zzhkeVar2;
            length = i18;
            i7 = i19;
        }
        return new zzhjv(iArr3, objArr, i2, i4, zzhkeVar.zzb(), false, iArr, i5, i64, zzhjyVar, zzhjeVar, zzhkvVar, zzhhsVar, zzhjnVar);
    }

    private static Field zzn(Class cls, String str) {
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

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
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
            zzhkk zzq = zzq(i);
            if (!zzN(obj, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzP(obj2, i2, i)) {
            int zzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzA;
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
            zzhkk zzq = zzq(i);
            if (!zzP(obj, i2, i)) {
                if (zzE(object)) {
                    Object zza2 = zzq.zza();
                    zzq.zzd(zza2, object);
                    unsafe.putObject(obj, j, zza2);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzQ(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object zza3 = zzq.zza();
                zzq.zzd(zza3, object2);
                unsafe.putObject(obj, j, zza3);
                object2 = zza3;
            }
            zzq.zzd(object2, object);
        }
    }

    private final zzhkk zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzhkk zzhkkVar = (zzhkk) objArr[i3];
        if (zzhkkVar != null) {
            return zzhkkVar;
        }
        zzhkk zzb2 = zzhkc.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzb2;
        return zzb2;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zzhin zzs(int i) {
        int i2 = i / 3;
        return (zzhin) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zzhkk zzq = zzq(i);
        int zzA = zzA(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzO(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zzhkk zzq = zzq(i2);
        if (!zzP(obj, i, i2)) {
            return zzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object zza2 = zzq.zza();
        if (object != null) {
            zzq.zzd(zza2, object);
        }
        return zza2;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzQ(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zzhkv zzhkvVar, Object obj3) {
        zzhin zzs;
        int i2 = this.zzc[i];
        Object zzn = zzhlc.zzn(obj, zzA(i) & 1048575);
        if (zzn == null || (zzs = zzs(i)) == null) {
            return obj2;
        }
        zzhjk zze = ((zzhjl) zzr(i)).zze();
        Iterator it = ((zzhjm) zzn).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzhkvVar.zzh(obj3);
                }
                int zzc = zzhjl.zzc(zze, entry.getKey(), entry.getValue());
                zzhhb zzhhbVar = zzhhb.zzb;
                byte[] bArr = new byte[zzc];
                int i3 = zzhhm.zzf;
                zzhhj zzhhjVar = new zzhhj(bArr, 0, zzc);
                try {
                    zzhjl.zzb(zzhhjVar, zze, entry.getKey(), entry.getValue());
                    zzhkvVar.zzd(obj2, i2, zzhgx.zza(zzhhjVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zzhkk zzhkkVar) {
        return zzhkkVar.zzl(zzhlc.zzn(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzhkf zzhkfVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zzhlc.zzo(obj, j, zzhkfVar.zzn());
        } else if (this.zzi) {
            zzhlc.zzo(obj, j, zzhkfVar.zzm());
        } else {
            zzhlc.zzo(obj, j, zzhkfVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final Object zza() {
        return ((zzhih) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final boolean zzb(Object obj, Object obj2) {
        boolean zzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzA = zzA(i);
            long j = zzA & 1048575;
            switch (zzC(zzA)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzhlc.zzl(obj, j)) == Double.doubleToLongBits(zzhlc.zzl(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzhlc.zzj(obj, j)) == Float.floatToIntBits(zzhlc.zzj(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzhlc.zzf(obj, j) == zzhlc.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzhlc.zzf(obj, j) == zzhlc.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzhlc.zzd(obj, j) == zzhlc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzhlc.zzf(obj, j) == zzhlc.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzhlc.zzd(obj, j) == zzhlc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzhlc.zzh(obj, j) == zzhlc.zzh(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzhlc.zzd(obj, j) == zzhlc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzhlc.zzd(obj, j) == zzhlc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzhlc.zzd(obj, j) == zzhlc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzhlc.zzf(obj, j) == zzhlc.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzhlc.zzd(obj, j) == zzhlc.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzhlc.zzf(obj, j) == zzhlc.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
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
                case 48:
                case 49:
                    zzG = zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j));
                    break;
                case 50:
                    zzG = zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case 54:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                case 59:
                case 60:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case 67:
                case 68:
                    long zzB = zzB(i) & 1048575;
                    if (zzhlc.zzd(obj, zzB) == zzhlc.zzd(obj2, zzB) && zzhkm.zzG(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzG) {
                return false;
            }
        }
        if (!((zzhih) obj).zzt.equals(((zzhih) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzhid) obj).zza.equals(((zzhid) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
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
                int hashCode = (i4 * 53) + ((zzhih) obj).zzt.hashCode();
                return this.zzh ? (hashCode * 53) + ((zzhid) obj).zza.zza.hashCode() : hashCode;
            }
            int zzA = zzA(i3);
            int i5 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i6 = iArr[i3];
            long j = i5;
            int i7 = 37;
            switch (zzC) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhlc.zzl(obj, j));
                    byte[] bArr = zzhiu.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 1:
                    i = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhlc.zzj(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr2 = zzhiu.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr3 = zzhiu.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 4:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr4 = zzhiu.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 6:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 7:
                    i = i4 * 53;
                    floatToIntBits = zzhiu.zzb(zzhlc.zzh(obj, j));
                    i4 = i + floatToIntBits;
                    break;
                case 8:
                    i = i4 * 53;
                    floatToIntBits = ((String) zzhlc.zzn(obj, j)).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 9:
                    i2 = i4 * 53;
                    Object zzn = zzhlc.zzn(obj, j);
                    if (zzn != null) {
                        i7 = zzn.hashCode();
                    }
                    i4 = i2 + i7;
                    break;
                case 10:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 11:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 12:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 13:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr5 = zzhiu.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 15:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzd(obj, j);
                    i4 = i + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzhlc.zzf(obj, j);
                    byte[] bArr6 = zzhiu.zzb;
                    floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + floatToIntBits;
                    break;
                case 17:
                    i2 = i4 * 53;
                    Object zzn2 = zzhlc.zzn(obj, j);
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
                case 48:
                case 49:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case 50:
                    i = i4 * 53;
                    floatToIntBits = zzhlc.zzn(obj, j).hashCode();
                    i4 = i + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzG(obj, j));
                        byte[] bArr7 = zzhiu.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 52:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzH(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr8 = zzhiu.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 54:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr9 = zzhiu.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 56:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr10 = zzhiu.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 57:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzhiu.zzb(zzK(obj, j));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 59:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = ((String) zzhlc.zzn(obj, j)).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 60:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzhlc.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzhlc.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 64:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr11 = zzhiu.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzI(obj, j);
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 67:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        doubleToLongBits = zzJ(obj, j);
                        byte[] bArr12 = zzhiu.zzb;
                        floatToIntBits = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + floatToIntBits;
                        break;
                    }
                case 68:
                    if (!zzP(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        floatToIntBits = zzhlc.zzn(obj, j).hashCode();
                        i4 = i + floatToIntBits;
                        break;
                    }
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzhkm.zzI(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzhkm.zzH(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int zzA = zzA(i);
            int i2 = 1048575 & zzA;
            int zzC = zzC(zzA);
            int i3 = iArr[i];
            long j = i2;
            switch (zzC) {
                case 0:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzm(obj, j, zzhlc.zzl(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 1:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzk(obj, j, zzhlc.zzj(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 2:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 3:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 4:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 5:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 6:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 7:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzi(obj, j, zzhlc.zzh(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 8:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzo(obj, j, zzhlc.zzn(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzo(obj, j, zzhlc.zzn(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 11:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 12:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 13:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 14:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 15:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zze(obj, j, zzhlc.zzd(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 16:
                    if (!zzN(obj2, i)) {
                        break;
                    } else {
                        zzhlc.zzg(obj, j, zzhlc.zzf(obj2, j));
                        zzO(obj, i);
                        break;
                    }
                case 17:
                    zzo(obj, obj2, i);
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
                case 48:
                case 49:
                    zzhit zzhitVar = (zzhit) zzhlc.zzn(obj, j);
                    zzhit zzhitVar2 = (zzhit) zzhlc.zzn(obj2, j);
                    int size = zzhitVar.size();
                    int size2 = zzhitVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhitVar.zza()) {
                            zzhitVar = zzhitVar.zzh(size2 + size);
                        }
                        zzhitVar.addAll(zzhitVar2);
                    }
                    if (size > 0) {
                        zzhitVar2 = zzhitVar;
                    }
                    zzhlc.zzo(obj, j, zzhitVar2);
                    break;
                case 50:
                    int i4 = zzhkm.zza;
                    zzhlc.zzo(obj, j, zzhjn.zzb(zzhlc.zzn(obj, j), zzhlc.zzn(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case 52:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case 54:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                case 59:
                    if (!zzP(obj2, i3, i)) {
                        break;
                    } else {
                        zzhlc.zzo(obj, j, zzhlc.zzn(obj2, j));
                        zzQ(obj, i3, i);
                        break;
                    }
                case 60:
                    zzp(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case 67:
                    if (!zzP(obj2, i3, i)) {
                        break;
                    } else {
                        zzhlc.zzo(obj, j, zzhlc.zzn(obj2, j));
                        zzQ(obj, i3, i);
                        break;
                    }
                case 68:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final int zze(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzB;
        int zzA3;
        int zzA4;
        int zzA5;
        int zzc;
        int zzA6;
        int zzD;
        int zzs;
        int size;
        int zzt;
        int zzA7;
        int zzA8;
        int zzaT;
        int zzA9;
        int zzA10;
        int i2;
        int zzB2;
        int zzA11;
        int zzA12;
        int i3;
        int zzA13;
        int zzA14;
        int zzA15;
        int zzc2;
        int zzA16;
        zzhjv<T> zzhjvVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = zzhjvVar.zzc;
            if (i4 >= iArr.length) {
                int zzi = i6 + ((zzhih) obj).zzt.zzi();
                if (!zzhjvVar.zzh) {
                    return zzi;
                }
                zzhkr zzhkrVar = ((zzhid) obj).zza.zza;
                int zzc3 = zzhkrVar.zzc();
                int i8 = 0;
                for (int i9 = 0; i9 < zzc3; i9++) {
                    Map.Entry zzd = zzhkrVar.zzd(i9);
                    i8 += zzhhw.zzj((zzhhv) ((zzhko) zzd).zza(), zzd.getValue());
                }
                for (Map.Entry entry : zzhkrVar.zze()) {
                    i8 += zzhhw.zzj((zzhhv) entry.getKey(), entry.getValue());
                }
                return zzi + i8;
            }
            int zzA17 = zzhjvVar.zzA(i4);
            int zzC = zzC(zzA17);
            int i10 = iArr[i4];
            int i11 = iArr[i4 + 2];
            int i12 = i11 & 1048575;
            if (zzC <= 17) {
                if (i12 != i7) {
                    i5 = i12 == 1048575 ? 0 : unsafe.getInt(obj2, i12);
                    i7 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = zzA17 & 1048575;
            if (zzC >= zzhhx.DOUBLE_LIST_PACKED.zza()) {
                zzhhx.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzC) {
                case 0:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        i6 += zzhhm.zzA(i10 << 3) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzA = zzhhm.zzA(i10 << 3);
                        zzA4 = zzA + 4;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 2:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzA2 = zzhhm.zzA(i10 << 3);
                        zzB = zzhhm.zzB(j2);
                        zzA4 = zzA2 + zzB;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 3:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzA2 = zzhhm.zzA(i10 << 3);
                        zzB = zzhhm.zzB(j3);
                        zzA4 = zzA2 + zzB;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 4:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        long j4 = unsafe.getInt(obj2, j);
                        zzA2 = zzhhm.zzA(i10 << 3);
                        zzB = zzhhm.zzB(j4);
                        zzA4 = zzA2 + zzB;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 5:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzA3 = zzhhm.zzA(i10 << 3);
                        zzA4 = zzA3 + 8;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 6:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzA = zzhhm.zzA(i10 << 3);
                        zzA4 = zzA + 4;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 7:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzA4 = zzhhm.zzA(i10 << 3) + 1;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 8:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzhhb) {
                            zzA5 = zzhhm.zzA(i14);
                            zzc = ((zzhhb) object).zzc();
                            zzA6 = zzhhm.zzA(zzc);
                            zzA4 = zzA5 + zzA6 + zzc;
                            i6 += zzA4;
                        } else {
                            zzA2 = zzhhm.zzA(i14);
                            zzB = zzhhm.zzC((String) object);
                            zzA4 = zzA2 + zzB;
                            i6 += zzA4;
                        }
                    }
                    zzhjvVar = this;
                    break;
                case 9:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzD = zzhkm.zzD(i10, unsafe.getObject(obj2, j), zzhjvVar.zzq(i4));
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzhhb zzhhbVar = (zzhhb) unsafe.getObject(obj2, j);
                        zzA5 = zzhhm.zzA(i10 << 3);
                        zzc = zzhhbVar.zzc();
                        zzA6 = zzhhm.zzA(zzc);
                        zzA4 = zzA5 + zzA6 + zzc;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 11:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        int i15 = unsafe.getInt(obj2, j);
                        zzA2 = zzhhm.zzA(i10 << 3);
                        zzB = zzhhm.zzA(i15);
                        zzA4 = zzA2 + zzB;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 12:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        long j5 = unsafe.getInt(obj2, j);
                        zzA2 = zzhhm.zzA(i10 << 3);
                        zzB = zzhhm.zzB(j5);
                        zzA4 = zzA2 + zzB;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 13:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzA = zzhhm.zzA(i10 << 3);
                        zzA4 = zzA + 4;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 14:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzA3 = zzhhm.zzA(i10 << 3);
                        zzA4 = zzA3 + 8;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 15:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        int i16 = unsafe.getInt(obj2, j);
                        zzA2 = zzhhm.zzA(i10 << 3);
                        zzB = zzhhm.zzA((i16 >> 31) ^ (i16 + i16));
                        zzA4 = zzA2 + zzB;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 16:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        long j6 = unsafe.getLong(obj2, j);
                        zzA2 = zzhhm.zzA(i10 << 3);
                        zzB = zzhhm.zzB((j6 >> 63) ^ (j6 + j6));
                        zzA4 = zzA2 + zzB;
                        i6 += zzA4;
                    }
                    zzhjvVar = this;
                    break;
                case 17:
                    if (zzhjvVar.zzM(obj2, i4, i7, i5, i)) {
                        zzD = zzhkm.zzE(i10, (zzhjs) unsafe.getObject(obj2, j), zzhjvVar.zzq(i4));
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzD = zzhkm.zzC(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 19:
                    zzD = zzhkm.zzA(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i17 = zzhkm.zza;
                    if (list.size() != 0) {
                        zzs = zzhkm.zzs(list) + (list.size() * zzhhm.zzA(i10 << 3));
                        i6 += zzs;
                        break;
                    }
                    zzs = 0;
                    i6 += zzs;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i18 = zzhkm.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzt = zzhkm.zzt(list2);
                        zzA7 = zzhhm.zzA(i10 << 3);
                        i2 = size * zzA7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzhkm.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzt = zzhkm.zzw(list3);
                        zzA7 = zzhhm.zzA(i10 << 3);
                        i2 = size * zzA7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 23:
                    zzD = zzhkm.zzC(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 24:
                    zzD = zzhkm.zzA(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i20 = zzhkm.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzD = size2 * (zzhhm.zzA(i10 << 3) + 1);
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    int i21 = zzhkm.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzs = zzhhm.zzA(i10 << 3) * size3;
                        if (list5 instanceof zzhjd) {
                            zzhjd zzhjdVar = (zzhjd) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzc4 = zzhjdVar.zzc();
                                if (zzc4 instanceof zzhhb) {
                                    int zzc5 = ((zzhhb) zzc4).zzc();
                                    zzs += zzhhm.zzA(zzc5) + zzc5;
                                } else {
                                    zzs += zzhhm.zzC((String) zzc4);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj3 = list5.get(i23);
                                if (obj3 instanceof zzhhb) {
                                    int zzc6 = ((zzhhb) obj3).zzc();
                                    zzs += zzhhm.zzA(zzc6) + zzc6;
                                } else {
                                    zzs += zzhhm.zzC((String) obj3);
                                }
                            }
                        }
                        i6 += zzs;
                        break;
                    }
                    zzs = 0;
                    i6 += zzs;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    zzhkk zzq = zzhjvVar.zzq(i4);
                    int i24 = zzhkm.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzA8 = 0;
                    } else {
                        zzA8 = zzhhm.zzA(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj4 = list6.get(i25);
                            if (obj4 instanceof zzhjc) {
                                zzaT = ((zzhjc) obj4).zzb();
                                zzA9 = zzhhm.zzA(zzaT);
                            } else {
                                zzaT = ((zzhgk) obj4).zzaT(zzq);
                                zzA9 = zzhhm.zzA(zzaT);
                            }
                            zzA8 += zzA9 + zzaT;
                        }
                    }
                    i6 += zzA8;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzhkm.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzA10 = 0;
                    } else {
                        zzA10 = size5 * zzhhm.zzA(i10 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzc7 = ((zzhhb) list7.get(i27)).zzc();
                            zzA10 += zzhhm.zzA(zzc7) + zzc7;
                        }
                    }
                    i6 += zzA10;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzhkm.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzt = zzhkm.zzx(list8);
                        zzA7 = zzhhm.zzA(i10 << 3);
                        i2 = size * zzA7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzhkm.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzt = zzhkm.zzv(list9);
                        zzA7 = zzhhm.zzA(i10 << 3);
                        i2 = size * zzA7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    zzD = zzhkm.zzA(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 32:
                    zzD = zzhkm.zzC(i10, (List) unsafe.getObject(obj2, j), false);
                    i6 += zzD;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i30 = zzhkm.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzt = zzhkm.zzy(list10);
                        zzA7 = zzhhm.zzA(i10 << 3);
                        i2 = size * zzA7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    int i31 = zzhkm.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzt = zzhkm.zzu(list11);
                        zzA7 = zzhhm.zzA(i10 << 3);
                        i2 = size * zzA7;
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    }
                    zzD = 0;
                    i6 += zzD;
                case 35:
                    zzB2 = zzhkm.zzB((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzB2 = zzhkm.zzz((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzB2 = zzhkm.zzs((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzB2 = zzhkm.zzt((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzB2 = zzhkm.zzw((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzB2 = zzhkm.zzB((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzB2 = zzhkm.zzz((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, j);
                    int i32 = zzhkm.zza;
                    zzB2 = list12.size();
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzB2 = zzhkm.zzx((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzB2 = zzhkm.zzv((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzB2 = zzhkm.zzz((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzB2 = zzhkm.zzB((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzB2 = zzhkm.zzy((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzB2 = zzhkm.zzu((List) unsafe.getObject(obj2, j));
                    if (zzB2 > 0) {
                        zzA11 = zzhhm.zzA(i10 << 3);
                        zzA12 = zzhhm.zzA(zzB2);
                        zzA10 = zzA11 + zzA12 + zzB2;
                        i6 += zzA10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj2, j);
                    zzhkk zzq2 = zzhjvVar.zzq(i4);
                    int i33 = zzhkm.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i3 += zzhkm.zzE(i10, (zzhjs) list13.get(i34), zzq2);
                        }
                    }
                    i6 += i3;
                    break;
                case 50:
                    zzhjm zzhjmVar = (zzhjm) unsafe.getObject(obj2, j);
                    zzhjl zzhjlVar = (zzhjl) zzhjvVar.zzr(i4);
                    if (!zzhjmVar.isEmpty()) {
                        zzs = 0;
                        for (Map.Entry entry2 : zzhjmVar.entrySet()) {
                            zzs += zzhjlVar.zzd(i10, entry2.getKey(), entry2.getValue());
                        }
                        i6 += zzs;
                        break;
                    }
                    zzs = 0;
                    i6 += zzs;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzA13 = zzhhm.zzA(i10 << 3);
                        zzD = zzA13 + 8;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzA14 = zzhhm.zzA(i10 << 3);
                        zzD = zzA14 + 4;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        long zzJ = zzJ(obj2, j);
                        zzt = zzhhm.zzA(i10 << 3);
                        i2 = zzhhm.zzB(zzJ);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        long zzJ2 = zzJ(obj2, j);
                        zzt = zzhhm.zzA(i10 << 3);
                        i2 = zzhhm.zzB(zzJ2);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        long zzI = zzI(obj2, j);
                        zzt = zzhhm.zzA(i10 << 3);
                        i2 = zzhhm.zzB(zzI);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzA13 = zzhhm.zzA(i10 << 3);
                        zzD = zzA13 + 8;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzA14 = zzhhm.zzA(i10 << 3);
                        zzD = zzA14 + 4;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzD = zzhhm.zzA(i10 << 3) + 1;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzhjvVar.zzP(obj2, i10, i4)) {
                        break;
                    } else {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzhhb) {
                            zzA15 = zzhhm.zzA(i35);
                            zzc2 = ((zzhhb) object2).zzc();
                            zzA16 = zzhhm.zzA(zzc2);
                            zzD = zzA15 + zzA16 + zzc2;
                            i6 += zzD;
                            break;
                        } else {
                            zzt = zzhhm.zzA(i35);
                            i2 = zzhhm.zzC((String) object2);
                            zzD = zzt + i2;
                            i6 += zzD;
                        }
                    }
                case 60:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzD = zzhkm.zzD(i10, unsafe.getObject(obj2, j), zzhjvVar.zzq(i4));
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzhhb zzhhbVar2 = (zzhhb) unsafe.getObject(obj2, j);
                        zzA15 = zzhhm.zzA(i10 << 3);
                        zzc2 = zzhhbVar2.zzc();
                        zzA16 = zzhhm.zzA(zzc2);
                        zzD = zzA15 + zzA16 + zzc2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        int zzI2 = zzI(obj2, j);
                        zzt = zzhhm.zzA(i10 << 3);
                        i2 = zzhhm.zzA(zzI2);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        long zzI3 = zzI(obj2, j);
                        zzt = zzhhm.zzA(i10 << 3);
                        i2 = zzhhm.zzB(zzI3);
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzA14 = zzhhm.zzA(i10 << 3);
                        zzD = zzA14 + 4;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzA13 = zzhhm.zzA(i10 << 3);
                        zzD = zzA13 + 8;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        int zzI4 = zzI(obj2, j);
                        zzt = zzhhm.zzA(i10 << 3);
                        i2 = zzhhm.zzA((zzI4 >> 31) ^ (zzI4 + zzI4));
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        long zzJ3 = zzJ(obj2, j);
                        zzt = zzhhm.zzA(i10 << 3);
                        i2 = zzhhm.zzB((zzJ3 >> 63) ^ (zzJ3 + zzJ3));
                        zzD = zzt + i2;
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzhjvVar.zzP(obj2, i10, i4)) {
                        zzD = zzhkm.zzE(i10, (zzhjs) unsafe.getObject(obj2, j), zzhjvVar.zzq(i4));
                        i6 += zzD;
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            obj2 = obj;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.ads.zzhkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(Object obj, zzhlk zzhlkVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int[] iArr;
        int i;
        boolean z;
        Map.Entry entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        zzhjv<T> zzhjvVar = this;
        if (zzhjvVar.zzh) {
            zzhhw zzhhwVar = ((zzhid) obj).zza;
            if (!zzhhwVar.zza.isEmpty()) {
                Iterator zzc = zzhhwVar.zzc();
                entry = (Map.Entry) zzc.next();
                it = zzc;
                iArr = zzhjvVar.zzc;
                Unsafe unsafe = zzb;
                int i6 = 1048575;
                int i7 = 1048575;
                i = 0;
                int i8 = 0;
                while (i < iArr.length) {
                    int zzA = zzhjvVar.zzA(i);
                    int zzC = zzC(zzA);
                    int i9 = iArr[i];
                    if (zzC <= 17) {
                        int i10 = iArr[i + 2];
                        z = true;
                        int i11 = i10 & i6;
                        if (i11 != i7) {
                            i8 = i11 == i6 ? 0 : unsafe.getInt(obj, i11);
                            i7 = i11;
                        }
                        int i12 = 1 << (i10 >>> 20);
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = i12;
                    } else {
                        z = true;
                        entry2 = entry;
                        i2 = i7;
                        i3 = i8;
                        i4 = 0;
                    }
                    while (true) {
                        if (entry2 != null) {
                            zzhhs zzhhsVar = zzhjvVar.zzn;
                            i5 = i6;
                            if (((zzhie) entry2.getKey()).zza <= i9) {
                                zzhhsVar.zzb(zzhlkVar, entry2);
                                if (it.hasNext()) {
                                    entry2 = (Map.Entry) it.next();
                                    i6 = i5;
                                } else {
                                    i6 = i5;
                                    entry2 = null;
                                }
                            }
                        } else {
                            i5 = i6;
                        }
                    }
                    long j = zzA & i5;
                    switch (zzC) {
                        case 0:
                            if (!zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzhlkVar.zzf(i9, zzhlc.zzl(obj, j));
                                break;
                            }
                        case 1:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zze(i9, zzhlc.zzj(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 2:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzc(i9, unsafe.getLong(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 3:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzh(i9, unsafe.getLong(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 4:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzi(i9, unsafe.getInt(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 5:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzj(i9, unsafe.getLong(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 6:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzk(i9, unsafe.getInt(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 7:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzl(i9, zzhlc.zzh(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 8:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzU(i9, unsafe.getObject(obj, j), zzhlkVar);
                            }
                            zzhjvVar = this;
                            break;
                        case 9:
                            if (!zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzhlkVar.zzr(i9, unsafe.getObject(obj, j), zzhjvVar.zzq(i));
                                break;
                            }
                        case 10:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzn(i9, (zzhhb) unsafe.getObject(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 11:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzo(i9, unsafe.getInt(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 12:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzg(i9, unsafe.getInt(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 13:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzb(i9, unsafe.getInt(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 14:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzd(i9, unsafe.getLong(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 15:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzp(i9, unsafe.getInt(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 16:
                            if (zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                zzhlkVar.zzq(i9, unsafe.getLong(obj, j));
                            }
                            zzhjvVar = this;
                            break;
                        case 17:
                            if (!zzhjvVar.zzM(obj, i, i2, i3, i4)) {
                                break;
                            } else {
                                zzhlkVar.zzs(i9, unsafe.getObject(obj, j), zzhjvVar.zzq(i));
                                break;
                            }
                        case 18:
                            zzhkm.zza(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 19:
                            zzhkm.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 20:
                            zzhkm.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 21:
                            zzhkm.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 22:
                            zzhkm.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 23:
                            zzhkm.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 24:
                            zzhkm.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 25:
                            zzhkm.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 26:
                            zzhkm.zzo(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar);
                            break;
                        case 27:
                            zzhkm.zzq(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, zzhjvVar.zzq(i));
                            break;
                        case 28:
                            zzhkm.zzp(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar);
                            break;
                        case 29:
                            zzhkm.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 30:
                            zzhkm.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                            zzhkm.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 32:
                            zzhkm.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 33:
                            zzhkm.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 34:
                            zzhkm.zze(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, false);
                            break;
                        case 35:
                            zzhkm.zza(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 36:
                            zzhkm.zzb(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 37:
                            zzhkm.zzc(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 38:
                            zzhkm.zzd(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 39:
                            zzhkm.zzh(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 40:
                            zzhkm.zzf(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 41:
                            zzhkm.zzk(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 42:
                            zzhkm.zzn(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 43:
                            zzhkm.zzi(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 44:
                            zzhkm.zzm(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 45:
                            zzhkm.zzl(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 46:
                            zzhkm.zzg(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 47:
                            zzhkm.zzj(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 48:
                            zzhkm.zze(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, z);
                            break;
                        case 49:
                            zzhkm.zzr(iArr[i], (List) unsafe.getObject(obj, j), zzhlkVar, zzhjvVar.zzq(i));
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                zzhlkVar.zzM(i9, ((zzhjl) zzhjvVar.zzr(i)).zze(), (zzhjm) object);
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzf(i9, zzG(obj, j));
                            }
                            break;
                        case 52:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zze(i9, zzH(obj, j));
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzc(i9, zzJ(obj, j));
                            }
                            break;
                        case 54:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzh(i9, zzJ(obj, j));
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzi(i9, zzI(obj, j));
                            }
                            break;
                        case 56:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzj(i9, zzJ(obj, j));
                            }
                            break;
                        case 57:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzk(i9, zzI(obj, j));
                            }
                            break;
                        case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzl(i9, zzK(obj, j));
                            }
                            break;
                        case 59:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzU(i9, unsafe.getObject(obj, j), zzhlkVar);
                            }
                            break;
                        case 60:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzr(i9, unsafe.getObject(obj, j), zzhjvVar.zzq(i));
                            }
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzn(i9, (zzhhb) unsafe.getObject(obj, j));
                            }
                            break;
                        case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzo(i9, zzI(obj, j));
                            }
                            break;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzg(i9, zzI(obj, j));
                            }
                            break;
                        case 64:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzb(i9, zzI(obj, j));
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzd(i9, zzJ(obj, j));
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzp(i9, zzI(obj, j));
                            }
                            break;
                        case 67:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzq(i9, zzJ(obj, j));
                            }
                            break;
                        case 68:
                            if (zzhjvVar.zzP(obj, i9, i)) {
                                zzhlkVar.zzs(i9, unsafe.getObject(obj, j), zzhjvVar.zzq(i));
                            }
                            break;
                    }
                    i += 3;
                    i8 = i3;
                    i6 = i5;
                    i7 = i2;
                    entry = entry2;
                }
                while (entry != null) {
                    zzhjvVar.zzn.zzb(zzhlkVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((zzhih) obj).zzt.zzg(zzhlkVar);
            }
        }
        entry = null;
        it = null;
        iArr = zzhjvVar.zzc;
        Unsafe unsafe2 = zzb;
        int i62 = 1048575;
        int i72 = 1048575;
        i = 0;
        int i82 = 0;
        while (i < iArr.length) {
        }
        while (entry != null) {
        }
        ((zzhih) obj).zzt.zzg(zzhlkVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x05a1 A[LOOP:1: B:35:0x059d->B:37:0x05a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x056a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(Object obj, zzhkf zzhkfVar, zzhhr zzhhrVar) throws IOException {
        zzhjv<T> zzhjvVar;
        Object obj2;
        Throwable th;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        zzhjv<T> zzhjvVar2;
        List zza2;
        zzhhrVar.getClass();
        zzF(obj);
        zzhkv zzhkvVar = this.zzm;
        Object obj6 = null;
        while (true) {
            try {
                int zzb2 = zzhkfVar.zzb();
                int zzR = zzR(zzb2);
                if (zzR >= 0) {
                    obj5 = obj;
                    zzhjvVar2 = this;
                    try {
                        int zzA = zzA(zzR);
                        try {
                        } catch (zzhiv unused) {
                            zzhjvVar = zzhjvVar2;
                            obj2 = obj5;
                        }
                        switch (zzC(zzA)) {
                            case 0:
                                obj2 = obj5;
                                zzhlc.zzm(obj2, zzA & 1048575, zzhkfVar.zze());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 1:
                                obj2 = obj5;
                                zzhlc.zzk(obj2, zzA & 1048575, zzhkfVar.zzf());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 2:
                                obj2 = obj5;
                                zzhlc.zzg(obj2, zzA & 1048575, zzhkfVar.zzh());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 3:
                                obj2 = obj5;
                                zzhlc.zzg(obj2, zzA & 1048575, zzhkfVar.zzg());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 4:
                                obj2 = obj5;
                                zzhlc.zze(obj2, zzA & 1048575, zzhkfVar.zzi());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 5:
                                obj2 = obj5;
                                zzhlc.zzg(obj2, zzA & 1048575, zzhkfVar.zzj());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 6:
                                obj2 = obj5;
                                zzhlc.zze(obj2, zzA & 1048575, zzhkfVar.zzk());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 7:
                                obj2 = obj5;
                                zzhlc.zzi(obj2, zzA & 1048575, zzhkfVar.zzl());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 8:
                                obj2 = obj5;
                                zzz(obj2, zzA, zzhkfVar);
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 9:
                                obj2 = obj5;
                                zzhjs zzhjsVar = (zzhjs) zzt(obj2, zzR);
                                zzhkfVar.zzo(zzhjsVar, zzq(zzR), zzhhrVar);
                                zzu(obj2, zzR, zzhjsVar);
                                obj = obj2;
                                break;
                            case 10:
                                obj2 = obj5;
                                zzhlc.zzo(obj2, zzA & 1048575, zzhkfVar.zzq());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 11:
                                obj2 = obj5;
                                zzhlc.zze(obj2, zzA & 1048575, zzhkfVar.zzr());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 12:
                                obj2 = obj5;
                                int zzs = zzhkfVar.zzs();
                                zzhin zzs2 = zzs(zzR);
                                if (zzs2 != null && !zzs2.zza(zzs)) {
                                    obj6 = zzhkm.zzK(obj2, zzb2, zzs, obj6, zzhkvVar);
                                    obj = obj2;
                                    break;
                                }
                                zzhlc.zze(obj2, zzA & 1048575, zzs);
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 13:
                                obj2 = obj5;
                                zzhlc.zze(obj2, zzA & 1048575, zzhkfVar.zzt());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 14:
                                obj2 = obj5;
                                zzhlc.zzg(obj2, zzA & 1048575, zzhkfVar.zzu());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 15:
                                obj2 = obj5;
                                zzhlc.zze(obj2, zzA & 1048575, zzhkfVar.zzv());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 16:
                                obj2 = obj5;
                                zzhlc.zzg(obj2, zzA & 1048575, zzhkfVar.zzw());
                                zzO(obj2, zzR);
                                obj = obj2;
                                break;
                            case 17:
                                obj2 = obj5;
                                zzhjs zzhjsVar2 = (zzhjs) zzt(obj2, zzR);
                                zzhkfVar.zzp(zzhjsVar2, zzq(zzR), zzhhrVar);
                                zzu(obj2, zzR, zzhjsVar2);
                                obj = obj2;
                                break;
                            case 18:
                                obj2 = obj5;
                                zzhkfVar.zzx(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 19:
                                obj2 = obj5;
                                zzhkfVar.zzy(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 20:
                                obj2 = obj5;
                                zzhkfVar.zzA(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 21:
                                obj2 = obj5;
                                zzhkfVar.zzz(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 22:
                                obj2 = obj5;
                                zzhkfVar.zzB(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 23:
                                obj2 = obj5;
                                zzhkfVar.zzC(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 24:
                                obj2 = obj5;
                                zzhkfVar.zzD(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 25:
                                obj2 = obj5;
                                zzhkfVar.zzE(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 26:
                                obj2 = obj5;
                                if (zzD(zzA)) {
                                    ((zzhhh) zzhkfVar).zzF(zzhje.zza(obj2, zzA & 1048575), true);
                                } else {
                                    ((zzhhh) zzhkfVar).zzF(zzhje.zza(obj2, zzA & 1048575), false);
                                }
                                obj = obj2;
                                break;
                            case 27:
                                obj2 = obj5;
                                zzhkfVar.zzG(zzhje.zza(obj2, zzA & 1048575), zzq(zzR), zzhhrVar);
                                obj = obj2;
                                break;
                            case 28:
                                obj2 = obj5;
                                zzhkfVar.zzI(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 29:
                                obj2 = obj5;
                                zzhkfVar.zzJ(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 30:
                                List zza3 = zzhje.zza(obj5, zzA & 1048575);
                                zzhkfVar.zzK(zza3);
                                obj6 = zzhkm.zzJ(obj5, zzb2, zza3, zzs(zzR), obj6, zzhkvVar);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                obj2 = obj5;
                                zzhkfVar.zzL(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 32:
                                obj2 = obj5;
                                zzhkfVar.zzM(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 33:
                                obj2 = obj5;
                                zzhkfVar.zzN(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 34:
                                obj2 = obj5;
                                zzhkfVar.zzO(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 35:
                                obj2 = obj5;
                                zzhkfVar.zzx(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 36:
                                obj2 = obj5;
                                zzhkfVar.zzy(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 37:
                                obj2 = obj5;
                                zzhkfVar.zzA(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 38:
                                obj2 = obj5;
                                zzhkfVar.zzz(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 39:
                                obj2 = obj5;
                                zzhkfVar.zzB(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 40:
                                obj2 = obj5;
                                zzhkfVar.zzC(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 41:
                                obj2 = obj5;
                                zzhkfVar.zzD(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 42:
                                obj2 = obj5;
                                zzhkfVar.zzE(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 43:
                                obj2 = obj5;
                                zzhkfVar.zzJ(zzhje.zza(obj2, zzA & 1048575));
                                obj = obj2;
                                break;
                            case 44:
                                try {
                                    zza2 = zzhje.zza(obj5, zzA & 1048575);
                                    zzhkfVar.zzK(zza2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = obj5;
                                }
                                try {
                                    obj6 = zzhkm.zzJ(obj5, zzb2, zza2, zzs(zzR), obj6, zzhkvVar);
                                    obj2 = obj5;
                                } catch (zzhiv unused2) {
                                    obj2 = obj5;
                                    zzhjvVar = zzhjvVar2;
                                    if (obj6 == null) {
                                    }
                                    if (!zzhkvVar.zzk(obj6, zzhkfVar, 0)) {
                                    }
                                    obj = obj2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj2 = obj5;
                                    th = th;
                                    zzhjvVar = zzhjvVar2;
                                    i = zzhjvVar.zzk;
                                    obj3 = obj6;
                                    while (i < zzhjvVar.zzl) {
                                    }
                                    zzhkv zzhkvVar2 = zzhkvVar;
                                    if (obj3 == null) {
                                    }
                                }
                                obj = obj2;
                                break;
                            case 45:
                                zzhkfVar.zzL(zzhje.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 46:
                                zzhkfVar.zzM(zzhje.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 47:
                                zzhkfVar.zzN(zzhje.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 48:
                                zzhkfVar.zzO(zzhje.zza(obj5, zzA & 1048575));
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 49:
                                zzhkfVar.zzH(zzhje.zza(obj5, zzA & 1048575), zzq(zzR), zzhhrVar);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 50:
                                Object zzr = zzr(zzR);
                                long zzA2 = zzA(zzR) & 1048575;
                                Object zzn = zzhlc.zzn(obj5, zzA2);
                                if (zzn == null) {
                                    zzn = zzhjm.zza().zzc();
                                    zzhlc.zzo(obj5, zzA2, zzn);
                                } else if (zzhjn.zza(zzn)) {
                                    Object zzc = zzhjm.zza().zzc();
                                    zzhjn.zzb(zzc, zzn);
                                    zzhlc.zzo(obj5, zzA2, zzc);
                                    zzn = zzc;
                                }
                                zzhkfVar.zzP((zzhjm) zzn, ((zzhjl) zzr).zze(), zzhhrVar);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                zzhlc.zzo(obj5, zzA & 1048575, Double.valueOf(zzhkfVar.zze()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 52:
                                zzhlc.zzo(obj5, zzA & 1048575, Float.valueOf(zzhkfVar.zzf()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                zzhlc.zzo(obj5, zzA & 1048575, Long.valueOf(zzhkfVar.zzh()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 54:
                                zzhlc.zzo(obj5, zzA & 1048575, Long.valueOf(zzhkfVar.zzg()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                zzhlc.zzo(obj5, zzA & 1048575, Integer.valueOf(zzhkfVar.zzi()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 56:
                                zzhlc.zzo(obj5, zzA & 1048575, Long.valueOf(zzhkfVar.zzj()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 57:
                                zzhlc.zzo(obj5, zzA & 1048575, Integer.valueOf(zzhkfVar.zzk()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                                zzhlc.zzo(obj5, zzA & 1048575, Boolean.valueOf(zzhkfVar.zzl()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 59:
                                zzz(obj5, zzA, zzhkfVar);
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 60:
                                zzhjs zzhjsVar3 = (zzhjs) zzv(obj5, zzb2, zzR);
                                zzhkfVar.zzo(zzhjsVar3, zzq(zzR), zzhhrVar);
                                zzw(obj5, zzb2, zzR, zzhjsVar3);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                zzhlc.zzo(obj5, zzA & 1048575, zzhkfVar.zzq());
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                                zzhlc.zzo(obj5, zzA & 1048575, Integer.valueOf(zzhkfVar.zzr()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                int zzs3 = zzhkfVar.zzs();
                                zzhin zzs4 = zzs(zzR);
                                if (zzs4 != null && !zzs4.zza(zzs3)) {
                                    obj6 = zzhkm.zzK(obj5, zzb2, zzs3, obj6, zzhkvVar);
                                    obj = obj5;
                                    break;
                                }
                                zzhlc.zzo(obj5, zzA & 1048575, Integer.valueOf(zzs3));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 64:
                                zzhlc.zzo(obj5, zzA & 1048575, Integer.valueOf(zzhkfVar.zzt()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                zzhlc.zzo(obj5, zzA & 1048575, Long.valueOf(zzhkfVar.zzu()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                zzhlc.zzo(obj5, zzA & 1048575, Integer.valueOf(zzhkfVar.zzv()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 67:
                                zzhlc.zzo(obj5, zzA & 1048575, Long.valueOf(zzhkfVar.zzw()));
                                zzQ(obj5, zzb2, zzR);
                                obj2 = obj5;
                                obj = obj2;
                                break;
                            case 68:
                                try {
                                    zzhjs zzhjsVar4 = (zzhjs) zzv(obj5, zzb2, zzR);
                                    zzhkfVar.zzp(zzhjsVar4, zzq(zzR), zzhhrVar);
                                    zzw(obj5, zzb2, zzR, zzhjsVar4);
                                    obj2 = obj5;
                                    obj = obj2;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    zzhjvVar = zzhjvVar2;
                                    obj2 = obj5;
                                    i = zzhjvVar.zzk;
                                    obj3 = obj6;
                                    while (i < zzhjvVar.zzl) {
                                    }
                                    zzhkv zzhkvVar22 = zzhkvVar;
                                    if (obj3 == null) {
                                    }
                                }
                                break;
                            default:
                                obj2 = obj5;
                                if (obj6 == null) {
                                    try {
                                        try {
                                            obj6 = zzhkvVar.zzh(obj2);
                                        } catch (zzhiv unused3) {
                                            zzhjvVar = zzhjvVar2;
                                            if (obj6 == null) {
                                                try {
                                                    obj6 = zzhkvVar.zzh(obj2);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    th = th;
                                                    i = zzhjvVar.zzk;
                                                    obj3 = obj6;
                                                    while (i < zzhjvVar.zzl) {
                                                    }
                                                    zzhkv zzhkvVar222 = zzhkvVar;
                                                    if (obj3 == null) {
                                                    }
                                                }
                                            }
                                            if (!zzhkvVar.zzk(obj6, zzhkfVar, 0)) {
                                                obj4 = obj6;
                                                for (int i2 = zzhjvVar.zzk; i2 < zzhjvVar.zzl; i2++) {
                                                    zzhkv zzhkvVar3 = zzhkvVar;
                                                    obj4 = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i2], obj4, zzhkvVar3, obj2);
                                                    zzhkvVar = zzhkvVar3;
                                                }
                                                if (obj4 == null) {
                                                }
                                            }
                                            obj = obj2;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        th = th;
                                        zzhjvVar = zzhjvVar2;
                                        i = zzhjvVar.zzk;
                                        obj3 = obj6;
                                        while (i < zzhjvVar.zzl) {
                                        }
                                        zzhkv zzhkvVar2222 = zzhkvVar;
                                        if (obj3 == null) {
                                        }
                                    }
                                }
                                try {
                                    if (zzhkvVar.zzk(obj6, zzhkfVar, 0)) {
                                        obj = obj2;
                                    } else {
                                        obj4 = obj6;
                                        for (int i3 = zzhjvVar2.zzk; i3 < zzhjvVar2.zzl; i3++) {
                                            zzhkv zzhkvVar4 = zzhkvVar;
                                            obj4 = zzhjvVar2.zzx(obj2, zzhjvVar2.zzj[i3], obj4, zzhkvVar4, obj2);
                                            zzhkvVar = zzhkvVar4;
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    zzhjvVar = zzhjvVar2;
                                    th = th;
                                    i = zzhjvVar.zzk;
                                    obj3 = obj6;
                                    while (i < zzhjvVar.zzl) {
                                        zzhkv zzhkvVar5 = zzhkvVar;
                                        obj3 = zzhjvVar.zzx(obj2, zzhjvVar.zzj[i], obj3, zzhkvVar5, obj2);
                                        i++;
                                        zzhjvVar = this;
                                        zzhkvVar = zzhkvVar5;
                                    }
                                    zzhkv zzhkvVar22222 = zzhkvVar;
                                    if (obj3 == null) {
                                        throw th;
                                    }
                                    zzhkvVar22222.zzi(obj2, obj3);
                                    throw th;
                                }
                                break;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzhjvVar = zzhjvVar2;
                        obj2 = obj5;
                    }
                } else if (zzb2 == Integer.MAX_VALUE) {
                    obj4 = obj6;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzhkv zzhkvVar6 = zzhkvVar;
                        obj4 = zzx(obj, this.zzj[i4], obj4, zzhkvVar6, obj);
                        zzhkvVar = zzhkvVar6;
                    }
                    obj2 = obj;
                } else {
                    zzhjvVar = this;
                    try {
                        if ((!zzhjvVar.zzh ? null : zzhhrVar.zzc(zzhjvVar.zzg, zzb2)) != null) {
                            obj5 = obj;
                            zzhjvVar2 = zzhjvVar;
                            throw null;
                        }
                        if (obj6 == null) {
                            try {
                                obj6 = zzhkvVar.zzh(obj);
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj;
                                i = zzhjvVar.zzk;
                                obj3 = obj6;
                                while (i < zzhjvVar.zzl) {
                                }
                                zzhkv zzhkvVar222222 = zzhkvVar;
                                if (obj3 == null) {
                                }
                            }
                        }
                        if (zzhkvVar.zzk(obj6, zzhkfVar, 0)) {
                            obj5 = obj;
                            obj = obj5;
                        } else {
                            int i5 = zzhjvVar.zzk;
                            obj4 = obj6;
                            while (i5 < zzhjvVar.zzl) {
                                zzhkv zzhkvVar7 = zzhkvVar;
                                Object obj7 = obj;
                                obj4 = zzhjvVar.zzx(obj7, zzhjvVar.zzj[i5], obj4, zzhkvVar7, obj);
                                zzhkvVar = zzhkvVar7;
                                i5++;
                                obj = obj7;
                            }
                            obj2 = obj;
                        }
                    } catch (Throwable th10) {
                        obj5 = obj;
                        th = th10;
                        obj2 = obj5;
                        i = zzhjvVar.zzk;
                        obj3 = obj6;
                        while (i < zzhjvVar.zzl) {
                        }
                        zzhkv zzhkvVar2222222 = zzhkvVar;
                        if (obj3 == null) {
                        }
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                zzhjvVar = this;
                obj2 = obj;
            }
        }
        if (obj4 == null) {
            zzhkvVar.zzi(obj2, obj4);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzi(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.zzhgp r40) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhjv.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzhgp):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzhgp zzhgpVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zzhgpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zzhih) {
                zzhih zzhihVar = (zzhih) obj;
                zzhihVar.zzbq();
                zzhihVar.zzbb();
                zzhihVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzA = zzA(i);
                int i2 = 1048575 & zzA;
                int zzC = zzC(zzA);
                long j = i2;
                if (zzC != 9) {
                    if (zzC != 60 && zzC != 68) {
                        switch (zzC) {
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
                            case 48:
                            case 49:
                                ((zzhit) zzhlc.zzn(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzhjm) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzP(obj, iArr[i], i)) {
                        zzq(i).zzk(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhkk
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzA = zzA(i7);
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
            if ((268435456 & zzA) != 0 && !zzM(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzC = zzC(zzA);
            if (zzC != 9 && zzC != 17) {
                if (zzC != 27) {
                    if (zzC == 60 || zzC == 68) {
                        if (zzP(obj, i8, i2) && !zzy(obj, zzA, zzq(i2))) {
                            return false;
                        }
                    } else if (zzC != 49) {
                        if (zzC != 50) {
                            continue;
                        } else {
                            zzhjm zzhjmVar = (zzhjm) zzhlc.zzn(obj, zzA & 1048575);
                            if (!zzhjmVar.isEmpty() && ((zzhjl) zzr(i2)).zze().zzc.zza() == zzhlj.MESSAGE) {
                                zzhkk zzhkkVar = null;
                                for (Object obj2 : zzhjmVar.values()) {
                                    if (zzhkkVar == null) {
                                        zzhkkVar = zzhkc.zza().zzb(obj2.getClass());
                                    }
                                    if (!zzhkkVar.zzl(obj2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) zzhlc.zzn(obj, zzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhkk zzq = zzq(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzq.zzl(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzM(obj, i2, i, i3, i11) && !zzy(obj, zzA, zzq(i2))) {
                return false;
            }
            i5++;
            i6 = i;
            i4 = i3;
        }
        return !this.zzh || ((zzhid) obj).zza.zze();
    }
}
