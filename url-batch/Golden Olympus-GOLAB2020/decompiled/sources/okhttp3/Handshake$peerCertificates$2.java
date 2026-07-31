package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Handshake$peerCertificates$2 extends s implements Function0<List<? extends Certificate>> {

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0 f42386i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Handshake$peerCertificates$2(Function0 function0) {
        super(0);
        this.f42386i = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List invoke() {
        try {
            return (List) this.f42386i.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return CollectionsKt.emptyList();
        }
    }
}
