package com.google.android.gms.internal.play_billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.drive.DriveFile;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes3.dex */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i, int i2, zzec zzecVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        boolean z2 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzi = iArr2;
        this.zzj = i4;
        this.zzk = i5;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzB(Object obj, Object obj2, int i) {
        if (zzI(obj2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzv = zzv(i);
            if (!zzI(obj, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzD(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzM(obj2, i2, i)) {
            int zzs = zzs(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = zzs;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzeo zzv = zzv(i);
            if (!zzM(obj, i2, i)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzE(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i) {
        int zzp = zzp(i);
        long j = 1048575 & zzp;
        if (j == 1048575) {
            return;
        }
        zzfp.zzq(obj, j, (1 << (zzp >>> 20)) | zzfp.zzc(obj, j));
    }

    private final void zzE(Object obj, int i, int i2) {
        zzfp.zzq(obj, zzp(i2) & 1048575, i);
    }

    private final void zzF(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzs(i) & 1048575, obj2);
        zzD(obj, i);
    }

    private final void zzG(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzE(obj, i, i2);
    }

    private final boolean zzH(Object obj, Object obj2, int i) {
        return zzI(obj, i) == zzI(obj2, i);
    }

    private final boolean zzI(Object obj, int i) {
        int zzp = zzp(i);
        long j = zzp & 1048575;
        if (j != 1048575) {
            return (zzfp.zzc(obj, j) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i);
        long j2 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzb(obj, j2)) != 0;
            case 2:
                return zzfp.zzd(obj, j2) != 0;
            case 3:
                return zzfp.zzd(obj, j2) != 0;
            case 4:
                return zzfp.zzc(obj, j2) != 0;
            case 5:
                return zzfp.zzd(obj, j2) != 0;
            case 6:
                return zzfp.zzc(obj, j2) != 0;
            case 7:
                return zzfp.zzw(obj, j2);
            case 8:
                Object zzf = zzfp.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzbq) {
                    return !zzbq.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfp.zzf(obj, j2) != null;
            case 10:
                return !zzbq.zzb.equals(zzfp.zzf(obj, j2));
            case 11:
                return zzfp.zzc(obj, j2) != 0;
            case 12:
                return zzfp.zzc(obj, j2) != 0;
            case 13:
                return zzfp.zzc(obj, j2) != 0;
            case 14:
                return zzfp.zzd(obj, j2) != 0;
            case 15:
                return zzfp.zzc(obj, j2) != 0;
            case 16:
                return zzfp.zzd(obj, j2) != 0;
            case 17:
                return zzfp.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzI(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzK(Object obj, int i, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzfp.zzc(obj, (long) (zzp(i2) & 1048575)) == i;
    }

    private static boolean zzN(Object obj, long j) {
        return ((Boolean) zzfp.zzf(obj, j)).booleanValue();
    }

    private static final void zzO(int i, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzG(i, (String) obj);
        } else {
            zzfxVar.zzd(i, (zzbq) obj);
        }
    }

    static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar != zzfg.zzc()) {
            return zzfgVar;
        }
        zzfg zzf = zzfg.zzf();
        zzcsVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzef zzl(Class cls, zzdz zzdzVar, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
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
        zzen zzenVar;
        int i19;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzz;
        char charAt11;
        int i24;
        int i25;
        int i26;
        int i27;
        Object obj;
        Field zzz2;
        Object obj2;
        Field zzz3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        if (!(zzdzVar instanceof zzen)) {
            throw null;
        }
        zzen zzenVar2 = (zzen) zzdzVar;
        String zzd = zzenVar2.zzd();
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
        Object[] zze = zzenVar2.zze();
        Class<?> cls2 = zzenVar2.zza().getClass();
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
                        if (zzenVar2.zzc() == 1 || i75 != 0) {
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
                        zzz2 = zzz(cls2, (String) obj);
                        zze[i85] = zzz2;
                    } else {
                        zzz2 = (Field) obj;
                    }
                    i17 = i3;
                    i23 = (int) unsafe.objectFieldOffset(zzz2);
                    int i86 = i85 + 1;
                    obj2 = zze[i86];
                    if (obj2 instanceof Field) {
                        zzz3 = zzz(cls2, (String) obj2);
                        zze[i86] = zzz3;
                    } else {
                        zzz3 = (Field) obj2;
                    }
                    zzenVar = zzenVar2;
                    str = zzd;
                    i22 = i2;
                    i20 = i81;
                    i19 = (int) unsafe.objectFieldOffset(zzz3);
                    i21 = 0;
                }
                i2 = i27;
                int i852 = charAt25 + charAt25;
                obj = zze[i852];
                if (obj instanceof Field) {
                }
                i17 = i3;
                i23 = (int) unsafe.objectFieldOffset(zzz2);
                int i862 = i852 + 1;
                obj2 = zze[i862];
                if (obj2 instanceof Field) {
                }
                zzenVar = zzenVar2;
                str = zzd;
                i22 = i2;
                i20 = i81;
                i19 = (int) unsafe.objectFieldOffset(zzz3);
                i21 = 0;
            } else {
                i17 = i3;
                i18 = i6;
                int i87 = i2 + 1;
                Field zzz4 = zzz(cls2, (String) zze[i2]);
                if (i74 == 9 || i74 == 17) {
                    zzenVar = zzenVar2;
                    int i88 = i65 / 3;
                    objArr[i88 + i88 + 1] = zzz4.getType();
                } else {
                    if (i74 == 27) {
                        zzenVar = zzenVar2;
                        i24 = 1;
                        i25 = i2 + 2;
                    } else if (i74 == 49) {
                        i25 = i2 + 2;
                        zzenVar = zzenVar2;
                        i24 = 1;
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        zzenVar = zzenVar2;
                        if (zzenVar2.zzc() == 1 || i75 != 0) {
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
                        zzenVar = zzenVar2;
                    }
                    int i94 = i65 / 3;
                    objArr[i94 + i94 + i24] = zze[i87];
                    i87 = i25;
                }
                int objectFieldOffset = (int) unsafe.objectFieldOffset(zzz4);
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
                        zzz = (Field) obj3;
                    } else {
                        zzz = zzz(cls2, (String) obj3);
                        zze[i98] = zzz;
                    }
                    i21 = charAt26 % 32;
                    i19 = (int) unsafe.objectFieldOffset(zzz);
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
            zzenVar2 = zzenVar;
            zzd = str;
            i6 = i18;
            i3 = i17;
            c = 55296;
        }
        zzen zzenVar3 = zzenVar2;
        return new zzef(iArr2, objArr, i3, i6, zzenVar3.zza(), zzenVar3.zzc(), false, iArr, i4, i60, zzeiVar, zzdqVar, zzffVar, zzceVar, zzdxVar);
    }

    private static double zzm(Object obj, long j) {
        return ((Double) zzfp.zzf(obj, j)).doubleValue();
    }

    private static float zzn(Object obj, long j) {
        return ((Float) zzfp.zzf(obj, j)).floatValue();
    }

    private static int zzo(Object obj, long j) {
        return ((Integer) zzfp.zzf(obj, j)).intValue();
    }

    private final int zzp(int i) {
        return this.zzc[i + 2];
    }

    private final int zzq(int i, int i2) {
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

    private static int zzr(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzs(int i) {
        return this.zzc[i + 1];
    }

    private static long zzt(Object obj, long j) {
        return ((Long) zzfp.zzf(obj, j)).longValue();
    }

    private final zzcw zzu(int i) {
        int i2 = i / 3;
        return (zzcw) this.zzd[i2 + i2 + 1];
    }

    private final zzeo zzv(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzeo zzeoVar = (zzeo) objArr[i3];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzb2 = zzel.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzx(Object obj, int i) {
        zzeo zzv = zzv(i);
        int zzs = zzs(i) & 1048575;
        if (!zzI(obj, i)) {
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

    private final Object zzy(Object obj, int i, int i2) {
        zzeo zzv = zzv(i2);
        if (!zzM(obj, i, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i2) & 1048575);
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

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int zzw;
        int zzw2;
        int zzw3;
        int zzx;
        int zzw4;
        int zzw5;
        int zzd;
        int zzw6;
        int zzh;
        int zzg;
        int size;
        int zzw7;
        int zzw8;
        int zzw9;
        int zze;
        int zzw10;
        int zzw11;
        int i4;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.zzc.length) {
            int zzs = zzs(i8);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i5;
            if (zzr <= 17) {
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
            int i13 = zzs & i5;
            if (zzr >= zzcj.DOUBLE_LIST_PACKED.zza()) {
                zzcj.SINT64_LIST_PACKED.zza();
            }
            long j = i13;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzh = zzw2 + 4;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(j2);
                        zzh = zzw3 + zzx;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(j3);
                        zzh = zzw3 + zzx;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(j4);
                        zzh = zzw3 + zzx;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzh = zzw2 + 4;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw4 = zzby.zzw(i10 << 3);
                        zzh = zzw4 + 1;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzbq) {
                            zzw5 = zzby.zzw(i14);
                            zzd = ((zzbq) object).zzd();
                            zzw6 = zzby.zzw(zzd);
                            zzh = zzw5 + zzw6 + zzd;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        } else {
                            zzw3 = zzby.zzw(i14);
                            zzx = zzby.zzv((String) object);
                            zzh = zzw3 + zzx;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzh = zzeq.zzh(i10, unsafe.getObject(obj, j), zzv(i8));
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzbq zzbqVar = (zzbq) unsafe.getObject(obj, j);
                        zzw5 = zzby.zzw(i10 << 3);
                        zzd = zzbqVar.zzd();
                        zzw6 = zzby.zzw(zzd);
                        zzh = zzw5 + zzw6 + zzd;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        int i15 = unsafe.getInt(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzw(i15);
                        zzh = zzw3 + zzx;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(j5);
                        zzh = zzw3 + zzx;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzh = zzw2 + 4;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        int i16 = unsafe.getInt(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzw((i16 >> 31) ^ (i16 + i16));
                        zzh = zzw3 + zzx;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx((j6 >> 63) ^ (j6 + j6));
                        zzh = zzw3 + zzx;
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
                    if (zzJ(obj, i8, i, i2, i3)) {
                        zzh = zzby.zzt(i10, (zzec) unsafe.getObject(obj, j), zzv(i8));
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
                    zzh = zzeq.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 19:
                    zzh = zzeq.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i17 = zzeq.zza;
                    if (list.size() != 0) {
                        zzg = zzeq.zzg(list) + (list.size() * zzby.zzw(i10 << 3));
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
                    int i18 = zzeq.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzw3 = zzeq.zzl(list2);
                        zzw7 = zzby.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
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
                    int i19 = zzeq.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzw3 = zzeq.zzf(list3);
                        zzw7 = zzby.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
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
                    zzh = zzeq.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 24:
                    zzh = zzeq.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i20 = zzeq.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        zzh = size2 * (zzby.zzw(i10 << 3) + 1);
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
                    int i21 = zzeq.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzg = zzby.zzw(i10 << 3) * size3;
                        if (list5 instanceof zzdk) {
                            zzdk zzdkVar = (zzdk) list5;
                            for (int i22 = 0; i22 < size3; i22++) {
                                Object zzf = zzdkVar.zzf(i22);
                                if (zzf instanceof zzbq) {
                                    int zzd2 = ((zzbq) zzf).zzd();
                                    zzg += zzby.zzw(zzd2) + zzd2;
                                } else {
                                    zzg += zzby.zzv((String) zzf);
                                }
                            }
                        } else {
                            for (int i23 = 0; i23 < size3; i23++) {
                                Object obj2 = list5.get(i23);
                                if (obj2 instanceof zzbq) {
                                    int zzd3 = ((zzbq) obj2).zzd();
                                    zzg += zzby.zzw(zzd3) + zzd3;
                                } else {
                                    zzg += zzby.zzv((String) obj2);
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
                    zzeo zzv = zzv(i8);
                    int i24 = zzeq.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        zzw8 = 0;
                    } else {
                        zzw8 = zzby.zzw(i10 << 3) * size4;
                        for (int i25 = 0; i25 < size4; i25++) {
                            Object obj3 = list6.get(i25);
                            if (obj3 instanceof zzdi) {
                                int zza2 = ((zzdi) obj3).zza();
                                zzw8 += zzby.zzw(zza2) + zza2;
                            } else {
                                zzw8 += zzby.zzu((zzec) obj3, zzv);
                            }
                        }
                    }
                    i9 += zzw8;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i26 = zzeq.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        zzw9 = 0;
                    } else {
                        zzw9 = size5 * zzby.zzw(i10 << 3);
                        for (int i27 = 0; i27 < list7.size(); i27++) {
                            int zzd4 = ((zzbq) list7.get(i27)).zzd();
                            zzw9 += zzby.zzw(zzd4) + zzd4;
                        }
                    }
                    i9 += zzw9;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i28 = zzeq.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzw3 = zzeq.zzk(list8);
                        zzw7 = zzby.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
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
                    int i29 = zzeq.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzw3 = zzeq.zza(list9);
                        zzw7 = zzby.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
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
                    zzh = zzeq.zzb(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 32:
                    zzh = zzeq.zzd(i10, (List) unsafe.getObject(obj, j), z);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i30 = zzeq.zza;
                    size = list10.size();
                    if (size != 0) {
                        zzw3 = zzeq.zzi(list10);
                        zzw7 = zzby.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
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
                    int i31 = zzeq.zza;
                    size = list11.size();
                    if (size != 0) {
                        zzw3 = zzeq.zzj(list11);
                        zzw7 = zzby.zzw(i10 << 3);
                        zzx = size * zzw7;
                        zzh = zzw3 + zzx;
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
                    zze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzg((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzl((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzf((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    int i32 = zzeq.zza;
                    zze = list12.size();
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzk((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zza((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzc((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzi((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zze = zzeq.zzj((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        zzw10 = zzby.zzw(i10 << 3);
                        zzw11 = zzby.zzw(zze);
                        zzw9 = zzw10 + zzw11 + zze;
                        i9 += zzw9;
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
                    zzeo zzv2 = zzv(i8);
                    int i33 = zzeq.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i34 = 0; i34 < size6; i34++) {
                            i4 += zzby.zzt(i10, (zzec) list13.get(i34), zzv2);
                        }
                    }
                    i9 += i4;
                    i8 += 3;
                    i6 = i;
                    i7 = i2;
                    z = false;
                    i5 = 1048575;
                case 50:
                    zzdw zzdwVar = (zzdw) unsafe.getObject(obj, j);
                    if (zzdwVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzdwVar.entrySet().iterator();
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
                    if (zzM(obj, i10, i8)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
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
                    if (zzM(obj, i10, i8)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzh = zzw2 + 4;
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
                    if (zzM(obj, i10, i8)) {
                        long zzt = zzt(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(zzt);
                        zzh = zzw3 + zzx;
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
                    if (zzM(obj, i10, i8)) {
                        long zzt2 = zzt(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(zzt2);
                        zzh = zzw3 + zzx;
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
                    if (zzM(obj, i10, i8)) {
                        long zzo = zzo(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(zzo);
                        zzh = zzw3 + zzx;
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
                    if (zzM(obj, i10, i8)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
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
                    if (zzM(obj, i10, i8)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzh = zzw2 + 4;
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
                    if (zzM(obj, i10, i8)) {
                        zzw4 = zzby.zzw(i10 << 3);
                        zzh = zzw4 + 1;
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
                    if (zzM(obj, i10, i8)) {
                        int i35 = i10 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzbq) {
                            zzw5 = zzby.zzw(i35);
                            zzd = ((zzbq) object2).zzd();
                            zzw6 = zzby.zzw(zzd);
                            zzh = zzw5 + zzw6 + zzd;
                            i9 += zzh;
                            i8 += 3;
                            i6 = i;
                            i7 = i2;
                            z = false;
                            i5 = 1048575;
                        } else {
                            zzw3 = zzby.zzw(i35);
                            zzx = zzby.zzv((String) object2);
                            zzh = zzw3 + zzx;
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
                    if (zzM(obj, i10, i8)) {
                        zzh = zzeq.zzh(i10, unsafe.getObject(obj, j), zzv(i8));
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
                    if (zzM(obj, i10, i8)) {
                        zzbq zzbqVar2 = (zzbq) unsafe.getObject(obj, j);
                        zzw5 = zzby.zzw(i10 << 3);
                        zzd = zzbqVar2.zzd();
                        zzw6 = zzby.zzw(zzd);
                        zzh = zzw5 + zzw6 + zzd;
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
                    if (zzM(obj, i10, i8)) {
                        int zzo2 = zzo(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzw(zzo2);
                        zzh = zzw3 + zzx;
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
                    if (zzM(obj, i10, i8)) {
                        long zzo3 = zzo(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx(zzo3);
                        zzh = zzw3 + zzx;
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
                    if (zzM(obj, i10, i8)) {
                        zzw2 = zzby.zzw(i10 << 3);
                        zzh = zzw2 + 4;
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
                    if (zzM(obj, i10, i8)) {
                        zzw = zzby.zzw(i10 << 3);
                        zzh = zzw + 8;
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
                    if (zzM(obj, i10, i8)) {
                        int zzo4 = zzo(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzw((zzo4 >> 31) ^ (zzo4 + zzo4));
                        zzh = zzw3 + zzx;
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
                    if (zzM(obj, i10, i8)) {
                        long zzt3 = zzt(obj, j);
                        zzw3 = zzby.zzw(i10 << 3);
                        zzx = zzby.zzx((zzt3 >> 63) ^ (zzt3 + zzt3));
                        zzh = zzw3 + zzx;
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
                    if (zzM(obj, i10, i8)) {
                        zzh = zzby.zzt(i10, (zzec) unsafe.getObject(obj, j), zzv(i8));
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
        zzff zzffVar = this.zzm;
        int zza3 = i9 + zzffVar.zza(zzffVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        zzci zzb2 = this.zzn.zzb(obj);
        int i36 = 0;
        for (int i37 = 0; i37 < zzb2.zza.zzb(); i37++) {
            Map.Entry zzg2 = zzb2.zza.zzg(i37);
            i36 += zzci.zzb((zzch) zzg2.getKey(), zzg2.getValue());
        }
        for (Map.Entry entry2 : zzb2.zza.zzc()) {
            i36 += zzci.zzb((zzch) entry2.getKey(), entry2.getValue());
        }
        return zza3 + i36;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzs = zzs(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzr) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzfp.zza(obj, j));
                    byte[] bArr = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzfp.zzb(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr2 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr3 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr4 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zzda.zza(zzfp.zzw(obj, j));
                    i4 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzfp.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr5 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzc(obj, j);
                    i4 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j);
                    byte[] bArr6 = zzda.zzd;
                    i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzfp.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
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
                    floatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i4 * 53;
                    floatToIntBits = zzfp.zzf(obj, j).hashCode();
                    i4 = i2 + floatToIntBits;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j));
                        byte[] bArr7 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr8 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr9 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr10 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzda.zza(zzN(obj, j));
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzfp.zzf(obj, j)).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr11 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzo(obj, j);
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzt(obj, j);
                        byte[] bArr12 = zzda.zzd;
                        i4 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzfp.zzf(obj, j).hashCode();
                        i4 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.zzm.zzd(obj).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzn.zzb(obj).zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0ce2, code lost:
    
        if (r6 == 1048575) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0ce4, code lost:
    
        r13.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0ce8, code lost:
    
        r3 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0cec, code lost:
    
        if (r3 >= r0.zzk) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0cee, code lost:
    
        r5 = r0.zzi;
        r6 = r0.zzc;
        r5 = r5[r3];
        r6 = r6[r5];
        r6 = com.google.android.gms.internal.play_billing.zzfp.zzf(r7, r0.zzs(r5) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d00, code lost:
    
        if (r6 != null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d07, code lost:
    
        if (r0.zzu(r5) != null) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d0c, code lost:
    
        r6 = (com.google.android.gms.internal.play_billing.zzdw) r6;
        r1 = (com.google.android.gms.internal.play_billing.zzdv) r0.zzw(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d14, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d09, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d15, code lost:
    
        if (r8 != 0) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d19, code lost:
    
        if (r1 != r37) goto L579;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d20, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d27, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0d23, code lost:
    
        if (r1 > r37) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0d25, code lost:
    
        if (r4 != r8) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0d2c, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x09ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0c5f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0c75 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzbc zzbcVar) throws IOException {
        int i4;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int zzq;
        int i8;
        int i9;
        int i10;
        int i11;
        Unsafe unsafe2;
        zzbc zzbcVar2;
        int i12;
        int i13;
        Unsafe unsafe3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Unsafe unsafe4;
        zzbc zzbcVar3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        zzbc zzbcVar4;
        Unsafe unsafe5;
        int i27;
        int i28;
        int zzf;
        zzbc zzbcVar5;
        int i29;
        int i30;
        int i31;
        int zzj;
        int i32;
        int zzh;
        int i33;
        zzbc zzbcVar6;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        byte[] bArr2;
        int i39;
        int zzk;
        int i40;
        byte[] bArr3;
        zzbc zzbcVar7;
        zzef<T> zzefVar = this;
        Object obj2 = obj;
        byte[] bArr4 = bArr;
        int i41 = i2;
        int i42 = i3;
        zzbc zzbcVar8 = zzbcVar;
        zzA(obj);
        Unsafe unsafe6 = zzb;
        int i43 = 0;
        int i44 = i;
        int i45 = -1;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 1048575;
        while (true) {
            if (i44 < i41) {
                int i50 = i44 + 1;
                byte b = bArr4[i44];
                if (b < 0) {
                    i5 = zzbd.zzi(b, bArr4, i50, zzbcVar8);
                    i47 = zzbcVar8.zza;
                } else {
                    i47 = b;
                    i5 = i50;
                }
                int i51 = i47 >>> 3;
                if (i51 > i45) {
                    zzq = (i51 < zzefVar.zze || i51 > zzefVar.zzf) ? -1 : zzefVar.zzq(i51, i46 / 3);
                } else if (i51 < zzefVar.zze || i51 > zzefVar.zzf) {
                    i6 = -1;
                    i7 = -1;
                    if (i7 == i6) {
                        int i52 = i47 & 7;
                        int[] iArr = zzefVar.zzc;
                        int i53 = iArr[i7 + 1];
                        int i54 = i47;
                        int zzr = zzr(i53);
                        long j = i53 & 1048575;
                        if (zzr > 17) {
                            i10 = i49;
                            int i55 = i54;
                            int i56 = i7;
                            i9 = i48;
                            Unsafe unsafe7 = unsafe6;
                            i41 = i2;
                            int i57 = i5;
                            zzbc zzbcVar9 = zzbcVar8;
                            if (zzr != 27) {
                                if (zzr > 49) {
                                    zzbcVar6 = zzbcVar9;
                                    unsafe2 = unsafe7;
                                    i34 = i56;
                                    i35 = i55;
                                    if (zzr != 50) {
                                        obj2 = obj;
                                        Unsafe unsafe8 = zzb;
                                        long j2 = iArr[i34 + 2] & 1048575;
                                        switch (zzr) {
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                                i37 = i34;
                                                i11 = i51;
                                                i47 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i52 == 1) {
                                                    i39 = i38 + 8;
                                                    unsafe8.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzbd.zzn(bArr2, i38))));
                                                    unsafe8.putInt(obj2, j2, i11);
                                                    if (i39 != i38) {
                                                        i4 = i3;
                                                        i8 = i39;
                                                        i43 = i37;
                                                        break;
                                                    } else {
                                                        i41 = i2;
                                                        i42 = i3;
                                                        zzbcVar8 = zzbcVar2;
                                                        bArr4 = bArr2;
                                                        i49 = i10;
                                                        i46 = i37;
                                                        i48 = i9;
                                                        unsafe6 = unsafe2;
                                                        i43 = 0;
                                                        int i58 = i39;
                                                        i45 = i11;
                                                        i44 = i58;
                                                    }
                                                }
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                                i37 = i34;
                                                i11 = i51;
                                                i47 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i52 == 5) {
                                                    i39 = i38 + 4;
                                                    unsafe8.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzbd.zzb(bArr2, i38))));
                                                    unsafe8.putInt(obj2, j2, i11);
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                                i37 = i34;
                                                i11 = i51;
                                                i47 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i52 == 0) {
                                                    zzk = zzbd.zzk(bArr2, i38, zzbcVar2);
                                                    unsafe8.putObject(obj2, j, Long.valueOf(zzbcVar2.zzb));
                                                    unsafe8.putInt(obj2, j2, i11);
                                                    i39 = zzk;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                            case 62:
                                                i37 = i34;
                                                i11 = i51;
                                                i47 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i52 == 0) {
                                                    i39 = zzbd.zzh(bArr2, i38, zzbcVar2);
                                                    unsafe8.putObject(obj2, j, Integer.valueOf(zzbcVar2.zza));
                                                    unsafe8.putInt(obj2, j2, i11);
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case 56:
                                            case 65:
                                                i37 = i34;
                                                i11 = i51;
                                                i47 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i52 == 1) {
                                                    i39 = i38 + 8;
                                                    unsafe8.putObject(obj2, j, Long.valueOf(zzbd.zzn(bArr2, i38)));
                                                    unsafe8.putInt(obj2, j2, i11);
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case 57:
                                            case 64:
                                                i37 = i34;
                                                i11 = i51;
                                                i47 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i52 == 5) {
                                                    i39 = i38 + 4;
                                                    unsafe8.putObject(obj2, j, Integer.valueOf(zzbd.zzb(bArr2, i38)));
                                                    unsafe8.putInt(obj2, j2, i11);
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case 58:
                                                i37 = i34;
                                                i11 = i51;
                                                i40 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i52 == 0) {
                                                    zzk = zzbd.zzk(bArr2, i38, zzbcVar2);
                                                    i47 = i40;
                                                    unsafe8.putObject(obj2, j, Boolean.valueOf(zzbcVar2.zzb != 0));
                                                    unsafe8.putInt(obj2, j2, i11);
                                                    i39 = zzk;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i47 = i40;
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case 59:
                                                i37 = i34;
                                                i11 = i51;
                                                i40 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                if (i52 == 2) {
                                                    i39 = zzbd.zzh(bArr2, i38, zzbcVar2);
                                                    int i59 = zzbcVar2.zza;
                                                    if (i59 == 0) {
                                                        unsafe8.putObject(obj2, j, "");
                                                    } else {
                                                        int i60 = i39 + i59;
                                                        if ((i53 & DriveFile.MODE_WRITE_ONLY) != 0 && !zzfu.zze(bArr2, i39, i60)) {
                                                            throw zzdc.zzc();
                                                        }
                                                        unsafe8.putObject(obj2, j, new String(bArr2, i39, i59, zzda.zzb));
                                                        i39 = i60;
                                                    }
                                                    unsafe8.putInt(obj2, j2, i11);
                                                    i47 = i40;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i47 = i40;
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                                bArr3 = bArr;
                                                zzbcVar7 = zzbcVar;
                                                if (i52 == 2) {
                                                    Object zzy = zzefVar.zzy(obj2, i51, i34);
                                                    i38 = i57;
                                                    int zzm = zzbd.zzm(zzy, zzefVar.zzv(i34), bArr, i57, i2, zzbcVar);
                                                    zzefVar.zzG(obj2, i51, i34, zzy);
                                                    i39 = zzm;
                                                    bArr2 = bArr3;
                                                    i37 = i34;
                                                    i11 = i51;
                                                    zzbcVar2 = zzbcVar7;
                                                    i47 = i35;
                                                    if (i39 != i38) {
                                                    }
                                                } else {
                                                    i38 = i57;
                                                    i37 = i34;
                                                    i11 = i51;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i47 = i35;
                                                    i39 = i38;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                break;
                                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                                bArr3 = bArr;
                                                zzbcVar7 = zzbcVar;
                                                if (i52 == 2) {
                                                    i39 = zzbd.zza(bArr3, i57, zzbcVar7);
                                                    unsafe8.putObject(obj2, j, zzbcVar7.zzc);
                                                    unsafe8.putInt(obj2, j2, i51);
                                                    i37 = i34;
                                                    i11 = i51;
                                                    i38 = i57;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i47 = i35;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i37 = i34;
                                                i11 = i51;
                                                i38 = i57;
                                                bArr2 = bArr3;
                                                zzbcVar2 = zzbcVar7;
                                                i47 = i35;
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                                bArr3 = bArr;
                                                zzbcVar7 = zzbcVar;
                                                if (i52 == 0) {
                                                    int zzh2 = zzbd.zzh(bArr3, i57, zzbcVar7);
                                                    int i61 = zzbcVar7.zza;
                                                    zzcw zzu = zzefVar.zzu(i34);
                                                    if (zzu == null || zzu.zza(i61)) {
                                                        unsafe8.putObject(obj2, j, Integer.valueOf(i61));
                                                        unsafe8.putInt(obj2, j2, i51);
                                                    } else {
                                                        zzd(obj).zzj(i35, Long.valueOf(i61));
                                                    }
                                                    i39 = zzh2;
                                                    i37 = i34;
                                                    i11 = i51;
                                                    i38 = i57;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i47 = i35;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i37 = i34;
                                                i11 = i51;
                                                i38 = i57;
                                                bArr2 = bArr3;
                                                zzbcVar2 = zzbcVar7;
                                                i47 = i35;
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                                bArr3 = bArr;
                                                zzbcVar7 = zzbcVar;
                                                if (i52 == 0) {
                                                    i39 = zzbd.zzh(bArr3, i57, zzbcVar7);
                                                    unsafe8.putObject(obj2, j, Integer.valueOf(zzbu.zzb(zzbcVar7.zza)));
                                                    unsafe8.putInt(obj2, j2, i51);
                                                    i37 = i34;
                                                    i11 = i51;
                                                    i38 = i57;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i47 = i35;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                i37 = i34;
                                                i11 = i51;
                                                i38 = i57;
                                                bArr2 = bArr3;
                                                zzbcVar2 = zzbcVar7;
                                                i47 = i35;
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                                zzbcVar7 = zzbcVar;
                                                if (i52 == 0) {
                                                    bArr3 = bArr;
                                                    i39 = zzbd.zzk(bArr3, i57, zzbcVar7);
                                                    unsafe8.putObject(obj2, j, Long.valueOf(zzbu.zzc(zzbcVar7.zzb)));
                                                    unsafe8.putInt(obj2, j2, i51);
                                                    i37 = i34;
                                                    i11 = i51;
                                                    i38 = i57;
                                                    bArr2 = bArr3;
                                                    zzbcVar2 = zzbcVar7;
                                                    i47 = i35;
                                                    if (i39 != i38) {
                                                    }
                                                } else {
                                                    i37 = i34;
                                                    i11 = i51;
                                                    i38 = i57;
                                                    bArr2 = bArr;
                                                    zzbcVar2 = zzbcVar7;
                                                    i47 = i35;
                                                    i39 = i38;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                break;
                                            case 68:
                                                if (i52 == 3) {
                                                    Object zzy2 = zzefVar.zzy(obj2, i51, i34);
                                                    zzbcVar7 = zzbcVar;
                                                    int zzl = zzbd.zzl(zzy2, zzefVar.zzv(i34), bArr, i57, i2, (i35 & (-8)) | 4, zzbcVar);
                                                    zzefVar.zzG(obj2, i51, i34, zzy2);
                                                    i37 = i34;
                                                    i11 = i51;
                                                    i38 = i57;
                                                    i39 = zzl;
                                                    bArr2 = bArr;
                                                    zzbcVar2 = zzbcVar7;
                                                    i47 = i35;
                                                    if (i39 != i38) {
                                                    }
                                                }
                                                break;
                                            default:
                                                i37 = i34;
                                                i11 = i51;
                                                i47 = i35;
                                                i38 = i57;
                                                bArr2 = bArr;
                                                zzbcVar2 = zzbcVar;
                                                i39 = i38;
                                                if (i39 != i38) {
                                                }
                                                break;
                                        }
                                    } else {
                                        if (i52 == 2) {
                                            Unsafe unsafe9 = zzb;
                                            Object zzw = zzefVar.zzw(i34);
                                            Object object = unsafe9.getObject(obj, j);
                                            if (!((zzdw) object).zze()) {
                                                zzdw zzb2 = zzdw.zza().zzb();
                                                zzdx.zza(zzb2, object);
                                                unsafe9.putObject(obj, j, zzb2);
                                            }
                                            throw null;
                                        }
                                        i36 = i57;
                                        obj2 = obj;
                                        i4 = i3;
                                        i43 = i34;
                                        i11 = i51;
                                        i47 = i35;
                                        i8 = i36;
                                        zzbcVar2 = zzbcVar6;
                                    }
                                } else {
                                    int i62 = i56;
                                    long j3 = i53;
                                    Unsafe unsafe10 = zzb;
                                    zzcz zzczVar = (zzcz) unsafe10.getObject(obj2, j);
                                    if (zzczVar.zzc()) {
                                        i23 = i51;
                                    } else {
                                        int size = zzczVar.size();
                                        if (size == 0) {
                                            i23 = i51;
                                            i33 = 10;
                                        } else {
                                            i23 = i51;
                                            i33 = size + size;
                                        }
                                        zzcz zzd = zzczVar.zzd(i33);
                                        unsafe10.putObject(obj2, j, zzd);
                                        zzczVar = zzd;
                                    }
                                    switch (zzr) {
                                        case 18:
                                        case 35:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe6 = unsafe7;
                                            i43 = i62;
                                            i26 = i23;
                                            zzbcVar4 = zzbcVar9;
                                            if (i52 == 2) {
                                                zzca zzcaVar = (zzca) zzczVar;
                                                i44 = zzbd.zzh(bArr4, i24, zzbcVar4);
                                                int i63 = zzbcVar4.zza + i44;
                                                while (i44 < i63) {
                                                    zzcaVar.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, i44)));
                                                    i44 += 8;
                                                }
                                                if (i44 != i63) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i52 == 1) {
                                                    i44 = i24 + 8;
                                                    zzca zzcaVar2 = (zzca) zzczVar;
                                                    zzcaVar2.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, i24)));
                                                    while (i44 < i41) {
                                                        int zzh3 = zzbd.zzh(bArr4, i44, zzbcVar4);
                                                        if (i25 == zzbcVar4.zza) {
                                                            zzcaVar2.zzf(Double.longBitsToDouble(zzbd.zzn(bArr4, zzh3)));
                                                            i44 = zzh3 + 8;
                                                        }
                                                    }
                                                }
                                                i44 = i24;
                                            }
                                            if (i44 == i24) {
                                                obj2 = obj;
                                                i8 = i44;
                                                i11 = i26;
                                                i47 = i25;
                                                unsafe2 = unsafe6;
                                                zzbcVar2 = zzbcVar4;
                                                i4 = i3;
                                                break;
                                            } else {
                                                obj2 = obj;
                                                i45 = i26;
                                                i47 = i25;
                                                i46 = i43;
                                                zzbcVar8 = zzbcVar4;
                                                i49 = i10;
                                                i48 = i9;
                                                i43 = 0;
                                                i42 = i3;
                                            }
                                        case 19:
                                        case 36:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe6 = unsafe7;
                                            i43 = i62;
                                            i26 = i23;
                                            zzbcVar4 = zzbcVar9;
                                            if (i52 == 2) {
                                                zzck zzckVar = (zzck) zzczVar;
                                                i44 = zzbd.zzh(bArr4, i24, zzbcVar4);
                                                int i64 = zzbcVar4.zza + i44;
                                                while (i44 < i64) {
                                                    zzckVar.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, i44)));
                                                    i44 += 4;
                                                }
                                                if (i44 != i64) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i52 == 5) {
                                                    i44 = i24 + 4;
                                                    zzck zzckVar2 = (zzck) zzczVar;
                                                    zzckVar2.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, i24)));
                                                    while (i44 < i41) {
                                                        int zzh4 = zzbd.zzh(bArr4, i44, zzbcVar4);
                                                        if (i25 == zzbcVar4.zza) {
                                                            zzckVar2.zzf(Float.intBitsToFloat(zzbd.zzb(bArr4, zzh4)));
                                                            i44 = zzh4 + 4;
                                                        }
                                                    }
                                                }
                                                i44 = i24;
                                            }
                                            if (i44 == i24) {
                                            }
                                            break;
                                        case 20:
                                        case 21:
                                        case 37:
                                        case 38:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe6 = unsafe7;
                                            i43 = i62;
                                            i26 = i23;
                                            zzbcVar4 = zzbcVar9;
                                            if (i52 == 2) {
                                                zzdr zzdrVar = (zzdr) zzczVar;
                                                i44 = zzbd.zzh(bArr4, i24, zzbcVar4);
                                                int i65 = zzbcVar4.zza + i44;
                                                while (i44 < i65) {
                                                    i44 = zzbd.zzk(bArr4, i44, zzbcVar4);
                                                    zzdrVar.zzf(zzbcVar4.zzb);
                                                }
                                                if (i44 != i65) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i52 == 0) {
                                                    zzdr zzdrVar2 = (zzdr) zzczVar;
                                                    i44 = zzbd.zzk(bArr4, i24, zzbcVar4);
                                                    zzdrVar2.zzf(zzbcVar4.zzb);
                                                    while (i44 < i41) {
                                                        int zzh5 = zzbd.zzh(bArr4, i44, zzbcVar4);
                                                        if (i25 == zzbcVar4.zza) {
                                                            i44 = zzbd.zzk(bArr4, zzh5, zzbcVar4);
                                                            zzdrVar2.zzf(zzbcVar4.zzb);
                                                        }
                                                    }
                                                }
                                                i44 = i24;
                                            }
                                            if (i44 == i24) {
                                            }
                                            break;
                                        case 22:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                        case 39:
                                        case 43:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe5 = unsafe7;
                                            i27 = i62;
                                            zzbcVar4 = zzbcVar9;
                                            i28 = i23;
                                            if (i52 == 2) {
                                                zzf = zzbd.zzf(bArr4, i24, zzczVar, zzbcVar4);
                                                i26 = i28;
                                                i44 = zzf;
                                                i43 = i27;
                                                unsafe6 = unsafe5;
                                                if (i44 == i24) {
                                                }
                                            } else {
                                                if (i52 == 0) {
                                                    i26 = i28;
                                                    i43 = i27;
                                                    unsafe6 = unsafe5;
                                                    i44 = zzbd.zzj(i25, bArr, i24, i2, zzczVar, zzbcVar);
                                                    if (i44 == i24) {
                                                    }
                                                }
                                                i26 = i28;
                                                i43 = i27;
                                                unsafe6 = unsafe5;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            break;
                                        case 23:
                                        case 32:
                                        case 40:
                                        case 46:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe5 = unsafe7;
                                            i27 = i62;
                                            zzbcVar4 = zzbcVar9;
                                            i28 = i23;
                                            if (i52 == 2) {
                                                zzdr zzdrVar3 = (zzdr) zzczVar;
                                                zzf = zzbd.zzh(bArr4, i24, zzbcVar4);
                                                int i66 = zzbcVar4.zza + zzf;
                                                while (zzf < i66) {
                                                    zzdrVar3.zzf(zzbd.zzn(bArr4, zzf));
                                                    zzf += 8;
                                                }
                                                if (zzf != i66) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i52 == 1) {
                                                    zzf = i24 + 8;
                                                    zzdr zzdrVar4 = (zzdr) zzczVar;
                                                    zzdrVar4.zzf(zzbd.zzn(bArr4, i24));
                                                    while (zzf < i41) {
                                                        int zzh6 = zzbd.zzh(bArr4, zzf, zzbcVar4);
                                                        if (i25 == zzbcVar4.zza) {
                                                            zzdrVar4.zzf(zzbd.zzn(bArr4, zzh6));
                                                            zzf = zzh6 + 8;
                                                        }
                                                    }
                                                }
                                                i26 = i28;
                                                i43 = i27;
                                                unsafe6 = unsafe5;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            i26 = i28;
                                            i44 = zzf;
                                            i43 = i27;
                                            unsafe6 = unsafe5;
                                            if (i44 == i24) {
                                            }
                                            break;
                                        case 24:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                        case 41:
                                        case 45:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe5 = unsafe7;
                                            i27 = i62;
                                            zzbcVar4 = zzbcVar9;
                                            i28 = i23;
                                            if (i52 == 2) {
                                                zzct zzctVar = (zzct) zzczVar;
                                                zzf = zzbd.zzh(bArr4, i24, zzbcVar4);
                                                int i67 = zzbcVar4.zza + zzf;
                                                while (zzf < i67) {
                                                    zzctVar.zzg(zzbd.zzb(bArr4, zzf));
                                                    zzf += 4;
                                                }
                                                if (zzf != i67) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i52 == 5) {
                                                    zzf = i24 + 4;
                                                    zzct zzctVar2 = (zzct) zzczVar;
                                                    zzctVar2.zzg(zzbd.zzb(bArr4, i24));
                                                    while (zzf < i41) {
                                                        int zzh7 = zzbd.zzh(bArr4, zzf, zzbcVar4);
                                                        if (i25 == zzbcVar4.zza) {
                                                            zzctVar2.zzg(zzbd.zzb(bArr4, zzh7));
                                                            zzf = zzh7 + 4;
                                                        }
                                                    }
                                                }
                                                i26 = i28;
                                                i43 = i27;
                                                unsafe6 = unsafe5;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            i26 = i28;
                                            i44 = zzf;
                                            i43 = i27;
                                            unsafe6 = unsafe5;
                                            if (i44 == i24) {
                                            }
                                            break;
                                        case 25:
                                        case 42:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe5 = unsafe7;
                                            i27 = i62;
                                            zzbcVar4 = zzbcVar9;
                                            i28 = i23;
                                            if (i52 == 2) {
                                                zzbe zzbeVar = (zzbe) zzczVar;
                                                zzf = zzbd.zzh(bArr4, i24, zzbcVar4);
                                                int i68 = zzbcVar4.zza + zzf;
                                                while (zzf < i68) {
                                                    zzf = zzbd.zzk(bArr4, zzf, zzbcVar4);
                                                    zzbeVar.zze(zzbcVar4.zzb != 0);
                                                }
                                                if (zzf != i68) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i52 == 0) {
                                                    zzbe zzbeVar2 = (zzbe) zzczVar;
                                                    zzf = zzbd.zzk(bArr4, i24, zzbcVar4);
                                                    zzbeVar2.zze(zzbcVar4.zzb != 0);
                                                    while (zzf < i41) {
                                                        int zzh8 = zzbd.zzh(bArr4, zzf, zzbcVar4);
                                                        if (i25 == zzbcVar4.zza) {
                                                            zzf = zzbd.zzk(bArr4, zzh8, zzbcVar4);
                                                            zzbeVar2.zze(zzbcVar4.zzb != 0);
                                                        }
                                                    }
                                                }
                                                i26 = i28;
                                                i43 = i27;
                                                unsafe6 = unsafe5;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            i26 = i28;
                                            i44 = zzf;
                                            i43 = i27;
                                            unsafe6 = unsafe5;
                                            if (i44 == i24) {
                                            }
                                            break;
                                        case 26:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe5 = unsafe7;
                                            i27 = i62;
                                            zzbcVar4 = zzbcVar9;
                                            i28 = i23;
                                            if (i52 == 2) {
                                                if ((j3 & 536870912) == 0) {
                                                    zzf = zzbd.zzh(bArr4, i24, zzbcVar4);
                                                    int i69 = zzbcVar4.zza;
                                                    if (i69 < 0) {
                                                        throw zzdc.zzd();
                                                    }
                                                    if (i69 == 0) {
                                                        zzczVar.add("");
                                                    } else {
                                                        zzczVar.add(new String(bArr4, zzf, i69, zzda.zzb));
                                                        zzf += i69;
                                                    }
                                                    while (zzf < i41) {
                                                        int zzh9 = zzbd.zzh(bArr4, zzf, zzbcVar4);
                                                        if (i25 == zzbcVar4.zza) {
                                                            zzf = zzbd.zzh(bArr4, zzh9, zzbcVar4);
                                                            int i70 = zzbcVar4.zza;
                                                            if (i70 < 0) {
                                                                throw zzdc.zzd();
                                                            }
                                                            if (i70 == 0) {
                                                                zzczVar.add("");
                                                            } else {
                                                                zzczVar.add(new String(bArr4, zzf, i70, zzda.zzb));
                                                                zzf += i70;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    zzf = zzbd.zzh(bArr4, i24, zzbcVar4);
                                                    int i71 = zzbcVar4.zza;
                                                    if (i71 < 0) {
                                                        throw zzdc.zzd();
                                                    }
                                                    if (i71 == 0) {
                                                        zzczVar.add("");
                                                    } else {
                                                        int i72 = zzf + i71;
                                                        if (!zzfu.zze(bArr4, zzf, i72)) {
                                                            throw zzdc.zzc();
                                                        }
                                                        zzczVar.add(new String(bArr4, zzf, i71, zzda.zzb));
                                                        zzf = i72;
                                                    }
                                                    while (zzf < i41) {
                                                        int zzh10 = zzbd.zzh(bArr4, zzf, zzbcVar4);
                                                        if (i25 == zzbcVar4.zza) {
                                                            zzf = zzbd.zzh(bArr4, zzh10, zzbcVar4);
                                                            int i73 = zzbcVar4.zza;
                                                            if (i73 < 0) {
                                                                throw zzdc.zzd();
                                                            }
                                                            if (i73 == 0) {
                                                                zzczVar.add("");
                                                            } else {
                                                                int i74 = zzf + i73;
                                                                if (!zzfu.zze(bArr4, zzf, i74)) {
                                                                    throw zzdc.zzc();
                                                                }
                                                                zzczVar.add(new String(bArr4, zzf, i73, zzda.zzb));
                                                                zzf = i74;
                                                            }
                                                        }
                                                    }
                                                }
                                                i26 = i28;
                                                i44 = zzf;
                                                i43 = i27;
                                                unsafe6 = unsafe5;
                                                if (i44 == i24) {
                                                }
                                            }
                                            i26 = i28;
                                            i43 = i27;
                                            unsafe6 = unsafe5;
                                            i44 = i24;
                                            if (i44 == i24) {
                                            }
                                            break;
                                        case 27:
                                            int i75 = i23;
                                            if (i52 == 2) {
                                                zzefVar = this;
                                                i24 = i57;
                                                int zze = zzbd.zze(zzefVar.zzv(i62), i55, bArr, i57, i2, zzczVar, zzbcVar);
                                                zzbcVar4 = zzbcVar9;
                                                i43 = i62;
                                                unsafe6 = unsafe7;
                                                i25 = i55;
                                                i41 = i41;
                                                i26 = i75;
                                                i44 = zze;
                                                if (i44 == i24) {
                                                }
                                            } else {
                                                zzefVar = this;
                                                i24 = i57;
                                                i26 = i75;
                                                zzbcVar4 = zzbcVar9;
                                                i25 = i55;
                                                unsafe6 = unsafe7;
                                                i43 = i62;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            break;
                                        case 28:
                                            zzbcVar5 = zzbcVar9;
                                            int i76 = i23;
                                            if (i52 == 2) {
                                                int zzh11 = zzbd.zzh(bArr4, i57, zzbcVar5);
                                                int i77 = zzbcVar5.zza;
                                                if (i77 < 0) {
                                                    throw zzdc.zzd();
                                                }
                                                if (i77 > bArr4.length - zzh11) {
                                                    throw zzdc.zzg();
                                                }
                                                if (i77 == 0) {
                                                    zzczVar.add(zzbq.zzb);
                                                } else {
                                                    zzczVar.add(zzbq.zzl(bArr4, zzh11, i77));
                                                    zzh11 += i77;
                                                }
                                                while (zzh11 < i41) {
                                                    int zzh12 = zzbd.zzh(bArr4, zzh11, zzbcVar5);
                                                    if (i55 == zzbcVar5.zza) {
                                                        zzh11 = zzbd.zzh(bArr4, zzh12, zzbcVar5);
                                                        int i78 = zzbcVar5.zza;
                                                        if (i78 < 0) {
                                                            throw zzdc.zzd();
                                                        }
                                                        if (i78 > bArr4.length - zzh11) {
                                                            throw zzdc.zzg();
                                                        }
                                                        if (i78 == 0) {
                                                            zzczVar.add(zzbq.zzb);
                                                        } else {
                                                            zzczVar.add(zzbq.zzl(bArr4, zzh11, i78));
                                                            zzh11 += i78;
                                                        }
                                                    } else {
                                                        i44 = zzh11;
                                                        i26 = i76;
                                                        i25 = i55;
                                                        i24 = i57;
                                                        unsafe6 = unsafe7;
                                                        zzefVar = this;
                                                        zzbcVar4 = zzbcVar5;
                                                        i43 = i62;
                                                        if (i44 == i24) {
                                                        }
                                                    }
                                                }
                                                i44 = zzh11;
                                                i26 = i76;
                                                i25 = i55;
                                                i24 = i57;
                                                unsafe6 = unsafe7;
                                                zzefVar = this;
                                                zzbcVar4 = zzbcVar5;
                                                i43 = i62;
                                                if (i44 == i24) {
                                                }
                                            } else {
                                                zzefVar = this;
                                                i26 = i76;
                                                i25 = i55;
                                                i24 = i57;
                                                unsafe6 = unsafe7;
                                                zzbcVar4 = zzbcVar5;
                                                i43 = i62;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            break;
                                        case 30:
                                        case 44:
                                            i29 = i55;
                                            if (i52 == 2) {
                                                zzj = zzbd.zzf(bArr4, i57, zzczVar, zzbcVar9);
                                                zzbcVar5 = zzbcVar9;
                                                i31 = i62;
                                                i30 = i23;
                                            } else if (i52 == 0) {
                                                zzbcVar5 = zzbcVar9;
                                                i30 = i23;
                                                i31 = i62;
                                                zzj = zzbd.zzj(i29, bArr, i57, i2, zzczVar, zzbcVar);
                                            } else {
                                                zzefVar = this;
                                                i25 = i29;
                                                i24 = i57;
                                                unsafe6 = unsafe7;
                                                i43 = i62;
                                                i26 = i23;
                                                zzbcVar4 = zzbcVar9;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            zzcw zzu2 = zzefVar.zzu(i31);
                                            zzff zzffVar = zzefVar.zzm;
                                            int i79 = zzeq.zza;
                                            if (zzu2 == null) {
                                                i32 = zzj;
                                                i62 = i31;
                                            } else if (zzczVar instanceof RandomAccess) {
                                                int size2 = zzczVar.size();
                                                i32 = zzj;
                                                Object obj3 = null;
                                                int i80 = 0;
                                                int i81 = 0;
                                                while (i80 < size2) {
                                                    Integer num = (Integer) zzczVar.get(i80);
                                                    int i82 = i31;
                                                    int intValue = num.intValue();
                                                    if (zzu2.zza(intValue)) {
                                                        if (i80 != i81) {
                                                            zzczVar.set(i81, num);
                                                        }
                                                        i81++;
                                                    } else {
                                                        obj3 = zzeq.zzo(obj2, i30, intValue, obj3, zzffVar);
                                                    }
                                                    i80++;
                                                    i31 = i82;
                                                }
                                                i62 = i31;
                                                if (i81 != size2) {
                                                    zzczVar.subList(i81, size2).clear();
                                                }
                                            } else {
                                                i32 = zzj;
                                                i62 = i31;
                                                Iterator it = zzczVar.iterator();
                                                Object obj4 = null;
                                                while (it.hasNext()) {
                                                    int intValue2 = ((Integer) it.next()).intValue();
                                                    if (!zzu2.zza(intValue2)) {
                                                        obj4 = zzeq.zzo(obj2, i30, intValue2, obj4, zzffVar);
                                                        it.remove();
                                                    }
                                                }
                                            }
                                            zzefVar = this;
                                            i44 = i32;
                                            i26 = i30;
                                            i25 = i29;
                                            i24 = i57;
                                            unsafe6 = unsafe7;
                                            zzbcVar4 = zzbcVar5;
                                            i43 = i62;
                                            if (i44 == i24) {
                                            }
                                            break;
                                        case 33:
                                        case 47:
                                            i29 = i55;
                                            if (i52 == 2) {
                                                zzct zzctVar3 = (zzct) zzczVar;
                                                zzh = zzbd.zzh(bArr4, i57, zzbcVar9);
                                                int i83 = zzbcVar9.zza + zzh;
                                                while (zzh < i83) {
                                                    zzh = zzbd.zzh(bArr4, zzh, zzbcVar9);
                                                    zzctVar3.zzg(zzbu.zzb(zzbcVar9.zza));
                                                }
                                                if (zzh != i83) {
                                                    throw zzdc.zzg();
                                                }
                                            } else {
                                                if (i52 == 0) {
                                                    zzct zzctVar4 = (zzct) zzczVar;
                                                    zzh = zzbd.zzh(bArr4, i57, zzbcVar9);
                                                    zzctVar4.zzg(zzbu.zzb(zzbcVar9.zza));
                                                    while (zzh < i41) {
                                                        int zzh13 = zzbd.zzh(bArr4, zzh, zzbcVar9);
                                                        if (i29 == zzbcVar9.zza) {
                                                            zzh = zzbd.zzh(bArr4, zzh13, zzbcVar9);
                                                            zzctVar4.zzg(zzbu.zzb(zzbcVar9.zza));
                                                        }
                                                    }
                                                }
                                                i25 = i29;
                                                i24 = i57;
                                                unsafe6 = unsafe7;
                                                i43 = i62;
                                                i26 = i23;
                                                zzbcVar4 = zzbcVar9;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            i25 = i29;
                                            i24 = i57;
                                            unsafe6 = unsafe7;
                                            i43 = i62;
                                            i26 = i23;
                                            zzbcVar4 = zzbcVar9;
                                            i44 = zzh;
                                            if (i44 == i24) {
                                            }
                                            break;
                                        case 34:
                                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                            if (i52 == 2) {
                                                zzdr zzdrVar5 = (zzdr) zzczVar;
                                                zzh = zzbd.zzh(bArr4, i57, zzbcVar9);
                                                int i84 = zzbcVar9.zza + zzh;
                                                while (zzh < i84) {
                                                    zzh = zzbd.zzk(bArr4, zzh, zzbcVar9);
                                                    zzdrVar5.zzf(zzbu.zzc(zzbcVar9.zzb));
                                                }
                                                if (zzh != i84) {
                                                    throw zzdc.zzg();
                                                }
                                                i24 = i57;
                                                i25 = i55;
                                                unsafe6 = unsafe7;
                                                i43 = i62;
                                                i26 = i23;
                                                zzbcVar4 = zzbcVar9;
                                                i44 = zzh;
                                                if (i44 == i24) {
                                                }
                                            } else if (i52 == 0) {
                                                zzdr zzdrVar6 = (zzdr) zzczVar;
                                                zzh = zzbd.zzk(bArr4, i57, zzbcVar9);
                                                zzdrVar6.zzf(zzbu.zzc(zzbcVar9.zzb));
                                                while (true) {
                                                    if (zzh < i41) {
                                                        int zzh14 = zzbd.zzh(bArr4, zzh, zzbcVar9);
                                                        i29 = i55;
                                                        if (i29 == zzbcVar9.zza) {
                                                            zzh = zzbd.zzk(bArr4, zzh14, zzbcVar9);
                                                            zzdrVar6.zzf(zzbu.zzc(zzbcVar9.zzb));
                                                            i55 = i29;
                                                        }
                                                    } else {
                                                        i29 = i55;
                                                    }
                                                }
                                                i25 = i29;
                                                i24 = i57;
                                                unsafe6 = unsafe7;
                                                i43 = i62;
                                                i26 = i23;
                                                zzbcVar4 = zzbcVar9;
                                                i44 = zzh;
                                                if (i44 == i24) {
                                                }
                                            } else {
                                                i24 = i57;
                                                i25 = i55;
                                                unsafe6 = unsafe7;
                                                i43 = i62;
                                                i26 = i23;
                                                zzbcVar4 = zzbcVar9;
                                                i44 = i24;
                                                if (i44 == i24) {
                                                }
                                            }
                                            break;
                                        default:
                                            i24 = i57;
                                            i25 = i55;
                                            unsafe6 = unsafe7;
                                            i43 = i62;
                                            i26 = i23;
                                            zzbcVar4 = zzbcVar9;
                                            if (i52 == 3) {
                                                int i85 = (i25 & (-8)) | 4;
                                                zzeo zzv = zzefVar.zzv(i43);
                                                i44 = zzbd.zzc(zzv, bArr, i24, i2, i85, zzbcVar);
                                                zzczVar.add(zzbcVar4.zzc);
                                                while (i44 < i41) {
                                                    int zzh15 = zzbd.zzh(bArr4, i44, zzbcVar4);
                                                    if (i25 == zzbcVar4.zza) {
                                                        i44 = zzbd.zzc(zzv, bArr, zzh15, i2, i85, zzbcVar);
                                                        zzczVar.add(zzbcVar4.zzc);
                                                    } else if (i44 == i24) {
                                                    }
                                                }
                                                if (i44 == i24) {
                                                }
                                            }
                                            i44 = i24;
                                            if (i44 == i24) {
                                            }
                                            break;
                                    }
                                }
                            } else if (i52 == 2) {
                                zzcz zzczVar2 = (zzcz) unsafe7.getObject(obj2, j);
                                if (!zzczVar2.zzc()) {
                                    int size3 = zzczVar2.size();
                                    zzczVar2 = zzczVar2.zzd(size3 == 0 ? 10 : size3 + size3);
                                    unsafe7.putObject(obj2, j, zzczVar2);
                                }
                                int zze2 = zzbd.zze(zzefVar.zzv(i56), i55, bArr, i57, i2, zzczVar2, zzbcVar);
                                i42 = i3;
                                zzbcVar8 = zzbcVar9;
                                i41 = i41;
                                i45 = i51;
                                unsafe6 = unsafe7;
                                i46 = i56;
                                i44 = zze2;
                                i49 = i10;
                                i47 = i55;
                                i48 = i9;
                                i43 = 0;
                            } else {
                                unsafe2 = unsafe7;
                                i35 = i55;
                                zzbcVar6 = zzbcVar9;
                                i34 = i56;
                                i36 = i57;
                                i4 = i3;
                                i43 = i34;
                                i11 = i51;
                                i47 = i35;
                                i8 = i36;
                                zzbcVar2 = zzbcVar6;
                            }
                        } else {
                            int i86 = iArr[i7 + 2];
                            int i87 = 1 << (i86 >>> 20);
                            int i88 = i86 & 1048575;
                            if (i88 != i49) {
                                if (i49 != 1048575) {
                                    unsafe6.putInt(obj2, i49, i48);
                                }
                                i48 = i88 == 1048575 ? 0 : unsafe6.getInt(obj2, i88);
                                i10 = i88;
                            } else {
                                i10 = i49;
                            }
                            switch (zzr) {
                                case 0:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    i43 = 0;
                                    if (i52 != 1) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        i44 = i14 + 8;
                                        i48 |= i87;
                                        zzfp.zzo(obj2, j, Double.longBitsToDouble(zzbd.zzn(bArr4, i14)));
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 1:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    i43 = 0;
                                    if (i52 != 5) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        i44 = i14 + 4;
                                        i48 |= i87;
                                        zzfp.zzp(obj2, j, Float.intBitsToFloat(zzbd.zzb(bArr4, i14)));
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 2:
                                case 3:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    i43 = 0;
                                    if (i52 != 0) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        int i89 = i48 | i87;
                                        int zzk2 = zzbd.zzk(bArr4, i14, zzbcVar8);
                                        unsafe6.putLong(obj, j, zzbcVar8.zzb);
                                        i48 = i89;
                                        i44 = zzk2;
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 4:
                                case 11:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    i43 = 0;
                                    if (i52 != 0) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        i48 |= i87;
                                        i44 = zzbd.zzh(bArr4, i14, zzbcVar8);
                                        unsafe6.putInt(obj2, j, zzbcVar8.zza);
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 5:
                                case 14:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    i43 = 0;
                                    if (i52 != 1) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        unsafe6.putLong(obj, j, zzbd.zzn(bArr4, i14));
                                        i44 = i14 + 8;
                                        i48 = i87 | i48;
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 6:
                                case 13:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    i43 = 0;
                                    if (i52 != 5) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        i44 = i14 + 4;
                                        i48 |= i87;
                                        unsafe6.putInt(obj2, j, zzbd.zzb(bArr4, i14));
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 7:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    i43 = 0;
                                    if (i52 != 0) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        i48 |= i87;
                                        i44 = zzbd.zzk(bArr4, i14, zzbcVar8);
                                        zzfp.zzm(obj2, j, zzbcVar8.zzb != 0);
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 8:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    if (i52 != 2) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        if ((i53 & DriveFile.MODE_WRITE_ONLY) != 0) {
                                            i44 = zzbd.zzh(bArr4, i14, zzbcVar8);
                                            int i90 = zzbcVar8.zza;
                                            if (i90 < 0) {
                                                throw zzdc.zzd();
                                            }
                                            int i91 = i48 | i87;
                                            if (i90 == 0) {
                                                zzbcVar8.zzc = "";
                                                i19 = i91;
                                                i43 = 0;
                                            } else {
                                                int i92 = zzfu.zza;
                                                int length = bArr4.length;
                                                if ((((length - i44) - i90) | i44 | i90) < 0) {
                                                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i44), Integer.valueOf(i90)));
                                                }
                                                int i93 = i44 + i90;
                                                char[] cArr = new char[i90];
                                                int i94 = 0;
                                                while (i44 < i93) {
                                                    byte b2 = bArr4[i44];
                                                    if (zzfq.zzd(b2)) {
                                                        i44++;
                                                        cArr[i94] = (char) b2;
                                                        i94++;
                                                    } else {
                                                        while (i44 < i93) {
                                                            int i95 = i44 + 1;
                                                            byte b3 = bArr4[i44];
                                                            if (zzfq.zzd(b3)) {
                                                                cArr[i94] = (char) b3;
                                                                i94++;
                                                                i44 = i95;
                                                                while (i44 < i93) {
                                                                    byte b4 = bArr4[i44];
                                                                    if (zzfq.zzd(b4)) {
                                                                        i44++;
                                                                        cArr[i94] = (char) b4;
                                                                        i94++;
                                                                    }
                                                                }
                                                            } else {
                                                                int i96 = i91;
                                                                if (b3 < -32) {
                                                                    if (i95 >= i93) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    i20 = i94 + 1;
                                                                    i44 += 2;
                                                                    zzfq.zzc(b3, bArr4[i95], cArr, i94);
                                                                } else if (b3 < -16) {
                                                                    if (i95 >= i93 - 1) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    i20 = i94 + 1;
                                                                    zzfq.zzb(b3, bArr4[i95], bArr4[i44 + 2], cArr, i94);
                                                                    i44 += 3;
                                                                } else {
                                                                    if (i95 >= i93 - 2) {
                                                                        throw zzdc.zzc();
                                                                    }
                                                                    byte b5 = bArr4[i95];
                                                                    int i97 = i44 + 3;
                                                                    byte b6 = bArr4[i44 + 2];
                                                                    i44 += 4;
                                                                    zzfq.zza(b3, b5, b6, bArr4[i97], cArr, i94);
                                                                    i94 += 2;
                                                                    i91 = i96;
                                                                }
                                                                i94 = i20;
                                                                i91 = i96;
                                                            }
                                                        }
                                                        i19 = i91;
                                                        i43 = 0;
                                                        zzbcVar8.zzc = new String(cArr, 0, i94);
                                                        i44 = i93;
                                                    }
                                                }
                                                while (i44 < i93) {
                                                }
                                                i19 = i91;
                                                i43 = 0;
                                                zzbcVar8.zzc = new String(cArr, 0, i94);
                                                i44 = i93;
                                            }
                                            i48 = i19;
                                        } else {
                                            i43 = 0;
                                            i44 = zzbd.zzh(bArr4, i14, zzbcVar8);
                                            int i98 = zzbcVar8.zza;
                                            if (i98 < 0) {
                                                throw zzdc.zzd();
                                            }
                                            i48 |= i87;
                                            if (i98 == 0) {
                                                zzbcVar8.zzc = "";
                                            } else {
                                                zzbcVar8.zzc = new String(bArr4, i44, i98, zzda.zzb);
                                                i44 += i98;
                                            }
                                        }
                                        unsafe6.putObject(obj2, j, zzbcVar8.zzc);
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                    break;
                                case 9:
                                    i15 = i7;
                                    i16 = i54;
                                    if (i52 != 2) {
                                        i18 = i5;
                                        i17 = i48;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        int i99 = i48 | i87;
                                        Object zzx = zzefVar.zzx(obj2, i15);
                                        i44 = zzbd.zzm(zzx, zzefVar.zzv(i15), bArr, i5, i2, zzbcVar);
                                        zzefVar.zzF(obj2, i15, zzx);
                                        i48 = i99;
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 10:
                                    i15 = i7;
                                    i16 = i54;
                                    if (i52 != 2) {
                                        i18 = i5;
                                        i17 = i48;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        i48 |= i87;
                                        i44 = zzbd.zza(bArr4, i5, zzbcVar8);
                                        unsafe6.putObject(obj2, j, zzbcVar8.zzc);
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 12:
                                    i15 = i7;
                                    i16 = i54;
                                    if (i52 != 0) {
                                        i18 = i5;
                                        i17 = i48;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        i44 = zzbd.zzh(bArr4, i5, zzbcVar8);
                                        int i100 = zzbcVar8.zza;
                                        zzcw zzu3 = zzefVar.zzu(i15);
                                        if ((i53 & Integer.MIN_VALUE) == 0 || zzu3 == null || zzu3.zza(i100)) {
                                            i48 |= i87;
                                            unsafe6.putInt(obj2, j, i100);
                                        } else {
                                            zzd(obj).zzj(i16, Long.valueOf(i100));
                                        }
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 15:
                                    i15 = i7;
                                    i16 = i54;
                                    if (i52 != 0) {
                                        i18 = i5;
                                        i17 = i48;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        i48 |= i87;
                                        i44 = zzbd.zzh(bArr4, i5, zzbcVar8);
                                        unsafe6.putInt(obj2, j, zzbu.zzb(zzbcVar8.zza));
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                case 16:
                                    if (i52 != 0) {
                                        i18 = i5;
                                        i22 = i7;
                                        i17 = i48;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i54;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        int i101 = i48 | i87;
                                        int zzk3 = zzbd.zzk(bArr4, i5, zzbcVar8);
                                        i15 = i7;
                                        i16 = i54;
                                        unsafe6.putLong(obj, j, zzbu.zzc(zzbcVar8.zzb));
                                        i48 = i101;
                                        i44 = zzk3;
                                        i47 = i16;
                                        i46 = i15;
                                        i49 = i10;
                                        i45 = i51;
                                        i43 = 0;
                                        i41 = i2;
                                        i42 = i3;
                                    }
                                default:
                                    i14 = i5;
                                    i15 = i7;
                                    i16 = i54;
                                    if (i52 != 3) {
                                        i17 = i48;
                                        i18 = i14;
                                        unsafe4 = unsafe6;
                                        zzbcVar3 = zzbcVar8;
                                        i21 = i16;
                                        i22 = i15;
                                        unsafe2 = unsafe4;
                                        i43 = i22;
                                        i9 = i17;
                                        i47 = i21;
                                        i4 = i3;
                                        zzbcVar2 = zzbcVar3;
                                        i11 = i51;
                                        i8 = i18;
                                        break;
                                    } else {
                                        Object zzx2 = zzefVar.zzx(obj2, i15);
                                        int zzl2 = zzbd.zzl(zzx2, zzefVar.zzv(i15), bArr, i14, i2, (i51 << 3) | 4, zzbcVar);
                                        zzefVar.zzF(obj2, i15, zzx2);
                                        i42 = i3;
                                        zzbcVar8 = zzbcVar;
                                        i41 = i2;
                                        i45 = i51;
                                        unsafe6 = unsafe6;
                                        i46 = i15;
                                        i44 = zzl2;
                                        i49 = i10;
                                        i47 = i16;
                                        i43 = 0;
                                        i48 |= i87;
                                    }
                            }
                        }
                    } else {
                        i8 = i5;
                        i9 = i48;
                        i10 = i49;
                        i11 = i51;
                        unsafe2 = unsafe6;
                        zzbcVar2 = zzbcVar8;
                        i4 = i42;
                    }
                    if (i47 == i4 || i4 == 0) {
                        if (zzefVar.zzh || zzbcVar2.zzd == zzcd.zza) {
                            i12 = i11;
                            i13 = i47;
                            unsafe3 = unsafe2;
                            i44 = zzbd.zzg(i13, bArr, i8, i2, zzd(obj), zzbcVar);
                        } else {
                            if (zzbcVar2.zzd.zzb(zzefVar.zzg, i11) != null) {
                                throw null;
                            }
                            i12 = i11;
                            i13 = i47;
                            unsafe3 = unsafe2;
                            i44 = zzbd.zzg(i47, bArr, i8, i2, zzd(obj), zzbcVar);
                        }
                        bArr4 = bArr;
                        i41 = i2;
                        i46 = i43;
                        i45 = i12;
                        i47 = i13;
                        unsafe6 = unsafe3;
                        i49 = i10;
                        i48 = i9;
                        i43 = 0;
                        zzbcVar8 = zzbcVar;
                        i42 = i4;
                    } else {
                        i44 = i8;
                        i49 = i10;
                        i48 = i9;
                        unsafe = unsafe2;
                    }
                } else {
                    zzq = zzefVar.zzq(i51, i43);
                }
                i7 = zzq;
                i6 = -1;
                if (i7 == i6) {
                }
                if (i47 == i4) {
                }
                if (zzefVar.zzh) {
                }
                i12 = i11;
                i13 = i47;
                unsafe3 = unsafe2;
                i44 = zzbd.zzg(i13, bArr, i8, i2, zzd(obj), zzbcVar);
                bArr4 = bArr;
                i41 = i2;
                i46 = i43;
                i45 = i12;
                i47 = i13;
                unsafe6 = unsafe3;
                i49 = i10;
                i48 = i9;
                i43 = 0;
                zzbcVar8 = zzbcVar;
                i42 = i4;
            } else {
                i4 = i42;
                unsafe = unsafe6;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzcs) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzu(Integer.MAX_VALUE);
                zzcsVar.zza = 0;
                zzcsVar.zzs();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzs = zzs(i);
                int i2 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j = i2;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                                this.zzl.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzdw) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i], i)) {
                        zzv(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzI(obj, i)) {
                    zzv(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzd(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            int i2 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i3 = iArr[i];
            long j = i2;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i)) {
                        zzfp.zzo(obj, j, zzfp.zza(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i)) {
                        zzfp.zzp(obj, j, zzfp.zzb(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i)) {
                        zzfp.zzm(obj, j, zzfp.zzw(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i);
                    break;
                case 10:
                    if (zzI(obj2, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i)) {
                        zzfp.zzq(obj, j, zzfp.zzc(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i)) {
                        zzfp.zzr(obj, j, zzfp.zzd(obj2, j));
                        zzD(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i);
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
                    this.zzl.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i4 = zzeq.zza;
                    zzfp.zzs(obj, j, zzdx.zza(zzfp.zzf(obj, j), zzfp.zzf(obj2, j)));
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
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzC(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj2, i3, i)) {
                        zzfp.zzs(obj, j, zzfp.zzf(obj2, j));
                        zzE(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzbc zzbcVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, zzfx zzfxVar) throws IOException {
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
            zzci zzb2 = this.zzn.zzb(obj);
            if (!zzb2.zza.isEmpty()) {
                Iterator zzf = zzb2.zzf();
                entry = (Map.Entry) zzf.next();
                it = zzf;
                iArr = this.zzc;
                Unsafe unsafe = zzb;
                int i4 = 1048575;
                int i5 = 0;
                i = 0;
                while (i < iArr.length) {
                    int zzs = zzs(i);
                    int[] iArr3 = this.zzc;
                    int zzr = zzr(zzs);
                    int i6 = iArr3[i];
                    if (zzr <= 17) {
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
                    while (entry2 != null && this.zzn.zza(entry2) <= i6) {
                        this.zzn.zze(zzfxVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzs & 1048575;
                    switch (zzr) {
                        case 0:
                            it2 = it;
                            iArr2 = iArr;
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzf(i6, zzfp.zza(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzo(i6, zzfp.zzb(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzt(i6, unsafe.getLong(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzK(i6, unsafe.getLong(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzr(i6, unsafe.getInt(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzm(i6, unsafe.getLong(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzk(i6, unsafe.getInt(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzb(i6, zzfp.zzw(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzO(i6, unsafe.getObject(obj, j), zzfxVar);
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzv(i6, unsafe.getObject(obj, j), zzv(i));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzd(i6, (zzbq) unsafe.getObject(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzI(i6, unsafe.getInt(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzi(i6, unsafe.getInt(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzx(i6, unsafe.getInt(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzz(i6, unsafe.getLong(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzB(i6, unsafe.getInt(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzD(i6, unsafe.getLong(obj, j));
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
                            if (zzJ(obj, i, i9, i2, i3)) {
                                zzfxVar.zzq(i6, unsafe.getObject(obj, j), zzv(i));
                            }
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 18:
                            zzeq.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 19:
                            zzeq.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 20:
                            zzeq.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 21:
                            zzeq.zzF(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 22:
                            zzeq.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 23:
                            zzeq.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 24:
                            zzeq.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 25:
                            zzeq.zzs(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 26:
                            int i10 = this.zzc[i];
                            List list = (List) unsafe.getObject(obj, j);
                            int i11 = zzeq.zza;
                            if (list != null && !list.isEmpty()) {
                                zzfxVar.zzH(i10, list);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                            break;
                        case 27:
                            int i12 = this.zzc[i];
                            List list2 = (List) unsafe.getObject(obj, j);
                            zzeo zzv = zzv(i);
                            int i13 = zzeq.zza;
                            if (list2 != null && !list2.isEmpty()) {
                                for (int i14 = 0; i14 < list2.size(); i14++) {
                                    ((zzbz) zzfxVar).zzv(i12, list2.get(i14), zzv);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                            break;
                        case 28:
                            int i15 = this.zzc[i];
                            List list3 = (List) unsafe.getObject(obj, j);
                            int i16 = zzeq.zza;
                            if (list3 != null && !list3.isEmpty()) {
                                zzfxVar.zze(i15, list3);
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            zzeq.zzE(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 30:
                            zzeq.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                            zzeq.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 32:
                            zzeq.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 33:
                            zzeq.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 34:
                            zzeq.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, false);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 35:
                            zzeq.zzt(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 36:
                            zzeq.zzx(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 37:
                            zzeq.zzz(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 38:
                            zzeq.zzF(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 39:
                            zzeq.zzy(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 40:
                            zzeq.zzw(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 41:
                            zzeq.zzv(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 42:
                            zzeq.zzs(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 43:
                            zzeq.zzE(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 44:
                            zzeq.zzu(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 45:
                            zzeq.zzA(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 46:
                            zzeq.zzB(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case 47:
                            zzeq.zzC(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            zzeq.zzD(this.zzc[i], (List) unsafe.getObject(obj, j), zzfxVar, true);
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            int i17 = this.zzc[i];
                            List list4 = (List) unsafe.getObject(obj, j);
                            zzeo zzv2 = zzv(i);
                            int i18 = zzeq.zza;
                            if (list4 != null && !list4.isEmpty()) {
                                for (int i19 = 0; i19 < list4.size(); i19++) {
                                    ((zzbz) zzfxVar).zzq(i17, list4.get(i19), zzv2);
                                }
                            }
                            it2 = it;
                            iArr2 = iArr;
                            i += 3;
                            i4 = i9;
                            entry = entry2;
                            it = it2;
                            iArr = iArr2;
                            i5 = i2;
                            break;
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzf(i6, zzm(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzo(i6, zzn(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzt(i6, zzt(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzK(i6, zzt(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzr(i6, zzo(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzm(i6, zzt(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzk(i6, zzo(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzb(i6, zzN(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzO(i6, unsafe.getObject(obj, j), zzfxVar);
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzv(i6, unsafe.getObject(obj, j), zzv(i));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzd(i6, (zzbq) unsafe.getObject(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzI(i6, zzo(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzi(i6, zzo(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzx(i6, zzo(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzz(i6, zzt(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzB(i6, zzo(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzD(i6, zzt(obj, j));
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
                            if (zzM(obj, i6, i)) {
                                zzfxVar.zzq(i6, unsafe.getObject(obj, j), zzv(i));
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
                    this.zzn.zze(zzfxVar, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                zzff zzffVar = this.zzm;
                zzffVar.zzj(zzffVar.zzd(obj), zzfxVar);
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
        zzff zzffVar2 = this.zzm;
        zzffVar2.zzj(zzffVar2.zzd(obj), zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzG;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzs = zzs(i);
            long j = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (zzH(obj, obj2, i) && Double.doubleToLongBits(zzfp.zza(obj, j)) == Double.doubleToLongBits(zzfp.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzH(obj, obj2, i) && Float.floatToIntBits(zzfp.zzb(obj, j)) == Float.floatToIntBits(zzfp.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzH(obj, obj2, i) && zzfp.zzw(obj, j) == zzfp.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzH(obj, obj2, i) && zzfp.zzc(obj, j) == zzfp.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzH(obj, obj2, i) && zzfp.zzd(obj, j) == zzfp.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzH(obj, obj2, i) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
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
                    zzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
                    break;
                case 50:
                    zzG = zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j));
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
                    long zzp = zzp(i) & 1048575;
                    if (zzfp.zzc(obj, zzp) == zzfp.zzc(obj2, zzp) && zzeq.zzG(zzfp.zzf(obj, j), zzfp.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzG) {
                return false;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i5];
            int i7 = iArr2[i6];
            int zzs = zzs(i6);
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
            if ((268435456 & zzs) != 0 && !zzJ(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i7, i6) && !zzK(obj, zzs, zzv(i6))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzdw) zzfp.zzf(obj, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzfp.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzeo zzv = zzv(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzv.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i6, i, i2, i10) && !zzK(obj, zzs, zzv(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.zzh || this.zzn.zzb(obj).zzj();
    }
}
