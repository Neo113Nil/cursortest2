package i8;

import B2.N;
import com.google.android.gms.internal.ads.V5;
import e8.C4483a;
import e8.C4484b;
import e8.z;
import g1.C4523c;
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
import q2.C4903n;
import r7.AbstractC4978i;
import r7.AbstractC4979j;
import r7.C4977h;
import s7.C5003c;

/* loaded from: classes2.dex */
public final class t implements x {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f38429A;

    /* renamed from: B, reason: collision with root package name */
    public final C4483a f38430B;

    /* renamed from: C, reason: collision with root package name */
    public final C4523c f38431C;

    /* renamed from: D, reason: collision with root package name */
    public final a f38432D;

    /* renamed from: E, reason: collision with root package name */
    public V5 f38433E;

    /* renamed from: F, reason: collision with root package name */
    public y f38434F;

    /* renamed from: G, reason: collision with root package name */
    public z f38435G;

    /* renamed from: H, reason: collision with root package name */
    public final C4977h f38436H;

    /* renamed from: n, reason: collision with root package name */
    public final h8.e f38437n;

    /* renamed from: u, reason: collision with root package name */
    public final s f38438u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38439v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38440w;

    /* renamed from: x, reason: collision with root package name */
    public final int f38441x;

    /* renamed from: y, reason: collision with root package name */
    public final int f38442y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f38443z;

    public t(h8.e taskRunner, s connectionPool, int i, int i4, int i9, int i10, boolean z8, boolean z9, C4483a address, C4523c routeDatabase, a connectionUser) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        this.f38437n = taskRunner;
        this.f38438u = connectionPool;
        this.f38439v = i;
        this.f38440w = i4;
        this.f38441x = i9;
        this.f38442y = i10;
        this.f38443z = z8;
        this.f38429A = z9;
        this.f38430B = address;
        this.f38431C = routeDatabase;
        this.f38432D = connectionUser;
        this.f38436H = new C4977h();
    }

    @Override // i8.x
    public final boolean a(r rVar) {
        y yVar;
        z zVar;
        if (this.f38436H.isEmpty() && this.f38435G == null) {
            if (rVar != null) {
                synchronized (rVar) {
                    zVar = null;
                    if (rVar.f38417n == 0 && rVar.f38415l && f8.d.a(rVar.f38408d.f37540a.f37351h, this.f38430B.f37351h)) {
                        zVar = rVar.f38408d;
                    }
                }
                if (zVar != null) {
                    this.f38435G = zVar;
                    return true;
                }
            }
            V5 v52 = this.f38433E;
            if ((v52 == null || v52.f28211b >= v52.f28210a.size()) && (yVar = this.f38434F) != null) {
                return yVar.a();
            }
        }
        return true;
    }

    @Override // i8.x
    public final boolean b(e8.o url) {
        kotlin.jvm.internal.h.e(url, "url");
        e8.o oVar = this.f38430B.f37351h;
        return url.f37441e == oVar.f37441e && kotlin.jvm.internal.h.a(url.f37440d, oVar.f37440d);
    }

    @Override // i8.x
    public final C4483a c() {
        return this.f38430B;
    }

    @Override // i8.x
    public final boolean d() {
        return this.f38432D.k();
    }

    @Override // i8.x
    public final C4977h e() {
        return this.f38436H;
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.List] */
    public final e f() {
        String str;
        int i;
        List list;
        boolean contains;
        z zVar = this.f38435G;
        if (zVar != null) {
            this.f38435G = null;
            return h(zVar, null);
        }
        V5 v52 = this.f38433E;
        if (v52 != null && v52.f28211b < v52.f28210a.size()) {
            int i4 = v52.f28211b;
            ArrayList arrayList = v52.f28210a;
            if (i4 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i9 = v52.f28211b;
            v52.f28211b = 1 + i9;
            return h((z) arrayList.get(i9), null);
        }
        y yVar = this.f38434F;
        if (yVar == null) {
            yVar = new y(this.f38430B, this.f38431C, this.f38432D, this.f38429A);
            this.f38434F = yVar;
        }
        if (!yVar.a()) {
            throw new IOException("exhausted all routes");
        }
        if (!yVar.a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (yVar.f38453f < yVar.f38452e.size()) {
            boolean z8 = yVar.f38453f < yVar.f38452e.size();
            C4483a c4483a = yVar.f38448a;
            if (!z8) {
                throw new SocketException("No route to " + c4483a.f37351h.f37440d + "; exhausted proxy configurations: " + yVar.f38452e);
            }
            List list2 = yVar.f38452e;
            int i10 = yVar.f38453f;
            yVar.f38453f = i10 + 1;
            Proxy proxy = (Proxy) list2.get(i10);
            ArrayList arrayList3 = new ArrayList();
            yVar.f38454g = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                e8.o oVar = c4483a.f37351h;
                str = oVar.f37440d;
                i = oVar.f37441e;
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                kotlin.jvm.internal.h.e(inetSocketAddress, "<this>");
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                    kotlin.jvm.internal.h.d(str, "getHostName(...)");
                } else {
                    str = address2.getHostAddress();
                    kotlin.jvm.internal.h.d(str, "getHostAddress(...)");
                }
                i = inetSocketAddress.getPort();
            }
            if (1 > i || i >= 65536) {
                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(str, i));
            } else {
                M7.i iVar = f8.b.f37813a;
                kotlin.jvm.internal.h.e(str, "<this>");
                M7.i iVar2 = f8.b.f37813a;
                iVar2.getClass();
                if (iVar2.f1937n.matcher(str).matches()) {
                    list = p8.g.k(InetAddress.getByName(str));
                } else {
                    a aVar = yVar.f38450c;
                    aVar.f38332a.getClass();
                    c4483a.f37344a.getClass();
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(str);
                        kotlin.jvm.internal.h.d(allByName, "getAllByName(...)");
                        List P8 = AbstractC4978i.P(allByName);
                        if (P8.isEmpty()) {
                            throw new UnknownHostException(c4483a.f37344a + " returned no addresses for " + str);
                        }
                        aVar.f38332a.getClass();
                        list = P8;
                    } catch (NullPointerException e6) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e6);
                        throw unknownHostException;
                    }
                }
                if (yVar.f38451d && list.size() >= 2) {
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
                        byte[] bArr = f8.c.f37814a;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C5003c c5003c = new C5003c(10);
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                c5003c.add(it.next());
                            }
                            if (it2.hasNext()) {
                                c5003c.add(it2.next());
                            }
                        }
                        list = p8.g.d(c5003c);
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i));
                }
            }
            Iterator it4 = yVar.f38454g.iterator();
            while (it4.hasNext()) {
                z zVar2 = new z(yVar.f38448a, proxy, (InetSocketAddress) it4.next());
                C4523c c4523c = yVar.f38449b;
                synchronized (c4523c) {
                    contains = ((LinkedHashSet) c4523c.f37856u).contains(zVar2);
                }
                if (contains) {
                    yVar.f38455h.add(zVar2);
                } else {
                    arrayList2.add(zVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC4979j.F(yVar.f38455h, arrayList2);
            yVar.f38455h.clear();
        }
        V5 v53 = new V5(arrayList2);
        this.f38433E = v53;
        if (this.f38432D.k()) {
            throw new IOException("Canceled");
        }
        if (v53.f28211b >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i11 = v53.f28211b;
        v53.f28211b = 1 + i11;
        return h((z) arrayList2.get(i11), arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
    @Override // i8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w g() {
        Socket m8;
        boolean z8;
        u uVar;
        r d2 = this.f38432D.d();
        if (d2 != null) {
            boolean h9 = d2.h(this.f38432D.j());
            synchronized (d2) {
                try {
                    if (h9) {
                        if (!d2.f38415l && b(d2.f38408d.f37540a.f37351h)) {
                            z8 = false;
                            m8 = null;
                        }
                        m8 = this.f38432D.m();
                        z8 = false;
                    } else {
                        z8 = !d2.f38415l;
                        d2.f38415l = true;
                        m8 = this.f38432D.m();
                    }
                } finally {
                }
            }
            if (this.f38432D.d() != null) {
                if (m8 != null) {
                    throw new IllegalStateException("Check failed.");
                }
                uVar = new u(d2);
                if (uVar == null) {
                    return uVar;
                }
                u i = i(null, null);
                if (i != null) {
                    return i;
                }
                if (!this.f38436H.isEmpty()) {
                    return (w) this.f38436H.removeFirst();
                }
                e f6 = f();
                u i4 = i(f6, f6.f38349k);
                return i4 != null ? i4 : f6;
            }
            if (m8 != null) {
                f8.d.c(m8);
            }
            this.f38432D.f38332a.getClass();
            q call = this.f38432D.f38332a;
            kotlin.jvm.internal.h.e(call, "call");
            if (m8 != null) {
                this.f38432D.getClass();
            } else if (z8) {
                this.f38432D.getClass();
            }
        }
        uVar = null;
        if (uVar == null) {
        }
    }

    public final e h(z route, ArrayList arrayList) {
        kotlin.jvm.internal.h.e(route, "route");
        C4483a c4483a = route.f37540a;
        if (c4483a.f37346c == null) {
            if (!c4483a.f37352j.contains(e8.i.f37404f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = route.f37540a.f37351h.f37440d;
            o8.f fVar = o8.f.f39739a;
            if (!o8.f.f39739a.i(str)) {
                throw new UnknownServiceException(D.y.k("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c4483a.i.contains(e8.t.f37506z)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        C4903n c4903n = null;
        if (route.f37541b.type() == Proxy.Type.HTTP) {
            C4483a c4483a2 = route.f37540a;
            if (c4483a2.f37346c != null || c4483a2.i.contains(e8.t.f37506z)) {
                N n9 = new N();
                e8.o url = route.f37540a.f37351h;
                kotlin.jvm.internal.h.e(url, "url");
                n9.f196u = url;
                n9.p("CONNECT", null);
                C4483a c4483a3 = route.f37540a;
                n9.o("Host", f8.d.i(c4483a3.f37351h, true));
                n9.o("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f19498c);
                n9.o("User-Agent", "okhttp/5.2.1");
                c4903n = new C4903n(n9);
                e8.x body = e8.y.f37539n;
                I1.b bVar = new I1.b(4);
                C4484b c4484b = e8.t.f37501u;
                K3.b.p("Proxy-Authenticate");
                K3.b.q("OkHttp-Preemptive", "Proxy-Authenticate");
                bVar.g("Proxy-Authenticate");
                K3.b.b(bVar, "Proxy-Authenticate", "OkHttp-Preemptive");
                bVar.f();
                kotlin.jvm.internal.h.e(body, "body");
                c4483a3.f37349f.getClass();
            }
        }
        return new e(this.f38437n, this.f38438u, this.f38439v, this.f38440w, this.f38441x, this.f38442y, this.f38443z, this.f38432D, this, route, arrayList, c4903n, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x004b, code lost:
    
        if ((r7.f38414k != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u i(e eVar, ArrayList arrayList) {
        r rVar;
        boolean z8;
        Socket m8;
        s sVar = this.f38438u;
        boolean j9 = this.f38432D.j();
        C4483a address = this.f38430B;
        a connectionUser = this.f38432D;
        boolean z9 = eVar != null && eVar.isReady();
        sVar.getClass();
        kotlin.jvm.internal.h.e(address, "address");
        kotlin.jvm.internal.h.e(connectionUser, "connectionUser");
        Iterator it = sVar.f38428f.iterator();
        kotlin.jvm.internal.h.d(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                rVar = null;
                break;
            }
            rVar = (r) it.next();
            kotlin.jvm.internal.h.b(rVar);
            synchronized (rVar) {
                if (z9) {
                }
                if (rVar.f(address, arrayList)) {
                    connectionUser.a(rVar);
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            if (z8) {
                if (rVar.h(j9)) {
                    break;
                }
                synchronized (rVar) {
                    rVar.f38415l = true;
                    m8 = connectionUser.m();
                }
                if (m8 != null) {
                    f8.d.c(m8);
                }
            }
        }
        if (rVar == null) {
            return null;
        }
        if (eVar != null) {
            this.f38435G = eVar.f38348j;
            Socket socket = eVar.f38355q;
            if (socket != null) {
                f8.d.c(socket);
            }
        }
        this.f38432D.g(rVar);
        this.f38432D.h(rVar);
        return new u(rVar);
    }
}
