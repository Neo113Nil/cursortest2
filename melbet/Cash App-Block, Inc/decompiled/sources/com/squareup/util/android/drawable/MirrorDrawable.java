package com.squareup.util.android.drawable;

import android.graphics.Canvas;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class MirrorDrawable extends DrawableWrapperCompat {
    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        int save = canvas.save();
        canvas.scale(-1.0f, 1.0f, getBounds().width() / 2.0f, RecyclerView.DECELERATION_RATE);
        try {
            super.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
