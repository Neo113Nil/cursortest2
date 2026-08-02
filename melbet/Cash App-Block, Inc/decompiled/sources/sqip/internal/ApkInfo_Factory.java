package sqip.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class ApkInfo_Factory implements Factory {
    private final Provider contextProvider;

    private ApkInfo_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static ApkInfo_Factory create(Provider provider) {
        return new ApkInfo_Factory(provider);
    }

    public static ApkInfo newInstance(Application application) {
        return new ApkInfo(application);
    }

    @Override // javax.inject.Provider
    public ApkInfo get() {
        return newInstance((Application) this.contextProvider.get());
    }
}
