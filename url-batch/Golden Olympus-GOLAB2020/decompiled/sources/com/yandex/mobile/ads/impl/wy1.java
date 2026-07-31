package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class wy1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private vy1 f34342a;

    @Nullable
    public final vy1 a() {
        return this.f34342a;
    }

    public final void a(@Nullable vy1 vy1Var) {
        if (vy1Var == null) {
            po0.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        vy1 vy1Var2 = this.f34342a;
        if (vy1Var2 == null || Intrinsics.areEqual(vy1Var2, vy1Var)) {
            this.f34342a = vy1Var;
        } else {
            po0.c("Ad size can't be set twice.", new Object[0]);
        }
    }
}
