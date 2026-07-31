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

/* loaded from: classes3.dex */
public final class Ak implements ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f766a;
    public final InterfaceC0586vl b;
    public final SQLiteOpenHelper c;

    public Ak(Context context, InterfaceC0586vl interfaceC0586vl, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f766a = context;
        this.b = interfaceC0586vl;
        this.c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(String str, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        Pm.f1007a.getClass();
        return new Om(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f766a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f766a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f766a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C0563un c0563un;
        C0685zk B = C0401oa.I.B();
        Context context = this.f766a;
        synchronized (B) {
            c0563un = B.h;
            if (c0563un == null) {
                Tm tm = Tm.SERVICE;
                C0538tn c0538tn = B.g;
                if (c0538tn == null) {
                    c0538tn = new C0538tn(new C0486rl(B.f(context)), "temp_cache");
                    B.g = c0538tn;
                }
                c0563un = new C0563un(context, tm, c0538tn);
                B.h = c0563un;
            }
        }
        return c0563un;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new Ab(this.b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Yc(str, this.b);
    }
}
