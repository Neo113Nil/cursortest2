package o;

import l.AbstractC0779e;
import l.C0795v;
import l.InterfaceC0787m;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884f implements InterfaceC0880d {

    /* renamed from: b, reason: collision with root package name */
    public final l.u0 f8763b = AbstractC0779e.j(125, 0, new C0795v(0.25f, 0.1f, 0.25f, 1.0f), 2);

    @Override // o.InterfaceC0880d
    public final float a(float f4, float f5, float f6) {
        float abs = Math.abs((f5 + f4) - f4);
        float f7 = (0.3f * f6) - (0.0f * abs);
        float f8 = f6 - f7;
        if ((abs <= f6) && f8 < abs) {
            f7 = f6 - abs;
        }
        return f4 - f7;
    }

    @Override // o.InterfaceC0880d
    public final InterfaceC0787m b() {
        return this.f8763b;
    }
}
