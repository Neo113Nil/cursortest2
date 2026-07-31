package q;

import m0.t2;
import r.g1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f5876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5877g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, long j7, int i) {
        super(1);
        this.f5875e = i;
        this.f5876f = oVar;
        this.f5877g = j7;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        long j7;
        r.v vVar;
        long j8;
        switch (this.f5875e) {
            case 0:
                g1 g1Var = (g1) obj;
                Object b8 = g1Var.b();
                o oVar = this.f5876f;
                if (q6.i.a(b8, oVar.f5883t.b())) {
                    j7 = r2.k.a(oVar.f5884u, androidx.compose.animation.a.f455a) ? this.f5877g : oVar.f5884u;
                } else {
                    t2 t2Var = (t2) oVar.f5883t.f5889d.g(g1Var.b());
                    j7 = t2Var != null ? ((r2.k) t2Var.getValue()).f6528a : 0L;
                }
                t2 t2Var2 = (t2) oVar.f5883t.f5889d.g(g1Var.c());
                long j9 = t2Var2 != null ? ((r2.k) t2Var2.getValue()).f6528a : 0L;
                t0 t0Var = (t0) oVar.f5882s.getValue();
                return (t0Var == null || (vVar = (r.v) t0Var.f5911a.g(new r2.k(j7), new r2.k(j9))) == null) ? r.d.l(0.0f, 400.0f, null, 5) : vVar;
            default:
                o oVar2 = this.f5876f;
                if (q6.i.a(obj, oVar2.f5883t.b())) {
                    j8 = r2.k.a(oVar2.f5884u, androidx.compose.animation.a.f455a) ? this.f5877g : oVar2.f5884u;
                } else {
                    t2 t2Var3 = (t2) oVar2.f5883t.f5889d.g(obj);
                    j8 = t2Var3 != null ? ((r2.k) t2Var3.getValue()).f6528a : 0L;
                }
                return new r2.k(j8);
        }
    }
}
