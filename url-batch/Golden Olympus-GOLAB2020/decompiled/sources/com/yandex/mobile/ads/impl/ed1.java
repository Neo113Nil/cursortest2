package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ed1 implements wb0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gd1 f25237a;

    public ed1(@NotNull r21 noticeTrackingManager) {
        Intrinsics.checkNotNullParameter(noticeTrackingManager, "noticeTrackingManager");
        this.f25237a = noticeTrackingManager;
    }

    @Override // com.yandex.mobile.ads.impl.wb0
    public final void a() {
        this.f25237a.c();
    }
}
