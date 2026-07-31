package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jo0 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f27784b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f27785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo0(@NotNull String message, @NotNull String displayMessage) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        this.f27784b = message;
        this.f27785c = displayMessage;
    }

    @NotNull
    public final String a() {
        return this.f27785c;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f27784b;
    }
}
