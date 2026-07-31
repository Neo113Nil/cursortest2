package a0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f3485a;

    /* renamed from: b, reason: collision with root package name */
    public float f3486b;

    /* renamed from: c, reason: collision with root package name */
    public float f3487c;

    /* renamed from: d, reason: collision with root package name */
    public float f3488d;

    public final void a(float f3, float f4, float f5, float f6) {
        this.f3485a = Math.max(f3, this.f3485a);
        this.f3486b = Math.max(f4, this.f3486b);
        this.f3487c = Math.min(f5, this.f3487c);
        this.f3488d = Math.min(f6, this.f3488d);
    }

    public final boolean b() {
        return this.f3485a >= this.f3487c || this.f3486b >= this.f3488d;
    }

    public final String toString() {
        return "MutableRect(" + I2.d.N(this.f3485a) + ", " + I2.d.N(this.f3486b) + ", " + I2.d.N(this.f3487c) + ", " + I2.d.N(this.f3488d) + ')';
    }
}
