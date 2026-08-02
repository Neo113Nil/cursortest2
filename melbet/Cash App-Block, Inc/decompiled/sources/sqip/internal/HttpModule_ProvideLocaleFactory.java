package sqip.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class HttpModule_ProvideLocaleFactory implements Factory {
    private final Provider applicationProvider;

    private HttpModule_ProvideLocaleFactory(Provider provider) {
        this.applicationProvider = provider;
    }

    public static HttpModule_ProvideLocaleFactory create(Provider provider) {
        return new HttpModule_ProvideLocaleFactory(provider);
    }

    public static Locale provideLocale(Application application) {
        Locale provideLocale = HttpModule.INSTANCE.provideLocale(application);
        Preconditions.checkNotNullFromProvides(provideLocale);
        return provideLocale;
    }

    @Override // javax.inject.Provider
    public Locale get() {
        return provideLocale((Application) this.applicationProvider.get());
    }
}
