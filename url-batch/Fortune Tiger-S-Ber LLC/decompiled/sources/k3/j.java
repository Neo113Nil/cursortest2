package k3;

import c3.r;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j extends o {
    public final Method c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2834d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2835e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f2836f;
    public final Class g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.f2834d = method2;
        this.f2835e = method3;
        this.f2836f = cls;
        this.g = cls2;
    }

    @Override // k3.o
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f2835e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to remove ALPN", e5);
        }
    }

    @Override // k3.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        u2.c.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r) obj) != r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(n2.i.E(arrayList));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            arrayList2.add(((r) obj2).f1126f);
        }
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(o.class.getClassLoader(), new Class[]{this.f2836f, this.g}, new i(arrayList2)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to set ALPN", e5);
        }
    }

    @Override // k3.o
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f2834d.invoke(null, sSLSocket));
            u2.c.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z3 = iVar.f2833b;
            if (!z3 && iVar.c == null) {
                o.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z3) {
                return null;
            }
            return iVar.c;
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to get ALPN selected protocol", e5);
        }
    }
}
