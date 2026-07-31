package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.in0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e10 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25057a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e10(C2308w1 c2308w1) {
        this(c2308w1, in0.a.a());
        int i4 = in0.f27295g;
    }

    public final boolean a() {
        return this.f25057a;
    }

    public e10(@NotNull C2308w1 adBreak, @NotNull in0 instreamSettings) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(instreamSettings, "instreamSettings");
        this.f25057a = CollectionsKt.contains(instreamSettings.c(), adBreak.c());
    }
}
