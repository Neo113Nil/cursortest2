package o;

import m.AbstractC0595e;
import m.C0610u;
import m.InterfaceC0602l;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730f implements InterfaceC0728d {

    /* renamed from: b, reason: collision with root package name */
    public final m.x0 f6508b = AbstractC0595e.i(125, 0, new C0610u(0.25f, 0.1f, 0.25f, 1.0f), 2);

    @Override // o.InterfaceC0728d
    public final float a(float f3, float f4, float f5) {
        float abs = Math.abs((f4 + f3) - f3);
        float f6 = (0.3f * f5) - (0.0f * abs);
        float f7 = f5 - f6;
        if ((abs <= f5) && f7 < abs) {
            f6 = f5 - abs;
        }
        return f3 - f6;
    }

    @Override // o.InterfaceC0728d
    public final InterfaceC0602l b() {
        return this.f6508b;
    }
}
