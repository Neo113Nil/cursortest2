package com.yandex.mobile.ads.impl;

import android.net.http.SslCertificate;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class vs1 {
    @Nullable
    public static final X509Certificate a(@NotNull SslCertificate sslCertificate, @NotNull CertificateFactory x509CertificateFactory) {
        byte[] byteArray;
        Intrinsics.checkNotNullParameter(sslCertificate, "<this>");
        Intrinsics.checkNotNullParameter(x509CertificateFactory, "x509CertificateFactory");
        if (!Intrinsics.areEqual(x509CertificateFactory.getType(), "X.509")) {
            x509CertificateFactory.getType();
            ap0.b(new Object[0]);
            return null;
        }
        Bundle saveState = SslCertificate.saveState(sslCertificate);
        if (saveState != null && (byteArray = saveState.getByteArray("x509-certificate")) != null) {
            try {
                Certificate generateCertificate = x509CertificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                if (generateCertificate instanceof X509Certificate) {
                    return (X509Certificate) generateCertificate;
                }
                return null;
            } catch (CertificateException unused) {
                ap0.c(new Object[0]);
            }
        }
        return null;
    }
}
