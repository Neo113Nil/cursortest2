package D1;

import G1.C0000a;
import G1.E;
import Y0.s;
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
import z1.t;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f167a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.a f168b;

    /* renamed from: c, reason: collision with root package name */
    public final j f169c;
    public C0.f d;

    /* renamed from: e, reason: collision with root package name */
    public p f170e;

    /* renamed from: f, reason: collision with root package name */
    public int f171f;

    /* renamed from: g, reason: collision with root package name */
    public int f172g;
    public int h;
    public t i;

    public f(n nVar, z1.a aVar, j jVar) {
        k1.e.e(nVar, "connectionPool");
        k1.e.e(jVar, "call");
        this.f167a = nVar;
        this.f168b = aVar;
        this.f169c = jVar;
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
        A0.c cVar;
        Socket i5;
        while (!this.f169c.f187m) {
            m mVar = this.f169c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f198j && b(mVar.f193b.f4769a.h)) {
                            i5 = null;
                        }
                        i5 = this.f169c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f169c.h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        C0.f fVar = this.d;
                        if (fVar != null ? fVar.b() : true) {
                            continue;
                        } else {
                            p pVar = this.f170e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        A1.c.c(i5);
                    }
                    k1.e.e(this.f169c, "call");
                }
            }
            this.f171f = 0;
            this.f172g = 0;
            this.h = 0;
            if (this.f167a.a(this.f168b, this.f169c, null, false)) {
                mVar = this.f169c.h;
                k1.e.b(mVar);
                k1.e.e(this.f169c, "call");
            } else {
                t tVar = this.i;
                try {
                    if (tVar != null) {
                        this.i = null;
                    } else {
                        C0.f fVar2 = this.d;
                        if (fVar2 == null || !fVar2.b()) {
                            p pVar2 = this.f170e;
                            if (pVar2 == null) {
                                z1.a aVar = this.f168b;
                                j jVar = this.f169c;
                                pVar2 = new p(aVar, jVar.f178a.f4742y, jVar);
                                this.f170e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f211a < ((List) pVar2.f214e).size()) {
                                boolean z4 = pVar2.f211a < ((List) pVar2.f214e).size();
                                z1.a aVar2 = (z1.a) pVar2.f212b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f214e));
                                }
                                List list2 = (List) pVar2.f214e;
                                int i6 = pVar2.f211a;
                                pVar2.f211a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f215f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    z1.l lVar = aVar2.h;
                                    str = lVar.d;
                                    i4 = lVar.f4696e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    k1.e.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    k1.e.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        k1.e.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        k1.e.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = A1.c.f13a;
                                    k1.e.e(str, "<this>");
                                    k1.h hVar = A1.c.f17f;
                                    hVar.getClass();
                                    if (((Pattern) hVar.f3245b).matcher(str).matches()) {
                                        list = H1.d.R(InetAddress.getByName(str));
                                    } else {
                                        k1.e.e((j) pVar2.d, "call");
                                        aVar2.f4626a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            k1.e.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new Y0.g(allByName, false)) : H1.d.R(allByName[0]) : s.f1516a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f4626a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f215f.iterator();
                                while (it2.hasNext()) {
                                    t tVar2 = new t((z1.a) pVar2.f212b, proxy, (InetSocketAddress) it2.next());
                                    A0.c cVar2 = (A0.c) pVar2.f213c;
                                    synchronized (cVar2) {
                                        contains = ((LinkedHashSet) cVar2.f6b).contains(tVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f216g).add(tVar2);
                                    } else {
                                        arrayList.add(tVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                Y0.p.A0(arrayList, (ArrayList) pVar2.f216g);
                                ((ArrayList) pVar2.f216g).clear();
                            }
                            C0.f fVar3 = new C0.f(arrayList);
                            this.d = fVar3;
                            if (this.f169c.f187m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f167a.a(this.f168b, this.f169c, arrayList, false)) {
                                mVar = this.f169c.h;
                                k1.e.b(mVar);
                                k1.e.e(this.f169c, "call");
                            } else {
                                if (!fVar3.b()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = fVar3.f95a;
                                fVar3.f95a = i7 + 1;
                                tVar = (t) arrayList.get(i7);
                                mVar = new m(this.f167a, tVar);
                                this.f169c.f189o = mVar;
                                mVar.c(i, i2, i3, z2, this.f169c);
                                this.f169c.f189o = null;
                                cVar = this.f169c.f178a.f4742y;
                                synchronized (cVar) {
                                    ((LinkedHashSet) cVar.f6b).remove(tVar);
                                }
                                if (this.f167a.a(this.f168b, this.f169c, arrayList, true)) {
                                    m mVar2 = this.f169c.h;
                                    k1.e.b(mVar2);
                                    this.i = tVar;
                                    Socket socket = mVar.d;
                                    k1.e.b(socket);
                                    A1.c.c(socket);
                                    k1.e.e(this.f169c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f167a;
                                        nVar.getClass();
                                        byte[] bArr2 = A1.c.f13a;
                                        nVar.d.add(mVar);
                                        nVar.f207b.c(nVar.f208c, 0L);
                                        this.f169c.b(mVar);
                                    }
                                    k1.e.e(this.f169c, "call");
                                }
                            }
                        } else {
                            C0.f fVar4 = this.d;
                            k1.e.b(fVar4);
                            if (!fVar4.b()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = fVar4.f95a;
                            fVar4.f95a = i8 + 1;
                            tVar = (t) ((ArrayList) fVar4.f96b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f169c);
                    this.f169c.f189o = null;
                    cVar = this.f169c.f178a.f4742y;
                    synchronized (cVar) {
                    }
                } catch (Throwable th2) {
                    this.f169c.f189o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f167a, tVar);
                this.f169c.f189o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(z1.l lVar) {
        k1.e.e(lVar, "url");
        z1.l lVar2 = this.f168b.h;
        return lVar.f4696e == lVar2.f4696e && k1.e.a(lVar.d, lVar2.d);
    }

    public final void c(IOException iOException) {
        k1.e.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof E) && ((E) iOException).f365a == 8) {
            this.f171f++;
        } else if (iOException instanceof C0000a) {
            this.f172g++;
        } else {
            this.h++;
        }
    }
}
