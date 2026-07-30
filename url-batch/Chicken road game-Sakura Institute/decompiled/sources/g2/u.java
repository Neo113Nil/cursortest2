package g2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a2.g f4061a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4062b;

    public u(String str, int i7) {
        this.f4061a = new a2.g(str, null, 6);
        this.f4062b = i7;
    }

    @Override // g2.i
    public final void a(j jVar) {
        int i7 = jVar.f4038d;
        a2.g gVar = this.f4061a;
        if (i7 != -1) {
            int i8 = jVar.f4039e;
            String str = gVar.f373f;
            String str2 = gVar.f373f;
            jVar.d(i7, i8, str);
            if (str2.length() > 0) {
                jVar.e(i7, str2.length() + i7);
            }
        } else {
            int i9 = jVar.f4036b;
            int i10 = jVar.f4037c;
            String str3 = gVar.f373f;
            String str4 = gVar.f373f;
            jVar.d(i9, i10, str3);
            if (str4.length() > 0) {
                jVar.e(i9, str4.length() + i9);
            }
        }
        int i11 = jVar.f4036b;
        int i12 = jVar.f4037c;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f4062b;
        int e9 = v1.g.e(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - gVar.f373f.length(), 0, jVar.f4035a.b());
        jVar.f(e9, e9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return r6.k.a(this.f4061a.f373f, uVar.f4061a.f373f) && this.f4062b == uVar.f4062b;
    }

    public final int hashCode() {
        return (this.f4061a.f373f.hashCode() * 31) + this.f4062b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f4061a.f373f);
        sb.append("', newCursorPosition=");
        return a0.m.l(sb, this.f4062b, ')');
    }
}
