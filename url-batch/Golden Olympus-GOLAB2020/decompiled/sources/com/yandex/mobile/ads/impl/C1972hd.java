package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1972hd extends nn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X509TrustManager f26712a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final X509TrustManagerExtensions f26713b;

    /* renamed from: com.yandex.mobile.ads.impl.hd$a */
    public static final class a {
        @Nullable
        public static C1972hd a(@NotNull X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C1972hd(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C1972hd(@NotNull X509TrustManager trustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f26712a = trustManager;
        this.f26713b = x509TrustManagerExtensions;
    }

    @Override // com.yandex.mobile.ads.impl.nn
    @NotNull
    public final List a(@NotNull String hostname, @NotNull List chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f26713b.checkServerTrusted((X509Certificate[]) chain.toArray(new X509Certificate[0]), "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "checkServerTrusted(...)");
            return checkServerTrusted;
        } catch (CertificateException e4) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e4.getMessage());
            sSLPeerUnverifiedException.initCause(e4);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C1972hd) && ((C1972hd) obj).f26712a == this.f26712a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f26712a);
    }
}
