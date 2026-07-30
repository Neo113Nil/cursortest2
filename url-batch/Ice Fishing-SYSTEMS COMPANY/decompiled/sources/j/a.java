package j;

import H.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.CL;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;

/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final float f38456m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f38457a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38458b;

    /* renamed from: c, reason: collision with root package name */
    public final float f38459c;

    /* renamed from: d, reason: collision with root package name */
    public final float f38460d;

    /* renamed from: e, reason: collision with root package name */
    public final float f38461e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38462f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f38463g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38464h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public float f38465j;

    /* renamed from: k, reason: collision with root package name */
    public final float f38466k;

    /* renamed from: l, reason: collision with root package name */
    public final int f38467l;

    public a(Context context) {
        Paint paint = new Paint();
        this.f38457a = paint;
        this.f38463g = new Path();
        this.i = false;
        this.f38467l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, AbstractC4518a.f37830n, C5284R.attr.drawerArrowStyle, C5284R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f38466k = (float) (Math.cos(f38456m) * (dimension / 2.0f));
            invalidateSelf();
        }
        boolean z8 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f38462f != z8) {
            this.f38462f = z8;
            invalidateSelf();
        }
        float round = Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f38461e) {
            this.f38461e = round;
            invalidateSelf();
        }
        this.f38464h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f38459c = Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f38458b = Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f38460d = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float a(float f6, float f9, float f10) {
        return CL.a(f9, f6, f10, f6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f38467l;
        boolean z8 = false;
        if (i != 0 && (i == 1 || (i == 3 ? b.a(this) == 0 : b.a(this) == 1))) {
            z8 = true;
        }
        float f6 = this.f38458b;
        float sqrt = (float) Math.sqrt(f6 * f6 * 2.0f);
        float f9 = this.f38465j;
        float f10 = this.f38459c;
        float a9 = a(f10, sqrt, f9);
        float a10 = a(f10, this.f38460d, this.f38465j);
        float round = Math.round(a(0.0f, this.f38466k, this.f38465j));
        float a11 = a(0.0f, f38456m, this.f38465j);
        float a12 = a(z8 ? 0.0f : -180.0f, z8 ? 180.0f : 0.0f, this.f38465j);
        double d2 = a9;
        double d3 = a11;
        boolean z9 = z8;
        float round2 = Math.round(Math.cos(d3) * d2);
        float round3 = Math.round(Math.sin(d3) * d2);
        Path path = this.f38463g;
        path.rewind();
        float f11 = this.f38461e;
        Paint paint = this.f38457a;
        float a13 = a(paint.getStrokeWidth() + f11, -this.f38466k, this.f38465j);
        float f12 = (-a10) / 2.0f;
        path.moveTo(f12 + round, 0.0f);
        path.rLineTo(a10 - (round * 2.0f), 0.0f);
        path.moveTo(f12, a13);
        path.rLineTo(round2, round3);
        path.moveTo(f12, -a13);
        path.rLineTo(round2, -round3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f38461e + ((((int) (height - (r6 * 2.0f))) / 4) * 2));
        if (this.f38462f) {
            canvas.rotate(a12 * (this.i ^ z9 ? -1 : 1));
        } else if (z9) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38464h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38464h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f38457a;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38457a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f6) {
        if (this.f38465j != f6) {
            this.f38465j = f6;
            invalidateSelf();
        }
    }
}
