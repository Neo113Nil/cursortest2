package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ue, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2275ue {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zw1 f33045a;

    public /* synthetic */ C2275ue() {
        this(new zw1());
    }

    @NotNull
    public final C1828bd a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33045a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        return new C1828bd(!r1.b(context));
    }

    public C2275ue(@NotNull zw1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f33045a = sensitiveModeChecker;
    }
}
