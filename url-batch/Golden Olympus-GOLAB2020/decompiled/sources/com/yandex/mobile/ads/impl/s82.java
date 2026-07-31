package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class s82 implements r82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q82 f31628a;

    public s82(@NotNull q82 userAgentCreator) {
        Intrinsics.checkNotNullParameter(userAgentCreator, "userAgentCreator");
        this.f31628a = userAgentCreator;
    }

    @Override // com.yandex.mobile.ads.impl.r82
    @NotNull
    public final String a() {
        return this.f31628a.a();
    }
}
