package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v8 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public v8(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static v8 a(v8 v8Var, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = v8Var.a;
        }
        if ((i & 2) != 0) {
            z2 = v8Var.b;
        }
        if ((i & 4) != 0) {
            z3 = v8Var.c;
        }
        v8Var.getClass();
        return new v8(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return this.a == v8Var.a && this.b == v8Var.b && this.c == v8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qy0.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "AppSettings(musicEnabled=" + this.a + ", soundEnabled=" + this.b + ", vibrationEnabled=" + this.c + ")";
    }
}
