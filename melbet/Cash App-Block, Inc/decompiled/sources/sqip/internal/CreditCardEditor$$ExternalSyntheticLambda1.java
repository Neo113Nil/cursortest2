package sqip.internal;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.squareup.scannerview.TextSetter;
import com.stripe.hcaptcha.HCaptchaDialogFragment;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import kotlin.jvm.functions.Function0;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public final /* synthetic */ class CreditCardEditor$$ExternalSyntheticLambda1 implements View.OnKeyListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CreditCardEditor$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean onBackspace$lambda$4;
        int i2 = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i2) {
            case 0:
                onBackspace$lambda$4 = CreditCardEditor.onBackspace$lambda$4((EditText) obj2, (Function0) obj, view, i, keyEvent);
                return onBackspace$lambda$4;
            case 1:
                HCaptchaDialogFragment hCaptchaDialogFragment = (HCaptchaDialogFragment) obj2;
                HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) obj;
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                if (!hCaptchaDialogFragment.readyForInteraction && !hCaptchaConfig.loading) {
                    return true;
                }
                TextSetter textSetter = hCaptchaDialogFragment.webViewHelper;
                if (textSetter != null) {
                    return textSetter.shouldRetry(new HCaptchaException(HCaptchaError.CHALLENGE_CLOSED));
                }
                return false;
            default:
                EditText editText = (EditText) obj2;
                Choreographers$$ExternalSyntheticLambda1 choreographers$$ExternalSyntheticLambda1 = (Choreographers$$ExternalSyntheticLambda1) obj;
                if (i != 67 || keyEvent.getAction() != 0) {
                    return false;
                }
                Editable text = editText.getText();
                text.getClass();
                if (text.length() != 0) {
                    return false;
                }
                choreographers$$ExternalSyntheticLambda1.invoke();
                return true;
        }
    }
}
