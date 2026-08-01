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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ii {
    public final zy a;
    public final o2 b;
    public final vy c;
    public v2 d;
    public l2 e;
    public int f;
    public int g;
    public int h;
    public h10 i;

    public ii(zy zyVar, o2 o2Var, vy vyVar) {
        zyVar.getClass();
        this.a = zyVar;
        this.b = o2Var;
        this.c = vyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yy a(int i, int i2, int i3, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        tx txVar;
        boolean z3;
        Socket i5;
        while (!this.c.r) {
            yy yyVar = this.c.m;
            if (yyVar != null) {
                synchronized (yyVar) {
                    try {
                        if (!yyVar.j) {
                            yo yoVar = yyVar.b.a.h;
                            yoVar.getClass();
                            yo yoVar2 = this.b.h;
                            if (yoVar.e == yoVar2.e && op.d(yoVar.d, yoVar2.d)) {
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
                        o8.t("Check failed.");
                        return null;
                    }
                    z3 = z2;
                    if (yyVar.i(z3)) {
                        return yyVar;
                    }
                    yyVar.k();
                    if (this.i == null) {
                        v2 v2Var = this.d;
                        if (v2Var != null ? v2Var.c() : true) {
                            continue;
                        } else {
                            l2 l2Var = this.e;
                            if (!(l2Var != null ? l2Var.g() : true)) {
                                o8.x("exhausted all routes");
                                return null;
                            }
                        }
                    }
                } else if (i5 != null) {
                    y70.c(i5);
                }
            }
            this.f = 0;
            this.g = 0;
            this.h = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                yyVar = this.c.m;
                yyVar.getClass();
            } else {
                h10 h10Var = this.i;
                try {
                    if (h10Var != null) {
                        this.i = null;
                    } else {
                        v2 v2Var2 = this.d;
                        if (v2Var2 == null || !v2Var2.c()) {
                            l2 l2Var2 = this.e;
                            if (l2Var2 == null) {
                                o2 o2Var = this.b;
                                vy vyVar = this.c;
                                l2Var2 = new l2(o2Var, vyVar.f.D, vyVar);
                                this.e = l2Var2;
                            }
                            if (!l2Var2.g()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (l2Var2.a < ((List) l2Var2.e).size()) {
                                o2 o2Var2 = (o2) l2Var2.c;
                                if (l2Var2.a >= ((List) l2Var2.e).size()) {
                                    throw new SocketException("No route to " + o2Var2.h.d + "; exhausted proxy configurations: " + ((List) l2Var2.e));
                                }
                                List list2 = (List) l2Var2.e;
                                int i6 = l2Var2.a;
                                l2Var2.a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                l2Var2.f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    yo yoVar3 = o2Var2.h;
                                    str = yoVar3.d;
                                    i4 = yoVar3.e;
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
                                    byte[] bArr = y70.a;
                                    str.getClass();
                                    f00 f00Var = y70.f;
                                    f00Var.getClass();
                                    if (((Pattern) f00Var.g).matcher(str).matches()) {
                                        list = l70.z(InetAddress.getByName(str));
                                    } else {
                                        o2Var2.a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            allByName.getClass();
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new w6(allByName, false)) : l70.z(allByName[0]) : vh.f;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(o2Var2.a + " returned no addresses for " + str);
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
                                Iterator it2 = ((List) l2Var2.f).iterator();
                                while (it2.hasNext()) {
                                    h10 h10Var2 = new h10((o2) l2Var2.c, proxy, (InetSocketAddress) it2.next());
                                    tx txVar2 = (tx) l2Var2.d;
                                    synchronized (txVar2) {
                                        contains = ((LinkedHashSet) txVar2.f).contains(h10Var2);
                                    }
                                    if (contains) {
                                        l2Var2.b.add(h10Var2);
                                    } else {
                                        arrayList.add(h10Var2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                jb.c0(arrayList, l2Var2.b);
                                l2Var2.b.clear();
                            }
                            v2 v2Var3 = new v2(arrayList, 2);
                            this.d = v2Var3;
                            if (this.c.r) {
                                o8.x("Canceled");
                                return null;
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                yyVar = this.c.m;
                                yyVar.getClass();
                            } else {
                                if (!v2Var3.c()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = v2Var3.a;
                                v2Var3.a = i7 + 1;
                                h10Var = (h10) arrayList.get(i7);
                                yy yyVar2 = new yy(this.a, h10Var);
                                this.c.t = yyVar2;
                                yyVar2.c(i, i2, i3, z, this.c);
                                this.c.t = null;
                                txVar = this.c.f.D;
                                synchronized (txVar) {
                                    ((LinkedHashSet) txVar.f).remove(h10Var);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    yy yyVar3 = this.c.m;
                                    yyVar3.getClass();
                                    this.i = h10Var;
                                    Socket socket = yyVar2.d;
                                    socket.getClass();
                                    y70.c(socket);
                                    yyVar = yyVar3;
                                } else {
                                    synchronized (yyVar2) {
                                        zy zyVar = this.a;
                                        zyVar.getClass();
                                        byte[] bArr2 = y70.a;
                                        zyVar.d.add(yyVar2);
                                        zyVar.b.c(zyVar.c, 0L);
                                        this.c.b(yyVar2);
                                    }
                                    z3 = z2;
                                    yyVar = yyVar2;
                                    if (yyVar.i(z3)) {
                                    }
                                }
                            }
                        } else {
                            v2 v2Var4 = this.d;
                            v2Var4.getClass();
                            if (!v2Var4.c()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList4 = (ArrayList) v2Var4.b;
                            int i8 = v2Var4.a;
                            v2Var4.a = i8 + 1;
                            h10Var = (h10) arrayList4.get(i8);
                        }
                    }
                    yyVar2.c(i, i2, i3, z, this.c);
                    this.c.t = null;
                    txVar = this.c.f.D;
                    synchronized (txVar) {
                    }
                } catch (Throwable th2) {
                    this.c.t = null;
                    throw th2;
                }
                arrayList = null;
                yy yyVar22 = new yy(this.a, h10Var);
                this.c.t = yyVar22;
            }
            z3 = z2;
            if (yyVar.i(z3)) {
            }
        }
        o8.x("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof k40) && ((k40) iOException).f == 8) {
            this.f++;
        } else if (iOException instanceof fc) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
