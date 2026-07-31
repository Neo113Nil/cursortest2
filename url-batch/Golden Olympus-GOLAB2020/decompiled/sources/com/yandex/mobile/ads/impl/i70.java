package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.yandex.mobile.ads.impl.nh2;
import com.yandex.mobile.ads.impl.nh2.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class i70<T extends View & nh2.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f27117a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g70 f27118b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final se1 f27119c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Handler f27120d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private a f27121e;

    public static final class a<T extends View & nh2.a> implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ m2.h[] f27122f = {C1873da.a(a.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), C1873da.a(a.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Handler f27123b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final g70 f27124c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ao1 f27125d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ao1 f27126e;

        public a(@NotNull Handler handler, @NotNull View view, @NotNull g70 exposureProvider, @NotNull se1 exposureUpdateListener) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(exposureUpdateListener, "exposureUpdateListener");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(exposureProvider, "exposureProvider");
            this.f27123b = handler;
            this.f27124c = exposureProvider;
            this.f27125d = bo1.a(exposureUpdateListener);
            this.f27126e = bo1.a(view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            ao1 ao1Var = this.f27126e;
            m2.h[] hVarArr = f27122f;
            View view = (View) ao1Var.getValue(this, hVarArr[1]);
            se1 se1Var = (se1) this.f27125d.getValue(this, hVarArr[0]);
            if (view == null || se1Var == null) {
                return;
            }
            se1Var.a(this.f27124c.a(view));
            this.f27123b.postDelayed(this, 200L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i70(@NotNull Handler handler, @NotNull View view, @NotNull g70 exposureProvider, @NotNull se1 listener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(exposureProvider, "exposureProvider");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f27117a = view;
        this.f27118b = exposureProvider;
        this.f27119c = listener;
        this.f27120d = handler;
    }

    public final void a() {
        if (this.f27121e == null) {
            a aVar = new a(this.f27120d, this.f27117a, this.f27118b, this.f27119c);
            this.f27121e = aVar;
            this.f27120d.post(aVar);
        }
    }

    public final void b() {
        this.f27120d.removeCallbacksAndMessages(null);
        this.f27121e = null;
    }

    public /* synthetic */ i70(View view, g70 g70Var, se1 se1Var) {
        this(new Handler(Looper.getMainLooper()), view, g70Var, se1Var);
    }
}
