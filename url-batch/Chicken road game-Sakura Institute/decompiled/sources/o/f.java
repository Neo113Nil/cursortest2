package o;

import l.v1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    public final v1 f6607b = l.e.l(125, 2, new l.u(0.25f, 0.1f, 0.25f, 1.0f));

    @Override // o.d
    public final float a(float f9, float f10, float f11) {
        float abs = Math.abs((f10 + f9) - f9);
        float f12 = (0.3f * f11) - (0.0f * abs);
        float f13 = f11 - f12;
        if ((abs <= f11) && f13 < abs) {
            f12 = f11 - abs;
        }
        return f9 - f12;
    }

    @Override // o.d
    public final l.k b() {
        return this.f6607b;
    }
}
