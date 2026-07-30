package C3;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f469b;

    /* renamed from: c, reason: collision with root package name */
    public float f470c;

    @Override // C3.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f471a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f469b, this.f470c);
        path.transform(matrix);
    }
}
