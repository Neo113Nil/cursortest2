package V3;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2720a;

    public h(boolean z5) {
        this.f2720a = z5;
    }

    @Override // V3.g
    public final int a() {
        return 2;
    }

    @Override // V3.g
    public final String b() {
        return String.valueOf(this.f2720a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Boolean.valueOf(this.f2720a).equals(((g) obj).getValue());
    }

    @Override // V3.g
    public final Object getValue() {
        return Boolean.valueOf(this.f2720a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2720a);
    }

    public final String toString() {
        return "ValueBoolean{" + String.valueOf(this.f2720a) + "}";
    }
}
