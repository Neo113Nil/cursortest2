package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gy1 implements au0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final au0.a f26364a;

    public /* synthetic */ gy1() {
        this(new au0.a());
    }

    @Override // com.yandex.mobile.ads.impl.au0
    @NotNull
    public final au0.a a(int i4, int i5) {
        au0.a aVar = this.f26364a;
        aVar.f23449a = i4;
        aVar.f23450b = i5;
        return aVar;
    }

    public gy1(@NotNull au0.a measureSpecHolder) {
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        this.f26364a = measureSpecHolder;
    }
}
