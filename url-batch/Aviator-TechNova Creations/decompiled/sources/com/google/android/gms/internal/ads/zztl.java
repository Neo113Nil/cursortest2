package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zztl implements zzto {
    zztl() {
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public final zzth zza(zztj zztjVar, zzv zzvVar) {
        if (zzvVar.zzs == null) {
            return null;
        }
        return new zztp(new zztg(new zztq(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public final int zzb(zzv zzvVar) {
        return zzvVar.zzs != null ? 1 : 0;
    }
}
