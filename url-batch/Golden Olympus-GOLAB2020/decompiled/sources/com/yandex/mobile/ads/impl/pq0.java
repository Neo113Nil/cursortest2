package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final at1<V> f30532a;

    public /* synthetic */ pq0() {
        this(new at1());
    }

    @Nullable
    public final V a(@NotNull ViewGroup container, @NotNull nq0<V> layoutDesign) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(layoutDesign, "layoutDesign");
        Context context = container.getContext();
        int c4 = layoutDesign.c();
        Class<V> d4 = layoutDesign.d();
        at1<V> at1Var = this.f30532a;
        Intrinsics.checkNotNull(context);
        at1Var.getClass();
        return (V) at1.a(context, d4, c4, container);
    }

    public pq0(@NotNull at1<V> safeLayoutInflater) {
        Intrinsics.checkNotNullParameter(safeLayoutInflater, "safeLayoutInflater");
        this.f30532a = safeLayoutInflater;
    }
}
