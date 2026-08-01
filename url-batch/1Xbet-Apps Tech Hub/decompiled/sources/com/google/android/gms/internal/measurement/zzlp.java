package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes2.dex */
final class zzlp<T> implements zzlx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzla zzm;
    private final zzmo zzn;
    private final zzjs zzo;
    private final zzlr zzp;
    private final zzlh zzq;

    private zzlp(int[] iArr, Object[] objArr, int i, int i2, zzlm zzlmVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjsVar != null && zzjsVar.zzc(zzlmVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzlrVar;
        this.zzm = zzlaVar;
        this.zzn = zzmoVar;
        this.zzo = zzjsVar;
        this.zzg = zzlmVar;
        this.zzq = zzlhVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmy.zzf(obj, j)).longValue();
    }

    private final zzkj zzD(int i) {
        int i2 = i / 3;
        return (zzkj) this.zzd[i2 + i2 + 1];
    }

    private final zzlx zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlx zzlxVar = (zzlx) this.zzd[i3];
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zzb2 = zzlu.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzG(Object obj, int i) {
        zzlx zzE = zzE(i);
        long zzB = zzB(i) & 1048575;
        if (!zzT(obj, i)) {
            return zzE.zze();
        }
        Object object = zzb.getObject(obj, zzB);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzE.zze();
        if (object != null) {
            zzE.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzH(Object obj, int i, int i2) {
        zzlx zzE = zzE(i2);
        if (!zzX(obj, i, i2)) {
            return zzE.zze();
        }
        Object object = zzb.getObject(obj, zzB(i2) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzE.zze();
        if (object != null) {
            zzE.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzI(Class cls, String str) {
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

    private static void zzJ(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        if (zzT(obj2, i)) {
            long zzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzE = zzE(i);
            if (!zzT(obj, i)) {
                if (zzW(object)) {
                    Object zze = zzE.zze();
                    zzE.zzg(zze, object);
                    unsafe.putObject(obj, zzB, zze);
                } else {
                    unsafe.putObject(obj, zzB, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzB);
            if (!zzW(object2)) {
                Object zze2 = zzE.zze();
                zzE.zzg(zze2, object2);
                unsafe.putObject(obj, zzB, zze2);
                object2 = zze2;
            }
            zzE.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzX(obj2, i2, i)) {
            long zzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzE = zzE(i);
            if (!zzX(obj, i2, i)) {
                if (zzW(object)) {
                    Object zze = zzE.zze();
                    zzE.zzg(zze, object);
                    unsafe.putObject(obj, zzB, zze);
                } else {
                    unsafe.putObject(obj, zzB, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzB);
            if (!zzW(object2)) {
                Object zze2 = zzE.zze();
                zzE.zzg(zze2, object2);
                unsafe.putObject(obj, zzB, zze2);
                object2 = zze2;
            }
            zzE.zzg(object2, object);
        }
    }

    private final void zzM(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzmy.zzq(obj, j, (1 << (zzy >>> 20)) | zzmy.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzmy.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzB(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzB(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzQ(Object obj, zzng zzngVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int zzB = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzB & i2;
            switch (zzA) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzf(i6, zzmy.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzo(i6, zzmy.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzb(i6, zzmy.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 18:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 21:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 23:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 24:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case 28:
                    zzlz.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 29:
                    z = false;
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 30:
                    z = false;
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 31:
                    z = false;
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 32:
                    z = false;
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 33:
                    z = false;
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 34:
                    z = false;
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 41:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case 50:
                    zzR(zzngVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzb(i6, zzY(obj, j));
                    }
                    break;
                case 59:
                    if (zzX(obj, i6, i4)) {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                    }
                    break;
                case 60:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 61:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case 65:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case 66:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    private final void zzR(zzng zzngVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzS(Object obj, Object obj2, int i) {
        return zzT(obj, i) == zzT(obj2, i);
    }

    private final boolean zzT(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzmy.zzc(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j2 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmy.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmy.zzb(obj, j2)) != 0;
            case 2:
                return zzmy.zzd(obj, j2) != 0;
            case 3:
                return zzmy.zzd(obj, j2) != 0;
            case 4:
                return zzmy.zzc(obj, j2) != 0;
            case 5:
                return zzmy.zzd(obj, j2) != 0;
            case 6:
                return zzmy.zzc(obj, j2) != 0;
            case 7:
                return zzmy.zzw(obj, j2);
            case 8:
                Object zzf = zzmy.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzje) {
                    return !zzje.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmy.zzf(obj, j2) != null;
            case 10:
                return !zzje.zzb.equals(zzmy.zzf(obj, j2));
            case 11:
                return zzmy.zzc(obj, j2) != 0;
            case 12:
                return zzmy.zzc(obj, j2) != 0;
            case 13:
                return zzmy.zzc(obj, j2) != 0;
            case 14:
                return zzmy.zzd(obj, j2) != 0;
            case 15:
                return zzmy.zzc(obj, j2) != 0;
            case 16:
                return zzmy.zzd(obj, j2) != 0;
            case 17:
                return zzmy.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzT(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzV(Object obj, int i, zzlx zzlxVar) {
        return zzlxVar.zzk(zzmy.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkf) {
            return ((zzkf) obj).zzbO();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        return zzmy.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzmy.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzng zzngVar) throws IOException {
        if (obj instanceof String) {
            zzngVar.zzF(i, (String) obj);
        } else {
            zzngVar.zzd(i, (zzje) obj);
        }
    }

    static zzmp zzd(Object obj) {
        zzkf zzkfVar = (zzkf) obj;
        zzmp zzmpVar = zzkfVar.zzc;
        if (zzmpVar != zzmp.zzc()) {
            return zzmpVar;
        }
        zzmp zzf = zzmp.zzf();
        zzkfVar.zzc = zzf;
        return zzf;
    }

    static zzlp zzl(Class cls, zzlj zzljVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        if (zzljVar instanceof zzlw) {
            return zzm((zzlw) zzljVar, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzlp zzm(zzlw zzlwVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        Object[] objArr;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        Field zzI;
        char charAt12;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field zzI2;
        Object obj2;
        Field zzI3;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        int i29;
        char charAt15;
        int i30;
        char charAt16;
        boolean z = zzlwVar.zzc() == 2;
        String zzd = zzlwVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (zzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i33 = charAt17 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                charAt16 = zzd.charAt(i32);
                if (charAt16 < 55296) {
                    break;
                }
                i33 |= (charAt16 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            charAt17 = i33 | (charAt16 << i34);
            i32 = i30;
        }
        if (charAt17 == 0) {
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
            iArr = zza;
            i3 = 0;
        } else {
            int i35 = i32 + 1;
            int charAt18 = zzd.charAt(i32);
            if (charAt18 >= 55296) {
                int i36 = charAt18 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    charAt11 = zzd.charAt(i35);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i36 |= (charAt11 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                charAt18 = i36 | (charAt11 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int charAt19 = zzd.charAt(i35);
            if (charAt19 >= 55296) {
                int i39 = charAt19 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    charAt10 = zzd.charAt(i38);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i39 |= (charAt10 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                charAt19 = i39 | (charAt10 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            charAt = zzd.charAt(i38);
            if (charAt >= 55296) {
                int i42 = charAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    charAt9 = zzd.charAt(i41);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                charAt = i42 | (charAt9 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            int charAt20 = zzd.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    charAt8 = zzd.charAt(i44);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i45 |= (charAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                charAt20 = i45 | (charAt8 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            charAt2 = zzd.charAt(i44);
            if (charAt2 >= 55296) {
                int i48 = charAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    charAt7 = zzd.charAt(i47);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i48 |= (charAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                charAt2 = i48 | (charAt7 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int charAt21 = zzd.charAt(i47);
            if (charAt21 >= 55296) {
                int i51 = charAt21 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    charAt6 = zzd.charAt(i50);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i51 |= (charAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                charAt21 = i51 | (charAt6 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int charAt22 = zzd.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    charAt5 = zzd.charAt(i53);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i54 |= (charAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                charAt22 = i54 | (charAt5 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            charAt3 = zzd.charAt(i53);
            if (charAt3 >= 55296) {
                int i57 = charAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    charAt4 = zzd.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i57 |= (charAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                charAt3 = i57 | (charAt4 << i58);
                i56 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i32 = i56;
            int i59 = charAt21;
            i4 = charAt20;
            i5 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzlwVar.zze();
        Class<?> cls = zzlwVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i60 = charAt3 + i5;
        int i61 = charAt3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int charAt23 = zzd.charAt(i32);
            if (charAt23 >= c) {
                int i66 = charAt23 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    charAt15 = zzd.charAt(i67);
                    if (charAt15 < c) {
                        break;
                    }
                    i66 |= (charAt15 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                charAt23 = i66 | (charAt15 << i68);
                i14 = i29;
            } else {
                i14 = i65;
            }
            int i69 = i14 + 1;
            int charAt24 = zzd.charAt(i14);
            if (charAt24 >= c) {
                int i70 = charAt24 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    charAt14 = zzd.charAt(i71);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i70 |= (charAt14 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i15;
                }
                charAt24 = i70 | (charAt14 << i72);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i69;
            }
            int i73 = charAt24 & 255;
            int i74 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i76 = charAt25 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        charAt13 = zzd.charAt(i77);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i4 = i18;
                    }
                    charAt25 = i76 | (charAt13 << i78);
                    i25 = i27;
                } else {
                    i18 = i4;
                    i25 = i75;
                }
                int i79 = i73 - 51;
                i22 = i25;
                if (i79 == 9 || i79 == 17) {
                    int i80 = i63 / 3;
                    i26 = i2 + 1;
                    objArr2[i80 + i80 + 1] = zze[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i81 = i63 / 3;
                        i26 = i2 + 1;
                        objArr2[i81 + i81 + 1] = zze[i2];
                    }
                    int i82 = charAt25 + charAt25;
                    obj = zze[i82];
                    if (obj instanceof Field) {
                        zzI2 = zzI(cls, (String) obj);
                        zze[i82] = zzI2;
                    } else {
                        zzI2 = (Field) obj;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzI2);
                    int i83 = i82 + 1;
                    obj2 = zze[i83];
                    if (obj2 instanceof Field) {
                        zzI3 = zzI(cls, (String) obj2);
                        zze[i83] = zzI3;
                    } else {
                        zzI3 = (Field) obj2;
                    }
                    str = zzd;
                    i21 = (int) unsafe.objectFieldOffset(zzI3);
                    objArr = objArr2;
                    objectFieldOffset = objectFieldOffset2;
                    i23 = 0;
                }
                i2 = i26;
                int i822 = charAt25 + charAt25;
                obj = zze[i822];
                if (obj instanceof Field) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzI2);
                int i832 = i822 + 1;
                obj2 = zze[i832];
                if (obj2 instanceof Field) {
                }
                str = zzd;
                i21 = (int) unsafe.objectFieldOffset(zzI3);
                objArr = objArr2;
                objectFieldOffset = objectFieldOffset22;
                i23 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i84 = i2 + 1;
                Field zzI4 = zzI(cls, (String) zze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i85 = i63 / 3;
                    objArr2[i85 + i85 + 1] = zzI4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i86 = i63 / 3;
                        i24 = i84 + 1;
                        objArr2[i86 + i86 + 1] = zze[i84];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i87 = i63 / 3;
                            i24 = i84 + 1;
                            objArr2[i87 + i87 + 1] = zze[i84];
                        }
                    } else if (i73 == 50) {
                        int i88 = i61 + 1;
                        iArr[i61] = i63;
                        int i89 = i63 / 3;
                        int i90 = i89 + i89;
                        int i91 = i84 + 1;
                        objArr2[i90] = zze[i84];
                        if ((charAt24 & 2048) != 0) {
                            i84 = i91 + 1;
                            objArr2[i90 + 1] = zze[i91];
                            i61 = i88;
                        } else {
                            i61 = i88;
                            i19 = i91;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i73 > 17) {
                                str = zzd;
                                i20 = i19;
                                i21 = 1048575;
                                i22 = i16;
                                i23 = 0;
                            } else {
                                int i92 = i16 + 1;
                                int charAt26 = zzd.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i93 = charAt26 & 8191;
                                    int i94 = 13;
                                    while (true) {
                                        i22 = i92 + 1;
                                        charAt12 = zzd.charAt(i92);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i93 |= (charAt12 & 8191) << i94;
                                        i94 += 13;
                                        i92 = i22;
                                    }
                                    charAt26 = i93 | (charAt12 << i94);
                                } else {
                                    i22 = i92;
                                }
                                int i95 = i3 + i3 + (charAt26 / 32);
                                Object obj3 = zze[i95];
                                str = zzd;
                                if (obj3 instanceof Field) {
                                    zzI = (Field) obj3;
                                } else {
                                    zzI = zzI(cls, (String) obj3);
                                    zze[i95] = zzI;
                                }
                                i20 = i19;
                                i21 = (int) unsafe.objectFieldOffset(zzI);
                                i23 = charAt26 % 32;
                            }
                            if (i73 >= 18 || i73 > 49) {
                                i2 = i20;
                            } else {
                                iArr[i62] = objectFieldOffset;
                                i2 = i20;
                                i62++;
                            }
                        }
                    }
                    i19 = i24;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    i20 = i19;
                    i21 = 1048575;
                    i22 = i16;
                    i23 = 0;
                    if (i73 >= 18) {
                    }
                    i2 = i20;
                }
                i19 = i84;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i20 = i19;
                i21 = 1048575;
                i22 = i16;
                i23 = 0;
                if (i73 >= 18) {
                }
                i2 = i20;
            }
            int i96 = i63 + 1;
            iArr2[i63] = charAt23;
            int i97 = i96 + 1;
            iArr2[i96] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | objectFieldOffset;
            i63 = i97 + 1;
            iArr2[i97] = (i23 << 20) | i21;
            charAt = i17;
            charAt3 = i74;
            i32 = i22;
            length = i15;
            objArr2 = objArr;
            zzd = str;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzlp(iArr3, objArr2, charAt, i4, zzlwVar.zza(), z, false, iArr, charAt3, i60, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmy.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmy.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int i2;
        int zzu;
        boolean z;
        int zzd2;
        int zzi;
        int zzz;
        int zzA8;
        int i3;
        int zzA9;
        int zzA10;
        int zzA11;
        int zzB2;
        int zzA12;
        int zzd3;
        int zzA13;
        int i4;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.zzc.length) {
            int zzB3 = zzB(i7);
            int[] iArr = this.zzc;
            int i10 = iArr[i7];
            int zzA14 = zzA(zzB3);
            if (zzA14 <= 17) {
                int i11 = iArr[i7 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i6) {
                    i9 = unsafe.getInt(obj, i12);
                    i6 = i12;
                }
            } else {
                i = 0;
            }
            long j = zzB3 & i5;
            switch (zzA14) {
                case 0:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 1:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 2:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzjm.zzA(i10 << 3);
                        zzB = zzjm.zzB(j2);
                        i8 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzjm.zzA(i10 << 3);
                        zzB = zzjm.zzB(j3);
                        i8 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzA4 = zzjm.zzA(i10 << 3);
                        zzv = zzjm.zzv(i13);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 5:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 6:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 7:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzjm.zzA(i10 << 3) + 1;
                        i8 += zzA5;
                        break;
                    }
                case 8:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzje) {
                            zzA6 = zzjm.zzA(i10 << 3);
                            zzd = ((zzje) object).zzd();
                            zzA7 = zzjm.zzA(zzd);
                            i2 = zzA6 + zzA7 + zzd;
                            i8 += i2;
                            break;
                        } else {
                            zzA4 = zzjm.zzA(i10 << 3);
                            zzv = zzjm.zzy((String) object);
                            i2 = zzA4 + zzv;
                            i8 += i2;
                        }
                    }
                case 9:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzlz.zzo(i10, unsafe.getObject(obj, j), zzE(i7));
                        i8 += zzA5;
                        break;
                    }
                case 10:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzje zzjeVar = (zzje) unsafe.getObject(obj, j);
                        zzA6 = zzjm.zzA(i10 << 3);
                        zzd = zzjeVar.zzd();
                        zzA7 = zzjm.zzA(zzd);
                        i2 = zzA6 + zzA7 + zzd;
                        i8 += i2;
                        break;
                    }
                case 11:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzA4 = zzjm.zzA(i10 << 3);
                        zzv = zzjm.zzA(i14);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 12:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        zzA4 = zzjm.zzA(i10 << 3);
                        zzv = zzjm.zzv(i15);
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 13:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i8 += zzA5;
                        break;
                    }
                case 14:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i8 += zzA5;
                        break;
                    }
                case 15:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        zzA4 = zzjm.zzA(i10 << 3);
                        zzv = zzjm.zzA((i16 >> 31) ^ (i16 + i16));
                        i2 = zzA4 + zzv;
                        i8 += i2;
                        break;
                    }
                case 16:
                    if ((i & i9) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i8 += zzjm.zzA(i10 << 3) + zzjm.zzB((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i9 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzjm.zzu(i10, (zzlm) unsafe.getObject(obj, j), zzE(i7));
                        i8 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = zzlz.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 19:
                    zzA5 = zzlz.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 20:
                    zzA5 = zzlz.zzm(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 21:
                    zzA5 = zzlz.zzx(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 22:
                    zzA5 = zzlz.zzk(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 23:
                    zzA5 = zzlz.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 24:
                    zzA5 = zzlz.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 25:
                    zzA5 = zzlz.zza(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzA5;
                    break;
                case 26:
                    zzu = zzlz.zzu(i10, (List) unsafe.getObject(obj, j));
                    i8 += zzu;
                    break;
                case 27:
                    zzu = zzlz.zzp(i10, (List) unsafe.getObject(obj, j), zzE(i7));
                    i8 += zzu;
                    break;
                case 28:
                    zzu = zzlz.zzc(i10, (List) unsafe.getObject(obj, j));
                    i8 += zzu;
                    break;
                case 29:
                    zzu = zzlz.zzv(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzu;
                    break;
                case 30:
                    z = false;
                    zzd2 = zzlz.zzd(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 31:
                    z = false;
                    zzd2 = zzlz.zzf(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 32:
                    z = false;
                    zzd2 = zzlz.zzh(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 33:
                    z = false;
                    zzd2 = zzlz.zzq(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 34:
                    z = false;
                    zzd2 = zzlz.zzs(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += zzd2;
                    break;
                case 35:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 36:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 37:
                    zzi = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 38:
                    zzi = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 39:
                    zzi = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 40:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 41:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 42:
                    zzi = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 43:
                    zzi = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 44:
                    zzi = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 45:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 46:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 47:
                    zzi = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 48:
                    zzi = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i10);
                        zzA8 = zzjm.zzA(zzi);
                        i3 = zzz + zzA8;
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 49:
                    zzu = zzlz.zzj(i10, (List) unsafe.getObject(obj, j), zzE(i7));
                    i8 += zzu;
                    break;
                case 50:
                    zzlh.zza(i10, unsafe.getObject(obj, j), zzF(i7));
                    break;
                case 51:
                    if (zzX(obj, i10, i7)) {
                        zzA9 = zzjm.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 52:
                    if (zzX(obj, i10, i7)) {
                        zzA10 = zzjm.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 53:
                    if (zzX(obj, i10, i7)) {
                        long zzC = zzC(obj, j);
                        zzA11 = zzjm.zzA(i10 << 3);
                        zzB2 = zzjm.zzB(zzC);
                        i8 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (zzX(obj, i10, i7)) {
                        long zzC2 = zzC(obj, j);
                        zzA11 = zzjm.zzA(i10 << 3);
                        zzB2 = zzjm.zzB(zzC2);
                        i8 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (zzX(obj, i10, i7)) {
                        int zzr = zzr(obj, j);
                        i3 = zzjm.zzA(i10 << 3);
                        zzi = zzjm.zzv(zzr);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 56:
                    if (zzX(obj, i10, i7)) {
                        zzA9 = zzjm.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 57:
                    if (zzX(obj, i10, i7)) {
                        zzA10 = zzjm.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 58:
                    if (zzX(obj, i10, i7)) {
                        zzu = zzjm.zzA(i10 << 3) + 1;
                        i8 += zzu;
                    }
                    break;
                case 59:
                    if (zzX(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzje) {
                            zzA12 = zzjm.zzA(i10 << 3);
                            zzd3 = ((zzje) object2).zzd();
                            zzA13 = zzjm.zzA(zzd3);
                            i4 = zzA12 + zzA13 + zzd3;
                            i8 += i4;
                        } else {
                            i3 = zzjm.zzA(i10 << 3);
                            zzi = zzjm.zzy((String) object2);
                            i4 = i3 + zzi;
                            i8 += i4;
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i10, i7)) {
                        zzu = zzlz.zzo(i10, unsafe.getObject(obj, j), zzE(i7));
                        i8 += zzu;
                    }
                    break;
                case 61:
                    if (zzX(obj, i10, i7)) {
                        zzje zzjeVar2 = (zzje) unsafe.getObject(obj, j);
                        zzA12 = zzjm.zzA(i10 << 3);
                        zzd3 = zzjeVar2.zzd();
                        zzA13 = zzjm.zzA(zzd3);
                        i4 = zzA12 + zzA13 + zzd3;
                        i8 += i4;
                    }
                    break;
                case 62:
                    if (zzX(obj, i10, i7)) {
                        int zzr2 = zzr(obj, j);
                        i3 = zzjm.zzA(i10 << 3);
                        zzi = zzjm.zzA(zzr2);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 63:
                    if (zzX(obj, i10, i7)) {
                        int zzr3 = zzr(obj, j);
                        i3 = zzjm.zzA(i10 << 3);
                        zzi = zzjm.zzv(zzr3);
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 64:
                    if (zzX(obj, i10, i7)) {
                        zzA10 = zzjm.zzA(i10 << 3);
                        zzu = zzA10 + 4;
                        i8 += zzu;
                    }
                    break;
                case 65:
                    if (zzX(obj, i10, i7)) {
                        zzA9 = zzjm.zzA(i10 << 3);
                        zzu = zzA9 + 8;
                        i8 += zzu;
                    }
                    break;
                case 66:
                    if (zzX(obj, i10, i7)) {
                        int zzr4 = zzr(obj, j);
                        i3 = zzjm.zzA(i10 << 3);
                        zzi = zzjm.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i4 = i3 + zzi;
                        i8 += i4;
                    }
                    break;
                case 67:
                    if (zzX(obj, i10, i7)) {
                        long zzC3 = zzC(obj, j);
                        i8 += zzjm.zzA(i10 << 3) + zzjm.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                    }
                    break;
                case 68:
                    if (zzX(obj, i10, i7)) {
                        zzu = zzjm.zzu(i10, (zzlm) unsafe.getObject(obj, j), zzE(i7));
                        i8 += zzu;
                    }
                    break;
            }
            i7 += 3;
            i5 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        int zza2 = i8 + zzmoVar.zza(zzmoVar.zzd(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzz;
        int zzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzB2 = zzB(i3);
            int zzA9 = zzA(zzB2);
            int i4 = this.zzc[i3];
            long j = zzB2 & 1048575;
            if (zzA9 >= zzjx.DOUBLE_LIST_PACKED.zza() && zzA9 <= zzjx.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzT(obj, i3)) {
                        zzA = zzjm.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj, i3)) {
                        zzA2 = zzjm.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj, i3)) {
                        long zzd2 = zzmy.zzd(obj, j);
                        zzA3 = zzjm.zzA(i4 << 3);
                        zzB = zzjm.zzB(zzd2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj, i3)) {
                        long zzd3 = zzmy.zzd(obj, j);
                        zzA3 = zzjm.zzA(i4 << 3);
                        zzB = zzjm.zzB(zzd3);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj, i3)) {
                        int zzc = zzmy.zzc(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzv(zzc);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj, i3)) {
                        zzA = zzjm.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj, i3)) {
                        zzA2 = zzjm.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj, i3)) {
                        zzA5 = zzjm.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzT(obj, i3)) {
                        break;
                    } else {
                        Object zzf = zzmy.zzf(obj, j);
                        if (zzf instanceof zzje) {
                            zzA6 = zzjm.zzA(i4 << 3);
                            zzd = ((zzje) zzf).zzd();
                            zzA7 = zzjm.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjm.zzA(i4 << 3);
                            zzv = zzjm.zzy((String) zzf);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzT(obj, i3)) {
                        zzo = zzlz.zzo(i4, zzmy.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzT(obj, i3)) {
                        zzje zzjeVar = (zzje) zzmy.zzf(obj, j);
                        zzA6 = zzjm.zzA(i4 << 3);
                        zzd = zzjeVar.zzd();
                        zzA7 = zzjm.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj, i3)) {
                        int zzc2 = zzmy.zzc(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzA(zzc2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj, i3)) {
                        int zzc3 = zzmy.zzc(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzv(zzc3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj, i3)) {
                        zzA2 = zzjm.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj, i3)) {
                        zzA = zzjm.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj, i3)) {
                        int zzc4 = zzmy.zzc(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj, i3)) {
                        long zzd4 = zzmy.zzd(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzT(obj, i3)) {
                        zzo = zzjm.zzu(i4, (zzlm) zzmy.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlz.zzh(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 19:
                    zzo = zzlz.zzf(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 20:
                    zzo = zzlz.zzm(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 21:
                    zzo = zzlz.zzx(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 22:
                    zzo = zzlz.zzk(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 23:
                    zzo = zzlz.zzh(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 24:
                    zzo = zzlz.zzf(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 25:
                    zzo = zzlz.zza(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 26:
                    zzo = zzlz.zzu(i4, (List) zzmy.zzf(obj, j));
                    i2 += zzo;
                    break;
                case 27:
                    zzo = zzlz.zzp(i4, (List) zzmy.zzf(obj, j), zzE(i3));
                    i2 += zzo;
                    break;
                case 28:
                    zzo = zzlz.zzc(i4, (List) zzmy.zzf(obj, j));
                    i2 += zzo;
                    break;
                case 29:
                    zzo = zzlz.zzv(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 30:
                    zzo = zzlz.zzd(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 31:
                    zzo = zzlz.zzf(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 32:
                    zzo = zzlz.zzh(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 33:
                    zzo = zzlz.zzq(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 34:
                    zzo = zzlz.zzs(i4, (List) zzmy.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 35:
                    zzv = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjm.zzz(i4);
                        zzA8 = zzjm.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlz.zzj(i4, (List) zzmy.zzf(obj, j), zzE(i3));
                    i2 += zzo;
                    break;
                case 50:
                    zzlh.zza(i4, zzmy.zzf(obj, j), zzF(i3));
                    break;
                case 51:
                    if (zzX(obj, i4, i3)) {
                        zzA = zzjm.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i4, i3)) {
                        zzA2 = zzjm.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i4, i3)) {
                        long zzC = zzC(obj, j);
                        zzA3 = zzjm.zzA(i4 << 3);
                        zzB = zzjm.zzB(zzC);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i4, i3)) {
                        long zzC2 = zzC(obj, j);
                        zzA3 = zzjm.zzA(i4 << 3);
                        zzB = zzjm.zzB(zzC2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i4, i3)) {
                        int zzr = zzr(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzv(zzr);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i4, i3)) {
                        zzA = zzjm.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i4, i3)) {
                        zzA2 = zzjm.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i4, i3)) {
                        zzA5 = zzjm.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzX(obj, i4, i3)) {
                        break;
                    } else {
                        Object zzf2 = zzmy.zzf(obj, j);
                        if (zzf2 instanceof zzje) {
                            zzA6 = zzjm.zzA(i4 << 3);
                            zzd = ((zzje) zzf2).zzd();
                            zzA7 = zzjm.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjm.zzA(i4 << 3);
                            zzv = zzjm.zzy((String) zzf2);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzX(obj, i4, i3)) {
                        zzo = zzlz.zzo(i4, zzmy.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i4, i3)) {
                        zzje zzjeVar2 = (zzje) zzmy.zzf(obj, j);
                        zzA6 = zzjm.zzA(i4 << 3);
                        zzd = zzjeVar2.zzd();
                        zzA7 = zzjm.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i4, i3)) {
                        int zzr2 = zzr(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzA(zzr2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i4, i3)) {
                        int zzr3 = zzr(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzv(zzr3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i4, i3)) {
                        zzA2 = zzjm.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i4, i3)) {
                        zzA = zzjm.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i4, i3)) {
                        int zzr4 = zzr(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i4, i3)) {
                        long zzC3 = zzC(obj, j);
                        zzA4 = zzjm.zzA(i4 << 3);
                        zzv = zzjm.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i4, i3)) {
                        zzo = zzjm.zzu(i4, (zzlm) zzmy.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmo zzmoVar = this.zzn;
        return i2 + zzmoVar.zza(zzmoVar.zzd(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmy.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlg) object).zze()) {
            zzlg zzb2 = zzlg.zza().zzb();
            zzlh.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzis.zzp(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzis.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzirVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzis.zzj(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzirVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzis.zzp(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzis.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzirVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzis.zzj(bArr, i, zzirVar);
                    int i9 = zzirVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !zznd.zzf(bArr, zzj2, zzj2 + i9)) {
                            throw zzkp.zzc();
                        }
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzkn.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object zzH = zzH(obj, i4, i8);
                    int zzo = zzis.zzo(zzH, zzE(i8), bArr, i, i2, zzirVar);
                    zzP(obj, i4, i8, zzH);
                    return zzo;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzis.zza(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, zzirVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzis.zzj(bArr, i, zzirVar);
                    int i10 = zzirVar.zza;
                    zzkj zzD = zzD(i8);
                    if (zzD == null || zzD.zza(i10)) {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    } else {
                        zzd(obj).zzj(i3, Long.valueOf(i10));
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzis.zzj(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzji.zzb(zzirVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzis.zzm(bArr, i, zzirVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzji.zzc(zzirVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzH2 = zzH(obj, i4, i8);
                    int zzn = zzis.zzn(zzH2, zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzirVar);
                    zzP(obj, i4, i8, zzH2);
                    return zzn;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x029b, code lost:
    
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029d, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r8 = r18;
        r2 = r19;
        r1 = r23;
        r7 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02b3, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02e0, code lost:
    
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0304, code lost:
    
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0086. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws IOException {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int zza2;
        int zzm;
        zzlp<T> zzlpVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzir zzirVar2 = zzirVar;
        zzJ(obj);
        Unsafe unsafe2 = zzb;
        int i15 = 1048575;
        int i16 = -1;
        int i17 = i;
        int i18 = -1;
        int i19 = 1048575;
        int i20 = 0;
        int i21 = 0;
        while (i17 < i14) {
            int i22 = i17 + 1;
            byte b2 = bArr2[i17];
            if (b2 < 0) {
                i3 = zzis.zzk(b2, bArr2, i22, zzirVar2);
                b = zzirVar2.zza;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            int zzx = i23 > i18 ? zzlpVar.zzx(i23, i20 / 3) : zzlpVar.zzw(i23);
            if (zzx == i16) {
                i4 = i3;
                i5 = i23;
                i6 = i16;
                unsafe = unsafe2;
                i7 = 0;
            } else {
                int[] iArr = zzlpVar.zzc;
                int i25 = iArr[zzx + 1];
                int zzA = zzA(i25);
                long j = i25 & i15;
                if (zzA <= 17) {
                    int i26 = iArr[zzx + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = 1048575;
                    int i29 = i26 & 1048575;
                    if (i29 != i19) {
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj2, i19, i21);
                            i28 = 1048575;
                        }
                        if (i29 != i28) {
                            i21 = unsafe2.getInt(obj2, i29);
                        }
                        i19 = i29;
                    }
                    switch (zzA) {
                        case 0:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            i12 = i3;
                            i13 = i21;
                            if (i24 == 1) {
                                zzmy.zzo(obj2, j, Double.longBitsToDouble(zzis.zzp(bArr2, i12)));
                                i17 = i12 + 8;
                                i21 = i13 | i27;
                                i14 = i2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 1:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            i12 = i3;
                            i13 = i21;
                            if (i24 == 5) {
                                zzmy.zzp(obj2, j, Float.intBitsToFloat(zzis.zzb(bArr2, i12)));
                                i17 = i12 + 4;
                                i21 = i13 | i27;
                                i14 = i2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 2:
                        case 3:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            i12 = i3;
                            i13 = i21;
                            if (i24 != 0) {
                                i21 = i13;
                                unsafe = unsafe2;
                                i7 = i8;
                                i4 = i12;
                                i6 = -1;
                                break;
                            } else {
                                zzm = zzis.zzm(bArr2, i12, zzirVar2);
                                unsafe2.putLong(obj, j, zzirVar2.zzb);
                                i21 = i13 | i27;
                                i20 = i8;
                                i17 = zzm;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                i14 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            i12 = i3;
                            i13 = i21;
                            if (i24 == 0) {
                                i17 = zzis.zzj(bArr2, i12, zzirVar2);
                                unsafe2.putInt(obj2, j, zzirVar2.zza);
                                i21 = i13 | i27;
                                i14 = i2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 5:
                        case 14:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            i13 = i21;
                            if (i24 == 1) {
                                i12 = i3;
                                unsafe2.putLong(obj, j, zzis.zzp(bArr2, i3));
                                i17 = i12 + 8;
                                i21 = i13 | i27;
                                i14 = i2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i12 = i3;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 6:
                        case 13:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            i13 = i21;
                            if (i24 == 5) {
                                unsafe2.putInt(obj2, j, zzis.zzb(bArr2, i3));
                                i17 = i3 + 4;
                                i21 = i13 | i27;
                                i14 = i2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i12 = i3;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 7:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            boolean z = true;
                            i13 = i21;
                            if (i24 == 0) {
                                int zzm2 = zzis.zzm(bArr2, i3, zzirVar2);
                                if (zzirVar2.zzb == 0) {
                                    z = false;
                                }
                                zzmy.zzm(obj2, j, z);
                                i21 = i13 | i27;
                                i14 = i2;
                                i17 = zzm2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i12 = i3;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 8:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            i13 = i21;
                            if (i24 == 2) {
                                i17 = (536870912 & i25) == 0 ? zzis.zzg(bArr2, i3, zzirVar2) : zzis.zzh(bArr2, i3, zzirVar2);
                                unsafe2.putObject(obj2, j, zzirVar2.zzc);
                                i21 = i13 | i27;
                                i14 = i2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i12 = i3;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 9:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            if (i24 == 2) {
                                Object zzG = zzlpVar.zzG(obj2, i8);
                                i17 = zzis.zzo(zzG, zzlpVar.zzE(i8), bArr, i3, i2, zzirVar);
                                zzlpVar.zzO(obj2, i8, zzG);
                                i21 |= i27;
                                i14 = i2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i12 = i3;
                            i13 = i21;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 10:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            if (i24 == 2) {
                                zza2 = zzis.zza(bArr2, i3, zzirVar2);
                                unsafe2.putObject(obj2, j, zzirVar2.zzc);
                                i21 |= i27;
                                i14 = i2;
                                i17 = zza2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i12 = i3;
                            i13 = i21;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 12:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            if (i24 == 0) {
                                zza2 = zzis.zzj(bArr2, i3, zzirVar2);
                                unsafe2.putInt(obj2, j, zzirVar2.zza);
                                i21 |= i27;
                                i14 = i2;
                                i17 = zza2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i12 = i3;
                            i13 = i21;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 15:
                            i5 = i23;
                            zzirVar2 = zzirVar;
                            i8 = zzx;
                            if (i24 == 0) {
                                i17 = zzis.zzj(bArr2, i3, zzirVar2);
                                unsafe2.putInt(obj2, j, zzji.zzb(zzirVar2.zza));
                                i21 |= i27;
                                i14 = i2;
                                i20 = i8;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                break;
                            }
                            i12 = i3;
                            i13 = i21;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                        case 16:
                            if (i24 != 0) {
                                i5 = i23;
                                i8 = zzx;
                                i12 = i3;
                                i13 = i21;
                                i21 = i13;
                                unsafe = unsafe2;
                                i7 = i8;
                                i4 = i12;
                                i6 = -1;
                                break;
                            } else {
                                zzirVar2 = zzirVar;
                                zzm = zzis.zzm(bArr2, i3, zzirVar2);
                                i8 = zzx;
                                i5 = i23;
                                unsafe2.putLong(obj, j, zzji.zzc(zzirVar2.zzb));
                                i21 |= i27;
                                i20 = i8;
                                i17 = zzm;
                                i18 = i5;
                                i16 = -1;
                                i15 = 1048575;
                                i14 = i2;
                                break;
                            }
                        default:
                            i5 = i23;
                            i8 = zzx;
                            i12 = i3;
                            i13 = i21;
                            i21 = i13;
                            unsafe = unsafe2;
                            i7 = i8;
                            i4 = i12;
                            i6 = -1;
                            break;
                    }
                } else {
                    i5 = i23;
                    int i30 = i21;
                    zzirVar2 = zzirVar;
                    i8 = zzx;
                    if (zzA != 27) {
                        if (zzA <= 49) {
                            int i31 = i3;
                            i10 = i19;
                            i11 = i30;
                            i6 = -1;
                            unsafe = unsafe2;
                            i7 = i8;
                            i17 = zzv(obj, bArr, i3, i2, b, i5, i24, i8, i25, zzA, j, zzirVar);
                        } else {
                            i9 = i3;
                            i10 = i19;
                            i11 = i30;
                            unsafe = unsafe2;
                            i7 = i8;
                            i6 = -1;
                            if (zzA != 50) {
                                i17 = zzt(obj, bArr, i9, i2, b, i5, i24, i25, zzA, j, i7, zzirVar);
                            } else if (i24 == 2) {
                                i17 = zzs(obj, bArr, i9, i2, i7, j, zzirVar);
                            }
                        }
                        i15 = 1048575;
                    } else if (i24 == 2) {
                        zzkm zzkmVar = (zzkm) unsafe2.getObject(obj2, j);
                        if (!zzkmVar.zzc()) {
                            int size = zzkmVar.size();
                            zzkmVar = zzkmVar.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj2, j, zzkmVar);
                        }
                        i17 = zzis.zze(zzlpVar.zzE(i8), b, bArr, i3, i2, zzkmVar, zzirVar);
                        i14 = i2;
                        i21 = i30;
                        i20 = i8;
                        i18 = i5;
                        i16 = -1;
                        i15 = 1048575;
                    } else {
                        i9 = i3;
                        i10 = i19;
                        i11 = i30;
                        unsafe = unsafe2;
                        i7 = i8;
                        i6 = -1;
                    }
                    i4 = i9;
                    i19 = i10;
                    i21 = i11;
                }
            }
            i17 = zzis.zzi(b, bArr, i4, i2, zzd(obj), zzirVar);
            zzlpVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            zzirVar2 = zzirVar;
            i16 = i6;
            i20 = i7;
            i18 = i5;
            unsafe2 = unsafe;
            i15 = 1048575;
        }
        int i32 = i21;
        Unsafe unsafe3 = unsafe2;
        if (i19 != i15) {
            unsafe3.putInt(obj, i19, i32);
        }
        if (i17 == i2) {
            return i17;
        }
        throw zzkp.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzir zzirVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12 = i;
        Unsafe unsafe = zzb;
        zzkm zzkmVar = (zzkm) unsafe.getObject(obj, j2);
        if (!zzkmVar.zzc()) {
            int size = zzkmVar.size();
            zzkmVar = zzkmVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkmVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjo zzjoVar = (zzjo) zzkmVar;
                    int zzj2 = zzis.zzj(bArr, i12, zzirVar);
                    int i13 = zzirVar.zza + zzj2;
                    while (zzj2 < i13) {
                        zzjoVar.zze(Double.longBitsToDouble(zzis.zzp(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i13) {
                        return zzj2;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 1) {
                    zzjo zzjoVar2 = (zzjo) zzkmVar;
                    zzjoVar2.zze(Double.longBitsToDouble(zzis.zzp(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i2) {
                            i12 = zzis.zzj(bArr, i8, zzirVar);
                            if (i3 == zzirVar.zza) {
                                zzjoVar2.zze(Double.longBitsToDouble(zzis.zzp(bArr, i12)));
                            }
                        }
                    }
                    return i8;
                }
                return i12;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjy zzjyVar = (zzjy) zzkmVar;
                    int zzj3 = zzis.zzj(bArr, i12, zzirVar);
                    int i14 = zzirVar.zza + zzj3;
                    while (zzj3 < i14) {
                        zzjyVar.zze(Float.intBitsToFloat(zzis.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i14) {
                        return zzj3;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 5) {
                    zzjy zzjyVar2 = (zzjy) zzkmVar;
                    zzjyVar2.zze(Float.intBitsToFloat(zzis.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i2) {
                            i12 = zzis.zzj(bArr, i9, zzirVar);
                            if (i3 == zzirVar.zza) {
                                zzjyVar2.zze(Float.intBitsToFloat(zzis.zzb(bArr, i12)));
                            }
                        }
                    }
                    return i9;
                }
                return i12;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzlb zzlbVar = (zzlb) zzkmVar;
                    int zzj4 = zzis.zzj(bArr, i12, zzirVar);
                    int i15 = zzirVar.zza + zzj4;
                    while (zzj4 < i15) {
                        zzj4 = zzis.zzm(bArr, zzj4, zzirVar);
                        zzlbVar.zzg(zzirVar.zzb);
                    }
                    if (zzj4 == i15) {
                        return zzj4;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzlb zzlbVar2 = (zzlb) zzkmVar;
                    int zzm = zzis.zzm(bArr, i12, zzirVar);
                    zzlbVar2.zzg(zzirVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = zzis.zzj(bArr, zzm, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzm;
                        }
                        zzm = zzis.zzm(bArr, zzj5, zzirVar);
                        zzlbVar2.zzg(zzirVar.zzb);
                    }
                    return zzm;
                }
                return i12;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzis.zzf(bArr, i12, zzkmVar, zzirVar);
                }
                if (i5 == 0) {
                    return zzis.zzl(i3, bArr, i, i2, zzkmVar, zzirVar);
                }
                return i12;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzlb zzlbVar3 = (zzlb) zzkmVar;
                    int zzj6 = zzis.zzj(bArr, i12, zzirVar);
                    int i16 = zzirVar.zza + zzj6;
                    while (zzj6 < i16) {
                        zzlbVar3.zzg(zzis.zzp(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i16) {
                        return zzj6;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 1) {
                    zzlb zzlbVar4 = (zzlb) zzkmVar;
                    zzlbVar4.zzg(zzis.zzp(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i2) {
                            i12 = zzis.zzj(bArr, i10, zzirVar);
                            if (i3 == zzirVar.zza) {
                                zzlbVar4.zzg(zzis.zzp(bArr, i12));
                            }
                        }
                    }
                    return i10;
                }
                return i12;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkg zzkgVar = (zzkg) zzkmVar;
                    int zzj7 = zzis.zzj(bArr, i12, zzirVar);
                    int i17 = zzirVar.zza + zzj7;
                    while (zzj7 < i17) {
                        zzkgVar.zzh(zzis.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i17) {
                        return zzj7;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 5) {
                    zzkg zzkgVar2 = (zzkg) zzkmVar;
                    zzkgVar2.zzh(zzis.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i2) {
                            i12 = zzis.zzj(bArr, i11, zzirVar);
                            if (i3 == zzirVar.zza) {
                                zzkgVar2.zzh(zzis.zzb(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                return i12;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzit zzitVar = (zzit) zzkmVar;
                    zzj = zzis.zzj(bArr, i12, zzirVar);
                    int i18 = zzirVar.zza + zzj;
                    while (zzj < i18) {
                        zzj = zzis.zzm(bArr, zzj, zzirVar);
                        zzitVar.zze(zzirVar.zzb != 0);
                    }
                    if (zzj != i18) {
                        throw zzkp.zzf();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    zzit zzitVar2 = (zzit) zzkmVar;
                    int zzm2 = zzis.zzm(bArr, i12, zzirVar);
                    zzitVar2.zze(zzirVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzis.zzj(bArr, zzm2, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzis.zzm(bArr, zzj8, zzirVar);
                        zzitVar2.zze(zzirVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i12;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzis.zzj(bArr, i12, zzirVar);
                        int i19 = zzirVar.zza;
                        if (i19 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i19 == 0) {
                            zzkmVar.add("");
                        } else {
                            zzkmVar.add(new String(bArr, zzj9, i19, zzkn.zzb));
                            zzj9 += i19;
                        }
                        while (zzj9 < i2) {
                            int zzj10 = zzis.zzj(bArr, zzj9, zzirVar);
                            if (i3 != zzirVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzis.zzj(bArr, zzj10, zzirVar);
                            int i20 = zzirVar.zza;
                            if (i20 < 0) {
                                throw zzkp.zzd();
                            }
                            if (i20 == 0) {
                                zzkmVar.add("");
                            } else {
                                zzkmVar.add(new String(bArr, zzj9, i20, zzkn.zzb));
                                zzj9 += i20;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzis.zzj(bArr, i12, zzirVar);
                    int i21 = zzirVar.zza;
                    if (i21 < 0) {
                        throw zzkp.zzd();
                    }
                    if (i21 == 0) {
                        zzkmVar.add("");
                    } else {
                        int i22 = zzj11 + i21;
                        if (!zznd.zzf(bArr, zzj11, i22)) {
                            throw zzkp.zzc();
                        }
                        zzkmVar.add(new String(bArr, zzj11, i21, zzkn.zzb));
                        zzj11 = i22;
                    }
                    while (zzj11 < i2) {
                        int zzj12 = zzis.zzj(bArr, zzj11, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzis.zzj(bArr, zzj12, zzirVar);
                        int i23 = zzirVar.zza;
                        if (i23 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i23 == 0) {
                            zzkmVar.add("");
                        } else {
                            int i24 = zzj11 + i23;
                            if (!zznd.zzf(bArr, zzj11, i24)) {
                                throw zzkp.zzc();
                            }
                            zzkmVar.add(new String(bArr, zzj11, i23, zzkn.zzb));
                            zzj11 = i24;
                        }
                    }
                    return zzj11;
                }
                return i12;
            case 27:
                if (i5 == 2) {
                    return zzis.zze(zzE(i6), i3, bArr, i, i2, zzkmVar, zzirVar);
                }
                return i12;
            case 28:
                if (i5 == 2) {
                    int zzj13 = zzis.zzj(bArr, i12, zzirVar);
                    int i25 = zzirVar.zza;
                    if (i25 < 0) {
                        throw zzkp.zzd();
                    }
                    if (i25 > bArr.length - zzj13) {
                        throw zzkp.zzf();
                    }
                    if (i25 == 0) {
                        zzkmVar.add(zzje.zzb);
                    } else {
                        zzkmVar.add(zzje.zzl(bArr, zzj13, i25));
                        zzj13 += i25;
                    }
                    while (zzj13 < i2) {
                        int zzj14 = zzis.zzj(bArr, zzj13, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzis.zzj(bArr, zzj14, zzirVar);
                        int i26 = zzirVar.zza;
                        if (i26 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i26 > bArr.length - zzj13) {
                            throw zzkp.zzf();
                        }
                        if (i26 == 0) {
                            zzkmVar.add(zzje.zzb);
                        } else {
                            zzkmVar.add(zzje.zzl(bArr, zzj13, i26));
                            zzj13 += i26;
                        }
                    }
                    return zzj13;
                }
                return i12;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzj = zzis.zzl(i3, bArr, i, i2, zzkmVar, zzirVar);
                    }
                    return i12;
                }
                zzj = zzis.zzf(bArr, i12, zzkmVar, zzirVar);
                zzlz.zzC(obj, i4, zzkmVar, zzD(i6), null, this.zzn);
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkg zzkgVar3 = (zzkg) zzkmVar;
                    int zzj15 = zzis.zzj(bArr, i12, zzirVar);
                    int i27 = zzirVar.zza + zzj15;
                    while (zzj15 < i27) {
                        zzj15 = zzis.zzj(bArr, zzj15, zzirVar);
                        zzkgVar3.zzh(zzji.zzb(zzirVar.zza));
                    }
                    if (zzj15 == i27) {
                        return zzj15;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzkg zzkgVar4 = (zzkg) zzkmVar;
                    int zzj16 = zzis.zzj(bArr, i12, zzirVar);
                    zzkgVar4.zzh(zzji.zzb(zzirVar.zza));
                    while (zzj16 < i2) {
                        int zzj17 = zzis.zzj(bArr, zzj16, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzis.zzj(bArr, zzj17, zzirVar);
                        zzkgVar4.zzh(zzji.zzb(zzirVar.zza));
                    }
                    return zzj16;
                }
                return i12;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzlb zzlbVar5 = (zzlb) zzkmVar;
                    int zzj18 = zzis.zzj(bArr, i12, zzirVar);
                    int i28 = zzirVar.zza + zzj18;
                    while (zzj18 < i28) {
                        zzj18 = zzis.zzm(bArr, zzj18, zzirVar);
                        zzlbVar5.zzg(zzji.zzc(zzirVar.zzb));
                    }
                    if (zzj18 == i28) {
                        return zzj18;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzlb zzlbVar6 = (zzlb) zzkmVar;
                    int zzm3 = zzis.zzm(bArr, i12, zzirVar);
                    zzlbVar6.zzg(zzji.zzc(zzirVar.zzb));
                    while (zzm3 < i2) {
                        int zzj19 = zzis.zzj(bArr, zzm3, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzis.zzm(bArr, zzj19, zzirVar);
                        zzlbVar6.zzg(zzji.zzc(zzirVar.zzb));
                    }
                    return zzm3;
                }
                return i12;
            default:
                if (i5 == 3) {
                    zzlx zzE = zzE(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int zzc = zzis.zzc(zzE, bArr, i, i2, i29, zzirVar);
                    zzkmVar.add(zzirVar.zzc);
                    while (zzc < i2) {
                        int zzj20 = zzis.zzj(bArr, zzc, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzc;
                        }
                        zzc = zzis.zzc(zzE, bArr, zzj20, i2, i29, zzirVar);
                        zzkmVar.add(zzirVar.zzc);
                    }
                    return zzc;
                }
                return i12;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzB = zzB(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzB;
            int i5 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzkn.zzc(Double.doubleToLongBits(zzmy.zza(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzmy.zzb(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzmy.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzmy.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzkn.zza(zzmy.zzw(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzmy.zzf(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzf = zzmy.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzmy.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzmy.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzmy.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzmy.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzmy.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzmy.zzf(obj, j);
                    if (zzf2 != null) {
                        i5 = zzf2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    i = i2 * 53;
                    zzc = zzmy.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzmy.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkn.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkn.zza(zzY(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzmy.zzf(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmy.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmy.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmy.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzn.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0429, code lost:
    
        if (r6 == 1048575) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x042b, code lost:
    
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0431, code lost:
    
        r3 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0435, code lost:
    
        if (r3 >= r9.zzl) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0437, code lost:
    
        r4 = r9.zzj[r3];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzmy.zzf(r12, r9.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0449, code lost:
    
        if (r5 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0450, code lost:
    
        if (r9.zzD(r4) != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0455, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzlg) r5;
        r0 = (com.google.android.gms.internal.measurement.zzlf) r9.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x045d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0452, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x045e, code lost:
    
        if (r7 != 0) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0462, code lost:
    
        if (r0 != r33) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0469, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0470, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x046c, code lost:
    
        if (r0 > r33) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x046e, code lost:
    
        if (r1 != r7) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0475, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzir zzirVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzlp<T> zzlpVar;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj3;
        int i11;
        zzir zzirVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        zzlp<T> zzlpVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i23 = i2;
        int i24 = i3;
        zzir zzirVar3 = zzirVar;
        zzJ(obj);
        Unsafe unsafe2 = zzb;
        int i25 = i;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = -1;
        int i30 = 1048575;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                byte b = bArr2[i25];
                if (b < 0) {
                    int zzk = zzis.zzk(b, bArr2, i31, zzirVar3);
                    i5 = zzirVar3.zza;
                    i31 = zzk;
                } else {
                    i5 = b;
                }
                int i32 = i5 >>> 3;
                int i33 = i5 & 7;
                int zzx = i32 > i29 ? zzlpVar2.zzx(i32, i27 / 3) : zzlpVar2.zzw(i32);
                if (zzx == -1) {
                    i6 = i32;
                    i7 = i31;
                    i8 = i5;
                    i9 = i28;
                    unsafe = unsafe2;
                    i4 = i24;
                    i10 = 0;
                } else {
                    int[] iArr = zzlpVar2.zzc;
                    int i34 = iArr[zzx + 1];
                    int zzA = zzA(i34);
                    int i35 = i31;
                    long j = i34 & 1048575;
                    if (zzA <= 17) {
                        int i36 = iArr[zzx + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i30) {
                            i12 = i5;
                            if (i30 != 1048575) {
                                unsafe2.putInt(obj4, i30, i28);
                            }
                            i13 = i38;
                            i9 = unsafe2.getInt(obj4, i38);
                        } else {
                            i12 = i5;
                            i9 = i28;
                            i13 = i30;
                        }
                        switch (zzA) {
                            case 0:
                                i14 = zzx;
                                i15 = i32;
                                i16 = i35;
                                if (i33 != 1) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    zzmy.zzo(obj4, j, Double.longBitsToDouble(zzis.zzp(bArr2, i16)));
                                    i25 = i16 + 8;
                                    i28 = i9 | i37;
                                    i29 = i15;
                                    i27 = i14;
                                    i26 = i12;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 1:
                                i14 = zzx;
                                i15 = i32;
                                i16 = i35;
                                if (i33 != 5) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    zzmy.zzp(obj4, j, Float.intBitsToFloat(zzis.zzb(bArr2, i16)));
                                    i25 = i16 + 4;
                                    i28 = i9 | i37;
                                    i29 = i15;
                                    i27 = i14;
                                    i26 = i12;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 2:
                            case 3:
                                i14 = zzx;
                                i15 = i32;
                                i16 = i35;
                                if (i33 != 0) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    int zzm = zzis.zzm(bArr2, i16, zzirVar3);
                                    unsafe2.putLong(obj, j, zzirVar3.zzb);
                                    i28 = i9 | i37;
                                    i25 = zzm;
                                    i29 = i15;
                                    i27 = i14;
                                    i26 = i12;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 4:
                            case 11:
                                i14 = zzx;
                                i15 = i32;
                                i16 = i35;
                                if (i33 != 0) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    i25 = zzis.zzj(bArr2, i16, zzirVar3);
                                    unsafe2.putInt(obj4, j, zzirVar3.zza);
                                    i28 = i9 | i37;
                                    i29 = i15;
                                    i27 = i14;
                                    i26 = i12;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 5:
                            case 14:
                                i14 = zzx;
                                int i39 = i12;
                                i15 = i32;
                                if (i33 != 1) {
                                    i12 = i39;
                                    i16 = i35;
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    i12 = i39;
                                    i16 = i35;
                                    unsafe2.putLong(obj, j, zzis.zzp(bArr2, i35));
                                    i25 = i16 + 8;
                                    i28 = i9 | i37;
                                    i29 = i15;
                                    i27 = i14;
                                    i26 = i12;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 6:
                            case 13:
                                i14 = zzx;
                                i17 = i12;
                                i15 = i32;
                                i18 = i35;
                                if (i33 != 5) {
                                    i8 = i17;
                                    i16 = i18;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, zzis.zzb(bArr2, i18));
                                    i25 = i18 + 4;
                                    i28 = i9 | i37;
                                    i26 = i17;
                                    i29 = i15;
                                    i27 = i14;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 7:
                                i14 = zzx;
                                i17 = i12;
                                i15 = i32;
                                i18 = i35;
                                if (i33 != 0) {
                                    i8 = i17;
                                    i16 = i18;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    i25 = zzis.zzm(bArr2, i18, zzirVar3);
                                    zzmy.zzm(obj4, j, zzirVar3.zzb != 0);
                                    i28 = i9 | i37;
                                    i26 = i17;
                                    i29 = i15;
                                    i27 = i14;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 8:
                                i14 = zzx;
                                i17 = i12;
                                i15 = i32;
                                i18 = i35;
                                if (i33 != 2) {
                                    i8 = i17;
                                    i16 = i18;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    i25 = (536870912 & i34) == 0 ? zzis.zzg(bArr2, i18, zzirVar3) : zzis.zzh(bArr2, i18, zzirVar3);
                                    unsafe2.putObject(obj4, j, zzirVar3.zzc);
                                    i28 = i9 | i37;
                                    i26 = i17;
                                    i29 = i15;
                                    i27 = i14;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 9:
                                i14 = zzx;
                                i19 = i12;
                                i15 = i32;
                                i20 = i35;
                                if (i33 != 2) {
                                    i16 = i20;
                                    i8 = i19;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    Object zzG = zzlpVar2.zzG(obj4, i14);
                                    i25 = zzis.zzo(zzG, zzlpVar2.zzE(i14), bArr, i20, i2, zzirVar);
                                    zzlpVar2.zzO(obj4, i14, zzG);
                                    i28 = i9 | i37;
                                    i26 = i19;
                                    i29 = i15;
                                    i27 = i14;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 10:
                                i14 = zzx;
                                i19 = i12;
                                i15 = i32;
                                i20 = i35;
                                if (i33 != 2) {
                                    i16 = i20;
                                    i8 = i19;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    i25 = zzis.zza(bArr2, i20, zzirVar3);
                                    unsafe2.putObject(obj4, j, zzirVar3.zzc);
                                    i28 = i9 | i37;
                                    i26 = i19;
                                    i29 = i15;
                                    i27 = i14;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 12:
                                i14 = zzx;
                                i19 = i12;
                                i15 = i32;
                                i20 = i35;
                                if (i33 != 0) {
                                    i16 = i20;
                                    i8 = i19;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    i25 = zzis.zzj(bArr2, i20, zzirVar3);
                                    int i40 = zzirVar3.zza;
                                    zzkj zzD = zzlpVar2.zzD(i14);
                                    if (zzD == null || zzD.zza(i40)) {
                                        unsafe2.putInt(obj4, j, i40);
                                        i28 = i9 | i37;
                                        i26 = i19;
                                        i29 = i15;
                                        i27 = i14;
                                        i30 = i13;
                                        i23 = i2;
                                        i24 = i3;
                                    } else {
                                        zzd(obj).zzj(i19, Long.valueOf(i40));
                                        i26 = i19;
                                        i29 = i15;
                                        i27 = i14;
                                        i28 = i9;
                                        i30 = i13;
                                        i23 = i2;
                                        i24 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i14 = zzx;
                                i19 = i12;
                                i15 = i32;
                                i20 = i35;
                                if (i33 != 0) {
                                    i16 = i20;
                                    i8 = i19;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    i25 = zzis.zzj(bArr2, i20, zzirVar3);
                                    unsafe2.putInt(obj4, j, zzji.zzb(zzirVar3.zza));
                                    i28 = i9 | i37;
                                    i26 = i19;
                                    i29 = i15;
                                    i27 = i14;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            case 16:
                                if (i33 != 0) {
                                    i14 = zzx;
                                    i15 = i32;
                                    i8 = i12;
                                    i16 = i35;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    int zzm2 = zzis.zzm(bArr2, i35, zzirVar3);
                                    i15 = i32;
                                    i14 = zzx;
                                    i19 = i12;
                                    unsafe2.putLong(obj, j, zzji.zzc(zzirVar3.zzb));
                                    i28 = i9 | i37;
                                    i25 = zzm2;
                                    i26 = i19;
                                    i29 = i15;
                                    i27 = i14;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                            default:
                                i14 = zzx;
                                i15 = i32;
                                i16 = i35;
                                if (i33 != 3) {
                                    i8 = i12;
                                    i4 = i3;
                                    i7 = i16;
                                    unsafe = unsafe2;
                                    i6 = i15;
                                    i10 = i14;
                                    i30 = i13;
                                    break;
                                } else {
                                    Object zzG2 = zzlpVar2.zzG(obj4, i14);
                                    i25 = zzis.zzn(zzG2, zzlpVar2.zzE(i14), bArr, i16, i2, (i15 << 3) | 4, zzirVar);
                                    zzlpVar2.zzO(obj4, i14, zzG2);
                                    i28 = i9 | i37;
                                    i26 = i12;
                                    i29 = i15;
                                    i27 = i14;
                                    i30 = i13;
                                    i23 = i2;
                                    i24 = i3;
                                }
                        }
                    } else {
                        i14 = zzx;
                        int i41 = i5;
                        i13 = i30;
                        if (zzA != 27) {
                            i9 = i28;
                            if (zzA <= 49) {
                                i6 = i32;
                                i21 = i41;
                                unsafe = unsafe2;
                                i10 = i14;
                                i25 = zzv(obj, bArr, i35, i2, i41, i6, i33, i14, i34, zzA, j, zzirVar);
                                if (i25 != i35) {
                                    zzlpVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i29 = i6;
                                    i23 = i2;
                                    i24 = i3;
                                    zzirVar3 = zzirVar;
                                    i26 = i21;
                                    i27 = i10;
                                    i28 = i9;
                                    i30 = i13;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i7 = i25;
                                    i8 = i21;
                                }
                            } else {
                                i21 = i41;
                                i6 = i32;
                                i22 = i35;
                                unsafe = unsafe2;
                                i10 = i14;
                                if (zzA != 50) {
                                    i25 = zzt(obj, bArr, i22, i2, i21, i6, i33, i34, zzA, j, i10, zzirVar);
                                    if (i25 != i22) {
                                        zzlpVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i29 = i6;
                                        i23 = i2;
                                        i24 = i3;
                                        zzirVar3 = zzirVar;
                                        i26 = i21;
                                        i27 = i10;
                                        i28 = i9;
                                        i30 = i13;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i25;
                                        i8 = i21;
                                    }
                                } else if (i33 == 2) {
                                    i25 = zzs(obj, bArr, i22, i2, i10, j, zzirVar);
                                    if (i25 != i22) {
                                        zzlpVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i29 = i6;
                                        i23 = i2;
                                        i24 = i3;
                                        zzirVar3 = zzirVar;
                                        i26 = i21;
                                        i27 = i10;
                                        i28 = i9;
                                        i30 = i13;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i7 = i25;
                                        i8 = i21;
                                    }
                                }
                            }
                            i30 = i13;
                        } else if (i33 == 2) {
                            zzkm zzkmVar = (zzkm) unsafe2.getObject(obj4, j);
                            if (!zzkmVar.zzc()) {
                                int size = zzkmVar.size();
                                zzkmVar = zzkmVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzkmVar);
                            }
                            i9 = i28;
                            i25 = zzis.zze(zzlpVar2.zzE(i14), i41, bArr, i35, i2, zzkmVar, zzirVar);
                            i29 = i32;
                            i26 = i41;
                            i27 = i14;
                            i28 = i9;
                            i30 = i13;
                            i23 = i2;
                            i24 = i3;
                        } else {
                            i9 = i28;
                            i6 = i32;
                            i21 = i41;
                            i22 = i35;
                            unsafe = unsafe2;
                            i10 = i14;
                        }
                        i4 = i3;
                        i7 = i22;
                        i8 = i21;
                        i30 = i13;
                    }
                }
                if (i8 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzirVar2 = zzirVar;
                        zzjr zzjrVar = zzirVar2.zzd;
                        if (zzjrVar != zzjr.zza) {
                            i11 = i6;
                            if (zzjrVar.zzb(this.zzg, i11) != null) {
                                throw null;
                            }
                            i25 = zzis.zzi(i8, bArr, i7, i2, zzd(obj), zzirVar);
                            obj3 = obj;
                            i23 = i2;
                            i26 = i8;
                            zzlpVar2 = this;
                            zzirVar3 = zzirVar2;
                            i29 = i11;
                            obj4 = obj3;
                            i27 = i10;
                            i28 = i9;
                            unsafe2 = unsafe;
                            bArr2 = bArr;
                            i24 = i4;
                        } else {
                            obj3 = obj;
                            i11 = i6;
                        }
                    } else {
                        obj3 = obj;
                        i11 = i6;
                        zzirVar2 = zzirVar;
                    }
                    i25 = zzis.zzi(i8, bArr, i7, i2, zzd(obj), zzirVar);
                    i23 = i2;
                    i26 = i8;
                    zzlpVar2 = this;
                    zzirVar3 = zzirVar2;
                    i29 = i11;
                    obj4 = obj3;
                    i27 = i10;
                    i28 = i9;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i24 = i4;
                } else {
                    zzlpVar = this;
                    obj2 = obj;
                    i25 = i7;
                    i26 = i8;
                    i28 = i9;
                }
            } else {
                unsafe = unsafe2;
                i4 = i24;
                obj2 = obj4;
                zzlpVar = zzlpVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        return ((zzkf) this.zzg).zzbA();
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzkf) {
                zzkf zzkfVar = (zzkf) obj;
                zzkfVar.zzbM(Integer.MAX_VALUE);
                zzkfVar.zzb = 0;
                zzkfVar.zzbK();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzB = zzB(i);
                long j = 1048575 & zzB;
                int zzA = zzA(zzB);
                if (zzA != 9) {
                    switch (zzA) {
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
                            this.zzm.zza(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzlg) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (zzT(obj, i)) {
                    zzE(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object obj, Object obj2) {
        zzJ(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = 1048575 & zzB;
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzmy.zzo(obj, j, zzmy.zza(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i)) {
                        zzmy.zzp(obj, j, zzmy.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj2, i)) {
                        zzmy.zzm(obj, j, zzmy.zzw(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzK(obj, obj2, i);
                    break;
                case 10:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzK(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlz.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzL(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzL(obj, obj2, i);
                    break;
            }
        }
        zzlz.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlz.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzirVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object obj, zzng zzngVar) throws IOException {
        if (!this.zzi) {
            zzQ(obj, zzngVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzT(obj, i)) {
                        zzngVar.zzf(i2, zzmy.zza(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj, i)) {
                        zzngVar.zzo(i2, zzmy.zzb(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj, i)) {
                        zzngVar.zzt(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj, i)) {
                        zzngVar.zzJ(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj, i)) {
                        zzngVar.zzr(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj, i)) {
                        zzngVar.zzm(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj, i)) {
                        zzngVar.zzk(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj, i)) {
                        zzngVar.zzb(i2, zzmy.zzw(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj, i)) {
                        zzZ(i2, zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzT(obj, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzT(obj, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj, i)) {
                        zzngVar.zzH(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj, i)) {
                        zzngVar.zzi(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj, i)) {
                        zzngVar.zzw(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj, i)) {
                        zzngVar.zzy(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj, i)) {
                        zzngVar.zzA(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj, i)) {
                        zzngVar.zzC(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzT(obj, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 21:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 23:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 24:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, zzE(i));
                    break;
                case 28:
                    zzlz.zzI(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar);
                    break;
                case 29:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 30:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 31:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 32:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 33:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 34:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 41:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, zzE(i));
                    break;
                case 50:
                    zzR(zzngVar, i2, zzmy.zzf(obj, zzB & 1048575), i);
                    break;
                case 51:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzf(i2, zzn(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzo(i2, zzo(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzt(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzJ(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzr(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzm(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzk(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzb(i2, zzY(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i2, i)) {
                        zzZ(i2, zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzH(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzi(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzw(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzy(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzA(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzC(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzS(obj, obj2, i) && Double.doubleToLongBits(zzmy.zza(obj, j)) == Double.doubleToLongBits(zzmy.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzS(obj, obj2, i) && Float.floatToIntBits(zzmy.zzb(obj, j)) == Float.floatToIntBits(zzmy.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzS(obj, obj2, i) && zzmy.zzw(obj, j) == zzmy.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
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
                    zzZ = zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j));
                    break;
                case 50:
                    zzZ = zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j));
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
                    long zzy = zzy(i) & 1048575;
                    if (zzmy.zzc(obj, zzy) == zzmy.zzc(obj2, zzy) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
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

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int zzB = zzB(i6);
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
            if ((268435456 & zzB) != 0 && !zzU(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzX(obj, i7, i6) && !zzV(obj, zzB, zzE(i6))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzlg) zzmy.zzf(obj, zzB & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzmy.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlx zzE = zzE(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzE.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (zzU(obj, i6, i, i2, i10) && !zzV(obj, zzB, zzE(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
