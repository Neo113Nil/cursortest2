package sqip.internal;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class DeviceInfo_Factory implements Factory {
    private final Provider applicationProvider;
    private final Provider installerPackageNameProvider;
    private final Provider localeProvider;
    private final Provider squareDeviceIdProvider;

    private DeviceInfo_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.installerPackageNameProvider = provider;
        this.localeProvider = provider2;
        this.applicationProvider = provider3;
        this.squareDeviceIdProvider = provider4;
    }

    public static DeviceInfo_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new DeviceInfo_Factory(provider, provider2, provider3, provider4);
    }

    public static DeviceInfo newInstance(String str, javax.inject.Provider provider, Application application, String str2) {
        return new DeviceInfo(str, provider, application, str2);
    }

    @Override // javax.inject.Provider
    public DeviceInfo get() {
        return newInstance((String) this.installerPackageNameProvider.get(), this.localeProvider, (Application) this.applicationProvider.get(), (String) this.squareDeviceIdProvider.get());
    }
}
