package sqip.internal.nonce;

import android.content.res.Resources;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import sqip.internal.DeviceInfo;
import sqip.internal.NetworkMonitor;
import sqip.internal.event.EventLogger;

/* loaded from: classes10.dex */
public final class RealCreateCardNonceRequestHandler_Factory implements Factory {
    private final Provider createCardNonceServiceProvider;
    private final Provider deviceInfoProvider;
    private final Provider errorAdapterProvider;
    private final Provider eventLoggerProvider;
    private final Provider networkMonitorProvider;
    private final Provider resourcesProvider;

    private RealCreateCardNonceRequestHandler_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.errorAdapterProvider = provider;
        this.createCardNonceServiceProvider = provider2;
        this.networkMonitorProvider = provider3;
        this.eventLoggerProvider = provider4;
        this.deviceInfoProvider = provider5;
        this.resourcesProvider = provider6;
    }

    public static RealCreateCardNonceRequestHandler_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new RealCreateCardNonceRequestHandler_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static RealCreateCardNonceRequestHandler newInstance(JsonAdapter jsonAdapter, CreateCardNonceService createCardNonceService, NetworkMonitor networkMonitor, EventLogger eventLogger, DeviceInfo deviceInfo, Resources resources) {
        return new RealCreateCardNonceRequestHandler(jsonAdapter, createCardNonceService, networkMonitor, eventLogger, deviceInfo, resources);
    }

    @Override // javax.inject.Provider
    public RealCreateCardNonceRequestHandler get() {
        return newInstance((JsonAdapter) this.errorAdapterProvider.get(), (CreateCardNonceService) this.createCardNonceServiceProvider.get(), (NetworkMonitor) this.networkMonitorProvider.get(), (EventLogger) this.eventLoggerProvider.get(), (DeviceInfo) this.deviceInfoProvider.get(), (Resources) this.resourcesProvider.get());
    }
}
