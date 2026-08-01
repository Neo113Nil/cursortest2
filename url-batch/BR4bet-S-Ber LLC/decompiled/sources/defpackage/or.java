package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class or extends zz {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public or(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // defpackage.zz
    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // defpackage.zz
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((q00) obj) != q00.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yb.k0(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((q00) obj2).f);
        }
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(zz.class.getClassLoader(), new Class[]{this.f, this.g}, new nr(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // defpackage.zz
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            invocationHandler.getClass();
            nr nrVar = (nr) invocationHandler;
            boolean z = nrVar.b;
            if (!z && nrVar.c == null) {
                zz.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z) {
                return null;
            }
            return nrVar.c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
