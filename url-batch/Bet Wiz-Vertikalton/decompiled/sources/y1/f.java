package y1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f4297f = new e();

    /* renamed from: a, reason: collision with root package name */
    public final Class f4298a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4299b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f4300c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f4301e;

    public f(Class cls) {
        this.f4298a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        e1.d.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f4299b = declaredMethod;
        this.f4300c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f4301e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // y1.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f4298a.isInstance(sSLSocket);
    }

    @Override // y1.m
    public final String b(SSLSocket sSLSocket) {
        if (!this.f4298a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, l1.a.f3159a);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && e1.d.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    @Override // y1.m
    public final boolean c() {
        boolean z2 = x1.c.f4269e;
        return x1.c.f4269e;
    }

    @Override // y1.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        e1.d.e(list, "protocols");
        if (this.f4298a.isInstance(sSLSocket)) {
            try {
                this.f4299b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f4300c.invoke(sSLSocket, str);
                }
                Method method = this.f4301e;
                x1.n nVar = x1.n.f4286a;
                method.invoke(sSLSocket, I0.e.d(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
