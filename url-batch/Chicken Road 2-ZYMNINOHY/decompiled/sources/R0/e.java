package R0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f2308a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2309b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2310c;

    public e(float f4, int i4, int i5) {
        this.f2308a = i4;
        this.f2309b = i5;
        this.f2310c = f4;
    }

    public static e a(int i4) {
        int i5 = (i4 >> 13) & 7;
        if (i5 == 0) {
            return null;
        }
        return new e(((i4 & 511) * ((i4 & 512) != 0 ? -1 : 1)) / 10.0f, i5, (i4 >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2308a == eVar.f2308a && this.f2309b == eVar.f2309b && Float.compare(this.f2310c, eVar.f2310c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2310c) + (((this.f2308a * 31) + this.f2309b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f2308a + ", originator=" + this.f2309b + ", gain=" + this.f2310c + '}';
    }
}
