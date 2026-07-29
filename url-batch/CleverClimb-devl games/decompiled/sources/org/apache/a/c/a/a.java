package org.apache.a.c.a;

/* compiled from: ConnManagerParams.java */
@Deprecated
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f9660a = new b() { // from class: org.apache.a.c.a.a.1
        @Override // org.apache.a.c.a.b
        public int a(org.apache.a.c.b.b bVar) {
            return 2;
        }
    };

    @Deprecated
    public static long a(org.apache.a.i.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        Long l = (Long) dVar.a("http.conn-manager.timeout");
        if (l != null) {
            return l.longValue();
        }
        return dVar.a("http.connection.timeout", 0);
    }

    @Deprecated
    public static b b(org.apache.a.i.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters must not be null.");
        }
        b bVar = (b) dVar.a("http.conn-manager.max-per-route");
        return bVar == null ? f9660a : bVar;
    }

    @Deprecated
    public static int c(org.apache.a.i.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters must not be null.");
        }
        return dVar.a("http.conn-manager.max-total", 20);
    }
}
