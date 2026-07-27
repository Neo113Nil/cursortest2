package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import b1.RunnableC0264a;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;

/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0914q0 implements Ia {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9036a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f9037b;

    /* renamed from: c, reason: collision with root package name */
    public final C0788l4 f9038c = new C0788l4();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f9039d = f().getHandler();

    /* renamed from: e, reason: collision with root package name */
    public final C0528b2 f9040e = new C0528b2();

    /* renamed from: f, reason: collision with root package name */
    public final C0950rb f9041f = new C0950rb();

    public C0914q0(Context context, Z3 z32) {
        this.f9036a = context;
        this.f9037b = z32.a();
        BaseReleaseLogger.init(context);
        f().execute(new RunnableC0264a(2));
        a().a();
        N3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.13.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 17.10.2025.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0788l4 a() {
        return this.f9038c;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Handler b() {
        return this.f9039d;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0528b2 c() {
        return this.f9040e;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0950rb d() {
        return this.f9041f;
    }

    public final IHandlerExecutor f() {
        return this.f9037b;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final ICommonExecutor getDefaultExecutor() {
        return this.f9037b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(AppMetricaConfig appMetricaConfig, InterfaceC0511ab interfaceC0511ab) {
        try {
            if (!C1069w0.f9492g) {
                if (appMetricaConfig != null) {
                    Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = Boolean.TRUE;
                    }
                    if (!bool.booleanValue()) {
                        this.f9041f.a();
                        if (appMetricaConfig != null) {
                            Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                            if (bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            if (!bool2.booleanValue()) {
                                this.f9040e.c();
                                if (appMetricaConfig != null) {
                                    C1069w0.f9492g = true;
                                }
                            }
                        }
                        this.f9040e.b();
                        if (appMetricaConfig != null) {
                        }
                    }
                }
                this.f9041f.c();
                this.f9041f.b();
                if (appMetricaConfig != null) {
                    this.f9041f.a(this.f9036a, appMetricaConfig, interfaceC0511ab);
                }
                if (appMetricaConfig != null) {
                }
                this.f9040e.b();
                if (appMetricaConfig != null) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
