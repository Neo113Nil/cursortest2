package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ci0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final AtomicLong f24220a = new AtomicLong();

    public static final long a() {
        return f24220a.getAndIncrement();
    }
}
