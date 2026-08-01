package r1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3558f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3560b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f3561c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3562e;

    public f(Class cls) {
        this.f3559a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        X0.e.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3560b = declaredMethod;
        this.f3561c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3562e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // r1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3559a.isInstance(sSLSocket);
    }

    @Override // r1.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.f3559a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, e1.a.f1909a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && X0.e.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // r1.m
    public final boolean c() {
        boolean z2 = q1.c.f3532e;
        return q1.c.f3532e;
    }

    @Override // r1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.e.e(list, "protocols");
        if (this.f3559a.isInstance(sSLSocket)) {
            try {
                this.f3560b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3561c.invoke(sSLSocket, str);
                }
                Method method = this.f3562e;
                q1.n nVar = q1.n.f3549a;
                method.invoke(sSLSocket, H0.e.e(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
