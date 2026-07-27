package m;

import kotlin.Unit;
import o.C0905p0;
import o.C0908r0;

/* loaded from: classes.dex */
public final class f0 implements S, i0, Z.P {

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f8114e = new f0(0);

    /* renamed from: i, reason: collision with root package name */
    public static final f0 f8115i = new f0(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8116d;

    public /* synthetic */ f0(int i2) {
        this.f8116d = i2;
    }

    @Override // Z.P
    public Z.I a(long j4, M0.k kVar, M0.b bVar) {
        switch (this.f8116d) {
            case 3:
                float l4 = bVar.l(AbstractC0852z.f8232a);
                return new Z.G(new Y.d(0.0f, -l4, Y.f.d(j4), Y.f.b(j4) + l4));
            default:
                float l5 = bVar.l(AbstractC0852z.f8232a);
                return new Z.G(new Y.d(-l5, 0.0f, Y.f.d(j4) + l5, Y.f.b(j4)));
        }
    }

    @Override // m.i0
    public Object b(long j4, C0905p0 c0905p0, C2.a aVar) {
        C0905p0 c0905p02 = new C0905p0(c0905p0.f8853n, aVar);
        c0905p02.f8852m = j4;
        Object l4 = c0905p02.l(Unit.f7487a);
        return l4 == D2.a.f2163d ? l4 : Unit.f7487a;
    }

    @Override // m.S
    public void c(r0.G g4) {
        g4.a();
    }

    @Override // m.i0
    public S.o d() {
        return S.l.f3977a;
    }

    @Override // m.i0
    public boolean e() {
        return false;
    }

    @Override // m.i0
    public long f(long j4, int i2, A.g0 g0Var) {
        g0Var.getClass();
        C0908r0 c0908r0 = (C0908r0) g0Var.f144e;
        return new Y.c(C0908r0.a(c0908r0, c0908r0.f8872h, j4, c0908r0.f8871g)).f4372a;
    }
}
