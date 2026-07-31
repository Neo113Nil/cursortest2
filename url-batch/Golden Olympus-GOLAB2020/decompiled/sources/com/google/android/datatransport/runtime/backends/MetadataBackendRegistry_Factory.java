package com.google.android.datatransport.runtime.backends;

import V1.a;
import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* loaded from: classes.dex */
public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final a applicationContextProvider;
    private final a creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(a aVar, a aVar2) {
        this.applicationContextProvider = aVar;
        this.creationContextFactoryProvider = aVar2;
    }

    public static MetadataBackendRegistry_Factory create(a aVar, a aVar2) {
        return new MetadataBackendRegistry_Factory(aVar, aVar2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }

    @Override // V1.a
    public MetadataBackendRegistry get() {
        return newInstance((Context) this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }
}
