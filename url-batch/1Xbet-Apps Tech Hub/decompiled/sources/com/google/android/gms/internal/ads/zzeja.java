package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeja {
    private final zzgbt zzc;
    private zzejq zzf;
    private final String zzh;
    private final int zzi;
    private final zzejp zzj;
    private zzfdu zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;

    zzeja(zzfeh zzfehVar, zzejp zzejpVar, zzgbt zzgbtVar) {
        this.zzi = zzfehVar.zzb.zzb.zzp;
        this.zzj = zzejpVar;
        this.zzc = zzgbtVar;
        this.zzh = zzejw.zzc(zzfehVar);
        List list = zzfehVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfdu) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized void zzf() {
        this.zzj.zzi(this.zzk);
        zzejq zzejqVar = this.zzf;
        if (zzejqVar != null) {
            this.zzc.zzc(zzejqVar);
        } else {
            this.zzc.zzd(new zzejt(3, this.zzh));
        }
    }

    private final synchronized boolean zzg(boolean z) {
        for (zzfdu zzfduVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfduVar);
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z || !this.zze.contains(zzfduVar.zzat)) {
                if (valueOf.intValue() < this.zzg) {
                    return true;
                }
                if (valueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.zza.get((zzfdu) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzi() {
        if (!zzg(true)) {
            if (!zzh()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    final synchronized zzfdu zza() {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzfdu zzfduVar = (zzfdu) this.zzb.get(i);
            String str = zzfduVar.zzat;
            if (!this.zze.contains(str)) {
                if (!TextUtils.isEmpty(str)) {
                    this.zze.add(str);
                }
                this.zzd.add(zzfduVar);
                return (zzfdu) this.zzb.remove(i);
            }
        }
        return null;
    }

    final synchronized void zzb(Throwable th, zzfdu zzfduVar) {
        this.zzd.remove(zzfduVar);
        this.zze.remove(zzfduVar.zzat);
        if (zzd() || zzi()) {
            return;
        }
        zzf();
    }

    final synchronized void zzc(zzejq zzejqVar, zzfdu zzfduVar) {
        this.zzd.remove(zzfduVar);
        if (zzd()) {
            zzejqVar.zzq();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfduVar);
        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzm(zzfduVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzm(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzejqVar;
        this.zzk = zzfduVar;
        if (zzi()) {
            return;
        }
        zzf();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }

    final synchronized boolean zze() {
        if (!zzd()) {
            List list = this.zzd;
            if (list.size() < this.zzi) {
                if (zzg(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
