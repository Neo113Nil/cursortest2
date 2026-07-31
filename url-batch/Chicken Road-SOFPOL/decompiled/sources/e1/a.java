package e1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f2451a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f2452b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f2453c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f2454d = 0.0f;

    public final void a(float f6, float f8, float f9, float f10) {
        this.f2451a = Math.max(f6, this.f2451a);
        this.f2452b = Math.max(f8, this.f2452b);
        this.f2453c = Math.min(f9, this.f2453c);
        this.f2454d = Math.min(f10, this.f2454d);
    }

    public final boolean b() {
        return (this.f2451a >= this.f2453c) | (this.f2452b >= this.f2454d);
    }

    public final String toString() {
        return "MutableRect(" + s6.a.L(this.f2451a) + ", " + s6.a.L(this.f2452b) + ", " + s6.a.L(this.f2453c) + ", " + s6.a.L(this.f2454d) + ')';
    }
}
