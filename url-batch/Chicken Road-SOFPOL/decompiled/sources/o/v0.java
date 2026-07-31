package o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v0 extends d6.x {

    /* renamed from: d, reason: collision with root package name */
    public int f5557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f5558e;

    public v0(u0 u0Var) {
        this.f5558e = u0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5557d < this.f5558e.f();
    }

    @Override // d6.x
    public final int nextInt() {
        int i = this.f5557d;
        this.f5557d = i + 1;
        return this.f5558e.d(i);
    }
}
