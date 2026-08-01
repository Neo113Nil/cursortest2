package c4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f888f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f889a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f890b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f891c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f892e;

    public f(Class cls) {
        this.f889a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        i3.d.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f890b = declaredMethod;
        this.f891c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f892e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // c4.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f889a.isInstance(sSLSocket);
    }

    @Override // c4.m
    public final String b(SSLSocket sSLSocket) {
        if (this.f889a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, p3.a.f3089a);
                }
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                if (!(cause instanceof NullPointerException) || !i3.d.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e5);
                }
            }
        }
        return null;
    }

    @Override // c4.m
    public final boolean c() {
        boolean z4 = b4.c.f831e;
        return b4.c.f831e;
    }

    @Override // c4.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i3.d.e(list, "protocols");
        if (this.f889a.isInstance(sSLSocket)) {
            try {
                this.f890b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f891c.invoke(sSLSocket, str);
                }
                Method method = this.f892e;
                b4.n nVar = b4.n.f853a;
                method.invoke(sSLSocket, o2.f.e(list));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }
}
