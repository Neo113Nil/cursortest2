package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jw1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bv f27876a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final W1.h f27877b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private KeyStore f27878c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private X509TrustManager f27879d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f27880e;

    static final class a extends kotlin.jvm.internal.s implements Function0<X509TrustManager> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f27881b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            X509TrustManager a4 = a72.a((KeyStore) null);
            if (a4 != null) {
                return a4;
            }
            throw new IllegalArgumentException("Failed to create default TrustManager");
        }
    }

    public jw1(@NotNull bv customCertificatesProvider) {
        Intrinsics.checkNotNullParameter(customCertificatesProvider, "customCertificatesProvider");
        this.f27876a = customCertificatesProvider;
        this.f27877b = W1.i.b(a.f27881b);
        this.f27880e = new Object();
    }

    public final void a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        ((X509TrustManager) this.f27877b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    public final void b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        Unit unit;
        try {
            ((X509TrustManager) this.f27877b.getValue()).checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e4) {
            synchronized (this.f27880e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager = this.f27879d;
                    if (x509TrustManager != null) {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                        unit = Unit.f41027a;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        Unit unit2 = Unit.f41027a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @NotNull
    public final X509Certificate[] c() {
        X509Certificate[] acceptedIssuers = ((X509TrustManager) this.f27877b.getValue()).getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }

    private final void a() {
        KeyStore keyStore;
        b();
        b();
        if (this.f27878c == null) {
            int i4 = a72.f23181b;
            KeyStore keyStore2 = null;
            try {
                keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                try {
                    keyStore.load(null);
                } catch (IOException unused) {
                }
            } catch (GeneralSecurityException unused2) {
                keyStore = null;
            }
            if (keyStore == null) {
                Log.w("SdkTrustManager", "Custom KeyStore is null, failed to add certs");
            } else {
                byte[][] a4 = this.f27876a.a();
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                for (byte[] bArr : a4) {
                    X509Certificate a5 = a72.a(bArr);
                    if (a5 != null) {
                        arrayList.add(a5);
                    }
                }
                int size = arrayList.size();
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    a(keyStore, (X509Certificate) obj);
                }
                keyStore2 = keyStore;
            }
            this.f27878c = keyStore2;
        }
        b();
        if (this.f27879d == null) {
            b();
            if (this.f27878c != null) {
                b();
                this.f27879d = a72.a(this.f27878c);
            }
        }
    }

    public final void b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) {
        Unit unit;
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) this.f27877b.getValue();
            if (a72.a()) {
                C2297vd.b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e4) {
            synchronized (this.f27880e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager2 = this.f27879d;
                    if (x509TrustManager2 != null) {
                        if (a72.a()) {
                            C2297vd.b(x509TrustManager2, x509CertificateArr, str, socket);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        unit = Unit.f41027a;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        Unit unit2 = Unit.f41027a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static void a(KeyStore keyStore, X509Certificate x509Certificate) {
        try {
            keyStore.setCertificateEntry("custom_cert_" + keyStore.size(), x509Certificate);
        } catch (KeyStoreException e4) {
            Log.w("SdkTrustManager", "Failed to store certificate", e4);
        }
    }

    public final void a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable Socket socket) {
        if (a72.a()) {
            C2297vd.a((X509TrustManager) this.f27877b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) this.f27877b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    public final void b(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) {
        Unit unit;
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) this.f27877b.getValue();
            if (a72.a()) {
                C2297vd.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e4) {
            synchronized (this.f27880e) {
                try {
                    a();
                    b();
                    X509TrustManager x509TrustManager2 = this.f27879d;
                    if (x509TrustManager2 != null) {
                        if (a72.a()) {
                            C2297vd.b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                        } else {
                            x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                        }
                        unit = Unit.f41027a;
                    } else {
                        unit = null;
                    }
                    if (unit != null) {
                        Unit unit2 = Unit.f41027a;
                    } else {
                        Log.w("SdkTrustManager", "Custom TrustManager is null");
                        throw e4;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable SSLEngine sSLEngine) {
        if (a72.a()) {
            C2297vd.a((X509TrustManager) this.f27877b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) this.f27877b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    private final void b() {
        if (!Thread.holdsLock(this.f27880e)) {
            throw new IllegalStateException("Operation should be performed under lock");
        }
    }
}
