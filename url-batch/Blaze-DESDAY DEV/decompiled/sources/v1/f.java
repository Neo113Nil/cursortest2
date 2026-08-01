package v1;

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
import r1.v;
import y1.A;
import y1.C0320a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f4035a;

    /* renamed from: b, reason: collision with root package name */
    public final r1.a f4036b;

    /* renamed from: c, reason: collision with root package name */
    public final j f4037c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f4038e;

    /* renamed from: f, reason: collision with root package name */
    public int f4039f;

    /* renamed from: g, reason: collision with root package name */
    public int f4040g;
    public int h;
    public v i;

    public f(n nVar, r1.a aVar, j jVar) {
        g1.d.e(nVar, "connectionPool");
        g1.d.e(jVar, "call");
        this.f4035a = nVar;
        this.f4036b = aVar;
        this.f4037c = jVar;
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
        r1.g gVar;
        Socket i5;
        while (!this.f4037c.f4055m) {
            m mVar = this.f4037c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f4066j && b(mVar.f4061b.f3542a.h)) {
                            i5 = null;
                        }
                        i5 = this.f4037c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f4037c.h != null) {
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
                            p pVar = this.f4038e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        s1.b.c(i5);
                    }
                    g1.d.e(this.f4037c, "call");
                }
            }
            this.f4039f = 0;
            this.f4040g = 0;
            this.h = 0;
            if (this.f4035a.a(this.f4036b, this.f4037c, null, false)) {
                mVar = this.f4037c.h;
                g1.d.b(mVar);
                g1.d.e(this.f4037c, "call");
            } else {
                v vVar = this.i;
                try {
                    if (vVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f4038e;
                            if (pVar2 == null) {
                                r1.a aVar = this.f4036b;
                                j jVar3 = this.f4037c;
                                pVar2 = new p(aVar, jVar3.f4046a.f3512y, jVar3);
                                this.f4038e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f4079a < ((List) pVar2.f4082e).size()) {
                                boolean z4 = pVar2.f4079a < ((List) pVar2.f4082e).size();
                                r1.a aVar2 = (r1.a) pVar2.f4080b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f4082e));
                                }
                                List list2 = (List) pVar2.f4082e;
                                int i6 = pVar2.f4079a;
                                pVar2.f4079a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f4083f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    r1.m mVar2 = aVar2.h;
                                    str = mVar2.d;
                                    i4 = mVar2.f3466e;
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
                                    byte[] bArr = s1.b.f3721a;
                                    g1.d.e(str, "<this>");
                                    g1.g gVar2 = s1.b.f3725f;
                                    gVar2.getClass();
                                    if (((Pattern) gVar2.f2551b).matcher(str).matches()) {
                                        list = z1.d.Y(InetAddress.getByName(str));
                                    } else {
                                        g1.d.e((j) pVar2.d, "call");
                                        aVar2.f3395a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            g1.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new V0.d(allByName, false)) : z1.d.Y(allByName[0]) : V0.p.f917a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f3395a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f4083f.iterator();
                                while (it2.hasNext()) {
                                    v vVar2 = new v((r1.a) pVar2.f4080b, proxy, (InetSocketAddress) it2.next());
                                    r1.g gVar3 = (r1.g) pVar2.f4081c;
                                    synchronized (gVar3) {
                                        contains = ((LinkedHashSet) gVar3.f3436a).contains(vVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f4084g).add(vVar2);
                                    } else {
                                        arrayList.add(vVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                V0.m.y0(arrayList, (ArrayList) pVar2.f4084g);
                                ((ArrayList) pVar2.f4084g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f4037c.f4055m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f4035a.a(this.f4036b, this.f4037c, arrayList, false)) {
                                mVar = this.f4037c.h;
                                g1.d.b(mVar);
                                g1.d.e(this.f4037c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f292a;
                                jVar4.f292a = i7 + 1;
                                vVar = (v) arrayList.get(i7);
                                mVar = new m(this.f4035a, vVar);
                                this.f4037c.f4057o = mVar;
                                mVar.c(i, i2, i3, z2, this.f4037c);
                                this.f4037c.f4057o = null;
                                gVar = this.f4037c.f4046a.f3512y;
                                synchronized (gVar) {
                                    ((LinkedHashSet) gVar.f3436a).remove(vVar);
                                }
                                if (this.f4035a.a(this.f4036b, this.f4037c, arrayList, true)) {
                                    m mVar3 = this.f4037c.h;
                                    g1.d.b(mVar3);
                                    this.i = vVar;
                                    Socket socket = mVar.d;
                                    g1.d.b(socket);
                                    s1.b.c(socket);
                                    g1.d.e(this.f4037c, "call");
                                    mVar = mVar3;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f4035a;
                                        nVar.getClass();
                                        byte[] bArr2 = s1.b.f3721a;
                                        nVar.d.add(mVar);
                                        nVar.f4075b.c(nVar.f4076c, 0L);
                                        this.f4037c.b(mVar);
                                    }
                                    g1.d.e(this.f4037c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            g1.d.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f292a;
                            jVar5.f292a = i8 + 1;
                            vVar = (v) ((ArrayList) jVar5.f293b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f4037c);
                    this.f4037c.f4057o = null;
                    gVar = this.f4037c.f4046a.f3512y;
                    synchronized (gVar) {
                    }
                } catch (Throwable th2) {
                    this.f4037c.f4057o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f4035a, vVar);
                this.f4037c.f4057o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(r1.m mVar) {
        g1.d.e(mVar, "url");
        r1.m mVar2 = this.f4036b.h;
        return mVar.f3466e == mVar2.f3466e && g1.d.a(mVar.d, mVar2.d);
    }

    public final void c(IOException iOException) {
        g1.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof A) && ((A) iOException).f4224a == 8) {
            this.f4039f++;
        } else if (iOException instanceof C0320a) {
            this.f4040g++;
        } else {
            this.h++;
        }
    }
}
