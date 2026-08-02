package sqip.internal.nonce;

import android.content.res.Resources;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import sqip.internal.CardEntryActivityController;
import sqip.internal.event.EventLogger;

/* loaded from: classes10.dex */
public final class ActivityControllerModule_CardEntryActivityControllerFactory implements Factory {
    private final Provider cardNonceRequestHandlerProvider;
    private final Provider eventLoggerProvider;
    private final Provider factoryProvider;
    private final Provider resourcesProvider;

    private ActivityControllerModule_CardEntryActivityControllerFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.factoryProvider = provider;
        this.cardNonceRequestHandlerProvider = provider2;
        this.eventLoggerProvider = provider3;
        this.resourcesProvider = provider4;
    }

    public static CardEntryActivityController cardEntryActivityController(CardEntryActivityControllerFactory cardEntryActivityControllerFactory, CreateCardNonceRequestHandler createCardNonceRequestHandler, EventLogger eventLogger, Resources resources) {
        CardEntryActivityController cardEntryActivityController = ActivityControllerModule.INSTANCE.cardEntryActivityController(cardEntryActivityControllerFactory, createCardNonceRequestHandler, eventLogger, resources);
        Preconditions.checkNotNullFromProvides(cardEntryActivityController);
        return cardEntryActivityController;
    }

    public static ActivityControllerModule_CardEntryActivityControllerFactory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new ActivityControllerModule_CardEntryActivityControllerFactory(provider, provider2, provider3, provider4);
    }

    @Override // javax.inject.Provider
    public CardEntryActivityController get() {
        return cardEntryActivityController((CardEntryActivityControllerFactory) this.factoryProvider.get(), (CreateCardNonceRequestHandler) this.cardNonceRequestHandlerProvider.get(), (EventLogger) this.eventLoggerProvider.get(), (Resources) this.resourcesProvider.get());
    }
}
