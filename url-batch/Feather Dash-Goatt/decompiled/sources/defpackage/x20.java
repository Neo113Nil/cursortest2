package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x20 implements Comparable {
    public static final x20 e;
    public static final x20 g;
    public static final x20 h;
    public static final x20 i;
    public static final x20 j;
    public static final x20 k;
    public static final x20 l;
    public final int d;

    static {
        x20 x20Var = new x20(100);
        x20 x20Var2 = new x20(200);
        x20 x20Var3 = new x20(300);
        x20 x20Var4 = new x20(400);
        e = x20Var4;
        x20 x20Var5 = new x20(500);
        g = x20Var5;
        x20 x20Var6 = new x20(600);
        h = x20Var6;
        x20 x20Var7 = new x20(700);
        x20 x20Var8 = new x20(800);
        x20 x20Var9 = new x20(900);
        i = x20Var4;
        j = x20Var5;
        k = x20Var7;
        l = x20Var9;
        zh.e(x20Var, x20Var2, x20Var3, x20Var4, x20Var5, x20Var6, x20Var7, x20Var8, x20Var9);
    }

    public x20(int i2) {
        this.d = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        p80.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(x20 x20Var) {
        return Intrinsics.b(this.d, x20Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x20) {
            return this.d == ((x20) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return qy0.m(new StringBuilder("FontWeight(weight="), this.d, ')');
    }
}
