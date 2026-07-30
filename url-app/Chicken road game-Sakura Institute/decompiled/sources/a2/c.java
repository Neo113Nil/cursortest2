package a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f320b;

    /* renamed from: c, reason: collision with root package name */
    public final int f321c;

    /* renamed from: d, reason: collision with root package name */
    public final String f322d;

    public c(Object obj, int i7, int i8, String str) {
        this.f319a = obj;
        this.f320b = i7;
        this.f321c = i8;
        this.f322d = str;
    }

    public final e a(int i7) {
        int i8 = this.f321c;
        if (i8 != Integer.MIN_VALUE) {
            i7 = i8;
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalStateException("Item.end should be set first");
        }
        return new e(this.f319a, this.f320b, i7, this.f322d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return r6.k.a(this.f319a, cVar.f319a) && this.f320b == cVar.f320b && this.f321c == cVar.f321c && r6.k.a(this.f322d, cVar.f322d);
    }

    public final int hashCode() {
        Object obj = this.f319a;
        return this.f322d.hashCode() + l.h.c(this.f321c, l.h.c(this.f320b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.f319a + ", start=" + this.f320b + ", end=" + this.f321c + ", tag=" + this.f322d + ')';
    }

    public /* synthetic */ c(int i7, int i8, Object obj) {
        this(obj, i7, i8, "");
    }
}
