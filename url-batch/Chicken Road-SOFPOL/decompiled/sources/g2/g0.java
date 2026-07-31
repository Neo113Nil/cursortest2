package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f2954a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f2955b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f2956c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f2957d;

    public g0(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4) {
        this.f2954a = b0Var;
        this.f2955b = b0Var2;
        this.f2956c = b0Var3;
        this.f2957d = b0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return q6.i.a(this.f2954a, g0Var.f2954a) && q6.i.a(this.f2955b, g0Var.f2955b) && q6.i.a(this.f2956c, g0Var.f2956c) && q6.i.a(this.f2957d, g0Var.f2957d);
    }

    public final int hashCode() {
        b0 b0Var = this.f2954a;
        int hashCode = (b0Var != null ? b0Var.hashCode() : 0) * 31;
        b0 b0Var2 = this.f2955b;
        int hashCode2 = (hashCode + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31;
        b0 b0Var3 = this.f2956c;
        int hashCode3 = (hashCode2 + (b0Var3 != null ? b0Var3.hashCode() : 0)) * 31;
        b0 b0Var4 = this.f2957d;
        return hashCode3 + (b0Var4 != null ? b0Var4.hashCode() : 0);
    }
}
