package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ym0 {
    @NotNull
    public static xm0 a(@Nullable du1 du1Var) {
        xm0 xm0Var;
        String value;
        xm0 xm0Var2;
        if (du1Var != null && (value = du1Var.z()) != null) {
            xm0.f34618c.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            xm0[] values = xm0.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    xm0Var2 = null;
                    break;
                }
                xm0Var2 = values[i4];
                if (Intrinsics.areEqual(xm0Var2.b(), value)) {
                    break;
                }
                i4++;
            }
            if (xm0Var2 != null) {
                return xm0Var2;
            }
        }
        xm0.f34618c.getClass();
        xm0Var = xm0.f34619d;
        return xm0Var;
    }
}
