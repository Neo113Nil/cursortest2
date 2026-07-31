package com.linecorp.linesdk.dialog.internal;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.d;
import androidx.core.graphics.drawable.e;

/* loaded from: classes2.dex */
public class CircleImageView extends AppCompatImageView {
    public CircleImageView(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setImageDrawable(null);
            return;
        }
        d a4 = e.a(getContext().getResources(), ((BitmapDrawable) drawable).getBitmap());
        a4.e(true);
        a4.f(Math.max(r3.getWidth(), r3.getHeight()) / 2.0f);
        super.setImageDrawable(a4);
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
