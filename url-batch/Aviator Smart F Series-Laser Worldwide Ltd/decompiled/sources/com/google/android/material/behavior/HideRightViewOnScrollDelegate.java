package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
final class HideRightViewOnScrollDelegate extends HideViewOnScrollDelegate {
    HideRightViewOnScrollDelegate() {
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    <V extends View> int getSize(@NonNull V v7, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return v7.getMeasuredWidth() + marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    int getTargetTranslation() {
        return 0;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    int getViewEdge() {
        return 0;
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    <V extends View> ViewPropertyAnimator getViewTranslationAnimator(@NonNull V v7, int i8) {
        return v7.animate().translationX(i8);
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    <V extends View> void setAdditionalHiddenOffset(@NonNull V v7, int i8, int i9) {
        v7.setTranslationX(i8 + i9);
    }

    @Override // com.google.android.material.behavior.HideViewOnScrollDelegate
    <V extends View> void setViewTranslation(@NonNull V v7, int i8) {
        v7.setTranslationX(i8);
    }
}
