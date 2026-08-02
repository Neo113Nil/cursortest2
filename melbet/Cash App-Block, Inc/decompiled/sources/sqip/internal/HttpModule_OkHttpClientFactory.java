package sqip.internal;

import com.squareup.common.truststore.SquareTruststore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import okhttp3.OkHttpClient;

/* loaded from: classes10.dex */
public final class HttpModule_OkHttpClientFactory implements Factory {
    private final Provider gzipRequestInterceptorProvider;
    private final Provider headersInterceptorProvider;
    private final Provider squareTruststoreProvider;

    private HttpModule_OkHttpClientFactory(Provider provider, Provider provider2, Provider provider3) {
        this.squareTruststoreProvider = provider;
        this.headersInterceptorProvider = provider2;
        this.gzipRequestInterceptorProvider = provider3;
    }

    public static HttpModule_OkHttpClientFactory create(Provider provider, Provider provider2, Provider provider3) {
        return new HttpModule_OkHttpClientFactory(provider, provider2, provider3);
    }

    public static OkHttpClient okHttpClient(SquareTruststore squareTruststore, SquareHeadersInterceptor squareHeadersInterceptor, GzipRequestInterceptor gzipRequestInterceptor) {
        OkHttpClient okHttpClient = HttpModule.INSTANCE.okHttpClient(squareTruststore, squareHeadersInterceptor, gzipRequestInterceptor);
        Preconditions.checkNotNullFromProvides(okHttpClient);
        return okHttpClient;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return okHttpClient((SquareTruststore) this.squareTruststoreProvider.get(), (SquareHeadersInterceptor) this.headersInterceptorProvider.get(), (GzipRequestInterceptor) this.gzipRequestInterceptorProvider.get());
    }
}
