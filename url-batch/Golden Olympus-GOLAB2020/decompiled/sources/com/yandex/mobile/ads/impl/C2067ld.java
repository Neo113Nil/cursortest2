package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2067ld {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2091md f28510a;

    public /* synthetic */ C2067ld() {
        this(new C2091md());
    }

    public final boolean a() {
        this.f28510a.getClass();
        int a4 = C2091md.a();
        this.f28510a.getClass();
        return a4 >= 21;
    }

    public C2067ld(@NotNull C2091md androidSdkApiProvider) {
        Intrinsics.checkNotNullParameter(androidSdkApiProvider, "androidSdkApiProvider");
        this.f28510a = androidSdkApiProvider;
    }
}
