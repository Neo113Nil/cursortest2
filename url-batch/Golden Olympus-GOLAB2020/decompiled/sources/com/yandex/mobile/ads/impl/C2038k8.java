package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.k8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2038k8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private EnumC2014j8 f28110a = EnumC2014j8.f27558b;

    @NotNull
    public final synchronized EnumC2014j8 a() {
        return this.f28110a;
    }

    public final synchronized void a(@NotNull EnumC2014j8 enumC2014j8) {
        Intrinsics.checkNotNullParameter(enumC2014j8, "<set-?>");
        this.f28110a = enumC2014j8;
    }
}
