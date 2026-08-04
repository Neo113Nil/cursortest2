package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzhkm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhkv zzb;

    static {
        int i = zzhgo.zza;
        zzb = new zzhkx();
    }

    static int zzA(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhhm.zzA(i << 3) + 4);
    }

    static int zzB(List list) {
        return list.size() * 8;
    }

    static int zzC(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzhhm.zzA(i << 3) + 8);
    }

    static int zzD(int i, Object obj, zzhkk zzhkkVar) {
        int zzA;
        int zzaT;
        int zzA2;
        int i2 = i << 3;
        if (obj instanceof zzhjc) {
            zzA = zzhhm.zzA(i2);
            zzaT = ((zzhjc) obj).zzb();
            zzA2 = zzhhm.zzA(zzaT);
        } else {
            zzA = zzhhm.zzA(i2);
            zzaT = ((zzhgk) obj).zzaT(zzhkkVar);
            zzA2 = zzhhm.zzA(zzaT);
        }
        return zzA + zzA2 + zzaT;
    }

    @Deprecated
    static int zzE(int i, zzhjs zzhjsVar, zzhkk zzhkkVar) {
        int zzA = zzhhm.zzA(i << 3);
        return zzA + zzA + ((zzhgk) zzhjsVar).zzaT(zzhkkVar);
    }

    public static zzhkv zzF() {
        return zzb;
    }

    static boolean zzG(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static void zzH(zzhhs zzhhsVar, Object obj, Object obj2) {
        if (((zzhid) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzI(zzhkv zzhkvVar, Object obj, Object obj2) {
        zzhih zzhihVar = (zzhih) obj;
        zzhkw zzhkwVar = zzhihVar.zzt;
        zzhkw zzhkwVar2 = ((zzhih) obj2).zzt;
        if (!zzhkw.zza().equals(zzhkwVar2)) {
            if (zzhkw.zza().equals(zzhkwVar)) {
                zzhkwVar = zzhkw.zzc(zzhkwVar, zzhkwVar2);
            } else {
                zzhkwVar.zzm(zzhkwVar2);
            }
        }
        zzhihVar.zzt = zzhkwVar;
    }

    static Object zzJ(Object obj, int i, List list, zzhin zzhinVar, Object obj2, zzhkv zzhkvVar) {
        if (zzhinVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!zzhinVar.zza(intValue)) {
                    obj2 = zzK(obj, i, intValue, obj2, zzhkvVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue2 = ((Integer) list.get(i3)).intValue();
            if (zzhinVar.zza(intValue2)) {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue2));
                }
                i2++;
            } else {
                obj2 = zzK(obj, i, intValue2, obj2, zzhkvVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object zzK(Object obj, int i, int i2, Object obj2, zzhkv zzhkvVar) {
        if (obj2 == null) {
            obj2 = zzhkvVar.zzh(obj);
        }
        zzhkvVar.zza(obj2, i, i2);
        return obj2;
    }

    public static void zza(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzC(i, list, z);
    }

    public static void zzb(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzB(i, list, z);
    }

    public static void zzc(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzy(i, list, z);
    }

    public static void zzd(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzz(i, list, z);
    }

    public static void zze(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzL(i, list, z);
    }

    public static void zzf(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzA(i, list, z);
    }

    public static void zzg(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzJ(i, list, z);
    }

    public static void zzh(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzw(i, list, z);
    }

    public static void zzi(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzH(i, list, z);
    }

    public static void zzj(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzK(i, list, z);
    }

    public static void zzk(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzx(i, list, z);
    }

    public static void zzl(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzI(i, list, z);
    }

    public static void zzm(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzD(i, list, z);
    }

    public static void zzn(int i, List list, zzhlk zzhlkVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzE(i, list, z);
    }

    public static void zzo(int i, List list, zzhlk zzhlkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzF(i, list);
    }

    public static void zzp(int i, List list, zzhlk zzhlkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhlkVar.zzG(i, list);
    }

    public static void zzq(int i, List list, zzhlk zzhlkVar, zzhkk zzhkkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzhhn) zzhlkVar).zzr(i, list.get(i2), zzhkkVar);
        }
    }

    public static void zzr(int i, List list, zzhlk zzhlkVar, zzhkk zzhkkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzhhn) zzhlkVar).zzs(i, list.get(i2), zzhkkVar);
        }
    }

    static int zzs(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzhjg)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzhhm.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzhhm.zzB(zzhjgVar.zzc(i));
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
        if (!(list instanceof zzhjg)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzhhm.zzB(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzhhm.zzB(zzhjgVar.zzc(i));
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
        if (!(list instanceof zzhjg)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += zzhhm.zzB((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        zzhjg zzhjgVar = (zzhjg) list;
        int i3 = 0;
        while (i < size) {
            long zzc = zzhjgVar.zzc(i);
            i3 += zzhhm.zzB((zzc >> 63) ^ (zzc + zzc));
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
        if (!(list instanceof zzhii)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzhhm.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzhii zzhiiVar = (zzhii) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzhhm.zzB(zzhiiVar.zzf(i));
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
        if (!(list instanceof zzhii)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzhhm.zzB(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzhii zzhiiVar = (zzhii) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzhhm.zzB(zzhiiVar.zzf(i));
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
        if (!(list instanceof zzhii)) {
            int i2 = 0;
            while (i < size) {
                i2 += zzhhm.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        zzhii zzhiiVar = (zzhii) list;
        int i3 = 0;
        while (i < size) {
            i3 += zzhhm.zzA(zzhiiVar.zzf(i));
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
        if (!(list instanceof zzhii)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += zzhhm.zzA((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        zzhii zzhiiVar = (zzhii) list;
        int i3 = 0;
        while (i < size) {
            int zzf = zzhiiVar.zzf(i);
            i3 += zzhhm.zzA((zzf >> 31) ^ (zzf + zzf));
            i++;
        }
        return i3;
    }

    static int zzz(List list) {
        return list.size() * 4;
    }
}
