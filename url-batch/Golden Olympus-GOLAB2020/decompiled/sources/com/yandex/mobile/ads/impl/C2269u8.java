package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2269u8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1872d9 f32855a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f32856b;

    public C2269u8(@NotNull C1872d9 adTagUri, @Nullable String str) {
        Intrinsics.checkNotNullParameter(adTagUri, "adTagUri");
        this.f32855a = adTagUri;
        this.f32856b = str;
    }

    @NotNull
    public final C1872d9 a() {
        return this.f32855a;
    }

    @Nullable
    public final String b() {
        return this.f32856b;
    }
}
