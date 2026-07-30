package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class y91 {
    public final m41 a;
    public final m41 b;
    public final m41 c;
    public final m41 d;
    public final m41 e;
    public final m41 f;
    public final m41 g;
    public final m41 h;

    public y91() {
        m41 m41Var = v91.a;
        m41 m41Var2 = v91.b;
        m41 m41Var3 = v91.c;
        m41 m41Var4 = v91.d;
        m41 m41Var5 = v91.f;
        m41 m41Var6 = v91.e;
        m41 m41Var7 = v91.g;
        m41 m41Var8 = v91.h;
        this.a = m41Var;
        this.b = m41Var2;
        this.c = m41Var3;
        this.d = m41Var4;
        this.e = m41Var5;
        this.f = m41Var6;
        this.g = m41Var7;
        this.h = m41Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y91)) {
            return false;
        }
        y91 y91Var = (y91) obj;
        return Intrinsics.a(this.a, y91Var.a) && Intrinsics.a(this.b, y91Var.b) && Intrinsics.a(this.c, y91Var.c) && Intrinsics.a(this.d, y91Var.d) && Intrinsics.a(this.e, y91Var.e) && Intrinsics.a(this.f, y91Var.f) && Intrinsics.a(this.g, y91Var.g) && Intrinsics.a(this.h, y91Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
