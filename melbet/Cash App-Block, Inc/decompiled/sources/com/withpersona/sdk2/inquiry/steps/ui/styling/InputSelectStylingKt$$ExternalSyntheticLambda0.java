package com.withpersona.sdk2.inquiry.steps.ui.styling;

import com.google.android.material.textfield.TextInputLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class InputSelectStylingKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextInputLayout f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ InputSelectStylingKt$$ExternalSyntheticLambda0(TextInputLayout textInputLayout, int i, int i2, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$0 = textInputLayout;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        int i3 = this.f$2;
        int i4 = this.f$1;
        TextInputLayout textInputLayout = this.f$0;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                CharSequence error = textInputLayout.getError();
                if (error == null || !StringsKt___StringsKt.any(error)) {
                    TextInputLayoutStylingKt.setBackgroundStateColors(textInputLayout, booleanValue, i4, i3, i2);
                }
                break;
            default:
                CharSequence error2 = textInputLayout.getError();
                if (error2 == null || !StringsKt___StringsKt.any(error2)) {
                    TextInputLayoutStylingKt.setBackgroundStateColors(textInputLayout, booleanValue, i4, i3, i2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
