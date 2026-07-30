package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a2.g f3996a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3997b;

    public a(a2.g gVar, int i7) {
        this.f3996a = gVar;
        this.f3997b = i7;
    }

    @Override // g2.i
    public final void a(j jVar) {
        int i7 = jVar.f4038d;
        a2.g gVar = this.f3996a;
        if (i7 != -1) {
            jVar.d(i7, jVar.f4039e, gVar.f373f);
        } else {
            jVar.d(jVar.f4036b, jVar.f4037c, gVar.f373f);
        }
        int i8 = jVar.f4036b;
        int i9 = jVar.f4037c;
        int i10 = i8 == i9 ? i9 : -1;
        int i11 = this.f3997b;
        int e9 = v1.g.e(i11 > 0 ? (i10 + i11) - 1 : (i10 + i11) - gVar.f373f.length(), 0, jVar.f4035a.b());
        jVar.f(e9, e9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r6.k.a(this.f3996a.f373f, aVar.f3996a.f373f) && this.f3997b == aVar.f3997b;
    }

    public final int hashCode() {
        return (this.f3996a.f373f.hashCode() * 31) + this.f3997b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f3996a.f373f);
        sb.append("', newCursorPosition=");
        return a0.m.l(sb, this.f3997b, ')');
    }

    public a(String str, int i7) {
        this(new a2.g(str, null, 6), i7);
    }
}
