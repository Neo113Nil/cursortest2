package defpackage;

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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class tn {
    public final r70 a;
    public final n2 b;
    public final n70 c;
    public u2 d;
    public f2 e;
    public int f;
    public int g;
    public int h;
    public ya0 i;

    public tn(r70 r70Var, n2 n2Var, n70 n70Var) {
        r70Var.getClass();
        this.a = r70Var;
        this.b = n2Var;
        this.c = n70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x033c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q70 a(int i, int i2, int i3, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        kz kzVar;
        boolean z3;
        Socket i5;
        while (!this.c.r) {
            q70 q70Var = this.c.m;
            if (q70Var != null) {
                synchronized (q70Var) {
                    try {
                        if (!q70Var.j) {
                            ou ouVar = q70Var.b.a.h;
                            ouVar.getClass();
                            ou ouVar2 = this.b.h;
                            if (ouVar.e == ouVar2.e && mv.c(ouVar.d, ouVar2.d)) {
                                i5 = null;
                            }
                        }
                        i5 = this.c.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.c.m != null) {
                    if (i5 != null) {
                        s9.u("Check failed.");
                        return null;
                    }
                    z3 = z2;
                    if (q70Var.i(z3)) {
                        return q70Var;
                    }
                    q70Var.k();
                    if (this.i == null) {
                        u2 u2Var = this.d;
                        if (u2Var != null ? u2Var.d() : true) {
                            continue;
                        } else {
                            f2 f2Var = this.e;
                            if (!(f2Var != null ? f2Var.j() : true)) {
                                s9.w("exhausted all routes");
                                return null;
                            }
                        }
                    }
                } else if (i5 != null) {
                    zk0.c(i5);
                }
            }
            this.f = 0;
            this.g = 0;
            this.h = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                q70Var = this.c.m;
                q70Var.getClass();
            } else {
                ya0 ya0Var = this.i;
                try {
                    if (ya0Var != null) {
                        this.i = null;
                    } else {
                        u2 u2Var2 = this.d;
                        if (u2Var2 == null || !u2Var2.d()) {
                            f2 f2Var2 = this.e;
                            if (f2Var2 == null) {
                                n2 n2Var = this.b;
                                n70 n70Var = this.c;
                                f2Var2 = new f2(n2Var, n70Var.f.D, n70Var);
                                this.e = f2Var2;
                            }
                            if (!f2Var2.j()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (f2Var2.a < ((List) f2Var2.e).size()) {
                                n2 n2Var2 = (n2) f2Var2.b;
                                if (f2Var2.a >= ((List) f2Var2.e).size()) {
                                    throw new SocketException("No route to " + n2Var2.h.d + "; exhausted proxy configurations: " + ((List) f2Var2.e));
                                }
                                List list2 = (List) f2Var2.e;
                                int i6 = f2Var2.a;
                                f2Var2.a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                f2Var2.f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    ou ouVar3 = n2Var2.h;
                                    str = ouVar3.d;
                                    i4 = ouVar3.e;
                                } else {
                                    SocketAddress address = proxy.address();
                                    if (!(address instanceof InetSocketAddress)) {
                                        throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
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
                                    byte[] bArr = zk0.a;
                                    str.getClass();
                                    d90 d90Var = zk0.f;
                                    d90Var.getClass();
                                    if (d90Var.f.matcher(str).matches()) {
                                        list = bi.K(InetAddress.getByName(str));
                                    } else {
                                        n2Var2.a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            allByName.getClass();
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new y6(allByName, false)) : bi.K(allByName[0]) : wm.f;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(n2Var2.a + " returned no addresses for " + str);
                                            }
                                            list = arrayList3;
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
                                Iterator it2 = ((List) f2Var2.f).iterator();
                                while (it2.hasNext()) {
                                    ya0 ya0Var2 = new ya0((n2) f2Var2.b, proxy, (InetSocketAddress) it2.next());
                                    kz kzVar2 = (kz) f2Var2.d;
                                    synchronized (kzVar2) {
                                        contains = ((LinkedHashSet) kzVar2.f).contains(ya0Var2);
                                    }
                                    if (contains) {
                                        ((ArrayList) f2Var2.c).add(ya0Var2);
                                    } else {
                                        arrayList.add(ya0Var2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                ad.h0(arrayList, (ArrayList) f2Var2.c);
                                ((ArrayList) f2Var2.c).clear();
                            }
                            u2 u2Var3 = new u2(arrayList, 4);
                            this.d = u2Var3;
                            if (this.c.r) {
                                s9.w("Canceled");
                                return null;
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                q70Var = this.c.m;
                                q70Var.getClass();
                            } else {
                                if (!u2Var3.d()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = u2Var3.f;
                                u2Var3.f = i7 + 1;
                                ya0Var = (ya0) arrayList.get(i7);
                                q70 q70Var2 = new q70(this.a, ya0Var);
                                this.c.t = q70Var2;
                                q70Var2.c(i, i2, i3, z, this.c);
                                this.c.t = null;
                                kzVar = this.c.f.D;
                                synchronized (kzVar) {
                                    ((LinkedHashSet) kzVar.f).remove(ya0Var);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    q70 q70Var3 = this.c.m;
                                    q70Var3.getClass();
                                    this.i = ya0Var;
                                    Socket socket = q70Var2.d;
                                    socket.getClass();
                                    zk0.c(socket);
                                    q70Var = q70Var3;
                                } else {
                                    synchronized (q70Var2) {
                                        r70 r70Var = this.a;
                                        r70Var.getClass();
                                        byte[] bArr2 = zk0.a;
                                        r70Var.d.add(q70Var2);
                                        r70Var.b.c(r70Var.c, 0L);
                                        this.c.b(q70Var2);
                                    }
                                    z3 = z2;
                                    q70Var = q70Var2;
                                    if (q70Var.i(z3)) {
                                    }
                                }
                            }
                        } else {
                            u2 u2Var4 = this.d;
                            u2Var4.getClass();
                            if (!u2Var4.d()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList4 = (ArrayList) u2Var4.g;
                            int i8 = u2Var4.f;
                            u2Var4.f = i8 + 1;
                            ya0Var = (ya0) arrayList4.get(i8);
                        }
                    }
                    q70Var2.c(i, i2, i3, z, this.c);
                    this.c.t = null;
                    kzVar = this.c.f.D;
                    synchronized (kzVar) {
                    }
                } catch (Throwable th2) {
                    this.c.t = null;
                    throw th2;
                }
                arrayList = null;
                q70 q70Var22 = new q70(this.a, ya0Var);
                this.c.t = q70Var22;
            }
            z3 = z2;
            if (q70Var.i(z3)) {
            }
        }
        s9.w("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof lf0) && ((lf0) iOException).f == kn.REFUSED_STREAM) {
            this.f++;
        } else if (iOException instanceof le) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
