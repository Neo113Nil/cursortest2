package F;

import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicInteger;
import n.C0694u;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;
import u0.AbstractC1101g0;

/* loaded from: classes.dex */
public final class p1 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.q f1725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0.Q f1726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1727g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f1728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0694u f1729i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1730j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q.a f1731k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(U.q qVar, b0.Q q3, long j3, float f3, C0694u c0694u, float f4, Q.a aVar) {
        super(2);
        this.f1725e = qVar;
        this.f1726f = q3;
        this.f1727g = j3;
        this.f1728h = f3;
        this.f1729i = c0694u;
        this.f1730j = f4;
        this.f1731k = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        R1.y yVar = R1.y.f4171a;
        if (intValue == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            long d3 = r1.d(this.f1727g, this.f1728h, c0167p);
            float J3 = ((O0.b) c0167p.k(AbstractC1101g0.f9354f)).J(this.f1730j);
            U.q c2 = r1.c(this.f1725e, this.f1726f, d3, this.f1729i, J3);
            F f3 = F.f1145k;
            AtomicInteger atomicInteger = A0.k.f132a;
            U.q a3 = n0.w.a(c2.i(new AppendedSemanticsElement(f3, false)), yVar, new o1(2, null));
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, true);
            int i3 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d4 = U.a.d(c0167p, a3);
            InterfaceC0997j.f8759c.getClass();
            C1001n c1001n = C0996i.f8754b;
            c0167p.U();
            if (c0167p.f2863O) {
                c0167p.l(c1001n);
            } else {
                c0167p.d0();
            }
            C0143d.R(c0167p, C0996i.f8757e, e3);
            C0143d.R(c0167p, C0996i.f8756d, m3);
            C0995h c0995h = C0996i.f8758f;
            if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
                A.k.o(i3, c0167p, i3, c0995h);
            }
            C0143d.R(c0167p, C0996i.f8755c, d4);
            this.f1731k.h(c0167p, 0);
            c0167p.p(true);
        }
        return yVar;
    }
}
