package x2;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class q implements w2.e {

    /* renamed from: a, reason: collision with root package name */
    public final v2.p f10797a;

    public q(v2.p pVar) {
        this.f10797a = pVar;
    }

    @Override // w2.e
    public final Object a(Object obj, InterfaceC0300c interfaceC0300c) {
        Object g3 = ((v2.o) this.f10797a).f10614d.g(interfaceC0300c, obj);
        return g3 == EnumC0317a.f4969a ? g3 : C0195i.f2555a;
    }
}
