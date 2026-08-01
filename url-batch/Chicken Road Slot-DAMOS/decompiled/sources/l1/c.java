package l1;

import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f5755a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5756b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5757c;

    public c(int i3, long j, String str) {
        this.f5755a = str;
        this.f5756b = j;
        this.f5757c = i3;
        if (str.length() == 0) {
            a1.e("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i3 < -1 || i3 > 63) {
            a1.e("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i3);

    public abstract float b(int i3);

    public boolean c() {
        return false;
    }

    public abstract long d(float f3, float f10, float f11);

    public abstract float e(float f3, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f5757c == cVar.f5757c && this.f5755a.equals(cVar.f5755a)) {
            return b.a(this.f5756b, cVar.f5756b);
        }
        return false;
    }

    public abstract long f(float f3, float f10, float f11, float f12, c cVar);

    public int hashCode() {
        int hashCode = this.f5755a.hashCode() * 31;
        int i3 = b.f5754e;
        return n0.l.c(hashCode, 31, this.f5756b) + this.f5757c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5755a);
        sb2.append(" (id=");
        sb2.append(this.f5757c);
        sb2.append(", model=");
        long j = b.f5750a;
        long j3 = this.f5756b;
        sb2.append((Object) (b.a(j3, j) ? "Rgb" : b.a(j3, b.f5751b) ? "Xyz" : b.a(j3, b.f5752c) ? "Lab" : b.a(j3, b.f5753d) ? "Cmyk" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
