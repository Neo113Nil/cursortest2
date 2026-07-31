package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ul2<T> implements InstreamAdBreakQueue<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct0<T> f33164a;

    public ul2(@NotNull ct0<T> manualAdBreakQueue) {
        Intrinsics.checkNotNullParameter(manualAdBreakQueue, "manualAdBreakQueue");
        this.f33164a = manualAdBreakQueue;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final int getCount() {
        return this.f33164a.a();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    @Nullable
    public final T poll() {
        return this.f33164a.b();
    }
}
