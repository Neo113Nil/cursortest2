package z0;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f10002a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f10003b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f10004c;

    public j(Path path) {
        this.f10002a = path;
    }

    public final boolean c(k0 k0Var, k0 k0Var2, int i7) {
        Path.Op op = i7 == 0 ? Path.Op.DIFFERENCE : i7 == 1 ? Path.Op.INTERSECT : i7 == 4 ? Path.Op.REVERSE_DIFFERENCE : i7 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(k0Var instanceof j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((j) k0Var).f10002a;
        if (k0Var2 instanceof j) {
            return this.f10002a.op(path, ((j) k0Var2).f10002a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void d() {
        this.f10002a.reset();
    }
}
