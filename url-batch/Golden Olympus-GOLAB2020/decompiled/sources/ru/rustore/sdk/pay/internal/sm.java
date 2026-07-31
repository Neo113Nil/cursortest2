package ru.rustore.sdk.pay.internal;

import java.net.URL;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.pay.internal.sm;

/* loaded from: classes3.dex */
public final class sm {
    @NotNull
    public static final HostnameVerifier a(@NotNull final URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        return new HostnameVerifier() { // from class: D3.O
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return sm.a(url, str, sSLSession);
            }
        };
    }

    public static final boolean a(URL url, String str, SSLSession sSLSession) {
        return str.equals(url.getHost());
    }
}
