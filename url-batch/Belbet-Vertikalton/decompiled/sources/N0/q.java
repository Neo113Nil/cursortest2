package N0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f953h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f954b;

    /* renamed from: c, reason: collision with root package name */
    public final float f955c;

    /* renamed from: d, reason: collision with root package name */
    public final float f956d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public float f957f;

    /* renamed from: g, reason: collision with root package name */
    public float f958g;

    public q(float f2, float f3, float f4, float f5) {
        this.f954b = f2;
        this.f955c = f3;
        this.f956d = f4;
        this.e = f5;
    }

    @Override // N0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f961a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f953h;
        rectF.set(this.f954b, this.f955c, this.f956d, this.e);
        path.arcTo(rectF, this.f957f, this.f958g, false);
        path.transform(matrix);
    }
}
