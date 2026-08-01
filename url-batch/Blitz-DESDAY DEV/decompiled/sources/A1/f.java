package A1;

import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class f implements m {
    @Override // A1.m
    public final boolean a(SSLSocket sSLSocket) {
        return n1.l.B(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // A1.m
    public final o b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new g(cls2);
    }
}
