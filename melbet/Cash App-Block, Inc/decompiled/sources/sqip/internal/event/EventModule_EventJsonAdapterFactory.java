package sqip.internal.event;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class EventModule_EventJsonAdapterFactory implements Factory {
    private final Provider moshiProvider;

    private EventModule_EventJsonAdapterFactory(Provider provider) {
        this.moshiProvider = provider;
    }

    public static EventModule_EventJsonAdapterFactory create(Provider provider) {
        return new EventModule_EventJsonAdapterFactory(provider);
    }

    public static JsonAdapter eventJsonAdapter(Moshi moshi) {
        JsonAdapter eventJsonAdapter = EventModule.INSTANCE.eventJsonAdapter(moshi);
        Preconditions.checkNotNullFromProvides(eventJsonAdapter);
        return eventJsonAdapter;
    }

    @Override // javax.inject.Provider
    public JsonAdapter get() {
        return eventJsonAdapter((Moshi) this.moshiProvider.get());
    }
}
