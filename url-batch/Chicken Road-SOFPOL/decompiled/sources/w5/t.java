package w5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f8167h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f8168b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8169c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8170d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8171e;

    /* renamed from: f, reason: collision with root package name */
    public float f8172f;

    /* renamed from: g, reason: collision with root package name */
    public float f8173g;

    public t(float f6, float f8, float f9, float f10) {
        this.f8168b = f6;
        this.f8169c = f8;
        this.f8170d = f9;
        this.f8171e = f10;
    }

    @Override // w5.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8176a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f6 = this.f8170d;
        float f8 = this.f8171e;
        RectF rectF = f8167h;
        rectF.set(this.f8168b, this.f8169c, f6, f8);
        path.arcTo(rectF, this.f8172f, this.f8173g, false);
        path.transform(matrix);
    }
}
