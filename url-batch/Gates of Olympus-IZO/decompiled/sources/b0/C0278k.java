package b0;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: b0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278k implements InterfaceC0258I {

    /* renamed from: a, reason: collision with root package name */
    public final Path f4278a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f4279b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f4280c;

    public C0278k(Path path) {
        this.f4278a = path;
    }

    public final void c() {
        this.f4278a.close();
    }

    public final a0.d d() {
        if (this.f4279b == null) {
            this.f4279b = new RectF();
        }
        RectF rectF = this.f4279b;
        Z1.i.c(rectF);
        this.f4278a.computeBounds(rectF, true);
        return new a0.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f3, float f4) {
        this.f4278a.lineTo(f3, f4);
    }

    public final void f(float f3, float f4) {
        this.f4278a.moveTo(f3, f4);
    }

    public final boolean g(InterfaceC0258I interfaceC0258I, InterfaceC0258I interfaceC0258I2, int i3) {
        Path.Op op = i3 == 0 ? Path.Op.DIFFERENCE : i3 == 1 ? Path.Op.INTERSECT : i3 == 4 ? Path.Op.REVERSE_DIFFERENCE : i3 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(interfaceC0258I instanceof C0278k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C0278k) interfaceC0258I).f4278a;
        if (interfaceC0258I2 instanceof C0278k) {
            return this.f4278a.op(path, ((C0278k) interfaceC0258I2).f4278a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void h() {
        this.f4278a.reset();
    }

    public final void i(int i3) {
        this.f4278a.setFillType(i3 == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }
}
