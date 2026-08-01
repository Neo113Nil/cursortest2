package S0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f772a;

    /* renamed from: b, reason: collision with root package name */
    public final long f773b;

    /* renamed from: c, reason: collision with root package name */
    public final int f774c;
    public final int d;

    public d(int i, long j2, int i2, int i3) {
        this.f772a = i;
        this.f773b = j2;
        this.f774c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f772a == dVar.f772a && this.f773b == dVar.f773b && this.f774c == dVar.f774c && this.d == dVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((Integer.hashCode(this.f774c) + ((Long.hashCode(this.f773b) + (Integer.hashCode(this.f772a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LevelConfig(level=" + this.f772a + ", tickMs=" + this.f773b + ", foodTarget=" + this.f774c + ", lives=" + this.d + ")";
    }
}
