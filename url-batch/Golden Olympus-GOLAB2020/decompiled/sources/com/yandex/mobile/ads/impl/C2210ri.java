package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ri, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2210ri<T extends ViewGroup> {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f31211d = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(C2210ri.class, "parentDesignView", "getParentDesignView()Landroid/view/ViewGroup;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserver.OnPreDrawListener f31212a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private q00<T> f31213b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f31214c;

    public C2210ri(@NotNull ViewTreeObserver.OnPreDrawListener preDrawListener) {
        Intrinsics.checkNotNullParameter(preDrawListener, "preDrawListener");
        this.f31212a = preDrawListener;
        this.f31214c = bo1.a(null);
    }

    public final void a(@NotNull ViewGroup container, @NotNull T contentView, @NotNull nq0<T> layoutDesign, @Nullable vy1 vy1Var) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(contentView, "designView");
        Intrinsics.checkNotNullParameter(layoutDesign, "layoutDesign");
        this.f31214c.setValue(this, f31211d[0], contentView);
        container.setVisibility(0);
        container.removeAllViews();
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f31212a;
        int i4 = og2.f30037b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        if (container.indexOfChild(contentView) == -1) {
            RelativeLayout.LayoutParams a4 = C2314w7.a(context, vy1Var);
            container.setVisibility(0);
            contentView.setVisibility(0);
            container.addView(contentView, a4);
            if (onPreDrawListener != null) {
                lh2.a(contentView, onPreDrawListener);
            }
        }
        q00<T> a5 = layoutDesign.a();
        this.f31213b = a5;
        if (a5 != null) {
            a5.a(contentView);
        }
    }

    public final void a() {
        ViewGroup viewGroup = (ViewGroup) this.f31214c.getValue(this, f31211d[0]);
        if (viewGroup != null) {
            pg2.a(viewGroup);
        }
        q00<T> q00Var = this.f31213b;
        if (q00Var != null) {
            q00Var.c();
        }
    }
}
