package sqip.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import sqip.internal.contracts.HelperTextContract;
import sqip.internal.presenters.CardImagePresenter;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\"\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lsqip/internal/HelperTextSwitcher;", "Landroid/widget/TextSwitcher;", "Lsqip/internal/contracts/HelperTextContract$View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "errorColor", "", "announce", "", "resourceId", "displayCardNumberErrorText", "labelFor", "Landroid/view/View;", "displayEnterCardNumberText", "displayEnterExpirationText", "displayEnterFourDigitCvvText", "displayEnterGiftCardNumberText", "displayEnterPostalText", "displayEnterThreeDigitCvvText", "displayExpDateErrorText", "displayFormValidText", "displayProcessingRequestText", "setNewText", "text", "", "isError", "", "Companion", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HelperTextSwitcher extends TextSwitcher implements HelperTextContract.View {
    public static final long TEXT_FADE_MS = 200;
    private final int errorColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelperTextSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        setInAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
        getInAnimation().setDuration(200L);
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
        getOutAnimation().setDuration(200L);
        setFactory(new ViewSwitcher.ViewFactory() { // from class: sqip.internal.HelperTextSwitcher$$ExternalSyntheticLambda0
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                View _init_$lambda$1;
                _init_$lambda$1 = HelperTextSwitcher._init_$lambda$1(HelperTextSwitcher.this);
                return _init_$lambda$1;
            }
        });
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.sqipErrorColor});
        obtainStyledAttributes.getClass();
        this.errorColor = obtainStyledAttributes.getColor(0, getContext().getColor(R.color.sqip_error_color_red));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View _init_$lambda$1(HelperTextSwitcher helperTextSwitcher) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(helperTextSwitcher.getContext());
        appCompatTextView.setGravity(1);
        return appCompatTextView;
    }

    private final void announce(int resourceId) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService(AccessibilityManager.class);
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(getContext().getString(resourceId));
        obtain.setClassName("android.content.Context");
        obtain.setPackageName(getContext().getPackageName());
        if (accessibilityManager != null) {
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    private final void setNewText(String text, boolean isError, View labelFor) {
        View nextView = getNextView();
        nextView.getClass();
        TextView textView = (TextView) nextView;
        if (isError) {
            textView.setTextColor(this.errorColor);
        } else {
            textView.setTextColor(textView.getHintTextColors());
        }
        textView.setLabelFor(labelFor != null ? labelFor.getId() : 0);
        setText(text);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayCardNumberErrorText(View labelFor) {
        labelFor.getClass();
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_error_text_card);
        string2.getClass();
        setNewText(string2, true, labelFor);
        announce(sqip.cardentry.R.string.sqip_announce_card_number_error);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayEnterCardNumberText(View labelFor) {
        labelFor.getClass();
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_helper_text_card);
        string2.getClass();
        setNewText(string2, false, labelFor);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayEnterExpirationText(View labelFor) {
        labelFor.getClass();
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_helper_text_expiration);
        string2.getClass();
        setNewText(string2, false, labelFor);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayEnterFourDigitCvvText(View labelFor) {
        labelFor.getClass();
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_helper_text_cvv_amex);
        string2.getClass();
        setNewText(string2, false, labelFor);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayEnterGiftCardNumberText(View labelFor) {
        labelFor.getClass();
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_helper_text_gift_card);
        string2.getClass();
        setNewText(string2, false, labelFor);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayEnterPostalText(View labelFor) {
        labelFor.getClass();
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_helper_text_postal);
        string2.getClass();
        setNewText(string2, false, labelFor);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayEnterThreeDigitCvvText(View labelFor) {
        labelFor.getClass();
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_helper_text_cvv);
        string2.getClass();
        setNewText(string2, false, labelFor);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayExpDateErrorText(View labelFor) {
        labelFor.getClass();
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_expiration_error_text_card);
        string2.getClass();
        setNewText(string2, true, labelFor);
        announce(sqip.cardentry.R.string.sqip_announce_expiration_error);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayFormValidText() {
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_helper_text_submit);
        string2.getClass();
        setNewText(string2, false, null);
        announce(sqip.cardentry.R.string.sqip_announce_ready_to_submit);
    }

    @Override // sqip.internal.contracts.HelperTextContract.View
    public void displayProcessingRequestText() {
        String string2 = getResources().getString(sqip.cardentry.R.string.sqip_helper_text_processing);
        string2.getClass();
        setNewText(string2, false, null);
        announce(sqip.cardentry.R.string.sqip_helper_text_processing);
    }

    @Override // sqip.internal.BaseView
    public void setPresenter(CardImagePresenter cardImagePresenter) {
        HelperTextContract.View.DefaultImpls.setPresenter(this, cardImagePresenter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelperTextSwitcher(Context context) {
        super(context);
        context.getClass();
        setInAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
        getInAnimation().setDuration(200L);
        setOutAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
        getOutAnimation().setDuration(200L);
        setFactory(new ViewSwitcher.ViewFactory() { // from class: sqip.internal.HelperTextSwitcher$$ExternalSyntheticLambda0
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                View _init_$lambda$1;
                _init_$lambda$1 = HelperTextSwitcher._init_$lambda$1(HelperTextSwitcher.this);
                return _init_$lambda$1;
            }
        });
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.sqipErrorColor});
        obtainStyledAttributes.getClass();
        this.errorColor = obtainStyledAttributes.getColor(0, getContext().getColor(R.color.sqip_error_color_red));
    }
}
