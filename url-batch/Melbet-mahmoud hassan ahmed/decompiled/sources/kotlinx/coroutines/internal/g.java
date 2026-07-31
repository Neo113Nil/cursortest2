package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import m6.f2;
import m6.h2;
import m6.o1;
import m6.p0;
import m6.z0;
import v5.k;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final y f18340a = new y("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final y f18341b = new y("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(y5.d<? super T> dVar, Object obj, f6.l<? super Throwable, v5.q> lVar) {
        boolean z6;
        if (!(dVar instanceof f)) {
            dVar.resumeWith(obj);
            return;
        }
        f fVar = (f) dVar;
        Object b7 = m6.c0.b(obj, lVar);
        if (fVar.f18332i.Q(fVar.getContext())) {
            fVar.f18334k = b7;
            fVar.f19331h = 1;
            fVar.f18332i.P(fVar.getContext(), fVar);
            return;
        }
        p0.a();
        z0 a7 = f2.f19284a.a();
        if (a7.X()) {
            fVar.f18334k = b7;
            fVar.f19331h = 1;
            a7.T(fVar);
            return;
        }
        a7.V(true);
        try {
            o1 o1Var = (o1) fVar.getContext().get(o1.f19317c);
            if (o1Var == null || o1Var.b()) {
                z6 = false;
            } else {
                CancellationException x6 = o1Var.x();
                fVar.b(b7, x6);
                k.a aVar = v5.k.f22832f;
                fVar.resumeWith(v5.k.a(v5.l.a(x6)));
                z6 = true;
            }
            if (!z6) {
                y5.d<T> dVar2 = fVar.f18333j;
                Object obj2 = fVar.f18335l;
                y5.g context = dVar2.getContext();
                Object c7 = c0.c(context, obj2);
                h2<?> e7 = c7 != c0.f18321a ? m6.e0.e(dVar2, context, c7) : null;
                try {
                    fVar.f18333j.resumeWith(obj);
                    v5.q qVar = v5.q.f22838a;
                    if (e7 == null || e7.y0()) {
                        c0.a(context, c7);
                    }
                } catch (Throwable th) {
                    if (e7 == null || e7.y0()) {
                        c0.a(context, c7);
                    }
                    throw th;
                }
            }
            while (a7.Z()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(y5.d dVar, Object obj, f6.l lVar, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
