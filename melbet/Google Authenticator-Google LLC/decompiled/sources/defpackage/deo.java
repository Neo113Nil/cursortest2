package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class deo {
    private static den a;

    public static synchronized den a() {
        den denVar;
        synchronized (deo.class) {
            if (a == null) {
                b(new der());
            }
            denVar = a;
        }
        return denVar;
    }

    public static synchronized void b(den denVar) {
        synchronized (deo.class) {
            if (a != null) {
                throw new IllegalStateException("init() already called");
            }
            a = denVar;
        }
    }
}
