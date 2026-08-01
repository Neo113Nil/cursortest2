package i1;

import androidx.lifecycle.K;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final B f2698a;

    /* renamed from: b, reason: collision with root package name */
    public final h f2699b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2700c;

    /* renamed from: d, reason: collision with root package name */
    public final N0.d f2701d;

    public l(B b2, h hVar, List list, W0.a aVar) {
        this.f2698a = b2;
        this.f2699b = hVar;
        this.f2700c = list;
        this.f2701d = new N0.d(new K(aVar));
    }

    public final List a() {
        return (List) this.f2701d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (lVar.f2698a == this.f2698a && X0.f.a(lVar.f2699b, this.f2699b) && X0.f.a(lVar.a(), a()) && X0.f.a(lVar.f2700c, this.f2700c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2700c.hashCode() + ((a().hashCode() + ((this.f2699b.hashCode() + ((this.f2698a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(O0.j.d0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                X0.f.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2698a);
        sb.append(" cipherSuite=");
        sb.append(this.f2699b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2700c;
        ArrayList arrayList2 = new ArrayList(O0.j.d0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                X0.f.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
