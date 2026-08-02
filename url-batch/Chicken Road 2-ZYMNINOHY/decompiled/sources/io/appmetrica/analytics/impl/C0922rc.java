package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922rc extends C0528c5 {
    public C0922rc(Context context, Q4 q4, C0837o4 c0837o4, V4 v4, C0622fm c0622fm, InterfaceC0669hh interfaceC0669hh, ICommonExecutor iCommonExecutor, int i4, C0749kk c0749kk, Fb fb, InterfaceC0945s9 interfaceC0945s9) {
        super(context, q4, c0837o4, v4, c0622fm, interfaceC0669hh, iCommonExecutor, i4, fb, interfaceC0945s9);
    }

    public final C0875pg a(C0871pc c0871pc) {
        C0743ke c0743ke = new C0743ke(c0871pc);
        Objects.requireNonNull(c0871pc);
        return new C0875pg(c0743ke, new C0845oc(c0871pc), c0871pc);
    }

    @Override // io.appmetrica.analytics.impl.C0528c5
    public final InterfaceC0894q9 a(InterfaceC1023v9 interfaceC1023v9, L6 l6, Qg qg, C0837o4 c0837o4, Q4 q4, We we) {
        return this.f11585l.a(interfaceC1023v9, l6, qg, c0837o4, q4, we).a();
    }
}
