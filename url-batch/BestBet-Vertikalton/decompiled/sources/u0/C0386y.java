package u0;

/* renamed from: u0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386y {

    /* renamed from: a, reason: collision with root package name */
    public final int f4233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4234b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4235c;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4236e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4237f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4238g;

    public /* synthetic */ C0386y() {
        this(1, 0, 0, 0L, 0L, 3, 1.0f);
    }

    public static C0386y a(C0386y c0386y, int i, int i2, long j2, long j3, int i3, float f2, int i4) {
        int i5 = c0386y.f4233a;
        int i6 = (i4 & 2) != 0 ? c0386y.f4234b : i;
        int i7 = (i4 & 4) != 0 ? c0386y.f4235c : i2;
        long j4 = (i4 & 8) != 0 ? c0386y.d : j2;
        int i8 = (i4 & 32) != 0 ? c0386y.f4237f : i3;
        float f3 = (i4 & 64) != 0 ? c0386y.f4238g : f2;
        c0386y.getClass();
        return new C0386y(i5, i6, i7, j4, j3, i8, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0386y)) {
            return false;
        }
        C0386y c0386y = (C0386y) obj;
        return this.f4233a == c0386y.f4233a && this.f4234b == c0386y.f4234b && this.f4235c == c0386y.f4235c && this.d == c0386y.d && this.f4236e == c0386y.f4236e && this.f4237f == c0386y.f4237f && Float.compare(this.f4238g, c0386y.f4238g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4238g) + ((Integer.hashCode(this.f4237f) + ((Long.hashCode(this.f4236e) + ((Long.hashCode(this.d) + ((Integer.hashCode(this.f4235c) + ((Integer.hashCode(this.f4234b) + (Integer.hashCode(this.f4233a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StreakStateEntity(id=" + this.f4233a + ", currentStreak=" + this.f4234b + ", bestStreak=" + this.f4235c + ", lastCompletedDay=" + this.d + ", lastOpenedDay=" + this.f4236e + ", graceRemaining=" + this.f4237f + ", multiplier=" + this.f4238g + ")";
    }

    public C0386y(int i, int i2, int i3, long j2, long j3, int i4, float f2) {
        this.f4233a = i;
        this.f4234b = i2;
        this.f4235c = i3;
        this.d = j2;
        this.f4236e = j3;
        this.f4237f = i4;
        this.f4238g = f2;
    }
}
