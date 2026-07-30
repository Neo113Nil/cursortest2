package x1;

import a8.d;
import a8.m;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureTarget;
import android.view.View;
import b2.l;
import c7.a0;
import g0.g1;
import g0.t0;
import java.util.Comparator;
import java.util.function.Consumer;
import p1.s0;
import q6.c;
import r1.a1;
import u3.q;
import y1.n;
import z0.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f9666a = g0.d.J(Boolean.FALSE, t0.f3903k);

    public final void a(View view, n nVar, h6.i iVar, Consumer<ScrollCaptureTarget> consumer) {
        i0.d dVar = new i0.d(new k[16]);
        q.l(nVar.a(), 0, new i(dVar));
        final q6.c[] cVarArr = {c.f9647i, c.f9648j};
        dVar.q(new Comparator() { // from class: g6.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                for (c cVar : cVarArr) {
                    int v5 = d.v((Comparable) cVar.f(obj), (Comparable) cVar.f(obj2));
                    if (v5 != 0) {
                        return v5;
                    }
                }
                return 0;
            }
        });
        k kVar = (k) (dVar.l() ? null : dVar.f4840f[dVar.f4842h - 1]);
        if (kVar == null) {
            return;
        }
        m2.i iVar2 = kVar.f9669c;
        e eVar = new e(kVar.f9667a, iVar2, a0.a(iVar), this);
        a1 a1Var = kVar.f9670d;
        y0.d h3 = s0.f(a1Var).h(a1Var, true);
        long c4 = m.c(iVar2.f6317a, iVar2.f6318b);
        ScrollCaptureTarget d8 = l.d(view, new Rect(Math.round(h3.f9780a), Math.round(h3.f9781b), Math.round(h3.f9782c), Math.round(h3.f9783d)), new Point((int) (c4 >> 32), (int) (c4 & 4294967295L)), eVar);
        d8.setScrollBounds(l0.t(iVar2));
        consumer.accept(d8);
    }
}
