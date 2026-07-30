package q;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7277b;

    public f0(s0 s0Var, int i7) {
        this.f7276a = s0Var;
        this.f7277b = i7;
    }

    @Override // q.s0
    public final int a(m2.b bVar, m2.k kVar) {
        if (((kVar == m2.k.f6322f ? 8 : 2) & this.f7277b) != 0) {
            return this.f7276a.a(bVar, kVar);
        }
        return 0;
    }

    @Override // q.s0
    public final int b(m2.b bVar) {
        if ((this.f7277b & 32) != 0) {
            return this.f7276a.b(bVar);
        }
        return 0;
    }

    @Override // q.s0
    public final int c(m2.b bVar, m2.k kVar) {
        if (((kVar == m2.k.f6322f ? 4 : 1) & this.f7277b) != 0) {
            return this.f7276a.c(bVar, kVar);
        }
        return 0;
    }

    @Override // q.s0
    public final int d(m2.b bVar) {
        if ((this.f7277b & 16) != 0) {
            return this.f7276a.d(bVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return r6.k.a(this.f7276a, f0Var.f7276a) && this.f7277b == f0Var.f7277b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7277b) + (this.f7276a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f7276a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i7 = this.f7277b;
        int i8 = c.f7259c;
        if ((i7 & i8) == i8) {
            c.f(sb3, "Start");
        }
        int i9 = c.f7261e;
        if ((i7 & i9) == i9) {
            c.f(sb3, "Left");
        }
        if ((i7 & 16) == 16) {
            c.f(sb3, "Top");
        }
        int i10 = c.f7260d;
        if ((i7 & i10) == i10) {
            c.f(sb3, "End");
        }
        int i11 = c.f7262f;
        if ((i7 & i11) == i11) {
            c.f(sb3, "Right");
        }
        if ((i7 & 32) == 32) {
            c.f(sb3, "Bottom");
        }
        String sb4 = sb3.toString();
        r6.k.e(sb4, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
