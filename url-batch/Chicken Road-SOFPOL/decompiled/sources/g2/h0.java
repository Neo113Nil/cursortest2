package g2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f2958b = a0.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2959c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f2960a;

    public /* synthetic */ h0(long j7) {
        this.f2960a = j7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return this.f2960a == ((h0) obj).f2960a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2960a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextRange(");
        long j7 = this.f2960a;
        sb.append((int) (j7 >> 32));
        sb.append(", ");
        return a0.q.k(sb, (int) (j7 & 4294967295L), ')');
    }
}
