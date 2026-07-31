package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ao1 implements kotlin.properties.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private WeakReference<Object> f23392a;

    ao1(Object obj) {
        this.f23392a = new WeakReference<>(obj);
    }

    @Override // kotlin.properties.c
    @Nullable
    public final Object getValue(@Nullable Object obj, @NotNull m2.h property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f23392a.get();
    }

    @Override // kotlin.properties.c
    public final void setValue(@Nullable Object obj, @NotNull m2.h property, @Nullable Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f23392a = new WeakReference<>(obj2);
    }
}
