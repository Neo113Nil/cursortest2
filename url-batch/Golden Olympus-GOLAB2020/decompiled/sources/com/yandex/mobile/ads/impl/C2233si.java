package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.si, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2233si<T extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f31754a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f31755b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rq0<T> f31756c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final pq0<T> f31757d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2210ri<T> f31758e;

    public /* synthetic */ C2233si(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, list, onPreDrawListener, new rq0(list), new pq0(), new C2210ri(onPreDrawListener));
    }

    public final boolean a(@Nullable vy1 vy1Var) {
        T a4;
        nq0<T> a5 = this.f31756c.a(this.f31754a);
        if (a5 == null || (a4 = this.f31757d.a(this.f31755b, a5)) == null) {
            return false;
        }
        this.f31758e.a(this.f31755b, a4, a5, vy1Var);
        return true;
    }

    public final void a() {
        this.f31758e.a();
    }

    public C2233si(@NotNull Context context, @NotNull ViewGroup container, @NotNull List<nq0<T>> designs, @NotNull ViewTreeObserver.OnPreDrawListener preDrawListener, @NotNull rq0<T> layoutDesignProvider, @NotNull pq0<T> layoutDesignCreator, @NotNull C2210ri<T> layoutDesignBinder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designs, "designs");
        Intrinsics.checkNotNullParameter(preDrawListener, "preDrawListener");
        Intrinsics.checkNotNullParameter(layoutDesignProvider, "layoutDesignProvider");
        Intrinsics.checkNotNullParameter(layoutDesignCreator, "layoutDesignCreator");
        Intrinsics.checkNotNullParameter(layoutDesignBinder, "layoutDesignBinder");
        this.f31754a = context;
        this.f31755b = container;
        this.f31756c = layoutDesignProvider;
        this.f31757d = layoutDesignCreator;
        this.f31758e = layoutDesignBinder;
    }
}
