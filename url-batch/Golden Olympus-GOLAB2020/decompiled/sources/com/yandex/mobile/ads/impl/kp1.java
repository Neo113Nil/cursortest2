package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kp1 {
    @NotNull
    public static final jp1 a(@NotNull jp1 jp1Var, @Nullable jp1 jp1Var2) {
        Intrinsics.checkNotNullParameter(jp1Var, "<this>");
        if (jp1Var2 == null) {
            return new jp1((Map<String, ? extends Object>) jp1Var.b(), jp1Var.a());
        }
        C1814b a4 = jp1Var.a();
        if (a4 == null) {
            a4 = jp1Var2.a();
        }
        return new jp1((Map<String, ? extends Object>) MapsKt.plus(jp1Var.b(), jp1Var2.b()), a4);
    }
}
