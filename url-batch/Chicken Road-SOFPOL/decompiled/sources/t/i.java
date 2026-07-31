package t;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import u.x0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6784a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6785b;

    public /* synthetic */ i(int i, Object obj) {
        this.f6784a = i;
        this.f6785b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(q1.o oVar, g6.c cVar) {
        switch (this.f6784a) {
            case 0:
                Object i = r2.r.i(oVar, new h((j) this.f6785b, null), cVar);
                if (i != h6.a.f3204d) {
                    break;
                }
                break;
            default:
                r1.d dVar = new r1.d();
                q6.r rVar = new q6.r();
                x0 x0Var = (x0) this.f6785b;
                rVar.f6204d = w1.f.t(x0Var).d(0L);
                Object b8 = a7.x.b(new u.v(oVar, x0Var, new b6.a0(4, x0Var, dVar), new b6.c0(dVar, oVar, x0Var, 6), new u.u(x0Var, 0), new u.u(x0Var, 1), new b6.c(x0Var, rVar, dVar, 4), null), cVar);
                if (b8 != h6.a.f3204d) {
                    break;
                }
                break;
        }
        return c6.m.f1757a;
    }
}
