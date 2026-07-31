package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.Handshake;

@Metadata
/* loaded from: classes3.dex */
final class RealConnection$connectTls$2 extends s implements Function0<List<? extends X509Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ RealConnection f42807i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.f42807i = realConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List invoke() {
        Handshake handshake;
        handshake = this.f42807i.f42790g;
        Intrinsics.checkNotNull(handshake);
        List<Certificate> d4 = handshake.d();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(d4, 10));
        for (Certificate certificate : d4) {
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
