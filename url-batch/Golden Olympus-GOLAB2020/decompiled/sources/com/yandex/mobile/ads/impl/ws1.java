package com.yandex.mobile.ads.impl;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ws1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X509TrustManager f34175a;

    public ws1(@NotNull iw1 trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        this.f34175a = trustManager;
    }

    @NotNull
    public final SSLContext a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{this.f34175a}, null);
            Intrinsics.checkNotNull(sSLContext);
            return sSLContext;
        } catch (KeyManagementException e4) {
            throw new IllegalStateException("Failed to initialize SSLContext", e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new IllegalStateException("No system TLS", e5);
        }
    }
}
