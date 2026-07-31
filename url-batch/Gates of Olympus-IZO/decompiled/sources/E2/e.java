package E2;

import A2.A;
import A2.C0002a;
import A2.q;
import H2.C0079a;
import H2.D;
import M1.r;
import a.AbstractC0157a;
import h2.C0446h;
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

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l f791a;

    /* renamed from: b, reason: collision with root package name */
    public final C0002a f792b;

    /* renamed from: c, reason: collision with root package name */
    public final h f793c;

    /* renamed from: d, reason: collision with root package name */
    public n f794d;

    /* renamed from: e, reason: collision with root package name */
    public o f795e;

    /* renamed from: f, reason: collision with root package name */
    public int f796f;

    /* renamed from: g, reason: collision with root package name */
    public int f797g;

    /* renamed from: h, reason: collision with root package name */
    public int f798h;

    /* renamed from: i, reason: collision with root package name */
    public A f799i;

    public e(l lVar, C0002a c0002a, h hVar) {
        Z1.i.f(lVar, "connectionPool");
        Z1.i.f(hVar, "call");
        this.f791a = lVar;
        this.f792b = c0002a;
        this.f793c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k a(int i3, int i4, int i5, boolean z3, boolean z4) {
        ArrayList arrayList;
        String str;
        int i6;
        List list;
        boolean contains;
        A2.g gVar;
        Socket h3;
        while (!this.f793c.p) {
            k kVar = this.f793c.f809k;
            if (kVar != null) {
                synchronized (kVar) {
                    try {
                        if (!kVar.f829j && b(kVar.f821b.f23a.f40h)) {
                            h3 = null;
                        }
                        h3 = this.f793c.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f793c.f809k != null) {
                    if (h3 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!kVar.i(z4)) {
                        return kVar;
                    }
                    kVar.k();
                    if (this.f799i == null) {
                        n nVar = this.f794d;
                        if (nVar != null ? nVar.d() : true) {
                            continue;
                        } else {
                            o oVar = this.f795e;
                            if (!(oVar != null ? oVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (h3 != null) {
                        B2.c.d(h3);
                    }
                    Z1.i.f(this.f793c, "call");
                }
            }
            this.f796f = 0;
            this.f797g = 0;
            this.f798h = 0;
            if (this.f791a.a(this.f792b, this.f793c, null, false)) {
                kVar = this.f793c.f809k;
                Z1.i.c(kVar);
                Z1.i.f(this.f793c, "call");
            } else {
                A a3 = this.f799i;
                try {
                    if (a3 != null) {
                        this.f799i = null;
                    } else {
                        n nVar2 = this.f794d;
                        if (nVar2 == null || !nVar2.d()) {
                            o oVar2 = this.f795e;
                            if (oVar2 == null) {
                                C0002a c0002a = this.f792b;
                                h hVar = this.f793c;
                                oVar2 = new o(c0002a, hVar.f802d.B, hVar);
                                this.f795e = oVar2;
                            }
                            if (!oVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (oVar2.f845a < ((List) oVar2.f849e).size()) {
                                boolean z5 = oVar2.f845a < ((List) oVar2.f849e).size();
                                C0002a c0002a2 = (C0002a) oVar2.f846b;
                                if (!z5) {
                                    throw new SocketException("No route to " + c0002a2.f40h.f132d + "; exhausted proxy configurations: " + ((List) oVar2.f849e));
                                }
                                List list2 = (List) oVar2.f849e;
                                int i7 = oVar2.f845a;
                                oVar2.f845a = i7 + 1;
                                Proxy proxy = (Proxy) list2.get(i7);
                                ArrayList arrayList2 = new ArrayList();
                                oVar2.f850f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    q qVar = c0002a2.f40h;
                                    str = qVar.f132d;
                                    i6 = qVar.f133e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    Z1.i.e(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    Z1.i.f(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        Z1.i.e(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        Z1.i.e(str, "address.hostAddress");
                                    }
                                    i6 = inetSocketAddress.getPort();
                                }
                                if (1 > i6 || i6 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i6 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i6));
                                } else {
                                    byte[] bArr = B2.c.f415a;
                                    Z1.i.f(str, "<this>");
                                    C0446h c0446h = B2.c.f420f;
                                    c0446h.getClass();
                                    if (c0446h.f5078d.matcher(str).matches()) {
                                        list = AbstractC0157a.M(InetAddress.getByName(str));
                                    } else {
                                        Z1.i.f((h) oVar2.f848d, "call");
                                        c0002a2.f33a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            Z1.i.e(allByName, "getAllByName(hostname)");
                                            List i02 = M1.k.i0(allByName);
                                            if (i02.isEmpty()) {
                                                throw new UnknownHostException(c0002a2.f33a + " returned no addresses for " + str);
                                            }
                                            list = i02;
                                        } catch (NullPointerException e3) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e3);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i6));
                                    }
                                }
                                Iterator it2 = oVar2.f850f.iterator();
                                while (it2.hasNext()) {
                                    A a4 = new A((C0002a) oVar2.f846b, proxy, (InetSocketAddress) it2.next());
                                    A2.g gVar2 = (A2.g) oVar2.f847c;
                                    synchronized (gVar2) {
                                        contains = ((LinkedHashSet) gVar2.f83b).contains(a4);
                                    }
                                    if (contains) {
                                        ((ArrayList) oVar2.f851g).add(a4);
                                    } else {
                                        arrayList.add(a4);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                r.i0((ArrayList) oVar2.f851g, arrayList);
                                ((ArrayList) oVar2.f851g).clear();
                            }
                            n nVar3 = new n(arrayList);
                            this.f794d = nVar3;
                            if (this.f793c.p) {
                                throw new IOException("Canceled");
                            }
                            if (this.f791a.a(this.f792b, this.f793c, arrayList, false)) {
                                kVar = this.f793c.f809k;
                                Z1.i.c(kVar);
                                Z1.i.f(this.f793c, "call");
                            } else {
                                if (!nVar3.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i8 = nVar3.f843b;
                                nVar3.f843b = i8 + 1;
                                a3 = (A) arrayList.get(i8);
                                kVar = new k(this.f791a, a3);
                                this.f793c.f815r = kVar;
                                kVar.c(i3, i4, i5, z3, this.f793c);
                                this.f793c.f815r = null;
                                gVar = this.f793c.f802d.B;
                                synchronized (gVar) {
                                    ((LinkedHashSet) gVar.f83b).remove(a3);
                                }
                                if (this.f791a.a(this.f792b, this.f793c, arrayList, true)) {
                                    k kVar2 = this.f793c.f809k;
                                    Z1.i.c(kVar2);
                                    this.f799i = a3;
                                    Socket socket = kVar.f823d;
                                    Z1.i.c(socket);
                                    B2.c.d(socket);
                                    Z1.i.f(this.f793c, "call");
                                    kVar = kVar2;
                                } else {
                                    synchronized (kVar) {
                                        l lVar = this.f791a;
                                        lVar.getClass();
                                        byte[] bArr2 = B2.c.f415a;
                                        lVar.f839d.add(kVar);
                                        lVar.f837b.c(lVar.f838c, 0L);
                                        this.f793c.a(kVar);
                                    }
                                    Z1.i.f(this.f793c, "call");
                                }
                            }
                        } else {
                            n nVar4 = this.f794d;
                            Z1.i.c(nVar4);
                            if (!nVar4.d()) {
                                throw new NoSuchElementException();
                            }
                            int i9 = nVar4.f843b;
                            nVar4.f843b = i9 + 1;
                            a3 = (A) ((ArrayList) nVar4.f844c).get(i9);
                        }
                    }
                    kVar.c(i3, i4, i5, z3, this.f793c);
                    this.f793c.f815r = null;
                    gVar = this.f793c.f802d.B;
                    synchronized (gVar) {
                    }
                } catch (Throwable th2) {
                    this.f793c.f815r = null;
                    throw th2;
                }
                arrayList = null;
                kVar = new k(this.f791a, a3);
                this.f793c.f815r = kVar;
            }
            if (!kVar.i(z4)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(q qVar) {
        Z1.i.f(qVar, "url");
        q qVar2 = this.f792b.f40h;
        return qVar.f133e == qVar2.f133e && Z1.i.a(qVar.f132d, qVar2.f132d);
    }

    public final void c(IOException iOException) {
        Z1.i.f(iOException, "e");
        this.f799i = null;
        if ((iOException instanceof D) && ((D) iOException).f1927d == 8) {
            this.f796f++;
        } else if (iOException instanceof C0079a) {
            this.f797g++;
        } else {
            this.f798h++;
        }
    }
}
