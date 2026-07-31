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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2819n0 implements Wa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39465a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f39466b;

    /* renamed from: c, reason: collision with root package name */
    public final C3134z4 f39467c = new C3134z4();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f39468d = f().getHandler();

    /* renamed from: e, reason: collision with root package name */
    public final Y1 f39469e = new Y1();

    /* renamed from: f, reason: collision with root package name */
    public final Fb f39470f = new Fb();

    public C2819n0(@NotNull Context context, @NotNull C2823n4 c2823n4) {
        this.f39465a = context;
        this.f39466b = c2823n4.a();
        BaseReleaseLogger.init(context);
        f().execute(new Runnable() { // from class: io.appmetrica.analytics.impl.op
            @Override // java.lang.Runnable
            public final void run() {
                C2819n0.e();
            }
        });
        a().a();
        AbstractC2508b4.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info("AppMetrica", "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.10.0, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 11.07.2025.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NotNull
    public final C3134z4 a() {
        return this.f39467c;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NotNull
    public final Handler b() {
        return this.f39468d;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NotNull
    public final Y1 c() {
        return this.f39469e;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NotNull
    public final Fb d() {
        return this.f39470f;
    }

    @NotNull
    public final IHandlerExecutor f() {
        return this.f39466b;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final ICommonExecutor getDefaultExecutor() {
        return this.f39466b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x000e, TRY_LEAVE, TryCatch #0 {all -> 0x000e, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:9:0x0010, B:12:0x0017, B:14:0x0032, B:16:0x0036, B:17:0x0038, B:20:0x003f, B:22:0x004c, B:24:0x0045, B:25:0x001d, B:27:0x0029), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Wa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(@Nullable AppMetricaConfig appMetricaConfig, @NotNull InterfaceC2856ob interfaceC2856ob) {
        try {
            if (!C2974t0.f39822g) {
                if (appMetricaConfig != null) {
                    Boolean bool = appMetricaConfig.crashReporting;
                    if (bool == null) {
                        bool = Boolean.TRUE;
                    }
                    if (!bool.booleanValue()) {
                        this.f39470f.a();
                        if (appMetricaConfig != null) {
                            Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                            if (bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            if (!bool2.booleanValue()) {
                                this.f39469e.c();
                                if (appMetricaConfig != null) {
                                    C2974t0.f39822g = true;
                                }
                            }
                        }
                        this.f39469e.b();
                        if (appMetricaConfig != null) {
                        }
                    }
                }
                this.f39470f.c();
                this.f39470f.b();
                if (appMetricaConfig != null) {
                    this.f39470f.a(this.f39465a, appMetricaConfig, interfaceC2856ob);
                }
                if (appMetricaConfig != null) {
                }
                this.f39469e.b();
                if (appMetricaConfig != null) {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
