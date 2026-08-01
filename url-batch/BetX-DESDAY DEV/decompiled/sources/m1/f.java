package m1;

import O0.q;
import i1.A;
import i1.C0167a;
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
import p1.B;
import p1.C0313a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3561a;

    /* renamed from: b, reason: collision with root package name */
    public final C0167a f3562b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3563c;

    /* renamed from: d, reason: collision with root package name */
    public H.j f3564d;

    /* renamed from: e, reason: collision with root package name */
    public p f3565e;

    /* renamed from: f, reason: collision with root package name */
    public int f3566f;

    /* renamed from: g, reason: collision with root package name */
    public int f3567g;
    public int h;
    public A i;

    public f(n nVar, C0167a c0167a, j jVar) {
        X0.f.e(nVar, "connectionPool");
        X0.f.e(jVar, "call");
        this.f3561a = nVar;
        this.f3562b = c0167a;
        this.f3563c = jVar;
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
        l1.d dVar;
        Socket i5;
        while (!this.f3563c.f3583m) {
            m mVar = this.f3563c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3596j && b(mVar.f3590b.f2627a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3563c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3563c.h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        H.j jVar = this.f3564d;
                        if (jVar != null ? jVar.d() : true) {
                            continue;
                        } else {
                            p pVar = this.f3565e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        j1.b.c(i5);
                    }
                    X0.f.e(this.f3563c, "call");
                }
            }
            this.f3566f = 0;
            this.f3567g = 0;
            this.h = 0;
            if (this.f3561a.a(this.f3562b, this.f3563c, null, false)) {
                mVar = this.f3563c.h;
                X0.f.b(mVar);
                X0.f.e(this.f3563c, "call");
            } else {
                A a2 = this.i;
                try {
                    if (a2 != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.f3564d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f3565e;
                            if (pVar2 == null) {
                                C0167a c0167a = this.f3562b;
                                j jVar3 = this.f3563c;
                                pVar2 = new p(c0167a, jVar3.f3573a.f2772y, jVar3);
                                this.f3565e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3610a < ((List) pVar2.f3614e).size()) {
                                boolean z4 = pVar2.f3610a < ((List) pVar2.f3614e).size();
                                C0167a c0167a2 = (C0167a) pVar2.f3611b;
                                if (!z4) {
                                    throw new SocketException("No route to " + c0167a2.h.f2719d + "; exhausted proxy configurations: " + ((List) pVar2.f3614e));
                                }
                                List list2 = (List) pVar2.f3614e;
                                int i6 = pVar2.f3610a;
                                pVar2.f3610a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3615f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    i1.p pVar3 = c0167a2.h;
                                    str = pVar3.f2719d;
                                    i4 = pVar3.f2720e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    X0.f.d(address, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    X0.f.e(inetSocketAddress, "<this>");
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        X0.f.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        X0.f.d(str, "address.hostAddress");
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = j1.b.f2971a;
                                    X0.f.e(str, "<this>");
                                    X0.i iVar = j1.b.f2976f;
                                    iVar.getClass();
                                    if (((Pattern) iVar.f875b).matcher(str).matches()) {
                                        list = q1.d.M(InetAddress.getByName(str));
                                    } else {
                                        X0.f.e((i1.d) pVar2.f3613d, "call");
                                        c0167a2.f2637a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            X0.f.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new O0.e(allByName, false)) : q1.d.M(allByName[0]) : q.f695a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(c0167a2.f2637a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3615f.iterator();
                                while (it2.hasNext()) {
                                    A a3 = new A((C0167a) pVar2.f3611b, proxy, (InetSocketAddress) it2.next());
                                    l1.d dVar2 = (l1.d) pVar2.f3612c;
                                    synchronized (dVar2) {
                                        contains = ((LinkedHashSet) dVar2.f3527a).contains(a3);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3616g).add(a3);
                                    } else {
                                        arrayList.add(a3);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                O0.n.d0(arrayList, (ArrayList) pVar2.f3616g);
                                ((ArrayList) pVar2.f3616g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.f3564d = jVar4;
                            if (this.f3563c.f3583m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3561a.a(this.f3562b, this.f3563c, arrayList, false)) {
                                mVar = this.f3563c.h;
                                X0.f.b(mVar);
                                X0.f.e(this.f3563c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f240a;
                                jVar4.f240a = i7 + 1;
                                a2 = (A) arrayList.get(i7);
                                mVar = new m(this.f3561a, a2);
                                this.f3563c.f3585o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3563c);
                                this.f3563c.f3585o = null;
                                dVar = this.f3563c.f3573a.f2772y;
                                synchronized (dVar) {
                                    ((LinkedHashSet) dVar.f3527a).remove(a2);
                                }
                                if (this.f3561a.a(this.f3562b, this.f3563c, arrayList, true)) {
                                    m mVar2 = this.f3563c.h;
                                    X0.f.b(mVar2);
                                    this.i = a2;
                                    Socket socket = mVar.f3592d;
                                    X0.f.b(socket);
                                    j1.b.c(socket);
                                    X0.f.e(this.f3563c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3561a;
                                        nVar.getClass();
                                        byte[] bArr2 = j1.b.f2971a;
                                        nVar.f3607d.add(mVar);
                                        nVar.f3605b.c(nVar.f3606c, 0L);
                                        this.f3563c.b(mVar);
                                    }
                                    X0.f.e(this.f3563c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.f3564d;
                            X0.f.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f240a;
                            jVar5.f240a = i8 + 1;
                            a2 = (A) ((ArrayList) jVar5.f241b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3563c);
                    this.f3563c.f3585o = null;
                    dVar = this.f3563c.f3573a.f2772y;
                    synchronized (dVar) {
                    }
                } catch (Throwable th2) {
                    this.f3563c.f3585o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3561a, a2);
                this.f3563c.f3585o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(i1.p pVar) {
        X0.f.e(pVar, "url");
        i1.p pVar2 = this.f3562b.h;
        return pVar.f2720e == pVar2.f2720e && X0.f.a(pVar.f2719d, pVar2.f2719d);
    }

    public final void c(IOException iOException) {
        X0.f.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof B) && ((B) iOException).f3771a == 8) {
            this.f3566f++;
        } else if (iOException instanceof C0313a) {
            this.f3567g++;
        } else {
            this.h++;
        }
    }
}
