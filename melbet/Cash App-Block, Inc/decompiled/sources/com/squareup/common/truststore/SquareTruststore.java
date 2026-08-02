package com.squareup.common.truststore;

import android.content.Context;
import bo.app.a$$ExternalSyntheticBUOutline0;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class SquareTruststore {
    public final SquareSSLSocketFactory sslSocketFactory;
    public final X509TrustManager trustManager;

    public SquareTruststore(SquareSSLSocketFactory squareSSLSocketFactory, X509TrustManager x509TrustManager) {
        this.sslSocketFactory = squareSSLSocketFactory;
        this.trustManager = x509TrustManager;
    }

    public static SquareTruststore create(Context context) {
        try {
            TrustManager[] readTruststore = SquareSSLSocketFactory.readTruststore(context);
            return new SquareTruststore(new SquareSSLSocketFactory(readTruststore), (X509TrustManager) readTruststore[0]);
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }
}
