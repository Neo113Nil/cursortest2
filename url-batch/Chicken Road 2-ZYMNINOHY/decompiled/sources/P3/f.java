package P3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f2098f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f2099a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2100b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f2101c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2102d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2103e;

    public f(Class cls) {
        this.f2099a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.i.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f2100b = declaredMethod;
        this.f2101c = cls.getMethod("setHostname", String.class);
        this.f2102d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f2103e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // P3.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f2099a.isInstance(sSLSocket);
    }

    @Override // P3.n
    public final String b(SSLSocket sSLSocket) {
        if (this.f2099a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f2102d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC1504a.f15936a);
                }
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                if (!(cause instanceof NullPointerException) || !kotlin.jvm.internal.i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e5);
                }
            }
        }
        return null;
    }

    @Override // P3.n
    public final void c(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (this.f2099a.isInstance(sSLSocket)) {
            try {
                this.f2100b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f2101c.invoke(sSLSocket, str);
                }
                Method method = this.f2103e;
                O3.n nVar = O3.n.f2081a;
                method.invoke(sSLSocket, a2.i.k(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }

    @Override // P3.n
    public final boolean isSupported() {
        boolean z = O3.c.f2060e;
        return O3.c.f2060e;
    }
}
