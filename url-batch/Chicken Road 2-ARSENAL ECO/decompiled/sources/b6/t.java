package b6;

import X5.C0217a;
import X5.C0218b;
import X5.z;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import l5.AbstractC0505i;
import l5.AbstractC0506j;
import l5.C0504h;
import m5.C0526c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class t implements x {

    /* renamed from: a, reason: collision with root package name */
    public final a6.e f3720a;

    /* renamed from: b, reason: collision with root package name */
    public final s f3721b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3722c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3723d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3724e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3725f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3726g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3727h;

    /* renamed from: i, reason: collision with root package name */
    public final C0217a f3728i;

    /* renamed from: j, reason: collision with root package name */
    public final a6.d f3729j;

    /* renamed from: k, reason: collision with root package name */
    public final a f3730k;

    /* renamed from: l, reason: collision with root package name */
    public A.j f3731l;

    /* renamed from: m, reason: collision with root package name */
    public y f3732m;

    /* renamed from: n, reason: collision with root package name */
    public z f3733n;

    /* renamed from: o, reason: collision with root package name */
    public final C0504h f3734o;

    public t(a6.e taskRunner, s connectionPool, int i7, int i8, int i9, int i10, boolean z5, boolean z6, C0217a address, a6.d routeDatabase, a connectionUser) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.i.e(connectionUser, "connectionUser");
        this.f3720a = taskRunner;
        this.f3721b = connectionPool;
        this.f3722c = i7;
        this.f3723d = i8;
        this.f3724e = i9;
        this.f3725f = i10;
        this.f3726g = z5;
        this.f3727h = z6;
        this.f3728i = address;
        this.f3729j = routeDatabase;
        this.f3730k = connectionUser;
        this.f3734o = new C0504h();
    }

    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.List] */
    public final e a() {
        String str;
        int i7;
        List list;
        boolean contains;
        z zVar = this.f3733n;
        if (zVar != null) {
            this.f3733n = null;
            return b(zVar, null);
        }
        A.j jVar = this.f3731l;
        if (jVar != null && jVar.f26b < ((ArrayList) jVar.f27c).size()) {
            int i8 = jVar.f26b;
            ArrayList arrayList = (ArrayList) jVar.f27c;
            if (i8 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i9 = jVar.f26b;
            jVar.f26b = i9 + 1;
            return b((z) arrayList.get(i9), null);
        }
        y yVar = this.f3732m;
        if (yVar == null) {
            yVar = new y(this.f3728i, this.f3729j, this.f3730k, this.f3727h);
            this.f3732m = yVar;
        }
        if (!yVar.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!yVar.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (yVar.f3744f < yVar.f3743e.size()) {
            C0217a c0217a = yVar.f3739a;
            if (yVar.f3744f >= yVar.f3743e.size()) {
                throw new SocketException("No route to " + c0217a.f2885h.f2977d + "; exhausted proxy configurations: " + yVar.f3743e);
            }
            List list2 = yVar.f3743e;
            int i10 = yVar.f3744f;
            yVar.f3744f = i10 + 1;
            Proxy proxy = (Proxy) list2.get(i10);
            a aVar = yVar.f3741c;
            ArrayList arrayList3 = new ArrayList();
            yVar.f3745g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                X5.o oVar = c0217a.f2885h;
                str = oVar.f2977d;
                i7 = oVar.f2978e;
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                kotlin.jvm.internal.i.e(inetSocketAddress, "<this>");
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.i.d(str, "getHostName(...)");
                } else {
                    str = address2.getHostAddress();
                    kotlin.jvm.internal.i.d(str, "getHostAddress(...)");
                }
                i7 = inetSocketAddress.getPort();
            }
            if (1 > i7 || i7 >= 65536) {
                throw new SocketException("No route to " + str + ':' + i7 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(str, i7));
            } else {
                F5.i iVar = Y5.b.f3098a;
                kotlin.jvm.internal.i.e(str, "<this>");
                F5.i iVar2 = Y5.b.f3098a;
                iVar2.getClass();
                if (iVar2.f806f.matcher(str).matches()) {
                    list = AbstractC0676f.n(InetAddress.getByName(str));
                } else {
                    aVar.getClass();
                    c0217a.f2878a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(str);
                        kotlin.jvm.internal.i.d(allByName, "getAllByName(...)");
                        List M3 = AbstractC0505i.M(allByName);
                        if (M3.isEmpty()) {
                            throw new UnknownHostException(c0217a.f2878a + " returned no addresses for " + str);
                        }
                        aVar.getClass();
                        list = M3;
                    } catch (NullPointerException e4) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e4);
                        throw unknownHostException;
                    }
                }
                if (yVar.f3742d && list.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj : list) {
                        if (((InetAddress) obj) instanceof Inet6Address) {
                            arrayList4.add(obj);
                        } else {
                            arrayList5.add(obj);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = Y5.c.f3099a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C0526c c0526c = new C0526c(10);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                c0526c.add(it.next());
                            }
                            if (it2.hasNext()) {
                                c0526c.add(it2.next());
                            }
                        }
                        list = AbstractC0676f.c(c0526c);
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i7));
                }
            }
            Iterator it4 = yVar.f3745g.iterator();
            while (it4.hasNext()) {
                z zVar2 = new z(yVar.f3739a, proxy, (InetSocketAddress) it4.next());
                a6.d dVar = yVar.f3740b;
                synchronized (dVar) {
                    contains = ((LinkedHashSet) dVar.f3172f).contains(zVar2);
                }
                if (contains) {
                    yVar.f3746h.add(zVar2);
                } else {
                    arrayList2.add(zVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC0506j.D(yVar.f3746h, arrayList2);
            yVar.f3746h.clear();
        }
        A.j jVar2 = new A.j(arrayList2);
        this.f3731l = jVar2;
        if (this.f3730k.m()) {
            throw new IOException("Canceled");
        }
        if (jVar2.f26b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i11 = jVar2.f26b;
        jVar2.f26b = i11 + 1;
        return b((z) arrayList2.get(i11), arrayList2);
    }

    public final e b(z route, ArrayList arrayList) {
        kotlin.jvm.internal.i.e(route, "route");
        C0217a c0217a = route.f3079a;
        if (c0217a.f2880c == null) {
            if (!c0217a.f2887j.contains(X5.i.f2941f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f3079a.f2885h.f2977d;
            h6.e eVar = h6.e.f4355a;
            if (!h6.e.f4355a.i(str)) {
                throw new UnknownServiceException(W4.o.e("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c0217a.f2886i.contains(X5.t.f3041l)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        D0.h hVar = null;
        if (route.f3080b.type() == Proxy.Type.HTTP) {
            C0217a c0217a2 = route.f3079a;
            if (c0217a2.f2880c != null || c0217a2.f2886i.contains(X5.t.f3041l)) {
                A.e eVar2 = new A.e();
                X5.o url = route.f3079a.f2885h;
                kotlin.jvm.internal.i.e(url, "url");
                eVar2.f8h = url;
                eVar2.i("CONNECT", null);
                C0217a c0217a3 = route.f3079a;
                eVar2.h("Host", Y5.e.h(c0217a3.f2885h, true));
                eVar2.h("Proxy-Connection", "Keep-Alive");
                eVar2.h("User-Agent", "okhttp/5.2.1");
                hVar = new D0.h(eVar2);
                X5.x body = X5.y.f3078f;
                Q4.j jVar = new Q4.j(2);
                C0218b c0218b = X5.t.f3036g;
                i6.g.o("Proxy-Authenticate");
                i6.g.p("OkHttp-Preemptive", "Proxy-Authenticate");
                jVar.d("Proxy-Authenticate");
                i6.g.j(jVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                jVar.c();
                kotlin.jvm.internal.i.e(body, "body");
                c0217a3.f2883f.getClass();
            }
        }
        return new e(this.f3720a, this.f3721b, this.f3722c, this.f3723d, this.f3724e, this.f3725f, this.f3726g, this.f3730k, this, route, arrayList, hVar, -1, false);
    }

    @Override // b6.x
    public final C0504h c() {
        return this.f3734o;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0082  */
    @Override // b6.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w d() {
        Socket o7;
        boolean z5;
        u uVar;
        r c7 = this.f3730k.c();
        if (c7 != null) {
            boolean g7 = c7.g(this.f3730k.l());
            synchronized (c7) {
                try {
                    if (g7) {
                        if (!c7.f3706l && f(c7.f3698d.f3079a.f2885h)) {
                            z5 = false;
                            o7 = null;
                        }
                        o7 = this.f3730k.o();
                        z5 = false;
                    } else {
                        z5 = !c7.f3706l;
                        c7.f3706l = true;
                        o7 = this.f3730k.o();
                    }
                } finally {
                }
            }
            if (this.f3730k.c() != null) {
                if (o7 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                uVar = new u(c7);
                if (uVar == null) {
                    return uVar;
                }
                u i7 = i(null, null);
                if (i7 != null) {
                    return i7;
                }
                if (!this.f3734o.isEmpty()) {
                    return (w) this.f3734o.removeFirst();
                }
                e a7 = a();
                u i8 = i(a7, a7.f3639k);
                return i8 != null ? i8 : a7;
            }
            if (o7 != null) {
                Y5.e.c(o7);
            }
            this.f3730k.getClass();
            this.f3730k.getClass();
            if (o7 != null) {
                this.f3730k.getClass();
            } else if (z5) {
                this.f3730k.getClass();
            }
        }
        uVar = null;
        if (uVar == null) {
        }
    }

    @Override // b6.x
    public final boolean e(r rVar) {
        y yVar;
        z zVar;
        if (this.f3734o.isEmpty() && this.f3733n == null) {
            if (rVar != null) {
                synchronized (rVar) {
                    zVar = null;
                    if (rVar.f3708n == 0 && rVar.f3706l && Y5.e.a(rVar.f3698d.f3079a.f2885h, this.f3728i.f2885h)) {
                        zVar = rVar.f3698d;
                    }
                }
                if (zVar != null) {
                    this.f3733n = zVar;
                    return true;
                }
            }
            A.j jVar = this.f3731l;
            if ((jVar == null || jVar.f26b >= ((ArrayList) jVar.f27c).size()) && (yVar = this.f3732m) != null) {
                return yVar.a();
            }
        }
        return true;
    }

    @Override // b6.x
    public final boolean f(X5.o url) {
        kotlin.jvm.internal.i.e(url, "url");
        X5.o oVar = this.f3728i.f2885h;
        return url.f2978e == oVar.f2978e && kotlin.jvm.internal.i.a(url.f2977d, oVar.f2977d);
    }

    @Override // b6.x
    public final C0217a g() {
        return this.f3728i;
    }

    @Override // b6.x
    public final boolean h() {
        return this.f3730k.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x004b, code lost:
    
        if ((r7.f3705k != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u i(e eVar, List list) {
        r rVar;
        boolean z5;
        Socket o7;
        s sVar = this.f3721b;
        boolean l7 = this.f3730k.l();
        C0217a address = this.f3728i;
        a connectionUser = this.f3730k;
        boolean z6 = eVar != null && eVar.e();
        sVar.getClass();
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(connectionUser, "connectionUser");
        Iterator it = sVar.f3719f.iterator();
        kotlin.jvm.internal.i.d(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = (r) it.next();
            kotlin.jvm.internal.i.b(rVar);
            synchronized (rVar) {
                if (z6) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (rVar.e(address, list)) {
                    connectionUser.a(rVar);
                    z5 = true;
                } else {
                    z5 = false;
                }
            }
            if (z5) {
                if (rVar.g(l7)) {
                    break;
                }
                synchronized (rVar) {
                    rVar.f3706l = true;
                    o7 = connectionUser.o();
                }
                if (o7 != null) {
                    Y5.e.c(o7);
                }
            }
        }
        if (rVar == null) {
            return null;
        }
        if (eVar != null) {
            this.f3733n = eVar.f3638j;
            Socket socket = eVar.f3645q;
            if (socket != null) {
                Y5.e.c(socket);
            }
        }
        this.f3730k.e(rVar);
        this.f3730k.f(rVar);
        return new u(rVar);
    }
}
