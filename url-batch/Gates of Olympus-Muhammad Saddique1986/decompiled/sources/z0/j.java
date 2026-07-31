package z0;

import A0.p;
import A0.q;
import D0.n;
import I.C0143d;
import I.C0156j0;
import I.W;
import O2.l;
import a0.C0239d;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import android.view.View;
import b0.M;
import e2.InterfaceC0424c;
import java.util.Comparator;
import java.util.function.Consumer;
import n.AbstractC0695v;
import q2.AbstractC0837y;
import r0.AbstractC0898U;
import t0.b0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final C0156j0 f10542a = C0143d.K(Boolean.FALSE, W.f2783i);

    public final void a(View view, q qVar, V1.i iVar, Consumer<ScrollCaptureTarget> consumer) {
        K.d dVar = new K.d(new k[16]);
        AbstractC0695v.m(qVar.a(), 0, new i(dVar));
        final InterfaceC0424c[] interfaceC0424cArr = {C1262d.f10524g, C1262d.f10525h};
        dVar.q(new Comparator() { // from class: U1.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                for (InterfaceC0424c interfaceC0424c : interfaceC0424cArr) {
                    int T3 = l.T((Comparable) interfaceC0424c.n(obj), (Comparable) interfaceC0424c.n(obj2));
                    if (T3 != 0) {
                        return T3;
                    }
                }
                return 0;
            }
        });
        k kVar = (k) (dVar.l() ? null : dVar.f3214d[dVar.f3216f - 1]);
        if (kVar == null) {
            return;
        }
        v2.c a3 = AbstractC0837y.a(iVar);
        p pVar = kVar.f10543a;
        O0.i iVar2 = kVar.f10545c;
        f fVar = new f(pVar, iVar2, a3, this);
        b0 b0Var = kVar.f10546d;
        C0239d B3 = AbstractC0898U.g(b0Var).B(b0Var, true);
        long c2 = l0.c.c(iVar2.f3736a, iVar2.f3737b);
        ScrollCaptureTarget c3 = n.c(view, new Rect(Math.round(B3.f4724a), Math.round(B3.f4725b), Math.round(B3.f4726c), Math.round(B3.f4727d)), new Point((int) (c2 >> 32), (int) (c2 & 4294967295L)), fVar);
        c3.setScrollBounds(M.A(iVar2));
        consumer.accept(c3);
    }
}
