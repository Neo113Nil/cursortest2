package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class iu0 implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ml0 f6789f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ lu0 f6790g;

    iu0(lu0 lu0Var, ml0 ml0Var) {
        this.f6790g = lu0Var;
        this.f6789f = ml0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6790g.s(view, this.f6789f, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
