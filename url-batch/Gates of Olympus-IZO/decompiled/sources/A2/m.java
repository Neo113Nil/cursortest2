package A2;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final B f114a;

    /* renamed from: b, reason: collision with root package name */
    public final f f115b;

    /* renamed from: c, reason: collision with root package name */
    public final List f116c;

    /* renamed from: d, reason: collision with root package name */
    public final L1.o f117d;

    public m(B b2, f fVar, List list, Y1.a aVar) {
        this.f114a = b2;
        this.f115b = fVar;
        this.f116c = list;
        this.f117d = I2.d.F(new l(aVar));
    }

    public final List a() {
        return (List) this.f117d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (mVar.f114a == this.f114a && Z1.i.a(mVar.f115b, this.f115b) && Z1.i.a(mVar.a(), a()) && Z1.i.a(mVar.f116c, this.f116c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f116c.hashCode() + ((a().hashCode() + ((this.f115b.hashCode() + ((this.f114a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a3 = a();
        ArrayList arrayList = new ArrayList(M1.n.g0(a3, 10));
        for (Certificate certificate : a3) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Z1.i.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f114a);
        sb.append(" cipherSuite=");
        sb.append(this.f115b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f116c;
        ArrayList arrayList2 = new ArrayList(M1.n.g0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Z1.i.e(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
