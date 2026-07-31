package U;

import F.C0036e;
import I.C0113p;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f3315a = new StackTraceElement[0];

    public static final boolean a(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final l b(C0113p c0113p, l lVar) {
        if (lVar.c(h.f3301e)) {
            return lVar;
        }
        c0113p.R(1219399079);
        l lVar2 = (l) lVar.a(i.f3302a, new C0036e(7, c0113p));
        c0113p.p(false);
        return lVar2;
    }

    public static final l c(C0113p c0113p, l lVar) {
        c0113p.Q(439770924);
        l b2 = b(c0113p, lVar);
        c0113p.p(false);
        return b2;
    }
}
