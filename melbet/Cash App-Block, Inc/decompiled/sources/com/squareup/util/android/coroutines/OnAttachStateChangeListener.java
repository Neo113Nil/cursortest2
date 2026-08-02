package com.squareup.util.android.coroutines;

import android.view.View;

/* loaded from: classes8.dex */
public interface OnAttachStateChangeListener extends View.OnAttachStateChangeListener {
    void onAttached();

    void onDetached();

    @Override // android.view.View.OnAttachStateChangeListener
    default void onViewAttachedToWindow(View view) {
        view.getClass();
        onAttached();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    default void onViewDetachedFromWindow(View view) {
        view.getClass();
        onDetached();
    }
}
