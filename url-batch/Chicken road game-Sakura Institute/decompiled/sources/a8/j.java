package a8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import s7.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: c, reason: collision with root package name */
    public final Method f556c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f557d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f558e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f559f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f560g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f556c = method;
        this.f557d = method2;
        this.f558e = method3;
        this.f559f = cls;
        this.f560g = cls2;
    }

    @Override // a8.o
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f558e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e9) {
            throw new AssertionError("failed to remove ALPN", e9);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // a8.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        r6.k.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q) obj) != q.f8662g) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(e6.n.a0(arrayList, 10));
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList.get(i7);
            i7++;
            arrayList2.add(((q) obj2).f8669f);
        }
        try {
            this.f556c.invoke(null, sSLSocket, Proxy.newProxyInstance(o.class.getClassLoader(), new Class[]{this.f559f, this.f560g}, new i(arrayList2)));
        } catch (IllegalAccessException e9) {
            throw new AssertionError("failed to set ALPN", e9);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // a8.o
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f557d.invoke(null, sSLSocket));
            r6.k.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z8 = iVar.f554b;
            if (!z8 && iVar.f555c == null) {
                o.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z8) {
                return null;
            }
            return iVar.f555c;
        } catch (IllegalAccessException e9) {
            throw new AssertionError("failed to get ALPN selected protocol", e9);
        } catch (InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
