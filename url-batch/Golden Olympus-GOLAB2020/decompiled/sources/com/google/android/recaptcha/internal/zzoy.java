package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final zzpl zzb;

    static {
        int i4 = zzos.zza;
        zzb = new zzpn();
    }

    public static void zzA(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzA(i4, list, z4);
    }

    public static void zzB(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzC(i4, list, z4);
    }

    public static void zzC(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzE(i4, list, z4);
    }

    public static void zzD(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzJ(i4, list, z4);
    }

    public static void zzE(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzL(i4, list, z4);
    }

    static boolean zzF(Object obj, Object obj2) {
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
        if (!(list instanceof zzne)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzln.zzB(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzne zzneVar = (zzne) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzln.zzB(zzneVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzb(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzln.zzA(i4 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzln.zzA(i4 << 3) + 8);
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
        if (!(list instanceof zzne)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzln.zzB(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzne zzneVar = (zzne) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzln.zzB(zzneVar.zze(i4));
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
        if (!(list instanceof zznx)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzln.zzB(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        zznx zznxVar = (zznx) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzln.zzB(zznxVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzh(int i4, Object obj, zzow zzowVar) {
        int i5 = i4 << 3;
        if (!(obj instanceof zznt)) {
            return zzln.zzA(i5) + zzln.zzy((zzoi) obj, zzowVar);
        }
        int zzA = zzln.zzA(i5);
        int zza2 = ((zznt) obj).zza();
        return zzA + zzln.zzA(zza2) + zza2;
    }

    static int zzi(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzne)) {
            int i5 = 0;
            while (i4 < size) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i5 += zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                i4++;
            }
            return i5;
        }
        zzne zzneVar = (zzne) list;
        int i6 = 0;
        while (i4 < size) {
            int zze = zzneVar.zze(i4);
            i6 += zzln.zzA((zze >> 31) ^ (zze + zze));
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
        if (!(list instanceof zznx)) {
            int i5 = 0;
            while (i4 < size) {
                long longValue = ((Long) list.get(i4)).longValue();
                i5 += zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return i5;
        }
        zznx zznxVar = (zznx) list;
        int i6 = 0;
        while (i4 < size) {
            long zze = zznxVar.zze(i4);
            i6 += zzln.zzB((zze >> 63) ^ (zze + zze));
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
        if (!(list instanceof zzne)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzln.zzA(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzne zzneVar = (zzne) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzln.zzA(zzneVar.zze(i4));
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
        if (!(list instanceof zznx)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzln.zzB(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        zznx zznxVar = (zznx) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzln.zzB(zznxVar.zze(i4));
            i4++;
        }
        return i6;
    }

    public static zzpl zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i4, List list, zznh zznhVar, Object obj2, zzpl zzplVar) {
        if (zznhVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zznhVar.zza(intValue)) {
                    obj2 = zzo(obj, i4, intValue, obj2, zzplVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Integer num = (Integer) list.get(i6);
            int intValue2 = num.intValue();
            if (zznhVar.zza(intValue2)) {
                if (i6 != i5) {
                    list.set(i5, num);
                }
                i5++;
            } else {
                obj2 = zzo(obj, i4, intValue2, obj2, zzplVar);
            }
        }
        if (i5 != size) {
            list.subList(i5, size).clear();
        }
        return obj2;
    }

    static Object zzo(Object obj, int i4, int i5, Object obj2, zzpl zzplVar) {
        if (obj2 == null) {
            obj2 = zzplVar.zza(obj);
        }
        zzplVar.zzh(obj2, i4, i5);
        return obj2;
    }

    static void zzp(zzmp zzmpVar, Object obj, Object obj2) {
        zzmt zzmtVar = ((zzna) obj2).zzb;
        if (zzmtVar.zza.isEmpty()) {
            return;
        }
        ((zzna) obj).zzi().zzh(zzmtVar);
    }

    static void zzq(zzpl zzplVar, Object obj, Object obj2) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        zzpm zzpmVar2 = ((zznd) obj2).zzc;
        if (!zzpm.zzc().equals(zzpmVar2)) {
            if (zzpm.zzc().equals(zzpmVar)) {
                zzpmVar = zzpm.zze(zzpmVar, zzpmVar2);
            } else {
                zzpmVar.zzd(zzpmVar2);
            }
        }
        zzndVar.zzc = zzpmVar;
    }

    public static void zzr(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzc(i4, list, z4);
    }

    public static void zzs(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzg(i4, list, z4);
    }

    public static void zzt(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzj(i4, list, z4);
    }

    public static void zzu(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzl(i4, list, z4);
    }

    public static void zzv(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzn(i4, list, z4);
    }

    public static void zzw(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzp(i4, list, z4);
    }

    public static void zzx(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzs(i4, list, z4);
    }

    public static void zzy(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzu(i4, list, z4);
    }

    public static void zzz(int i4, List list, zzpy zzpyVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzpyVar.zzy(i4, list, z4);
    }
}
