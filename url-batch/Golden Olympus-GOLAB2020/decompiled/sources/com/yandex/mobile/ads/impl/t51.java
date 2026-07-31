package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t51 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(@NotNull String detailMessage) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
        this.f32170b = detailMessage;
    }

    @NotNull
    public final String a() {
        return this.f32170b;
    }
}
