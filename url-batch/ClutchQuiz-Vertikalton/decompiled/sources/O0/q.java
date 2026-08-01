package O0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f579b;

    /* renamed from: c, reason: collision with root package name */
    public final float f580c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f581e;

    /* renamed from: f, reason: collision with root package name */
    public float f582f;

    /* renamed from: g, reason: collision with root package name */
    public float f583g;

    public q(float f2, float f3, float f4, float f5) {
        this.f579b = f2;
        this.f580c = f3;
        this.d = f4;
        this.f581e = f5;
    }

    @Override // O0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f586a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f579b, this.f580c, this.d, this.f581e);
        path.arcTo(rectF, this.f582f, this.f583g, false);
        path.transform(matrix);
    }
}
