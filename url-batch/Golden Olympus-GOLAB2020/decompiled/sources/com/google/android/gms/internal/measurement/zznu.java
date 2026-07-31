package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
final class zznu {
    public static final /* synthetic */ int zza = 0;
    private static final zzoe zzb;

    static {
        int i4 = zznp.zza;
        zzb = new zzog();
    }

    public static void zzA(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzC(i4, list, z4);
    }

    public static void zzB(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzE(i4, list, z4);
    }

    public static void zzC(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzJ(i4, list, z4);
    }

    public static void zzD(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzL(i4, list, z4);
    }

    static boolean zzE(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzme)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzlk.zzA(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzme zzmeVar = (zzme) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzlk.zzA(zzmeVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzb(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlk.zzz(i4 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzlk.zzz(i4 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzme)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzlk.zzA(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzme zzmeVar = (zzme) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzlk.zzA(zzmeVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzg(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmw)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzlk.zzA(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        zzmw zzmwVar = (zzmw) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzlk.zzA(zzmwVar.zza(i4));
            i4++;
        }
        return i6;
    }

    static int zzh(int i4, Object obj, zzns zznsVar) {
        int i5 = i4 << 3;
        if (!(obj instanceof zzms)) {
            return zzlk.zzz(i5) + zzlk.zzx((zznh) obj, zznsVar);
        }
        int zzz = zzlk.zzz(i5);
        int zza2 = ((zzms) obj).zza();
        return zzz + zzlk.zzz(zza2) + zza2;
    }

    static int zzi(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzme)) {
            int i5 = 0;
            while (i4 < size) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i5 += zzlk.zzz((intValue >> 31) ^ (intValue + intValue));
                i4++;
            }
            return i5;
        }
        zzme zzmeVar = (zzme) list;
        int i6 = 0;
        while (i4 < size) {
            int zze = zzmeVar.zze(i4);
            i6 += zzlk.zzz((zze >> 31) ^ (zze + zze));
            i4++;
        }
        return i6;
    }

    static int zzj(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmw)) {
            int i5 = 0;
            while (i4 < size) {
                long longValue = ((Long) list.get(i4)).longValue();
                i5 += zzlk.zzA((longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return i5;
        }
        zzmw zzmwVar = (zzmw) list;
        int i6 = 0;
        while (i4 < size) {
            long zza2 = zzmwVar.zza(i4);
            i6 += zzlk.zzA((zza2 >> 63) ^ (zza2 + zza2));
            i4++;
        }
        return i6;
    }

    static int zzk(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzme)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzlk.zzz(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzme zzmeVar = (zzme) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzlk.zzz(zzmeVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzl(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzmw)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzlk.zzA(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        zzmw zzmwVar = (zzmw) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzlk.zzA(zzmwVar.zza(i4));
            i4++;
        }
        return i6;
    }

    public static zzoe zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i4, int i5, Object obj2, zzoe zzoeVar) {
        Object obj3 = obj2;
        if (obj2 == null) {
            zzmd zzmdVar = (zzmd) obj;
            zzof zzofVar = zzmdVar.zzc;
            obj3 = zzofVar;
            if (zzofVar == zzof.zzc()) {
                zzof zzf = zzof.zzf();
                zzmdVar.zzc = zzf;
                obj3 = zzf;
            }
        }
        ((zzof) obj3).zzj(i4 << 3, Long.valueOf(i5));
        return obj3;
    }

    static void zzo(zzlq zzlqVar, Object obj, Object obj2) {
        if (((zzma) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzp(zzoe zzoeVar, Object obj, Object obj2) {
        zzmd zzmdVar = (zzmd) obj;
        zzof zzofVar = zzmdVar.zzc;
        zzof zzofVar2 = ((zzmd) obj2).zzc;
        if (!zzof.zzc().equals(zzofVar2)) {
            if (zzof.zzc().equals(zzofVar)) {
                zzofVar = zzof.zze(zzofVar, zzofVar2);
            } else {
                zzofVar.zzd(zzofVar2);
            }
        }
        zzmdVar.zzc = zzofVar;
    }

    public static void zzq(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzc(i4, list, z4);
    }

    public static void zzr(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzg(i4, list, z4);
    }

    public static void zzs(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzj(i4, list, z4);
    }

    public static void zzt(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzl(i4, list, z4);
    }

    public static void zzu(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzn(i4, list, z4);
    }

    public static void zzv(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzp(i4, list, z4);
    }

    public static void zzw(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzs(i4, list, z4);
    }

    public static void zzx(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzu(i4, list, z4);
    }

    public static void zzy(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzy(i4, list, z4);
    }

    public static void zzz(int i4, List list, zzor zzorVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzorVar.zzA(i4, list, z4);
    }
}
