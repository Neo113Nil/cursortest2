package t1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3878f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f3879a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3880b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f3881c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3882e;

    public f(Class cls) {
        this.f3879a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Z0.d.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3880b = declaredMethod;
        this.f3881c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3882e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // t1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3879a.isInstance(sSLSocket);
    }

    @Override // t1.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.f3879a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, g1.a.f2438a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && Z0.d.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // t1.m
    public final boolean c() {
        boolean z2 = s1.c.f3805e;
        return s1.c.f3805e;
    }

    @Override // t1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z0.d.e(list, "protocols");
        if (this.f3879a.isInstance(sSLSocket)) {
            try {
                this.f3880b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3881c.invoke(sSLSocket, str);
                }
                Method method = this.f3882e;
                s1.n nVar = s1.n.f3825a;
                method.invoke(sSLSocket, I0.e.d(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
