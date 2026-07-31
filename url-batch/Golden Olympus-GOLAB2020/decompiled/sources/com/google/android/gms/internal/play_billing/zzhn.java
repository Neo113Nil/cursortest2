package com.google.android.gms.internal.play_billing;

import java.util.List;

/* loaded from: classes.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzib zzb;

    static {
        int i4 = zzei.zza;
        zzb = new zzid();
    }

    public static void zzA(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzB(i4, list, z4);
    }

    public static void zzB(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzD(i4, list, z4);
    }

    public static void zzC(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzF(i4, list, z4);
    }

    public static void zzD(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzK(i4, list, z4);
    }

    public static void zzE(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzM(i4, list, z4);
    }

    static boolean zzF(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    static int zza(int i4, zzhb zzhbVar, zzhl zzhlVar) {
        int zzy = zzfc.zzy(i4 << 3);
        return zzy + zzy + ((zzeg) zzhbVar).zzi(zzhlVar);
    }

    static int zzb(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfv)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzfc.zzz(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzfv zzfvVar = (zzfv) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzfc.zzz(zzfvVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzc(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfc.zzy(i4 << 3) + 4);
    }

    static int zzd(List list) {
        return list.size() * 4;
    }

    static int zze(int i4, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzfc.zzy(i4 << 3) + 8);
    }

    static int zzf(List list) {
        return list.size() * 8;
    }

    static int zzg(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfv)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzfc.zzz(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzfv zzfvVar = (zzfv) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzfc.zzz(zzfvVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzh(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgp)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzfc.zzz(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        zzgp zzgpVar = (zzgp) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzfc.zzz(zzgpVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzi(int i4, Object obj, zzhl zzhlVar) {
        int zzy;
        int zzi;
        int zzy2;
        int i5 = i4 << 3;
        if (obj instanceof zzgi) {
            zzy = zzfc.zzy(i5);
            zzi = ((zzgi) obj).zza();
            zzy2 = zzfc.zzy(zzi);
        } else {
            zzy = zzfc.zzy(i5);
            zzi = ((zzeg) obj).zzi(zzhlVar);
            zzy2 = zzfc.zzy(zzi);
        }
        return zzy + zzy2 + zzi;
    }

    static int zzj(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzfv)) {
            int i5 = 0;
            while (i4 < size) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i5 += zzfc.zzy((intValue >> 31) ^ (intValue + intValue));
                i4++;
            }
            return i5;
        }
        zzfv zzfvVar = (zzfv) list;
        int i6 = 0;
        while (i4 < size) {
            int zze = zzfvVar.zze(i4);
            i6 += zzfc.zzy((zze >> 31) ^ (zze + zze));
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
        if (!(list instanceof zzgp)) {
            int i5 = 0;
            while (i4 < size) {
                long longValue = ((Long) list.get(i4)).longValue();
                i5 += zzfc.zzz((longValue >> 63) ^ (longValue + longValue));
                i4++;
            }
            return i5;
        }
        zzgp zzgpVar = (zzgp) list;
        int i6 = 0;
        while (i4 < size) {
            long zze = zzgpVar.zze(i4);
            i6 += zzfc.zzz((zze >> 63) ^ (zze + zze));
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
        if (!(list instanceof zzfv)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzfc.zzy(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return i5;
        }
        zzfv zzfvVar = (zzfv) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzfc.zzy(zzfvVar.zze(i4));
            i4++;
        }
        return i6;
    }

    static int zzm(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof zzgp)) {
            int i5 = 0;
            while (i4 < size) {
                i5 += zzfc.zzz(((Long) list.get(i4)).longValue());
                i4++;
            }
            return i5;
        }
        zzgp zzgpVar = (zzgp) list;
        int i6 = 0;
        while (i4 < size) {
            i6 += zzfc.zzz(zzgpVar.zze(i4));
            i4++;
        }
        return i6;
    }

    public static zzib zzn() {
        return zzb;
    }

    static Object zzo(Object obj, int i4, int i5, Object obj2, zzib zzibVar) {
        if (obj2 == null) {
            obj2 = zzibVar.zza(obj);
        }
        ((zzic) obj2).zzj(i4 << 3, Long.valueOf(i5));
        return obj2;
    }

    static void zzp(zzfi zzfiVar, Object obj, Object obj2) {
        if (((zzfr) obj2).zzb.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    static void zzq(zzib zzibVar, Object obj, Object obj2) {
        zzfu zzfuVar = (zzfu) obj;
        zzic zzicVar = zzfuVar.zzc;
        zzic zzicVar2 = ((zzfu) obj2).zzc;
        if (!zzic.zzc().equals(zzicVar2)) {
            if (zzic.zzc().equals(zzicVar)) {
                zzicVar = zzic.zze(zzicVar, zzicVar2);
            } else {
                zzicVar.zzd(zzicVar2);
            }
        }
        zzfuVar.zzc = zzicVar;
    }

    public static void zzr(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzc(i4, list, z4);
    }

    public static void zzs(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzg(i4, list, z4);
    }

    public static void zzt(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzj(i4, list, z4);
    }

    public static void zzu(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzl(i4, list, z4);
    }

    public static void zzv(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzn(i4, list, z4);
    }

    public static void zzw(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzp(i4, list, z4);
    }

    public static void zzx(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzs(i4, list, z4);
    }

    public static void zzy(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzu(i4, list, z4);
    }

    public static void zzz(int i4, List list, zzit zzitVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzitVar.zzz(i4, list, z4);
    }
}
