package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ez1 implements ud {
    public final int a;
    public final int b;
    public final long c;
    public final rv2 d;
    public final a22 e;
    public final ud1 f;
    public final int g;
    public final int h;
    public final hw2 i;

    public ez1(int i, int i2, long j, rv2 rv2Var, a22 a22Var, ud1 ud1Var, int i3, int i4, hw2 hw2Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = rv2Var;
        this.e = a22Var;
        this.f = ud1Var;
        this.g = i3;
        this.h = i4;
        this.i = hw2Var;
        if (sw2.a(j, sw2.c) || sw2.c(j) >= 0.0f) {
            return;
        }
        i21.b("lineHeight can't be negative (" + sw2.c(j) + ')');
    }

    public final ez1 a(ez1 ez1Var) {
        return ez1Var == null ? this : fz1.a(this, ez1Var.a, ez1Var.b, ez1Var.c, ez1Var.d, ez1Var.e, ez1Var.f, ez1Var.g, ez1Var.h, ez1Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez1)) {
            return false;
        }
        ez1 ez1Var = (ez1) obj;
        return this.a == ez1Var.a && this.b == ez1Var.b && sw2.a(this.c, ez1Var.c) && Intrinsics.b(this.d, ez1Var.d) && Intrinsics.b(this.e, ez1Var.e) && Intrinsics.b(this.f, ez1Var.f) && this.g == ez1Var.g && this.h == ez1Var.h && Intrinsics.b(this.i, ez1Var.i);
    }

    public final int hashCode() {
        int e = q40.e(this.b, Integer.hashCode(this.a) * 31, 31);
        tw2[] tw2VarArr = sw2.b;
        int h = in1.h(e, 31, this.c);
        rv2 rv2Var = this.d;
        int hashCode = (h + (rv2Var != null ? rv2Var.hashCode() : 0)) * 31;
        a22 a22Var = this.e;
        int hashCode2 = (hashCode + (a22Var != null ? a22Var.hashCode() : 0)) * 31;
        ud1 ud1Var = this.f;
        int e2 = q40.e(this.h, q40.e(this.g, (hashCode2 + (ud1Var != null ? ud1Var.hashCode() : 0)) * 31, 31), 31);
        hw2 hw2Var = this.i;
        return e2 + (hw2Var != null ? hw2Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) ut2.a(this.a)) + ", textDirection=" + ((Object) au2.a(this.b)) + ", lineHeight=" + ((Object) sw2.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) pd1.a(this.g)) + ", hyphens=" + ((Object) mz0.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
