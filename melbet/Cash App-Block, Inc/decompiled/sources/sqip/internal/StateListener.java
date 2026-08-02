package sqip.internal;

import com.squareup.Card$Brand;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lsqip/internal/StateListener;", "", "onBrandChanged", "", "brand", "Lcom/squareup/Card$Brand;", "onCompletionStatusChanged", "newState", "Lsqip/internal/CardEditorState;", "onFocusChanged", "onProcessingRequest", "isProcessingRequest", "", "onStateChanged", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface StateListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onBrandChanged(StateListener stateListener, Card$Brand card$Brand) {
            card$Brand.getClass();
        }

        public static void onCompletionStatusChanged(StateListener stateListener, CardEditorState cardEditorState) {
            cardEditorState.getClass();
        }

        public static void onFocusChanged(StateListener stateListener, CardEditorState cardEditorState) {
            cardEditorState.getClass();
        }

        public static void onProcessingRequest(StateListener stateListener, boolean z) {
        }

        public static void onStateChanged(StateListener stateListener, CardEditorState cardEditorState) {
            cardEditorState.getClass();
        }
    }

    void onBrandChanged(Card$Brand brand);

    void onCompletionStatusChanged(CardEditorState newState);

    void onFocusChanged(CardEditorState newState);

    void onProcessingRequest(boolean isProcessingRequest);

    void onStateChanged(CardEditorState newState);
}
