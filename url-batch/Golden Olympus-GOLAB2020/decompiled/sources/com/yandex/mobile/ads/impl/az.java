package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.eg1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class az implements ep {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f23517a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bp f23518b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sv f23519c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23520d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final np f23521e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final eg1 f23522f;

    private static final class a implements gg1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final bp f23523a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final sv f23524b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f23525c;

        public a(@NotNull View view, @NotNull bp closeAppearanceController, @NotNull sv debugEventsReporter) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
            Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
            this.f23523a = closeAppearanceController;
            this.f23524b = debugEventsReporter;
            this.f23525c = new WeakReference<>(view);
        }

        @Override // com.yandex.mobile.ads.impl.gg1
        public final void a() {
            View view = this.f23525c.get();
            if (view != null) {
                this.f23523a.b(view);
                this.f23524b.a(rv.f31373e);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az(View view, bp bpVar, sv svVar, long j4, np npVar) {
        this(view, bpVar, svVar, j4, npVar, eg1.a.a(true));
        int i4 = eg1.f25287a;
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void a(boolean z4) {
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void b() {
        this.f23522f.pause();
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void c() {
        a aVar = new a(this.f23517a, this.f23518b, this.f23519c);
        long max = (long) Math.max(0.0d, this.f23520d - this.f23521e.a());
        if (max == 0) {
            this.f23518b.b(this.f23517a);
            return;
        }
        this.f23522f.a(this.f23521e);
        this.f23522f.a(max, aVar);
        this.f23519c.a(rv.f31372d);
    }

    @Override // com.yandex.mobile.ads.impl.ep
    @NotNull
    public final View d() {
        return this.f23517a;
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void invalidate() {
        this.f23522f.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.ep
    public final void a() {
        this.f23522f.resume();
    }

    public az(@NotNull View closeButton, @NotNull bp closeAppearanceController, @NotNull sv debugEventsReporter, long j4, @NotNull np closeTimerProgressIncrementer, @NotNull eg1 pausableTimer) {
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f23517a = closeButton;
        this.f23518b = closeAppearanceController;
        this.f23519c = debugEventsReporter;
        this.f23520d = j4;
        this.f23521e = closeTimerProgressIncrementer;
        this.f23522f = pausableTimer;
        closeAppearanceController.a(d());
    }
}
