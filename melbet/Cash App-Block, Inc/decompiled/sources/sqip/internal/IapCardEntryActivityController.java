package sqip.internal;

import android.content.res.Resources;
import kotlin.Metadata;
import sqip.internal.event.EventLogger;
import sqip.internal.nonce.CreateCardNonceRequestHandler;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lsqip/internal/IapCardEntryActivityController;", "Lsqip/internal/CardEntryActivityController;", "cardNonceRequestHandler", "Lsqip/internal/nonce/CreateCardNonceRequestHandler;", "eventLogger", "Lsqip/internal/event/EventLogger;", "resources", "Landroid/content/res/Resources;", "(Lsqip/internal/nonce/CreateCardNonceRequestHandler;Lsqip/internal/event/EventLogger;Landroid/content/res/Resources;)V", "getCardNonceRequestHandler", "()Lsqip/internal/nonce/CreateCardNonceRequestHandler;", "getEventLogger", "()Lsqip/internal/event/EventLogger;", "getResources", "()Landroid/content/res/Resources;", "doSubmitCardData", "", "cardEditor", "Lsqip/internal/ReadableCardEditor;", "isGiftCard", "", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class IapCardEntryActivityController extends CardEntryActivityController {
    private final CreateCardNonceRequestHandler cardNonceRequestHandler;
    private final EventLogger eventLogger;
    private final Resources resources;

    public IapCardEntryActivityController(CreateCardNonceRequestHandler createCardNonceRequestHandler, EventLogger eventLogger, Resources resources) {
        createCardNonceRequestHandler.getClass();
        eventLogger.getClass();
        resources.getClass();
        this.cardNonceRequestHandler = createCardNonceRequestHandler;
        this.eventLogger = eventLogger;
        this.resources = resources;
    }

    @Override // sqip.internal.CardEntryActivityController
    public void doSubmitCardData(ReadableCardEditor cardEditor, boolean isGiftCard) {
        cardEditor.getClass();
        if (isGiftCard) {
            getCardNonceRequestHandler().retrieveGiftCardNonce(cardEditor.getCardNumber(), new IapCardEntryActivityController$doSubmitCardData$1(this));
        } else {
            getCardNonceRequestHandler().retrieveNonce(cardEditor.getCardNumber(), cardEditor.getMonth(), cardEditor.getYear(), cardEditor.getCvv(), cardEditor.getPostal(), new IapCardEntryActivityController$doSubmitCardData$2(this));
        }
    }

    @Override // sqip.internal.CardEntryActivityController
    public CreateCardNonceRequestHandler getCardNonceRequestHandler() {
        return this.cardNonceRequestHandler;
    }

    @Override // sqip.internal.CardEntryActivityController
    public EventLogger getEventLogger() {
        return this.eventLogger;
    }

    @Override // sqip.internal.CardEntryActivityController
    public Resources getResources() {
        return this.resources;
    }
}
