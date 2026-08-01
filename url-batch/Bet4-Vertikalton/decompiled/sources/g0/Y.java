package g0;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public int f2310a;

    /* renamed from: b, reason: collision with root package name */
    public int f2311b;

    /* renamed from: c, reason: collision with root package name */
    public int f2312c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2313e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2314f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2315g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2316j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2317k;

    /* renamed from: l, reason: collision with root package name */
    public int f2318l;

    /* renamed from: m, reason: collision with root package name */
    public long f2319m;

    /* renamed from: n, reason: collision with root package name */
    public int f2320n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2315g ? this.f2311b - this.f2312c : this.f2313e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2310a + ", mData=null, mItemCount=" + this.f2313e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2311b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2312c + ", mStructureChanged=" + this.f2314f + ", mInPreLayout=" + this.f2315g + ", mRunSimpleAnimations=" + this.f2316j + ", mRunPredictiveAnimations=" + this.f2317k + '}';
    }
}
