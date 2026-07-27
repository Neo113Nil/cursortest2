package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055vc implements InterfaceC0904pg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1081wc f9464a;

    public C1055vc(C1081wc c1081wc) {
        this.f9464a = c1081wc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0904pg
    public final void a(C0981sg c0981sg) {
        if (c0981sg == null) {
            return;
        }
        W5 w5 = new W5("", "", 0);
        w5.setValueBytes(c0981sg.a());
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        w5.f7651d = 4097;
        this.f9464a.a(w5);
    }
}
