package sqip.internal;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class HttpModule_SharedPreferencesFactory implements Factory {
    private final Provider contextProvider;

    private HttpModule_SharedPreferencesFactory(Provider provider) {
        this.contextProvider = provider;
    }

    public static HttpModule_SharedPreferencesFactory create(Provider provider) {
        return new HttpModule_SharedPreferencesFactory(provider);
    }

    public static SharedPreferences sharedPreferences(Application application) {
        SharedPreferences sharedPreferences = HttpModule.INSTANCE.sharedPreferences(application);
        Preconditions.checkNotNullFromProvides(sharedPreferences);
        return sharedPreferences;
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return sharedPreferences((Application) this.contextProvider.get());
    }
}
