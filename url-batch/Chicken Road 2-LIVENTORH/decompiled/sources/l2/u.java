package l2;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class u extends v {

    /* renamed from: b, reason: collision with root package name */
    public float f2659b;

    /* renamed from: c, reason: collision with root package name */
    public float f2660c;

    @Override // l2.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f2661a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f2659b, this.f2660c);
        path.transform(matrix);
    }
}
