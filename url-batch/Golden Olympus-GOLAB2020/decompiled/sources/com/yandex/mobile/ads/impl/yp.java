package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yp implements u62 {
    private static aq b(xr0 xr0Var, tp tpVar) {
        int ordinal;
        String a4 = tpVar.a();
        if (a4 == null) {
            return null;
        }
        try {
            ordinal = tpVar.ordinal();
        } catch (ClassCastException unused) {
        }
        if (ordinal == 0) {
            return new aq.c(xr0Var.d(a4));
        }
        if (ordinal == 1) {
            return new aq.d(xr0Var.d(a4));
        }
        if (ordinal == 2) {
            return new aq.b(xr0Var.a(a4, false));
        }
        if (ordinal == 3) {
            return new aq.e(xr0Var.d(a4));
        }
        if (ordinal == 4) {
            return new aq.f(xr0Var.d(a4));
        }
        if (ordinal == 5) {
            return null;
        }
        throw new W1.m();
    }

    @Override // com.yandex.mobile.ads.impl.u62
    @Nullable
    public final aq a(@NotNull xr0 localStorage, @NotNull tp type) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.a() == null || !localStorage.c(type.a())) {
            type = null;
        }
        if (type != null) {
            return b(localStorage, type);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.u62
    @Nullable
    public final aq a(@NotNull xr0 localStorage, @NotNull String v12) {
        tp tpVar;
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(v12, "key");
        if (!localStorage.c(v12)) {
            v12 = null;
        }
        if (v12 != null) {
            tp.f32543d.getClass();
            Intrinsics.checkNotNullParameter(v12, "v1");
            tp[] values = tp.values();
            int length = values.length;
            for (int i4 = 0; i4 < length; i4++) {
                tpVar = values[i4];
                if (Intrinsics.areEqual(tpVar.a(), v12)) {
                    break;
                }
            }
        }
        tpVar = null;
        if (tpVar != null) {
            return b(localStorage, tpVar);
        }
        return null;
    }
}
