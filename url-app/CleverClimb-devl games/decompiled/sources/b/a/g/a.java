package b.a.g;

import android.util.Log;
import b.y;
import com.google.android.gms.games.GamesStatusCodes;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: AndroidPlatform.java */
/* loaded from: classes.dex */
class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f1998a;

    /* renamed from: b, reason: collision with root package name */
    private final d<Socket> f1999b;

    /* renamed from: c, reason: collision with root package name */
    private final d<Socket> f2000c;

    /* renamed from: d, reason: collision with root package name */
    private final d<Socket> f2001d;
    private final d<Socket> e;
    private final b f = b.a();

    public a(Class<?> cls, d<Socket> dVar, d<Socket> dVar2, d<Socket> dVar3, d<Socket> dVar4) {
        this.f1998a = cls;
        this.f1999b = dVar;
        this.f2000c = dVar2;
        this.f2001d = dVar3;
        this.e = dVar4;
    }

    @Override // b.a.g.e
    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!b.a.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // b.a.g.e
    public void a(SSLSocket sSLSocket, String str, List<y> list) {
        if (str != null) {
            this.f1999b.b(sSLSocket, true);
            this.f2000c.b(sSLSocket, str);
        }
        if (this.e == null || !this.e.a((d<Socket>) sSLSocket)) {
            return;
        }
        this.e.d(sSLSocket, b(list));
    }

    @Override // b.a.g.e
    public String a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (this.f2001d == null || !this.f2001d.a((d<Socket>) sSLSocket) || (bArr = (byte[]) this.f2001d.d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, b.a.c.e);
    }

    @Override // b.a.g.e
    public void a(int i, String str, Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i3 = min + 1;
        }
    }

    @Override // b.a.g.e
    public Object a(String str) {
        return this.f.a(str);
    }

    @Override // b.a.g.e
    public void a(String str, Object obj) {
        if (this.f.a(obj)) {
            return;
        }
        a(5, str, (Throwable) null);
    }

    @Override // b.a.g.e
    public boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(cls.getMethod(com.cmplay.base.util.ipc.a.FORCE_STATIC_METHOD, new Class[0]).invoke(null, new Object[0]), str)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // b.a.g.e
    public b.a.i.b a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new C0016a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    public static e a() {
        Class<?> cls;
        d dVar;
        d dVar2;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            d dVar3 = new d(null, "setUseSessionTickets", Boolean.TYPE);
            d dVar4 = new d(null, "setHostname", String.class);
            try {
                Class.forName("android.net.Network");
                dVar = new d(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            } catch (ClassNotFoundException unused2) {
                dVar = null;
            }
            try {
                dVar2 = new d(null, "setAlpnProtocols", byte[].class);
            } catch (ClassNotFoundException unused3) {
                dVar2 = null;
                return new a(cls2, dVar3, dVar4, dVar, dVar2);
            }
            return new a(cls2, dVar3, dVar4, dVar, dVar2);
        } catch (ClassNotFoundException unused4) {
            return null;
        }
    }

    /* compiled from: AndroidPlatform.java */
    /* renamed from: b.a.g.a$a, reason: collision with other inner class name */
    static final class C0016a extends b.a.i.b {

        /* renamed from: a, reason: collision with root package name */
        private final Object f2002a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f2003b;

        public int hashCode() {
            return 0;
        }

        C0016a(Object obj, Method method) {
            this.f2002a = obj;
            this.f2003b = method;
        }

        @Override // b.a.i.b
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f2003b.invoke(this.f2002a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C0016a;
        }
    }

    /* compiled from: AndroidPlatform.java */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Method f2004a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f2005b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f2006c;

        b(Method method, Method method2, Method method3) {
            this.f2004a = method;
            this.f2005b = method2;
            this.f2006c = method3;
        }

        Object a(String str) {
            if (this.f2004a != null) {
                try {
                    Object invoke = this.f2004a.invoke(null, new Object[0]);
                    this.f2005b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        boolean a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f2006c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        static b a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new b(method3, method2, method);
        }
    }
}
