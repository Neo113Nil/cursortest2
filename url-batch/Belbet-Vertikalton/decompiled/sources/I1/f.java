package I1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f608f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f609a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f610b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f611c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f612d;
    public final Method e;

    public f(Class cls) {
        this.f609a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        j1.h.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f610b = declaredMethod;
        this.f611c = cls.getMethod("setHostname", String.class);
        this.f612d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // I1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f609a.isInstance(sSLSocket);
    }

    @Override // I1.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f609a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f612d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, q1.a.f3995a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && j1.h.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // I1.n
    public final boolean c() {
        boolean z2 = H1.c.e;
        return H1.c.e;
    }

    @Override // I1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        j1.h.e(list, "protocols");
        if (this.f609a.isInstance(sSLSocket)) {
            try {
                this.f610b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f611c.invoke(sSLSocket, str);
                }
                Method method = this.e;
                H1.n nVar = H1.n.f570a;
                method.invoke(sSLSocket, N0.e.d(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
