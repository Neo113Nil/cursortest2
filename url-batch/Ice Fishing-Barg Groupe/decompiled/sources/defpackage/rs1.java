package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rs1 {
    public final da BRwzKIf41E4i;
    public final boolean OPXfSBeufaJ8;
    public final be2 PxuCJdSBwIXG;
    public xx1 QrzZRwfaDlRX;
    public final int RAsUl2FVSrh6;
    public final int TSizfFm2Yiuu;
    public final int Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public final boolean cpQdD2nAriOS;
    public final i2 dgRBjINgWbAK;
    public final int e9gEMXR7LXtO;
    public qx1 gPXPFXrUH4XX;
    public final os1 lS5Rgt96tfkO;
    public um r3s1LDPKFs1S;
    public final boolean rtx2ld2ELZv4;
    public final o wdg6QnbFHrFF;
    public final js1 x50lh2ztY7Y5;

    public rs1(be2 be2Var, os1 os1Var, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, o oVar, i2 i2Var, js1 js1Var, xb xbVar) {
        be2Var.getClass();
        os1Var.getClass();
        i2Var.getClass();
        this.PxuCJdSBwIXG = be2Var;
        this.lS5Rgt96tfkO = os1Var;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = i2;
        this.e9gEMXR7LXtO = i3;
        this.a92UlCVFR9N8 = i4;
        this.RAsUl2FVSrh6 = i5;
        this.rtx2ld2ELZv4 = z;
        this.OPXfSBeufaJ8 = z2;
        this.wdg6QnbFHrFF = oVar;
        this.dgRBjINgWbAK = i2Var;
        this.x50lh2ztY7Y5 = js1Var;
        this.cpQdD2nAriOS = !cs0.wdg6QnbFHrFF((String) xbVar.TSizfFm2Yiuu, "GET");
        this.BRwzKIf41E4i = new da();
    }

    public final boolean PxuCJdSBwIXG(ls1 ls1Var) {
        xx1 xx1Var;
        qx1 qx1Var;
        if (this.BRwzKIf41E4i.isEmpty() && this.gPXPFXrUH4XX == null) {
            if (ls1Var != null) {
                synchronized (ls1Var) {
                    qx1Var = null;
                    if (ls1Var.cpQdD2nAriOS == 0 && ls1Var.dgRBjINgWbAK && mv2.PxuCJdSBwIXG(ls1Var.TSizfFm2Yiuu.PxuCJdSBwIXG.rtx2ld2ELZv4, this.wdg6QnbFHrFF.rtx2ld2ELZv4)) {
                        qx1Var = ls1Var.TSizfFm2Yiuu;
                    }
                }
                if (qx1Var != null) {
                    this.gPXPFXrUH4XX = qx1Var;
                    return true;
                }
            }
            um umVar = this.r3s1LDPKFs1S;
            if ((umVar == null || umVar.lS5Rgt96tfkO >= ((ArrayList) umVar.TSizfFm2Yiuu).size()) && (xx1Var = this.QrzZRwfaDlRX) != null) {
                return xx1Var.PxuCJdSBwIXG();
            }
        }
        return true;
    }

    public final nq TSizfFm2Yiuu(qx1 qx1Var, ArrayList arrayList) {
        fr1 fr1Var = fr1.cpQdD2nAriOS;
        qx1Var.getClass();
        o oVar = qx1Var.PxuCJdSBwIXG;
        if (oVar.TSizfFm2Yiuu == null) {
            if (!oVar.wdg6QnbFHrFF.contains(br.a92UlCVFR9N8)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = qx1Var.PxuCJdSBwIXG.rtx2ld2ELZv4.Y1f8riQaR6yg;
            km1.Companion.getClass();
            if (!km1.PxuCJdSBwIXG.rtx2ld2ELZv4(str)) {
                throw new UnknownServiceException(o0.x50lh2ztY7Y5("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (oVar.OPXfSBeufaJ8.contains(fr1Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        xb xbVar = null;
        if (qx1Var.lS5Rgt96tfkO.type() == Proxy.Type.HTTP) {
            o oVar2 = qx1Var.PxuCJdSBwIXG;
            if (oVar2.TSizfFm2Yiuu != null || oVar2.OPXfSBeufaJ8.contains(fr1Var)) {
                e0 e0Var = new e0(7);
                gm0 gm0Var = qx1Var.PxuCJdSBwIXG.rtx2ld2ELZv4;
                gm0Var.getClass();
                e0Var.OPXfSBeufaJ8 = gm0Var;
                e0Var.RfyTYNmI9Srp("CONNECT", null);
                o oVar3 = qx1Var.PxuCJdSBwIXG;
                e0Var.cpQdD2nAriOS("Host", mv2.rtx2ld2ELZv4(oVar3.rtx2ld2ELZv4, true));
                e0Var.cpQdD2nAriOS("Proxy-Connection", "Keep-Alive");
                e0Var.cpQdD2nAriOS("User-Agent", "okhttp/5.4.0");
                xbVar = new xb(e0Var);
                ov1 ov1Var = qv1.rtx2ld2ELZv4;
                ok2 ok2Var = pk2.Companion;
                ArrayList arrayList2 = new ArrayList(20);
                kj0.kpCQ9veP6n3I("Proxy-Authenticate");
                kj0.rZjpSjn4zoMv("OkHttp-Preemptive", "Proxy-Authenticate");
                int i = 0;
                while (i < arrayList2.size()) {
                    if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList2.get(i))) {
                        arrayList2.remove(i);
                        arrayList2.remove(i);
                        i -= 2;
                    }
                    i += 2;
                }
                arrayList2.add("Proxy-Authenticate");
                arrayList2.add(ia2.GlTbNTgfSMqy("OkHttp-Preemptive").toString());
                new hj0((String[]) arrayList2.toArray(new String[0]));
                ov1Var.getClass();
                oVar3.a92UlCVFR9N8.getClass();
            }
        }
        return new nq(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6, this.rtx2ld2ELZv4, this.x50lh2ztY7Y5, this, qx1Var, arrayList, xbVar, -1, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x003b, code lost:
    
        if ((r7.wdg6QnbFHrFF != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ew1 Y1f8riQaR6yg(nq nqVar, List list) {
        ls1 ls1Var;
        boolean z;
        Socket OPXfSBeufaJ8;
        os1 os1Var = this.lS5Rgt96tfkO;
        boolean z2 = this.cpQdD2nAriOS;
        o oVar = this.wdg6QnbFHrFF;
        js1 js1Var = this.x50lh2ztY7Y5;
        boolean z3 = nqVar != null && nqVar.e9gEMXR7LXtO();
        os1Var.getClass();
        Iterator it = os1Var.Y1f8riQaR6yg.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                ls1Var = null;
                break;
            }
            ls1Var = (ls1) it.next();
            ls1Var.getClass();
            synchronized (ls1Var) {
                if (z3) {
                    try {
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (ls1Var.e9gEMXR7LXtO(oVar, list)) {
                    js1Var.lS5Rgt96tfkO(ls1Var);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                if (ls1Var.RAsUl2FVSrh6(z2)) {
                    break;
                }
                synchronized (ls1Var) {
                    ls1Var.dgRBjINgWbAK = true;
                    OPXfSBeufaJ8 = js1Var.OPXfSBeufaJ8();
                }
                if (OPXfSBeufaJ8 != null) {
                    mv2.TSizfFm2Yiuu(OPXfSBeufaJ8);
                }
            }
        }
        if (ls1Var == null) {
            return null;
        }
        if (nqVar != null) {
            this.gPXPFXrUH4XX = nqVar.dgRBjINgWbAK;
            Socket socket = nqVar.XL4ISE6Oc65B;
            if (socket != null) {
                mv2.TSizfFm2Yiuu(socket);
            }
        }
        this.x50lh2ztY7Y5.dgRBjINgWbAK.getClass();
        return new ew1(ls1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vx1 lS5Rgt96tfkO() {
        Socket OPXfSBeufaJ8;
        ew1 ew1Var;
        nq TSizfFm2Yiuu;
        String str;
        int i;
        List OYiFbU3x63rc;
        boolean contains;
        ls1 ls1Var = this.x50lh2ztY7Y5.gPXPFXrUH4XX;
        if (ls1Var != null) {
            boolean RAsUl2FVSrh6 = ls1Var.RAsUl2FVSrh6(this.cpQdD2nAriOS);
            synchronized (ls1Var) {
                boolean z = ls1Var.dgRBjINgWbAK;
                try {
                    if (RAsUl2FVSrh6) {
                        if (!z) {
                            gm0 gm0Var = ls1Var.TSizfFm2Yiuu.PxuCJdSBwIXG.rtx2ld2ELZv4;
                            gm0Var.getClass();
                            gm0 gm0Var2 = this.wdg6QnbFHrFF.rtx2ld2ELZv4;
                            if (gm0Var.e9gEMXR7LXtO == gm0Var2.e9gEMXR7LXtO && cs0.wdg6QnbFHrFF(gm0Var.Y1f8riQaR6yg, gm0Var2.Y1f8riQaR6yg)) {
                                OPXfSBeufaJ8 = null;
                            }
                        }
                        OPXfSBeufaJ8 = this.x50lh2ztY7Y5.OPXfSBeufaJ8();
                    } else {
                        ls1Var.dgRBjINgWbAK = true;
                        OPXfSBeufaJ8 = this.x50lh2ztY7Y5.OPXfSBeufaJ8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.x50lh2ztY7Y5.gPXPFXrUH4XX != null) {
                if (OPXfSBeufaJ8 != null) {
                    u9.rtx2ld2ELZv4("Check failed.");
                    return null;
                }
                ew1Var = new ew1(ls1Var);
                if (ew1Var == null) {
                    return ew1Var;
                }
                ew1 Y1f8riQaR6yg = Y1f8riQaR6yg(null, null);
                if (Y1f8riQaR6yg != null) {
                    return Y1f8riQaR6yg;
                }
                if (!this.BRwzKIf41E4i.isEmpty()) {
                    return (vx1) this.BRwzKIf41E4i.removeFirst();
                }
                qx1 qx1Var = this.gPXPFXrUH4XX;
                if (qx1Var != null) {
                    this.gPXPFXrUH4XX = null;
                    TSizfFm2Yiuu = TSizfFm2Yiuu(qx1Var, null);
                } else {
                    um umVar = this.r3s1LDPKFs1S;
                    if (umVar == null || umVar.lS5Rgt96tfkO >= ((ArrayList) umVar.TSizfFm2Yiuu).size()) {
                        xx1 xx1Var = this.QrzZRwfaDlRX;
                        if (xx1Var == null) {
                            xx1Var = new xx1(this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.OPXfSBeufaJ8);
                            this.QrzZRwfaDlRX = xx1Var;
                        }
                        if (!xx1Var.PxuCJdSBwIXG()) {
                            u9.S9EYkSpbGuxq("exhausted all routes");
                            return null;
                        }
                        if (!xx1Var.PxuCJdSBwIXG()) {
                            u9.RfyTYNmI9Srp();
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        while (xx1Var.a92UlCVFR9N8 < xx1Var.e9gEMXR7LXtO.size()) {
                            if (xx1Var.a92UlCVFR9N8 >= xx1Var.e9gEMXR7LXtO.size()) {
                                throw new SocketException("No route to " + xx1Var.PxuCJdSBwIXG.rtx2ld2ELZv4.Y1f8riQaR6yg + "; exhausted proxy configurations: " + xx1Var.e9gEMXR7LXtO);
                            }
                            List list = xx1Var.e9gEMXR7LXtO;
                            int i2 = xx1Var.a92UlCVFR9N8;
                            xx1Var.a92UlCVFR9N8 = i2 + 1;
                            Proxy proxy = (Proxy) list.get(i2);
                            ArrayList arrayList2 = new ArrayList();
                            xx1Var.RAsUl2FVSrh6 = arrayList2;
                            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                gm0 gm0Var3 = xx1Var.PxuCJdSBwIXG.rtx2ld2ELZv4;
                                str = gm0Var3.Y1f8riQaR6yg;
                                i = gm0Var3.e9gEMXR7LXtO;
                            } else {
                                SocketAddress address = proxy.address();
                                if (!(address instanceof InetSocketAddress)) {
                                    rc1.x50lh2ztY7Y5(address.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                                    return null;
                                }
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                xx1.Companion.getClass();
                                InetAddress address2 = inetSocketAddress.getAddress();
                                if (address2 == null) {
                                    str = inetSocketAddress.getHostName();
                                    str.getClass();
                                } else {
                                    str = address2.getHostAddress();
                                    str.getClass();
                                }
                                i = inetSocketAddress.getPort();
                            }
                            if (1 > i || i >= 65536) {
                                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                            }
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                arrayList2.add(InetSocketAddress.createUnresolved(str, i));
                            } else {
                                eu1 eu1Var = iv2.PxuCJdSBwIXG;
                                str.getClass();
                                if (iv2.PxuCJdSBwIXG.TSizfFm2Yiuu(str)) {
                                    OYiFbU3x63rc = fx1.jJwa0q7P5wHq(InetAddress.getByName(str));
                                } else {
                                    xx1Var.TSizfFm2Yiuu.dgRBjINgWbAK.getClass();
                                    ((ih0) xx1Var.PxuCJdSBwIXG.PxuCJdSBwIXG).getClass();
                                    try {
                                        InetAddress[] allByName = InetAddress.getAllByName(str);
                                        allByName.getClass();
                                        OYiFbU3x63rc = na.OYiFbU3x63rc(allByName);
                                        if (OYiFbU3x63rc.isEmpty()) {
                                            throw new UnknownHostException(xx1Var.PxuCJdSBwIXG.PxuCJdSBwIXG + " returned no addresses for " + str);
                                        }
                                        xx1Var.TSizfFm2Yiuu.dgRBjINgWbAK.getClass();
                                    } catch (NullPointerException e) {
                                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                        unknownHostException.initCause(e);
                                        throw unknownHostException;
                                    }
                                }
                                if (xx1Var.Y1f8riQaR6yg && OYiFbU3x63rc.size() >= 2) {
                                    ArrayList arrayList3 = new ArrayList();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj : OYiFbU3x63rc) {
                                        if (((InetAddress) obj) instanceof Inet6Address) {
                                            arrayList3.add(obj);
                                        } else {
                                            arrayList4.add(obj);
                                        }
                                    }
                                    if (!arrayList3.isEmpty() && !arrayList4.isEmpty()) {
                                        byte[] bArr = kv2.PxuCJdSBwIXG;
                                        Iterator it = arrayList3.iterator();
                                        Iterator it2 = arrayList4.iterator();
                                        z11 BjEWd04qc7Mw = fx1.BjEWd04qc7Mw();
                                        while (true) {
                                            if (!it.hasNext() && !it2.hasNext()) {
                                                break;
                                            }
                                            if (it.hasNext()) {
                                                BjEWd04qc7Mw.add(it.next());
                                            }
                                            if (it2.hasNext()) {
                                                BjEWd04qc7Mw.add(it2.next());
                                            }
                                        }
                                        OYiFbU3x63rc = fx1.ZbWwgt3aGe7A(BjEWd04qc7Mw);
                                    }
                                }
                                Iterator it3 = OYiFbU3x63rc.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), i));
                                }
                            }
                            Iterator it4 = xx1Var.RAsUl2FVSrh6.iterator();
                            while (it4.hasNext()) {
                                qx1 qx1Var2 = new qx1(xx1Var.PxuCJdSBwIXG, proxy, (InetSocketAddress) it4.next());
                                i2 i2Var = xx1Var.lS5Rgt96tfkO;
                                synchronized (i2Var) {
                                    contains = ((LinkedHashSet) i2Var.OPXfSBeufaJ8).contains(qx1Var2);
                                }
                                if (contains) {
                                    xx1Var.rtx2ld2ELZv4.add(qx1Var2);
                                } else {
                                    arrayList.add(qx1Var2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            el.MBpAROcyNHKN(xx1Var.rtx2ld2ELZv4, arrayList);
                            xx1Var.rtx2ld2ELZv4.clear();
                        }
                        um umVar2 = new um(7, arrayList);
                        this.r3s1LDPKFs1S = umVar2;
                        if (this.x50lh2ztY7Y5.ZbWwgt3aGe7A) {
                            u9.S9EYkSpbGuxq("Canceled");
                            return null;
                        }
                        if (umVar2.lS5Rgt96tfkO >= arrayList.size()) {
                            u9.RfyTYNmI9Srp();
                            return null;
                        }
                        int i3 = umVar2.lS5Rgt96tfkO;
                        umVar2.lS5Rgt96tfkO = i3 + 1;
                        TSizfFm2Yiuu = TSizfFm2Yiuu((qx1) arrayList.get(i3), arrayList);
                    } else {
                        int i4 = umVar.lS5Rgt96tfkO;
                        ArrayList arrayList5 = (ArrayList) umVar.TSizfFm2Yiuu;
                        if (i4 >= arrayList5.size()) {
                            u9.RfyTYNmI9Srp();
                            return null;
                        }
                        int i5 = umVar.lS5Rgt96tfkO;
                        umVar.lS5Rgt96tfkO = i5 + 1;
                        TSizfFm2Yiuu = TSizfFm2Yiuu((qx1) arrayList5.get(i5), null);
                    }
                }
                ew1 Y1f8riQaR6yg2 = Y1f8riQaR6yg(TSizfFm2Yiuu, TSizfFm2Yiuu.x50lh2ztY7Y5);
                return Y1f8riQaR6yg2 != null ? Y1f8riQaR6yg2 : TSizfFm2Yiuu;
            }
            if (OPXfSBeufaJ8 != null) {
                mv2.TSizfFm2Yiuu(OPXfSBeufaJ8);
            }
            this.x50lh2ztY7Y5.dgRBjINgWbAK.getClass();
        }
        ew1Var = null;
        if (ew1Var == null) {
        }
    }
}
