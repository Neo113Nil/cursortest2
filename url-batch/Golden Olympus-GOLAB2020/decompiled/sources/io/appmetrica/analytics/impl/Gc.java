package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Gc implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Hc a(@NotNull Context context, @NotNull C3109y5 c3109y5, @NotNull C2771l4 c2771l4, @NotNull K4 k4) {
        Og og;
        Ic ic = new Ic(c2771l4.f39370b, c2771l4.f39369a);
        Pg pg = new Pg(new Lc());
        synchronized (c3109y5) {
            og = (Og) c3109y5.a(ic, k4, pg, c3109y5.f40253a);
        }
        return new Hc(context, og);
    }
}
