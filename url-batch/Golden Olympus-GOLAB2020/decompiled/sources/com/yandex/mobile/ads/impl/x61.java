package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.k62;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x61 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f34459d = {C1873da.a(x61.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k62.a f34460a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ao1 f34461b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private Integer f34462c;

    public x61(@NotNull View view, @NotNull k62.a trackingListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        this.f34460a = trackingListener;
        this.f34461b = bo1.a(view);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f34461b.getValue(this, f34459d[0]);
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    public final void b() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f34461b.getValue(this, f34459d[0]);
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = (View) this.f34461b.getValue(this, f34459d[0]);
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.f34462c;
            if (num != null && visibility == num.intValue()) {
                return;
            }
            this.f34462c = Integer.valueOf(visibility);
            if (visibility == 0) {
                this.f34460a.a();
            } else {
                this.f34460a.b();
            }
        }
    }
}
