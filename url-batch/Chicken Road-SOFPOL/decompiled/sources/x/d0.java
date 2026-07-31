package x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f8206a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8207b;

    public d0(o0 o0Var, int i) {
        this.f8206a = o0Var;
        this.f8207b = i;
    }

    @Override // x.r0
    public final int a(r2.c cVar) {
        if ((this.f8207b & 32) != 0) {
            return this.f8206a.a(cVar);
        }
        return 0;
    }

    @Override // x.r0
    public final int b(r2.c cVar, r2.l lVar) {
        if (((lVar == r2.l.f6529d ? 8 : 2) & this.f8207b) != 0) {
            return this.f8206a.b(cVar, lVar);
        }
        return 0;
    }

    @Override // x.r0
    public final int c(r2.c cVar, r2.l lVar) {
        if (((lVar == r2.l.f6529d ? 4 : 1) & this.f8207b) != 0) {
            return this.f8206a.c(cVar, lVar);
        }
        return 0;
    }

    @Override // x.r0
    public final int d(r2.c cVar) {
        if ((this.f8207b & 16) != 0) {
            return this.f8206a.d(cVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f8206a.equals(d0Var.f8206a) && this.f8207b == d0Var.f8207b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8207b) + (this.f8206a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f8206a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.f8207b;
        int i8 = v0.f8304b;
        if ((i & i8) == i8) {
            v0.d(sb3, "Start");
        }
        int i9 = v0.f8306d;
        if ((i & i9) == i9) {
            v0.d(sb3, "Left");
        }
        if ((i & 16) == 16) {
            v0.d(sb3, "Top");
        }
        int i10 = v0.f8305c;
        if ((i & i10) == i10) {
            v0.d(sb3, "End");
        }
        int i11 = v0.f8307e;
        if ((i & i11) == i11) {
            v0.d(sb3, "Right");
        }
        if ((i & 32) == 32) {
            v0.d(sb3, "Bottom");
        }
        String sb4 = sb3.toString();
        q6.i.d(sb4, "toString(...)");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
