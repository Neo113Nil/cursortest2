package G0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class x implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3092b;

    public x(int i2, int i4) {
        this.f3091a = i2;
        this.f3092b = i4;
    }

    @Override // G0.i
    public final void a(j jVar) {
        int e4 = kotlin.ranges.b.e(this.f3091a, 0, jVar.f3061a.b());
        int e5 = kotlin.ranges.b.e(this.f3092b, 0, jVar.f3061a.b());
        if (e4 < e5) {
            jVar.f(e4, e5);
        } else {
            jVar.f(e5, e4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f3091a == xVar.f3091a && this.f3092b == xVar.f3092b;
    }

    public final int hashCode() {
        return (this.f3091a * 31) + this.f3092b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f3091a);
        sb.append(", end=");
        return AbstractC0017m.l(sb, this.f3092b, ')');
    }
}
