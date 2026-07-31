package j0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j2 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y0.m f3717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.i0 f3718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f3720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t.t f3721h;
    public final /* synthetic */ float i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u0.c f3722j;

    public j2(y0.m mVar, f1.i0 i0Var, long j7, float f6, t.t tVar, float f8, u0.c cVar) {
        this.f3717d = mVar;
        this.f3718e = i0Var;
        this.f3719f = j7;
        this.f3720g = f6;
        this.f3721h = tVar;
        this.i = f8;
        this.f3722j = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        boolean N = sVar.N(intValue & 1, (intValue & 3) != 2);
        c6.m mVar = c6.m.f1757a;
        if (!N) {
            sVar.Q();
            return mVar;
        }
        y0.m c8 = l2.c(this.f3717d, this.f3718e, l2.d(this.f3719f, this.f3720g, sVar), this.f3721h, ((r2.c) sVar.j(x1.b1.f8370h)).u(this.i));
        Object K = sVar.K();
        m0.v0 v0Var = m0.n.f5019a;
        if (K == v0Var) {
            K = new l(3);
            sVar.f0(K);
        }
        AtomicInteger atomicInteger = d2.l.f2154a;
        y0.m d8 = c8.d(new AppendedSemanticsElement((p6.c) K, false));
        Object K2 = sVar.K();
        if (K2 == v0Var) {
            K2 = i2.f3705a;
            sVar.f0(K2);
        }
        q1.f fVar = q1.q.f6022a;
        y0.m d9 = d8.d(new SuspendPointerInputElement(mVar, null, (PointerInputEventHandler) K2, 6));
        u1.e0 d10 = x.k.d(y0.b.f8681d, true);
        int hashCode = Long.hashCode(sVar.T);
        m0.o1 l3 = sVar.l();
        y0.m a02 = r2.o.a0(sVar, d9);
        w1.i.f7684c.getClass();
        w1.y yVar = w1.h.f7675b;
        sVar.Y();
        if (sVar.S) {
            sVar.k(yVar);
        } else {
            sVar.i0();
        }
        m0.b.u(d10, sVar, w1.h.f7678e);
        m0.b.u(l3, sVar, w1.h.f7677d);
        w1.g gVar = w1.h.f7679f;
        if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
            a0.q.n(hashCode, sVar, hashCode, gVar);
        }
        m0.b.u(a02, sVar, w1.h.f7676c);
        this.f3722j.g(sVar, 0);
        sVar.p(true);
        return mVar;
    }
}
