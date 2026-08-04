package com.google.android.gms.internal.ads;

import com.facebook.react.uimanager.ViewProps;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzbiz implements zzbjl {
    zzbiz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (map.containsKey(ViewProps.START)) {
            zzcekVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzcekVar.zzas(false);
        }
    }
}
