package o2;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: b, reason: collision with root package name */
    public float f3012b;

    /* renamed from: c, reason: collision with root package name */
    public float f3013c;

    @Override // o2.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3014a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f3012b, this.f3013c);
        path.transform(matrix);
    }
}
