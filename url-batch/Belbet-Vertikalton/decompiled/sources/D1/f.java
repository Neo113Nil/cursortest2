package D1;

import G1.C0000a;
import G1.E;
import X0.t;
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
import z1.w;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f223a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.a f224b;

    /* renamed from: c, reason: collision with root package name */
    public final j f225c;

    /* renamed from: d, reason: collision with root package name */
    public p f226d;
    public q e;

    /* renamed from: f, reason: collision with root package name */
    public int f227f;

    /* renamed from: g, reason: collision with root package name */
    public int f228g;

    /* renamed from: h, reason: collision with root package name */
    public int f229h;
    public w i;

    public f(n nVar, z1.a aVar, j jVar) {
        j1.h.e(nVar, "connectionPool");
        j1.h.e(jVar, "call");
        this.f223a = nVar;
        this.f224b = aVar;
        this.f225c = jVar;
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
        C1.d dVar;
        Socket i5;
        while (!this.f225c.f244m) {
            m mVar = this.f225c.f241h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.j && b(mVar.f251b.f4954a.f4813h)) {
                            i5 = null;
                        }
                        i5 = this.f225c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f225c.f241h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        p pVar = this.f226d;
                        if (pVar != null ? pVar.c() : true) {
                            continue;
                        } else {
                            q qVar = this.e;
                            if (!(qVar != null ? qVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        A1.c.c(i5);
                    }
                    j1.h.e(this.f225c, "call");
                }
            }
            this.f227f = 0;
            this.f228g = 0;
            this.f229h = 0;
            if (this.f223a.a(this.f224b, this.f225c, null, false)) {
                mVar = this.f225c.f241h;
                j1.h.b(mVar);
                j1.h.e(this.f225c, "call");
            } else {
                w wVar = this.i;
                try {
                    if (wVar != null) {
                        this.i = null;
                    } else {
                        p pVar2 = this.f226d;
                        if (pVar2 == null || !pVar2.c()) {
                            q qVar2 = this.e;
                            if (qVar2 == null) {
                                z1.a aVar = this.f224b;
                                j jVar = this.f225c;
                                qVar2 = new q(aVar, jVar.f235a.f4926y, jVar);
                                this.e = qVar2;
                            }
                            if (!qVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (qVar2.f272a < ((List) qVar2.e).size()) {
                                boolean z4 = qVar2.f272a < ((List) qVar2.e).size();
                                z1.a aVar2 = (z1.a) qVar2.f273b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.f4813h.f4878d + "; exhausted proxy configurations: " + ((List) qVar2.e));
                                }
                                List list2 = (List) qVar2.e;
                                int i6 = qVar2.f272a;
                                qVar2.f272a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                qVar2.f276f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    z1.o oVar = aVar2.f4813h;
                                    str = oVar.f4878d;
                                    i4 = oVar.e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    j1.h.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    j1.h.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        j1.h.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        j1.h.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = A1.c.f19a;
                                    j1.h.e(str, "<this>");
                                    j1.k kVar = A1.c.f23f;
                                    kVar.getClass();
                                    if (((Pattern) kVar.f3185b).matcher(str).matches()) {
                                        list = H1.l.I(InetAddress.getByName(str));
                                    } else {
                                        j1.h.e((j) qVar2.f275d, "call");
                                        aVar2.f4807a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            j1.h.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new X0.h(allByName, false)) : H1.l.I(allByName[0]) : t.f1385a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f4807a + " returned no addresses for " + str);
                                            }
                                            list = arrayList3;
                                        } catch (NullPointerException e) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i4));
                                    }
                                }
                                Iterator it2 = qVar2.f276f.iterator();
                                while (it2.hasNext()) {
                                    w wVar2 = new w((z1.a) qVar2.f273b, proxy, (InetSocketAddress) it2.next());
                                    C1.d dVar2 = (C1.d) qVar2.f274c;
                                    synchronized (dVar2) {
                                        contains = ((LinkedHashSet) dVar2.f145b).contains(wVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) qVar2.f277g).add(wVar2);
                                    } else {
                                        arrayList.add(wVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                X0.q.n0(arrayList, (ArrayList) qVar2.f277g);
                                ((ArrayList) qVar2.f277g).clear();
                            }
                            p pVar3 = new p(arrayList);
                            this.f226d = pVar3;
                            if (this.f225c.f244m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f223a.a(this.f224b, this.f225c, arrayList, false)) {
                                mVar = this.f225c.f241h;
                                j1.h.b(mVar);
                                j1.h.e(this.f225c, "call");
                            } else {
                                if (!pVar3.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = pVar3.f270a;
                                pVar3.f270a = i7 + 1;
                                wVar = (w) arrayList.get(i7);
                                mVar = new m(this.f223a, wVar);
                                this.f225c.f246o = mVar;
                                mVar.c(i, i2, i3, z2, this.f225c);
                                this.f225c.f246o = null;
                                dVar = this.f225c.f235a.f4926y;
                                synchronized (dVar) {
                                    ((LinkedHashSet) dVar.f145b).remove(wVar);
                                }
                                if (this.f223a.a(this.f224b, this.f225c, arrayList, true)) {
                                    m mVar2 = this.f225c.f241h;
                                    j1.h.b(mVar2);
                                    this.i = wVar;
                                    Socket socket = mVar.f253d;
                                    j1.h.b(socket);
                                    A1.c.c(socket);
                                    j1.h.e(this.f225c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f223a;
                                        nVar.getClass();
                                        byte[] bArr2 = A1.c.f19a;
                                        nVar.f267d.add(mVar);
                                        nVar.f265b.c(nVar.f266c, 0L);
                                        this.f225c.b(mVar);
                                    }
                                    j1.h.e(this.f225c, "call");
                                }
                            }
                        } else {
                            p pVar4 = this.f226d;
                            j1.h.b(pVar4);
                            if (!pVar4.c()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = pVar4.f270a;
                            pVar4.f270a = i8 + 1;
                            wVar = (w) ((ArrayList) pVar4.f271b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f225c);
                    this.f225c.f246o = null;
                    dVar = this.f225c.f235a.f4926y;
                    synchronized (dVar) {
                    }
                } catch (Throwable th2) {
                    this.f225c.f246o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f223a, wVar);
                this.f225c.f246o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(z1.o oVar) {
        j1.h.e(oVar, "url");
        z1.o oVar2 = this.f224b.f4813h;
        return oVar.e == oVar2.e && j1.h.a(oVar.f4878d, oVar2.f4878d);
    }

    public final void c(IOException iOException) {
        j1.h.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof E) && ((E) iOException).f347a == 8) {
            this.f227f++;
        } else if (iOException instanceof C0000a) {
            this.f228g++;
        } else {
            this.f229h++;
        }
    }
}
