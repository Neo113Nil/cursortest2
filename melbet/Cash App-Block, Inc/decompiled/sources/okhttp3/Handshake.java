package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Handshake {
    public final CipherSuite cipherSuite;
    public final List localCertificates;
    public final Lazy peerCertificates$delegate;
    public final TlsVersion tlsVersion;

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, Function0 function0) {
        list.getClass();
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = list;
        this.peerCertificates$delegate = LazyKt.lazy(new Handshake$$ExternalSyntheticLambda0(0, function0));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        return handshake.tlsVersion == this.tlsVersion && handshake.cipherSuite == this.cipherSuite && Intrinsics.areEqual(handshake.peerCertificates(), peerCertificates()) && Intrinsics.areEqual(handshake.localCertificates, this.localCertificates);
    }

    public final int hashCode() {
        return this.localCertificates.hashCode() + ((peerCertificates().hashCode() + ((this.cipherSuite.hashCode() + ((this.tlsVersion.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final List peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    public final String toString() {
        String type2;
        String type3;
        List<Certificate> peerCertificates = peerCertificates();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            if (certificate instanceof X509Certificate) {
                type3 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type3 = certificate.getType();
                type3.getClass();
            }
            arrayList.add(type3);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type2 = certificate2.getType();
                type2.getClass();
            }
            arrayList2.add(type2);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
