package sqip.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.Card$Brand;
import com.squareup.card.entry.validators.CardNumberValidator;
import com.squareup.card.entry.validators.InputValidator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sqip.internal.CardEditorState;
import sqip.internal.scrubbing.CardNumberScrubber;
import sqip.internal.scrubbing.EmptyTextWatcher;
import sqip.internal.scrubbing.ScrubbingTextWatcher;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010\u0019J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010)\u001a\u00020$H\u0016¢\u0006\u0004\b)\u0010&J\u0011\u0010*\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b*\u0010&J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020$H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\u000fJ\u001b\u00102\u001a\u00020\u0014*\u00020/2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J'\u00106\u001a\u00020\r*\u00020/2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r04H\u0002¢\u0006\u0004\b6\u00107J!\u0010:\u001a\u00020\r*\u00020!2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\r08H\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020\r*\u00020!H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020\r*\u00020!H\u0002¢\u0006\u0004\b>\u0010=J\u0017\u0010@\u001a\u00020\r2\u0006\u0010?\u001a\u00020\u0010H\u0002¢\u0006\u0004\b@\u0010\u0013R\u0014\u0010+\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010OR(\u0010P\u001a\b\u0012\u0004\u0012\u00020\r088\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR.\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lsqip/internal/GiftCardEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lsqip/internal/GenericCardEditor;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onAttachedToWindow", "()V", "Lsqip/internal/CardEditorState;", "state", "init", "(Lsqip/internal/CardEditorState;)V", "", "isVisible", "setVisibility", "(Z)V", "getViewPaddingLeft", "()I", "getViewPaddingTop", "getViewPaddingRight", "getViewPaddingBottom", "showCard", "showInvisibleCard", "Lsqip/internal/CardEditorState$Field;", "field", "Landroid/view/View;", "getViewFor", "(Lsqip/internal/CardEditorState$Field;)Landroid/view/View;", "", "getCardNumber", "()Ljava/lang/String;", "getMonth", "getYear", "getCvv", "getPostal", "cardNumber", "squareGiftCardIsMaxLengthAndInvalid", "(Ljava/lang/String;)Z", "updateViewForErrorState", "Landroid/widget/EditText;", "Lcom/squareup/card/entry/validators/InputValidator;", "validator", "isContentValidAndComplete", "(Landroid/widget/EditText;Lcom/squareup/card/entry/validators/InputValidator;)Z", "Lkotlin/Function1;", "onTextChanged", "afterTextChanged", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onFocused", "onHasFocus", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "setUnderlineToDefault", "(Landroid/view/View;)V", "setUnderlineToError", "newState", "updateState", "Lsqip/internal/EditTextCursorWatcher;", "Lsqip/internal/EditTextCursorWatcher;", "Lsqip/internal/scrubbing/CardNumberScrubber;", "cardNumberScrubber", "Lsqip/internal/scrubbing/CardNumberScrubber;", "Lcom/squareup/card/entry/validators/CardNumberValidator;", "cardNumberValidator", "Lcom/squareup/card/entry/validators/CardNumberValidator;", "accentColor", "I", "errorColor", "Landroid/content/res/ColorStateList;", "defaultTextColor", "Landroid/content/res/ColorStateList;", "Lsqip/internal/CardEditorState;", "onSubmitFunction", "Lkotlin/jvm/functions/Function0;", "getOnSubmitFunction", "()Lkotlin/jvm/functions/Function0;", "setOnSubmitFunction", "(Lkotlin/jvm/functions/Function0;)V", "stateChangedCallback", "Lkotlin/jvm/functions/Function1;", "getStateChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setStateChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GiftCardEditor extends ConstraintLayout implements GenericCardEditor {
    private final int accentColor;
    private final EditTextCursorWatcher cardNumber;
    private final CardNumberScrubber cardNumberScrubber;
    private final CardNumberValidator cardNumberValidator;
    private final ColorStateList defaultTextColor;
    private final int errorColor;
    private Function0<Unit> onSubmitFunction;
    private CardEditorState state;
    private Function1<? super CardEditorState, Unit> stateChangedCallback;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardEditorState.Field.values().length];
            try {
                iArr[CardEditorState.Field.CARD_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.cardNumberScrubber = new CardNumberScrubber();
        this.cardNumberValidator = new CardNumberValidator();
        this.onSubmitFunction = GiftCardEditor$onSubmitFunction$1.INSTANCE;
        this.stateChangedCallback = GiftCardEditor$stateChangedCallback$1.INSTANCE;
        View.inflate(getContext(), sqip.cardentry.R.layout.sqip_gift_card_editor, this);
        this.state = new CardEditorState(null, null, null, null, null, Card$Brand.SQUARE_GIFT_CARD_V2, null, null, null, null, 0, false, false, false, false, 32735, null);
        View findViewById = findViewById(sqip.cardentry.R.id.card_number);
        findViewById.getClass();
        EditTextCursorWatcher editTextCursorWatcher = (EditTextCursorWatcher) findViewById;
        this.cardNumber = editTextCursorWatcher;
        editTextCursorWatcher.requestFocus();
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{android.R.attr.colorAccent, R.attr.sqipErrorColor});
        obtainStyledAttributes.getClass();
        this.accentColor = obtainStyledAttributes.getColor(0, 0);
        this.errorColor = obtainStyledAttributes.getColor(1, getContext().getColor(R.color.sqip_error_color_red));
        obtainStyledAttributes.recycle();
        ColorStateList textColors = editTextCursorWatcher.getTextColors();
        textColors.getClass();
        this.defaultTextColor = textColors;
    }

    private final void afterTextChanged(final EditText editText, final Function1<? super String, Unit> function1) {
        editText.addTextChangedListener(new EmptyTextWatcher() { // from class: sqip.internal.GiftCardEditor$afterTextChanged$1
            @Override // sqip.internal.scrubbing.EmptyTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                editable.getClass();
                function1.invoke(editText.getText().toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isContentValidAndComplete(EditText editText, InputValidator inputValidator) {
        return editText.getText().toString().length() > 0 && inputValidator.isValid(editText.getText().toString()) && inputValidator.isComplete(editText.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$0(GiftCardEditor giftCardEditor, TextView textView, int i, KeyEvent keyEvent) {
        if (!giftCardEditor.isContentValidAndComplete(giftCardEditor.cardNumber, giftCardEditor.cardNumberValidator)) {
            return true;
        }
        giftCardEditor.getOnSubmitFunction().invoke();
        return true;
    }

    private final void onHasFocus(View view, Function0<Unit> function0) {
        view.setOnFocusChangeListener(new GiftCardEditor$$ExternalSyntheticLambda0(function0, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHasFocus$lambda$1(Function0 function0, View view, boolean z) {
        if (z) {
            function0.invoke();
        }
    }

    private final void setUnderlineToDefault(View view) {
        Drawable background = view.getBackground();
        if (background != null) {
            background.setTintList(ColorStateList.valueOf(this.accentColor));
        }
    }

    private final void setUnderlineToError(View view) {
        Drawable background = view.getBackground();
        if (background != null) {
            background.setTintList(this.cardNumber.getHintTextColors());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean squareGiftCardIsMaxLengthAndInvalid(String cardNumber) {
        return (this.state.getBrand() == Card$Brand.UNKNOWN || !UtilsKt.isGiftCardMaxLength(this.state.getBrand(), UtilsKt.stripSpaces(cardNumber).length()) || this.cardNumberValidator.isValid(cardNumber)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(CardEditorState newState) {
        this.state = newState;
        getStateChangedCallback().invoke(newState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewForErrorState() {
        if (this.state.isFocusedFieldInErrorState()) {
            setUnderlineToError(this);
            (WhenMappings.$EnumSwitchMapping$0[this.state.getFocusedField().ordinal()] == 1 ? this.cardNumber : this).startAnimation(AnimationUtils.loadAnimation(getContext(), sqip.cardentry.R.anim.sqip_edit_text_shake_error));
        } else {
            setUnderlineToDefault(this);
        }
        CardEditorState.CompletionStatus cardNumberCompletionStatus = this.state.getCardNumberCompletionStatus();
        CardEditorState.CompletionStatus completionStatus = CardEditorState.CompletionStatus.ERROR;
        EditTextCursorWatcher editTextCursorWatcher = this.cardNumber;
        if (cardNumberCompletionStatus == completionStatus) {
            editTextCursorWatcher.setTextColor(this.errorColor);
        } else {
            editTextCursorWatcher.setTextColor(this.defaultTextColor);
        }
    }

    @Override // sqip.internal.ReadableCardEditor
    public String getCardNumber() {
        String stripSpaces;
        Editable text = this.cardNumber.getText();
        return (text == null || (stripSpaces = UtilsKt.stripSpaces(text)) == null) ? "" : stripSpaces;
    }

    @Override // sqip.internal.ReadableCardEditor
    public String getCvv() {
        return "This is a gift card";
    }

    @Override // sqip.internal.ReadableCardEditor
    public int getMonth() {
        return -1;
    }

    @Override // sqip.internal.GenericCardEditor
    public Function0<Unit> getOnSubmitFunction() {
        return this.onSubmitFunction;
    }

    @Override // sqip.internal.ReadableCardEditor
    public String getPostal() {
        return "This is a gift card";
    }

    @Override // sqip.internal.GenericCardEditor
    public Function1<CardEditorState, Unit> getStateChangedCallback() {
        return this.stateChangedCallback;
    }

    @Override // sqip.internal.GenericCardEditor
    public View getViewFor(CardEditorState.Field field) {
        field.getClass();
        return this.cardNumber;
    }

    @Override // sqip.internal.GenericCardEditor
    public int getViewPaddingBottom() {
        return getPaddingBottom();
    }

    @Override // sqip.internal.GenericCardEditor
    public int getViewPaddingLeft() {
        return getPaddingLeft();
    }

    @Override // sqip.internal.GenericCardEditor
    public int getViewPaddingRight() {
        return getPaddingRight();
    }

    @Override // sqip.internal.GenericCardEditor
    public int getViewPaddingTop() {
        return getPaddingTop();
    }

    @Override // sqip.internal.ReadableCardEditor
    public int getYear() {
        return -1;
    }

    @Override // sqip.internal.GenericCardEditor
    public void init(CardEditorState state) {
        state.getClass();
        updateState(state);
        updateViewForErrorState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        CardEditorState copy;
        super.onAttachedToWindow();
        setFocusable(false);
        this.cardNumber.setOnCursorUpdate(new Function1<Integer, Unit>() { // from class: sqip.internal.GiftCardEditor$onAttachedToWindow$1
            {
                super(1);
            }

            public final void invoke(int i) {
                CardEditorState cardEditorState;
                CardEditorState copy2;
                GiftCardEditor giftCardEditor = GiftCardEditor.this;
                cardEditorState = giftCardEditor.state;
                copy2 = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : i, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                giftCardEditor.updateState(copy2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }
        });
        CardNumberScrubber cardNumberScrubber = this.cardNumberScrubber;
        Card$Brand card$Brand = Card$Brand.SQUARE_GIFT_CARD_V2;
        cardNumberScrubber.setBrand$card_entry_release(card$Brand);
        CardNumberValidator cardNumberValidator = this.cardNumberValidator;
        cardNumberValidator.getClass();
        cardNumberValidator.brand = card$Brand;
        copy = r3.copy((r32 & 1) != 0 ? r3.focusedField : null, (r32 & 2) != 0 ? r3.cardNumber : null, (r32 & 4) != 0 ? r3.expirationDate : null, (r32 & 8) != 0 ? r3.cvv : null, (r32 & 16) != 0 ? r3.postal : null, (r32 & 32) != 0 ? r3.brand : card$Brand, (r32 & 64) != 0 ? r3.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? r3.expirationCompletionStatus : null, (r32 & 256) != 0 ? r3.cvvCompletionStatus : null, (r32 & 512) != 0 ? r3.postalCompletionStatus : null, (r32 & 1024) != 0 ? r3.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? r3.collectPostalCode : false, (r32 & 4096) != 0 ? r3.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? r3.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? this.state.isMasked : false);
        updateState(copy);
        EditTextCursorWatcher editTextCursorWatcher = this.cardNumber;
        editTextCursorWatcher.addTextChangedListener(new ScrubbingTextWatcher(this.cardNumberScrubber, editTextCursorWatcher));
        afterTextChanged(this.cardNumber, new Function1<String, Unit>() { // from class: sqip.internal.GiftCardEditor$onAttachedToWindow$2
            {
                super(1);
            }

            public final void invoke(String str) {
                EditTextCursorWatcher editTextCursorWatcher2;
                CardNumberValidator cardNumberValidator2;
                boolean isContentValidAndComplete;
                boolean squareGiftCardIsMaxLengthAndInvalid;
                CardEditorState cardEditorState;
                CardEditorState copy2;
                CardEditorState cardEditorState2;
                CardEditorState copy3;
                CardEditorState cardEditorState3;
                CardEditorState copy4;
                str.getClass();
                GiftCardEditor giftCardEditor = GiftCardEditor.this;
                editTextCursorWatcher2 = giftCardEditor.cardNumber;
                cardNumberValidator2 = GiftCardEditor.this.cardNumberValidator;
                isContentValidAndComplete = giftCardEditor.isContentValidAndComplete(editTextCursorWatcher2, cardNumberValidator2);
                GiftCardEditor giftCardEditor2 = GiftCardEditor.this;
                if (isContentValidAndComplete) {
                    cardEditorState3 = giftCardEditor2.state;
                    copy4 = cardEditorState3.copy((r32 & 1) != 0 ? cardEditorState3.focusedField : null, (r32 & 2) != 0 ? cardEditorState3.cardNumber : null, (r32 & 4) != 0 ? cardEditorState3.expirationDate : null, (r32 & 8) != 0 ? cardEditorState3.cvv : null, (r32 & 16) != 0 ? cardEditorState3.postal : null, (r32 & 32) != 0 ? cardEditorState3.brand : null, (r32 & 64) != 0 ? cardEditorState3.cardNumberCompletionStatus : CardEditorState.CompletionStatus.VALID, (r32 & 128) != 0 ? cardEditorState3.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState3.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState3.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState3.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState3.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState3.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState3.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState3.isMasked : false);
                    giftCardEditor2.updateState(copy4);
                } else {
                    squareGiftCardIsMaxLengthAndInvalid = giftCardEditor2.squareGiftCardIsMaxLengthAndInvalid(str);
                    GiftCardEditor giftCardEditor3 = GiftCardEditor.this;
                    if (squareGiftCardIsMaxLengthAndInvalid) {
                        cardEditorState2 = giftCardEditor3.state;
                        copy3 = cardEditorState2.copy((r32 & 1) != 0 ? cardEditorState2.focusedField : null, (r32 & 2) != 0 ? cardEditorState2.cardNumber : null, (r32 & 4) != 0 ? cardEditorState2.expirationDate : null, (r32 & 8) != 0 ? cardEditorState2.cvv : null, (r32 & 16) != 0 ? cardEditorState2.postal : null, (r32 & 32) != 0 ? cardEditorState2.brand : null, (r32 & 64) != 0 ? cardEditorState2.cardNumberCompletionStatus : CardEditorState.CompletionStatus.ERROR, (r32 & 128) != 0 ? cardEditorState2.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState2.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState2.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState2.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState2.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState2.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState2.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState2.isMasked : false);
                        giftCardEditor3.updateState(copy3);
                        GiftCardEditor.this.updateViewForErrorState();
                    } else {
                        cardEditorState = giftCardEditor3.state;
                        copy2 = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : CardEditorState.CompletionStatus.INCOMPLETE, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                        giftCardEditor3.updateState(copy2);
                    }
                }
                GiftCardEditor.this.updateViewForErrorState();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        this.cardNumber.setOnEditorActionListener(new GiftCardEditor$$ExternalSyntheticLambda1(this, 0));
        afterTextChanged(this.cardNumber, new Function1<String, Unit>() { // from class: sqip.internal.GiftCardEditor$onAttachedToWindow$4
            {
                super(1);
            }

            public final void invoke(String str) {
                CardEditorState cardEditorState;
                CardEditorState copy2;
                str.getClass();
                GiftCardEditor giftCardEditor = GiftCardEditor.this;
                cardEditorState = giftCardEditor.state;
                copy2 = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : GiftCardEditor.this.getCardNumber(), (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                giftCardEditor.updateState(copy2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        onHasFocus(this.cardNumber, new Function0<Unit>() { // from class: sqip.internal.GiftCardEditor$onAttachedToWindow$5
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4391invoke() {
                CardEditorState cardEditorState;
                CardEditorState copy2;
                GiftCardEditor giftCardEditor = GiftCardEditor.this;
                cardEditorState = giftCardEditor.state;
                copy2 = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : CardEditorState.Field.CARD_NUMBER, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                giftCardEditor.updateState(copy2);
                GiftCardEditor.this.updateViewForErrorState();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4391invoke();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // sqip.internal.GenericCardEditor
    public void setOnSubmitFunction(Function0<Unit> function0) {
        function0.getClass();
        this.onSubmitFunction = function0;
    }

    @Override // sqip.internal.GenericCardEditor
    public void setStateChangedCallback(Function1<? super CardEditorState, Unit> function1) {
        function1.getClass();
        this.stateChangedCallback = function1;
    }

    @Override // sqip.internal.GenericCardEditor
    public void setVisibility(boolean isVisible) {
        setVisibility(isVisible ? 0 : 4);
    }

    @Override // sqip.internal.GenericCardEditor
    public void showInvisibleCard(boolean showCard) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardEditor(Context context) {
        super(context);
        context.getClass();
        this.cardNumberScrubber = new CardNumberScrubber();
        this.cardNumberValidator = new CardNumberValidator();
        this.onSubmitFunction = GiftCardEditor$onSubmitFunction$1.INSTANCE;
        this.stateChangedCallback = GiftCardEditor$stateChangedCallback$1.INSTANCE;
        View.inflate(getContext(), sqip.cardentry.R.layout.sqip_gift_card_editor, this);
        this.state = new CardEditorState(null, null, null, null, null, Card$Brand.SQUARE_GIFT_CARD_V2, null, null, null, null, 0, false, false, false, false, 32735, null);
        View findViewById = findViewById(sqip.cardentry.R.id.card_number);
        findViewById.getClass();
        EditTextCursorWatcher editTextCursorWatcher = (EditTextCursorWatcher) findViewById;
        this.cardNumber = editTextCursorWatcher;
        editTextCursorWatcher.requestFocus();
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{android.R.attr.colorAccent, R.attr.sqipErrorColor});
        obtainStyledAttributes.getClass();
        this.accentColor = obtainStyledAttributes.getColor(0, 0);
        this.errorColor = obtainStyledAttributes.getColor(1, getContext().getColor(R.color.sqip_error_color_red));
        obtainStyledAttributes.recycle();
        ColorStateList textColors = editTextCursorWatcher.getTextColors();
        textColors.getClass();
        this.defaultTextColor = textColors;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftCardEditor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        this.cardNumberScrubber = new CardNumberScrubber();
        this.cardNumberValidator = new CardNumberValidator();
        this.onSubmitFunction = GiftCardEditor$onSubmitFunction$1.INSTANCE;
        this.stateChangedCallback = GiftCardEditor$stateChangedCallback$1.INSTANCE;
        View.inflate(getContext(), sqip.cardentry.R.layout.sqip_gift_card_editor, this);
        this.state = new CardEditorState(null, null, null, null, null, Card$Brand.SQUARE_GIFT_CARD_V2, null, null, null, null, 0, false, false, false, false, 32735, null);
        View findViewById = findViewById(sqip.cardentry.R.id.card_number);
        findViewById.getClass();
        EditTextCursorWatcher editTextCursorWatcher = (EditTextCursorWatcher) findViewById;
        this.cardNumber = editTextCursorWatcher;
        editTextCursorWatcher.requestFocus();
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{android.R.attr.colorAccent, R.attr.sqipErrorColor});
        obtainStyledAttributes.getClass();
        this.accentColor = obtainStyledAttributes.getColor(0, 0);
        this.errorColor = obtainStyledAttributes.getColor(1, getContext().getColor(R.color.sqip_error_color_red));
        obtainStyledAttributes.recycle();
        ColorStateList textColors = editTextCursorWatcher.getTextColors();
        textColors.getClass();
        this.defaultTextColor = textColors;
    }
}
