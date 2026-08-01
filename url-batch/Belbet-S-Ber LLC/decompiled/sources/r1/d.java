package r1;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3209a;

    public d() {
        super(Matrix.class, "imageMatrixProperty");
        this.f3209a = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Matrix imageMatrix = ((ImageView) obj).getImageMatrix();
        Matrix matrix = this.f3209a;
        matrix.set(imageMatrix);
        return matrix;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
