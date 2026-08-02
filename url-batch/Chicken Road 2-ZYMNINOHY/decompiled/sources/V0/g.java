package V0;

/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f3193a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3194b;

    public g(long j4, byte[] bArr) {
        this.f3193a = j4;
        this.f3194b = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f3193a, ((g) obj).f3193a);
    }
}
