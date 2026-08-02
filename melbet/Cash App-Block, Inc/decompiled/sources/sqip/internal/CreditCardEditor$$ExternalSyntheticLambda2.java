package sqip.internal;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final /* synthetic */ class CreditCardEditor$$ExternalSyntheticLambda2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CreditCardEditor f$0;

    public /* synthetic */ CreditCardEditor$$ExternalSyntheticLambda2(CreditCardEditor creditCardEditor, int i) {
        this.$r8$classId = i;
        this.f$0 = creditCardEditor;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean onAttachedToWindow$lambda$0;
        boolean upPostalField$lambda$5;
        int i2 = this.$r8$classId;
        CreditCardEditor creditCardEditor = this.f$0;
        switch (i2) {
            case 0:
                onAttachedToWindow$lambda$0 = CreditCardEditor.onAttachedToWindow$lambda$0(creditCardEditor, textView, i, keyEvent);
                return onAttachedToWindow$lambda$0;
            default:
                upPostalField$lambda$5 = CreditCardEditor.setUpPostalField$lambda$5(creditCardEditor, textView, i, keyEvent);
                return upPostalField$lambda$5;
        }
    }
}
