package N0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f959b;

    /* renamed from: c, reason: collision with root package name */
    public float f960c;

    @Override // N0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f961a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f959b, this.f960c);
        path.transform(matrix);
    }
}
