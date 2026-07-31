package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g11 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f25978a = new AtomicBoolean(false);

    public static final void a() {
        if (f25978a.compareAndSet(false, true)) {
            po0.b("Yandex Mobile Ads 7.15.0 initialized successfully", new Object[0]);
        }
    }
}
