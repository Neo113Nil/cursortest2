package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15a;

    /* renamed from: b, reason: collision with root package name */
    public long f16b;

    public final long a() {
        if (this.f15a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f16b - System.nanoTime());
    }
}
