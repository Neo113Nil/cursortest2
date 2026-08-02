package com.withpersona.sdk2.inquiry.steps.ui.styling;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes9.dex */
public final /* synthetic */ class InputSelectStylingKt$$ExternalSyntheticLambda1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextInputLayout f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ InputSelectStylingKt$$ExternalSyntheticLambda1(TextInputLayout textInputLayout, int i, int i2, int i3, int i4, int i5) {
        this.$r8$classId = i5;
        this.f$0 = textInputLayout;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = i4;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.$r8$classId;
        int i10 = this.f$4;
        int i11 = this.f$3;
        int i12 = this.f$2;
        int i13 = this.f$1;
        TextInputLayout textInputLayout = this.f$0;
        switch (i9) {
            case 0:
                CharSequence error = textInputLayout.getError();
                if (error != null && StringsKt___StringsKt.any(error)) {
                    textInputLayout.setBoxBackgroundColor(i13);
                    break;
                } else {
                    TextInputLayoutStylingKt.setBackgroundStateColors(textInputLayout, textInputLayout.hasFocus(), i12, i11, i10);
                    break;
                }
            default:
                CharSequence error2 = textInputLayout.getError();
                if (error2 != null && StringsKt___StringsKt.any(error2)) {
                    textInputLayout.setBoxBackgroundColor(i13);
                    break;
                } else {
                    TextInputLayoutStylingKt.setBackgroundStateColors(textInputLayout, textInputLayout.hasFocus(), i12, i11, i10);
                    break;
                }
                break;
        }
    }
}
