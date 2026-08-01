package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzdjg implements zzbkd {
    private final WeakReference zza;

    /* synthetic */ zzdjg(zzdjh zzdjhVar, zzdjf zzdjfVar) {
        this.zza = new WeakReference(zzdjhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcyz zzcyzVar;
        zzdjh zzdjhVar = (zzdjh) this.zza.get();
        if (zzdjhVar == null) {
            return;
        }
        zzcyzVar = zzdjhVar.zzg;
        zzcyzVar.zza();
    }
}
