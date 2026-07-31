package ru.rustore.sdk.pay.internal.network.ssl;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.util.Log;
import androidx.annotation.Keep;
import f2.AbstractC2420c;
import java.io.ByteArrayInputStream;
import java.net.Socket;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.internal.co;

@Metadata
@SuppressLint({"CustomX509TrustManager", "NewApi"})
/* loaded from: classes3.dex */
public final class CompositeX509TrustManagerApi24 extends X509ExtendedTrustManager {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f44700a;

    public CompositeX509TrustManagerApi24(@NotNull List selfSignedCertificates) {
        Intrinsics.checkNotNullParameter(selfSignedCertificates, "selfSignedCertificates");
        ArrayList arrayList = new ArrayList();
        X509TrustManager a4 = a(null);
        if (a4 != null) {
            try {
                arrayList.add(new co(a4, new X509TrustManagerExtensions(a4)));
            } catch (Exception e4) {
                Log.e("CompositeX509TrustManagerApi24", e4.toString());
            }
        }
        if (!selfSignedCertificates.isEmpty()) {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            Intrinsics.checkNotNullExpressionValue(certificateFactory, "getInstance(\"X.509\")");
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(selfSignedCertificates, 10));
            Iterator it = selfSignedCertificates.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                try {
                    Certificate generateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
                    AbstractC2420c.a(byteArrayInputStream, null);
                    arrayList2.add(generateCertificate);
                } finally {
                }
            }
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int size = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                keyStore.setCertificateEntry("ca" + i5, (Certificate) obj);
                i5 = i6;
            }
            X509TrustManager a5 = a(keyStore);
            if (a5 != null) {
                try {
                    arrayList.add(new co(a5, new X509TrustManagerExtensions(a5)));
                } catch (Exception e5) {
                    Log.e("CompositeX509TrustManagerApi24", e5.toString());
                }
            }
        }
        this.f44700a = arrayList;
    }

    public static X509TrustManager a(KeyStore keyStore) {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.checkNotNullExpressionValue(trustManagers, "factory.trustManagers");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            return (X509TrustManager) CollectionsKt.firstOrNull((List) arrayList);
        } catch (KeyStoreException e4) {
            Log.e("CompositeX509TrustManagerApi24", e4.toString());
            return null;
        } catch (NoSuchAlgorithmException e5) {
            Log.e("CompositeX509TrustManagerApi24", e5.toString());
            return null;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull Socket conn) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(conn, "conn");
        checkClientTrusted(chain, authType);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull Socket conn) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(conn, "conn");
        String hostName = conn.getInetAddress().getHostName();
        ArrayList arrayList = this.f44700a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                ((co) obj).f43942b.checkServerTrusted(chain, authType, hostName);
                return;
            } catch (CertificateException e4) {
                Log.e("CompositeX509TrustManagerApi24", e4.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = this.f44700a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            X509Certificate[] acceptedIssuers = ((co) obj).f43941a.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "it.trustManager.acceptedIssuers");
            CollectionsKt.addAll(arrayList2, AbstractC3219i.G0(acceptedIssuers));
        }
        return (X509Certificate[]) arrayList2.toArray(new X509Certificate[0]);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(@NotNull X509Certificate[] chain, @Nullable String str, @NotNull SSLEngine ssl) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(ssl, "ssl");
        checkClientTrusted(chain, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        ArrayList arrayList = this.f44700a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                ((co) obj).f43941a.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e4) {
                Log.e("CompositeX509TrustManagerApi24", e4.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(@NotNull X509Certificate[] chain, @Nullable String str, @NotNull SSLEngine ssl) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(ssl, "ssl");
        String peerHost = ssl.getSession().getPeerHost();
        ArrayList arrayList = this.f44700a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                ((co) obj).f43942b.checkServerTrusted(chain, str, peerHost);
                return;
            } catch (CertificateException e4) {
                Log.e("CompositeX509TrustManagerApi24", e4.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        ArrayList arrayList = this.f44700a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                ((co) obj).f43941a.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e4) {
                Log.e("CompositeX509TrustManagerApi24", e4.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Keep
    @NotNull
    public final List<X509Certificate> checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable String str2) {
        ArrayList arrayList = this.f44700a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                List<X509Certificate> checkServerTrusted = ((co) obj).f43942b.checkServerTrusted(x509CertificateArr, str, str2);
                Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "pair.trustExtensions.che…ed(chain, authType, host)");
                return checkServerTrusted;
            } catch (CertificateException e4) {
                Log.e("CompositeX509TrustManagerApi24", e4.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
