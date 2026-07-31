package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kk0 f27702a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f27703b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final uh2 f27704c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ro0 f27705d;

    private final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final v61 f27706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ jk0 f27707c;

        public a(jk0 jk0Var, @NotNull v61 nativeAdViewAdapter) {
            Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
            this.f27707c = jk0Var;
            this.f27706b = nativeAdViewAdapter;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View f4 = this.f27706b.f();
            if (f4 instanceof FrameLayout) {
                ro0 ro0Var = this.f27707c.f27705d;
                FrameLayout frameLayout = (FrameLayout) f4;
                Context context = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                this.f27707c.f27702a.a(ro0Var.a(context), frameLayout);
                this.f27707c.f27703b.postDelayed(new a(this.f27707c, this.f27706b), 300L);
            }
        }
    }

    public /* synthetic */ jk0(aa1 aa1Var, List list) {
        this(aa1Var, list, new kk0(), new Handler(Looper.getMainLooper()), new uh2(), so0.a(aa1Var, list));
    }

    public final void a(@NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f27703b.removeCallbacksAndMessages(null);
        View f4 = nativeAdViewAdapter.f();
        if (f4 instanceof FrameLayout) {
            this.f27702a.a((FrameLayout) f4);
        }
    }

    public jk0(@NotNull aa1 nativeValidator, @NotNull List<tx1> showNotices, @NotNull kk0 indicatorPresenter, @NotNull Handler handler, @NotNull uh2 availabilityChecker, @NotNull ro0 integrationValidator) {
        Intrinsics.checkNotNullParameter(nativeValidator, "nativeValidator");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        Intrinsics.checkNotNullParameter(indicatorPresenter, "indicatorPresenter");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        Intrinsics.checkNotNullParameter(integrationValidator, "integrationValidator");
        this.f27702a = indicatorPresenter;
        this.f27703b = handler;
        this.f27704c = availabilityChecker;
        this.f27705d = integrationValidator;
    }

    public final void a(@NotNull Context context, @NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f27704c.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = ew1.f25476l;
        ew1 a4 = ew1.a.a();
        du1 a5 = a4.a(context);
        Boolean D02 = a5 != null ? a5.D0() : null;
        boolean g4 = a4.g();
        boolean h4 = a4.h();
        if (D02 != null) {
            if (!D02.booleanValue()) {
                return;
            }
        } else if ((!g4 || !C2385z9.a(context)) && !h4) {
            return;
        }
        this.f27703b.post(new a(this, nativeAdViewAdapter));
    }

    public final void a() {
        this.f27703b.removeCallbacksAndMessages(null);
    }
}
