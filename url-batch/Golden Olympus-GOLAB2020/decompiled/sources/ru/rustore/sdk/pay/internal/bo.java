package ru.rustore.sdk.pay.internal;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.network.ssl.CompositeX509TrustManagerApi24;

/* loaded from: classes3.dex */
public final class bo {
    @NotNull
    public static X509TrustManager a(@NotNull List signedCertificates) {
        Intrinsics.checkNotNullParameter(signedCertificates, "signedCertificates");
        return new CompositeX509TrustManagerApi24(signedCertificates);
    }
}
