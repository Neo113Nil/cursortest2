package sqip.internal.nonce;

import android.content.res.Resources;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import sqip.internal.DeviceInfo;
import sqip.internal.NetworkMonitor;
import sqip.internal.nonce.CreateNonceCall;

/* loaded from: classes10.dex */
public final class CreateNonceCall_Factory_Factory implements Factory {
    private final Provider createGooglePayNonceServiceProvider;
    private final Provider deviceInfoProvider;
    private final Provider errorAdapterProvider;
    private final Provider networkMonitorProvider;
    private final Provider resourcesProvider;

    private CreateNonceCall_Factory_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.errorAdapterProvider = provider;
        this.createGooglePayNonceServiceProvider = provider2;
        this.networkMonitorProvider = provider3;
        this.resourcesProvider = provider4;
        this.deviceInfoProvider = provider5;
    }

    public static CreateNonceCall_Factory_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new CreateNonceCall_Factory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static CreateNonceCall.Factory newInstance(JsonAdapter jsonAdapter, CreateGooglePayNonceService createGooglePayNonceService, NetworkMonitor networkMonitor, Resources resources, DeviceInfo deviceInfo) {
        return new CreateNonceCall.Factory(jsonAdapter, createGooglePayNonceService, networkMonitor, resources, deviceInfo);
    }

    @Override // javax.inject.Provider
    public CreateNonceCall.Factory get() {
        return newInstance((JsonAdapter) this.errorAdapterProvider.get(), (CreateGooglePayNonceService) this.createGooglePayNonceServiceProvider.get(), (NetworkMonitor) this.networkMonitorProvider.get(), (Resources) this.resourcesProvider.get(), (DeviceInfo) this.deviceInfoProvider.get());
    }
}
