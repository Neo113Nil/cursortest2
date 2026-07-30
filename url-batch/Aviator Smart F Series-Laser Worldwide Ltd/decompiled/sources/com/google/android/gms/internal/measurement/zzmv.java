package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
final class zzmv {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznk zzc;
    private static final zznk zzd;
    private static final zznk zze;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        zzc = zzX(false);
        zzd = zzX(true);
        zze = new zznm();
    }

    public static zznk zzA() {
        return zze;
    }

    static Object zzB(Object obj, int i8, int i9, Object obj2, zznk zznkVar) {
        if (obj2 == null) {
            obj2 = zznkVar.zzc(obj);
        }
        zznkVar.zzf(obj2, i8, i9);
        return obj2;
    }

    static void zzC(zznk zznkVar, Object obj, Object obj2) {
        zznkVar.zzh(obj, zznkVar.zze(zznkVar.zzd(obj), zznkVar.zzd(obj2)));
    }

    public static void zzD(Class cls) {
        Class cls2;
        if (!zzlb.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzE(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzc(i8, list, z7);
    }

    public static void zzF(int i8, List list, zzoc zzocVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zze(i8, list);
    }

    public static void zzG(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzg(i8, list, z7);
    }

    public static void zzH(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzj(i8, list, z7);
    }

    public static void zzI(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzl(i8, list, z7);
    }

    public static void zzJ(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzn(i8, list, z7);
    }

    public static void zzK(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzp(i8, list, z7);
    }

    public static void zzL(int i8, List list, zzoc zzocVar, zzmt zzmtVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((zzkj) zzocVar).zzq(i8, list.get(i9), zzmtVar);
        }
    }

    public static void zzM(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzs(i8, list, z7);
    }

    public static void zzN(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzu(i8, list, z7);
    }

    public static void zzO(int i8, List list, zzoc zzocVar, zzmt zzmtVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((zzkj) zzocVar).zzv(i8, list.get(i9), zzmtVar);
        }
    }

    public static void zzP(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzx(i8, list, z7);
    }

    public static void zzQ(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzz(i8, list, z7);
    }

    public static void zzR(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzB(i8, list, z7);
    }

    public static void zzS(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzD(i8, list, z7);
    }

    public static void zzT(int i8, List list, zzoc zzocVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzG(i8, list);
    }

    public static void zzU(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzI(i8, list, z7);
    }

    public static void zzV(int i8, List list, zzoc zzocVar, boolean z7) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzocVar.zzK(i8, list, z7);
    }

    static boolean zzW(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static zznk zzX(boolean z7) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zznk) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int zza(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzki.zzx(i8 << 3) + 1);
    }

    static int zzb(int i8, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = size * zzki.zzx(i8 << 3);
        for (int i9 = 0; i9 < list.size(); i9++) {
            int zzd2 = ((zzka) list.get(i9)).zzd();
            zzx += zzki.zzx(zzd2) + zzd2;
        }
        return zzx;
    }

    static int zzc(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzki.zzx(i8 << 3));
    }

    static int zzd(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzu(zzlcVar.zze(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int zze(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzki.zzx(i8 << 3) + 4);
    }

    static int zzf(List list) {
        return list.size() * 4;
    }

    static int zzg(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzki.zzx(i8 << 3) + 8);
    }

    static int zzh(List list) {
        return list.size() * 8;
    }

    static int zzi(int i8, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i9 += zzki.zzt(i8, (zzmi) list.get(i10), zzmtVar);
        }
        return i9;
    }

    static int zzj(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzk(list) + (size * zzki.zzx(i8 << 3));
    }

    static int zzk(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzu(zzlcVar.zze(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzu(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int zzl(int i8, List list, boolean z7) {
        if (list.size() == 0) {
            return 0;
        }
        return zzm(list) + (list.size() * zzki.zzx(i8 << 3));
    }

    static int zzm(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzy(zzlxVar.zza(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzy(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    static int zzn(int i8, Object obj, zzmt zzmtVar) {
        if (!(obj instanceof zzlo)) {
            return zzki.zzx(i8 << 3) + zzki.zzv((zzmi) obj, zzmtVar);
        }
        int i9 = zzki.zzb;
        int zza2 = ((zzlo) obj).zza();
        return zzki.zzx(i8 << 3) + zzki.zzx(zza2) + zza2;
    }

    static int zzo(int i8, List list, zzmt zzmtVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzx = zzki.zzx(i8 << 3) * size;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            if (obj instanceof zzlo) {
                int zza2 = ((zzlo) obj).zza();
                zzx += zzki.zzx(zza2) + zza2;
            } else {
                zzx += zzki.zzv((zzmi) obj, zzmtVar);
            }
        }
        return zzx;
    }

    static int zzp(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzq(list) + (size * zzki.zzx(i8 << 3));
    }

    static int zzq(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i8 = 0;
            while (i9 < size) {
                int zze2 = zzlcVar.zze(i9);
                i8 += zzki.zzx((zze2 >> 31) ^ (zze2 + zze2));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i8 += zzki.zzx((intValue >> 31) ^ (intValue + intValue));
                i9++;
            }
        }
        return i8;
    }

    static int zzr(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzs(list) + (size * zzki.zzx(i8 << 3));
    }

    static int zzs(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i8 = 0;
            while (i9 < size) {
                long zza2 = zzlxVar.zza(i9);
                i8 += zzki.zzy((zza2 >> 63) ^ (zza2 + zza2));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                long longValue = ((Long) list.get(i9)).longValue();
                i8 += zzki.zzy((longValue >> 63) ^ (longValue + longValue));
                i9++;
            }
        }
        return i8;
    }

    static int zzt(int i8, List list) {
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        int i10 = zzki.zzb;
        boolean z7 = list instanceof zzlq;
        int zzx = zzki.zzx(i8 << 3) * size;
        if (z7) {
            zzlq zzlqVar = (zzlq) list;
            while (i9 < size) {
                Object zzf = zzlqVar.zzf(i9);
                if (zzf instanceof zzka) {
                    int zzd2 = ((zzka) zzf).zzd();
                    zzx += zzki.zzx(zzd2) + zzd2;
                } else {
                    zzx += zzki.zzw((String) zzf);
                }
                i9++;
            }
        } else {
            while (i9 < size) {
                Object obj = list.get(i9);
                if (obj instanceof zzka) {
                    int zzd3 = ((zzka) obj).zzd();
                    zzx += zzki.zzx(zzd3) + zzd3;
                } else {
                    zzx += zzki.zzw((String) obj);
                }
                i9++;
            }
        }
        return zzx;
    }

    static int zzu(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzv(list) + (size * zzki.zzx(i8 << 3));
    }

    static int zzv(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlc) {
            zzlc zzlcVar = (zzlc) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzx(zzlcVar.zze(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzx(((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
        return i8;
    }

    static int zzw(int i8, List list, boolean z7) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzx(list) + (size * zzki.zzx(i8 << 3));
    }

    static int zzx(List list) {
        int i8;
        int size = list.size();
        int i9 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlx) {
            zzlx zzlxVar = (zzlx) list;
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzy(zzlxVar.zza(i9));
                i9++;
            }
        } else {
            i8 = 0;
            while (i9 < size) {
                i8 += zzki.zzy(((Long) list.get(i9)).longValue());
                i9++;
            }
        }
        return i8;
    }

    public static zznk zzy() {
        return zzc;
    }

    public static zznk zzz() {
        return zzd;
    }
}
