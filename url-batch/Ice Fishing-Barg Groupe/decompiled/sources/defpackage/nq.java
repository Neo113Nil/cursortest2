package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class nq implements vx1, b70 {
    public static final lq Companion = new lq();
    public Socket BRwzKIf41E4i;
    public fr1 EcgxDIVH5in8;
    public final js1 OPXfSBeufaJ8;
    public final be2 PxuCJdSBwIXG;
    public final boolean QrzZRwfaDlRX;
    public final int RAsUl2FVSrh6;
    public ti0 RfyTYNmI9Srp;
    public m9 S9EYkSpbGuxq;
    public final int TSizfFm2Yiuu;
    public ls1 VhhvGxCb8gfr;
    public Socket XL4ISE6Oc65B;
    public final int Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public final xb cpQdD2nAriOS;
    public final qx1 dgRBjINgWbAK;
    public final int e9gEMXR7LXtO;
    public volatile boolean gPXPFXrUH4XX;
    public final os1 lS5Rgt96tfkO;
    public final int r3s1LDPKFs1S;
    public final boolean rtx2ld2ELZv4;
    public final rs1 wdg6QnbFHrFF;
    public final List x50lh2ztY7Y5;

    public nq(be2 be2Var, os1 os1Var, int i, int i2, int i3, int i4, int i5, boolean z, js1 js1Var, rs1 rs1Var, qx1 qx1Var, List list, xb xbVar, int i6, boolean z2) {
        be2Var.getClass();
        os1Var.getClass();
        qx1Var.getClass();
        this.PxuCJdSBwIXG = be2Var;
        this.lS5Rgt96tfkO = os1Var;
        this.TSizfFm2Yiuu = i;
        this.Y1f8riQaR6yg = i2;
        this.e9gEMXR7LXtO = i3;
        this.a92UlCVFR9N8 = i4;
        this.RAsUl2FVSrh6 = i5;
        this.rtx2ld2ELZv4 = z;
        this.OPXfSBeufaJ8 = js1Var;
        this.wdg6QnbFHrFF = rs1Var;
        this.dgRBjINgWbAK = qx1Var;
        this.x50lh2ztY7Y5 = list;
        this.cpQdD2nAriOS = xbVar;
        this.r3s1LDPKFs1S = i6;
        this.QrzZRwfaDlRX = z2;
    }

    public final void OPXfSBeufaJ8() {
        Socket createSocket;
        Proxy.Type type = this.dgRBjINgWbAK.lS5Rgt96tfkO.type();
        int i = type == null ? -1 : mq.PxuCJdSBwIXG[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.dgRBjINgWbAK.PxuCJdSBwIXG.lS5Rgt96tfkO.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(this.dgRBjINgWbAK.lS5Rgt96tfkO);
        }
        this.BRwzKIf41E4i = createSocket;
        if (this.gPXPFXrUH4XX) {
            u9.S9EYkSpbGuxq("canceled");
            return;
        }
        createSocket.setSoTimeout(this.a92UlCVFR9N8);
        try {
            km1.Companion.getClass();
            km1.PxuCJdSBwIXG.e9gEMXR7LXtO(createSocket, this.dgRBjINgWbAK.TSizfFm2Yiuu, this.e9gEMXR7LXtO);
            try {
                this.S9EYkSpbGuxq = new m9(new e0(createSocket));
            } catch (NullPointerException e) {
                if (cs0.wdg6QnbFHrFF(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.dgRBjINgWbAK.TSizfFm2Yiuu);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.vx1
    public final vx1 PxuCJdSBwIXG() {
        return new nq(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6, this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX);
    }

    @Override // defpackage.vx1
    public final ux1 RAsUl2FVSrh6() {
        Socket socket;
        Socket socket2;
        if (this.BRwzKIf41E4i != null) {
            u9.rtx2ld2ELZv4("TCP already connected");
            return null;
        }
        this.OPXfSBeufaJ8.IAToe7bXGz4N.add(this);
        boolean z = false;
        try {
            try {
                s60 s60Var = this.OPXfSBeufaJ8.dgRBjINgWbAK;
                InetSocketAddress inetSocketAddress = this.dgRBjINgWbAK.TSizfFm2Yiuu;
                s60Var.getClass();
                inetSocketAddress.getClass();
                this.lS5Rgt96tfkO.getClass();
                this.dgRBjINgWbAK.getClass();
                OPXfSBeufaJ8();
                z = true;
                ux1 ux1Var = new ux1(this, (Throwable) null, 6);
                this.OPXfSBeufaJ8.IAToe7bXGz4N.remove(this);
                return ux1Var;
            } catch (IOException e) {
                qx1 qx1Var = this.dgRBjINgWbAK;
                o oVar = qx1Var.PxuCJdSBwIXG;
                if (qx1Var.lS5Rgt96tfkO.type() != Proxy.Type.DIRECT) {
                    o oVar2 = this.dgRBjINgWbAK.PxuCJdSBwIXG;
                    oVar2.RAsUl2FVSrh6.connectFailed(oVar2.rtx2ld2ELZv4.RAsUl2FVSrh6(), this.dgRBjINgWbAK.lS5Rgt96tfkO.address(), e);
                }
                s60 s60Var2 = this.OPXfSBeufaJ8.dgRBjINgWbAK;
                InetSocketAddress inetSocketAddress2 = this.dgRBjINgWbAK.TSizfFm2Yiuu;
                s60Var2.getClass();
                inetSocketAddress2.getClass();
                this.lS5Rgt96tfkO.getClass();
                this.dgRBjINgWbAK.getClass();
                ux1 ux1Var2 = new ux1(this, e, 2);
                this.OPXfSBeufaJ8.IAToe7bXGz4N.remove(this);
                if (!z && (socket2 = this.BRwzKIf41E4i) != null) {
                    mv2.TSizfFm2Yiuu(socket2);
                }
                return ux1Var2;
            }
        } catch (Throwable th) {
            this.OPXfSBeufaJ8.IAToe7bXGz4N.remove(this);
            if (!z && (socket = this.BRwzKIf41E4i) != null) {
                mv2.TSizfFm2Yiuu(socket);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    @Override // defpackage.vx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ux1 TSizfFm2Yiuu() {
        nq nqVar;
        nq nqVar2;
        Socket socket = this.BRwzKIf41E4i;
        nq nqVar3 = null;
        if (socket == null) {
            u9.XL4ISE6Oc65B("TCP not connected");
            return null;
        }
        if (e9gEMXR7LXtO()) {
            u9.rtx2ld2ELZv4("already connected");
            return null;
        }
        List list = this.dgRBjINgWbAK.PxuCJdSBwIXG.wdg6QnbFHrFF;
        this.OPXfSBeufaJ8.IAToe7bXGz4N.add(this);
        boolean z = false;
        try {
            try {
                if (this.cpQdD2nAriOS != null) {
                    ux1 dgRBjINgWbAK = dgRBjINgWbAK();
                    if (dgRBjINgWbAK.TSizfFm2Yiuu != null) {
                        this.OPXfSBeufaJ8.IAToe7bXGz4N.remove(this);
                        Socket socket2 = this.XL4ISE6Oc65B;
                        if (socket2 != null) {
                            mv2.TSizfFm2Yiuu(socket2);
                        }
                        mv2.TSizfFm2Yiuu(socket);
                        return dgRBjINgWbAK;
                    }
                }
                o oVar = this.dgRBjINgWbAK.PxuCJdSBwIXG;
                if (oVar.TSizfFm2Yiuu != null) {
                    m9 m9Var = this.S9EYkSpbGuxq;
                    if (m9Var == null) {
                        cs0.tmVwIGCQF4zR("socket");
                        throw null;
                    }
                    if (((es1) m9Var.wdg6QnbFHrFF).OPXfSBeufaJ8.OPXfSBeufaJ8()) {
                        m9 m9Var2 = this.S9EYkSpbGuxq;
                        if (m9Var2 == null) {
                            cs0.tmVwIGCQF4zR("socket");
                            throw null;
                        }
                        if (((ds1) m9Var2.dgRBjINgWbAK).OPXfSBeufaJ8.OPXfSBeufaJ8()) {
                            this.OPXfSBeufaJ8.dgRBjINgWbAK.getClass();
                            o oVar2 = this.dgRBjINgWbAK.PxuCJdSBwIXG;
                            SSLSocketFactory sSLSocketFactory = oVar2.TSizfFm2Yiuu;
                            gm0 gm0Var = oVar2.rtx2ld2ELZv4;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, gm0Var.Y1f8riQaR6yg, gm0Var.e9gEMXR7LXtO, true);
                            createSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            nq cpQdD2nAriOS = cpQdD2nAriOS(list, sSLSocket);
                            br brVar = (br) list.get(cpQdD2nAriOS.r3s1LDPKFs1S);
                            nqVar = cpQdD2nAriOS.x50lh2ztY7Y5(list, sSLSocket);
                            try {
                                brVar.PxuCJdSBwIXG(sSLSocket, cpQdD2nAriOS.QrzZRwfaDlRX);
                                wdg6QnbFHrFF(sSLSocket, brVar);
                                this.OPXfSBeufaJ8.dgRBjINgWbAK.getClass();
                                nqVar2 = nqVar;
                            } catch (IOException e) {
                                e = e;
                                s60 s60Var = this.OPXfSBeufaJ8.dgRBjINgWbAK;
                                InetSocketAddress inetSocketAddress = this.dgRBjINgWbAK.TSizfFm2Yiuu;
                                s60Var.getClass();
                                inetSocketAddress.getClass();
                                this.lS5Rgt96tfkO.getClass();
                                this.dgRBjINgWbAK.getClass();
                                if (this.rtx2ld2ELZv4 && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    nqVar3 = nqVar;
                                }
                                ux1 ux1Var = new ux1(this, nqVar3, e);
                                this.OPXfSBeufaJ8.IAToe7bXGz4N.remove(this);
                                if (!z) {
                                    Socket socket3 = this.XL4ISE6Oc65B;
                                    if (socket3 != null) {
                                        mv2.TSizfFm2Yiuu(socket3);
                                    }
                                    mv2.TSizfFm2Yiuu(socket);
                                }
                                return ux1Var;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.XL4ISE6Oc65B = socket;
                List list2 = oVar.OPXfSBeufaJ8;
                fr1 fr1Var = fr1.cpQdD2nAriOS;
                if (!list2.contains(fr1Var)) {
                    fr1Var = fr1.wdg6QnbFHrFF;
                }
                this.EcgxDIVH5in8 = fr1Var;
                nqVar2 = null;
                try {
                    be2 be2Var = this.PxuCJdSBwIXG;
                    os1 os1Var = this.lS5Rgt96tfkO;
                    qx1 qx1Var = this.dgRBjINgWbAK;
                    Socket socket4 = this.XL4ISE6Oc65B;
                    socket4.getClass();
                    ti0 ti0Var = this.RfyTYNmI9Srp;
                    fr1 fr1Var2 = this.EcgxDIVH5in8;
                    fr1Var2.getClass();
                    m9 m9Var3 = this.S9EYkSpbGuxq;
                    if (m9Var3 == null) {
                        cs0.tmVwIGCQF4zR("socket");
                        throw null;
                    }
                    int i = this.RAsUl2FVSrh6;
                    this.lS5Rgt96tfkO.getClass();
                    ls1 ls1Var = new ls1(be2Var, os1Var, qx1Var, socket, socket4, ti0Var, fr1Var2, m9Var3, i);
                    this.VhhvGxCb8gfr = ls1Var;
                    ls1Var.OPXfSBeufaJ8();
                    s60 s60Var2 = this.OPXfSBeufaJ8.dgRBjINgWbAK;
                    InetSocketAddress inetSocketAddress2 = this.dgRBjINgWbAK.TSizfFm2Yiuu;
                    s60Var2.getClass();
                    inetSocketAddress2.getClass();
                    try {
                        ux1 ux1Var2 = new ux1(this, (Throwable) null, 6);
                        this.OPXfSBeufaJ8.IAToe7bXGz4N.remove(this);
                        return ux1Var2;
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        nqVar = nqVar2;
                        s60 s60Var3 = this.OPXfSBeufaJ8.dgRBjINgWbAK;
                        InetSocketAddress inetSocketAddress3 = this.dgRBjINgWbAK.TSizfFm2Yiuu;
                        s60Var3.getClass();
                        inetSocketAddress3.getClass();
                        this.lS5Rgt96tfkO.getClass();
                        this.dgRBjINgWbAK.getClass();
                        if (this.rtx2ld2ELZv4) {
                            nqVar3 = nqVar;
                        }
                        ux1 ux1Var3 = new ux1(this, nqVar3, e);
                        this.OPXfSBeufaJ8.IAToe7bXGz4N.remove(this);
                        if (!z) {
                        }
                        return ux1Var3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        this.OPXfSBeufaJ8.IAToe7bXGz4N.remove(this);
                        if (!z) {
                            Socket socket5 = this.XL4ISE6Oc65B;
                            if (socket5 != null) {
                                mv2.TSizfFm2Yiuu(socket5);
                            }
                            mv2.TSizfFm2Yiuu(socket);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e = e4;
                nqVar = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.vx1
    public final ls1 Y1f8riQaR6yg() {
        i2 i2Var = this.OPXfSBeufaJ8.rtx2ld2ELZv4.jyegZNwi31qc;
        qx1 qx1Var = this.dgRBjINgWbAK;
        synchronized (i2Var) {
            qx1Var.getClass();
            ((LinkedHashSet) i2Var.OPXfSBeufaJ8).remove(qx1Var);
        }
        ls1 ls1Var = this.VhhvGxCb8gfr;
        ls1Var.getClass();
        this.dgRBjINgWbAK.getClass();
        ew1 Y1f8riQaR6yg = this.wdg6QnbFHrFF.Y1f8riQaR6yg(this, this.x50lh2ztY7Y5);
        if (Y1f8riQaR6yg != null) {
            return Y1f8riQaR6yg.PxuCJdSBwIXG;
        }
        synchronized (ls1Var) {
            os1 os1Var = this.lS5Rgt96tfkO;
            os1Var.getClass();
            TimeZone timeZone = mv2.PxuCJdSBwIXG;
            os1Var.Y1f8riQaR6yg.add(ls1Var);
            os1Var.lS5Rgt96tfkO.TSizfFm2Yiuu(os1Var.TSizfFm2Yiuu, 0L);
            this.OPXfSBeufaJ8.lS5Rgt96tfkO(ls1Var);
        }
        this.OPXfSBeufaJ8.dgRBjINgWbAK.getClass();
        return ls1Var;
    }

    @Override // defpackage.b70
    public final qx1 a92UlCVFR9N8() {
        return this.dgRBjINgWbAK;
    }

    @Override // defpackage.vx1
    public final void cancel() {
        this.gPXPFXrUH4XX = true;
        Socket socket = this.BRwzKIf41E4i;
        if (socket != null) {
            mv2.TSizfFm2Yiuu(socket);
        }
    }

    public final nq cpQdD2nAriOS(List list, SSLSocket sSLSocket) {
        list.getClass();
        if (this.r3s1LDPKFs1S != -1) {
            return this;
        }
        nq x50lh2ztY7Y5 = x50lh2ztY7Y5(list, sSLSocket);
        if (x50lh2ztY7Y5 != null) {
            return x50lh2ztY7Y5;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.QrzZRwfaDlRX);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String arrays = Arrays.toString(enabledProtocols);
        arrays.getClass();
        sb.append(", supported protocols=");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    public final ux1 dgRBjINgWbAK() {
        xb xbVar = this.cpQdD2nAriOS;
        xbVar.getClass();
        qx1 qx1Var = this.dgRBjINgWbAK;
        String str = "CONNECT " + mv2.rtx2ld2ELZv4(qx1Var.PxuCJdSBwIXG.rtx2ld2ELZv4, true) + " HTTP/1.1";
        m9 m9Var = this.S9EYkSpbGuxq;
        if (m9Var == null) {
            cs0.tmVwIGCQF4zR("socket");
            throw null;
        }
        yk0 yk0Var = new yk0(null, this, m9Var);
        m9 m9Var2 = this.S9EYkSpbGuxq;
        if (m9Var2 == null) {
            cs0.tmVwIGCQF4zR("socket");
            throw null;
        }
        yj2 TSizfFm2Yiuu = ((es1) m9Var2.wdg6QnbFHrFF).rtx2ld2ELZv4.TSizfFm2Yiuu();
        long j = this.TSizfFm2Yiuu;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TSizfFm2Yiuu.RAsUl2FVSrh6(j, timeUnit);
        m9 m9Var3 = this.S9EYkSpbGuxq;
        if (m9Var3 == null) {
            cs0.tmVwIGCQF4zR("socket");
            throw null;
        }
        ((ds1) m9Var3.dgRBjINgWbAK).rtx2ld2ELZv4.TSizfFm2Yiuu().RAsUl2FVSrh6(this.Y1f8riQaR6yg, timeUnit);
        yk0Var.dgRBjINgWbAK((hj0) xbVar.Y1f8riQaR6yg, str);
        yk0Var.TSizfFm2Yiuu();
        mv1 OPXfSBeufaJ8 = yk0Var.OPXfSBeufaJ8(false);
        OPXfSBeufaJ8.getClass();
        OPXfSBeufaJ8.PxuCJdSBwIXG = xbVar;
        nv1 PxuCJdSBwIXG = OPXfSBeufaJ8.PxuCJdSBwIXG();
        int i = PxuCJdSBwIXG.dgRBjINgWbAK;
        long e9gEMXR7LXtO = mv2.e9gEMXR7LXtO(PxuCJdSBwIXG);
        if (e9gEMXR7LXtO != -1) {
            wk0 wdg6QnbFHrFF = yk0Var.wdg6QnbFHrFF((gm0) PxuCJdSBwIXG.rtx2ld2ELZv4.lS5Rgt96tfkO, e9gEMXR7LXtO);
            mv2.a92UlCVFR9N8(wdg6QnbFHrFF, Integer.MAX_VALUE);
            wdg6QnbFHrFF.close();
        }
        if (i == 200) {
            return new ux1(this, (Throwable) null, 6);
        }
        if (i != 407) {
            u9.S9EYkSpbGuxq(o0.wdg6QnbFHrFF("Unexpected response code for CONNECT: ", i));
            return null;
        }
        qx1Var.PxuCJdSBwIXG.a92UlCVFR9N8.getClass();
        u9.S9EYkSpbGuxq("Failed to authenticate with proxy");
        return null;
    }

    @Override // defpackage.vx1
    public final boolean e9gEMXR7LXtO() {
        return this.EcgxDIVH5in8 != null;
    }

    public final void wdg6QnbFHrFF(SSLSocket sSLSocket, br brVar) {
        fr1 fr1Var;
        o oVar = this.dgRBjINgWbAK.PxuCJdSBwIXG;
        try {
            if (brVar.lS5Rgt96tfkO) {
                km1.Companion.getClass();
                km1.PxuCJdSBwIXG.Y1f8riQaR6yg(sSLSocket, oVar.rtx2ld2ELZv4.Y1f8riQaR6yg, oVar.OPXfSBeufaJ8);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            si0 si0Var = ti0.Companion;
            session.getClass();
            si0Var.getClass();
            ti0 PxuCJdSBwIXG = si0.PxuCJdSBwIXG(session);
            HostnameVerifier hostnameVerifier = oVar.Y1f8riQaR6yg;
            hostnameVerifier.getClass();
            boolean verify = hostnameVerifier.verify(oVar.rtx2ld2ELZv4.Y1f8riQaR6yg, session);
            int i = 2;
            if (verify) {
                ri riVar = oVar.e9gEMXR7LXtO;
                riVar.getClass();
                this.RfyTYNmI9Srp = new ti0(PxuCJdSBwIXG.PxuCJdSBwIXG, PxuCJdSBwIXG.lS5Rgt96tfkO, PxuCJdSBwIXG.TSizfFm2Yiuu, new vb(riVar, PxuCJdSBwIXG, oVar, i));
                oVar.rtx2ld2ELZv4.Y1f8riQaR6yg.getClass();
                Iterator it = riVar.PxuCJdSBwIXG.iterator();
                String str = null;
                if (it.hasNext()) {
                    o0.ZbWwgt3aGe7A(it.next());
                    throw null;
                }
                if (brVar.lS5Rgt96tfkO) {
                    km1.Companion.getClass();
                    str = km1.PxuCJdSBwIXG.a92UlCVFR9N8(sSLSocket);
                }
                this.XL4ISE6Oc65B = sSLSocket;
                this.S9EYkSpbGuxq = new m9(new e0(sSLSocket));
                if (str != null) {
                    fr1.Companion.getClass();
                    fr1Var = er1.PxuCJdSBwIXG(str);
                } else {
                    fr1Var = fr1.wdg6QnbFHrFF;
                }
                this.EcgxDIVH5in8 = fr1Var;
                km1.Companion.getClass();
                km1.PxuCJdSBwIXG.getClass();
                return;
            }
            List PxuCJdSBwIXG2 = PxuCJdSBwIXG.PxuCJdSBwIXG();
            if (PxuCJdSBwIXG2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + oVar.rtx2ld2ELZv4.Y1f8riQaR6yg + " not verified (no certificates)");
            }
            Object obj = PxuCJdSBwIXG2.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(oVar.rtx2ld2ELZv4.Y1f8riQaR6yg);
            sb.append(" not verified:\n            |    certificate: ");
            ri.Companion.getClass();
            StringBuilder sb2 = new StringBuilder("sha256/");
            zg zgVar = ah.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb2.append(zg.TSizfFm2Yiuu(zgVar, encoded).lS5Rgt96tfkO("SHA-256").PxuCJdSBwIXG());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(zk.wcHq2YQJmeHg(ff1.PxuCJdSBwIXG(x509Certificate, 7), ff1.PxuCJdSBwIXG(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(ja2.zf8DYfih6EZu(sb.toString()));
        } catch (Throwable th) {
            km1.Companion.getClass();
            km1.PxuCJdSBwIXG.getClass();
            mv2.TSizfFm2Yiuu(sSLSocket);
            throw th;
        }
    }

    public final nq x50lh2ztY7Y5(List list, SSLSocket sSLSocket) {
        String[] strArr;
        list.getClass();
        int i = this.r3s1LDPKFs1S;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            br brVar = (br) list.get(i2);
            brVar.getClass();
            if (brVar.PxuCJdSBwIXG && ((strArr = brVar.Y1f8riQaR6yg) == null || kv2.e9gEMXR7LXtO(strArr, sSLSocket.getEnabledProtocols(), u91.lS5Rgt96tfkO))) {
                String[] strArr2 = brVar.TSizfFm2Yiuu;
                if (strArr2 != null) {
                    String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                    yj.Companion.getClass();
                    if (!kv2.e9gEMXR7LXtO(strArr2, enabledCipherSuites, yj.lS5Rgt96tfkO)) {
                    }
                }
                return new nq(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu, this.Y1f8riQaR6yg, this.e9gEMXR7LXtO, this.a92UlCVFR9N8, this.RAsUl2FVSrh6, this.rtx2ld2ELZv4, this.OPXfSBeufaJ8, this.wdg6QnbFHrFF, this.dgRBjINgWbAK, this.x50lh2ztY7Y5, this.cpQdD2nAriOS, i2, i != -1);
            }
        }
        return null;
    }

    @Override // defpackage.b70
    public final void rtx2ld2ELZv4() {
    }

    @Override // defpackage.b70
    public final void lS5Rgt96tfkO(js1 js1Var, IOException iOException) {
    }
}
