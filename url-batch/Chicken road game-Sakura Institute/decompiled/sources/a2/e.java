package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f363a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f365c;

    /* renamed from: d, reason: collision with root package name */
    public final String f366d;

    public e(Object obj, int i7, int i8, String str) {
        this.f363a = obj;
        this.f364b = i7;
        this.f365c = i8;
        this.f366d = str;
        if (i7 > i8) {
            throw new IllegalArgumentException("Reversed range is not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return r6.k.a(this.f363a, eVar.f363a) && this.f364b == eVar.f364b && this.f365c == eVar.f365c && r6.k.a(this.f366d, eVar.f366d);
    }

    public final int hashCode() {
        Object obj = this.f363a;
        return this.f366d.hashCode() + l.h.c(this.f365c, l.h.c(this.f364b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.f363a + ", start=" + this.f364b + ", end=" + this.f365c + ", tag=" + this.f366d + ')';
    }

    public e(int i7, int i8, Object obj) {
        this(obj, i7, i8, "");
    }
}
