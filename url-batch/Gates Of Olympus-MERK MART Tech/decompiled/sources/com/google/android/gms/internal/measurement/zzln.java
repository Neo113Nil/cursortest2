package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.2 */
/* loaded from: classes3.dex */
final class zzln {
    private static final zzmf<?, ?> zza = new zzmh();

    static int zza(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzit.zzb(i, true);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zza(int i, List<zzia> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = size * zzit.zzi(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzi += zzit.zzb(list.get(i2));
        }
        return zzi;
    }

    static int zzb(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzit.zzi(i));
    }

    static int zzb(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzit.zzd(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzjn zzjnVar = (zzjn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzit.zzd(zzjnVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzc(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzit.zzf(i, 0);
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzit.zzc(i, 0L);
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i, List<zzkt> list, zzll zzllVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzit.zzb(i, list.get(i3), zzllVar);
        }
        return i2;
    }

    static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzit.zzi(i));
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzit.zzf(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzjn zzjnVar = (zzjn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzit.zzf(zzjnVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzf(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzit.zzi(i));
    }

    static int zzf(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzke)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzit.zzd(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzke zzkeVar = (zzke) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzit.zzd(zzkeVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zza(int i, Object obj, zzll zzllVar) {
        if (obj instanceof zzkb) {
            return zzit.zzb(i, (zzkb) obj);
        }
        return zzit.zzc(i, (zzkt) obj, zzllVar);
    }

    static int zzb(int i, List<?> list, zzll zzllVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzit.zzi(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzkb) {
                zza2 = zzit.zza((zzkb) obj);
            } else {
                zza2 = zzit.zza((zzkt) obj, zzllVar);
            }
            zzi += zza2;
        }
        return zzi;
    }

    static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzit.zzi(i));
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzit.zzh(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzjn zzjnVar = (zzjn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzit.zzh(zzjnVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzh(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzit.zzi(i));
    }

    static int zzh(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzke)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzit.zzf(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzke zzkeVar = (zzke) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzit.zzf(zzkeVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzb(int i, List<?> list) {
        int zzb;
        int zzb2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzit.zzi(i) * size;
        if (!(list instanceof zzka)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzia) {
                    zzb = zzit.zzb((zzia) obj);
                } else {
                    zzb = zzit.zzb((String) obj);
                }
                zzi += zzb;
                i2++;
            }
            return zzi;
        }
        zzka zzkaVar = (zzka) list;
        while (i2 < size) {
            Object zza2 = zzkaVar.zza(i2);
            if (zza2 instanceof zzia) {
                zzb2 = zzit.zzb((zzia) zza2);
            } else {
                zzb2 = zzit.zzb((String) zza2);
            }
            zzi += zzb2;
            i2++;
        }
        return zzi;
    }

    static int zzi(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzit.zzi(i));
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzjn)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzit.zzj(list.get(i).intValue());
                i++;
            }
            return i2;
        }
        zzjn zzjnVar = (zzjn) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzit.zzj(zzjnVar.zzb(i));
            i++;
        }
        return i3;
    }

    static int zzj(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzit.zzi(i));
    }

    static int zzj(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzke)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzit.zzg(list.get(i).longValue());
                i++;
            }
            return i2;
        }
        zzke zzkeVar = (zzke) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzit.zzg(zzkeVar.zzb(i));
            i++;
        }
        return i3;
    }

    public static zzmf<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i, List<Integer> list, zzjo zzjoVar, UB ub, zzmf<UT, UB> zzmfVar) {
        if (zzjoVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzjoVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = (UB) zza(obj, i, intValue, ub, zzmfVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (!zzjoVar.zza(intValue2)) {
                ub = (UB) zza(obj, i, intValue2, ub, zzmfVar);
                it.remove();
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(Object obj, int i, int i2, UB ub, zzmf<UT, UB> zzmfVar) {
        if (ub == null) {
            ub = zzmfVar.zzc(obj);
        }
        zzmfVar.zzb(ub, i, i2);
        return ub;
    }

    static <T, FT extends zzjf<FT>> void zza(zziz<FT> zzizVar, T t, T t2) {
        zzjd<FT> zza2 = zzizVar.zza(t2);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzizVar.zzb(t).zza(zza2);
    }

    static <T> void zza(zzkm zzkmVar, T t, T t2, long j) {
        zzmg.zza(t, j, zzkmVar.zza(zzmg.zze(t, j), zzmg.zze(t2, j)));
    }

    static <T, UT, UB> void zza(zzmf<UT, UB> zzmfVar, T t, T t2) {
        zzmfVar.zzc(t, zzmfVar.zza(zzmfVar.zzd(t), zzmfVar.zzd(t2)));
    }

    public static void zza(Class<?> cls) {
        zzjk.class.isAssignableFrom(cls);
    }

    public static void zza(int i, List<Boolean> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zza(i, list, z);
    }

    public static void zza(int i, List<zzia> list, zzna zznaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zza(i, list);
    }

    public static void zzb(int i, List<Double> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzb(i, list, z);
    }

    public static void zzc(int i, List<Integer> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzc(i, list, z);
    }

    public static void zzd(int i, List<Integer> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzd(i, list, z);
    }

    public static void zze(int i, List<Long> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zze(i, list, z);
    }

    public static void zzf(int i, List<Float> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzf(i, list, z);
    }

    public static void zza(int i, List<?> list, zzna zznaVar, zzll zzllVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zza(i, list, zzllVar);
    }

    public static void zzg(int i, List<Integer> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzg(i, list, z);
    }

    public static void zzh(int i, List<Long> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzh(i, list, z);
    }

    public static void zzb(int i, List<?> list, zzna zznaVar, zzll zzllVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzb(i, list, zzllVar);
    }

    public static void zzi(int i, List<Integer> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzi(i, list, z);
    }

    public static void zzj(int i, List<Long> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzj(i, list, z);
    }

    public static void zzk(int i, List<Integer> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzk(i, list, z);
    }

    public static void zzl(int i, List<Long> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzl(i, list, z);
    }

    public static void zzb(int i, List<String> list, zzna zznaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzb(i, list);
    }

    public static void zzm(int i, List<Integer> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzm(i, list, z);
    }

    public static void zzn(int i, List<Long> list, zzna zznaVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzn(i, list, z);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
