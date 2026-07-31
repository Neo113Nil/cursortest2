package x;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: g, reason: collision with root package name */
    public static final P f9968g = new P(0, 127);

    /* renamed from: a, reason: collision with root package name */
    public final int f9969a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f9970b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9971c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9972d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f9973e;

    /* renamed from: f, reason: collision with root package name */
    public final J0.b f9974f;

    public P(int i3, int i4) {
        i3 = (i4 & 4) != 0 ? 0 : i3;
        this.f9969a = -1;
        this.f9970b = null;
        this.f9971c = i3;
        this.f9972d = -1;
        this.f9973e = null;
        this.f9974f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        return I0.n.a(this.f9969a, p3.f9969a) && f2.j.a(this.f9970b, p3.f9970b) && I0.o.a(this.f9971c, p3.f9971c) && I0.l.a(this.f9972d, p3.f9972d) && f2.j.a(null, null) && f2.j.a(this.f9973e, p3.f9973e) && f2.j.a(this.f9974f, p3.f9974f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f9969a) * 31;
        Boolean bool = this.f9970b;
        int a3 = AbstractC0625j.a(this.f9972d, AbstractC0625j.a(this.f9971c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f9973e;
        int hashCode2 = (a3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        J0.b bVar = this.f9974f;
        return hashCode2 + (bVar != null ? bVar.f3156d.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) I0.n.b(this.f9969a)) + ", autoCorrectEnabled=" + this.f9970b + ", keyboardType=" + ((Object) I0.o.b(this.f9971c)) + ", imeAction=" + ((Object) I0.l.b(this.f9972d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f9973e + ", hintLocales=" + this.f9974f + ')';
    }
}
