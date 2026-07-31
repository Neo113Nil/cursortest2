package I2;

import A2.v;
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
    public final Method f2506c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2507d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2508e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f2509f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2510g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f2506c = method;
        this.f2507d = method2;
        this.f2508e = method3;
        this.f2509f = cls;
        this.f2510g = cls2;
    }

    @Override // I2.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f2508e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        }
    }

    @Override // I2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Z1.i.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((v) obj) != v.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(M1.n.g0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((v) it.next()).f191d);
        }
        try {
            this.f2506c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f2509f, this.f2510g}, new i(arrayList2)));
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        }
    }

    @Override // I2.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f2507d.invoke(null, sSLSocket));
            Z1.i.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z3 = iVar.f2504b;
            if (!z3 && iVar.f2505c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z3) {
                return null;
            }
            return iVar.f2505c;
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        }
    }
}
