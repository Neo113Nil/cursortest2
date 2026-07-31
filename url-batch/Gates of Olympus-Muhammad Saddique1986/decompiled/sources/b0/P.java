package b0;

import a0.C0238c;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: d, reason: collision with root package name */
    public static final P f5380d = new P();

    /* renamed from: a, reason: collision with root package name */
    public final long f5381a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5382b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5383c;

    public P(long j3, long j4, float f3) {
        this.f5381a = j3;
        this.f5382b = j4;
        this.f5383c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        return C0352v.c(this.f5381a, p3.f5381a) && C0238c.b(this.f5382b, p3.f5382b) && this.f5383c == p3.f5383c;
    }

    public final int hashCode() {
        int i3 = C0352v.f5440h;
        return Float.hashCode(this.f5383c) + A.k.c(Long.hashCode(this.f5381a) * 31, 31, this.f5382b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        A.k.p(this.f5381a, sb, ", offset=");
        sb.append((Object) C0238c.j(this.f5382b));
        sb.append(", blurRadius=");
        return A.k.i(sb, this.f5383c, ')');
    }

    public /* synthetic */ P() {
        this(M.d(4278190080L), 0L, 0.0f);
    }
}
