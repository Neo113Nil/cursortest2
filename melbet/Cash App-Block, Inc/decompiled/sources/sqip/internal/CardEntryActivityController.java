package sqip.internal;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import com.squareup.Card$Brand;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import sqip.CardEntry;
import sqip.CardEntryActivityCommand;
import sqip.CardNonceBackgroundHandler;
import sqip.internal.CardEntryResult;
import sqip.internal.StateListener;
import sqip.internal.event.EventLogger;
import sqip.internal.event.EventModule$$ExternalSyntheticLambda0;
import sqip.internal.event.IapEvent;
import sqip.internal.nonce.CreateCardNonceRequestHandler;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0006H&J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.H\u0004J\u0018\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u000102J\u000e\u00103\u001a\u00020%2\u0006\u00100\u001a\u00020\u0004J\u0006\u00104\u001a\u00020%J\u001c\u00105\u001a\u00020%2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001e07H\u0004J\u0010\u00109\u001a\u00020%2\u0006\u0010-\u001a\u000208H\u0002J\u0010\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020<H\u0016J\u000e\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u000202J\u0016\u0010?\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0006J\b\u0010@\u001a\u00020%H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006A"}, d2 = {"Lsqip/internal/CardEntryActivityController;", "Lsqip/internal/StateListener;", "()V", "activity", "Lsqip/internal/BaseCardEntryActivity;", "asyncWorkInProgress", "", "cardNonceRequestHandler", "Lsqip/internal/nonce/CreateCardNonceRequestHandler;", "getCardNonceRequestHandler", "()Lsqip/internal/nonce/CreateCardNonceRequestHandler;", "cardValid", "eventLogger", "Lsqip/internal/event/EventLogger;", "getEventLogger", "()Lsqip/internal/event/EventLogger;", "extraWorkExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "finishing", "finishingWithSuccess", "isShowingCardEditor", "mainHandler", "Landroid/os/Handler;", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "canSubmitForm", "computeCustomThemeAttributes", "", "Landroid/app/Activity;", "differentTypedValues", "baseTypedValue", "Landroid/util/TypedValue;", "themeTypedValue", "displayError", "", "message", "", "doSubmitCardData", "cardEditor", "Lsqip/internal/ReadableCardEditor;", "isGiftCard", "finishWithSuccess", "cardEntryResult", "Lsqip/internal/CardEntryResult;", "onActivityCreated", "cardEntryActivity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onCancel", "onCardNonceResult", "result", "Lsqip/internal/Result;", "Lsqip/internal/CardEntryResult$CardAndNonceResult;", "onCardNonceSuccess", "onCompletionStatusChanged", "newState", "Lsqip/internal/CardEditorState;", "onSaveInstanceState", "outState", "submitCardData", "updateUiState", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CardEntryActivityController implements StateListener {
    private BaseCardEntryActivity activity;
    private boolean asyncWorkInProgress;
    private boolean cardValid;
    private boolean finishing;
    private boolean finishingWithSuccess;
    private boolean isShowingCardEditor = true;
    private final ExecutorService extraWorkExecutor = Executors.newSingleThreadExecutor(new EventModule$$ExternalSyntheticLambda0(3));
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    private final boolean canSubmitForm() {
        return (!this.cardValid || this.asyncWorkInProgress || this.finishing) ? false : true;
    }

    private final String computeCustomThemeAttributes(Activity activity) {
        Resources.Theme newTheme = activity.getResources().newTheme();
        newTheme.applyStyle(sqip.cardentry.R.style.sqip_Theme_BaseCardEntry, true);
        final int[] iArr = {android.R.attr.buttonStyle, android.R.attr.editTextStyle, android.R.attr.windowAnimationStyle, android.R.attr.actionBarStyle, android.R.attr.alertDialogStyle, android.R.attr.alertDialogTheme, R.attr.sqipSaveButtonText, R.attr.sqipActivityTitle, R.attr.sqipErrorColor, android.R.attr.colorAccent, android.R.attr.colorPrimary, android.R.attr.colorPrimaryDark, R.attr.sqipCustomParentTheme, android.R.attr.homeAsUpIndicator, android.R.attr.colorBackgroundCacheHint, android.R.attr.textColorHint, android.R.attr.windowActionBar, android.R.attr.windowIsTranslucent, android.R.attr.windowNoTitle, android.R.attr.windowBackground};
        TypedArray obtainStyledAttributes = newTheme.obtainStyledAttributes(iArr);
        obtainStyledAttributes.getClass();
        TypedArray obtainStyledAttributes2 = activity.getTheme().obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getClass();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        IntRange indices = ArraysKt___ArraysKt.getIndices(iArr);
        ArrayList arrayList = new ArrayList();
        IntProgressionIterator it = indices.iterator();
        while (it.hasNext) {
            Object next = it.next();
            int intValue = ((Number) next).intValue();
            obtainStyledAttributes.getValue(intValue, typedValue);
            obtainStyledAttributes2.getValue(intValue, typedValue2);
            if (differentTypedValues(typedValue, typedValue2)) {
                arrayList.add(next);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, new Function1<Integer, CharSequence>() { // from class: sqip.internal.CardEntryActivityController$computeCustomThemeAttributes$customThemeAttributes$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final CharSequence invoke(int i) {
                String resourceEntryName = CardEntryActivityController.this.getResources().getResourceEntryName(iArr[i]);
                resourceEntryName.getClass();
                return resourceEntryName;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, 31);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes2.recycle();
        return joinToString$default;
    }

    private final boolean differentTypedValues(TypedValue baseTypedValue, TypedValue themeTypedValue) {
        return (baseTypedValue.type == themeTypedValue.type && Intrinsics.areEqual(baseTypedValue.string, themeTypedValue.string) && baseTypedValue.data == themeTypedValue.data && baseTypedValue.assetCookie == themeTypedValue.assetCookie && baseTypedValue.resourceId == themeTypedValue.resourceId && baseTypedValue.density == themeTypedValue.density) ? false : true;
    }

    private final void displayError(CharSequence message) {
        this.isShowingCardEditor = true;
        this.asyncWorkInProgress = false;
        updateUiState();
        BaseCardEntryActivity baseCardEntryActivity = this.activity;
        if (baseCardEntryActivity != null) {
            String string2 = getResources().getString(sqip.cardentry.R.string.sqip_card_entry_error_title);
            string2.getClass();
            baseCardEntryActivity.displayError(string2, message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread extraWorkExecutor$lambda$0(Runnable runnable) {
        return new Thread(runnable, "CardResultHandler");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finishWithSuccess$lambda$3(CardEntryActivityController cardEntryActivityController, CardEntryResult cardEntryResult) {
        cardEntryActivityController.getEventLogger().log(IapEvent.CardEntry.Success.INSTANCE);
        BaseCardEntryActivity baseCardEntryActivity = cardEntryActivityController.activity;
        if (baseCardEntryActivity != null) {
            baseCardEntryActivity.finishWithSuccess(cardEntryResult);
        }
        cardEntryActivityController.getEventLogger().uploadLogs();
    }

    private final void onCardNonceSuccess(CardEntryResult.CardAndNonceResult cardEntryResult) {
        CardNonceBackgroundHandler cardNonceBackgroundHandler$card_entry_release = CardEntry.INSTANCE.getCardNonceBackgroundHandler$card_entry_release();
        if (cardNonceBackgroundHandler$card_entry_release == null) {
            finishWithSuccess(cardEntryResult);
        } else {
            getEventLogger().log(IapEvent.CardEntry.NonceBackgroundHandling.INSTANCE);
            this.extraWorkExecutor.execute(new CardEntryActivityController$$ExternalSyntheticLambda1(0, cardNonceBackgroundHandler$card_entry_release, cardEntryResult, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCardNonceSuccess$lambda$2(CardNonceBackgroundHandler cardNonceBackgroundHandler, CardEntryResult.CardAndNonceResult cardAndNonceResult, CardEntryActivityController cardEntryActivityController) {
        CardEntryActivityCommand handleEnteredCardInBackground = cardNonceBackgroundHandler.handleEnteredCardInBackground(cardAndNonceResult);
        BaseCardEntryActivity baseCardEntryActivity = cardEntryActivityController.activity;
        if (baseCardEntryActivity != null) {
            baseCardEntryActivity.runOnUiThread(new CardEntryActivityController$$ExternalSyntheticLambda1(cardEntryActivityController, handleEnteredCardInBackground, cardAndNonceResult));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCardNonceSuccess$lambda$2$lambda$1(CardEntryActivityController cardEntryActivityController, CardEntryActivityCommand cardEntryActivityCommand, CardEntryResult.CardAndNonceResult cardAndNonceResult) {
        if (cardEntryActivityController.finishing) {
            return;
        }
        if (cardEntryActivityCommand instanceof CardEntryActivityCommand.Finish) {
            cardEntryActivityController.finishWithSuccess(cardAndNonceResult);
        } else if (cardEntryActivityCommand instanceof CardEntryActivityCommand.ShowError) {
            CardEntryActivityCommand.ShowError showError = (CardEntryActivityCommand.ShowError) cardEntryActivityCommand;
            cardEntryActivityController.displayError(showError.getMessage());
            cardEntryActivityController.getEventLogger().log(new IapEvent.CardEntry.AppError(showError.getMessage().toString()));
        }
    }

    private final void updateUiState() {
        BaseCardEntryActivity baseCardEntryActivity = this.activity;
        if (baseCardEntryActivity != null) {
            baseCardEntryActivity.updateUiState(this.asyncWorkInProgress || this.finishingWithSuccess, canSubmitForm(), this.isShowingCardEditor);
        }
    }

    public abstract void doSubmitCardData(ReadableCardEditor cardEditor, boolean isGiftCard);

    public final void finishWithSuccess(CardEntryResult cardEntryResult) {
        cardEntryResult.getClass();
        this.asyncWorkInProgress = false;
        this.finishing = true;
        this.finishingWithSuccess = true;
        BaseCardEntryActivity baseCardEntryActivity = this.activity;
        if (baseCardEntryActivity != null) {
            baseCardEntryActivity.startCheck();
        }
        this.mainHandler.postDelayed(new r6$$ExternalSyntheticLambda0(20, this, cardEntryResult), 500L);
        updateUiState();
    }

    public abstract CreateCardNonceRequestHandler getCardNonceRequestHandler();

    public abstract EventLogger getEventLogger();

    public abstract Resources getResources();

    public final void onActivityCreated(BaseCardEntryActivity cardEntryActivity, Bundle savedInstanceState) {
        cardEntryActivity.getClass();
        getEventLogger().updateCustomThemeAttributes(computeCustomThemeAttributes(cardEntryActivity));
        if (savedInstanceState == null) {
            getEventLogger().log(IapEvent.CardEntry.Started.INSTANCE);
        } else {
            getEventLogger().onRestoreInstanceState(savedInstanceState);
        }
        this.activity = cardEntryActivity;
        if (this.finishingWithSuccess) {
            cardEntryActivity.jumpToCompletedCheck();
        }
        updateUiState();
    }

    public final void onActivityDestroyed(BaseCardEntryActivity cardEntryActivity) {
        cardEntryActivity.getClass();
        if (cardEntryActivity.isChangingConfigurations()) {
            getEventLogger().log(IapEvent.CardEntry.ConfigurationChange.INSTANCE);
        }
        if (Intrinsics.areEqual(this.activity, cardEntryActivity)) {
            this.activity = null;
        }
    }

    @Override // sqip.internal.StateListener
    public void onBrandChanged(Card$Brand card$Brand) {
        StateListener.DefaultImpls.onBrandChanged(this, card$Brand);
    }

    public final void onCancel() {
        this.finishing = true;
        this.asyncWorkInProgress = false;
        BaseCardEntryActivity baseCardEntryActivity = this.activity;
        if (baseCardEntryActivity != null) {
            baseCardEntryActivity.finishWithCancel();
        }
        getEventLogger().log(IapEvent.CardEntry.Cancel.INSTANCE);
        getEventLogger().uploadLogs();
        updateUiState();
    }

    public final void onCardNonceResult(Result<CardEntryResult.CardAndNonceResult, String> result) {
        result.getClass();
        if (this.finishing) {
            return;
        }
        if (result.isSuccess()) {
            onCardNonceSuccess(result.getSuccessValue());
        } else {
            displayError(result.getError());
        }
    }

    @Override // sqip.internal.StateListener
    public void onCompletionStatusChanged(CardEditorState newState) {
        newState.getClass();
        if (this.cardValid != newState.allFieldsValid()) {
            this.cardValid = newState.allFieldsValid();
            updateUiState();
        }
    }

    @Override // sqip.internal.StateListener
    public void onFocusChanged(CardEditorState cardEditorState) {
        StateListener.DefaultImpls.onFocusChanged(this, cardEditorState);
    }

    @Override // sqip.internal.StateListener
    public void onProcessingRequest(boolean z) {
        StateListener.DefaultImpls.onProcessingRequest(this, z);
    }

    public final void onSaveInstanceState(Bundle outState) {
        outState.getClass();
        getEventLogger().onSaveInstanceState(outState);
    }

    @Override // sqip.internal.StateListener
    public void onStateChanged(CardEditorState cardEditorState) {
        StateListener.DefaultImpls.onStateChanged(this, cardEditorState);
    }

    public final void submitCardData(ReadableCardEditor cardEditor, boolean isGiftCard) {
        cardEditor.getClass();
        if (canSubmitForm()) {
            getEventLogger().log(IapEvent.CardEntry.Submit.INSTANCE);
            BaseCardEntryActivity baseCardEntryActivity = this.activity;
            if (baseCardEntryActivity != null) {
                baseCardEntryActivity.hideKeyboard();
            }
            this.isShowingCardEditor = false;
            this.asyncWorkInProgress = true;
            doSubmitCardData(cardEditor, isGiftCard);
            updateUiState();
        }
    }
}
