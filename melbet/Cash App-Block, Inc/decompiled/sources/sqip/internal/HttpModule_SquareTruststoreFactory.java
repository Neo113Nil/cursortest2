package sqip.internal;

import android.app.Application;
import com.squareup.common.truststore.SquareTruststore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class HttpModule_SquareTruststoreFactory implements Factory {
    private final Provider contextProvider;

    private HttpModule_SquareTruststoreFactory(Provider provider) {
        this.contextProvider = provider;
    }

    public static HttpModule_SquareTruststoreFactory create(Provider provider) {
        return new HttpModule_SquareTruststoreFactory(provider);
    }

    public static SquareTruststore squareTruststore(Application application) {
        SquareTruststore squareTruststore = HttpModule.INSTANCE.squareTruststore(application);
        Preconditions.checkNotNullFromProvides(squareTruststore);
        return squareTruststore;
    }

    @Override // javax.inject.Provider
    public SquareTruststore get() {
        return squareTruststore((Application) this.contextProvider.get());
    }
}
