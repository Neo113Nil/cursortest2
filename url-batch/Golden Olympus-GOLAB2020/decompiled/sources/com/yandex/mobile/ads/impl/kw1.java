package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kw1 implements iw1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jw1 f28346a;

    public kw1(@NotNull cu1 customCertificatesProvider) {
        Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
        this.f28346a = new jw1(customCertificatesProvider);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f28346a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        this.f28346a.b(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f28346a.c();
    }
}
