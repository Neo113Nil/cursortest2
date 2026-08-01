package t3;

import androidx.lifecycle.h0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final w f3450a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3451b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3452c;
    public final w2.c d;

    public i(w wVar, f fVar, List list, h3.a aVar) {
        this.f3450a = wVar;
        this.f3451b = fVar;
        this.f3452c = list;
        this.d = new w2.c(new h0(aVar));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f3450a == this.f3450a && i3.d.a(iVar.f3451b, this.f3451b) && i3.d.a(iVar.a(), a()) && i3.d.a(iVar.f3452c, this.f3452c);
    }

    public final int hashCode() {
        return this.f3452c.hashCode() + ((a().hashCode() + ((this.f3451b.hashCode() + ((this.f3450a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a5 = a();
        ArrayList arrayList = new ArrayList(x2.j.C(a5));
        for (Certificate certificate : a5) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                i3.d.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f3450a);
        sb.append(" cipherSuite=");
        sb.append(this.f3451b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f3452c;
        ArrayList arrayList2 = new ArrayList(x2.j.C(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                i3.d.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
