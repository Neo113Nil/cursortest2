package m2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f6476b = z.b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6477c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f6478a;

    public /* synthetic */ g0(long j) {
        this.f6478a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return this.f6478a == ((g0) obj).f6478a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6478a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        long j = this.f6478a;
        sb2.append((int) (j >> 32));
        sb2.append(", ");
        return v4.a.m(sb2, (int) (j & 4294967295L), ')');
    }
}
