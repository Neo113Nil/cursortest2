package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o22 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final i50 f29876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o22(@NotNull i50 errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f29876b = errorCode;
    }
}
