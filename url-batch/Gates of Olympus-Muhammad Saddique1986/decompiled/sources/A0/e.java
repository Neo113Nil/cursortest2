package A0;

import k2.C0569a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f95c = new e(new C0569a());

    /* renamed from: a, reason: collision with root package name */
    public final C0569a f96a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97b = 0;

    public e(C0569a c0569a) {
        this.f96a = c0569a;
        if (Float.isNaN(0.0f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
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
        return this.f96a.equals(eVar.f96a) && this.f97b == eVar.f97b;
    }

    public final int hashCode() {
        return ((this.f96a.hashCode() + (Float.hashCode(0.0f) * 31)) * 31) + this.f97b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=0.0, range=");
        sb.append(this.f96a);
        sb.append(", steps=");
        return A.k.j(sb, this.f97b, ')');
    }
}
