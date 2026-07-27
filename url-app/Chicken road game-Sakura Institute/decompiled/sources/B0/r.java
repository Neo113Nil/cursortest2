package B0;

import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f934b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f935c;

    public r(int i2, int i4, boolean z4) {
        this.f933a = i2;
        this.f934b = i4;
        this.f935c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f933a == rVar.f933a && this.f934b == rVar.f934b && this.f935c == rVar.f935c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f935c) + AbstractC0784j.c(this.f934b, Integer.hashCode(this.f933a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.f933a + ", end=" + this.f934b + ", isRtl=" + this.f935c + ')';
    }
}
