package com.yandex.mobile.ads.impl;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e00 {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f25042e = {C1873da.a(e00.class, "weakSkipButton", "getWeakSkipButton()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final az1 f25043a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25044b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final eg1 f25045c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ao1 f25046d;

    private static final class a implements gg1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final az1 f25047a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f25048b;

        public a(@NotNull View view, @NotNull az1 skipAppearanceController) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(skipAppearanceController, "skipAppearanceController");
            this.f25047a = skipAppearanceController;
            this.f25048b = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.gg1
        public final void a() {
            View view = this.f25048b.get();
            if (view != null) {
                this.f25047a.b(view);
            }
        }
    }

    public e00(@NotNull View skipButton, @NotNull az1 skipAppearanceController, long j4, @NotNull eg1 pausableTimer) {
        Intrinsics.checkNotNullParameter(skipButton, "skipButton");
        Intrinsics.checkNotNullParameter(skipAppearanceController, "skipAppearanceController");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f25043a = skipAppearanceController;
        this.f25044b = j4;
        this.f25045c = pausableTimer;
        this.f25046d = bo1.a(skipButton);
        skipAppearanceController.a(skipButton);
    }

    public final void a() {
        this.f25045c.invalidate();
    }

    public final void b() {
        View view = (View) this.f25046d.getValue(this, f25042e[0]);
        if (view != null) {
            a aVar = new a(view, this.f25043a);
            long j4 = this.f25044b;
            if (j4 == 0) {
                this.f25043a.b(view);
            } else {
                this.f25045c.a(j4, aVar);
            }
        }
    }

    public final void c() {
        this.f25045c.pause();
    }

    public final void d() {
        this.f25045c.resume();
    }
}
