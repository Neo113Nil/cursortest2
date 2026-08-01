package m1;

import O0.q;
import i1.A;
import i1.C0166a;
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
import l.C0274n;
import p1.B;
import p1.C0311a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n f3557a;

    /* renamed from: b, reason: collision with root package name */
    public final C0166a f3558b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3559c;

    /* renamed from: d, reason: collision with root package name */
    public H.j f3560d;

    /* renamed from: e, reason: collision with root package name */
    public p f3561e;

    /* renamed from: f, reason: collision with root package name */
    public int f3562f;

    /* renamed from: g, reason: collision with root package name */
    public int f3563g;
    public int h;
    public A i;

    public f(n nVar, C0166a c0166a, j jVar) {
        X0.f.e(nVar, "connectionPool");
        X0.f.e(jVar, "call");
        this.f3557a = nVar;
        this.f3558b = c0166a;
        this.f3559c = jVar;
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
        C0274n c0274n;
        Socket i5;
        while (!this.f3559c.f3579m) {
            m mVar = this.f3559c.h;
            if (mVar != null) {
                synchronized (mVar) {
                    try {
                        if (!mVar.f3592j && b(mVar.f3586b.f2623a.h)) {
                            i5 = null;
                        }
                        i5 = this.f3559c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3559c.h != null) {
                    if (i5 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!mVar.i(z3)) {
                        return mVar;
                    }
                    mVar.k();
                    if (this.i == null) {
                        H.j jVar = this.f3560d;
                        if (jVar != null ? jVar.d() : true) {
                            continue;
                        } else {
                            p pVar = this.f3561e;
                            if (!(pVar != null ? pVar.i() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else {
                    if (i5 != null) {
                        j1.b.c(i5);
                    }
                    X0.f.e(this.f3559c, "call");
                }
            }
            this.f3562f = 0;
            this.f3563g = 0;
            this.h = 0;
            if (this.f3557a.a(this.f3558b, this.f3559c, null, false)) {
                mVar = this.f3559c.h;
                X0.f.b(mVar);
                X0.f.e(this.f3559c, "call");
            } else {
                A a2 = this.i;
                try {
                    if (a2 != null) {
                        this.i = null;
                    } else {
                        H.j jVar2 = this.f3560d;
                        if (jVar2 == null || !jVar2.d()) {
                            p pVar2 = this.f3561e;
                            if (pVar2 == null) {
                                C0166a c0166a = this.f3558b;
                                j jVar3 = this.f3559c;
                                pVar2 = new p(c0166a, jVar3.f3569a.f2768y, jVar3);
                                this.f3561e = pVar2;
                            }
                            if (!pVar2.i()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (pVar2.f3606a < ((List) pVar2.f3610e).size()) {
                                boolean z4 = pVar2.f3606a < ((List) pVar2.f3610e).size();
                                C0166a c0166a2 = (C0166a) pVar2.f3607b;
                                if (!z4) {
                                    throw new SocketException("No route to " + c0166a2.h.f2715d + "; exhausted proxy configurations: " + ((List) pVar2.f3610e));
                                }
                                List list2 = (List) pVar2.f3610e;
                                int i6 = pVar2.f3606a;
                                pVar2.f3606a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                pVar2.f3611f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    i1.p pVar3 = c0166a2.h;
                                    str = pVar3.f2715d;
                                    i4 = pVar3.f2716e;
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
                                    byte[] bArr = j1.b.f2967a;
                                    X0.f.e(str, "<this>");
                                    X0.i iVar = j1.b.f2972f;
                                    iVar.getClass();
                                    if (((Pattern) iVar.f874b).matcher(str).matches()) {
                                        list = q1.d.M(InetAddress.getByName(str));
                                    } else {
                                        X0.f.e((i1.d) pVar2.f3609d, "call");
                                        c0166a2.f2633a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            X0.f.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new O0.e(allByName, false)) : q1.d.M(allByName[0]) : q.f694a;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(c0166a2.f2633a + " returned no addresses for " + str);
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
                                Iterator it2 = pVar2.f3611f.iterator();
                                while (it2.hasNext()) {
                                    A a3 = new A((C0166a) pVar2.f3607b, proxy, (InetSocketAddress) it2.next());
                                    C0274n c0274n2 = (C0274n) pVar2.f3608c;
                                    synchronized (c0274n2) {
                                        contains = ((LinkedHashSet) c0274n2.f3416a).contains(a3);
                                    }
                                    if (contains) {
                                        ((ArrayList) pVar2.f3612g).add(a3);
                                    } else {
                                        arrayList.add(a3);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                O0.n.e0(arrayList, (ArrayList) pVar2.f3612g);
                                ((ArrayList) pVar2.f3612g).clear();
                            }
                            H.j jVar4 = new H.j(arrayList);
                            this.f3560d = jVar4;
                            if (this.f3559c.f3579m) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3557a.a(this.f3558b, this.f3559c, arrayList, false)) {
                                mVar = this.f3559c.h;
                                X0.f.b(mVar);
                                X0.f.e(this.f3559c, "call");
                            } else {
                                if (!jVar4.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = jVar4.f241a;
                                jVar4.f241a = i7 + 1;
                                a2 = (A) arrayList.get(i7);
                                mVar = new m(this.f3557a, a2);
                                this.f3559c.f3581o = mVar;
                                mVar.c(i, i2, i3, z2, this.f3559c);
                                this.f3559c.f3581o = null;
                                c0274n = this.f3559c.f3569a.f2768y;
                                synchronized (c0274n) {
                                    ((LinkedHashSet) c0274n.f3416a).remove(a2);
                                }
                                if (this.f3557a.a(this.f3558b, this.f3559c, arrayList, true)) {
                                    m mVar2 = this.f3559c.h;
                                    X0.f.b(mVar2);
                                    this.i = a2;
                                    Socket socket = mVar.f3588d;
                                    X0.f.b(socket);
                                    j1.b.c(socket);
                                    X0.f.e(this.f3559c, "call");
                                    mVar = mVar2;
                                } else {
                                    synchronized (mVar) {
                                        n nVar = this.f3557a;
                                        nVar.getClass();
                                        byte[] bArr2 = j1.b.f2967a;
                                        nVar.f3603d.add(mVar);
                                        nVar.f3601b.c(nVar.f3602c, 0L);
                                        this.f3559c.b(mVar);
                                    }
                                    X0.f.e(this.f3559c, "call");
                                }
                            }
                        } else {
                            H.j jVar5 = this.f3560d;
                            X0.f.b(jVar5);
                            if (!jVar5.d()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = jVar5.f241a;
                            jVar5.f241a = i8 + 1;
                            a2 = (A) ((ArrayList) jVar5.f242b).get(i8);
                        }
                    }
                    mVar.c(i, i2, i3, z2, this.f3559c);
                    this.f3559c.f3581o = null;
                    c0274n = this.f3559c.f3569a.f2768y;
                    synchronized (c0274n) {
                    }
                } catch (Throwable th2) {
                    this.f3559c.f3581o = null;
                    throw th2;
                }
                arrayList = null;
                mVar = new m(this.f3557a, a2);
                this.f3559c.f3581o = mVar;
            }
            if (!mVar.i(z3)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(i1.p pVar) {
        X0.f.e(pVar, "url");
        i1.p pVar2 = this.f3558b.h;
        return pVar.f2716e == pVar2.f2716e && X0.f.a(pVar.f2715d, pVar2.f2715d);
    }

    public final void c(IOException iOException) {
        X0.f.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof B) && ((B) iOException).f3767a == 8) {
            this.f3562f++;
        } else if (iOException instanceof C0311a) {
            this.f3563g++;
        } else {
            this.h++;
        }
    }
}
