package K3;

import E.AbstractC0005f;
import E1.P;
import G3.A;
import G3.C0050a;
import G3.p;
import N3.C0077a;
import N3.E;
import N3.EnumC0078b;
import T.G;
import W.J;
import a.AbstractC0124a;
import d3.o;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import m0.C1288a;
import m0.C1289b;
import v2.f0;
import w3.C1509f;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f1550a;

    /* renamed from: b, reason: collision with root package name */
    public int f1551b;

    /* renamed from: c, reason: collision with root package name */
    public int f1552c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1553d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1554e;

    /* renamed from: f, reason: collision with root package name */
    public final Cloneable f1555f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1556g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1557h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1558i;

    public f(l connectionPool, C0050a c0050a, i iVar) {
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        this.f1553d = connectionPool;
        this.f1554e = c0050a;
        this.f1555f = iVar;
    }

    public static String b(String str, int i4, int i5, int i6) {
        String str2 = J.f3263a;
        Locale locale = Locale.US;
        return i4 + " " + str + "/" + i5 + "/" + i6;
    }

    public C1289b a() {
        String b4;
        C1288a a3;
        HashMap hashMap = (HashMap) this.f1555f;
        try {
            if (hashMap.containsKey("rtpmap")) {
                String str = (String) hashMap.get("rtpmap");
                String str2 = J.f3263a;
                a3 = C1288a.a(str);
            } else {
                int i4 = this.f1551b;
                AbstractC0124a.h(i4 < 96);
                if (i4 == 0) {
                    b4 = b("PCMU", 0, 8000, 1);
                } else if (i4 == 8) {
                    b4 = b("PCMA", 8, 8000, 1);
                } else if (i4 == 10) {
                    b4 = b("L16", 10, 44100, 2);
                } else {
                    if (i4 != 11) {
                        throw new IllegalStateException(AbstractC0005f.j(i4, "Unsupported static paylod type "));
                    }
                    b4 = b("L16", 11, 44100, 1);
                }
                a3 = C1288a.a(b4);
            }
            return new C1289b(this, f0.a(hashMap), a3);
        } catch (G e4) {
            throw new IllegalStateException(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0355 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k c(int i4, int i5, int i6, boolean z, boolean z4) {
        ArrayList arrayList;
        String hostName;
        int i7;
        List list;
        boolean contains;
        t1.h hVar;
        boolean z5;
        Socket h2;
        while (!((i) this.f1555f).f1573m) {
            k kVar = ((i) this.f1555f).f1568h;
            if (kVar != null) {
                synchronized (kVar) {
                    try {
                        if (!kVar.f1583j && d(kVar.f1575b.f846a.f863h)) {
                            h2 = null;
                        }
                        h2 = ((i) this.f1555f).h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (((i) this.f1555f).f1568h != null) {
                    if (h2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z5 = z4;
                    if (kVar.i(z5)) {
                        return kVar;
                    }
                    kVar.k();
                    if (((A) this.f1558i) == null) {
                        P p2 = (P) this.f1556g;
                        if (p2 == null ? true : p2.e()) {
                            continue;
                        } else {
                            n nVar = (n) this.f1557h;
                            if (!(nVar != null ? nVar.d() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else if (h2 != null) {
                    H3.b.d(h2);
                }
            }
            this.f1550a = 0;
            this.f1551b = 0;
            this.f1552c = 0;
            if (((l) this.f1553d).a((C0050a) this.f1554e, (i) this.f1555f, null, false)) {
                kVar = ((i) this.f1555f).f1568h;
                kotlin.jvm.internal.i.b(kVar);
            } else {
                A a3 = (A) this.f1558i;
                try {
                    if (a3 != null) {
                        this.f1558i = null;
                    } else {
                        P p4 = (P) this.f1556g;
                        if (p4 == null || !p4.e()) {
                            n nVar2 = (n) this.f1557h;
                            if (nVar2 == null) {
                                C0050a c0050a = (C0050a) this.f1554e;
                                i iVar = (i) this.f1555f;
                                nVar2 = new n(c0050a, iVar.f1561a.f998y, iVar);
                                this.f1557h = nVar2;
                            }
                            if (!nVar2.d()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (nVar2.f1596b < ((List) nVar2.f1599e).size()) {
                                C0050a c0050a2 = (C0050a) nVar2.f1597c;
                                if (nVar2.f1596b >= ((List) nVar2.f1599e).size()) {
                                    throw new SocketException("No route to " + c0050a2.f863h.f950d + "; exhausted proxy configurations: " + ((List) nVar2.f1599e));
                                }
                                List list2 = (List) nVar2.f1599e;
                                int i8 = nVar2.f1596b;
                                nVar2.f1596b = i8 + 1;
                                Proxy proxy = (Proxy) list2.get(i8);
                                ArrayList arrayList2 = new ArrayList();
                                nVar2.f1595a = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    p pVar = c0050a2.f863h;
                                    hostName = pVar.f950d;
                                    i7 = pVar.f951e;
                                } else {
                                    SocketAddress proxyAddress = proxy.address();
                                    if (!(proxyAddress instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(kotlin.jvm.internal.i.h(proxyAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ").toString());
                                    }
                                    kotlin.jvm.internal.i.d(proxyAddress, "proxyAddress");
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                                    kotlin.jvm.internal.i.e(inetSocketAddress, "<this>");
                                    InetAddress address = inetSocketAddress.getAddress();
                                    if (address == null) {
                                        hostName = inetSocketAddress.getHostName();
                                        kotlin.jvm.internal.i.d(hostName, "hostName");
                                    } else {
                                        hostName = address.getHostAddress();
                                        kotlin.jvm.internal.i.d(hostName, "address.hostAddress");
                                    }
                                    i7 = inetSocketAddress.getPort();
                                }
                                if (1 > i7 || i7 >= 65536) {
                                    throw new SocketException("No route to " + hostName + ':' + i7 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(hostName, i7));
                                } else {
                                    byte[] bArr = H3.b.f1103a;
                                    kotlin.jvm.internal.i.e(hostName, "<this>");
                                    C1509f c1509f = H3.b.f1107e;
                                    c1509f.getClass();
                                    if (c1509f.f15950a.matcher(hostName).matches()) {
                                        list = AbstractC0124a.H(InetAddress.getByName(hostName));
                                    } else {
                                        c0050a2.f856a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(hostName);
                                            kotlin.jvm.internal.i.d(allByName, "getAllByName(hostname)");
                                            List Y2 = d3.g.Y(allByName);
                                            if (Y2.isEmpty()) {
                                                throw new UnknownHostException(c0050a2.f856a + " returned no addresses for " + hostName);
                                            }
                                            list = Y2;
                                        } catch (NullPointerException e4) {
                                            UnknownHostException unknownHostException = new UnknownHostException(kotlin.jvm.internal.i.h(hostName, "Broken system behaviour for dns lookup of "));
                                            unknownHostException.initCause(e4);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i7));
                                    }
                                }
                                Iterator it2 = nVar2.f1595a.iterator();
                                while (it2.hasNext()) {
                                    A a4 = new A((C0050a) nVar2.f1597c, proxy, (InetSocketAddress) it2.next());
                                    t1.h hVar2 = (t1.h) nVar2.f1598d;
                                    synchronized (hVar2) {
                                        contains = ((LinkedHashSet) hVar2.f15398b).contains(a4);
                                    }
                                    if (contains) {
                                        ((ArrayList) nVar2.f1600f).add(a4);
                                    } else {
                                        arrayList.add(a4);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                o.Z(arrayList, (ArrayList) nVar2.f1600f);
                                ((ArrayList) nVar2.f1600f).clear();
                            }
                            P p5 = new P(arrayList);
                            this.f1556g = p5;
                            if (((i) this.f1555f).f1573m) {
                                throw new IOException("Canceled");
                            }
                            if (((l) this.f1553d).a((C0050a) this.f1554e, (i) this.f1555f, arrayList, false)) {
                                kVar = ((i) this.f1555f).f1568h;
                                kotlin.jvm.internal.i.b(kVar);
                            } else {
                                if (!p5.e()) {
                                    throw new NoSuchElementException();
                                }
                                int i9 = p5.f518b;
                                p5.f518b = i9 + 1;
                                a3 = (A) arrayList.get(i9);
                                k kVar2 = new k((l) this.f1553d, a3);
                                ((i) this.f1555f).o = kVar2;
                                kVar2.c(i4, i5, i6, z, (i) this.f1555f);
                                ((i) this.f1555f).o = null;
                                hVar = ((i) this.f1555f).f1561a.f998y;
                                synchronized (hVar) {
                                    ((LinkedHashSet) hVar.f15398b).remove(a3);
                                }
                                if (((l) this.f1553d).a((C0050a) this.f1554e, (i) this.f1555f, arrayList, true)) {
                                    kVar = ((i) this.f1555f).f1568h;
                                    kotlin.jvm.internal.i.b(kVar);
                                    this.f1558i = a3;
                                    Socket socket = kVar2.f1577d;
                                    kotlin.jvm.internal.i.b(socket);
                                    H3.b.d(socket);
                                } else {
                                    synchronized (kVar2) {
                                        l lVar = (l) this.f1553d;
                                        lVar.getClass();
                                        byte[] bArr2 = H3.b.f1103a;
                                        lVar.f1592d.add(kVar2);
                                        lVar.f1590b.c(lVar.f1591c, 0L);
                                        ((i) this.f1555f).a(kVar2);
                                    }
                                    z5 = z4;
                                    kVar = kVar2;
                                    if (kVar.i(z5)) {
                                    }
                                }
                            }
                        } else {
                            P p6 = (P) this.f1556g;
                            kotlin.jvm.internal.i.b(p6);
                            if (!p6.e()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList3 = (ArrayList) p6.f519c;
                            int i10 = p6.f518b;
                            p6.f518b = i10 + 1;
                            a3 = (A) arrayList3.get(i10);
                        }
                    }
                    kVar2.c(i4, i5, i6, z, (i) this.f1555f);
                    ((i) this.f1555f).o = null;
                    hVar = ((i) this.f1555f).f1561a.f998y;
                    synchronized (hVar) {
                    }
                } catch (Throwable th2) {
                    ((i) this.f1555f).o = null;
                    throw th2;
                }
                arrayList = null;
                k kVar22 = new k((l) this.f1553d, a3);
                ((i) this.f1555f).o = kVar22;
            }
            z5 = z4;
            if (kVar.i(z5)) {
            }
        }
        throw new IOException("Canceled");
    }

    public boolean d(p url) {
        kotlin.jvm.internal.i.e(url, "url");
        p pVar = ((C0050a) this.f1554e).f863h;
        return url.f951e == pVar.f951e && kotlin.jvm.internal.i.a(url.f950d, pVar.f950d);
    }

    public void e(IOException e4) {
        kotlin.jvm.internal.i.e(e4, "e");
        this.f1558i = null;
        if ((e4 instanceof E) && ((E) e4).f1819a == EnumC0078b.REFUSED_STREAM) {
            this.f1550a++;
        } else if (e4 instanceof C0077a) {
            this.f1551b++;
        } else {
            this.f1552c++;
        }
    }

    public f(int i4, int i5, String str, String str2) {
        this.f1553d = str;
        this.f1550a = i4;
        this.f1554e = str2;
        this.f1551b = i5;
        this.f1555f = new HashMap();
        this.f1552c = -1;
    }
}
