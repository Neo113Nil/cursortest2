package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private q00<V> f30152a;

    public final void a(@NotNull ViewGroup container, @NotNull V designView, @NotNull nq0<V> layoutDesign) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designView, "designView");
        Intrinsics.checkNotNullParameter(layoutDesign, "layoutDesign");
        try {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            container.removeAllViews();
            container.addView(designView, layoutParams);
        } catch (Throwable unused) {
        }
        q00<V> a4 = layoutDesign.a();
        this.f30152a = a4;
        if (a4 != null) {
            a4.a(designView);
        }
    }

    public final void a(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        try {
            container.removeAllViews();
            q00<V> q00Var = this.f30152a;
            if (q00Var != null) {
                q00Var.c();
            }
        } catch (Throwable unused) {
        }
    }
}
