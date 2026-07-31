package com.yandex.mobile.ads.impl;

import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ct0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Queue<T> f24321a;

    public ct0(@NotNull Queue<T> queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f24321a = queue;
    }

    public final int a() {
        return this.f24321a.size();
    }

    @Nullable
    public final T b() {
        return this.f24321a.poll();
    }
}
