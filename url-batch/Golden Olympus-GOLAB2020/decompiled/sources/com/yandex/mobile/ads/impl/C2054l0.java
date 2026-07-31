package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2054l0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2054l0 f28375a = new C2054l0();

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private static C2078m0 f28376b;

    private C2054l0() {
    }

    public static final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (f28375a) {
            try {
                if (f28376b == null) {
                    Context applicationContext = context.getApplicationContext();
                    Activity activity = null;
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application != null) {
                        Activity activity2 = context instanceof Activity ? (Activity) context : null;
                        if (activity2 != null && !activity2.isFinishing() && !activity2.isDestroyed()) {
                            activity = activity2;
                        }
                        C2078m0 c2078m0 = new C2078m0(new C2124o0(activity));
                        f28376b = c2078m0;
                        application.registerActivityLifecycleCallbacks(c2078m0);
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public static final Activity b() {
        Activity b4;
        synchronized (f28375a) {
            C2078m0 c2078m0 = f28376b;
            b4 = c2078m0 != null ? c2078m0.b() : null;
        }
        return b4;
    }

    @Nullable
    public static final Activity a() {
        Activity a4;
        synchronized (f28375a) {
            C2078m0 c2078m0 = f28376b;
            a4 = c2078m0 != null ? c2078m0.a() : null;
        }
        return a4;
    }
}
