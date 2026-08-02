package P3;

import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class e implements l {
    @Override // P3.l
    public final boolean a(SSLSocket sSLSocket) {
        return w3.o.a0(sSLSocket.getClass().getName(), kotlin.jvm.internal.i.h(".", "com.google.android.gms.org.conscrypt"), false);
    }

    @Override // P3.l
    public final n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(kotlin.jvm.internal.i.h(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new f(cls2);
    }
}
