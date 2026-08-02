package sqip.internal.nonce;

import kotlin.Metadata;
import sqip.internal.CardEntryActivityController;
import sqip.internal.CardEntryStateManager;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lsqip/internal/nonce/CardEntryActivityComponent;", "", "cardEntryActivityController", "Lsqip/internal/CardEntryActivityController;", "cardStateManager", "Lsqip/internal/CardEntryStateManager;", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface CardEntryActivityComponent {
    CardEntryActivityController cardEntryActivityController();

    CardEntryStateManager cardStateManager();
}
