package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
abstract class EndIconDelegate {
    Context context;
    final int customEndIcon;
    CheckableImageButton endIconView;
    TextInputLayout textInputLayout;

    EndIconDelegate(TextInputLayout textInputLayout, int i4) {
        this.textInputLayout = textInputLayout;
        this.context = textInputLayout.getContext();
        this.endIconView = textInputLayout.getEndIconView();
        this.customEndIcon = i4;
    }

    abstract void initialize();

    boolean isBoxBackgroundModeSupported(int i4) {
        return true;
    }

    void onSuffixVisibilityChanged(boolean z4) {
    }

    boolean shouldTintIconOnError() {
        return false;
    }
}
