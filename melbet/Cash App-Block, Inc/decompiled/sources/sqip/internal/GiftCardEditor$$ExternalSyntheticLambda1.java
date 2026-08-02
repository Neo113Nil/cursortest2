package sqip.internal;

import android.view.KeyEvent;
import android.widget.TextView;
import app.cash.broadway.ui.Ui;
import com.miteksystems.misnap.workflow.fragment.NfcMrz1LineManualEntryFragment;
import com.squareup.cash.mooncake.components.MooncakeCheckbox;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.cash.security.views.PasswordEntryView;
import com.squareup.cash.security.views.databinding.SecurityViewPasswordEntryBinding;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class GiftCardEditor$$ExternalSyntheticLambda1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ GiftCardEditor$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean onAttachedToWindow$lambda$0;
        CharSequence text;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                onAttachedToWindow$lambda$0 = GiftCardEditor.onAttachedToWindow$lambda$0((GiftCardEditor) obj, textView, i, keyEvent);
                return onAttachedToWindow$lambda$0;
            case 1:
                NfcMrz1LineManualEntryFragment nfcMrz1LineManualEntryFragment = (NfcMrz1LineManualEntryFragment) obj;
                NfcMrz1LineManualEntryFragment.Companion companion = NfcMrz1LineManualEntryFragment.Companion;
                if ((keyEvent != null && 66 == keyEvent.getKeyCode()) || 6 == i) {
                    nfcMrz1LineManualEntryFragment.getBinding$workflow_release().g.callOnClick();
                }
                return true;
            default:
                PasswordEntryView passwordEntryView = (PasswordEntryView) obj;
                SecurityViewPasswordEntryBinding securityViewPasswordEntryBinding = passwordEntryView.binding;
                int i3 = PasswordEntryView.$r8$clinit;
                if (i != 2 || (text = textView.getText()) == null || text.length() <= 0) {
                    return false;
                }
                Ui.EventReceiver eventReceiver = passwordEntryView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(new PasswordEntryViewEvent.ActionButtonClick(((MooncakeCheckbox) securityViewPasswordEntryBinding.securityViewBiometricsCheckbox).isChecked(), new PasswordEntryViewEvent.ActionButtonClick.PasswordSubmitData(null, String.valueOf(((MooncakeEditText) securityViewPasswordEntryBinding.securityViewPasswordEditText).getText()), 1)));
                    return true;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
        }
    }
}
