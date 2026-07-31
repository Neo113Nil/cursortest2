package ru.rustore.sdk.pay.internal.network.ssl;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.util.Log;
import androidx.annotation.Keep;
import f2.AbstractC2420c;
import java.io.ByteArrayInputStream;
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
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
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
@SuppressLint({"CustomX509TrustManager"})
/* loaded from: classes3.dex */
public final class CompositeX509TrustManager implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList f44699a;

    public CompositeX509TrustManager(@NotNull List selfSignedCertificates) {
        Intrinsics.checkNotNullParameter(selfSignedCertificates, "selfSignedCertificates");
        ArrayList arrayList = new ArrayList();
        X509TrustManager a4 = a(null);
        if (a4 != null) {
            arrayList.add(a4);
        }
        int i4 = 0;
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
            int i5 = 0;
            int i6 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                keyStore.setCertificateEntry("ca" + i6, (Certificate) obj);
                i6 = i7;
            }
            X509TrustManager a5 = a(keyStore);
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size2 = arrayList.size();
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            X509TrustManager x509TrustManager = (X509TrustManager) obj2;
            arrayList3.add(new co(x509TrustManager, new X509TrustManagerExtensions(x509TrustManager)));
        }
        this.f44699a = arrayList3;
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
            Log.e("CompositeX509TrustManager", e4.toString());
            return null;
        } catch (NoSuchAlgorithmException e5) {
            Log.e("CompositeX509TrustManager", e5.toString());
            return null;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        ArrayList arrayList = this.f44699a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                ((co) obj).f43941a.checkClientTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e4) {
                Log.e("CompositeX509TrustManager", e4.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str) {
        ArrayList arrayList = this.f44699a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                ((co) obj).f43941a.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e4) {
                Log.e("CompositeX509TrustManager", e4.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        ArrayList arrayList = this.f44699a;
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

    @Keep
    @NotNull
    public final List<X509Certificate> checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str, @Nullable String str2) {
        ArrayList arrayList = this.f44699a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            try {
                List<X509Certificate> checkServerTrusted = ((co) obj).f43942b.checkServerTrusted(x509CertificateArr, str, str2);
                Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "trustManager.trustExtens…ed(chain, authType, host)");
                return checkServerTrusted;
            } catch (CertificateException e4) {
                Log.e("CompositeX509TrustManager", e4.toString());
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
