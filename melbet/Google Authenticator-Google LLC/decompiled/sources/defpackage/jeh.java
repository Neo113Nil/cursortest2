package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeh {
    private static jeh a;

    public static synchronized void a() {
        synchronized (jeh.class) {
            if (a == null) {
                a = new jeh();
            }
        }
    }
}
