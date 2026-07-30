package C4;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f314a;

    public k(boolean z7) {
        this.f314a = z7;
    }

    @Override // C4.j
    public final String a() {
        return String.valueOf(this.f314a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Boolean.valueOf(this.f314a).equals(((j) obj).getValue());
    }

    @Override // C4.j
    public final int getType() {
        return 2;
    }

    @Override // C4.j
    public final Object getValue() {
        return Boolean.valueOf(this.f314a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f314a);
    }

    public final String toString() {
        return "ValueBoolean{" + String.valueOf(this.f314a) + "}";
    }
}
