package sqip.internal;

import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class SquareHeadersInterceptor_Factory implements Factory {
    private final Provider localeProvider;
    private final Provider squareDeviceIdProvider;

    private SquareHeadersInterceptor_Factory(Provider provider, Provider provider2) {
        this.squareDeviceIdProvider = provider;
        this.localeProvider = provider2;
    }

    public static SquareHeadersInterceptor_Factory create(Provider provider, Provider provider2) {
        return new SquareHeadersInterceptor_Factory(provider, provider2);
    }

    public static SquareHeadersInterceptor newInstance(String str, Locale locale) {
        return new SquareHeadersInterceptor(str, locale);
    }

    @Override // javax.inject.Provider
    public SquareHeadersInterceptor get() {
        return newInstance((String) this.squareDeviceIdProvider.get(), (Locale) this.localeProvider.get());
    }
}
