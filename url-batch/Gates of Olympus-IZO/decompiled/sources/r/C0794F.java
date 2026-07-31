package r;

import f.AbstractC0382a;

/* renamed from: r.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0794F implements U {

    /* renamed from: a, reason: collision with root package name */
    public final C0804a f6999a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7000b;

    public C0794F(C0804a c0804a, int i3) {
        this.f6999a = c0804a;
        this.f7000b = i3;
    }

    @Override // r.U
    public final int a(M0.b bVar) {
        if ((this.f7000b & 16) != 0) {
            return this.f6999a.e().f3350b;
        }
        return 0;
    }

    @Override // r.U
    public final int b(M0.b bVar, M0.j jVar) {
        if (((jVar == M0.j.f2775d ? 4 : 1) & this.f7000b) != 0) {
            return this.f6999a.e().f3351c;
        }
        return 0;
    }

    @Override // r.U
    public final int c(M0.b bVar) {
        if ((this.f7000b & 32) != 0) {
            return this.f6999a.e().f3352d;
        }
        return 0;
    }

    @Override // r.U
    public final int d(M0.b bVar, M0.j jVar) {
        if (((jVar == M0.j.f2775d ? 8 : 2) & this.f7000b) != 0) {
            return this.f6999a.e().f3349a;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0794F)) {
            return false;
        }
        C0794F c0794f = (C0794F) obj;
        return Z1.i.a(this.f6999a, c0794f.f6999a) && this.f7000b == c0794f.f7000b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7000b) + (this.f6999a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f6999a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i3 = this.f7000b;
        int i4 = AbstractC0382a.f4777a;
        if ((i3 & i4) == i4) {
            AbstractC0382a.z(sb3, "Start");
        }
        int i5 = AbstractC0382a.f4779c;
        if ((i3 & i5) == i5) {
            AbstractC0382a.z(sb3, "Left");
        }
        if ((i3 & 16) == 16) {
            AbstractC0382a.z(sb3, "Top");
        }
        int i6 = AbstractC0382a.f4778b;
        if ((i3 & i6) == i6) {
            AbstractC0382a.z(sb3, "End");
        }
        int i7 = AbstractC0382a.f4780d;
        if ((i3 & i7) == i7) {
            AbstractC0382a.z(sb3, "Right");
        }
        if ((i3 & 32) == 32) {
            AbstractC0382a.z(sb3, "Bottom");
        }
        String sb4 = sb3.toString();
        Z1.i.e(sb4, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb4);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
