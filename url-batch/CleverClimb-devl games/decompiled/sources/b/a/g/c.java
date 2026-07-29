package b.a.g;

import b.y;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: JdkWithJettyBootPlatform.java */
/* loaded from: classes.dex */
class c extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Method f2009a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f2010b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f2011c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<?> f2012d;
    private final Class<?> e;

    public c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f2009a = method;
        this.f2010b = method2;
        this.f2011c = method3;
        this.f2012d = cls;
        this.e = cls2;
    }

    @Override // b.a.g.e
    public void a(SSLSocket sSLSocket, String str, List<y> list) {
        try {
            this.f2009a.invoke(null, sSLSocket, Proxy.newProxyInstance(e.class.getClassLoader(), new Class[]{this.f2012d, this.e}, new a(a(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    @Override // b.a.g.e
    public void b(SSLSocket sSLSocket) {
        try {
            this.f2011c.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    @Override // b.a.g.e
    public String a(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f2010b.invoke(null, sSLSocket));
            if (!aVar.f2013a && aVar.f2014b == null) {
                e.b().a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            }
            if (aVar.f2013a) {
                return null;
            }
            return aVar.f2014b;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    public static e a() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new c(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    /* compiled from: JdkWithJettyBootPlatform.java */
    private static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        boolean f2013a;

        /* renamed from: b, reason: collision with root package name */
        String f2014b;

        /* renamed from: c, reason: collision with root package name */
        private final List<String> f2015c;

        public a(List<String> list) {
            this.f2015c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = b.a.c.f1854b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f2013a = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f2015c;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                List list = (List) objArr[0];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (this.f2015c.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.f2014b = str;
                        return str;
                    }
                }
                String str2 = this.f2015c.get(0);
                this.f2014b = str2;
                return str2;
            }
            if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                this.f2014b = (String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }
}
