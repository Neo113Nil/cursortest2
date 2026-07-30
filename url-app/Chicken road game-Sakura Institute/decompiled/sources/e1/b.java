package e1;

import b1.c;
import f7.i0;
import m2.k;
import r1.f0;
import y0.f;
import z0.m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public i0 f2730a;

    /* renamed from: b, reason: collision with root package name */
    public m f2731b;

    /* renamed from: c, reason: collision with root package name */
    public float f2732c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public k f2733d = k.f6322f;

    public abstract void a(float f9);

    public abstract void b(m mVar);

    public final void c(f0 f0Var, long j8, float f9, m mVar) {
        c cVar = f0Var.f7767f;
        if (this.f2732c != f9) {
            a(f9);
            this.f2732c = f9;
        }
        if (!r6.k.a(this.f2731b, mVar)) {
            b(mVar);
            this.f2731b = mVar;
        }
        k layoutDirection = f0Var.getLayoutDirection();
        if (this.f2733d != layoutDirection) {
            this.f2733d = layoutDirection;
        }
        float d8 = f.d(cVar.d()) - f.d(j8);
        float b9 = f.b(cVar.d()) - f.b(j8);
        ((b6.c) cVar.f1234g.f1230g).s(0.0f, 0.0f, d8, b9);
        if (f9 > 0.0f) {
            try {
                if (f.d(j8) > 0.0f && f.b(j8) > 0.0f) {
                    e(f0Var);
                }
            } finally {
                ((b6.c) cVar.f1234g.f1230g).s(-0.0f, -0.0f, -d8, -b9);
            }
        }
    }

    public abstract long d();

    public abstract void e(f0 f0Var);
}
