package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0904vc implements InterfaceC0753pg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0930wc f8512a;

    public C0904vc(C0930wc c0930wc) {
        this.f8512a = c0930wc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0753pg
    public final void a(C0830sg c0830sg) {
        if (c0830sg == null) {
            return;
        }
        W5 w5 = new W5("", "", 0);
        w5.setValueBytes(c0830sg.a());
        EnumC0567ib enumC0567ib = EnumC0567ib.EVENT_TYPE_UNDEFINED;
        w5.f6818d = 4097;
        this.f8512a.a(w5);
    }
}
