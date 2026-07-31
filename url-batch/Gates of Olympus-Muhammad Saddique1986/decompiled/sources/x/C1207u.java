package x;

import a0.C0238c;
import e2.InterfaceC0424c;
import u0.C1103h0;
import u0.K0;

/* renamed from: x.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207u extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Q f10267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Z.p f10268f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10269g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f10270h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10271i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.t f10272j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1207u(Q q3, Z.p pVar, boolean z3, boolean z4, B.a0 a0Var, I0.t tVar) {
        super(1);
        this.f10267e = q3;
        this.f10268f = pVar;
        this.f10269g = z3;
        this.f10270h = z4;
        this.f10271i = a0Var;
        this.f10272j = tVar;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        K0 k02;
        long j3 = ((C0238c) obj).f4722a;
        Q q3 = this.f10267e;
        if (!q3.b()) {
            this.f10268f.a(Z.i.f4681i);
        } else if (!this.f10269g && (k02 = q3.f9977c) != null) {
            ((C1103h0) k02).b();
        }
        if (q3.b() && this.f10270h) {
            if (q3.a() != F.f9945e) {
                p0 d3 = q3.d();
                if (d3 != null) {
                    int a3 = this.f10272j.a(d3.b(j3, true));
                    q3.f9994t.n(I0.z.a((I0.z) q3.f9978d.f10466e, null, O2.l.J(a3, a3), 5));
                    if (q3.f9975a.f10039a.f596a.length() > 0) {
                        q3.f9985k.setValue(F.f9946f);
                    }
                }
            } else {
                this.f10271i.e(new C0238c(j3));
            }
        }
        return R1.y.f4171a;
    }
}
