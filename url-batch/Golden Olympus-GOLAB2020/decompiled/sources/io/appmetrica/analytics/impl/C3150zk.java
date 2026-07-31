package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3150zk implements ServiceStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40398a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3021ul f40399b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f40400c;

    public C3150zk(@NotNull Context context, @NotNull InterfaceC3021ul interfaceC3021ul, @NotNull SQLiteOpenHelper sQLiteOpenHelper) {
        this.f40398a = context;
        this.f40399b = interfaceC3021ul;
        this.f40400c = sQLiteOpenHelper;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppDataStorage() {
        return FileUtils.getAppDataDir(this.f40398a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getAppFileStorage() {
        return FileUtils.getAppStorageDirectory(this.f40398a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final SQLiteOpenHelper getDbStorage() {
        return this.f40400c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @Nullable
    public final File getSdkDataStorage() {
        return FileUtils.sdkStorage(this.f40398a);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final TempCacheStorage getTempCacheStorage() {
        C2920qn c2920qn;
        C3007u7 a4 = C3007u7.a(this.f40398a);
        synchronized (a4) {
            try {
                if (a4.f39913o == null) {
                    Context context = a4.f39903e;
                    Sm sm = Sm.SERVICE;
                    if (a4.f39912n == null) {
                        a4.f39912n = new C2894pn(new C2918ql(a4.h()), "temp_cache");
                    }
                    a4.f39913o = new C2920qn(context, sm, a4.f39912n);
                }
                c2920qn = a4.f39913o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2920qn;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences legacyModulePreferences() {
        return new Ub(this.f40399b);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider
    @NotNull
    public final ModulePreferences modulePreferences(@NotNull String str) {
        return new C2961sd(str, this.f40399b);
    }
}
