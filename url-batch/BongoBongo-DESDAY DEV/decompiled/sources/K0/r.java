package K0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f459b;

    /* renamed from: c, reason: collision with root package name */
    public float f460c;

    @Override // K0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f461a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f459b, this.f460c);
        path.transform(matrix);
    }
}
