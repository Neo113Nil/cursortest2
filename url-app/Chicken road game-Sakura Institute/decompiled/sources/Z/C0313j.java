package Z;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Z.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313j implements J {

    /* renamed from: a, reason: collision with root package name */
    public final Path f4530a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f4531b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f4532c;

    public C0313j(Path path) {
        this.f4530a = path;
    }

    public final Y.d c() {
        if (this.f4531b == null) {
            this.f4531b = new RectF();
        }
        RectF rectF = this.f4531b;
        Intrinsics.c(rectF);
        this.f4530a.computeBounds(rectF, true);
        return new Y.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(J j4, J j5, int i2) {
        Path.Op op = i2 == 0 ? Path.Op.DIFFERENCE : i2 == 1 ? Path.Op.INTERSECT : i2 == 4 ? Path.Op.REVERSE_DIFFERENCE : i2 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(j4 instanceof C0313j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C0313j) j4).f4530a;
        if (j5 instanceof C0313j) {
            return this.f4530a.op(path, ((C0313j) j5).f4530a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.f4530a.reset();
    }

    public final void f(int i2) {
        this.f4530a.setFillType(i2 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
