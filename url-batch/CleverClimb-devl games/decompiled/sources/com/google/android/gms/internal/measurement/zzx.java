package com.google.android.gms.internal.measurement;

import android.annotation.SuppressLint;
import com.google.android.gms.analytics.zzi;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzx extends zzi<zzx> {
    private Map<Integer, Double> zzto = new HashMap(4);

    @SuppressLint({"UseSparseArrays"})
    public zzx() {
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, Double> entry : this.zzto.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return zza((Object) hashMap);
    }

    public final Map<Integer, Double> zzar() {
        return Collections.unmodifiableMap(this.zzto);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzx zzxVar) {
        zzxVar.zzto.putAll(this.zzto);
    }
}
