package t0;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358k {

    /* renamed from: a, reason: collision with root package name */
    public final int f4137a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4139c;

    public C0358k(float f2, int i, int i2) {
        this.f4137a = i;
        this.f4138b = f2;
        this.f4139c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0358k)) {
            return false;
        }
        C0358k c0358k = (C0358k) obj;
        return this.f4137a == c0358k.f4137a && Float.compare(this.f4138b, c0358k.f4138b) == 0 && this.f4139c == c0358k.f4139c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4139c) + ((Float.hashCode(this.f4138b) + (Integer.hashCode(this.f4137a) * 31)) * 31);
    }

    public final String toString() {
        return "VictoryData(streak=" + this.f4137a + ", multiplier=" + this.f4138b + ", level=" + this.f4139c + ")";
    }
}
