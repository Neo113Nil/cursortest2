package sqip.internal;

import com.squareup.Card$Brand;
import kotlin.Metadata;
import sqip.internal.StateListener;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lsqip/internal/BasePresenter;", "Lsqip/internal/StateListener;", "init", "", "state", "Lsqip/internal/CardEditorState;", "onDestory", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface BasePresenter extends StateListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onBrandChanged(BasePresenter basePresenter, Card$Brand card$Brand) {
            card$Brand.getClass();
            StateListener.DefaultImpls.onBrandChanged(basePresenter, card$Brand);
        }

        public static void onCompletionStatusChanged(BasePresenter basePresenter, CardEditorState cardEditorState) {
            cardEditorState.getClass();
            StateListener.DefaultImpls.onCompletionStatusChanged(basePresenter, cardEditorState);
        }

        public static void onFocusChanged(BasePresenter basePresenter, CardEditorState cardEditorState) {
            cardEditorState.getClass();
            StateListener.DefaultImpls.onFocusChanged(basePresenter, cardEditorState);
        }

        public static void onProcessingRequest(BasePresenter basePresenter, boolean z) {
            StateListener.DefaultImpls.onProcessingRequest(basePresenter, z);
        }

        public static void onStateChanged(BasePresenter basePresenter, CardEditorState cardEditorState) {
            cardEditorState.getClass();
            StateListener.DefaultImpls.onStateChanged(basePresenter, cardEditorState);
        }
    }

    void init(CardEditorState state);

    void onDestory();
}
