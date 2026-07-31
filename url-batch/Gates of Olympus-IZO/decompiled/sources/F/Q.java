package F;

import E.C0020b;
import E.C0022d;
import E.C0027i;
import t0.AbstractC0898f;

/* loaded from: classes.dex */
public final class Q extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S f1082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(S s3, int i3) {
        super(0);
        this.f1081e = i3;
        this.f1082f = s3;
    }

    @Override // Y1.a
    public final Object b() {
        C0027i c0027i;
        S s3 = this.f1082f;
        switch (this.f1081e) {
            case 0:
                C0078z0 c0078z0 = (C0078z0) AbstractC0898f.i(s3, B0.f872b);
                return (c0078z0 == null || (c0027i = c0078z0.f1441b) == null) ? A0.f863a : c0027i;
            default:
                if (((C0078z0) AbstractC0898f.i(s3, B0.f872b)) == null) {
                    E.z zVar = s3.f1094w;
                    if (zVar != null) {
                        s3.w0(zVar);
                    }
                } else if (s3.f1094w == null) {
                    A2.g gVar = new A2.g(5, s3);
                    Q q2 = new Q(s3, 0);
                    m.x0 x0Var = E.x.f708a;
                    boolean z3 = E.D.f613a;
                    q.i iVar = s3.f1090s;
                    boolean z4 = s3.f1091t;
                    float f3 = s3.f1092u;
                    E.z c0022d = z3 ? new C0022d(iVar, z4, f3, gVar, q2) : new C0020b(iVar, z4, f3, gVar, q2);
                    s3.v0(c0022d);
                    s3.f1094w = c0022d;
                }
                return L1.z.f2729a;
        }
    }
}
