package io.appmetrica.analytics.modulesapi.internal.service;

import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;

/* loaded from: classes.dex */
public interface ServiceStorageProvider {
    <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(String str, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter);

    File getAppDataStorage();

    File getAppFileStorage();

    SQLiteOpenHelper getDbStorage();

    File getSdkDataStorage();

    TempCacheStorage getTempCacheStorage();

    ModulePreferences legacyModulePreferences();

    ModulePreferences modulePreferences(String str);
}
