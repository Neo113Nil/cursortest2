package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fa1 implements mb1 {
    public final va1 a;
    public final da1 b;
    public final yf c;

    public fa1(va1 va1Var, da1 da1Var, yf yfVar) {
        this.a = va1Var;
        this.b = da1Var;
        this.c = yfVar;
    }

    @Override // defpackage.mb1
    public final int a(Object obj) {
        return this.c.a(obj);
    }

    @Override // defpackage.mb1
    public final int b() {
        return this.b.w().n;
    }

    @Override // defpackage.mb1
    public final void c(int i, Object obj, a00 a00Var, int i2) {
        a00Var.Z(1493551140);
        int i3 = (a00Var.d(i) ? 4 : 2) | i2 | (a00Var.h(obj) ? 32 : 16) | (a00Var.f(this) ? 256 : 128);
        if ((i3 & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            ll3.c(obj, i, this.a.o, yj1.H(726189336, new ea1(this, i, 0), a00Var), a00Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new l9(this, i, obj, i2, 2);
        }
    }

    @Override // defpackage.mb1
    public final Object d(int i) {
        Object g = this.c.g(i);
        return g == null ? this.b.x(i) : g;
    }

    @Override // defpackage.mb1
    public final Object e(int i) {
        g41 f = this.b.q.f(i);
        return f.c.a().invoke(Integer.valueOf(i - f.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa1)) {
            return false;
        }
        return Intrinsics.b(this.b, ((fa1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
