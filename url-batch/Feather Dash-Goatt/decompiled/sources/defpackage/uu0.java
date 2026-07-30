package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class uu0 implements w7 {
    public final int a;
    public final int b;
    public final long c;
    public final bh1 d;
    public final hx0 e;
    public final jh0 f;
    public final int g;
    public final int h;
    public final lh1 i;

    public uu0(int i, int i2, long j, bh1 bh1Var, hx0 hx0Var, jh0 jh0Var, int i3, int i4, lh1 lh1Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bh1Var;
        this.e = hx0Var;
        this.f = jh0Var;
        this.g = i3;
        this.h = i4;
        this.i = lh1Var;
        if (wh1.a(j, wh1.c) || wh1.c(j) >= 0.0f) {
            return;
        }
        p80.b("lineHeight can't be negative (" + wh1.c(j) + ')');
    }

    public final uu0 a(uu0 uu0Var) {
        return uu0Var == null ? this : vu0.a(this, uu0Var.a, uu0Var.b, uu0Var.c, uu0Var.d, uu0Var.e, uu0Var.f, uu0Var.g, uu0Var.h, uu0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu0)) {
            return false;
        }
        uu0 uu0Var = (uu0) obj;
        return this.a == uu0Var.a && this.b == uu0Var.b && wh1.a(this.c, uu0Var.c) && Intrinsics.a(this.d, uu0Var.d) && Intrinsics.a(this.e, uu0Var.e) && Intrinsics.a(this.f, uu0Var.f) && this.g == uu0Var.g && this.h == uu0Var.h && Intrinsics.a(this.i, uu0Var.i);
    }

    public final int hashCode() {
        int c = qy0.c(this.b, Integer.hashCode(this.a) * 31, 31);
        xh1[] xh1VarArr = wh1.b;
        int e = qy0.e(this.c, c, 31);
        bh1 bh1Var = this.d;
        int hashCode = (e + (bh1Var != null ? bh1Var.hashCode() : 0)) * 31;
        hx0 hx0Var = this.e;
        int hashCode2 = (hashCode + (hx0Var != null ? hx0Var.hashCode() : 0)) * 31;
        jh0 jh0Var = this.f;
        int c2 = qy0.c(this.h, qy0.c(this.g, (hashCode2 + (jh0Var != null ? jh0Var.hashCode() : 0)) * 31, 31), 31);
        lh1 lh1Var = this.i;
        return c2 + (lh1Var != null ? lh1Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) tg1.a(this.a)) + ", textDirection=" + ((Object) yg1.a(this.b)) + ", lineHeight=" + ((Object) wh1.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) eh0.a(this.g)) + ", hyphens=" + ((Object) s60.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
