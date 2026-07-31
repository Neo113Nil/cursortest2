package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3038vc implements B4 {
    @Override // io.appmetrica.analytics.impl.B4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final P4 a(@NotNull Context context, @NotNull C3109y5 c3109y5, @NotNull C2771l4 c2771l4, @NotNull K4 k4) {
        S4 s4;
        Q4 q4 = new Q4(c2771l4.f39370b);
        T4 t4 = new T4();
        synchronized (c3109y5) {
            s4 = (S4) c3109y5.a(q4, k4, t4, c3109y5.f40254b);
        }
        return new P4(context, s4, k4);
    }
}
