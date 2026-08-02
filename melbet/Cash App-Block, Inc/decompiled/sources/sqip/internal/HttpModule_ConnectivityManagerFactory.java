package sqip.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class HttpModule_ConnectivityManagerFactory implements Factory {
    private final Provider contextProvider;

    private HttpModule_ConnectivityManagerFactory(Provider provider) {
        this.contextProvider = provider;
    }

    public static ConnectivityManager connectivityManager(Application application) {
        ConnectivityManager connectivityManager = HttpModule.INSTANCE.connectivityManager(application);
        Preconditions.checkNotNullFromProvides(connectivityManager);
        return connectivityManager;
    }

    public static HttpModule_ConnectivityManagerFactory create(Provider provider) {
        return new HttpModule_ConnectivityManagerFactory(provider);
    }

    @Override // javax.inject.Provider
    public ConnectivityManager get() {
        return connectivityManager((Application) this.contextProvider.get());
    }
}
