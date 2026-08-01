package r1;

import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class e implements k {
    @Override // r1.k
    public final boolean a(SSLSocket sSLSocket) {
        return e1.l.i0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // r1.k
    public final m b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new f(cls2);
    }
}
