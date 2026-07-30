package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzev extends zzdm {
    private zzev() {
        throw null;
    }

    /* synthetic */ zzev(byte[] bArr) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze(zze zzeVar) {
        OnAdInspectorClosedListener zzA = zzex.zzb().zzA();
        if (zzA != null) {
            zzA.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }
}
