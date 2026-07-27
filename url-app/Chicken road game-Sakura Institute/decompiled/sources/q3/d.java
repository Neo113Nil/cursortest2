package q3;

import f1.C0607a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m3.C0862a;
import m3.m;
import m3.y;
import p2.C0994a;
import t3.C;
import t3.C1210a;
import t3.EnumC1211b;
import z2.C1400D;
import z2.C1439w;
import z2.C1440x;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final j f9377a;

    /* renamed from: b, reason: collision with root package name */
    public final C0862a f9378b;

    /* renamed from: c, reason: collision with root package name */
    public final g f9379c;

    /* renamed from: d, reason: collision with root package name */
    public C0994a f9380d;

    /* renamed from: e, reason: collision with root package name */
    public l f9381e;

    /* renamed from: f, reason: collision with root package name */
    public int f9382f;

    /* renamed from: g, reason: collision with root package name */
    public int f9383g;

    /* renamed from: h, reason: collision with root package name */
    public int f9384h;

    /* renamed from: i, reason: collision with root package name */
    public y f9385i;

    public d(j connectionPool, C0862a address, g call) {
        m3.j eventListener = m3.j.f8386d;
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f9377a = connectionPool;
        this.f9378b = address;
        this.f9379c = call;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0320 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i a(int i2, int i4, int i5, boolean z4, boolean z5) {
        ArrayList routes;
        String domainName;
        int i6;
        List list;
        boolean contains;
        C0607a c0607a;
        Socket h4;
        while (!this.f9379c.f9400s) {
            i connection = this.f9379c.f9395n;
            if (connection != null) {
                synchronized (connection) {
                    try {
                        if (!connection.f9412j && b(connection.f9404b.f8490a.f8320h)) {
                            h4 = null;
                            Unit unit = Unit.f7487a;
                        }
                        h4 = this.f9379c.h();
                        Unit unit2 = Unit.f7487a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f9379c.f9395n != null) {
                    if (h4 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!connection.i(z5)) {
                        return connection;
                    }
                    connection.k();
                    if (this.f9385i == null) {
                        C0994a c0994a = this.f9380d;
                        if (c0994a != null ? c0994a.c() : true) {
                            continue;
                        } else {
                            l lVar = this.f9381e;
                            if (!(lVar != null ? lVar.j() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (h4 != null) {
                        n3.b.d(h4);
                    }
                    Intrinsics.checkNotNullParameter(this.f9379c, "call");
                    Intrinsics.checkNotNullParameter(connection, "connection");
                }
            }
            this.f9382f = 0;
            this.f9383g = 0;
            this.f9384h = 0;
            if (this.f9377a.a(this.f9378b, this.f9379c, null, false)) {
                connection = this.f9379c.f9395n;
                Intrinsics.c(connection);
                Intrinsics.checkNotNullParameter(this.f9379c, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else {
                y route = this.f9385i;
                try {
                    if (route != null) {
                        this.f9385i = null;
                    } else {
                        C0994a c0994a2 = this.f9380d;
                        if (c0994a2 == null || !c0994a2.c()) {
                            l lVar2 = this.f9381e;
                            if (lVar2 == null) {
                                C0862a c0862a = this.f9378b;
                                g gVar = this.f9379c;
                                lVar2 = new l(c0862a, gVar.f9388d.f8431E, gVar);
                                this.f9381e = lVar2;
                            }
                            if (!lVar2.j()) {
                                throw new NoSuchElementException();
                            }
                            routes = new ArrayList();
                            while (lVar2.f9426a < ((List) lVar2.f9430e).size()) {
                                boolean z6 = lVar2.f9426a < ((List) lVar2.f9430e).size();
                                C0862a c0862a2 = (C0862a) lVar2.f9427b;
                                if (!z6) {
                                    throw new SocketException("No route to " + c0862a2.f8320h.f8396d + "; exhausted proxy configurations: " + ((List) lVar2.f9430e));
                                }
                                List list2 = (List) lVar2.f9430e;
                                int i7 = lVar2.f9426a;
                                lVar2.f9426a = i7 + 1;
                                Proxy proxy = (Proxy) list2.get(i7);
                                ArrayList arrayList = new ArrayList();
                                lVar2.f9431f = arrayList;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    m mVar = c0862a2.f8320h;
                                    domainName = mVar.f8396d;
                                    i6 = mVar.f8397e;
                                } else {
                                    SocketAddress proxyAddress = proxy.address();
                                    if (!(proxyAddress instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
                                    }
                                    Intrinsics.checkNotNullExpressionValue(proxyAddress, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                                    Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
                                    InetAddress address = inetSocketAddress.getAddress();
                                    if (address == null) {
                                        domainName = inetSocketAddress.getHostName();
                                        Intrinsics.checkNotNullExpressionValue(domainName, "hostName");
                                    } else {
                                        domainName = address.getHostAddress();
                                        Intrinsics.checkNotNullExpressionValue(domainName, "address.hostAddress");
                                    }
                                    i6 = inetSocketAddress.getPort();
                                }
                                if (1 > i6 || i6 >= 65536) {
                                    throw new SocketException("No route to " + domainName + ':' + i6 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList.add(InetSocketAddress.createUnresolved(domainName, i6));
                                } else {
                                    byte[] bArr = n3.b.f8558a;
                                    Intrinsics.checkNotNullParameter(domainName, "<this>");
                                    if (n3.b.f8563f.b(domainName)) {
                                        list = C1440x.a(InetAddress.getByName(domainName));
                                    } else {
                                        g call = (g) lVar2.f9429d;
                                        Intrinsics.checkNotNullParameter(call, "call");
                                        Intrinsics.checkNotNullParameter(domainName, "domainName");
                                        c0862a2.f8313a.getClass();
                                        Intrinsics.checkNotNullParameter(domainName, "hostname");
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(domainName);
                                            Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                                            List inetAddressList = C1439w.z(allByName);
                                            if (inetAddressList.isEmpty()) {
                                                throw new UnknownHostException(c0862a2.f8313a + " returned no addresses for " + domainName);
                                            }
                                            Intrinsics.checkNotNullParameter(call, "call");
                                            Intrinsics.checkNotNullParameter(domainName, "domainName");
                                            Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
                                            list = inetAddressList;
                                        } catch (NullPointerException e4) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(domainName));
                                            unknownHostException.initCause(e4);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new InetSocketAddress((InetAddress) it.next(), i6));
                                    }
                                }
                                Iterator it2 = lVar2.f9431f.iterator();
                                while (it2.hasNext()) {
                                    y route2 = new y((C0862a) lVar2.f9427b, proxy, (InetSocketAddress) it2.next());
                                    C0607a c0607a2 = (C0607a) lVar2.f9428c;
                                    synchronized (c0607a2) {
                                        Intrinsics.checkNotNullParameter(route2, "route");
                                        contains = ((LinkedHashSet) c0607a2.f6561e).contains(route2);
                                    }
                                    if (contains) {
                                        ((ArrayList) lVar2.f9432g).add(route2);
                                    } else {
                                        routes.add(route2);
                                    }
                                }
                                if (!routes.isEmpty()) {
                                    break;
                                }
                            }
                            if (routes.isEmpty()) {
                                C1400D.j((ArrayList) lVar2.f9432g, routes);
                                ((ArrayList) lVar2.f9432g).clear();
                            }
                            Intrinsics.checkNotNullParameter(routes, "routes");
                            C0994a c0994a3 = new C0994a();
                            c0994a3.f9083a = routes;
                            this.f9380d = c0994a3;
                            if (this.f9379c.f9400s) {
                                throw new IOException("Canceled");
                            }
                            if (this.f9377a.a(this.f9378b, this.f9379c, routes, false)) {
                                connection = this.f9379c.f9395n;
                                Intrinsics.c(connection);
                                Intrinsics.checkNotNullParameter(this.f9379c, "call");
                                Intrinsics.checkNotNullParameter(connection, "connection");
                            } else {
                                if (!c0994a3.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i8 = c0994a3.f9084b;
                                c0994a3.f9084b = i8 + 1;
                                route = (y) routes.get(i8);
                                connection = new i(this.f9377a, route);
                                this.f9379c.f9402u = connection;
                                connection.c(i2, i4, i5, z4, this.f9379c);
                                this.f9379c.f9402u = null;
                                c0607a = this.f9379c.f9388d.f8431E;
                                synchronized (c0607a) {
                                    Intrinsics.checkNotNullParameter(route, "route");
                                    ((LinkedHashSet) c0607a.f6561e).remove(route);
                                }
                                if (this.f9377a.a(this.f9378b, this.f9379c, routes, true)) {
                                    i connection2 = this.f9379c.f9395n;
                                    Intrinsics.c(connection2);
                                    this.f9385i = route;
                                    Socket socket = connection.f9406d;
                                    Intrinsics.c(socket);
                                    n3.b.d(socket);
                                    Intrinsics.checkNotNullParameter(this.f9379c, "call");
                                    Intrinsics.checkNotNullParameter(connection2, "connection");
                                    connection = connection2;
                                } else {
                                    synchronized (connection) {
                                        j jVar = this.f9377a;
                                        jVar.getClass();
                                        Intrinsics.checkNotNullParameter(connection, "connection");
                                        byte[] bArr2 = n3.b.f8558a;
                                        jVar.f9423d.add(connection);
                                        jVar.f9421b.c(jVar.f9422c, 0L);
                                        this.f9379c.a(connection);
                                        Unit unit3 = Unit.f7487a;
                                    }
                                    Intrinsics.checkNotNullParameter(this.f9379c, "call");
                                    Intrinsics.checkNotNullParameter(connection, "connection");
                                }
                            }
                        } else {
                            C0994a c0994a4 = this.f9380d;
                            Intrinsics.c(c0994a4);
                            if (!c0994a4.c()) {
                                throw new NoSuchElementException();
                            }
                            int i9 = c0994a4.f9084b;
                            c0994a4.f9084b = i9 + 1;
                            route = (y) c0994a4.f9083a.get(i9);
                        }
                    }
                    connection.c(i2, i4, i5, z4, this.f9379c);
                    this.f9379c.f9402u = null;
                    c0607a = this.f9379c.f9388d.f8431E;
                    synchronized (c0607a) {
                    }
                } catch (Throwable th2) {
                    this.f9379c.f9402u = null;
                    throw th2;
                }
                routes = null;
                connection = new i(this.f9377a, route);
                this.f9379c.f9402u = connection;
            }
            if (!connection.i(z5)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(m url) {
        Intrinsics.checkNotNullParameter(url, "url");
        m mVar = this.f9378b.f8320h;
        return url.f8397e == mVar.f8397e && Intrinsics.a(url.f8396d, mVar.f8396d);
    }

    public final void c(IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f9385i = null;
        if ((e4 instanceof C) && ((C) e4).f10747d == EnumC1211b.REFUSED_STREAM) {
            this.f9382f++;
        } else if (e4 instanceof C1210a) {
            this.f9383g++;
        } else {
            this.f9384h++;
        }
    }
}
