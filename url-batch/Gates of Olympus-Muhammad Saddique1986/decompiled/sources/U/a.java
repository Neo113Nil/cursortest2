package U;

import C0.C0025a;
import I.C0167p;
import e2.InterfaceC0427f;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f4456a = new f(-1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final f f4457b = new f(1.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final e f4458c = new e(-1.0f);

    /* renamed from: d, reason: collision with root package name */
    public static final e f4459d = new e(1.0f);

    /* renamed from: e, reason: collision with root package name */
    public static final StackTraceElement[] f4460e = new StackTraceElement[0];

    public static final boolean a(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final q b(q qVar, InterfaceC0427f interfaceC0427f) {
        return qVar.i(new l(interfaceC0427f));
    }

    public static final q c(C0167p c0167p, q qVar) {
        if (qVar.d(m.f4487e)) {
            return qVar;
        }
        c0167p.R(1219399079);
        q qVar2 = (q) qVar.a(n.f4488a, new C0025a(7, c0167p));
        c0167p.p(false);
        return qVar2;
    }

    public static final q d(C0167p c0167p, q qVar) {
        c0167p.Q(439770924);
        q c2 = c(c0167p, qVar);
        c0167p.p(false);
        return c2;
    }
}
