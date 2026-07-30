package w7;

import e6.r;
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
import l1.x;
import s7.l;
import s7.v;
import z7.a0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final j f9540a;

    /* renamed from: b, reason: collision with root package name */
    public final s7.a f9541b;

    /* renamed from: c, reason: collision with root package name */
    public final g f9542c;

    /* renamed from: d, reason: collision with root package name */
    public u5.a f9543d;

    /* renamed from: e, reason: collision with root package name */
    public e5.b f9544e;

    /* renamed from: f, reason: collision with root package name */
    public int f9545f;

    /* renamed from: g, reason: collision with root package name */
    public int f9546g;

    /* renamed from: h, reason: collision with root package name */
    public int f9547h;

    /* renamed from: i, reason: collision with root package name */
    public v f9548i;

    public d(j jVar, s7.a aVar, g gVar) {
        r6.k.f(jVar, "connectionPool");
        this.f9540a = jVar;
        this.f9541b = aVar;
        this.f9542c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i a(int i7, int i8, int i9, boolean z8, boolean z9) {
        ArrayList arrayList;
        String str;
        int i10;
        List list;
        boolean contains;
        x xVar;
        boolean z10;
        Socket h3;
        while (!this.f9542c.f9563r) {
            i iVar = this.f9542c.f9558m;
            if (iVar != null) {
                synchronized (iVar) {
                    try {
                        if (!iVar.f9575j && b(iVar.f9567b.f8698a.f8536h)) {
                            h3 = null;
                        }
                        h3 = this.f9542c.h();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f9542c.f9558m != null) {
                    if (h3 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z10 = z9;
                    if (iVar.i(z10)) {
                        return iVar;
                    }
                    iVar.k();
                    if (this.f9548i == null) {
                        u5.a aVar = this.f9543d;
                        if (aVar != null ? aVar.c() : true) {
                            continue;
                        } else {
                            e5.b bVar = this.f9544e;
                            if (!(bVar != null ? bVar.c() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else if (h3 != null) {
                    t7.b.d(h3);
                }
            }
            this.f9545f = 0;
            this.f9546g = 0;
            this.f9547h = 0;
            if (this.f9540a.a(this.f9541b, this.f9542c, null, false)) {
                iVar = this.f9542c.f9558m;
                r6.k.c(iVar);
            } else {
                v vVar = this.f9548i;
                try {
                    if (vVar != null) {
                        this.f9548i = null;
                    } else {
                        u5.a aVar2 = this.f9543d;
                        if (aVar2 == null || !aVar2.c()) {
                            e5.b bVar2 = this.f9544e;
                            if (bVar2 == null) {
                                s7.a aVar3 = this.f9541b;
                                g gVar = this.f9542c;
                                bVar2 = new e5.b(aVar3, gVar.f9551f.D, gVar);
                                this.f9544e = bVar2;
                            }
                            if (!bVar2.c()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (bVar2.f2754a < ((List) bVar2.f2757d).size()) {
                                s7.a aVar4 = (s7.a) bVar2.f2755b;
                                if (bVar2.f2754a >= ((List) bVar2.f2757d).size()) {
                                    throw new SocketException("No route to " + aVar4.f8536h.f8611d + "; exhausted proxy configurations: " + ((List) bVar2.f2757d));
                                }
                                List list2 = (List) bVar2.f2757d;
                                int i11 = bVar2.f2754a;
                                bVar2.f2754a = i11 + 1;
                                Proxy proxy = (Proxy) list2.get(i11);
                                ArrayList arrayList2 = new ArrayList();
                                bVar2.f2758e = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    l lVar = aVar4.f8536h;
                                    str = lVar.f8611d;
                                    i10 = lVar.f8612e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        r6.k.e(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        r6.k.e(str, "address.hostAddress");
                                    }
                                    i10 = inetSocketAddress.getPort();
                                }
                                if (1 > i10 || i10 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i10 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i10));
                                } else {
                                    byte[] bArr = t7.b.f8932a;
                                    r6.k.f(str, "<this>");
                                    z6.g gVar2 = t7.b.f8937f;
                                    gVar2.getClass();
                                    if (gVar2.f10131f.matcher(str).matches()) {
                                        list = t6.a.F(InetAddress.getByName(str));
                                    } else {
                                        aVar4.f8529a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            r6.k.e(allByName, "getAllByName(hostname)");
                                            List i02 = e6.k.i0(allByName);
                                            if (i02.isEmpty()) {
                                                throw new UnknownHostException(aVar4.f8529a + " returned no addresses for " + str);
                                            }
                                            list = i02;
                                        } catch (NullPointerException e9) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e9);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i10));
                                    }
                                }
                                Iterator it2 = bVar2.f2758e.iterator();
                                while (it2.hasNext()) {
                                    v vVar2 = new v((s7.a) bVar2.f2755b, proxy, (InetSocketAddress) it2.next());
                                    x xVar2 = (x) bVar2.f2756c;
                                    synchronized (xVar2) {
                                        contains = ((LinkedHashSet) xVar2.f5847g).contains(vVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) bVar2.f2759f).add(vVar2);
                                    } else {
                                        arrayList.add(vVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                r.c0((ArrayList) bVar2.f2759f, arrayList);
                                ((ArrayList) bVar2.f2759f).clear();
                            }
                            u5.a aVar5 = new u5.a();
                            aVar5.f9056a = arrayList;
                            this.f9543d = aVar5;
                            if (this.f9542c.f9563r) {
                                throw new IOException("Canceled");
                            }
                            if (this.f9540a.a(this.f9541b, this.f9542c, arrayList, false)) {
                                iVar = this.f9542c.f9558m;
                                r6.k.c(iVar);
                            } else {
                                if (!aVar5.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i12 = aVar5.f9057b;
                                aVar5.f9057b = i12 + 1;
                                vVar = (v) arrayList.get(i12);
                                i iVar2 = new i(this.f9540a, vVar);
                                this.f9542c.f9565t = iVar2;
                                iVar2.c(i7, i8, i9, z8, this.f9542c);
                                this.f9542c.f9565t = null;
                                xVar = this.f9542c.f9551f.D;
                                synchronized (xVar) {
                                    ((LinkedHashSet) xVar.f5847g).remove(vVar);
                                }
                                if (this.f9540a.a(this.f9541b, this.f9542c, arrayList, true)) {
                                    iVar = this.f9542c.f9558m;
                                    r6.k.c(iVar);
                                    this.f9548i = vVar;
                                    Socket socket = iVar2.f9569d;
                                    r6.k.c(socket);
                                    t7.b.d(socket);
                                } else {
                                    synchronized (iVar2) {
                                        j jVar = this.f9540a;
                                        jVar.getClass();
                                        byte[] bArr2 = t7.b.f8932a;
                                        jVar.f9586d.add(iVar2);
                                        jVar.f9584b.c(jVar.f9585c, 0L);
                                        this.f9542c.a(iVar2);
                                    }
                                    z10 = z9;
                                    iVar = iVar2;
                                    if (iVar.i(z10)) {
                                    }
                                }
                            }
                        } else {
                            u5.a aVar6 = this.f9543d;
                            r6.k.c(aVar6);
                            if (!aVar6.c()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList3 = aVar6.f9056a;
                            int i13 = aVar6.f9057b;
                            aVar6.f9057b = i13 + 1;
                            vVar = (v) arrayList3.get(i13);
                        }
                    }
                    iVar2.c(i7, i8, i9, z8, this.f9542c);
                    this.f9542c.f9565t = null;
                    xVar = this.f9542c.f9551f.D;
                    synchronized (xVar) {
                    }
                } catch (Throwable th2) {
                    this.f9542c.f9565t = null;
                    throw th2;
                }
                arrayList = null;
                i iVar22 = new i(this.f9540a, vVar);
                this.f9542c.f9565t = iVar22;
            }
            z10 = z9;
            if (iVar.i(z10)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(l lVar) {
        r6.k.f(lVar, "url");
        l lVar2 = this.f9541b.f8536h;
        return lVar.f8612e == lVar2.f8612e && r6.k.a(lVar.f8611d, lVar2.f8611d);
    }

    public final void c(IOException iOException) {
        r6.k.f(iOException, "e");
        this.f9548i = null;
        if ((iOException instanceof a0) && ((a0) iOException).f10132f == 8) {
            this.f9545f++;
        } else if (iOException instanceof z7.a) {
            this.f9546g++;
        } else {
            this.f9547h++;
        }
    }
}
