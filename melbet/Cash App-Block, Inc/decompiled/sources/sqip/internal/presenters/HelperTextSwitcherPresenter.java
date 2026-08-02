package sqip.internal.presenters;

import com.squareup.Card$Brand;
import kotlin.Metadata;
import sqip.internal.BasePresenter;
import sqip.internal.CardEditorState;
import sqip.internal.GenericCardEditor;
import sqip.internal.contracts.HelperTextContract;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lsqip/internal/presenters/HelperTextSwitcherPresenter;", "Lsqip/internal/BasePresenter;", "helperTextView", "Lsqip/internal/contracts/HelperTextContract$View;", "cardEditor", "Lsqip/internal/GenericCardEditor;", "(Lsqip/internal/contracts/HelperTextContract$View;Lsqip/internal/GenericCardEditor;)V", "init", "", "state", "Lsqip/internal/CardEditorState;", "onCompletionStatusChanged", "newState", "onDestory", "onFocusChanged", "onProcessingRequest", "isProcessingRequest", "", "setHelperTextBasedOn", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HelperTextSwitcherPresenter implements BasePresenter {
    private GenericCardEditor cardEditor;
    private HelperTextContract.View helperTextView;

    public HelperTextSwitcherPresenter(HelperTextContract.View view, GenericCardEditor genericCardEditor) {
        genericCardEditor.getClass();
        this.helperTextView = view;
        this.cardEditor = genericCardEditor;
    }

    private final void setHelperTextBasedOn(CardEditorState state) {
        HelperTextContract.View view;
        CardEditorState.Field focusedField = state.getFocusedField();
        CardEditorState.Field field = CardEditorState.Field.CARD_NUMBER;
        if (focusedField == field && state.getCardNumberCompletionStatus() == CardEditorState.CompletionStatus.ERROR) {
            HelperTextContract.View view2 = this.helperTextView;
            if (view2 != null) {
                view2.displayCardNumberErrorText(this.cardEditor.getViewFor(field));
                return;
            }
            return;
        }
        CardEditorState.Field focusedField2 = state.getFocusedField();
        CardEditorState.Field field2 = CardEditorState.Field.EXPIRATION;
        if (focusedField2 == field2 && state.getExpirationCompletionStatus() == CardEditorState.CompletionStatus.ERROR) {
            HelperTextContract.View view3 = this.helperTextView;
            if (view3 != null) {
                view3.displayExpDateErrorText(this.cardEditor.getViewFor(field2));
                return;
            }
            return;
        }
        if (state.isProcessingRequest()) {
            HelperTextContract.View view4 = this.helperTextView;
            if (view4 != null) {
                view4.displayProcessingRequestText();
                return;
            }
            return;
        }
        if (state.allFieldsValid()) {
            HelperTextContract.View view5 = this.helperTextView;
            if (view5 != null) {
                view5.displayFormValidText();
                return;
            }
            return;
        }
        if (state.getFocusedField() == field && state.getCollectOnlyGiftCard()) {
            HelperTextContract.View view6 = this.helperTextView;
            if (view6 != null) {
                view6.displayEnterGiftCardNumberText(this.cardEditor.getViewFor(field));
                return;
            }
            return;
        }
        if (state.getFocusedField() == field) {
            HelperTextContract.View view7 = this.helperTextView;
            if (view7 != null) {
                view7.displayEnterCardNumberText(this.cardEditor.getViewFor(field));
                return;
            }
            return;
        }
        if (state.getFocusedField() == field2) {
            HelperTextContract.View view8 = this.helperTextView;
            if (view8 != null) {
                view8.displayEnterExpirationText(this.cardEditor.getViewFor(field2));
                return;
            }
            return;
        }
        CardEditorState.Field focusedField3 = state.getFocusedField();
        CardEditorState.Field field3 = CardEditorState.Field.CVV;
        if (focusedField3 == field3 && state.getBrand() == Card$Brand.AMERICAN_EXPRESS) {
            HelperTextContract.View view9 = this.helperTextView;
            if (view9 != null) {
                view9.displayEnterFourDigitCvvText(this.cardEditor.getViewFor(field3));
                return;
            }
            return;
        }
        if (state.getFocusedField() == field3) {
            HelperTextContract.View view10 = this.helperTextView;
            if (view10 != null) {
                view10.displayEnterThreeDigitCvvText(this.cardEditor.getViewFor(field3));
                return;
            }
            return;
        }
        CardEditorState.Field focusedField4 = state.getFocusedField();
        CardEditorState.Field field4 = CardEditorState.Field.POSTAL;
        if (focusedField4 != field4 || (view = this.helperTextView) == null) {
            return;
        }
        view.displayEnterPostalText(this.cardEditor.getViewFor(field4));
    }

    @Override // sqip.internal.BasePresenter
    public void init(CardEditorState state) {
        state.getClass();
        setHelperTextBasedOn(state);
    }

    @Override // sqip.internal.StateListener
    public void onBrandChanged(Card$Brand card$Brand) {
        BasePresenter.DefaultImpls.onBrandChanged(this, card$Brand);
    }

    @Override // sqip.internal.StateListener
    public void onCompletionStatusChanged(CardEditorState newState) {
        newState.getClass();
        setHelperTextBasedOn(newState);
    }

    @Override // sqip.internal.BasePresenter
    public void onDestory() {
        this.helperTextView = null;
    }

    @Override // sqip.internal.StateListener
    public void onFocusChanged(CardEditorState newState) {
        newState.getClass();
        setHelperTextBasedOn(newState);
    }

    @Override // sqip.internal.StateListener
    public void onProcessingRequest(boolean isProcessingRequest) {
        HelperTextContract.View view;
        if (!isProcessingRequest || (view = this.helperTextView) == null) {
            return;
        }
        view.displayProcessingRequestText();
    }

    @Override // sqip.internal.StateListener
    public void onStateChanged(CardEditorState cardEditorState) {
        BasePresenter.DefaultImpls.onStateChanged(this, cardEditorState);
    }
}
