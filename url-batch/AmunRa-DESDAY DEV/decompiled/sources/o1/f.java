package o1;

import R0.q;
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
import k1.w;
import l.C0229n;
import r1.B;
import r1.C0290a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3381a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.a f3382b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3383c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f3384e;

    /* renamed from: f, reason: collision with root package name */
    public int f3385f;

    /* renamed from: g, reason: collision with root package name */
    public int f3386g;
    public int h;
    public w i;

    public f(n nVar, k1.a aVar, j jVar) {
        Z0.d.e(nVar, "connectionPool");
        Z0.d.e(jVar, "call");
        this.f3381a = nVar;
        this.f3382b = aVar;
        this.f3383c = jVar;
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
        C0229n c0229n;
        Socket i5;
        while (!this.f3383c.f3401m) {
            m mVar = this.f3383c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3412j && b(mVar.f3407b.f2910a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3383c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3383c.h != null) {
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
                            p pVar = this.f3384e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        l1.b.c(i5);
                    }
                    Z0.d.e(this.f3383c, "call");
                }
            }
            this.f3385f = 0;
            this.f3386g = 0;
            this.h = 0;
            if (this.f3381a.a(this.f3382b, this.f3383c, null, false)) {
                mVar = this.f3383c.h;
                Z0.d.b(mVar);
                Z0.d.e(this.f3383c, "call");
            } else {
                w wVar = this.i;
                try {
                    if (wVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f3384e;
                            if (pVar2 == null) {
                                k1.a aVar = this.f3382b;
                                j jVar3 = this.f3383c;
                                pVar2 = new p(aVar, jVar3.f3392a.f2880y, jVar3);
                                this.f3384e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3425a < ((List) pVar2.f3428e).size()) {
                                boolean z4 = pVar2.f3425a < ((List) pVar2.f3428e).size();
                                k1.a aVar2 = (k1.a) pVar2.f3426b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3428e));
                                }
                                List list2 = (List) pVar2.f3428e;
                                int i6 = pVar2.f3425a;
                                pVar2.f3425a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3429f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    k1.n nVar = aVar2.h;
                                    str = nVar.d;
                                    i4 = nVar.f2834e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    Z0.d.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    Z0.d.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        Z0.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        Z0.d.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = l1.b.f3252a;
                                    Z0.d.e(str, "<this>");
                                    Z0.g gVar = l1.b.f3256f;
                                    gVar.getClass();
                                    if (((Pattern) gVar.f1067b).matcher(str).matches()) {
                                        list = s1.l.K(InetAddress.getByName(str));
                                    } else {
                                        Z0.d.e((j) pVar2.d, "call");
                                        aVar2.f2761a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            Z0.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new R0.e(allByName, false)) : s1.l.K(allByName[0]) : q.f712a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f2761a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3429f.iterator();
                                while (it2.hasNext()) {
                                    w wVar2 = new w((k1.a) pVar2.f3426b, proxy, (InetSocketAddress) it2.next());
                                    C0229n c0229n2 = (C0229n) pVar2.f3427c;
                                    synchronized (c0229n2) {
                                        contains = ((LinkedHashSet) c0229n2.f3111a).contains(wVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3430g).add(wVar2);
                                    } else {
                                        arrayList.add(wVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                R0.n.n0(arrayList, (ArrayList) pVar2.f3430g);
                                ((ArrayList) pVar2.f3430g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f3383c.f3401m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3381a.a(this.f3382b, this.f3383c, arrayList, false)) {
                                mVar = this.f3383c.h;
                                Z0.d.b(mVar);
                                Z0.d.e(this.f3383c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f213a;
                                jVar4.f213a = i7 + 1;
                                wVar = (w) arrayList.get(i7);
                                mVar = new m(this.f3381a, wVar);
                                this.f3383c.f3403o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3383c);
                                this.f3383c.f3403o = null;
                                c0229n = this.f3383c.f3392a.f2880y;
                                synchronized (c0229n) {
                                    ((LinkedHashSet) c0229n.f3111a).remove(wVar);
                                }
                                if (this.f3381a.a(this.f3382b, this.f3383c, arrayList, true)) {
                                    m mVar2 = this.f3383c.h;
                                    Z0.d.b(mVar2);
                                    this.i = wVar;
                                    Socket socket = mVar.d;
                                    Z0.d.b(socket);
                                    l1.b.c(socket);
                                    Z0.d.e(this.f3383c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar2 = this.f3381a;
                                        nVar2.getClass();
                                        byte[] bArr2 = l1.b.f3252a;
                                        nVar2.d.add(mVar);
                                        nVar2.f3421b.c(nVar2.f3422c, 0L);
                                        this.f3383c.b(mVar);
                                    }
                                    Z0.d.e(this.f3383c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            Z0.d.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f213a;
                            jVar5.f213a = i8 + 1;
                            wVar = (w) ((ArrayList) jVar5.f214b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3383c);
                    this.f3383c.f3403o = null;
                    c0229n = this.f3383c.f3392a.f2880y;
                    synchronized (c0229n) {
                    }
                } catch (Throwable th2) {
                    this.f3383c.f3403o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3381a, wVar);
                this.f3383c.f3403o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(k1.n nVar) {
        Z0.d.e(nVar, "url");
        k1.n nVar2 = this.f3382b.h;
        return nVar.f2834e == nVar2.f2834e && Z0.d.a(nVar.d, nVar2.d);
    }

    public final void c(IOException iOException) {
        Z0.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof B) && ((B) iOException).f3529a == 8) {
            this.f3385f++;
        } else if (iOException instanceof C0290a) {
            this.f3386g++;
        } else {
            this.h++;
        }
    }
}
