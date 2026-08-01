package q1;

import T0.q;
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
import l.C0207a0;
import m1.u;
import t1.B;
import t1.C0315a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3462a;

    /* renamed from: b, reason: collision with root package name */
    public final m1.a f3463b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3464c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f3465e;

    /* renamed from: f, reason: collision with root package name */
    public int f3466f;

    /* renamed from: g, reason: collision with root package name */
    public int f3467g;
    public int h;
    public u i;

    public f(n nVar, m1.a aVar, j jVar) {
        b1.d.e(nVar, "connectionPool");
        b1.d.e(jVar, "call");
        this.f3462a = nVar;
        this.f3463b = aVar;
        this.f3464c = jVar;
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
        C0207a0 c0207a0;
        Socket i5;
        while (!this.f3464c.f3482m) {
            m mVar = this.f3464c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3493j && b(mVar.f3488b.f3262a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3464c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3464c.h != null) {
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
                            p pVar = this.f3465e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        n1.b.c(i5);
                    }
                    b1.d.e(this.f3464c, "call");
                }
            }
            this.f3466f = 0;
            this.f3467g = 0;
            this.h = 0;
            if (this.f3462a.a(this.f3463b, this.f3464c, null, false)) {
                mVar = this.f3464c.h;
                b1.d.b(mVar);
                b1.d.e(this.f3464c, "call");
            } else {
                u uVar = this.i;
                try {
                    if (uVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f3465e;
                            if (pVar2 == null) {
                                m1.a aVar = this.f3463b;
                                j jVar3 = this.f3464c;
                                pVar2 = new p(aVar, jVar3.f3473a.f3232y, jVar3);
                                this.f3465e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3506a < ((List) pVar2.f3509e).size()) {
                                boolean z4 = pVar2.f3506a < ((List) pVar2.f3509e).size();
                                m1.a aVar2 = (m1.a) pVar2.f3507b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3509e));
                                }
                                List list2 = (List) pVar2.f3509e;
                                int i6 = pVar2.f3506a;
                                pVar2.f3506a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3510f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    m1.l lVar = aVar2.h;
                                    str = lVar.d;
                                    i4 = lVar.f3186e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    b1.d.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    b1.d.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        b1.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        b1.d.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = n1.b.f3286a;
                                    b1.d.e(str, "<this>");
                                    b1.g gVar = n1.b.f3290f;
                                    gVar.getClass();
                                    if (((Pattern) gVar.f1571b).matcher(str).matches()) {
                                        list = u1.d.a0(InetAddress.getByName(str));
                                    } else {
                                        b1.d.e((j) pVar2.d, "call");
                                        aVar2.f3116a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            b1.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new T0.e(allByName, false)) : u1.d.a0(allByName[0]) : q.f829a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f3116a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3510f.iterator();
                                while (it2.hasNext()) {
                                    u uVar2 = new u((m1.a) pVar2.f3507b, proxy, (InetSocketAddress) it2.next());
                                    C0207a0 c0207a02 = (C0207a0) pVar2.f3508c;
                                    synchronized (c0207a02) {
                                        contains = ((LinkedHashSet) c0207a02.f2889a).contains(uVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3511g).add(uVar2);
                                    } else {
                                        arrayList.add(uVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                T0.n.w0(arrayList, (ArrayList) pVar2.f3511g);
                                ((ArrayList) pVar2.f3511g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f3464c.f3482m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3462a.a(this.f3463b, this.f3464c, arrayList, false)) {
                                mVar = this.f3464c.h;
                                b1.d.b(mVar);
                                b1.d.e(this.f3464c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f220a;
                                jVar4.f220a = i7 + 1;
                                uVar = (u) arrayList.get(i7);
                                mVar = new m(this.f3462a, uVar);
                                this.f3464c.f3484o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3464c);
                                this.f3464c.f3484o = null;
                                c0207a0 = this.f3464c.f3473a.f3232y;
                                synchronized (c0207a0) {
                                    ((LinkedHashSet) c0207a0.f2889a).remove(uVar);
                                }
                                if (this.f3462a.a(this.f3463b, this.f3464c, arrayList, true)) {
                                    m mVar2 = this.f3464c.h;
                                    b1.d.b(mVar2);
                                    this.i = uVar;
                                    Socket socket = mVar.d;
                                    b1.d.b(socket);
                                    n1.b.c(socket);
                                    b1.d.e(this.f3464c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3462a;
                                        nVar.getClass();
                                        byte[] bArr2 = n1.b.f3286a;
                                        nVar.d.add(mVar);
                                        nVar.f3502b.c(nVar.f3503c, 0L);
                                        this.f3464c.b(mVar);
                                    }
                                    b1.d.e(this.f3464c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            b1.d.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f220a;
                            jVar5.f220a = i8 + 1;
                            uVar = (u) ((ArrayList) jVar5.f221b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3464c);
                    this.f3464c.f3484o = null;
                    c0207a0 = this.f3464c.f3473a.f3232y;
                    synchronized (c0207a0) {
                    }
                } catch (Throwable th2) {
                    this.f3464c.f3484o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3462a, uVar);
                this.f3464c.f3484o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(m1.l lVar) {
        b1.d.e(lVar, "url");
        m1.l lVar2 = this.f3463b.h;
        return lVar.f3186e == lVar2.f3186e && b1.d.a(lVar.d, lVar2.d);
    }

    public final void c(IOException iOException) {
        b1.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof B) && ((B) iOException).f3750a == 8) {
            this.f3466f++;
        } else if (iOException instanceof C0315a) {
            this.f3467g++;
        } else {
            this.h++;
        }
    }
}
