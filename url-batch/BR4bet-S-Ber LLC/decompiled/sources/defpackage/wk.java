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
import java.util.regex.Pattern;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class wk {
    public final m10 a;
    public final e2 b;
    public final i10 c;
    public l2 d;
    public y1 e;
    public int f;
    public int g;
    public int h;
    public w30 i;

    public wk(m10 m10Var, e2 e2Var, i10 i10Var) {
        m10Var.getClass();
        this.a = m10Var;
        this.b = e2Var;
        this.c = i10Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x033e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l10 a(int i, int i2, int i3, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        pw pwVar;
        boolean z3;
        Socket i5;
        while (!this.c.r) {
            l10 l10Var = this.c.m;
            if (l10Var != null) {
                synchronized (l10Var) {
                    try {
                        if (!l10Var.j) {
                            uq uqVar = l10Var.b.a.h;
                            uqVar.getClass();
                            uq uqVar2 = this.b.h;
                            if (uqVar.e == uqVar2.e && kr.b(uqVar.d, uqVar2.d)) {
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
                        g9.s("Check failed.");
                        return null;
                    }
                    z3 = z2;
                    if (l10Var.i(z3)) {
                        return l10Var;
                    }
                    l10Var.k();
                    if (this.i == null) {
                        l2 l2Var = this.d;
                        if (l2Var != null ? l2Var.c() : true) {
                            continue;
                        } else {
                            y1 y1Var = this.e;
                            if (!(y1Var != null ? y1Var.j() : true)) {
                                g9.w("exhausted all routes");
                                return null;
                            }
                        }
                    }
                } else if (i5 != null) {
                    cb0.c(i5);
                }
            }
            this.f = 0;
            this.g = 0;
            this.h = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                l10Var = this.c.m;
                l10Var.getClass();
            } else {
                w30 w30Var = this.i;
                try {
                    if (w30Var != null) {
                        this.i = null;
                    } else {
                        l2 l2Var2 = this.d;
                        if (l2Var2 == null || !l2Var2.c()) {
                            y1 y1Var2 = this.e;
                            if (y1Var2 == null) {
                                e2 e2Var = this.b;
                                i10 i10Var = this.c;
                                y1Var2 = new y1(e2Var, i10Var.f.D, i10Var);
                                this.e = y1Var2;
                            }
                            if (!y1Var2.j()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (y1Var2.a < ((List) y1Var2.e).size()) {
                                e2 e2Var2 = (e2) y1Var2.b;
                                if (y1Var2.a >= ((List) y1Var2.e).size()) {
                                    throw new SocketException("No route to " + e2Var2.h.d + "; exhausted proxy configurations: " + ((List) y1Var2.e));
                                }
                                List list2 = (List) y1Var2.e;
                                int i6 = y1Var2.a;
                                y1Var2.a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                y1Var2.f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    uq uqVar3 = e2Var2.h;
                                    str = uqVar3.d;
                                    i4 = uqVar3.e;
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
                                    byte[] bArr = cb0.a;
                                    str.getClass();
                                    t20 t20Var = cb0.f;
                                    t20Var.getClass();
                                    if (((Pattern) t20Var.g).matcher(str).matches()) {
                                        list = kr.J(InetAddress.getByName(str));
                                    } else {
                                        e2Var2.a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            allByName.getClass();
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new p6(allByName, false)) : kr.J(allByName[0]) : ik.f;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(e2Var2.a + " returned no addresses for " + str);
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
                                Iterator it2 = ((List) y1Var2.f).iterator();
                                while (it2.hasNext()) {
                                    w30 w30Var2 = new w30((e2) y1Var2.b, proxy, (InetSocketAddress) it2.next());
                                    pw pwVar2 = (pw) y1Var2.d;
                                    synchronized (pwVar2) {
                                        contains = ((LinkedHashSet) pwVar2.f).contains(w30Var2);
                                    }
                                    if (contains) {
                                        ((ArrayList) y1Var2.c).add(w30Var2);
                                    } else {
                                        arrayList.add(w30Var2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                cc.l0(arrayList, (ArrayList) y1Var2.c);
                                ((ArrayList) y1Var2.c).clear();
                            }
                            l2 l2Var3 = new l2(arrayList, 3);
                            this.d = l2Var3;
                            if (this.c.r) {
                                g9.w("Canceled");
                                return null;
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                l10Var = this.c.m;
                                l10Var.getClass();
                            } else {
                                if (!l2Var3.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = l2Var3.f;
                                l2Var3.f = i7 + 1;
                                w30Var = (w30) arrayList.get(i7);
                                l10 l10Var2 = new l10(this.a, w30Var);
                                this.c.t = l10Var2;
                                l10Var2.c(i, i2, i3, z, this.c);
                                this.c.t = null;
                                pwVar = this.c.f.D;
                                synchronized (pwVar) {
                                    ((LinkedHashSet) pwVar.f).remove(w30Var);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    l10 l10Var3 = this.c.m;
                                    l10Var3.getClass();
                                    this.i = w30Var;
                                    Socket socket = l10Var2.d;
                                    socket.getClass();
                                    cb0.c(socket);
                                    l10Var = l10Var3;
                                } else {
                                    synchronized (l10Var2) {
                                        m10 m10Var = this.a;
                                        m10Var.getClass();
                                        byte[] bArr2 = cb0.a;
                                        m10Var.d.add(l10Var2);
                                        m10Var.b.c(m10Var.c, 0L);
                                        this.c.b(l10Var2);
                                    }
                                    z3 = z2;
                                    l10Var = l10Var2;
                                    if (l10Var.i(z3)) {
                                    }
                                }
                            }
                        } else {
                            l2 l2Var4 = this.d;
                            l2Var4.getClass();
                            if (!l2Var4.c()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList4 = (ArrayList) l2Var4.g;
                            int i8 = l2Var4.f;
                            l2Var4.f = i8 + 1;
                            w30Var = (w30) arrayList4.get(i8);
                        }
                    }
                    l10Var2.c(i, i2, i3, z, this.c);
                    this.c.t = null;
                    pwVar = this.c.f.D;
                    synchronized (pwVar) {
                    }
                } catch (Throwable th2) {
                    this.c.t = null;
                    throw th2;
                }
                arrayList = null;
                l10 l10Var22 = new l10(this.a, w30Var);
                this.c.t = l10Var22;
            }
            z3 = z2;
            if (l10Var.i(z3)) {
            }
        }
        g9.w("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof e70) && ((e70) iOException).f == 8) {
            this.f++;
        } else if (iOException instanceof bd) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
