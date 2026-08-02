package sqip.internal.event;

import android.content.res.Resources;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import sqip.internal.ApkInfo;
import sqip.internal.event.EventLogger;

/* loaded from: classes10.dex */
public final class EventLogger_Real_Factory implements Factory {
    private final Provider apkInfoProvider;
    private final Provider eventJsonAdapterProvider;
    private final Provider eventStreamServiceProvider;
    private final Provider eventsUploadExecutorProvider;
    private final Provider localeProvider;
    private final Provider resourcesProvider;
    private final Provider squareDeviceIdProvider;

    private EventLogger_Real_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.eventStreamServiceProvider = provider;
        this.eventsUploadExecutorProvider = provider2;
        this.eventJsonAdapterProvider = provider3;
        this.resourcesProvider = provider4;
        this.apkInfoProvider = provider5;
        this.localeProvider = provider6;
        this.squareDeviceIdProvider = provider7;
    }

    public static EventLogger_Real_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new EventLogger_Real_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static EventLogger.Real newInstance(EventStreamService eventStreamService, ExecutorService executorService, JsonAdapter jsonAdapter, Resources resources, ApkInfo apkInfo, Locale locale, String str) {
        return new EventLogger.Real(eventStreamService, executorService, jsonAdapter, resources, apkInfo, locale, str);
    }

    @Override // javax.inject.Provider
    public EventLogger.Real get() {
        return newInstance((EventStreamService) this.eventStreamServiceProvider.get(), (ExecutorService) this.eventsUploadExecutorProvider.get(), (JsonAdapter) this.eventJsonAdapterProvider.get(), (Resources) this.resourcesProvider.get(), (ApkInfo) this.apkInfoProvider.get(), (Locale) this.localeProvider.get(), (String) this.squareDeviceIdProvider.get());
    }
}
