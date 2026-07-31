package com.yandex.mobile.ads.impl;

import kotlin.coroutines.CoroutineContext;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fu {
    private fu() {
    }

    @NotNull
    public static InterfaceC3316J a(@Nullable mp1 mp1Var) {
        return o2.K.a(o2.R0.b(null, 1, null).plus(o2.Z.a()).plus(mp1Var != null ? new eu(mp1Var) : new du()));
    }

    @NotNull
    public static InterfaceC3316J b(@Nullable j50 j50Var) {
        return o2.K.a(o2.R0.b(null, 1, null).plus(o2.Z.c().p()).plus(j50Var != null ? new eu(j50Var) : new du()));
    }

    @NotNull
    public static InterfaceC3316J a(@Nullable j50 j50Var) {
        CoroutineContext duVar;
        if (j50Var != null) {
            duVar = new eu(j50Var);
        } else {
            duVar = new du();
        }
        return o2.K.a(o2.R0.b(null, 1, null).plus(o2.Z.b()).plus(duVar));
    }
}
