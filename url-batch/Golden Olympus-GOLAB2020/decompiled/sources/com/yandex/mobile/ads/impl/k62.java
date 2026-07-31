package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k62 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1911f0 f28080a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d71 f28081b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m62 f28082c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private l62 f28083d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private c71 f28084e;

    public interface a {
        void a();

        void b();
    }

    public /* synthetic */ k62() {
        this(new C1911f0(), new d71(), new m62());
    }

    public final void a(@NotNull View nativeAdView, @NotNull o81 trackingListener) {
        C1887e0 c1887e0;
        Object obj;
        C1887e0 c1887e02;
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        Context context = nativeAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        l62 l62Var = this.f28083d;
        if (l62Var != null) {
            l62Var.a(context);
        }
        Activity activityContext = null;
        this.f28083d = null;
        c71 c71Var = this.f28084e;
        if (c71Var != null) {
            c71Var.b();
        }
        this.f28084e = null;
        C1911f0 c1911f0 = this.f28080a;
        Context context2 = nativeAdView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        c1911f0.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        int i4 = 0;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            }
            int i5 = i4 + 1;
            if (i4 >= 10) {
                break;
            }
            if (context2 instanceof Activity) {
                activityContext = (Activity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
                i4 = i5;
            }
        }
        if (activityContext != null) {
            this.f28082c.getClass();
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
            c1887e0 = C1887e0.f25035g;
            if (c1887e0 == null) {
                obj = C1887e0.f25034f;
                synchronized (obj) {
                    c1887e02 = C1887e0.f25035g;
                    if (c1887e02 == null) {
                        c1887e02 = new C1887e0();
                        C1887e0.f25035g = c1887e02;
                    }
                }
                c1887e0 = c1887e02;
            }
            l62 l62Var2 = new l62(activityContext, trackingListener, c1887e0);
            this.f28083d = l62Var2;
            l62Var2.c(activityContext);
        }
        this.f28081b.getClass();
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        c71 c71Var2 = new c71(nativeAdView, trackingListener, new y61());
        this.f28084e = c71Var2;
        c71Var2.a();
    }

    public k62(@NotNull C1911f0 activityContextProvider, @NotNull d71 windowAttachListenerFactory, @NotNull m62 activityLifecycleListenerFactory) {
        Intrinsics.checkNotNullParameter(activityContextProvider, "activityContextProvider");
        Intrinsics.checkNotNullParameter(windowAttachListenerFactory, "windowAttachListenerFactory");
        Intrinsics.checkNotNullParameter(activityLifecycleListenerFactory, "activityLifecycleListenerFactory");
        this.f28080a = activityContextProvider;
        this.f28081b = windowAttachListenerFactory;
        this.f28082c = activityLifecycleListenerFactory;
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        l62 l62Var = this.f28083d;
        if (l62Var != null) {
            l62Var.a(context);
        }
        this.f28083d = null;
        c71 c71Var = this.f28084e;
        if (c71Var != null) {
            c71Var.b();
        }
        this.f28084e = null;
    }
}
