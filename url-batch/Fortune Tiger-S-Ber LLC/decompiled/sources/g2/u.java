package g2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class u extends w {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f1908b;
    public final float c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1909d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1910e;

    /* renamed from: f, reason: collision with root package name */
    public float f1911f;
    public float g;

    public u(float f4, float f5, float f6, float f7) {
        this.f1908b = f4;
        this.c = f5;
        this.f1909d = f6;
        this.f1910e = f7;
    }

    @Override // g2.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1913a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f4 = this.f1909d;
        float f5 = this.f1910e;
        RectF rectF = h;
        rectF.set(this.f1908b, this.c, f4, f5);
        path.arcTo(rectF, this.f1911f, this.g, false);
        path.transform(matrix);
    }
}
