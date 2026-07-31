package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f8216a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8217b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8218c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8219d;

    public g0(float f6, float f8, float f9, float f10) {
        this.f8216a = f6;
        this.f8217b = f8;
        this.f8218c = f9;
        this.f8219d = f10;
        if (!((f6 >= 0.0f) & (f8 >= 0.0f) & (f9 >= 0.0f)) || !(f10 >= 0.0f)) {
            y.a.a("Padding must be non-negative");
        }
    }

    @Override // x.f0
    public final float a() {
        return this.f8219d;
    }

    @Override // x.f0
    public final float b(r2.l lVar) {
        return lVar == r2.l.f6529d ? this.f8218c : this.f8216a;
    }

    @Override // x.f0
    public final float c() {
        return this.f8217b;
    }

    @Override // x.f0
    public final float d(r2.l lVar) {
        return lVar == r2.l.f6529d ? this.f8216a : this.f8218c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return r2.f.a(this.f8216a, g0Var.f8216a) && r2.f.a(this.f8217b, g0Var.f8217b) && r2.f.a(this.f8218c, g0Var.f8218c) && r2.f.a(this.f8219d, g0Var.f8219d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f8219d) + a0.q.a(this.f8218c, a0.q.a(this.f8217b, Float.hashCode(this.f8216a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) r2.f.b(this.f8216a)) + ", top=" + ((Object) r2.f.b(this.f8217b)) + ", end=" + ((Object) r2.f.b(this.f8218c)) + ", bottom=" + ((Object) r2.f.b(this.f8219d)) + ')';
    }
}
