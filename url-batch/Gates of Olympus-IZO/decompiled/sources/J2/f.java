package J2;

import h2.AbstractC0439a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f2621f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f2622a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2623b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f2624c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2625d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2626e;

    public f(Class cls) {
        this.f2622a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Z1.i.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f2623b = declaredMethod;
        this.f2624c = cls.getMethod("setHostname", String.class);
        this.f2625d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f2626e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // J2.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2622a.isInstance(sSLSocket);
    }

    @Override // J2.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f2622a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f2625d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, AbstractC0439a.f5056a);
            }
            return null;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if ((cause instanceof NullPointerException) && Z1.i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e4);
        }
    }

    @Override // J2.n
    public final boolean c() {
        boolean z3 = I2.c.f2492e;
        return I2.c.f2492e;
    }

    @Override // J2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z1.i.f(list, "protocols");
        if (this.f2622a.isInstance(sSLSocket)) {
            try {
                this.f2623b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f2624c.invoke(sSLSocket, str);
                }
                Method method = this.f2626e;
                I2.n nVar = I2.n.f2519a;
                method.invoke(sSLSocket, F0.a.f(list));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }
    }
}
