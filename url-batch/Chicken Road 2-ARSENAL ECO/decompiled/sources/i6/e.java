package i6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class e implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final U0.h f4437e = new U0.h(10);

    /* renamed from: a, reason: collision with root package name */
    public final Class f4438a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4439b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f4440c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f4441d;

    public e(Class cls) {
        this.f4438a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.i.d(declaredMethod, "getDeclaredMethod(...)");
        this.f4439b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f4440c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f4441d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // i6.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f4438a.isInstance(sSLSocket);
    }

    @Override // i6.n
    public final String b(SSLSocket sSLSocket) {
        if (this.f4438a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f4440c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, F5.a.f785a);
                }
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e7) {
                Throwable cause = e7.getCause();
                if (!(cause instanceof NullPointerException) || !kotlin.jvm.internal.i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e7);
                }
            }
        }
        return null;
    }

    @Override // i6.n
    public final boolean c() {
        boolean z5 = h6.c.f4352e;
        return h6.c.f4352e;
    }

    @Override // i6.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (this.f4438a.isInstance(sSLSocket)) {
            try {
                this.f4439b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f4441d;
                h6.e eVar = h6.e.f4355a;
                method.invoke(sSLSocket, R0.g.e(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e7) {
                throw new AssertionError(e7);
            }
        }
    }
}
