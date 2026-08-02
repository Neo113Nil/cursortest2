package com.stripe.android.uicore.elements;

/* loaded from: classes8.dex */
public interface TextFieldState {
    FieldValidationMessage$Error getValidationMessage();

    boolean isFull();

    boolean isValid();

    boolean shouldShowValidationMessage(boolean z, boolean z2);
}
