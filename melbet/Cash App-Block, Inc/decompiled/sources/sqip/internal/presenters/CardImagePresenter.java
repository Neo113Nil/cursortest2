package sqip.internal.presenters;

import com.squareup.Card$Brand;
import kotlin.Metadata;
import kotlin.text.StringsKt___StringsKt;
import sqip.internal.BasePresenter;
import sqip.internal.CardEditorState;
import sqip.internal.UtilsKt;
import sqip.internal.contracts.CardImageContract;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0015H\u0002J\b\u0010)\u001a\u00020\u0017H\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\u0017H\u0002J\u0018\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"H\u0002J\b\u00104\u001a\u00020\u0017H\u0002J\b\u00105\u001a\u00020\u0017H\u0002J\u0018\u00106\u001a\u00020\u00172\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"H\u0002J\b\u00107\u001a\u00020\u0017H\u0002J\b\u00108\u001a\u00020\u0017H\u0002J\b\u00109\u001a\u00020\u0017H\u0002J\u0010\u0010:\u001a\u00020\u00172\u0006\u00102\u001a\u00020\"H\u0002J\u0010\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020\fH\u0016J\u0010\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020/H\u0016J\b\u0010?\u001a\u00020-H\u0016J\u0010\u0010@\u001a\u00020-2\u0006\u0010>\u001a\u00020/H\u0016J\u0010\u0010A\u001a\u00020-2\u0006\u0010>\u001a\u00020/H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\u0018\u0010B\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\f2\u0006\u0010C\u001a\u00020\u0006H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001b¨\u0006E"}, d2 = {"Lsqip/internal/presenters/CardImagePresenter;", "Lsqip/internal/BasePresenter;", "cardImageView", "Lsqip/internal/contracts/CardImageContract$View;", "(Lsqip/internal/contracts/CardImageContract$View;)V", "cardNumberSuffix", "", "getCardNumberSuffix", "()Ljava/lang/String;", "setCardNumberSuffix", "(Ljava/lang/String;)V", "currentBrand", "Lcom/squareup/Card$Brand;", "getCurrentBrand", "()Lcom/squareup/Card$Brand;", "setCurrentBrand", "(Lcom/squareup/Card$Brand;)V", "expDate", "getExpDate", "setExpDate", "focusedField", "Lsqip/internal/CardEditorState$Field;", "hasError", "", "getHasError", "()Z", "setHasError", "(Z)V", "isCardPanVisible", "setCardPanVisible", "shouldShowFront", "getShouldShowFront", "setShouldShowFront", "getCorrectCvvDot", "", "position", "getCorrectExpDot", "getCorrectPanDot", "getMinSuffixLength", "hasEnteredCvvField", "oldFocusedField", "hasLeftCardNumberField", "hasLeftCvvField", "hasValidCardLength", "init", "", "state", "Lsqip/internal/CardEditorState;", "isAmex", "isAnyCardPanDigitVisible", "suffixLength", "minSuffixLength", "isCVVFocused", "isCardNumberFocused", "isCardPanDigitVisible", "isCurrentBrandUnknown", "isDiners", "isExpirationFocused", "isUnknownCardPanDigitVisible", "onBrandChanged", "brand", "onCompletionStatusChanged", "newState", "onDestory", "onFocusChanged", "onStateChanged", "suffixForCardNumber", "cardNumber", "Companion", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CardImagePresenter implements BasePresenter {
    private static final int AMEX_MAX_CARD_INDEX = 14;
    private static final int AMEX_MAX_CARD_LENGTH = 15;
    private static final int CARD_DOT_MAX_INDEX = 15;
    private static final int CARD_DOT_MAX_LENGTH = 16;
    private static final int CARD_MIN_CVV_LENGTH = 1;
    private static final int DEFAULT_DOT_INDEX = -1;
    private static final int DINERS_MAX_CARD_INDEX = 13;
    private static final int DINERS_MAX_CARD_LENGTH = 14;
    private static final int MAX_DATE_FOCUS_INDEX = 3;
    private static final int MAX_DATE_LENGTH = 4;
    private static final int MIN_AMEX_CARD_SUFFIX_LENGTH = 5;
    private static final int MIN_CARD_SUFFIX_LENGTH = 4;
    private static final int MIN_DATE_FOCUS = 1;
    private static final int MIN_UNKNOWN_CARD_SUFFIX_LENGTH = 1;
    private CardImageContract.View cardImageView;
    private boolean hasError;
    private boolean isCardPanVisible;
    private CardEditorState.Field focusedField = CardEditorState.Field.CARD_NUMBER;
    private Card$Brand currentBrand = Card$Brand.UNKNOWN;
    private String cardNumberSuffix = "";
    private String expDate = "";
    private boolean shouldShowFront = true;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Card$Brand.values().length];
            try {
                iArr[15] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CardImagePresenter(CardImageContract.View view) {
        this.cardImageView = view;
    }

    private final int getCorrectCvvDot(int position) {
        int cvvLength = this.currentBrand.cvvLength();
        int i = cvvLength - 1;
        if (!isCVVFocused()) {
            return -1;
        }
        if (position < cvvLength) {
            return position;
        }
        if (position != cvvLength && position < 1) {
            return 1;
        }
        return i;
    }

    private final int getCorrectExpDot(int position) {
        if (isExpirationFocused()) {
            return position < 4 ? position : position < 1 ? 1 : 3;
        }
        return -1;
    }

    private final int getCorrectPanDot(int position) {
        if (!isCardNumberFocused()) {
            return -1;
        }
        if (isCurrentBrandUnknown() && position >= 16) {
            return 15;
        }
        if (isAmex() && position >= 15) {
            return 14;
        }
        if (isDiners() && position >= 14) {
            return 13;
        }
        if (UtilsKt.isMobileCommerceMaxLength(this.currentBrand, position) || position >= 16) {
            return 15;
        }
        return position;
    }

    private final int getMinSuffixLength() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.currentBrand.ordinal()];
        if (i != 1) {
            return i != 2 ? 4 : 5;
        }
        return 1;
    }

    private final boolean hasEnteredCvvField(CardEditorState.Field oldFocusedField) {
        CardEditorState.Field field = CardEditorState.Field.CVV;
        return oldFocusedField != field && this.focusedField == field;
    }

    private final boolean hasLeftCardNumberField() {
        return this.focusedField != CardEditorState.Field.CARD_NUMBER;
    }

    private final boolean hasLeftCvvField(CardEditorState.Field oldFocusedField) {
        CardEditorState.Field field = CardEditorState.Field.CVV;
        return oldFocusedField == field && this.focusedField != field;
    }

    private final boolean hasValidCardLength(String cardNumberSuffix) {
        return cardNumberSuffix.length() > 0;
    }

    private final boolean isAmex() {
        return this.currentBrand == Card$Brand.AMERICAN_EXPRESS;
    }

    private final boolean isAnyCardPanDigitVisible(int suffixLength, int minSuffixLength) {
        return suffixLength >= minSuffixLength && this.focusedField != CardEditorState.Field.CARD_NUMBER;
    }

    private final boolean isCVVFocused() {
        return this.focusedField == CardEditorState.Field.CVV;
    }

    private final boolean isCardNumberFocused() {
        return this.focusedField == CardEditorState.Field.CARD_NUMBER;
    }

    private final boolean isCardPanDigitVisible(int suffixLength, int minSuffixLength) {
        return isAnyCardPanDigitVisible(suffixLength, minSuffixLength) || isUnknownCardPanDigitVisible(suffixLength);
    }

    private final boolean isCurrentBrandUnknown() {
        return this.currentBrand == Card$Brand.UNKNOWN;
    }

    private final boolean isDiners() {
        return this.currentBrand == Card$Brand.DISCOVER_DINERS;
    }

    private final boolean isExpirationFocused() {
        return this.focusedField == CardEditorState.Field.EXPIRATION;
    }

    private final boolean isUnknownCardPanDigitVisible(int suffixLength) {
        return this.currentBrand == Card$Brand.UNKNOWN && isAnyCardPanDigitVisible(suffixLength, 1);
    }

    private final boolean shouldShowFront() {
        if (isAmex()) {
            CardImageContract.View view = this.cardImageView;
            view.getClass();
            if (view.getIsBigCard()) {
                return true;
            }
        }
        return this.focusedField != CardEditorState.Field.CVV;
    }

    private final String suffixForCardNumber(Card$Brand brand, String cardNumber) {
        Card$Brand.AnonymousClass2 anonymousClass2 = Card$Brand.AMERICAN_EXPRESS;
        return (brand == anonymousClass2 && cardNumber.length() == 15) ? StringsKt___StringsKt.takeLast(5, cardNumber) : (brand == Card$Brand.DISCOVER_DINERS && cardNumber.length() == 14) ? StringsKt___StringsKt.takeLast(4, cardNumber) : (brand == anonymousClass2 || cardNumber.length() <= 11) ? "" : cardNumber.substring(12);
    }

    public final String getCardNumberSuffix() {
        return this.cardNumberSuffix;
    }

    public final Card$Brand getCurrentBrand() {
        return this.currentBrand;
    }

    public final String getExpDate() {
        return this.expDate;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final boolean getShouldShowFront() {
        return this.shouldShowFront;
    }

    @Override // sqip.internal.BasePresenter
    public void init(CardEditorState state) {
        state.getClass();
        this.currentBrand = state.getBrand();
        this.focusedField = state.getFocusedField();
        this.hasError = state.hasError();
        this.cardNumberSuffix = suffixForCardNumber(state.getBrand(), state.getCardNumber());
        this.expDate = state.getExpirationDate();
        this.isCardPanVisible = isCardPanDigitVisible(suffixForCardNumber(state.getBrand(), state.getCardNumber()).length(), getMinSuffixLength());
        this.shouldShowFront = shouldShowFront();
        CardImageContract.View view = this.cardImageView;
        if (view != null) {
            view.setNewCardAssetsWith(this.currentBrand);
        }
        CardImageContract.View view2 = this.cardImageView;
        if (view2 != null) {
            view2.updatePaintFor(this.currentBrand);
        }
        CardImageContract.View view3 = this.cardImageView;
        if (view3 != null) {
            view3.init();
        }
    }

    /* renamed from: isCardPanVisible, reason: from getter */
    public final boolean getIsCardPanVisible() {
        return this.isCardPanVisible;
    }

    @Override // sqip.internal.StateListener
    public void onBrandChanged(Card$Brand brand) {
        brand.getClass();
        Card$Brand card$Brand = this.currentBrand;
        this.currentBrand = brand;
        CardImageContract.View view = this.cardImageView;
        if (view != null) {
            view.setNewCardAssetsWith(brand);
        }
        CardImageContract.View view2 = this.cardImageView;
        if (view2 != null) {
            view2.animateCardTransition(card$Brand);
        }
        CardImageContract.View view3 = this.cardImageView;
        if (view3 != null) {
            view3.updatePaintFor(this.currentBrand);
        }
    }

    @Override // sqip.internal.StateListener
    public void onCompletionStatusChanged(CardEditorState newState) {
        newState.getClass();
        if (newState.hasError() != this.hasError) {
            this.hasError = newState.hasError();
            CardImageContract.View view = this.cardImageView;
            if (view != null) {
                view.animateCardTransition(this.currentBrand);
            }
        }
    }

    @Override // sqip.internal.BasePresenter
    public void onDestory() {
        this.cardImageView = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r3.getIsBigCard() == false) goto L23;
     */
    @Override // sqip.internal.StateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onFocusChanged(CardEditorState newState) {
        CardImageContract.View view;
        CardImageContract.View view2;
        CardImageContract.View view3;
        newState.getClass();
        CardEditorState.Field field = this.focusedField;
        this.focusedField = newState.getFocusedField();
        this.shouldShowFront = shouldShowFront();
        if (hasLeftCardNumberField() && hasValidCardLength(suffixForCardNumber(newState.getBrand(), newState.getCardNumber())) && (view3 = this.cardImageView) != null) {
            view3.showLastFewDigits();
        }
        if (hasEnteredCvvField(field)) {
            CardImageContract.View view4 = this.cardImageView;
            if (view4 != null) {
                view4.fadeCvvBubbleIn();
            }
        } else if (hasLeftCvvField(field) && (view = this.cardImageView) != null) {
            view.fadeCvvBubbleOut();
        }
        if (isAmex()) {
            CardImageContract.View view5 = this.cardImageView;
            view5.getClass();
        }
        if (hasEnteredCvvField(field)) {
            CardImageContract.View view6 = this.cardImageView;
            if (view6 != null) {
                view6.flipToBack();
                return;
            }
            return;
        }
        if (isAmex()) {
            CardImageContract.View view7 = this.cardImageView;
            view7.getClass();
            if (view7.getIsBigCard()) {
                return;
            }
        }
        if (!hasLeftCvvField(field) || (view2 = this.cardImageView) == null) {
            return;
        }
        view2.flipToFront();
    }

    @Override // sqip.internal.StateListener
    public void onProcessingRequest(boolean z) {
        BasePresenter.DefaultImpls.onProcessingRequest(this, z);
    }

    @Override // sqip.internal.StateListener
    public void onStateChanged(CardEditorState newState) {
        newState.getClass();
        CardImageContract.View view = this.cardImageView;
        if (view != null) {
            view.switchCvvDigitFocusedTo(getCorrectCvvDot(newState.getCvv().length()));
        }
        CardImageContract.View view2 = this.cardImageView;
        if (view2 != null) {
            view2.switchPanDigitFocusedTo(getCorrectPanDot(newState.getCardNumberCursorPosition()));
        }
        CardImageContract.View view3 = this.cardImageView;
        if (view3 != null) {
            view3.switchExpDotFocusedTo(getCorrectExpDot(UtilsKt.stripNonDigits(newState.getExpirationDate()).length()));
        }
        this.cardNumberSuffix = suffixForCardNumber(newState.getBrand(), newState.getCardNumber());
        this.expDate = newState.getExpirationDate();
        this.isCardPanVisible = isCardPanDigitVisible(suffixForCardNumber(newState.getBrand(), newState.getCardNumber()).length(), getMinSuffixLength());
    }

    public final void setCardNumberSuffix(String str) {
        str.getClass();
        this.cardNumberSuffix = str;
    }

    public final void setCardPanVisible(boolean z) {
        this.isCardPanVisible = z;
    }

    public final void setCurrentBrand(Card$Brand card$Brand) {
        card$Brand.getClass();
        this.currentBrand = card$Brand;
    }

    public final void setExpDate(String str) {
        str.getClass();
        this.expDate = str;
    }

    public final void setHasError(boolean z) {
        this.hasError = z;
    }

    public final void setShouldShowFront(boolean z) {
        this.shouldShowFront = z;
    }
}
