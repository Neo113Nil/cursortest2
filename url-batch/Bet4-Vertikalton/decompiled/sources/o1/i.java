package o1;

import androidx.lifecycle.I;
import c1.InterfaceC0085a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final v f3306a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3307b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3308c;
    public final R0.e d;

    public i(v vVar, f fVar, List list, InterfaceC0085a interfaceC0085a) {
        this.f3306a = vVar;
        this.f3307b = fVar;
        this.f3308c = list;
        this.d = new R0.e(new I(interfaceC0085a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f3306a == this.f3306a && d1.d.a(iVar.f3307b, this.f3307b) && d1.d.a(iVar.a(), a()) && d1.d.a(iVar.f3308c, this.f3308c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3308c.hashCode() + ((a().hashCode() + ((this.f3307b.hashCode() + ((this.f3306a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(S0.i.z0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                d1.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f3306a);
        sb.append(" cipherSuite=");
        sb.append(this.f3307b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f3308c;
        ArrayList arrayList2 = new ArrayList(S0.i.z0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                d1.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
