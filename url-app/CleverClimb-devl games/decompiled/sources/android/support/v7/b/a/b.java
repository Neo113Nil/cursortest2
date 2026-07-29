package android.support.v7.b.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: DrawerArrowDrawable.java */
/* loaded from: classes.dex */
public class b extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    private static final float f1687b = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    private final Paint f1688a;

    /* renamed from: c, reason: collision with root package name */
    private float f1689c;

    /* renamed from: d, reason: collision with root package name */
    private float f1690d;
    private float e;
    private float f;
    private boolean g;
    private final Path h;
    private final int i;
    private boolean j;
    private float k;
    private float l;
    private int m;

    private static float a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            invalidateSelf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x001e, code lost:
    
        if (android.support.v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19) == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (android.support.v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19) == 1) goto L7;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.m;
        boolean z = false;
        if (i != 3) {
            switch (i) {
                case 1:
                    z = true;
                    break;
            }
        }
        float a2 = a(this.f1690d, (float) Math.sqrt(this.f1689c * this.f1689c * 2.0f), this.k);
        float a3 = a(this.f1690d, this.e, this.k);
        float round = Math.round(a(0.0f, this.l, this.k));
        float a4 = a(0.0f, f1687b, this.k);
        float a5 = a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.k);
        double d2 = a2;
        double d3 = a4;
        double cos = Math.cos(d3);
        Double.isNaN(d2);
        boolean z2 = z;
        float round2 = Math.round(cos * d2);
        double sin = Math.sin(d3);
        Double.isNaN(d2);
        float round3 = Math.round(d2 * sin);
        this.h.rewind();
        float a6 = a(this.f + this.f1688a.getStrokeWidth(), -this.l, this.k);
        float f = (-a3) / 2.0f;
        this.h.moveTo(f + round, 0.0f);
        this.h.rLineTo(a3 - (round * 2.0f), 0.0f);
        this.h.moveTo(f, a6);
        this.h.rLineTo(round2, round3);
        this.h.moveTo(f, -a6);
        this.h.rLineTo(round2, -round3);
        this.h.close();
        canvas.save();
        canvas.translate(bounds.centerX(), ((((int) ((bounds.height() - (3.0f * r3)) - (this.f * 2.0f))) / 4) * 2) + (this.f1688a.getStrokeWidth() * 1.5f) + this.f);
        if (this.g) {
            canvas.rotate(a5 * (this.j ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.h, this.f1688a);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f1688a.getAlpha()) {
            this.f1688a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1688a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.i;
    }

    public void a(float f) {
        if (this.k != f) {
            this.k = f;
            invalidateSelf();
        }
    }
}
