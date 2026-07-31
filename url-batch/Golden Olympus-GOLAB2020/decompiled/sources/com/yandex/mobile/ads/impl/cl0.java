package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cl0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f24241b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile cl0 f24242c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24243d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<View, rs> f24244a;

    public static final class a {
        @NotNull
        public static cl0 a() {
            if (cl0.f24242c == null) {
                synchronized (cl0.f24241b) {
                    try {
                        if (cl0.f24242c == null) {
                            cl0.f24242c = new cl0(0);
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            cl0 cl0Var = cl0.f24242c;
            if (cl0Var != null) {
                return cl0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private cl0() {
        this.f24244a = new WeakHashMap<>();
    }

    @Nullable
    public final rs a(@NotNull View view) {
        rs rsVar;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (f24241b) {
            rsVar = this.f24244a.get(view);
        }
        return rsVar;
    }

    public /* synthetic */ cl0(int i4) {
        this();
    }

    public final void a(@NotNull View view, @NotNull rs instreamAdBinder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        synchronized (f24241b) {
            this.f24244a.put(view, instreamAdBinder);
        }
    }

    public final boolean a(@NotNull rs instreamAdBinder) {
        boolean z4;
        Intrinsics.checkNotNullParameter(instreamAdBinder, "instreamAdBinder");
        synchronized (f24241b) {
            Set<Map.Entry<View, rs>> entrySet = this.f24244a.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
            Iterator<Map.Entry<View, rs>> it = entrySet.iterator();
            z4 = false;
            while (it.hasNext()) {
                if (instreamAdBinder == it.next().getValue()) {
                    it.remove();
                    z4 = true;
                }
            }
        }
        return z4;
    }
}
