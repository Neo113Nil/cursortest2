package androidx.lifecycle;

import H5.C0162w;
import H5.InterfaceC0163x;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249p extends q5.g implements InterfaceC0747p {

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f3518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0250q f3519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249p(C0250q c0250q, InterfaceC0564d interfaceC0564d) {
        super(2, interfaceC0564d);
        this.f3519g = c0250q;
    }

    @Override // q5.AbstractC0605a
    public final InterfaceC0564d create(Object obj, InterfaceC0564d interfaceC0564d) {
        C0249p c0249p = new C0249p(this.f3519g, interfaceC0564d);
        c0249p.f3518f = obj;
        return c0249p;
    }

    @Override // x5.InterfaceC0747p
    public final Object invoke(Object obj, Object obj2) {
        C0249p c0249p = (C0249p) create((InterfaceC0163x) obj, (InterfaceC0564d) obj2);
        k5.v vVar = k5.v.f5219a;
        c0249p.invokeSuspend(vVar);
        return vVar;
    }

    @Override // q5.AbstractC0605a
    public final Object invokeSuspend(Object obj) {
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        AbstractC0676f.w(obj);
        InterfaceC0163x interfaceC0163x = (InterfaceC0163x) this.f3518f;
        C0250q c0250q = this.f3519g;
        AbstractC0248o abstractC0248o = c0250q.f3520f;
        if (((C0255w) abstractC0248o).f3527d.compareTo(EnumC0247n.f3512g) >= 0) {
            abstractC0248o.a(c0250q);
        } else {
            H5.X x6 = (H5.X) interfaceC0163x.e().m(C0162w.f1110g);
            if (x6 != null) {
                x6.d(null);
            }
        }
        return k5.v.f5219a;
    }
}
