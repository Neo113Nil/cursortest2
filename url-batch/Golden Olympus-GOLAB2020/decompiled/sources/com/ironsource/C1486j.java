package com.ironsource;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1486j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C1486j f16777a = new C1486j();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static AtomicReference<Boolean> f16778b = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static AtomicReference<WeakReference<Activity>> f16779c = new AtomicReference<>(null);

    @Metadata
    /* renamed from: com.ironsource.j$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.r.a(C1486j.f16779c, null, new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C1486j.f16779c.set(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            androidx.lifecycle.r.a(C1486j.f16779c, null, new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    private C1486j() {
    }

    @Nullable
    public final Activity b() {
        WeakReference<Activity> weakReference = f16779c.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final void a(Application application) {
        application.registerActivityLifecycleCallbacks(new a());
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (androidx.lifecycle.r.a(f16778b, Boolean.FALSE, Boolean.TRUE)) {
            if (context instanceof Activity) {
                Application application = ((Activity) context).getApplication();
                Intrinsics.checkNotNullExpressionValue(application, "context.application");
                a(application);
                f16779c.set(new WeakReference<>(context));
                return;
            }
            if (context instanceof Service) {
                Application application2 = ((Service) context).getApplication();
                Intrinsics.checkNotNullExpressionValue(application2, "context.application");
                a(application2);
            } else if (context instanceof Application) {
                a((Application) context);
            }
        }
    }
}
