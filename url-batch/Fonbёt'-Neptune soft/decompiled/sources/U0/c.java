package U0;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final c f1094h = new c(1, 0, 1);

    @Override // U0.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1087e == cVar.f1087e) {
                    if (this.f1088f == cVar.f1088f) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // U0.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1087e * 31) + this.f1088f;
    }

    @Override // U0.a
    public final boolean isEmpty() {
        return this.f1087e > this.f1088f;
    }

    @Override // U0.a
    public final String toString() {
        return this.f1087e + ".." + this.f1088f;
    }
}
