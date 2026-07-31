package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class u11 implements io {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final dr0 f32765a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lo f32766b;

    public u11(@NotNull dr0 link, @NotNull lo clickListenerCreator) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(clickListenerCreator, "clickListenerCreator");
        this.f32765a = link;
        this.f32766b = clickListenerCreator;
    }

    @Override // com.yandex.mobile.ads.impl.io
    public final void a(@NotNull j21 view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f32766b.a(new dr0(this.f32765a.a(), this.f32765a.c(), this.f32765a.d(), url, this.f32765a.b())).onClick(view);
    }
}
