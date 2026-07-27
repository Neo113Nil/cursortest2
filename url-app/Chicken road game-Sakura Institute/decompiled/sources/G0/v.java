package G0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class v implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3087a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3088b;

    public v(int i2, int i4) {
        this.f3087a = i2;
        this.f3088b = i4;
    }

    @Override // G0.i
    public final void a(j jVar) {
        if (jVar.f3064d != -1) {
            jVar.f3064d = -1;
            jVar.f3065e = -1;
        }
        C0.f fVar = jVar.f3061a;
        int e4 = kotlin.ranges.b.e(this.f3087a, 0, fVar.b());
        int e5 = kotlin.ranges.b.e(this.f3088b, 0, fVar.b());
        if (e4 != e5) {
            if (e4 < e5) {
                jVar.e(e4, e5);
            } else {
                jVar.e(e5, e4);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f3087a == vVar.f3087a && this.f3088b == vVar.f3088b;
    }

    public final int hashCode() {
        return (this.f3087a * 31) + this.f3088b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f3087a);
        sb.append(", end=");
        return AbstractC0017m.l(sb, this.f3088b, ')');
    }
}
