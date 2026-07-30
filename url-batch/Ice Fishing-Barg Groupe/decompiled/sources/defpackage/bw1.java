package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bw1 implements pr0 {
    public static final aw1 Companion = new aw1();

    public static boolean TSizfFm2Yiuu(IOException iOException, js1 js1Var, ps1 ps1Var, xb xbVar) {
        boolean z = iOException instanceof yq;
        if (!ps1Var.BRwzKIf41E4i) {
            return false;
        }
        if ((!z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        jv jvVar = js1Var.pnx5pC0XzaCw;
        if (jvVar == null || !jvVar.PxuCJdSBwIXG) {
            return false;
        }
        e70 e70Var = js1Var.QrzZRwfaDlRX;
        e70Var.getClass();
        rs1 e9gEMXR7LXtO = e70Var.e9gEMXR7LXtO();
        jv jvVar2 = js1Var.pnx5pC0XzaCw;
        return e9gEMXR7LXtO.PxuCJdSBwIXG(jvVar2 != null ? jvVar2.TSizfFm2Yiuu() : null);
    }

    public static int Y1f8riQaR6yg(nv1 nv1Var, int i) {
        String PxuCJdSBwIXG = nv1Var.cpQdD2nAriOS.PxuCJdSBwIXG("Retry-After");
        if (PxuCJdSBwIXG == null) {
            PxuCJdSBwIXG = null;
        }
        if (PxuCJdSBwIXG == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(PxuCJdSBwIXG).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(PxuCJdSBwIXG);
        valueOf.getClass();
        return valueOf.intValue();
    }

    public static xb lS5Rgt96tfkO(nv1 nv1Var, jv jvVar, ps1 ps1Var) {
        em0 em0Var;
        nv1 nv1Var2;
        qx1 qx1Var = jvVar != null ? jvVar.TSizfFm2Yiuu().TSizfFm2Yiuu : null;
        int i = nv1Var.dgRBjINgWbAK;
        String str = (String) nv1Var.rtx2ld2ELZv4.TSizfFm2Yiuu;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ps1Var.OPXfSBeufaJ8.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    nv1 nv1Var3 = nv1Var.XL4ISE6Oc65B;
                    if ((nv1Var3 == null || nv1Var3.dgRBjINgWbAK != 503) && Y1f8riQaR6yg(nv1Var, Integer.MAX_VALUE) == 0) {
                        return nv1Var.rtx2ld2ELZv4;
                    }
                } else {
                    if (i == 407) {
                        qx1Var.getClass();
                        if (qx1Var.lS5Rgt96tfkO.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ps1Var.QrzZRwfaDlRX.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (ps1Var.BRwzKIf41E4i && (((nv1Var2 = nv1Var.XL4ISE6Oc65B) == null || nv1Var2.dgRBjINgWbAK != 408) && Y1f8riQaR6yg(nv1Var, 0) <= 0)) {
                        return nv1Var.rtx2ld2ELZv4;
                    }
                }
            } else if (jvVar != null && !cs0.wdg6QnbFHrFF(((e70) jvVar.TSizfFm2Yiuu).e9gEMXR7LXtO().wdg6QnbFHrFF.rtx2ld2ELZv4.Y1f8riQaR6yg, ((d70) jvVar.Y1f8riQaR6yg).RAsUl2FVSrh6().a92UlCVFR9N8().PxuCJdSBwIXG.rtx2ld2ELZv4.Y1f8riQaR6yg)) {
                ls1 TSizfFm2Yiuu = jvVar.TSizfFm2Yiuu();
                synchronized (TSizfFm2Yiuu) {
                    TSizfFm2Yiuu.x50lh2ztY7Y5 = true;
                }
                return nv1Var.rtx2ld2ELZv4;
            }
            return null;
        }
        if (ps1Var.PxuCJdSBwIXG.rtx2ld2ELZv4.rtx2ld2ELZv4) {
            String PxuCJdSBwIXG = nv1Var.cpQdD2nAriOS.PxuCJdSBwIXG("Location");
            if (PxuCJdSBwIXG == null) {
                PxuCJdSBwIXG = null;
            }
            xb xbVar = nv1Var.rtx2ld2ELZv4;
            if (PxuCJdSBwIXG != null) {
                gm0 gm0Var = (gm0) xbVar.lS5Rgt96tfkO;
                gm0Var.getClass();
                try {
                    em0Var = new em0();
                    em0Var.lS5Rgt96tfkO(gm0Var, PxuCJdSBwIXG);
                } catch (IllegalArgumentException unused) {
                    em0Var = null;
                }
                gm0 PxuCJdSBwIXG2 = em0Var != null ? em0Var.PxuCJdSBwIXG() : null;
                if (PxuCJdSBwIXG2 != null && (cs0.wdg6QnbFHrFF(PxuCJdSBwIXG2.PxuCJdSBwIXG, ((gm0) xbVar.lS5Rgt96tfkO).PxuCJdSBwIXG) || ps1Var.PxuCJdSBwIXG.rtx2ld2ELZv4.OPXfSBeufaJ8)) {
                    e0 r3s1LDPKFs1S = xbVar.r3s1LDPKFs1S();
                    if (jh0.jyegZNwi31qc(str)) {
                        int i2 = nv1Var.dgRBjINgWbAK;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            r3s1LDPKFs1S.RfyTYNmI9Srp(str, null);
                        } else {
                            r3s1LDPKFs1S.RfyTYNmI9Srp("GET", null);
                        }
                        if (!z) {
                            ((jd0) r3s1LDPKFs1S.dgRBjINgWbAK).TSizfFm2Yiuu("Transfer-Encoding");
                            ((jd0) r3s1LDPKFs1S.dgRBjINgWbAK).TSizfFm2Yiuu("Content-Length");
                            ((jd0) r3s1LDPKFs1S.dgRBjINgWbAK).TSizfFm2Yiuu("Content-Type");
                        }
                    }
                    if (!mv2.PxuCJdSBwIXG((gm0) xbVar.lS5Rgt96tfkO, PxuCJdSBwIXG2)) {
                        ((jd0) r3s1LDPKFs1S.dgRBjINgWbAK).TSizfFm2Yiuu("Authorization");
                    }
                    r3s1LDPKFs1S.OPXfSBeufaJ8 = PxuCJdSBwIXG2;
                    return new xb(r3s1LDPKFs1S);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    @Override // defpackage.pr0
    public final nv1 PxuCJdSBwIXG(ps1 ps1Var) {
        p50 p50Var;
        boolean z;
        boolean z2;
        boolean z3;
        nv1 ozEBbv0hFTAB;
        nv1 PxuCJdSBwIXG;
        boolean z4;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        ri riVar;
        ps1 ps1Var2 = ps1Var;
        xb xbVar = ps1Var2.e9gEMXR7LXtO;
        js1 js1Var = ps1Var2.PxuCJdSBwIXG;
        p50 p50Var2 = p50.rtx2ld2ELZv4;
        boolean z5 = false;
        boolean z6 = true;
        xb xbVar2 = xbVar;
        int i = 0;
        boolean z7 = true;
        nv1 nv1Var = null;
        while (js1Var.XL4ISE6Oc65B == null) {
            synchronized (js1Var) {
                if (js1Var.EcgxDIVH5in8) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
                if (js1Var.RfyTYNmI9Srp || js1Var.VhhvGxCb8gfr || js1Var.S9EYkSpbGuxq) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            if (z7) {
                p50 p50Var3 = p50Var2;
                if1 if1Var = js1Var.rtx2ld2ELZv4;
                be2 be2Var = if1Var.aF05bpZJlKEP;
                os1 os1Var = (os1) ps1Var2.dgRBjINgWbAK.OPXfSBeufaJ8;
                int i2 = ps1Var2.RAsUl2FVSrh6;
                int i3 = ps1Var2.rtx2ld2ELZv4;
                int i4 = ps1Var2.a92UlCVFR9N8;
                int i5 = if1Var.pnx5pC0XzaCw;
                z2 = ps1Var2.BRwzKIf41E4i;
                boolean z8 = if1Var.a92UlCVFR9N8;
                gm0 gm0Var = (gm0) xbVar2.lS5Rgt96tfkO;
                gm0Var.getClass();
                if (cs0.wdg6QnbFHrFF(gm0Var.PxuCJdSBwIXG, "https")) {
                    SSLSocketFactory sSLSocketFactory2 = ps1Var2.RfyTYNmI9Srp;
                    HostnameVerifier hostnameVerifier2 = ps1Var2.r3s1LDPKFs1S;
                    z4 = z8;
                    riVar = ps1Var2.wdg6QnbFHrFF;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    z4 = z8;
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    riVar = null;
                }
                String str = gm0Var.Y1f8riQaR6yg;
                int i6 = gm0Var.e9gEMXR7LXtO;
                a10 a10Var = ps1Var2.cpQdD2nAriOS;
                SocketFactory socketFactory = ps1Var2.XL4ISE6Oc65B;
                db dbVar = ps1Var2.QrzZRwfaDlRX;
                if1 if1Var2 = ps1Var2.PxuCJdSBwIXG.rtx2ld2ELZv4;
                p50Var = p50Var3;
                z = false;
                ?? r1 = 0;
                rs1 rs1Var = new rs1(be2Var, os1Var, i2, i3, i4, i2, i5, z2, z4, new o(str, i6, a10Var, socketFactory, sSLSocketFactory, hostnameVerifier, riVar, dbVar, if1Var2.XL4ISE6Oc65B, if1Var2.BRwzKIf41E4i, ps1Var2.gPXPFXrUH4XX), js1Var.rtx2ld2ELZv4.jyegZNwi31qc, js1Var, xbVar2);
                if1 if1Var3 = js1Var.rtx2ld2ELZv4;
                js1Var.QrzZRwfaDlRX = if1Var3.a92UlCVFR9N8 ? new q70(rs1Var, if1Var3.aF05bpZJlKEP) : new b42((int) (r1 == true ? 1 : 0), rs1Var);
            } else {
                p50Var = p50Var2;
                z = z5;
            }
            try {
                if (js1Var.ZbWwgt3aGe7A) {
                    throw new IOException("Canceled");
                }
                try {
                    mv1 lS5Rgt96tfkO = ps1Var.lS5Rgt96tfkO(xbVar2).lS5Rgt96tfkO();
                    lS5Rgt96tfkO.PxuCJdSBwIXG = xbVar2;
                    if (nv1Var != null) {
                        try {
                            ozEBbv0hFTAB = ng0.ozEBbv0hFTAB(nv1Var);
                        } catch (Throwable th) {
                            th = th;
                            z3 = true;
                            js1Var.e9gEMXR7LXtO(z3);
                            throw th;
                        }
                    } else {
                        ozEBbv0hFTAB = null;
                    }
                    lS5Rgt96tfkO.dgRBjINgWbAK = ozEBbv0hFTAB;
                    PxuCJdSBwIXG = lS5Rgt96tfkO.PxuCJdSBwIXG();
                    xbVar2 = lS5Rgt96tfkO(PxuCJdSBwIXG, js1Var.XL4ISE6Oc65B, ps1Var);
                } catch (IOException e) {
                    try {
                        z2 = true;
                        boolean TSizfFm2Yiuu = TSizfFm2Yiuu(e, js1Var, ps1Var, xbVar2);
                        js1Var.dgRBjINgWbAK.getClass();
                        if (!TSizfFm2Yiuu) {
                            byte[] bArr = kv2.PxuCJdSBwIXG;
                            Iterator it = p50Var.iterator();
                            while (it.hasNext()) {
                                f2.RAsUl2FVSrh6(e, (Exception) it.next());
                            }
                            throw e;
                        }
                        ?? P6VAkUObIv30 = zk.P6VAkUObIv30(p50Var, e);
                        js1Var.e9gEMXR7LXtO(true);
                        z5 = z;
                        z6 = true;
                        ps1Var2 = ps1Var;
                        p50Var2 = P6VAkUObIv30;
                        z7 = z5;
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = z2;
                        js1Var.e9gEMXR7LXtO(z3);
                        throw th;
                    }
                }
                if (xbVar2 == null) {
                    try {
                        js1Var.dgRBjINgWbAK.getClass();
                        js1Var.e9gEMXR7LXtO(z);
                        return PxuCJdSBwIXG;
                    } catch (Throwable th3) {
                        th = th3;
                        z3 = z;
                        js1Var.e9gEMXR7LXtO(z3);
                        throw th;
                    }
                }
                kv2.PxuCJdSBwIXG(PxuCJdSBwIXG.r3s1LDPKFs1S);
                int i7 = i + 1;
                s60 s60Var = js1Var.dgRBjINgWbAK;
                if (i7 > 20) {
                    s60Var.getClass();
                    throw new ProtocolException("Too many follow-up requests: " + i7);
                }
                s60Var.getClass();
                z2 = true;
                js1Var.e9gEMXR7LXtO(true);
                nv1Var = PxuCJdSBwIXG;
                i = i7;
                z7 = true;
                z6 = true;
                z5 = z;
                ps1Var2 = ps1Var;
                p50Var2 = p50Var;
            } catch (Throwable th4) {
                th = th4;
                z2 = true;
            }
        }
        u9.rtx2ld2ELZv4("Check failed.");
        return null;
    }
}
