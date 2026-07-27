package m3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import y2.C1336k;
import y2.InterfaceC1335j;
import z2.C1442z;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final A f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8388b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8389c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1335j f8390d;

    public k(A tlsVersion, f cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f8387a = tlsVersion;
        this.f8388b = cipherSuite;
        this.f8389c = localCertificates;
        this.f8390d = C1336k.a(new A3.e(peerCertificatesFn));
    }

    public final List a() {
        return (List) this.f8390d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.f8387a == this.f8387a && Intrinsics.a(kVar.f8388b, this.f8388b) && Intrinsics.a(kVar.a(), a()) && Intrinsics.a(kVar.f8389c, this.f8389c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8389c.hashCode() + ((a().hashCode() + ((this.f8388b.hashCode() + ((this.f8387a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a4 = a();
        ArrayList arrayList = new ArrayList(C1442z.h(a4, 10));
        for (Certificate certificate : a4) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f8387a);
        sb.append(" cipherSuite=");
        sb.append(this.f8388b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f8389c;
        ArrayList arrayList2 = new ArrayList(C1442z.h(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
