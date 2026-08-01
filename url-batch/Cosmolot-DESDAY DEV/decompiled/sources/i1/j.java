package i1;

import androidx.lifecycle.I;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final w f2439a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2440b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2441c;
    public final P0.c d;

    public j(w wVar, f fVar, List list, W0.a aVar) {
        this.f2439a = wVar;
        this.f2440b = fVar;
        this.f2441c = list;
        this.d = new P0.c(new I(aVar));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.f2439a == this.f2439a && X0.e.a(jVar.f2440b, this.f2440b) && X0.e.a(jVar.a(), a()) && X0.e.a(jVar.f2441c, this.f2441c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2441c.hashCode() + ((a().hashCode() + ((this.f2440b.hashCode() + ((this.f2439a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(Q0.f.v0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                X0.e.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2439a);
        sb.append(" cipherSuite=");
        sb.append(this.f2440b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2441c;
        ArrayList arrayList2 = new ArrayList(Q0.f.v0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                X0.e.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
