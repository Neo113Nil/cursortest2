package T4;

import a.AbstractC0169a;
import f4.C0434k;
import g4.AbstractC0467l;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final D f2909a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2910b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2911c;

    /* renamed from: d, reason: collision with root package name */
    public final C0434k f2912d;

    public n(D d6, f fVar, List list, InterfaceC1430a interfaceC1430a) {
        this.f2909a = d6;
        this.f2910b = fVar;
        this.f2911c = list;
        this.f2912d = AbstractC0169a.A(new m(0, interfaceC1430a));
    }

    public final List a() {
        return (List) this.f2912d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.f2909a == this.f2909a && kotlin.jvm.internal.i.a(nVar.f2910b, this.f2910b) && kotlin.jvm.internal.i.a(nVar.a(), a()) && kotlin.jvm.internal.i.a(nVar.f2911c, this.f2911c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2911c.hashCode() + ((a().hashCode() + ((this.f2910b.hashCode() + ((this.f2909a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a6 = a();
        ArrayList arrayList = new ArrayList(AbstractC0467l.D0(a6, 10));
        for (Certificate certificate : a6) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.i.d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f2909a);
        sb.append(" cipherSuite=");
        sb.append(this.f2910b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f2911c;
        ArrayList arrayList2 = new ArrayList(AbstractC0467l.D0(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.i.d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
