package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class it0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y00 f27389a;

    public /* synthetic */ it0() {
        this(new y00(0));
    }

    public final boolean a() {
        this.f27389a.getClass();
        return StringsKt.w("Xiaomi", y00.a(), true);
    }

    public it0(@NotNull y00 deviceInfoProvider) {
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        this.f27389a = deviceInfoProvider;
    }
}
