package r1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3969f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f3970a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3971b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f3972c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f3973d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3974e;

    public f(Class cls) {
        this.f3970a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        X0.f.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3971b = declaredMethod;
        this.f3972c = cls.getMethod("setHostname", String.class);
        this.f3973d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3974e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // r1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3970a.isInstance(sSLSocket);
    }

    @Override // r1.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.f3970a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f3973d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, e1.a.f2371a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && X0.f.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // r1.m
    public final boolean c() {
        boolean z2 = q1.c.f3935e;
        return q1.c.f3935e;
    }

    @Override // r1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.f.e(list, "protocols");
        if (this.f3970a.isInstance(sSLSocket)) {
            try {
                this.f3971b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3972c.invoke(sSLSocket, str);
                }
                Method method = this.f3974e;
                q1.n nVar = q1.n.f3960a;
                method.invoke(sSLSocket, H0.e.c(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
