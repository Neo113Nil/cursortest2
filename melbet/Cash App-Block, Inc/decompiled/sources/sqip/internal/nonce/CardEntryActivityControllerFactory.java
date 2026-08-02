package sqip.internal.nonce;

import android.content.res.Resources;
import kotlin.Metadata;
import sqip.internal.CardEntryActivityController;
import sqip.internal.event.EventLogger;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lsqip/internal/nonce/CardEntryActivityControllerFactory;", "", "makeController", "Lsqip/internal/CardEntryActivityController;", "cardNonceRequestHandler", "Lsqip/internal/nonce/CreateCardNonceRequestHandler;", "eventLogger", "Lsqip/internal/event/EventLogger;", "resources", "Landroid/content/res/Resources;", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CardEntryActivityControllerFactory {
    CardEntryActivityController makeController(CreateCardNonceRequestHandler cardNonceRequestHandler, EventLogger eventLogger, Resources resources);
}
