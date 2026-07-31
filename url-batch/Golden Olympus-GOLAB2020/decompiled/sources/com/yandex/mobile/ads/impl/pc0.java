package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pc0 implements i62, p82 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tr f30406a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private Map<String, String> f30407b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30408c;

    public pc0(@NotNull tr contentPresenter) {
        Intrinsics.checkNotNullParameter(contentPresenter, "contentPresenter");
        this.f30406a = contentPresenter;
    }

    @Override // com.yandex.mobile.ads.impl.i62
    public final void a(@Nullable Map<String, String> map) {
        this.f30407b = map;
    }

    @Override // com.yandex.mobile.ads.impl.p82
    public final void a(boolean z4) {
        this.f30408c = z4;
        this.f30406a.a(z4);
    }

    @NotNull
    public final oc0 a() {
        return new oc0(this.f30408c, this.f30407b);
    }
}
