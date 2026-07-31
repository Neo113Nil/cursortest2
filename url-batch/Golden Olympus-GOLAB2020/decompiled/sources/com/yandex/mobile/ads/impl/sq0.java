package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f31916a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f31917b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rq0<V> f31918c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final pq0<V> f31919d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final oq0<V> f31920e;

    public sq0(@NotNull Context context, @NotNull ViewGroup container, @NotNull ArrayList designs, @NotNull rq0 layoutDesignProvider, @NotNull pq0 layoutDesignCreator, @NotNull oq0 layoutDesignBinder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designs, "designs");
        Intrinsics.checkNotNullParameter(layoutDesignProvider, "layoutDesignProvider");
        Intrinsics.checkNotNullParameter(layoutDesignCreator, "layoutDesignCreator");
        Intrinsics.checkNotNullParameter(layoutDesignBinder, "layoutDesignBinder");
        this.f31916a = context;
        this.f31917b = container;
        this.f31918c = layoutDesignProvider;
        this.f31919d = layoutDesignCreator;
        this.f31920e = layoutDesignBinder;
    }

    public final boolean a() {
        V a4;
        nq0<V> a5 = this.f31918c.a(this.f31916a);
        if (a5 == null || (a4 = this.f31919d.a(this.f31917b, a5)) == null) {
            return false;
        }
        this.f31920e.a(this.f31917b, a4, a5);
        return true;
    }

    public final void b() {
        this.f31920e.a(this.f31917b);
    }
}
