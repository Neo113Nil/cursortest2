package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zi0 {
    public final w62 a;
    public final k5 b;
    public final t62 c;
    public r5 d;
    public te e;
    public int f;
    public int g;
    public int h;
    public ac2 i;

    public zi0(w62 w62Var, k5 k5Var, t62 t62Var) {
        w62Var.getClass();
        this.a = w62Var;
        this.b = k5Var;
        this.c = t62Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v62 a(int i, int i2, int i3, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        List i5;
        at0 at0Var;
        boolean z3;
        Socket i6;
        while (!this.c.y) {
            v62 v62Var = this.c.t;
            if (v62Var != null) {
                synchronized (v62Var) {
                    try {
                        if (!v62Var.j) {
                            kz0 kz0Var = v62Var.b.a.h;
                            kz0Var.getClass();
                            kz0 kz0Var2 = this.b.h;
                            if (kz0Var.e == kz0Var2.e && Intrinsics.b(kz0Var.d, kz0Var2.d)) {
                                i6 = null;
                                Unit unit = Unit.a;
                            }
                        }
                        i6 = this.c.i();
                        Unit unit2 = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.t != null) {
                    if (i6 != null) {
                        lh.g("Check failed.");
                        return null;
                    }
                    z3 = z2;
                    if (v62Var.i(z3)) {
                        return v62Var;
                    }
                    v62Var.k();
                    if (this.i == null) {
                        r5 r5Var = this.d;
                        if (r5Var != null ? r5Var.g() : true) {
                            continue;
                        } else {
                            te teVar = this.e;
                            if (!(teVar != null ? teVar.d() : true)) {
                                dm0.j("exhausted all routes");
                                return null;
                            }
                        }
                    }
                } else if (i6 != null) {
                    n33.c(i6);
                }
            }
            this.f = 0;
            this.g = 0;
            this.h = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                v62Var = this.c.t;
                v62Var.getClass();
            } else {
                ac2 ac2Var = this.i;
                try {
                    if (ac2Var != null) {
                        this.i = null;
                    } else {
                        r5 r5Var2 = this.d;
                        if (r5Var2 == null || !r5Var2.g()) {
                            te teVar2 = this.e;
                            if (teVar2 == null) {
                                k5 k5Var = this.b;
                                at0 at0Var2 = this.c.m.K;
                                at0Var2.getClass();
                                teVar2 = new te();
                                teVar2.b = k5Var;
                                teVar2.c = at0Var2;
                                ah0 ah0Var = ah0.m;
                                teVar2.d = ah0Var;
                                teVar2.e = ah0Var;
                                teVar2.f = new ArrayList();
                                kz0 kz0Var3 = k5Var.h;
                                kz0Var3.getClass();
                                URI g = kz0Var3.g();
                                if (g.getHost() == null) {
                                    i5 = n33.i(Proxy.NO_PROXY);
                                } else {
                                    List<Proxy> select = k5Var.g.select(g);
                                    i5 = (select == null || select.isEmpty()) ? n33.i(Proxy.NO_PROXY) : n33.t(select);
                                }
                                teVar2.d = i5;
                                teVar2.a = 0;
                                this.e = teVar2;
                            }
                            if (!teVar2.d()) {
                                b71.f();
                                return null;
                            }
                            arrayList = new ArrayList();
                            while (teVar2.a < ((List) teVar2.d).size()) {
                                k5 k5Var2 = (k5) teVar2.b;
                                if (teVar2.a >= ((List) teVar2.d).size()) {
                                    throw new SocketException("No route to " + k5Var2.h.d + "; exhausted proxy configurations: " + ((List) teVar2.d));
                                }
                                List list2 = (List) teVar2.d;
                                int i7 = teVar2.a;
                                teVar2.a = i7 + 1;
                                Proxy proxy = (Proxy) list2.get(i7);
                                ArrayList arrayList2 = new ArrayList();
                                teVar2.e = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    kz0 kz0Var4 = k5Var2.h;
                                    str = kz0Var4.d;
                                    i4 = kz0Var4.e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        ch2.g(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                        return null;
                                    }
                                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                    InetAddress address2 = inetSocketAddress.getAddress();
                                    if (address2 == null) {
                                        str = inetSocketAddress.getHostName();
                                        str.getClass();
                                    } else {
                                        str = address2.getHostAddress();
                                        str.getClass();
                                    }
                                    i4 = inetSocketAddress.getPort();
                                }
                                if (1 > i4 || i4 >= 65536) {
                                    throw new SocketException("No route to " + str + ':' + i4 + "; port is out of range");
                                }
                                if (proxy.type() == Proxy.Type.SOCKS) {
                                    arrayList2.add(InetSocketAddress.createUnresolved(str, i4));
                                } else {
                                    byte[] bArr = n33.a;
                                    str.getClass();
                                    if (n33.e.a(str)) {
                                        list = pv.c(InetAddress.getByName(str));
                                    } else {
                                        k5Var2.a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            allByName.getClass();
                                            List y = oi.y(allByName);
                                            if (y.isEmpty()) {
                                                throw new UnknownHostException(k5Var2.a + " returned no addresses for " + str);
                                            }
                                            list = y;
                                        } catch (NullPointerException e) {
                                            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                            unknownHostException.initCause(e);
                                            throw unknownHostException;
                                        }
                                    }
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(new InetSocketAddress((InetAddress) it.next(), i4));
                                    }
                                }
                                Iterator it2 = ((List) teVar2.e).iterator();
                                while (it2.hasNext()) {
                                    ac2 ac2Var2 = new ac2((k5) teVar2.b, proxy, (InetSocketAddress) it2.next());
                                    at0 at0Var3 = (at0) teVar2.c;
                                    synchronized (at0Var3) {
                                        contains = ((LinkedHashSet) at0Var3.m).contains(ac2Var2);
                                    }
                                    if (contains) {
                                        ((ArrayList) teVar2.f).add(ac2Var2);
                                    } else {
                                        arrayList.add(ac2Var2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                vv.o((ArrayList) teVar2.f, arrayList);
                                ((ArrayList) teVar2.f).clear();
                            }
                            r5 r5Var3 = new r5();
                            r5Var3.b = arrayList;
                            this.d = r5Var3;
                            if (this.c.y) {
                                dm0.j("Canceled");
                                return null;
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                v62Var = this.c.t;
                                v62Var.getClass();
                            } else {
                                if (!r5Var3.g()) {
                                    b71.f();
                                    return null;
                                }
                                int i8 = r5Var3.a;
                                r5Var3.a = i8 + 1;
                                ac2Var = (ac2) arrayList.get(i8);
                                v62 v62Var2 = new v62(this.a, ac2Var);
                                this.c.A = v62Var2;
                                v62Var2.c(i, i2, i3, z, this.c);
                                this.c.A = null;
                                at0Var = this.c.m.K;
                                synchronized (at0Var) {
                                    ((LinkedHashSet) at0Var.m).remove(ac2Var);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    v62 v62Var3 = this.c.t;
                                    v62Var3.getClass();
                                    this.i = ac2Var;
                                    Socket socket = v62Var2.d;
                                    socket.getClass();
                                    n33.c(socket);
                                    v62Var = v62Var3;
                                } else {
                                    synchronized (v62Var2) {
                                        w62 w62Var = this.a;
                                        w62Var.getClass();
                                        byte[] bArr2 = n33.a;
                                        ((ConcurrentLinkedQueue) w62Var.e).add(v62Var2);
                                        ((nt2) w62Var.c).c((ty0) w62Var.d, 0L);
                                        this.c.b(v62Var2);
                                        Unit unit3 = Unit.a;
                                    }
                                    z3 = z2;
                                    v62Var = v62Var2;
                                    if (v62Var.i(z3)) {
                                    }
                                }
                            }
                        } else {
                            r5 r5Var4 = this.d;
                            r5Var4.getClass();
                            if (!r5Var4.g()) {
                                b71.f();
                                return null;
                            }
                            ArrayList arrayList3 = (ArrayList) r5Var4.b;
                            int i9 = r5Var4.a;
                            r5Var4.a = i9 + 1;
                            ac2Var = (ac2) arrayList3.get(i9);
                        }
                    }
                    v62Var2.c(i, i2, i3, z, this.c);
                    this.c.A = null;
                    at0Var = this.c.m.K;
                    synchronized (at0Var) {
                    }
                } catch (Throwable th2) {
                    this.c.A = null;
                    throw th2;
                }
                arrayList = null;
                v62 v62Var22 = new v62(this.a, ac2Var);
                this.c.A = v62Var22;
            }
            z3 = z2;
            if (v62Var.i(z3)) {
            }
        }
        dm0.j("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof ip2) && ((ip2) iOException).m == 8) {
            this.f++;
        } else if (iOException instanceof d10) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
