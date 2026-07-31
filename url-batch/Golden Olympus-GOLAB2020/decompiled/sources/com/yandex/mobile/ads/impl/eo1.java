package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class eo1 extends vf0 implements mh2 {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final a f25373A;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final vo0 f25374x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final C1897ea f25375y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f25376z;

    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ap0.d(new Object[0]);
            eo1.this.b(eo1.this.e().a());
        }
    }

    public /* synthetic */ eo1(Context context, vo0 vo0Var, C2105n4 c2105n4) {
        this(context, vo0Var, c2105n4, new C1897ea(vo0Var));
    }

    private final void x() {
        ap0.d(new Object[0]);
        l().removeCallbacks(this.f25373A);
        ap0.d(new Object[0]);
        C2360y7<String> j4 = j();
        if (j4 != null && j4.U() && this.f25376z && !n() && this.f25375y.b()) {
            l().postDelayed(this.f25373A, j4.g());
            ap0.d(Integer.valueOf(j4.h()));
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj, com.yandex.mobile.ads.impl.yg1.b
    public final void a(@NotNull vg1 phoneState) {
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        super.a(phoneState);
        x();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public final void b(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.b(error);
        if (5 == error.b() || 2 == error.b()) {
            return;
        }
        x();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public void c() {
        super.c();
        this.f25374x.removeVisibilityChangeListener(this);
        ap0.d(new Object[0]);
        this.f25376z = false;
        l().removeCallbacks(this.f25373A);
        ap0.d(new Object[0]);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    protected final void r() {
        super.r();
        x();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo1(@NotNull Context context, @NotNull vo0 adView, @NotNull C2105n4 adLoadingPhasesManager, @NotNull C1897ea adViewVisibilityValidator) {
        super(context, adView.getAdConfiguration$mobileads_externalRelease(), adLoadingPhasesManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(adViewVisibilityValidator, "adViewVisibilityValidator");
        this.f25374x = adView;
        this.f25375y = adViewVisibilityValidator;
        this.f25376z = true;
        this.f25373A = new a();
        adView.addVisibilityChangeListener(this);
    }

    @Override // com.yandex.mobile.ads.impl.mh2
    public final void a(int i4) {
        x();
    }
}
