package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
abstract class HideViewOnScrollDelegate {
    HideViewOnScrollDelegate() {
    }

    abstract <V extends View> int getSize(@NonNull V v7, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams);

    abstract int getTargetTranslation();

    abstract int getViewEdge();

    abstract <V extends View> ViewPropertyAnimator getViewTranslationAnimator(@NonNull V v7, int i8);

    abstract <V extends View> void setAdditionalHiddenOffset(@NonNull V v7, int i8, int i9);

    abstract <V extends View> void setViewTranslation(@NonNull V v7, int i8);
}
