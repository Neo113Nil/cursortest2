package io.appmetrica.analytics.impl;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Ph implements B4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2979t5 f38135a;

    public Ph(@NotNull InterfaceC2979t5 interfaceC2979t5) {
        this.f38135a = interfaceC2979t5;
    }

    @Override // io.appmetrica.analytics.impl.B4
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Ng a(@NotNull Context context, @NotNull C3109y5 c3109y5, @NotNull C2771l4 c2771l4, @NotNull K4 k4) {
        Og og;
        C2772l5 c2772l5 = new C2772l5(c2771l4.f39370b, c2771l4.f39369a);
        Pg pg = new Pg(this.f38135a);
        synchronized (c3109y5) {
            og = (Og) c3109y5.a(c2772l5, k4, pg, c3109y5.f40253a);
        }
        return new Ng(context, og);
    }
}
