package H6;

import D6.C;
import D6.C0093a;
import D6.D;
import D6.E;
import D6.F;
import D6.H;
import D6.z;
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
import kotlin.collections.C0633l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class t implements x {

    /* renamed from: a, reason: collision with root package name */
    public final G6.d f1107a;

    /* renamed from: b, reason: collision with root package name */
    public final s f1108b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1109c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1110d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1111e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1112f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1113g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1114h;

    /* renamed from: i, reason: collision with root package name */
    public final C0093a f1115i;
    public final l2.c j;

    /* renamed from: k, reason: collision with root package name */
    public final a f1116k;

    /* renamed from: l, reason: collision with root package name */
    public B6.p f1117l;

    /* renamed from: m, reason: collision with root package name */
    public y f1118m;

    /* renamed from: n, reason: collision with root package name */
    public F f1119n;

    /* renamed from: o, reason: collision with root package name */
    public final C0633l f1120o;

    public t(G6.d taskRunner, s connectionPool, int i2, int i5, int i7, int i8, boolean z7, boolean z8, C0093a address, l2.c routeDatabase, a connectionUser) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(connectionUser, "connectionUser");
        this.f1107a = taskRunner;
        this.f1108b = connectionPool;
        this.f1109c = i2;
        this.f1110d = i5;
        this.f1111e = i7;
        this.f1112f = i8;
        this.f1113g = z7;
        this.f1114h = z8;
        this.f1115i = address;
        this.j = routeDatabase;
        this.f1116k = connectionUser;
        this.f1120o = new C0633l();
    }

    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, java.util.List] */
    public final d a() {
        String domainName;
        int i2;
        List addresses;
        boolean contains;
        F f7 = this.f1119n;
        if (f7 != null) {
            this.f1119n = null;
            return c(f7, null);
        }
        B6.p pVar = this.f1117l;
        if (pVar != null && pVar.f233b < ((ArrayList) pVar.f234c).size()) {
            int i5 = pVar.f233b;
            ArrayList arrayList = (ArrayList) pVar.f234c;
            if (i5 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i7 = pVar.f233b;
            pVar.f233b = i7 + 1;
            return c((F) arrayList.get(i7), null);
        }
        y yVar = this.f1118m;
        if (yVar == null) {
            yVar = new y(this.f1115i, this.j, this.f1116k, this.f1114h);
            this.f1118m = yVar;
        }
        if (!yVar.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!yVar.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (yVar.f1130f < yVar.f1129e.size()) {
            C0093a c0093a = yVar.f1125a;
            if (yVar.f1130f >= yVar.f1129e.size()) {
                throw new SocketException("No route to " + c0093a.f463h.f565d + "; exhausted proxy configurations: " + yVar.f1129e);
            }
            List list = yVar.f1129e;
            int i8 = yVar.f1130f;
            yVar.f1130f = i8 + 1;
            Proxy proxy = (Proxy) list.get(i8);
            a aVar = yVar.f1127c;
            ArrayList arrayList3 = new ArrayList();
            yVar.f1131g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                D6.s sVar = c0093a.f463h;
                domainName = sVar.f565d;
                i2 = sVar.f566e;
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    domainName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(domainName, "getHostName(...)");
                } else {
                    domainName = address2.getHostAddress();
                    Intrinsics.checkNotNullExpressionValue(domainName, "getHostAddress(...)");
                }
                i2 = inetSocketAddress.getPort();
            }
            if (1 > i2 || i2 >= 65536) {
                throw new SocketException("No route to " + domainName + ':' + i2 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(domainName, i2));
            } else {
                Regex regex = E6.b.f708a;
                Intrinsics.checkNotNullParameter(domainName, "<this>");
                if (E6.b.f708a.c(domainName)) {
                    addresses = kotlin.collections.q.b(InetAddress.getByName(domainName));
                } else {
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(domainName, "socketHost");
                    q call = aVar.f1011a;
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(domainName, "domainName");
                    c0093a.f456a.getClass();
                    Intrinsics.checkNotNullParameter(domainName, "hostname");
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(domainName);
                        Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(...)");
                        List inetAddressList = kotlin.collections.p.r(allByName);
                        if (inetAddressList.isEmpty()) {
                            throw new UnknownHostException(c0093a.f456a + " returned no addresses for " + domainName);
                        }
                        Intrinsics.checkNotNullParameter(domainName, "socketHost");
                        Intrinsics.checkNotNullParameter(inetAddressList, "result");
                        q call2 = aVar.f1011a;
                        Intrinsics.checkNotNullParameter(call2, "call");
                        Intrinsics.checkNotNullParameter(domainName, "domainName");
                        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
                        addresses = inetAddressList;
                    } catch (NullPointerException e7) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(domainName));
                        unknownHostException.initCause(e7);
                        throw unknownHostException;
                    }
                }
                if (yVar.f1128d) {
                    Intrinsics.checkNotNullParameter(addresses, "addresses");
                    if (addresses.size() >= 2) {
                        ArrayList a7 = new ArrayList();
                        ArrayList b7 = new ArrayList();
                        for (Object obj : addresses) {
                            if (((InetAddress) obj) instanceof Inet6Address) {
                                a7.add(obj);
                            } else {
                                b7.add(obj);
                            }
                        }
                        if (!a7.isEmpty() && !b7.isEmpty()) {
                            byte[] bArr = E6.c.f709a;
                            Intrinsics.checkNotNullParameter(a7, "a");
                            Intrinsics.checkNotNullParameter(b7, "b");
                            Iterator it = a7.iterator();
                            Iterator it2 = b7.iterator();
                            S5.e eVar = new S5.e(0, 1, null);
                            while (true) {
                                if (!it.hasNext() && !it2.hasNext()) {
                                    break;
                                }
                                if (it.hasNext()) {
                                    eVar.add(it.next());
                                }
                                if (it2.hasNext()) {
                                    eVar.add(it2.next());
                                }
                            }
                            addresses = kotlin.collections.q.a(eVar);
                        }
                    }
                }
                Iterator it3 = addresses.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i2));
                }
            }
            Iterator it4 = yVar.f1131g.iterator();
            while (it4.hasNext()) {
                F route = new F(yVar.f1125a, proxy, (InetSocketAddress) it4.next());
                l2.c cVar = yVar.f1126b;
                synchronized (cVar) {
                    Intrinsics.checkNotNullParameter(route, "route");
                    contains = ((LinkedHashSet) cVar.f6269d).contains(route);
                }
                if (contains) {
                    yVar.f1132h.add(route);
                } else {
                    arrayList2.add(route);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            kotlin.collections.w.h(yVar.f1132h, arrayList2);
            yVar.f1132h.clear();
        }
        B6.p pVar2 = new B6.p(arrayList2, 4);
        this.f1117l = pVar2;
        if (this.f1116k.j()) {
            throw new IOException("Canceled");
        }
        if (pVar2.f233b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i9 = pVar2.f233b;
        pVar2.f233b = i9 + 1;
        return c((F) arrayList2.get(i9), arrayList2);
    }

    @Override // H6.x
    public final boolean b(r rVar) {
        y yVar;
        F f7;
        if (this.f1120o.isEmpty() && this.f1119n == null) {
            if (rVar != null) {
                synchronized (rVar) {
                    f7 = null;
                    if (rVar.f1096m == 0 && rVar.f1094k && E6.e.a(rVar.f1088d.f444a.f463h, this.f1115i.f463h)) {
                        f7 = rVar.f1088d;
                    }
                }
                if (f7 != null) {
                    this.f1119n = f7;
                    return true;
                }
            }
            B6.p pVar = this.f1117l;
            if ((pVar == null || pVar.f233b >= ((ArrayList) pVar.f234c).size()) && (yVar = this.f1118m) != null) {
                return yVar.a();
            }
        }
        return true;
    }

    public final d c(F route, ArrayList arrayList) {
        z request;
        Intrinsics.checkNotNullParameter(route, "route");
        C0093a c0093a = route.f444a;
        if (c0093a.f458c == null) {
            if (!c0093a.j.contains(D6.j.f518f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f444a.f463h.f565d;
            N6.e eVar = N6.e.f1879a;
            if (!N6.e.f1879a.i(str)) {
                throw new UnknownServiceException(r4.f.d("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c0093a.f464i.contains(D6.x.f628o)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (route.f445b.type() == Proxy.Type.HTTP) {
            C0093a c0093a2 = route.f444a;
            if (c0093a2.f458c != null || c0093a2.f464i.contains(D6.x.f628o)) {
                D6.y yVar = new D6.y();
                D6.s url = route.f444a.f463h;
                Intrinsics.checkNotNullParameter(url, "url");
                yVar.f634e = url;
                yVar.d("CONNECT", null);
                C0093a c0093a3 = route.f444a;
                yVar.b("Host", E6.e.h(c0093a3.f463h, true));
                yVar.b("Proxy-Connection", "Keep-Alive");
                yVar.b("User-Agent", "okhttp/5.2.1");
                request = new z(yVar);
                D d7 = E.f443d;
                D6.l lVar = H.f455b;
                C4.d dVar = new C4.d(2);
                Intrinsics.checkNotNullParameter(request, "request");
                D6.x protocol = D6.x.f625l;
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
                Intrinsics.checkNotNullParameter("Proxy-Authenticate", "name");
                Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
                dVar.i("Proxy-Authenticate", "OkHttp-Preemptive");
                C response = new C(request, protocol, "Preemptive Authenticate", 407, null, dVar.d(), d7, null, null, null, null, -1L, -1L, null, lVar);
                ((D6.l) c0093a3.f461f).getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return new d(this.f1107a, this.f1108b, this.f1109c, this.f1110d, this.f1111e, this.f1112f, this.f1113g, this.f1116k, this, route, arrayList, request, -1, false);
            }
        }
        request = null;
        return new d(this.f1107a, this.f1108b, this.f1109c, this.f1110d, this.f1111e, this.f1112f, this.f1113g, this.f1116k, this, route, arrayList, request, -1, false);
    }

    @Override // H6.x
    public final C0633l d() {
        return this.f1120o;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b2  */
    @Override // H6.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w e() {
        Socket k7;
        boolean z7;
        u uVar;
        r connection = this.f1116k.d();
        if (connection != null) {
            boolean g7 = connection.g(this.f1116k.i());
            synchronized (connection) {
                try {
                    if (g7) {
                        if (!connection.f1094k && h(connection.f1088d.f444a.f463h)) {
                            z7 = false;
                            k7 = null;
                        }
                        k7 = this.f1116k.k();
                        z7 = false;
                    } else {
                        z7 = !connection.f1094k;
                        connection.f1094k = true;
                        k7 = this.f1116k.k();
                    }
                } finally {
                }
            }
            if (this.f1116k.d() != null) {
                if (k7 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                uVar = new u(connection);
                if (uVar == null) {
                    return uVar;
                }
                u i2 = i(null, null);
                if (i2 != null) {
                    return i2;
                }
                if (!this.f1120o.isEmpty()) {
                    return (w) this.f1120o.removeFirst();
                }
                d a7 = a();
                u i5 = i(a7, a7.f1024k);
                return i5 != null ? i5 : a7;
            }
            if (k7 != null) {
                E6.e.c(k7);
            }
            a aVar = this.f1116k;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            q call = aVar.f1011a;
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(connection, "connection");
            a aVar2 = this.f1116k;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            q call2 = aVar2.f1011a;
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(call2, "call");
            if (k7 != null) {
                this.f1116k.getClass();
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else if (z7) {
                this.f1116k.getClass();
                Intrinsics.checkNotNullParameter(connection, "connection");
                Intrinsics.checkNotNullParameter(connection, "connection");
            }
        }
        uVar = null;
        if (uVar == null) {
        }
    }

    @Override // H6.x
    public final C0093a f() {
        return this.f1115i;
    }

    @Override // H6.x
    public final boolean g() {
        return this.f1116k.j();
    }

    @Override // H6.x
    public final boolean h(D6.s url) {
        Intrinsics.checkNotNullParameter(url, "url");
        D6.s sVar = this.f1115i.f463h;
        return url.f566e == sVar.f566e && Intrinsics.a(url.f565d, sVar.f565d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x004b, code lost:
    
        if ((r7.j != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u i(d dVar, List list) {
        r connection;
        boolean z7;
        boolean z8;
        Socket k7;
        s sVar = this.f1108b;
        boolean i2 = this.f1116k.i();
        C0093a address = this.f1115i;
        a connectionUser = this.f1116k;
        boolean z9 = dVar != null && dVar.e();
        sVar.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(connectionUser, "connectionUser");
        Iterator it = sVar.f1106e.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                connection = null;
                break;
            }
            connection = (r) it.next();
            Intrinsics.b(connection);
            synchronized (connection) {
                if (z9) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (connection.e(address, list)) {
                    connectionUser.a(connection);
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                if (connection.g(i2)) {
                    break;
                }
                synchronized (connection) {
                    z8 = connection.f1094k;
                    connection.f1094k = true;
                    k7 = connectionUser.k();
                }
                if (k7 != null) {
                    E6.e.c(k7);
                    Intrinsics.checkNotNullParameter(connection, "connection");
                } else if (!z8) {
                    Intrinsics.checkNotNullParameter(connection, "connection");
                }
            }
        }
        if (connection == null) {
            return null;
        }
        if (dVar != null) {
            this.f1119n = dVar.j;
            Socket socket = dVar.f1030q;
            if (socket != null) {
                E6.e.c(socket);
            }
        }
        this.f1116k.g(connection);
        this.f1116k.h(connection);
        return new u(connection);
    }
}
