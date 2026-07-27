package Q2;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2489a;

    public h(boolean z) {
        this.f2489a = z;
    }

    @Override // Q2.g
    public final String a() {
        return String.valueOf(this.f2489a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Boolean.valueOf(this.f2489a).equals(((g) obj).getValue());
    }

    @Override // Q2.g
    public final int getType() {
        return 2;
    }

    @Override // Q2.g
    public final Object getValue() {
        return Boolean.valueOf(this.f2489a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2489a);
    }

    public final String toString() {
        return "ValueBoolean{" + String.valueOf(this.f2489a) + "}";
    }
}
