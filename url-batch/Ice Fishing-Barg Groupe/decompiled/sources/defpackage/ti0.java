package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ti0 {
    public static final si0 Companion = new si0();
    public final dk2 PxuCJdSBwIXG;
    public final List TSizfFm2Yiuu;
    public final qc2 Y1f8riQaR6yg;
    public final yj lS5Rgt96tfkO;

    public ti0(dk2 dk2Var, yj yjVar, List list, ae0 ae0Var) {
        this.PxuCJdSBwIXG = dk2Var;
        this.lS5Rgt96tfkO = yjVar;
        this.TSizfFm2Yiuu = list;
        this.Y1f8riQaR6yg = new qc2(new o5(12, ae0Var));
    }

    public final List PxuCJdSBwIXG() {
        return (List) this.Y1f8riQaR6yg.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ti0)) {
            return false;
        }
        ti0 ti0Var = (ti0) obj;
        return ti0Var.PxuCJdSBwIXG == this.PxuCJdSBwIXG && ti0Var.lS5Rgt96tfkO == this.lS5Rgt96tfkO && cs0.wdg6QnbFHrFF(ti0Var.PxuCJdSBwIXG(), PxuCJdSBwIXG()) && ti0Var.TSizfFm2Yiuu.equals(this.TSizfFm2Yiuu);
    }

    public final int hashCode() {
        return this.TSizfFm2Yiuu.hashCode() + ((PxuCJdSBwIXG().hashCode() + ((this.lS5Rgt96tfkO.hashCode() + ((this.PxuCJdSBwIXG.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> PxuCJdSBwIXG = PxuCJdSBwIXG();
        ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(PxuCJdSBwIXG, 10));
        for (Certificate certificate : PxuCJdSBwIXG) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                type2.getClass();
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(" cipherSuite=");
        sb.append(this.lS5Rgt96tfkO);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.TSizfFm2Yiuu;
        ArrayList arrayList2 = new ArrayList(al.KZw9XyiywG4x(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                type.getClass();
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
