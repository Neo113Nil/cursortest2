package b8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final e f1406f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f1407a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1408b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f1409c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f1410d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f1411e;

    public f(Class cls) {
        this.f1407a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        r6.k.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f1408b = declaredMethod;
        this.f1409c = cls.getMethod("setHostname", String.class);
        this.f1410d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f1411e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // b8.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f1407a.isInstance(sSLSocket);
    }

    @Override // b8.n
    public final String b(SSLSocket sSLSocket) {
        if (this.f1407a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f1410d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, z6.a.f10114a);
                }
            } catch (IllegalAccessException e9) {
                throw new AssertionError(e9);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof NullPointerException) || !r6.k.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e10);
                }
            }
        }
        return null;
    }

    @Override // b8.n
    public final boolean c() {
        boolean z8 = a8.c.f541e;
        return a8.c.f541e;
    }

    @Override // b8.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        r6.k.f(list, "protocols");
        if (this.f1407a.isInstance(sSLSocket)) {
            try {
                this.f1408b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f1409c.invoke(sSLSocket, str);
                }
                Method method = this.f1411e;
                a8.o oVar = a8.o.f570a;
                method.invoke(sSLSocket, j4.i.j(list));
            } catch (IllegalAccessException e9) {
                throw new AssertionError(e9);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
