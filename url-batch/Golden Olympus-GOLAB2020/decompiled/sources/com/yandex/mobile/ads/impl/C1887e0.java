package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.C1959h0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1887e0 implements InterfaceC1839c0 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Object f25034f = new Object();

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private static volatile C1887e0 f25035g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f25036a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final WeakHashMap f25037b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final WeakHashMap f25038c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f25039d = new a();

    /* renamed from: e, reason: collision with root package name */
    private boolean f25040e;

    /* renamed from: com.yandex.mobile.ads.impl.e0$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        private final HashSet a(WeakHashMap weakHashMap) {
            HashSet hashSet;
            synchronized (C1887e0.this.f25036a) {
                Set keySet = weakHashMap.keySet();
                hashSet = new HashSet(keySet.size());
                for (Object obj : keySet) {
                    if (obj != null) {
                        hashSet.add(obj);
                    }
                }
            }
            return hashSet;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = a(C1887e0.this.f25038c).iterator();
            while (it.hasNext()) {
                ((er1) it.next()).a(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = a(C1887e0.this.f25037b).iterator();
            while (it.hasNext()) {
                ((InterfaceC2101n0) it.next()).a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Iterator it = a(C1887e0.this.f25037b).iterator();
            while (it.hasNext()) {
                ((InterfaceC2101n0) it.next()).b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            Iterator it = a(C1887e0.this.f25038c).iterator();
            while (it.hasNext()) {
                ((er1) it.next()).b(activity, outState);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C1887e0.this.b(activity);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1839c0
    public final void b(@NotNull Context context, @NotNull InterfaceC2101n0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f25036a) {
            try {
                this.f25037b.put(listener, null);
                if (!c()) {
                    a(context);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z4;
        synchronized (this.f25036a) {
            z4 = this.f25040e;
        }
        return z4;
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.f25039d);
            this.f25040e = true;
        } catch (Throwable unused) {
            Object[] args = new Object[0];
            int i4 = ap0.f23396b;
            Intrinsics.checkNotNullParameter(args, "args");
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1839c0
    public final void a(@NotNull Context context, @NotNull InterfaceC2101n0 listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f25036a) {
            this.f25037b.remove(listener);
            b(context);
            Unit unit = Unit.f41027a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1839c0
    public final void b(@NotNull Context context, @NotNull C1959h0.a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f25036a) {
            try {
                this.f25038c.put(listener, null);
                if (!c()) {
                    a(context);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Context context) {
        synchronized (this.f25036a) {
            try {
                if (this.f25037b.isEmpty() && this.f25038c.isEmpty()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    try {
                        if (c()) {
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.f25039d);
                            this.f25040e = false;
                        }
                    } catch (Throwable unused) {
                        Object[] args = new Object[0];
                        int i4 = ap0.f23396b;
                        Intrinsics.checkNotNullParameter(args, "args");
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1839c0
    public final void a(@NotNull Context context, @NotNull C1959h0.a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f25036a) {
            this.f25038c.remove(listener);
            b(context);
            Unit unit = Unit.f41027a;
        }
    }
}
