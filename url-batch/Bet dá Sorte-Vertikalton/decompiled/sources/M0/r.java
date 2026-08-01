package M0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f552b;

    /* renamed from: c, reason: collision with root package name */
    public float f553c;

    @Override // M0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f554a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f552b, this.f553c);
        path.transform(matrix);
    }
}
