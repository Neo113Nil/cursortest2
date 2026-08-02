package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufBinaryStateStorageFactory;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.File;

/* loaded from: classes.dex */
public final class Dk implements ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5906a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0990yl f5907b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f5908c;

    public Dk(Context context, InterfaceC0990yl interfaceC0990yl, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f5906a = context;
        this.f5907b = interfaceC0990yl;
        this.f5908c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(String str, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        Sm.f6663a.getClass();
        return new Rm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f5906a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f5906a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f5908c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f5906a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C0915vn c0915vn;
        C0511g7 a3 = C0511g7.a(this.f5906a);
        synchronized (a3) {
            try {
                if (a3.f7374l == null) {
                    Context context = a3.f7368e;
                    Wm wm = Wm.SERVICE;
                    if (a3.f7373k == null) {
                        a3.f7373k = new C0889un(new C0887ul(a3.h()), "temp_cache");
                    }
                    a3.f7374l = new C0915vn(context, wm, a3.f7373k);
                }
                c0915vn = a3.f7374l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0915vn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new Gb(this.f5907b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C0465ed(str, this.f5907b);
    }
}
