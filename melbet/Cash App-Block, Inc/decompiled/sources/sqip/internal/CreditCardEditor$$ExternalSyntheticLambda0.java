package sqip.internal;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final /* synthetic */ class CreditCardEditor$$ExternalSyntheticLambda0 implements View.OnFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ CreditCardEditor$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, final boolean z) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                CreditCardEditor.onHasFocus$lambda$3((Function0) obj2, (View.OnFocusChangeListener) obj, view, z);
                break;
            case 1:
                final Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                final int i2 = 0;
                ((TextInputLayout) obj2).post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        boolean z2 = z;
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        switch (i3) {
                            case 0:
                                Function1 function1 = (Function1) ref$ObjectRef2.element;
                                if (function1 != null) {
                                    function1.invoke(Boolean.valueOf(z2));
                                    break;
                                }
                                break;
                            default:
                                Function1 function12 = (Function1) ref$ObjectRef2.element;
                                if (function12 != null) {
                                    function12.invoke(Boolean.valueOf(z2));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj;
                final int i3 = 1;
                ((TextInputLayout) obj2).post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.InputSelectStylingKt$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        boolean z2 = z;
                        Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef2;
                        switch (i32) {
                            case 0:
                                Function1 function1 = (Function1) ref$ObjectRef22.element;
                                if (function1 != null) {
                                    function1.invoke(Boolean.valueOf(z2));
                                    break;
                                }
                                break;
                            default:
                                Function1 function12 = (Function1) ref$ObjectRef22.element;
                                if (function12 != null) {
                                    function12.invoke(Boolean.valueOf(z2));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
