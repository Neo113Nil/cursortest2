package com.cmplay.base.util.webview.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ViewAnimator;

/* loaded from: classes.dex */
public class MsgBoxViewAnimator extends ViewAnimator {
    public MsgBoxViewAnimator(Context context) {
        this(context, null);
    }

    public MsgBoxViewAnimator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void onDetachInFragment() {
        onDetachedFromWindow();
    }
}
