package I1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f550f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f551a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f552b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f553c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f554e;

    public f(Class cls) {
        this.f551a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        k1.e.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f552b = declaredMethod;
        this.f553c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f554e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // I1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f551a.isInstance(sSLSocket);
    }

    @Override // I1.n
    public final String b(SSLSocket sSLSocket) {
        if (!this.f551a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, r1.a.f3833a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && k1.e.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // I1.n
    public final boolean c() {
        boolean z2 = H1.c.f508e;
        return H1.c.f508e;
    }

    @Override // I1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        k1.e.e(list, "protocols");
        if (this.f551a.isInstance(sSLSocket)) {
            try {
                this.f552b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f553c.invoke(sSLSocket, str);
                }
                Method method = this.f554e;
                H1.n nVar = H1.n.f525a;
                method.invoke(sSLSocket, R0.e.e(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
