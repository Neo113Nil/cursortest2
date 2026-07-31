package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l50 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<String> f28425a = kotlin.collections.T.c("sysconst-update");

    public final boolean a(@NotNull String param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return !this.f28425a.contains(param);
    }
}
