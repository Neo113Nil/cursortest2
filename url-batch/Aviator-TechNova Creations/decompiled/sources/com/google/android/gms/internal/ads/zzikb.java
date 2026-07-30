package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public class zzikb {
    final LinkedHashMap zza;

    zzikb(int i) {
        this.zza = zzikd.zzc(i);
    }

    final zzikb zza(Object obj, zzikp zzikpVar) {
        zziko.zza(obj, SDKConstants.PARAM_KEY);
        zziko.zza(zzikpVar, "provider");
        this.zza.put(obj, zzikpVar);
        return this;
    }
}
