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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class pi {
    public final ky a;
    public final y1 b;
    public final gy c;
    public or d;
    public x1 e;
    public int f;
    public int g;
    public int h;
    public r00 i;

    public pi(ky kyVar, y1 y1Var, gy gyVar) {
        kyVar.getClass();
        this.a = kyVar;
        this.b = y1Var;
        this.c = gyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x033e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jy a(int i, int i2, int i3, boolean z, boolean z2) {
        ArrayList arrayList;
        String str;
        int i4;
        List list;
        boolean contains;
        mr mrVar;
        boolean z3;
        Socket i5;
        while (!this.c.r) {
            jy jyVar = this.c.m;
            if (jyVar != null) {
                synchronized (jyVar) {
                    try {
                        if (!jyVar.j) {
                            jo joVar = jyVar.b.a.h;
                            joVar.getClass();
                            jo joVar2 = this.b.h;
                            if (joVar.e == joVar2.e && zo.b(joVar.d, joVar2.d)) {
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
                        t8.t("Check failed.");
                        return null;
                    }
                    z3 = z2;
                    if (jyVar.i(z3)) {
                        return jyVar;
                    }
                    jyVar.k();
                    if (this.i == null) {
                        or orVar = this.d;
                        if (orVar != null ? orVar.h() : true) {
                            continue;
                        } else {
                            x1 x1Var = this.e;
                            if (!(x1Var != null ? x1Var.j() : true)) {
                                t8.y("exhausted all routes");
                                return null;
                            }
                        }
                    }
                } else if (i5 != null) {
                    r70.c(i5);
                }
            }
            this.f = 0;
            this.g = 0;
            this.h = 0;
            if (this.a.a(this.b, this.c, null, false)) {
                jyVar = this.c.m;
                jyVar.getClass();
            } else {
                r00 r00Var = this.i;
                try {
                    if (r00Var != null) {
                        this.i = null;
                    } else {
                        or orVar2 = this.d;
                        if (orVar2 == null || !orVar2.h()) {
                            x1 x1Var2 = this.e;
                            if (x1Var2 == null) {
                                y1 y1Var = this.b;
                                gy gyVar = this.c;
                                x1Var2 = new x1(y1Var, gyVar.f.D, gyVar);
                                this.e = x1Var2;
                            }
                            if (!x1Var2.j()) {
                                throw new NoSuchElementException();
                            }
                            arrayList = new ArrayList();
                            while (x1Var2.a < ((List) x1Var2.e).size()) {
                                y1 y1Var2 = (y1) x1Var2.b;
                                if (x1Var2.a >= ((List) x1Var2.e).size()) {
                                    throw new SocketException("No route to " + y1Var2.h.d + "; exhausted proxy configurations: " + ((List) x1Var2.e));
                                }
                                List list2 = (List) x1Var2.e;
                                int i6 = x1Var2.a;
                                x1Var2.a = i6 + 1;
                                Proxy proxy = (Proxy) list2.get(i6);
                                ArrayList arrayList2 = new ArrayList();
                                x1Var2.f = arrayList2;
                                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                    jo joVar3 = y1Var2.h;
                                    str = joVar3.d;
                                    i4 = joVar3.e;
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
                                    byte[] bArr = r70.a;
                                    str.getClass();
                                    qz qzVar = r70.f;
                                    qzVar.getClass();
                                    if (((Pattern) qzVar.g).matcher(str).matches()) {
                                        list = o8.U(InetAddress.getByName(str));
                                    } else {
                                        y1Var2.a.getClass();
                                        try {
                                            InetAddress[] allByName = InetAddress.getAllByName(str);
                                            allByName.getClass();
                                            int length = allByName.length;
                                            List arrayList3 = length != 0 ? length != 1 ? new ArrayList(new f6(allByName, false)) : o8.U(allByName[0]) : di.f;
                                            if (arrayList3.isEmpty()) {
                                                throw new UnknownHostException(y1Var2.a + " returned no addresses for " + str);
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
                                Iterator it2 = ((List) x1Var2.f).iterator();
                                while (it2.hasNext()) {
                                    r00 r00Var2 = new r00((y1) x1Var2.b, proxy, (InetSocketAddress) it2.next());
                                    mr mrVar2 = (mr) x1Var2.d;
                                    synchronized (mrVar2) {
                                        contains = ((LinkedHashSet) mrVar2.f).contains(r00Var2);
                                    }
                                    if (contains) {
                                        ((ArrayList) x1Var2.c).add(r00Var2);
                                    } else {
                                        arrayList.add(r00Var2);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                hb.H0(arrayList, (ArrayList) x1Var2.c);
                                ((ArrayList) x1Var2.c).clear();
                            }
                            or orVar3 = new or(arrayList, 4);
                            this.d = orVar3;
                            if (this.c.r) {
                                t8.y("Canceled");
                                return null;
                            }
                            if (this.a.a(this.b, this.c, arrayList, false)) {
                                jyVar = this.c.m;
                                jyVar.getClass();
                            } else {
                                if (!orVar3.h()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = orVar3.f;
                                orVar3.f = i7 + 1;
                                r00Var = (r00) arrayList.get(i7);
                                jy jyVar2 = new jy(this.a, r00Var);
                                this.c.t = jyVar2;
                                jyVar2.c(i, i2, i3, z, this.c);
                                this.c.t = null;
                                mrVar = this.c.f.D;
                                synchronized (mrVar) {
                                    ((LinkedHashSet) mrVar.f).remove(r00Var);
                                }
                                if (this.a.a(this.b, this.c, arrayList, true)) {
                                    jy jyVar3 = this.c.m;
                                    jyVar3.getClass();
                                    this.i = r00Var;
                                    Socket socket = jyVar2.d;
                                    socket.getClass();
                                    r70.c(socket);
                                    jyVar = jyVar3;
                                } else {
                                    synchronized (jyVar2) {
                                        ky kyVar = this.a;
                                        kyVar.getClass();
                                        byte[] bArr2 = r70.a;
                                        kyVar.d.add(jyVar2);
                                        kyVar.b.c(kyVar.c, 0L);
                                        this.c.b(jyVar2);
                                    }
                                    z3 = z2;
                                    jyVar = jyVar2;
                                    if (jyVar.i(z3)) {
                                    }
                                }
                            }
                        } else {
                            or orVar4 = this.d;
                            orVar4.getClass();
                            if (!orVar4.h()) {
                                throw new NoSuchElementException();
                            }
                            ArrayList arrayList4 = (ArrayList) orVar4.g;
                            int i8 = orVar4.f;
                            orVar4.f = i8 + 1;
                            r00Var = (r00) arrayList4.get(i8);
                        }
                    }
                    jyVar2.c(i, i2, i3, z, this.c);
                    this.c.t = null;
                    mrVar = this.c.f.D;
                    synchronized (mrVar) {
                    }
                } catch (Throwable th2) {
                    this.c.t = null;
                    throw th2;
                }
                arrayList = null;
                jy jyVar22 = new jy(this.a, r00Var);
                this.c.t = jyVar22;
            }
            z3 = z2;
            if (jyVar.i(z3)) {
            }
        }
        t8.y("Canceled");
        return null;
    }

    public final void b(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof b40) && ((b40) iOException).f == 8) {
            this.f++;
        } else if (iOException instanceof bc) {
            this.g++;
        } else {
            this.h++;
        }
    }
}
