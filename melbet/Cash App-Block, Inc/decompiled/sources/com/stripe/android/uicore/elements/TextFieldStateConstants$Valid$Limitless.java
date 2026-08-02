package com.stripe.android.uicore.elements;

/* loaded from: classes8.dex */
public final class TextFieldStateConstants$Valid$Limitless implements TextFieldState {
    public static final TextFieldStateConstants$Valid$Limitless INSTANCE = new TextFieldStateConstants$Valid$Limitless();

    @Override // com.stripe.android.uicore.elements.TextFieldState
    public final FieldValidationMessage$Error getValidationMessage() {
        return null;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldState
    public final boolean isFull() {
        return false;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldState
    public final boolean isValid() {
        return true;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldState
    public final boolean shouldShowValidationMessage(boolean z, boolean z2) {
        return false;
    }
}
