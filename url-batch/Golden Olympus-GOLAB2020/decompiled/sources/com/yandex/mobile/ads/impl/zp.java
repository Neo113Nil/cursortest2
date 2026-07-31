package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zp implements u62 {
    private static aq b(xr0 xr0Var, tp tpVar) {
        String b4 = tpVar.b();
        try {
            int ordinal = tpVar.ordinal();
            if (ordinal == 0) {
                return new aq.c(xr0Var.d(b4));
            }
            boolean z4 = true;
            if (ordinal == 1) {
                int b5 = xr0Var.b(-1, b4);
                Integer valueOf = Integer.valueOf(b5);
                if (b5 == -1) {
                    valueOf = null;
                }
                return new aq.d(valueOf != null ? String.valueOf(valueOf.intValue()) : null);
            }
            if (ordinal == 2) {
                if (xr0Var.b(-1, b4) == -1) {
                    z4 = false;
                }
                return new aq.b(z4);
            }
            if (ordinal == 3) {
                return new aq.e(xr0Var.d(b4));
            }
            if (ordinal == 4) {
                return new aq.f(xr0Var.d(b4));
            }
            if (ordinal == 5) {
                return new aq.a(xr0Var.d(b4));
            }
            throw new W1.m();
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.u62
    @Nullable
    public final aq a(@NotNull xr0 localStorage, @NotNull tp type) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(type, "type");
        if (!localStorage.c(type.b())) {
            type = null;
        }
        if (type != null) {
            return b(localStorage, type);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.u62
    @Nullable
    public final aq a(@NotNull xr0 localStorage, @NotNull String v22) {
        tp tpVar;
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(v22, "key");
        if (!localStorage.c(v22)) {
            v22 = null;
        }
        if (v22 != null) {
            tp.f32543d.getClass();
            Intrinsics.checkNotNullParameter(v22, "v2");
            tp[] values = tp.values();
            int length = values.length;
            for (int i4 = 0; i4 < length; i4++) {
                tpVar = values[i4];
                if (Intrinsics.areEqual(tpVar.b(), v22)) {
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
