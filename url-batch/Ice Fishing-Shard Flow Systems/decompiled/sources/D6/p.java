package D6;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final G f548a;

    /* renamed from: b, reason: collision with root package name */
    public final C0099g f549b;

    /* renamed from: c, reason: collision with root package name */
    public final List f550c;

    /* renamed from: d, reason: collision with root package name */
    public final R5.q f551d;

    public p(G tlsVersion, C0099g cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f548a = tlsVersion;
        this.f549b = cipherSuite;
        this.f550c = localCertificates;
        this.f551d = R5.i.b(new o(0, peerCertificatesFn));
    }

    public final List a() {
        return (List) this.f551d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return pVar.f548a == this.f548a && Intrinsics.a(pVar.f549b, this.f549b) && Intrinsics.a(pVar.a(), a()) && Intrinsics.a(pVar.f550c, this.f550c);
    }

    public final int hashCode() {
        return this.f550c.hashCode() + ((a().hashCode() + ((this.f549b.hashCode() + ((this.f548a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a7 = a();
        ArrayList arrayList = new ArrayList(kotlin.collections.s.g(a7, 10));
        for (Certificate certificate : a7) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f548a);
        sb.append(" cipherSuite=");
        sb.append(this.f549b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f550c;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.s.g(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
