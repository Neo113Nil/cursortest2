package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f6068c = new s(2, false);

    /* renamed from: d, reason: collision with root package name */
    public static final s f6069d = new s(1, true);

    /* renamed from: a, reason: collision with root package name */
    public final int f6070a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6071b;

    public s(int i, boolean z3) {
        this.f6070a = i;
        this.f6071b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f6070a == sVar.f6070a && this.f6071b == sVar.f6071b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6071b) + (Integer.hashCode(this.f6070a) * 31);
    }

    public final String toString() {
        return equals(f6068c) ? "TextMotion.Static" : equals(f6069d) ? "TextMotion.Animated" : "Invalid";
    }
}
