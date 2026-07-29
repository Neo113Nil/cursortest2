package com.dancingbogo.skyrolline.webview.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ViewAnimator;

/* compiled from: MsgBoxViewAnimator.java */
/* loaded from: classes2.dex */
public class b extends ViewAnimator {
    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
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
}
