package okhttp3.internal.tls;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;

@Metadata
/* loaded from: classes3.dex */
public abstract class CertificateChainCleaner {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f43164a = new Companion(null);

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CertificateChainCleaner a(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return Platform.f43120a.g().c(trustManager);
        }

        private Companion() {
        }
    }

    public abstract List a(List list, String str);
}
