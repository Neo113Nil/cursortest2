package J0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f409b;

    /* renamed from: c, reason: collision with root package name */
    public float f410c;

    @Override // J0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f411a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f409b, this.f410c);
        path.transform(matrix);
    }
}
