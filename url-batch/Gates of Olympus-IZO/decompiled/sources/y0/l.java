package y0;

import I.C0089d;
import I.C0102j0;
import I.X;
import Y1.c;
import a.AbstractC0157a;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import android.view.View;
import b0.AbstractC0259J;
import java.util.Comparator;
import java.util.function.Consumer;
import k2.AbstractC0552y;
import r0.M;
import t0.a0;
import z0.n;
import z0.o;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final C0102j0 f8821a = C0089d.J(Boolean.FALSE, X.f2228i);

    public final void a(View view, o oVar, P1.i iVar, Consumer<ScrollCaptureTarget> consumer) {
        K.d dVar = new K.d(new m[16]);
        g2.i.Z(oVar.a(), 0, new k(dVar));
        final Y1.c[] cVarArr = {d.f8799g, d.f8800h};
        dVar.q(new Comparator() { // from class: O1.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                for (c cVar : cVarArr) {
                    int q2 = AbstractC0157a.q((Comparable) cVar.j(obj), (Comparable) cVar.j(obj2));
                    if (q2 != 0) {
                        return q2;
                    }
                }
                return 0;
            }
        });
        m mVar = (m) (dVar.l() ? null : dVar.f2640d[dVar.f2642f - 1]);
        if (mVar == null) {
            return;
        }
        p2.c a3 = AbstractC0552y.a(iVar);
        n nVar = mVar.f8822a;
        M0.h hVar = mVar.f8824c;
        f fVar = new f(nVar, hVar, a3, this);
        a0 a0Var = mVar.f8825d;
        a0.d u3 = M.g(a0Var).u(a0Var, true);
        long c3 = I2.d.c(hVar.f2770a, hVar.f2771b);
        ScrollCaptureTarget c4 = C0.k.c(view, new Rect(Math.round(u3.f3491a), Math.round(u3.f3492b), Math.round(u3.f3493c), Math.round(u3.f3494d)), new Point((int) (c3 >> 32), (int) (c3 & 4294967295L)), fVar);
        c4.setScrollBounds(AbstractC0259J.C(hVar));
        consumer.accept(c4);
    }
}
