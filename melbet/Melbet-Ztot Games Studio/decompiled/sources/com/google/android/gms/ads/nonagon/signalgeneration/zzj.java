package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
final class zzj extends LinkedHashMap {
    final /* synthetic */ zzl zza;

    zzj(zzl zzlVar) {
        this.zza = zzlVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int i;
        ArrayDeque arrayDeque;
        int i2;
        synchronized (this.zza) {
            int size = size();
            zzl zzlVar = this.zza;
            i = zzlVar.zza;
            if (size <= i) {
                return false;
            }
            arrayDeque = zzlVar.zzf;
            arrayDeque.add(new Pair((String) entry.getKey(), ((zzk) entry.getValue()).zzb));
            int size2 = size();
            i2 = this.zza.zza;
            return size2 > i2;
        }
    }
}
