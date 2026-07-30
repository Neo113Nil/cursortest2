package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import defpackage.ph;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zzg implements zza {
    private final AnalyticsConnector.AnalyticsConnectorListener zza;
    private final ph zzb;
    private final zzf zzc;

    public zzg(ph phVar, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = phVar;
        zzf zzfVar = new zzf(this);
        this.zzc = zzfVar;
        phVar.a.f(zzfVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }

    public final /* synthetic */ AnalyticsConnector.AnalyticsConnectorListener zzd() {
        return this.zza;
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(Set set) {
    }
}
