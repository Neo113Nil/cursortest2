package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
final class zzkk {
    private final zzln zzc;
    private final zzdt zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzkh zzh;
    private zzkh zzi;
    private zzkh zzj;
    private int zzk;
    private Object zzl;
    private long zzm;
    private zzig zzn;
    private final zzjp zzp;
    private final zzca zza = new zzca();
    private final zzcb zzb = new zzcb();
    private List zzo = new ArrayList();

    public zzkk(zzln zzlnVar, zzdt zzdtVar, zzjp zzjpVar, zzig zzigVar) {
        this.zzc = zzlnVar;
        this.zzd = zzdtVar;
        this.zzp = zzjpVar;
        this.zzn = zzigVar;
    }

    private final zzki zzA(zzcc zzccVar, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7 = j;
        zzccVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j7);
        if (zzc != -1) {
            this.zza.zzm(zzc);
        }
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzn(zzc);
        }
        zzui zzuiVar = new zzui(obj, j3, zzc);
        boolean zzG = zzG(zzuiVar);
        boolean zzE = zzE(zzccVar, zzuiVar);
        boolean zzD = zzD(zzccVar, zzuiVar, zzG);
        if (zzc != -1) {
            this.zza.zzn(zzc);
        }
        if (zzc != -1) {
            this.zza.zzi(zzc);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j5 = 0;
            j6 = 0;
        } else {
            j5 = j4;
            j6 = this.zza.zzd;
        }
        if (j6 != -9223372036854775807L && j7 >= j6) {
            j7 = Math.max(0L, j6 - 1);
        }
        return new zzki(zzuiVar, j7, j2, j5, j6, false, zzG, zzE, zzD);
    }

    private static zzui zzB(zzcc zzccVar, Object obj, long j, long j2, zzcb zzcbVar, zzca zzcaVar) {
        zzccVar.zzn(obj, zzcaVar);
        zzccVar.zze(zzcaVar.zzc, zzcbVar, 0L);
        zzccVar.zza(obj);
        zzcaVar.zzb();
        zzccVar.zzn(obj, zzcaVar);
        int zzd = zzcaVar.zzd(j);
        return zzd == -1 ? new zzui(obj, j2, zzcaVar.zzc(j)) : new zzui(obj, zzd, zzcaVar.zze(zzd), j2);
    }

    private final void zzC() {
        final zzfxo zzfxoVar = new zzfxo();
        for (zzkh zzkhVar = this.zzh; zzkhVar != null; zzkhVar = zzkhVar.zzg()) {
            zzfxoVar.zzf(zzkhVar.zzf.zza);
        }
        zzkh zzkhVar2 = this.zzi;
        final zzui zzuiVar = zzkhVar2 == null ? null : zzkhVar2.zzf.zza;
        this.zzd.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkj
            @Override // java.lang.Runnable
            public final void run() {
                zzkk.this.zzk(zzfxoVar, zzuiVar);
            }
        });
    }

    private final boolean zzD(zzcc zzccVar, zzui zzuiVar, boolean z) {
        int zza = zzccVar.zza(zzuiVar.zza);
        return !zzccVar.zze(zzccVar.zzd(zza, this.zza, false).zzc, this.zzb, 0L).zzi && zzccVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z;
    }

    private final boolean zzE(zzcc zzccVar, zzui zzuiVar) {
        if (zzG(zzuiVar)) {
            return zzccVar.zze(zzccVar.zzn(zzuiVar.zza, this.zza).zzc, this.zzb, 0L).zzo == zzccVar.zza(zzuiVar.zza);
        }
        return false;
    }

    private final boolean zzF(zzcc zzccVar) {
        zzkh zzkhVar = this.zzh;
        if (zzkhVar == null) {
            return true;
        }
        int zza = zzccVar.zza(zzkhVar.zzb);
        while (true) {
            zza = zzccVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkhVar.getClass();
                if (zzkhVar.zzg() == null || zzkhVar.zzf.zzg) {
                    break;
                }
                zzkhVar = zzkhVar.zzg();
            }
            zzkh zzg = zzkhVar.zzg();
            if (zza == -1 || zzg == null || zzccVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzkhVar = zzg;
        }
        boolean zzq = zzq(zzkhVar);
        zzkhVar.zzf = zzh(zzccVar, zzkhVar.zzf);
        return !zzq;
    }

    private static final boolean zzG(zzui zzuiVar) {
        return !zzuiVar.zzb() && zzuiVar.zze == -1;
    }

    static boolean zzo(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    private final long zzv(zzcc zzccVar, Object obj, int i) {
        zzccVar.zzn(obj, this.zza);
        this.zza.zzi(i);
        this.zza.zzk(i);
        return 0L;
    }

    private final long zzw(Object obj) {
        for (int i = 0; i < this.zzo.size(); i++) {
            zzkh zzkhVar = (zzkh) this.zzo.get(i);
            if (zzkhVar.zzb.equals(obj)) {
                return zzkhVar.zzf.zza.zzd;
            }
        }
        return -1L;
    }

    private final zzki zzx(zzcc zzccVar, zzkh zzkhVar, long j) {
        long j2;
        zzki zzkiVar = zzkhVar.zzf;
        long zze = (zzkhVar.zze() + zzkiVar.zze) - j;
        if (zzkiVar.zzg) {
            long j3 = 0;
            int zzi = zzccVar.zzi(zzccVar.zza(zzkiVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi != -1) {
                int i = zzccVar.zzd(zzi, this.zza, true).zzc;
                Object obj = this.zza.zzb;
                obj.getClass();
                long j4 = zzkiVar.zza.zzd;
                if (zzccVar.zze(i, this.zzb, 0L).zzn == zzi) {
                    Pair zzm = zzccVar.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm != null) {
                        obj = zzm.first;
                        long longValue = ((Long) zzm.second).longValue();
                        zzkh zzg = zzkhVar.zzg();
                        if (zzg == null || !zzg.zzb.equals(obj)) {
                            j4 = zzw(obj);
                            if (j4 == -1) {
                                j4 = this.zze;
                                this.zze = 1 + j4;
                            }
                        } else {
                            j4 = zzg.zzf.zza.zzd;
                        }
                        j2 = longValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                zzui zzB = zzB(zzccVar, obj, j2, j4, this.zzb, this.zza);
                if (j3 != -9223372036854775807L && zzkiVar.zzc != -9223372036854775807L) {
                    zzccVar.zzn(zzkiVar.zza.zza, this.zza).zzb();
                    this.zza.zzg();
                }
                return zzy(zzccVar, zzB, j3, j2);
            }
        } else {
            zzui zzuiVar = zzkiVar.zza;
            zzccVar.zzn(zzuiVar.zza, this.zza);
            if (!zzuiVar.zzb()) {
                int i2 = zzuiVar.zze;
                if (i2 != -1) {
                    this.zza.zzm(i2);
                }
                zzca zzcaVar = this.zza;
                int i3 = zzuiVar.zze;
                int zze2 = zzcaVar.zze(i3);
                zzcaVar.zzn(i3);
                if (zze2 != this.zza.zza(zzuiVar.zze)) {
                    return zzz(zzccVar, zzuiVar.zza, zzuiVar.zze, zze2, zzkiVar.zze, zzuiVar.zzd);
                }
                zzv(zzccVar, zzuiVar.zza, zzuiVar.zze);
                return zzA(zzccVar, zzuiVar.zza, 0L, zzkiVar.zze, zzuiVar.zzd);
            }
            int i4 = zzuiVar.zzb;
            if (this.zza.zza(i4) != -1) {
                int zzf = this.zza.zzf(i4, zzuiVar.zzc);
                if (zzf < 0) {
                    return zzz(zzccVar, zzuiVar.zza, i4, zzf, zzkiVar.zzc, zzuiVar.zzd);
                }
                long j5 = zzkiVar.zzc;
                if (j5 == -9223372036854775807L) {
                    zzcb zzcbVar = this.zzb;
                    zzca zzcaVar2 = this.zza;
                    Pair zzm2 = zzccVar.zzm(zzcbVar, zzcaVar2, zzcaVar2.zzc, -9223372036854775807L, Math.max(0L, zze));
                    if (zzm2 != null) {
                        j5 = ((Long) zzm2.second).longValue();
                    }
                }
                zzv(zzccVar, zzuiVar.zza, zzuiVar.zzb);
                return zzA(zzccVar, zzuiVar.zza, Math.max(0L, j5), zzkiVar.zzc, zzuiVar.zzd);
            }
        }
        return null;
    }

    private final zzki zzy(zzcc zzccVar, zzui zzuiVar, long j, long j2) {
        zzccVar.zzn(zzuiVar.zza, this.zza);
        return zzuiVar.zzb() ? zzz(zzccVar, zzuiVar.zza, zzuiVar.zzb, zzuiVar.zzc, j, zzuiVar.zzd) : zzA(zzccVar, zzuiVar.zza, j2, j, zzuiVar.zzd);
    }

    private final zzki zzz(zzcc zzccVar, Object obj, int i, int i2, long j, long j2) {
        zzui zzuiVar = new zzui(obj, i, i2, j2);
        Object obj2 = zzuiVar.zza;
        long zzh = zzccVar.zzn(obj2, this.zza).zzh(zzuiVar.zzb, zzuiVar.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzj();
        }
        this.zza.zzn(zzuiVar.zzb);
        long j3 = 0;
        if (zzh != -9223372036854775807L && zzh <= 0) {
            j3 = Math.max(0L, (-1) + zzh);
        }
        return new zzki(zzuiVar, j3, j, -9223372036854775807L, zzh, false, false, false, false);
    }

    public final zzkh zza() {
        zzkh zzkhVar = this.zzh;
        if (zzkhVar == null) {
            return null;
        }
        if (zzkhVar == this.zzi) {
            this.zzi = zzkhVar.zzg();
        }
        zzkhVar.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzkh zzkhVar2 = this.zzh;
            this.zzl = zzkhVar2.zzb;
            this.zzm = zzkhVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzC();
        return this.zzh;
    }

    public final zzkh zzb() {
        zzkh zzkhVar = this.zzi;
        zzdi.zzb(zzkhVar);
        this.zzi = zzkhVar.zzg();
        zzC();
        zzkh zzkhVar2 = this.zzi;
        zzdi.zzb(zzkhVar2);
        return zzkhVar2;
    }

    public final zzkh zzd() {
        return this.zzj;
    }

    public final zzkh zze() {
        return this.zzh;
    }

    public final zzkh zzf() {
        return this.zzi;
    }

    public final zzki zzg(long j, zzkx zzkxVar) {
        zzkh zzkhVar = this.zzj;
        return zzkhVar == null ? zzy(zzkxVar.zza, zzkxVar.zzb, zzkxVar.zzc, zzkxVar.zzr) : zzx(zzkxVar.zza, zzkhVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzki zzh(zzcc zzccVar, zzki zzkiVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        zzui zzuiVar = zzkiVar.zza;
        boolean zzG = zzG(zzuiVar);
        boolean zzE = zzE(zzccVar, zzuiVar);
        boolean zzD = zzD(zzccVar, zzuiVar, zzG);
        zzccVar.zzn(zzkiVar.zza.zza, this.zza);
        if (zzuiVar.zzb() || (i = zzuiVar.zze) == -1) {
            j = -9223372036854775807L;
        } else {
            this.zza.zzi(i);
            j = 0;
        }
        if (zzuiVar.zzb()) {
            j2 = this.zza.zzh(zzuiVar.zzb, zzuiVar.zzc);
        } else {
            if (j != -9223372036854775807L) {
                j3 = 0;
                j4 = 0;
                if (zzuiVar.zzb()) {
                    int i2 = zzuiVar.zze;
                    if (i2 != -1) {
                        this.zza.zzn(i2);
                    }
                } else {
                    this.zza.zzn(zzuiVar.zzb);
                }
                return new zzki(zzuiVar, zzkiVar.zzb, zzkiVar.zzc, j3, j4, false, zzG, zzE, zzD);
            }
            j2 = this.zza.zzd;
        }
        j3 = j;
        j4 = j2;
        if (zzuiVar.zzb()) {
        }
        return new zzki(zzuiVar, zzkiVar.zzb, zzkiVar.zzc, j3, j4, false, zzG, zzE, zzD);
    }

    public final zzui zzi(zzcc zzccVar, Object obj, long j) {
        long zzw;
        int zza;
        int i = zzccVar.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzccVar.zza(obj2)) == -1 || zzccVar.zzd(zza, this.zza, false).zzc != i) {
            zzkh zzkhVar = this.zzh;
            while (true) {
                if (zzkhVar == null) {
                    zzkh zzkhVar2 = this.zzh;
                    while (true) {
                        if (zzkhVar2 != null) {
                            int zza2 = zzccVar.zza(zzkhVar2.zzb);
                            if (zza2 != -1 && zzccVar.zzd(zza2, this.zza, false).zzc == i) {
                                zzw = zzkhVar2.zzf.zza.zzd;
                                break;
                            }
                            zzkhVar2 = zzkhVar2.zzg();
                        } else {
                            zzw = zzw(obj);
                            if (zzw == -1) {
                                zzw = this.zze;
                                this.zze = 1 + zzw;
                                if (this.zzh == null) {
                                    this.zzl = obj;
                                    this.zzm = zzw;
                                }
                            }
                        }
                    }
                } else {
                    if (zzkhVar.zzb.equals(obj)) {
                        zzw = zzkhVar.zzf.zza.zzd;
                        break;
                    }
                    zzkhVar = zzkhVar.zzg();
                }
            }
        } else {
            zzw = this.zzm;
        }
        long j2 = zzw;
        zzccVar.zzn(obj, this.zza);
        zzccVar.zze(this.zza.zzc, this.zzb, 0L);
        int zza3 = zzccVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcb zzcbVar = this.zzb;
            if (zza3 < zzcbVar.zzn) {
                return zzB(zzccVar, obj3, j, j2, zzcbVar, this.zza);
            }
            zzccVar.zzd(zza3, this.zza, true);
            this.zza.zzb();
            zzca zzcaVar = this.zza;
            if (zzcaVar.zzd(zzcaVar.zzd) != -1) {
                obj3 = this.zza.zzb;
                obj3.getClass();
            }
            zza3--;
        }
    }

    public final void zzj() {
        if (this.zzk == 0) {
            return;
        }
        zzkh zzkhVar = this.zzh;
        zzdi.zzb(zzkhVar);
        this.zzl = zzkhVar.zzb;
        this.zzm = zzkhVar.zzf.zza.zzd;
        while (zzkhVar != null) {
            zzkhVar.zzn();
            zzkhVar = zzkhVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzC();
    }

    final /* synthetic */ void zzk(zzfxo zzfxoVar, zzui zzuiVar) {
        this.zzc.zzS(zzfxoVar.zzi(), zzuiVar);
    }

    public final void zzl(long j) {
        zzkh zzkhVar = this.zzj;
        if (zzkhVar != null) {
            zzkhVar.zzm(j);
        }
    }

    public final void zzm() {
        if (this.zzo.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzo.size(); i++) {
            ((zzkh) this.zzo.get(i)).zzn();
        }
        this.zzo = arrayList;
    }

    public final void zzn(zzcc zzccVar, zzig zzigVar) {
        this.zzn = zzigVar;
        long j = zzigVar.zzb;
        zzm();
    }

    public final boolean zzp(zzug zzugVar) {
        zzkh zzkhVar = this.zzj;
        return zzkhVar != null && zzkhVar.zza == zzugVar;
    }

    public final boolean zzq(zzkh zzkhVar) {
        zzdi.zzb(zzkhVar);
        boolean z = false;
        if (zzkhVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzkhVar;
        while (zzkhVar.zzg() != null) {
            zzkhVar = zzkhVar.zzg();
            zzkhVar.getClass();
            if (zzkhVar == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzkhVar.zzn();
            this.zzk--;
        }
        zzkh zzkhVar2 = this.zzj;
        zzkhVar2.getClass();
        zzkhVar2.zzo(null);
        zzC();
        return z;
    }

    public final boolean zzr() {
        zzkh zzkhVar = this.zzj;
        if (zzkhVar != null) {
            return !zzkhVar.zzf.zzi && zzkhVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzs(zzcc zzccVar, long j, long j2) {
        zzki zzkiVar;
        boolean z;
        zzkh zzkhVar = null;
        for (zzkh zzkhVar2 = this.zzh; zzkhVar2 != null; zzkhVar2 = zzkhVar2.zzg()) {
            zzki zzkiVar2 = zzkhVar2.zzf;
            if (zzkhVar == null) {
                zzkiVar = zzh(zzccVar, zzkiVar2);
            } else {
                zzki zzx = zzx(zzccVar, zzkhVar, j);
                if (zzx == null) {
                    return !zzq(zzkhVar);
                }
                if (zzkiVar2.zzb != zzx.zzb || !zzkiVar2.zza.equals(zzx.zza)) {
                    return !zzq(zzkhVar);
                }
                zzkiVar = zzx;
            }
            zzkhVar2.zzf = zzkiVar.zza(zzkiVar2.zzc);
            if (!zzo(zzkiVar2.zze, zzkiVar.zze)) {
                zzkhVar2.zzq();
                long j3 = zzkiVar.zze;
                long zze = j3 == -9223372036854775807L ? Long.MAX_VALUE : j3 + zzkhVar2.zze();
                if (zzkhVar2 == this.zzi) {
                    boolean z2 = zzkhVar2.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= zze) {
                        z = true;
                        return zzq(zzkhVar2) && !z;
                    }
                }
                z = false;
                if (zzq(zzkhVar2)) {
                }
            }
            zzkhVar = zzkhVar2;
        }
        return true;
    }

    public final boolean zzt(zzcc zzccVar, int i) {
        this.zzf = i;
        return zzF(zzccVar);
    }

    public final boolean zzu(zzcc zzccVar, boolean z) {
        this.zzg = z;
        return zzF(zzccVar);
    }

    public final zzkh zzc(zzki zzkiVar) {
        zzkh zzkhVar;
        zzkh zzkhVar2 = this.zzj;
        long zze = zzkhVar2 == null ? 1000000000000L : (zzkhVar2.zze() + zzkhVar2.zzf.zze) - zzkiVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzo.size()) {
                zzkhVar = null;
                break;
            }
            zzki zzkiVar2 = ((zzkh) this.zzo.get(i)).zzf;
            if (zzo(zzkiVar2.zze, zzkiVar.zze) && zzkiVar2.zzb == zzkiVar.zzb && zzkiVar2.zza.equals(zzkiVar.zza)) {
                zzkhVar = (zzkh) this.zzo.remove(i);
                break;
            }
            i++;
        }
        if (zzkhVar == null) {
            zzkhVar = zzjx.zzd(this.zzp.zza, zzkiVar, zze);
        } else {
            zzkhVar.zzf = zzkiVar;
            zzkhVar.zzp(zze);
        }
        zzkh zzkhVar3 = this.zzj;
        if (zzkhVar3 != null) {
            zzkhVar3.zzo(zzkhVar);
        } else {
            this.zzh = zzkhVar;
            this.zzi = zzkhVar;
        }
        this.zzl = null;
        this.zzj = zzkhVar;
        this.zzk++;
        zzC();
        return zzkhVar;
    }
}
