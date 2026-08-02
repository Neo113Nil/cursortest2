package sqip.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class HttpModule_InstallerPackageNameFactory implements Factory {
    private final Provider contextProvider;

    private HttpModule_InstallerPackageNameFactory(Provider provider) {
        this.contextProvider = provider;
    }

    public static HttpModule_InstallerPackageNameFactory create(Provider provider) {
        return new HttpModule_InstallerPackageNameFactory(provider);
    }

    public static String installerPackageName(Application application) {
        String installerPackageName = HttpModule.INSTANCE.installerPackageName(application);
        Preconditions.checkNotNullFromProvides(installerPackageName);
        return installerPackageName;
    }

    @Override // javax.inject.Provider
    public String get() {
        return installerPackageName((Application) this.contextProvider.get());
    }
}
