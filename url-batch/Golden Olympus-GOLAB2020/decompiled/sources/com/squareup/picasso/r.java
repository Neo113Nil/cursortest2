package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.q;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
final class r extends BitmapDrawable {

    /* renamed from: h, reason: collision with root package name */
    private static final Paint f21795h = new Paint();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21796a;

    /* renamed from: b, reason: collision with root package name */
    private final float f21797b;

    /* renamed from: c, reason: collision with root package name */
    private final q.e f21798c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f21799d;

    /* renamed from: e, reason: collision with root package name */
    long f21800e;

    /* renamed from: f, reason: collision with root package name */
    boolean f21801f;

    /* renamed from: g, reason: collision with root package name */
    int f21802g;

    r(Context context, Bitmap bitmap, Drawable drawable, q.e eVar, boolean z4, boolean z5) {
        super(context.getResources(), bitmap);
        this.f21802g = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f21796a = z5;
        this.f21797b = context.getResources().getDisplayMetrics().density;
        this.f21798c = eVar;
        if (eVar == q.e.MEMORY || z4) {
            return;
        }
        this.f21799d = drawable;
        this.f21801f = true;
        this.f21800e = SystemClock.uptimeMillis();
    }

    private void a(Canvas canvas) {
        Paint paint = f21795h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f21797b * 16.0f)), paint);
        paint.setColor(this.f21798c.f21789b);
        canvas.drawPath(b(0, 0, (int) (this.f21797b * 15.0f)), paint);
    }

    private static Path b(int i4, int i5, int i6) {
        Path path = new Path();
        float f4 = i4;
        float f5 = i5;
        path.moveTo(f4, f5);
        path.lineTo(i4 + i6, f5);
        path.lineTo(f4, i5 + i6);
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void c(ImageView imageView, Context context, Bitmap bitmap, q.e eVar, boolean z4, boolean z5) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new r(context, bitmap, drawable, eVar, z4, z5));
    }

    static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f21801f) {
            float uptimeMillis = (SystemClock.uptimeMillis() - this.f21800e) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f21801f = false;
                this.f21799d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f21799d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f21802g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f21802g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f21796a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21799d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f21802g = i4;
        Drawable drawable = this.f21799d;
        if (drawable != null) {
            drawable.setAlpha(i4);
        }
        super.setAlpha(i4);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f21799d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
