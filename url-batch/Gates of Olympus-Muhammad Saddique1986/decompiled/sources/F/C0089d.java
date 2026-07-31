package F;

import G.AbstractC0136c;
import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import b0.C0352v;
import e2.InterfaceC0426e;
import r.AbstractC0864k;
import r.AbstractC0868o;
import r.AbstractC0871s;
import r.C0873u;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: F.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089d extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1495g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1496h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1497i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1498j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1499k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q.a f1500l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089d(InterfaceC0426e interfaceC0426e, InterfaceC0426e interfaceC0426e2, InterfaceC0426e interfaceC0426e3, long j3, long j4, long j5, long j6, Q.a aVar) {
        super(2);
        this.f1493e = interfaceC0426e;
        this.f1494f = interfaceC0426e2;
        this.f1495g = interfaceC0426e3;
        this.f1496h = j3;
        this.f1497i = j4;
        this.f1498j = j5;
        this.f1499k = j6;
        this.f1500l = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int i3 = 1;
        int i4 = 0;
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            U.q e3 = androidx.compose.foundation.layout.b.e(U.n.f4488a, AbstractC0107m.f1662e);
            C0873u a3 = AbstractC0871s.a(AbstractC0864k.f8053c, c0167p, 0);
            int i5 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, e3);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0995h c0995h = C0996i.f8757e;
            C0143d.R(c0167p, c0995h, a3);
            C0995h c0995h2 = C0996i.f8756d;
            C0143d.R(c0167p, c0995h2, m3);
            C0995h c0995h3 = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i5))) {
                A.k.o(i5, c0167p, i5, c0995h3);
            }
            C0995h c0995h4 = C0996i.f8755c;
            C0143d.R(c0167p, c0995h4, d3);
            c0167p.Q(-1924971291);
            InterfaceC0426e interfaceC0426e = this.f1493e;
            if (interfaceC0426e != null) {
                C0143d.a(V.f1382a.a(new C0352v(this.f1496h)), Q.f.b(934657765, new C0084b(interfaceC0426e, i4), c0167p), c0167p, 56);
            }
            c0167p.p(false);
            c0167p.Q(-1924961479);
            InterfaceC0426e interfaceC0426e2 = this.f1494f;
            if (interfaceC0426e2 != null) {
                AbstractC0136c.a(this.f1497i, B1.a(H.c.f2384c, c0167p), Q.f.b(434448772, new C0087c(interfaceC0426e, i4, interfaceC0426e2), c0167p), c0167p, 384);
            }
            c0167p.p(false);
            c0167p.Q(-1924936431);
            InterfaceC0426e interfaceC0426e3 = this.f1495g;
            if (interfaceC0426e3 != null) {
                AbstractC0136c.a(this.f1498j, B1.a(H.c.f2386e, c0167p), Q.f.b(-796843771, new C0084b(interfaceC0426e3, i3), c0167p), c0167p, 384);
            }
            c0167p.p(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(U.b.f4475r);
            InterfaceC0885G e4 = AbstractC0868o.e(U.b.f4461d, false);
            int i6 = c0167p.f2864P;
            InterfaceC0164n0 m4 = c0167p.m();
            U.q d4 = U.a.d(c0167p, horizontalAlignElement);
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, c0995h, e4);
            C0143d.R(c0167p, c0995h2, m4);
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i6))) {
                A.k.o(i6, c0167p, i6, c0995h3);
            }
            C0143d.R(c0167p, c0995h4, d4);
            int i7 = H.c.f2382a;
            AbstractC0136c.a(this.f1499k, B1.a(10, c0167p), this.f1500l, c0167p, 0);
            c0167p.p(true);
            c0167p.p(true);
        }
        return R1.y.f4171a;
    }
}
