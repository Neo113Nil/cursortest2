package t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final float f6856a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.k0 f6857b;

    public t(float f6, f1.k0 k0Var) {
        this.f6856a = f6;
        this.f6857b = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return r2.f.a(this.f6856a, tVar.f6856a) && this.f6857b.equals(tVar.f6857b);
    }

    public final int hashCode() {
        return this.f6857b.hashCode() + (Float.hashCode(this.f6856a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) r2.f.b(this.f6856a)) + ", brush=" + this.f6857b + ')';
    }
}
