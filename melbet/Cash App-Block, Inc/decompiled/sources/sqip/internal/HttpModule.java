package sqip.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.common.truststore.SquareSSLSocketFactory;
import com.squareup.common.truststore.SquareTruststore;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import sqip.internal.nonce.CreateCardNonceErrorResponse;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003!\"#B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\tH\u0007J\"\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u001d\u001a\u00020\u0004H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lsqip/internal/HttpModule;", "", "()V", "SHARED_PREFERENCE_SQUARE", "", "UNIQUE_SQUARE_ID", "connectivityManager", "Landroid/net/ConnectivityManager;", "context", "Landroid/app/Application;", "createCardNonceErrorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lsqip/internal/nonce/CreateCardNonceErrorResponse;", "moshi", "Lcom/squareup/moshi/Moshi;", "installerPackageName", "okHttpClient", "Lokhttp3/OkHttpClient;", "squareTruststore", "Lcom/squareup/common/truststore/SquareTruststore;", "headersInterceptor", "Lsqip/internal/SquareHeadersInterceptor;", "gzipRequestInterceptor", "Lsqip/internal/GzipRequestInterceptor;", "provideLocale", "Ljava/util/Locale;", "application", "retrofit", "Lretrofit2/Retrofit;", "paymentUrl", "sharedPreferences", "Landroid/content/SharedPreferences;", "squareDeviceId", "InstallerPackageName", "PaymentUrl", "SquareDeviceId", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HttpModule {
    public static final HttpModule INSTANCE = new HttpModule();
    private static final String SHARED_PREFERENCE_SQUARE = "SQUARE-STORAGE";
    public static final String UNIQUE_SQUARE_ID = "Square-Device-ID";

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lsqip/internal/HttpModule$InstallerPackageName;", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface InstallerPackageName {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lsqip/internal/HttpModule$PaymentUrl;", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface PaymentUrl {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lsqip/internal/HttpModule$SquareDeviceId;", "", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public @interface SquareDeviceId {
    }

    private HttpModule() {
    }

    public final ConnectivityManager connectivityManager(Application context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        return (ConnectivityManager) systemService;
    }

    public final JsonAdapter createCardNonceErrorResponseAdapter(Moshi moshi) {
        moshi.getClass();
        moshi.getClass();
        JsonAdapter adapter = moshi.adapter(CreateCardNonceErrorResponse.class, Util.NO_ANNOTATIONS);
        adapter.getClass();
        return adapter;
    }

    @InstallerPackageName
    public final String installerPackageName(Application context) {
        context.getClass();
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "null" : installerPackageName;
    }

    public final Moshi moshi() {
        return new Moshi(new Moshi.Builder());
    }

    public final OkHttpClient okHttpClient(SquareTruststore squareTruststore, SquareHeadersInterceptor headersInterceptor, GzipRequestInterceptor gzipRequestInterceptor) {
        squareTruststore.getClass();
        headersInterceptor.getClass();
        gzipRequestInterceptor.getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        SquareSSLSocketFactory squareSSLSocketFactory = squareTruststore.sslSocketFactory;
        X509TrustManager x509TrustManager = squareTruststore.trustManager;
        x509TrustManager.getClass();
        builder.sslSocketFactory(squareSSLSocketFactory, x509TrustManager);
        ArrayList arrayList = builder.interceptors;
        arrayList.add(headersInterceptor);
        arrayList.add(gzipRequestInterceptor);
        return new OkHttpClient(builder);
    }

    public final Locale provideLocale(Application application) {
        application.getClass();
        Locale locale = application.getResources().getConfiguration().getLocales().get(0);
        locale.getClass();
        return locale;
    }

    public final Retrofit retrofit(OkHttpClient okHttpClient, Moshi moshi, @PaymentUrl String paymentUrl) {
        okHttpClient.getClass();
        moshi.getClass();
        paymentUrl.getClass();
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.callFactory = okHttpClient;
        builder.baseUrl(paymentUrl);
        ((ArrayList) builder.converterFactories).add(MoshiConverterFactory.create(moshi));
        return builder.build();
    }

    public final SharedPreferences sharedPreferences(Application context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCE_SQUARE, 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    @SquareDeviceId
    public final String squareDeviceId(SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        String string2 = sharedPreferences.getString(UNIQUE_SQUARE_ID, "");
        string2.getClass();
        if (string2.length() != 0) {
            return string2;
        }
        String m = Boxes$$ExternalSyntheticOutline1.m();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(UNIQUE_SQUARE_ID, m);
        edit.apply();
        return m;
    }

    public final SquareTruststore squareTruststore(Application context) {
        context.getClass();
        return SquareTruststore.create(context);
    }
}
