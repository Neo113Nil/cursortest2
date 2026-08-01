package m1;

import Q0.q;
import i1.w;
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
import java.util.regex.Pattern;
import l.C0242k;
import p1.B;
import p1.C0284a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final i1.a f3218b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3219c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f3220e;

    /* renamed from: f, reason: collision with root package name */
    public int f3221f;

    /* renamed from: g, reason: collision with root package name */
    public int f3222g;
    public int h;
    public w i;

    public f(n nVar, i1.a aVar, j jVar) {
        X0.d.e(nVar, "connectionPool");
        X0.d.e(jVar, "call");
        this.f3217a = nVar;
        this.f3218b = aVar;
        this.f3219c = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x036a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(int i, int i2, int i3, boolean z2, boolean z3) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        C0242k c0242k;
        Socket i5;
        while (!this.f3219c.f3237m) {
            m mVar = this.f3219c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3248j && b(mVar.f3243b.f2535a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3219c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3219c.h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        H.j jVar = this.d;
                        if (jVar != null ? jVar.c() : true) {
                            continue;
                        } else {
                            p pVar = this.f3220e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        j1.b.c(i5);
                    }
                    X0.d.e(this.f3219c, "call");
                }
            }
            this.f3221f = 0;
            this.f3222g = 0;
            this.h = 0;
            if (this.f3217a.a(this.f3218b, this.f3219c, null, false)) {
                mVar = this.f3219c.h;
                X0.d.b(mVar);
                X0.d.e(this.f3219c, "call");
            } else {
                w wVar = this.i;
                try {
                    if (wVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.c()) {
                            p pVar2 = this.f3220e;
                            if (pVar2 == null) {
                                i1.a aVar = this.f3218b;
                                j jVar3 = this.f3219c;
                                pVar2 = new p(aVar, jVar3.f3228a.f2500y, jVar3);
                                this.f3220e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3261a < ((List) pVar2.f3264e).size()) {
                                boolean z4 = pVar2.f3261a < ((List) pVar2.f3264e).size();
                                i1.a aVar2 = (i1.a) pVar2.f3262b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3264e));
                                }
                                List list2 = (List) pVar2.f3264e;
                                int i6 = pVar2.f3261a;
                                pVar2.f3261a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3265f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    i1.m mVar2 = aVar2.h;
                                    str = mVar2.d;
                                    i4 = mVar2.f2457e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    X0.d.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    X0.d.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        X0.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        X0.d.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = j1.b.f2603a;
                                    X0.d.e(str, "<this>");
                                    X0.g gVar = j1.b.f2606e;
                                    gVar.getClass();
                                    if (((Pattern) gVar.f1018b).matcher(str).matches()) {
                                        list = q1.d.X(InetAddress.getByName(str));
                                    } else {
                                        X0.d.e((j) pVar2.d, "call");
                                        aVar2.f2384a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            X0.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new Q0.e(allByName, false)) : q1.d.X(allByName[0]) : q.f671a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f2384a + " returned no addresses for " + str);
                                            }
                                            list = arrayList3;
                                        } catch (NullPointerException e2) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e2);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i4));
                                    }
                                }
                                Iterator it2 = pVar2.f3265f.iterator();
                                while (it2.hasNext()) {
                                    w wVar2 = new w((i1.a) pVar2.f3262b, proxy, (InetSocketAddress) it2.next());
                                    C0242k c0242k2 = (C0242k) pVar2.f3263c;
                                    synchronized (c0242k2) {
                                        contains = ((LinkedHashSet) c0242k2.f3007a).contains(wVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3266g).add(wVar2);
                                    } else {
                                        arrayList.add(wVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                Q0.n.x0(arrayList, (ArrayList) pVar2.f3266g);
                                ((ArrayList) pVar2.f3266g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f3219c.f3237m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3217a.a(this.f3218b, this.f3219c, arrayList, false)) {
                                mVar = this.f3219c.h;
                                X0.d.b(mVar);
                                X0.d.e(this.f3219c, "call");
                            } else {
                                if (!jVar4.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f227a;
                                jVar4.f227a = i7 + 1;
                                wVar = (w) arrayList.get(i7);
                                mVar = new m(this.f3217a, wVar);
                                this.f3219c.f3239o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3219c);
                                this.f3219c.f3239o = null;
                                c0242k = this.f3219c.f3228a.f2500y;
                                synchronized (c0242k) {
                                    ((LinkedHashSet) c0242k.f3007a).remove(wVar);
                                }
                                if (this.f3217a.a(this.f3218b, this.f3219c, arrayList, true)) {
                                    m mVar3 = this.f3219c.h;
                                    X0.d.b(mVar3);
                                    this.i = wVar;
                                    Socket socket = mVar.d;
                                    X0.d.b(socket);
                                    j1.b.c(socket);
                                    X0.d.e(this.f3219c, "call");
                                    mVar = mVar3;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3217a;
                                        nVar.getClass();
                                        byte[] bArr2 = j1.b.f2603a;
                                        nVar.d.add(mVar);
                                        nVar.f3257b.c(nVar.f3258c, 0L);
                                        this.f3219c.b(mVar);
                                    }
                                    X0.d.e(this.f3219c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            X0.d.b(jVar5);
                            if (!jVar5.c()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f227a;
                            jVar5.f227a = i8 + 1;
                            wVar = (w) ((ArrayList) jVar5.f228b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3219c);
                    this.f3219c.f3239o = null;
                    c0242k = this.f3219c.f3228a.f2500y;
                    synchronized (c0242k) {
                    }
                } catch (Throwable th2) {
                    this.f3219c.f3239o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3217a, wVar);
                this.f3219c.f3239o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(i1.m mVar) {
        X0.d.e(mVar, "url");
        i1.m mVar2 = this.f3218b.h;
        return mVar.f2457e == mVar2.f2457e && X0.d.a(mVar.d, mVar2.d);
    }

    public final void c(IOException iOException) {
        X0.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof B) && ((B) iOException).f3401a == 8) {
            this.f3221f++;
        } else if (iOException instanceof C0284a) {
            this.f3222g++;
        } else {
            this.h++;
        }
    }
}
