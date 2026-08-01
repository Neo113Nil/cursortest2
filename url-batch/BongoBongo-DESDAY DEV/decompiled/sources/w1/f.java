package w1;

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
import m.C0202a0;
import s1.t;
import z1.A;
import z1.C0322a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f4225a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.a f4226b;

    /* renamed from: c, reason: collision with root package name */
    public final j f4227c;
    public I.i d;

    /* renamed from: e, reason: collision with root package name */
    public p f4228e;

    /* renamed from: f, reason: collision with root package name */
    public int f4229f;

    /* renamed from: g, reason: collision with root package name */
    public int f4230g;

    /* renamed from: h, reason: collision with root package name */
    public int f4231h;
    public t i;

    public f(n nVar, s1.a aVar, j jVar) {
        h1.d.e(nVar, "connectionPool");
        h1.d.e(jVar, "call");
        this.f4225a = nVar;
        this.f4226b = aVar;
        this.f4227c = jVar;
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
        C0202a0 c0202a0;
        Socket i5;
        while (!this.f4227c.f4247m) {
            m mVar = this.f4227c.f4243h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f4259j && b(mVar.f4253b.f3716a.f3583h)) {
                            i5 = null;
                        }
                        i5 = this.f4227c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f4227c.f4243h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        I.i iVar = this.d;
                        if (iVar != null ? iVar.d() : true) {
                            continue;
                        } else {
                            p pVar = this.f4228e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        t1.b.c(i5);
                    }
                    h1.d.e(this.f4227c, "call");
                }
            }
            this.f4229f = 0;
            this.f4230g = 0;
            this.f4231h = 0;
            if (this.f4225a.a(this.f4226b, this.f4227c, null, false)) {
                mVar = this.f4227c.f4243h;
                h1.d.b(mVar);
                h1.d.e(this.f4227c, "call");
            } else {
                t tVar = this.i;
                try {
                    if (tVar != null) {
                        this.i = null;
                    } else {
                        I.i iVar2 = this.d;
                        if (iVar2 == null || !iVar2.d()) {
                            p pVar2 = this.f4228e;
                            if (pVar2 == null) {
                                s1.a aVar = this.f4226b;
                                j jVar = this.f4227c;
                                pVar2 = new p(aVar, jVar.f4237a.f3683y, jVar);
                                this.f4228e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f4272a < ((List) pVar2.f4275e).size()) {
                                boolean z4 = pVar2.f4272a < ((List) pVar2.f4275e).size();
                                s1.a aVar2 = (s1.a) pVar2.f4273b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.f3583h.d + "; exhausted proxy configurations: " + ((List) pVar2.f4275e));
                                }
                                List list2 = (List) pVar2.f4275e;
                                int i6 = pVar2.f4272a;
                                pVar2.f4272a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f4276f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    s1.l lVar = aVar2.f3583h;
                                    str = lVar.d;
                                    i4 = lVar.f3652e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    h1.d.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    h1.d.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        h1.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        h1.d.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = t1.b.f3898a;
                                    h1.d.e(str, "<this>");
                                    h1.g gVar = t1.b.f3902f;
                                    gVar.getClass();
                                    if (((Pattern) gVar.f2650b).matcher(str).matches()) {
                                        list = A1.d.T(InetAddress.getByName(str));
                                    } else {
                                        h1.d.e((j) pVar2.d, "call");
                                        aVar2.f3577a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            h1.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new W0.d(allByName, false)) : A1.d.T(allByName[0]) : W0.p.f959a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f3577a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f4276f.iterator();
                                while (it2.hasNext()) {
                                    t tVar2 = new t((s1.a) pVar2.f4273b, proxy, (InetSocketAddress) it2.next());
                                    C0202a0 c0202a02 = (C0202a0) pVar2.f4274c;
                                    synchronized (c0202a02) {
                                        contains = ((LinkedHashSet) c0202a02.f3068a).contains(tVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f4277g).add(tVar2);
                                    } else {
                                        arrayList.add(tVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                W0.m.p0(arrayList, (ArrayList) pVar2.f4277g);
                                ((ArrayList) pVar2.f4277g).clear();
                            }
                            I.i iVar3 = new I.i(arrayList);
                            this.d = iVar3;
                            if (this.f4227c.f4247m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f4225a.a(this.f4226b, this.f4227c, arrayList, false)) {
                                mVar = this.f4227c.f4243h;
                                h1.d.b(mVar);
                                h1.d.e(this.f4227c, "call");
                            } else {
                                if (!iVar3.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = iVar3.f335a;
                                iVar3.f335a = i7 + 1;
                                tVar = (t) arrayList.get(i7);
                                mVar = new m(this.f4225a, tVar);
                                this.f4227c.f4249o = mVar;
                                mVar.c(i, i2, i3, z2, this.f4227c);
                                this.f4227c.f4249o = null;
                                c0202a0 = this.f4227c.f4237a.f3683y;
                                synchronized (c0202a0) {
                                    ((LinkedHashSet) c0202a0.f3068a).remove(tVar);
                                }
                                if (this.f4225a.a(this.f4226b, this.f4227c, arrayList, true)) {
                                    m mVar2 = this.f4227c.f4243h;
                                    h1.d.b(mVar2);
                                    this.i = tVar;
                                    Socket socket = mVar.d;
                                    h1.d.b(socket);
                                    t1.b.c(socket);
                                    h1.d.e(this.f4227c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f4225a;
                                        nVar.getClass();
                                        byte[] bArr2 = t1.b.f3898a;
                                        nVar.d.add(mVar);
                                        nVar.f4268b.c(nVar.f4269c, 0L);
                                        this.f4227c.b(mVar);
                                    }
                                    h1.d.e(this.f4227c, "call");
                                }
                            }
                        } else {
                            I.i iVar4 = this.d;
                            h1.d.b(iVar4);
                            if (!iVar4.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = iVar4.f335a;
                            iVar4.f335a = i8 + 1;
                            tVar = (t) ((ArrayList) iVar4.f336b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f4227c);
                    this.f4227c.f4249o = null;
                    c0202a0 = this.f4227c.f4237a.f3683y;
                    synchronized (c0202a0) {
                    }
                } catch (Throwable th2) {
                    this.f4227c.f4249o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f4225a, tVar);
                this.f4227c.f4249o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(s1.l lVar) {
        h1.d.e(lVar, "url");
        s1.l lVar2 = this.f4226b.f3583h;
        return lVar.f3652e == lVar2.f3652e && h1.d.a(lVar.d, lVar2.d);
    }

    public final void c(IOException iOException) {
        h1.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof A) && ((A) iOException).f4419a == 8) {
            this.f4229f++;
        } else if (iOException instanceof C0322a) {
            this.f4230g++;
        } else {
            this.f4231h++;
        }
    }
}
