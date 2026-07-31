package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.graphics.Colormap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class LinearGradientDrawable extends Drawable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final float angle;

    @NotNull
    private final Colormap colormap;

    @NotNull
    private final Paint paint;

    @NotNull
    private RectF rect;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float toRadian(float f4) {
            return (float) ((f4 * 3.141592653589793d) / 180.0f);
        }

        @NotNull
        public final LinearGradient createLinearGradient(float f4, @NotNull int[] colors, @Nullable float[] fArr, int i4, int i5) {
            Intrinsics.checkNotNullParameter(colors, "colors");
            float f5 = i4;
            float f6 = f5 / 2.0f;
            float f7 = i5;
            float f8 = f7 / 2.0f;
            double radian = toRadian(f4);
            float abs = Math.abs(f5 * ((float) Math.cos(radian))) + Math.abs(f7 * ((float) Math.sin(radian)));
            float snap$default = LinearGradientDrawableKt.snap$default((((float) Math.cos(radian)) * abs) / 2.0f, 0.0f, 0.0f, 2, null);
            float snap$default2 = LinearGradientDrawableKt.snap$default((((float) Math.sin(radian)) * abs) / 2.0f, 0.0f, 0.0f, 2, null);
            return new LinearGradient(f6 - snap$default, f8 + snap$default2, f6 + snap$default, f8 - snap$default2, colors, fArr, Shader.TileMode.CLAMP);
        }

        private Companion() {
        }
    }

    public LinearGradientDrawable(float f4, @NotNull Colormap colormap) {
        Intrinsics.checkNotNullParameter(colormap, "colormap");
        this.angle = f4;
        this.colormap = colormap;
        this.paint = new Paint();
        this.rect = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.paint.setShader(Companion.createLinearGradient(this.angle, this.colormap.getColors(), this.colormap.getPositions(), bounds.width(), bounds.height()));
        this.rect.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.paint.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
