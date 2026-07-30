package q4;

import com.drake.net.NetConfig;
import com.drake.net.interceptor.NetOkHttpInterceptor;
import com.drake.net.utils.c;
import com.drake.net.utils.d;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.s;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public abstract class a {
    public static final OkHttpClient.Builder setConverter(OkHttpClient.Builder builder, com.drake.net.convert.a converter) {
        s.checkNotNullParameter(builder, "<this>");
        s.checkNotNullParameter(converter, "converter");
        NetConfig.INSTANCE.setConverter(converter);
        return builder;
    }

    public static final OkHttpClient.Builder setDebug(OkHttpClient.Builder builder, boolean z7, String tag) {
        s.checkNotNullParameter(builder, "<this>");
        s.checkNotNullParameter(tag, "tag");
        NetConfig netConfig = NetConfig.INSTANCE;
        netConfig.setDebug(z7);
        netConfig.setTAG(tag);
        return builder;
    }

    public static /* synthetic */ OkHttpClient.Builder setDebug$default(OkHttpClient.Builder builder, boolean z7, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = NetConfig.INSTANCE.getTAG();
        }
        return setDebug(builder, z7, str);
    }

    public static final OkHttpClient.Builder setDialogFactory(OkHttpClient.Builder builder, com.drake.net.interfaces.a dialogFactory) {
        s.checkNotNullParameter(builder, "<this>");
        s.checkNotNullParameter(dialogFactory, "dialogFactory");
        NetConfig.INSTANCE.setDialogFactory(dialogFactory);
        return builder;
    }

    public static final OkHttpClient.Builder setErrorHandler(OkHttpClient.Builder builder, com.drake.net.interfaces.b handler) {
        s.checkNotNullParameter(builder, "<this>");
        s.checkNotNullParameter(handler, "handler");
        NetConfig.INSTANCE.setErrorHandler(handler);
        return builder;
    }

    public static final OkHttpClient.Builder setRequestInterceptor(OkHttpClient.Builder builder, com.drake.net.interceptor.a interceptor) {
        s.checkNotNullParameter(builder, "<this>");
        s.checkNotNullParameter(interceptor, "interceptor");
        NetConfig.INSTANCE.setRequestInterceptor(interceptor);
        return builder;
    }

    public static final OkHttpClient.Builder setSSLCertificate(OkHttpClient.Builder builder, X509TrustManager x509TrustManager, InputStream inputStream, String str) {
        s.checkNotNullParameter(builder, "<this>");
        if (x509TrustManager == null) {
            try {
                x509TrustManager = c.INSTANCE.getUnSafeTrustManager();
            } catch (KeyManagementException e8) {
                throw new AssertionError(e8);
            } catch (NoSuchAlgorithmException e9) {
                throw new AssertionError(e9);
            }
        }
        KeyManager[] prepareKeyManager = d.prepareKeyManager(inputStream, str);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(prepareKeyManager, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        s.checkNotNullExpressionValue(socketFactory, "sslContext.socketFactory");
        builder.sslSocketFactory(socketFactory, x509TrustManager);
        return builder;
    }

    public static /* synthetic */ OkHttpClient.Builder setSSLCertificate$default(OkHttpClient.Builder builder, X509TrustManager x509TrustManager, InputStream inputStream, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            inputStream = null;
        }
        if ((i8 & 4) != 0) {
            str = null;
        }
        return setSSLCertificate(builder, x509TrustManager, inputStream, str);
    }

    public static final OkHttpClient.Builder toNetOkhttp(OkHttpClient.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        List<Interceptor> interceptors = builder.interceptors();
        NetOkHttpInterceptor netOkHttpInterceptor = NetOkHttpInterceptor.INSTANCE;
        if (!interceptors.contains(netOkHttpInterceptor)) {
            builder.addInterceptor(netOkHttpInterceptor);
        }
        return builder;
    }

    public static final OkHttpClient.Builder trustSSLCertificate(OkHttpClient.Builder builder) {
        s.checkNotNullParameter(builder, "<this>");
        builder.hostnameVerifier(c.INSTANCE.getUnSafeHostnameVerifier());
        setSSLCertificate$default(builder, (X509TrustManager) null, (InputStream) null, (String) null, 6, (Object) null);
        return builder;
    }

    public static /* synthetic */ OkHttpClient.Builder setSSLCertificate$default(OkHttpClient.Builder builder, InputStream[] inputStreamArr, InputStream inputStream, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            inputStream = null;
        }
        if ((i8 & 4) != 0) {
            str = null;
        }
        return setSSLCertificate(builder, inputStreamArr, inputStream, str);
    }

    public static final OkHttpClient.Builder setSSLCertificate(OkHttpClient.Builder builder, InputStream[] certificates, InputStream inputStream, String str) {
        s.checkNotNullParameter(builder, "<this>");
        s.checkNotNullParameter(certificates, "certificates");
        TrustManager[] prepareTrustManager = d.prepareTrustManager((InputStream[]) Arrays.copyOf(certificates, certificates.length));
        setSSLCertificate(builder, prepareTrustManager != null ? d.chooseTrustManager(prepareTrustManager) : null, inputStream, str);
        return builder;
    }
}
