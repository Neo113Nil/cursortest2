package r1;

import androidx.lifecycle.I;
import f1.InterfaceC0090a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final w f3452a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3453b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3454c;
    public final U0.e d;

    public j(w wVar, f fVar, List list, InterfaceC0090a interfaceC0090a) {
        this.f3452a = wVar;
        this.f3453b = fVar;
        this.f3454c = list;
        this.d = new U0.e(new I(interfaceC0090a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.f3452a == this.f3452a && g1.d.a(jVar.f3453b, this.f3453b) && g1.d.a(jVar.a(), a()) && g1.d.a(jVar.f3454c, this.f3454c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3454c.hashCode() + ((a().hashCode() + ((this.f3453b.hashCode() + ((this.f3452a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(V0.i.x0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                g1.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f3452a);
        sb.append(" cipherSuite=");
        sb.append(this.f3453b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f3454c;
        ArrayList arrayList2 = new ArrayList(V0.i.x0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                g1.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
