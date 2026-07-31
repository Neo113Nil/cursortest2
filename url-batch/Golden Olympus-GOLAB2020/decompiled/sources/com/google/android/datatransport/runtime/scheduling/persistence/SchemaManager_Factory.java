package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* loaded from: classes.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final V1.a contextProvider;
    private final V1.a dbNameProvider;
    private final V1.a schemaVersionProvider;

    public SchemaManager_Factory(V1.a aVar, V1.a aVar2, V1.a aVar3) {
        this.contextProvider = aVar;
        this.dbNameProvider = aVar2;
        this.schemaVersionProvider = aVar3;
    }

    public static SchemaManager_Factory create(V1.a aVar, V1.a aVar2, V1.a aVar3) {
        return new SchemaManager_Factory(aVar, aVar2, aVar3);
    }

    public static SchemaManager newInstance(Context context, String str, int i4) {
        return new SchemaManager(context, str, i4);
    }

    @Override // V1.a
    public SchemaManager get() {
        return newInstance((Context) this.contextProvider.get(), (String) this.dbNameProvider.get(), ((Integer) this.schemaVersionProvider.get()).intValue());
    }
}
