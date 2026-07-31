package n;

import a0.C0238c;
import a0.C0239d;
import a0.C0241f;
import p.C0789t0;
import p.C0793v0;

/* loaded from: classes.dex */
public final class i0 implements V, l0, b0.Q {

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f7147e = new i0(0);

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f7148f = new i0(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7149d;

    public /* synthetic */ i0(int i3) {
        this.f7149d = i3;
    }

    @Override // n.l0
    public U.q a() {
        return U.n.f4488a;
    }

    @Override // n.l0
    public Object b(long j3, C0789t0 c0789t0, V1.d dVar) {
        C0789t0 c0789t02 = new C0789t0(c0789t0.f7772k, dVar);
        c0789t02.f7771j = j3;
        R1.y yVar = R1.y.f4171a;
        Object q3 = c0789t02.q(yVar);
        return q3 == W1.a.f4608d ? q3 : yVar;
    }

    @Override // n.l0
    public long c(long j3, int i3, A0.l lVar) {
        lVar.getClass();
        C0793v0 c0793v0 = (C0793v0) lVar.f134f;
        return new C0238c(C0793v0.a(c0793v0, c0793v0.f7785h, j3, c0793v0.f7784g)).f4722a;
    }

    @Override // b0.Q
    public b0.K d(long j3, O0.k kVar, O0.b bVar) {
        switch (this.f7149d) {
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                float l3 = bVar.l(AbstractC0658A.f7013a);
                return new b0.I(new C0239d(0.0f, -l3, C0241f.d(j3), C0241f.b(j3) + l3));
            default:
                float l4 = bVar.l(AbstractC0658A.f7013a);
                return new b0.I(new C0239d(-l4, 0.0f, C0241f.d(j3) + l4, C0241f.b(j3)));
        }
    }

    @Override // n.V
    public void e(t0.G g3) {
        g3.b();
    }

    @Override // n.l0
    public boolean f() {
        return false;
    }
}
