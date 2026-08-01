package x3;

import a4.e0;
import a4.f0;
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
import t3.v;
import x2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final m f3903a;

    /* renamed from: b, reason: collision with root package name */
    public final t3.a f3904b;

    /* renamed from: c, reason: collision with root package name */
    public final i f3905c;
    public e0 d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.material.datepicker.c f3906e;

    /* renamed from: f, reason: collision with root package name */
    public int f3907f;

    /* renamed from: g, reason: collision with root package name */
    public int f3908g;
    public int h;
    public v i;

    public e(m mVar, t3.a aVar, i iVar) {
        i3.d.e(mVar, "connectionPool");
        this.f3903a = mVar;
        this.f3904b = aVar;
        this.f3905c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x032f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l a(int i, int i4, int i5, boolean z4, boolean z5) {
        ArrayList arrayList;
        String str;
        int i6;
        List list;
        boolean contains;
        q3.a aVar;
        boolean z6;
        Socket i7;
        while (!this.f3905c.f3923r) {
            l lVar = this.f3905c.f3918m;
            if (lVar != null) {
                synchronized (lVar) {
                    try {
                        if (!lVar.f3934j && b(lVar.f3929b.f3533a.h)) {
                            i7 = null;
                        }
                        i7 = this.f3905c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f3905c.f3918m != null) {
                    if (i7 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z6 = z5;
                    if (lVar.i(z6)) {
                        return lVar;
                    }
                    lVar.k();
                    if (this.i == null) {
                        e0 e0Var = this.d;
                        if (e0Var != null ? e0Var.d() : true) {
                            continue;
                        } else {
                            com.google.android.material.datepicker.c cVar = this.f3906e;
                            if (!(cVar != null ? cVar.k() : true)) {
                                throw new IOException("exhausted all routes");
                            }
                        }
                    }
                } else if (i7 != null) {
                    u3.b.c(i7);
                }
            }
            this.f3907f = 0;
            this.f3908g = 0;
            this.h = 0;
            if (this.f3903a.a(this.f3904b, this.f3905c, null, false)) {
                lVar = this.f3905c.f3918m;
                i3.d.b(lVar);
            } else {
                v vVar = this.i;
                try {
                    if (vVar != null) {
                        this.i = null;
                    } else {
                        e0 e0Var2 = this.d;
                        if (e0Var2 == null || !e0Var2.d()) {
                            com.google.android.material.datepicker.c cVar2 = this.f3906e;
                            if (cVar2 == null) {
                                t3.a aVar2 = this.f3904b;
                                i iVar = this.f3905c;
                                cVar2 = new com.google.android.material.datepicker.c(aVar2, iVar.f3913f.D, iVar);
                                this.f3906e = cVar2;
                            }
                            if (!cVar2.k()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (cVar2.f1040a < ((List) cVar2.d).size()) {
                                t3.a aVar3 = (t3.a) cVar2.f1041b;
                                if (cVar2.f1040a >= ((List) cVar2.d).size()) {
                                    throw new SocketException("No route to " + aVar3.h.d + "; exhausted proxy configurations: " + ((List) cVar2.d));
                                }
                                List list2 = (List) cVar2.d;
                                int i8 = cVar2.f1040a;
                                cVar2.f1040a = i8 + 1;
                                Proxy proxy = (Proxy) list2.get(i8);
                                ArrayList arrayList2 = new ArrayList();
                                cVar2.f1043e = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    t3.k kVar = aVar3.h;
                                    str = kVar.d;
                                    i6 = kVar.f3458e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                                    }
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        i3.d.d(str, "hostName");
                                    } else {
                                        str = address2.getHostAddress();
                                        i3.d.d(str, "address.hostAddress");
                                    }
                                    i6 = inetSocketAddress.getPort();
                                }
                                if (1 > i6 || i6 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i6 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i6));
                                } else {
                                    byte[] bArr = u3.b.f3581a;
                                    i3.d.e(str, "<this>");
                                    i3.f fVar = u3.b.f3585f;
                                    fVar.getClass();
                                    if (((Pattern) fVar.f2074g).matcher(str).matches()) {
                                        list = s.a.s(InetAddress.getByName(str));
                                    } else {
                                        aVar3.f3394a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            i3.d.d(allByName, "getAllByName(hostname)");
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new x2.e(allByName, false)) : s.a.s(allByName[0]) : q.f3887f;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(aVar3.f3394a + " returned no addresses for " + str);
                                            }
                                            list = arrayList3;
                                        } catch (NullPointerException e4) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e4);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i6));
                                    }
                                }
                                Iterator it2 = cVar2.f1043e.iterator();
                                while (it2.hasNext()) {
                                    v vVar2 = new v((t3.a) cVar2.f1041b, proxy, (InetSocketAddress) it2.next());
                                    q3.a aVar4 = (q3.a) cVar2.f1042c;
                                    synchronized (aVar4) {
                                        contains = ((LinkedHashSet) aVar4.f3172a).contains(vVar2);
                                    }
                                    if (contains) {
                                        ((ArrayList) cVar2.f1044f).add(vVar2);
                                    } else {
                                        arrayList.add(vVar2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                x2.n.D(arrayList, (ArrayList) cVar2.f1044f);
                                ((ArrayList) cVar2.f1044f).clear();
                            }
                            e0 e0Var3 = new e0(arrayList, 4);
                            this.d = e0Var3;
                            if (this.f3905c.f3923r) {
                                throw new IOException("Canceled");
                            }
                            if (this.f3903a.a(this.f3904b, this.f3905c, arrayList, false)) {
                                lVar = this.f3905c.f3918m;
                                i3.d.b(lVar);
                            } else {
                                if (!e0Var3.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i9 = e0Var3.f167a;
                                e0Var3.f167a = i9 + 1;
                                vVar = (v) arrayList.get(i9);
                                l lVar2 = new l(this.f3903a, vVar);
                                this.f3905c.f3925t = lVar2;
                                lVar2.c(i, i4, i5, z4, this.f3905c);
                                this.f3905c.f3925t = null;
                                aVar = this.f3905c.f3913f.D;
                                synchronized (aVar) {
                                    ((LinkedHashSet) aVar.f3172a).remove(vVar);
                                }
                                if (this.f3903a.a(this.f3904b, this.f3905c, arrayList, true)) {
                                    lVar = this.f3905c.f3918m;
                                    i3.d.b(lVar);
                                    this.i = vVar;
                                    Socket socket = lVar2.d;
                                    i3.d.b(socket);
                                    u3.b.c(socket);
                                } else {
                                    synchronized (lVar2) {
                                        m mVar = this.f3903a;
                                        mVar.getClass();
                                        byte[] bArr2 = u3.b.f3581a;
                                        mVar.d.add(lVar2);
                                        mVar.f3943b.c(mVar.f3944c, 0L);
                                        this.f3905c.b(lVar2);
                                    }
                                    z6 = z5;
                                    lVar = lVar2;
                                    if (lVar.i(z6)) {
                                    }
                                }
                            }
                        } else {
                            e0 e0Var4 = this.d;
                            i3.d.b(e0Var4);
                            if (!e0Var4.d()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList4 = (ArrayList) e0Var4.f168b;
                            int i10 = e0Var4.f167a;
                            e0Var4.f167a = i10 + 1;
                            vVar = (v) arrayList4.get(i10);
                        }
                    }
                    lVar2.c(i, i4, i5, z4, this.f3905c);
                    this.f3905c.f3925t = null;
                    aVar = this.f3905c.f3913f.D;
                    synchronized (aVar) {
                    }
                } catch (Throwable th2) {
                    this.f3905c.f3925t = null;
                    throw th2;
                }
                arrayList = null;
                l lVar22 = new l(this.f3903a, vVar);
                this.f3905c.f3925t = lVar22;
            }
            z6 = z5;
            if (lVar.i(z6)) {
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(t3.k kVar) {
        i3.d.e(kVar, "url");
        t3.k kVar2 = this.f3904b.h;
        return kVar.f3458e == kVar2.f3458e && i3.d.a(kVar.d, kVar2.d);
    }

    public final void c(IOException iOException) {
        i3.d.e(iOException, "e");
        this.i = null;
        if ((iOException instanceof f0) && ((f0) iOException).f171f == 8) {
            this.f3907f++;
        } else if (iOException instanceof a4.a) {
            this.f3908g++;
        } else {
            this.h++;
        }
    }
}
