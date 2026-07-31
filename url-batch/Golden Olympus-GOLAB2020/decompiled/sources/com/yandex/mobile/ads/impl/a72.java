package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a72 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final W1.h f23180a = W1.i.b(a.f23182b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f23181b = 0;

    static final class a extends kotlin.jvm.internal.s implements Function0<CertificateFactory> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f23182b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            try {
                return CertificateFactory.getInstance("X.509");
            } catch (CertificateException unused) {
                return null;
            }
        }
    }

    public static final boolean a() {
        return true;
    }

    @Nullable
    public static final X509Certificate a(@NotNull byte[] certBytes) {
        Intrinsics.checkNotNullParameter(certBytes, "certBytes");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(certBytes);
        try {
            CertificateFactory certificateFactory = (CertificateFactory) f23180a.getValue();
            return (X509Certificate) (certificateFactory != null ? certificateFactory.generateCertificate(byteArrayInputStream) : null);
        } catch (CertificateException unused) {
            return null;
        }
    }

    @Nullable
    public static final X509TrustManager a(@Nullable KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.checkNotNull(trustManagers);
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) CollectionsKt.firstOrNull((List) arrayList);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }
}
