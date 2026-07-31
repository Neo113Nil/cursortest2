package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2254tg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<nm0> f32421a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2254tg(@NotNull List<? extends nm0> assetViewConfigurators) {
        Intrinsics.checkNotNullParameter(assetViewConfigurators, "assetViewConfigurators");
        this.f32421a = assetViewConfigurators;
    }

    public final void a(@NotNull db2 uiElements) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Iterator<nm0> it = this.f32421a.iterator();
        while (it.hasNext()) {
            it.next().a(uiElements);
        }
    }
}
