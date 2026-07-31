package I0;

import C0.C0031g;

/* loaded from: classes.dex */
public final class x implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C0031g f3093a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3094b;

    public x(String str, int i3) {
        this.f3093a = new C0031g(str, null, 6);
        this.f3094b = i3;
    }

    @Override // I0.i
    public final void a(j jVar) {
        int i3 = jVar.f3068d;
        boolean z3 = i3 != -1;
        C0031g c0031g = this.f3093a;
        if (z3) {
            jVar.d(i3, jVar.f3069e, c0031g.f596a);
            String str = c0031g.f596a;
            if (str.length() > 0) {
                jVar.e(i3, str.length() + i3);
            }
        } else {
            int i4 = jVar.f3066b;
            jVar.d(i4, jVar.f3067c, c0031g.f596a);
            String str2 = c0031g.f596a;
            if (str2.length() > 0) {
                jVar.e(i4, str2.length() + i4);
            }
        }
        int i5 = jVar.f3066b;
        int i6 = jVar.f3067c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.f3094b;
        int y3 = O2.d.y(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c0031g.f596a.length(), 0, jVar.f3065a.b());
        jVar.f(y3, y3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return f2.j.a(this.f3093a.f596a, xVar.f3093a.f596a) && this.f3094b == xVar.f3094b;
    }

    public final int hashCode() {
        return (this.f3093a.f596a.hashCode() * 31) + this.f3094b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f3093a.f596a);
        sb.append("', newCursorPosition=");
        return A.k.j(sb, this.f3094b, ')');
    }
}
