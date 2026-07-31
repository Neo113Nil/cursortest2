package r;

/* renamed from: r.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847I implements X {

    /* renamed from: a, reason: collision with root package name */
    public final C0854a f7972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7973b;

    public C0847I(C0854a c0854a, int i3) {
        this.f7972a = c0854a;
        this.f7973b = i3;
    }

    @Override // r.X
    public final int a(O0.b bVar, O0.k kVar) {
        if (((kVar == O0.k.f3741d ? 8 : 2) & this.f7973b) != 0) {
            return this.f7972a.e().f4623a;
        }
        return 0;
    }

    @Override // r.X
    public final int b(O0.b bVar) {
        if ((this.f7973b & 16) != 0) {
            return this.f7972a.e().f4624b;
        }
        return 0;
    }

    @Override // r.X
    public final int c(O0.b bVar, O0.k kVar) {
        if (((kVar == O0.k.f3741d ? 4 : 1) & this.f7973b) != 0) {
            return this.f7972a.e().f4625c;
        }
        return 0;
    }

    @Override // r.X
    public final int d(O0.b bVar) {
        if ((this.f7973b & 32) != 0) {
            return this.f7972a.e().f4626d;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0847I)) {
            return false;
        }
        C0847I c0847i = (C0847I) obj;
        return f2.j.a(this.f7972a, c0847i.f7972a) && this.f7973b == c0847i.f7973b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7973b) + (this.f7972a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f7972a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i3 = this.f7973b;
        int i4 = AbstractC0856c.f8037c;
        if ((i3 & i4) == i4) {
            AbstractC0856c.f(sb3, "Start");
        }
        int i5 = AbstractC0856c.f8039e;
        if ((i3 & i5) == i5) {
            AbstractC0856c.f(sb3, "Left");
        }
        if ((i3 & 16) == 16) {
            AbstractC0856c.f(sb3, "Top");
        }
        int i6 = AbstractC0856c.f8038d;
        if ((i3 & i6) == i6) {
            AbstractC0856c.f(sb3, "End");
        }
        int i7 = AbstractC0856c.f8040f;
        if ((i3 & i7) == i7) {
            AbstractC0856c.f(sb3, "Right");
        }
        if ((i3 & 32) == 32) {
            AbstractC0856c.f(sb3, "Bottom");
        }
        String sb4 = sb3.toString();
        f2.j.e(sb4, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
