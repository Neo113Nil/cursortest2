package P2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import n2.AbstractC0721a;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f3929f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f3930a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3931b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f3932c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f3933d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3934e;

    public f(Class cls) {
        this.f3930a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        f2.j.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f3931b = declaredMethod;
        this.f3932c = cls.getMethod("setHostname", String.class);
        this.f3933d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f3934e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // P2.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f3930a.isInstance(sSLSocket);
    }

    @Override // P2.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f3930a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f3933d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, AbstractC0721a.f7347a);
            }
            return null;
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if ((cause instanceof NullPointerException) && f2.j.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e4);
        }
    }

    @Override // P2.n
    public final boolean c() {
        boolean z3 = O2.c.f3887e;
        return O2.c.f3887e;
    }

    @Override // P2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        f2.j.f(list, "protocols");
        if (this.f3930a.isInstance(sSLSocket)) {
            try {
                this.f3931b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f3932c.invoke(sSLSocket, str);
                }
                Method method = this.f3934e;
                O2.n nVar = O2.n.f3910a;
                method.invoke(sSLSocket, A1.i.f(list));
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }
    }
}
