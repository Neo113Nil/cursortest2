package sqip.internal.nonce;

import android.content.res.Resources;
import kotlin.Metadata;
import sqip.internal.CardEntryActivityController;
import sqip.internal.event.EventLogger;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lsqip/internal/nonce/ActivityControllerModule;", "", "()V", "cardEntryActivityController", "Lsqip/internal/CardEntryActivityController;", "factory", "Lsqip/internal/nonce/CardEntryActivityControllerFactory;", "cardNonceRequestHandler", "Lsqip/internal/nonce/CreateCardNonceRequestHandler;", "eventLogger", "Lsqip/internal/event/EventLogger;", "resources", "Landroid/content/res/Resources;", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityControllerModule {
    public static final ActivityControllerModule INSTANCE = new ActivityControllerModule();

    private ActivityControllerModule() {
    }

    public final CardEntryActivityController cardEntryActivityController(CardEntryActivityControllerFactory factory, CreateCardNonceRequestHandler cardNonceRequestHandler, EventLogger eventLogger, Resources resources) {
        factory.getClass();
        cardNonceRequestHandler.getClass();
        eventLogger.getClass();
        resources.getClass();
        return factory.makeController(cardNonceRequestHandler, eventLogger, resources);
    }
}
