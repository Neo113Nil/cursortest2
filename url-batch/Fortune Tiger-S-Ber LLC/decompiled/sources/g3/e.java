package g3;

import c3.x;
import j3.c0;
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
import n2.o;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final m f1934a;

    /* renamed from: b, reason: collision with root package name */
    public final c3.a f1935b;
    public final i c;

    /* renamed from: d, reason: collision with root package name */
    public f.f f1936d;

    /* renamed from: e, reason: collision with root package name */
    public b1.b f1937e;

    /* renamed from: f, reason: collision with root package name */
    public int f1938f;
    public int g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public x f1939i;

    public e(m mVar, c3.a aVar, i iVar) {
        u2.c.e(mVar, "connectionPool");
        this.f1934a = mVar;
        this.f1935b = aVar;
        this.c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l a(int i4, int i5, int i6, boolean z3, boolean z4) {
        ArrayList arrayList;
        String str;
        int i7;
        List list;
        boolean contains;
        a2.e eVar;
        boolean z5;
        Socket i8;
        while (!this.c.f1953r) {
            l lVar = this.c.f1948m;
            if (lVar != null) {
                synchronized (lVar) {
                    try {
                        if (!lVar.f1963j && b(lVar.f1958b.f1153a.h)) {
                            i8 = null;
                        }
                        i8 = this.c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.f1948m != null) {
                    if (i8 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z5 = z4;
                    if (lVar.i(z5)) {
                        return lVar;
                    }
                    lVar.k();
                    if (this.f1939i == null) {
                        f.f fVar = this.f1936d;
                        if (fVar != null ? fVar.c() : true) {
                            continue;
                        } else {
                            b1.b bVar = this.f1937e;
                            if (!(bVar != null ? bVar.j() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else if (i8 != null) {
                    d3.c.c(i8);
                }
            }
            this.f1938f = 0;
            this.g = 0;
            this.h = 0;
            if (this.f1934a.a(this.f1935b, this.c, null, false)) {
                lVar = this.c.f1948m;
                u2.c.b(lVar);
            } else {
                x xVar = this.f1939i;
                try {
                    if (xVar != null) {
                        this.f1939i = null;
                    } else {
                        f.f fVar2 = this.f1936d;
                        if (fVar2 == null || !fVar2.c()) {
                            b1.b bVar2 = this.f1937e;
                            if (bVar2 == null) {
                                c3.a aVar = this.f1935b;
                                i iVar = this.c;
                                bVar2 = new b1.b(aVar, iVar.f1943f.D, iVar);
                                this.f1937e = bVar2;
                            }
                            if (!bVar2.j()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (bVar2.f732a < ((List) bVar2.f735e).size()) {
                                c3.a aVar2 = (c3.a) bVar2.c;
                                if (bVar2.f732a >= ((List) bVar2.f735e).size()) {
                                    throw new SocketException("No route to " + aVar2.h.f1078d + "; exhausted proxy configurations: " + ((List) bVar2.f735e));
                                }
                                List list2 = (List) bVar2.f735e;
                                int i9 = bVar2.f732a;
                                bVar2.f732a = i9 + 1;
                                Proxy proxy = (Proxy) list2.get(i9);
                                ArrayList arrayList2 = new ArrayList();
                                bVar2.f736f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    c3.m mVar = aVar2.h;
                                    str = mVar.f1078d;
                                    i7 = mVar.f1079e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        u2.c.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        u2.c.d(str, "address.hostAddress");
                                    }
                                    i7 = inetSocketAddress.getPort();
                                }
                                if (1 > i7 || i7 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i7 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i7));
                                } else {
                                    byte[] bArr = d3.c.f1490a;
                                    u2.c.e(str, "<this>");
                                    b3.d dVar = d3.c.f1494f;
                                    dVar.getClass();
                                    if (((Pattern) dVar.g).matcher(str).matches()) {
                                        list = m0.a.r(InetAddress.getByName(str));
                                    } else {
                                        aVar2.f1008a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            u2.c.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new n2.d(allByName, false)) : m0.a.r(allByName[0]) : o.f2953f;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f1008a + " returned no addresses for " + str);
                                            }
                                            list = arrayList3;
                                        } catch (NullPointerException e4) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e4);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i7));
                                    }
                                }
                                Iterator it2 = bVar2.f736f.iterator();
                                while (it2.hasNext()) {
                                    x xVar2 = new x((c3.a) bVar2.c, proxy, (InetSocketAddress) it2.next());
                                    a2.e eVar2 = (a2.e) bVar2.f734d;
                                    synchronized (eVar2) {
                                        contains = ((LinkedHashSet) eVar2.g).contains(xVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) bVar2.f733b).add(xVar2);
                                    } else {
                                        arrayList.add(xVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                n2.m.F(arrayList, (ArrayList) bVar2.f733b);
                                ((ArrayList) bVar2.f733b).clear();
                            }
                            f.f fVar3 = new f.f(arrayList, 1);
                            this.f1936d = fVar3;
                            if (this.c.f1953r) {
                                throw new IOException("Canceled");
                            }
                            if (this.f1934a.a(this.f1935b, this.c, arrayList, false)) {
                                lVar = this.c.f1948m;
                                u2.c.b(lVar);
                            } else {
                                if (!fVar3.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i10 = fVar3.f1596f;
                                fVar3.f1596f = i10 + 1;
                                xVar = (x) arrayList.get(i10);
                                l lVar2 = new l(this.f1934a, xVar);
                                this.c.f1955t = lVar2;
                                lVar2.c(i4, i5, i6, z3, this.c);
                                this.c.f1955t = null;
                                eVar = this.c.f1943f.D;
                                synchronized (eVar) {
                                    ((LinkedHashSet) eVar.g).remove(xVar);
                                }
                                if (this.f1934a.a(this.f1935b, this.c, arrayList, true)) {
                                    lVar = this.c.f1948m;
                                    u2.c.b(lVar);
                                    this.f1939i = xVar;
                                    Socket socket = lVar2.f1959d;
                                    u2.c.b(socket);
                                    d3.c.c(socket);
                                } else {
                                    synchronized (lVar2) {
                                        m mVar2 = this.f1934a;
                                        mVar2.getClass();
                                        byte[] bArr2 = d3.c.f1490a;
                                        mVar2.f1973d.add(lVar2);
                                        mVar2.f1972b.c(mVar2.c, 0L);
                                        this.c.b(lVar2);
                                    }
                                    z5 = z4;
                                    lVar = lVar2;
                                    if (lVar.i(z5)) {
                                    }
                                }
                            }
                        } else {
                            f.f fVar4 = this.f1936d;
                            u2.c.b(fVar4);
                            if (!fVar4.c()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList4 = (ArrayList) fVar4.g;
                            int i11 = fVar4.f1596f;
                            fVar4.f1596f = i11 + 1;
                            xVar = (x) arrayList4.get(i11);
                        }
                    }
                    lVar2.c(i4, i5, i6, z3, this.c);
                    this.c.f1955t = null;
                    eVar = this.c.f1943f.D;
                    synchronized (eVar) {
                    }
                } catch (Throwable th2) {
                    this.c.f1955t = null;
                    throw th2;
                }
                arrayList = null;
                l lVar22 = new l(this.f1934a, xVar);
                this.c.f1955t = lVar22;
            }
            z5 = z4;
            if (lVar.i(z5)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(c3.m mVar) {
        u2.c.e(mVar, "url");
        c3.m mVar2 = this.f1935b.h;
        return mVar.f1079e == mVar2.f1079e && u2.c.a(mVar.f1078d, mVar2.f1078d);
    }

    public final void c(IOException iOException) {
        u2.c.e(iOException, "e");
        this.f1939i = null;
        if ((iOException instanceof c0) && ((c0) iOException).f2414f == 8) {
            this.f1938f++;
        } else if (iOException instanceof j3.a) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
