package J2;

import h2.AbstractC0454p;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class e implements l {
    @Override // J2.l
    public final boolean a(SSLSocket sSLSocket) {
        return AbstractC0454p.i0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.");
    }

    @Override // J2.l
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
