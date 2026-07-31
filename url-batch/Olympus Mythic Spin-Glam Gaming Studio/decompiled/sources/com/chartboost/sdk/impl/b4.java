package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b4 {
    public final Context a;
    public final ScheduledExecutorService b;
    public final ug c;
    public final o2 d;
    public final y2 e;

    public b4(Context context, ScheduledExecutorService backgroundExecutor, ug sdkInitializer, o2 tokenGenerator, y2 identity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(tokenGenerator, "tokenGenerator");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.a = context;
        this.b = backgroundExecutor;
        this.c = sdkInitializer;
        this.d = tokenGenerator;
        this.e = identity;
    }

    public final String a() {
        return this.d.a();
    }

    public final void a(final String appId, final String appSignature, final StartCallback onStarted, final ChartboostError chartboostError) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        this.b.execute(new Runnable() { // from class: com.chartboost.sdk.impl.b4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                b4.a(b4.this, appId, appSignature, onStarted, chartboostError);
            }
        });
    }

    public final void b() {
        try {
            Thread.sleep(100L);
            this.e.h();
        } catch (Exception e) {
            xb.a("startIdentity error " + e, (Throwable) null, 2, (Object) null);
        }
    }

    public static /* synthetic */ void a(b4 b4Var, String str, String str2, StartCallback startCallback, ChartboostError chartboostError, int i, Object obj) {
        if ((i & 8) != 0) {
            chartboostError = null;
        }
        b4Var.a(str, str2, startCallback, chartboostError);
    }

    public static final void a(b4 this$0, String appId, String appSignature, StartCallback onStarted, ChartboostError chartboostError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appId, "$appId");
        Intrinsics.checkNotNullParameter(appSignature, "$appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "$onStarted");
        this$0.b();
        kj.b.a(this$0.a);
        this$0.c.a(appId, appSignature, onStarted, chartboostError);
    }
}
