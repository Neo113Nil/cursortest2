package A1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class g implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final f f8f = new f();

    /* renamed from: a, reason: collision with root package name */
    public final Class f9a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f10b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f11c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f12e;

    public g(Class cls) {
        this.f9a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        g1.d.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f10b = declaredMethod;
        this.f11c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f12e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // A1.o
    public final boolean a(SSLSocket sSLSocket) {
        return this.f9a.isInstance(sSLSocket);
    }

    @Override // A1.o
    public final String b(SSLSocket sSLSocket) {
        if (!this.f9a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, n1.a.f3243a);
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
        boolean z2 = z1.c.f4349e;
        return z1.c.f4349e;
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        g1.d.e(list, "protocols");
        if (this.f9a.isInstance(sSLSocket)) {
            try {
                this.f10b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f11c.invoke(sSLSocket, str);
                }
                Method method = this.f12e;
                z1.n nVar = z1.n.f4366a;
                method.invoke(sSLSocket, J0.e.d(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
