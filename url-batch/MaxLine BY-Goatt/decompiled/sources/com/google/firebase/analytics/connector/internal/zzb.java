package com.google.firebase.analytics.connector.internal;

import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final /* synthetic */ class zzb implements ComponentFactory {
    static final /* synthetic */ zzb zza = new zzb();

    private /* synthetic */ zzb() {
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final /* synthetic */ Object create(ComponentContainer componentContainer) {
        AnalyticsConnector lambda$getComponents$0;
        lambda$getComponents$0 = AnalyticsConnectorRegistrar.lambda$getComponents$0(componentContainer);
        return lambda$getComponents$0;
    }
}
