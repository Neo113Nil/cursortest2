package sqip.internal;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class HttpModule_SquareDeviceIdFactory implements Factory {
    private final Provider sharedPreferencesProvider;

    private HttpModule_SquareDeviceIdFactory(Provider provider) {
        this.sharedPreferencesProvider = provider;
    }

    public static HttpModule_SquareDeviceIdFactory create(Provider provider) {
        return new HttpModule_SquareDeviceIdFactory(provider);
    }

    public static String squareDeviceId(SharedPreferences sharedPreferences) {
        String squareDeviceId = HttpModule.INSTANCE.squareDeviceId(sharedPreferences);
        Preconditions.checkNotNullFromProvides(squareDeviceId);
        return squareDeviceId;
    }

    @Override // javax.inject.Provider
    public String get() {
        return squareDeviceId((SharedPreferences) this.sharedPreferencesProvider.get());
    }
}
