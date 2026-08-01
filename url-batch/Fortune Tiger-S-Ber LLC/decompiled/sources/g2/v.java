package g2;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: b, reason: collision with root package name */
    public float f1912b;
    public float c;

    @Override // g2.w
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1913a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1912b, this.c);
        path.transform(matrix);
    }
}
