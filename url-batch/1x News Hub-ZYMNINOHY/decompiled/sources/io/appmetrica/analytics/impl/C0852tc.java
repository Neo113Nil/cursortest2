package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0852tc extends AbstractC0477f {
    public C0852tc(Context context, Gg gg) {
        super(context, gg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0477f
    public final void b(W5 w5, C0922w4 c0922w4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c0922w4.f8544b.f8478b, Boolean.FALSE)).booleanValue();
        Rb m3 = C0876ua.f8420H.m();
        m3.a(booleanValue);
        m3.a(c0922w4.f8544b.f8479c);
        Boolean bool = c0922w4.f8544b.f8489n;
        if (bool != null) {
            C0876ua.f8420H.c().b(bool.booleanValue());
        }
        this.f7293b.a(w5, c0922w4);
    }
}
