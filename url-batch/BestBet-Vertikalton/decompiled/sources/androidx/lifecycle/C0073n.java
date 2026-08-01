package androidx.lifecycle;

import d1.AbstractC0100h;
import s1.AbstractC0335s;
import s1.InterfaceC0334q;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073n extends AbstractC0100h implements j1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1889e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0074o f1890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073n(C0074o c0074o, b1.d dVar) {
        super(dVar);
        this.f1890f = c0074o;
    }

    @Override // d1.AbstractC0093a
    public final b1.d a(Object obj, b1.d dVar) {
        C0073n c0073n = new C0073n(this.f1890f, dVar);
        c0073n.f1889e = obj;
        return c0073n;
    }

    @Override // j1.p
    public final Object d(Object obj, Object obj2) {
        C0073n c0073n = (C0073n) a((InterfaceC0334q) obj, (b1.d) obj2);
        X0.g gVar = X0.g.f1277c;
        c0073n.i(gVar);
        return gVar;
    }

    @Override // d1.AbstractC0093a
    public final Object i(Object obj) {
        H1.l.h0(obj);
        InterfaceC0334q interfaceC0334q = (InterfaceC0334q) this.f1889e;
        C0074o c0074o = this.f1890f;
        v vVar = c0074o.f1891a;
        if (vVar.d.compareTo(EnumC0072m.f1885b) >= 0) {
            vVar.a(c0074o);
        } else {
            AbstractC0335s.a(interfaceC0334q.c(), null);
        }
        return X0.g.f1277c;
    }
}
