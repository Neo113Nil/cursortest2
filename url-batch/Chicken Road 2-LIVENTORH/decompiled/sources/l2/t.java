package l2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: h, reason: collision with root package name */
    public static final RectF f2653h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final float f2654b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2655c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2656e;

    /* renamed from: f, reason: collision with root package name */
    public float f2657f;

    /* renamed from: g, reason: collision with root package name */
    public float f2658g;

    public t(float f2, float f4, float f5, float f6) {
        this.f2654b = f2;
        this.f2655c = f4;
        this.d = f5;
        this.f2656e = f6;
    }

    @Override // l2.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2661a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f2 = this.d;
        float f4 = this.f2656e;
        RectF rectF = f2653h;
        rectF.set(this.f2654b, this.f2655c, f2, f4);
        path.arcTo(rectF, this.f2657f, this.f2658g, false);
        path.transform(matrix);
    }
}
