package l3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import k3.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f2888f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f2889a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2890b;
    public final Method c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2891d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2892e;

    public f(Class cls) {
        this.f2889a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        u2.c.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f2890b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.f2891d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f2892e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // l3.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2889a.isInstance(sSLSocket);
    }

    @Override // l3.m
    public final String b(SSLSocket sSLSocket) {
        if (this.f2889a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f2891d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, b3.a.f967a);
                }
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                if (!(cause instanceof NullPointerException) || !u2.c.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e5);
                }
            }
        }
        return null;
    }

    @Override // l3.m
    public final boolean c() {
        boolean z3 = k3.c.f2823e;
        return k3.c.f2823e;
    }

    @Override // l3.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        u2.c.e(list, "protocols");
        if (this.f2889a.isInstance(sSLSocket)) {
            try {
                this.f2890b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.c.invoke(sSLSocket, str);
                }
                Method method = this.f2892e;
                o oVar = o.f2841a;
                method.invoke(sSLSocket, g2.f.h(list));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }
}
