package y0;

import A.AbstractC0017m;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f11542c = new e(new R2.a());

    /* renamed from: a, reason: collision with root package name */
    public final R2.a f11543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11544b = 0;

    public e(R2.a aVar) {
        this.f11543a = aVar;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final R2.a a() {
        return this.f11543a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        return this.f11543a.equals(eVar.f11543a) && this.f11544b == eVar.f11544b;
    }

    public final int hashCode() {
        return ((this.f11543a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31) + this.f11544b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=0.0, range=");
        sb.append(this.f11543a);
        sb.append(", steps=");
        return AbstractC0017m.l(sb, this.f11544b, ')');
    }
}
