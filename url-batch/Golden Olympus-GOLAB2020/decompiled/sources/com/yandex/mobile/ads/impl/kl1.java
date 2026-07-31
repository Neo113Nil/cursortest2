package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.eg1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kl1 implements ep {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f28229a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ProgressBar f28230b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bp f28231c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final lp f28232d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final sv f28233e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final rl1 f28234f;

    /* renamed from: g, reason: collision with root package name */
    private final long f28235g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final eg1 f28236h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final gg1 f28237i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final b52 f28238j;

    private static final class a implements b52 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final lp f28239a;

        /* renamed from: b, reason: collision with root package name */
        private final long f28240b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final WeakReference<ProgressBar> f28241c;

        public a(@NotNull ProgressBar progressView, @NotNull lp closeProgressAppearanceController, long j4) {
            Intrinsics.checkNotNullParameter(progressView, "progressView");
            Intrinsics.checkNotNullParameter(closeProgressAppearanceController, "closeProgressAppearanceController");
            this.f28239a = closeProgressAppearanceController;
            this.f28240b = j4;
            this.f28241c = new WeakReference<>(progressView);
        }

        @Override // com.yandex.mobile.ads.impl.b52
        public final void a(long j4, long j5) {
            ProgressBar progressBar = this.f28241c.get();
            if (progressBar != null) {
                lp lpVar = this.f28239a;
                long j6 = this.f28240b;
                lpVar.a(progressBar, j6, j6 - j4);
            }
        }
    }

    private static final class b implements gg1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final bp f28242a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final sv f28243b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f28244c;

        public b(@NotNull View closeView, @NotNull w40 closeAppearanceController, @NotNull sv debugEventsReporter) {
            Intrinsics.checkNotNullParameter(closeView, "closeView");
            Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f28242a = closeAppearanceController;
            this.f28243b = debugEventsReporter;
            this.f28244c = new WeakReference<>(closeView);
        }

        @Override // com.yandex.mobile.ads.impl.gg1
        public final void a() {
            View view = this.f28244c.get();
            if (view != null) {
                this.f28242a.b(view);
                this.f28243b.a(rv.f31373e);
            }
        }
    }

    public kl1(@NotNull View closeButton, @NotNull ProgressBar closeProgressView, @NotNull w40 closeAppearanceController, @NotNull lp closeProgressAppearanceController, @NotNull sv debugEventsReporter, @NotNull rl1 progressIncrementer, long j4) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(closeProgressView, "closeProgressView");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        Intrinsics.checkNotNullParameter(closeProgressAppearanceController, "closeProgressAppearanceController");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(progressIncrementer, "progressIncrementer");
        this.f28229a = closeButton;
        this.f28230b = closeProgressView;
        this.f28231c = closeAppearanceController;
        this.f28232d = closeProgressAppearanceController;
        this.f28233e = debugEventsReporter;
        this.f28234f = progressIncrementer;
        this.f28235g = j4;
        int i4 = eg1.f25287a;
        this.f28236h = eg1.a.a(true);
        this.f28237i = new b(d(), closeAppearanceController, debugEventsReporter);
        this.f28238j = new a(closeProgressView, closeProgressAppearanceController, j4);
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void a(boolean z4) {
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void b() {
        this.f28236h.pause();
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void c() {
        lp lpVar = this.f28232d;
        ProgressBar progressBar = this.f28230b;
        int i4 = (int) this.f28235g;
        int a4 = (int) this.f28234f.a();
        lpVar.getClass();
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        progressBar.setMax(i4);
        progressBar.setVisibility(0);
        progressBar.setProgress(a4);
        long max = Math.max(0L, this.f28235g - this.f28234f.a());
        if (max != 0) {
            this.f28231c.a(this.f28229a);
            this.f28236h.a(this.f28238j);
            this.f28236h.a(max, this.f28237i);
            this.f28233e.a(rv.f31372d);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ep
    @NotNull
    public final View d() {
        return this.f28229a;
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void invalidate() {
        this.f28236h.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void a() {
        this.f28236h.resume();
    }
}
