package com.squareup.cash.ui.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;

/* loaded from: classes.dex */
public final class SplashScreenDrawable extends Drawable {
    public final int backgroundColor;
    public final Drawable delegate;

    public SplashScreenDrawable(Context context) {
        context.getClass();
        this.backgroundColor = context.getColor(R.color.splash_background);
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.splash_screen, null);
        drawableCompat.getClass();
        Drawable mutate = drawableCompat.mutate();
        mutate.getClass();
        this.delegate = mutate;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        canvas.drawColor(this.backgroundColor);
        this.delegate.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        rect.getClass();
        super.setBounds(rect);
        this.delegate.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.delegate.setBounds(i, i2, i3, i4);
    }
}
