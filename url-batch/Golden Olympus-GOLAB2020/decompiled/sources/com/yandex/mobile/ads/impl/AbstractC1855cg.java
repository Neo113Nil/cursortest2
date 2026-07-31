package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.cg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1855cg<T, V> {
    @NotNull
    protected static C2276uf a(@NotNull String name, @NotNull String type, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new C2276uf(name, type, value, null, false, false);
    }

    @NotNull
    public abstract C2276uf a(Object obj, @NotNull String str);
}
