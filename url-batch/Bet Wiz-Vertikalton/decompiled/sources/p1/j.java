package p1;

import androidx.lifecycle.I;
import d1.InterfaceC0081a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final w f3352a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3353b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3354c;
    public final V0.d d;

    public j(w wVar, f fVar, List list, InterfaceC0081a interfaceC0081a) {
        this.f3352a = wVar;
        this.f3353b = fVar;
        this.f3354c = list;
        this.d = new V0.d(new I(interfaceC0081a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.f3352a == this.f3352a && e1.d.a(jVar.f3353b, this.f3353b) && e1.d.a(jVar.a(), a()) && e1.d.a(jVar.f3354c, this.f3354c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3354c.hashCode() + ((a().hashCode() + ((this.f3353b.hashCode() + ((this.f3352a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(W0.j.m0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                e1.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f3352a);
        sb.append(" cipherSuite=");
        sb.append(this.f3353b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f3354c;
        ArrayList arrayList2 = new ArrayList(W0.j.m0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                e1.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
