package b8;

import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements l {
    @Override // b8.l
    public final boolean a(SSLSocket sSLSocket) {
        return z6.o.v(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    @Override // b8.l
    public final n b(SSLSocket sSLSocket) {
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
