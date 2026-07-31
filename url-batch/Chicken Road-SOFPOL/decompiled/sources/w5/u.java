package w5;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u extends v {

    /* renamed from: b, reason: collision with root package name */
    public float f8174b;

    /* renamed from: c, reason: collision with root package name */
    public float f8175c;

    @Override // w5.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f8176a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f8174b, this.f8175c);
        path.transform(matrix);
    }
}
