package androidx.lifecycle;

import e2.InterfaceC0426e;
import q2.C0832t;
import q2.InterfaceC0835w;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287p extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5232h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0288q f5233i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0287p(C0288q c0288q, V1.d dVar) {
        super(2, dVar);
        this.f5233i = c0288q;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0287p c0287p = (C0287p) o((V1.d) obj2, (InterfaceC0835w) obj);
        R1.y yVar = R1.y.f4171a;
        c0287p.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0287p c0287p = new C0287p(this.f5233i, dVar);
        c0287p.f5232h = obj;
        return c0287p;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        R1.a.e(obj);
        InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f5232h;
        C0288q c0288q = this.f5233i;
        C0294x c0294x = c0288q.f5234d;
        if (c0294x.f5242d.compareTo(EnumC0286o.f5227e) >= 0) {
            c0294x.a(c0288q);
        } else {
            q2.X x3 = (q2.X) interfaceC0835w.q().v(C0832t.f7929e);
            if (x3 != null) {
                x3.a(null);
            }
        }
        return R1.y.f4171a;
    }
}
