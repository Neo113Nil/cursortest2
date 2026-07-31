package I0;

import C0.C0031g;

/* renamed from: I0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f3034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3035b;

    public C0188a(C0031g c0031g, int i3) {
        this.f3034a = c0031g;
        this.f3035b = i3;
    }

    @Override // I0.i
    public final void a(j jVar) {
        int i3 = jVar.f3068d;
        boolean z3 = i3 != -1;
        C0031g c0031g = this.f3034a;
        if (z3) {
            jVar.d(i3, jVar.f3069e, c0031g.f596a);
        } else {
            jVar.d(jVar.f3066b, jVar.f3067c, c0031g.f596a);
        }
        int i4 = jVar.f3066b;
        int i5 = jVar.f3067c;
        int i6 = i4 == i5 ? i5 : -1;
        int i7 = this.f3035b;
        int y3 = O2.d.y(i7 > 0 ? (i6 + i7) - 1 : (i6 + i7) - c0031g.f596a.length(), 0, jVar.f3065a.b());
        jVar.f(y3, y3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0188a)) {
            return false;
        }
        C0188a c0188a = (C0188a) obj;
        return f2.j.a(this.f3034a.f596a, c0188a.f3034a.f596a) && this.f3035b == c0188a.f3035b;
    }

    public final int hashCode() {
        return (this.f3034a.f596a.hashCode() * 31) + this.f3035b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f3034a.f596a);
        sb.append("', newCursorPosition=");
        return A.k.j(sb, this.f3035b, ')');
    }

    public C0188a(String str, int i3) {
        this(new C0031g(str, null, 6), i3);
    }
}
