package p;

import m.InterfaceC0627l;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0757d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0755c f7652a = C0755c.f7647a;

    default float a(float f3, float f4, float f5) {
        f7652a.getClass();
        float f6 = f4 + f3;
        if ((f3 >= 0.0f && f6 <= f5) || (f3 < 0.0f && f6 > f5)) {
            return 0.0f;
        }
        float f7 = f6 - f5;
        return Math.abs(f3) < Math.abs(f7) ? f3 : f7;
    }

    default InterfaceC0627l b() {
        f7652a.getClass();
        return C0755c.f7648b;
    }
}
