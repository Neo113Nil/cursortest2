package i1;

import androidx.lifecycle.I;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final w f2444a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2445b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2446c;
    public final P0.c d;

    public j(w wVar, f fVar, List list, W0.a aVar) {
        this.f2444a = wVar;
        this.f2445b = fVar;
        this.f2446c = list;
        this.d = new P0.c(new I(aVar));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.f2444a == this.f2444a && X0.d.a(jVar.f2445b, this.f2445b) && X0.d.a(jVar.a(), a()) && X0.d.a(jVar.f2446c, this.f2446c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2446c.hashCode() + ((a().hashCode() + ((this.f2445b.hashCode() + ((this.f2444a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(Q0.j.w0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                X0.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2444a);
        sb.append(" cipherSuite=");
        sb.append(this.f2445b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2446c;
        ArrayList arrayList2 = new ArrayList(Q0.j.w0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                X0.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
