package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzlr {
    private final zzov zza;
    private final zzlq zze;
    private final zzmj zzh;
    private final zzeq zzi;
    private boolean zzj;
    private zzhs zzk;
    private zzwd zzl = new zzwd(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzlr(zzlq zzlqVar, zzmj zzmjVar, zzeq zzeqVar, zzov zzovVar) {
        this.zza = zzovVar;
        this.zze = zzlqVar;
        this.zzh = zzmjVar;
        this.zzi = zzeqVar;
    }

    private final void zzr(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzlp) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzs(zzlp zzlpVar) {
        zzlo zzloVar = (zzlo) this.zzf.get(zzlpVar);
        if (zzloVar != null) {
            zzloVar.zza.zzi(zzloVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlp zzlpVar = (zzlp) it.next();
            if (zzlpVar.zzc.isEmpty()) {
                zzs(zzlpVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzlp zzlpVar) {
        if (zzlpVar.zze && zzlpVar.zzc.isEmpty()) {
            zzlo zzloVar = (zzlo) this.zzf.remove(zzlpVar);
            zzloVar.getClass();
            zzloVar.zza.zzp(zzloVar.zzb);
            zzloVar.zza.zzs(zzloVar.zzc);
            zzloVar.zza.zzr(zzloVar.zzc);
            this.zzg.remove(zzlpVar);
        }
    }

    private final void zzv(zzlp zzlpVar) {
        zzuf zzufVar = zzlpVar.zza;
        zzul zzulVar = new zzul() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // com.google.android.gms.internal.ads.zzul
            public final void zza(zzum zzumVar, zzda zzdaVar) {
                zzlr.this.zzf(zzumVar, zzdaVar);
            }
        };
        zzln zzlnVar = new zzln(this, zzlpVar);
        this.zzf.put(zzlpVar, new zzlo(zzufVar, zzulVar, zzlnVar));
        zzufVar.zzh(new Handler(zzfs.zzx(), null), zzlnVar);
        zzufVar.zzg(new Handler(zzfs.zzx(), null), zzlnVar);
        zzufVar.zzm(zzulVar, this.zzk, this.zza);
    }

    private final void zzw(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzlp zzlpVar = (zzlp) this.zzb.remove(i2);
            this.zzd.remove(zzlpVar.zzb);
            zzr(i2, -zzlpVar.zza.zzC().zzc());
            zzlpVar.zze = true;
            if (this.zzj) {
                zzu(zzlpVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzda zzb() {
        if (this.zzb.isEmpty()) {
            return zzda.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzlp zzlpVar = (zzlp) this.zzb.get(i2);
            zzlpVar.zzd = i;
            i += zzlpVar.zza.zzC().zzc();
        }
        return new zzlx(this.zzb, this.zzl);
    }

    public final zzda zzc(int i, int i2, List list) {
        zzef.zzd(i >= 0 && i <= i2 && i2 <= zza());
        zzef.zzd(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzlp) this.zzb.get(i3)).zza.zzt((zzbs) list.get(i3 - i));
        }
        return zzb();
    }

    final /* synthetic */ void zzf(zzum zzumVar, zzda zzdaVar) {
        this.zze.zzg();
    }

    public final void zzg(zzhs zzhsVar) {
        zzef.zzf(!this.zzj);
        this.zzk = zzhsVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzlp zzlpVar = (zzlp) this.zzb.get(i);
            zzv(zzlpVar);
            this.zzg.add(zzlpVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzlo zzloVar : this.zzf.values()) {
            try {
                zzloVar.zza.zzp(zzloVar.zzb);
            } catch (RuntimeException e) {
                zzez.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzloVar.zza.zzs(zzloVar.zzc);
            zzloVar.zza.zzr(zzloVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzui zzuiVar) {
        zzlp zzlpVar = (zzlp) this.zzc.remove(zzuiVar);
        zzlpVar.getClass();
        zzlpVar.zza.zzG(zzuiVar);
        zzlpVar.zzc.remove(((zzuc) zzuiVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzlpVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzda zzk(int i, List list, zzwd zzwdVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwdVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzlp zzlpVar = (zzlp) list.get(i2 - i);
                if (i2 > 0) {
                    zzlp zzlpVar2 = (zzlp) this.zzb.get(i2 - 1);
                    zzlpVar.zzc(zzlpVar2.zzd + zzlpVar2.zza.zzC().zzc());
                } else {
                    zzlpVar.zzc(0);
                }
                zzr(i2, zzlpVar.zza.zzC().zzc());
                this.zzb.add(i2, zzlpVar);
                this.zzd.put(zzlpVar.zzb, zzlpVar);
                if (this.zzj) {
                    zzv(zzlpVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlpVar);
                    } else {
                        zzs(zzlpVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzda zzl(int i, int i2, int i3, zzwd zzwdVar) {
        zzef.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzda zzm(int i, int i2, zzwd zzwdVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzef.zzd(z);
        this.zzl = zzwdVar;
        zzw(i, i2);
        return zzb();
    }

    public final zzda zzn(List list, zzwd zzwdVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwdVar);
    }

    public final zzda zzo(zzwd zzwdVar) {
        int zza = zza();
        if (zzwdVar.zzc() != zza) {
            zzwdVar = zzwdVar.zzf().zzg(0, zza);
        }
        this.zzl = zzwdVar;
        return zzb();
    }

    public final zzui zzp(zzuk zzukVar, zzyn zzynVar, long j) {
        int i = zzlx.zzc;
        Object obj = ((Pair) zzukVar.zza).first;
        zzuk zza = zzukVar.zza(((Pair) zzukVar.zza).second);
        zzlp zzlpVar = (zzlp) this.zzd.get(obj);
        zzlpVar.getClass();
        this.zzg.add(zzlpVar);
        zzlo zzloVar = (zzlo) this.zzf.get(zzlpVar);
        if (zzloVar != null) {
            zzloVar.zza.zzk(zzloVar.zzb);
        }
        zzlpVar.zzc.add(zza);
        zzuc zzI = zzlpVar.zza.zzI(zza, zzynVar, j);
        this.zzc.put(zzI, zzlpVar);
        zzt();
        return zzI;
    }

    public final zzwd zzq() {
        return this.zzl;
    }
}
