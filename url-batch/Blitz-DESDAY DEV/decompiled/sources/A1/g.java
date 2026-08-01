package A1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class g implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final f f72f = new f();

    /* renamed from: a, reason: collision with root package name */
    public final Class f73a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f74b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f75c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f76e;

    public g(Class cls) {
        this.f73a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        g1.d.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f74b = declaredMethod;
        this.f75c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f76e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // A1.o
    public final boolean a(SSLSocket sSLSocket) {
        return this.f73a.isInstance(sSLSocket);
    }

    @Override // A1.o
    public final String b(SSLSocket sSLSocket) {
        if (!this.f73a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, n1.a.f3290a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && g1.d.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // A1.o
    public final boolean c() {
        boolean z2 = z1.c.f4348e;
        return z1.c.f4348e;
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        g1.d.e(list, "protocols");
        if (this.f73a.isInstance(sSLSocket)) {
            try {
                this.f74b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f75c.invoke(sSLSocket, str);
                }
                Method method = this.f76e;
                z1.o oVar = z1.o.f4365a;
                method.invoke(sSLSocket, z1.n.b(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
