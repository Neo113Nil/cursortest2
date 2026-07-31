package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ko1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1894e7 f28284a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f28285b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Handler f28286c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28287d;

    private final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C1894e7 f28288b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ko1 f28289c;

        public a(ko1 ko1Var, @NotNull C1894e7 adRenderingValidator) {
            Intrinsics.checkNotNullParameter(adRenderingValidator, "adRenderingValidator");
            this.f28289c = ko1Var;
            this.f28288b = adRenderingValidator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f28289c.f28287d) {
                return;
            }
            if (this.f28288b.a()) {
                this.f28289c.f28287d = true;
                this.f28289c.f28285b.a();
            } else {
                this.f28289c.f28286c.postDelayed(new a(this.f28289c, this.f28288b), 300L);
            }
        }
    }

    public interface b {
        void a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ko1(@NotNull C1894e7 adRenderValidator, @NotNull b adRenderedListener) {
        this(adRenderValidator, adRenderedListener, new Handler(Looper.getMainLooper()));
        Intrinsics.checkNotNullParameter(adRenderValidator, "adRenderValidator");
        Intrinsics.checkNotNullParameter(adRenderedListener, "adRenderedListener");
    }

    public final void a() {
        this.f28286c.post(new a(this, this.f28284a));
    }

    public final void b() {
        this.f28286c.removeCallbacksAndMessages(null);
    }

    public ko1(@NotNull C1894e7 adRenderValidator, @NotNull b adRenderedListener, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(adRenderValidator, "adRenderValidator");
        Intrinsics.checkNotNullParameter(adRenderedListener, "adRenderedListener");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f28284a = adRenderValidator;
        this.f28285b = adRenderedListener;
        this.f28286c = handler;
    }
}
