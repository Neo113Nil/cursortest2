package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes3.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i, int i2, zzlj zzljVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmv.zzf(obj, j)).longValue();
    }

    private final zzkg zzD(int i) {
        int i2 = i / 3;
        return (zzkg) this.zzd[i2 + i2 + 1];
    }

    private final zzlu zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlu zzluVar = (zzlu) this.zzd[i3];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i) {
        long zzB = zzB(i) & 1048575;
        if (zzO(obj2, i)) {
            Object zzf = zzmv.zzf(obj, zzB);
            Object zzf2 = zzmv.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, zzB, zzkk.zzg(zzf, zzf2));
                zzJ(obj, i);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, zzB, zzf2);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int zzB = zzB(i);
        int i2 = this.zzc[i];
        long j = zzB & 1048575;
        if (zzR(obj2, i2, i)) {
            Object zzf = zzR(obj, i2, i) ? zzmv.zzf(obj, j) : null;
            Object zzf2 = zzmv.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, j, zzkk.zzg(zzf, zzf2));
                zzK(obj, i2, i);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, j, zzf2);
                zzK(obj, i2, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzmv.zzq(obj, zzy(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) throws IOException {
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
                        zzndVar.zzf(i6, zzmv.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzo(i6, zzmv.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzb(i6, zzmv.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, zzE(i4));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 29:
                    z = false;
                    zzlw.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 30:
                    z = false;
                    zzlw.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 31:
                    z = false;
                    zzlw.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 32:
                    z = false;
                    zzlw.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 33:
                    z = false;
                    zzlw.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 34:
                    z = false;
                    zzlw.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, zzE(i4));
                    break;
                case 50:
                    zzM(zzndVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzb(i6, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i6, i4)) {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 61:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case 65:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case 66:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j2 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j2)) != 0;
            case 2:
                return zzmv.zzd(obj, j2) != 0;
            case 3:
                return zzmv.zzd(obj, j2) != 0;
            case 4:
                return zzmv.zzc(obj, j2) != 0;
            case 5:
                return zzmv.zzd(obj, j2) != 0;
            case 6:
                return zzmv.zzc(obj, j2) != 0;
            case 7:
                return zzmv.zzw(obj, j2);
            case 8:
                Object zzf = zzmv.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzjb) {
                    return !zzjb.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j2) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j2));
            case 11:
                return zzmv.zzc(obj, j2) != 0;
            case 12:
                return zzmv.zzc(obj, j2) != 0;
            case 13:
                return zzmv.zzc(obj, j2) != 0;
            case 14:
                return zzmv.zzd(obj, j2) != 0;
            case 15:
                return zzmv.zzc(obj, j2) != 0;
            case 16:
                return zzmv.zzd(obj, j2) != 0;
            case 17:
                return zzmv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzO(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i & 1048575));
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzmv.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i, (String) obj);
        } else {
            zzndVar.zzd(i, (zzjb) obj);
        }
    }

    static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zze = zzmm.zze();
        zzkcVar.zzc = zze;
        return zze;
    }

    static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char charAt5;
        int i6;
        char charAt6;
        int i7;
        char charAt7;
        int i8;
        char charAt8;
        int i9;
        char charAt9;
        int i10;
        char charAt10;
        int i11;
        char charAt11;
        int i12;
        char charAt12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        String str;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field zzG;
        char charAt13;
        int i23;
        int i24;
        Object obj;
        Field zzG2;
        Object obj2;
        Field zzG3;
        int i25;
        char charAt14;
        int i26;
        int i27;
        char charAt15;
        int i28;
        char charAt16;
        int i29;
        char charAt17;
        boolean z = zzltVar.zzc() == 2;
        String zzd = zzltVar.zzd();
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
        int charAt18 = zzd.charAt(i);
        if (charAt18 >= 55296) {
            int i32 = charAt18 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt17 = zzd.charAt(i31);
                if (charAt17 < 55296) {
                    break;
                }
                i32 |= (charAt17 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt18 = i32 | (charAt17 << i33);
            i31 = i29;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i3 = 0;
            charAt4 = 0;
            i2 = 0;
            iArr = zza;
            i4 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt19 = zzd.charAt(i31);
            if (charAt19 >= 55296) {
                int i35 = charAt19 & 8191;
                int i36 = 13;
                while (true) {
                    i12 = i34 + 1;
                    charAt12 = zzd.charAt(i34);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i35 |= (charAt12 & 8191) << i36;
                    i36 += 13;
                    i34 = i12;
                }
                charAt19 = i35 | (charAt12 << i36);
                i34 = i12;
            }
            int i37 = i34 + 1;
            int charAt20 = zzd.charAt(i34);
            if (charAt20 >= 55296) {
                int i38 = charAt20 & 8191;
                int i39 = 13;
                while (true) {
                    i11 = i37 + 1;
                    charAt11 = zzd.charAt(i37);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i38 |= (charAt11 & 8191) << i39;
                    i39 += 13;
                    i37 = i11;
                }
                charAt20 = i38 | (charAt11 << i39);
                i37 = i11;
            }
            int i40 = i37 + 1;
            charAt = zzd.charAt(i37);
            if (charAt >= 55296) {
                int i41 = charAt & 8191;
                int i42 = 13;
                while (true) {
                    i10 = i40 + 1;
                    charAt10 = zzd.charAt(i40);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i41 |= (charAt10 & 8191) << i42;
                    i42 += 13;
                    i40 = i10;
                }
                charAt = i41 | (charAt10 << i42);
                i40 = i10;
            }
            int i43 = i40 + 1;
            charAt2 = zzd.charAt(i40);
            if (charAt2 >= 55296) {
                int i44 = charAt2 & 8191;
                int i45 = 13;
                while (true) {
                    i9 = i43 + 1;
                    charAt9 = zzd.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i9;
                }
                charAt2 = i44 | (charAt9 << i45);
                i43 = i9;
            }
            int i46 = i43 + 1;
            charAt3 = zzd.charAt(i43);
            if (charAt3 >= 55296) {
                int i47 = charAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i8 = i46 + 1;
                    charAt8 = zzd.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i8;
                }
                charAt3 = i47 | (charAt8 << i48);
                i46 = i8;
            }
            int i49 = i46 + 1;
            int charAt21 = zzd.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i7 = i49 + 1;
                    charAt7 = zzd.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i7;
                }
                charAt21 = i50 | (charAt7 << i51);
                i49 = i7;
            }
            int i52 = i49 + 1;
            int charAt22 = zzd.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i6 = i52 + 1;
                    charAt6 = zzd.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i6;
                }
                charAt22 = i53 | (charAt6 << i54);
                i52 = i6;
            }
            int i55 = i52 + 1;
            charAt4 = zzd.charAt(i52);
            if (charAt4 >= 55296) {
                int i56 = charAt4 & 8191;
                int i57 = 13;
                while (true) {
                    i5 = i55 + 1;
                    charAt5 = zzd.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i5;
                }
                charAt4 = i56 | (charAt5 << i57);
                i55 = i5;
            }
            int[] iArr2 = new int[charAt4 + charAt21 + charAt22];
            i2 = charAt19 + charAt19 + charAt20;
            i3 = charAt21;
            iArr = iArr2;
            i4 = charAt19;
            i31 = i55;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
        int[] iArr3 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 + charAt3];
        int i58 = i3 + charAt4;
        int i59 = i58;
        int i60 = charAt4;
        int i61 = 0;
        int i62 = 0;
        while (i31 < length) {
            int i63 = i31 + 1;
            int charAt23 = zzd.charAt(i31);
            if (charAt23 >= c) {
                int i64 = charAt23 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i28 = i65 + 1;
                    charAt16 = zzd.charAt(i65);
                    if (charAt16 < c) {
                        break;
                    }
                    i64 |= (charAt16 & 8191) << i66;
                    i66 += 13;
                    i65 = i28;
                }
                charAt23 = i64 | (charAt16 << i66);
                i13 = i28;
            } else {
                i13 = i63;
            }
            int i67 = i13 + 1;
            int charAt24 = zzd.charAt(i13);
            if (charAt24 >= c) {
                int i68 = charAt24 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i27 = i69 + 1;
                    charAt15 = zzd.charAt(i69);
                    i14 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i68 |= (charAt15 & 8191) << i70;
                    i70 += 13;
                    i69 = i27;
                    length = i14;
                }
                charAt24 = i68 | (charAt15 << i70);
                i15 = i27;
            } else {
                i14 = length;
                i15 = i67;
            }
            int i71 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i61;
                i62++;
            }
            if (i71 >= 51) {
                int i72 = i15 + 1;
                int charAt25 = zzd.charAt(i15);
                if (charAt25 >= 55296) {
                    int i73 = charAt25 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i25 = i74 + 1;
                        charAt14 = zzd.charAt(i74);
                        i26 = i73;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i73 = i26 | ((charAt14 & 8191) << i75);
                        i75 += 13;
                        i74 = i25;
                    }
                    charAt25 = i26 | (charAt14 << i75);
                    i23 = i25;
                } else {
                    i23 = i72;
                }
                int i76 = charAt25;
                int i77 = i71 - 51;
                int i78 = i23;
                if (i77 == 9 || i77 == 17) {
                    int i79 = i61 / 3;
                    i24 = i2 + 1;
                    objArr[i79 + i79 + 1] = zze[i2];
                } else {
                    if (i77 == 12 && !z) {
                        int i80 = i61 / 3;
                        i24 = i2 + 1;
                        objArr[i80 + i80 + 1] = zze[i2];
                    }
                    int i81 = i76 + i76;
                    obj = zze[i81];
                    if (obj instanceof Field) {
                        zzG2 = zzG(cls, (String) obj);
                        zze[i81] = zzG2;
                    } else {
                        zzG2 = (Field) obj;
                    }
                    i16 = charAt23;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zzG2);
                    int i82 = i81 + 1;
                    obj2 = zze[i82];
                    if (obj2 instanceof Field) {
                        zzG3 = zzG(cls, (String) obj2);
                        zze[i82] = zzG3;
                    } else {
                        zzG3 = (Field) obj2;
                    }
                    i17 = (int) unsafe.objectFieldOffset(zzG3);
                    i21 = objectFieldOffset;
                    str = zzd;
                    i31 = i78;
                    i20 = 0;
                }
                i2 = i24;
                int i812 = i76 + i76;
                obj = zze[i812];
                if (obj instanceof Field) {
                }
                i16 = charAt23;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzG2);
                int i822 = i812 + 1;
                obj2 = zze[i822];
                if (obj2 instanceof Field) {
                }
                i17 = (int) unsafe.objectFieldOffset(zzG3);
                i21 = objectFieldOffset2;
                str = zzd;
                i31 = i78;
                i20 = 0;
            } else {
                i16 = charAt23;
                int i83 = i2 + 1;
                Field zzG4 = zzG(cls, (String) zze[i2]);
                if (i71 == 9 || i71 == 17) {
                    int i84 = i61 / 3;
                    objArr[i84 + i84 + 1] = zzG4.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        int i85 = i61 / 3;
                        i2 += 2;
                        objArr[i85 + i85 + 1] = zze[i83];
                    } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                        if (!z) {
                            int i86 = i61 / 3;
                            i2 += 2;
                            objArr[i86 + i86 + 1] = zze[i83];
                        }
                    } else if (i71 == 50) {
                        int i87 = i60 + 1;
                        iArr[i60] = i61;
                        int i88 = i61 / 3;
                        int i89 = i88 + i88;
                        int i90 = i2 + 2;
                        objArr[i89] = zze[i83];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i89 + 1] = zze[i90];
                            i2 += 3;
                        } else {
                            i2 = i90;
                        }
                        i60 = i87;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(zzG4);
                    i17 = 1048575;
                    if ((charAt24 & 4096) == 4096 || i71 > 17) {
                        str = zzd;
                        i18 = i15;
                        i19 = 0;
                    } else {
                        int i91 = i15 + 1;
                        int charAt26 = zzd.charAt(i15);
                        if (charAt26 >= 55296) {
                            int i92 = charAt26 & 8191;
                            int i93 = 13;
                            while (true) {
                                i22 = i91 + 1;
                                charAt13 = zzd.charAt(i91);
                                if (charAt13 < 55296) {
                                    break;
                                }
                                i92 |= (charAt13 & 8191) << i93;
                                i93 += 13;
                                i91 = i22;
                            }
                            charAt26 = i92 | (charAt13 << i93);
                        } else {
                            i22 = i91;
                        }
                        int i94 = i4 + i4 + (charAt26 / 32);
                        Object obj3 = zze[i94];
                        str = zzd;
                        if (obj3 instanceof Field) {
                            zzG = (Field) obj3;
                        } else {
                            zzG = zzG(cls, (String) obj3);
                            zze[i94] = zzG;
                        }
                        i19 = charAt26 % 32;
                        int i95 = i22;
                        i17 = (int) unsafe.objectFieldOffset(zzG);
                        i18 = i95;
                    }
                    if (i71 >= 18 || i71 > 49) {
                        i31 = i18;
                        i20 = i19;
                    } else {
                        iArr[i59] = objectFieldOffset3;
                        i31 = i18;
                        i20 = i19;
                        i59++;
                    }
                    i21 = objectFieldOffset3;
                }
                i2 = i83;
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(zzG4);
                i17 = 1048575;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                i18 = i15;
                i19 = 0;
                if (i71 >= 18) {
                }
                i31 = i18;
                i20 = i19;
                i21 = objectFieldOffset32;
            }
            int i96 = i61 + 1;
            iArr4[i61] = i16;
            int i97 = i61 + 2;
            int i98 = i20;
            iArr4[i96] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i71 << 20) | i21;
            i61 += 3;
            iArr4[i97] = (i98 << 20) | i17;
            iArr3 = iArr4;
            length = i14;
            zzd = str;
            c = 55296;
        }
        return new zzlm(iArr3, objArr, charAt, charAt2, zzltVar.zza(), z, false, iArr, charAt4, i58, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmv.zzf(obj, j)).floatValue();
    }

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
        int zzo;
        int zzz;
        int zzA8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzB2 = zzB(i6);
            int[] iArr = this.zzc;
            int i7 = iArr[i6];
            int zzA9 = zzA(zzB2);
            if (zzA9 <= 17) {
                int i8 = iArr[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i5) {
                    i4 = unsafe.getInt(obj, i9);
                    i5 = i9;
                }
            } else {
                i = 0;
            }
            long j = zzB2 & 1048575;
            switch (zzA9) {
                case 0:
                    if ((i4 & i) != 0) {
                        zzA = zzjj.zzA(i7 << 3);
                        zzo = zzA + 8;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzo = zzA2 + 4;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB(j2);
                        i3 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB(j3);
                        i3 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzv(i10);
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        zzA = zzjj.zzA(i7 << 3);
                        zzo = zzA + 8;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzo = zzA2 + 4;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        zzA5 = zzjj.zzA(i7 << 3);
                        zzo = zzA5 + 1;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i4 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzjb) {
                            zzA6 = zzjj.zzA(i7 << 3);
                            zzd = ((zzjb) object).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i2 = zzA6 + zzA7 + zzd;
                            i3 += i2;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i7 << 3);
                            zzv = zzjj.zzy((String) object);
                            i2 = zzA4 + zzv;
                            i3 += i2;
                        }
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        zzo = zzlw.zzo(i7, unsafe.getObject(obj, j), zzE(i6));
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j);
                        zzA6 = zzjj.zzA(i7 << 3);
                        zzd = zzjbVar.zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i2 = zzA6 + zzA7 + zzd;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzA(i11);
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzv(i12);
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzo = zzA2 + 4;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        zzA = zzjj.zzA(i7 << 3);
                        zzo = zzA + 8;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzA((i13 >> 31) ^ (i13 + i13));
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i4) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzB((j4 >> 63) ^ (j4 + j4));
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        zzo = zzjj.zzu(i7, (zzlj) unsafe.getObject(obj, j), zzE(i6));
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 21:
                    zzo = zzlw.zzx(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 26:
                    zzo = zzlw.zzu(i7, (List) unsafe.getObject(obj, j));
                    i3 += zzo;
                    break;
                case 27:
                    zzo = zzlw.zzp(i7, (List) unsafe.getObject(obj, j), zzE(i6));
                    i3 += zzo;
                    break;
                case 28:
                    zzo = zzlw.zzc(i7, (List) unsafe.getObject(obj, j));
                    i3 += zzo;
                    break;
                case 29:
                    zzo = zzlw.zzv(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 30:
                    zzo = zzlw.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 31:
                    zzo = zzlw.zzf(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 32:
                    zzo = zzlw.zzh(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 33:
                    zzo = zzlw.zzq(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 34:
                    zzo = zzlw.zzs(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += zzo;
                    break;
                case 35:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i7);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlw.zzj(i7, (List) unsafe.getObject(obj, j), zzE(i6));
                    i3 += zzo;
                    break;
                case 50:
                    zzle.zza(i7, unsafe.getObject(obj, j), zzF(i6));
                    break;
                case 51:
                    if (zzR(obj, i7, i6)) {
                        zzA = zzjj.zzA(i7 << 3);
                        zzo = zzA + 8;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i7, i6)) {
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzo = zzA2 + 4;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i7, i6)) {
                        long zzC = zzC(obj, j);
                        zzA3 = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB(zzC);
                        i3 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i7, i6)) {
                        long zzC2 = zzC(obj, j);
                        zzA3 = zzjj.zzA(i7 << 3);
                        zzB = zzjj.zzB(zzC2);
                        i3 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i7, i6)) {
                        int zzr = zzr(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzv(zzr);
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i7, i6)) {
                        zzA = zzjj.zzA(i7 << 3);
                        zzo = zzA + 8;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i7, i6)) {
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzo = zzA2 + 4;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i7, i6)) {
                        zzA5 = zzjj.zzA(i7 << 3);
                        zzo = zzA5 + 1;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i7, i6)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            zzA6 = zzjj.zzA(i7 << 3);
                            zzd = ((zzjb) object2).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i2 = zzA6 + zzA7 + zzd;
                            i3 += i2;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i7 << 3);
                            zzv = zzjj.zzy((String) object2);
                            i2 = zzA4 + zzv;
                            i3 += i2;
                        }
                    }
                case 60:
                    if (zzR(obj, i7, i6)) {
                        zzo = zzlw.zzo(i7, unsafe.getObject(obj, j), zzE(i6));
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i7, i6)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j);
                        zzA6 = zzjj.zzA(i7 << 3);
                        zzd = zzjbVar2.zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i2 = zzA6 + zzA7 + zzd;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i7, i6)) {
                        int zzr2 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzA(zzr2);
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i7, i6)) {
                        int zzr3 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzv(zzr3);
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i7, i6)) {
                        zzA2 = zzjj.zzA(i7 << 3);
                        zzo = zzA2 + 4;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i7, i6)) {
                        zzA = zzjj.zzA(i7 << 3);
                        zzo = zzA + 8;
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i7, i6)) {
                        int zzr4 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i7, i6)) {
                        long zzC3 = zzC(obj, j);
                        zzA4 = zzjj.zzA(i7 << 3);
                        zzv = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i2 = zzA4 + zzv;
                        i3 += i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i7, i6)) {
                        zzo = zzjj.zzu(i7, (zzlj) unsafe.getObject(obj, j), zzE(i6));
                        i3 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        int zza2 = i3 + zzmlVar.zza(zzmlVar.zzc(obj));
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
            if (zzA9 >= zzju.DOUBLE_LIST_PACKED.zza() && zzA9 <= zzju.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i3)) {
                        long zzd2 = zzmv.zzd(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzd2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i3)) {
                        long zzd3 = zzmv.zzd(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzd3);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i3)) {
                        int zzc = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzc);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i3)) {
                        zzA5 = zzjj.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i3)) {
                        break;
                    } else {
                        Object zzf = zzmv.zzf(obj, j);
                        if (zzf instanceof zzjb) {
                            zzA6 = zzjj.zzA(i4 << 3);
                            zzd = ((zzjb) zzf).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i4 << 3);
                            zzv = zzjj.zzy((String) zzf);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (zzO(obj, i3)) {
                        zzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i3)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j);
                        zzA6 = zzjj.zzA(i4 << 3);
                        zzd = zzjbVar.zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i3)) {
                        int zzc2 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA(zzc2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i3)) {
                        int zzc3 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzc3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i3)) {
                        int zzc4 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i3)) {
                        long zzd4 = zzmv.zzd(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i3)) {
                        zzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 21:
                    zzo = zzlw.zzx(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 26:
                    zzo = zzlw.zzu(i4, (List) zzmv.zzf(obj, j));
                    i2 += zzo;
                    break;
                case 27:
                    zzo = zzlw.zzp(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    i2 += zzo;
                    break;
                case 28:
                    zzo = zzlw.zzc(i4, (List) zzmv.zzf(obj, j));
                    i2 += zzo;
                    break;
                case 29:
                    zzo = zzlw.zzv(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 30:
                    zzo = zzlw.zzd(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 31:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 32:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 33:
                    zzo = zzlw.zzq(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 34:
                    zzo = zzlw.zzs(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += zzo;
                    break;
                case 35:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlw.zzj(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    i2 += zzo;
                    break;
                case 50:
                    zzle.zza(i4, zzmv.zzf(obj, j), zzF(i3));
                    break;
                case 51:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i4, i3)) {
                        long zzC = zzC(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzC);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i4, i3)) {
                        long zzC2 = zzC(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzC2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i4, i3)) {
                        int zzr = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzr);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i4, i3)) {
                        zzA5 = zzjj.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i4, i3)) {
                        break;
                    } else {
                        Object zzf2 = zzmv.zzf(obj, j);
                        if (zzf2 instanceof zzjb) {
                            zzA6 = zzjj.zzA(i4 << 3);
                            zzd = ((zzjb) zzf2).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i4 << 3);
                            zzv = zzjj.zzy((String) zzf2);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (zzR(obj, i4, i3)) {
                        zzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i4, i3)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j);
                        zzA6 = zzjj.zzA(i4 << 3);
                        zzd = zzjbVar2.zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i4, i3)) {
                        int zzr2 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA(zzr2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i4, i3)) {
                        int zzr3 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzr3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i4, i3)) {
                        int zzr4 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i4, i3)) {
                        long zzC3 = zzC(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i4, i3)) {
                        zzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        i2 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i2 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzio zzioVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int zzm = zzip.zzm(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return zzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int zzj = zzip.zzj(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j2, i4);
                return zzj;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int zzm2 = zzip.zzm(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return zzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int zzj2 = zzip.zzj(bArr, i, zzioVar);
                int i9 = zzioVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zzna.zzf(bArr, zzj2, zzj2 + i9)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzkk.zzb));
                    zzj2 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return zzj2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                int zzd = zzip.zzd(zzE(i8), bArr, i, i2, zzioVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j2, i4);
                return zzd;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int zza2 = zzip.zza(bArr, i, zzioVar);
                unsafe.putObject(obj, j, zzioVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return zza2;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int zzj3 = zzip.zzj(bArr, i, zzioVar);
                int i10 = zzioVar.zza;
                zzkg zzD = zzD(i8);
                if (zzD != null && !zzD.zza(i10)) {
                    zzd(obj).zzh(i3, Long.valueOf(i10));
                    return zzj3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i10));
                unsafe.putInt(obj, j2, i4);
                return zzj3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int zzj4 = zzip.zzj(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return zzj4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int zzm3 = zzip.zzm(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return zzm3;
            case 68:
                if (i5 == 3) {
                    int zzc = zzip.zzc(zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzioVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0080. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzlm<T> zzlmVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i14 = -1;
        int i15 = i;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (i15 < i13) {
            int i20 = i15 + 1;
            int i21 = bArr2[i15];
            if (i21 < 0) {
                i20 = zzip.zzk(i21, bArr2, i20, zzioVar2);
                i21 = zzioVar2.zza;
            }
            int i22 = i20;
            int i23 = i21 >>> 3;
            int i24 = i21 & 7;
            int zzx = i23 > i16 ? zzlmVar.zzx(i23, i17 / 3) : zzlmVar.zzw(i23);
            if (zzx == i14) {
                unsafe = unsafe2;
                i3 = i21;
                i4 = i14;
                i5 = i23;
                i6 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i25 = iArr[zzx + 1];
                int zzA = zzA(i25);
                int i26 = i21;
                int i27 = zzx;
                long j = i25 & 1048575;
                if (zzA <= 17) {
                    int i28 = iArr[i27 + 2];
                    int i29 = 1 << (i28 >>> 20);
                    int i30 = i28 & 1048575;
                    if (i30 != i19) {
                        int i31 = 1048575;
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj3, i19, i18);
                            i31 = 1048575;
                        }
                        if (i30 != i31) {
                            i18 = unsafe2.getInt(obj3, i30);
                        }
                        i19 = i30;
                    }
                    switch (zzA) {
                        case 0:
                            i12 = i27;
                            if (i24 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                zzmv.zzo(obj3, j, Double.longBitsToDouble(zzip.zzn(bArr2, i22)));
                                i15 = i22 + 8;
                                i18 |= i29;
                                i13 = i2;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 1:
                            i12 = i27;
                            if (i24 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                zzmv.zzp(obj3, j, Float.intBitsToFloat(zzip.zzb(bArr2, i22)));
                                i15 = i22 + 4;
                                i18 |= i29;
                                i13 = i2;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i12 = i27;
                            if (i24 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                int zzm = zzip.zzm(bArr2, i22, zzioVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j, zzioVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i18 |= i29;
                                i15 = zzm;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                i13 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            i12 = i27;
                            if (i24 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                int zzj = zzip.zzj(bArr2, i22, zzioVar2);
                                unsafe2.putInt(obj3, j, zzioVar2.zza);
                                i18 |= i29;
                                i13 = i2;
                                i15 = zzj;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i12 = i27;
                            if (i24 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j, zzip.zzn(bArr2, i22));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                i15 = i22 + 8;
                                i18 |= i29;
                                i13 = i2;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i12 = i27;
                            if (i24 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j, zzip.zzb(bArr2, i22));
                                i15 = i22 + 4;
                                i18 |= i29;
                                i13 = i2;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 7:
                            i12 = i27;
                            if (i24 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                i15 = zzip.zzm(bArr2, i22, zzioVar2);
                                zzmv.zzm(obj3, j, zzioVar2.zzb != 0);
                                i18 |= i29;
                                i13 = i2;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 8:
                            i12 = i27;
                            if (i24 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                i15 = (536870912 & i25) == 0 ? zzip.zzg(bArr2, i22, zzioVar2) : zzip.zzh(bArr2, i22, zzioVar2);
                                unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                i18 |= i29;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 9:
                            i12 = i27;
                            if (i24 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                i15 = zzip.zzd(zzlmVar.zzE(i12), bArr2, i22, i13, zzioVar2);
                                Object object = unsafe2.getObject(obj3, j);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i18 |= i29;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 10:
                            i12 = i27;
                            if (i24 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                i15 = zzip.zza(bArr2, i22, zzioVar2);
                                unsafe2.putObject(obj3, j, zzioVar2.zzc);
                                i18 |= i29;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 12:
                            i12 = i27;
                            if (i24 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                i15 = zzip.zzj(bArr2, i22, zzioVar2);
                                unsafe2.putInt(obj3, j, zzioVar2.zza);
                                i18 |= i29;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 15:
                            i12 = i27;
                            if (i24 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                i15 = zzip.zzj(bArr2, i22, zzioVar2);
                                unsafe2.putInt(obj3, j, zzjf.zzb(zzioVar2.zza));
                                i18 |= i29;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        case 16:
                            if (i24 != 0) {
                                i12 = i27;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i5 = i23;
                                i6 = i12;
                                i4 = -1;
                                i3 = i26;
                                break;
                            } else {
                                int zzm2 = zzip.zzm(bArr2, i22, zzioVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i12 = i27;
                                unsafe5.putLong(obj6, j, zzjf.zzc(zzioVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i18 |= i29;
                                i15 = zzm2;
                                i16 = i23;
                                i17 = i12;
                                i14 = -1;
                                break;
                            }
                        default:
                            i12 = i27;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i5 = i23;
                            i6 = i12;
                            i4 = -1;
                            i3 = i26;
                            break;
                    }
                } else {
                    i6 = i27;
                    if (zzA != 27) {
                        i7 = i22;
                        Unsafe unsafe6 = unsafe2;
                        if (zzA <= 49) {
                            i8 = i18;
                            unsafe = unsafe6;
                            i4 = -1;
                            i10 = i19;
                            int zzv = zzlmVar.zzv(obj, bArr, i7, i2, i26, i23, i24, i6, i25, zzA, j, zzioVar);
                            i9 = i26;
                            i11 = i23;
                            if (zzv != i7) {
                                zzlmVar = this;
                                obj3 = obj;
                                zzioVar2 = zzioVar;
                                i15 = zzv;
                                i17 = i6;
                                i16 = i11;
                                i19 = i10;
                                i14 = i4;
                                i18 = i8;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i13 = i2;
                            } else {
                                obj2 = obj;
                                i22 = zzv;
                                i5 = i11;
                                i3 = i9;
                            }
                        } else {
                            i8 = i18;
                            unsafe = unsafe6;
                            i4 = -1;
                            i9 = i26;
                            i10 = i19;
                            i11 = i23;
                            if (zzA != 50) {
                                i5 = i11;
                                int zzt = zzt(obj, bArr, i7, i2, i9, i5, i24, i25, zzA, j, i6, zzioVar);
                                obj2 = obj;
                                i3 = i9;
                                i6 = i6;
                                if (zzt != i7) {
                                    zzlmVar = this;
                                    zzioVar2 = zzioVar;
                                    i16 = i5;
                                    i15 = zzt;
                                    i17 = i6;
                                    obj3 = obj2;
                                    i19 = i10;
                                    i14 = i4;
                                    i18 = i8;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i13 = i2;
                                } else {
                                    i22 = zzt;
                                }
                            } else if (i24 == 2) {
                                int zzs = zzs(obj, bArr, i7, i2, i6, j, zzioVar);
                                i6 = i6;
                                if (zzs != i7) {
                                    zzlmVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzioVar2 = zzioVar;
                                    i15 = zzs;
                                    i17 = i6;
                                    i16 = i11;
                                    i19 = i10;
                                    i14 = -1;
                                    i18 = i8;
                                    unsafe2 = unsafe;
                                    i13 = i2;
                                } else {
                                    obj2 = obj;
                                    i22 = zzs;
                                    i5 = i11;
                                    i3 = i9;
                                }
                            } else {
                                i6 = i6;
                                obj2 = obj;
                                i22 = i7;
                                i5 = i11;
                                i3 = i9;
                            }
                        }
                    } else if (i24 == 2) {
                        zzkj zzkjVar = (zzkj) unsafe2.getObject(obj3, j);
                        if (!zzkjVar.zzc()) {
                            int size = zzkjVar.size();
                            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j, zzkjVar);
                        }
                        int zze = zzip.zze(zzlmVar.zzE(i6), i26, bArr2, i22, i2, zzkjVar, zzioVar2);
                        bArr2 = bArr;
                        zzioVar2 = zzioVar;
                        i15 = zze;
                        i17 = i6;
                        unsafe2 = unsafe2;
                        i16 = i23;
                        i14 = -1;
                        obj3 = obj;
                        i13 = i2;
                    } else {
                        i7 = i22;
                        i10 = i19;
                        i8 = i18;
                        unsafe = unsafe2;
                        i11 = i23;
                        i4 = -1;
                        i9 = i26;
                        obj2 = obj;
                        i22 = i7;
                        i5 = i11;
                        i3 = i9;
                    }
                    i19 = i10;
                    i18 = i8;
                }
            }
            int zzi = zzip.zzi(i3, bArr, i22, i2, zzd(obj2), zzioVar);
            bArr2 = bArr;
            zzioVar2 = zzioVar;
            i16 = i5;
            i17 = i6;
            obj3 = obj2;
            i14 = i4;
            unsafe2 = unsafe;
            i13 = i2;
            i15 = zzi;
            zzlmVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i32 = i13;
        int i33 = i19;
        int i34 = i18;
        if (i33 != 1048575) {
            unsafe7.putInt(obj7, i33, i34);
        }
        if (i15 == i32) {
            return i15;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzio zzioVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzl;
        int i12 = i;
        int i13 = i2;
        Unsafe unsafe = zzb;
        zzkj zzkjVar = (zzkj) unsafe.getObject(obj, j2);
        if (!zzkjVar.zzc()) {
            int size = zzkjVar.size();
            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkjVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVar;
                    int zzj = zzip.zzj(bArr, i12, zzioVar);
                    int i14 = zzioVar.zza + zzj;
                    while (zzj < i14) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i14) {
                        return zzj;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVar;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i)));
                    while (true) {
                        i8 = i12 + 8;
                        if (i8 < i13) {
                            i12 = zzip.zzj(bArr, i8, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i12)));
                            }
                        }
                    }
                    return i8;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVar;
                    int zzj2 = zzip.zzj(bArr, i12, zzioVar);
                    int i15 = zzioVar.zza + zzj2;
                    while (zzj2 < i15) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, zzj2)));
                        zzj2 += 4;
                    }
                    if (zzj2 == i15) {
                        return zzj2;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVar;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i)));
                    while (true) {
                        i9 = i12 + 4;
                        if (i9 < i13) {
                            i12 = zzip.zzj(bArr, i9, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i12)));
                            }
                        }
                    }
                    return i9;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzky zzkyVar = (zzky) zzkjVar;
                    int zzj3 = zzip.zzj(bArr, i12, zzioVar);
                    int i16 = zzioVar.zza + zzj3;
                    while (zzj3 < i16) {
                        zzj3 = zzip.zzm(bArr, zzj3, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (zzj3 == i16) {
                        return zzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVar;
                    int zzm = zzip.zzm(bArr, i12, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (zzm < i13) {
                        int zzj4 = zzip.zzj(bArr, zzm, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm;
                        }
                        zzm = zzip.zzm(bArr, zzj4, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return zzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzip.zzf(bArr, i12, zzkjVar, zzioVar);
                }
                if (i5 == 0) {
                    return zzip.zzl(i3, bArr, i12, i13, zzkjVar, zzioVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVar;
                    int zzj5 = zzip.zzj(bArr, i12, zzioVar);
                    int i17 = zzioVar.zza + zzj5;
                    while (zzj5 < i17) {
                        zzkyVar3.zzg(zzip.zzn(bArr, zzj5));
                        zzj5 += 8;
                    }
                    if (zzj5 == i17) {
                        return zzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVar;
                    zzkyVar4.zzg(zzip.zzn(bArr, i));
                    while (true) {
                        i10 = i12 + 8;
                        if (i10 < i13) {
                            i12 = zzip.zzj(bArr, i10, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, i12));
                            }
                        }
                    }
                    return i10;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVar;
                    int zzj6 = zzip.zzj(bArr, i12, zzioVar);
                    int i18 = zzioVar.zza + zzj6;
                    while (zzj6 < i18) {
                        zzkdVar.zzh(zzip.zzb(bArr, zzj6));
                        zzj6 += 4;
                    }
                    if (zzj6 == i18) {
                        return zzj6;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVar;
                    zzkdVar2.zzh(zzip.zzb(bArr, i));
                    while (true) {
                        i11 = i12 + 4;
                        if (i11 < i13) {
                            i12 = zzip.zzj(bArr, i11, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, i12));
                            }
                        }
                    }
                    return i11;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    zziq zziqVar = (zziq) zzkjVar;
                    int zzj7 = zzip.zzj(bArr, i12, zzioVar);
                    int i19 = zzioVar.zza + zzj7;
                    while (zzj7 < i19) {
                        zzj7 = zzip.zzm(bArr, zzj7, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (zzj7 == i19) {
                        return zzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVar;
                    int zzm2 = zzip.zzm(bArr, i12, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (zzm2 < i13) {
                        int zzj8 = zzip.zzj(bArr, zzm2, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzip.zzm(bArr, zzj8, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj9 = zzip.zzj(bArr, i12, zzioVar);
                        int i20 = zzioVar.zza;
                        if (i20 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i20 == 0) {
                            zzkjVar.add("");
                        } else {
                            zzkjVar.add(new String(bArr, zzj9, i20, zzkk.zzb));
                            zzj9 += i20;
                        }
                        while (zzj9 < i13) {
                            int zzj10 = zzip.zzj(bArr, zzj9, zzioVar);
                            if (i3 != zzioVar.zza) {
                                return zzj9;
                            }
                            zzj9 = zzip.zzj(bArr, zzj10, zzioVar);
                            int i21 = zzioVar.zza;
                            if (i21 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i21 == 0) {
                                zzkjVar.add("");
                            } else {
                                zzkjVar.add(new String(bArr, zzj9, i21, zzkk.zzb));
                                zzj9 += i21;
                            }
                        }
                        return zzj9;
                    }
                    int zzj11 = zzip.zzj(bArr, i12, zzioVar);
                    int i22 = zzioVar.zza;
                    if (i22 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i22 == 0) {
                        zzkjVar.add("");
                    } else {
                        int i23 = zzj11 + i22;
                        if (!zzna.zzf(bArr, zzj11, i23)) {
                            throw zzkm.zzc();
                        }
                        zzkjVar.add(new String(bArr, zzj11, i22, zzkk.zzb));
                        zzj11 = i23;
                    }
                    while (zzj11 < i13) {
                        int zzj12 = zzip.zzj(bArr, zzj11, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzj11;
                        }
                        zzj11 = zzip.zzj(bArr, zzj12, zzioVar);
                        int i24 = zzioVar.zza;
                        if (i24 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i24 == 0) {
                            zzkjVar.add("");
                        } else {
                            int i25 = zzj11 + i24;
                            if (!zzna.zzf(bArr, zzj11, i25)) {
                                throw zzkm.zzc();
                            }
                            zzkjVar.add(new String(bArr, zzj11, i24, zzkk.zzb));
                            zzj11 = i25;
                        }
                    }
                    return zzj11;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zzip.zze(zzE(i6), i3, bArr, i12, i13, zzkjVar, zzioVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int zzj13 = zzip.zzj(bArr, i12, zzioVar);
                    int i26 = zzioVar.zza;
                    if (i26 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i26 > bArr.length - zzj13) {
                        throw zzkm.zzf();
                    }
                    if (i26 == 0) {
                        zzkjVar.add(zzjb.zzb);
                    } else {
                        zzkjVar.add(zzjb.zzl(bArr, zzj13, i26));
                        zzj13 += i26;
                    }
                    while (zzj13 < i13) {
                        int zzj14 = zzip.zzj(bArr, zzj13, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzj13;
                        }
                        zzj13 = zzip.zzj(bArr, zzj14, zzioVar);
                        int i27 = zzioVar.zza;
                        if (i27 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i27 > bArr.length - zzj13) {
                            throw zzkm.zzf();
                        }
                        if (i27 == 0) {
                            zzkjVar.add(zzjb.zzb);
                        } else {
                            zzkjVar.add(zzjb.zzl(bArr, zzj13, i27));
                            zzj13 += i27;
                        }
                    }
                    return zzj13;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzl = zzip.zzl(i3, bArr, i12, i13, zzkjVar, zzioVar);
                    }
                    return i;
                }
                zzl = zzip.zzf(bArr, i12, zzkjVar, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object zzC = zzlw.zzC(i4, zzkjVar, zzD(i6), zzmmVar, this.zzn);
                if (zzC == null) {
                    return zzl;
                }
                zzkcVar.zzc = (zzmm) zzC;
                return zzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVar;
                    int zzj15 = zzip.zzj(bArr, i12, zzioVar);
                    int i28 = zzioVar.zza + zzj15;
                    while (zzj15 < i28) {
                        zzj15 = zzip.zzj(bArr, zzj15, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (zzj15 == i28) {
                        return zzj15;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVar;
                    int zzj16 = zzip.zzj(bArr, i12, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (zzj16 < i13) {
                        int zzj17 = zzip.zzj(bArr, zzj16, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzj16;
                        }
                        zzj16 = zzip.zzj(bArr, zzj17, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return zzj16;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVar;
                    int zzj18 = zzip.zzj(bArr, i12, zzioVar);
                    int i29 = zzioVar.zza + zzj18;
                    while (zzj18 < i29) {
                        zzj18 = zzip.zzm(bArr, zzj18, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (zzj18 == i29) {
                        return zzj18;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVar;
                    int zzm3 = zzip.zzm(bArr, i12, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (zzm3 < i13) {
                        int zzj19 = zzip.zzj(bArr, zzm3, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzip.zzm(bArr, zzj19, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return zzm3;
                }
                return i;
            default:
                if (i5 == 3) {
                    zzlu zzE = zzE(i6);
                    int i30 = (i3 & (-8)) | 4;
                    int zzc = zzip.zzc(zzE, bArr, i12, i13, i30, zzioVar);
                    zzkjVar.add(zzioVar.zzc);
                    while (zzc < i13) {
                        int zzj20 = zzip.zzj(bArr, zzc, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzc;
                        }
                        zzc = zzip.zzc(zzE, bArr, zzj20, i13, i30, zzioVar);
                        zzkjVar.add(zzioVar.zzc);
                        i13 = i2;
                    }
                    return zzc;
                }
                return i;
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
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
                    zzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzkk.zza(zzmv.zzw(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) zzmv.zzf(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object zzf = zzmv.zzf(obj, j);
                    if (zzf != null) {
                        i5 = zzf.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object zzf2 = zzmv.zzf(obj, j);
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
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 51:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zza(zzS(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) zzmv.zzf(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzr(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzio r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long zzB = zzB(this.zzj[i2]) & 1048575;
            Object zzf = zzmv.zzf(obj, zzB);
            if (zzf != null) {
                ((zzld) zzf).zzc();
                zzmv.zzs(obj, zzB, zzf);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzioVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
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
                    if (zzO(obj, i)) {
                        zzndVar.zzf(i2, zzmv.zza(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i)) {
                        zzndVar.zzo(i2, zzmv.zzb(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i)) {
                        zzndVar.zzt(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i)) {
                        zzndVar.zzJ(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i)) {
                        zzndVar.zzr(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i)) {
                        zzndVar.zzm(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i)) {
                        zzndVar.zzk(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i)) {
                        zzndVar.zzb(i2, zzmv.zzw(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i)) {
                        zzT(i2, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i)) {
                        zzndVar.zzv(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i)) {
                        zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i)) {
                        zzndVar.zzH(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i)) {
                        zzndVar.zzi(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i)) {
                        zzndVar.zzw(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i)) {
                        zzndVar.zzy(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i)) {
                        zzndVar.zzA(i2, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i)) {
                        zzndVar.zzC(i2, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i)) {
                        zzndVar.zzq(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlw.zzJ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i));
                    break;
                case 28:
                    zzlw.zzI(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i));
                    break;
                case 50:
                    zzM(zzndVar, i2, zzmv.zzf(obj, zzB & 1048575), i);
                    break;
                case 51:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzf(i2, zzn(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzo(i2, zzo(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzt(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzJ(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzr(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzm(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzk(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzb(i2, zzS(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i2, i)) {
                        zzT(i2, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzv(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzH(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzi(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzw(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzy(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzA(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzC(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzq(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i) && Double.doubleToLongBits(zzmv.zza(obj, j)) == Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i) && Float.floatToIntBits(zzmv.zzb(obj, j)) == Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i) && zzmv.zzw(obj, j) == zzmv.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
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
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
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
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int zzB = zzB(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & zzB) != 0 && !zzP(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i8, i2) && !zzQ(obj, zzB, zzE(i2))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj, zzB & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlu zzE = zzE(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzE.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzP(obj, i2, i, i3, i11) && !zzQ(obj, zzB, zzE(i2))) {
                return false;
            }
            i6++;
            i4 = i;
            i5 = i3;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = 1048575 & zzB;
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
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
                    zzlw.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }
}
