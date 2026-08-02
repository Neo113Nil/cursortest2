package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eim {
    private static final eim b;
    private static volatile boolean c;
    private static volatile eim d;
    public final ein a;

    static {
        eim eimVar = new eim(new eil());
        b = eimVar;
        c = true;
        d = eimVar;
    }

    public eim(ein einVar) {
        this.a = einVar;
    }

    public static eim a() {
        if (d == b && c) {
            c = false;
            ((hkf) ((hkf) ((hkf) eiu.a.g()).j(Math.random() < 0.01d ? hlj.FULL : hlj.NONE)).i("com/google/android/libraries/performance/primes/Primes", "get", 179, "Primes.java")).s("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return d;
    }

    public static synchronized void b(eim eimVar) {
        synchronized (eim.class) {
            if (d != b) {
                ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/Primes", "cache", 139, "Primes.java")).s("Primes cached more than once. This call will be ignored.");
            } else {
                d = eimVar;
            }
        }
    }

    public final void c(eqa eqaVar) {
        this.a.c(eqaVar);
    }

    public final boolean d() {
        return this.a.e();
    }
}
