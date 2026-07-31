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
import io.appmetrica.analytics.reactnative.AppMetricaModule;

/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0441q0 implements Ca {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1443a;
    public final IHandlerExecutor b;
    public final C0165f4 c = new C0165f4();
    public final Handler d = f().getHandler();
    public final T1 e = new T1();
    public final C0327lb f = new C0327lb();

    public C0441q0(Context context, S3 s3) {
        this.f1443a = context;
        this.b = s3.a();
        BaseReleaseLogger.init(context);
        f().execute(new Runnable() { // from class: io.appmetrica.analytics.impl.q0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C0441q0.e();
            }
        });
        a().a();
        G3.a().onCreate();
    }

    public static final void e() {
        ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Initializing of AppMetrica, " + StringUtils.capitalize("release") + " type, Version 7.14.1, API Level " + AppMetrica.getLibraryApiLevel() + ", Dated 28.12.2025.", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final C0165f4 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final Handler b() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final T1 c() {
        return this.e;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final C0327lb d() {
        return this.f;
    }

    public final IHandlerExecutor f() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:13:0x0016, B:15:0x0031, B:17:0x0035, B:19:0x0039, B:22:0x0040, B:24:0x004d, B:26:0x0046, B:27:0x001c, B:29:0x0028), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x000b, B:10:0x000f, B:13:0x0016, B:15:0x0031, B:17:0x0035, B:19:0x0039, B:22:0x0040, B:24:0x004d, B:26:0x0046, B:27:0x001c, B:29:0x0028), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.impl.Ca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(AppMetricaConfig appMetricaConfig, Ua ua) {
        if (!C0640y0.g) {
            if (appMetricaConfig != null) {
                Boolean bool = appMetricaConfig.crashReporting;
                if (bool == null) {
                    bool = Boolean.TRUE;
                }
                if (bool != null && !bool.booleanValue()) {
                    this.f.a();
                    if (appMetricaConfig != null) {
                        Boolean bool2 = appMetricaConfig.appOpenTrackingEnabled;
                        if (bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        if (bool2 != null && !bool2.booleanValue()) {
                            this.e.c();
                            if (appMetricaConfig != null) {
                                C0640y0.g = true;
                            }
                        }
                    }
                    this.e.b();
                    if (appMetricaConfig != null) {
                    }
                }
            }
            this.f.c();
            this.f.b();
            if (appMetricaConfig != null) {
                this.f.a(this.f1443a, appMetricaConfig, ua);
            }
            if (appMetricaConfig != null) {
            }
            this.e.b();
            if (appMetricaConfig != null) {
            }
        }
    }
}
