package com.drake.net.utils;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public abstract class d {
    public static final X509TrustManager chooseTrustManager(TrustManager[] trustManagers) {
        s.checkNotNullParameter(trustManagers, "trustManagers");
        for (TrustManager trustManager : trustManagers) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static final KeyManager[] prepareKeyManager(InputStream inputStream, String str) {
        if (inputStream != null && str != null) {
            try {
                KeyStore keyStore = KeyStore.getInstance("BKS");
                char[] charArray = str.toCharArray();
                s.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
                keyStore.load(inputStream, charArray);
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                char[] charArray2 = str.toCharArray();
                s.checkNotNullExpressionValue(charArray2, "this as java.lang.String).toCharArray()");
                keyManagerFactory.init(keyStore, charArray2);
                return keyManagerFactory.getKeyManagers();
            } catch (Exception e8) {
                com.drake.net.a.debug(e8);
            }
        }
        return null;
    }

    public static final TrustManager[] prepareTrustManager(InputStream... certificates) {
        s.checkNotNullParameter(certificates, "certificates");
        if (certificates.length == 0) {
            return null;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null);
            int length = certificates.length;
            for (int i8 = 0; i8 < length; i8++) {
                InputStream inputStream = certificates[i8];
                keyStore.setCertificateEntry(String.valueOf(i8), certificateFactory.generateCertificate(inputStream));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e8) {
                        com.drake.net.a.debug(e8);
                    }
                }
            }
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            return trustManagerFactory.getTrustManagers();
        } catch (Exception e9) {
            com.drake.net.a.debug(e9);
            return null;
        }
    }
}
