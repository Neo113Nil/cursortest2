package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class feu extends Property {
    private final Matrix a;

    public feu() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Matrix imageMatrix = ((ImageView) obj).getImageMatrix();
        Matrix matrix = this.a;
        matrix.set(imageMatrix);
        return matrix;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
