package S0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f776b;

    public e(int i, int i2) {
        this.f775a = i;
        this.f776b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f775a == eVar.f775a && this.f776b == eVar.f776b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f776b) + (Integer.hashCode(this.f775a) * 31);
    }

    public final String toString() {
        return "Cell(x=" + this.f775a + ", y=" + this.f776b + ")";
    }
}
