package q1;

import i1.v;
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
    public final Method f3946c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f3947d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3948e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f3949f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f3950g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f3946c = method;
        this.f3947d = method2;
        this.f3948e = method3;
        this.f3949f = cls;
        this.f3950g = cls2;
    }

    @Override // q1.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f3948e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    @Override // q1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        X0.f.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((v) obj) != v.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(O0.j.d0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((v) it.next()).f2775a);
        }
        try {
            this.f3946c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f3949f, this.f3950g}, new i(arrayList2)));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    @Override // q1.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f3947d.invoke(null, sSLSocket));
            X0.f.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z2 = iVar.f3944b;
            if (!z2 && iVar.f3945c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return iVar.f3945c;
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
