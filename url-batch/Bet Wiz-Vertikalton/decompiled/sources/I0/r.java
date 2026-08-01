package I0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f385b;

    /* renamed from: c, reason: collision with root package name */
    public float f386c;

    @Override // I0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f387a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f385b, this.f386c);
        path.transform(matrix);
    }
}
