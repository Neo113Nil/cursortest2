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
public final class C0885q0 implements Ba {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12596a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f12597b;

    /* renamed from: c, reason: collision with root package name */
    public final C0578e4 f12598c = new C0578e4();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f12599d = f().getHandler();

    /* renamed from: e, reason: collision with root package name */
    public final S1 f12600e = new S1();

    /* renamed from: f, reason: collision with root package name */
    public final C0740kb f12601f = new C0740kb();

    public C0885q0(Context context, R3 r32) {
        this.f12596a = context;
        this.f12597b = r32.a();
        BaseReleaseLogger.init(context);
        f().execute(new R1.a(1));
        a().a();
        F3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 8.0.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 30.12.2025.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final C0578e4 a() {
        return this.f12598c;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final Handler b() {
        return this.f12599d;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final S1 c() {
        return this.f12600e;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final C0740kb d() {
        return this.f12601f;
    }

    public final IHandlerExecutor f() {
        return this.f12597b;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final ICommonExecutor getDefaultExecutor() {
        return this.f12597b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(AppMetricaConfig appMetricaConfig, Ta ta) {
        try {
            if (!C1092y0.f13044g) {
                if (appMetricaConfig != null) {
                    Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = Boolean.TRUE;
                    }
                    if (!bool.booleanValue()) {
                        this.f12601f.a();
                        if (appMetricaConfig != null) {
                            Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                            if (bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            if (!bool2.booleanValue()) {
                                this.f12600e.c();
                                if (appMetricaConfig != null) {
                                    C1092y0.f13044g = true;
                                }
                            }
                        }
                        this.f12600e.b();
                        if (appMetricaConfig != null) {
                        }
                    }
                }
                this.f12601f.c();
                this.f12601f.b();
                if (appMetricaConfig != null) {
                    this.f12601f.a(this.f12596a, appMetricaConfig, ta);
                }
                if (appMetricaConfig != null) {
                }
                this.f12600e.b();
                if (appMetricaConfig != null) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
