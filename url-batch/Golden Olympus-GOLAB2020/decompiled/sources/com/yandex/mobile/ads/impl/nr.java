package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nr<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f29731a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1792a1 f29732b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2194r2 f29733c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a91 f29734d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final t42 f29735e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final q20 f29736f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final pr f29737g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final cr0 f29738h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private nc0 f29739i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private InterfaceC1816b1 f29740j;

    private final class a implements InterfaceC1816b1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
        public final void a() {
            nc0 nc0Var = ((nr) nr.this).f29739i;
            if (nc0Var != null) {
                nc0Var.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
        public final void b() {
            nc0 nc0Var = ((nr) nr.this).f29739i;
            if (nc0Var != null) {
                nc0Var.pause();
            }
        }
    }

    public /* synthetic */ nr(C2360y7 c2360y7, C1792a1 c1792a1, InterfaceC2194r2 interfaceC2194r2, a91 a91Var, t42 t42Var, q20 q20Var) {
        this(c2360y7, c1792a1, interfaceC2194r2, a91Var, t42Var, q20Var, new pr(), new cr0(0));
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        InterfaceC1816b1 interfaceC1816b1 = this.f29740j;
        if (interfaceC1816b1 != null) {
            this.f29732b.b(interfaceC1816b1);
        }
        nc0 nc0Var = this.f29739i;
        if (nc0Var != null) {
            nc0Var.invalidate();
        }
        this.f29738h.b();
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        a aVar = new a();
        this.f29732b.a(aVar);
        this.f29740j = aVar;
        this.f29738h.a(container);
        pr prVar = this.f29737g;
        C2360y7<?> adResponse = this.f29731a;
        InterfaceC2194r2 adCompleteListener = this.f29733c;
        a91 nativeMediaContent = this.f29734d;
        t42 timeProviderContainer = this.f29735e;
        q20 q20Var = this.f29736f;
        cr0 progressListener = this.f29738h;
        prVar.getClass();
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        nc0 a4 = new or(adResponse, adCompleteListener, nativeMediaContent, timeProviderContainer, q20Var, progressListener).a();
        a4.start();
        this.f29739i = a4;
    }

    public nr(@NotNull C2360y7<?> adResponse, @NotNull C1792a1 adActivityEventController, @NotNull InterfaceC2194r2 adCompleteListener, @NotNull a91 nativeMediaContent, @NotNull t42 timeProviderContainer, @Nullable q20 q20Var, @NotNull pr contentCompleteControllerProvider, @NotNull cr0 progressListener) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(contentCompleteControllerProvider, "contentCompleteControllerProvider");
        Intrinsics.checkNotNullParameter(progressListener, "progressListener");
        this.f29731a = adResponse;
        this.f29732b = adActivityEventController;
        this.f29733c = adCompleteListener;
        this.f29734d = nativeMediaContent;
        this.f29735e = timeProviderContainer;
        this.f29736f = q20Var;
        this.f29737g = contentCompleteControllerProvider;
        this.f29738h = progressListener;
    }
}
