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

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1138zk implements ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13108a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1009ul f13109b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f13110c;

    public C1138zk(Context context, InterfaceC1009ul interfaceC1009ul, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f13108a = context;
        this.f13109b = interfaceC1009ul;
        this.f13110c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final <T, P extends MessageNano> ProtobufBinaryStateStorageFactory<T> createBinaryStateStorageFactory(String str, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        Om.f10778a.getClass();
        return new Nm(str, protobufStateSerializer, protobufConverter);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f13108a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f13108a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final SQLiteOpenHelper getDbStorage() {
        return this.f13110c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f13108a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final TempCacheStorage getTempCacheStorage() {
        C0985tn c0985tn;
        C1112yk B4 = C0817na.f12417I.B();
        Context context = this.f13108a;
        synchronized (B4) {
            try {
                c0985tn = B4.f13074h;
                if (c0985tn == null) {
                    Sm sm = Sm.SERVICE;
                    C0959sn c0959sn = B4.f13073g;
                    if (c0959sn == null) {
                        c0959sn = new C0959sn(new C0906ql(B4.f(context)), "temp_cache");
                        B4.f13073g = c0959sn;
                    }
                    c0985tn = new C0985tn(context, sm, c0959sn);
                    B4.f13074h = c0985tn;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0985tn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences legacyModulePreferences() {
        return new C1129zb(this.f13109b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new Xc(str, this.f13109b);
    }
}
