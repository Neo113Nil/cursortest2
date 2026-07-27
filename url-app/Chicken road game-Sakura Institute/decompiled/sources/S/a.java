package S;

import A0.C0030a;
import G.C0216p;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3949a = new d(-1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final d f3950b = new d(1.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f3951c = new StackTraceElement[0];

    public static final boolean a(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final o b(o oVar, Function1 function1, L2.c cVar) {
        return oVar.h(new j(function1, cVar));
    }

    public static final o c(C0216p c0216p, o oVar) {
        if (oVar.g(k.f3976d)) {
            return oVar;
        }
        c0216p.T(1219399079);
        o oVar2 = (o) oVar.e(l.f3977a, new C0030a(6, c0216p));
        c0216p.q(false);
        return oVar2;
    }

    public static final o d(C0216p c0216p, o oVar) {
        c0216p.S(439770924);
        o c4 = c(c0216p, oVar);
        c0216p.q(false);
        return c4;
    }
}
