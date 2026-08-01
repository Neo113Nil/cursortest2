package androidx.lifecycle;

import r1.AbstractC0369t;

/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079n extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0080o f1940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079n(C0080o c0080o, a1.d dVar) {
        super(dVar);
        this.f1940c = c0080o;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        C0079n c0079n = new C0079n(this.f1940c, dVar);
        c0079n.f1939b = obj;
        return c0079n;
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        C0079n c0079n = (C0079n) create((r1.r) obj, (a1.d) obj2);
        W0.i iVar = W0.i.f1345a;
        c0079n.invokeSuspend(iVar);
        return iVar;
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        H1.d.i0(obj);
        r1.r rVar = (r1.r) this.f1939b;
        C0080o c0080o = this.f1940c;
        v vVar = c0080o.f1941a;
        if (vVar.f1949d.compareTo(EnumC0078m.f1935b) >= 0) {
            vVar.a(c0080o);
        } else {
            AbstractC0369t.a(rVar.b(), null);
        }
        return W0.i.f1345a;
    }
}
