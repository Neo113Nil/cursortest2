package sqip.internal;

import dagger.internal.Factory;
import dagger.internal.Provider;
import sqip.internal.event.EventLogger;

/* loaded from: classes10.dex */
public final class CardEntryStateManager_Factory implements Factory {
    private final Provider eventLoggerProvider;

    private CardEntryStateManager_Factory(Provider provider) {
        this.eventLoggerProvider = provider;
    }

    public static CardEntryStateManager_Factory create(Provider provider) {
        return new CardEntryStateManager_Factory(provider);
    }

    public static CardEntryStateManager newInstance(EventLogger eventLogger) {
        return new CardEntryStateManager(eventLogger);
    }

    @Override // javax.inject.Provider
    public CardEntryStateManager get() {
        return newInstance((EventLogger) this.eventLoggerProvider.get());
    }
}
