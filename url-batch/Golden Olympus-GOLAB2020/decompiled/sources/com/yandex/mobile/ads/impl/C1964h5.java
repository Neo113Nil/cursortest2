package com.yandex.mobile.ads.impl;

import androidx.media3.common.util.Assertions;
import com.yandex.mobile.ads.impl.C1892e5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.h5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1964h5 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1916f5 f26554a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1800a9 f26555b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1939g4 f26556c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mi1 f26557d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ai1 f26558e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C1892e5 f26559f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final in0 f26560g;

    public C1964h5(@NotNull C2361y8 adStateDataController, @NotNull ki1 playerStateController, @NotNull C1916f5 adPlayerEventsController, @NotNull C1800a9 adStateHolder, @NotNull C1939g4 adInfoStorage, @NotNull mi1 playerStateHolder, @NotNull ai1 playerAdPlaybackController, @NotNull C1892e5 adPlayerDiscardController, @NotNull in0 instreamSettings) {
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adInfoStorage, "adInfoStorage");
        Intrinsics.checkNotNullParameter(playerStateHolder, "playerStateHolder");
        Intrinsics.checkNotNullParameter(playerAdPlaybackController, "playerAdPlaybackController");
        Intrinsics.checkNotNullParameter(adPlayerDiscardController, "adPlayerDiscardController");
        Intrinsics.checkNotNullParameter(instreamSettings, "instreamSettings");
        this.f26554a = adPlayerEventsController;
        this.f26555b = adStateHolder;
        this.f26556c = adInfoStorage;
        this.f26557d = playerStateHolder;
        this.f26558e = playerAdPlaybackController;
        this.f26559f = adPlayerDiscardController;
        this.f26560g = instreamSettings;
    }

    public final void a(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        if (dm0.f24680d == this.f26555b.a(videoAd)) {
            this.f26555b.a(videoAd, dm0.f24681e);
            ti1 c4 = this.f26555b.c();
            Assertions.checkState(Intrinsics.areEqual(videoAd, c4 != null ? c4.d() : null));
            this.f26557d.a(false);
            this.f26558e.a();
            this.f26554a.c(videoAd);
        }
    }

    public final void b(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        dm0 a4 = this.f26555b.a(videoAd);
        if (dm0.f24678b == a4 || dm0.f24679c == a4) {
            this.f26555b.a(videoAd, dm0.f24680d);
            Object checkNotNull = Assertions.checkNotNull(this.f26556c.a(videoAd));
            Intrinsics.checkNotNullExpressionValue(checkNotNull, "checkNotNull(...)");
            this.f26555b.a(new ti1((C1819b4) checkNotNull, videoAd));
            this.f26554a.d(videoAd);
            return;
        }
        if (dm0.f24681e == a4) {
            ti1 c4 = this.f26555b.c();
            Assertions.checkState(Intrinsics.areEqual(videoAd, c4 != null ? c4.d() : null));
            this.f26555b.a(videoAd, dm0.f24680d);
            this.f26554a.e(videoAd);
        }
    }

    public final void e(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        C1892e5.b bVar = C1892e5.b.f25091b;
        C1892e5.a aVar = new C1892e5.a() { // from class: com.yandex.mobile.ads.impl.V4
            @Override // com.yandex.mobile.ads.impl.C1892e5.a
            public final void a() {
                C1964h5.b(C1964h5.this, videoAd);
            }
        };
        dm0 a4 = this.f26555b.a(videoAd);
        dm0 dm0Var = dm0.f24678b;
        if (dm0Var == a4) {
            C1819b4 a5 = this.f26556c.a(videoAd);
            if (a5 != null) {
                this.f26559f.a(a5, bVar, aVar);
                return;
            }
            return;
        }
        this.f26555b.a(videoAd, dm0Var);
        ti1 c4 = this.f26555b.c();
        if (c4 == null) {
            ap0.b(new Object[0]);
        } else {
            this.f26559f.a(c4.c(), bVar, aVar);
        }
    }

    public final void c(@NotNull on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        if (dm0.f24681e == this.f26555b.a(videoAd)) {
            this.f26555b.a(videoAd, dm0.f24680d);
            ti1 c4 = this.f26555b.c();
            Assertions.checkState(Intrinsics.areEqual(videoAd, c4 != null ? c4.d() : null));
            this.f26557d.a(true);
            this.f26558e.b();
            this.f26554a.e(videoAd);
        }
    }

    public final void d(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        C1892e5.b bVar = this.f26560g.f() ? C1892e5.b.f25092c : C1892e5.b.f25091b;
        C1892e5.a aVar = new C1892e5.a() { // from class: com.yandex.mobile.ads.impl.W4
            @Override // com.yandex.mobile.ads.impl.C1892e5.a
            public final void a() {
                C1964h5.a(C1964h5.this, videoAd);
            }
        };
        dm0 a4 = this.f26555b.a(videoAd);
        dm0 dm0Var = dm0.f24678b;
        if (dm0Var == a4) {
            C1819b4 a5 = this.f26556c.a(videoAd);
            if (a5 != null) {
                this.f26559f.a(a5, bVar, aVar);
                return;
            }
            return;
        }
        this.f26555b.a(videoAd, dm0Var);
        ti1 c4 = this.f26555b.c();
        if (c4 != null) {
            this.f26559f.a(c4.c(), bVar, aVar);
        } else {
            ap0.b(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1964h5 this$0, on0 videoAd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        this$0.f26554a.a(videoAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C1964h5 this$0, on0 videoAd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        this$0.f26554a.f(videoAd);
    }
}
