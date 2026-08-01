package B1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f49f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f50a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f51b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f52c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f53e;

    public f(Class cls) {
        this.f50a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        h1.d.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f51b = declaredMethod;
        this.f52c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f53e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // B1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f50a.isInstance(sSLSocket);
    }

    @Override // B1.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f50a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, o1.a.f3416a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && h1.d.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // B1.n
    public final boolean c() {
        boolean z2 = A1.c.f22e;
        return A1.c.f22e;
    }

    @Override // B1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h1.d.e(list, "protocols");
        if (this.f50a.isInstance(sSLSocket)) {
            try {
                this.f51b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f52c.invoke(sSLSocket, str);
                }
                Method method = this.f53e;
                A1.o oVar = A1.o.f39a;
                method.invoke(sSLSocket, K0.e.d(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
