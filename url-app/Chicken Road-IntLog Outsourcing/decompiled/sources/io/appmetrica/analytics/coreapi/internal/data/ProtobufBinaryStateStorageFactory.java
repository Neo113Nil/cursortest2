package io.appmetrica.analytics.coreapi.internal.data;

import android.content.Context;

/* loaded from: classes.dex */
public interface ProtobufBinaryStateStorageFactory<T> {
    ProtobufStateStorage<T> create(Context context);

    ProtobufStateStorage<T> createForMigration(Context context);
}
