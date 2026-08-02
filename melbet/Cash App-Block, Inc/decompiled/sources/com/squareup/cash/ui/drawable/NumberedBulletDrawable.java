package com.squareup.cash.ui.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.util.android.Views;

/* loaded from: classes6.dex */
public final class NumberedBulletDrawable extends Drawable {
    public int backgroundColor;
    public final float cornerRadius;
    public final RectF floatBounds;
    public final int height;
    public final String number;
    public int numberColor;
    public final Paint paint;
    public final float textHeight;
    public final float textWidth;
    public final int width;

    public NumberedBulletDrawable(Context context, String str) {
        str.getClass();
        context.getClass();
        this.number = str;
        this.cornerRadius = Views.dip(context, 8.0f);
        this.width = Views.sp(context, 24);
        this.height = Views.sp(context, 24);
        this.floatBounds = new RectF();
        Paint paint = new Paint(1);
        paint.setTypeface(ResourcesCompat.getFont(context, R.font.cashsans_medium));
        paint.setTextSize(Views.sp(context, 16.0f));
        this.paint = paint;
        ColorPalette colorPalette = ThemeHelpersKt.findThemeInfo(context).colorPalette;
        this.numberColor = colorPalette.secondaryButtonTint;
        this.backgroundColor = colorPalette.secondaryButtonBackground;
        paint.getTextBounds(str, 0, str.length(), new Rect());
        this.textWidth = paint.measureText(str);
        this.textHeight = r4.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Rect bounds = getBounds();
        RectF rectF = this.floatBounds;
        rectF.set(bounds);
        int i = this.backgroundColor;
        Paint paint = this.paint;
        paint.setColor(i);
        float f = this.cornerRadius;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setColor(this.numberColor);
        canvas.drawText(this.number, getBounds().centerX() - (this.textWidth / 2.0f), (this.textHeight / 2.0f) + getBounds().centerY(), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.height;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.width;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.paint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }
}
