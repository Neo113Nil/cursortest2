package b0;

import a0.C0239d;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: b0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341j implements L {

    /* renamed from: a, reason: collision with root package name */
    public final Path f5420a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f5421b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f5422c;

    public C0341j(Path path) {
        this.f5420a = path;
    }

    public final C0239d c() {
        if (this.f5421b == null) {
            this.f5421b = new RectF();
        }
        RectF rectF = this.f5421b;
        f2.j.c(rectF);
        this.f5420a.computeBounds(rectF, true);
        return new C0239d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(L l3, L l4, int i3) {
        Path.Op op = i3 == 0 ? Path.Op.DIFFERENCE : i3 == 1 ? Path.Op.INTERSECT : i3 == 4 ? Path.Op.REVERSE_DIFFERENCE : i3 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(l3 instanceof C0341j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C0341j) l3).f5420a;
        if (l4 instanceof C0341j) {
            return this.f5420a.op(path, ((C0341j) l4).f5420a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.f5420a.reset();
    }

    public final void f(int i3) {
        this.f5420a.setFillType(i3 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
