package r1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3973f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f3974a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3975b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f3976c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f3977d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3978e;

    public f(Class cls) {
        this.f3974a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        X0.f.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3975b = declaredMethod;
        this.f3976c = cls.getMethod("setHostname", String.class);
        this.f3977d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3978e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // r1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3974a.isInstance(sSLSocket);
    }

    @Override // r1.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.f3974a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f3977d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, e1.a.f2375a);
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
        boolean z2 = q1.c.f3939e;
        return q1.c.f3939e;
    }

    @Override // r1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.f.e(list, "protocols");
        if (this.f3974a.isInstance(sSLSocket)) {
            try {
                this.f3975b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3976c.invoke(sSLSocket, str);
                }
                Method method = this.f3978e;
                q1.n nVar = q1.n.f3964a;
                method.invoke(sSLSocket, H0.e.c(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
