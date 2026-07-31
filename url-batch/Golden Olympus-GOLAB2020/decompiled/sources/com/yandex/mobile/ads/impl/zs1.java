package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zs1 implements ys1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ew1 f35762a;

    public zs1(@NotNull ew1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f35762a = sdkSettings;
    }

    @Override // com.yandex.mobile.ads.impl.ys1
    @Nullable
    public final SSLSocketFactory a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        du1 a4 = this.f35762a.a(context);
        Intrinsics.checkNotNullParameter(context, "context");
        cu1 customCertificatesProvider = new cu1(context);
        if (a4 != null && a4.n0()) {
            Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
            iw1 trustManager = xq0.a(customCertificatesProvider);
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            SSLSocketFactory socketFactory = new ws1(trustManager).a().getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        }
        if (!C2385z9.a(21)) {
            return null;
        }
        int i4 = qj1.f30807b;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            try {
                sSLContext.init(null, null, null);
            } catch (KeyManagementException e4) {
                ap0.b(e4.getMessage());
            }
            SSLSocketFactory socketFactory2 = sSLContext.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory2, "getSocketFactory(...)");
            return new qj1(socketFactory2);
        } catch (NoSuchAlgorithmException e5) {
            ap0.b("TLSv1.2", e5.getMessage());
            return null;
        }
    }
}
