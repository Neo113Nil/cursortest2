package t1;

import W0.q;
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
import p1.v;
import w1.A;
import w1.C0333a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3748a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.a f3749b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3750c;
    public H.j d;

    /* renamed from: e, reason: collision with root package name */
    public p f3751e;

    /* renamed from: f, reason: collision with root package name */
    public int f3752f;

    /* renamed from: g, reason: collision with root package name */
    public int f3753g;
    public int h;
    public v i;

    public f(n nVar, p1.a aVar, j jVar) {
        e1.d.e(nVar, "connectionPool");
        e1.d.e(jVar, "call");
        this.f3748a = nVar;
        this.f3749b = aVar;
        this.f3750c = jVar;
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
        p1.g gVar;
        Socket i5;
        while (!this.f3750c.f3768m) {
            m mVar = this.f3750c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3779j && b(mVar.f3774b.f3442a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3750c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3750c.h != null) {
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
                            p pVar = this.f3751e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        q1.b.c(i5);
                    }
                    e1.d.e(this.f3750c, "call");
                }
            }
            this.f3752f = 0;
            this.f3753g = 0;
            this.h = 0;
            if (this.f3748a.a(this.f3749b, this.f3750c, null, false)) {
                mVar = this.f3750c.h;
                e1.d.b(mVar);
                e1.d.e(this.f3750c, "call");
            } else {
                v vVar = this.i;
                try {
                    if (vVar != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f3751e;
                            if (pVar2 == null) {
                                p1.a aVar = this.f3749b;
                                j jVar3 = this.f3750c;
                                pVar2 = new p(aVar, jVar3.f3759a.f3412y, jVar3);
                                this.f3751e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3792a < ((List) pVar2.f3795e).size()) {
                                boolean z4 = pVar2.f3792a < ((List) pVar2.f3795e).size();
                                p1.a aVar2 = (p1.a) pVar2.f3793b;
                                if (!z4) {
                                    throw new SocketException("No route to " + aVar2.h.d + "; exhausted proxy configurations: " + ((List) pVar2.f3795e));
                                }
                                List list2 = (List) pVar2.f3795e;
                                int i6 = pVar2.f3792a;
                                pVar2.f3792a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3796f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    p1.m mVar2 = aVar2.h;
                                    str = mVar2.d;
                                    i4 = mVar2.f3366e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    e1.d.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    e1.d.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        e1.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        e1.d.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = q1.b.f3491a;
                                    e1.d.e(str, "<this>");
                                    e1.g gVar2 = q1.b.f3495f;
                                    gVar2.getClass();
                                    if (((Pattern) gVar2.f2055b).matcher(str).matches()) {
                                        list = x1.l.S(InetAddress.getByName(str));
                                    } else {
                                        e1.d.e((j) pVar2.d, "call");
                                        aVar2.f3295a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            e1.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new W0.e(allByName, false)) : x1.l.S(allByName[0]) : q.f896a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar2.f3295a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3796f.iterator();
                                while (it2.hasNext()) {
                                    v vVar2 = new v((p1.a) pVar2.f3793b, proxy, (InetSocketAddress) it2.next());
                                    p1.g gVar3 = (p1.g) pVar2.f3794c;
                                    synchronized (gVar3) {
                                        contains = ((LinkedHashSet) gVar3.f3336a).contains(vVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3797g).add(vVar2);
                                    } else {
                                        arrayList.add(vVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                W0.n.n0(arrayList, (ArrayList) pVar2.f3797g);
                                ((ArrayList) pVar2.f3797g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.d = jVar4;
                            if (this.f3750c.f3768m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3748a.a(this.f3749b, this.f3750c, arrayList, false)) {
                                mVar = this.f3750c.h;
                                e1.d.b(mVar);
                                e1.d.e(this.f3750c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f273a;
                                jVar4.f273a = i7 + 1;
                                vVar = (v) arrayList.get(i7);
                                mVar = new m(this.f3748a, vVar);
                                this.f3750c.f3770o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3750c);
                                this.f3750c.f3770o = null;
                                gVar = this.f3750c.f3759a.f3412y;
                                synchronized (gVar) {
                                    ((LinkedHashSet) gVar.f3336a).remove(vVar);
                                }
                                if (this.f3748a.a(this.f3749b, this.f3750c, arrayList, true)) {
                                    m mVar3 = this.f3750c.h;
                                    e1.d.b(mVar3);
                                    this.i = vVar;
                                    Socket socket = mVar.d;
                                    e1.d.b(socket);
                                    q1.b.c(socket);
                                    e1.d.e(this.f3750c, "call");
                                    mVar = mVar3;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3748a;
                                        nVar.getClass();
                                        byte[] bArr2 = q1.b.f3491a;
                                        nVar.d.add(mVar);
                                        nVar.f3788b.c(nVar.f3789c, 0L);
                                        this.f3750c.b(mVar);
                                    }
                                    e1.d.e(this.f3750c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.d;
                            e1.d.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f273a;
                            jVar5.f273a = i8 + 1;
                            vVar = (v) ((ArrayList) jVar5.f274b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3750c);
                    this.f3750c.f3770o = null;
                    gVar = this.f3750c.f3759a.f3412y;
                    synchronized (gVar) {
                    }
                } catch (Throwable th2) {
                    this.f3750c.f3770o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3748a, vVar);
                this.f3750c.f3770o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(p1.m mVar) {
        e1.d.e(mVar, "url");
        p1.m mVar2 = this.f3749b.h;
        return mVar.f3366e == mVar2.f3366e && e1.d.a(mVar.d, mVar2.d);
    }

    public final void c(IOException iOException) {
        e1.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof A) && ((A) iOException).f4080a == 8) {
            this.f3752f++;
        } else if (iOException instanceof C0333a) {
            this.f3753g++;
        } else {
            this.h++;
        }
    }
}
