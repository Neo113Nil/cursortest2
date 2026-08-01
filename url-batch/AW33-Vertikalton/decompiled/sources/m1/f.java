package m1;

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
    public final n f3213a;

    /* renamed from: b, reason: collision with root package name */
    public final i1.a f3214b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3215c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f3216e;

    /* renamed from: f, reason: collision with root package name */
    public int f3217f;

    /* renamed from: g, reason: collision with root package name */
    public int f3218g;
    public int h;
    public w i;

    public f(n nVar, i1.a aVar, j jVar) {
        X0.e.e(nVar, "connectionPool");
        X0.e.e(jVar, "call");
        this.f3213a = nVar;
        this.f3214b = aVar;
        this.f3215c = jVar;
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
        while (!this.f3215c.f3233m) {
            m mVar = this.f3215c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3244j && b(mVar.f3239b.f2531a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3215c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3215c.h != null) {
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
                            p pVar = this.f3216e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        j1.b.c(i5);
                    }
                    X0.e.e(this.f3215c, "call");
                }
            }
            this.f3217f = 0;
            this.f3218g = 0;
            this.h = 0;
            if (this.f3213a.a(this.f3214b, this.f3215c, null, false)) {
                mVar = this.f3215c.h;
                X0.e.b(mVar);
                X0.e.e(this.f3215c, "call");
            } else {
                w wVar = this.i;
                try {
                    if (wVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.c()) {
                            p pVar2 = this.f3216e;
                            if (pVar2 == null) {
                                i1.a aVar = this.f3214b;
                                j jVar3 = this.f3215c;
                                pVar2 = new p(aVar, jVar3.f3224a.f2496y, jVar3);
                                this.f3216e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3257a < ((List) pVar2.f3260e).size()) {
                                boolean z4 = pVar2.f3257a < ((List) pVar2.f3260e).size();
                                i1.a aVar2 = (i1.a) pVar2.f3258b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3260e));
                                }
                                List list2 = (List) pVar2.f3260e;
                                int i6 = pVar2.f3257a;
                                pVar2.f3257a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3261f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    i1.m mVar2 = aVar2.h;
                                    str = mVar2.d;
                                    i4 = mVar2.f2453e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    X0.e.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    X0.e.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        X0.e.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        X0.e.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = j1.b.f2599a;
                                    X0.e.e(str, "<this>");
                                    X0.h hVar = j1.b.f2602e;
                                    hVar.getClass();
                                    if (((Pattern) hVar.f1014b).matcher(str).matches()) {
                                        list = q1.d.W(InetAddress.getByName(str));
                                    } else {
                                        X0.e.e((j) pVar2.d, "call");
                                        aVar2.f2380a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            X0.e.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new Q0.a(allByName, false)) : q1.d.W(allByName[0]) : Q0.m.f664a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f2380a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3261f.iterator();
                                while (it2.hasNext()) {
                                    w wVar2 = new w((i1.a) pVar2.f3258b, proxy, (InetSocketAddress) it2.next());
                                    C0242k c0242k2 = (C0242k) pVar2.f3259c;
                                    synchronized (c0242k2) {
                                        contains = ((LinkedHashSet) c0242k2.f3003a).contains(wVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3262g).add(wVar2);
                                    } else {
                                        arrayList.add(wVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                Q0.j.w0(arrayList, (ArrayList) pVar2.f3262g);
                                ((ArrayList) pVar2.f3262g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f3215c.f3233m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3213a.a(this.f3214b, this.f3215c, arrayList, false)) {
                                mVar = this.f3215c.h;
                                X0.e.b(mVar);
                                X0.e.e(this.f3215c, "call");
                            } else {
                                if (!jVar4.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f227a;
                                jVar4.f227a = i7 + 1;
                                wVar = (w) arrayList.get(i7);
                                mVar = new m(this.f3213a, wVar);
                                this.f3215c.f3235o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3215c);
                                this.f3215c.f3235o = null;
                                c0242k = this.f3215c.f3224a.f2496y;
                                synchronized (c0242k) {
                                    ((LinkedHashSet) c0242k.f3003a).remove(wVar);
                                }
                                if (this.f3213a.a(this.f3214b, this.f3215c, arrayList, true)) {
                                    m mVar3 = this.f3215c.h;
                                    X0.e.b(mVar3);
                                    this.i = wVar;
                                    Socket socket = mVar.d;
                                    X0.e.b(socket);
                                    j1.b.c(socket);
                                    X0.e.e(this.f3215c, "call");
                                    mVar = mVar3;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3213a;
                                        nVar.getClass();
                                        byte[] bArr2 = j1.b.f2599a;
                                        nVar.d.add(mVar);
                                        nVar.f3253b.c(nVar.f3254c, 0L);
                                        this.f3215c.b(mVar);
                                    }
                                    X0.e.e(this.f3215c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            X0.e.b(jVar5);
                            if (!jVar5.c()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f227a;
                            jVar5.f227a = i8 + 1;
                            wVar = (w) ((ArrayList) jVar5.f228b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3215c);
                    this.f3215c.f3235o = null;
                    c0242k = this.f3215c.f3224a.f2496y;
                    synchronized (c0242k) {
                    }
                } catch (Throwable th2) {
                    this.f3215c.f3235o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3213a, wVar);
                this.f3215c.f3235o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(i1.m mVar) {
        X0.e.e(mVar, "url");
        i1.m mVar2 = this.f3214b.h;
        return mVar.f2453e == mVar2.f2453e && X0.e.a(mVar.d, mVar2.d);
    }

    public final void c(IOException iOException) {
        X0.e.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof B) && ((B) iOException).f3397a == 8) {
            this.f3217f++;
        } else if (iOException instanceof C0284a) {
            this.f3218g++;
        } else {
            this.h++;
        }
    }
}
