package h0;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public int f2433a;

    /* renamed from: b, reason: collision with root package name */
    public int f2434b;

    /* renamed from: c, reason: collision with root package name */
    public int f2435c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2436e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2437f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2438g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2439h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2440j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2441k;

    /* renamed from: l, reason: collision with root package name */
    public int f2442l;

    /* renamed from: m, reason: collision with root package name */
    public long f2443m;

    /* renamed from: n, reason: collision with root package name */
    public int f2444n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f2438g ? this.f2434b - this.f2435c : this.f2436e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2433a + ", mData=null, mItemCount=" + this.f2436e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f2434b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2435c + ", mStructureChanged=" + this.f2437f + ", mInPreLayout=" + this.f2438g + ", mRunSimpleAnimations=" + this.f2440j + ", mRunPredictiveAnimations=" + this.f2441k + '}';
    }
}
