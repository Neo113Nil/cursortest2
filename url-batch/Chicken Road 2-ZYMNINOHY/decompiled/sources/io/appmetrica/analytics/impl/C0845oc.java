package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0845oc implements InterfaceC0745kg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0871pc f12511a;

    public C0845oc(C0871pc c0871pc) {
        this.f12511a = c0871pc;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0745kg
    public final void a(C0823ng c0823ng) {
        if (c0823ng == null) {
            return;
        }
        P5 p5 = new P5("", "", 0);
        p5.setValueBytes(c0823ng.a());
        EnumC0508bb enumC0508bb = EnumC0508bb.EVENT_TYPE_UNDEFINED;
        p5.f10797d = 4097;
        this.f12511a.a(p5);
    }
}
