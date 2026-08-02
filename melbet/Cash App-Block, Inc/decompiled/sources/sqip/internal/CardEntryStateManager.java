package sqip.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import sqip.internal.CardEditorState;
import sqip.internal.event.EventLogger;
import sqip.internal.event.IapEvent;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lsqip/internal/CardEntryStateManager;", "", "eventLogger", "Lsqip/internal/event/EventLogger;", "(Lsqip/internal/event/EventLogger;)V", "cardEntryState", "Lsqip/internal/CardEditorState;", "stateChangedListeners", "", "Lsqip/internal/StateListener;", "addStateChangedListener", "", "listener", "clearListeners", "init", "state", "isCompletionStatusChangedIn", "", "newState", "logStateChanges", "updateState", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardEntryStateManager {
    private CardEditorState cardEntryState;
    private final EventLogger eventLogger;
    private final List<StateListener> stateChangedListeners;

    public CardEntryStateManager(EventLogger eventLogger) {
        eventLogger.getClass();
        this.eventLogger = eventLogger;
        this.cardEntryState = new CardEditorState(null, null, null, null, null, null, null, null, null, null, 0, false, false, false, false, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE, null);
        this.stateChangedListeners = new ArrayList();
    }

    private final boolean isCompletionStatusChangedIn(CardEditorState newState) {
        return (newState.getCardNumberCompletionStatus() == this.cardEntryState.getCardNumberCompletionStatus() && newState.getExpirationCompletionStatus() == this.cardEntryState.getExpirationCompletionStatus() && newState.getCvvCompletionStatus() == this.cardEntryState.getCvvCompletionStatus() && newState.getPostalCompletionStatus() == this.cardEntryState.getPostalCompletionStatus()) ? false : true;
    }

    private final void logStateChanges(CardEditorState newState) {
        for (CardEditorState.Field field : CardEditorState.Field.getEntries()) {
            if (newState.hasNewError(this.cardEntryState, field)) {
                String name = field.name();
                Locale locale = Locale.US;
                this.eventLogger.log(new IapEvent.CardEntry.ValidationError(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, name, locale)));
            }
        }
    }

    public final void addStateChangedListener(StateListener listener) {
        listener.getClass();
        this.stateChangedListeners.add(listener);
    }

    public final void clearListeners() {
        this.stateChangedListeners.clear();
    }

    public final void init(CardEditorState state) {
        state.getClass();
        this.cardEntryState = state;
        for (StateListener stateListener : this.stateChangedListeners) {
            stateListener.onBrandChanged(state.getBrand());
            stateListener.onFocusChanged(state);
            stateListener.onCompletionStatusChanged(state);
            stateListener.onProcessingRequest(state.isProcessingRequest());
            stateListener.onStateChanged(state);
        }
    }

    public final void updateState(CardEditorState newState) {
        newState.getClass();
        logStateChanges(newState);
        if (newState.getBrand() != this.cardEntryState.getBrand()) {
            Iterator<T> it = this.stateChangedListeners.iterator();
            while (it.hasNext()) {
                ((StateListener) it.next()).onBrandChanged(newState.getBrand());
            }
        }
        if (newState.getFocusedField() != this.cardEntryState.getFocusedField()) {
            Iterator<T> it2 = this.stateChangedListeners.iterator();
            while (it2.hasNext()) {
                ((StateListener) it2.next()).onFocusChanged(newState);
            }
        }
        if (isCompletionStatusChangedIn(newState)) {
            Iterator<T> it3 = this.stateChangedListeners.iterator();
            while (it3.hasNext()) {
                ((StateListener) it3.next()).onCompletionStatusChanged(newState);
            }
        }
        if (newState.isProcessingRequest() != this.cardEntryState.isProcessingRequest()) {
            Iterator<T> it4 = this.stateChangedListeners.iterator();
            while (it4.hasNext()) {
                ((StateListener) it4.next()).onProcessingRequest(newState.isProcessingRequest());
            }
        }
        Iterator<T> it5 = this.stateChangedListeners.iterator();
        while (it5.hasNext()) {
            ((StateListener) it5.next()).onStateChanged(newState);
        }
        this.cardEntryState = newState;
    }
}
