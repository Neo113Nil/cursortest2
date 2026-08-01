package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzbjw implements zzbkd {
    zzbjw() {
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcbn.zzi("Received log message: ".concat(String.valueOf((String) map.get(TypedValues.Custom.S_STRING))));
    }
}
