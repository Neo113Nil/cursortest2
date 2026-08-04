package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbiu implements zzbjl {
    zzbiu() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(TypedValues.Custom.S_STRING);
        String.valueOf(str);
        String valueOf = String.valueOf(str);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Received log message: ".concat(valueOf));
    }
}
