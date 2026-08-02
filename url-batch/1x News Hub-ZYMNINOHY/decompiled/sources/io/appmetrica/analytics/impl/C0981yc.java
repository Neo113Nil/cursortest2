package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981yc extends C0586j5 {
    public C0981yc(Context context, X4 x4, C0896v4 c0896v4, AbstractC0406c5 abstractC0406c5, C0603jm c0603jm, InterfaceC0676mh interfaceC0676mh, ICommonExecutor iCommonExecutor, int i3, C0731ok c0731ok, Mb mb, InterfaceC1003z9 interfaceC1003z9) {
        super(context, x4, c0896v4, abstractC0406c5, c0603jm, interfaceC0676mh, iCommonExecutor, i3, mb, interfaceC1003z9);
    }

    public final C0882ug a(C0930wc c0930wc) {
        C0802re c0802re = new C0802re(c0930wc);
        Objects.requireNonNull(c0930wc);
        return new C0882ug(c0802re, new C0904vc(c0930wc), c0930wc);
    }

    @Override // io.appmetrica.analytics.impl.C0586j5
    public final InterfaceC0953x9 a(C9 c9, S6 s6, Vg vg, C0896v4 c0896v4, X4 x4, C0390bf c0390bf) {
        return this.f7620l.a(c9, s6, vg, c0896v4, x4, c0390bf).a();
    }
}
