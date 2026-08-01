package m1;

import a1.InterfaceC0059a;
import androidx.lifecycle.I;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final v f3172a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3173b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3174c;
    public final S0.e d;

    public i(v vVar, f fVar, List list, InterfaceC0059a interfaceC0059a) {
        this.f3172a = vVar;
        this.f3173b = fVar;
        this.f3174c = list;
        this.d = new S0.e(new I(interfaceC0059a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f3172a == this.f3172a && b1.d.a(iVar.f3173b, this.f3173b) && b1.d.a(iVar.a(), a()) && b1.d.a(iVar.f3174c, this.f3174c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3174c.hashCode() + ((a().hashCode() + ((this.f3173b.hashCode() + ((this.f3172a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(T0.j.v0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                b1.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f3172a);
        sb.append(" cipherSuite=");
        sb.append(this.f3173b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f3174c;
        ArrayList arrayList2 = new ArrayList(T0.j.v0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                b1.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
