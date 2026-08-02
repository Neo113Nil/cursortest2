package sqip.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.Card$Brand;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.properties.Delegates;
import kotlin.properties.NotNullVar;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sqip.InAppPaymentsSdk;
import sqip.internal.StateListener;
import sqip.internal.nonce.ActivityControllerProvider;
import sqip.internal.nonce.CardEntryActivityComponent;
import sqip.internal.nonce.CardEntryActivityControllerFactory;
import sqip.internal.nonce.CardEntryResultParcelable;
import sqip.internal.nonce.DebugUtilsKt;
import sqip.internal.presenters.CardImagePresenter;
import sqip.internal.presenters.HelperTextSwitcherPresenter;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0083\u00012\u00020\u0001:\b\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010N\u001a\u00020<H\u0002J\b\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020)H\u0002J\u0006\u0010R\u001a\u00020PJ\u0016\u0010S\u001a\u00020P2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020UJ\b\u0010W\u001a\u00020PH&J\b\u0010X\u001a\u00020PH\u0002J\u0006\u0010Y\u001a\u00020PJ\u000e\u0010Z\u001a\u00020P2\u0006\u0010[\u001a\u00020\\J\b\u0010]\u001a\u00020'H$J\u0006\u0010^\u001a\u00020PJ\u0006\u0010_\u001a\u00020PJ\b\u0010`\u001a\u00020aH&J\b\u0010b\u001a\u00020PH\u0016J\u0012\u0010c\u001a\u00020P2\b\u0010d\u001a\u0004\u0018\u00010eH\u0014J\b\u0010f\u001a\u00020PH\u0014J\b\u0010g\u001a\u00020PH\u0014J\b\u0010h\u001a\u00020PH\u0014J\b\u0010i\u001a\u00020jH\u0016J\u0010\u0010k\u001a\u00020P2\u0006\u0010l\u001a\u00020eH\u0014J\b\u0010m\u001a\u00020<H\u0016J\u0006\u0010n\u001a\u00020PJ\u0012\u0010o\u001a\u00020P2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0002J\u001a\u0010p\u001a\u00020P2\u0006\u0010q\u001a\u00020'2\b\b\u0002\u0010r\u001a\u00020<H\u0002J\u001e\u0010s\u001a\u00020P2\u0006\u0010t\u001a\u00020<2\u0006\u0010u\u001a\u00020<2\u0006\u0010v\u001a\u00020<J,\u0010w\u001a\u00020P*\u00020x2\u0006\u0010y\u001a\u00020)2\u0006\u0010z\u001a\u00020)2\u0006\u0010{\u001a\u00020)2\u0006\u0010|\u001a\u00020)H\u0002J\f\u0010}\u001a\u00020\t*\u00020~H\u0002J\u0015\u0010\u007f\u001a\u00020~*\u00020~2\u0007\u0010\u0080\u0001\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082.¢\u0006\u0002\n\u0000R+\u0010.\u001a\u00020)2\u0006\u0010-\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00105\u001a\u00020)2\u0006\u0010-\u001a\u00020)8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00104\u001a\u0004\b6\u00100\"\u0004\b7\u00102R\u0012\u00109\u001a\u00060:R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u00020<X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020IX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0085\u0001"}, d2 = {"Lsqip/internal/BaseCardEntryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityController", "Lsqip/internal/CardEntryActivityController;", "bigCardHorizontalConstraint", "Landroidx/constraintlayout/widget/ConstraintSet;", "bigCardVerticalConstraint", "buyerLocale", "Ljava/util/Locale;", "getBuyerLocale", "()Ljava/util/Locale;", "buyerLocale$delegate", "Lkotlin/Lazy;", "cardEditor", "Lsqip/internal/GenericCardEditor;", "cardEditorState", "Lsqip/internal/CardEditorState;", "getCardEditorState", "()Lsqip/internal/CardEditorState;", "setCardEditorState", "(Lsqip/internal/CardEditorState;)V", "cardEntryActivityComponent", "Lsqip/internal/nonce/CardEntryActivityComponent;", "cardEntryLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getCardEntryLayout", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setCardEntryLayout", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "cardImage", "Lsqip/internal/CardImage;", "cardImagePresenter", "Lsqip/internal/presenters/CardImagePresenter;", "check", "Landroid/graphics/drawable/Drawable;", "contentView", "Landroid/view/ViewGroup;", "currentLayoutMode", "Lsqip/internal/BaseCardEntryActivity$LayoutMode;", "finishEnterResId", "", "finishExitResId", "helperTextPresenter", "Lsqip/internal/presenters/HelperTextSwitcherPresenter;", "<set-?>", "helperTextSmallCardTopMargin", "getHelperTextSmallCardTopMargin", "()I", "setHelperTextSmallCardTopMargin", "(I)V", "helperTextSmallCardTopMargin$delegate", "Lkotlin/properties/ReadWriteProperty;", "helperTextTopMargin", "getHelperTextTopMargin", "setHelperTextTopMargin", "helperTextTopMargin$delegate", "internalStateListener", "Lsqip/internal/BaseCardEntryActivity$CardEntryActivityStateListener;", "isManualCardEntryTimedOut", "", "()Z", "setManualCardEntryTimedOut", "(Z)V", "layoutChangeListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "previousViewHeight", "progressSpinner", "Landroid/widget/ProgressBar;", "saveButton", "Landroid/widget/TextView;", "smallCardConstraint", "spinnerBackgroundTransition", "Landroid/graphics/drawable/TransitionDrawable;", "spinnerColor", "spinnerIndeterminateTransition", "stateManager", "Lsqip/internal/CardEntryStateManager;", "adjustLayoutForSize", "bindViews", "", "calculateMinHeightForHelperText", "cancel", "displayError", "title", "", "message", "doSetContentView", "finishAnimating", "finishWithCancel", "finishWithSuccess", "cardEntryResult", "Lsqip/internal/CardEntryResult;", "getLayoutMode", "hideKeyboard", "jumpToCompletedCheck", "makeControllerFactory", "Lsqip/internal/nonce/CardEntryActivityControllerFactory;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onRetainCustomNonConfigurationInstance", "", "onSaveInstanceState", "outState", "onSupportNavigateUp", "startCheck", "storeResult", "updateCardLayout", "layoutMode", "shouldAnimate", "updateUiState", "showProgress", "enableSaveButton", "showCardEditor", "adjustMargins", "Landroid/view/View;", "left", "top", "right", "bottom", "getDefaultLocale", "Landroid/content/Context;", "withLocale", "locale", "BaseCardEntryActivityResult", "CardEntryActivityStateListener", "Companion", "LayoutMode", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class BaseCardEntryActivity extends AppCompatActivity {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    public static final String ACTIVITY_RESULT = "com.squareup.ACTIVITY_RESULT";
    protected static final String APPLICATION_ID_KEY = "APPLICATION_ID_KEY";
    protected static final String CARD_EDITOR_STATE_KEY = "CARD_EDITOR_STATE";
    public static final String CARD_ENTRY_RESULT = "CARD_ENTRY_RESULT";
    public static final String COLLECT_GIFT_CARD = "COLLECT_GIFT_CARD";
    public static final String COLLECT_POSTAL_KEY = "COLLECT_POSTAL_KEY";
    private static final long CONSTRAINT_ANIM_DURATION_MS = 300;
    public static final String LOCALE_EXTRA = "LOCALE_EXTRA";
    public static final String MASK_CARD_NUMBER_EXTRA = "MASK_CARD_NUMBER_EXTRA";
    private static final int NO_ANIMATION = 0;
    private static final int PREVIOUS_HEIGHT_ON_ACTIVITY_CREATE = -1;
    public static final String PROCESS_DEATH_EXTRA = "PROCESS_DEATH_EXTRA";
    private static final int SPINNER_BACKGROUND_TRANSITION_MS = 50;
    private static final int SPINNER_INDETERMINATE_TRANSITION_MS = 150;
    private CardEntryActivityController activityController;
    private ConstraintSet bigCardHorizontalConstraint;
    private ConstraintSet bigCardVerticalConstraint;

    /* renamed from: buyerLocale$delegate, reason: from kotlin metadata */
    private final Lazy buyerLocale;
    private GenericCardEditor cardEditor;
    public CardEditorState cardEditorState;
    private CardEntryActivityComponent cardEntryActivityComponent;
    protected ConstraintLayout cardEntryLayout;
    private CardImage cardImage;
    private CardImagePresenter cardImagePresenter;
    private Drawable check;
    private ViewGroup contentView;
    private LayoutMode currentLayoutMode;
    private int finishEnterResId;
    private int finishExitResId;
    private HelperTextSwitcherPresenter helperTextPresenter;

    /* renamed from: helperTextSmallCardTopMargin$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty helperTextSmallCardTopMargin;

    /* renamed from: helperTextTopMargin$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty helperTextTopMargin;
    private boolean isManualCardEntryTimedOut;
    private final ViewTreeObserver.OnPreDrawListener layoutChangeListener;
    private ProgressBar progressSpinner;
    private TextView saveButton;
    private ConstraintSet smallCardConstraint;
    private TransitionDrawable spinnerBackgroundTransition;
    private int spinnerColor;
    private TransitionDrawable spinnerIndeterminateTransition;
    private CardEntryStateManager stateManager;
    private final CardEntryActivityStateListener internalStateListener = new CardEntryActivityStateListener();
    private int previousViewHeight = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsqip/internal/BaseCardEntryActivity$BaseCardEntryActivityResult;", "", "(Ljava/lang/String;I)V", "ACTIVITY_RESULT_SUCCESS", "ACTIVITY_RESULT_FAILURE", "ACTIVITY_RESULT_TIMEOUT", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BaseCardEntryActivityResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BaseCardEntryActivityResult[] $VALUES;
        public static final BaseCardEntryActivityResult ACTIVITY_RESULT_SUCCESS = new BaseCardEntryActivityResult("ACTIVITY_RESULT_SUCCESS", 0);
        public static final BaseCardEntryActivityResult ACTIVITY_RESULT_FAILURE = new BaseCardEntryActivityResult("ACTIVITY_RESULT_FAILURE", 1);
        public static final BaseCardEntryActivityResult ACTIVITY_RESULT_TIMEOUT = new BaseCardEntryActivityResult("ACTIVITY_RESULT_TIMEOUT", 2);

        private static final /* synthetic */ BaseCardEntryActivityResult[] $values() {
            return new BaseCardEntryActivityResult[]{ACTIVITY_RESULT_SUCCESS, ACTIVITY_RESULT_FAILURE, ACTIVITY_RESULT_TIMEOUT};
        }

        static {
            BaseCardEntryActivityResult[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private BaseCardEntryActivityResult(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BaseCardEntryActivityResult valueOf(String str) {
            return (BaseCardEntryActivityResult) Enum.valueOf(BaseCardEntryActivityResult.class, str);
        }

        public static BaseCardEntryActivityResult[] values() {
            return (BaseCardEntryActivityResult[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lsqip/internal/BaseCardEntryActivity$CardEntryActivityStateListener;", "Lsqip/internal/StateListener;", "(Lsqip/internal/BaseCardEntryActivity;)V", "onStateChanged", "", "newState", "Lsqip/internal/CardEditorState;", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class CardEntryActivityStateListener implements StateListener {
        public CardEntryActivityStateListener() {
        }

        @Override // sqip.internal.StateListener
        public void onBrandChanged(Card$Brand card$Brand) {
            StateListener.DefaultImpls.onBrandChanged(this, card$Brand);
        }

        @Override // sqip.internal.StateListener
        public void onCompletionStatusChanged(CardEditorState cardEditorState) {
            StateListener.DefaultImpls.onCompletionStatusChanged(this, cardEditorState);
        }

        @Override // sqip.internal.StateListener
        public void onFocusChanged(CardEditorState cardEditorState) {
            StateListener.DefaultImpls.onFocusChanged(this, cardEditorState);
        }

        @Override // sqip.internal.StateListener
        public void onProcessingRequest(boolean z) {
            StateListener.DefaultImpls.onProcessingRequest(this, z);
        }

        @Override // sqip.internal.StateListener
        public void onStateChanged(CardEditorState newState) {
            newState.getClass();
            BaseCardEntryActivity.this.setCardEditorState(newState);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lsqip/internal/BaseCardEntryActivity$LayoutMode;", "", "(Ljava/lang/String;I)V", "SMALL_CARD", "BIG_CARD_VERTICAL", "BIG_CARD_HORIZONTAL", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LayoutMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LayoutMode[] $VALUES;
        public static final LayoutMode SMALL_CARD = new LayoutMode("SMALL_CARD", 0);
        public static final LayoutMode BIG_CARD_VERTICAL = new LayoutMode("BIG_CARD_VERTICAL", 1);
        public static final LayoutMode BIG_CARD_HORIZONTAL = new LayoutMode("BIG_CARD_HORIZONTAL", 2);

        private static final /* synthetic */ LayoutMode[] $values() {
            return new LayoutMode[]{SMALL_CARD, BIG_CARD_VERTICAL, BIG_CARD_HORIZONTAL};
        }

        static {
            LayoutMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private LayoutMode(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static LayoutMode valueOf(String str) {
            return (LayoutMode) Enum.valueOf(LayoutMode.class, str);
        }

        public static LayoutMode[] values() {
            return (LayoutMode[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutMode.values().length];
            try {
                iArr[LayoutMode.BIG_CARD_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutMode.BIG_CARD_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutMode.SMALL_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(BaseCardEntryActivity.class, "helperTextTopMargin", "getHelperTextTopMargin()I", 0);
        ReflectionFactory reflectionFactory = Reflection.factory;
        $$delegatedProperties = new KProperty[]{reflectionFactory.mutableProperty1(mutablePropertyReference1Impl), Fragment$5$$ExternalSyntheticOutline0.m(BaseCardEntryActivity.class, "helperTextSmallCardTopMargin", "getHelperTextSmallCardTopMargin()I", 0, reflectionFactory)};
        INSTANCE = new Companion(null);
    }

    public BaseCardEntryActivity() {
        Delegates.INSTANCE.getClass();
        this.helperTextTopMargin = new NotNullVar();
        this.helperTextSmallCardTopMargin = new NotNullVar();
        this.currentLayoutMode = LayoutMode.BIG_CARD_VERTICAL;
        this.layoutChangeListener = new ViewTreeObserver.OnPreDrawListener() { // from class: sqip.internal.BaseCardEntryActivity$$ExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean layoutChangeListener$lambda$0;
                layoutChangeListener$lambda$0 = BaseCardEntryActivity.layoutChangeListener$lambda$0(BaseCardEntryActivity.this);
                return layoutChangeListener$lambda$0;
            }
        };
        this.buyerLocale = LazyKt.lazy(new Function0<Locale>() { // from class: sqip.internal.BaseCardEntryActivity$buyerLocale$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Locale invoke() {
                Locale defaultLocale;
                Locale locale = (Locale) BaseCardEntryActivity.this.getIntent().getSerializableExtra(BaseCardEntryActivity.LOCALE_EXTRA);
                if (locale != null) {
                    return locale;
                }
                BaseCardEntryActivity baseCardEntryActivity = BaseCardEntryActivity.this;
                defaultLocale = baseCardEntryActivity.getDefaultLocale(baseCardEntryActivity);
                return defaultLocale;
            }
        });
    }

    private final boolean adjustLayoutForSize() {
        int height = getCardEntryLayout().getHeight();
        int i = this.previousViewHeight;
        if (height == i) {
            return false;
        }
        this.previousViewHeight = height;
        LayoutMode layoutMode = getLayoutMode();
        boolean z = i != -1;
        boolean z2 = layoutMode == this.currentLayoutMode;
        updateCardLayout(layoutMode, z);
        return z2;
    }

    private final void adjustMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i4;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i2;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i3;
        view.setLayoutParams(layoutParams2);
    }

    private final void bindViews() {
        GenericCardEditor genericCardEditor;
        if (getCardEditorState().getCollectOnlyGiftCard()) {
            KeyEvent.Callback findViewById = findViewById(sqip.cardentry.R.id.card_editor);
            findViewById.getClass();
            genericCardEditor = (GenericCardEditor) findViewById;
        } else {
            KeyEvent.Callback findViewById2 = findViewById(sqip.cardentry.R.id.card_editor);
            findViewById2.getClass();
            genericCardEditor = (GenericCardEditor) findViewById2;
        }
        this.cardEditor = genericCardEditor;
        View findViewById3 = findViewById(sqip.cardentry.R.id.save_button);
        findViewById3.getClass();
        this.saveButton = (TextView) findViewById3;
        View findViewById4 = findViewById(sqip.cardentry.R.id.progress_spinner);
        findViewById4.getClass();
        this.progressSpinner = (ProgressBar) findViewById4;
        View findViewById5 = findViewById(sqip.cardentry.R.id.card_entry_layout);
        findViewById5.getClass();
        setCardEntryLayout((ConstraintLayout) findViewById5);
    }

    private final int calculateMinHeightForHelperText() {
        return findViewById(sqip.cardentry.R.id.save_button).getHeight() + findViewById(sqip.cardentry.R.id.card_editor).getHeight() + findViewById(sqip.cardentry.R.id.helper_text_switcher).getHeight() + getHelperTextTopMargin();
    }

    private final void finishAnimating() {
        finish();
        overridePendingTransition(this.finishEnterResId, this.finishExitResId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getDefaultLocale(Context context) {
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        locale.getClass();
        return locale;
    }

    private final int getHelperTextSmallCardTopMargin() {
        return ((Number) this.helperTextSmallCardTopMargin.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final int getHelperTextTopMargin() {
        return ((Number) this.helperTextTopMargin.getValue(this, $$delegatedProperties[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean layoutChangeListener$lambda$0(BaseCardEntryActivity baseCardEntryActivity) {
        return !baseCardEntryActivity.adjustLayoutForSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(BaseCardEntryActivity baseCardEntryActivity, View view) {
        CardEntryActivityController cardEntryActivityController = baseCardEntryActivity.activityController;
        if (cardEntryActivityController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityController");
            throw null;
        }
        GenericCardEditor genericCardEditor = baseCardEntryActivity.cardEditor;
        if (genericCardEditor != null) {
            cardEntryActivityController.submitCardData(genericCardEditor, baseCardEntryActivity.getCardEditorState().getCollectOnlyGiftCard());
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
            throw null;
        }
    }

    private final void setHelperTextSmallCardTopMargin(int i) {
        this.helperTextSmallCardTopMargin.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    private final void setHelperTextTopMargin(int i) {
        this.helperTextTopMargin.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    private final void storeResult(CardEntryResult cardEntryResult) {
        Intent intent = new Intent();
        intent.putExtra(ACTIVITY_RESULT, (cardEntryResult != null ? BaseCardEntryActivityResult.ACTIVITY_RESULT_SUCCESS : this.isManualCardEntryTimedOut ? BaseCardEntryActivityResult.ACTIVITY_RESULT_TIMEOUT : BaseCardEntryActivityResult.ACTIVITY_RESULT_FAILURE).toString());
        if (cardEntryResult != null) {
            intent.putExtra(CARD_ENTRY_RESULT, new CardEntryResultParcelable(cardEntryResult));
        }
        setResult(-1, intent);
    }

    private final void updateCardLayout(LayoutMode layoutMode, boolean shouldAnimate) {
        ConstraintSet constraintSet;
        BaseCardEntryActivity baseCardEntryActivity;
        boolean z = getCardEntryLayout().getHeight() >= calculateMinHeightForHelperText();
        if (layoutMode == this.currentLayoutMode) {
            findViewById(sqip.cardentry.R.id.helper_text_switcher).setVisibility(z ? 0 : 8);
            return;
        }
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(new AccelerateDecelerateInterpolator());
        changeBounds.setDuration(CONSTRAINT_ANIM_DURATION_MS);
        if (shouldAnimate) {
            TransitionManager.beginDelayedTransition(getCardEntryLayout(), changeBounds);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[layoutMode.ordinal()];
        if (i == 1) {
            constraintSet = this.bigCardVerticalConstraint;
            if (constraintSet == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bigCardVerticalConstraint");
                throw null;
            }
        } else if (i == 2) {
            constraintSet = this.bigCardHorizontalConstraint;
            if (constraintSet == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bigCardHorizontalConstraint");
                throw null;
            }
        } else {
            if (i != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            constraintSet = this.smallCardConstraint;
            if (constraintSet == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallCardConstraint");
                throw null;
            }
        }
        constraintSet.get(sqip.cardentry.R.id.helper_text_switcher).propertySet.visibility = z ? 0 : 8;
        constraintSet.get(sqip.cardentry.R.id.progress_spinner).propertySet.visibility = getCardEditorState().isProcessingRequest() ? 0 : 8;
        constraintSet.get(sqip.cardentry.R.id.card_editor).propertySet.visibility = getCardEditorState().isProcessingRequest() ? 4 : 0;
        constraintSet.applyTo(getCardEntryLayout());
        GenericCardEditor genericCardEditor = this.cardEditor;
        if (genericCardEditor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
            throw null;
        }
        LayoutMode layoutMode2 = LayoutMode.SMALL_CARD;
        genericCardEditor.showInvisibleCard(layoutMode == layoutMode2);
        if (layoutMode == layoutMode2) {
            CardImage cardImage = this.cardImage;
            if (cardImage == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardImage");
                throw null;
            }
            GenericCardEditor genericCardEditor2 = this.cardEditor;
            if (genericCardEditor2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
                throw null;
            }
            int viewPaddingLeft = genericCardEditor2.getViewPaddingLeft();
            GenericCardEditor genericCardEditor3 = this.cardEditor;
            if (genericCardEditor3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
                throw null;
            }
            int viewPaddingTop = genericCardEditor3.getViewPaddingTop();
            GenericCardEditor genericCardEditor4 = this.cardEditor;
            if (genericCardEditor4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
                throw null;
            }
            int viewPaddingRight = genericCardEditor4.getViewPaddingRight();
            GenericCardEditor genericCardEditor5 = this.cardEditor;
            if (genericCardEditor5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
                throw null;
            }
            baseCardEntryActivity = this;
            baseCardEntryActivity.adjustMargins(cardImage, viewPaddingLeft, viewPaddingTop, viewPaddingRight, genericCardEditor5.getViewPaddingBottom());
        } else {
            baseCardEntryActivity = this;
        }
        baseCardEntryActivity.currentLayoutMode = layoutMode;
    }

    public static /* synthetic */ void updateCardLayout$default(BaseCardEntryActivity baseCardEntryActivity, LayoutMode layoutMode, boolean z, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: updateCardLayout");
            return;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseCardEntryActivity.updateCardLayout(layoutMode, z);
    }

    private final Context withLocale(Context context, Locale locale) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        createConfigurationContext.getClass();
        return createConfigurationContext;
    }

    public final void cancel() {
        CardEntryActivityController cardEntryActivityController = this.activityController;
        if (cardEntryActivityController != null) {
            cardEntryActivityController.onCancel();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activityController");
            throw null;
        }
    }

    public final void displayError(CharSequence title, CharSequence message) {
        title.getClass();
        message.getClass();
        new AlertDialog.Builder(this).setTitle(title).setMessage(message).setPositiveButton(sqip.cardentry.R.string.sqip_error_message_confirmation_button, new BaseCardEntryActivity$$ExternalSyntheticLambda0(0)).show();
    }

    public abstract void doSetContentView();

    public final void finishWithCancel() {
        storeResult(null);
        finishAnimating();
    }

    public final void finishWithSuccess(CardEntryResult cardEntryResult) {
        cardEntryResult.getClass();
        storeResult(cardEntryResult);
        finishAnimating();
    }

    public final Locale getBuyerLocale() {
        return (Locale) this.buyerLocale.getValue();
    }

    public final CardEditorState getCardEditorState() {
        CardEditorState cardEditorState = this.cardEditorState;
        if (cardEditorState != null) {
            return cardEditorState;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardEditorState");
        throw null;
    }

    public final ConstraintLayout getCardEntryLayout() {
        ConstraintLayout constraintLayout = this.cardEntryLayout;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardEntryLayout");
        throw null;
    }

    public abstract LayoutMode getLayoutMode();

    public final void hideKeyboard() {
        Object systemService = getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
    }

    /* renamed from: isManualCardEntryTimedOut, reason: from getter */
    public final boolean getIsManualCardEntryTimedOut() {
        return this.isManualCardEntryTimedOut;
    }

    public final void jumpToCompletedCheck() {
        TransitionDrawable transitionDrawable = this.spinnerBackgroundTransition;
        if (transitionDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spinnerBackgroundTransition");
            throw null;
        }
        transitionDrawable.startTransition(0);
        TransitionDrawable transitionDrawable2 = this.spinnerIndeterminateTransition;
        if (transitionDrawable2 != null) {
            transitionDrawable2.startTransition(0);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("spinnerIndeterminateTransition");
            throw null;
        }
    }

    public abstract CardEntryActivityControllerFactory makeControllerFactory();

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CardEntryActivityController cardEntryActivityController = this.activityController;
        if (cardEntryActivityController != null) {
            cardEntryActivityController.onCancel();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activityController");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        CardEntryActivityComponent build;
        String string2;
        getWindow().addFlags(PKIFailureInfo.certRevoked);
        super.onCreate(savedInstanceState);
        int i = 0;
        Trace.setDecorFitsSystemWindows(getWindow(), false);
        if (savedInstanceState != null && getLastCustomNonConfigurationInstance() == null && getIntent().hasExtra(PROCESS_DEATH_EXTRA)) {
            finishWithCancel();
        }
        if (savedInstanceState != null && (string2 = savedInstanceState.getString(APPLICATION_ID_KEY)) != null) {
            InAppPaymentsSdk.setSquareApplicationId(string2);
        }
        CardEditorState cardEditorState = savedInstanceState != null ? (CardEditorState) savedInstanceState.getParcelable(CARD_EDITOR_STATE_KEY) : null;
        if (cardEditorState == null) {
            cardEditorState = new CardEditorState(null, null, null, null, null, null, null, null, null, null, 0, getIntent().getBooleanExtra(COLLECT_POSTAL_KEY, true), false, getIntent().getBooleanExtra(COLLECT_GIFT_CARD, false), getIntent().getBooleanExtra(MASK_CARD_NUMBER_EXTRA, false), 6143, null);
        }
        setCardEditorState(cardEditorState);
        if (savedInstanceState == null || getLastCustomNonConfigurationInstance() == null) {
            build = ActivityControllerProvider.INSTANCE.build(makeControllerFactory());
        } else {
            Object lastCustomNonConfigurationInstance = getLastCustomNonConfigurationInstance();
            lastCustomNonConfigurationInstance.getClass();
            build = (CardEntryActivityComponent) lastCustomNonConfigurationInstance;
        }
        this.cardEntryActivityComponent = build;
        if (build == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEntryActivityComponent");
            throw null;
        }
        this.activityController = build.cardEntryActivityController();
        CardEntryActivityComponent cardEntryActivityComponent = this.cardEntryActivityComponent;
        if (cardEntryActivityComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEntryActivityComponent");
            throw null;
        }
        this.stateManager = cardEntryActivityComponent.cardStateManager();
        doSetContentView();
        View findViewById = findViewById(sqip.cardentry.R.id.card_entry_layout);
        findViewById.getClass();
        View findViewById2 = findViewById(sqip.cardentry.R.id.sqip_status_bar);
        findViewById2.getClass();
        UtilsKt.applySafeToDrawInsets(findViewById, findViewById2);
        bindViews();
        TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.activityCloseEnterAnimation, android.R.attr.activityCloseExitAnimation}, android.R.attr.windowAnimationStyle, 0);
        this.finishEnterResId = obtainStyledAttributes.getResourceId(0, 0);
        this.finishExitResId = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = getTheme().obtainStyledAttributes(new int[]{android.R.attr.colorAccent, R.attr.sqipSaveButtonText, R.attr.sqipActivityTitle});
        this.spinnerColor = obtainStyledAttributes2.getColor(0, getColor(R.color.sqip_default_grey));
        Context withLocale = withLocale(this, getBuyerLocale());
        TextView textView = this.saveButton;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveButton");
            throw null;
        }
        textView.setText(withLocale.getString(obtainStyledAttributes2.getResourceId(1, sqip.cardentry.R.string.sqip_card_entry_save_button_text)));
        setTitle(withLocale.getString(obtainStyledAttributes2.getResourceId(2, sqip.cardentry.R.string.sqip_action_bar_header)));
        obtainStyledAttributes2.recycle();
        setSupportActionBar((Toolbar) findViewById(sqip.cardentry.R.id.sqip_toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowHomeEnabled();
        }
        CharSequence title = getTitle();
        title.getClass();
        setTitle(DebugUtilsKt.maybePrependTitle(title));
        ConstraintSet constraintSet = new ConstraintSet();
        this.bigCardVerticalConstraint = constraintSet;
        constraintSet.clone(this, sqip.cardentry.R.layout.sqip_activity_card_entry);
        ConstraintSet constraintSet2 = new ConstraintSet();
        this.smallCardConstraint = constraintSet2;
        constraintSet2.clone(this, sqip.cardentry.R.layout.sqip_activity_card_entry_small_card_constraints);
        ConstraintSet constraintSet3 = new ConstraintSet();
        this.bigCardHorizontalConstraint = constraintSet3;
        constraintSet3.clone(this, sqip.cardentry.R.layout.sqip_activity_card_entry_horizontal_card_constraints);
        HelperTextSwitcher helperTextSwitcher = (HelperTextSwitcher) findViewById(sqip.cardentry.R.id.helper_text_switcher);
        View findViewById3 = findViewById(sqip.cardentry.R.id.card_image);
        findViewById3.getClass();
        this.cardImage = (CardImage) findViewById3;
        setHelperTextTopMargin(getResources().getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_helper_text_margin_top));
        setHelperTextSmallCardTopMargin(getResources().getDimensionPixelSize(sqip.cardentry.R.dimen.sqip_helper_text_small_card_margin_top));
        GenericCardEditor genericCardEditor = this.cardEditor;
        if (genericCardEditor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
            throw null;
        }
        genericCardEditor.setStateChangedCallback(new Function1<CardEditorState, Unit>() { // from class: sqip.internal.BaseCardEntryActivity$onCreate$4
            {
                super(1);
            }

            public final void invoke(CardEditorState cardEditorState2) {
                CardEntryStateManager cardEntryStateManager;
                cardEditorState2.getClass();
                cardEntryStateManager = BaseCardEntryActivity.this.stateManager;
                if (cardEntryStateManager != null) {
                    cardEntryStateManager.updateState(cardEditorState2);
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("stateManager");
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CardEditorState) obj);
                return Unit.INSTANCE;
            }
        });
        CardImage cardImage = this.cardImage;
        if (cardImage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImage");
            throw null;
        }
        CardImagePresenter cardImagePresenter = new CardImagePresenter(cardImage);
        this.cardImagePresenter = cardImagePresenter;
        CardImage cardImage2 = this.cardImage;
        if (cardImage2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImage");
            throw null;
        }
        cardImage2.setPresenter(cardImagePresenter);
        GenericCardEditor genericCardEditor2 = this.cardEditor;
        if (genericCardEditor2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
            throw null;
        }
        this.helperTextPresenter = new HelperTextSwitcherPresenter(helperTextSwitcher, genericCardEditor2);
        CardEntryStateManager cardEntryStateManager = this.stateManager;
        if (cardEntryStateManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateManager");
            throw null;
        }
        cardEntryStateManager.addStateChangedListener(this.internalStateListener);
        CardEntryStateManager cardEntryStateManager2 = this.stateManager;
        if (cardEntryStateManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateManager");
            throw null;
        }
        CardImagePresenter cardImagePresenter2 = this.cardImagePresenter;
        if (cardImagePresenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
            throw null;
        }
        cardEntryStateManager2.addStateChangedListener(cardImagePresenter2);
        CardEntryStateManager cardEntryStateManager3 = this.stateManager;
        if (cardEntryStateManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateManager");
            throw null;
        }
        CardEntryActivityController cardEntryActivityController = this.activityController;
        if (cardEntryActivityController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityController");
            throw null;
        }
        cardEntryStateManager3.addStateChangedListener(cardEntryActivityController);
        CardEntryStateManager cardEntryStateManager4 = this.stateManager;
        if (cardEntryStateManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateManager");
            throw null;
        }
        HelperTextSwitcherPresenter helperTextSwitcherPresenter = this.helperTextPresenter;
        if (helperTextSwitcherPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperTextPresenter");
            throw null;
        }
        cardEntryStateManager4.addStateChangedListener(helperTextSwitcherPresenter);
        HelperTextSwitcherPresenter helperTextSwitcherPresenter2 = this.helperTextPresenter;
        if (helperTextSwitcherPresenter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperTextPresenter");
            throw null;
        }
        helperTextSwitcherPresenter2.init(getCardEditorState());
        CardImagePresenter cardImagePresenter3 = this.cardImagePresenter;
        if (cardImagePresenter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
            throw null;
        }
        cardImagePresenter3.init(getCardEditorState());
        GenericCardEditor genericCardEditor3 = this.cardEditor;
        if (genericCardEditor3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
            throw null;
        }
        genericCardEditor3.init(getCardEditorState());
        CardEntryStateManager cardEntryStateManager5 = this.stateManager;
        if (cardEntryStateManager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateManager");
            throw null;
        }
        cardEntryStateManager5.init(getCardEditorState());
        GenericCardEditor genericCardEditor4 = this.cardEditor;
        if (genericCardEditor4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
            throw null;
        }
        genericCardEditor4.showInvisibleCard(this.currentLayoutMode == LayoutMode.SMALL_CARD);
        TextView textView2 = this.saveButton;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveButton");
            throw null;
        }
        textView2.setOnClickListener(new BaseCardEntryActivity$$ExternalSyntheticLambda1(this, i));
        GenericCardEditor genericCardEditor5 = this.cardEditor;
        if (genericCardEditor5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
            throw null;
        }
        genericCardEditor5.setOnSubmitFunction(new Function0<Unit>() { // from class: sqip.internal.BaseCardEntryActivity$onCreate$6
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m4378invoke() {
                TextView textView3;
                CardEntryActivityController cardEntryActivityController2;
                GenericCardEditor genericCardEditor6;
                textView3 = BaseCardEntryActivity.this.saveButton;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("saveButton");
                    throw null;
                }
                if (textView3.isEnabled()) {
                    cardEntryActivityController2 = BaseCardEntryActivity.this.activityController;
                    if (cardEntryActivityController2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityController");
                        throw null;
                    }
                    genericCardEditor6 = BaseCardEntryActivity.this.cardEditor;
                    if (genericCardEditor6 != null) {
                        cardEntryActivityController2.submitCardData(genericCardEditor6, BaseCardEntryActivity.this.getCardEditorState().getCollectOnlyGiftCard());
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
                        throw null;
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4378invoke();
                return Unit.INSTANCE;
            }
        });
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.spinnerColor, PorterDuff.Mode.SRC_IN);
        ProgressBar progressBar = this.progressSpinner;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressSpinner");
            throw null;
        }
        progressBar.getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        ProgressBar progressBar2 = this.progressSpinner;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressSpinner");
            throw null;
        }
        Drawable indeterminateDrawable = progressBar2.getIndeterminateDrawable();
        indeterminateDrawable.getClass();
        TransitionDrawable transitionDrawable = (TransitionDrawable) indeterminateDrawable;
        transitionDrawable.setCrossFadeEnabled(true);
        this.spinnerIndeterminateTransition = transitionDrawable;
        ProgressBar progressBar3 = this.progressSpinner;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressSpinner");
            throw null;
        }
        Drawable background = progressBar3.getBackground();
        background.getClass();
        TransitionDrawable transitionDrawable2 = (TransitionDrawable) background;
        transitionDrawable2.setCrossFadeEnabled(true);
        this.spinnerBackgroundTransition = transitionDrawable2;
        Drawable drawable = transitionDrawable2.getDrawable(1);
        drawable.setColorFilter(porterDuffColorFilter);
        this.check = drawable;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        View findViewById4 = decorView.findViewById(android.R.id.content);
        findViewById4.getClass();
        this.contentView = (ViewGroup) findViewById4;
        CardEntryActivityController cardEntryActivityController2 = this.activityController;
        if (cardEntryActivityController2 != null) {
            cardEntryActivityController2.onActivityCreated(this, savedInstanceState);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activityController");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CardEntryStateManager cardEntryStateManager = this.stateManager;
        if (cardEntryStateManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateManager");
            throw null;
        }
        cardEntryStateManager.clearListeners();
        HelperTextSwitcherPresenter helperTextSwitcherPresenter = this.helperTextPresenter;
        if (helperTextSwitcherPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helperTextPresenter");
            throw null;
        }
        helperTextSwitcherPresenter.onDestory();
        CardImagePresenter cardImagePresenter = this.cardImagePresenter;
        if (cardImagePresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImagePresenter");
            throw null;
        }
        cardImagePresenter.onDestory();
        CardEntryActivityController cardEntryActivityController = this.activityController;
        if (cardEntryActivityController != null) {
            cardEntryActivityController.onActivityDestroyed(this);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activityController");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getWindow().getDecorView().getViewTreeObserver().removeOnPreDrawListener(this.layoutChangeListener);
        CardEntryActivityController cardEntryActivityController = this.activityController;
        if (cardEntryActivityController != null) {
            cardEntryActivityController.onCancel();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activityController");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().getDecorView().getViewTreeObserver().addOnPreDrawListener(this.layoutChangeListener);
    }

    @Override // androidx.activity.ComponentActivity
    public Object onRetainCustomNonConfigurationInstance() {
        CardEntryActivityComponent cardEntryActivityComponent = this.cardEntryActivityComponent;
        if (cardEntryActivityComponent != null) {
            return cardEntryActivityComponent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardEntryActivityComponent");
        throw null;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        outState.getClass();
        super.onSaveInstanceState(outState);
        outState.putParcelable(CARD_EDITOR_STATE_KEY, getCardEditorState());
        outState.putString(APPLICATION_ID_KEY, InAppPaymentsSdk.getSquareApplicationId());
        CardEntryActivityController cardEntryActivityController = this.activityController;
        if (cardEntryActivityController != null) {
            cardEntryActivityController.onSaveInstanceState(outState);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("activityController");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        CardEntryActivityController cardEntryActivityController = this.activityController;
        if (cardEntryActivityController != null) {
            cardEntryActivityController.onCancel();
            return true;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activityController");
        throw null;
    }

    public final void setCardEditorState(CardEditorState cardEditorState) {
        cardEditorState.getClass();
        this.cardEditorState = cardEditorState;
    }

    public final void setCardEntryLayout(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        this.cardEntryLayout = constraintLayout;
    }

    public final void setManualCardEntryTimedOut(boolean z) {
        this.isManualCardEntryTimedOut = z;
    }

    public final void startCheck() {
        TransitionDrawable transitionDrawable = this.spinnerBackgroundTransition;
        if (transitionDrawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spinnerBackgroundTransition");
            throw null;
        }
        transitionDrawable.startTransition(50);
        TransitionDrawable transitionDrawable2 = this.spinnerIndeterminateTransition;
        if (transitionDrawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("spinnerIndeterminateTransition");
            throw null;
        }
        transitionDrawable2.startTransition(150);
        Drawable drawable = this.check;
        if (drawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("check");
            throw null;
        }
        if (drawable instanceof AnimatedVectorDrawable) {
            if (drawable != null) {
                ((AnimatedVectorDrawable) drawable).start();
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("check");
                throw null;
            }
        }
    }

    public final void updateUiState(boolean showProgress, boolean enableSaveButton, boolean showCardEditor) {
        CardEditorState copy;
        CardEntryStateManager cardEntryStateManager = this.stateManager;
        if (cardEntryStateManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stateManager");
            throw null;
        }
        copy = r4.copy((r32 & 1) != 0 ? r4.focusedField : null, (r32 & 2) != 0 ? r4.cardNumber : null, (r32 & 4) != 0 ? r4.expirationDate : null, (r32 & 8) != 0 ? r4.cvv : null, (r32 & 16) != 0 ? r4.postal : null, (r32 & 32) != 0 ? r4.brand : null, (r32 & 64) != 0 ? r4.cardNumberCompletionStatus : null, (r32 & 128) != 0 ? r4.expirationCompletionStatus : null, (r32 & 256) != 0 ? r4.cvvCompletionStatus : null, (r32 & 512) != 0 ? r4.postalCompletionStatus : null, (r32 & 1024) != 0 ? r4.cardNumberCursorPosition : 0, (r32 & 2048) != 0 ? r4.collectPostalCode : false, (r32 & 4096) != 0 ? r4.isProcessingRequest : showProgress, (r32 & PKIFailureInfo.certRevoked) != 0 ? r4.collectOnlyGiftCard : false, (r32 & 16384) != 0 ? getCardEditorState().isMasked : false);
        cardEntryStateManager.updateState(copy);
        GenericCardEditor genericCardEditor = this.cardEditor;
        if (genericCardEditor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardEditor");
            throw null;
        }
        genericCardEditor.setVisibility(showCardEditor);
        CardImage cardImage = this.cardImage;
        if (cardImage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardImage");
            throw null;
        }
        cardImage.setVisibility((showCardEditor || this.currentLayoutMode != LayoutMode.SMALL_CARD) ? 0 : 8);
        ProgressBar progressBar = this.progressSpinner;
        if (progressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressSpinner");
            throw null;
        }
        progressBar.setVisibility(showProgress ? 0 : 8);
        TextView textView = this.saveButton;
        if (textView != null) {
            textView.setEnabled(enableSaveButton);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("saveButton");
            throw null;
        }
    }
}
