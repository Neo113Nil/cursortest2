package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e70 {
    public static int k;
    public static final a60 l = new a60(22);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final lm1 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public e70(String str, float f, float f2, float f3, float f4, lm1 lm1Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = lm1Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e70)) {
            return false;
        }
        e70 e70Var = (e70) obj;
        return Intrinsics.a(this.a, e70Var.a) && bt.a(this.b, e70Var.b) && bt.a(this.c, e70Var.c) && this.d == e70Var.d && this.e == e70Var.e && this.f.equals(e70Var.f) && hi.c(this.g, e70Var.g) && this.h == e70Var.h && this.i == e70Var.i;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + qy0.b(this.e, qy0.b(this.d, qy0.b(this.c, qy0.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return Boolean.hashCode(this.i) + qy0.c(this.h, qy0.e(this.g, hashCode, 31), 31);
    }
}
