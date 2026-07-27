package o;

import l.InterfaceC0787m;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0880d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0878c f8754a = C0878c.f8749a;

    default float a(float f4, float f5, float f6) {
        f8754a.getClass();
        float f7 = f5 + f4;
        if ((f4 >= 0.0f && f7 <= f6) || (f4 < 0.0f && f7 > f6)) {
            return 0.0f;
        }
        float f8 = f7 - f6;
        return Math.abs(f4) < Math.abs(f8) ? f4 : f8;
    }

    default InterfaceC0787m b() {
        f8754a.getClass();
        return C0878c.f8750b;
    }
}
