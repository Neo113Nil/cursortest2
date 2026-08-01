package androidx.lifecycle;

import o1.AbstractC0299s;
import o1.InterfaceC0298q;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073n extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0074o f1509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073n(C0074o c0074o, X0.d dVar) {
        super(dVar);
        this.f1509f = c0074o;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        C0073n c0073n = new C0073n(this.f1509f, dVar);
        c0073n.f1508e = obj;
        return c0073n;
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        C0073n c0073n = (C0073n) a((InterfaceC0298q) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f864a;
        c0073n.i(iVar);
        return iVar;
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        T.d.Q(obj);
        InterfaceC0298q interfaceC0298q = (InterfaceC0298q) this.f1508e;
        C0074o c0074o = this.f1509f;
        v vVar = c0074o.f1510a;
        if (vVar.d.compareTo(EnumC0072m.f1504b) >= 0) {
            vVar.a(c0074o);
        } else {
            AbstractC0299s.a(interfaceC0298q.c(), null);
        }
        return U0.i.f864a;
    }
}
