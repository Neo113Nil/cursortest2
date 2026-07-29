package org.apache.a.i;

/* compiled from: HttpConnectionParams.java */
/* loaded from: classes2.dex */
public final class c {
    public static int a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.socket.timeout", 0);
    }

    public static void a(d dVar, int i) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.b("http.socket.timeout", i);
    }

    public static boolean b(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.socket.reuseaddr", false);
    }

    public static boolean c(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.tcp.nodelay", true);
    }

    public static void a(d dVar, boolean z) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.b("http.tcp.nodelay", z);
    }

    public static int d(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.socket.buffer-size", -1);
    }

    public static void b(d dVar, int i) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.b("http.socket.buffer-size", i);
    }

    public static int e(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.socket.linger", -1);
    }

    public static int f(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.connection.timeout", 0);
    }

    public static void c(d dVar, int i) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        dVar.b("http.connection.timeout", i);
    }

    public static boolean g(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        }
        return dVar.a("http.connection.stalecheck", true);
    }
}
