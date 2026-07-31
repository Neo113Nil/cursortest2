package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0378nc extends AbstractC0160f {
    public C0378nc(Context context, Cg cg) {
        super(context, cg);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0160f
    public final void b(Q5 q5, C0445q4 c0445q4) {
        boolean booleanValue = ((Boolean) WrapUtils.getOrDefault(c0445q4.b.b, Boolean.FALSE)).booleanValue();
        Lb m = C0401oa.I.m();
        m.a(booleanValue);
        m.a(c0445q4.b.c);
        Boolean bool = c0445q4.b.n;
        if (bool != null) {
            C0401oa.I.c().b(bool.booleanValue());
        }
        this.b.a(q5, c0445q4);
    }
}
