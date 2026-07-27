package v3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f10998f;

    /* renamed from: a, reason: collision with root package name */
    public final Class f10999a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f11000b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f11001c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f11002d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f11003e;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f10998f = new e();
    }

    public f(Class sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f10999a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f11000b = declaredMethod;
        this.f11001c = sslSocketClass.getMethod("setHostname", String.class);
        this.f11002d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f11003e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // v3.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f10999a.isInstance(sslSocket);
    }

    @Override // v3.m
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f11002d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e5);
        }
    }

    @Override // v3.m
    public final boolean c() {
        boolean z4 = u3.c.f10935e;
        return u3.c.f10935e;
    }

    @Override // v3.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f11000b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f11001c.invoke(sslSocket, str);
                }
                Method method = this.f11003e;
                u3.n nVar = u3.n.f10964a;
                method.invoke(sslSocket, H1.f.j(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }
}
