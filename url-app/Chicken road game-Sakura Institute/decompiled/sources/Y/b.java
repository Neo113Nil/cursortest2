package Y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f4368a;

    /* renamed from: b, reason: collision with root package name */
    public float f4369b;

    /* renamed from: c, reason: collision with root package name */
    public float f4370c;

    /* renamed from: d, reason: collision with root package name */
    public float f4371d;

    public final void a(float f4, float f5, float f6, float f7) {
        this.f4368a = Math.max(f4, this.f4368a);
        this.f4369b = Math.max(f5, this.f4369b);
        this.f4370c = Math.min(f6, this.f4370c);
        this.f4371d = Math.min(f7, this.f4371d);
    }

    public final boolean b() {
        return this.f4368a >= this.f4370c || this.f4369b >= this.f4371d;
    }

    public final String toString() {
        return "MutableRect(" + M1.a.W(this.f4368a) + ", " + M1.a.W(this.f4369b) + ", " + M1.a.W(this.f4370c) + ", " + M1.a.W(this.f4371d) + ')';
    }
}
