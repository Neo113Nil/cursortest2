package a0;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final m0 f4194c = new m0(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f4195a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4196b;

    public m0(int i4, boolean z) {
        this.f4195a = i4;
        this.f4196b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f4195a == m0Var.f4195a && this.f4196b == m0Var.f4196b;
    }

    public final int hashCode() {
        return (this.f4195a << 1) + (this.f4196b ? 1 : 0);
    }
}
