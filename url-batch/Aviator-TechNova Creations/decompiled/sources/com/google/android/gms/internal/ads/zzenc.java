package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzenc {
    private final zzhah zzc;
    private zzens zzf;
    private final String zzh;
    private final int zzi;
    private final zzenr zzj;
    private zzfir zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    zzenc(zzfjc zzfjcVar, zzenr zzenrVar, zzhah zzhahVar) {
        this.zzi = zzfjcVar.zzb.zzb.zzr;
        this.zzj = zzenrVar;
        this.zzc = zzhahVar;
        this.zzh = zzeny.zzb(zzfjcVar);
        List list = zzfjcVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfir) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfir) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z) {
        for (zzfir zzfirVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfirVar);
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z || !this.zze.contains(zzfirVar.zzat)) {
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

    private final synchronized boolean zzg() {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.zza.get((zzfir) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzens zzensVar = this.zzf;
        if (zzensVar != null) {
            this.zzc.zza(zzensVar);
        } else {
            this.zzc.zzb(new zzenv(3, this.zzh));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2.zzav == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6.zzl = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r6.zzd.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        return (com.google.android.gms.internal.ads.zzfir) r1.remove(r0);
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized zzfir zza() {
        if (zze()) {
            int i = 0;
            while (true) {
                List list = this.zzb;
                if (i >= list.size()) {
                    break;
                }
                zzfir zzfirVar = (zzfir) list.get(i);
                String str = zzfirVar.zzat;
                Set set = this.zze;
                if (!set.contains(str)) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    final synchronized void zzb(zzens zzensVar, zzfir zzfirVar) {
        this.zzl = false;
        this.zzd.remove(zzfirVar);
        if (zzd()) {
            zzensVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfirVar);
        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzf(zzfirVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzensVar;
        this.zzk = zzfirVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    final synchronized void zzc(Throwable th, zzfir zzfirVar) {
        this.zzl = false;
        this.zzd.remove(zzfirVar);
        this.zze.remove(zzfirVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
