package L0;

import a.AbstractC0157a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final l f2690c = new l(AbstractC0157a.I(0), AbstractC0157a.I(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f2691a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2692b;

    public l(long j3, long j4) {
        this.f2691a = j3;
        this.f2692b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return M0.l.a(this.f2691a, lVar.f2691a) && M0.l.a(this.f2692b, lVar.f2692b);
    }

    public final int hashCode() {
        M0.m[] mVarArr = M0.l.f2779b;
        return Long.hashCode(this.f2692b) + (Long.hashCode(this.f2691a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) M0.l.d(this.f2691a)) + ", restLine=" + ((Object) M0.l.d(this.f2692b)) + ')';
    }
}
