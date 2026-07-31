package z;

import B0.C0007d;
import H2.AbstractC0080b;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070f {

    /* renamed from: a, reason: collision with root package name */
    public final C0007d f8906a;

    /* renamed from: b, reason: collision with root package name */
    public C0007d f8907b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8908c = false;

    /* renamed from: d, reason: collision with root package name */
    public C1068d f8909d = null;

    public C1070f(C0007d c0007d, C0007d c0007d2) {
        this.f8906a = c0007d;
        this.f8907b = c0007d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1070f)) {
            return false;
        }
        C1070f c1070f = (C1070f) obj;
        return Z1.i.a(this.f8906a, c1070f.f8906a) && Z1.i.a(this.f8907b, c1070f.f8907b) && this.f8908c == c1070f.f8908c && Z1.i.a(this.f8909d, c1070f.f8909d);
    }

    public final int hashCode() {
        int f3 = AbstractC0080b.f((this.f8907b.hashCode() + (this.f8906a.hashCode() * 31)) * 31, 31, this.f8908c);
        C1068d c1068d = this.f8909d;
        return f3 + (c1068d == null ? 0 : c1068d.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.f8906a) + ", substitution=" + ((Object) this.f8907b) + ", isShowingSubstitution=" + this.f8908c + ", layoutCache=" + this.f8909d + ')';
    }
}
