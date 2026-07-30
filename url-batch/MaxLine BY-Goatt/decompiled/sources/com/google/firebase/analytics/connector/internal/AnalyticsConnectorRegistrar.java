package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AnalyticsConnector lambda$getComponents$0(ComponentContainer componentContainer) {
        return AnalyticsConnectorImpl.getInstance((FirebaseApp) componentContainer.get(FirebaseApp.class), (Context) componentContainer.get(Context.class), (Subscriber) componentContainer.get(Subscriber.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(AnalyticsConnector.class).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) Subscriber.class)).factory(zzb.zza).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-analytics", "23.0.0"));
    }
}
