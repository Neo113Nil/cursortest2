package j1;

import c6.f;
import n0.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f4915e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f4916a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4917b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4918c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4919d;

    public c(float f3, float f10, float f11, float f12) {
        this.f4916a = f3;
        this.f4917b = f10;
        this.f4918c = f11;
        this.f4919d = f12;
    }

    public final long a() {
        float f3 = this.f4918c;
        float f10 = this.f4916a;
        float f11 = ((f3 - f10) / 2.0f) + f10;
        float f12 = this.f4919d;
        float f13 = this.f4917b;
        return (Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public final long b() {
        float f3 = this.f4918c - this.f4916a;
        float f10 = this.f4919d - this.f4917b;
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final c c(c cVar) {
        return new c(Math.max(this.f4916a, cVar.f4916a), Math.max(this.f4917b, cVar.f4917b), Math.min(this.f4918c, cVar.f4918c), Math.min(this.f4919d, cVar.f4919d));
    }

    public final c d(float f3, float f10) {
        return new c(this.f4916a + f3, this.f4917b + f10, this.f4918c + f3, this.f4919d + f10);
    }

    public final c e(long j) {
        int i3 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        return new c(Float.intBitsToFloat(i3) + this.f4916a, Float.intBitsToFloat(i10) + this.f4917b, Float.intBitsToFloat(i3) + this.f4918c, Float.intBitsToFloat(i10) + this.f4919d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f4916a, cVar.f4916a) == 0 && Float.compare(this.f4917b, cVar.f4917b) == 0 && Float.compare(this.f4918c, cVar.f4918c) == 0 && Float.compare(this.f4919d, cVar.f4919d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4919d) + l.b(this.f4918c, l.b(this.f4917b, Float.hashCode(this.f4916a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + f.e0(this.f4916a) + ", " + f.e0(this.f4917b) + ", " + f.e0(this.f4918c) + ", " + f.e0(this.f4919d) + ')';
    }
}
