package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gt0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Object f26290b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile gt0 f26291c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26292d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakHashMap f26293a;

    public static final class a {
        @NotNull
        public static gt0 a() {
            if (gt0.f26291c == null) {
                synchronized (gt0.f26290b) {
                    try {
                        if (gt0.f26291c == null) {
                            gt0.f26291c = new gt0(0);
                        }
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            gt0 gt0Var = gt0.f26291c;
            if (gt0Var != null) {
                return gt0Var;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private gt0() {
        this.f26293a = new WeakHashMap();
    }

    @Nullable
    public final at0 a(@NotNull j70 view) {
        at0 at0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        synchronized (f26290b) {
            at0Var = (at0) this.f26293a.get(view);
        }
        return at0Var;
    }

    public /* synthetic */ gt0(int i4) {
        this();
    }

    public final void a(@NotNull j70 view, @NotNull at0 presenter) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        synchronized (f26290b) {
        }
    }

    public final boolean a(@NotNull at0 presenter) {
        boolean z4;
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        synchronized (f26290b) {
            Iterator it = this.f26293a.entrySet().iterator();
            z4 = false;
            while (it.hasNext()) {
                if (Intrinsics.areEqual(presenter, (at0) ((Map.Entry) it.next()).getValue())) {
                    it.remove();
                    z4 = true;
                }
            }
        }
        return z4;
    }
}
