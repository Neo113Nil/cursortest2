package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.f71;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final z61 f26045a;

    public g71(@NotNull z61 viewProvider) {
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        this.f26045a = viewProvider;
    }

    @NotNull
    public final f71 a() {
        return new f71(new f71.a(this.f26045a.d(), this.f26045a.getAssetViews()).a(this.f26045a.b()).a(this.f26045a.c()).a(this.f26045a.f()).a(this.f26045a.a()), 0);
    }
}
