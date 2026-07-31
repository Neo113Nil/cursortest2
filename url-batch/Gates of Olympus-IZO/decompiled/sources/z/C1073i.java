package z;

import H2.AbstractC0080b;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1073i {

    /* renamed from: a, reason: collision with root package name */
    public final String f8925a;

    /* renamed from: b, reason: collision with root package name */
    public String f8926b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8927c = false;

    /* renamed from: d, reason: collision with root package name */
    public C1069e f8928d = null;

    public C1073i(String str, String str2) {
        this.f8925a = str;
        this.f8926b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1073i)) {
            return false;
        }
        C1073i c1073i = (C1073i) obj;
        return Z1.i.a(this.f8925a, c1073i.f8925a) && Z1.i.a(this.f8926b, c1073i.f8926b) && this.f8927c == c1073i.f8927c && Z1.i.a(this.f8928d, c1073i.f8928d);
    }

    public final int hashCode() {
        int f3 = AbstractC0080b.f(AbstractC0080b.e(this.f8925a.hashCode() * 31, 31, this.f8926b), 31, this.f8927c);
        C1069e c1069e = this.f8928d;
        return f3 + (c1069e == null ? 0 : c1069e.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f8928d + ", isShowingSubstitution=" + this.f8927c + ')';
    }
}
