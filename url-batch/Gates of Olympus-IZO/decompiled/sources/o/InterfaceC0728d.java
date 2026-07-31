package o;

import m.InterfaceC0602l;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0728d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0727c f6497a = C0727c.f6492a;

    default float a(float f3, float f4, float f5) {
        f6497a.getClass();
        float f6 = f4 + f3;
        if ((f3 >= 0.0f && f6 <= f5) || (f3 < 0.0f && f6 > f5)) {
            return 0.0f;
        }
        float f7 = f6 - f5;
        return Math.abs(f3) < Math.abs(f7) ? f3 : f7;
    }

    default InterfaceC0602l b() {
        f6497a.getClass();
        return C0727c.f6493b;
    }
}
