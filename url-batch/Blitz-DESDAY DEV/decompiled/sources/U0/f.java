package U0;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f868a;

    /* renamed from: b, reason: collision with root package name */
    public final int f869b;

    /* renamed from: c, reason: collision with root package name */
    public final g f870c;
    public final g d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f871e;

    /* renamed from: f, reason: collision with root package name */
    public final List f872f;

    public f(int i, int i2, g gVar, g gVar2, boolean z2, List list) {
        this.f868a = i;
        this.f869b = i2;
        this.f870c = gVar;
        this.d = gVar2;
        this.f871e = z2;
        this.f872f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f868a == fVar.f868a && this.f869b == fVar.f869b && this.f870c == fVar.f870c && this.d == fVar.d && this.f871e == fVar.f871e && g1.d.a(this.f872f, fVar.f872f);
    }

    public final int hashCode() {
        int hashCode = (this.f870c.hashCode() + ((Integer.hashCode(this.f869b) + (Integer.hashCode(this.f868a) * 31)) * 31)) * 31;
        g gVar = this.d;
        return this.f872f.hashCode() + ((Boolean.hashCode(this.f871e) + ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "MoveResult(row=" + this.f868a + ", col=" + this.f869b + ", piece=" + this.f870c + ", winner=" + this.d + ", isDraw=" + this.f871e + ", winningCells=" + this.f872f + ")";
    }
}
