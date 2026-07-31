package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ii1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1800a9 f27209a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2240t2 f27210b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ae2 f27211c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1916f5 f27212d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27213e;

    public ii1(@NotNull C1800a9 adStateHolder, @NotNull C2240t2 adCompletionListener, @NotNull ae2 videoCompletedNotifier, @NotNull C1916f5 adPlayerEventsController) {
        Intrinsics.checkNotNullParameter(adStateHolder, "adStateHolder");
        Intrinsics.checkNotNullParameter(adCompletionListener, "adCompletionListener");
        Intrinsics.checkNotNullParameter(videoCompletedNotifier, "videoCompletedNotifier");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        this.f27209a = adStateHolder;
        this.f27210b = adCompletionListener;
        this.f27211c = videoCompletedNotifier;
        this.f27212d = adPlayerEventsController;
    }

    public final void a(boolean z4, int i4) {
        ti1 c4 = this.f27209a.c();
        if (c4 == null) {
            return;
        }
        C1819b4 a4 = c4.a();
        on0 b4 = c4.b();
        if (dm0.f24678b == this.f27209a.a(b4)) {
            if (z4 && i4 == 2) {
                this.f27211c.c();
                return;
            }
            return;
        }
        if (i4 == 2) {
            this.f27213e = true;
            this.f27212d.i(b4);
        } else if (i4 == 3 && this.f27213e) {
            this.f27213e = false;
            this.f27212d.h(b4);
        } else if (i4 == 4) {
            this.f27210b.a(a4, b4);
        }
    }
}
