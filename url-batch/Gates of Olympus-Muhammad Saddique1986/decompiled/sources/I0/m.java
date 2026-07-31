package I0;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final m f3071g = new m(false, 0, true, 1, 1, J0.b.f3155f);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3072a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3073b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3074c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3075d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3076e;

    /* renamed from: f, reason: collision with root package name */
    public final J0.b f3077f;

    public m(boolean z3, int i3, boolean z4, int i4, int i5, J0.b bVar) {
        this.f3072a = z3;
        this.f3073b = i3;
        this.f3074c = z4;
        this.f3075d = i4;
        this.f3076e = i5;
        this.f3077f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f3072a == mVar.f3072a && n.a(this.f3073b, mVar.f3073b) && this.f3074c == mVar.f3074c && o.a(this.f3075d, mVar.f3075d) && l.a(this.f3076e, mVar.f3076e) && f2.j.a(null, null) && f2.j.a(this.f3077f, mVar.f3077f);
    }

    public final int hashCode() {
        return this.f3077f.f3156d.hashCode() + AbstractC0625j.a(this.f3076e, AbstractC0625j.a(this.f3075d, A.k.e(AbstractC0625j.a(this.f3073b, Boolean.hashCode(this.f3072a) * 31, 31), 31, this.f3074c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f3072a + ", capitalization=" + ((Object) n.b(this.f3073b)) + ", autoCorrect=" + this.f3074c + ", keyboardType=" + ((Object) o.b(this.f3075d)) + ", imeAction=" + ((Object) l.b(this.f3076e)) + ", platformImeOptions=null, hintLocales=" + this.f3077f + ')';
    }
}
