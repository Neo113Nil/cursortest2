package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qm0 {
    public final long a;
    public final long b;
    public final boolean c;

    public qm0(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final qm0 a(qm0 qm0Var) {
        return new qm0(wq0.e(this.a, qm0Var.a), Math.max(this.b, qm0Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm0)) {
            return false;
        }
        qm0 qm0Var = (qm0) obj;
        return wq0.b(this.a, qm0Var.a) && this.b == qm0Var.b && this.c == qm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qy0.e(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) wq0.g(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ')';
    }
}
