package q1;

import i1.r;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Method f3561c;
    public final Method d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3562e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f3563f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f3564g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f3561c = method;
        this.d = method2;
        this.f3562e = method3;
        this.f3563f = cls;
        this.f3564g = cls2;
    }

    @Override // q1.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f3562e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // q1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.e.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r) obj) != r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(Q0.f.v0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r) it.next()).f2503a);
        }
        try {
            this.f3561c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f3563f, this.f3564g}, new i(arrayList2)));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // q1.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            X0.e.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z2 = iVar.f3559b;
            if (!z2 && iVar.f3560c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return iVar.f3560c;
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
