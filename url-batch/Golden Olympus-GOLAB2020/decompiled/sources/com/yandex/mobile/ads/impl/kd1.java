package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class kd1 extends AbstractC1855cg<String, String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final kr1 f28182a;

    public kd1(@NotNull kr1 reviewCountFormatter) {
        Intrinsics.checkNotNullParameter(reviewCountFormatter, "reviewCountFormatter");
        this.f28182a = reviewCountFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC1855cg
    public final C2276uf a(Object obj, String name) {
        String value = (String) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual("review_count", name)) {
            try {
                value = this.f28182a.a(value);
            } catch (i61 unused) {
            }
        }
        return AbstractC1855cg.a(name, "string", value);
    }
}
