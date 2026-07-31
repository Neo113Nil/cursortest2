package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.q9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2179q9 implements f81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vb0 f30711a;

    public C2179q9(@NotNull vb0 noticeForceClickController) {
        Intrinsics.checkNotNullParameter(noticeForceClickController, "noticeForceClickController");
        this.f30711a = noticeForceClickController;
    }

    @Override // com.yandex.mobile.ads.impl.f81
    public final void a(@NotNull xj0 eventsObservable) {
        Intrinsics.checkNotNullParameter(eventsObservable, "eventsObservable");
        this.f30711a.a(eventsObservable);
    }
}
