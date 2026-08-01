package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzol {
    private final zzcx zza;
    private zzfwu zzb = zzfwu.zzl();
    private zzfwx zzc = zzfwx.zzd();
    private zzuk zzd;
    private zzuk zze;
    private zzuk zzf;

    public zzol(zzcx zzcxVar) {
        this.zza = zzcxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static zzuk zzj(zzcr zzcrVar, zzfwu zzfwuVar, zzuk zzukVar, zzcx zzcxVar) {
        zzda zzn = zzcrVar.zzn();
        int zze = zzcrVar.zze();
        Object zzf = zzn.zzo() ? null : zzn.zzf(zze);
        int zzc = (zzcrVar.zzx() || zzn.zzo()) ? -1 : zzn.zzd(zze, zzcxVar, false).zzc(zzfs.zzq(zzcrVar.zzk()));
        for (int i = 0; i < zzfwuVar.size(); i++) {
            zzuk zzukVar2 = (zzuk) zzfwuVar.get(i);
            if (zzm(zzukVar2, zzf, zzcrVar.zzx(), zzcrVar.zzb(), zzcrVar.zzc(), zzc)) {
                return zzukVar2;
            }
        }
        if (zzfwuVar.isEmpty() && zzukVar != null) {
            if (zzm(zzukVar, zzf, zzcrVar.zzx(), zzcrVar.zzb(), zzcrVar.zzc(), zzc)) {
                return zzukVar;
            }
        }
        return null;
    }

    private final void zzk(zzfww zzfwwVar, zzuk zzukVar, zzda zzdaVar) {
        if (zzukVar == null) {
            return;
        }
        if (zzdaVar.zza(zzukVar.zza) != -1) {
            zzfwwVar.zza(zzukVar, zzdaVar);
            return;
        }
        zzda zzdaVar2 = (zzda) this.zzc.get(zzukVar);
        if (zzdaVar2 != null) {
            zzfwwVar.zza(zzukVar, zzdaVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzl(zzda zzdaVar) {
        zzfww zzfwwVar = new zzfww();
        if (this.zzb.isEmpty()) {
            zzk(zzfwwVar, this.zze, zzdaVar);
            if (!zzftt.zza(this.zzf, this.zze)) {
                zzk(zzfwwVar, this.zzf, zzdaVar);
            }
            if (!zzftt.zza(this.zzd, this.zze) && !zzftt.zza(this.zzd, this.zzf)) {
                zzk(zzfwwVar, this.zzd, zzdaVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfwwVar, (zzuk) this.zzb.get(i), zzdaVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfwwVar, this.zzd, zzdaVar);
            }
        }
        this.zzc = zzfwwVar.zzc();
    }

    private static boolean zzm(zzuk zzukVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzukVar.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (zzukVar.zzb != i || zzukVar.zzc != i2) {
                return false;
            }
        } else if (zzukVar.zzb != -1 || zzukVar.zze != i3) {
            return false;
        }
        return true;
    }

    public final zzda zza(zzuk zzukVar) {
        return (zzda) this.zzc.get(zzukVar);
    }

    public final zzuk zzb() {
        return this.zzd;
    }

    public final zzuk zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfwu zzfwuVar = this.zzb;
        if (!(zzfwuVar instanceof List)) {
            Iterator<E> it = zzfwuVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfwuVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfwuVar.get(zzfwuVar.size() - 1);
        }
        return (zzuk) obj;
    }

    public final zzuk zzd() {
        return this.zze;
    }

    public final zzuk zze() {
        return this.zzf;
    }

    public final void zzg(zzcr zzcrVar) {
        this.zzd = zzj(zzcrVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzuk zzukVar, zzcr zzcrVar) {
        this.zzb = zzfwu.zzj(list);
        if (!list.isEmpty()) {
            this.zze = (zzuk) list.get(0);
            zzukVar.getClass();
            this.zzf = zzukVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcrVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcrVar.zzn());
    }

    public final void zzi(zzcr zzcrVar) {
        this.zzd = zzj(zzcrVar, this.zzb, this.zze, this.zza);
        zzl(zzcrVar.zzn());
    }
}
