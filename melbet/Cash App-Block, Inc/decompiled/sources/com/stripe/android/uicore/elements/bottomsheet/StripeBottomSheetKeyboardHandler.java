package com.stripe.android.uicore.elements.bottomsheet;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;

/* loaded from: classes8.dex */
public final class StripeBottomSheetKeyboardHandler {
    public final MutableState isKeyboardVisible;
    public final DelegatingSoftwareKeyboardController keyboardController;

    public StripeBottomSheetKeyboardHandler(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, MutableState mutableState) {
        this.keyboardController = delegatingSoftwareKeyboardController;
        this.isKeyboardVisible = mutableState;
    }
}
