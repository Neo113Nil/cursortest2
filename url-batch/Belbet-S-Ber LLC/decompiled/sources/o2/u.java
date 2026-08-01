package o2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class u extends w {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f3007b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3008c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3009e;

    /* renamed from: f, reason: collision with root package name */
    public float f3010f;

    /* renamed from: g, reason: collision with root package name */
    public float f3011g;

    public u(float f5, float f6, float f7, float f8) {
        this.f3007b = f5;
        this.f3008c = f6;
        this.d = f7;
        this.f3009e = f8;
    }

    @Override // o2.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3014a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f5 = this.d;
        float f6 = this.f3009e;
        RectF rectF = h;
        rectF.set(this.f3007b, this.f3008c, f5, f6);
        path.arcTo(rectF, this.f3010f, this.f3011g, false);
        path.transform(matrix);
    }
}
