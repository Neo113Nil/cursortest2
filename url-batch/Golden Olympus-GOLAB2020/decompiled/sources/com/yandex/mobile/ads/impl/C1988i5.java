package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.Assertions;
import com.yandex.mobile.ads.impl.C1868d5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1988i5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1940g5 f27082a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1824b9 f27083b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1963h4 f27084c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ni1 f27085d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final bi1 f27086e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C1868d5 f27087f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final in0 f27088g;

    public C1988i5(@NotNull C2384z8 adStateDataController, @NotNull li1 playerStateController, @NotNull C1940g5 adPlayerEventsController, @NotNull C1824b9 adStateHolder, @NotNull C1963h4 adInfoStorage, @NotNull ni1 playerStateHolder, @NotNull bi1 playerAdPlaybackController, @NotNull C1868d5 adPlayerDiscardController, @NotNull in0 instreamSettings) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerAdPlaybackController, "playerAdPlaybackController");
        Intrinsics.checkNotNullParameter(adPlayerDiscardController, "adPlayerDiscardController");
        Intrinsics.checkNotNullParameter(instreamSettings, "instreamSettings");
        this.f27082a = adPlayerEventsController;
        this.f27083b = adStateHolder;
        this.f27084c = adInfoStorage;
        this.f27085d = playerStateHolder;
        this.f27086e = playerAdPlaybackController;
        this.f27087f = adPlayerDiscardController;
        this.f27088g = instreamSettings;
    }

    public final void a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        if (em0.f25353d == this.f27083b.a(videoAd)) {
            this.f27083b.a(videoAd, em0.f25354e);
            ui1 c4 = this.f27083b.c();
            Assertions.checkState(Intrinsics.areEqual(videoAd, c4 != null ? c4.d() : null));
            this.f27085d.a(false);
            this.f27086e.a();
            this.f27082a.c(videoAd);
        }
    }

    public final void b(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        em0 a4 = this.f27083b.a(videoAd);
        if (em0.f25351b == a4 || em0.f25352c == a4) {
            this.f27083b.a(videoAd, em0.f25353d);
            Object checkNotNull = Assertions.checkNotNull(this.f27084c.a(videoAd));
            Intrinsics.checkNotNullExpressionValue(checkNotNull, "checkNotNull(...)");
            this.f27083b.a(new ui1((C1843c4) checkNotNull, videoAd));
            this.f27082a.d(videoAd);
            return;
        }
        if (em0.f25354e == a4) {
            ui1 c4 = this.f27083b.c();
            Assertions.checkState(Intrinsics.areEqual(videoAd, c4 != null ? c4.d() : null));
            this.f27083b.a(videoAd, em0.f25353d);
            this.f27082a.e(videoAd);
        }
    }

    public final void e(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        C1868d5.b bVar = C1868d5.b.f24424b;
        C1868d5.a aVar = new C1868d5.a() { // from class: com.yandex.mobile.ads.impl.W6
            @Override // com.yandex.mobile.ads.impl.C1868d5.a
            public final void a() {
                C1988i5.b(C1988i5.this, videoAd);
            }
        };
        em0 a4 = this.f27083b.a(videoAd);
        em0 em0Var = em0.f25351b;
        if (em0Var == a4) {
            C1843c4 a5 = this.f27084c.a(videoAd);
            if (a5 != null) {
                this.f27087f.a(a5, bVar, aVar);
                return;
            }
            return;
        }
        this.f27083b.a(videoAd, em0Var);
        ui1 c4 = this.f27083b.c();
        if (c4 == null) {
            ap0.b(new Object[0]);
        } else {
            this.f27087f.a(c4.c(), bVar, aVar);
        }
    }

    public final void c(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        if (em0.f25354e == this.f27083b.a(videoAd)) {
            this.f27083b.a(videoAd, em0.f25353d);
            ui1 c4 = this.f27083b.c();
            Assertions.checkState(Intrinsics.areEqual(videoAd, c4 != null ? c4.d() : null));
            this.f27085d.a(true);
            this.f27086e.b();
            this.f27082a.e(videoAd);
        }
    }

    public final void d(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        C1868d5.b bVar = this.f27088g.f() ? C1868d5.b.f24425c : C1868d5.b.f24424b;
        C1868d5.a aVar = new C1868d5.a() { // from class: com.yandex.mobile.ads.impl.X6
            @Override // com.yandex.mobile.ads.impl.C1868d5.a
            public final void a() {
                C1988i5.a(C1988i5.this, videoAd);
            }
        };
        em0 a4 = this.f27083b.a(videoAd);
        em0 em0Var = em0.f25351b;
        if (em0Var == a4) {
            C1843c4 a5 = this.f27084c.a(videoAd);
            if (a5 != null) {
                this.f27087f.a(a5, bVar, aVar);
                return;
            }
            return;
        }
        this.f27083b.a(videoAd, em0Var);
        ui1 c4 = this.f27083b.c();
        if (c4 != null) {
            this.f27087f.a(c4.c(), bVar, aVar);
        } else {
            ap0.b(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1988i5 this$0, on0 videoAd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        this$0.f27082a.a(videoAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1988i5 this$0, on0 videoAd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        this$0.f27082a.f(videoAd);
    }
}
