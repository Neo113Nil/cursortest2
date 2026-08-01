package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbdc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcf {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    zzcf(Context context) {
        this.zzc = context;
    }

    final synchronized void zzb(String str) {
        SharedPreferences defaultSharedPreferences;
        if (this.zza.containsKey(str)) {
            return;
        }
        if (str != "__default__" && (str == null || !str.equals("__default__"))) {
            defaultSharedPreferences = this.zzc.getSharedPreferences(str, 0);
            zzce zzceVar = new zzce(this, str);
            this.zza.put(str, zzceVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzceVar);
        }
        defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
        zzce zzceVar2 = new zzce(this, str);
        this.zza.put(str, zzceVar2);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzceVar2);
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjJ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            Map zzu = zzt.zzu((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjN));
            Iterator it = zzu.keySet().iterator();
            while (it.hasNext()) {
                zzb((String) it.next());
            }
            zzd(new zzcd(zzu));
        }
    }

    final synchronized void zzd(zzcd zzcdVar) {
        this.zzb.add(zzcdVar);
    }
}
