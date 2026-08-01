package j1;

import c6.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f4910a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f4911b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f4912c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f4913d = 0.0f;

    public final void a(float f3, float f10, float f11, float f12) {
        this.f4910a = Math.max(f3, this.f4910a);
        this.f4911b = Math.max(f10, this.f4911b);
        this.f4912c = Math.min(f11, this.f4912c);
        this.f4913d = Math.min(f12, this.f4913d);
    }

    public final boolean b() {
        return (this.f4910a >= this.f4912c) | (this.f4911b >= this.f4913d);
    }

    public final void c(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f4910a += intBitsToFloat;
        this.f4911b += intBitsToFloat2;
        this.f4912c += intBitsToFloat;
        this.f4913d += intBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + f.e0(this.f4910a) + ", " + f.e0(this.f4911b) + ", " + f.e0(this.f4912c) + ", " + f.e0(this.f4913d) + ')';
    }
}
