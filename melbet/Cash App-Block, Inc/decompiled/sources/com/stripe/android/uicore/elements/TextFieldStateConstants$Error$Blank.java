package com.stripe.android.uicore.elements;

import com.squareup.cash.R;

/* loaded from: classes8.dex */
public final class TextFieldStateConstants$Error$Blank implements TextFieldState {
    public static final TextFieldStateConstants$Error$Blank INSTANCE = new TextFieldStateConstants$Error$Blank(new FieldValidationMessage$Error(R.string.stripe_blank_and_required), 0);
    public final /* synthetic */ int $r8$classId;
    public final FieldValidationMessage$Error validationMessage;

    public TextFieldStateConstants$Error$Blank(FieldValidationMessage$Error fieldValidationMessage$Error, int i) {
        this.$r8$classId = i;
        this.validationMessage = fieldValidationMessage$Error;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldState
    public final FieldValidationMessage$Error getValidationMessage() {
        return this.validationMessage;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldState
    public boolean isFull() {
        switch (this.$r8$classId) {
        }
        return false;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldState
    public final boolean isValid() {
        return false;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldState
    public final boolean shouldShowValidationMessage(boolean z, boolean z2) {
        switch (this.$r8$classId) {
            case 0:
                return z2;
            case 1:
                return !z || z2;
            default:
                return true;
        }
    }
}
