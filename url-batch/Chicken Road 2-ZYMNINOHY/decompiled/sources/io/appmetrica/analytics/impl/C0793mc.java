package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793mc extends AbstractC0599f {
    public C0793mc(Context context, Bg bg) {
        super(context, bg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0599f
    public final void b(P5 p5, C0863p4 c0863p4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c0863p4.f12559b.f12485b, Boolean.FALSE)).booleanValue();
        Kb m4 = C0817na.f12417I.m();
        m4.a(booleanValue);
        m4.a(c0863p4.f12559b.f12486c);
        Boolean bool = c0863p4.f12559b.n;
        if (bool != null) {
            C0817na.f12417I.c().b(bool.booleanValue());
        }
        this.f11815b.a(p5, c0863p4);
    }
}
