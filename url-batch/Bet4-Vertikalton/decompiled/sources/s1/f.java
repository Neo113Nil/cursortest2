package s1;

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
import l.Z;
import o1.u;
import v1.A;
import v1.C0308a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3709a;

    /* renamed from: b, reason: collision with root package name */
    public final o1.a f3710b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3711c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f3712e;

    /* renamed from: f, reason: collision with root package name */
    public int f3713f;

    /* renamed from: g, reason: collision with root package name */
    public int f3714g;
    public int h;
    public u i;

    public f(n nVar, o1.a aVar, j jVar) {
        d1.d.e(nVar, "connectionPool");
        d1.d.e(jVar, "call");
        this.f3709a = nVar;
        this.f3710b = aVar;
        this.f3711c = jVar;
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
        Z z4;
        Socket i5;
        while (!this.f3711c.f3729m) {
            m mVar = this.f3711c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3740j && b(mVar.f3735b.f3396a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3711c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3711c.h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        H.j jVar = this.d;
                        if (jVar != null ? jVar.d() : true) {
                            continue;
                        } else {
                            p pVar = this.f3712e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        p1.b.c(i5);
                    }
                    d1.d.e(this.f3711c, "call");
                }
            }
            this.f3713f = 0;
            this.f3714g = 0;
            this.h = 0;
            if (this.f3709a.a(this.f3710b, this.f3711c, null, false)) {
                mVar = this.f3711c.h;
                d1.d.b(mVar);
                d1.d.e(this.f3711c, "call");
            } else {
                u uVar = this.i;
                try {
                    if (uVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f3712e;
                            if (pVar2 == null) {
                                o1.a aVar = this.f3710b;
                                j jVar3 = this.f3711c;
                                pVar2 = new p(aVar, jVar3.f3720a.f3366y, jVar3);
                                this.f3712e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3753a < ((List) pVar2.f3756e).size()) {
                                boolean z5 = pVar2.f3753a < ((List) pVar2.f3756e).size();
                                o1.a aVar2 = (o1.a) pVar2.f3754b;
                                if (!z5) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3756e));
                                }
                                List list2 = (List) pVar2.f3756e;
                                int i6 = pVar2.f3753a;
                                pVar2.f3753a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3757f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    o1.l lVar = aVar2.h;
                                    str = lVar.d;
                                    i4 = lVar.f3320e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    d1.d.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    d1.d.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        d1.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        d1.d.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = p1.b.f3455a;
                                    d1.d.e(str, "<this>");
                                    d1.g gVar = p1.b.f3459f;
                                    gVar.getClass();
                                    if (((Pattern) gVar.f2019b).matcher(str).matches()) {
                                        list = w1.d.Y(InetAddress.getByName(str));
                                    } else {
                                        d1.d.e((j) pVar2.d, "call");
                                        aVar2.f3250a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            d1.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new S0.d(allByName, false)) : w1.d.Y(allByName[0]) : S0.p.f795a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f3250a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3757f.iterator();
                                while (it2.hasNext()) {
                                    u uVar2 = new u((o1.a) pVar2.f3754b, proxy, (InetSocketAddress) it2.next());
                                    Z z6 = (Z) pVar2.f3755c;
                                    synchronized (z6) {
                                        contains = ((LinkedHashSet) z6.f2878a).contains(uVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3758g).add(uVar2);
                                    } else {
                                        arrayList.add(uVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                S0.m.A0(arrayList, (ArrayList) pVar2.f3758g);
                                ((ArrayList) pVar2.f3758g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f3711c.f3729m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3709a.a(this.f3710b, this.f3711c, arrayList, false)) {
                                mVar = this.f3711c.h;
                                d1.d.b(mVar);
                                d1.d.e(this.f3711c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f275a;
                                jVar4.f275a = i7 + 1;
                                uVar = (u) arrayList.get(i7);
                                mVar = new m(this.f3709a, uVar);
                                this.f3711c.f3731o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3711c);
                                this.f3711c.f3731o = null;
                                z4 = this.f3711c.f3720a.f3366y;
                                synchronized (z4) {
                                    ((LinkedHashSet) z4.f2878a).remove(uVar);
                                }
                                if (this.f3709a.a(this.f3710b, this.f3711c, arrayList, true)) {
                                    m mVar2 = this.f3711c.h;
                                    d1.d.b(mVar2);
                                    this.i = uVar;
                                    Socket socket = mVar.d;
                                    d1.d.b(socket);
                                    p1.b.c(socket);
                                    d1.d.e(this.f3711c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3709a;
                                        nVar.getClass();
                                        byte[] bArr2 = p1.b.f3455a;
                                        nVar.d.add(mVar);
                                        nVar.f3749b.c(nVar.f3750c, 0L);
                                        this.f3711c.b(mVar);
                                    }
                                    d1.d.e(this.f3711c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            d1.d.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f275a;
                            jVar5.f275a = i8 + 1;
                            uVar = (u) ((ArrayList) jVar5.f276b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3711c);
                    this.f3711c.f3731o = null;
                    z4 = this.f3711c.f3720a.f3366y;
                    synchronized (z4) {
                    }
                } catch (Throwable th2) {
                    this.f3711c.f3731o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3709a, uVar);
                this.f3711c.f3731o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(o1.l lVar) {
        d1.d.e(lVar, "url");
        o1.l lVar2 = this.f3710b.h;
        return lVar.f3320e == lVar2.f3320e && d1.d.a(lVar.d, lVar2.d);
    }

    public final void c(IOException iOException) {
        d1.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof A) && ((A) iOException).f4052a == 8) {
            this.f3713f++;
        } else if (iOException instanceof C0308a) {
            this.f3714g++;
        } else {
            this.h++;
        }
    }
}
