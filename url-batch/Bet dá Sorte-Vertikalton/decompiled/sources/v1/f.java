package v1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f4170f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f4173c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f4174e;

    public f(Class cls) {
        this.f4171a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        b1.d.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f4172b = declaredMethod;
        this.f4173c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f4174e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // v1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f4171a.isInstance(sSLSocket);
    }

    @Override // v1.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.f4171a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, i1.a.f2499a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && b1.d.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // v1.m
    public final boolean c() {
        boolean z2 = u1.c.f3947e;
        return u1.c.f3947e;
    }

    @Override // v1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        b1.d.e(list, "protocols");
        if (this.f4171a.isInstance(sSLSocket)) {
            try {
                this.f4172b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f4173c.invoke(sSLSocket, str);
                }
                Method method = this.f4174e;
                u1.n nVar = u1.n.f3966a;
                method.invoke(sSLSocket, M0.e.d(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
