package H0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f313b;

    /* renamed from: c, reason: collision with root package name */
    public float f314c;

    @Override // H0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f315a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f313b, this.f314c);
        path.transform(matrix);
    }
}
