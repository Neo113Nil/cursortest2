package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.k62;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c71 implements View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f24076e = {C1873da.a(c71.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k62.a f24077a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y61 f24078b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private x61 f24079c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ao1 f24080d;

    public c71(@NotNull View view, @NotNull o81 trackingListener, @NotNull y61 globalLayoutListenerFactory) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        Intrinsics.checkNotNullParameter(globalLayoutListenerFactory, "globalLayoutListenerFactory");
        this.f24077a = trackingListener;
        this.f24078b = globalLayoutListenerFactory;
        this.f24080d = bo1.a(view);
    }

    public final void a() {
        ao1 ao1Var = this.f24080d;
        m2.h[] hVarArr = f24076e;
        View view = (View) ao1Var.getValue(this, hVarArr[0]);
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        View nativeAdView = (View) this.f24080d.getValue(this, hVarArr[0]);
        if (nativeAdView != null && nativeAdView.isAttachedToWindow()) {
            y61 y61Var = this.f24078b;
            k62.a trackingListener = this.f24077a;
            y61Var.getClass();
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
            x61 x61Var = new x61(nativeAdView, trackingListener);
            this.f24079c = x61Var;
            x61Var.a();
        }
    }

    public final void b() {
        x61 x61Var = this.f24079c;
        if (x61Var != null) {
            x61Var.b();
        }
        this.f24079c = null;
        View view = (View) this.f24080d.getValue(this, f24076e[0]);
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        this.f24077a.a();
        View nativeAdView = (View) this.f24080d.getValue(this, f24076e[0]);
        if (nativeAdView != null && nativeAdView.isAttachedToWindow()) {
            y61 y61Var = this.f24078b;
            k62.a trackingListener = this.f24077a;
            y61Var.getClass();
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
            x61 x61Var = new x61(nativeAdView, trackingListener);
            this.f24079c = x61Var;
            x61Var.a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        x61 x61Var = this.f24079c;
        if (x61Var != null) {
            x61Var.b();
        }
        this.f24079c = null;
        this.f24077a.b();
    }
}
