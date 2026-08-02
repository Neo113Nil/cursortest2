package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eo extends Drawable {
    private static final float a = (float) Math.toRadians(45.0d);
    private final Paint b;
    private final float c;
    private final float d;
    private final float e;
    private float f;
    private boolean g;
    private final Path h;
    private final int i;
    private boolean j;
    private float k;
    private float l;
    private final int m;

    public eo(Context context) {
        Paint paint = new Paint();
        this.b = paint;
        this.h = new Path();
        this.j = false;
        this.m = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, em.n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        a(obtainStyledAttributes.getColor(3, 0));
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.l = (float) ((dimension / 2.0f) * Math.cos(a));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.g != z) {
            this.g = z;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f) {
            this.f = round;
            invalidateSelf();
        }
        this.i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.d = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.c = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.e = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(int i) {
        Paint paint = this.b;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    public final void b(float f) {
        if (this.k != f) {
            this.k = f;
            invalidateSelf();
        }
    }

    public final void c(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.m;
        boolean z = false;
        if (i != 0 && (i == 1 || getLayoutDirection() == 1)) {
            z = true;
        }
        float f = this.c;
        float f2 = f * f;
        float sqrt = (float) Math.sqrt(f2 + f2);
        float f3 = this.d;
        float f4 = this.k;
        float f5 = (sqrt - f3) * f4;
        float f6 = (this.e - f3) * f4;
        float round = Math.round(((this.l + 0.0f) * f4) + 0.0f);
        float f7 = a;
        float f8 = this.k;
        float f9 = (f7 + 0.0f) * f8;
        float f10 = true != z ? -180.0f : 0.0f;
        float f11 = f8 * 180.0f;
        double d = f9 + 0.0f;
        double d2 = f5 + f3;
        float round2 = Math.round(Math.cos(d) * d2);
        float round3 = Math.round(d2 * Math.sin(d));
        Path path = this.h;
        path.rewind();
        float f12 = this.f;
        Paint paint = this.b;
        float strokeWidth = f12 + paint.getStrokeWidth();
        float f13 = ((-this.l) - strokeWidth) * this.k;
        float f14 = f6 + f3;
        float f15 = (-f14) / 2.0f;
        path.moveTo(f15 + round, 0.0f);
        path.rLineTo(f14 - (round + round), 0.0f);
        float f16 = strokeWidth + f13;
        path.moveTo(f15, f16);
        path.rLineTo(round2, round3);
        path.moveTo(f15, -f16);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth2 = paint.getStrokeWidth();
        float f17 = this.f;
        int height = ((int) ((bounds.height() - (3.0f * strokeWidth2)) - (f17 + f17))) / 4;
        canvas.translate(bounds.centerX(), height + height + (strokeWidth2 * 1.5f) + f17);
        if (this.g) {
            canvas.rotate((f10 + f11) * (true != (this.j ^ z) ? 1 : -1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.b;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
