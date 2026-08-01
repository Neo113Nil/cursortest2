package R0;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class r extends s {

    /* renamed from: b, reason: collision with root package name */
    public float f974b;

    /* renamed from: c, reason: collision with root package name */
    public float f975c;

    @Override // R0.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f976a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f974b, this.f975c);
        path.transform(matrix);
    }
}
