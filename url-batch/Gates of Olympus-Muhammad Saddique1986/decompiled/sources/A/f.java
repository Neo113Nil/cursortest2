package A;

import C0.C0031g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f46a;

    /* renamed from: b, reason: collision with root package name */
    public C0031g f47b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f48c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f49d = null;

    public f(C0031g c0031g, C0031g c0031g2) {
        this.f46a = c0031g;
        this.f47b = c0031g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return f2.j.a(this.f46a, fVar.f46a) && f2.j.a(this.f47b, fVar.f47b) && this.f48c == fVar.f48c && f2.j.a(this.f49d, fVar.f49d);
    }

    public final int hashCode() {
        int e3 = k.e((this.f47b.hashCode() + (this.f46a.hashCode() * 31)) * 31, 31, this.f48c);
        d dVar = this.f49d;
        return e3 + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f46a) + ", substitution=" + ((Object) this.f47b) + ", isShowingSubstitution=" + this.f48c + ", layoutCache=" + this.f49d + ')';
    }
}
