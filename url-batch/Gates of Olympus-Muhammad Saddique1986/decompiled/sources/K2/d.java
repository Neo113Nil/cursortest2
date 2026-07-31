package K2;

import B.Y;
import G2.w;
import N2.C0203a;
import N2.D;
import S1.r;
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
import n2.C0728h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final k f3276a;

    /* renamed from: b, reason: collision with root package name */
    public final G2.a f3277b;

    /* renamed from: c, reason: collision with root package name */
    public final g f3278c;

    /* renamed from: d, reason: collision with root package name */
    public m f3279d;

    /* renamed from: e, reason: collision with root package name */
    public n f3280e;

    /* renamed from: f, reason: collision with root package name */
    public int f3281f;

    /* renamed from: g, reason: collision with root package name */
    public int f3282g;

    /* renamed from: h, reason: collision with root package name */
    public int f3283h;

    /* renamed from: i, reason: collision with root package name */
    public w f3284i;

    public d(k kVar, G2.a aVar, g gVar) {
        f2.j.f(kVar, "connectionPool");
        f2.j.f(gVar, "call");
        this.f3276a = kVar;
        this.f3277b = aVar;
        this.f3278c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j a(int i3, int i4, int i5, boolean z3, boolean z4) {
        ArrayList arrayList;
        String str;
        int i6;
        List list;
        boolean contains;
        Y y3;
        Socket h3;
        while (!this.f3278c.f3299p) {
            j jVar = this.f3278c.f3294k;
            if (jVar != null) {
                synchronized (jVar) {
                    try {
                        if (!jVar.f3315j && b(jVar.f3307b.f2311a.f2133h)) {
                            h3 = null;
                        }
                        h3 = this.f3278c.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3278c.f3294k != null) {
                    if (h3 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!jVar.i(z4)) {
                        return jVar;
                    }
                    jVar.k();
                    if (this.f3284i == null) {
                        m mVar = this.f3279d;
                        if (mVar != null ? mVar.d() : true) {
                            continue;
                        } else {
                            n nVar = this.f3280e;
                            if (!(nVar != null ? nVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (h3 != null) {
                        H2.b.d(h3);
                    }
                    f2.j.f(this.f3278c, "call");
                }
            }
            this.f3281f = 0;
            this.f3282g = 0;
            this.f3283h = 0;
            if (this.f3276a.a(this.f3277b, this.f3278c, null, false)) {
                jVar = this.f3278c.f3294k;
                f2.j.c(jVar);
                f2.j.f(this.f3278c, "call");
            } else {
                w wVar = this.f3284i;
                try {
                    if (wVar != null) {
                        this.f3284i = null;
                    } else {
                        m mVar2 = this.f3279d;
                        if (mVar2 == null || !mVar2.d()) {
                            n nVar2 = this.f3280e;
                            if (nVar2 == null) {
                                G2.a aVar = this.f3277b;
                                g gVar = this.f3278c;
                                nVar2 = new n(aVar, gVar.f3287d.f2249B, gVar);
                                this.f3280e = nVar2;
                            }
                            if (!nVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (nVar2.f3332a < ((List) nVar2.f3336e).size()) {
                                boolean z5 = nVar2.f3332a < ((List) nVar2.f3336e).size();
                                G2.a aVar2 = (G2.a) nVar2.f3333b;
                                if (!z5) {
                                    throw new SocketException("No route to " + aVar2.f2133h.f2218d + "; exhausted proxy configurations: " + ((List) nVar2.f3336e));
                                }
                                List list2 = (List) nVar2.f3336e;
                                int i7 = nVar2.f3332a;
                                nVar2.f3332a = i7 + 1;
                                Proxy proxy = (Proxy) list2.get(i7);
                                ArrayList arrayList2 = new ArrayList();
                                nVar2.f3337f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    G2.n nVar3 = aVar2.f2133h;
                                    str = nVar3.f2218d;
                                    i6 = nVar3.f2219e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    f2.j.e(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    f2.j.f(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        f2.j.e(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        f2.j.e(str, "address.hostAddress");
                                    }
                                    i6 = inetSocketAddress.getPort();
                                }
                                if (1 > i6 || i6 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i6 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i6));
                                } else {
                                    byte[] bArr = H2.b.f2632a;
                                    f2.j.f(str, "<this>");
                                    C0728h c0728h = H2.b.f2637f;
                                    c0728h.getClass();
                                    if (c0728h.f7369d.matcher(str).matches()) {
                                        list = O2.l.l0(InetAddress.getByName(str));
                                    } else {
                                        f2.j.f((g) nVar2.f3335d, "call");
                                        aVar2.f2126a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            f2.j.e(allByName, "getAllByName(hostname)");
                                            List w02 = S1.k.w0(allByName);
                                            if (w02.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f2126a + " returned no addresses for " + str);
                                            }
                                            list = w02;
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
                                Iterator it2 = nVar2.f3337f.iterator();
                                while (it2.hasNext()) {
                                    w wVar2 = new w((G2.a) nVar2.f3333b, proxy, (InetSocketAddress) it2.next());
                                    Y y4 = (Y) nVar2.f3334c;
                                    synchronized (y4) {
                                        contains = ((LinkedHashSet) y4.f334d).contains(wVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) nVar2.f3338g).add(wVar2);
                                    } else {
                                        arrayList.add(wVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                r.G0((ArrayList) nVar2.f3338g, arrayList);
                                ((ArrayList) nVar2.f3338g).clear();
                            }
                            m mVar3 = new m(arrayList);
                            this.f3279d = mVar3;
                            if (this.f3278c.f3299p) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3276a.a(this.f3277b, this.f3278c, arrayList, false)) {
                                jVar = this.f3278c.f3294k;
                                f2.j.c(jVar);
                                f2.j.f(this.f3278c, "call");
                            } else {
                                if (!mVar3.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i8 = mVar3.f3330b;
                                mVar3.f3330b = i8 + 1;
                                wVar = (w) arrayList.get(i8);
                                jVar = new j(this.f3276a, wVar);
                                this.f3278c.f3301r = jVar;
                                jVar.c(i3, i4, i5, z3, this.f3278c);
                                this.f3278c.f3301r = null;
                                y3 = this.f3278c.f3287d.f2249B;
                                synchronized (y3) {
                                    ((LinkedHashSet) y3.f334d).remove(wVar);
                                }
                                if (this.f3276a.a(this.f3277b, this.f3278c, arrayList, true)) {
                                    j jVar2 = this.f3278c.f3294k;
                                    f2.j.c(jVar2);
                                    this.f3284i = wVar;
                                    Socket socket = jVar.f3309d;
                                    f2.j.c(socket);
                                    H2.b.d(socket);
                                    f2.j.f(this.f3278c, "call");
                                    jVar = jVar2;
                                } else {
                                    synchronized (jVar) {
                                        k kVar = this.f3276a;
                                        kVar.getClass();
                                        byte[] bArr2 = H2.b.f2632a;
                                        kVar.f3326d.add(jVar);
                                        kVar.f3324b.c(kVar.f3325c, 0L);
                                        this.f3278c.a(jVar);
                                    }
                                    f2.j.f(this.f3278c, "call");
                                }
                            }
                        } else {
                            m mVar4 = this.f3279d;
                            f2.j.c(mVar4);
                            if (!mVar4.d()) {
                                throw new NoSuchElementException();
                            }
                            int i9 = mVar4.f3330b;
                            mVar4.f3330b = i9 + 1;
                            wVar = (w) ((ArrayList) mVar4.f3331c).get(i9);
                        }
                    }
                    jVar.c(i3, i4, i5, z3, this.f3278c);
                    this.f3278c.f3301r = null;
                    y3 = this.f3278c.f3287d.f2249B;
                    synchronized (y3) {
                    }
                } catch (Throwable th2) {
                    this.f3278c.f3301r = null;
                    throw th2;
                }
                arrayList = null;
                jVar = new j(this.f3276a, wVar);
                this.f3278c.f3301r = jVar;
            }
            if (!jVar.i(z4)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(G2.n nVar) {
        f2.j.f(nVar, "url");
        G2.n nVar2 = this.f3277b.f2133h;
        return nVar.f2219e == nVar2.f2219e && f2.j.a(nVar.f2218d, nVar2.f2218d);
    }

    public final void c(IOException iOException) {
        f2.j.f(iOException, "e");
        this.f3284i = null;
        if ((iOException instanceof D) && ((D) iOException).f3579d == 8) {
            this.f3281f++;
        } else if (iOException instanceof C0203a) {
            this.f3282g++;
        } else {
            this.f3283h++;
        }
    }
}
