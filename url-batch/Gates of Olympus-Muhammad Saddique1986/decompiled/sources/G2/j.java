package G2;

import e2.InterfaceC0422a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final x f2199a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2200b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2201c;

    /* renamed from: d, reason: collision with root package name */
    public final R1.n f2202d;

    public j(x xVar, f fVar, List list, InterfaceC0422a interfaceC0422a) {
        this.f2199a = xVar;
        this.f2200b = fVar;
        this.f2201c = list;
        this.f2202d = R1.a.d(new A.h(interfaceC0422a));
    }

    public final List a() {
        return (List) this.f2202d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.f2199a == this.f2199a && f2.j.a(jVar.f2200b, this.f2200b) && f2.j.a(jVar.a(), a()) && f2.j.a(jVar.f2201c, this.f2201c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2201c.hashCode() + ((a().hashCode() + ((this.f2200b.hashCode() + ((this.f2199a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a3 = a();
        ArrayList arrayList = new ArrayList(S1.n.E0(a3, 10));
        for (Certificate certificate : a3) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                f2.j.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2199a);
        sb.append(" cipherSuite=");
        sb.append(this.f2200b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2201c;
        ArrayList arrayList2 = new ArrayList(S1.n.E0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                f2.j.e(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
