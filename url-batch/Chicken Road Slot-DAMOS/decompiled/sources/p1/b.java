package p1;

import c2.i0;
import k1.j;
import kotlin.jvm.internal.Intrinsics;
import l.d;
import y6.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public l f7598a;

    /* renamed from: b, reason: collision with root package name */
    public j f7599b;

    /* renamed from: c, reason: collision with root package name */
    public float f7600c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public x2.l f7601d = x2.l.f10330d;

    public abstract void a(float f3);

    public abstract void b(j jVar);

    public final void c(i0 i0Var, long j, float f3, j jVar) {
        m1.b bVar = i0Var.f1585d;
        if (this.f7600c != f3) {
            a(f3);
            this.f7600c = f3;
        }
        if (!Intrinsics.a(this.f7599b, jVar)) {
            b(jVar);
            this.f7599b = jVar;
        }
        x2.l layoutDirection = i0Var.getLayoutDirection();
        if (this.f7601d != layoutDirection) {
            this.f7601d = layoutDirection;
        }
        int i3 = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (bVar.u() >> 32)) - Float.intBitsToFloat(i3);
        int i10 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.u() & 4294967295L)) - Float.intBitsToFloat(i10);
        ((d) bVar.f6406e.f41i).u(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f3 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i3) > 0.0f && Float.intBitsToFloat(i10) > 0.0f) {
                    e(i0Var);
                }
            } finally {
                ((d) bVar.f6406e.f41i).u(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(m1.d dVar);
}
