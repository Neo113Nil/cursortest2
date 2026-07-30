package d6;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final i6.a f2605a = i6.a.f4956f;

    public static void a(Throwable th, Throwable th2) {
        r6.k.f(th, "<this>");
        r6.k.f(th2, "exception");
        if (th != th2) {
            Integer num = m6.a.f6433a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = l6.a.f6097a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final l b(Throwable th) {
        r6.k.f(th, "exception");
        return new l(th);
    }

    public static g c(h hVar, q6.a aVar) {
        w wVar = w.f2636a;
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            return new o(aVar);
        }
        if (ordinal == 1) {
            n nVar = new n();
            nVar.f2622f = aVar;
            nVar.f2623g = wVar;
            return nVar;
        }
        if (ordinal != 2) {
            throw new b4.c();
        }
        a0 a0Var = new a0();
        a0Var.f2606f = aVar;
        a0Var.f2607g = wVar;
        return a0Var;
    }

    public static o d(q6.a aVar) {
        r6.k.f(aVar, "initializer");
        return new o(aVar);
    }

    public static final void e(Object obj) {
        if (obj instanceof l) {
            throw ((l) obj).f2620f;
        }
    }

    public static final double f(long j8) {
        return ((j8 >>> 11) * 2048) + (j8 & 2047);
    }
}
