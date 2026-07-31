package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ji1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1824b9 f27658a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2263u2 f27659b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final be2 f27660c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1940g5 f27661d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27662e;

    public ji1(@NotNull C1824b9 adStateHolder, @NotNull C2263u2 adCompletionListener, @NotNull be2 videoCompletedNotifier, @NotNull C1940g5 adPlayerEventsController) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adCompletionListener, "adCompletionListener");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        this.f27658a = adStateHolder;
        this.f27659b = adCompletionListener;
        this.f27660c = videoCompletedNotifier;
        this.f27661d = adPlayerEventsController;
    }

    public final void a(boolean z4, int i4) {
        ui1 c4 = this.f27658a.c();
        if (c4 == null) {
            return;
        }
        C1843c4 a4 = c4.a();
        on0 b4 = c4.b();
        if (em0.f25351b == this.f27658a.a(b4)) {
            if (z4 && i4 == 2) {
                this.f27660c.c();
                return;
            }
            return;
        }
        if (i4 == 2) {
            this.f27662e = true;
            this.f27661d.i(b4);
        } else if (i4 == 3 && this.f27662e) {
            this.f27662e = false;
            this.f27661d.h(b4);
        } else if (i4 == 4) {
            this.f27659b.a(a4, b4);
        }
    }
}
