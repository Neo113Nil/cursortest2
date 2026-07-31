package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.vj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3045vj implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3019uj a(@NotNull Context context, @NotNull C3109y5 c3109y5, @NotNull C2771l4 c2771l4, @NotNull K4 k4) {
        Og og;
        Ic ic = new Ic(c2771l4.f39370b, c2771l4.f39369a);
        synchronized (c3109y5) {
            og = (Og) c3109y5.f40253a.get(ic.toString());
        }
        return new C3019uj(og);
    }
}
