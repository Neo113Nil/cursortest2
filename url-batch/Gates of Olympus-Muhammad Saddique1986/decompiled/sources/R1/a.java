package R1;

import a2.AbstractC0244a;
import e2.InterfaceC0422a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final W1.a f4141a = W1.a.f4608d;

    public static void a(Throwable th, Throwable th2) {
        f2.j.f(th, "<this>");
        f2.j.f(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC0244a.f4743a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = Z1.a.f4713a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final k b(Throwable th) {
        f2.j.f(th, "exception");
        return new k(th);
    }

    public static f c(g gVar, InterfaceC0422a interfaceC0422a) {
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return new n(interfaceC0422a);
        }
        v vVar = v.f4168a;
        if (ordinal == 1) {
            m mVar = new m();
            mVar.f4154d = interfaceC0422a;
            mVar.f4155e = vVar;
            return mVar;
        }
        if (ordinal != 2) {
            throw new C1.c();
        }
        z zVar = new z();
        zVar.f4172d = interfaceC0422a;
        zVar.f4173e = vVar;
        return zVar;
    }

    public static n d(InterfaceC0422a interfaceC0422a) {
        f2.j.f(interfaceC0422a, "initializer");
        return new n(interfaceC0422a);
    }

    public static final void e(Object obj) {
        if (obj instanceof k) {
            throw ((k) obj).f4152d;
        }
    }

    public static final double f(long j3) {
        return ((j3 >>> 11) * 2048) + (j3 & 2047);
    }
}
