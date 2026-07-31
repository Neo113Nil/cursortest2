package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0502sc extends C0115d5 {
    public C0502sc(Context context, R4 r4, C0420p4 c0420p4, W4 w4, C0209gm c0209gm, InterfaceC0255ih interfaceC0255ih, ICommonExecutor iCommonExecutor, int i, C0336lk c0336lk, Gb gb, InterfaceC0524t9 interfaceC0524t9) {
        super(context, r4, c0420p4, w4, c0209gm, interfaceC0255ih, iCommonExecutor, i, gb, interfaceC0524t9);
    }

    public final C0457qg a(C0453qc c0453qc) {
        C0330le c0330le = new C0330le(c0453qc);
        Objects.requireNonNull(c0453qc);
        return new C0457qg(c0330le, new C0428pc(c0453qc), c0453qc);
    }

    @Override // io.appmetrica.analytics.impl.C0115d5
    public final InterfaceC0474r9 a(InterfaceC0599w9 interfaceC0599w9, M6 m6, Rg rg, C0420p4 c0420p4, R4 r4, Xe xe) {
        return this.l.a(interfaceC0599w9, m6, rg, c0420p4, r4, xe).a();
    }
}
