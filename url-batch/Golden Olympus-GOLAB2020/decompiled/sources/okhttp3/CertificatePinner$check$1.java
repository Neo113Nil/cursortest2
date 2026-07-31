package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata
/* loaded from: classes3.dex */
final class CertificatePinner$check$1 extends s implements Function0<List<? extends X509Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ CertificatePinner f42196i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ List f42197j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ String f42198k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.f42196i = certificatePinner;
        this.f42197j = list;
        this.f42198k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List invoke() {
        List list;
        CertificateChainCleaner d4 = this.f42196i.d();
        if (d4 == null || (list = d4.a(this.f42197j, this.f42198k)) == null) {
            list = this.f42197j;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Certificate certificate : list2) {
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
