package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;

@Metadata
/* loaded from: classes3.dex */
final class RealConnection$connectTls$1 extends s implements Function0<List<? extends Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ CertificatePinner f42804i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Handshake f42805j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Address f42806k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$1(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f42804i = certificatePinner;
        this.f42805j = handshake;
        this.f42806k = address;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List invoke() {
        CertificateChainCleaner d4 = this.f42804i.d();
        Intrinsics.checkNotNull(d4);
        return d4.a(this.f42805j.d(), this.f42806k.l().h());
    }
}
