package v1;

import X0.s;
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
import l.C0176a0;
import r1.t;
import y1.A;
import y1.C0317a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3865a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.a f3866b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3867c;
    public J.i d;

    /* renamed from: e, reason: collision with root package name */
    public p f3868e;

    /* renamed from: f, reason: collision with root package name */
    public int f3869f;

    /* renamed from: g, reason: collision with root package name */
    public int f3870g;
    public int h;
    public t i;

    public f(n nVar, r1.a aVar, j jVar) {
        g1.d.e(nVar, "connectionPool");
        g1.d.e(jVar, "call");
        this.f3865a = nVar;
        this.f3866b = aVar;
        this.f3867c = jVar;
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
        C0176a0 c0176a0;
        Socket i5;
        while (!this.f3867c.f3885m) {
            m mVar = this.f3867c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3896j && b(mVar.f3891b.f3558a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3867c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3867c.h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        J.i iVar = this.d;
                        if (iVar != null ? iVar.g() : true) {
                            continue;
                        } else {
                            p pVar = this.f3868e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        s1.b.c(i5);
                    }
                    g1.d.e(this.f3867c, "call");
                }
            }
            this.f3869f = 0;
            this.f3870g = 0;
            this.h = 0;
            if (this.f3865a.a(this.f3866b, this.f3867c, null, false)) {
                mVar = this.f3867c.h;
                g1.d.b(mVar);
                g1.d.e(this.f3867c, "call");
            } else {
                t tVar = this.i;
                try {
                    if (tVar != null) {
                        this.i = null;
                    } else {
                        J.i iVar2 = this.d;
                        if (iVar2 == null || !iVar2.g()) {
                            p pVar2 = this.f3868e;
                            if (pVar2 == null) {
                                r1.a aVar = this.f3866b;
                                j jVar = this.f3867c;
                                pVar2 = new p(aVar, jVar.f3876a.f3528y, jVar);
                                this.f3868e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3909a < ((List) pVar2.f3912e).size()) {
                                boolean z4 = pVar2.f3909a < ((List) pVar2.f3912e).size();
                                r1.a aVar2 = (r1.a) pVar2.f3910b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3912e));
                                }
                                List list2 = (List) pVar2.f3912e;
                                int i6 = pVar2.f3909a;
                                pVar2.f3909a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3913f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    r1.l lVar = aVar2.h;
                                    str = lVar.d;
                                    i4 = lVar.f3499e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    g1.d.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    g1.d.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        g1.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        g1.d.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = s1.b.f3607a;
                                    g1.d.e(str, "<this>");
                                    g1.g gVar = s1.b.f3611f;
                                    gVar.getClass();
                                    if (((Pattern) gVar.f2365b).matcher(str).matches()) {
                                        list = z1.l.a0(InetAddress.getByName(str));
                                    } else {
                                        g1.d.e((j) pVar2.d, "call");
                                        aVar2.f3429a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            g1.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new X0.g(allByName, false)) : z1.l.a0(allByName[0]) : s.f992a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f3429a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3913f.iterator();
                                while (it2.hasNext()) {
                                    t tVar2 = new t((r1.a) pVar2.f3910b, proxy, (InetSocketAddress) it2.next());
                                    C0176a0 c0176a02 = (C0176a0) pVar2.f3911c;
                                    synchronized (c0176a02) {
                                        contains = ((LinkedHashSet) c0176a02.f2962a).contains(tVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3914g).add(tVar2);
                                    } else {
                                        arrayList.add(tVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                X0.p.A0(arrayList, (ArrayList) pVar2.f3914g);
                                ((ArrayList) pVar2.f3914g).clear();
                            }
                            J.i iVar3 = new J.i(arrayList);
                            this.d = iVar3;
                            if (this.f3867c.f3885m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3865a.a(this.f3866b, this.f3867c, arrayList, false)) {
                                mVar = this.f3867c.h;
                                g1.d.b(mVar);
                                g1.d.e(this.f3867c, "call");
                            } else {
                                if (!iVar3.g()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = iVar3.f373a;
                                iVar3.f373a = i7 + 1;
                                tVar = (t) arrayList.get(i7);
                                mVar = new m(this.f3865a, tVar);
                                this.f3867c.f3887o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3867c);
                                this.f3867c.f3887o = null;
                                c0176a0 = this.f3867c.f3876a.f3528y;
                                synchronized (c0176a0) {
                                    ((LinkedHashSet) c0176a0.f2962a).remove(tVar);
                                }
                                if (this.f3865a.a(this.f3866b, this.f3867c, arrayList, true)) {
                                    m mVar2 = this.f3867c.h;
                                    g1.d.b(mVar2);
                                    this.i = tVar;
                                    Socket socket = mVar.d;
                                    g1.d.b(socket);
                                    s1.b.c(socket);
                                    g1.d.e(this.f3867c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3865a;
                                        nVar.getClass();
                                        byte[] bArr2 = s1.b.f3607a;
                                        nVar.d.add(mVar);
                                        nVar.f3905b.c(nVar.f3906c, 0L);
                                        this.f3867c.b(mVar);
                                    }
                                    g1.d.e(this.f3867c, "call");
                                }
                            }
                        } else {
                            J.i iVar4 = this.d;
                            g1.d.b(iVar4);
                            if (!iVar4.g()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = iVar4.f373a;
                            iVar4.f373a = i8 + 1;
                            tVar = (t) ((ArrayList) iVar4.f374b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3867c);
                    this.f3867c.f3887o = null;
                    c0176a0 = this.f3867c.f3876a.f3528y;
                    synchronized (c0176a0) {
                    }
                } catch (Throwable th2) {
                    this.f3867c.f3887o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3865a, tVar);
                this.f3867c.f3887o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(r1.l lVar) {
        g1.d.e(lVar, "url");
        r1.l lVar2 = this.f3866b.h;
        return lVar.f3499e == lVar2.f3499e && g1.d.a(lVar.d, lVar2.d);
    }

    public final void c(IOException iOException) {
        g1.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof A) && ((A) iOException).f4195a == 8) {
            this.f3869f++;
        } else if (iOException instanceof C0317a) {
            this.f3870g++;
        } else {
            this.h++;
        }
    }
}
