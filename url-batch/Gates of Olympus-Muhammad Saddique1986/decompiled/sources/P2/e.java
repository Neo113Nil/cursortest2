package P2;

import javax.net.ssl.SSLSocket;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class e implements l {
    @Override // P2.l
    public final boolean a(SSLSocket sSLSocket) {
        return AbstractC0737q.z(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    @Override // P2.l
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
