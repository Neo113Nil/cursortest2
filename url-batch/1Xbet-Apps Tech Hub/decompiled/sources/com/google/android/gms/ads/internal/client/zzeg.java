package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzeg extends zzcz {
    private zzeg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzda
    public final void zze(@Nullable zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener;
        onAdInspectorClosedListener = zzej.zzf().zzh;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }

    /* synthetic */ zzeg(zzef zzefVar) {
    }
}
