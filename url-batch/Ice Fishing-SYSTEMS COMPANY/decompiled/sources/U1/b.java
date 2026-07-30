package U1;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* loaded from: classes.dex */
public abstract class b extends e {

    /* renamed from: U, reason: collision with root package name */
    public final Paint f3243U;

    /* renamed from: V, reason: collision with root package name */
    public int f3244V;

    /* renamed from: W, reason: collision with root package name */
    public int f3245W;

    public b() {
        e(-1);
        Paint paint = new Paint();
        this.f3243U = paint;
        paint.setAntiAlias(true);
        paint.setColor(this.f3244V);
    }

    @Override // U1.e
    public final void b(Canvas canvas) {
        Paint paint = this.f3243U;
        paint.setColor(this.f3244V);
        h(canvas, paint);
    }

    @Override // U1.e
    public final int c() {
        return this.f3245W;
    }

    @Override // U1.e
    public final void e(int i) {
        this.f3245W = i;
        i();
    }

    public abstract void h(Canvas canvas, Paint paint);

    public final void i() {
        int i = this.f3264H;
        int i4 = this.f3245W;
        this.f3244V = ((((i4 >>> 24) * (i + (i >> 7))) >> 8) << 24) | ((i4 << 8) >>> 8);
    }

    @Override // U1.e, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3264H = i;
        i();
    }

    @Override // U1.e, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3243U.setColorFilter(colorFilter);
    }
}
