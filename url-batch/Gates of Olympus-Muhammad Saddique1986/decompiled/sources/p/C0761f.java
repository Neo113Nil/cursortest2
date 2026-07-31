package p;

import m.AbstractC0620e;
import m.C0635u;
import m.InterfaceC0627l;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761f implements InterfaceC0757d {

    /* renamed from: b, reason: collision with root package name */
    public final m.t0 f7663b = AbstractC0620e.j(125, 0, new C0635u(0.25f, 0.1f, 0.25f, 1.0f), 2);

    @Override // p.InterfaceC0757d
    public final float a(float f3, float f4, float f5) {
        float abs = Math.abs((f4 + f3) - f3);
        float f6 = (0.3f * f5) - (0.0f * abs);
        float f7 = f5 - f6;
        if ((abs <= f5) && f7 < abs) {
            f6 = f5 - abs;
        }
        return f3 - f6;
    }

    @Override // p.InterfaceC0757d
    public final InterfaceC0627l b() {
        return this.f7663b;
    }
}
