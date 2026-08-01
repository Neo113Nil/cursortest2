package A1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import s1.p;

/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: c, reason: collision with root package name */
    public final Method f33c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f34e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f35f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f36g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f33c = method;
        this.d = method2;
        this.f34e = method3;
        this.f35f = cls;
        this.f36g = cls2;
    }

    @Override // A1.o
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f34e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // A1.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        h1.d.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((p) obj) != p.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(W0.i.o0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p) it.next()).f3690a);
        }
        try {
            this.f33c.invoke(null, sSLSocket, Proxy.newProxyInstance(o.class.getClassLoader(), new Class[]{this.f35f, this.f36g}, new i(arrayList2)));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // A1.o
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            h1.d.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z2 = iVar.f31b;
            if (!z2 && iVar.f32c == null) {
                o.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return iVar.f32c;
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
