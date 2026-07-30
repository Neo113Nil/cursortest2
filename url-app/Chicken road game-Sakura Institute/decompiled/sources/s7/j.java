package s7;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import r1.z0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final w f8602a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8603b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8604c;

    /* renamed from: d, reason: collision with root package name */
    public final d6.o f8605d;

    public j(w wVar, f fVar, List list, q6.a aVar) {
        this.f8602a = wVar;
        this.f8603b = fVar;
        this.f8604c = list;
        this.f8605d = d6.a.d(new z0(aVar));
    }

    public final List a() {
        return (List) this.f8605d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f8602a == this.f8602a && r6.k.a(jVar.f8603b, this.f8603b) && r6.k.a(jVar.a(), a()) && r6.k.a(jVar.f8604c, this.f8604c);
    }

    public final int hashCode() {
        return this.f8604c.hashCode() + ((a().hashCode() + ((this.f8603b.hashCode() + ((this.f8602a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a3 = a();
        ArrayList arrayList = new ArrayList(e6.n.a0(a3, 10));
        for (Certificate certificate : a3) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                r6.k.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f8602a);
        sb.append(" cipherSuite=");
        sb.append(this.f8603b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f8604c;
        ArrayList arrayList2 = new ArrayList(e6.n.a0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                r6.k.e(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
