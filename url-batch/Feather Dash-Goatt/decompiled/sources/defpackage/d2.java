package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d2 {
    public final String a;
    public final String b;
    public final String c;
    public final e2 d;
    public final int e;
    public final int f;

    public d2(String str, String str2, String str3, e2 e2Var, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = e2Var;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.a.equals(d2Var.a) && this.b.equals(d2Var.b) && this.c.equals(d2Var.c) && this.d == d2Var.d && this.e == d2Var.e && this.f == d2Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qy0.c(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "AchievementDefinition(id=" + this.a + ", title=" + this.b + ", description=" + this.c + ", metric=" + this.d + ", targetValue=" + this.e + ", reward=" + this.f + ")";
    }
}
