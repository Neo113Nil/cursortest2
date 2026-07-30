package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v81 {
    public final int a;
    public final int b;
    public final boolean c;

    public v81(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v81)) {
            return false;
        }
        v81 v81Var = (v81) obj;
        return this.a == v81Var.a && this.b == v81Var.b && this.c == v81Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + q40.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}
