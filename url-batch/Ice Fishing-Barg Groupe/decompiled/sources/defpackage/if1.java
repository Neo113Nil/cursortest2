package defpackage;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class if1 {
    public final List BRwzKIf41E4i;
    public final ri EcgxDIVH5in8;
    public final int IAToe7bXGz4N;
    public final boolean OPXfSBeufaJ8;
    public final e0 PxuCJdSBwIXG;
    public final SSLSocketFactory QrzZRwfaDlRX;
    public final ih0 RAsUl2FVSrh6;
    public final ff1 RfyTYNmI9Srp;
    public final int S2OOm9zPNm0h;
    public final pi S9EYkSpbGuxq;
    public final List TSizfFm2Yiuu;
    public final int VhhvGxCb8gfr;
    public final List XL4ISE6Oc65B;
    public final rc1 Y1f8riQaR6yg;
    public final int ZbWwgt3aGe7A;
    public final boolean a92UlCVFR9N8;
    public final be2 aF05bpZJlKEP;
    public final ih0 cpQdD2nAriOS;
    public final ih0 dgRBjINgWbAK;
    public final long e6tOsSdd2EFb;
    public final boolean e9gEMXR7LXtO;
    public final X509TrustManager gPXPFXrUH4XX;
    public final i2 jyegZNwi31qc;
    public final i2 kpCQ9veP6n3I;
    public final List lS5Rgt96tfkO;
    public final int pnx5pC0XzaCw;
    public final SocketFactory r3s1LDPKFs1S;
    public final boolean rtx2ld2ELZv4;
    public final jx1 wdg6QnbFHrFF;
    public final ProxySelector x50lh2ztY7Y5;
    public static final hf1 Companion = new hf1();
    public static final List rZjpSjn4zoMv = mv2.wdg6QnbFHrFF(new fr1[]{fr1.x50lh2ztY7Y5, fr1.wdg6QnbFHrFF});
    public static final List BjEWd04qc7Mw = mv2.wdg6QnbFHrFF(new br[]{br.e9gEMXR7LXtO, br.a92UlCVFR9N8});

    /* JADX WARN: Removed duplicated region for block: B:22:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public if1(gf1 gf1Var) {
        List list;
        this.PxuCJdSBwIXG = gf1Var.PxuCJdSBwIXG;
        this.lS5Rgt96tfkO = mv2.OPXfSBeufaJ8(gf1Var.TSizfFm2Yiuu);
        this.TSizfFm2Yiuu = mv2.OPXfSBeufaJ8(gf1Var.Y1f8riQaR6yg);
        this.Y1f8riQaR6yg = gf1Var.e9gEMXR7LXtO;
        this.e9gEMXR7LXtO = gf1Var.a92UlCVFR9N8;
        this.a92UlCVFR9N8 = gf1Var.RAsUl2FVSrh6;
        this.RAsUl2FVSrh6 = gf1Var.rtx2ld2ELZv4;
        this.rtx2ld2ELZv4 = gf1Var.OPXfSBeufaJ8;
        this.OPXfSBeufaJ8 = gf1Var.wdg6QnbFHrFF;
        this.wdg6QnbFHrFF = gf1Var.dgRBjINgWbAK;
        this.dgRBjINgWbAK = gf1Var.x50lh2ztY7Y5;
        ProxySelector proxySelector = gf1Var.cpQdD2nAriOS;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = ie1.PxuCJdSBwIXG;
        }
        this.x50lh2ztY7Y5 = proxySelector;
        this.cpQdD2nAriOS = gf1Var.r3s1LDPKFs1S;
        this.r3s1LDPKFs1S = gf1Var.QrzZRwfaDlRX;
        List list2 = gf1Var.XL4ISE6Oc65B;
        this.BRwzKIf41E4i = list2;
        this.XL4ISE6Oc65B = gf1Var.RfyTYNmI9Srp;
        this.RfyTYNmI9Srp = gf1Var.EcgxDIVH5in8;
        this.VhhvGxCb8gfr = gf1Var.S2OOm9zPNm0h;
        this.S2OOm9zPNm0h = gf1Var.ZbWwgt3aGe7A;
        this.ZbWwgt3aGe7A = gf1Var.pnx5pC0XzaCw;
        this.pnx5pC0XzaCw = gf1Var.IAToe7bXGz4N;
        this.IAToe7bXGz4N = gf1Var.e6tOsSdd2EFb;
        this.e6tOsSdd2EFb = gf1Var.jyegZNwi31qc;
        i2 i2Var = gf1Var.aF05bpZJlKEP;
        this.jyegZNwi31qc = i2Var == null ? new i2(27, (byte) 0) : i2Var;
        be2 be2Var = gf1Var.kpCQ9veP6n3I;
        this.aF05bpZJlKEP = be2Var == null ? be2.x50lh2ztY7Y5 : be2Var;
        i2 i2Var2 = gf1Var.lS5Rgt96tfkO;
        if (i2Var2 == null) {
            i2Var2 = new i2(4, (byte) 0);
            gf1Var.lS5Rgt96tfkO = i2Var2;
        }
        this.kpCQ9veP6n3I = i2Var2;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((br) it.next()).PxuCJdSBwIXG) {
                    SSLSocketFactory sSLSocketFactory = gf1Var.gPXPFXrUH4XX;
                    if (sSLSocketFactory == null) {
                        km1.Companion.getClass();
                        km1.PxuCJdSBwIXG.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.gPXPFXrUH4XX = x509TrustManager;
                                km1 km1Var = km1.PxuCJdSBwIXG;
                                km1Var.getClass();
                                try {
                                    SSLContext dgRBjINgWbAK = km1Var.dgRBjINgWbAK();
                                    dgRBjINgWbAK.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = dgRBjINgWbAK.getSocketFactory();
                                    socketFactory.getClass();
                                    this.QrzZRwfaDlRX = socketFactory;
                                    pi.Companion.getClass();
                                    pi TSizfFm2Yiuu = km1.PxuCJdSBwIXG.TSizfFm2Yiuu(x509TrustManager);
                                    this.S9EYkSpbGuxq = TSizfFm2Yiuu;
                                    ri riVar = gf1Var.S9EYkSpbGuxq;
                                    riVar.getClass();
                                    this.EcgxDIVH5in8 = cs0.wdg6QnbFHrFF(riVar.lS5Rgt96tfkO, TSizfFm2Yiuu) ? riVar : new ri(riVar.PxuCJdSBwIXG, TSizfFm2Yiuu);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String arrays = Arrays.toString(trustManagers);
                        arrays.getClass();
                        rc1.e9gEMXR7LXtO("Unexpected default trust managers: ".concat(arrays));
                        throw null;
                    }
                    this.QrzZRwfaDlRX = sSLSocketFactory;
                    pi piVar = gf1Var.VhhvGxCb8gfr;
                    piVar.getClass();
                    this.S9EYkSpbGuxq = piVar;
                    X509TrustManager x509TrustManager2 = gf1Var.BRwzKIf41E4i;
                    x509TrustManager2.getClass();
                    this.gPXPFXrUH4XX = x509TrustManager2;
                    ri riVar2 = gf1Var.S9EYkSpbGuxq;
                    riVar2.getClass();
                    this.EcgxDIVH5in8 = cs0.wdg6QnbFHrFF(riVar2.lS5Rgt96tfkO, piVar) ? riVar2 : new ri(riVar2.PxuCJdSBwIXG, piVar);
                    X509TrustManager x509TrustManager3 = this.gPXPFXrUH4XX;
                    pi piVar2 = this.S9EYkSpbGuxq;
                    SSLSocketFactory sSLSocketFactory2 = this.QrzZRwfaDlRX;
                    List list3 = this.TSizfFm2Yiuu;
                    list = this.lS5Rgt96tfkO;
                    list.getClass();
                    if (!list.contains(null)) {
                        rc1.a92UlCVFR9N8(list, "Null interceptor: ");
                        throw null;
                    }
                    list3.getClass();
                    if (list3.contains(null)) {
                        rc1.a92UlCVFR9N8(list3, "Null network interceptor: ");
                        throw null;
                    }
                    List list4 = this.BRwzKIf41E4i;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((br) it2.next()).PxuCJdSBwIXG) {
                                if (sSLSocketFactory2 == null) {
                                    u9.rtx2ld2ELZv4("sslSocketFactory == null");
                                    throw null;
                                }
                                if (piVar2 == null) {
                                    u9.rtx2ld2ELZv4("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager3 != null) {
                                    return;
                                }
                                u9.rtx2ld2ELZv4("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        u9.rtx2ld2ELZv4("Check failed.");
                        throw null;
                    }
                    if (piVar2 != null) {
                        u9.rtx2ld2ELZv4("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        u9.rtx2ld2ELZv4("Check failed.");
                        throw null;
                    }
                    if (cs0.wdg6QnbFHrFF(this.EcgxDIVH5in8, ri.TSizfFm2Yiuu)) {
                        return;
                    }
                    u9.rtx2ld2ELZv4("Check failed.");
                    throw null;
                }
            }
        }
        this.QrzZRwfaDlRX = null;
        this.S9EYkSpbGuxq = null;
        this.gPXPFXrUH4XX = null;
        this.EcgxDIVH5in8 = ri.TSizfFm2Yiuu;
        X509TrustManager x509TrustManager32 = this.gPXPFXrUH4XX;
        pi piVar22 = this.S9EYkSpbGuxq;
        SSLSocketFactory sSLSocketFactory22 = this.QrzZRwfaDlRX;
        List list32 = this.TSizfFm2Yiuu;
        list = this.lS5Rgt96tfkO;
        list.getClass();
        if (!list.contains(null)) {
        }
    }
}
