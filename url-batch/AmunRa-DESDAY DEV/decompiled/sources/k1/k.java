package k1;

import androidx.lifecycle.I;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final x f2820a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2821b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2822c;
    public final Q0.d d;

    public k(x xVar, g gVar, List list, Y0.a aVar) {
        this.f2820a = xVar;
        this.f2821b = gVar;
        this.f2822c = list;
        this.d = new Q0.d(new I(aVar));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.f2820a == this.f2820a && Z0.d.a(kVar.f2821b, this.f2821b) && Z0.d.a(kVar.a(), a()) && Z0.d.a(kVar.f2822c, this.f2822c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2822c.hashCode() + ((a().hashCode() + ((this.f2821b.hashCode() + ((this.f2820a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(R0.j.m0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Z0.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2820a);
        sb.append(" cipherSuite=");
        sb.append(this.f2821b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2822c;
        ArrayList arrayList2 = new ArrayList(R0.j.m0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Z0.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
