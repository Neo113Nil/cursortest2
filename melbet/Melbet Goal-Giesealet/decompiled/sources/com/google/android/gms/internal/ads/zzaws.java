package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzaws extends zzaxl {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzaws(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2, Map map, View view, Context context) {
        super(zzavxVar, "ykIQv59ak7YBU+e791IU15tGonhZPUUBXST76bDGm7zXSjUSNn9qtHdf61t20THy", "l48tDWlMY/G/BSkitRUvd80RiFbNrk8nR5qlkOsZWs8=", zzarwVar, i, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzb(int i) {
        Map map = this.zzh;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) map.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzb(1), zzb(2)};
        Context context = this.zzj;
        if (context == null) {
            context = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, context, this.zzi);
        long j = jArr2[0];
        Map map = this.zzh;
        map.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        map.put(2, Long.valueOf(jArr2[3]));
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzY(j);
            zzarwVar.zzZ(j2);
        }
    }
}
