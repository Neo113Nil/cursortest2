package F;

import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import b0.C0352v;
import e2.InterfaceC0426e;
import java.util.concurrent.atomic.AtomicInteger;
import m.AbstractC0620e;
import r.AbstractC0868o;
import r0.InterfaceC0885G;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* loaded from: classes.dex */
public final class I0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F0 f1191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1193g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1194h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f1195i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f1196j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(F0 f02, boolean z3, boolean z4, InterfaceC0426e interfaceC0426e, boolean z5, Q.a aVar) {
        super(2);
        this.f1191e = f02;
        this.f1192f = z3;
        this.f1193g = z4;
        this.f1194h = interfaceC0426e;
        this.f1195i = z5;
        this.f1196j = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        U.q qVar;
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            boolean z3 = this.f1193g;
            boolean z4 = this.f1192f;
            F0 f02 = this.f1191e;
            I.W0 a3 = l.M.a(!z3 ? f02.f1152f : z4 ? f02.f1147a : f02.f1150d, AbstractC0620e.j(100, 0, null, 6), c0167p);
            if (this.f1194h == null || !(this.f1195i || z4)) {
                qVar = U.n.f4488a;
            } else {
                F f3 = F.f1143i;
                AtomicInteger atomicInteger = A0.k.f132a;
                qVar = new ClearAndSetSemanticsElement(f3);
            }
            InterfaceC0885G e3 = AbstractC0868o.e(U.b.f4461d, false);
            int i3 = c0167p.f2864P;
            InterfaceC0164n0 m3 = c0167p.m();
            U.q d3 = U.a.d(c0167p, qVar);
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
            C0143d.R(c0167p, C0996i.f8755c, d3);
            C0143d.a(V.f1382a.a(new C0352v(((C0352v) a3.getValue()).f5441a)), this.f1196j, c0167p, 8);
            c0167p.p(true);
        }
        return R1.y.f4171a;
    }
}
