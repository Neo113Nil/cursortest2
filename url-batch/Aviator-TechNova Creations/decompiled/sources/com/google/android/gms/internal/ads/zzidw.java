package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzidw {
    public static final /* synthetic */ int zza = 0;
    private static final zzief zzb;

    static {
        int i = zziaa.zza;
        zzb = new zzieh();
    }

    static int zzA(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zziaw.zzA(i << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zziaw.zzA(i << 3) + 8);
    }

    static int zzD(int i, Object obj, zzidu zziduVar) {
        int zzA;
        int zzaT;
        int zzA2;
        int i2 = i << 3;
        if (obj instanceof zzicm) {
            zzA = zziaw.zzA(i2);
            zzaT = ((zzicm) obj).zzb();
            zzA2 = zziaw.zzA(zzaT);
        } else {
            zzA = zziaw.zzA(i2);
            zzaT = ((zzhzw) obj).zzaT(zziduVar);
            zzA2 = zziaw.zzA(zzaT);
        }
        return zzA + zzA2 + zzaT;
    }

    @Deprecated
    static int zzE(int i, zzidc zzidcVar, zzidu zziduVar) {
        int zzA = zziaw.zzA(i << 3);
        return zzA + zzA + ((zzhzw) zzidcVar).zzaT(zziduVar);
    }

    public static zzief zzF() {
        return zzb;
    }

    static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzH(zzibc zzibcVar, Object obj, Object obj2) {
        if (((zzibn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzI(zzief zziefVar, Object obj, Object obj2) {
        zzibr zzibrVar = (zzibr) obj;
        zzieg zziegVar = zzibrVar.zzt;
        zzieg zziegVar2 = ((zzibr) obj2).zzt;
        if (!zzieg.zza().equals(zziegVar2)) {
            if (zzieg.zza().equals(zziegVar)) {
                zziegVar = zzieg.zzc(zziegVar, zziegVar2);
            } else {
                zziegVar.zzm(zziegVar2);
            }
        }
        zzibrVar.zzt = zziegVar;
    }

    static Object zzJ(Object obj, int i, List list, zzibx zzibxVar, Object obj2, zzief zziefVar) {
        if (zzibxVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzibxVar.zza(intValue)) {
                    obj2 = zzK(obj, i, intValue, obj2, zziefVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue2 = ((Integer) list.get(i3)).intValue();
            if (zzibxVar.zza(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue2));
                }
                i2++;
            } else {
                obj2 = zzK(obj, i, intValue2, obj2, zziefVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object zzK(Object obj, int i, int i2, Object obj2, zzief zziefVar) {
        if (obj2 == null) {
            obj2 = zziefVar.zzh(obj);
        }
        zziefVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzieu zzieuVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzE(i, list, z);
    }

    public static void zzo(int i, List list, zzieu zzieuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzF(i, list);
    }

    public static void zzp(int i, List list, zzieu zzieuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzieuVar.zzG(i, list);
    }

    public static void zzq(int i, List list, zzieu zzieuVar, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zziax) zzieuVar).zzr(i, list.get(i2), zziduVar);
        }
    }

    public static void zzr(int i, List list, zzieu zzieuVar, zzidu zziduVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zziax) zzieuVar).zzs(i, list.get(i2), zziduVar);
        }
    }

    static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zziaw.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzicq zzicqVar = (zzicq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zziaw.zzB(zzicqVar.zzc(i));
            i++;
        }
        return i3;
    }

    static int zzt(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int i2 = 0;
            while (i < size) {
                i2 += zziaw.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzicq zzicqVar = (zzicq) list;
        int i3 = 0;
        while (i < size) {
            i3 += zziaw.zzB(zzicqVar.zzc(i));
            i++;
        }
        return i3;
    }

    static int zzu(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzicq)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zziaw.zzB((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzicq zzicqVar = (zzicq) list;
        int i3 = 0;
        while (i < size) {
            long zzc = zzicqVar.zzc(i);
            i3 += zziaw.zzB((zzc >> 63) ^ (zzc + zzc));
            i++;
        }
        return i3;
    }

    static int zzv(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int i2 = 0;
            while (i < size) {
                i2 += zziaw.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzibs zzibsVar = (zzibs) list;
        int i3 = 0;
        while (i < size) {
            i3 += zziaw.zzB(zzibsVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzw(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int i2 = 0;
            while (i < size) {
                i2 += zziaw.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzibs zzibsVar = (zzibs) list;
        int i3 = 0;
        while (i < size) {
            i3 += zziaw.zzB(zzibsVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzx(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int i2 = 0;
            while (i < size) {
                i2 += zziaw.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzibs zzibsVar = (zzibs) list;
        int i3 = 0;
        while (i < size) {
            i3 += zziaw.zzA(zzibsVar.zzf(i));
            i++;
        }
        return i3;
    }

    static int zzy(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzibs)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zziaw.zzA((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzibs zzibsVar = (zzibs) list;
        int i3 = 0;
        while (i < size) {
            int zzf = zzibsVar.zzf(i);
            i3 += zziaw.zzA((zzf >> 31) ^ (zzf + zzf));
            i++;
        }
        return i3;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
