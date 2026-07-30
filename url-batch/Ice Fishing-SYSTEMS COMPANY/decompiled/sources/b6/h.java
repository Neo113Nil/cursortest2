package b6;

/* loaded from: classes2.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5571a;

    public h(boolean z8) {
        this.f5571a = z8;
    }

    @Override // b6.g
    public final String a() {
        return String.valueOf(this.f5571a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Boolean.valueOf(this.f5571a).equals(((g) obj).getValue());
    }

    @Override // b6.g
    public final int getType() {
        return 2;
    }

    @Override // b6.g
    public final Object getValue() {
        return Boolean.valueOf(this.f5571a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5571a);
    }

    public final String toString() {
        return "ValueBoolean{" + String.valueOf(this.f5571a) + "}";
    }
}
