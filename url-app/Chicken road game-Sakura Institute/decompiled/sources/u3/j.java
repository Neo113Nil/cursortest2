package u3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import m3.t;
import z2.C1442z;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Method f10953c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f10954d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f10955e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f10956f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f10957g;

    public j(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f10953c = putMethod;
        this.f10954d = getMethod;
        this.f10955e = removeMethod;
        this.f10956f = clientProviderClass;
        this.f10957g = serverProviderClass;
    }

    @Override // u3.n
    public final void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f10955e.invoke(null, sslSocket);
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to remove ALPN", e5);
        }
    }

    @Override // u3.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((t) obj) != t.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C1442z.h(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t) it.next()).f8459d);
        }
        try {
            this.f10953c.invoke(null, sslSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f10956f, this.f10957g}, new i(arrayList2)));
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to set ALPN", e5);
        }
    }

    @Override // u3.n
    public final String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f10954d.invoke(null, sslSocket));
            Intrinsics.d(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            i iVar = (i) invocationHandler;
            boolean z4 = iVar.f10951b;
            if (!z4 && iVar.f10952c == null) {
                n.i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z4) {
                return null;
            }
            return iVar.f10952c;
        } catch (IllegalAccessException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        } catch (InvocationTargetException e5) {
            throw new AssertionError("failed to get ALPN selected protocol", e5);
        }
    }
}
