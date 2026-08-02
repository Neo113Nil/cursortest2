package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;

/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763q0 implements Ia {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8108a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f8109b;

    /* renamed from: c, reason: collision with root package name */
    public final C0637l4 f8110c = new C0637l4();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f8111d = f().getHandler();

    /* renamed from: e, reason: collision with root package name */
    public final C0377b2 f8112e = new C0377b2();
    public final C0799rb f = new C0799rb();

    public C0763q0(Context context, Z3 z3) {
        this.f8108a = context;
        this.f8109b = z3.a();
        BaseReleaseLogger.init(context);
        f().execute(new B0.a(1));
        a().a();
        N3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.13.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 17.10.2025.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0637l4 a() {
        return this.f8110c;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Handler b() {
        return this.f8111d;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0377b2 c() {
        return this.f8112e;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0799rb d() {
        return this.f;
    }

    public final IHandlerExecutor f() {
        return this.f8109b;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final ICommonExecutor getDefaultExecutor() {
        return this.f8109b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(AppMetricaConfig appMetricaConfig, InterfaceC0360ab interfaceC0360ab) {
        try {
            if (!C0918w0.f8538g) {
                if (appMetricaConfig != null) {
                    Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = Boolean.TRUE;
                    }
                    if (!bool.booleanValue()) {
                        this.f.a();
                        if (appMetricaConfig != null) {
                            Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                            if (bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            if (!bool2.booleanValue()) {
                                this.f8112e.c();
                                if (appMetricaConfig != null) {
                                    C0918w0.f8538g = true;
                                }
                            }
                        }
                        this.f8112e.b();
                        if (appMetricaConfig != null) {
                        }
                    }
                }
                this.f.c();
                this.f.b();
                if (appMetricaConfig != null) {
                    this.f.a(this.f8108a, appMetricaConfig, interfaceC0360ab);
                }
                if (appMetricaConfig != null) {
                }
                this.f8112e.b();
                if (appMetricaConfig != null) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
