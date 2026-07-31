package O2;

import G2.s;
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
    public final Method f3899c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f3900d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f3901e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f3902f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f3903g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f3899c = method;
        this.f3900d = method2;
        this.f3901e = method3;
        this.f3902f = cls;
        this.f3903g = cls2;
    }

    @Override // O2.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f3901e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        }
    }

    @Override // O2.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        f2.j.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((s) obj) != s.f2273e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(S1.n.E0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((s) it.next()).f2280d);
        }
        try {
            this.f3899c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f3902f, this.f3903g}, new i(arrayList2)));
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        }
    }

    @Override // O2.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f3900d.invoke(null, sSLSocket));
            f2.j.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z3 = iVar.f3897b;
            if (!z3 && iVar.f3898c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z3) {
                return null;
            }
            return iVar.f3898c;
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        }
    }
}
