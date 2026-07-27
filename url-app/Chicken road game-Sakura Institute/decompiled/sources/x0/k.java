package x0;

import B0.m;
import G.C0192d;
import G.C0205j0;
import G.W;
import W2.B;
import Z.K;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import android.view.View;
import java.util.Comparator;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m3.u;
import p0.AbstractC0960V;
import r0.a0;
import y0.n;
import y0.o;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final C0205j0 f11439a = C0192d.K(Boolean.FALSE, W.f2779l);

    public final void a(View view, o oVar, CoroutineContext coroutineContext, Consumer<ScrollCaptureTarget> consumer) {
        I.d dVar = new I.d(new l[16]);
        u.k(oVar.a(), 0, new j(dVar));
        final Function1[] selectors = {C1302d.f11419i, C1302d.f11420j};
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        dVar.p(new Comparator() { // from class: B2.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                for (Function1 function1 : selectors) {
                    int a4 = b.a((Comparable) function1.invoke(obj), (Comparable) function1.invoke(obj2));
                    if (a4 != 0) {
                        return a4;
                    }
                }
                return 0;
            }
        });
        l lVar = (l) (dVar.k() ? null : dVar.f3330d[dVar.f3332i - 1]);
        if (lVar == null) {
            return;
        }
        b3.c a4 = B.a(coroutineContext);
        n nVar = lVar.f11440a;
        M0.i iVar = lVar.f11442c;
        ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f = new ScrollCaptureCallbackC1304f(nVar, iVar, a4, this);
        a0 a0Var = lVar.f11443d;
        Y.d n2 = AbstractC0960V.g(a0Var).n(a0Var, true);
        long g4 = j0.c.g(iVar.f3550a, iVar.f3551b);
        ScrollCaptureTarget e4 = m.e(view, new Rect(Math.round(n2.f4374a), Math.round(n2.f4375b), Math.round(n2.f4376c), Math.round(n2.f4377d)), new Point((int) (g4 >> 32), (int) (g4 & 4294967295L)), scrollCaptureCallbackC1304f);
        e4.setScrollBounds(K.A(iVar));
        consumer.accept(e4);
    }
}
