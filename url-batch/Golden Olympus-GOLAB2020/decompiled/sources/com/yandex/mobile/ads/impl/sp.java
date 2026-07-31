package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class sp<V extends ViewGroup> implements q00<V>, InterfaceC1816b1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f31892a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1792a1 f31893b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final bp f31894c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mr f31895d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final q41 f31896e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final sv f31897f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final t42 f31898g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private ep f31899h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final rl1 f31900i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final xo f31901j;

    private static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final mr f31902a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final sv f31903b;

        public a(@NotNull mr mContentCloseListener, @NotNull sv mDebugEventsReporter) {
            Intrinsics.checkNotNullParameter(mContentCloseListener, "mContentCloseListener");
            Intrinsics.checkNotNullParameter(mDebugEventsReporter, "mDebugEventsReporter");
            this.f31902a = mContentCloseListener;
            this.f31903b = mDebugEventsReporter;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f31902a.f();
            this.f31903b.a(rv.f31371c);
        }
    }

    public sp(@NotNull C2360y7<?> adResponse, @NotNull C1792a1 adActivityEventController, @NotNull bp closeAppearanceController, @NotNull mr contentCloseListener, @NotNull q41 nativeAdControlViewProvider, @NotNull sv debugEventsReporter, @NotNull t42 timeProviderContainer) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(closeAppearanceController, "closeAppearanceController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        this.f31892a = adResponse;
        this.f31893b = adActivityEventController;
        this.f31894c = closeAppearanceController;
        this.f31895d = contentCloseListener;
        this.f31896e = nativeAdControlViewProvider;
        this.f31897f = debugEventsReporter;
        this.f31898g = timeProviderContainer;
        this.f31900i = timeProviderContainer.e();
        this.f31901j = timeProviderContainer.b();
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        View c4 = this.f31896e.c(container);
        ProgressBar a4 = this.f31896e.a(container);
        if (c4 != null) {
            this.f31893b.a(this);
            Context context = c4.getContext();
            int i4 = ew1.f25476l;
            ew1 a5 = ew1.a.a();
            Intrinsics.checkNotNull(context);
            du1 a6 = a5.a(context);
            boolean z4 = false;
            boolean z5 = a6 != null && a6.z0();
            if (Intrinsics.areEqual(v00.f33455c.a(), this.f31892a.w()) && z5) {
                z4 = true;
            }
            if (!z4) {
                c4.setOnClickListener(new a(this.f31895d, this.f31897f));
            }
            a(c4, a4);
            if (c4.getTag() == null) {
                c4.setTag("close");
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
    public final void b() {
        ep epVar = this.f31899h;
        if (epVar != null) {
            epVar.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        this.f31893b.b(this);
        ep epVar = this.f31899h;
        if (epVar != null) {
            epVar.invalidate();
        }
    }

    private final void a(View view, ProgressBar progressBar) {
        ep azVar;
        Long u4 = this.f31892a.u();
        long longValue = u4 != null ? u4.longValue() : 0L;
        if (progressBar != null) {
            azVar = new kl1(view, progressBar, new w40(), new lp(new C2160pd()), this.f31897f, this.f31900i, longValue);
        } else {
            azVar = this.f31901j.a() ? new az(view, this.f31894c, this.f31897f, longValue, this.f31898g.c()) : null;
        }
        this.f31899h = azVar;
        if (azVar != null) {
            azVar.c();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
    public final void a() {
        ep epVar = this.f31899h;
        if (epVar != null) {
            epVar.a();
        }
    }
}
