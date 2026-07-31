package n2;

import o2.AbstractC0754c;

/* renamed from: n2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0699e implements InterfaceC0700f {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0700f f6335d;

    public C0699e(InterfaceC0700f interfaceC0700f) {
        this.f6335d = interfaceC0700f;
    }

    @Override // n2.InterfaceC0700f
    public final Object collect(InterfaceC0701g interfaceC0701g, P1.d dVar) {
        Z1.t tVar = new Z1.t();
        tVar.f3480d = AbstractC0754c.f6699b;
        Object collect = this.f6335d.collect(new l.q(this, tVar, interfaceC0701g, 1), dVar);
        return collect == Q1.a.f3113d ? collect : L1.z.f2729a;
    }
}
