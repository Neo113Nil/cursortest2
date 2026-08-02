package sqip.internal.event;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes10.dex */
public final class EventModule_EventStreamServiceFactory implements Factory {
    private final Provider retrofitProvider;

    private EventModule_EventStreamServiceFactory(Provider provider) {
        this.retrofitProvider = provider;
    }

    public static EventModule_EventStreamServiceFactory create(Provider provider) {
        return new EventModule_EventStreamServiceFactory(provider);
    }

    public static EventStreamService eventStreamService(Retrofit retrofit) {
        EventStreamService eventStreamService = EventModule.INSTANCE.eventStreamService(retrofit);
        Preconditions.checkNotNullFromProvides(eventStreamService);
        return eventStreamService;
    }

    @Override // javax.inject.Provider
    public EventStreamService get() {
        return eventStreamService((Retrofit) this.retrofitProvider.get());
    }
}
