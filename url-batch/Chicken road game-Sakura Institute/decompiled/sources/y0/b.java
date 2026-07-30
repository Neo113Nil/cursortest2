package y0;

import u3.q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f9774a;

    /* renamed from: b, reason: collision with root package name */
    public float f9775b;

    /* renamed from: c, reason: collision with root package name */
    public float f9776c;

    /* renamed from: d, reason: collision with root package name */
    public float f9777d;

    public final void a(float f9, float f10, float f11, float f12) {
        this.f9774a = Math.max(f9, this.f9774a);
        this.f9775b = Math.max(f10, this.f9775b);
        this.f9776c = Math.min(f11, this.f9776c);
        this.f9777d = Math.min(f12, this.f9777d);
    }

    public final boolean b() {
        return this.f9774a >= this.f9776c || this.f9775b >= this.f9777d;
    }

    public final String toString() {
        return "MutableRect(" + q.k(this.f9774a) + ", " + q.k(this.f9775b) + ", " + q.k(this.f9776c) + ", " + q.k(this.f9777d) + ')';
    }
}
