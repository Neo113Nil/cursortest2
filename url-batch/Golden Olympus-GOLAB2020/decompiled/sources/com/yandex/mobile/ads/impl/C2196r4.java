package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2196r4 implements f81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wb0 f31026a;

    public C2196r4(@NotNull wb0 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f31026a = forceImpressionTrackingListener;
    }

    @Override // com.yandex.mobile.ads.impl.f81
    public final void a(@NotNull xj0 eventsObservable) {
        Intrinsics.checkNotNullParameter(eventsObservable, "eventsObservable");
        eventsObservable.a(this.f31026a);
    }
}
