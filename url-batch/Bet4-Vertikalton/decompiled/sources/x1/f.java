package x1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f4239f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f4240a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4241b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f4242c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f4243e;

    public f(Class cls) {
        this.f4240a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        d1.d.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f4241b = declaredMethod;
        this.f4242c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f4243e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // x1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f4240a.isInstance(sSLSocket);
    }

    @Override // x1.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.f4240a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, k1.a.f2754a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && d1.d.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // x1.m
    public final boolean c() {
        boolean z2 = w1.c.f4173e;
        return w1.c.f4173e;
    }

    @Override // x1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        d1.d.e(list, "protocols");
        if (this.f4240a.isInstance(sSLSocket)) {
            try {
                this.f4241b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f4242c.invoke(sSLSocket, str);
                }
                Method method = this.f4243e;
                w1.n nVar = w1.n.f4190a;
                method.invoke(sSLSocket, J0.e.d(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
