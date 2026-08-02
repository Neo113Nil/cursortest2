package O3;

import G3.t;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Method f2071c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2072d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2073e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f2074f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2075g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f2071c = method;
        this.f2072d = method2;
        this.f2073e = method3;
        this.f2074f = cls;
        this.f2075g = cls2;
    }

    @Override // O3.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f2073e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to remove ALPN", e5);
        }
    }

    @Override // O3.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((t) obj) != t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(d3.k.Y(arrayList));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((t) obj2).f1006a);
        }
        try {
            this.f2071c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f2074f, this.f2075g}, new i(arrayList2)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to set ALPN", e5);
        }
    }

    @Override // O3.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f2072d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            i iVar = (i) invocationHandler;
            boolean z = iVar.f2069b;
            if (!z && iVar.f2070c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z) {
                return null;
            }
            return iVar.f2070c;
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to get ALPN selected protocol", e5);
        }
    }
}
