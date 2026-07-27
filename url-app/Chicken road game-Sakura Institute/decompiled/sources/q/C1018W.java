package q;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1018W implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1022a f9221a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9222b;

    public C1018W(C1022a c1022a, int i2) {
        this.f9221a = c1022a;
        this.f9222b = i2;
    }

    @Override // q.m0
    public final int a(M0.b bVar) {
        if ((this.f9222b & 16) != 0) {
            return this.f9221a.e().f4144b;
        }
        return 0;
    }

    @Override // q.m0
    public final int b(M0.b bVar, M0.k kVar) {
        if (((kVar == M0.k.f3555d ? 4 : 1) & this.f9222b) != 0) {
            return this.f9221a.e().f4145c;
        }
        return 0;
    }

    @Override // q.m0
    public final int c(M0.b bVar) {
        if ((this.f9222b & 32) != 0) {
            return this.f9221a.e().f4146d;
        }
        return 0;
    }

    @Override // q.m0
    public final int d(M0.b bVar, M0.k kVar) {
        if (((kVar == M0.k.f3555d ? 8 : 2) & this.f9222b) != 0) {
            return this.f9221a.e().f4143a;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1018W)) {
            return false;
        }
        C1018W c1018w = (C1018W) obj;
        return Intrinsics.a(this.f9221a, c1018w.f9221a) && this.f9222b == c1018w.f9222b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9222b) + (this.f9221a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f9221a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i2 = this.f9222b;
        int i4 = AbstractC1024c.f9242c;
        if ((i2 & i4) == i4) {
            AbstractC1024c.j(sb3, "Start");
        }
        int i5 = AbstractC1024c.f9244e;
        if ((i2 & i5) == i5) {
            AbstractC1024c.j(sb3, "Left");
        }
        if ((i2 & 16) == 16) {
            AbstractC1024c.j(sb3, "Top");
        }
        int i6 = AbstractC1024c.f9243d;
        if ((i2 & i6) == i6) {
            AbstractC1024c.j(sb3, "End");
        }
        int i7 = AbstractC1024c.f9245f;
        if ((i2 & i7) == i7) {
            AbstractC1024c.j(sb3, "Right");
        }
        if ((i2 & 32) == 32) {
            AbstractC1024c.j(sb3, "Bottom");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
