package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* loaded from: classes.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final V1.a contextProvider;

    public EventStoreModule_PackageNameFactory(V1.a aVar) {
        this.contextProvider = aVar;
    }

    public static EventStoreModule_PackageNameFactory create(V1.a aVar) {
        return new EventStoreModule_PackageNameFactory(aVar);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNull(EventStoreModule.packageName(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // V1.a
    public String get() {
        return packageName((Context) this.contextProvider.get());
    }
}
