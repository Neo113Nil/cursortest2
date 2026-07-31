package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gd3 {

    /* renamed from: a, reason: collision with root package name */
    private final tk3 f5561a;

    private gd3(tk3 tk3Var) {
        this.f5561a = tk3Var;
    }

    public static gd3 d(String str, byte[] bArr, int i7) {
        sk3 F = tk3.F();
        F.r(str);
        F.s(uo3.J(bArr));
        int i8 = i7 - 1;
        F.t(i8 != 0 ? i8 != 1 ? 5 : 4 : 3);
        return new gd3(F.o());
    }

    public final String a() {
        return this.f5561a.J();
    }

    public final byte[] b() {
        return this.f5561a.I().m();
    }

    public final int c() {
        int M = this.f5561a.M() - 2;
        int i7 = 1;
        if (M != 1) {
            i7 = 2;
            if (M != 2) {
                i7 = 3;
                if (M != 3) {
                    if (M == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i7;
    }
}
