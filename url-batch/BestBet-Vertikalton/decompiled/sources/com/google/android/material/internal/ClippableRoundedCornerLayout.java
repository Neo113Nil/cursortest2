package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getCornerRadius() {
        return RecyclerView.f1937A0;
    }
}
