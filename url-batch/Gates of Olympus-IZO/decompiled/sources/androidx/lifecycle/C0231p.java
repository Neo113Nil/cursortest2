package androidx.lifecycle;

import k2.C0547t;
import k2.InterfaceC0550w;

/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231p extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f4031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0232q f4032f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231p(C0232q c0232q, P1.d dVar) {
        super(2, dVar);
        this.f4032f = c0232q;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0231p c0231p = new C0231p(this.f4032f, dVar);
        c0231p.f4031e = obj;
        return c0231p;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        C0231p c0231p = (C0231p) create((InterfaceC0550w) obj, (P1.d) obj2);
        L1.z zVar = L1.z.f2729a;
        c0231p.invokeSuspend(zVar);
        return zVar;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        I2.l.Q(obj);
        InterfaceC0550w interfaceC0550w = (InterfaceC0550w) this.f4031e;
        C0232q c0232q = this.f4032f;
        C0238x c0238x = c0232q.f4033d;
        if (c0238x.f4041d.compareTo(EnumC0230o.f4026e) >= 0) {
            c0238x.a(c0232q);
        } else {
            k2.X x3 = (k2.X) interfaceC0550w.u().k(C0547t.f5390e);
            if (x3 != null) {
                x3.a(null);
            }
        }
        return L1.z.f2729a;
    }
}
