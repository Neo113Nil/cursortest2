package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cr0 implements sl1 {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f24294d = {kotlin.jvm.internal.H.d(new kotlin.jvm.internal.v(cr0.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final br0 f24295a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2160pd f24296b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f24297c;

    public cr0() {
        this(0);
    }

    @Override // com.yandex.mobile.ads.impl.sl1
    public final void a(long j4, long j5) {
        ProgressBar progressBar = (ProgressBar) this.f24297c.getValue(this, f24294d[0]);
        if (progressBar != null) {
            this.f24296b.getClass();
            C2160pd.a(progressBar, j4, j5);
        }
    }

    public final void b() {
        this.f24297c.setValue(this, f24294d[0], null);
    }

    public /* synthetic */ cr0(int i4) {
        this(new br0(), new C2160pd());
    }

    @Override // com.yandex.mobile.ads.impl.sl1
    public final void a() {
        ProgressBar progressBar = (ProgressBar) this.f24297c.getValue(this, f24294d[0]);
        if (progressBar != null) {
            long max = progressBar.getMax();
            this.f24296b.getClass();
            C2160pd.a(progressBar, max, max);
        }
    }

    public cr0(@NotNull br0 progressBarProvider, @NotNull C2160pd animatedProgressBarController) {
        Intrinsics.checkNotNullParameter(progressBarProvider, "progressBarProvider");
        Intrinsics.checkNotNullParameter(animatedProgressBarController, "animatedProgressBarController");
        this.f24295a = progressBarProvider;
        this.f24296b = animatedProgressBarController;
        this.f24297c = bo1.a(null);
    }

    public final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f24295a.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewWithTag = view.findViewWithTag("linear_progress_view");
        this.f24297c.setValue(this, f24294d[0], findViewWithTag instanceof ProgressBar ? (ProgressBar) findViewWithTag : null);
    }
}
