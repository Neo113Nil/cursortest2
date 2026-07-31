package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ls1<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1792a1 f28731a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c52 f28732b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final r91 f28733c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1816b1 f28734d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements InterfaceC1816b1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final r91 f28735a;

        public a(@NotNull r91 nativeRewardViewController) {
            Intrinsics.checkNotNullParameter(nativeRewardViewController, "nativeRewardViewController");
            this.f28735a = nativeRewardViewController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
        public final void a() {
            this.f28735a.c();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC1816b1
        public final void b() {
            this.f28735a.b();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ls1(C1792a1 c1792a1, d52 d52Var, a91 a91Var, t42 t42Var) {
        this(c1792a1, d52Var, a91Var, t42Var, r5, new a(r5));
        r91 r91Var = new r91(d52Var, a91Var, t42Var);
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f28731a.a(this.f28734d);
        this.f28733c.a(this.f28732b.b(container));
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        this.f28731a.b(this.f28734d);
        this.f28733c.a();
    }

    public ls1(@NotNull C1792a1 adActivityEventController, @NotNull d52 timerViewProvider, @NotNull a91 nativeMediaContent, @NotNull t42 timeProviderContainer, @NotNull r91 nativeRewardViewController, @NotNull InterfaceC1816b1 adActivityFocusListener) {
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(nativeRewardViewController, "nativeRewardViewController");
        Intrinsics.checkNotNullParameter(adActivityFocusListener, "adActivityFocusListener");
        this.f28731a = adActivityEventController;
        this.f28732b = timerViewProvider;
        this.f28733c = nativeRewardViewController;
        this.f28734d = adActivityFocusListener;
    }
}
