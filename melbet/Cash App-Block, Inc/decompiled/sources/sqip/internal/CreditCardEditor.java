package sqip.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.google.mlkit.vision.text.zza;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.Card$Brand;
import com.squareup.card.entry.validators.CardNumberValidator;
import com.squareup.card.entry.validators.CvvValidator;
import com.squareup.card.entry.validators.InputValidator;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sqip.internal.CardEditorState;
import sqip.internal.scrubbing.CardNumberScrubber;
import sqip.internal.scrubbing.CvvScrubber;
import sqip.internal.scrubbing.EmptyTextWatcher;
import sqip.internal.scrubbing.ExpirationDateScrubber;
import sqip.internal.scrubbing.ScrubbingTextWatcher;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0019J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010$J\u0011\u0010(\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b(\u0010$J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\u0014H\u0016¢\u0006\u0004\b*\u0010\u0017J\u000f\u0010+\u001a\u00020\rH\u0002¢\u0006\u0004\b+\u0010\u000fJ\u0017\u0010,\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\"H\u0002¢\u0006\u0004\b-\u0010$J\u000f\u0010.\u001a\u00020\rH\u0002¢\u0006\u0004\b.\u0010\u000fJ\u0017\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\"H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u0010\u000fJ\u000f\u00103\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u0010\u000fJ\u0017\u00106\u001a\u00020\r2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010<\u001a\u00020\u0014*\u0002042\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J'\u0010@\u001a\u00020\r*\u0002042\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0>H\u0002¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u00020\r*\u00020\u001f2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\r0BH\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020\r*\u00020\u001fH\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010H\u001a\u00020\r*\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010GJ+\u0010M\u001a\u00020\r*\u00020I2\u0006\u00105\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ!\u0010O\u001a\u00020\r*\u0002042\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\r0BH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\rH\u0002¢\u0006\u0004\bQ\u0010\u000fJ\u000f\u0010R\u001a\u00020\rH\u0002¢\u0006\u0004\bR\u0010\u000fJ\u0017\u0010T\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\"H\u0002¢\u0006\u0004\bT\u00101J\u0017\u0010V\u001a\u00020\r2\u0006\u0010U\u001a\u00020\u0010H\u0002¢\u0006\u0004\bV\u0010\u0013J\u0017\u0010Y\u001a\u00020\r2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZR\u0014\u0010/\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010b\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u0014\u0010c\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010aR\u0014\u0010d\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010_R\u0014\u0010e\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010aR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010n\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010~\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u0084\u0001R/\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\r0B8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R5\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0>8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0091\u0001"}, d2 = {"Lsqip/internal/CreditCardEditor;", "Landroid/widget/LinearLayout;", "Lsqip/internal/GenericCardEditor;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrSet", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttrs", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onAttachedToWindow", "()V", "Lsqip/internal/CardEditorState;", "state", "init", "(Lsqip/internal/CardEditorState;)V", "", "isVisible", "setVisibility", "(Z)V", "getViewPaddingLeft", "()I", "getViewPaddingTop", "getViewPaddingRight", "getViewPaddingBottom", "Lsqip/internal/CardEditorState$Field;", "field", "Landroid/view/View;", "getViewFor", "(Lsqip/internal/CardEditorState$Field;)Landroid/view/View;", "", "getCardNumber", "()Ljava/lang/String;", "getMonth", "getYear", "getCvv", "getPostal", "showCard", "showInvisibleCard", "switchToDetails", "setFocus", "getLastFour", "switchBackToPan", "cardNumber", "cardNumberIsMaxLengthAndInvalid", "(Ljava/lang/String;)Z", "clearForm", "updateViewForErrorState", "Landroid/widget/EditText;", "view", "focusNextIncompleteView", "(Landroid/widget/EditText;)V", "findFirstIncompleteOrInvalidField", "()Landroid/widget/EditText;", "Lcom/squareup/card/entry/validators/InputValidator;", "validator", "isContentValidAndComplete", "(Landroid/widget/EditText;Lcom/squareup/card/entry/validators/InputValidator;)Z", "Lkotlin/Function1;", "onTextChanged", "afterTextChanged", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onFocused", "onHasFocus", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "setUnderlineToDefault", "(Landroid/view/View;)V", "setUnderlineToError", "Landroid/widget/ViewAnimator;", "Landroid/view/animation/Animation;", "inAnim", "outAnim", "animateTo", "(Landroid/widget/ViewAnimator;Landroid/view/View;Landroid/view/animation/Animation;Landroid/view/animation/Animation;)V", "onBackspace", "(Landroid/widget/EditText;Lkotlin/jvm/functions/Function0;)V", "setLockAndProgressionButtonVisibility", "setUpPostalField", "cardNumberText", "isCardInputProgressable", "newState", "updateState", "Lcom/squareup/Card$Brand;", "brand", "updateBrandTo", "(Lcom/squareup/Card$Brand;)V", "Lsqip/internal/EditTextCursorWatcher;", "Lsqip/internal/EditTextCursorWatcher;", "Landroid/view/ViewGroup;", "panLayout", "Landroid/view/ViewGroup;", "expiration", "Landroid/widget/EditText;", "cvv", "postal", "details", "animator", "Landroid/widget/ViewAnimator;", "lastFourDigits", "Landroid/widget/TextView;", "monthYearProgressionButton", "Landroid/widget/TextView;", "Landroid/widget/ImageView;", "lockImage", "Landroid/widget/ImageView;", "invisibleCard", "Landroid/view/View;", "Lsqip/internal/scrubbing/CardNumberScrubber;", "cardNumberScrubber", "Lsqip/internal/scrubbing/CardNumberScrubber;", "expirationValidator", "Lcom/squareup/card/entry/validators/InputValidator;", "Lcom/squareup/card/entry/validators/CardNumberValidator;", "cardNumberValidator", "Lcom/squareup/card/entry/validators/CardNumberValidator;", "Lcom/squareup/card/entry/validators/CvvValidator;", "cvvValidator", "Lcom/squareup/card/entry/validators/CvvValidator;", "Lsqip/internal/scrubbing/CvvScrubber;", "cvvScrubber", "Lsqip/internal/scrubbing/CvvScrubber;", "accentColor", "I", "errorColor", "Landroid/content/res/ColorStateList;", "defaultTextColor", "Landroid/content/res/ColorStateList;", "Lsqip/internal/CardEditorState;", "onSubmitFunction", "Lkotlin/jvm/functions/Function0;", "getOnSubmitFunction", "()Lkotlin/jvm/functions/Function0;", "setOnSubmitFunction", "(Lkotlin/jvm/functions/Function0;)V", "stateChangedCallback", "Lkotlin/jvm/functions/Function1;", "getStateChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setStateChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreditCardEditor extends LinearLayout implements GenericCardEditor {
    private final int accentColor;
    private final ViewAnimator animator;
    private final EditTextCursorWatcher cardNumber;
    private final CardNumberScrubber cardNumberScrubber;
    private final CardNumberValidator cardNumberValidator;
    private final EditText cvv;
    private final CvvScrubber cvvScrubber;
    private final CvvValidator cvvValidator;
    private final ColorStateList defaultTextColor;
    private final ViewGroup details;
    private final int errorColor;
    private final EditText expiration;
    private final InputValidator expirationValidator;
    private final View invisibleCard;
    private final EditText lastFourDigits;
    private final ImageView lockImage;
    private final TextView monthYearProgressionButton;
    private Function0<Unit> onSubmitFunction;
    private final ViewGroup panLayout;
    private final EditText postal;
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
            try {
                iArr[CardEditorState.Field.CVV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardEditorState.Field.EXPIRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardEditorState.Field.POSTAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.cardNumberScrubber = new CardNumberScrubber();
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        this.expirationValidator = new n(calendar);
        this.cardNumberValidator = new CardNumberValidator();
        this.cvvValidator = new CvvValidator();
        CvvScrubber cvvScrubber = new CvvScrubber();
        this.cvvScrubber = cvvScrubber;
        this.onSubmitFunction = CreditCardEditor$onSubmitFunction$1.INSTANCE;
        this.stateChangedCallback = CreditCardEditor$stateChangedCallback$1.INSTANCE;
        View.inflate(getContext(), sqip.cardentry.R.layout.sqip_card_editor, this);
        this.state = new CardEditorState(null, null, null, null, null, null, null, null, null, null, 0, false, false, false, false, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE, null);
        View findViewById = findViewById(sqip.cardentry.R.id.card_number);
        findViewById.getClass();
        this.cardNumber = (EditTextCursorWatcher) findViewById;
        View findViewById2 = findViewById(sqip.cardentry.R.id.month_year);
        findViewById2.getClass();
        EditText editText = (EditText) findViewById2;
        this.expiration = editText;
        View findViewById3 = findViewById(sqip.cardentry.R.id.cvv);
        findViewById3.getClass();
        EditText editText2 = (EditText) findViewById3;
        this.cvv = editText2;
        View findViewById4 = findViewById(sqip.cardentry.R.id.postal_code);
        findViewById4.getClass();
        this.postal = (EditText) findViewById4;
        View findViewById5 = findViewById(sqip.cardentry.R.id.card_entry_animator);
        findViewById5.getClass();
        this.animator = (ViewAnimator) findViewById5;
        View findViewById6 = findViewById(sqip.cardentry.R.id.details);
        findViewById6.getClass();
        this.details = (ViewGroup) findViewById6;
        View findViewById7 = findViewById(sqip.cardentry.R.id.card_number_last_digits);
        findViewById7.getClass();
        EditText editText3 = (EditText) findViewById7;
        this.lastFourDigits = editText3;
        View findViewById8 = findViewById(sqip.cardentry.R.id.month_year_progression_button);
        findViewById8.getClass();
        this.monthYearProgressionButton = (TextView) findViewById8;
        View findViewById9 = findViewById(sqip.cardentry.R.id.lock_image);
        findViewById9.getClass();
        ImageView imageView = (ImageView) findViewById9;
        this.lockImage = imageView;
        View findViewById10 = findViewById(sqip.cardentry.R.id.pan_group);
        findViewById10.getClass();
        this.panLayout = (ViewGroup) findViewById10;
        View findViewById11 = findViewById(sqip.cardentry.R.id.invisible_card_image);
        findViewById11.getClass();
        this.invisibleCard = findViewById11;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{android.R.attr.colorAccent, R.attr.sqipErrorColor});
        obtainStyledAttributes.getClass();
        this.accentColor = obtainStyledAttributes.getColor(0, 0);
        this.errorColor = obtainStyledAttributes.getColor(1, getContext().getColor(R.color.sqip_error_color_red));
        obtainStyledAttributes.recycle();
        ColorStateList textColors = editText.getTextColors();
        textColors.getClass();
        this.defaultTextColor = textColors;
        editText3.setTextColor(textColors);
        editText.addTextChangedListener(new ScrubbingTextWatcher(new ExpirationDateScrubber(), editText));
        editText2.addTextChangedListener(new ScrubbingTextWatcher(cvvScrubber, editText2));
        imageView.setImageDrawable(getContext().getDrawable(sqip.cardentry.R.drawable.sqip_edit_text_lock_icon));
    }

    private final void afterTextChanged(final EditText editText, final Function1<? super String, Unit> function1) {
        editText.addTextChangedListener(new EmptyTextWatcher() { // from class: sqip.internal.CreditCardEditor$afterTextChanged$1
            @Override // sqip.internal.scrubbing.EmptyTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                editable.getClass();
                function1.invoke(editText.getText().toString());
            }
        });
    }

    private final void animateTo(ViewAnimator viewAnimator, View view, Animation animation, Animation animation2) {
        viewAnimator.setInAnimation(animation);
        viewAnimator.setOutAnimation(animation2);
        int childCount = viewAnimator.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewAnimator.getChildAt(i).getId() == view.getId()) {
                if (i != viewAnimator.getDisplayedChild()) {
                    viewAnimator.setDisplayedChild(i);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean cardNumberIsMaxLengthAndInvalid(String cardNumber) {
        return (this.state.getBrand() == Card$Brand.UNKNOWN || !UtilsKt.isMobileCommerceMaxLength(this.state.getBrand(), UtilsKt.stripSpaces(cardNumber).length()) || this.cardNumberValidator.isValid(cardNumber)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearForm() {
        CardEditorState copy;
        this.expiration.getText().clear();
        this.cvv.getText().clear();
        this.postal.getText().clear();
        CardEditorState cardEditorState = this.state;
        CardEditorState.CompletionStatus completionStatus = CardEditorState.CompletionStatus.INCOMPLETE;
        copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : "", (r32 & 8) != 0 ? cardEditorState.cvv : "", (r32 & 16) != 0 ? cardEditorState.postal : "", (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : completionStatus, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : completionStatus, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : completionStatus, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
        updateState(copy);
    }

    private final EditText findFirstIncompleteOrInvalidField() {
        CardEditorState.CompletionStatus cardNumberCompletionStatus = this.state.getCardNumberCompletionStatus();
        CardEditorState.CompletionStatus completionStatus = CardEditorState.CompletionStatus.VALID;
        if (cardNumberCompletionStatus != completionStatus) {
            return this.cardNumber;
        }
        if (this.state.getExpirationCompletionStatus() != completionStatus) {
            return this.expiration;
        }
        if (this.state.getCvvCompletionStatus() != completionStatus) {
            return this.cvv;
        }
        if (this.state.getPostalCompletionStatus() != completionStatus) {
            return this.postal;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void focusNextIncompleteView(EditText view) {
        EditText findFirstIncompleteOrInvalidField = findFirstIncompleteOrInvalidField();
        if (findFirstIncompleteOrInvalidField != null) {
            findFirstIncompleteOrInvalidField.requestFocus();
        } else {
            if (Intrinsics.areEqual(view, this.postal)) {
                return;
            }
            ArrayList arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(this.cardNumber, this.expiration, this.cvv, this.postal);
            ((EditText) arrayListOf.get(arrayListOf.indexOf(view) + 1)).requestFocus();
        }
    }

    private final String getLastFour() {
        return getCardNumber().substring(r1.length() - 4);
    }

    private final boolean isCardInputProgressable(String cardNumberText) {
        return this.state.getBrand().isValidNumberLength(cardNumberText.length()) && this.cardNumberValidator.isValid(cardNumberText);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isContentValidAndComplete(EditText editText, InputValidator inputValidator) {
        return editText.getText().toString().length() > 0 && inputValidator.isValid(editText.getText().toString()) && inputValidator.isComplete(editText.getText().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$0(CreditCardEditor creditCardEditor, TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z && creditCardEditor.isContentValidAndComplete(creditCardEditor.cardNumber, creditCardEditor.cardNumberValidator)) {
            creditCardEditor.switchToDetails();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$2(CreditCardEditor creditCardEditor, View view) {
        CardEditorState copy;
        copy = r1.copy((r32 & 1) != 0 ? r1.focusedField : null, (r32 & 2) != 0 ? r1.cardNumber : null, (r32 & 4) != 0 ? r1.expirationDate : null, (r32 & 8) != 0 ? r1.cvv : null, (r32 & 16) != 0 ? r1.postal : null, (r32 & 32) != 0 ? r1.brand : null, (r32 & 64) != 0 ? r1.cardNumberCompletionStatus : CardEditorState.CompletionStatus.VALID, (r32 & 128) != 0 ? r1.expirationCompletionStatus : null, (r32 & 256) != 0 ? r1.cvvCompletionStatus : null, (r32 & 512) != 0 ? r1.postalCompletionStatus : null, (r32 & 1024) != 0 ? r1.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? r1.collectPostalCode : false, (r32 & 4096) != 0 ? r1.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? r1.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? creditCardEditor.state.isMasked : false);
        creditCardEditor.updateState(copy);
        creditCardEditor.switchToDetails();
    }

    private final void onBackspace(EditText editText, Function0<Unit> function0) {
        editText.setOnKeyListener(new CreditCardEditor$$ExternalSyntheticLambda1(0, editText, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onBackspace$lambda$4(EditText editText, Function0 function0, View view, int i, KeyEvent keyEvent) {
        if (editText.getText().toString().length() != 0 || i != 67) {
            return false;
        }
        function0.invoke();
        return true;
    }

    private final void onHasFocus(View view, Function0<Unit> function0) {
        view.setOnFocusChangeListener(new CreditCardEditor$$ExternalSyntheticLambda0(0, function0, view.getOnFocusChangeListener()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHasFocus$lambda$3(Function0 function0, View.OnFocusChangeListener onFocusChangeListener, View view, boolean z) {
        if (z) {
            function0.invoke();
        }
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    private final void setFocus(CardEditorState state) {
        View view;
        int i = WhenMappings.$EnumSwitchMapping$0[state.getFocusedField().ordinal()];
        if (i == 1) {
            view = this.cardNumber;
        } else if (i == 2) {
            view = this.cvv;
        } else if (i == 3) {
            view = this.expiration;
        } else {
            if (i != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            view = this.postal;
        }
        view.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLockAndProgressionButtonVisibility() {
        boolean isCardInputProgressable = isCardInputProgressable(UtilsKt.stripSpaces(this.state.getCardNumber()));
        TextView textView = this.monthYearProgressionButton;
        if (isCardInputProgressable) {
            textView.setVisibility(0);
            this.lockImage.setVisibility(8);
        } else {
            textView.setVisibility(8);
            this.lockImage.setVisibility(0);
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

    private final void setUpPostalField() {
        this.postal.setVisibility(0);
        afterTextChanged(this.postal, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$setUpPostalField$1
            {
                super(1);
            }

            public final void invoke(String str) {
                EditText editText;
                boolean isContentValidAndComplete;
                CardEditorState cardEditorState;
                CardEditorState cardEditorState2;
                CardEditorState cardEditorState3;
                CardEditorState copy;
                CardEditorState cardEditorState4;
                CardEditorState copy2;
                str.getClass();
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                editText = creditCardEditor.postal;
                isContentValidAndComplete = creditCardEditor.isContentValidAndComplete(editText, new zza(14));
                cardEditorState = CreditCardEditor.this.state;
                CardEditorState.CompletionStatus postalCompletionStatus = cardEditorState.getPostalCompletionStatus();
                CardEditorState.CompletionStatus completionStatus = CardEditorState.CompletionStatus.INCOMPLETE;
                if (postalCompletionStatus == completionStatus && isContentValidAndComplete) {
                    CreditCardEditor creditCardEditor2 = CreditCardEditor.this;
                    cardEditorState4 = creditCardEditor2.state;
                    copy2 = cardEditorState4.copy((r32 & 1) != 0 ? cardEditorState4.focusedField : null, (r32 & 2) != 0 ? cardEditorState4.cardNumber : null, (r32 & 4) != 0 ? cardEditorState4.expirationDate : null, (r32 & 8) != 0 ? cardEditorState4.cvv : null, (r32 & 16) != 0 ? cardEditorState4.postal : null, (r32 & 32) != 0 ? cardEditorState4.brand : null, (r32 & 64) != 0 ? cardEditorState4.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState4.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState4.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState4.postalCompletionStatus : CardEditorState.CompletionStatus.VALID, (r32 & 1024) != 0 ? cardEditorState4.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState4.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState4.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState4.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState4.isMasked : false);
                    creditCardEditor2.updateState(copy2);
                    return;
                }
                cardEditorState2 = CreditCardEditor.this.state;
                if (cardEditorState2.getPostalCompletionStatus() != CardEditorState.CompletionStatus.VALID || isContentValidAndComplete) {
                    return;
                }
                CreditCardEditor creditCardEditor3 = CreditCardEditor.this;
                cardEditorState3 = creditCardEditor3.state;
                copy = cardEditorState3.copy((r32 & 1) != 0 ? cardEditorState3.focusedField : null, (r32 & 2) != 0 ? cardEditorState3.cardNumber : null, (r32 & 4) != 0 ? cardEditorState3.expirationDate : null, (r32 & 8) != 0 ? cardEditorState3.cvv : null, (r32 & 16) != 0 ? cardEditorState3.postal : null, (r32 & 32) != 0 ? cardEditorState3.brand : null, (r32 & 64) != 0 ? cardEditorState3.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState3.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState3.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState3.postalCompletionStatus : completionStatus, (r32 & 1024) != 0 ? cardEditorState3.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState3.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState3.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState3.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState3.isMasked : false);
                creditCardEditor3.updateState(copy);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        onBackspace(this.postal, new Function0<Unit>() { // from class: sqip.internal.CreditCardEditor$setUpPostalField$2
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4388invoke() {
                EditText editText;
                editText = CreditCardEditor.this.cvv;
                editText.requestFocus();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4388invoke();
                return Unit.INSTANCE;
            }
        });
        afterTextChanged(this.postal, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$setUpPostalField$3
            {
                super(1);
            }

            public final void invoke(String str) {
                CardEditorState cardEditorState;
                CardEditorState copy;
                str.getClass();
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : CreditCardEditor.this.getPostal(), (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        this.postal.setOnEditorActionListener(new CreditCardEditor$$ExternalSyntheticLambda2(this, 1));
        onHasFocus(this.postal, new Function0<Unit>() { // from class: sqip.internal.CreditCardEditor$setUpPostalField$5
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4389invoke() {
                CardEditorState cardEditorState;
                CardEditorState copy;
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : CardEditorState.Field.POSTAL, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
                CreditCardEditor.this.updateViewForErrorState();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4389invoke();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setUpPostalField$lambda$5(CreditCardEditor creditCardEditor, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return true;
        }
        creditCardEditor.getOnSubmitFunction().invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchBackToPan() {
        CardEditorState copy;
        this.cardNumber.requestFocus();
        ViewAnimator viewAnimator = this.animator;
        ViewGroup viewGroup = this.panLayout;
        PanAnimationSet panAnimationSet = PanAnimationSet.INSTANCE;
        animateTo(viewAnimator, viewGroup, panAnimationSet.getInFromLeft(), panAnimationSet.getOutToRight());
        copy = r5.copy((r32 & 1) != 0 ? r5.focusedField : CardEditorState.Field.CARD_NUMBER, (r32 & 2) != 0 ? r5.cardNumber : null, (r32 & 4) != 0 ? r5.expirationDate : null, (r32 & 8) != 0 ? r5.cvv : null, (r32 & 16) != 0 ? r5.postal : null, (r32 & 32) != 0 ? r5.brand : null, (r32 & 64) != 0 ? r5.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? r5.expirationCompletionStatus : null, (r32 & 256) != 0 ? r5.cvvCompletionStatus : null, (r32 & 512) != 0 ? r5.postalCompletionStatus : null, (r32 & 1024) != 0 ? r5.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? r5.collectPostalCode : false, (r32 & 4096) != 0 ? r5.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? r5.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? this.state.isMasked : false);
        updateState(copy);
        setLockAndProgressionButtonVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchToDetails() {
        this.lastFourDigits.setText(getLastFour(), TextView.BufferType.NORMAL);
        ViewAnimator viewAnimator = this.animator;
        ViewGroup viewGroup = this.details;
        PanAnimationSet panAnimationSet = PanAnimationSet.INSTANCE;
        animateTo(viewAnimator, viewGroup, panAnimationSet.getInFromRight(), panAnimationSet.getOutToLeft());
        focusNextIncompleteView(this.cardNumber);
    }

    private final void updateBrandTo(Card$Brand brand) {
        this.cardNumberScrubber.setBrand$card_entry_release(brand);
        this.cvvScrubber.setBrand$card_entry_release(brand);
        CardNumberValidator cardNumberValidator = this.cardNumberValidator;
        cardNumberValidator.getClass();
        brand.getClass();
        cardNumberValidator.brand = brand;
        CvvValidator cvvValidator = this.cvvValidator;
        cvvValidator.getClass();
        cvvValidator.brand = brand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateState(CardEditorState newState) {
        if (this.state.getBrand() != newState.getBrand()) {
            updateBrandTo(newState.getBrand());
        }
        this.state = newState;
        getStateChangedCallback().invoke(newState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateViewForErrorState() {
        if (this.state.isFocusedFieldInErrorState()) {
            setUnderlineToError(this);
            int i = WhenMappings.$EnumSwitchMapping$0[this.state.getFocusedField().ordinal()];
            (i != 1 ? i != 3 ? this : this.expiration : this.cardNumber).startAnimation(AnimationUtils.loadAnimation(getContext(), sqip.cardentry.R.anim.sqip_edit_text_shake_error));
        } else {
            setUnderlineToDefault(this);
        }
        CardEditorState.CompletionStatus expirationCompletionStatus = this.state.getExpirationCompletionStatus();
        CardEditorState.CompletionStatus completionStatus = CardEditorState.CompletionStatus.ERROR;
        EditText editText = this.expiration;
        if (expirationCompletionStatus == completionStatus) {
            editText.setTextColor(this.errorColor);
            this.monthYearProgressionButton.setTextColor(this.errorColor);
        } else {
            editText.setTextColor(this.defaultTextColor);
            this.monthYearProgressionButton.setTextColor(this.defaultTextColor);
        }
        CardEditorState.CompletionStatus cardNumberCompletionStatus = this.state.getCardNumberCompletionStatus();
        EditTextCursorWatcher editTextCursorWatcher = this.cardNumber;
        if (cardNumberCompletionStatus == completionStatus) {
            editTextCursorWatcher.setTextColor(this.errorColor);
        } else {
            editTextCursorWatcher.setTextColor(this.defaultTextColor);
        }
    }

    @Override // sqip.internal.ReadableCardEditor
    public String getCardNumber() {
        return UtilsKt.stripSpaces(this.state.getCardNumber());
    }

    @Override // sqip.internal.ReadableCardEditor
    public String getCvv() {
        return this.cvv.getText().toString();
    }

    @Override // sqip.internal.ReadableCardEditor
    public int getMonth() {
        Editable text = this.expiration.getText();
        text.getClass();
        Integer valueOf = Integer.valueOf(StringsKt.substring(UtilsKt.stripNonDigits(text), new IntRange(0, 1, 1)));
        valueOf.getClass();
        return valueOf.intValue();
    }

    @Override // sqip.internal.GenericCardEditor
    public Function0<Unit> getOnSubmitFunction() {
        return this.onSubmitFunction;
    }

    @Override // sqip.internal.ReadableCardEditor
    public String getPostal() {
        if (this.state.getCollectPostalCode()) {
            return this.postal.getText().toString();
        }
        return null;
    }

    @Override // sqip.internal.GenericCardEditor
    public Function1<CardEditorState, Unit> getStateChangedCallback() {
        return this.stateChangedCallback;
    }

    @Override // sqip.internal.GenericCardEditor
    public View getViewFor(CardEditorState.Field field) {
        field.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[field.ordinal()];
        if (i == 1) {
            return this.cardNumber;
        }
        if (i == 2) {
            return this.cvv;
        }
        if (i == 3) {
            return this.expiration;
        }
        if (i == 4) {
            return this.postal;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
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
        int i = Calendar.getInstance().get(1);
        int i2 = i - (i % 100);
        Editable text = this.expiration.getText();
        text.getClass();
        Integer valueOf = Integer.valueOf(StringsKt.substring(UtilsKt.stripNonDigits(text), new IntRange(2, 3, 1)));
        valueOf.getClass();
        return valueOf.intValue() + i2;
    }

    @Override // sqip.internal.GenericCardEditor
    public void init(CardEditorState state) {
        state.getClass();
        updateState(state);
        if (state.isMasked()) {
            this.cardNumber.setTransformationMethod(new CreditCardTransformMethod());
        }
        if (state.getFocusedField() != CardEditorState.Field.CARD_NUMBER) {
            this.lastFourDigits.setText(state.getCardNumber().substring(state.getCardNumber().length() - 4), TextView.BufferType.NORMAL);
            ViewAnimator viewAnimator = this.animator;
            ViewGroup viewGroup = this.details;
            PanAnimationSet panAnimationSet = PanAnimationSet.INSTANCE;
            animateTo(viewAnimator, viewGroup, panAnimationSet.getInFromRight(), panAnimationSet.getOutToLeft());
        }
        setFocus(state);
        updateViewForErrorState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setFocusable(false);
        this.cardNumber.setOnCursorUpdate(new Function1<Integer, Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$1
            {
                super(1);
            }

            public final void invoke(int i) {
                CardEditorState cardEditorState;
                CardEditorState copy;
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : i, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return Unit.INSTANCE;
            }
        });
        afterTextChanged(this.expiration, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$2
            {
                super(1);
            }

            public final void invoke(String str) {
                InputValidator inputValidator;
                EditText editText;
                InputValidator inputValidator2;
                boolean isContentValidAndComplete;
                CardEditorState cardEditorState;
                CardEditorState copy;
                CardEditorState cardEditorState2;
                CardEditorState cardEditorState3;
                CardEditorState copy2;
                CardEditorState cardEditorState4;
                CardEditorState copy3;
                EditText editText2;
                str.getClass();
                inputValidator = CreditCardEditor.this.expirationValidator;
                boolean isValid = inputValidator.isValid(str);
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                editText = creditCardEditor.expiration;
                inputValidator2 = CreditCardEditor.this.expirationValidator;
                isContentValidAndComplete = creditCardEditor.isContentValidAndComplete(editText, inputValidator2);
                if (isContentValidAndComplete) {
                    CreditCardEditor creditCardEditor2 = CreditCardEditor.this;
                    cardEditorState4 = creditCardEditor2.state;
                    copy3 = cardEditorState4.copy((r32 & 1) != 0 ? cardEditorState4.focusedField : null, (r32 & 2) != 0 ? cardEditorState4.cardNumber : null, (r32 & 4) != 0 ? cardEditorState4.expirationDate : null, (r32 & 8) != 0 ? cardEditorState4.cvv : null, (r32 & 16) != 0 ? cardEditorState4.postal : null, (r32 & 32) != 0 ? cardEditorState4.brand : null, (r32 & 64) != 0 ? cardEditorState4.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState4.expirationCompletionStatus : CardEditorState.CompletionStatus.VALID, (r32 & 256) != 0 ? cardEditorState4.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState4.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState4.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState4.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState4.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState4.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState4.isMasked : false);
                    creditCardEditor2.updateState(copy3);
                    CreditCardEditor creditCardEditor3 = CreditCardEditor.this;
                    editText2 = creditCardEditor3.expiration;
                    creditCardEditor3.focusNextIncompleteView(editText2);
                } else {
                    if (isValid) {
                        cardEditorState2 = CreditCardEditor.this.state;
                        CardEditorState.CompletionStatus expirationCompletionStatus = cardEditorState2.getExpirationCompletionStatus();
                        CardEditorState.CompletionStatus completionStatus = CardEditorState.CompletionStatus.INCOMPLETE;
                        if (expirationCompletionStatus != completionStatus) {
                            CreditCardEditor creditCardEditor4 = CreditCardEditor.this;
                            cardEditorState3 = creditCardEditor4.state;
                            copy2 = cardEditorState3.copy((r32 & 1) != 0 ? cardEditorState3.focusedField : null, (r32 & 2) != 0 ? cardEditorState3.cardNumber : null, (r32 & 4) != 0 ? cardEditorState3.expirationDate : null, (r32 & 8) != 0 ? cardEditorState3.cvv : null, (r32 & 16) != 0 ? cardEditorState3.postal : null, (r32 & 32) != 0 ? cardEditorState3.brand : null, (r32 & 64) != 0 ? cardEditorState3.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState3.expirationCompletionStatus : completionStatus, (r32 & 256) != 0 ? cardEditorState3.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState3.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState3.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState3.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState3.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState3.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState3.isMasked : false);
                            creditCardEditor4.updateState(copy2);
                        }
                    }
                    if (!isValid) {
                        CreditCardEditor creditCardEditor5 = CreditCardEditor.this;
                        cardEditorState = creditCardEditor5.state;
                        copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : CardEditorState.CompletionStatus.ERROR, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                        creditCardEditor5.updateState(copy);
                    }
                }
                CreditCardEditor.this.updateViewForErrorState();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        afterTextChanged(this.cvv, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$3
            {
                super(1);
            }

            public final void invoke(String str) {
                EditText editText;
                CvvValidator cvvValidator;
                boolean isContentValidAndComplete;
                CardEditorState cardEditorState;
                CardEditorState cardEditorState2;
                EditText editText2;
                CardEditorState cardEditorState3;
                CardEditorState copy;
                CardEditorState cardEditorState4;
                CardEditorState copy2;
                EditText editText3;
                str.getClass();
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                editText = creditCardEditor.cvv;
                cvvValidator = CreditCardEditor.this.cvvValidator;
                isContentValidAndComplete = creditCardEditor.isContentValidAndComplete(editText, cvvValidator);
                cardEditorState = CreditCardEditor.this.state;
                CardEditorState.CompletionStatus cvvCompletionStatus = cardEditorState.getCvvCompletionStatus();
                CardEditorState.CompletionStatus completionStatus = CardEditorState.CompletionStatus.INCOMPLETE;
                if (cvvCompletionStatus == completionStatus && isContentValidAndComplete) {
                    CreditCardEditor creditCardEditor2 = CreditCardEditor.this;
                    cardEditorState4 = creditCardEditor2.state;
                    copy2 = cardEditorState4.copy((r32 & 1) != 0 ? cardEditorState4.focusedField : null, (r32 & 2) != 0 ? cardEditorState4.cardNumber : null, (r32 & 4) != 0 ? cardEditorState4.expirationDate : null, (r32 & 8) != 0 ? cardEditorState4.cvv : null, (r32 & 16) != 0 ? cardEditorState4.postal : null, (r32 & 32) != 0 ? cardEditorState4.brand : null, (r32 & 64) != 0 ? cardEditorState4.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState4.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState4.cvvCompletionStatus : CardEditorState.CompletionStatus.VALID, (r32 & 512) != 0 ? cardEditorState4.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState4.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState4.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState4.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState4.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState4.isMasked : false);
                    creditCardEditor2.updateState(copy2);
                    CreditCardEditor creditCardEditor3 = CreditCardEditor.this;
                    editText3 = creditCardEditor3.cvv;
                    creditCardEditor3.focusNextIncompleteView(editText3);
                    return;
                }
                cardEditorState2 = CreditCardEditor.this.state;
                if (cardEditorState2.getCvvCompletionStatus() == CardEditorState.CompletionStatus.VALID && !isContentValidAndComplete) {
                    CreditCardEditor creditCardEditor4 = CreditCardEditor.this;
                    cardEditorState3 = creditCardEditor4.state;
                    copy = cardEditorState3.copy((r32 & 1) != 0 ? cardEditorState3.focusedField : null, (r32 & 2) != 0 ? cardEditorState3.cardNumber : null, (r32 & 4) != 0 ? cardEditorState3.expirationDate : null, (r32 & 8) != 0 ? cardEditorState3.cvv : null, (r32 & 16) != 0 ? cardEditorState3.postal : null, (r32 & 32) != 0 ? cardEditorState3.brand : null, (r32 & 64) != 0 ? cardEditorState3.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState3.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState3.cvvCompletionStatus : completionStatus, (r32 & 512) != 0 ? cardEditorState3.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState3.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState3.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState3.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState3.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState3.isMasked : false);
                    creditCardEditor4.updateState(copy);
                    return;
                }
                if (isContentValidAndComplete) {
                    CreditCardEditor creditCardEditor5 = CreditCardEditor.this;
                    editText2 = creditCardEditor5.cvv;
                    creditCardEditor5.focusNextIncompleteView(editText2);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        EditTextCursorWatcher editTextCursorWatcher = this.cardNumber;
        editTextCursorWatcher.addTextChangedListener(new ScrubbingTextWatcher(this.cardNumberScrubber, editTextCursorWatcher));
        afterTextChanged(this.cardNumber, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$4
            {
                super(1);
            }

            public final void invoke(String str) {
                CardEditorState cardEditorState;
                CardEditorState copy;
                str.getClass();
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : UtilsKt.stripSpaces(str), (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
                CreditCardEditor.this.setLockAndProgressionButtonVisibility();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        afterTextChanged(this.cardNumber, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$5
            {
                super(1);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x01a8, code lost:
            
                if (r1.charAt(5) != '9') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:185:0x02f3, code lost:
            
                if (r1.charAt(5) != '3') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:195:0x02a2, code lost:
            
                if (r1.charAt(5) != '3') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:205:0x031c, code lost:
            
                if (r1.charAt(5) != '9') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:277:0x041c, code lost:
            
                if (r1.charAt(5) != '2') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:284:0x0435, code lost:
            
                if (r1.charAt(5) != '7') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:291:0x0450, code lost:
            
                if (r1.charAt(5) != '5') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:298:0x0469, code lost:
            
                if (r1.charAt(5) != '8') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:308:0x0490, code lost:
            
                if (r1.charAt(5) != '6') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:510:0x077a, code lost:
            
                if (r1.charAt(5) == '3') goto L107;
             */
            /* JADX WARN: Code restructure failed: missing block: B:527:0x07b0, code lost:
            
                if (r1.charAt(5) != '6') goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:543:0x07ed, code lost:
            
                if (r1 != '9') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:574:0x0856, code lost:
            
                if (r1.charAt(5) != '1') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:600:0x08b2, code lost:
            
                if (r1.charAt(5) != '5') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:610:0x08d9, code lost:
            
                if (r1.charAt(5) != '6') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:761:0x0b03, code lost:
            
                if (r1 != '9') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:778:0x0b43, code lost:
            
                if (r1.charAt(6) != '0') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:785:0x0b5e, code lost:
            
                if (r1.charAt(3) != '5') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:794:0x0b80, code lost:
            
                if (r1.charAt(3) != '0') goto L1209;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0154, code lost:
            
                if (r1.charAt(5) != '3') goto L1209;
             */
            /* JADX WARN: Removed duplicated region for block: B:186:0x027f  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00cb A[FALL_THROUGH] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00cf A[FALL_THROUGH, PHI: r6
              0x00cf: PHI (r6v58 com.squareup.Card$Brand) = 
              (r6v3 com.squareup.Card$Brand)
              (r6v3 com.squareup.Card$Brand)
              (r6v3 com.squareup.Card$Brand)
              (r6v59 com.squareup.Card$Brand)
              (r6v59 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v59 com.squareup.Card$Brand)
             binds: [B:785:0x0b5e, B:782:0x0b51, B:751:0x0ade, B:46:0x00c6, B:269:0x03fe, B:110:0x01b6, B:163:0x027c, B:173:0x02c9, B:178:0x02d9, B:167:0x02af, B:170:0x02bc, B:129:0x01fd, B:51:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x00cf A[PHI: r6
              0x00cf: PHI (r6v58 com.squareup.Card$Brand) = 
              (r6v3 com.squareup.Card$Brand)
              (r6v3 com.squareup.Card$Brand)
              (r6v3 com.squareup.Card$Brand)
              (r6v59 com.squareup.Card$Brand)
              (r6v59 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v77 com.squareup.Card$Brand)
              (r6v59 com.squareup.Card$Brand)
             binds: [B:785:0x0b5e, B:782:0x0b51, B:751:0x0ade, B:46:0x00c6, B:269:0x03fe, B:110:0x01b6, B:163:0x027c, B:173:0x02c9, B:178:0x02d9, B:167:0x02af, B:170:0x02bc, B:129:0x01fd, B:51:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:509:0x0776  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0121 A[FALL_THROUGH] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(String str) {
                CardEditorState cardEditorState;
                CardEditorState cardEditorState2;
                CardEditorState copy;
                int length;
                Card$Brand card$Brand;
                int i;
                int i2;
                str.getClass();
                String stripSpaces = UtilsKt.stripSpaces(str);
                Card$Brand card$Brand2 = Card$Brand.SQUARE_GIFT_CARD_V2;
                Card$Brand card$Brand3 = Card$Brand.UNKNOWN;
                if (stripSpaces != null && (length = stripSpaces.length()) >= 1) {
                    char charAt = stripSpaces.charAt(0);
                    Card$Brand card$Brand4 = Card$Brand.MASTER_CARD;
                    Card$Brand card$Brand5 = Card$Brand.INTERAC;
                    switch (charAt) {
                        case '2':
                            if (length >= 2) {
                                switch (stripSpaces.charAt(1)) {
                                    case '2':
                                        if (length >= 3) {
                                            switch (stripSpaces.charAt(2)) {
                                                case '2':
                                                    if (length >= 4) {
                                                        switch (stripSpaces.charAt(3)) {
                                                        }
                                                    }
                                                    break;
                                                case '3':
                                                case '4':
                                                case '5':
                                                case '6':
                                                case '7':
                                                case '8':
                                                case '9':
                                                    card$Brand3 = card$Brand4;
                                                    break;
                                            }
                                        }
                                        break;
                                    case '7':
                                        if (length >= 3) {
                                            switch (stripSpaces.charAt(2)) {
                                                case '2':
                                                    if (length >= 4) {
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case '3':
                            if (length >= 2) {
                                char charAt2 = stripSpaces.charAt(1);
                                card$Brand = Card$Brand.DISCOVER_DINERS;
                                if (charAt2 == '0') {
                                    if (length >= 3) {
                                        char charAt3 = stripSpaces.charAt(2);
                                        if (charAt3 == '9') {
                                            if (length >= 4) {
                                                break;
                                            }
                                        } else {
                                            switch (charAt3) {
                                            }
                                        }
                                    }
                                } else {
                                    Card$Brand.AnonymousClass2 anonymousClass2 = Card$Brand.AMERICAN_EXPRESS;
                                    Card$Brand card$Brand6 = Card$Brand.JCB;
                                    switch (charAt2) {
                                        case '3':
                                            if (length >= 3) {
                                                if (stripSpaces.charAt(2) == '3') {
                                                    if (length >= 4) {
                                                        if (stripSpaces.charAt(3) == '7') {
                                                            if (length >= 5) {
                                                                if (stripSpaces.charAt(4) == '1') {
                                                                    if (length >= 6) {
                                                                        if (stripSpaces.charAt(5) == '0') {
                                                                            if (length >= 7) {
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        case '4':
                                        case '7':
                                            card$Brand3 = anonymousClass2;
                                            break;
                                        case '5':
                                            if (length >= 3) {
                                                switch (stripSpaces.charAt(2)) {
                                                    case '2':
                                                        if (length >= 4) {
                                                            char charAt4 = stripSpaces.charAt(3);
                                                            if (charAt4 != '8') {
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case '3':
                                                    case '4':
                                                    case '5':
                                                    case '6':
                                                    case '7':
                                                    case '8':
                                                        card$Brand3 = card$Brand6;
                                                        break;
                                                }
                                            }
                                            break;
                                        case '6':
                                        case '8':
                                        case '9':
                                            card$Brand3 = card$Brand;
                                            break;
                                    }
                                }
                            }
                            break;
                        case '4':
                            card$Brand3 = Card$Brand.VISA;
                            break;
                        case '5':
                            if (length >= 2) {
                                switch (stripSpaces.charAt(1)) {
                                    case '0':
                                        if (length >= 3) {
                                            char charAt5 = stripSpaces.charAt(2);
                                            if (charAt5 == '7') {
                                                if (length >= 4 && stripSpaces.charAt(3) == '6' && length >= 5) {
                                                    char charAt6 = stripSpaces.charAt(4);
                                                    if (charAt6 == '0') {
                                                        i = 6;
                                                        if (length >= 6) {
                                                            switch (stripSpaces.charAt(5)) {
                                                                case '0':
                                                                    break;
                                                                case '1':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case '2':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case '3':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case '4':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case '5':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case '6':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case '7':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case '8':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                case '9':
                                                                    if (length >= 7) {
                                                                        switch (stripSpaces.charAt(6)) {
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (length >= i) {
                                                                        switch (stripSpaces.charAt(i)) {
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    } else if (charAt6 == '1') {
                                                        i = 6;
                                                        if (length >= i && stripSpaces.charAt(5) == '0' && length >= 7) {
                                                            switch (stripSpaces.charAt(i)) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                    card$Brand3 = card$Brand5;
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                switch (charAt5) {
                                                    case '0':
                                                        if (length >= 4) {
                                                            if ((r5 = stripSpaces.charAt(3)) == '2') {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            } else {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case '1':
                                                        if (length >= 4) {
                                                            if ((r5 = stripSpaces.charAt(3)) == '0') {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            } else {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case '2':
                                                        if (length >= 4) {
                                                            if ((r5 = stripSpaces.charAt(3)) == '1') {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            } else {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case '3':
                                                        if (length >= 4) {
                                                            if (stripSpaces.charAt(3) == '8') {
                                                                if (length >= 5) {
                                                                    if (stripSpaces.charAt(4) == '8') {
                                                                        if (length >= 6) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case '4':
                                                        if (length >= 4) {
                                                            char charAt7 = stripSpaces.charAt(3);
                                                            if (charAt7 == '1') {
                                                                if (length >= 5) {
                                                                    if (stripSpaces.charAt(4) == '9') {
                                                                        if (length >= 6) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                switch (charAt7) {
                                                                    case '5':
                                                                        if (length >= 5) {
                                                                            if ((r5 = stripSpaces.charAt(4)) == '4') {
                                                                                card$Brand3 = card$Brand5;
                                                                                break;
                                                                            } else {
                                                                                card$Brand3 = card$Brand5;
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case '6':
                                                                        if (length >= 5) {
                                                                            if (stripSpaces.charAt(4) == '6') {
                                                                                if (length >= 6) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    case '7':
                                                                        if (length >= 5) {
                                                                            if ((r5 = stripSpaces.charAt(4)) == '0') {
                                                                                card$Brand3 = card$Brand5;
                                                                                break;
                                                                            } else {
                                                                                card$Brand3 = card$Brand5;
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case '8':
                                                                        if (length >= 5) {
                                                                            if (stripSpaces.charAt(4) == '9') {
                                                                                if (length >= 6) {
                                                                                    char charAt8 = stripSpaces.charAt(5);
                                                                                    if (charAt8 != '0') {
                                                                                    }
                                                                                    card$Brand3 = card$Brand5;
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case '6':
                                        if (length >= 3) {
                                            switch (stripSpaces.charAt(2)) {
                                                case '1':
                                                    if (length >= 4) {
                                                        if (stripSpaces.charAt(3) == '0') {
                                                            if (length >= 5) {
                                                                if (stripSpaces.charAt(4) == '6') {
                                                                    if (length >= 6) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case '8':
                                        if (length >= 3) {
                                            switch (stripSpaces.charAt(2)) {
                                                case '1':
                                                    if (length >= 4) {
                                                        switch (stripSpaces.charAt(3)) {
                                                            case '3':
                                                                if (length >= 5) {
                                                                    switch (stripSpaces.charAt(4)) {
                                                                        case '3':
                                                                            i2 = 6;
                                                                            if (length >= 6) {
                                                                                switch (stripSpaces.charAt(5)) {
                                                                                    case '0':
                                                                                    case '1':
                                                                                    case '2':
                                                                                    case '3':
                                                                                    case '4':
                                                                                    case '5':
                                                                                    case '6':
                                                                                    case '7':
                                                                                    case '8':
                                                                                        break;
                                                                                    default:
                                                                                        if (length >= i2) {
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    case '9':
                                                                                        break;
                                                                                }
                                                                            }
                                                                            break;
                                                                        case '5':
                                                                            i2 = 6;
                                                                            if (length >= i2) {
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case '6':
                                                                if (length >= 5 && stripSpaces.charAt(4) == '2' && length >= 6) {
                                                                    switch (stripSpaces.charAt(5)) {
                                                                    }
                                                                }
                                                                break;
                                                            case '8':
                                                                if (length >= 5) {
                                                                    if ((r5 = stripSpaces.charAt(4)) == '0') {
                                                                        card$Brand3 = card$Brand5;
                                                                        break;
                                                                    } else {
                                                                        card$Brand3 = card$Brand5;
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case '2':
                                                    if (length >= 4) {
                                                        if (stripSpaces.charAt(3) == '1' && length >= 5) {
                                                            if ((r5 = stripSpaces.charAt(4)) == '3') {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            } else {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case '3':
                                                    if (length >= 4) {
                                                        if (stripSpaces.charAt(3) == '3' && length >= 5) {
                                                            if ((r5 = stripSpaces.charAt(4)) == '5') {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            } else {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case '5':
                                                    if (length >= 4) {
                                                        if ((r5 = stripSpaces.charAt(3)) == '8') {
                                                            card$Brand3 = card$Brand5;
                                                            break;
                                                        } else {
                                                            card$Brand3 = card$Brand5;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case '8':
                                                    if (length >= 4) {
                                                        if ((r5 = stripSpaces.charAt(3)) == '6') {
                                                            card$Brand3 = card$Brand5;
                                                            break;
                                                        } else {
                                                            card$Brand3 = card$Brand5;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case '9':
                                                    if (length >= 4) {
                                                        if ((r5 = stripSpaces.charAt(3)) == '2') {
                                                            card$Brand3 = card$Brand5;
                                                            break;
                                                        } else {
                                                            card$Brand3 = card$Brand5;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case '6':
                            if (length >= 2) {
                                char charAt9 = stripSpaces.charAt(1);
                                card$Brand = Card$Brand.DISCOVER;
                                switch (charAt9) {
                                    case '0':
                                        if (length >= 3) {
                                            char charAt10 = stripSpaces.charAt(2);
                                            if (charAt10 == '0') {
                                                if (length >= 4) {
                                                    if (stripSpaces.charAt(3) == '8') {
                                                        if (length >= 5) {
                                                            if (stripSpaces.charAt(4) == '7') {
                                                                if (length >= 6) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (charAt10 == '1') {
                                                if (length >= 4) {
                                                    char charAt11 = stripSpaces.charAt(3);
                                                    if (charAt11 != '1') {
                                                        switch (charAt11) {
                                                            case '6':
                                                                if (length >= 5) {
                                                                    if (stripSpaces.charAt(4) == '8') {
                                                                        if (length >= 6) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case '7':
                                                                if (length >= 5) {
                                                                    if (stripSpaces.charAt(4) == '2') {
                                                                        if (length >= 6) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case '8':
                                                                if (length >= 5) {
                                                                    if (stripSpaces.charAt(4) == '8') {
                                                                        if (length >= 6) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case '9':
                                                                if (length >= 5) {
                                                                    if (stripSpaces.charAt(4) == '6') {
                                                                        if (length >= 6) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    card$Brand3 = card$Brand;
                                                    break;
                                                }
                                            } else if (charAt10 != '3') {
                                                card$Brand3 = card$Brand5;
                                                break;
                                            } else {
                                                card$Brand3 = card$Brand5;
                                                break;
                                            }
                                        }
                                        break;
                                    case '2':
                                        if (length >= 3) {
                                            char charAt12 = stripSpaces.charAt(2);
                                            card$Brand = Card$Brand.UNION_PAY;
                                            switch (charAt12) {
                                                case '1':
                                                    if (length >= 4) {
                                                        if (stripSpaces.charAt(3) == '7') {
                                                            if (length >= 5) {
                                                                if (stripSpaces.charAt(4) == '4') {
                                                                    if (length >= 6) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    break;
                                                case '2':
                                                    if (length >= 4) {
                                                        switch (stripSpaces.charAt(3)) {
                                                            case '0':
                                                                if (length >= 5) {
                                                                    if (stripSpaces.charAt(4) == '3') {
                                                                        if (length >= 6) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                            case '1':
                                                                if (length >= 5) {
                                                                    switch (stripSpaces.charAt(4)) {
                                                                        case '2':
                                                                            if (length >= 6) {
                                                                                char charAt13 = stripSpaces.charAt(5);
                                                                                if (charAt13 != '2') {
                                                                                    switch (charAt13) {
                                                                                    }
                                                                                }
                                                                                card$Brand3 = card$Brand5;
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case '2':
                                                            case '3':
                                                            case '4':
                                                            case '5':
                                                            case '6':
                                                            case '7':
                                                            case '8':
                                                                break;
                                                            case '9':
                                                                if (length >= 5) {
                                                                    switch (stripSpaces.charAt(4)) {
                                                                        case '2':
                                                                            if (length >= 6) {
                                                                                switch (stripSpaces.charAt(5)) {
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                if (length >= 4) {
                                                                    if (stripSpaces.charAt(3) == '4') {
                                                                        if (length >= 5) {
                                                                            if (stripSpaces.charAt(4) == '2') {
                                                                                if (length >= 6) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case '7':
                                                    if (length >= 4) {
                                                        if ((r5 = stripSpaces.charAt(3)) == '1') {
                                                            card$Brand3 = card$Brand5;
                                                            break;
                                                        } else {
                                                            card$Brand3 = card$Brand5;
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case '8':
                                                    if (length >= 4) {
                                                        switch (stripSpaces.charAt(3)) {
                                                            case '0':
                                                                if (length >= 5) {
                                                                    if ((r5 = stripSpaces.charAt(4)) == '4') {
                                                                        card$Brand3 = card$Brand5;
                                                                        break;
                                                                    } else {
                                                                        card$Brand3 = card$Brand5;
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case '9':
                                                    if (length >= 4 && stripSpaces.charAt(3) == '4' && length >= 5) {
                                                        char charAt14 = stripSpaces.charAt(4);
                                                        if (charAt14 != '4') {
                                                            if (charAt14 == '5' && length >= 6) {
                                                                switch (stripSpaces.charAt(5)) {
                                                                }
                                                            }
                                                        } else if (length >= 6) {
                                                            switch (stripSpaces.charAt(5)) {
                                                            }
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case '3':
                                        if (length >= 3) {
                                            char charAt15 = stripSpaces.charAt(2);
                                            if (charAt15 == '6') {
                                                if (length >= 4) {
                                                    if (stripSpaces.charAt(3) == '1') {
                                                        if (length >= 5) {
                                                            if (stripSpaces.charAt(4) == '2') {
                                                                if (length >= 6) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (charAt15 == '7') {
                                                if (length >= 4 && stripSpaces.charAt(3) == '2' && length >= 5 && stripSpaces.charAt(4) == '0' && length >= 6 && stripSpaces.charAt(5) == '4') {
                                                    card$Brand3 = Card$Brand.EFTPOS;
                                                    break;
                                                }
                                            } else if (charAt15 == '9' && length >= 4) {
                                                switch (stripSpaces.charAt(3)) {
                                                    case '1':
                                                        if (length >= 5) {
                                                            if (stripSpaces.charAt(4) == '3') {
                                                                if (length >= 6) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case '2':
                                                        if (length >= 5) {
                                                            if ((r5 = stripSpaces.charAt(4)) == '0') {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            } else {
                                                                card$Brand3 = card$Brand5;
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case '4':
                                        if (length >= 3) {
                                            switch (stripSpaces.charAt(2)) {
                                            }
                                        }
                                        break;
                                }
                            }
                            break;
                        case '7':
                            if (length >= 2 && stripSpaces.charAt(1) == '7' && length >= 3) {
                                char charAt16 = stripSpaces.charAt(2);
                                if (charAt16 == '1') {
                                    if (length >= 4 && stripSpaces.charAt(3) == '2' && length >= 5 && stripSpaces.charAt(4) == '2' && length >= 6 && stripSpaces.charAt(5) == '7') {
                                        card$Brand3 = Card$Brand.SQUARE_CAPITAL_CARD;
                                        break;
                                    }
                                } else if (charAt16 == '8' && length >= 4) {
                                    if ((r5 = stripSpaces.charAt(3)) == '2') {
                                        card$Brand3 = card$Brand2;
                                        break;
                                    } else {
                                        card$Brand3 = card$Brand2;
                                        break;
                                    }
                                }
                            }
                            break;
                    }
                }
                cardEditorState = CreditCardEditor.this.state;
                if (card$Brand3 == cardEditorState.getBrand() || card$Brand3 == card$Brand2) {
                    return;
                }
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState2 = creditCardEditor.state;
                copy = cardEditorState2.copy((r32 & 1) != 0 ? cardEditorState2.focusedField : null, (r32 & 2) != 0 ? cardEditorState2.cardNumber : null, (r32 & 4) != 0 ? cardEditorState2.expirationDate : null, (r32 & 8) != 0 ? cardEditorState2.cvv : null, (r32 & 16) != 0 ? cardEditorState2.postal : null, (r32 & 32) != 0 ? cardEditorState2.brand : card$Brand3, (r32 & 64) != 0 ? cardEditorState2.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState2.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState2.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState2.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState2.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState2.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState2.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState2.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState2.isMasked : false);
                creditCardEditor.updateState(copy);
                CreditCardEditor.this.clearForm();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        afterTextChanged(this.cardNumber, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$6
            {
                super(1);
            }

            public final void invoke(String str) {
                EditTextCursorWatcher editTextCursorWatcher2;
                CardNumberValidator cardNumberValidator;
                boolean isContentValidAndComplete;
                boolean cardNumberIsMaxLengthAndInvalid;
                CardEditorState cardEditorState;
                CardEditorState copy;
                CardEditorState cardEditorState2;
                CardEditorState copy2;
                CardEditorState cardEditorState3;
                CardEditorState copy3;
                CardEditorState cardEditorState4;
                str.getClass();
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                editTextCursorWatcher2 = creditCardEditor.cardNumber;
                cardNumberValidator = CreditCardEditor.this.cardNumberValidator;
                isContentValidAndComplete = creditCardEditor.isContentValidAndComplete(editTextCursorWatcher2, cardNumberValidator);
                CreditCardEditor creditCardEditor2 = CreditCardEditor.this;
                if (isContentValidAndComplete) {
                    cardEditorState3 = creditCardEditor2.state;
                    copy3 = cardEditorState3.copy((r32 & 1) != 0 ? cardEditorState3.focusedField : null, (r32 & 2) != 0 ? cardEditorState3.cardNumber : null, (r32 & 4) != 0 ? cardEditorState3.expirationDate : null, (r32 & 8) != 0 ? cardEditorState3.cvv : null, (r32 & 16) != 0 ? cardEditorState3.postal : null, (r32 & 32) != 0 ? cardEditorState3.brand : null, (r32 & 64) != 0 ? cardEditorState3.cardNumberCompletionStatus : CardEditorState.CompletionStatus.VALID, (r32 & 128) != 0 ? cardEditorState3.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState3.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState3.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState3.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState3.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState3.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState3.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState3.isMasked : false);
                    creditCardEditor2.updateState(copy3);
                    cardEditorState4 = CreditCardEditor.this.state;
                    if (UtilsKt.isMobileCommerceMaxLength(cardEditorState4.getBrand(), UtilsKt.stripSpaces(str).length())) {
                        CreditCardEditor.this.switchToDetails();
                    }
                } else {
                    cardNumberIsMaxLengthAndInvalid = creditCardEditor2.cardNumberIsMaxLengthAndInvalid(str);
                    CreditCardEditor creditCardEditor3 = CreditCardEditor.this;
                    if (cardNumberIsMaxLengthAndInvalid) {
                        cardEditorState2 = creditCardEditor3.state;
                        copy2 = cardEditorState2.copy((r32 & 1) != 0 ? cardEditorState2.focusedField : null, (r32 & 2) != 0 ? cardEditorState2.cardNumber : null, (r32 & 4) != 0 ? cardEditorState2.expirationDate : null, (r32 & 8) != 0 ? cardEditorState2.cvv : null, (r32 & 16) != 0 ? cardEditorState2.postal : null, (r32 & 32) != 0 ? cardEditorState2.brand : null, (r32 & 64) != 0 ? cardEditorState2.cardNumberCompletionStatus : CardEditorState.CompletionStatus.ERROR, (r32 & 128) != 0 ? cardEditorState2.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState2.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState2.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState2.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState2.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState2.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState2.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState2.isMasked : false);
                        creditCardEditor3.updateState(copy2);
                        CreditCardEditor.this.updateViewForErrorState();
                    } else {
                        cardEditorState = creditCardEditor3.state;
                        copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : CardEditorState.CompletionStatus.INCOMPLETE, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                        creditCardEditor3.updateState(copy);
                    }
                }
                CreditCardEditor.this.updateViewForErrorState();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        final int i = 0;
        this.cardNumber.setOnEditorActionListener(new CreditCardEditor$$ExternalSyntheticLambda2(this, i));
        this.lastFourDigits.setOnClickListener(new View.OnClickListener(this) { // from class: sqip.internal.CreditCardEditor$$ExternalSyntheticLambda3
            public final /* synthetic */ CreditCardEditor f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                CreditCardEditor creditCardEditor = this.f$0;
                switch (i2) {
                    case 0:
                        creditCardEditor.switchBackToPan();
                        break;
                    default:
                        CreditCardEditor.onAttachedToWindow$lambda$2(creditCardEditor, view);
                        break;
                }
            }
        });
        onBackspace(this.expiration, new Function0<Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4386invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4386invoke() {
                CreditCardEditor.this.switchBackToPan();
            }
        });
        onBackspace(this.cvv, new Function0<Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$10
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4382invoke() {
                EditText editText;
                editText = CreditCardEditor.this.expiration;
                editText.requestFocus();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4382invoke();
                return Unit.INSTANCE;
            }
        });
        afterTextChanged(this.expiration, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$11
            {
                super(1);
            }

            public final void invoke(String str) {
                CardEditorState cardEditorState;
                CardEditorState copy;
                TextView textView;
                CardEditorState cardEditorState2;
                str.getClass();
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : str, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
                textView = CreditCardEditor.this.monthYearProgressionButton;
                cardEditorState2 = CreditCardEditor.this.state;
                textView.setText(cardEditorState2.getExpirationDate());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        afterTextChanged(this.cvv, new Function1<String, Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$12
            {
                super(1);
            }

            public final void invoke(String str) {
                CardEditorState cardEditorState;
                CardEditorState copy;
                str.getClass();
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : null, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : CreditCardEditor.this.getCvv(), (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }
        });
        onHasFocus(this.cardNumber, new Function0<Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$13
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4383invoke() {
                CardEditorState cardEditorState;
                CardEditorState copy;
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : CardEditorState.Field.CARD_NUMBER, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
                CreditCardEditor.this.updateViewForErrorState();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4383invoke();
                return Unit.INSTANCE;
            }
        });
        onHasFocus(this.expiration, new Function0<Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$14
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4384invoke() {
                CardEditorState cardEditorState;
                CardEditorState copy;
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : CardEditorState.Field.EXPIRATION, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
                CreditCardEditor.this.updateViewForErrorState();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4384invoke();
                return Unit.INSTANCE;
            }
        });
        onHasFocus(this.cvv, new Function0<Unit>() { // from class: sqip.internal.CreditCardEditor$onAttachedToWindow$15
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4385invoke() {
                CardEditorState cardEditorState;
                CardEditorState copy;
                CreditCardEditor creditCardEditor = CreditCardEditor.this;
                cardEditorState = creditCardEditor.state;
                copy = cardEditorState.copy((r32 & 1) != 0 ? cardEditorState.focusedField : CardEditorState.Field.CVV, (r32 & 2) != 0 ? cardEditorState.cardNumber : null, (r32 & 4) != 0 ? cardEditorState.expirationDate : null, (r32 & 8) != 0 ? cardEditorState.cvv : null, (r32 & 16) != 0 ? cardEditorState.postal : null, (r32 & 32) != 0 ? cardEditorState.brand : null, (r32 & 64) != 0 ? cardEditorState.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? cardEditorState.expirationCompletionStatus : null, (r32 & 256) != 0 ? cardEditorState.cvvCompletionStatus : null, (r32 & 512) != 0 ? cardEditorState.postalCompletionStatus : null, (r32 & 1024) != 0 ? cardEditorState.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? cardEditorState.collectPostalCode : false, (r32 & 4096) != 0 ? cardEditorState.isProcessingRequest : false, (r32 & PKIFailureInfo.certRevoked) != 0 ? cardEditorState.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? cardEditorState.isMasked : false);
                creditCardEditor.updateState(copy);
                CreditCardEditor.this.updateViewForErrorState();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4385invoke();
                return Unit.INSTANCE;
            }
        });
        final int i2 = 1;
        this.monthYearProgressionButton.setOnClickListener(new View.OnClickListener(this) { // from class: sqip.internal.CreditCardEditor$$ExternalSyntheticLambda3
            public final /* synthetic */ CreditCardEditor f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                CreditCardEditor creditCardEditor = this.f$0;
                switch (i22) {
                    case 0:
                        creditCardEditor.switchBackToPan();
                        break;
                    default:
                        CreditCardEditor.onAttachedToWindow$lambda$2(creditCardEditor, view);
                        break;
                }
            }
        });
        if (this.state.getCollectPostalCode()) {
            setUpPostalField();
        } else {
            this.postal.setVisibility(8);
        }
        setFocus(this.state);
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
        this.invisibleCard.setVisibility(showCard ? 0 : 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardEditor(Context context) {
        super(context);
        context.getClass();
        this.cardNumberScrubber = new CardNumberScrubber();
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        this.expirationValidator = new n(calendar);
        this.cardNumberValidator = new CardNumberValidator();
        this.cvvValidator = new CvvValidator();
        CvvScrubber cvvScrubber = new CvvScrubber();
        this.cvvScrubber = cvvScrubber;
        this.onSubmitFunction = CreditCardEditor$onSubmitFunction$1.INSTANCE;
        this.stateChangedCallback = CreditCardEditor$stateChangedCallback$1.INSTANCE;
        View.inflate(getContext(), sqip.cardentry.R.layout.sqip_card_editor, this);
        this.state = new CardEditorState(null, null, null, null, null, null, null, null, null, null, 0, false, false, false, false, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE, null);
        View findViewById = findViewById(sqip.cardentry.R.id.card_number);
        findViewById.getClass();
        this.cardNumber = (EditTextCursorWatcher) findViewById;
        View findViewById2 = findViewById(sqip.cardentry.R.id.month_year);
        findViewById2.getClass();
        EditText editText = (EditText) findViewById2;
        this.expiration = editText;
        View findViewById3 = findViewById(sqip.cardentry.R.id.cvv);
        findViewById3.getClass();
        EditText editText2 = (EditText) findViewById3;
        this.cvv = editText2;
        View findViewById4 = findViewById(sqip.cardentry.R.id.postal_code);
        findViewById4.getClass();
        this.postal = (EditText) findViewById4;
        View findViewById5 = findViewById(sqip.cardentry.R.id.card_entry_animator);
        findViewById5.getClass();
        this.animator = (ViewAnimator) findViewById5;
        View findViewById6 = findViewById(sqip.cardentry.R.id.details);
        findViewById6.getClass();
        this.details = (ViewGroup) findViewById6;
        View findViewById7 = findViewById(sqip.cardentry.R.id.card_number_last_digits);
        findViewById7.getClass();
        EditText editText3 = (EditText) findViewById7;
        this.lastFourDigits = editText3;
        View findViewById8 = findViewById(sqip.cardentry.R.id.month_year_progression_button);
        findViewById8.getClass();
        this.monthYearProgressionButton = (TextView) findViewById8;
        View findViewById9 = findViewById(sqip.cardentry.R.id.lock_image);
        findViewById9.getClass();
        ImageView imageView = (ImageView) findViewById9;
        this.lockImage = imageView;
        View findViewById10 = findViewById(sqip.cardentry.R.id.pan_group);
        findViewById10.getClass();
        this.panLayout = (ViewGroup) findViewById10;
        View findViewById11 = findViewById(sqip.cardentry.R.id.invisible_card_image);
        findViewById11.getClass();
        this.invisibleCard = findViewById11;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{android.R.attr.colorAccent, R.attr.sqipErrorColor});
        obtainStyledAttributes.getClass();
        this.accentColor = obtainStyledAttributes.getColor(0, 0);
        this.errorColor = obtainStyledAttributes.getColor(1, getContext().getColor(R.color.sqip_error_color_red));
        obtainStyledAttributes.recycle();
        ColorStateList textColors = editText.getTextColors();
        textColors.getClass();
        this.defaultTextColor = textColors;
        editText3.setTextColor(textColors);
        editText.addTextChangedListener(new ScrubbingTextWatcher(new ExpirationDateScrubber(), editText));
        editText2.addTextChangedListener(new ScrubbingTextWatcher(cvvScrubber, editText2));
        imageView.setImageDrawable(getContext().getDrawable(sqip.cardentry.R.drawable.sqip_edit_text_lock_icon));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditCardEditor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        attributeSet.getClass();
        this.cardNumberScrubber = new CardNumberScrubber();
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        this.expirationValidator = new n(calendar);
        this.cardNumberValidator = new CardNumberValidator();
        this.cvvValidator = new CvvValidator();
        CvvScrubber cvvScrubber = new CvvScrubber();
        this.cvvScrubber = cvvScrubber;
        this.onSubmitFunction = CreditCardEditor$onSubmitFunction$1.INSTANCE;
        this.stateChangedCallback = CreditCardEditor$stateChangedCallback$1.INSTANCE;
        View.inflate(getContext(), sqip.cardentry.R.layout.sqip_card_editor, this);
        this.state = new CardEditorState(null, null, null, null, null, null, null, null, null, null, 0, false, false, false, false, IptcConstants.IPTC_NON_EXTENDED_RECORD_MAXIMUM_SIZE, null);
        View findViewById = findViewById(sqip.cardentry.R.id.card_number);
        findViewById.getClass();
        this.cardNumber = (EditTextCursorWatcher) findViewById;
        View findViewById2 = findViewById(sqip.cardentry.R.id.month_year);
        findViewById2.getClass();
        EditText editText = (EditText) findViewById2;
        this.expiration = editText;
        View findViewById3 = findViewById(sqip.cardentry.R.id.cvv);
        findViewById3.getClass();
        EditText editText2 = (EditText) findViewById3;
        this.cvv = editText2;
        View findViewById4 = findViewById(sqip.cardentry.R.id.postal_code);
        findViewById4.getClass();
        this.postal = (EditText) findViewById4;
        View findViewById5 = findViewById(sqip.cardentry.R.id.card_entry_animator);
        findViewById5.getClass();
        this.animator = (ViewAnimator) findViewById5;
        View findViewById6 = findViewById(sqip.cardentry.R.id.details);
        findViewById6.getClass();
        this.details = (ViewGroup) findViewById6;
        View findViewById7 = findViewById(sqip.cardentry.R.id.card_number_last_digits);
        findViewById7.getClass();
        EditText editText3 = (EditText) findViewById7;
        this.lastFourDigits = editText3;
        View findViewById8 = findViewById(sqip.cardentry.R.id.month_year_progression_button);
        findViewById8.getClass();
        this.monthYearProgressionButton = (TextView) findViewById8;
        View findViewById9 = findViewById(sqip.cardentry.R.id.lock_image);
        findViewById9.getClass();
        ImageView imageView = (ImageView) findViewById9;
        this.lockImage = imageView;
        View findViewById10 = findViewById(sqip.cardentry.R.id.pan_group);
        findViewById10.getClass();
        this.panLayout = (ViewGroup) findViewById10;
        View findViewById11 = findViewById(sqip.cardentry.R.id.invisible_card_image);
        findViewById11.getClass();
        this.invisibleCard = findViewById11;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{android.R.attr.colorAccent, R.attr.sqipErrorColor});
        obtainStyledAttributes.getClass();
        this.accentColor = obtainStyledAttributes.getColor(0, 0);
        this.errorColor = obtainStyledAttributes.getColor(1, getContext().getColor(R.color.sqip_error_color_red));
        obtainStyledAttributes.recycle();
        ColorStateList textColors = editText.getTextColors();
        textColors.getClass();
        this.defaultTextColor = textColors;
        editText3.setTextColor(textColors);
        editText.addTextChangedListener(new ScrubbingTextWatcher(new ExpirationDateScrubber(), editText));
        editText2.addTextChangedListener(new ScrubbingTextWatcher(cvvScrubber, editText2));
        imageView.setImageDrawable(getContext().getDrawable(sqip.cardentry.R.drawable.sqip_edit_text_lock_icon));
    }
}
