package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class zzame {
    private static final zzamv<?, ?> zza = new zzamx();

    static int zza(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzajo.zza(i4, true);
    }

    static int zzb(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzajo.zzg(i4));
    }

    static int zzc(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzajo.zzb(i4, 0);
    }

    static int zzd(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzajo.zza(i4, 0L);
    }

    static int zze(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzajo.zzg(i4));
    }

    static int zzf(int i4, List<Long> list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzajo.zzg(i4));
    }

    static int zzg(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzajo.zzg(i4));
    }

    static int zzh(int i4, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzajo.zzg(i4));
    }

    static int zzi(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzajo.zzg(i4));
    }

    static int zzj(int i4, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzajo.zzg(i4));
    }

    public static void zzk(int i4, List<Integer> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzk(i4, list, z4);
    }

    public static void zzl(int i4, List<Long> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzl(i4, list, z4);
    }

    public static void zzm(int i4, List<Integer> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzm(i4, list, z4);
    }

    public static void zzn(int i4, List<Long> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzn(i4, list, z4);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    static int zza(int i4, List<zzaiw> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = size * zzajo.zzg(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzg += zzajo.zza(list.get(i5));
        }
        return zzg;
    }

    static int zzb(List<Integer> list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakj)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzajo.zza(list.get(i4).intValue());
                i4++;
            }
            return i5;
        }
        zzakj zzakjVar = (zzakj) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzajo.zza(zzakjVar.zzb(i4));
            i4++;
        }
        return i6;
    }

    public static void zzc(int i4, List<Integer> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzc(i4, list, z4);
    }

    public static void zzd(int i4, List<Integer> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzd(i4, list, z4);
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakj)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzajo.zzc(list.get(i4).intValue());
                i4++;
            }
            return i5;
        }
        zzakj zzakjVar = (zzakj) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzajo.zzc(zzakjVar.zzb(i4));
            i4++;
        }
        return i6;
    }

    static int zzf(List<Long> list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaky)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzajo.zzb(list.get(i4).longValue());
                i4++;
            }
            return i5;
        }
        zzaky zzakyVar = (zzaky) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzajo.zzb(zzakyVar.zzb(i4));
            i4++;
        }
        return i6;
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakj)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzajo.zzf(list.get(i4).intValue());
                i4++;
            }
            return i5;
        }
        zzakj zzakjVar = (zzakj) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzajo.zzf(zzakjVar.zzb(i4));
            i4++;
        }
        return i6;
    }

    static int zzh(List<Long> list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaky)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzajo.zzd(list.get(i4).longValue());
                i4++;
            }
            return i5;
        }
        zzaky zzakyVar = (zzaky) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzajo.zzd(zzakyVar.zzb(i4));
            i4++;
        }
        return i6;
    }

    static int zzi(List<Integer> list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzakj)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzajo.zzh(list.get(i4).intValue());
                i4++;
            }
            return i5;
        }
        zzakj zzakjVar = (zzakj) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzajo.zzh(zzakjVar.zzb(i4));
            i4++;
        }
        return i6;
    }

    static int zzj(List<Long> list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzaky)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzajo.zze(list.get(i4).longValue());
                i4++;
            }
            return i5;
        }
        zzaky zzakyVar = (zzaky) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzajo.zze(zzakyVar.zzb(i4));
            i4++;
        }
        return i6;
    }

    static int zza(int i4, List<zzaln> list, zzamc<?> zzamcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += zzajo.zza(i4, list.get(i6), zzamcVar);
        }
        return i5;
    }

    static int zzb(int i4, List<?> list, zzamc<?> zzamcVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzg = zzajo.zzg(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof zzakv) {
                zza2 = zzajo.zza((zzakv) obj);
            } else {
                zza2 = zzajo.zza((zzaln) obj, zzamcVar);
            }
            zzg += zza2;
        }
        return zzg;
    }

    public static void zze(int i4, List<Long> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zze(i4, list, z4);
    }

    public static void zzf(int i4, List<Float> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzf(i4, list, z4);
    }

    public static void zzg(int i4, List<Integer> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzg(i4, list, z4);
    }

    public static void zzh(int i4, List<Long> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzh(i4, list, z4);
    }

    public static void zzi(int i4, List<Integer> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzi(i4, list, z4);
    }

    public static void zzj(int i4, List<Long> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzj(i4, list, z4);
    }

    static int zza(int i4, Object obj, zzamc<?> zzamcVar) {
        if (obj instanceof zzakv) {
            return zzajo.zzb(i4, (zzakv) obj);
        }
        return zzajo.zzb(i4, (zzaln) obj, zzamcVar);
    }

    public static zzamv<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i4, List<Integer> list, zzakk zzakkVar, UB ub, zzamv<UT, UB> zzamvVar) {
        if (zzakkVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = list.get(i6);
                int intValue = num.intValue();
                if (zzakkVar.zza(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    ub = (UB) zza(obj, i4, intValue, ub, zzamvVar);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = it.next().intValue();
            if (!zzakkVar.zza(intValue2)) {
                ub = (UB) zza(obj, i4, intValue2, ub, zzamvVar);
                it.remove();
            }
        }
        return ub;
    }

    static int zzb(int i4, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int zzg = zzajo.zzg(i4) * size;
        if (!(list instanceof zzaku)) {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof zzaiw) {
                    zza2 = zzajo.zza((zzaiw) obj);
                } else {
                    zza2 = zzajo.zza((String) obj);
                }
                zzg += zza2;
                i5++;
            }
            return zzg;
        }
        zzaku zzakuVar = (zzaku) list;
        while (i5 < size) {
            Object zza4 = zzakuVar.zza(i5);
            if (zza4 instanceof zzaiw) {
                zza3 = zzajo.zza((zzaiw) zza4);
            } else {
                zza3 = zzajo.zza((String) zza4);
            }
            zzg += zza3;
            i5++;
        }
        return zzg;
    }

    static <UT, UB> UB zza(Object obj, int i4, int i5, UB ub, zzamv<UT, UB> zzamvVar) {
        if (ub == null) {
            ub = zzamvVar.zzc(obj);
        }
        zzamvVar.zzb(ub, i4, i5);
        return ub;
    }

    public static void zzb(int i4, List<Double> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i4, list, z4);
    }

    static <T, FT extends zzaka<FT>> void zza(zzajx<FT> zzajxVar, T t4, T t5) {
        zzajy<FT> zza2 = zzajxVar.zza(t5);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzajxVar.zzb(t4).zza(zza2);
    }

    public static void zzb(int i4, List<?> list, zzanm zzanmVar, zzamc<?> zzamcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i4, list, (zzamc) zzamcVar);
    }

    public static void zzb(int i4, List<String> list, zzanm zzanmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zzb(i4, list);
    }

    static <T> void zza(zzalg zzalgVar, T t4, T t5, long j4) {
        zzana.zza(t4, j4, zzalgVar.zza(zzana.zze(t4, j4), zzana.zze(t5, j4)));
    }

    static <T, UT, UB> void zza(zzamv<UT, UB> zzamvVar, T t4, T t5) {
        zzamvVar.zzc(t4, zzamvVar.zza(zzamvVar.zzd(t4), zzamvVar.zzd(t5)));
    }

    public static void zza(Class<?> cls) {
        zzakg.class.isAssignableFrom(cls);
    }

    public static void zza(int i4, List<Boolean> list, zzanm zzanmVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i4, list, z4);
    }

    public static void zza(int i4, List<zzaiw> list, zzanm zzanmVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i4, list);
    }

    public static void zza(int i4, List<?> list, zzanm zzanmVar, zzamc<?> zzamcVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanmVar.zza(i4, list, (zzamc) zzamcVar);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
