package G3;

import c3.C0295g;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final B f932a;

    /* renamed from: b, reason: collision with root package name */
    public final g f933b;

    /* renamed from: c, reason: collision with root package name */
    public final List f934c;

    /* renamed from: d, reason: collision with root package name */
    public final C0295g f935d;

    public l(B b4, g gVar, List list, InterfaceC1328a interfaceC1328a) {
        this.f932a = b4;
        this.f933b = gVar;
        this.f934c = list;
        this.f935d = new C0295g(new k(interfaceC1328a));
    }

    public final List a() {
        return (List) this.f935d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f932a == this.f932a && kotlin.jvm.internal.i.a(lVar.f933b, this.f933b) && kotlin.jvm.internal.i.a(lVar.a(), a()) && kotlin.jvm.internal.i.a(lVar.f934c, this.f934c);
    }

    public final int hashCode() {
        return this.f934c.hashCode() + ((a().hashCode() + ((this.f933b.hashCode() + ((this.f932a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a3 = a();
        ArrayList arrayList = new ArrayList(d3.k.Y(a3));
        for (Certificate certificate : a3) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.i.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f932a);
        sb.append(" cipherSuite=");
        sb.append(this.f933b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f934c;
        ArrayList arrayList2 = new ArrayList(d3.k.Y(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.i.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
