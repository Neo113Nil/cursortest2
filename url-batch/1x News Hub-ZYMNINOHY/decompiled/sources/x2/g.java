package x2;

import b2.C0195i;
import d2.C0301d;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import t2.AbstractC1212w;
import t2.C1206p;

/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public final w2.d f10784d;

    public g(w2.d dVar, d2.h hVar, int i3, v2.a aVar) {
        super(hVar, i3, aVar);
        this.f10784d = dVar;
    }

    @Override // x2.e
    public final Object a(v2.p pVar, InterfaceC0300c interfaceC0300c) {
        Object n3 = this.f10784d.n(new q(pVar), interfaceC0300c);
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        C0195i c0195i = C0195i.f2555a;
        if (n3 != enumC0317a) {
            n3 = c0195i;
        }
        return n3 == enumC0317a ? n3 : c0195i;
    }

    @Override // x2.e
    public final e b(d2.h hVar, int i3, v2.a aVar) {
        return new g(this.f10784d, hVar, i3, aVar);
    }

    @Override // x2.e, w2.d
    public final Object n(w2.e eVar, InterfaceC0300c interfaceC0300c) {
        C0195i c0195i = C0195i.f2555a;
        int i3 = this.f10780b;
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        if (i3 == -3) {
            d2.h context = interfaceC0300c.getContext();
            Boolean bool = Boolean.FALSE;
            C1206p c1206p = C1206p.f10434g;
            d2.h hVar = this.f10779a;
            d2.h i4 = !((Boolean) hVar.l(bool, c1206p)).booleanValue() ? context.i(hVar) : AbstractC1212w.b(context, hVar, false);
            if (kotlin.jvm.internal.j.a(i4, context)) {
                Object n3 = this.f10784d.n(eVar, interfaceC0300c);
                if (n3 != enumC0317a) {
                    n3 = c0195i;
                }
                if (n3 == enumC0317a) {
                    return n3;
                }
            } else {
                C0301d c0301d = C0301d.f4950a;
                if (kotlin.jvm.internal.j.a(i4.h(c0301d), context.h(c0301d))) {
                    d2.h context2 = interfaceC0300c.getContext();
                    if (!(eVar instanceof q)) {
                        eVar = new W1.r(eVar, context2);
                    }
                    Object b3 = k.b(i4, eVar, y2.a.k(i4), new f(this, null), interfaceC0300c);
                    if (b3 == enumC0317a) {
                        return b3;
                    }
                }
            }
        }
        Object n4 = super.n(eVar, interfaceC0300c);
        return n4 == enumC0317a ? n4 : c0195i;
    }

    @Override // x2.e
    public final String toString() {
        return this.f10784d + " -> " + super.toString();
    }
}
