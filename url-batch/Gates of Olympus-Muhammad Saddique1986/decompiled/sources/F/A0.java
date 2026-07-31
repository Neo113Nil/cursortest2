package F;

import I.C0143d;
import I.C0167p;
import I.C0170q0;
import I.C0186z;
import b0.C0352v;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class A0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0127w0 f1096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1097g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1098h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q.a f1099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(InterfaceC0426e interfaceC0426e, C0127w0 c0127w0, boolean z3, InterfaceC0426e interfaceC0426e2, Q.a aVar) {
        super(2);
        this.f1095e = interfaceC0426e;
        this.f1096f = c0127w0;
        this.f1097g = z3;
        this.f1098h = interfaceC0426e2;
        this.f1099i = aVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            c0167p.Q(1264683960);
            boolean z3 = this.f1097g;
            C0127w0 c0127w0 = this.f1096f;
            InterfaceC0426e interfaceC0426e = this.f1095e;
            if (interfaceC0426e != null) {
                C0143d.a(V.f1382a.a(new C0352v(z3 ? c0127w0.f1850b : c0127w0.f1853e)), Q.f.b(2035552199, new C0084b(interfaceC0426e, 2), c0167p), c0167p, 56);
            }
            c0167p.p(false);
            C0186z c0186z = V.f1382a;
            C0170q0 a3 = c0186z.a(new C0352v(z3 ? c0127w0.f1849a : c0127w0.f1852d));
            Q.a aVar = this.f1099i;
            InterfaceC0426e interfaceC0426e2 = this.f1098h;
            C0143d.a(a3, Q.f.b(-1728894036, new C0131y0(interfaceC0426e, interfaceC0426e2, aVar, 1), c0167p), c0167p, 56);
            if (interfaceC0426e2 != null) {
                C0143d.a(c0186z.a(new C0352v(z3 ? c0127w0.f1851c : c0127w0.f1854f)), Q.f.b(580312062, new C0084b(interfaceC0426e2, 3), c0167p), c0167p, 56);
            }
        }
        return R1.y.f4171a;
    }
}
