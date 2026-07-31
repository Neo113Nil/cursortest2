package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.mk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2098mk {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f29133a = new AtomicBoolean(false);

    public final boolean a() {
        return this.f29133a.get();
    }

    public final void b() {
        this.f29133a.set(true);
    }
}
