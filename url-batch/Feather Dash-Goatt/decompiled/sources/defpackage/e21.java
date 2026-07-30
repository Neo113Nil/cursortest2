package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class e21 extends y90 {
    public final y90 a;
    public final int b;

    public e21(y90 y90Var, int i) {
        this.a = y90Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e21)) {
            return false;
        }
        e21 e21Var = (e21) obj;
        return e21Var.a.equals(this.a) && e21Var.b == this.b;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b * 31);
    }
}
