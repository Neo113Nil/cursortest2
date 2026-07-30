package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class o {
    public final List OPXfSBeufaJ8;
    public final a10 PxuCJdSBwIXG;
    public final ProxySelector RAsUl2FVSrh6;
    public final SSLSocketFactory TSizfFm2Yiuu;
    public final HostnameVerifier Y1f8riQaR6yg;
    public final db a92UlCVFR9N8;
    public final ri e9gEMXR7LXtO;
    public final SocketFactory lS5Rgt96tfkO;
    public final gm0 rtx2ld2ELZv4;
    public final List wdg6QnbFHrFF;

    public o(String str, int i, a10 a10Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, ri riVar, db dbVar, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        a10Var.getClass();
        socketFactory.getClass();
        dbVar.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.PxuCJdSBwIXG = a10Var;
        this.lS5Rgt96tfkO = socketFactory;
        this.TSizfFm2Yiuu = sSLSocketFactory;
        this.Y1f8riQaR6yg = hostnameVerifier;
        this.e9gEMXR7LXtO = riVar;
        this.a92UlCVFR9N8 = dbVar;
        this.RAsUl2FVSrh6 = proxySelector;
        em0 em0Var = new em0();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            em0Var.PxuCJdSBwIXG = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                u9.XL4ISE6Oc65B("unexpected scheme: ".concat(str2));
                throw null;
            }
            em0Var.PxuCJdSBwIXG = "https";
        }
        String lS5Rgt96tfkO = iv2.lS5Rgt96tfkO(mm2.JHNfcAUfKc4G(str, 0, 0, 7));
        if (lS5Rgt96tfkO == null) {
            u9.XL4ISE6Oc65B("unexpected host: ".concat(str));
            throw null;
        }
        em0Var.Y1f8riQaR6yg = lS5Rgt96tfkO;
        if (1 > i || i >= 65536) {
            u9.e9gEMXR7LXtO(o0.wdg6QnbFHrFF("unexpected port: ", i));
            throw null;
        }
        em0Var.e9gEMXR7LXtO = i;
        this.rtx2ld2ELZv4 = em0Var.PxuCJdSBwIXG();
        this.OPXfSBeufaJ8 = mv2.OPXfSBeufaJ8(list);
        this.wdg6QnbFHrFF = mv2.OPXfSBeufaJ8(list2);
    }

    public final boolean PxuCJdSBwIXG(o oVar) {
        oVar.getClass();
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, oVar.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.a92UlCVFR9N8, oVar.a92UlCVFR9N8) && cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, oVar.OPXfSBeufaJ8) && cs0.wdg6QnbFHrFF(this.wdg6QnbFHrFF, oVar.wdg6QnbFHrFF) && cs0.wdg6QnbFHrFF(this.RAsUl2FVSrh6, oVar.RAsUl2FVSrh6) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, oVar.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, oVar.Y1f8riQaR6yg) && cs0.wdg6QnbFHrFF(this.e9gEMXR7LXtO, oVar.e9gEMXR7LXtO) && this.rtx2ld2ELZv4.e9gEMXR7LXtO == oVar.rtx2ld2ELZv4.e9gEMXR7LXtO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, oVar.rtx2ld2ELZv4) && PxuCJdSBwIXG(oVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e9gEMXR7LXtO) + ((Objects.hashCode(this.Y1f8riQaR6yg) + ((Objects.hashCode(this.TSizfFm2Yiuu) + ((this.RAsUl2FVSrh6.hashCode() + ((this.wdg6QnbFHrFF.hashCode() + ((this.OPXfSBeufaJ8.hashCode() + ((this.a92UlCVFR9N8.hashCode() + ((this.PxuCJdSBwIXG.hashCode() + ((this.rtx2ld2ELZv4.rtx2ld2ELZv4.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        gm0 gm0Var = this.rtx2ld2ELZv4;
        sb.append(gm0Var.Y1f8riQaR6yg);
        sb.append(':');
        sb.append(gm0Var.e9gEMXR7LXtO);
        sb.append(", ");
        sb.append("proxySelector=" + this.RAsUl2FVSrh6);
        sb.append('}');
        return sb.toString();
    }
}
