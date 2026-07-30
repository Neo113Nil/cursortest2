package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ph implements pr0 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public static final ph lS5Rgt96tfkO = new ph(0);
    public static final ph TSizfFm2Yiuu = new ph(1);

    public /* synthetic */ ph(int i) {
        this.PxuCJdSBwIXG = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02ed, code lost:
    
        if (r2.equalsIgnoreCase(r1 == null ? null : r1) != false) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027b A[Catch: IOException -> 0x024e, TryCatch #6 {IOException -> 0x024e, blocks: (B:84:0x01f9, B:89:0x022e, B:95:0x0251, B:99:0x0263, B:104:0x0271, B:105:0x0278, B:108:0x027b, B:111:0x0284, B:116:0x0290, B:117:0x02c9, B:119:0x02de, B:122:0x02e9, B:129:0x0302, B:131:0x030f, B:132:0x0333, B:134:0x02ef, B:135:0x02b2), top: B:83:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02de A[Catch: IOException -> 0x024e, TryCatch #6 {IOException -> 0x024e, blocks: (B:84:0x01f9, B:89:0x022e, B:95:0x0251, B:99:0x0263, B:104:0x0271, B:105:0x0278, B:108:0x027b, B:111:0x0284, B:116:0x0290, B:117:0x02c9, B:119:0x02de, B:122:0x02e9, B:129:0x0302, B:131:0x030f, B:132:0x0333, B:134:0x02ef, B:135:0x02b2), top: B:83:0x01f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0263 A[Catch: IOException -> 0x024e, TryCatch #6 {IOException -> 0x024e, blocks: (B:84:0x01f9, B:89:0x022e, B:95:0x0251, B:99:0x0263, B:104:0x0271, B:105:0x0278, B:108:0x027b, B:111:0x0284, B:116:0x0290, B:117:0x02c9, B:119:0x02de, B:122:0x02e9, B:129:0x0302, B:131:0x030f, B:132:0x0333, B:134:0x02ef, B:135:0x02b2), top: B:83:0x01f9 }] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v30 */
    @Override // defpackage.pr0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nv1 PxuCJdSBwIXG(ps1 ps1Var) {
        String str;
        long j;
        IOException iOException;
        long j2;
        nv1 PxuCJdSBwIXG;
        int i;
        boolean z;
        nv1 PxuCJdSBwIXG2;
        xb xbVar;
        String str2;
        d70 yk0Var;
        boolean z2 = true;
        switch (this.PxuCJdSBwIXG) {
            case 0:
                ?? r4 = 0;
                r4 = 0;
                jv jvVar = ps1Var.Y1f8riQaR6yg;
                jvVar.getClass();
                xb xbVar2 = ps1Var.e9gEMXR7LXtO;
                long currentTimeMillis = System.currentTimeMillis();
                jh0.jyegZNwi31qc((String) xbVar2.TSizfFm2Yiuu);
                boolean equalsIgnoreCase = "upgrade".equalsIgnoreCase(((hj0) xbVar2.Y1f8riQaR6yg).PxuCJdSBwIXG("Connection"));
                try {
                    try {
                        ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
                        ((d70) jvVar.Y1f8riQaR6yg).PxuCJdSBwIXG(xbVar2);
                        ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
                        try {
                            str = "close";
                            r4 = currentTimeMillis;
                            ((js1) jvVar.lS5Rgt96tfkO).RAsUl2FVSrh6(jvVar, true, false, false, false, null);
                            try {
                                ((d70) jvVar.Y1f8riQaR6yg).TSizfFm2Yiuu();
                                iOException = null;
                                j2 = r4;
                            } catch (IOException e) {
                                ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
                                jvVar.a92UlCVFR9N8(e);
                                throw e;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            str = "close";
                            j = currentTimeMillis;
                            if (!(e instanceof yq)) {
                                throw e;
                            }
                            if (!jvVar.PxuCJdSBwIXG) {
                                throw e;
                            }
                            iOException = e;
                            j2 = j;
                            mv1 e9gEMXR7LXtO = jvVar.e9gEMXR7LXtO(false);
                            e9gEMXR7LXtO.getClass();
                            ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
                            e9gEMXR7LXtO.PxuCJdSBwIXG = xbVar2;
                            e9gEMXR7LXtO.e9gEMXR7LXtO = jvVar.TSizfFm2Yiuu().a92UlCVFR9N8;
                            e9gEMXR7LXtO.x50lh2ztY7Y5 = j2;
                            e9gEMXR7LXtO.cpQdD2nAriOS = System.currentTimeMillis();
                            PxuCJdSBwIXG = e9gEMXR7LXtO.PxuCJdSBwIXG();
                            i = PxuCJdSBwIXG.dgRBjINgWbAK;
                            while (true) {
                                if (i == 100) {
                                }
                                mv1 e9gEMXR7LXtO2 = jvVar.e9gEMXR7LXtO(false);
                                e9gEMXR7LXtO2.getClass();
                                e9gEMXR7LXtO2.PxuCJdSBwIXG = xbVar2;
                                e9gEMXR7LXtO2.e9gEMXR7LXtO = jvVar.TSizfFm2Yiuu().a92UlCVFR9N8;
                                e9gEMXR7LXtO2.x50lh2ztY7Y5 = j2;
                                e9gEMXR7LXtO2.cpQdD2nAriOS = System.currentTimeMillis();
                                PxuCJdSBwIXG = e9gEMXR7LXtO2.PxuCJdSBwIXG();
                                i = PxuCJdSBwIXG.dgRBjINgWbAK;
                            }
                            ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
                            if (i != 101) {
                            }
                            if (z) {
                            }
                            if (z) {
                            }
                            z2 = false;
                            if (equalsIgnoreCase) {
                            }
                            qs1 Y1f8riQaR6yg = jvVar.Y1f8riQaR6yg(PxuCJdSBwIXG);
                            mv1 lS5Rgt96tfkO2 = PxuCJdSBwIXG.lS5Rgt96tfkO();
                            lS5Rgt96tfkO2.RAsUl2FVSrh6 = Y1f8riQaR6yg;
                            lS5Rgt96tfkO2.QrzZRwfaDlRX = new jx1(22);
                            PxuCJdSBwIXG2 = lS5Rgt96tfkO2.PxuCJdSBwIXG();
                            xbVar = PxuCJdSBwIXG2.rtx2ld2ELZv4;
                            xbVar.getClass();
                            str2 = str;
                            if (!str2.equalsIgnoreCase(((hj0) xbVar.Y1f8riQaR6yg).PxuCJdSBwIXG("Connection"))) {
                            }
                            ((d70) jvVar.Y1f8riQaR6yg).RAsUl2FVSrh6().rtx2ld2ELZv4();
                            if (i == 204) {
                            }
                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + PxuCJdSBwIXG2.r3s1LDPKFs1S.lS5Rgt96tfkO());
                        }
                    } catch (IOException e3) {
                        ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
                        jvVar.a92UlCVFR9N8(e3);
                        throw e3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    j = r4;
                    if (!(e instanceof yq)) {
                    }
                }
                try {
                    mv1 e9gEMXR7LXtO3 = jvVar.e9gEMXR7LXtO(false);
                    e9gEMXR7LXtO3.getClass();
                    ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
                    e9gEMXR7LXtO3.PxuCJdSBwIXG = xbVar2;
                    e9gEMXR7LXtO3.e9gEMXR7LXtO = jvVar.TSizfFm2Yiuu().a92UlCVFR9N8;
                    e9gEMXR7LXtO3.x50lh2ztY7Y5 = j2;
                    e9gEMXR7LXtO3.cpQdD2nAriOS = System.currentTimeMillis();
                    PxuCJdSBwIXG = e9gEMXR7LXtO3.PxuCJdSBwIXG();
                    i = PxuCJdSBwIXG.dgRBjINgWbAK;
                    while (true) {
                        if (i == 100 && (102 > i || i >= 200)) {
                        }
                        mv1 e9gEMXR7LXtO22 = jvVar.e9gEMXR7LXtO(false);
                        e9gEMXR7LXtO22.getClass();
                        e9gEMXR7LXtO22.PxuCJdSBwIXG = xbVar2;
                        e9gEMXR7LXtO22.e9gEMXR7LXtO = jvVar.TSizfFm2Yiuu().a92UlCVFR9N8;
                        e9gEMXR7LXtO22.x50lh2ztY7Y5 = j2;
                        e9gEMXR7LXtO22.cpQdD2nAriOS = System.currentTimeMillis();
                        PxuCJdSBwIXG = e9gEMXR7LXtO22.PxuCJdSBwIXG();
                        i = PxuCJdSBwIXG.dgRBjINgWbAK;
                    }
                    ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
                    z = i != 101;
                    if (z) {
                        if (jvVar.TSizfFm2Yiuu().wdg6QnbFHrFF != null) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                    }
                    if (z) {
                        String PxuCJdSBwIXG3 = PxuCJdSBwIXG.cpQdD2nAriOS.PxuCJdSBwIXG("Connection");
                        if (PxuCJdSBwIXG3 == null) {
                            PxuCJdSBwIXG3 = null;
                        }
                        if ("upgrade".equalsIgnoreCase(PxuCJdSBwIXG3)) {
                            if (equalsIgnoreCase || !z2) {
                                qs1 Y1f8riQaR6yg2 = jvVar.Y1f8riQaR6yg(PxuCJdSBwIXG);
                                mv1 lS5Rgt96tfkO22 = PxuCJdSBwIXG.lS5Rgt96tfkO();
                                lS5Rgt96tfkO22.RAsUl2FVSrh6 = Y1f8riQaR6yg2;
                                lS5Rgt96tfkO22.QrzZRwfaDlRX = new jx1(22);
                                PxuCJdSBwIXG2 = lS5Rgt96tfkO22.PxuCJdSBwIXG();
                            } else {
                                mv1 lS5Rgt96tfkO3 = PxuCJdSBwIXG.lS5Rgt96tfkO();
                                lS5Rgt96tfkO3.RAsUl2FVSrh6 = new uo2(PxuCJdSBwIXG.r3s1LDPKFs1S.a92UlCVFR9N8(), PxuCJdSBwIXG.r3s1LDPKFs1S.lS5Rgt96tfkO());
                                lS5Rgt96tfkO3.rtx2ld2ELZv4 = jvVar.RAsUl2FVSrh6();
                                PxuCJdSBwIXG2 = lS5Rgt96tfkO3.PxuCJdSBwIXG();
                            }
                            xbVar = PxuCJdSBwIXG2.rtx2ld2ELZv4;
                            xbVar.getClass();
                            str2 = str;
                            if (!str2.equalsIgnoreCase(((hj0) xbVar.Y1f8riQaR6yg).PxuCJdSBwIXG("Connection"))) {
                                String PxuCJdSBwIXG4 = PxuCJdSBwIXG2.cpQdD2nAriOS.PxuCJdSBwIXG("Connection");
                                break;
                            }
                            ((d70) jvVar.Y1f8riQaR6yg).RAsUl2FVSrh6().rtx2ld2ELZv4();
                            if ((i == 204 && i != 205) || PxuCJdSBwIXG2.r3s1LDPKFs1S.lS5Rgt96tfkO() <= 0) {
                                return PxuCJdSBwIXG2;
                            }
                            throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + PxuCJdSBwIXG2.r3s1LDPKFs1S.lS5Rgt96tfkO());
                        }
                    }
                    z2 = false;
                    if (equalsIgnoreCase) {
                    }
                    qs1 Y1f8riQaR6yg22 = jvVar.Y1f8riQaR6yg(PxuCJdSBwIXG);
                    mv1 lS5Rgt96tfkO222 = PxuCJdSBwIXG.lS5Rgt96tfkO();
                    lS5Rgt96tfkO222.RAsUl2FVSrh6 = Y1f8riQaR6yg22;
                    lS5Rgt96tfkO222.QrzZRwfaDlRX = new jx1(22);
                    PxuCJdSBwIXG2 = lS5Rgt96tfkO222.PxuCJdSBwIXG();
                    xbVar = PxuCJdSBwIXG2.rtx2ld2ELZv4;
                    xbVar.getClass();
                    str2 = str;
                    if (!str2.equalsIgnoreCase(((hj0) xbVar.Y1f8riQaR6yg).PxuCJdSBwIXG("Connection"))) {
                    }
                    ((d70) jvVar.Y1f8riQaR6yg).RAsUl2FVSrh6().rtx2ld2ELZv4();
                    if (i == 204) {
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + PxuCJdSBwIXG2.r3s1LDPKFs1S.lS5Rgt96tfkO());
                } catch (IOException e5) {
                    if (iOException == null) {
                        throw e5;
                    }
                    f2.RAsUl2FVSrh6(iOException, e5);
                    throw iOException;
                }
            case 1:
                js1 js1Var = ps1Var.PxuCJdSBwIXG;
                synchronized (js1Var) {
                    if (!js1Var.S2OOm9zPNm0h) {
                        throw new IllegalStateException("released");
                    }
                    if (js1Var.EcgxDIVH5in8 || js1Var.RfyTYNmI9Srp || js1Var.VhhvGxCb8gfr || js1Var.S9EYkSpbGuxq) {
                        throw new IllegalStateException("Check failed.");
                    }
                }
                e70 e70Var = js1Var.QrzZRwfaDlRX;
                e70Var.getClass();
                ls1 Y1f8riQaR6yg3 = e70Var.Y1f8riQaR6yg();
                if1 if1Var = js1Var.rtx2ld2ELZv4;
                Y1f8riQaR6yg3.getClass();
                int i2 = ps1Var.RAsUl2FVSrh6;
                m9 m9Var = Y1f8riQaR6yg3.rtx2ld2ELZv4;
                ll0 ll0Var = Y1f8riQaR6yg3.wdg6QnbFHrFF;
                if (ll0Var != null) {
                    yk0Var = new nl0(if1Var, Y1f8riQaR6yg3, ps1Var, ll0Var);
                } else {
                    Y1f8riQaR6yg3.e9gEMXR7LXtO.setSoTimeout(i2);
                    yj2 TSizfFm2Yiuu2 = ((es1) m9Var.wdg6QnbFHrFF).rtx2ld2ELZv4.TSizfFm2Yiuu();
                    long j3 = i2;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    TSizfFm2Yiuu2.RAsUl2FVSrh6(j3, timeUnit);
                    ((ds1) m9Var.dgRBjINgWbAK).rtx2ld2ELZv4.TSizfFm2Yiuu().RAsUl2FVSrh6(ps1Var.rtx2ld2ELZv4, timeUnit);
                    yk0Var = new yk0(if1Var, Y1f8riQaR6yg3, m9Var);
                }
                jv jvVar2 = new jv(js1Var, e70Var, yk0Var);
                js1Var.XL4ISE6Oc65B = jvVar2;
                js1Var.pnx5pC0XzaCw = jvVar2;
                synchronized (js1Var) {
                    js1Var.RfyTYNmI9Srp = true;
                    js1Var.EcgxDIVH5in8 = true;
                }
                if (!js1Var.ZbWwgt3aGe7A) {
                    return ps1.PxuCJdSBwIXG(ps1Var, 0, jvVar2, null, 2097149).lS5Rgt96tfkO(ps1Var.e9gEMXR7LXtO);
                }
                u9.S9EYkSpbGuxq("Canceled");
                return null;
            default:
                gt gtVar = ps1Var.x50lh2ztY7Y5;
                xb xbVar3 = ps1Var.e9gEMXR7LXtO;
                e0 r3s1LDPKFs1S = xbVar3.r3s1LDPKFs1S();
                gm0 gm0Var = (gm0) xbVar3.lS5Rgt96tfkO;
                hj0 hj0Var = (hj0) xbVar3.Y1f8riQaR6yg;
                if (hj0Var.PxuCJdSBwIXG("Host") == null) {
                    r3s1LDPKFs1S.cpQdD2nAriOS("Host", mv2.rtx2ld2ELZv4(gm0Var, false));
                }
                if (hj0Var.PxuCJdSBwIXG("Connection") == null) {
                    r3s1LDPKFs1S.cpQdD2nAriOS("Connection", "Keep-Alive");
                }
                if (hj0Var.PxuCJdSBwIXG("Accept-Encoding") == null && hj0Var.PxuCJdSBwIXG("Range") == null) {
                    r3s1LDPKFs1S.cpQdD2nAriOS("Accept-Encoding", "gzip");
                } else {
                    z2 = false;
                }
                ((jx1) gtVar).getClass();
                gm0Var.getClass();
                if (hj0Var.PxuCJdSBwIXG("User-Agent") == null) {
                    r3s1LDPKFs1S.cpQdD2nAriOS("User-Agent", "okhttp/5.4.0");
                }
                xb xbVar4 = new xb(r3s1LDPKFs1S);
                nv1 lS5Rgt96tfkO4 = ps1Var.lS5Rgt96tfkO(xbVar4);
                hj0 hj0Var2 = lS5Rgt96tfkO4.cpQdD2nAriOS;
                yl0.lS5Rgt96tfkO(gtVar, (gm0) xbVar4.lS5Rgt96tfkO, hj0Var2);
                mv1 lS5Rgt96tfkO5 = lS5Rgt96tfkO4.lS5Rgt96tfkO();
                lS5Rgt96tfkO5.PxuCJdSBwIXG = xbVar4;
                if (z2) {
                    String PxuCJdSBwIXG5 = hj0Var2.PxuCJdSBwIXG("Content-Encoding");
                    if (PxuCJdSBwIXG5 == null) {
                        PxuCJdSBwIXG5 = null;
                    }
                    if ("gzip".equalsIgnoreCase(PxuCJdSBwIXG5) && yl0.PxuCJdSBwIXG(lS5Rgt96tfkO4)) {
                        ii0 ii0Var = new ii0(lS5Rgt96tfkO4.r3s1LDPKFs1S.OPXfSBeufaJ8());
                        jd0 TSizfFm2Yiuu3 = hj0Var2.TSizfFm2Yiuu();
                        TSizfFm2Yiuu3.TSizfFm2Yiuu("Content-Encoding");
                        TSizfFm2Yiuu3.TSizfFm2Yiuu("Content-Length");
                        lS5Rgt96tfkO5.a92UlCVFR9N8 = TSizfFm2Yiuu3.PxuCJdSBwIXG().TSizfFm2Yiuu();
                        String PxuCJdSBwIXG6 = hj0Var2.PxuCJdSBwIXG("Content-Type");
                        lS5Rgt96tfkO5.RAsUl2FVSrh6 = new qs1(PxuCJdSBwIXG6 == null ? null : PxuCJdSBwIXG6, -1L, new es1(ii0Var));
                    }
                }
                return lS5Rgt96tfkO5.PxuCJdSBwIXG();
        }
    }
}
