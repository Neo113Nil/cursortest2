package O6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public class e implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final c2.e f1936e;

    /* renamed from: a, reason: collision with root package name */
    public final Class f1937a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1938b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f1939c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f1940d;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f1936e = new c2.e();
    }

    public e(Class sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f1937a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.f1938b = declaredMethod;
        sslSocketClass.getMethod("setHostname", String.class);
        this.f1939c = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f1940d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // O6.n
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f1937a.isInstance(sslSocket);
    }

    @Override // O6.n
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            try {
                byte[] bArr = (byte[]) this.f1939c.invoke(sslSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                Throwable cause = e8.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e8);
                }
            }
        }
        return null;
    }

    @Override // O6.n
    public final boolean c() {
        boolean z7 = N6.c.f1876e;
        return N6.c.f1876e;
    }

    @Override // O6.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f1938b.invoke(sslSocket, Boolean.TRUE);
                Method method = this.f1940d;
                N6.e eVar = N6.e.f1879a;
                method.invoke(sslSocket, q1.h.j(protocols));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e8) {
                throw new AssertionError(e8);
            }
        }
    }
}
