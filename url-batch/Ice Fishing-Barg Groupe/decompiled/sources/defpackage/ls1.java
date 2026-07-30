package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ls1 extends il0 implements b70 {
    public static final ks1 Companion = new ks1();
    public final ArrayList BRwzKIf41E4i;
    public final int OPXfSBeufaJ8;
    public int QrzZRwfaDlRX;
    public final fr1 RAsUl2FVSrh6;
    public final qx1 TSizfFm2Yiuu;
    public long XL4ISE6Oc65B;
    public final Socket Y1f8riQaR6yg;
    public final ti0 a92UlCVFR9N8;
    public int cpQdD2nAriOS;
    public boolean dgRBjINgWbAK;
    public final Socket e9gEMXR7LXtO;
    public int gPXPFXrUH4XX;
    public final be2 lS5Rgt96tfkO;
    public int r3s1LDPKFs1S;
    public final m9 rtx2ld2ELZv4;
    public ll0 wdg6QnbFHrFF;
    public boolean x50lh2ztY7Y5;

    public ls1(be2 be2Var, os1 os1Var, qx1 qx1Var, Socket socket, Socket socket2, ti0 ti0Var, fr1 fr1Var, m9 m9Var, int i) {
        be2Var.getClass();
        os1Var.getClass();
        qx1Var.getClass();
        socket.getClass();
        socket2.getClass();
        fr1Var.getClass();
        m9Var.getClass();
        this.lS5Rgt96tfkO = be2Var;
        this.TSizfFm2Yiuu = qx1Var;
        this.Y1f8riQaR6yg = socket;
        this.e9gEMXR7LXtO = socket2;
        this.a92UlCVFR9N8 = ti0Var;
        this.RAsUl2FVSrh6 = fr1Var;
        this.rtx2ld2ELZv4 = m9Var;
        this.OPXfSBeufaJ8 = i;
        this.gPXPFXrUH4XX = 1;
        this.BRwzKIf41E4i = new ArrayList();
        this.XL4ISE6Oc65B = Long.MAX_VALUE;
    }

    public static void Y1f8riQaR6yg(if1 if1Var, qx1 qx1Var, IOException iOException) {
        qx1Var.getClass();
        iOException.getClass();
        if (qx1Var.lS5Rgt96tfkO.type() != Proxy.Type.DIRECT) {
            o oVar = qx1Var.PxuCJdSBwIXG;
            oVar.RAsUl2FVSrh6.connectFailed(oVar.rtx2ld2ELZv4.RAsUl2FVSrh6(), qx1Var.lS5Rgt96tfkO.address(), iOException);
        }
        i2 i2Var = if1Var.jyegZNwi31qc;
        synchronized (i2Var) {
            ((LinkedHashSet) i2Var.OPXfSBeufaJ8).add(qx1Var);
        }
    }

    public final void OPXfSBeufaJ8() {
        this.XL4ISE6Oc65B = System.nanoTime();
        fr1 fr1Var = this.RAsUl2FVSrh6;
        if (fr1Var == fr1.x50lh2ztY7Y5 || fr1Var == fr1.cpQdD2nAriOS) {
            this.e9gEMXR7LXtO.setSoTimeout(0);
            x80 x80Var = x80.PxuCJdSBwIXG;
            el0 el0Var = new el0(this.lS5Rgt96tfkO);
            m9 m9Var = this.rtx2ld2ELZv4;
            String str = this.TSizfFm2Yiuu.PxuCJdSBwIXG.rtx2ld2ELZv4.Y1f8riQaR6yg;
            m9Var.getClass();
            str.getClass();
            el0Var.lS5Rgt96tfkO = m9Var;
            el0Var.TSizfFm2Yiuu = mv2.lS5Rgt96tfkO + ' ' + str;
            el0Var.Y1f8riQaR6yg = this;
            el0Var.a92UlCVFR9N8 = this.OPXfSBeufaJ8;
            el0Var.RAsUl2FVSrh6 = x80Var;
            ll0 ll0Var = new ll0(el0Var);
            this.wdg6QnbFHrFF = ll0Var;
            ll0.Companion.getClass();
            t42 t42Var = ll0.tmVwIGCQF4zR;
            this.gPXPFXrUH4XX = (t42Var.PxuCJdSBwIXG & 8) != 0 ? t42Var.lS5Rgt96tfkO[3] : Integer.MAX_VALUE;
            xl0 xl0Var = ll0Var.rZjpSjn4zoMv;
            synchronized (xl0Var) {
                try {
                    if (xl0Var.dgRBjINgWbAK) {
                        throw new IOException("closed");
                    }
                    Logger logger = xl0.cpQdD2nAriOS;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(mv2.Y1f8riQaR6yg(">> CONNECTION " + zk0.PxuCJdSBwIXG.Y1f8riQaR6yg(), new Object[0]));
                    }
                    xl0Var.rtx2ld2ELZv4.xfACYKDMU6Dj(zk0.PxuCJdSBwIXG);
                    xl0Var.rtx2ld2ELZv4.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            xl0 xl0Var2 = ll0Var.rZjpSjn4zoMv;
            t42 t42Var2 = ll0Var.pnx5pC0XzaCw;
            xl0Var2.getClass();
            t42Var2.getClass();
            synchronized (xl0Var2) {
                try {
                    if (xl0Var2.dgRBjINgWbAK) {
                        throw new IOException("closed");
                    }
                    xl0Var2.OPXfSBeufaJ8(0, Integer.bitCount(t42Var2.PxuCJdSBwIXG) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & t42Var2.PxuCJdSBwIXG) == 0) {
                            z = false;
                        }
                        if (z) {
                            xl0Var2.rtx2ld2ELZv4.writeShort(i);
                            xl0Var2.rtx2ld2ELZv4.writeInt(t42Var2.lS5Rgt96tfkO[i]);
                        }
                    }
                    xl0Var2.rtx2ld2ELZv4.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (ll0Var.pnx5pC0XzaCw.PxuCJdSBwIXG() != 65535) {
                ll0Var.rZjpSjn4zoMv.S2OOm9zPNm0h(0, r7 - 65535);
            }
            zd2.lS5Rgt96tfkO(ll0Var.r3s1LDPKFs1S.Y1f8riQaR6yg(), ll0Var.wdg6QnbFHrFF, 0L, ll0Var.BjEWd04qc7Mw, 6);
        }
    }

    @Override // defpackage.il0
    public final void PxuCJdSBwIXG(ll0 ll0Var, t42 t42Var) {
        t42Var.getClass();
        synchronized (this) {
            this.gPXPFXrUH4XX = (t42Var.PxuCJdSBwIXG & 8) != 0 ? t42Var.lS5Rgt96tfkO[3] : Integer.MAX_VALUE;
        }
    }

    public final boolean RAsUl2FVSrh6(boolean z) {
        long j;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        long nanoTime = System.nanoTime();
        if (this.Y1f8riQaR6yg.isClosed() || this.e9gEMXR7LXtO.isClosed() || this.e9gEMXR7LXtO.isInputShutdown() || this.e9gEMXR7LXtO.isOutputShutdown()) {
            return false;
        }
        ll0 ll0Var = this.wdg6QnbFHrFF;
        if (ll0Var != null) {
            synchronized (ll0Var) {
                if (ll0Var.cpQdD2nAriOS) {
                    return false;
                }
                if (ll0Var.VhhvGxCb8gfr < ll0Var.S9EYkSpbGuxq) {
                    if (nanoTime >= ll0Var.S2OOm9zPNm0h) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.XL4ISE6Oc65B;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e9gEMXR7LXtO;
        es1 es1Var = (es1) this.rtx2ld2ELZv4.wdg6QnbFHrFF;
        socket.getClass();
        es1Var.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !es1Var.lS5Rgt96tfkO();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.il0
    public final void TSizfFm2Yiuu(vl0 vl0Var) {
        vl0Var.TSizfFm2Yiuu(o60.cpQdD2nAriOS, null);
    }

    @Override // defpackage.b70
    public final qx1 a92UlCVFR9N8() {
        return this.TSizfFm2Yiuu;
    }

    @Override // defpackage.b70
    public final void cancel() {
        mv2.TSizfFm2Yiuu(this.Y1f8riQaR6yg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if (defpackage.ff1.TSizfFm2Yiuu(r5, (java.security.cert.X509Certificate) r8) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e9gEMXR7LXtO(o oVar, List list) {
        gm0 gm0Var = oVar.rtx2ld2ELZv4;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        if (this.BRwzKIf41E4i.size() < this.gPXPFXrUH4XX && !this.dgRBjINgWbAK) {
            qx1 qx1Var = this.TSizfFm2Yiuu;
            o oVar2 = qx1Var.PxuCJdSBwIXG;
            o oVar3 = qx1Var.PxuCJdSBwIXG;
            if (oVar2.PxuCJdSBwIXG(oVar)) {
                String str = gm0Var.Y1f8riQaR6yg;
                String str2 = gm0Var.Y1f8riQaR6yg;
                if (cs0.wdg6QnbFHrFF(str, oVar3.rtx2ld2ELZv4.Y1f8riQaR6yg)) {
                    return true;
                }
                if (this.wdg6QnbFHrFF != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        qx1 qx1Var2 = (qx1) it.next();
                        Proxy.Type type = qx1Var2.lS5Rgt96tfkO.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && qx1Var.lS5Rgt96tfkO.type() == type2 && cs0.wdg6QnbFHrFF(qx1Var.TSizfFm2Yiuu, qx1Var2.TSizfFm2Yiuu)) {
                            if (oVar.Y1f8riQaR6yg == ff1.PxuCJdSBwIXG) {
                                TimeZone timeZone2 = mv2.PxuCJdSBwIXG;
                                gm0 gm0Var2 = oVar3.rtx2ld2ELZv4;
                                if (gm0Var.e9gEMXR7LXtO == gm0Var2.e9gEMXR7LXtO) {
                                    boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(str2, gm0Var2.Y1f8riQaR6yg);
                                    ti0 ti0Var = this.a92UlCVFR9N8;
                                    if (!wdg6QnbFHrFF) {
                                        if (!this.x50lh2ztY7Y5 && ti0Var != null) {
                                            List PxuCJdSBwIXG = ti0Var.PxuCJdSBwIXG();
                                            if (!PxuCJdSBwIXG.isEmpty()) {
                                                Object obj = PxuCJdSBwIXG.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        ri riVar = oVar.e9gEMXR7LXtO;
                                        riVar.getClass();
                                        ti0Var.getClass();
                                        List PxuCJdSBwIXG2 = ti0Var.PxuCJdSBwIXG();
                                        str2.getClass();
                                        PxuCJdSBwIXG2.getClass();
                                        Iterator it2 = riVar.PxuCJdSBwIXG.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        o0.ZbWwgt3aGe7A(it2.next());
                                        throw null;
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.b70
    public final void lS5Rgt96tfkO(js1 js1Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof aa2)) {
                    if (!(this.wdg6QnbFHrFF != null) || (iOException instanceof yq)) {
                        this.dgRBjINgWbAK = true;
                        if (this.r3s1LDPKFs1S == 0) {
                            if (iOException != null) {
                                Y1f8riQaR6yg(js1Var.rtx2ld2ELZv4, this.TSizfFm2Yiuu, iOException);
                            }
                            this.cpQdD2nAriOS++;
                        }
                    }
                } else if (((aa2) iOException).rtx2ld2ELZv4 == o60.cpQdD2nAriOS) {
                    int i = this.QrzZRwfaDlRX + 1;
                    this.QrzZRwfaDlRX = i;
                    if (i > 1) {
                        this.dgRBjINgWbAK = true;
                        this.cpQdD2nAriOS++;
                    }
                } else if (((aa2) iOException).rtx2ld2ELZv4 != o60.r3s1LDPKFs1S || !js1Var.ZbWwgt3aGe7A) {
                    this.dgRBjINgWbAK = true;
                    this.cpQdD2nAriOS++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.b70
    public final void rtx2ld2ELZv4() {
        synchronized (this) {
            this.dgRBjINgWbAK = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        qx1 qx1Var = this.TSizfFm2Yiuu;
        sb.append(qx1Var.PxuCJdSBwIXG.rtx2ld2ELZv4.Y1f8riQaR6yg);
        sb.append(':');
        sb.append(qx1Var.PxuCJdSBwIXG.rtx2ld2ELZv4.e9gEMXR7LXtO);
        sb.append(", proxy=");
        sb.append(qx1Var.lS5Rgt96tfkO);
        sb.append(" hostAddress=");
        sb.append(qx1Var.TSizfFm2Yiuu);
        sb.append(" cipherSuite=");
        ti0 ti0Var = this.a92UlCVFR9N8;
        sb.append(ti0Var != null ? ti0Var.lS5Rgt96tfkO : "none");
        sb.append(" protocol=");
        sb.append(this.RAsUl2FVSrh6);
        sb.append('}');
        return sb.toString();
    }
}
