package e3;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2413a implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    private final X509TrustManager[] f36607a;

    /* renamed from: b, reason: collision with root package name */
    private final List f36608b;

    public C2413a(X509TrustManager[] delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f36607a = delegates;
        ArrayList arrayList = new ArrayList(delegates.length);
        for (X509TrustManager x509TrustManager : delegates) {
            arrayList.add(new X509TrustManagerExtensions(x509TrustManager));
        }
        this.f36608b = arrayList;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] chain, String authType) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        for (X509TrustManager x509TrustManager : this.f36607a) {
            try {
                x509TrustManager.checkClientTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] chain, String authType) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        for (X509TrustManager x509TrustManager : this.f36607a) {
            try {
                x509TrustManager.checkServerTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509TrustManager[] x509TrustManagerArr = this.f36607a;
        ArrayList arrayList = new ArrayList();
        for (X509TrustManager x509TrustManager : x509TrustManagerArr) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "it.acceptedIssuers");
            CollectionsKt.addAll(arrayList, AbstractC3219i.G0(acceptedIssuers));
        }
        Object[] array = arrayList.toArray(new X509Certificate[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (X509Certificate[]) array;
    }

    @NotNull
    public final List<X509Certificate> checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull String host) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(host, "host");
        Iterator it = this.f36608b.iterator();
        while (it.hasNext()) {
            try {
                List<X509Certificate> checkServerTrusted = ((X509TrustManagerExtensions) it.next()).checkServerTrusted(chain, authType, host);
                Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "delegateExtension.checkS…ed(chain, authType, host)");
                return checkServerTrusted;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
