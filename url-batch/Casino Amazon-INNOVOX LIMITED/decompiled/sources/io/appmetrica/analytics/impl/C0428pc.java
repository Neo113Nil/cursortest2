package io.appmetrica.analytics.impl;

import androidx.fragment.app.FragmentTransaction;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0428pc implements InterfaceC0332lg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0453qc f1432a;

    public C0428pc(C0453qc c0453qc) {
        this.f1432a = c0453qc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0332lg
    public final void a(C0407og c0407og) {
        if (c0407og == null) {
            return;
        }
        Q5 q5 = new Q5("", "", 0);
        q5.setValueBytes(c0407og.a());
        EnumC0095cb enumC0095cb = EnumC0095cb.EVENT_TYPE_UNDEFINED;
        q5.d = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
        this.f1432a.a(q5);
    }
}
