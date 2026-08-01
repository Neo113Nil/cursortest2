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
import m1.v;
import t1.B;
import t1.C0302a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3515a;

    /* renamed from: b, reason: collision with root package name */
    public final m1.a f3516b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3517c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f3518e;

    /* renamed from: f, reason: collision with root package name */
    public int f3519f;

    /* renamed from: g, reason: collision with root package name */
    public int f3520g;
    public int h;
    public v i;

    public f(n nVar, m1.a aVar, j jVar) {
        b1.d.e(nVar, "connectionPool");
        b1.d.e(jVar, "call");
        this.f3515a = nVar;
        this.f3516b = aVar;
        this.f3517c = jVar;
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
        m1.g gVar;
        Socket i5;
        while (!this.f3517c.f3535m) {
            m mVar = this.f3517c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3546j && b(mVar.f3541b.f3295a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3517c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3517c.h != null) {
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
                            p pVar = this.f3518e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        n1.b.c(i5);
                    }
                    b1.d.e(this.f3517c, "call");
                }
            }
            this.f3519f = 0;
            this.f3520g = 0;
            this.h = 0;
            if (this.f3515a.a(this.f3516b, this.f3517c, null, false)) {
                mVar = this.f3517c.h;
                b1.d.b(mVar);
                b1.d.e(this.f3517c, "call");
            } else {
                v vVar = this.i;
                try {
                    if (vVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f3518e;
                            if (pVar2 == null) {
                                m1.a aVar = this.f3516b;
                                j jVar3 = this.f3517c;
                                pVar2 = new p(aVar, jVar3.f3526a.f3265y, jVar3);
                                this.f3518e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3559a < ((List) pVar2.f3562e).size()) {
                                boolean z4 = pVar2.f3559a < ((List) pVar2.f3562e).size();
                                m1.a aVar2 = (m1.a) pVar2.f3560b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3562e));
                                }
                                List list2 = (List) pVar2.f3562e;
                                int i6 = pVar2.f3559a;
                                pVar2.f3559a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3563f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    m1.m mVar2 = aVar2.h;
                                    str = mVar2.d;
                                    i4 = mVar2.f3219e;
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
                                    byte[] bArr = n1.b.f3319a;
                                    b1.d.e(str, "<this>");
                                    b1.g gVar2 = n1.b.f3323f;
                                    gVar2.getClass();
                                    if (((Pattern) gVar2.f1587b).matcher(str).matches()) {
                                        list = u1.d.P(InetAddress.getByName(str));
                                    } else {
                                        b1.d.e((j) pVar2.d, "call");
                                        aVar2.f3148a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            b1.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new T0.e(allByName, false)) : u1.d.P(allByName[0]) : q.f844a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f3148a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3563f.iterator();
                                while (it2.hasNext()) {
                                    v vVar2 = new v((m1.a) pVar2.f3560b, proxy, (InetSocketAddress) it2.next());
                                    m1.g gVar3 = (m1.g) pVar2.f3561c;
                                    synchronized (gVar3) {
                                        contains = ((LinkedHashSet) gVar3.f3189a).contains(vVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3564g).add(vVar2);
                                    } else {
                                        arrayList.add(vVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                T0.n.m0(arrayList, (ArrayList) pVar2.f3564g);
                                ((ArrayList) pVar2.f3564g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f3517c.f3535m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3515a.a(this.f3516b, this.f3517c, arrayList, false)) {
                                mVar = this.f3517c.h;
                                b1.d.b(mVar);
                                b1.d.e(this.f3517c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f289a;
                                jVar4.f289a = i7 + 1;
                                vVar = (v) arrayList.get(i7);
                                mVar = new m(this.f3515a, vVar);
                                this.f3517c.f3537o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3517c);
                                this.f3517c.f3537o = null;
                                gVar = this.f3517c.f3526a.f3265y;
                                synchronized (gVar) {
                                    ((LinkedHashSet) gVar.f3189a).remove(vVar);
                                }
                                if (this.f3515a.a(this.f3516b, this.f3517c, arrayList, true)) {
                                    m mVar3 = this.f3517c.h;
                                    b1.d.b(mVar3);
                                    this.i = vVar;
                                    Socket socket = mVar.d;
                                    b1.d.b(socket);
                                    n1.b.c(socket);
                                    b1.d.e(this.f3517c, "call");
                                    mVar = mVar3;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3515a;
                                        nVar.getClass();
                                        byte[] bArr2 = n1.b.f3319a;
                                        nVar.d.add(mVar);
                                        nVar.f3555b.c(nVar.f3556c, 0L);
                                        this.f3517c.b(mVar);
                                    }
                                    b1.d.e(this.f3517c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            b1.d.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f289a;
                            jVar5.f289a = i8 + 1;
                            vVar = (v) ((ArrayList) jVar5.f290b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3517c);
                    this.f3517c.f3537o = null;
                    gVar = this.f3517c.f3526a.f3265y;
                    synchronized (gVar) {
                    }
                } catch (Throwable th2) {
                    this.f3517c.f3537o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3515a, vVar);
                this.f3517c.f3537o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(m1.m mVar) {
        b1.d.e(mVar, "url");
        m1.m mVar2 = this.f3516b.h;
        return mVar.f3219e == mVar2.f3219e && b1.d.a(mVar.d, mVar2.d);
    }

    public final void c(IOException iOException) {
        b1.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof B) && ((B) iOException).f3832a == 8) {
            this.f3519f++;
        } else if (iOException instanceof C0302a) {
            this.f3520g++;
        } else {
            this.h++;
        }
    }
}
