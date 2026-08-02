package defpackage;

import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class htc extends hsx {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;
    public static final /* synthetic */ int g = 0;

    static {
        Unsafe o;
        try {
            try {
                o = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    o = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new htb());
                } catch (Exception unused2) {
                    o = a.o();
                }
            }
            try {
                c = o.objectFieldOffset(hte.class.getDeclaredField("waitersField"));
                b = o.objectFieldOffset(hte.class.getDeclaredField("listenersField"));
                d = o.objectFieldOffset(hte.class.getDeclaredField("valueField"));
                e = o.objectFieldOffset(htd.class.getDeclaredField("thread"));
                f = o.objectFieldOffset(htd.class.getDeclaredField("next"));
                a = o;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (Exception e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3);
        }
    }

    @Override // defpackage.hsx
    public final hst a(hte hteVar, hst hstVar) {
        hst hstVar2;
        do {
            hstVar2 = hteVar.listenersField;
            if (hstVar == hstVar2) {
                break;
            }
        } while (!e(hteVar, hstVar2, hstVar));
        return hstVar2;
    }

    @Override // defpackage.hsx
    public final htd b(hte hteVar, htd htdVar) {
        htd htdVar2;
        do {
            htdVar2 = hteVar.waitersField;
            if (htdVar == htdVar2) {
                break;
            }
        } while (!g(hteVar, htdVar2, htdVar));
        return htdVar2;
    }

    @Override // defpackage.hsx
    public final void c(htd htdVar, htd htdVar2) {
        a.putObject(htdVar, f, htdVar2);
    }

    @Override // defpackage.hsx
    public final void d(htd htdVar, Thread thread) {
        a.putObject(htdVar, e, thread);
    }

    @Override // defpackage.hsx
    public final boolean e(hte hteVar, hst hstVar, hst hstVar2) {
        return hta.a(a, hteVar, b, hstVar, hstVar2);
    }

    @Override // defpackage.hsx
    public final boolean f(hte hteVar, Object obj, Object obj2) {
        return hta.a(a, hteVar, d, obj, obj2);
    }

    @Override // defpackage.hsx
    public final boolean g(hte hteVar, htd htdVar, htd htdVar2) {
        return hta.a(a, hteVar, c, htdVar, htdVar2);
    }
}
