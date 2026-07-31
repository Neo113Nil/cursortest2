package x;

import a0.C0239d;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import u.C1076c;

/* loaded from: classes.dex */
public final class r extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f10241h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1076c f10242i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I0.z f10243j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Q f10244k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p0 f10245l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I0.t f10246m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1076c c1076c, I0.z zVar, Q q3, p0 p0Var, I0.t tVar, V1.d dVar) {
        super(2, dVar);
        this.f10242i = c1076c;
        this.f10243j = zVar;
        this.f10244k = q3;
        this.f10245l = p0Var;
        this.f10246m = tVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((r) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new r(this.f10242i, this.f10243j, this.f10244k, this.f10245l, this.f10246m, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        long a3;
        C0239d c0239d;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10241h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            Y y3 = this.f10244k.f9975a;
            C0.H h3 = this.f10245l.f10230a;
            this.f10241h = 1;
            int b3 = this.f10246m.b(C0.J.d(this.f10243j.f3098b));
            if (b3 < h3.f557a.f547a.f596a.length()) {
                c0239d = h3.b(b3);
            } else if (b3 != 0) {
                c0239d = h3.b(b3 - 1);
            } else {
                a3 = c0.a(y3.f10040b, y3.f10045g, y3.f10046h, c0.f10059a, 1);
                c0239d = new C0239d(0.0f, 0.0f, 1.0f, (int) (a3 & 4294967295L));
            }
            Object a4 = this.f10242i.a(c0239d, this);
            if (a4 != aVar) {
                a4 = yVar;
            }
            if (a4 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
