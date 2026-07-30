package l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f5889c = new p(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final p f5890d = new p(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f5891a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5892b;

    public p(int i7, boolean z8) {
        this.f5891a = i7;
        this.f5892b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f5891a == pVar.f5891a && this.f5892b == pVar.f5892b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5892b) + (Integer.hashCode(this.f5891a) * 31);
    }

    public final String toString() {
        return equals(f5889c) ? "TextMotion.Static" : equals(f5890d) ? "TextMotion.Animated" : "Invalid";
    }
}
