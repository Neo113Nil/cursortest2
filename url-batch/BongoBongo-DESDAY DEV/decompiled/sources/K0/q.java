package K0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class q extends s {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f453h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f454b;

    /* renamed from: c, reason: collision with root package name */
    public final float f455c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f456e;

    /* renamed from: f, reason: collision with root package name */
    public float f457f;

    /* renamed from: g, reason: collision with root package name */
    public float f458g;

    public q(float f2, float f3, float f4, float f5) {
        this.f454b = f2;
        this.f455c = f3;
        this.d = f4;
        this.f456e = f5;
    }

    @Override // K0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f461a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f453h;
        rectF.set(this.f454b, this.f455c, this.d, this.f456e);
        path.arcTo(rectF, this.f457f, this.f458g, false);
        path.transform(matrix);
    }
}
