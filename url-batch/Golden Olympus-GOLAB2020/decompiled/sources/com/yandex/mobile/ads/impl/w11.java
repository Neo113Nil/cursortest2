package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w11 implements ep {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f33869a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o82 f33870b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f33871c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33872d;

    private static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f33873b;

        public a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f33873b = new WeakReference<>(view);
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f33873b.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public w11(@NotNull FrameLayout closeButton, @NotNull o82 useCustomCloseHandler, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(useCustomCloseHandler, "useCustomCloseHandler");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f33869a = closeButton;
        this.f33870b = useCustomCloseHandler;
        this.f33871c = handler;
        d().setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void c() {
        if (this.f33872d) {
            return;
        }
        this.f33871c.postDelayed(new a(this.f33869a), 200L);
    }

    @Override // com.yandex.mobile.ads.impl.ep
    @NotNull
    public final View d() {
        return this.f33869a;
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void invalidate() {
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void a(boolean z4) {
        this.f33872d = true;
        this.f33871c.removeCallbacksAndMessages(null);
        o82 o82Var = this.f33870b;
        View closeButton = this.f33869a;
        o82Var.getClass();
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        closeButton.setVisibility(z4 ? 8 : 0);
    }
}
