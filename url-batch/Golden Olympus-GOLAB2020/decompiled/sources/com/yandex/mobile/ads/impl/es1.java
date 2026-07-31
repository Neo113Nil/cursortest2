package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.ew1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class es1<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f25407a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1792a1 f25408b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mr f25409c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final q41 f25410d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a91 f25411e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final t42 f25412f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private final q20 f25413g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final jp f25414h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private nc0 f25415i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private es1<V>.b f25416j;

    private static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final mr f25417a;

        public a(@NotNull mr contentCloseListener) {
            Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
            this.f25417a = contentCloseListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f25417a.f();
        }
    }

    private final class b implements InterfaceC1816b1 {
        public b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
        public final void a() {
            nc0 nc0Var = ((es1) es1.this).f25415i;
            if (nc0Var != null) {
                nc0Var.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
        public final void b() {
            nc0 nc0Var = ((es1) es1.this).f25415i;
            if (nc0Var != null) {
                nc0Var.pause();
            }
        }
    }

    private static final class c implements mp {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f25419a;

        public c(@NotNull View closeView, @NotNull WeakReference<View> closeViewReference) {
            Intrinsics.checkNotNullParameter(closeView, "closeView");
            Intrinsics.checkNotNullParameter(closeViewReference, "closeViewReference");
            this.f25419a = closeViewReference;
        }

        @Override // com.yandex.mobile.ads.impl.mp
        public final void a() {
            View view = this.f25419a.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public es1(@NotNull C2360y7 adResponse, @NotNull C1792a1 adActivityEventController, @NotNull mr contentCloseListener, @NotNull s41 nativeAdControlViewProvider, @NotNull a91 nativeMediaContent, @NotNull t42 timeProviderContainer, @Nullable q20 q20Var, @NotNull jp closeControllerProvider) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdControlViewProvider, "nativeAdControlViewProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(closeControllerProvider, "closeControllerProvider");
        this.f25407a = adResponse;
        this.f25408b = adActivityEventController;
        this.f25409c = contentCloseListener;
        this.f25410d = nativeAdControlViewProvider;
        this.f25411e = nativeMediaContent;
        this.f25412f = timeProviderContainer;
        this.f25413g = q20Var;
        this.f25414h = closeControllerProvider;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        es1<V>.b bVar = this.f25416j;
        if (bVar != null) {
            this.f25408b.b(bVar);
        }
        nc0 nc0Var = this.f25415i;
        if (nc0Var != null) {
            nc0Var.invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        nc0 c81Var;
        nc0 ub1Var;
        Intrinsics.checkNotNullParameter(container, "container");
        View c4 = this.f25410d.c(container);
        if (c4 != null) {
            es1<V>.b bVar = new b();
            this.f25408b.a(bVar);
            this.f25416j = bVar;
            Context context = c4.getContext();
            int i4 = ew1.f25476l;
            ew1 a4 = ew1.a.a();
            Intrinsics.checkNotNull(context);
            du1 a5 = a4.a(context);
            boolean z4 = false;
            boolean z5 = a5 != null && a5.z0();
            if (Intrinsics.areEqual(v00.f33455c.a(), this.f25407a.w()) && z5) {
                z4 = true;
            }
            if (!z4) {
                c4.setOnClickListener(new a(this.f25409c));
            }
            c4.setVisibility(8);
            c closeShowListener = new c(c4, new WeakReference(c4));
            jp jpVar = this.f25414h;
            C2360y7<?> adResponse = this.f25407a;
            a91 nativeMediaContent = this.f25411e;
            t42 timeProviderContainer = this.f25412f;
            q20 q20Var = this.f25413g;
            jpVar.getClass();
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            Intrinsics.checkNotNullParameter(closeShowListener, "closeShowListener");
            Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
            Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
            ra1 a6 = nativeMediaContent.a();
            wb1 b4 = nativeMediaContent.b();
            nc0 nc0Var = null;
            if (Intrinsics.areEqual(q20Var != null ? q20Var.e() : null, w00.f33852d.a()) && timeProviderContainer.b().a()) {
                c81Var = new c81(adResponse, closeShowListener, timeProviderContainer);
            } else {
                if (a6 != null) {
                    ub1Var = new pa1(adResponse, a6, closeShowListener, timeProviderContainer, adResponse.u(), timeProviderContainer.c(), timeProviderContainer.b());
                } else if (b4 != null) {
                    ub1Var = new ub1(b4, closeShowListener);
                } else {
                    c81Var = timeProviderContainer.b().a() ? new c81(adResponse, closeShowListener, timeProviderContainer) : null;
                }
                c81Var = ub1Var;
            }
            if (c81Var != null) {
                c81Var.start();
                nc0Var = c81Var;
            }
            this.f25415i = nc0Var;
        }
    }
}
