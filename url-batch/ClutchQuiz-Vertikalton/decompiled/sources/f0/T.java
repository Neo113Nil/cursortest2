package f0;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public int f2175a;

    /* renamed from: b, reason: collision with root package name */
    public int f2176b;

    /* renamed from: c, reason: collision with root package name */
    public int f2177c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2178e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2179f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2180g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2181j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2182k;

    /* renamed from: l, reason: collision with root package name */
    public int f2183l;

    /* renamed from: m, reason: collision with root package name */
    public long f2184m;

    /* renamed from: n, reason: collision with root package name */
    public int f2185n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2180g ? this.f2176b - this.f2177c : this.f2178e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2175a + ", mData=null, mItemCount=" + this.f2178e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2176b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2177c + ", mStructureChanged=" + this.f2179f + ", mInPreLayout=" + this.f2180g + ", mRunSimpleAnimations=" + this.f2181j + ", mRunPredictiveAnimations=" + this.f2182k + '}';
    }
}
