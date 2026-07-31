package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2158pb {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n50 f30385a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xe1 f30386b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1935g0 f30387c;

    public /* synthetic */ C2158pb(n50 n50Var, xe1 xe1Var) {
        this(n50Var, xe1Var, new C1935g0());
    }

    public final void a(@NotNull View view, @NotNull C1802ab action) {
        Activity activity;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f30387c.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        while (true) {
            activity = null;
            Activity activity2 = context instanceof Activity ? (Activity) context : null;
            if (activity2 != null) {
                activity = activity2;
                break;
            }
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                break;
            }
        }
        if (activity == null) {
            activity = C2054l0.b();
        }
        if (activity == null || !C2362y9.a((Context) activity)) {
            return;
        }
        try {
            a(activity, new C2226sb(activity), action);
        } catch (Throwable unused) {
        }
    }

    public C2158pb(@NotNull n50 eventListenerController, @NotNull xe1 openUrlHandler, @NotNull C1935g0 activityContextProvider) {
        Intrinsics.checkNotNullParameter(eventListenerController, "eventListenerController");
        Intrinsics.checkNotNullParameter(openUrlHandler, "openUrlHandler");
        Intrinsics.checkNotNullParameter(activityContextProvider, "activityContextProvider");
        this.f30385a = eventListenerController;
        this.f30386b = openUrlHandler;
        this.f30387c = activityContextProvider;
    }

    private final void a(Activity activity, C2226sb c2226sb, C1802ab c1802ab) {
        new C1898eb(new C1946gb(activity, c2226sb, new C1874db(activity, c2226sb), new C1922fb()).a(), c2226sb, this.f30385a, this.f30386b, new Handler(Looper.getMainLooper())).a(c1802ab.c(), c1802ab.d());
    }
}
