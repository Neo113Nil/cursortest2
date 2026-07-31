package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes3.dex */
public final class zzh {
    private final zzh zza;
    private zzbb zzb;
    private Map<String, zzaq> zzc = new HashMap();
    private Map<String, Boolean> zzd = new HashMap();

    public final zzh zza() {
        return new zzh(this, this.zzb);
    }

    public final zzaq zza(zzaq zzaqVar) {
        return this.zzb.zza(this, zzaqVar);
    }

    public final zzaq zza(zzaf zzafVar) {
        zzaq zzaqVar = zzaq.zzc;
        Iterator<Integer> zzg = zzafVar.zzg();
        while (zzg.hasNext()) {
            zzaqVar = this.zzb.zza(this, zzafVar.zza(zzg.next().intValue()));
            if (zzaqVar instanceof zzaj) {
                break;
            }
        }
        return zzaqVar;
    }

    public final zzaq zza(String str) {
        while (!this.zzc.containsKey(str)) {
            this = this.zza;
            if (this == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return this.zzc.get(str);
    }

    public zzh(zzh zzhVar, zzbb zzbbVar) {
        this.zza = zzhVar;
        this.zzb = zzbbVar;
    }

    public final void zza(String str, zzaq zzaqVar) {
        if (this.zzd.containsKey(str)) {
            return;
        }
        if (zzaqVar == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, zzaqVar);
        }
    }

    public final void zzb(String str, zzaq zzaqVar) {
        zza(str, zzaqVar);
        this.zzd.put(str, true);
    }

    public final void zzc(String str, zzaq zzaqVar) {
        zzh zzhVar;
        while (!this.zzc.containsKey(str) && (zzhVar = this.zza) != null && zzhVar.zzb(str)) {
            this = this.zza;
        }
        if (this.zzd.containsKey(str)) {
            return;
        }
        if (zzaqVar == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, zzaqVar);
        }
    }

    public final boolean zzb(String str) {
        while (!this.zzc.containsKey(str)) {
            this = this.zza;
            if (this == null) {
                return false;
            }
        }
        return true;
    }
}
