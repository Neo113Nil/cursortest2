package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Jc implements InterfaceC3094xg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Kc f37830a;

    public Jc(Kc kc) {
        this.f37830a = kc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3094xg
    public final void a(Ag ag) {
        if (ag == null) {
            return;
        }
        C2773l6 c2773l6 = new C2773l6("", "", 0);
        c2773l6.setValueBytes(ag.a());
        EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
        c2773l6.f39379d = 4097;
        this.f37830a.a(c2773l6);
    }
}
